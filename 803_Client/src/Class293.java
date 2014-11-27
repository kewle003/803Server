/* Class293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Class293
{
    byte[] aByteArray4494;
    Class207 this$0;
    
    byte[] method5690(int i) {
	return ((Class293) this).aByteArray4494;
    }
    
    Class293(Class207 class207, InputStream inputstream,
	     Class241_Sub39_Sub5_Sub2 class241_sub39_sub5_sub2, URL url) {
	((Class293) this).this$0 = class207;
	((Class293) this).aByteArray4494 = null;
	if (null != inputstream) {
	    int i = 10240;
	    RSByteBuffer class241_sub3 = new RSByteBuffer(i, true);
	    int i_0_ = 0;
	    byte[] is = Class428.method7613(1024, -958684464);
	    while (i_0_ >= 0) {
		try {
		    i_0_ = inputstream.read(is);
		} catch (IOException ioexception) {
		    ioexception.printStackTrace();
		    i_0_ = -1;
		}
		if (i_0_ > 0) {
		    if (class241_sub3.pointer * 421967667 + i_0_
			>= class241_sub3.payload.length) {
			int i_1_ = 10240 + class241_sub3.payload.length;
			byte[] is_2_
			    = Class428.method7603(i_1_, true, (byte) 0);
			System.arraycopy(class241_sub3.payload, 0,
					 is_2_, 0,
					 class241_sub3.pointer * 421967667);
			Class428.method7615(class241_sub3.payload,
					    2105983056);
			class241_sub3.payload = is_2_;
		    }
		    class241_sub3.writeBytes(is, 0, i_0_, 752061035);
		}
	    }
	    for (int i_3_ = 0;
		 i_3_ < -2114378537 * ((Class241_Sub39_Sub5_Sub2)
				       class241_sub39_sub5_sub2).anInt11282;
		 i_3_++)
		class241_sub3.writeByte(0, -1865314026);
	    byte[] is_4_ = new byte[421967667 * class241_sub3.pointer];
	    System.arraycopy(class241_sub3.payload, 0, is_4_, 0,
			     421967667 * class241_sub3.pointer);
	    class241_sub3.method14618(-174251917);
	    Object object = null;
	    Class428.method7615(is, -409464434);
	    Object object_5_ = null;
	    ((Class293) this).aByteArray4494 = is_4_;
	    try {
		inputstream.close();
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	}
	((Class241_Sub39_Sub5_Sub2) class241_sub39_sub5_sub2).aBool10839
	    = false;
	class207.method4099(151017176);
    }
    
    byte[] method5691() {
	return ((Class293) this).aByteArray4494;
    }
    
    static final void method5692(ClientScriptData class454, byte i) {
	Class445_Sub16.method14252(1521294282);
    }
    
    static final void method5693(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
    }
    
    static void method5694(Class628_Sub1 class628_sub1, byte i) {
	class628_sub1.method14314(0, 1579257935);
	int i_6_;
	if (GameShell3.maxmemory * -1901361259 >= 96) {
	    int i_7_ = Class345.method6177((byte) 7);
	    if (i_7_ <= 100) {
		Class13.method666((byte) -2);
		i_6_ = 4;
	    } else if (i_7_ <= 501) {
		Class448.method7924(694012827);
		i_6_ = 3;
	    } else if (i_7_ <= 1000) {
		Class13.method673(1755947461);
		i_6_ = 2;
	    } else {
		WorldTile.method16486(true, -618969035);
		i_6_ = 1;
	    }
	    class628_sub1.method14315(0, i_7_, -1118380564);
	} else {
	    WorldTile.method16486(true, -1804633086);
	    i_6_ = 1;
	    class628_sub1.method14313(64, (byte) -52);
	}
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893
		.method14197((byte) 14)
	    != 0) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879,
		 0, (byte) 2);
	    GraphicsDefaults.method11570(0, false, 1945822518);
	} else
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14912
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893,
		 true, 2031479831);
	Class167.method3600((short) 22835);
	class628_sub1.method14319(i_6_, -840222868);
    }
    
    static final void method5695(ClientScriptData class454, int i) {
	int i_8_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub39_Sub14 class241_sub39_sub14
	    = Class123.aClass292_1579.method5686(i_8_, (byte) 33);
	if (class241_sub39_sub14.anIntArray10968 == null)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub39_sub14.anIntArray10968.length;
    }
    
    static final void method5696(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	Class402.soundManager.method1169((((ClientScriptData) class454).integerStack
					   [(((ClientScriptData) class454).intStackPointer
					     * 1482319719)]),
					  (((ClientScriptData) class454).integerStack
					   [1 + (((ClientScriptData) class454)
						 .intStackPointer) * 1482319719]),
					  -1409386313);
    }
}
