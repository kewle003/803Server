/*
 * This file is part of RS3Emulator.
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
package org.virtue.game.logic.social;
/**
 * An {@link Enum} that represents a player's online status
 *
 * @author Sundays211
 *
 */
public enum OnlineStatus {
	EVERYONE(0),
	FRIENDS(1),
	NOBODY(2);
	
	private final int statusCode;
	OnlineStatus (int code) {
		this.statusCode = code;
	}
	
	public int getStatusCode () {
		return statusCode;
	}
	
	public static OnlineStatus forCode (int code) {
		switch (code) {
		case 0:
			return EVERYONE;
		case 1:
			return FRIENDS;
		case 2:
			return NOBODY;
		default:
			return NOBODY;
		}
	}
}
