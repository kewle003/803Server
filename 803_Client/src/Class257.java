/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

public class Class257
{
    public static final int anInt4156 = 134217728;
    public static final int anInt4157 = 8388608;
    public static final int anInt4158 = 32768;
    public static final int anInt4159 = 4;
    public static final int anInt4160 = 2097152;
    public static final int anInt4161 = 1;
    public static final int anInt4162 = 64;
    public static final int anInt4163 = 8;
    public static final int anInt4164 = 256;
    public static final int anInt4165 = 2;
    public static final int anInt4166 = 2;
    public static final int anInt4167 = 128;
    public static final int anInt4168 = 2048;
    public static final int anInt4169 = 1024;
    public static final int anInt4170 = 8192;
    public static final int anInt4171 = 262144;
    public static final int anInt4172 = 16;
    public static final int anInt4173 = 131072;
    public static final int anInt4174 = 524288;
    public static final int anInt4175 = 262144;
    public static final int anInt4176 = 1048576;
    public static final int anInt4177 = 65536;
    public static final int anInt4178 = 4194304;
    public static final int anInt4179 = 4;
    public static final int anInt4180 = 16;
    public static final int anInt4181 = 8;
    public static final int anInt4182 = 128;
    public static final int anInt4183 = 64;
    public static final int anInt4184 = 32;
    public static final int anInt4185 = 1;
    public static final int anInt4186 = 256;
    public static final int anInt4187 = 2048;
    public static final int anInt4188 = 4194304;
    public static final int anInt4189 = 16384;
    public static final int anInt4190 = 512;
    public static final int anInt4191 = 8192;
    public static final int anInt4192 = 16777216;
    public static final int anInt4193 = 32768;
    public static final int anInt4194 = 32;
    public static final int anInt4195 = 1048576;
    public static final int anInt4196 = 131072;
    public static final int anInt4197 = 33554432;
    public static final int anInt4198 = 524288;
    public static final int anInt4199 = 65536;
    public static final int anInt4200 = 2097152;
    public static final int anInt4201 = 1024;
    public static final int anInt4202 = 8388608;
    public static final int anInt4203 = 67108864;
    public static final int anInt4204 = 16384;
    public static final int anInt4205 = 4096;
    
    Class257() throws Throwable {
	throw new Error();
    }
    
    static final void method5055(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class25.method944(component, iFace, scriptData, -1033654316);
    }
    
