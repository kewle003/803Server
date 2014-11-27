/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.HashMap;
import java.util.Map;

public class Class344
{
    Class129 aClass129_5343 = new Class129(20);
    JS5 aClass210_5344;
    Map aMap5345 = null;
    int[] anIntArray5346;
    JS5 aClass210_5347;
    static int archiveCount;//anInt5348
    public static Canvas canvas;//aCanvas5349
    
    public Class639 method6134(Interface26 interface26, int i) {
	Class399 class399 = method6142(interface26, i, true, true, 1784906427);
	if (class399 == null)
	    return null;
	return (Class639) class399.anObject5794;
    }
    
    public void method6135(Interface26 interface26, int i) {
	((Class344) this).aMap5345
	    = new HashMap(((Class344) this).anIntArray5346.length);
	for (int i_0_ = 0; i_0_ < ((Class344) this).anIntArray5346.length;
	     i_0_++) {
	    int i_1_ = ((Class344) this).anIntArray5346[i_0_];
	    Class639 class639
		= Class482.method11026(((Class344) this).aClass210_5344, i_1_,
				       -632335605);
	    byte[] is
		= ((Class344) this).aClass210_5347.method4194(i_1_, 707564196);
	    Object object
		= interface26.method168(is, class639, true, -812530387);
	    ((Class344) this).aMap5345.put(Integer.valueOf(i_0_),
					   new Class399(object, class639));
	}
    }
    
    public void method6136(int i) {
	((Class344) this).aMap5345 = null;
    }
    
    public Object method6137(Interface26 interface26, int i, boolean bool,
			     boolean bool_2_) {
	Class399 class399
	    = method6142(interface26, i, bool, bool_2_, 89968690);
	if (null == class399)
	    return null;
	return class399.anObject5795;
    }
    
    public void method6138() {
	((Class344) this).aMap5345 = null;
    }
    
    public int method6139(byte i) {
		if (((Class344) this).anIntArray5346 == null)
		    return 0;
		return ((Class344) this).anIntArray5346.length * 2;
    }
    
    public int method6140(boolean bool) {
	if (((Class344) this).anIntArray5346 == null)
	    return 0;
	if (!bool && null != ((Class344) this).aMap5345)
	    return ((Class344) this).anIntArray5346.length * 2;
	int i = 0;
	for (int i_3_ = 0; i_3_ < ((Class344) this).anIntArray5346.length;
	     i_3_++) {
	    int i_4_ = ((Class344) this).anIntArray5346[i_3_];
	    if (((Class344) this).aClass210_5347.method4250(i_4_, -216008520))
		i++;
	    if (((Class344) this).aClass210_5344.method4250(i_4_, 684556805))
		i++;
	}
	return i;
    }
    
    public Class639 method6141(Interface26 interface26, int i, byte i_5_) {
	Class399 class399 = method6142(interface26, i, true, true, 1449555830);
	if (class399 == null)
	    return null;
	return (Class639) class399.anObject5794;
    }
    
    Class399 method6142(Interface26 interface26, int i, boolean bool,
			boolean bool_6_, int i_7_) {
	if (i == -1)
	    return null;
	if (((Class344) this).anIntArray5346 != null) {
	    for (int i_8_ = 0; i_8_ < ((Class344) this).anIntArray5346.length;
		 i_8_++) {
		if (i == ((Class344) this).anIntArray5346[i_8_])
		    return (Class399) ((Class344) this).aMap5345
					  .get(Integer.valueOf(i_8_));
	    }
	}
	Class399 class399
	    = (Class399) ((Class344) this).aClass129_5343
			     .get((long) (i << 1 | (bool_6_ ? 1 : 0)));
	if (class399 != null) {
	    if (bool && null == class399.anObject5794) {
		Class639 class639
		    = Class482.method11026(((Class344) this).aClass210_5344, i,
					   -2035954522);
		if (class639 == null)
		    return null;
		class399.anObject5794 = class639;
	    }
	    return class399;
	}
	byte[] is
	    = ((Class344) this).aClass210_5347.method4194(i, -1286929460);
	if (is == null)
	    return null;
	Class639 class639
	    = Class482.method11026(((Class344) this).aClass210_5344, i,
				   -839831456);
	if (class639 == null)
	    return null;
	if (bool)
	    class399 = new Class399(interface26.method168(is, class639,
							  bool_6_, 1421468710),
				    class639);
	else
	    class399 = new Class399(interface26.method168(is, class639,
							  bool_6_, -627847039),
				    null);
	((Class344) this).aClass129_5343
	    .put(class399, (long) (i << 1 | (bool_6_ ? 1 : 0)));
	return class399;
    }
    
