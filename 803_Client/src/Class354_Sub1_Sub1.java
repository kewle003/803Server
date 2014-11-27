/* Class354_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Class354_Sub1_Sub1 extends Class354_Sub1
{
    Class356 this$0;
    float aFloat10686;
    float aFloat10687;
    
    Class354_Sub1_Sub1(Class356 class356, Image image, int i, int i_0_,
		       float f) {
	super(class356, image, i, i_0_);
	((Class354_Sub1_Sub1) this).this$0 = class356;
	((Class354_Sub1_Sub1) this).aFloat10687 = f;
	((Class354_Sub1_Sub1) this).aFloat10686
	    = -((Class354_Sub1_Sub1) this).aFloat10687;
    }
    
    void method6433(Graphics graphics, byte i) {
	((Class354_Sub1_Sub1) this).aFloat10686
	    += ((Class354_Sub1_Sub1) this).aFloat10687;
	if (((Class354_Sub1_Sub1) this).aFloat10686 < 0.0F)
	    ((Class354_Sub1_Sub1) this).aFloat10686 += 360.0F;
	((Class354_Sub1_Sub1) this).aFloat10686 %= 360.0F;
	double d
	    = Math.toRadians((double) ((Class354_Sub1_Sub1) this).aFloat10686);
	int i_1_ = ((Class354_Sub1_Sub1) this).anImage10376.getWidth(null);
	int i_2_ = ((Class354_Sub1_Sub1) this).anImage10376.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (((Class354_Sub1_Sub1) this).this$0
					.method6440(i_1_, (byte) -16)
				    + i_1_ / 2
				    + 802064963 * (((Class354_Sub1_Sub1) this)
						   .anInt5446)),
			  (double) (((Class354_Sub1_Sub1) this).this$0
					.method6443(i_2_, (byte) 0)
				    + i_2_ / 2
				    + (((Class354_Sub1_Sub1) this).anInt5445
				       * 1364448905)));
	graphics2d.translate
	    ((((Class354_Sub1_Sub1) this).this$0.method6440(i_1_, (byte) 12)
	      + ((Class354_Sub1_Sub1) this).anInt5446 * 802064963),
	     (((Class354_Sub1_Sub1) this).this$0.method6443(i_2_, (byte) 0)
	      + ((Class354_Sub1_Sub1) this).anInt5445 * 1364448905));
	graphics2d.drawImage(((Class354_Sub1_Sub1) this).anImage10376, null,
			     null);
	graphics2d.setTransform(((Class356) ((Class354_Sub1_Sub1) this).this$0)
				.anAffineTransform5455);
    }
    
    void method6432(Graphics graphics) {
	((Class354_Sub1_Sub1) this).aFloat10686
	    += ((Class354_Sub1_Sub1) this).aFloat10687;
	if (((Class354_Sub1_Sub1) this).aFloat10686 < 0.0F)
	    ((Class354_Sub1_Sub1) this).aFloat10686 += 360.0F;
	((Class354_Sub1_Sub1) this).aFloat10686 %= 360.0F;
	double d
	    = Math.toRadians((double) ((Class354_Sub1_Sub1) this).aFloat10686);
	int i = ((Class354_Sub1_Sub1) this).anImage10376.getWidth(null);
	int i_3_ = ((Class354_Sub1_Sub1) this).anImage10376.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (((Class354_Sub1_Sub1) this).this$0
					.method6440(i, (byte) -62)
				    + i / 2
				    + 802064963 * (((Class354_Sub1_Sub1) this)
						   .anInt5446)),
			  (double) (((Class354_Sub1_Sub1) this).this$0
					.method6443(i_3_, (byte) 0)
				    + i_3_ / 2
				    + (((Class354_Sub1_Sub1) this).anInt5445
				       * 1364448905)));
	graphics2d.translate
	    ((((Class354_Sub1_Sub1) this).this$0.method6440(i, (byte) 69)
	      + ((Class354_Sub1_Sub1) this).anInt5446 * 802064963),
	     (((Class354_Sub1_Sub1) this).this$0.method6443(i_3_, (byte) 0)
	      + ((Class354_Sub1_Sub1) this).anInt5445 * 1364448905));
	graphics2d.drawImage(((Class354_Sub1_Sub1) this).anImage10376, null,
			     null);
	graphics2d.setTransform(((Class356) ((Class354_Sub1_Sub1) this).this$0)
				.anAffineTransform5455);
    }
    
    static final void method16932(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (class58.modelType * -982148763 == 1
	       ? class58.anInt879 * 1965460551 : -1);
    }
}
