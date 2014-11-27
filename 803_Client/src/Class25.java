
import java.util.Arrays;

/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class25 implements Interface3
{
    public static int anInt212;
    public static Class93[] aClass93Array213;
    
    Class25() {
	/* empty */
    }
    
    public Interface1 method25(Class67 class67, int i) {
	if (Class67.aClass67_1054 == class67)
	    return client.localPlayers[i];
	if (class67 == Class67.aClass67_1052) {
	    ObjectNode class241_sub26
		= (ObjectNode) client.aClass407_8457.get((long) i);
	    if (class241_sub26 != null)
		return (Interface1) class241_sub26.objectValue;
	}
	return null;
    }
    
    public Interface1 method24(Class67 class67, int i) {
	if (Class67.aClass67_1054 == class67)
	    return client.localPlayers[i];
	if (class67 == Class67.aClass67_1052) {
	    ObjectNode class241_sub26
		= (ObjectNode) client.aClass407_8457.get((long) i);
	    if (class241_sub26 != null)
		return (Interface1) class241_sub26.objectValue;
	}
	return null;
    }
    
    public Interface1 method26(Class67 class67, int i) {
	if (Class67.aClass67_1054 == class67)
	    return client.localPlayers[i];
	if (class67 == Class67.aClass67_1052) {
	    ObjectNode class241_sub26
		= (ObjectNode) client.aClass407_8457.get((long) i);
	    if (class241_sub26 != null)
		return (Interface1) class241_sub26.objectValue;
	}
	return null;
    }
    
    public Interface1 method23(Class67 class67, int i, int i_0_) {
	if (Class67.aClass67_1054 == class67)
	    return client.localPlayers[i];
	if (class67 == Class67.aClass67_1052) {
	    ObjectNode class241_sub26
		= (ObjectNode) client.aClass407_8457.get((long) i);
	    if (class241_sub26 != null)
		return (Interface1) class241_sub26.objectValue;
	}
	return null;
    }
    
    public static Class423 method934(int i) {
	if (Class9.aClass423_53 == null)
	    return Class423.aClass423_6052;
	return Class9.aClass423_53;
    }
    
    static final void decodePlayerInit/*method935*/(RSBitBuffer data, byte i) {
        int start = data.pointer;
        //System.out.println(Arrays.toString(data.aByteArray8799));
		data.initBitAccess(1628510173);
		int myPlayerID = client.myPlayerIndex * 1124115145;
		Player myPlayer = (Class21.myPlayer
		       = client.localPlayers[myPlayerID]
		       = (new Player(client.aClass238_8477.method4751(-1722028865))));
		myPlayer.entityIndex = 1641239953 * myPlayerID;
		int posHash = data.readBits(30, 991129450);
		//System.out.println("Position hash: "+posHash);
		byte plane = (byte) (posHash >> 28);
		int posX = posHash >> 14 & 0x3fff;
		int posY = posHash & 0x3fff;
		System.out.println("Position: plane="+plane+", x="+posX+", y="+posY);        
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		myPlayer.scenePositionXQueue[0] = posX - 127679513 * class522.baseX;
		myPlayer.scenePositionYQueue[0] = posY - class522.baseY * 468558693;
		myPlayer.method10880((float) ((myPlayer.scenePositionXQueue[0] << 9)
			      + (myPlayer.method17782(-111419110)
				 << 8)),
		     (myPlayer.method10873().aClass287_4386
		      .aFloat4474),
		     (float) ((myPlayer.scenePositionYQueue[0] << 9)
			      + (myPlayer.method17782(283684106)
				 << 8)));
		Class357_Sub1.anInt10357 = (myPlayer.nodePlane = myPlayer.aByte8745 = plane) * -1355156935;
		if (client.aClass238_8477.method4753((byte) -4).method4331(
				myPlayer.scenePositionXQueue[0],
				myPlayer.scenePositionYQueue[0], 1319315916)) {
		    myPlayer.aByte8745++;
		}
		if (null != GPI.aClass241_Sub3Array2373[myPlayerID]) {
		    myPlayer.decodeCharacterData((GPI.aClass241_Sub3Array2373[myPlayerID]), (byte) 14);
	    }
		if (null != GPI.aClass241_Sub3Array2366[myPlayerID]) {
		    myPlayer.method17955((GPI.aClass241_Sub3Array2366[myPlayerID]), 191981740);
		}
		GPI.viewportPlayerCount = 0;
		GPI.viewportPlayerIndicies[(GPI.viewportPlayerCount += -1705037467) * 794073197 - 1]
		    = myPlayerID;
		GPI.skippingFlags[myPlayerID] = (byte) 0;
		GPI.outsidePlayerCount = 0;
		for (int index = 1; index < 2048; index++) {
		    if (myPlayerID != index) {
				int regionHash = data.readBits(18, 1609782728);
		                /*if (regionHash != 0) {
		                    System.out.println("Region hash at index "+i_6_+ " = "+regionHash);
		                }*/
				int i_8_ = regionHash >> 16 & 0x3;
				int i_9_ = regionHash >> 8 & 0xff;
				int i_10_ = regionHash & 0xff;
				Class26 class26 = GPI.playerRegions[index] = new Class26();
				((Class26) class26).regionHash
				    = -1163590993 * ((i_8_ << 28) + (i_9_ << 14) + i_10_);
				((Class26) class26).anInt214 = 0;
				((Class26) class26).anInt216 = -147063033;
				((Class26) class26).aBool217 = false;
				((Class26) class26).aBool218 = false;
				GPI.outsidePlayerIndicies[(GPI.outsidePlayerCount += -1083587301) * -626258669 - 1]
				    = index;
				GPI.skippingFlags[index] = (byte) 0;
		    }
		}
		data.finishBitAccess((byte) -67);
		//System.out.println("Player init block size: "+((data.pointer*421967667) - start)+", start="+start);
		Class39 class39 = Class445_Sub16.aClass351_Sub1_8660.method6332((short) -26678);
		if (Class39.aClass39_586 == class39) {
		    Class380_Sub2 class380_sub2
			= ((Class380_Sub2)
			   Class445_Sub16.aClass351_Sub1_8660.method6283(1888852676));
		    class380_sub2.method16693((byte) 38);
		}
		Class61 class61
		    = Class445_Sub16.aClass351_Sub1_8660.method6356(-2081403404);
		if (class61 == Class61.aClass61_1020) {
		    Class434_Sub5 class434_sub5
			= ((Class434_Sub5)
			   Class445_Sub16.aClass351_Sub1_8660.method6284((byte) 1));
		    class434_sub5.method14131((byte) 119);
		}
    }
    
    public static void method936(JS5 class210, int i) {
	Class495.aClass210_6523 = class210;
    }
    
    static final void method937(ClientScriptData class454, int i) {
	int i_11_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_11_, (byte) -86);
	Class301.method5829(class58, class454, -655536819);
    }
    
    static final void method938(InterfaceComponent class58, InterfaceDefinition class35,
				ClientScriptData class454, int i) {
	class58.aBool859
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
    }
    
    static final void method939(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class519.method11674(class58, class35, class454, 1697597869);
    }
    
    static final void method940(int i) {
	int i_12_ = -2008409600 * Class563.anInt7304 + 256;
	int i_13_ = 256 + Class473.anInt6379 * 979882496;
	int i_14_
	    = (Class96_Sub5.method16046(i_12_, i_13_,
					993680393 * Class357_Sub1.anInt10357,
					1444719090)
	       - -633729755 * Class434.anInt6120);
	if (Class46.anInt625 * 868689411 >= 100) {
	    Class462.anInt6284 = -1098038784 * Class563.anInt7304 + 774563072;
	    Class636.anInt8248 = -1908580096 + Class473.anInt6379 * 1516278272;
	    Class175.anInt2123
		= (Class96_Sub5.method16046(Class462.anInt6284 * 133333741,
					    -271636831 * Class636.anInt8248,
					    (Class357_Sub1.anInt10357
					     * 993680393),
					    -924879271)
		   - Class434.anInt6120 * -633729755) * -1365297795;
	} else {
	    if (133333741 * Class462.anInt6284 < i_12_) {
		Class462.anInt6284
		    += ((-1676704543 * Class53.anInt691
			 + (Class46.anInt625 * 868689411
			    * (i_12_ - 133333741 * Class462.anInt6284) / 1000))
			* 1680747237);
		if (133333741 * Class462.anInt6284 > i_12_)
		    Class462.anInt6284 = 1680747237 * i_12_;
	    }
	    if (Class462.anInt6284 * 133333741 > i_12_) {
		Class462.anInt6284
		    -= (1680747237
			* (Class53.anInt691 * -1676704543
			   + ((133333741 * Class462.anInt6284 - i_12_)
			      * (Class46.anInt625 * 868689411) / 1000)));
		if (133333741 * Class462.anInt6284 < i_12_)
		    Class462.anInt6284 = 1680747237 * i_12_;
	    }
	    if (Class175.anInt2123 * -781800491 < i_14_) {
		Class175.anInt2123
		    += ((868689411 * Class46.anInt625
			 * (i_14_ - Class175.anInt2123 * -781800491) / 1000)
			+ -1676704543 * Class53.anInt691) * -1365297795;
		if (Class175.anInt2123 * -781800491 > i_14_)
		    Class175.anInt2123 = -1365297795 * i_14_;
	    }
	    if (-781800491 * Class175.anInt2123 > i_14_) {
		Class175.anInt2123
		    -= ((-1676704543 * Class53.anInt691
			 + ((Class175.anInt2123 * -781800491 - i_14_)
			    * (Class46.anInt625 * 868689411) / 1000))
			* -1365297795);
		if (Class175.anInt2123 * -781800491 < i_14_)
		    Class175.anInt2123 = -1365297795 * i_14_;
	    }
	    if (-271636831 * Class636.anInt8248 < i_13_) {
		Class636.anInt8248
		    += ((Class53.anInt691 * -1676704543
			 + ((i_13_ - Class636.anInt8248 * -271636831)
			    * (Class46.anInt625 * 868689411) / 1000))
			* -1181860511);
		if (-271636831 * Class636.anInt8248 > i_13_)
		    Class636.anInt8248 = -1181860511 * i_13_;
	    }
	    if (Class636.anInt8248 * -271636831 > i_13_) {
		Class636.anInt8248
		    -= (-1181860511
			* (-1676704543 * Class53.anInt691
			   + ((-271636831 * Class636.anInt8248 - i_13_)
			      * (868689411 * Class46.anInt625) / 1000)));
		if (Class636.anInt8248 * -271636831 < i_13_)
		    Class636.anInt8248 = -1181860511 * i_13_;
	    }
	}
	i_12_ = 256 + Class421.anInt6040 * -954229248;
	i_13_ = 174209536 * Class380_Sub2.anInt10409 + 256;
	i_14_ = (Class96_Sub5.method16046(i_12_, i_13_,
					  Class357_Sub1.anInt10357 * 993680393,
					  1276360727)
		 - Class327.anInt5020 * 1939578505);
	int i_15_ = i_12_ - Class462.anInt6284 * 133333741;
	int i_16_ = i_14_ - -781800491 * Class175.anInt2123;
	int i_17_ = i_13_ - -271636831 * Class636.anInt8248;
	int i_18_ = (int) Math.sqrt((double) (i_17_ * i_17_ + i_15_ * i_15_));
	int i_19_ = ((int) (Math.atan2((double) i_16_, (double) i_18_)
			    * 2607.5945876176133)
		     & 0x3fff);
	int i_20_ = ((int) (Math.atan2((double) i_15_, (double) i_17_)
			    * -2607.5945876176133)
		     & 0x3fff);
	if (i_19_ < 1024)
	    i_19_ = 1024;
	if (i_19_ > 3072)
	    i_19_ = 3072;
	if (-1323229803 * Class496.anInt6527 < i_19_) {
	    Class496.anInt6527
		+= ((1847319789 * Class180.anInt2136
		     + (-1737452361 * Class62.anInt1029
			* (i_19_ - -1323229803 * Class496.anInt6527 >> 3)
			/ 1000))
		    << 3) * 709117373;
	    if (-1323229803 * Class496.anInt6527 > i_19_)
		Class496.anInt6527 = i_19_ * 709117373;
	}
	if (-1323229803 * Class496.anInt6527 > i_19_) {
	    Class496.anInt6527
		-= 709117373 * ((Class180.anInt2136 * 1847319789
				 + (Class62.anInt1029 * -1737452361
				    * (Class496.anInt6527 * -1323229803 - i_19_
				       >> 3)
				    / 1000))
				<< 3);
	    if (Class496.anInt6527 * -1323229803 < i_19_)
		Class496.anInt6527 = i_19_ * 709117373;
	}
	int i_21_ = i_20_ - -2112344687 * Class322.anInt4909;
	if (i_21_ > 8192)
	    i_21_ -= 16384;
	if (i_21_ < -8192)
	    i_21_ += 16384;
	i_21_ >>= 3;
	if (i_21_ > 0) {
	    Class322.anInt4909
		+= ((Class180.anInt2136 * 1847319789
		     + i_21_ * (-1737452361 * Class62.anInt1029) / 1000)
		    << 3) * 2118136689;
	    Class322.anInt4909
		= 2118136689 * (Class322.anInt4909 * -2112344687 & 0x3fff);
	}
	if (i_21_ < 0) {
	    Class322.anInt4909
		-= ((Class62.anInt1029 * -1737452361 * -i_21_ / 1000
		     + 1847319789 * Class180.anInt2136)
		    << 3) * 2118136689;
	    Class322.anInt4909
		= (-2112344687 * Class322.anInt4909 & 0x3fff) * 2118136689;
	}
	int i_22_ = i_20_ - Class322.anInt4909 * -2112344687;
	if (i_22_ > 8192)
	    i_22_ -= 16384;
	if (i_22_ < -8192)
	    i_22_ += 16384;
	if (i_22_ < 0 && i_21_ > 0 || i_22_ > 0 && i_21_ < 0)
	    Class322.anInt4909 = 2118136689 * i_20_;
	Class120_Sub18.anInt10605 = 0;
    }
    
    static void packAction/*method941*/(Class241_Sub27 packet, int interfaceID, int button1, int button2, int i_25_) {
    	packet.data.writeLEShortA(button1, (byte) -71);
    	packet.data.writeShort(button2, -484048531);
    	packet.data.writeInt(interfaceID, 1019196534);
    }
    
    public static void method942(Interface18 interface18, int i) {
	if (Class237.anInterface18_2714 != null)
	    throw new IllegalStateException("");
	Class237.anInterface18_2714 = interface18;
    }
    
    static final void method943(ClientScriptData class454, byte i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1) ? 1 : 0,
	     (byte) 2);
	client.aClass238_8477.method4768((byte) 5);
	Class167.method3600((short) 7711);
	client.aBool8297 = false;
    }
    
    static final void method944(InterfaceComponent class58, InterfaceDefinition class35,
				ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	class58.anInt986
	    = (((ClientScriptData) class454).integerStack
	       [1482319719 * ((ClientScriptData) class454).intStackPointer]) * -1160624465;
	class58.anInt902 = 1010401693 * (((ClientScriptData) class454).integerStack
					 [1 + (((ClientScriptData) class454).intStackPointer
					       * 1482319719)]);
	WorldType.refreshComponent(class58, -1165166634);
	Class103.method2635(class35, class58, -2091586605);
	if (0 == -1579470857 * class58.componentType)
	    Class380.method6882(class35, class58, false, -747971013);
    }
}