    public void method6143(int i) {
	((Class344) this).aClass129_5343.reset(-1800825942);
    }
    
    public void method6144(int i, byte i_9_) {
	((Class344) this).aClass129_5343.clean(i, -2054492897);
    }
    
    public void method6145(int i) {
	((Class344) this).aClass129_5343.removeSoftReferences((byte) -40);
    }
    
    public void method6146(Interface26 interface26) {
	((Class344) this).aMap5345
	    = new HashMap(((Class344) this).anIntArray5346.length);
	for (int i = 0; i < ((Class344) this).anIntArray5346.length; i++) {
	    int i_10_ = ((Class344) this).anIntArray5346[i];
	    Class639 class639
		= Class482.method11026(((Class344) this).aClass210_5344, i_10_,
				       -1316994169);
	    byte[] is = ((Class344) this).aClass210_5347.method4194(i_10_,
								    923844381);
	    Object object
		= interface26.method168(is, class639, true, 1255739081);
	    ((Class344) this).aMap5345.put(Integer.valueOf(i),
					   new Class399(object, class639));
	}
    }
    
    public void method6147() {
	((Class344) this).aMap5345 = null;
    }
    
    public Class344(JS5 class210, JS5 class210_11_, int[] is) {
	((Class344) this).aClass210_5347 = class210;
	((Class344) this).aClass210_5344 = class210_11_;
	if (is != null)
	    ((Class344) this).anIntArray5346 = is;
	else
	    ((Class344) this).anIntArray5346 = null;
    }
    
    public void method6148() {
	((Class344) this).aClass129_5343.reset(-1193600217);
    }
    
    public void method6149() {
	((Class344) this).aMap5345 = null;
    }
    
    public int method6150() {
	return method6165(false, 1540325834);
    }
    
    public int method6151() {
	return method6165(false, 892063715);
    }
    
    public Class639 method6152(Interface26 interface26, int i) {
	Class399 class399 = method6142(interface26, i, true, true, 1086408696);
	if (class399 == null)
	    return null;
	return (Class639) class399.anObject5794;
    }
    
    public int method6153(boolean bool) {
	if (((Class344) this).anIntArray5346 == null)
	    return 0;
	if (!bool && null != ((Class344) this).aMap5345)
	    return ((Class344) this).anIntArray5346.length * 2;
	int i = 0;
	for (int i_12_ = 0; i_12_ < ((Class344) this).anIntArray5346.length;
	     i_12_++) {
	    int i_13_ = ((Class344) this).anIntArray5346[i_12_];
	    if (((Class344) this).aClass210_5347.method4250(i_13_, 1122624091))
		i++;
	    if (((Class344) this).aClass210_5344.method4250(i_13_, -549187831))
		i++;
	}
	return i;
    }
    
    public int method6154() {
	if (((Class344) this).anIntArray5346 == null)
	    return 0;
	return ((Class344) this).anIntArray5346.length * 2;
    }
    
    public int method6155() {
	if (((Class344) this).anIntArray5346 == null)
	    return 0;
	return ((Class344) this).anIntArray5346.length * 2;
    }
    
    public int method6156(int i) {
	return method6165(false, 199655270);
    }
    
