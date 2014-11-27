/* Class105_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class105_Sub1_Sub1_Sub1 extends Class105_Sub1_Sub1
{
    OpenGL anOpenGL11237;
    Canvas aCanvas11238;
    long aLong11239;
    int anInt11240;
    int anInt11241;
    
    boolean method162() {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 == 0L)
	    throw new IllegalStateException("");
	return (((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
		    .setSurface(((Class105_Sub1_Sub1_Sub1) this).aLong11239)
		&& super.method162());
    }
    
    Class105_Sub1_Sub1_Sub1(Class103_Sub3_Sub2 class103_sub3_sub2,
			    Canvas canvas, long l) {
	super(class103_sub3_sub2);
	((Class105_Sub1_Sub1_Sub1) this).aCanvas11238 = canvas;
	((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
	    = ((Class103_Sub3_Sub2) class103_sub3_sub2).anOpenGL11138;
	((Class105_Sub1_Sub1_Sub1) this).aLong11239 = l;
	method17633();
    }
    
    public void method148() {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 != 0L) {
	    ((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237.releaseSurface
		(((Class105_Sub1_Sub1_Sub1) this).aCanvas11238,
		 ((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	    ((Class105_Sub1_Sub1_Sub1) this).aLong11239 = 0L;
	}
    }
    
    public int method2654() {
	return ((Class105_Sub1_Sub1_Sub1) this).anInt11241;
    }
    
    void method15436(int i, int i_0_) {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 == 0L)
	    throw new IllegalStateException("");
	((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
	    .surfaceResized(((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	method17633();
	super.method15436(i, i_0_);
    }
    
    public void method28() {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 != 0L) {
	    ((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237.releaseSurface
		(((Class105_Sub1_Sub1_Sub1) this).aCanvas11238,
		 ((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	    ((Class105_Sub1_Sub1_Sub1) this).aLong11239 = 0L;
	}
    }
    
    public int method15434() {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 == 0L)
	    throw new IllegalStateException("");
	((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
	    .swapBuffers(((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	return 0;
    }
    
    public int method15435(int i, int i_1_) {
	return 0;
    }
    
    void method15438(int i, int i_2_) {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 == 0L)
	    throw new IllegalStateException("");
	((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
	    .surfaceResized(((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	method17633();
	super.method15436(i, i_2_);
    }
    
    boolean method2659() {
	return true;
    }
    
    void method17633() {
	Dimension dimension
	    = ((Class105_Sub1_Sub1_Sub1) this).aCanvas11238.getSize();
	((Class105_Sub1_Sub1_Sub1) this).anInt11241 = dimension.height;
	((Class105_Sub1_Sub1_Sub1) this).anInt11240 = dimension.width;
    }
    
    public int method2655() {
	return ((Class105_Sub1_Sub1_Sub1) this).anInt11240;
    }
    
    public int method2653() {
	return ((Class105_Sub1_Sub1_Sub1) this).anInt11240;
    }
    
    public int method2656() {
	return ((Class105_Sub1_Sub1_Sub1) this).anInt11240;
    }
    
    boolean method115() {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 == 0L)
	    throw new IllegalStateException("");
	return (((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
		    .setSurface(((Class105_Sub1_Sub1_Sub1) this).aLong11239)
		&& super.method162());
    }
    
    boolean method114() {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 == 0L)
	    throw new IllegalStateException("");
	return (((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
		    .setSurface(((Class105_Sub1_Sub1_Sub1) this).aLong11239)
		&& super.method162());
    }
    
    boolean method2658() {
	return true;
    }
    
    public void method164() {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 != 0L) {
	    ((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237.releaseSurface
		(((Class105_Sub1_Sub1_Sub1) this).aCanvas11238,
		 ((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	    ((Class105_Sub1_Sub1_Sub1) this).aLong11239 = 0L;
	}
    }
    
    public int method2657() {
	return ((Class105_Sub1_Sub1_Sub1) this).anInt11240;
    }
    
    public void method149() {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 != 0L) {
	    ((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237.releaseSurface
		(((Class105_Sub1_Sub1_Sub1) this).aCanvas11238,
		 ((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	    ((Class105_Sub1_Sub1_Sub1) this).aLong11239 = 0L;
	}
    }
    
    void method15440(int i, int i_3_) {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 == 0L)
	    throw new IllegalStateException("");
	((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
	    .surfaceResized(((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	method17633();
	super.method15436(i, i_3_);
    }
    
    Class105_Sub1_Sub1_Sub1(Class103_Sub3_Sub2 class103_sub3_sub2,
			    Canvas canvas) {
	this(class103_sub3_sub2, canvas,
	     ((Class103_Sub3_Sub2) class103_sub3_sub2).anOpenGL11138
		 .prepareSurface(canvas));
    }
    
    void method15433(int i, int i_4_) {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 == 0L)
	    throw new IllegalStateException("");
	((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
	    .surfaceResized(((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	method17633();
	super.method15436(i, i_4_);
    }
    
    public int method2660() {
	return ((Class105_Sub1_Sub1_Sub1) this).anInt11241;
    }
    
    public int method15439() {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 == 0L)
	    throw new IllegalStateException("");
	((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
	    .swapBuffers(((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	return 0;
    }
    
    public int method15437() {
	if (((Class105_Sub1_Sub1_Sub1) this).aLong11239 == 0L)
	    throw new IllegalStateException("");
	((Class105_Sub1_Sub1_Sub1) this).anOpenGL11237
	    .swapBuffers(((Class105_Sub1_Sub1_Sub1) this).aLong11239);
	return 0;
    }
    
    public int method15441(int i, int i_5_) {
	return 0;
    }
    
    void method17634() {
	Dimension dimension
	    = ((Class105_Sub1_Sub1_Sub1) this).aCanvas11238.getSize();
	((Class105_Sub1_Sub1_Sub1) this).anInt11241 = dimension.height;
	((Class105_Sub1_Sub1_Sub1) this).anInt11240 = dimension.width;
    }
    
    void method17635() {
	Dimension dimension
	    = ((Class105_Sub1_Sub1_Sub1) this).aCanvas11238.getSize();
	((Class105_Sub1_Sub1_Sub1) this).anInt11241 = dimension.height;
	((Class105_Sub1_Sub1_Sub1) this).anInt11240 = dimension.width;
    }
}
