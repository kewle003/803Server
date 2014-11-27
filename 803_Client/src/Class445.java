/* Class445 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class Class445
{
    public static final int anInt6172 = 3;
    protected static final int anInt6173 = 2;
    protected static final int anInt6174 = 1;
    protected Class241_Sub9 aClass241_Sub9_6175;
    protected int anInt6176;
    
    void method7878(int i, int i_0_) {
	if (method7880(i, 996762312) != 3)
	    method7882(i, 622532142);
    }
    
    Class445(Class241_Sub9 class241_sub9) {
	aClass241_Sub9_6175 = class241_sub9;
	anInt6176 = method7881(-1670737968) * -679946765;
    }
    
    abstract int method7879(int i);
    
    abstract int method7880(int i, int i_1_);
    
    abstract int method7881(int i);
    
    abstract void method7882(int i, int i_2_);
    
    abstract int method7883();
    
    abstract int method7884();
    
    abstract int method7885();
    
    abstract int method7886(int i);
    
    abstract int method7887(int i);
    
    Class445(int i, Class241_Sub9 class241_sub9) {
	anInt6176 = i * -679946765;
	aClass241_Sub9_6175 = class241_sub9;
    }
    
    abstract void method7888(int i);
    
    abstract void method7889(int i);
    
    void method7890(int i) {
	if (method7880(i, 996762312) != 3)
	    method7882(i, 622532142);
    }
    
    void method7891(int i) {
	if (method7880(i, 996762312) != 3)
	    method7882(i, 622532142);
    }
    
    static final void method7892(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.anInt809 * -448902767;
    }
    
    static void method7893(Class103 class103, int i) {
	if (Class23.aClass429_207.method7626(-2048833573) != 0) {
	    if (Class241_Sub5_Sub9.aClass241_Sub9_11043
		    .aClass445_Sub11_8893.method14197((byte) -56)
		== 0) {
		for (Class241_Sub33 class241_sub33
			 = ((Class241_Sub33)
			    Class23.aClass429_207.method7694(16711935));
		     null != class241_sub33;
		     class241_sub33
			 = ((Class241_Sub33)
			    Class23.aClass429_207.method7692(1249383881))) {
		    JS5.itemDefLoader.method13283
			(class103, class103,
			 (((Class241_Sub33) class241_sub33).anInt10077
			  * -1216269299),
			 (((Class241_Sub33) class241_sub33).anInt10075
			  * 2060598739),
			 (-1564171745
			  * ((Class241_Sub33) class241_sub33).anInt10076),
			 (1797237127
			  * ((Class241_Sub33) class241_sub33).anInt10079),
			 false, false,
			 (-802238465
			  * ((Class241_Sub33) class241_sub33).anInt10074),
			 Class247_Sub2.aClass96_10073,
			 (((Class241_Sub33) class241_sub33).aBool10078
			  ? (Class21.myPlayer
			     .aClass490_11499)
			  : null),
			 Class128.aClass513_1589, 892047840);
		    class241_sub33.remove((byte) 36);
		}
		Class69.method1683((byte) 14);
	    } else {
		if (null == Class23.aClass103_206) {
		    Canvas canvas = new Canvas();
		    canvas.setSize(36, 32);
		    Class23.aClass103_206
			= Class40.method1044(0, canvas,
					     Class234.aClass107_2699,
					     Class120_Sub5.anInterface6_10485,
					     Class200.SHADERS_ARCHIVE, 0,
					     (byte) -4);
		    Class485.aClass96_6469
			= (Class23.aClass103_206.method2296
			   (Class518.method11660(Class120_Sub7.FONTS_ARCHIVE,
						 1448573739 * Class5.anInt17,
						 0, (byte) -21),
			    Class160.method3439(Class284.SPRITES_ARCHIVE,
						1448573739 * Class5.anInt17,
						0),
			    true));
		}
		for (Class241_Sub33 class241_sub33
			 = ((Class241_Sub33)
			    Class23.aClass429_207.method7694(16711935));
		     null != class241_sub33;
		     class241_sub33
			 = ((Class241_Sub33)
			    Class23.aClass429_207.method7692(1923067443))) {
		    JS5.itemDefLoader.method13283
			(Class23.aClass103_206, class103,
			 (-1216269299
			  * ((Class241_Sub33) class241_sub33).anInt10077),
			 (2060598739
			  * ((Class241_Sub33) class241_sub33).anInt10075),
			 (-1564171745
			  * ((Class241_Sub33) class241_sub33).anInt10076),
			 (((Class241_Sub33) class241_sub33).anInt10079
			  * 1797237127),
			 false, false,
			 (((Class241_Sub33) class241_sub33).anInt10074
			  * -802238465),
			 Class485.aClass96_6469,
			 (((Class241_Sub33) class241_sub33).aBool10078
			  ? (Class21.myPlayer
			     .aClass490_11499)
			  : null),
			 Class128.aClass513_1589, -584157240);
		    class241_sub33.remove((byte) 36);
		}
	    }
	}
    }
    
    public static byte[] method7894(Object object, boolean bool, int i) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (bool)
		return Arrays.copyOf(is, is.length);
	    return is;
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[bytebuffer.capacity()];
	    bytebuffer.position(0);
	    bytebuffer.get(is);
	    return is;
	}
	throw new IllegalArgumentException();
    }
}
