/* Class263_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class263_Sub2 extends Class263 implements Interface38
{
    int anInt10378;
    int anInt10379;
    int anInt10380;
    
    public void method27() {
	super.method28();
    }
    
    long method5103() {
	return ((Class263_Sub2) this).aLong4322;
    }
    
    public void method178() {
	((Class263_Sub2) this).aClass103_Sub3_Sub1_4319.method17490(this);
    }
    
    public void method176(Class312 class312) {
	super.method176(class312);
    }
    
    public void method28() {
	super.method28();
    }
    
    long method5099() {
	return ((Class263_Sub2) this).aLong4322;
    }
    
    long method5105() {
	return ((Class263_Sub2) this).aLong4322;
    }
    
    public void method177() {
	((Class263_Sub2) this).aClass103_Sub3_Sub1_4319.method17490(this);
    }
    
    public void method180() {
	((Class263_Sub2) this).aClass103_Sub3_Sub1_4319.method17490(this);
    }
    
    public void method175() {
	((Class263_Sub2) this).aClass103_Sub3_Sub1_4319.method17490(this);
    }
    
    public void method179(Class312 class312) {
	super.method176(class312);
    }
    
    public void method29() {
	super.method28();
    }
    
    Class263_Sub2(Class103_Sub3_Sub1 class103_sub3_sub1, Class175 class175,
		  int i, int i_0_, int i_1_, boolean bool, byte[] is) {
	super(class103_sub3_sub1, class175, Class102.aClass102_1440, false,
	      i * i_0_ * i_1_);
	((Class263_Sub2) this).anInt10378 = i;
	((Class263_Sub2) this).anInt10379 = i_0_;
	((Class263_Sub2) this).anInt10380 = i_1_;
	((Class263_Sub2) this).aLong4322
	    = (IDirect3DDevice.CreateVolumeTexture
	       (((Class103_Sub3_Sub1)
		 ((Class263_Sub2) this).aClass103_Sub3_Sub1_4319).aLong11097,
		i, i_0_, i_1_, 1, 0,
		Class103_Sub3_Sub1.method17486(class175,
					       (((Class263_Sub2) this)
						.aClass102_4318)),
		1));
	ByteBuffer bytebuffer
	    = ((Class263_Sub2) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	bytebuffer.clear();
	bytebuffer.put(is);
	IDirect3DVolumeTexture.Upload(((Class263_Sub2) this).aLong4322, 0, 0,
				      0, 0, ((Class263_Sub2) this).anInt10378,
				      ((Class263_Sub2) this).anInt10379,
				      ((Class263_Sub2) this).anInt10380,
				      (((Class263_Sub2) this).anInt10378
				       * (class175.anInt2121 * 1893442799)),
				      0,
				      (((Class263_Sub2) this)
				       .aClass103_Sub3_Sub1_4319.aLong9491));
    }
    
    public void method181(Class312 class312) {
	super.method176(class312);
    }
}
