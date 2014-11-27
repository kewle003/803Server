/* Class622 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class622
{
    static NodeCollection aClass429_7878 = new NodeCollection();
    
    static Class method13346(String string) throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    public static void method13347(RSByteBuffer class241_sub3, int i) {
	Class241_Sub1 class241_sub1 = new Class241_Sub1();
	((Class241_Sub1) class241_sub1).anInt8681
	    = class241_sub3.readUnsignedByte((byte) -21) * -340061311;
	((Class241_Sub1) class241_sub1).anInt8680
	    = class241_sub3.readInt((byte) 53) * 1425124491;
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
	for (int i_0_ = 0;
	     i_0_ < 1809919105 * ((Class241_Sub1) class241_sub1).anInt8681;
	     i_0_++) {
	    try {
		int i_1_ = class241_sub3.readUnsignedByte((byte) -8);
		if (i_1_ == 0 || i_1_ == 1 || i_1_ == 2) {
		    String string = class241_sub3.readString(1508524403);
		    String string_2_ = class241_sub3.readString(-396571312);
		    int i_3_ = 0;
		    if (1 == i_1_)
			i_3_ = class241_sub3.readInt((byte) 62);
		    ((Class241_Sub1) class241_sub1).anIntArray8682[i_0_]
			= i_1_;
		    ((Class241_Sub1) class241_sub1).anIntArray8685[i_0_]
			= i_3_;
		    if (Class345.method6175(string, 1983149156)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    ((Class241_Sub1) class241_sub1).aFieldArray8684[i_0_]
			= Class345.method6175(string, -325195419)
			      .getDeclaredField(string_2_);
		} else if (3 == i_1_ || 4 == i_1_) {
		    String string = class241_sub3.readString(-1941664973);
		    String string_4_ = class241_sub3.readString(1118259664);
		    int i_5_ = class241_sub3.readUnsignedByte((byte) 75);
		    String[] strings = new String[i_5_];
		    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
			strings[i_6_] = class241_sub3.readString(-1194815667);
		    String string_7_ = class241_sub3.readString(769958205);
		    byte[][] is = new byte[i_5_][];
		    if (3 == i_1_) {
			for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
			    int i_9_ = class241_sub3.readInt((byte) 118);
			    is[i_8_] = new byte[i_9_];
			    class241_sub3.readBytes(is[i_8_], 0, i_9_,
						      (byte) 22);
			}
		    }
		    ((Class241_Sub1) class241_sub1).anIntArray8682[i_0_]
			= i_1_;
		    Class[] var_classes = new Class[i_5_];
		    for (int i_10_ = 0; i_10_ < i_5_; i_10_++)
			var_classes[i_10_]
			    = Class345.method6175(strings[i_10_], -968739785);
		    Class var_class
			= Class345.method6175(string_7_, 526539639);
		    if (Class345.method6175(string, 311047296).getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods = Class345.method6175
					   (string, -662911663)
					   .getDeclaredMethods();
		    Method[] methods_11_ = methods;
		    for (int i_12_ = 0; i_12_ < methods_11_.length; i_12_++) {
			Method method = methods_11_[i_12_];
			if (method.getName().equals(string_4_)) {
			    Class[] var_classes_13_
				= method.getParameterTypes();
			    if (var_classes_13_.length == var_classes.length) {
				boolean bool = true;
				for (int i_14_ = 0; i_14_ < var_classes.length;
				     i_14_++) {
				    if (var_classes[i_14_]
					!= var_classes_13_[i_14_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    ((Class241_Sub1) class241_sub1)
					.aMethodArray8686[i_0_]
					= method;
			    }
			}
		    }
		    ((Class241_Sub1) class241_sub1)
			.aByteArrayArrayArray8687[i_0_]
			= is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_0_] = -1;
	    } catch (SecurityException securityexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_0_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_0_] = -3;
	    } catch (Exception exception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_0_] = -4;
	    } catch (Throwable throwable) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_0_] = -5;
	    }
	}
	aClass429_7878.addNode(class241_sub1, (short) -29953);
    }
    
    public static void method13348() {
	aClass429_7878 = new NodeCollection();
    }
    
    public static void method13349() {
	aClass429_7878 = new NodeCollection();
    }
    
    public static void method13350(RSBitBuffer class241_sub3_sub1) {
	Class241_Sub1 class241_sub1
	    = (Class241_Sub1) aClass429_7878.method7694(16711935);
	if (null != class241_sub1) {
	    int i = class241_sub3_sub1.pointer * 421967667;
	    class241_sub3_sub1.writeInt((((Class241_Sub1) class241_sub1)
					    .anInt8680) * -1545577693,
					   992397473);
	    for (int i_15_ = 0;
		 (i_15_
		  < 1809919105 * ((Class241_Sub1) class241_sub1).anInt8681);
		 i_15_++) {
		if (0 != ((Class241_Sub1) class241_sub1).anIntArray8683[i_15_])
		    class241_sub3_sub1.writeByte((((Class241_Sub1)
						     class241_sub1)
						    .anIntArray8683[i_15_]),
						   -596104235);
		else {
		    try {
			int i_16_ = (((Class241_Sub1) class241_sub1)
				     .anIntArray8682[i_15_]);
			if (0 == i_16_) {
			    Field field = (((Class241_Sub1) class241_sub1)
					   .aFieldArray8684[i_15_]);
			    int i_17_ = field.getInt(null);
			    class241_sub3_sub1.writeByte(0, 1673656817);
			    class241_sub3_sub1.writeInt(i_17_, 1054745057);
			} else if (i_16_ == 1) {
			    Field field = (((Class241_Sub1) class241_sub1)
					   .aFieldArray8684[i_15_]);
			    field.setInt(null, (((Class241_Sub1) class241_sub1)
						.anIntArray8685[i_15_]));
			    class241_sub3_sub1.writeByte(0, -1251421049);
			} else if (2 == i_16_) {
			    Field field = (((Class241_Sub1) class241_sub1)
					   .aFieldArray8684[i_15_]);
			    int i_18_ = field.getModifiers();
			    class241_sub3_sub1.writeByte(0, 464580523);
			    class241_sub3_sub1.writeInt(i_18_, -602141520);
			}
			if (i_16_ == 3) {
			    Method method = (((Class241_Sub1) class241_sub1)
					     .aMethodArray8686[i_15_]);
			    byte[][] is = (((Class241_Sub1) class241_sub1)
					   .aByteArrayArrayArray8687[i_15_]);
			    Object[] objects = new Object[is.length];
			    for (int i_19_ = 0; i_19_ < is.length; i_19_++) {
				ObjectInputStream objectinputstream
				    = (new ObjectInputStream
				       (new ByteArrayInputStream(is[i_19_])));
				objects[i_19_]
				    = objectinputstream.readObject();
			    }
			    Object object = method.invoke(null, objects);
			    if (null == object)
				class241_sub3_sub1.writeByte(0, 868054382);
			    else if (object instanceof Number) {
				class241_sub3_sub1.writeByte(1, -2025702234);
				class241_sub3_sub1.method14627
				    (((Number) object).longValue());
			    } else if (object instanceof String) {
				class241_sub3_sub1.writeByte(2, -1721712642);
				class241_sub3_sub1.writeString((String) object,
							       -1909049955);
			    } else
				class241_sub3_sub1.writeByte(4, -393679984);
			} else if (4 == i_16_) {
			    Method method = (((Class241_Sub1) class241_sub1)
					     .aMethodArray8686[i_15_]);
			    int i_20_ = method.getModifiers();
			    class241_sub3_sub1.writeByte(0, 1240307694);
			    class241_sub3_sub1.writeInt(i_20_, -1537600588);
			}
		    } catch (ClassNotFoundException classnotfoundexception) {
			class241_sub3_sub1.writeByte(-10, -1677619688);
		    } catch (InvalidClassException invalidclassexception) {
			class241_sub3_sub1.writeByte(-11, 1282234894);
		    } catch (StreamCorruptedException streamcorruptedexception) {
			class241_sub3_sub1.writeByte(-12, 1537873186);
		    } catch (OptionalDataException optionaldataexception) {
			class241_sub3_sub1.writeByte(-13, -1863300044);
		    } catch (IllegalAccessException illegalaccessexception) {
			class241_sub3_sub1.writeByte(-14, -613751214);
		    } catch (IllegalArgumentException illegalargumentexception) {
			class241_sub3_sub1.writeByte(-15, 1029707420);
		    } catch (InvocationTargetException invocationtargetexception) {
			class241_sub3_sub1.writeByte(-16, -1443124017);
		    } catch (SecurityException securityexception) {
			class241_sub3_sub1.writeByte(-17, 1601701271);
		    } catch (IOException ioexception) {
			class241_sub3_sub1.writeByte(-18, 20285622);
		    } catch (NullPointerException nullpointerexception) {
			class241_sub3_sub1.writeByte(-19, -1107732691);
		    } catch (Exception exception) {
			class241_sub3_sub1.writeByte(-20, -407864882);
		    } catch (Throwable throwable) {
			class241_sub3_sub1.writeByte(-21, -539709270);
		    }
		}
	    }
	    class241_sub3_sub1.method14668(i, (byte) -74);
	    class241_sub1.remove((byte) 36);
	}
    }
    
    public static void method13351(RSByteBuffer class241_sub3, int i) {
	Class241_Sub1 class241_sub1 = new Class241_Sub1();
	((Class241_Sub1) class241_sub1).anInt8681
	    = class241_sub3.readUnsignedByte((byte) -28) * -340061311;
	((Class241_Sub1) class241_sub1).anInt8680
	    = class241_sub3.readInt((byte) 107) * 1425124491;
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
	for (int i_21_ = 0;
	     i_21_ < 1809919105 * ((Class241_Sub1) class241_sub1).anInt8681;
	     i_21_++) {
	    try {
		int i_22_ = class241_sub3.readUnsignedByte((byte) 7);
		if (i_22_ == 0 || i_22_ == 1 || i_22_ == 2) {
		    String string = class241_sub3.readString(-797958618);
		    String string_23_ = class241_sub3.readString(910710064);
		    int i_24_ = 0;
		    if (1 == i_22_)
			i_24_ = class241_sub3.readInt((byte) 67);
		    ((Class241_Sub1) class241_sub1).anIntArray8682[i_21_]
			= i_22_;
		    ((Class241_Sub1) class241_sub1).anIntArray8685[i_21_]
			= i_24_;
		    if (Class345.method6175(string, -775387232)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    ((Class241_Sub1) class241_sub1).aFieldArray8684[i_21_]
			= Class345.method6175(string, 1025439751)
			      .getDeclaredField(string_23_);
		} else if (3 == i_22_ || 4 == i_22_) {
		    String string = class241_sub3.readString(1993964736);
		    String string_25_ = class241_sub3.readString(-1390592361);
		    int i_26_ = class241_sub3.readUnsignedByte((byte) -83);
		    String[] strings = new String[i_26_];
		    for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
			strings[i_27_]
			    = class241_sub3.readString(-1008301028);
		    String string_28_ = class241_sub3.readString(-925817799);
		    byte[][] is = new byte[i_26_][];
		    if (3 == i_22_) {
			for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
			    int i_30_ = class241_sub3.readInt((byte) 19);
			    is[i_29_] = new byte[i_30_];
			    class241_sub3.readBytes(is[i_29_], 0, i_30_,
						      (byte) -64);
			}
		    }
		    ((Class241_Sub1) class241_sub1).anIntArray8682[i_21_]
			= i_22_;
		    Class[] var_classes = new Class[i_26_];
		    for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
			var_classes[i_31_]
			    = Class345.method6175(strings[i_31_], -513072923);
		    Class var_class
			= Class345.method6175(string_28_, 1687374927);
		    if (Class345.method6175(string, 377941984).getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods = Class345.method6175
					   (string, 727818403)
					   .getDeclaredMethods();
		    Method[] methods_32_ = methods;
		    for (int i_33_ = 0; i_33_ < methods_32_.length; i_33_++) {
			Method method = methods_32_[i_33_];
			if (method.getName().equals(string_25_)) {
			    Class[] var_classes_34_
				= method.getParameterTypes();
			    if (var_classes_34_.length == var_classes.length) {
				boolean bool = true;
				for (int i_35_ = 0; i_35_ < var_classes.length;
				     i_35_++) {
				    if (var_classes[i_35_]
					!= var_classes_34_[i_35_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    ((Class241_Sub1) class241_sub1)
					.aMethodArray8686[i_21_]
					= method;
			    }
			}
		    }
		    ((Class241_Sub1) class241_sub1)
			.aByteArrayArrayArray8687[i_21_]
			= is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_21_] = -1;
	    } catch (SecurityException securityexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_21_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_21_] = -3;
	    } catch (Exception exception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_21_] = -4;
	    } catch (Throwable throwable) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_21_] = -5;
	    }
	}
	aClass429_7878.addNode(class241_sub1, (short) -12773);
    }
    
    Class622() throws Throwable {
	throw new Error();
    }
    
    public static void method13352(RSByteBuffer class241_sub3, int i) {
	Class241_Sub1 class241_sub1 = new Class241_Sub1();
	((Class241_Sub1) class241_sub1).anInt8681
	    = class241_sub3.readUnsignedByte((byte) -78) * -340061311;
	((Class241_Sub1) class241_sub1).anInt8680
	    = class241_sub3.readInt((byte) 49) * 1425124491;
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
	for (int i_36_ = 0;
	     i_36_ < 1809919105 * ((Class241_Sub1) class241_sub1).anInt8681;
	     i_36_++) {
	    try {
		int i_37_ = class241_sub3.readUnsignedByte((byte) 45);
		if (i_37_ == 0 || i_37_ == 1 || i_37_ == 2) {
		    String string = class241_sub3.readString(241598090);
		    String string_38_ = class241_sub3.readString(-1149329800);
		    int i_39_ = 0;
		    if (1 == i_37_)
			i_39_ = class241_sub3.readInt((byte) 43);
		    ((Class241_Sub1) class241_sub1).anIntArray8682[i_36_]
			= i_37_;
		    ((Class241_Sub1) class241_sub1).anIntArray8685[i_36_]
			= i_39_;
		    if (Class345.method6175(string, 736638096).getClassLoader()
			== null)
			throw new SecurityException();
		    ((Class241_Sub1) class241_sub1).aFieldArray8684[i_36_]
			= Class345.method6175(string, 180359048)
			      .getDeclaredField(string_38_);
		} else if (3 == i_37_ || 4 == i_37_) {
		    String string = class241_sub3.readString(1167936726);
		    String string_40_ = class241_sub3.readString(770476171);
		    int i_41_ = class241_sub3.readUnsignedByte((byte) -75);
		    String[] strings = new String[i_41_];
		    for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
			strings[i_42_] = class241_sub3.readString(-248668527);
		    String string_43_ = class241_sub3.readString(1297848450);
		    byte[][] is = new byte[i_41_][];
		    if (3 == i_37_) {
			for (int i_44_ = 0; i_44_ < i_41_; i_44_++) {
			    int i_45_ = class241_sub3.readInt((byte) 64);
			    is[i_44_] = new byte[i_45_];
			    class241_sub3.readBytes(is[i_44_], 0, i_45_,
						      (byte) 53);
			}
		    }
		    ((Class241_Sub1) class241_sub1).anIntArray8682[i_36_]
			= i_37_;
		    Class[] var_classes = new Class[i_41_];
		    for (int i_46_ = 0; i_46_ < i_41_; i_46_++)
			var_classes[i_46_]
			    = Class345.method6175(strings[i_46_], -189263312);
		    Class var_class
			= Class345.method6175(string_43_, 1753528959);
		    if (Class345.method6175(string, 1422940449)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods = Class345.method6175
					   (string, -1062606173)
					   .getDeclaredMethods();
		    Method[] methods_47_ = methods;
		    for (int i_48_ = 0; i_48_ < methods_47_.length; i_48_++) {
			Method method = methods_47_[i_48_];
			if (method.getName().equals(string_40_)) {
			    Class[] var_classes_49_
				= method.getParameterTypes();
			    if (var_classes_49_.length == var_classes.length) {
				boolean bool = true;
				for (int i_50_ = 0; i_50_ < var_classes.length;
				     i_50_++) {
				    if (var_classes[i_50_]
					!= var_classes_49_[i_50_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    ((Class241_Sub1) class241_sub1)
					.aMethodArray8686[i_36_]
					= method;
			    }
			}
		    }
		    ((Class241_Sub1) class241_sub1)
			.aByteArrayArrayArray8687[i_36_]
			= is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_36_] = -1;
	    } catch (SecurityException securityexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_36_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_36_] = -3;
	    } catch (Exception exception) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_36_] = -4;
	    } catch (Throwable throwable) {
		((Class241_Sub1) class241_sub1).anIntArray8683[i_36_] = -5;
	    }
	}
	aClass429_7878.addNode(class241_sub1, (short) -32066);
    }
    
    static Class method13353(String string) throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    static Class method13354(String string) throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    static Class method13355(String string) throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    static final void method13356(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class595.method13078(class58, class35, class454, 949366554);
    }
    
    static final void method13357(ClientScriptData class454, int i) {
	int i_51_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (client.friendListStage * -2020075851 == 2 && i_51_ >= 0
	    && i_51_ < 1557840217 * client.friendListSize)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= client.friendList[i_51_].anInt194 * 442519451;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    static final void method13358(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_52_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_53_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_53_ + i_52_;
    }
    
    public static final void method13359(String displayName, int i) {
		if (null != displayName) {
		    String protocolName = Class482.formatStringForProtocol(displayName, Class524.aClass600_6822,
					       (byte) 64);
		    if (protocolName != null) {
				for (int friendIdx = 0; friendIdx < 1557840217 * client.friendListSize; friendIdx++) {
				    Friend friend = client.friendList[friendIdx];
				    String friendName = friend.currentName;
				    String friendProtocol = Class482.formatStringForProtocol(friendName, Class524.aClass600_6822,
							       (byte) 87);
				    if (Class42.namesAreEqual(displayName, protocolName, friendName, friendProtocol, 622044604)) {
						client.friendListSize -= 1847555817;
						for (int remaining = friendIdx; remaining < 1557840217 * client.friendListSize; remaining++) {
						    client.friendList[remaining] = client.friendList[remaining + 1];
						}
						client.lastFriendsListUpdate = client.anInt8494 * -1343088703;
						ServerConnection class190 = ClanChannelDelta.method6943(-1802865935);
						Class241_Sub27 packet = Class445_Sub26.makePacket(
								OutgoingOpcode.REMOVE_FRIEND_PACKET,
								class190.packetCipher,
								16711935);
						packet.data.writeByte(Class421.getEncodedStringLength(displayName, -2143770442), -2038641961);
						packet.data.writeString(displayName, -1534115049);
						class190.sendPacket(packet, -1972181714);
						break;
				    }
				}
		    }
		}
    }
    
    static final void method13360(ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class120_Sub22.aString10627 != null
	    && Class120_Sub22.aString10627.equalsIgnoreCase(string))
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
}
