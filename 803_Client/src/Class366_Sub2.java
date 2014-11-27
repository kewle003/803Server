/* Class366_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class366_Sub2 extends Class366
{
    long aLong10374 = 0L;
    Class103_Sub3_Sub1 aClass103_Sub3_Sub1_10375;
    
    void method16668() {
	if (((Class366_Sub2) this).aLong10374 != 0L) {
	    ((Class366_Sub2) this).aClass103_Sub3_Sub1_10375
		.method17463(((Class366_Sub2) this).aLong10374);
	    ((Class366_Sub2) this).aLong10374 = 0L;
	}
    }
    
    void method16669(ByteBuffer bytebuffer, short i, short i_0_, byte i_1_,
		     byte i_2_, byte i_3_, byte i_4_) {
	bytebuffer.putShort(i);
	bytebuffer.putShort(i_0_);
	bytebuffer.put(i_1_);
	bytebuffer.put(i_2_);
	bytebuffer.put(i_3_);
	bytebuffer.put(i_4_);
    }
    
    public void method28() {
	if (((Class366_Sub2) this).aLong10374 != 0L) {
	    IUnknown.Release(((Class366_Sub2) this).aLong10374);
	    ((Class366_Sub2) this).aLong10374 = 0L;
	}
	((Class366_Sub2) this).aClass103_Sub3_Sub1_10375.method15617(this);
    }
    
    void method16670() {
	if (((Class366_Sub2) this).aLong10374 != 0L) {
	    ((Class366_Sub2) this).aClass103_Sub3_Sub1_10375
		.method17463(((Class366_Sub2) this).aLong10374);
	    ((Class366_Sub2) this).aLong10374 = 0L;
	}
    }
    
    public void finalize() {
	method16670();
    }
    
    public void method27() {
	if (((Class366_Sub2) this).aLong10374 != 0L) {
	    IUnknown.Release(((Class366_Sub2) this).aLong10374);
	    ((Class366_Sub2) this).aLong10374 = 0L;
	}
	((Class366_Sub2) this).aClass103_Sub3_Sub1_10375.method15617(this);
    }
    
    public void method29() {
	if (((Class366_Sub2) this).aLong10374 != 0L) {
	    IUnknown.Release(((Class366_Sub2) this).aLong10374);
	    ((Class366_Sub2) this).aLong10374 = 0L;
	}
	((Class366_Sub2) this).aClass103_Sub3_Sub1_10375.method15617(this);
    }
    
    void method16671() {
	method16670();
    }
    
    void method16672() {
	method16670();
    }
    
    void method16673() {
	if (((Class366_Sub2) this).aLong10374 != 0L) {
	    ((Class366_Sub2) this).aClass103_Sub3_Sub1_10375
		.method17463(((Class366_Sub2) this).aLong10374);
	    ((Class366_Sub2) this).aLong10374 = 0L;
	}
    }
    
    void method16674() {
	method16670();
    }
    
    Class366_Sub2(Class103_Sub3_Sub1 class103_sub3_sub1,
		  Class314[] class314s) {
	super(class314s);
	((Class366_Sub2) this).aClass103_Sub3_Sub1_10375 = class103_sub3_sub1;
	byte i = 0;
	ByteBuffer bytebuffer
	    = ((Class366_Sub2) this).aClass103_Sub3_Sub1_10375.aByteBuffer9490;
	bytebuffer.clear();
	for (short i_5_ = 0; i_5_ < aClass314Array5544.length; i_5_++) {
	    short i_6_ = 0;
	    Class314 class314 = aClass314Array5544[i_5_];
	    for (int i_7_ = 0; i_7_ < class314.method5888(); i_7_++) {
		Class367 class367 = class314.method5890(i_7_);
		if (class367 == Class367.aClass367_5545)
		    method16669(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0,
				(byte) 0, (byte) 0);
		else if (class367 == Class367.aClass367_5548)
		    method16669(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0,
				(byte) 3, (byte) 0);
		else if (class367 == Class367.aClass367_5547)
		    method16669(bytebuffer, i_5_, i_6_, (byte) 4, (byte) 0,
				(byte) 10, (byte) 0);
		else if (class367 == Class367.aClass367_5559) {
		    Class366_Sub2 class366_sub2_8_ = this;
		    ByteBuffer bytebuffer_9_ = bytebuffer;
		    short i_10_ = i_5_;
		    short i_11_ = i_6_;
		    byte i_12_ = 0;
		    byte i_13_ = 0;
		    byte i_14_ = 5;
		    byte i_15_ = i;
		    i++;
		    class366_sub2_8_.method16669(bytebuffer_9_, i_10_, i_11_,
						 i_12_, i_13_, i_14_, i_15_);
		} else if (class367 == Class367.aClass367_5549) {
		    Class366_Sub2 class366_sub2_16_ = this;
		    ByteBuffer bytebuffer_17_ = bytebuffer;
		    short i_18_ = i_5_;
		    short i_19_ = i_6_;
		    byte i_20_ = 1;
		    byte i_21_ = 0;
		    byte i_22_ = 5;
		    byte i_23_ = i;
		    i++;
		    class366_sub2_16_.method16669(bytebuffer_17_, i_18_, i_19_,
						  i_20_, i_21_, i_22_, i_23_);
		} else if (class367 == Class367.aClass367_5555) {
		    Class366_Sub2 class366_sub2_24_ = this;
		    ByteBuffer bytebuffer_25_ = bytebuffer;
		    short i_26_ = i_5_;
		    short i_27_ = i_6_;
		    byte i_28_ = 2;
		    byte i_29_ = 0;
		    byte i_30_ = 5;
		    byte i_31_ = i;
		    i++;
		    class366_sub2_24_.method16669(bytebuffer_25_, i_26_, i_27_,
						  i_28_, i_29_, i_30_, i_31_);
		} else if (class367 == Class367.aClass367_5551) {
		    Class366_Sub2 class366_sub2_32_ = this;
		    ByteBuffer bytebuffer_33_ = bytebuffer;
		    short i_34_ = i_5_;
		    short i_35_ = i_6_;
		    byte i_36_ = 3;
		    byte i_37_ = 0;
		    byte i_38_ = 5;
		    byte i_39_ = i;
		    i++;
		    class366_sub2_32_.method16669(bytebuffer_33_, i_34_, i_35_,
						  i_36_, i_37_, i_38_, i_39_);
		}
		i_6_ += class367.anInt5561;
	    }
	}
	method16669(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0,
		    (byte) 0, (byte) 0);
	((Class366_Sub2) this).aLong10374
	    = (IDirect3DDevice.CreateVertexDeclaration
	       (((Class103_Sub3_Sub1)
		 ((Class366_Sub2) this).aClass103_Sub3_Sub1_10375).aLong11097,
		((Class366_Sub2) this).aClass103_Sub3_Sub1_10375.aLong9491));
	((Class366_Sub2) this).aClass103_Sub3_Sub1_10375.method16005(this);
    }
    
    void method16675() {
	if (((Class366_Sub2) this).aLong10374 != 0L) {
	    ((Class366_Sub2) this).aClass103_Sub3_Sub1_10375
		.method17463(((Class366_Sub2) this).aLong10374);
	    ((Class366_Sub2) this).aLong10374 = 0L;
	}
    }
    
    void method16676() {
	method16670();
    }
}
