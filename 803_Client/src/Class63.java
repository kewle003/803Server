/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class63
{
    static Class63 aClass63_1030;
    static Class63 aClass63_1031 = new Class63(0);
    static int anInt1032;
    
    static {
	aClass63_1030 = new Class63(1);
    }
    
    Class63(int i) {
	/* empty */
    }
    
    static Class168 method1619(byte[] is, byte i) {
	if (null == is)
	    throw new RuntimeException("");
	Class168 class168;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		MediaTracker mediatracker
		    = new MediaTracker(Class421.gameApplet);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i_0_ = image.getWidth(Class421.gameApplet);
		int i_1_ = image.getHeight(Class421.gameApplet);
		if (mediatracker.isErrorAny() || i_0_ < 0 || i_1_ < 0)
		    throw new RuntimeException("");
		int[] is_2_ = new int[i_1_ * i_0_];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i_0_, i_1_, is_2_, 0,
				       i_0_);
		pixelgrabber.grabPixels();
		class168
		    = Class236.aClass103_2713.method2259(is_2_, 0, i_0_, i_0_,
							 i_1_, (byte) 58);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class168;
    }
    
    static final void method1620(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_3_, (byte) -26);
	Class46.method1127(class58, class454, 1296982120);
    }
    
    static final void method1621(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -633785324;
	Class198.method4036((byte) 4);
	Class571.method12544(1378622690);
	Class262.anInt4317
	    = (((ClientScriptData) class454).integerStack
	       [((ClientScriptData) class454).intStackPointer * 1482319719]) * -1756777097;
	Class270.anInt4359
	    = ((((ClientScriptData) class454).integerStack
		[1 + 1482319719 * ((ClientScriptData) class454).intStackPointer])
	       * -1417831975);
	Class509.anInt6682
	    = ((((ClientScriptData) class454).integerStack
		[1482319719 * ((ClientScriptData) class454).intStackPointer + 2])
	       * -172896111);
	Class25.anInt212
	    = 501691175 * (((ClientScriptData) class454).integerStack
			   [3 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	Class77.anInt1130
	    = 876270763 * (((ClientScriptData) class454).integerStack
			   [4 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	Class163.anInt2050
	    = (1243302927
	       * (((ClientScriptData) class454).integerStack
		  [5 + 1482319719 * ((ClientScriptData) class454).intStackPointer]));
	Class540.anInt7003
	    = 365331647 * (((ClientScriptData) class454).integerStack
			   [6 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Exception_Sub3.anInt10695
	    = ((((ClientScriptData) class454).integerStack
		[1482319719 * ((ClientScriptData) class454).intStackPointer + 7])
	       * -635462179);
	Class199.anInt2385
	    = ((((ClientScriptData) class454).integerStack
		[1482319719 * ((ClientScriptData) class454).intStackPointer + 8])
	       * -1420013177);
	BaseVarType.anInt2541
	    = (-642296251
	       * (((ClientScriptData) class454).integerStack
		  [9 + ((ClientScriptData) class454).intStackPointer * 1482319719]));
	Class8.anInt45
	    = (-1881094163
	       * (((ClientScriptData) class454).integerStack
		  [((ClientScriptData) class454).intStackPointer * 1482319719 + 10]));
	Class200.anInt2398
	    = ((((ClientScriptData) class454).integerStack
		[((ClientScriptData) class454).intStackPointer * 1482319719 + 11])
	       * 1861588119);
	Class284.SPRITES_ARCHIVE.method4250(-1141209597 * Class77.anInt1130,
					   -246278782);
	Class284.SPRITES_ARCHIVE.method4250(1190535919 * Class163.anInt2050,
					   135838749);
	Class284.SPRITES_ARCHIVE.method4250(-1741231297 * Class540.anInt7003,
					   362779180);
	Class284.SPRITES_ARCHIVE
	    .method4250(Exception_Sub3.anInt10695 * 726901365, 258554545);
	Class284.SPRITES_ARCHIVE.method4250(428909623 * Class199.anInt2385,
					   -251345217);
	Class284.SPRITES_ARCHIVE.method4250(193407783 * Class200.anInt2398,
					   1826099719);
	Class120_Sub7.FONTS_ARCHIVE
	    .method4250(193407783 * Class200.anInt2398, -375630612);
	Exception_Sub5.aClass168_10705 = null;
	Class479.aClass168_6416 = null;
	Class102.aClass168_1448 = null;
	Class23.aClass168_208 = null;
	Class445_Sub30.aClass168_8711 = null;
	Class363.aClass168_5533 = null;
	Class363.aClass168_5534 = null;
	Class570.aClass168_7359 = null;
	Class16.aBool168 = true;
    }
    
    static final void method1622(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	Class98.method2174(Class21.myPlayer,
			   (((ClientScriptData) class454).integerStack
			    [((ClientScriptData) class454).intStackPointer * 1482319719]),
			   (((ClientScriptData) class454).integerStack
			    [1 + (1482319719
				  * ((ClientScriptData) class454).intStackPointer)]),
			   -986322408);
    }
}
