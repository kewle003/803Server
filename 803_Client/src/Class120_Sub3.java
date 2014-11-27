/* Class120_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub3 extends Class120
{
    int anInt9471;
    int anInt9472;
    int anInt9473;
    int anInt9474;
    int anInt9475;
    
    Class120_Sub3(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub3) this).anInt9475
	    = class241_sub3.readUnsignedShort(1162222719) * 1364172043;
	int i = class241_sub3.readInt((byte) 107);
	((Class120_Sub3) this).anInt9472 = -1929704141 * (i >>> 16);
	((Class120_Sub3) this).anInt9473 = (i & 0xffff) * 1028332621;
	((Class120_Sub3) this).anInt9474
	    = class241_sub3.readUnsignedByte((byte) -22) * 1647993741;
	((Class120_Sub3) this).anInt9471
	    = class241_sub3.readSmart49152(-122188957) * -28920003;
    }
    
    public void method2958(int i) {
	Class25.aClass93Array213
	    [((Class120_Sub3) this).anInt9475 * 1859798691].method2079
	    (((Class120_Sub3) this).anInt9472 * 845657595,
	     ((Class120_Sub3) this).anInt9473 * 1842969733,
	     ((Class120_Sub3) this).anInt9474 * -881354939,
	     225335317 * ((Class120_Sub3) this).anInt9471, -1627511041);
    }
    
    public void method2961() {
	Class25.aClass93Array213
	    [((Class120_Sub3) this).anInt9475 * 1859798691].method2079
	    (((Class120_Sub3) this).anInt9472 * 845657595,
	     ((Class120_Sub3) this).anInt9473 * 1842969733,
	     ((Class120_Sub3) this).anInt9474 * -881354939,
	     225335317 * ((Class120_Sub3) this).anInt9471, -73830240);
    }
    
    static final void method15581(ClientScriptData class454, byte i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -57);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (1 == class58.modelType * -982148763
	       ? class58.anInt879 * 1965460551 : -1);
    }
    
    static void method15582(boolean bool, int i) {
	if (bool) {
	    if (1629309841 * client.anInt8466 != -1)
		Class451.method10535(client.anInt8466 * 1629309841,
				     (byte) -79);
	    for (Class241_Sub11 class241_sub11
		     = ((Class241_Sub11)
			client.aClass407_8467.method7294(2090894173));
		 null != class241_sub11;
		 class241_sub11
		     = ((Class241_Sub11)
			client.aClass407_8467.method7295(802549115))) {
		if (!class241_sub11.hasNext((byte) 103)) {
		    class241_sub11
			= ((Class241_Sub11)
			   client.aClass407_8467.method7294(2090894173));
		    if (null == class241_sub11)
			break;
		}
		Class40.method1047(class241_sub11, true, false, 1302819782);
	    }
	    client.anInt8466 = -1376966001;
	    client.aClass407_8467 = new HashTable(8);
	    Class339.method6120(-1470055331);
	    client.anInt8466 = -775099539 * Class128.aClass513_1589.lobby_interface;
	    if (-1 != 1629309841 * client.anInt8466) {
		Class105_Sub1_Sub3_Sub1.method17885(false, -1282347871);
		Class69.method1683((byte) 14);
		Class107.method2686(client.anInt8466 * 1629309841, null,
				    -578799681);
	    }
	}
	Class13.hasLobby = true;
    }
}
