/* Class354_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.awt.Image;

public class Class354_Sub1 extends Class354
{
    Image anImage10376;
    Class356 this$0;
    
    Class354_Sub1(Class356 class356, Image image, int i, int i_0_) {
	super(class356, i, i_0_);
	((Class354_Sub1) this).this$0 = class356;
	((Class354_Sub1) this).anImage10376 = image;
    }
    
    void method6433(Graphics graphics, byte i) {
	int i_1_
	    = (((Class354_Sub1) this).this$0.method6440(((Class354_Sub1) this)
							    .anImage10376
							    .getWidth(null),
							(byte) 24)
	       + 802064963 * ((Class354_Sub1) this).anInt5446);
	int i_2_
	    = (((Class354_Sub1) this).this$0.method6443(((Class354_Sub1) this)
							    .anImage10376
							    .getHeight(null),
							(byte) 0)
	       + ((Class354_Sub1) this).anInt5445 * 1364448905);
	graphics.drawImage(((Class354_Sub1) this).anImage10376, i_1_, i_2_,
			   null);
    }
    
    void method6432(Graphics graphics) {
	int i
	    = (((Class354_Sub1) this).this$0.method6440(((Class354_Sub1) this)
							    .anImage10376
							    .getWidth(null),
							(byte) 108)
	       + 802064963 * ((Class354_Sub1) this).anInt5446);
	int i_3_
	    = (((Class354_Sub1) this).this$0.method6443(((Class354_Sub1) this)
							    .anImage10376
							    .getHeight(null),
							(byte) 0)
	       + ((Class354_Sub1) this).anInt5445 * 1364448905);
	graphics.drawImage(((Class354_Sub1) this).anImage10376, i, i_3_, null);
    }
    
    static boolean method16677(int i, byte i_4_) {
	return i == 13 || i == 1 || 9 == i || i == 14 || i == 3;
    }
    
    static final void method16678(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 89728509 * class58.anInt870;
    }
}
