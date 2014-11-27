/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class216
{
    public static Class216 VIRTUAL_MAPS;//aClass216_2524
    public static Class216 aClass216_2525;
    static Class216 aClass216_2526;
    public static Class216 aClass216_2527;
    public static Class216 aClass216_2528;
    public static Class216 PHYSICAL_NODES = new Class216(0);//aClass216_2529
    static Class216 aClass216_2530;
    static Class216 aClass216_2531;
    static Class216 aClass216_2532;
    public int anInt2533;
    
    Class216(int i) {
    	anInt2533 = i * 717110433;
    }
    
    static {
		aClass216_2527 = new Class216(1);
		aClass216_2525 = new Class216(2);
		VIRTUAL_MAPS = new Class216(3);
		aClass216_2528 = new Class216(4);
		aClass216_2526 = new Class216(5);
		aClass216_2530 = new Class216(6);
		aClass216_2531 = new Class216(7);
		aClass216_2532 = new Class216(8);
    }
    
    static final void method4346(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class16.anInt148 * 1327183635;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class16.anInt149 * -1887420811;
    }
    
    static final void method4347(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1124115145 * client.myPlayerIndex;
    }
    
    static final void method4348(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865
		  .method14150(1689254449);
    }
    
    public static void method4349(RSByteBuffer class241_sub3, int i,
				  byte i_0_) {
	Class241_Sub1 class241_sub1 = new Class241_Sub1();
	((Class241_Sub1) class241_sub1).anInt8681
	    = class241_sub3.readUnsignedByte((byte) -16) * -340061311;
	((Class241_Sub1) class241_sub1).anInt8680
	    = class241_sub3.readInt((byte) 77) * 1425124491;
	((Class241_Sub1) class241_sub1).anIntArray8682
	    = new int[((Class241_Sub1) class241_sub1).anInt8681 * 1809919105];
	((Class241_Sub1) class241_sub1).anIntArray8683
	    = new int[1809919105 * ((Class241_Sub1) class241_sub1).anInt8681];
	((Class241_Sub1) class241_sub1).aFieldArray8684
	    = (new Field
	       [1809919105 * ((Class241_Sub1) class241_sub1).anInt8681]);
	((Class241_Sub1) class241_sub1).anIntArray8685
	    = new int[1809919105 * ((Class241_Sub1) class241_sub1).anInt8681];
	((Class241_Sub1) class241_sub1).aMethodArray8686
	    = (new Method
	       [((Class241_Sub1) class241_sub1).anInt8681 * 1809919105]);
	((Class241_Sub1) class241_sub1).aByteArrayArrayArray8687
	    = (new byte[((Class241_Sub1) class241_sub1).anInt8681 * 1809919105]
	       [][]);
	for (int i_1_ = 0;
	     i_1_ < 1809919105 * ((Class241_Sub1) class241_sub1).anInt8681;
	     i_1_++) {
	    try {
		int i_2_ = class241_sub3.readUnsignedByte((byte) -64);
		if (i_2_ == 0 || i_2_ == 1 || i_2_ == 2) {
		    String string = class241_sub3.readString(332799043);
		    String string_3_ = class241_sub3.readString(-1028353494);
		    int i_4_ = 0;
		    if (1 == i_2_)
			i_4_ = class241_sub3.readInt((byte) 26);
		    ((Class241_Sub1) class241_sub1).anIntArray8682[i_1_]
			= i_2_;
		    ((Class241_Sub1) class241_sub1).anIntArray8685[i_1_]
			= i_4_;
		    if (Class345.method6175(string, -614238519)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    ((Class241_Sub1) class241_sub1).aFieldArray8684[i_1_]
			= Class345.method6175(string, -538743585)
			      .getDeclaredField(string_3_);
		} else if (3 == i_2_ || 4 == i_2_) {
		    String string = class241_sub3.readString(-716465789);
		    String string_5_ = class241_sub3.readString(430766082);
		    int i_6_ = class241_sub3.readUnsignedByte((byte) -41);
		    String[] strings = new String[i_6_];
		    for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
			strings[i_7_] = class241_sub3.readString(-1956480260);
		    String string_8_ = class241_sub3.readString(-1766094920);
		    byte[][] is = new byte[i_6_][];
		    if (3 == i_2_) {
			for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
			    int i_10_ = class241_sub3.readInt((byte) 70);
			    is[i_9_] = new byte[i_10_];
			    class241_sub3.readBytes(is[i_9_], 0, i_10_,
						      (byte) -5);
			}
		    }
		    ((Class241_Sub1) class241_sub1).anIntArray8682[i_1_]
			= i_2_;
		    Class[] var_classes = new Class[i_6_];
		    for (int i_11_ = 0; i_11_ < i_6_; i_11_++)
			var_classes[i_11_]
			    = Class345.method6175(strings[i_11_], 2074488953);
		    Class var_class
			= Class345.method6175(string_8_, 1720499017);
		    if (Class345.method6175(string, -984733861)
			    .getClassLoader() == null)
			throw new SecurityException();
		    Method[] methods = Class345.method6175
					   (string, 1634546067)
					   .getDeclaredMethods();
		    Method[] methods_12_ = methods;
		    for (int i_13_ = 0; i_13_ < methods_12_.length; i_13_++) {
			Method method = methods_12_[i_13_];
			if (method.getName().equals(string_5_)) {
			    Class[] var_classes_14_
				= method.getParameterTypes();
			    if (var_classes_14_.length == var_classes.length) {
				boolean bool = true;
				for (int i_15_ = 0; i_15_ < var_classes.length;
				     i_15_++) {
				    if (var_classes[i_15_]
					!= var_classes_14_[i_15_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    ((Class241_Sub1) class241_sub1)
					.aMethodArray8686[i_1_]
					= method;
			    }
			}
		    }
		    ((Class241_Sub1) class241_sub1)
			.aByteArrayArrayArray8687[i_1_]
			= is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_1_] = -1;
	    } catch (SecurityException securityexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_1_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_1_] = -3;
	    } catch (Exception exception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_1_] = -4;
	    } catch (Throwable throwable) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_1_] = -5;
	    }
	}
	Class622.aClass429_7878.addNode(class241_sub1, (short) -1206);
    }
    
    static final void method4350(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	int i_16_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_17_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	int i_18_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	int i_19_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 3]);
	i_16_ += i_17_ << 14;
	i_16_ += i_18_ << 28;
	i_16_ += i_19_;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_16_;
    }
}
