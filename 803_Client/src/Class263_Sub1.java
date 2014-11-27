/* Class263_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

public class Class263_Sub1 extends Class263 implements Interface30
{
    int anInt10289;
    
    public void method178() {
	((Class263_Sub1) this).aClass103_Sub3_Sub1_4319.method17458(this);
    }
    
    public void method28() {
	super.method28();
    }
    
    public void method27() {
	super.method28();
    }
    
    public void method176(Class312 class312) {
	super.method176(class312);
    }
    
    public void method180() {
	((Class263_Sub1) this).aClass103_Sub3_Sub1_4319.method17458(this);
    }
    
    public void method29() {
	super.method28();
    }
    
    public void method177() {
	((Class263_Sub1) this).aClass103_Sub3_Sub1_4319.method17458(this);
    }
    
    public void method175() {
	((Class263_Sub1) this).aClass103_Sub3_Sub1_4319.method17458(this);
    }
    
    Class263_Sub1(Class103_Sub3_Sub1 class103_sub3_sub1, int i, boolean bool,
		  int[][] is) {
	super(class103_sub3_sub1, Class175.aClass175_2110,
	      Class102.aClass102_1440,
	      bool && ((Class103_Sub3_Sub1) class103_sub3_sub1).aBool11102,
	      i * i * 6);
	((Class263_Sub1) this).anInt10289 = i;
	if (((Class263_Sub1) this).aBool4320)
	    ((Class263_Sub1) this).aLong4322
		= (IDirect3DDevice.CreateCubeTexture
		   ((((Class103_Sub3_Sub1)
		      ((Class263_Sub1) this).aClass103_Sub3_Sub1_4319)
		     .aLong11097),
		    ((Class263_Sub1) this).anInt10289, 0, 1024, 21, 1));
	else
	    ((Class263_Sub1) this).aLong4322
		= (IDirect3DDevice.CreateCubeTexture
		   ((((Class103_Sub3_Sub1)
		      ((Class263_Sub1) this).aClass103_Sub3_Sub1_4319)
		     .aLong11097),
		    ((Class263_Sub1) this).anInt10289, 1, 0, 21, 1));
	ByteBuffer bytebuffer
	    = ((Class263_Sub1) this).aClass103_Sub3_Sub1_4319.aByteBuffer9490;
	for (int i_0_ = 0; i_0_ < 6; i_0_++) {
	    bytebuffer.clear();
	    bytebuffer.asIntBuffer().put(is[i_0_]);
	    IDirect3DCubeTexture.Upload(((Class263_Sub1) this).aLong4322, i_0_,
					0, 0, 0,
					((Class263_Sub1) this).anInt10289,
					((Class263_Sub1) this).anInt10289,
					((Class263_Sub1) this).anInt10289 * 4,
					0,
					(((Class263_Sub1) this)
					 .aClass103_Sub3_Sub1_4319.aLong9491));
	}
    }
    
    public void method179(Class312 class312) {
	super.method176(class312);
    }
    
    public void method181(Class312 class312) {
	super.method176(class312);
    }
}
