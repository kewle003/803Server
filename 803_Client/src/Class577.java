/* Class577 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class577
{
    Class129 aClass129_7448 = new Class129(16);
    JS5 aClass210_7449;
    public static JS5 aClass210_7450;
    
    public void method12671() {
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.removeSoftReferences((byte) -46);
	}
    }
    
    Class562 method12672(int i, int i_0_) {
	Class562 class562;
	synchronized (((Class577) this).aClass129_7448) {
	    class562 = ((Class562)
			((Class577) this).aClass129_7448.get((long) i));
	}
	if (class562 != null)
	    return class562;
	byte[] is;
	synchronized (((Class577) this).aClass210_7449) {
	    is = ((Class577) this).aClass210_7449.getfile(((Js5ConfigGroup
							       .aClass37_412
							       .id)
							      * -1379677837),
							     i, 1661269803);
	}
	class562 = new Class562();
	if (null != is)
	    class562.method12374(new RSByteBuffer(is), 14516512);
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.put(class562, (long) i);
	}
	return class562;
    }
    
    public Class589 method12673(int i, int i_1_, int i_2_, int i_3_,
				Class74 class74, int i_4_) {
	Class596[] class596s = null;
	Class562 class562 = method12672(i, -479859647);
	if (((Class562) class562).anIntArray7300 != null) {
	    class596s
		= new Class596[((Class562) class562).anIntArray7300.length];
	    for (int i_5_ = 0; i_5_ < class596s.length; i_5_++) {
		Class64 class64 = class74.method1750((((Class562) class562)
						      .anIntArray7300[i_5_]),
						     -1916940921);
		class596s[i_5_]
		    = new Class596(524938599 * class64.anInt1041,
				   class64.anInt1040 * 1035388587,
				   1462395685 * class64.anInt1033,
				   class64.anInt1036 * -753129917,
				   28338261 * class64.anInt1039,
				   -1137000717 * class64.anInt1034,
				   class64.anInt1042 * 1970355213,
				   class64.aBool1038,
				   class64.anInt1037 * 2055622217,
				   806538847 * class64.anInt1035,
				   -2103165881 * class64.anInt1043);
	    }
	}
	return new Class589(-256254889 * ((Class562) class562).anInt7301,
			    class596s,
			    -661817931 * ((Class562) class562).anInt7299, i_1_,
			    i_2_, i_3_, ((Class562) class562).aClass579_7302,
			    ((Class562) class562).anInt7303 * 1726060905);
    }
    
    public void method12674(int i) {
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.reset(-899549027);
	}
    }
    
    public void method12675(int i, int i_6_) {
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.clean(i, -2072816099);
	}
    }
    
    public void method12676(int i) {
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.clean(i, -2111855027);
	}
    }
    
    public void method12677(int i) {
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.removeSoftReferences((byte) -49);
	}
    }
    
    Class562 method12678(int i) {
	Class562 class562;
	synchronized (((Class577) this).aClass129_7448) {
	    class562 = ((Class562)
			((Class577) this).aClass129_7448.get((long) i));
	}
	if (class562 != null)
	    return class562;
	byte[] is;
	synchronized (((Class577) this).aClass210_7449) {
	    is = ((Class577) this).aClass210_7449.getfile(((Js5ConfigGroup
							       .aClass37_412
							       .id)
							      * -1379677837),
							     i, -521306417);
	}
	class562 = new Class562();
	if (null != is)
	    class562.method12374(new RSByteBuffer(is), -1253780854);
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.put(class562, (long) i);
	}
	return class562;
    }
    
    Class562 method12679(int i) {
	Class562 class562;
	synchronized (((Class577) this).aClass129_7448) {
	    class562 = ((Class562)
			((Class577) this).aClass129_7448.get((long) i));
	}
	if (class562 != null)
	    return class562;
	byte[] is;
	synchronized (((Class577) this).aClass210_7449) {
	    is = ((Class577) this).aClass210_7449.getfile(((Js5ConfigGroup
							       .aClass37_412
							       .id)
							      * -1379677837),
							     i, -242526446);
	}
	class562 = new Class562();
	if (null != is)
	    class562.method12374(new RSByteBuffer(is), -810767536);
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.put(class562, (long) i);
	}
	return class562;
    }
    
    Class562 method12680(int i) {
	Class562 class562;
	synchronized (((Class577) this).aClass129_7448) {
	    class562 = ((Class562)
			((Class577) this).aClass129_7448.get((long) i));
	}
	if (class562 != null)
	    return class562;
	byte[] is;
	synchronized (((Class577) this).aClass210_7449) {
	    is = ((Class577) this).aClass210_7449.getfile(((Js5ConfigGroup
							       .aClass37_412
							       .id)
							      * -1379677837),
							     i, 1366061176);
	}
	class562 = new Class562();
	if (null != is)
	    class562.method12374(new RSByteBuffer(is), 1792154);
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.put(class562, (long) i);
	}
	return class562;
    }
    
    public void method12681() {
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.reset(-1541484372);
	}
    }
    
    public Class577(GameDefinition class471, Language class437, JS5 class210) {
	((Class577) this).aClass210_7449 = class210;
	((Class577) this).aClass210_7449.getContainerCount((Js5ConfigGroup.aClass37_412
						     .id) * -1379677837,
						    (byte) -125);
    }
    
    public void method12682() {
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.removeSoftReferences((byte) -55);
	}
    }
    
    Class562 method12683(int i) {
	Class562 class562;
	synchronized (((Class577) this).aClass129_7448) {
	    class562 = ((Class562)
			((Class577) this).aClass129_7448.get((long) i));
	}
	if (class562 != null)
	    return class562;
	byte[] is;
	synchronized (((Class577) this).aClass210_7449) {
	    is = ((Class577) this).aClass210_7449.getfile(((Js5ConfigGroup
							       .aClass37_412
							       .id)
							      * -1379677837),
							     i, 1406436365);
	}
	class562 = new Class562();
	if (null != is)
	    class562.method12374(new RSByteBuffer(is), -186897998);
	synchronized (((Class577) this).aClass129_7448) {
	    ((Class577) this).aClass129_7448.put(class562, (long) i);
	}
	return class562;
    }
    
    static RSByteBuffer method12684(byte i) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(518);
	Class13.anIntArray79 = new int[4];
	Class13.anIntArray79[0] = (int) (Math.random() * 9.9999999E7);
	Class13.anIntArray79[1] = (int) (Math.random() * 9.9999999E7);
	Class13.anIntArray79[2] = (int) (Math.random() * 9.9999999E7);
	Class13.anIntArray79[3] = (int) (Math.random() * 9.9999999E7);
	class241_sub3.writeByte(10, -493024288);
	class241_sub3.writeInt(Class13.anIntArray79[0], -388426022);
	class241_sub3.writeInt(Class13.anIntArray79[1], 929548304);
	class241_sub3.writeInt(Class13.anIntArray79[2], 1910440024);
	class241_sub3.writeInt(Class13.anIntArray79[3], 1269141914);
	return class241_sub3;
    }
    
    public static int method12685(int i, int i_7_, int i_8_, int i_9_,
				  int i_10_, int i_11_, int i_12_) {
	if (1 == (i_11_ & 0x1)) {
	    int i_13_ = i_9_;
	    i_9_ = i_10_;
	    i_10_ = i_13_;
	}
	i_8_ &= 0x3;
	if (0 == i_8_)
	    return i;
	if (1 == i_8_)
	    return i_7_;
	if (i_8_ == 2)
	    return 7 - i - (i_9_ - 1);
	return 7 - i_7_ - (i_10_ - 1);
    }
    
    public static int method12686(int i, int i_14_) {
	if (Class573_Sub1.anInt8790 * -1310014867 == i)
	    return Class573_Sub1.aBool8774 ? 1 : 0;
	if (i == Class573_Sub1.anInt8767 * 2090457349)
	    return Class573_Sub1.aBool8780 ? 1 : 0;
	if (Class573_Sub1.anInt8768 * -1104278553 == i)
	    return Class573_Sub1.aBool8776 ? 1 : 0;
	return -1;
    }
    
    static void method12687(int i, int i_15_) {
	synchronized (Class24.aClass129_210) {
	    Class24.aClass129_210.clean(i, -2034364788);
	}
    }
}
