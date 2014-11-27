package org.virtue.network.protocol.packet.encoder.impl;

import org.virtue.game.config.OutgoingOpcodes;
import org.virtue.game.logic.region.Tile;
import org.virtue.network.protocol.packet.RS3PacketBuilder;
import org.virtue.network.protocol.packet.encoder.PacketEncoder;

/**
 * @author Virtue Development Team 2014 (c).
 * @since Apr 15, 2014
 */
public class MinimapFlagEncoder implements PacketEncoder<Tile> {

    @Override
    public RS3PacketBuilder buildPacket(Tile node) {
        RS3PacketBuilder buffer = new RS3PacketBuilder();
        buffer.putPacket(OutgoingOpcodes.MINIMAP_FLAG_PACKET);
        if (node == null) {
            buffer.put(255);
            buffer.putByteS(255);
        } else {
            buffer.put(node.getY());
            buffer.putByteS(node.getX());//TODO: Make sure this is right
        }
        //System.out.println("Sending minimap flag: x="+node.getX()+", y="+node.getY());
        return buffer;
    }
    
}
