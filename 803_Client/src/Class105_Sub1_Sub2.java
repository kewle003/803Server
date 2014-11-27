/* Class105_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class105_Sub1_Sub2 extends Class105_Sub1
{
    OpenGL anOpenGL11117;
    Canvas aCanvas11118;
    int anInt11119;
    long aLong11120;
    Class103_Sub1 aClass103_Sub1_11121;
    int anInt11122;
    boolean aBool11123 = false;
    
    Class105_Sub1_Sub2(Class103_Sub1 class103_sub1, Canvas canvas, long l) {
	((Class105_Sub1_Sub2) this).aClass103_Sub1_11121 = class103_sub1;
	((Class105_Sub1_Sub2) this).aCanvas11118 = canvas;
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    = ((Class103_Sub1) class103_sub1).anOpenGL9078;
	((Class105_Sub1_Sub2) this).aLong11120 = l;
	method17535();
    }
    
    public int method15434() {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    .swapBuffers(((Class105_Sub1_Sub2) this).aLong11120);
	return 0;
    }
    
    void method15440(int i, int i_0_) {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    .surfaceResized(((Class105_Sub1_Sub2) this).aLong11120);
	method17535();
	if (this == ((Class105_Sub1_Sub2) this).aClass103_Sub1_11121
			.method2237((byte) 4))
	    ((Class105_Sub1_Sub2) this).aClass103_Sub1_11121.method15133();
    }
    
    public int method2654() {
	return ((Class105_Sub1_Sub2) this).anInt11122;
    }
    
    public int method2660() {
	return ((Class105_Sub1_Sub2) this).anInt11122;
    }
    
    void method17535() {
	Dimension dimension
	    = ((Class105_Sub1_Sub2) this).aCanvas11118.getSize();
	((Class105_Sub1_Sub2) this).anInt11122 = dimension.height;
	((Class105_Sub1_Sub2) this).anInt11119 = dimension.width;
    }
    
    void method15436(int i, int i_1_) {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    .surfaceResized(((Class105_Sub1_Sub2) this).aLong11120);
	method17535();
	if (this == ((Class105_Sub1_Sub2) this).aClass103_Sub1_11121
			.method2237((byte) 4))
	    ((Class105_Sub1_Sub2) this).aClass103_Sub1_11121.method15133();
    }
    
    public int method15441(int i, int i_2_) {
	return 0;
    }
    
    boolean method162() {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    .setSurface(((Class105_Sub1_Sub2) this).aLong11120);
	((Class105_Sub1_Sub2) this).aClass103_Sub1_11121.method15156();
	return true;
    }
    
    boolean method2659() {
	return true;
    }
    
    public void method28() {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117.releaseSurface
	    (((Class105_Sub1_Sub2) this).aCanvas11118,
	     ((Class105_Sub1_Sub2) this).aLong11120);
	((Class105_Sub1_Sub2) this).aBool11123 = true;
    }
    
    public int method2656() {
	return ((Class105_Sub1_Sub2) this).anInt11119;
    }
    
    public int method2653() {
	return ((Class105_Sub1_Sub2) this).anInt11119;
    }
    
    public void method164() {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117.releaseSurface
	    (((Class105_Sub1_Sub2) this).aCanvas11118,
	     ((Class105_Sub1_Sub2) this).aLong11120);
	((Class105_Sub1_Sub2) this).aBool11123 = true;
    }
    
    boolean method115() {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    .setSurface(((Class105_Sub1_Sub2) this).aLong11120);
	((Class105_Sub1_Sub2) this).aClass103_Sub1_11121.method15156();
	return true;
    }
    
    Class105_Sub1_Sub2(Class103_Sub1 class103_sub1, Canvas canvas) {
	this(class103_sub1, canvas, ((Class103_Sub1) class103_sub1)
					.anOpenGL9078.prepareSurface(canvas));
    }
    
    boolean method2658() {
	return true;
    }
    
    public int method2657() {
	return ((Class105_Sub1_Sub2) this).anInt11119;
    }
    
    public void method148() {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117.releaseSurface
	    (((Class105_Sub1_Sub2) this).aCanvas11118,
	     ((Class105_Sub1_Sub2) this).aLong11120);
	((Class105_Sub1_Sub2) this).aBool11123 = true;
    }
    
    public void method149() {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117.releaseSurface
	    (((Class105_Sub1_Sub2) this).aCanvas11118,
	     ((Class105_Sub1_Sub2) this).aLong11120);
	((Class105_Sub1_Sub2) this).aBool11123 = true;
    }
    
    public int method15435(int i, int i_3_) {
	return 0;
    }
    
    void method15438(int i, int i_4_) {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    .surfaceResized(((Class105_Sub1_Sub2) this).aLong11120);
	method17535();
	if (this == ((Class105_Sub1_Sub2) this).aClass103_Sub1_11121
			.method2237((byte) 4))
	    ((Class105_Sub1_Sub2) this).aClass103_Sub1_11121.method15133();
    }
    
    void method15433(int i, int i_5_) {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    .surfaceResized(((Class105_Sub1_Sub2) this).aLong11120);
	method17535();
	if (this == ((Class105_Sub1_Sub2) this).aClass103_Sub1_11121
			.method2237((byte) 4))
	    ((Class105_Sub1_Sub2) this).aClass103_Sub1_11121.method15133();
    }
    
    public int method2655() {
	return ((Class105_Sub1_Sub2) this).anInt11119;
    }
    
    public int method15439() {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    .swapBuffers(((Class105_Sub1_Sub2) this).aLong11120);
	return 0;
    }
    
    boolean method114() {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    .setSurface(((Class105_Sub1_Sub2) this).aLong11120);
	((Class105_Sub1_Sub2) this).aClass103_Sub1_11121.method15156();
	return true;
    }
    
    public int method15437() {
	if (((Class105_Sub1_Sub2) this).aBool11123)
	    throw new IllegalStateException();
	((Class105_Sub1_Sub2) this).anOpenGL11117
	    .swapBuffers(((Class105_Sub1_Sub2) this).aLong11120);
	return 0;
    }
    
    void method17536() {
	Dimension dimension
	    = ((Class105_Sub1_Sub2) this).aCanvas11118.getSize();
	((Class105_Sub1_Sub2) this).anInt11122 = dimension.height;
	((Class105_Sub1_Sub2) this).anInt11119 = dimension.width;
    }
}
