/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class23
{
    static Class103 aClass103_206;
    static NodeCollection aClass429_207 = new NodeCollection();
    public static Class168 aClass168_208;
    
    static void method906() {
	if (null != aClass103_206) {
	    aClass103_206.method2220((byte) 0);
	    aClass103_206 = null;
	    Class485.aClass96_6469 = null;
	}
    }
    
    static void method907(Class103 class103, InterfaceComponent class58) {
	boolean bool
	    = ((JS5.itemDefLoader.method13296
		(class103, class58.slot2 * 877329925,
		 1809275135 * class58.anInt975, -980602175 * class58.anInt872,
		 ~0xffffff | class58.anInt881 * 1143403757,
		 -1412069699 * class58.anInt895,
		 (class58.aBool988
		  ? Class21.myPlayer.aClass490_11499
		  : null),
		 (byte) 0))
	       == null);
	if (bool) {
	    aClass429_207.addNode
		(new Class241_Sub33(class58.slot2 * 877329925,
				    1809275135 * class58.anInt975,
				    -980602175 * class58.anInt872,
				    ~0xffffff | 1143403757 * class58.anInt881,
				    class58.anInt895 * -1412069699,
				    class58.aBool988),
		 (short) -11433);
	    WorldType.refreshComponent(class58, 1318219396);
	}
    }
    
    Class23() throws Throwable {
	throw new Error();
    }
    
    static void method908(Class103 class103) {
	if (aClass429_207.method7626(-1639340634) != 0) {
	    if (Class241_Sub5_Sub9.aClass241_Sub9_11043
		    .aClass445_Sub11_8893.method14197((byte) 41)
		== 0) {
		for (Class241_Sub33 class241_sub33
			 = (Class241_Sub33) aClass429_207.method7694(16711935);
		     null != class241_sub33;
		     class241_sub33 = ((Class241_Sub33)
				       aClass429_207.method7692(1476915201))) {
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
			 Class128.aClass513_1589, 48077195);
		    class241_sub33.remove((byte) 36);
		}
		Class69.method1683((byte) 14);
	    } else {
		if (null == aClass103_206) {
		    Canvas canvas = new Canvas();
		    canvas.setSize(36, 32);
		    aClass103_206
			= Class40.method1044(0, canvas,
					     Class234.aClass107_2699,
					     Class120_Sub5.anInterface6_10485,
					     Class200.SHADERS_ARCHIVE, 0,
					     (byte) 15);
		    Class485.aClass96_6469
			= (aClass103_206.method2296
			   (Class518.method11660(Class120_Sub7.FONTS_ARCHIVE,
						 1448573739 * Class5.anInt17,
						 0, (byte) 97),
			    Class160.method3439(Class284.SPRITES_ARCHIVE,
						1448573739 * Class5.anInt17,
						0),
			    true));
		}
		for (Class241_Sub33 class241_sub33
			 = (Class241_Sub33) aClass429_207.method7694(16711935);
		     null != class241_sub33;
		     class241_sub33 = ((Class241_Sub33)
				       aClass429_207.method7692(-517436697))) {
		    JS5.itemDefLoader.method13283
			(aClass103_206, class103,
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
			 Class128.aClass513_1589, 100737102);
		    class241_sub33.remove((byte) 36);
		}
	    }
	}
    }
    
    static void method909() {
	if (null != aClass103_206) {
	    aClass103_206.method2220((byte) 0);
	    aClass103_206 = null;
	    Class485.aClass96_6469 = null;
	}
    }
    
    static final void method910(ClientScriptData class454, byte i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -128);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -383857477 * class58.anInt886;
    }
    
    static final void method911(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861
		  .method14378(1499749194) == 1 ? 1 : 0;
    }
    
    static final void method912(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub19_8882,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	Class167.method3600((short) -8417);
    }
}
