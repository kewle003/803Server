/* Class105_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class105_Sub1_Sub3_Sub1 extends Class105_Sub1_Sub3
{
    Image anImage11453;
    
    void method17542() {
	super.method17539(194083646);
	DataBufferInt databufferint
	    = new DataBufferInt((((Class105_Sub1_Sub3_Sub1) this)
				 .anIntArray11134),
				(((Class105_Sub1_Sub3_Sub1) this)
				 .anIntArray11134).length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       ((directcolormodel.createCompatibleSampleModel
		 (((Class105_Sub1_Sub3_Sub1) this).anInt11130 * 355401687,
		  ((Class105_Sub1_Sub3_Sub1) this).anInt11129 * 913925995)),
		databufferint, null));
	((Class105_Sub1_Sub3_Sub1) this).anImage11453
	    = new BufferedImage(directcolormodel, writableraster, false,
				new Hashtable());
    }
    
    void method17539(int i) {
	super.method17539(442618141);
	DataBufferInt databufferint
	    = new DataBufferInt((((Class105_Sub1_Sub3_Sub1) this)
				 .anIntArray11134),
				(((Class105_Sub1_Sub3_Sub1) this)
				 .anIntArray11134).length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       ((directcolormodel.createCompatibleSampleModel
		 (((Class105_Sub1_Sub3_Sub1) this).anInt11130 * 355401687,
		  ((Class105_Sub1_Sub3_Sub1) this).anInt11129 * 913925995)),
		databufferint, null));
	((Class105_Sub1_Sub3_Sub1) this).anImage11453
	    = new BufferedImage(directcolormodel, writableraster, false,
				new Hashtable());
    }
    
    public int method15439() {
	return method15435(0, 0);
    }
    
    public final int method15435(int i, int i_0_) {
	Graphics graphics
	    = ((Class105_Sub1_Sub3_Sub1) this).aCanvas11132.getGraphics();
	if (null == graphics)
	    return 0;
	graphics.drawImage(((Class105_Sub1_Sub3_Sub1) this).anImage11453, i,
			   i_0_,
			   ((Class105_Sub1_Sub3_Sub1) this).aCanvas11132);
	return 0;
    }
    
    public void method28() {
	/* empty */
    }
    
    public void method164() {
	/* empty */
    }
    
    public int method15434() {
	return method15435(0, 0);
    }
    
    public void method149() {
	/* empty */
    }
    
    void method17541() {
	super.method17539(-695674098);
	DataBufferInt databufferint
	    = new DataBufferInt((((Class105_Sub1_Sub3_Sub1) this)
				 .anIntArray11134),
				(((Class105_Sub1_Sub3_Sub1) this)
				 .anIntArray11134).length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       ((directcolormodel.createCompatibleSampleModel
		 (((Class105_Sub1_Sub3_Sub1) this).anInt11130 * 355401687,
		  ((Class105_Sub1_Sub3_Sub1) this).anInt11129 * 913925995)),
		databufferint, null));
	((Class105_Sub1_Sub3_Sub1) this).anImage11453
	    = new BufferedImage(directcolormodel, writableraster, false,
				new Hashtable());
    }
    
    Class105_Sub1_Sub3_Sub1(Class103_Sub2 class103_sub2, Canvas canvas, int i,
			    int i_1_) {
	super(class103_sub2, canvas, i, i_1_);
	new Rectangle();
	method17539(-2141256107);
    }
    
    public void method148() {
	/* empty */
    }
    
    public int method15437() {
	return method15435(0, 0);
    }
    
    public final int method15441(int i, int i_2_) {
	Graphics graphics
	    = ((Class105_Sub1_Sub3_Sub1) this).aCanvas11132.getGraphics();
	if (null == graphics)
	    return 0;
	graphics.drawImage(((Class105_Sub1_Sub3_Sub1) this).anImage11453, i,
			   i_2_,
			   ((Class105_Sub1_Sub3_Sub1) this).aCanvas11132);
	return 0;
    }
    
    static final void method17884(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, short i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	if (i_3_ == -1 && i_4_ == -1)
	    class58.aClass58_938 = null;
	else
	    class58.aClass58_938
		= Class218_Sub3.method16576(i_3_, i_4_, (byte) -24);
    }
    
    static final void method17885(boolean bool, int i) {
	Class195.method3998(client.anInt8466 * 1629309841,
			    -1080559003 * Class494.canvasWid,
			    Class67.canvasHei * 963058943, bool, -297591132);
    }
}