    static final void method5056(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -24);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1032303763 * class58.spriteID;
    }
    
    public static boolean method5057(byte i, int i_1_) {
	int i_2_ = i & 0xff;
	if (i_2_ == 0)
	    return false;
	if (i_2_ >= 128 && i_2_ < 160
	    && Class462.shiftCharacters[i_2_ - 128] == 0)
	    return false;
	return true;
    }
    
    static Class326 method5058(RSByteBuffer class241_sub3, int i) {
	Class330 class330 = (Class200.method4070((byte) 81)
			     [class241_sub3.readUnsignedByte((byte) -24)]);
	Class324 class324 = (Class327.method6016((byte) -6)
			     [class241_sub3.readUnsignedByte((byte) -56)]);
	int i_3_ = class241_sub3.readShort((byte) 92);
	int i_4_ = class241_sub3.readShort((byte) 114);
	int i_5_ = class241_sub3.readUnsignedShort(1162222719);
	int i_6_ = class241_sub3.readUnsignedShort(1162222719);
	int i_7_ = class241_sub3.readShort((byte) 76);
	int i_8_ = class241_sub3.readBigSmart((byte) -15);
	int i_9_ = class241_sub3.readInt((byte) 27);
	return new Class326(class330, class324, i_3_, i_4_, i_5_, i_6_, i_7_,
			    i_8_, i_9_);
    }
    
    static void method5059(int i) {
	if (Class236.aClass103_2713.method2234()) {
	    Class236.aClass103_2713.method2349(Class344.canvas,
					       -1848270163);
	    Class469.method10757(2118608931);
	    Dimension dimension = Class344.canvas.getSize();
	    Class236.aClass103_2713.method2239(Class344.canvas,
					       dimension.width,
					       dimension.height, 2141484285);
	    Class236.aClass103_2713.method2242(Class344.canvas,
					       2140195345);
	} else
	    GraphicsDefaults.method11570(Class241_Sub5_Sub9.aClass241_Sub9_11043
				     .aClass445_Sub11_8893
				     .method14197((byte) -63),
				 false, 1945822518);
	Class69.method1683((byte) 14);
    }
    
    static void method5060(InterfaceComponent class58, int i, int i_10_, int i_11_) {
	if (0 == class58.locationXMode)
	    class58.anInt928 = -1943704289 * class58.drawOffsetX;
	else if (1 == class58.locationXMode)
	    class58.anInt928 = ((i - class58.anInt850 * 439139681) / 2
				+ -857499299 * class58.drawOffsetX) * 44706987;
	else if (class58.locationXMode == 2)
	    class58.anInt928 = (i - class58.anInt850 * 439139681
				- -857499299 * class58.drawOffsetX) * 44706987;
	else if (class58.locationXMode == 3)
	    class58.anInt928
		= (i * (class58.drawOffsetX * -857499299) >> 14) * 44706987;
	else if (class58.locationXMode == 4)
	    class58.anInt928
		= 44706987 * ((i - 439139681 * class58.anInt850) / 2
			      + (class58.drawOffsetX * -857499299 * i >> 14));
	else
	    class58.anInt928
		= (i - 439139681 * class58.anInt850
		   - (i * (-857499299 * class58.drawOffsetX) >> 14)) * 44706987;
	if (0 == class58.locationYMode)
	    class58.anInt894 = class58.drawOffsetY * 1694697129;
	else if (class58.locationYMode == 1)
	    class58.anInt894
		= -796390501 * ((i_10_ - 1463495207 * class58.scrollMinY) / 2
				+ 1293518091 * class58.drawOffsetY);
	else if (class58.locationYMode == 2)
	    class58.anInt894
		= -796390501 * (i_10_ - 1463495207 * class58.scrollMinY
				- class58.drawOffsetY * 1293518091);
	else if (3 == class58.locationYMode)
	    class58.anInt894
		= (class58.drawOffsetY * 1293518091 * i_10_ >> 14) * -796390501;
	else if (4 == class58.locationYMode)
	    class58.anInt894
		= -796390501 * ((1293518091 * class58.drawOffsetY * i_10_ >> 14)
				+ (i_10_ - class58.scrollMinY * 1463495207) / 2);
	else
	    class58.anInt894 = (i_10_ - class58.scrollMinY * 1463495207
				- (1293518091 * class58.drawOffsetY * i_10_
				   >> 14)) * -796390501;
	if (client.aBool8403
	    && (client.method13624(class58).anInt9007 * -438085493 != 0
		|| -1579470857 * class58.componentType == 0)) {
	    if (-361730557 * class58.anInt928 < 0)
		class58.anInt928 = 0;
	    else if ((439139681 * class58.anInt850
		      + -361730557 * class58.anInt928)
		     > i)
		class58.anInt928
		    = 44706987 * (i - class58.anInt850 * 439139681);
	    if (class58.anInt894 * -145726829 < 0)
		class58.anInt894 = 0;
	    else if ((class58.anInt894 * -145726829
		      + class58.scrollMinY * 1463495207)
		     > i_10_)
		class58.anInt894
		    = (i_10_ - class58.scrollMinY * 1463495207) * -796390501;
	}
    }
    
    static final void method5061(ClientScriptData class454, byte i) {
		int i_12_
			= (((ClientScriptData) class454).integerStack
			   [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
		Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.COLOUR_INPUT_PACKET,
						 client.aClass190_8340.packetCipher,
						 16711935);
		class241_sub27.data.writeShort(i_12_, -484048531);
		client.aClass190_8340.sendPacket(class241_sub27, -1998923454);
    }
    
    static final void method5062(ClientScriptData class454, byte i) {
	int i_13_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	GameScene class522;
	if (i_13_ >= (Class21.myPlayer.queuedStepCount
		      * -316498507)
	    || i_13_ < 0)
	    class522 = Class21.myPlayer
			   .method17801(2124217349);
	else {
	    byte i_14_ = Class21.myPlayer.nodePlane;
	    GameScene class522_15_ = client.aClass238_8477.method4806((byte) 1);
	    int i_16_ = ((Class21.myPlayer
			  .scenePositionXQueue[i_13_])
			 + 127679513 * class522_15_.baseX);
	    int i_17_ = (468558693 * class522_15_.baseY
			 + (Class21.myPlayer
			    .scenePositionYQueue[i_13_]));
	    class522 = new GameScene(i_14_, i_16_, i_17_);
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class522.method11702((byte) 3);
    }
    
    static Class163[] method5063(byte i) {
	return (new Class163[]
		{ Class163.aClass163_2048, Class163.aClass163_2044,
		  Class163.aClass163_2045, Class163.aClass163_2046,
		  Class163.aClass163_2047, Class163.aClass163_2043,
		  Class163.aClass163_2042 });
    }
    
    public static final void method5064(byte i) {
	if (Class13.anInt101 * 1195617353 != 1) {
	    Exception_Sub5.aClass190_10704.closeConnection(1650691855);
	    Class241_Sub18_Sub1.method17144(1624381804);
	    ParamType.method13195((byte) -124);
	}
    }
}
