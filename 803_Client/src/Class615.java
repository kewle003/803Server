/* Class615 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class615
{
    int anInt7827;
    JS5 aClass210_7828;
    Class610[] aClass610Array7829;
    static final int anInt7830 = 0;
    
    Class610 method13248(int i, int i_0_) {
	if (-1 == -518990011 * ((Class615) this).anInt7827)
	    return new Class610(false, new Class611[0]);
	Class611 class611
	    = new Class611(((Class615) this).anInt7827 * -518990011, i, i_0_);
	return new Class610(false, new Class611[] { class611 });
    }
    
    Class610 method13249(int i, int i_1_, int i_2_) {
	if (-1 == -518990011 * ((Class615) this).anInt7827)
	    return new Class610(false, new Class611[0]);
	Class611 class611
	    = new Class611(((Class615) this).anInt7827 * -518990011, i, i_1_);
	return new Class610(false, new Class611[] { class611 });
    }
    
    public Class608 method13250(int i, int i_3_) {
	byte[] is
	    = ((Class615) this).aClass210_7828.getfile(i, 0, 903099405);
	Class608 class608 = new Class608();
	class608.method13217(new RSByteBuffer(is), 603295662);
	return class608;
    }
    
    Class610 method13251(int i, int i_4_) {
	if (-1 == -518990011 * ((Class615) this).anInt7827)
	    return new Class610(false, new Class611[0]);
	Class611 class611
	    = new Class611(((Class615) this).anInt7827 * -518990011, i, i_4_);
	return new Class610(false, new Class611[] { class611 });
    }
    
    public boolean method13252(int i) {
	return -518990011 * ((Class615) this).anInt7827 != -1;
    }
    
    public Class615(GameDefinition class471, Language class437, JS5 class210) {
	((Class615) this).aClass210_7828 = class210;
	RSByteBuffer class241_sub3
	    = new RSByteBuffer(((Class615) this).aClass210_7828
				    .getfile(0, 0, 1599196233));
	int i = ((null == class241_sub3.payload
		  || class241_sub3.payload.length < 1)
		 ? -1 : class241_sub3.readUnsignedByte((byte) -30));
	if (i < 4) {
	    ((Class615) this).aClass610Array7829 = new Class610[0];
	    ((Class615) this).anInt7827 = 162585715;
	} else {
	    int i_5_ = class241_sub3.readUnsignedByte((byte) -17);
	    Class331[] class331s = Class234.method4695(2013232343);
	    boolean bool = true;
	    if (class331s.length != i_5_)
		bool = false;
	    else {
		for (int i_6_ = 0; i_6_ < class331s.length; i_6_++) {
		    int i_7_ = class241_sub3.readUnsignedByte((byte) 58);
		    if (i_7_ != class331s[i_6_].anInt5047 * -79513691) {
			bool = false;
			break;
		    }
		}
	    }
	    if (bool) {
		int i_8_ = class241_sub3.readUnsignedByte((byte) -59);
		int i_9_ = class241_sub3.readUnsignedByte((byte) -52);
		int i_10_;
		int i_11_;
		if (i > 2) {
		    ((Class615) this).anInt7827
			= class241_sub3.readShort((byte) 123) * -162585715;
		    i_10_ = class241_sub3.readTriByte(1771646547);
		    i_11_ = class241_sub3.readUnsignedShort(1162222719);
		} else {
		    ((Class615) this).anInt7827 = 162585715;
		    i_10_ = 0;
		    i_11_ = 0;
		}
		((Class615) this).aClass610Array7829 = new Class610[i_9_ + 1];
		for (int i_12_ = 0; i_12_ < i_8_; i_12_++) {
		    int i_13_ = class241_sub3.readUnsignedByte((byte) -44);
		    boolean bool_14_
			= class241_sub3.readUnsignedByte((byte) 18) == 1;
		    int i_15_ = class241_sub3.readUnsignedShort(1162222719);
		    Class611[] class611s;
		    if (-1 == ((Class615) this).anInt7827 * -518990011) {
			class611s = new Class611[i_15_];
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
			    int i_17_ = class241_sub3.readUnsignedShort(1162222719);
			    int i_18_ = class241_sub3.readTriByte(1771646547);
			    int i_19_ = class241_sub3.readUnsignedShort(1162222719);
			    class611s[i_16_]
				= new Class611(i_17_, i_18_, i_19_);
			}
			((Class615) this).aClass610Array7829[i_13_]
			    = new Class610(bool_14_, class611s);
		    } else {
			class611s = new Class611[i_15_ + 1];
			class611s[0]
			    = new Class611((-518990011
					    * ((Class615) this).anInt7827),
					   i_10_, i_11_);
			for (int i_20_ = 0; i_20_ < i_15_; i_20_++) {
			    int i_21_ = class241_sub3.readUnsignedShort(1162222719);
			    int i_22_ = class241_sub3.readTriByte(1771646547);
			    int i_23_ = class241_sub3.readUnsignedShort(1162222719);
			    class611s[i_20_ + 1]
				= new Class611(i_21_, i_22_, i_23_);
			}
		    }
		    ((Class615) this).aClass610Array7829[i_13_]
			= new Class610(bool_14_, class611s);
		}
		for (int i_24_ = 0; i_24_ < i_9_ + 1; i_24_++) {
		    if (null == ((Class615) this).aClass610Array7829[i_24_])
			((Class615) this).aClass610Array7829[i_24_]
			    = method13249(i_10_, i_11_, -345468422);
		}
	    } else {
		((Class615) this).aClass610Array7829 = new Class610[0];
		((Class615) this).anInt7827 = 162585715;
	    }
	}
    }
    
    Class610 method13253(int i, int i_25_) {
	if (-1 == -518990011 * ((Class615) this).anInt7827)
	    return new Class610(false, new Class611[0]);
	Class611 class611
	    = new Class611(((Class615) this).anInt7827 * -518990011, i, i_25_);
	return new Class610(false, new Class611[] { class611 });
    }
    
    public boolean method13254() {
	return -518990011 * ((Class615) this).anInt7827 != -1;
    }
    
    public Class608 method13255(int i) {
	byte[] is
	    = ((Class615) this).aClass210_7828.getfile(i, 0, 393031974);
	Class608 class608 = new Class608();
	class608.method13217(new RSByteBuffer(is), 1073777206);
	return class608;
    }
    
    public Class611[] method13256(int i, byte i_26_) {
	if (i < 0 || i >= ((Class615) this).aClass610Array7829.length)
	    return (((Class610) method13249(0, 0, 818306296))
		    .aClass611Array7760);
	Class610 class610 = ((Class615) this).aClass610Array7829[i];
	if (!((Class610) class610).aBool7761
	    || ((Class610) class610).aClass611Array7760.length <= 1)
	    return ((Class610) class610).aClass611Array7760;
	int i_27_ = -518990011 * ((Class615) this).anInt7827 == -1 ? 0 : 1;
	Random random = new Random();
	Class611[] class611s
	    = new Class611[((Class610) class610).aClass611Array7760.length];
	System.arraycopy(((Class610) class610).aClass611Array7760, 0,
			 class611s, 0, class611s.length);
	for (int i_28_ = i_27_; i_28_ < class611s.length; i_28_++) {
	    int i_29_ = (Class194.method3997(random, class611s.length - i_27_,
					     (byte) -12)
			 + i_27_);
	    Class611 class611
		= ((Class610) class610).aClass611Array7760[i_28_];
	    class611s[i_28_] = class611s[i_29_];
	    class611s[i_29_] = class611;
	}
	return class611s;
    }
    
    public boolean method13257() {
	return -518990011 * ((Class615) this).anInt7827 != -1;
    }
    
    public Class611[] method13258(int i) {
	if (i < 0 || i >= ((Class615) this).aClass610Array7829.length)
	    return (((Class610) method13249(0, 0, 946116878))
		    .aClass611Array7760);
	Class610 class610 = ((Class615) this).aClass610Array7829[i];
	if (!((Class610) class610).aBool7761
	    || ((Class610) class610).aClass611Array7760.length <= 1)
	    return ((Class610) class610).aClass611Array7760;
	int i_30_ = -518990011 * ((Class615) this).anInt7827 == -1 ? 0 : 1;
	Random random = new Random();
	Class611[] class611s
	    = new Class611[((Class610) class610).aClass611Array7760.length];
	System.arraycopy(((Class610) class610).aClass611Array7760, 0,
			 class611s, 0, class611s.length);
	for (int i_31_ = i_30_; i_31_ < class611s.length; i_31_++) {
	    int i_32_ = (Class194.method3997(random, class611s.length - i_30_,
					     (byte) -4)
			 + i_30_);
	    Class611 class611
		= ((Class610) class610).aClass611Array7760[i_31_];
	    class611s[i_31_] = class611s[i_32_];
	    class611s[i_32_] = class611;
	}
	return class611s;
    }
    
    public boolean method13259() {
	return -518990011 * ((Class615) this).anInt7827 != -1;
    }
    
    public static void method13260(Class247 class247, Class247 class247_33_,
				   int i) {
	if (class247.aClass247_3971 != null)
	    class247.method4944((byte) 84);
	class247.aClass247_3971 = class247_33_;
	class247.aClass247_3972 = class247_33_.aClass247_3972;
	class247.aClass247_3971.aClass247_3972 = class247;
	class247.aClass247_3972.aClass247_3971 = class247;
    }
}