    public Object method6157(Interface26 interface26, int i, boolean bool,
			     boolean bool_14_) {
	Class399 class399
	    = method6142(interface26, i, bool, bool_14_, 1485105765);
	if (null == class399)
	    return null;
	return class399.anObject5795;
    }
    
    public Object method6158(Interface26 interface26, int i, boolean bool,
			     boolean bool_15_) {
	Class399 class399
	    = method6142(interface26, i, bool, bool_15_, 1234124228);
	if (null == class399)
	    return null;
	return class399.anObject5795;
    }
    
    Class399 method6159(Interface26 interface26, int i, boolean bool,
			boolean bool_16_) {
	if (i == -1)
	    return null;
	if (((Class344) this).anIntArray5346 != null) {
	    for (int i_17_ = 0;
		 i_17_ < ((Class344) this).anIntArray5346.length; i_17_++) {
		if (i == ((Class344) this).anIntArray5346[i_17_])
		    return (Class399) ((Class344) this).aMap5345
					  .get(Integer.valueOf(i_17_));
	    }
	}
	Class399 class399
	    = (Class399) ((Class344) this).aClass129_5343
			     .get((long) (i << 1 | (bool_16_ ? 1 : 0)));
	if (class399 != null) {
	    if (bool && null == class399.anObject5794) {
		Class639 class639
		    = Class482.method11026(((Class344) this).aClass210_5344, i,
					   -1051846600);
		if (class639 == null)
		    return null;
		class399.anObject5794 = class639;
	    }
	    return class399;
	}
	byte[] is
	    = ((Class344) this).aClass210_5347.method4194(i, -2066717000);
	if (is == null)
	    return null;
	Class639 class639
	    = Class482.method11026(((Class344) this).aClass210_5344, i,
				   -390493685);
	if (class639 == null)
	    return null;
	if (bool)
	    class399
		= new Class399(interface26.method168(is, class639, bool_16_,
						     -1781212011),
			       class639);
	else
	    class399
		= new Class399(interface26.method168(is, class639, bool_16_,
						     -1783271518),
			       null);
	((Class344) this).aClass129_5343
	    .put(class399, (long) (i << 1 | (bool_16_ ? 1 : 0)));
	return class399;
    }
    
    Class399 method6160(Interface26 interface26, int i, boolean bool,
			boolean bool_18_) {
	if (i == -1)
	    return null;
	if (((Class344) this).anIntArray5346 != null) {
	    for (int i_19_ = 0;
		 i_19_ < ((Class344) this).anIntArray5346.length; i_19_++) {
		if (i == ((Class344) this).anIntArray5346[i_19_])
		    return (Class399) ((Class344) this).aMap5345
					  .get(Integer.valueOf(i_19_));
	    }
	}
	Class399 class399
	    = (Class399) ((Class344) this).aClass129_5343
			     .get((long) (i << 1 | (bool_18_ ? 1 : 0)));
	if (class399 != null) {
	    if (bool && null == class399.anObject5794) {
		Class639 class639
		    = Class482.method11026(((Class344) this).aClass210_5344, i,
					   -620646648);
		if (class639 == null)
		    return null;
		class399.anObject5794 = class639;
	    }
	    return class399;
	}
	byte[] is = ((Class344) this).aClass210_5347.method4194(i, 1274270837);
	if (is == null)
	    return null;
	Class639 class639
	    = Class482.method11026(((Class344) this).aClass210_5344, i,
				   -797895288);
	if (class639 == null)
	    return null;
	if (bool)
	    class399
		= new Class399(interface26.method168(is, class639, bool_18_,
						     -699312095),
			       class639);
	else
	    class399
		= new Class399(interface26.method168(is, class639, bool_18_,
						     -1257322779),
			       null);
	((Class344) this).aClass129_5343
	    .put(class399, (long) (i << 1 | (bool_18_ ? 1 : 0)));
	return class399;
    }
    
    public Object method6161(Interface26 interface26, int i, boolean bool,
			     boolean bool_20_, int i_21_) {
	Class399 class399
	    = method6142(interface26, i, bool, bool_20_, -952330420);
	if (null == class399)
	    return null;
	return class399.anObject5795;
    }
    
