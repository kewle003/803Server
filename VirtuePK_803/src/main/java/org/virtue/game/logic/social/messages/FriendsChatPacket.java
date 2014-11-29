/*
 * This file is part of the RS3Emulator social module.
 *
 * RS3Emulator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RS3Emulator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RS3Emulator.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.virtue.game.logic.social.messages;

import org.virtue.game.logic.social.ChannelRank;

/**
 * An {@link Object} that represents an update to a friends chat channel
 *
 * @author Sundays211
 */
public class FriendsChatPacket {
	
	public static class User {
		private final String replyName;
		private final String displayName;
		private final ChannelRank rank;
		private final int nodeID;
		private final String worldName;
		
		/**
		 * Constructs a new {@code User} object for use within the {@code FriendsChatPacket}
		 * @param displayName	The display name of the player
		 * @param replyName		The reply-to name of the player
		 * @param rank			The player's rank within the channel
		 * @param nodeID		The node ID of the world the player is in
		 * @param worldName		The name of the world the player is in
		 */
		public User (String displayName, String replyName, ChannelRank rank, int nodeID, String worldName) {
			this.replyName = replyName;
			this.displayName = displayName;
			this.rank = rank;
			this.nodeID = nodeID;
			this.worldName = worldName;
		}
		
		/**
		 * Gets the display name of the player
		 * @return	The display name
		 */
		public String getDisplayName () {
			return displayName;
		}
		
		/**
		 * Gets the name used for comparing and responding to
		 * @return The reply-to name
		 */
		public String getReplyName () {
			return replyName;
		}
		
		/**
		 * Gets the rank of the player within the channel
		 * @return	The rank
		 */
		public ChannelRank getRank () {
			return rank;
		}
		
		/**
		 * Gets the node ID of the world the player is currently in
		 * @return	The world node ID
		 */
		public int getWorldNodeID () {
			return nodeID;
		}
		
		/**
		 * Gets the name of the world the player is currently in
		 * @return	The world name
		 */
		public String getWorldName () {
			return worldName;
		}
		
		/**
		 * Returns whether the 'reply-to' name is different to the 'display' name
		 * @return	True if the names are different, false if they are the same
		 */
		public boolean hasReplyName () {
			if (replyName == null) {
				return false;
			}
			return !displayName.equalsIgnoreCase(replyName);
		}
	}
	
	private String ownerName;
	
	private String channelName;
	
	private ChannelRank kickReq;
	
	private final User[] users;
	
	private final boolean fullUpdate;
	
	/**
	 * Constructs a new {@code FriendsChatPacket} representing a full update
	 * @param users			The people who are currently in the channel
	 * @param ownerName		The channel owner's name
	 * @param channelName	The channel's name
	 * @param kickReq		The minimum {@link org.virtue.game.logic.social.ChannelRank} required to kick in the channel
	 */
	public FriendsChatPacket (User[] users, String ownerName, String channelName, ChannelRank kickReq) {
		this.ownerName = ownerName;
		this.channelName = channelName;
		this.kickReq = kickReq;
		this.users = users;
		fullUpdate = true;
	}
	
	public FriendsChatPacket (User user) {
		fullUpdate = false;
		users = new User[] { user }; 
	}
	
	public boolean isFullUpdate () {
		return fullUpdate;
	}
	
	/**
	 * Gets the name of the friends chat channel
	 * @return	The channel name
	 */
	public String getChannelName () {
		return channelName;
	}
	
	/**
	 * Gets the display name of the owner of the friends chat channel
	 * @return	The owner name
	 */
	public String getOwnerName () {
		return ownerName;
	}
	
	public ChannelRank getKickReq () {
		return kickReq;
	}
	
	public User[] getUsers () {
		return users;
	}
	
}
