/* Class581 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class581
{
    JS5 aClass210_7561;
    JS5 aClass210_7562;
    Class129 aClass129_7563 = new Class129(64);
    Class129 aClass129_7564 = new Class129(20);
    
    public Class570 method12747(int i) {
	Class570 class570;
	synchronized (((Class581) this).aClass129_7563) {
	    class570 = ((Class570)
			((Class581) this).aClass129_7563.get((long) i));
	}
	if (class570 != null)
	    return class570;
	byte[] is;
	synchronized (((Class581) this).aClass210_7562) {
	    is = ((Class581) this).aClass210_7562.getfile(((Js5ConfigGroup
							       .aClass37_421
							       .id)
							      * -1379677837),
							     i, 1645643694);
	}
	class570 = new Class570();
	((Class570) class570).aClass581_7350 = this;
	if (is != null)
	    class570.method12489(new RSByteBuffer(is), -1946607994);
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.put(class570, (long) i);
	}
	return class570;
    }
    
    public Class570 method12748(int i, int i_0_) {
	Class570 class570;
	synchronized (((Class581) this).aClass129_7563) {
	    class570 = ((Class570)
			((Class581) this).aClass129_7563.get((long) i));
	}
	if (class570 != null)
	    return class570;
	byte[] is;
	synchronized (((Class581) this).aClass210_7562) {
	    is = ((Class581) this).aClass210_7562.getfile(((Js5ConfigGroup
							       .aClass37_421
							       .id)
							      * -1379677837),
							     i, -1385946600);
	}
	class570 = new Class570();
	((Class570) class570).aClass581_7350 = this;
	if (is != null)
	    class570.method12489(new RSByteBuffer(is), -1549324412);
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.put(class570, (long) i);
	}
	return class570;
    }
    
    public void method12749(int i) {
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.reset(6680152);
	}
	synchronized (((Class581) this).aClass129_7564) {
	    ((Class581) this).aClass129_7564.reset(-367185506);
	}
    }
    
    public void method12750(int i, int i_1_) {
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.clean(i, -1991165344);
	}
	synchronized (((Class581) this).aClass129_7564) {
	    ((Class581) this).aClass129_7564.clean(i, -2125955172);
	}
    }
    
    public void method12751(byte i) {
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.removeSoftReferences((byte) 20);
	}
	synchronized (((Class581) this).aClass129_7564) {
	    ((Class581) this).aClass129_7564.removeSoftReferences((byte) -12);
	}
    }
    
    public Class570 method12752(int i) {
	Class570 class570;
	synchronized (((Class581) this).aClass129_7563) {
	    class570 = ((Class570)
			((Class581) this).aClass129_7563.get((long) i));
	}
	if (class570 != null)
	    return class570;
	byte[] is;
	synchronized (((Class581) this).aClass210_7562) {
	    is = ((Class581) this).aClass210_7562.getfile(((Js5ConfigGroup
							       .aClass37_421
							       .id)
							      * -1379677837),
							     i, 1504288343);
	}
	class570 = new Class570();
	((Class570) class570).aClass581_7350 = this;
	if (is != null)
	    class570.method12489(new RSByteBuffer(is), -1790656044);
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.put(class570, (long) i);
	}
	return class570;
    }
    
    public void method12753(int i) {
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.clean(i, -2047759238);
	}
	synchronized (((Class581) this).aClass129_7564) {
	    ((Class581) this).aClass129_7564.clean(i, -2056816623);
	}
    }
    
    public void method12754() {
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.removeSoftReferences((byte) -18);
	}
	synchronized (((Class581) this).aClass129_7564) {
	    ((Class581) this).aClass129_7564.removeSoftReferences((byte) -18);
	}
    }
    
    public void method12755() {
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.reset(-1748187504);
	}
	synchronized (((Class581) this).aClass129_7564) {
	    ((Class581) this).aClass129_7564.reset(-1530138137);
	}
    }
    
    public void method12756() {
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.reset(-2052721688);
	}
	synchronized (((Class581) this).aClass129_7564) {
	    ((Class581) this).aClass129_7564.reset(-2035902927);
	}
    }
    
    public Class581(GameDefinition class471, Language class437, JS5 class210,
		    JS5 class210_2_) {
	((Class581) this).aClass210_7561 = class210_2_;
	((Class581) this).aClass210_7562 = class210;
	((Class581) this).aClass210_7562.getContainerCount((Js5ConfigGroup.aClass37_421
						     .id) * -1379677837,
						    (byte) -33);
    }
    
    public void method12757(int i) {
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.clean(i, -2045585060);
	}
	synchronized (((Class581) this).aClass129_7564) {
	    ((Class581) this).aClass129_7564.clean(i, -2012433460);
	}
    }
    
    public void method12758(int i) {
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.clean(i, -1991637312);
	}
	synchronized (((Class581) this).aClass129_7564) {
	    ((Class581) this).aClass129_7564.clean(i, -2130913009);
	}
    }
    
    public void method12759() {
	synchronized (((Class581) this).aClass129_7563) {
	    ((Class581) this).aClass129_7563.removeSoftReferences((byte) 76);
	}
	synchronized (((Class581) this).aClass129_7564) {
	    ((Class581) this).aClass129_7564.removeSoftReferences((byte) -68);
	}
    }
    
    static final void method12760(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1489471497 * Class203.anInt2425;
    }
    
    static final void method12761(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	class58.anInt985
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * 1639541429);
	WorldType.refreshComponent(class58, -983275469);
    }
    
    public static void processActionButton/*method12762*/(int buttonID, int slot1, int slot2, String string, int i_5_) {
		InterfaceComponent component = Class218_Sub3.method16576(slot1, slot2, (byte) -112);
		if (null != component) {
		    if (null != component.onContextMenuSelect) {
				ClientScriptCaller caller = new ClientScriptCaller();
				caller.component = component;
				caller.actionButtonID = buttonID * 1369542883;
				caller.aString8976 = string;
				caller.paramaters = component.onContextMenuSelect;
				Class42.method1067(caller, 2053958964);
		    }
		    if (client.method13624(component).method15039(buttonID - 1, 65280)) {
				ServerConnection conn = ClanChannelDelta.method6943(-1431743426);
				if (2 == 1766317249 * client.anInt8288
				    || 19 == 1766317249 * client.anInt8288
				    || client.anInt8288 * 1766317249 == 8) {
				    if (null == component.linkedFriend) {
				    	Class90.method2060(conn, component, buttonID, slot1, slot2, 707754428);
				    } else {
						Class241_Sub27 packet = Class445_Sub26.makePacket(
								OutgoingOpcode.FRIEND_OPTION_PACKET,
								conn.packetCipher, 16711935);
						packet.data.writeByte(7 + Class421.getEncodedStringLength(component.linkedFriend,
									     -2142708228), -117229468);
						packet.data.writeIntV2(slot1, -1646891044);
						packet.data.writeString(component.linkedFriend, -622231981);
						packet.data.writeLEShort(slot2, 620620011);
						packet.data.writeByte(buttonID, -497735860);
						conn.sendPacket(packet, -1753537713);
				    }
				}
		    }
		}
    }
}