    Class399 method6162(Interface26 interface26, int i, boolean bool,
			boolean bool_22_) {
	if (i == -1)
	    return null;
	if (((Class344) this).anIntArray5346 != null) {
	    for (int i_23_ = 0;
		 i_23_ < ((Class344) this).anIntArray5346.length; i_23_++) {
		if (i == ((Class344) this).anIntArray5346[i_23_])
		    return (Class399) ((Class344) this).aMap5345
					  .get(Integer.valueOf(i_23_));
	    }
	}
	Class399 class399
	    = (Class399) ((Class344) this).aClass129_5343
			     .get((long) (i << 1 | (bool_22_ ? 1 : 0)));
	if (class399 != null) {
	    if (bool && null == class399.anObject5794) {
		Class639 class639
		    = Class482.method11026(((Class344) this).aClass210_5344, i,
					   -494908076);
		if (class639 == null)
		    return null;
		class399.anObject5794 = class639;
	    }
	    return class399;
	}
	byte[] is = ((Class344) this).aClass210_5347.method4194(i, 260836666);
	if (is == null)
	    return null;
	Class639 class639
	    = Class482.method11026(((Class344) this).aClass210_5344, i,
				   -1747573372);
	if (class639 == null)
	    return null;
	if (bool)
	    class399 = new Class399(interface26.method168(is, class639,
							  bool_22_, 740896888),
				    class639);
	else
	    class399
		= new Class399(interface26.method168(is, class639, bool_22_,
						     -1353242665),
			       null);
	((Class344) this).aClass129_5343
	    .put(class399, (long) (i << 1 | (bool_22_ ? 1 : 0)));
	return class399;
    }
    
    public Object method6163(Interface26 interface26, int i, boolean bool,
			     boolean bool_24_) {
	Class399 class399
	    = method6142(interface26, i, bool, bool_24_, -1982148573);
	if (null == class399)
	    return null;
	return class399.anObject5795;
    }
    
    Class399 method6164(Interface26 interface26, int i, boolean bool,
			boolean bool_25_) {
	if (i == -1)
	    return null;
	if (((Class344) this).anIntArray5346 != null) {
	    for (int i_26_ = 0;
		 i_26_ < ((Class344) this).anIntArray5346.length; i_26_++) {
		if (i == ((Class344) this).anIntArray5346[i_26_])
		    return (Class399) ((Class344) this).aMap5345
					  .get(Integer.valueOf(i_26_));
	    }
	}
	Class399 class399
	    = (Class399) ((Class344) this).aClass129_5343
			     .get((long) (i << 1 | (bool_25_ ? 1 : 0)));
	if (class399 != null) {
	    if (bool && null == class399.anObject5794) {
		Class639 class639
		    = Class482.method11026(((Class344) this).aClass210_5344, i,
					   -1226589139);
		if (class639 == null)
		    return null;
		class399.anObject5794 = class639;
	    }
	    return class399;
	}
	byte[] is = ((Class344) this).aClass210_5347.method4194(i, 874347158);
	if (is == null)
	    return null;
	Class639 class639
	    = Class482.method11026(((Class344) this).aClass210_5344, i,
				   -1714498209);
	if (class639 == null)
	    return null;
	if (bool)
	    class399 = new Class399(interface26.method168(is, class639,
							  bool_25_, 644242078),
				    class639);
	else
	    class399
		= new Class399(interface26.method168(is, class639, bool_25_,
						     1073061882),
			       null);
	((Class344) this).aClass129_5343
	    .put(class399, (long) (i << 1 | (bool_25_ ? 1 : 0)));
	return class399;
    }
    
