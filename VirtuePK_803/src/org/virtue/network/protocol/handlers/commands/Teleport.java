package org.virtue.network.protocol.handlers.commands;

import org.virtue.game.logic.node.entity.player.Player;
import org.virtue.game.logic.region.Tile;
import org.virtue.network.protocol.messages.GameMessage.MessageOpcode;

public class Teleport implements Command {

	@Override
	public boolean handle(String syntax, Player player, boolean clientCommand, String... args) {
		if (args.length < 2) {
			player.getPacketDispatcher().dispatchMessage("Invalid teleport command: requires 2 int paramaters ('teleport x y [z=0]')", MessageOpcode.CONSOLE);
			return false;
		}
		int x, y, z=0;
		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			if (args.length > 2) {
				z = Integer.parseInt(args[2]);
			}
		} catch (Exception ex) {
			player.getPacketDispatcher().dispatchMessage("Invalid teleport command: requires 2 int paramaters ('teleport x y [z=0]')", MessageOpcode.CONSOLE);
			return false;
		}
		Tile target = new Tile(x, y, z);
		player.getUpdateArchive().getMovement().teleport(target);
		return true;
	}

	@Override
	public String[] getPossibleSyntaxes() {
		return new String[] { "teleport", "tele", "location", "loc" };
	}

}
