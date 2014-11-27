/* Class354_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Class354_Sub2 extends Class354
{
    Color aColor10488;
    Font aFont10489;
    FontMetrics aFontMetrics10490;
    Class356 this$0;
    boolean aBool10491;
    public static int anInt10492;
    
    Class354_Sub2(Class356 class356, boolean bool, String string, int i,
		  int i_0_, int i_1_, int i_2_) {
	super(class356, i_1_, i_2_);
	((Class354_Sub2) this).this$0 = class356;
	((Class354_Sub2) this).aBool10491 = bool;
	((Class354_Sub2) this).aFont10489 = new Font(string, 0, i);
	((Class354_Sub2) this).aFontMetrics10490
	    = Class344.canvas
		  .getFontMetrics(((Class354_Sub2) this).aFont10489);
	((Class354_Sub2) this).aColor10488 = new Color(i_0_);
    }
    
    void method6433(Graphics graphics, byte i) {
	String string;
	if (((Class354_Sub2) this).aBool10491)
	    string = ((Class356) ((Class354_Sub2) this).this$0).aString5457;
	else
	    string
		= new StringBuilder().append
		      (((Class356) ((Class354_Sub2) this).this$0).aString5459)
		      .append
		      (" ").append
		      (((Class356) ((Class354_Sub2) this).this$0).aString5457)
		      .toString();
	graphics.setFont(((Class354_Sub2) this).aFont10489);
	graphics.setColor(((Class354_Sub2) this).aColor10488);
	graphics.drawString(string,
			    ((((Class354_Sub2) this).this$0.method6440
			      (((Class354_Sub2) this).aFontMetrics10490
				   .stringWidth(string),
			       (byte) -24))
			     + ((Class354_Sub2) this).anInt5446 * 802064963),
			    (((Class354_Sub2) this).this$0.method6443(0,
								      (byte) 0)
			     + 1364448905 * ((Class354_Sub2) this).anInt5445));
    }
    
    void method6432(Graphics graphics) {
	String string;
	if (((Class354_Sub2) this).aBool10491)
	    string = ((Class356) ((Class354_Sub2) this).this$0).aString5457;
	else
	    string
		= new StringBuilder().append
		      (((Class356) ((Class354_Sub2) this).this$0).aString5459)
		      .append
		      (" ").append
		      (((Class356) ((Class354_Sub2) this).this$0).aString5457)
		      .toString();
	graphics.setFont(((Class354_Sub2) this).aFont10489);
	graphics.setColor(((Class354_Sub2) this).aColor10488);
	graphics.drawString(string,
			    ((((Class354_Sub2) this).this$0.method6440
			      (((Class354_Sub2) this).aFontMetrics10490
				   .stringWidth(string),
			       (byte) -15))
			     + ((Class354_Sub2) this).anInt5446 * 802064963),
			    (((Class354_Sub2) this).this$0.method6443(0,
								      (byte) 0)
			     + 1364448905 * ((Class354_Sub2) this).anInt5445));
    }
    
    public static Class337 method16772(RSByteBuffer class241_sub3, int i) {
	int i_3_ = class241_sub3.readInt((byte) 36);
	return new Class337(i_3_);
    }
    
    static final void method16773(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886
		  .method14117(-836188783);
    }
}