    public int method6165(boolean bool, int i) {
	if (((Class344) this).anIntArray5346 == null)
	    return 0;
	if (!bool && null != ((Class344) this).aMap5345)
	    return ((Class344) this).anIntArray5346.length * 2;
	int i_27_ = 0;
	for (int i_28_ = 0; i_28_ < ((Class344) this).anIntArray5346.length;
	     i_28_++) {
	    int i_29_ = ((Class344) this).anIntArray5346[i_28_];
	    if (((Class344) this).aClass210_5347.method4250(i_29_, 1914713785))
		i_27_++;
	    if (((Class344) this).aClass210_5344.method4250(i_29_, 1934757917))
		i_27_++;
	}
	return i_27_;
    }
    
    public void method6166() {
	((Class344) this).aMap5345 = null;
    }
    
    public void method6167() {
	((Class344) this).aClass129_5343.reset(-1332775019);
    }
    
    public void method6168(int i) {
	((Class344) this).aClass129_5343.clean(i, -2098610370);
    }
    
    public void method6169(int i) {
	((Class344) this).aClass129_5343.clean(i, -2015496578);
    }
    
    public void method6170() {
	((Class344) this).aClass129_5343.removeSoftReferences((byte) 56);
    }
    
    public void method6171() {
	((Class344) this).aClass129_5343.removeSoftReferences((byte) 21);
    }
    
    static final void method6172(ClientScriptData class454, byte i) {
	int i_30_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_30_, (byte) -13);
	Class238.method4878(class58, class454, -1588028908);
    }
    
    static final void method6173(ClientScriptData class454, short i) {
	Class592.method12924(Class520.method11690(-769614668), -1997265011);
    }
    
    static void method6174(InterfaceComponent class58, Class135 class135, int i,
			   int i_31_, int i_32_, int i_33_, int i_34_,
			   String string, Class96 class96, Class639 class639,
			   int i_35_, byte i_36_) {
	int i_37_;
	if (4 == 115241065 * Class296.anInt4513)
	    i_37_ = ((int) ((double) Class445_Sub16.aClass351_Sub1_8660
					 .method6292((byte) 82)
			    * 2607.5945876176133)
		     + client.anInt8513 * 390680985) & 0x3fff;
	else if (5 == 115241065 * Class296.anInt4513)
	    i_37_ = (int) client.aFloat8581 & 0x3fff;
	else
	    i_37_ = (client.anInt8513 * 390680985 + (int) client.aFloat8581
		     & 0x3fff);
	int i_38_ = (Math.max(class58.anInt850 * 439139681 / 2,
			      class58.scrollMinY * 1463495207 / 2)
		     + 10);
	int i_39_ = i_32_ * i_32_ + i_33_ * i_33_;
	if (i_39_ <= i_38_ * i_38_) {
	    int i_40_ = Class282.anIntArray4430[i_37_];
	    int i_41_ = Class282.anIntArray4441[i_37_];
	    if (Class296.anInt4513 * 115241065 != 5) {
		i_40_ = 256 * i_40_ / (1747300637 * client.anInt8377 + 256);
		i_41_ = 256 * i_41_ / (256 + client.anInt8377 * 1747300637);
	    }
	    int i_42_ = i_33_ * i_40_ + i_41_ * i_32_ >> 14;
	    int i_43_ = i_33_ * i_41_ - i_40_ * i_32_ >> 14;
	    int i_44_ = class639.method13567(string, 100, null, -1112097178);
	    int i_45_ = class639.method13596(string, 100, 0, null, -792176848);
	    i_42_ -= i_44_ / 2;
	    if (i_42_ >= -(439139681 * class58.anInt850)
		&& i_42_ <= 439139681 * class58.anInt850
		&& i_43_ >= -(1463495207 * class58.scrollMinY)
		&& i_43_ <= class58.scrollMinY * 1463495207)
		class96.method2114(string,
				   (class58.anInt850 * 439139681 / 2
				    + (i + i_42_)),
				   (class58.scrollMinY * 1463495207 / 2 + i_31_
				    - i_43_ - i_34_ - i_45_),
				   i_44_, 50, i_35_, 0, 1, 0, 0, null, null,
				   class135, i, i_31_, 1709979176);
	}
    }
}
