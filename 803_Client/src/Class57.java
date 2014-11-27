/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Class57 implements Interface44
{
    boolean[] aBoolArray739;
    Class320 aClass320_740;
    int anInt741;
    int anInt742;
    int anInt743;
    Interface34 anInterface34_744;
    Class60 aClass60_745;
    Class60[] aClass60Array746;
    int anInt747;
    Class329 aClass329_748;
    int anInt749;
    int anInt750;
    int anInt751;
    List aList752;
    int anInt753;
    AtomicReference anAtomicReference754;
    Class34[] aClass34Array755;
    Class51[] aClass51Array756;
    Class45[] aClass45Array757;
    Class36[] aClass36Array758;
    boolean[] aBoolArray759;
    int[] anIntArray760;
    Class60[] aClass60Array761;
    int anInt762;
    int anInt763;
    boolean[] aBoolArray764;
    int[] anIntArray765;
    Class60 aClass60_766;
    int anInt767;
    List aList768 = new ArrayList();
    int anInt769;
    Class303 aClass303_770 = Class303.aClass303_4790;
    Class60 aClass60_771;
    int anInt772;
    int[] anIntArray773;
    boolean aBool774;
    List aList775 = new ArrayList();
    RSByteBuffer aClass241_Sub3_776 = null;
    int anInt777;
    int anInt778;
    List aList779;
    boolean aBool780;
    boolean aBool781;
    boolean aBool782;
    int anInt783;
    int anInt784;
    int anInt785;
    int anInt786;
    boolean aBool787;
    static List aList788 = new ArrayList();
    int anInt789;
    int anInt790;
    int anInt791;
    float aFloat792;
    boolean aBool793;
    List aList794;
    int anInt795 = 0;
    int anInt796;
    Class60 aClass60_797;
    Class60[] aClass60Array798;
    Class60 aClass60_799;
    int anInt800;
    int anInt801;
    static Class129 aClass129_802 = new Class129(524288, 1024);
    byte[] aByteArray803;
    int anInt804;
    int anInt805;
    Class60 aClass60_806;
    boolean[] aBoolArray807;
    boolean[] aBoolArray808;
    
    boolean method1392(int i, Class320 class320, Class329 class329) {
	if (class320 == Class320.aClass320_4878)
	    return true;
	if (class320 == Class320.aClass320_4873)
	    return true;
	if (class320 == Class320.aClass320_4874)
	    return true;
	if (class320 == Class320.aClass320_4876)
	    return true;
	return false;
    }
    
    public void method288(boolean bool) {
	if (!bool)
	    method190();
	else if (method317() == Class303.aClass303_4793) {
	    method1404(true);
	    method1394(Class303.aClass303_4792);
	}
    }
    
    public void method190() {
	if (method317() != Class303.aClass303_4789) {
	    method1404(false);
	    method1394(Class303.aClass303_4790);
	} else {
	    method1404(false);
	    method1394(Class303.aClass303_4794);
	}
    }
    
    boolean method1393(int i, Class320 class320, Class329 class329) {
	if (class320 == Class320.aClass320_4878)
	    return true;
	if (class320 == Class320.aClass320_4873)
	    return true;
	if (class320 == Class320.aClass320_4874)
	    return true;
	if (class320 == Class320.aClass320_4876)
	    return true;
	return false;
    }
    
    void method1394(Class303 class303) {
	((Class57) this).aClass303_770 = class303;
    }
    
    public void method311(Interface34 interface34) {
	((Class57) this).anInterface34_744 = interface34;
    }
    
    public int method308(int i) {
	return i / (method319().anInt4875 * -32980023 / 8);
    }
    
    float method1395(int i) {
	int i_0_ = i & 0x1fffff;
	int i_1_ = i & ~0x7fffffff;
	int i_2_ = (i & 0x7fe00000) >> 21;
	if (i_1_ != 0)
	    i_0_ = -i_0_;
	return (float) ((double) i_0_ * Math.pow(2.0, (double) (i_2_ - 788)));
    }
    
    public Class320 method312() {
	return ((Class57) this).aClass320_740;
    }
    
    public void method280() {
	if (method317() != Class303.aClass303_4789) {
	    method1404(false);
	    method1394(Class303.aClass303_4790);
	} else {
	    method1404(false);
	    method1394(Class303.aClass303_4794);
	}
    }
    
    public int method307(int i) {
	return i / (method319().anInt4875 * -32980023 / 8);
    }
    
    int method1396() {
	if (((Class57) this).aBool781)
	    return ((Class57) this).anInt743;
	throw new RuntimeException("");
    }
    
    int method1397() {
	if (method154())
	    return ((Class57) this).anInt796;
	throw new RuntimeException("");
    }
    
    public Class320 method319() {
	return ((Class57) this).aClass320_740;
    }
    
    public Class329 method295() {
	return ((Class57) this).aClass329_748;
    }
    
    public void method325(int i, Class320 class320, Class329 class329,
			  int i_3_) {
	((Class57) this).anInt749 = i_3_;
	if (method1398(i, class320, class329)) {
	    ((Class57) this).aClass320_740 = class320;
	    ((Class57) this).aClass329_748 = class329;
	} else
	    throw new RuntimeException("");
    }
    
    boolean method1398(int i, Class320 class320, Class329 class329) {
	if (class320 == Class320.aClass320_4878)
	    return true;
	if (class320 == Class320.aClass320_4873)
	    return true;
	if (class320 == Class320.aClass320_4874)
	    return true;
	if (class320 == Class320.aClass320_4876)
	    return true;
	return false;
    }
    
    int method1399() {
	return ((Class57) this).anInt804;
    }
    
    public int method223() {
	if (((Class57) this).aBool781)
	    return (method1396() < ((Class57) this).anInt749
		    ? ((Class57) this).anInt749 : method1396());
	throw new RuntimeException("");
    }
    
    public void method302() {
	if (method317() == Class303.aClass303_4794
	    || method317() == Class303.aClass303_4790
	    || method317() == Class303.aClass303_4792) {
	    method1394(Class303.aClass303_4789);
	    method1405();
	}
    }
    
    Class60[] method1400(int i, int i_4_) {
	Class60[] class60s = new Class60[i];
	for (int i_5_ = 0; i_5_ < class60s.length; i_5_++)
	    class60s[i_5_] = method1423(i_4_);
	return class60s;
    }
    
    synchronized void method1401(boolean bool) {
	((Class57) this).aBool782 = bool;
    }
    
    void method1402(Class60 class60) {
	if (class60 != null) {
	    synchronized (aClass129_802) {
		((Class60) class60).aBool1017 = false;
	    }
	}
    }
    
    void method1403(byte[] is, int i) {
	((Class57) this).anInt786 = 0;
	if (!method154()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_6_ = 0;
	    if (method1409(is, i, 1))
		i_6_ = 1;
	    else if (method1409(is, i, 3))
		i_6_ = 3;
	    else if (method1409(is, i, 5))
		i_6_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_6_).toString());
	    if (i_6_ == 1) {
		method1430(is, i + 7);
		int i_7_ = method1441(32);
		((Class57) this).anInt743 = method1441(8);
		((Class57) this).anInt796 = method1441(32);
		((Class57) this).anInt801 = method1441(32);
		((Class57) this).anInt742 = method1441(32);
		((Class57) this).anInt762 = method1441(32);
		((Class57) this).anInt753 = 1 << method1441(4);
		((Class57) this).anInt741 = 1 << method1441(4);
		int i_8_ = 1 << method1441(1);
		if (i_7_ != 0 || i_8_ == 0)
		    throw new RuntimeException("");
		((Class57) this).aBool781 = true;
		((Class57) this).anInt763++;
	    } else if (i_6_ != 3 && i_6_ == 5) {
		if (!method1409(is, i, 5))
		    throw new RuntimeException("");
		method1430(is, i + 7);
		if (((Class57) this).aClass60Array746 != null) {
		    method1435(((Class57) this).aClass60Array746);
		    ((Class57) this).aClass60Array746 = null;
		}
		((Class57) this).aClass60Array746
		    = method1400(((Class57) this).anInt743,
				 ((Class57) this).anInt741);
		for (int i_9_ = 0; i_9_ < 2; i_9_++) {
		    int i_10_ = (i_9_ != 0 ? ((Class57) this).anInt741
				 : ((Class57) this).anInt753);
		    int i_11_ = i_10_ >> 1;
		    int i_12_ = i_10_ >> 2;
		    int i_13_ = i_10_ >> 3;
		    Class60 class60 = method1423(i_11_);
		    for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
			((Class60) class60).aFloatArray1018[2 * i_14_]
			    = (float) Math.cos((double) (4 * i_14_)
					       * 3.141592653589793
					       / (double) i_10_);
			((Class60) class60).aFloatArray1018[2 * i_14_ + 1]
			    = -(float) Math.sin((double) (4 * i_14_)
						* 3.141592653589793
						/ (double) i_10_);
		    }
		    Class60 class60_15_ = method1423(i_11_);
		    for (int i_16_ = 0; i_16_ < i_12_; i_16_++) {
			((Class60) class60_15_).aFloatArray1018[2 * i_16_]
			    = (float) Math.cos((double) (2 * i_16_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_10_));
			((Class60) class60_15_).aFloatArray1018[2 * i_16_ + 1]
			    = (float) Math.sin((double) (2 * i_16_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_10_));
		    }
		    Class60 class60_17_ = method1423(i_12_);
		    for (int i_18_ = 0; i_18_ < i_13_; i_18_++) {
			((Class60) class60_17_).aFloatArray1018[2 * i_18_]
			    = (float) Math.cos((double) (4 * i_18_ + 2)
					       * 3.141592653589793
					       / (double) i_10_);
			((Class60) class60_17_).aFloatArray1018[2 * i_18_ + 1]
			    = -(float) Math.sin((double) (4 * i_18_ + 2)
						* 3.141592653589793
						/ (double) i_10_);
		    }
		    int[] is_19_ = new int[i_13_];
		    int i_20_ = Class436.method7795(i_13_ - 1, (byte) -2);
		    for (int i_21_ = 0; i_21_ < i_13_; i_21_++)
			is_19_[i_21_]
			    = Class199.method4043(i_21_, i_20_, (short) 9809);
		    if (i_9_ != 0) {
			((Class57) this).aClass60_797 = class60;
			((Class57) this).aClass60_745 = class60_15_;
			((Class57) this).aClass60_771 = class60_17_;
			((Class57) this).anIntArray773 = is_19_;
		    } else {
			((Class57) this).aClass60_766 = class60;
			((Class57) this).aClass60_799 = class60_15_;
			((Class57) this).aClass60_806 = class60_17_;
			((Class57) this).anIntArray765 = is_19_;
		    }
		}
		method1413();
		int i_22_ = method1441(6) + 1;
		for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
		    method1441(16);
		i_22_ = method1441(6) + 1;
		if (((Class57) this).aClass51Array756 == null
		    || ((Class57) this).aClass51Array756.length != i_22_)
		    ((Class57) this).aClass51Array756 = new Class51[i_22_];
		for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
		    if (((Class57) this).aClass51Array756[i_24_] == null)
			((Class57) this).aClass51Array756[i_24_]
			    = new Class51();
		    ((Class57) this).aClass51Array756[i_24_]
			.method1258(this, ((Class57) this).anInt743);
		}
		int i_25_ = method1441(6) + 1;
		if (((Class57) this).aClass45Array757 == null
		    || ((Class57) this).aClass45Array757.length != i_25_)
		    ((Class57) this).aClass45Array757 = new Class45[i_25_];
		for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
		    if (((Class57) this).aClass45Array757[i_26_] == null)
			((Class57) this).aClass45Array757[i_26_]
			    = new Class45();
		    ((Class57) this).aClass45Array757[i_26_].method1109(this);
		}
		int i_27_ = method1441(6) + 1;
		if (((Class57) this).aClass36Array758 == null
		    || ((Class57) this).aClass36Array758.length != i_27_)
		    ((Class57) this).aClass36Array758 = new Class36[i_27_];
		for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
		    if (((Class57) this).aClass36Array758[i_28_] == null)
			((Class57) this).aClass36Array758[i_28_]
			    = new Class36();
		    ((Class57) this).aClass36Array758[i_28_].method1005(this);
		}
		int i_29_ = method1441(6) + 1;
		((Class57) this).aBoolArray759 = new boolean[i_29_];
		((Class57) this).anIntArray760 = new int[i_29_];
		for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
		    ((Class57) this).aBoolArray759[i_30_] = method1411() != 0;
		    method1441(16);
		    method1441(16);
		    ((Class57) this).anIntArray760[i_30_] = method1441(8);
		}
		method1401(true);
	    }
	}
    }
    
    synchronized void method1404(boolean bool) {
	if (!bool) {
	    ((Class57) this).anInt753 = 0;
	    ((Class57) this).anInt741 = 0;
	    ((Class57) this).aBoolArray759 = null;
	    ((Class57) this).anIntArray760 = null;
	    method1435(((Class57) this).aClass60Array798);
	    ((Class57) this).aClass60Array798 = null;
	    method1435(((Class57) this).aClass60Array761);
	    ((Class57) this).aClass60Array761 = null;
	    ((Class57) this).anInt767 = 0;
	    ((Class57) this).anInt777 = 0;
	    ((Class57) this).aBoolArray764 = null;
	    method1435(((Class57) this).aClass60Array746);
	    ((Class57) this).aClass60Array746 = null;
	    method1402(((Class57) this).aClass60_766);
	    method1402(((Class57) this).aClass60_799);
	    method1402(((Class57) this).aClass60_806);
	    method1402(((Class57) this).aClass60_797);
	    method1402(((Class57) this).aClass60_745);
	    method1402(((Class57) this).aClass60_771);
	    ((Class57) this).aClass60_766 = null;
	    ((Class57) this).aClass60_799 = null;
	    ((Class57) this).aClass60_806 = null;
	    ((Class57) this).aClass60_797 = null;
	    ((Class57) this).aClass60_745 = null;
	    ((Class57) this).aClass60_771 = null;
	    ((Class57) this).anIntArray765 = null;
	    ((Class57) this).anIntArray773 = null;
	}
	((Class57) this).anInt786 = 0;
	Iterator iterator = ((Class57) this).aList775.iterator();
	while (iterator.hasNext()) {
	    RSByteBuffer class241_sub3 = (RSByteBuffer) iterator.next();
	    class241_sub3.method14618(-174251917);
	}
	((Class57) this).aList775.clear();
	((Class57) this).aBool774 = false;
	if (((Class57) this).aClass241_Sub3_776 != null) {
	    synchronized (((Class57) this).aClass241_Sub3_776) {
		((Class57) this).aClass241_Sub3_776.method14618(-174251917);
		((Class57) this).aClass241_Sub3_776 = null;
	    }
	}
	((Class57) this).anInt795 = 0;
	((Class57) this).anInt778 = 0;
	if (!bool) {
	    synchronized (((Class57) this).aList779) {
		Iterator iterator_31_ = ((Class57) this).aList779.iterator();
		while (iterator_31_.hasNext()) {
		    RSByteBuffer class241_sub3
			= (RSByteBuffer) iterator_31_.next();
		    class241_sub3.method14618(-174251917);
		}
		((Class57) this).aList779.clear();
	    }
	    ((Class57) this).anInt800 = 0;
	}
	synchronized (((Class57) this).aList768) {
	    Iterator iterator_32_ = ((Class57) this).aList768.iterator();
	    while (iterator_32_.hasNext()) {
		RSByteBuffer class241_sub3
		    = (RSByteBuffer) iterator_32_.next();
		class241_sub3.method14618(-174251917);
	    }
	    ((Class57) this).aList768.clear();
	}
	((Class57) this).aBool780 = false;
	((Class57) this).anInt783 = 0;
	((Class57) this).anInt763 = -1;
	((Class57) this).anInt790 = -1;
	if (!bool) {
	    method1401(false);
	    ((Class57) this).aBool781 = false;
	    ((Class57) this).anInt750 = -1;
	    ((Class57) this).anInt751 = -1;
	    ((Class57) this).anInt791 = 0;
	    ((Class57) this).anInt747 = 0;
	    ((Class57) this).anInt784 = -1;
	    ((Class57) this).anInt785 = -1;
	    ((Class57) this).anInt769 = -1;
	    ((Class57) this).anInt789 = -1;
	    ((Class57) this).aBool787 = false;
	    ((Class57) this).aBool793 = false;
	} else {
	    ((Class57) this).anInt747++;
	    ((Class57) this).aBool787 = true;
	}
    }
    
    void method1405() {
	if (method317() != Class303.aClass303_4788) {
	    method1503();
	    if (method317() == Class303.aClass303_4789)
		method1394(Class303.aClass303_4792);
	}
    }
    
    void method1406(RSByteBuffer class241_sub3) {
	((Class57) this).aList775.add(class241_sub3);
    }
    
    boolean method1407() {
	return ((Class57) this).aBool774;
    }
    
    boolean method1408(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) 54) != 79
	    || class241_sub3.readUnsignedByte((byte) 36) != 103
	    || class241_sub3.readUnsignedByte((byte) -26) != 103
	    || class241_sub3.readUnsignedByte((byte) 33) != 83)
	    return false;
	return true;
    }
    
    boolean method1409(byte[] is, int i, int i_33_) {
	if (is[i] != i_33_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    public Class329 method326() {
	return ((Class57) this).aClass329_748;
    }
    
    RSByteBuffer method1410(int i) {
	RSByteBuffer class241_sub3 = method1438(method287(i));
	int i_34_ = i;
	synchronized (((Class57) this).aList779) {
	    while (!((Class57) this).aList779.isEmpty()) {
		RSByteBuffer class241_sub3_35_
		    = (RSByteBuffer) ((Class57) this).aList779.remove(0);
		((Class57) this).anInt800
		    -= (method200(class241_sub3_35_.pointer * 421967667)
			/ method223());
		int i_36_ = method287(i_34_);
		int i_37_
		    = (class241_sub3_35_.pointer * 421967667 < i_36_
		       ? class241_sub3_35_.pointer * 421967667 : i_36_);
		class241_sub3.writeBytes(class241_sub3_35_.payload, 0,
					  i_37_, 752061035);
		i_34_ -= method200(i_37_);
		int i_38_ = class241_sub3_35_.pointer * 421967667 - i_37_;
		if (i_38_ != 0) {
		    System.arraycopy(class241_sub3_35_.payload, i_37_,
				     class241_sub3_35_.payload, 0,
				     i_38_);
		    class241_sub3_35_.pointer = i_38_ * -681042949;
		    ((Class57) this).anInt800
			+= method200(i_38_) / method223();
		    ((Class57) this).aList779.add(0, class241_sub3_35_);
		} else
		    class241_sub3_35_.method14618(-174251917);
		if (i_34_ <= 0)
		    break;
	    }
	    if (((Class57) this).aList779.isEmpty()
		&& method317() == Class303.aClass303_4788)
		method1394(Class303.aClass303_4793);
	}
	return class241_sub3;
    }
    
    public void method320(RSByteBuffer class241_sub3) {
	if (method317() == Class303.aClass303_4788
	    || method317() == Class303.aClass303_4793) {
	    if (class241_sub3 != null)
		class241_sub3.method14618(-174251917);
	} else if (class241_sub3 == null) {
	    boolean bool = (((Class57) this).aBool793
			    && ((((Class57) this).anInt791 > 0
				 && (((Class57) this).anInt747
				     < ((Class57) this).anInt791))
				|| ((Class57) this).anInt791 < 0));
	    if (((Class57) this).aList779.isEmpty()) {
		if (!bool) {
		    method1416();
		    method1394(Class303.aClass303_4793);
		}
	    } else if (!bool) {
		method1416();
		method1394(Class303.aClass303_4788);
	    }
	    if (bool)
		method1404(true);
	} else
	    method1417(class241_sub3);
    }
    
    public void method294() {
	if (method317() == Class303.aClass303_4794
	    || method317() == Class303.aClass303_4790
	    || method317() == Class303.aClass303_4792) {
	    method1394(Class303.aClass303_4789);
	    method1405();
	}
    }
    
    int method1411() {
	int i = ((((Class57) this).aByteArray803[((Class57) this).anInt804]
		  >> ((Class57) this).anInt805)
		 & 0x1);
	((Class57) this).anInt805++;
	((Class57) this).anInt804 += ((Class57) this).anInt805 >> 3;
	((Class57) this).anInt805 &= 0x7;
	return i;
    }
    
    void method1412() {
	((Class57) this).aByteArray803 = null;
    }
    
    public void method298(RSByteBuffer class241_sub3) {
	if (method317() == Class303.aClass303_4788
	    || method317() == Class303.aClass303_4793) {
	    if (class241_sub3 != null)
		class241_sub3.method14618(-174251917);
	} else if (class241_sub3 == null) {
	    boolean bool = (((Class57) this).aBool793
			    && ((((Class57) this).anInt791 > 0
				 && (((Class57) this).anInt747
				     < ((Class57) this).anInt791))
				|| ((Class57) this).anInt791 < 0));
	    if (((Class57) this).aList779.isEmpty()) {
		if (!bool) {
		    method1416();
		    method1394(Class303.aClass303_4793);
		}
	    } else if (!bool) {
		method1416();
		method1394(Class303.aClass303_4788);
	    }
	    if (bool)
		method1404(true);
	} else
	    method1417(class241_sub3);
    }
    
    void method1413() {
	int i = method1441(8) + 1;
	Iterator iterator = aList788.iterator();
	while (iterator.hasNext()) {
	    Class48 class48 = (Class48) iterator.next();
	    if (((Class48) class48).anInt640 == 0
		&& ((Class48) class48).anInt636 == 0) {
		if (((Class48) class48).aClass34Array641.length == i
		    && (((Class48) class48).anInt639
			== ((Class57) this).anInt743)
		    && (((Class48) class48).anInt637
			== ((Class57) this).anInt796)
		    && (((Class48) class48).anInt638
			== ((Class57) this).anInt742)) {
		    ((Class57) this).aClass34Array755
			= ((Class48) class48).aClass34Array641;
		    for (int i_39_ = 0;
			 i_39_ < ((Class57) this).aClass34Array755.length;
			 i_39_++)
			((Class57) this).aClass34Array755[i_39_]
			    .method978(this);
		    return;
		}
	    }
	}
	((Class57) this).aClass34Array755 = new Class34[i];
	for (int i_40_ = 0; i_40_ < i; i_40_++) {
	    if (((Class57) this).aClass34Array755[i_40_] == null)
		((Class57) this).aClass34Array755[i_40_] = new Class34();
	    ((Class57) this).aClass34Array755[i_40_].method979(this);
	}
	Class48 class48
	    = new Class48(((Class57) this).anInt743, ((Class57) this).anInt796,
			  ((Class57) this).anInt801, ((Class57) this).anInt762,
			  ((Class57) this).anInt742,
			  ((Class57) this).aClass34Array755);
	aList788.add(class48);
    }
    
    void method1414(byte[] is, int i) {
	((Class57) this).anInt786 = 0;
	if (!method154()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_41_ = 0;
	    if (method1409(is, i, 1))
		i_41_ = 1;
	    else if (method1409(is, i, 3))
		i_41_ = 3;
	    else if (method1409(is, i, 5))
		i_41_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_41_).toString());
	    if (i_41_ == 1) {
		method1430(is, i + 7);
		int i_42_ = method1441(32);
		((Class57) this).anInt743 = method1441(8);
		((Class57) this).anInt796 = method1441(32);
		((Class57) this).anInt801 = method1441(32);
		((Class57) this).anInt742 = method1441(32);
		((Class57) this).anInt762 = method1441(32);
		((Class57) this).anInt753 = 1 << method1441(4);
		((Class57) this).anInt741 = 1 << method1441(4);
		int i_43_ = 1 << method1441(1);
		if (i_42_ != 0 || i_43_ == 0)
		    throw new RuntimeException("");
		((Class57) this).aBool781 = true;
		((Class57) this).anInt763++;
	    } else if (i_41_ != 3 && i_41_ == 5) {
		if (!method1409(is, i, 5))
		    throw new RuntimeException("");
		method1430(is, i + 7);
		if (((Class57) this).aClass60Array746 != null) {
		    method1435(((Class57) this).aClass60Array746);
		    ((Class57) this).aClass60Array746 = null;
		}
		((Class57) this).aClass60Array746
		    = method1400(((Class57) this).anInt743,
				 ((Class57) this).anInt741);
		for (int i_44_ = 0; i_44_ < 2; i_44_++) {
		    int i_45_ = (i_44_ != 0 ? ((Class57) this).anInt741
				 : ((Class57) this).anInt753);
		    int i_46_ = i_45_ >> 1;
		    int i_47_ = i_45_ >> 2;
		    int i_48_ = i_45_ >> 3;
		    Class60 class60 = method1423(i_46_);
		    for (int i_49_ = 0; i_49_ < i_47_; i_49_++) {
			((Class60) class60).aFloatArray1018[2 * i_49_]
			    = (float) Math.cos((double) (4 * i_49_)
					       * 3.141592653589793
					       / (double) i_45_);
			((Class60) class60).aFloatArray1018[2 * i_49_ + 1]
			    = -(float) Math.sin((double) (4 * i_49_)
						* 3.141592653589793
						/ (double) i_45_);
		    }
		    Class60 class60_50_ = method1423(i_46_);
		    for (int i_51_ = 0; i_51_ < i_47_; i_51_++) {
			((Class60) class60_50_).aFloatArray1018[2 * i_51_]
			    = (float) Math.cos((double) (2 * i_51_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_45_));
			((Class60) class60_50_).aFloatArray1018[2 * i_51_ + 1]
			    = (float) Math.sin((double) (2 * i_51_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_45_));
		    }
		    Class60 class60_52_ = method1423(i_47_);
		    for (int i_53_ = 0; i_53_ < i_48_; i_53_++) {
			((Class60) class60_52_).aFloatArray1018[2 * i_53_]
			    = (float) Math.cos((double) (4 * i_53_ + 2)
					       * 3.141592653589793
					       / (double) i_45_);
			((Class60) class60_52_).aFloatArray1018[2 * i_53_ + 1]
			    = -(float) Math.sin((double) (4 * i_53_ + 2)
						* 3.141592653589793
						/ (double) i_45_);
		    }
		    int[] is_54_ = new int[i_48_];
		    int i_55_ = Class436.method7795(i_48_ - 1, (byte) -64);
		    for (int i_56_ = 0; i_56_ < i_48_; i_56_++)
			is_54_[i_56_]
			    = Class199.method4043(i_56_, i_55_, (short) 5613);
		    if (i_44_ != 0) {
			((Class57) this).aClass60_797 = class60;
			((Class57) this).aClass60_745 = class60_50_;
			((Class57) this).aClass60_771 = class60_52_;
			((Class57) this).anIntArray773 = is_54_;
		    } else {
			((Class57) this).aClass60_766 = class60;
			((Class57) this).aClass60_799 = class60_50_;
			((Class57) this).aClass60_806 = class60_52_;
			((Class57) this).anIntArray765 = is_54_;
		    }
		}
		method1413();
		int i_57_ = method1441(6) + 1;
		for (int i_58_ = 0; i_58_ < i_57_; i_58_++)
		    method1441(16);
		i_57_ = method1441(6) + 1;
		if (((Class57) this).aClass51Array756 == null
		    || ((Class57) this).aClass51Array756.length != i_57_)
		    ((Class57) this).aClass51Array756 = new Class51[i_57_];
		for (int i_59_ = 0; i_59_ < i_57_; i_59_++) {
		    if (((Class57) this).aClass51Array756[i_59_] == null)
			((Class57) this).aClass51Array756[i_59_]
			    = new Class51();
		    ((Class57) this).aClass51Array756[i_59_]
			.method1258(this, ((Class57) this).anInt743);
		}
		int i_60_ = method1441(6) + 1;
		if (((Class57) this).aClass45Array757 == null
		    || ((Class57) this).aClass45Array757.length != i_60_)
		    ((Class57) this).aClass45Array757 = new Class45[i_60_];
		for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
		    if (((Class57) this).aClass45Array757[i_61_] == null)
			((Class57) this).aClass45Array757[i_61_]
			    = new Class45();
		    ((Class57) this).aClass45Array757[i_61_].method1109(this);
		}
		int i_62_ = method1441(6) + 1;
		if (((Class57) this).aClass36Array758 == null
		    || ((Class57) this).aClass36Array758.length != i_62_)
		    ((Class57) this).aClass36Array758 = new Class36[i_62_];
		for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
		    if (((Class57) this).aClass36Array758[i_63_] == null)
			((Class57) this).aClass36Array758[i_63_]
			    = new Class36();
		    ((Class57) this).aClass36Array758[i_63_].method1005(this);
		}
		int i_64_ = method1441(6) + 1;
		((Class57) this).aBoolArray759 = new boolean[i_64_];
		((Class57) this).anIntArray760 = new int[i_64_];
		for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
		    ((Class57) this).aBoolArray759[i_65_] = method1411() != 0;
		    method1441(16);
		    method1441(16);
		    ((Class57) this).anIntArray760[i_65_] = method1441(8);
		}
		method1401(true);
	    }
	}
    }
    
    int method1415(int i) {
	int i_66_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_66_++;
	return i_66_;
    }
    
    void method1416() {
	((Class57) this).aByteArray803 = null;
    }
    
    public int method322() {
	if (((Class57) this).aBool781)
	    return (method1396() < ((Class57) this).anInt749
		    ? ((Class57) this).anInt749 : method1396());
	throw new RuntimeException("");
    }
    
    synchronized void method1417(RSByteBuffer class241_sub3) {
	((Class57) this).aList768.add(class241_sub3);
	method1394(Class303.aClass303_4792);
    }
    
    public synchronized boolean method323() {
	return ((Class57) this).aBool782;
    }
    
    int method1418(float f) {
	int i = (int) (f * 32767.0F);
	if (i > 32767)
	    return 32767;
	if (i < -32768)
	    return -32768;
	return i;
    }
    
    int method1419(float f) {
	int i = (int) (f * 32767.0F + 32768.0F);
	if (i > 65535)
	    return 65535;
	if (i < 0)
	    return 0;
	return i;
    }
    
    int method1420() {
	return ((Class57) this).anInt800;
    }
    
    int method1421(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    RSByteBuffer method1422(int i) {
	RSByteBuffer class241_sub3 = method1438(method287(i));
	int i_67_ = i;
	synchronized (((Class57) this).aList779) {
	    while (!((Class57) this).aList779.isEmpty()) {
		RSByteBuffer class241_sub3_68_
		    = (RSByteBuffer) ((Class57) this).aList779.remove(0);
		((Class57) this).anInt800
		    -= (method200(class241_sub3_68_.pointer * 421967667)
			/ method223());
		int i_69_ = method287(i_67_);
		int i_70_
		    = (class241_sub3_68_.pointer * 421967667 < i_69_
		       ? class241_sub3_68_.pointer * 421967667 : i_69_);
		class241_sub3.writeBytes(class241_sub3_68_.payload, 0,
					  i_70_, 752061035);
		i_67_ -= method200(i_70_);
		int i_71_ = class241_sub3_68_.pointer * 421967667 - i_70_;
		if (i_71_ != 0) {
		    System.arraycopy(class241_sub3_68_.payload, i_70_,
				     class241_sub3_68_.payload, 0,
				     i_71_);
		    class241_sub3_68_.pointer = i_71_ * -681042949;
		    ((Class57) this).anInt800
			+= method200(i_71_) / method223();
		    ((Class57) this).aList779.add(0, class241_sub3_68_);
		} else
		    class241_sub3_68_.method14618(-174251917);
		if (i_67_ <= 0)
		    break;
	    }
	    if (((Class57) this).aList779.isEmpty()
		&& method317() == Class303.aClass303_4788)
		method1394(Class303.aClass303_4793);
	}
	return class241_sub3;
    }
    
    Class60 method1423(int i) {
	synchronized (aClass129_802) {
	    Object object = null;
	    Class60 class60 = (Class60) aClass129_802.method3033((byte) 2);
	    Class60 class60_72_ = null;
	    int i_73_ = i;
	    for (/**/; class60 != null;
		 class60 = (Class60) aClass129_802.method3034(1638462798)) {
		if (((Class60) class60).aFloatArray1018.length > i
		    && !((Class60) class60).aBool1017
		    && (class60_72_ == null
			|| (((Class60) class60).aFloatArray1018.length
			    < i_73_))) {
		    class60_72_ = class60;
		    i_73_ = ((Class60) class60_72_).aFloatArray1018.length;
		}
		if (((Class60) class60).aFloatArray1018.length == i
		    && !((Class60) class60).aBool1017)
		    break;
	    }
	    if (class60 == null)
		class60 = class60_72_;
	    if (class60 == null) {
		class60 = new Class60(this);
		int i_74_ = 0;
		boolean bool = false;
		while (!bool && i_74_ < 1000) {
		    if (aClass129_802.get((long) i_74_) != null)
			i_74_++;
		    else
			bool = true;
		}
		((Class60) class60).anInt1015 = i_74_;
		float[] fs = new float[i];
		((Class60) class60).aFloatArray1018 = fs;
		((Class60) class60).aBool1017 = true;
		((Class60) class60).anInt1016 = i;
		if (aClass129_802.method3028(1579587767) >= i * 4) {
		    /* empty */
		}
		aClass129_802.method3026(class60,
					 (long) ((Class60) class60).anInt1015,
					 fs.length * 4, -1452664704);
	    } else {
		for (int i_75_ = 0;
		     i_75_ < ((Class60) class60).aFloatArray1018.length;
		     i_75_++)
		    ((Class60) class60).aFloatArray1018[i_75_] = 0.0F;
		((Class60) class60).anInt1016 = i;
	    }
	    ((Class60) class60).aBool1017 = true;
	    Class60 class60_76_ = class60;
	    return class60_76_;
	}
    }
    
    int method1424() {
	return ((Class57) this).anInt800;
    }
    
    public void method283(boolean bool, int i, int i_77_, int i_78_) {
	((Class57) this).aBool793 = bool;
	((Class57) this).anInt791 = i;
	((Class57) this).anInt750 = i_77_;
	((Class57) this).anInt751 = i_78_;
    }
    
    float method1425(int i) {
	int i_79_ = i & 0x1fffff;
	int i_80_ = i & ~0x7fffffff;
	int i_81_ = (i & 0x7fe00000) >> 21;
	if (i_80_ != 0)
	    i_79_ = -i_79_;
	return (float) ((double) i_79_
			* Math.pow(2.0, (double) (i_81_ - 788)));
    }
    
    boolean method1426(byte[] is, int i, int i_82_) {
	if (is[i] != i_82_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    public void method291(boolean bool) {
	if (!bool)
	    method190();
	else if (method317() == Class303.aClass303_4793) {
	    method1404(true);
	    method1394(Class303.aClass303_4792);
	}
    }
    
    int method1427() {
	return ((Class57) this).anInt804;
    }
    
    int method1428(int i) {
	int i_83_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_83_++;
	return i_83_;
    }
    
    void method1429(RSByteBuffer class241_sub3) {
	((Class57) this).aList775.add(class241_sub3);
    }
    
    void method1430(byte[] is, int i) {
	((Class57) this).aByteArray803 = is;
	((Class57) this).anInt804 = i;
	((Class57) this).anInt805 = 0;
    }
    
    public void method296(Interface34 interface34) {
	((Class57) this).anInterface34_744 = interface34;
    }
    
    void method1431(byte[] is, int i) {
	((Class57) this).anInt786 = 0;
	if (!method154()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_84_ = 0;
	    if (method1409(is, i, 1))
		i_84_ = 1;
	    else if (method1409(is, i, 3))
		i_84_ = 3;
	    else if (method1409(is, i, 5))
		i_84_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_84_).toString());
	    if (i_84_ == 1) {
		method1430(is, i + 7);
		int i_85_ = method1441(32);
		((Class57) this).anInt743 = method1441(8);
		((Class57) this).anInt796 = method1441(32);
		((Class57) this).anInt801 = method1441(32);
		((Class57) this).anInt742 = method1441(32);
		((Class57) this).anInt762 = method1441(32);
		((Class57) this).anInt753 = 1 << method1441(4);
		((Class57) this).anInt741 = 1 << method1441(4);
		int i_86_ = 1 << method1441(1);
		if (i_85_ != 0 || i_86_ == 0)
		    throw new RuntimeException("");
		((Class57) this).aBool781 = true;
		((Class57) this).anInt763++;
	    } else if (i_84_ != 3 && i_84_ == 5) {
		if (!method1409(is, i, 5))
		    throw new RuntimeException("");
		method1430(is, i + 7);
		if (((Class57) this).aClass60Array746 != null) {
		    method1435(((Class57) this).aClass60Array746);
		    ((Class57) this).aClass60Array746 = null;
		}
		((Class57) this).aClass60Array746
		    = method1400(((Class57) this).anInt743,
				 ((Class57) this).anInt741);
		for (int i_87_ = 0; i_87_ < 2; i_87_++) {
		    int i_88_ = (i_87_ != 0 ? ((Class57) this).anInt741
				 : ((Class57) this).anInt753);
		    int i_89_ = i_88_ >> 1;
		    int i_90_ = i_88_ >> 2;
		    int i_91_ = i_88_ >> 3;
		    Class60 class60 = method1423(i_89_);
		    for (int i_92_ = 0; i_92_ < i_90_; i_92_++) {
			((Class60) class60).aFloatArray1018[2 * i_92_]
			    = (float) Math.cos((double) (4 * i_92_)
					       * 3.141592653589793
					       / (double) i_88_);
			((Class60) class60).aFloatArray1018[2 * i_92_ + 1]
			    = -(float) Math.sin((double) (4 * i_92_)
						* 3.141592653589793
						/ (double) i_88_);
		    }
		    Class60 class60_93_ = method1423(i_89_);
		    for (int i_94_ = 0; i_94_ < i_90_; i_94_++) {
			((Class60) class60_93_).aFloatArray1018[2 * i_94_]
			    = (float) Math.cos((double) (2 * i_94_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_88_));
			((Class60) class60_93_).aFloatArray1018[2 * i_94_ + 1]
			    = (float) Math.sin((double) (2 * i_94_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_88_));
		    }
		    Class60 class60_95_ = method1423(i_90_);
		    for (int i_96_ = 0; i_96_ < i_91_; i_96_++) {
			((Class60) class60_95_).aFloatArray1018[2 * i_96_]
			    = (float) Math.cos((double) (4 * i_96_ + 2)
					       * 3.141592653589793
					       / (double) i_88_);
			((Class60) class60_95_).aFloatArray1018[2 * i_96_ + 1]
			    = -(float) Math.sin((double) (4 * i_96_ + 2)
						* 3.141592653589793
						/ (double) i_88_);
		    }
		    int[] is_97_ = new int[i_91_];
		    int i_98_ = Class436.method7795(i_91_ - 1, (byte) -71);
		    for (int i_99_ = 0; i_99_ < i_91_; i_99_++)
			is_97_[i_99_]
			    = Class199.method4043(i_99_, i_98_, (short) 16034);
		    if (i_87_ != 0) {
			((Class57) this).aClass60_797 = class60;
			((Class57) this).aClass60_745 = class60_93_;
			((Class57) this).aClass60_771 = class60_95_;
			((Class57) this).anIntArray773 = is_97_;
		    } else {
			((Class57) this).aClass60_766 = class60;
			((Class57) this).aClass60_799 = class60_93_;
			((Class57) this).aClass60_806 = class60_95_;
			((Class57) this).anIntArray765 = is_97_;
		    }
		}
		method1413();
		int i_100_ = method1441(6) + 1;
		for (int i_101_ = 0; i_101_ < i_100_; i_101_++)
		    method1441(16);
		i_100_ = method1441(6) + 1;
		if (((Class57) this).aClass51Array756 == null
		    || ((Class57) this).aClass51Array756.length != i_100_)
		    ((Class57) this).aClass51Array756 = new Class51[i_100_];
		for (int i_102_ = 0; i_102_ < i_100_; i_102_++) {
		    if (((Class57) this).aClass51Array756[i_102_] == null)
			((Class57) this).aClass51Array756[i_102_]
			    = new Class51();
		    ((Class57) this).aClass51Array756[i_102_]
			.method1258(this, ((Class57) this).anInt743);
		}
		int i_103_ = method1441(6) + 1;
		if (((Class57) this).aClass45Array757 == null
		    || ((Class57) this).aClass45Array757.length != i_103_)
		    ((Class57) this).aClass45Array757 = new Class45[i_103_];
		for (int i_104_ = 0; i_104_ < i_103_; i_104_++) {
		    if (((Class57) this).aClass45Array757[i_104_] == null)
			((Class57) this).aClass45Array757[i_104_]
			    = new Class45();
		    ((Class57) this).aClass45Array757[i_104_].method1109(this);
		}
		int i_105_ = method1441(6) + 1;
		if (((Class57) this).aClass36Array758 == null
		    || ((Class57) this).aClass36Array758.length != i_105_)
		    ((Class57) this).aClass36Array758 = new Class36[i_105_];
		for (int i_106_ = 0; i_106_ < i_105_; i_106_++) {
		    if (((Class57) this).aClass36Array758[i_106_] == null)
			((Class57) this).aClass36Array758[i_106_]
			    = new Class36();
		    ((Class57) this).aClass36Array758[i_106_].method1005(this);
		}
		int i_107_ = method1441(6) + 1;
		((Class57) this).aBoolArray759 = new boolean[i_107_];
		((Class57) this).anIntArray760 = new int[i_107_];
		for (int i_108_ = 0; i_108_ < i_107_; i_108_++) {
		    ((Class57) this).aBoolArray759[i_108_] = method1411() != 0;
		    method1441(16);
		    method1441(16);
		    ((Class57) this).anIntArray760[i_108_] = method1441(8);
		}
		method1401(true);
	    }
	}
    }
    
    synchronized void method1432() {
	int i = (((Class57) this).aClass241_Sub3_776 != null
		 ? ((Class57) this).aClass241_Sub3_776.pointer * 421967667
		 : 0);
	int i_109_ = 0;
	Iterator iterator = ((Class57) this).aList775.iterator();
	while (iterator.hasNext()) {
	    RSByteBuffer class241_sub3 = (RSByteBuffer) iterator.next();
	    i_109_ += class241_sub3.pointer * 421967667;
	}
	if (((Class57) this).aClass241_Sub3_776 != null) {
	    if ((((Class57) this).aClass241_Sub3_776.payload.length
		 - ((Class57) this).aClass241_Sub3_776.pointer * 421967667)
		< i_109_) {
		RSByteBuffer class241_sub3
		    = method1438(i_109_ + ((Class57) this).anInt795);
		class241_sub3.writeBytes
		    (((Class57) this).aClass241_Sub3_776.payload,
		     (((Class57) this).aClass241_Sub3_776.pointer * 421967667
		      - ((Class57) this).anInt778),
		     ((Class57) this).anInt795, 752061035);
		((Class57) this).aClass241_Sub3_776.method14618(-174251917);
		((Class57) this).aClass241_Sub3_776 = class241_sub3;
		i = ((Class57) this).anInt778;
	    }
	} else {
	    ((Class57) this).aClass241_Sub3_776 = method1438(i_109_);
	    ((Class57) this).anInt795 = 0;
	    i = 0;
	}
	iterator = ((Class57) this).aList775.iterator();
	while (iterator.hasNext()) {
	    RSByteBuffer class241_sub3 = (RSByteBuffer) iterator.next();
	    ((Class57) this).aClass241_Sub3_776.writeBytes
		(class241_sub3.payload, 0,
		 class241_sub3.pointer * 421967667, 752061035);
	    ((Class57) this).anInt795 += class241_sub3.pointer * 421967667;
	    class241_sub3.method14618(-174251917);
	}
	((Class57) this).aClass241_Sub3_776.pointer
	    = (i - ((Class57) this).anInt778) * -681042949;
	((Class57) this).anInt778 = 0;
	((Class57) this).aList775.clear();
	while (((Class57) this).aBool774
	       && (((Class57) this).aClass241_Sub3_776.pointer * 421967667
		   < (((Class57) this).aClass241_Sub3_776
		      .payload).length)) {
	    if (((Class57) this).aBool782
		&& ((float) (((Class57) this).anInt800 / method1397())
		    > ((Class57) this).aFloat792))
		break;
	    if (((Class57) this).aClass241_Sub3_776 == null
		|| ((Class57) this).anInt795 < 27) {
		if (((Class57) this).aClass241_Sub3_776 != null) {
		    ((Class57) this).anInt778 = ((Class57) this).anInt795;
		    ((Class57) this).aClass241_Sub3_776.pointer
			+= ((Class57) this).anInt795 * -681042949;
		}
		((Class57) this).aBool774 = false;
		break;
	    }
	    int i_110_
		= ((Class57) this).aClass241_Sub3_776.pointer * 421967667;
	    int i_111_ = 0;
	    int i_112_ = 0;
	    if (!method1408(((Class57) this).aClass241_Sub3_776))
		break;
	    ((Class57) this).anInt790++;
	    if (((Class57) this).anInt789 < 0)
		((Class57) this).anInt769++;
	    ((Class57) this).aList752.clear();
	    ((Class57) this).aList794.clear();
	    ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) 18);
	    int i_113_
		= ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) -39);
	    int i_114_
		= ((((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) 23)
		    & 0xff)
		   | (((Class57) this).aClass241_Sub3_776
			  .readUnsignedByte((byte) 113)
		      & 0xff) << 8
		   | (((Class57) this).aClass241_Sub3_776
			  .readUnsignedByte((byte) -41)
		      & 0xff) << 16
		   | ((Class57) this).aClass241_Sub3_776
			 .readUnsignedByte((byte) -32) << 24);
	    i_111_ = i_114_ - i_111_;
	    ((Class57) this).aClass241_Sub3_776.pointer += 1988214704;
	    int i_115_
		= ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) -61);
	    int i_116_
		= ((Class57) this).aClass241_Sub3_776.pointer * 421967667;
	    int i_117_ = i_116_ + i_115_;
	    if (i_117_ > i_110_ + ((Class57) this).anInt795) {
		((Class57) this).aClass241_Sub3_776.pointer
		    = (i_110_ + ((Class57) this).anInt795) * -681042949;
		((Class57) this).anInt778
		    = (((Class57) this).aClass241_Sub3_776.pointer
		       * 421967667) - i_110_;
		((Class57) this).aBool774 = false;
	    }
	    int i_118_ = i_117_;
	    int i_119_ = 0;
	    if (((Class57) this).aBool774) {
		for (int i_120_ = 0; i_120_ < i_115_; i_120_++) {
		    int i_121_ = ((((Class57) this).aClass241_Sub3_776
				   .payload[i_116_++])
				  & 0xff);
		    i_117_ += i_121_;
		    i_119_ += i_121_;
		    if (i_117_ > i_110_ + ((Class57) this).anInt795) {
			((Class57) this).aClass241_Sub3_776.pointer
			    = ((i_110_ + ((Class57) this).anInt795)
			       * -681042949);
			((Class57) this).anInt778
			    = (((Class57) this).aClass241_Sub3_776.pointer
			       * 421967667) - i_110_;
			((Class57) this).aBool774 = false;
			break;
		    }
		    if (i_121_ < 255) {
			((Class57) this).aList752.add(Integer.valueOf(i_118_));
			((Class57) this).aList794.add(Integer.valueOf(i_119_));
			i_118_ = i_117_;
			i_119_ = 0;
		    }
		}
	    }
	    if (((Class57) this).aBool774) {
		int i_122_ = i_117_;
		int i_123_ = -1;
		Iterator iterator_124_ = ((Class57) this).aList752.iterator();
		Iterator iterator_125_ = ((Class57) this).aList794.iterator();
		boolean bool = false;
		((Class57) this).anInt772 = 0;
		while (iterator_124_.hasNext()) {
		    Integer integer = (Integer) iterator_124_.next();
		    Integer integer_126_ = (Integer) iterator_125_.next();
		    i_123_++;
		    if (method154() && ((Class57) this).aBool787 == true
			&& (((Class57) this).anInt790
			    < ((Class57) this).anInt769)
			&& i_123_ < ((Class57) this).anInt789) {
			Class57 class57_127_ = this;
			((Class57) class57_127_).anInt783
			    = ((Class57) class57_127_).anInt783 + (bool ? 0
								   : i_111_);
			bool = true;
		    } else {
			((Class57) this).anAtomicReference754.set(null);
			boolean bool_128_
			    = method1476((((Class57) this).aClass241_Sub3_776
					  .payload),
					 integer.intValue(),
					 integer_126_.intValue(),
					 (((Class57) this)
					  .anAtomicReference754));
			Class60[] class60s
			    = ((Class60[])
			       ((Class57) this).anAtomicReference754.get());
			if (bool_128_
			    && (((Class57) this).aBool787 != true
				|| (((Class57) this).anInt790
				    >= ((Class57) this).anInt769)
				|| i_123_ >= ((Class57) this).anInt789)) {
			    if (class60s != null) {
				int i_129_ = ((Class60) class60s[0]).anInt1016;
				((Class57) this).anInt786 += i_129_;
				if (((Class57) this).anInt786 > i_114_
				    && i_113_ == 4) {
				    ((Class57) this).anInt772
					= (((Class57) this).anInt786 - i_114_
					   - ((Class57) this).anInt772);
				    i_129_ -= ((Class57) this).anInt772;
				    if (((Class57) this).anInt772
					> ((Class60) class60s[0]).anInt1016)
					((Class57) this).anInt772
					    = (((Class60) class60s[0])
					       .anInt1016);
				    if (i_129_ < 0)
					i_129_ = 0;
				}
				int i_130_ = 0;
				int i_131_
				    = method287(i_129_) * class60s.length;
				if (((Class57) this).aBool787 == true
				    && (((Class57) this).anInt783
					< ((Class57) this).anInt750)) {
				    int i_132_ = i_131_;
				    i_131_
					-= method287(((Class57) this).anInt750
						     - (((Class57) this)
							.anInt783));
				    if (i_131_ <= 0) {
					((Class57) this).anInt783
					    += method200(i_132_);
					method1435(class60s);
					Object object = null;
					continue;
				    }
				    i_130_ += (((Class57) this).anInt750
					       - ((Class57) this).anInt783);
				}
				if ((((Class57) this).anInt783 + i_129_
				     > ((Class57) this).anInt751)
				    && ((((Class57) this).anInt747
					 < ((Class57) this).anInt791)
					|| ((Class57) this).anInt791 < 0)
				    && ((Class57) this).aBool793) {
				    i_131_
					-= method287(((Class57) this).anInt783
						     + i_129_
						     - (((Class57) this)
							.anInt751)
						     - 1);
				    if (i_131_ <= 0) {
					method1435(class60s);
					Object object = null;
					continue;
				    }
				}
				int i_133_ = method223();
				if (method1396() < method223()) {
				    int i_134_ = method223() - method1396();
				    i_131_ += i_131_ / method1396() * i_134_;
				}
				RSByteBuffer class241_sub3
				    = method1438(i_131_);
				for (int i_135_ = i_130_; i_135_ < i_129_;
				     i_135_++) {
				    boolean bool_136_
					= ((Class57) this).aBool787;
				    if (((Class57) this).anInt791 != 0) {
					if (((Class57) this).anInt783
					    == ((Class57) this).anInt750) {
					    if (((Class57) this).anInt784
						< 0) {
						((Class57) this).anInt784
						    = (((Class57) this)
						       .anInt763);
						((Class57) this).anInt789
						    = i_123_;
					    }
					    ((Class57) this).aBool787 = false;
					}
					if ((((Class57) this).anInt783
					     == ((Class57) this).anInt751)
					    && ((Class57) this).anInt785 < 0)
					    ((Class57) this).anInt785
						= ((Class57) this).anInt763;
					if ((((Class57) this).anInt783
					     > ((Class57) this).anInt751)
					    && ((((Class57) this).anInt747
						 < ((Class57) this).anInt791)
						|| (((Class57) this).anInt791
						    < 0))
					    && ((Class57) this).aBool793)
					    bool_136_ = true;
				    }
				    if (bool_136_
					&& ((((Class57) this).anInt783
					     < ((Class57) this).anInt750)
					    || (((Class57) this).anInt783
						> (((Class57) this)
						   .anInt751)))) {
					((Class57) this).anInt783++;
					if (++i_112_ > i_111_)
					    throw new RuntimeException();
				    } else {
					for (int i_137_ = 0; i_137_ < i_133_;
					     i_137_++) {
					    float f;
					    if (i_137_ < class60s.length)
						f = (((Class60)
						      class60s[i_137_])
						     .aFloatArray1018[i_135_]);
					    else
						f = (((Class60)
						      (class60s
						       [(i_137_
							 % method1396())]))
						     .aFloatArray1018[i_135_]);
					    if (((Class57) this).aClass320_740
						== Class320.aClass320_4878) {
						int i_138_ = method1418(f);
						if ((((Class57) this)
						     .aClass329_748)
						    == Class329.aClass329_5031)
						    class241_sub3.method14621
							(i_138_, (byte) 44);
						else
						    class241_sub3.writeShort
							(i_138_, -484048531);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4874)) {
						int i_139_ = method1419(f);
						if ((((Class57) this)
						     .aClass329_748)
						    == Class329.aClass329_5031)
						    class241_sub3.method14621
							(i_139_, (byte) 100);
						else
						    class241_sub3.writeShort
							(i_139_, -484048531);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4873)) {
						int i_140_ = method1499(f);
						class241_sub3.writeByte
						    (i_140_, -2111127629);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4876)) {
						int i_141_ = method1421(f);
						class241_sub3.writeByte
						    (i_141_, 907989768);
					    }
					}
					((Class57) this).anInt783++;
					i_112_++;
				    }
				}
				synchronized (((Class57) this).aList779) {
				    ((Class57) this).anInt800
					+= (method200(class241_sub3.pointer
						      * 421967667)
					    / method223());
				    ((Class57) this).aList779
					.add(class241_sub3);
				}
			    }
			} else if (method154()) {
			    ((Class57) this).anInt767 = 0;
			    if (((Class57) this).aClass60Array761 == null
				|| (((Class57) this).aClass60Array761 != null
				    && (((((Class57) this)
					  .aClass60Array761).length
					 != ((Class57) this).anInt743)
					|| ((((Class60) (((Class57) this)
							 .aClass60Array761[0]))
					     .anInt1016)
					    != ((Class57) this).anInt741)))) {
				if (((Class57) this).aClass60Array761 != null)
				    method1435(((Class57) this)
					       .aClass60Array761);
				((Class57) this).aClass60Array761
				    = method1400(((Class57) this).anInt743,
						 ((Class57) this).anInt741);
			    }
			}
			method1435(class60s);
			Object object = null;
		    }
		}
		((Class57) this).aClass241_Sub3_776.pointer
		    = i_122_ * -681042949;
		((Class57) this).anInt795 -= i_122_ - i_110_;
	    }
	}
    }
    
    public void method299(RSByteBuffer class241_sub3) {
	if (method317() == Class303.aClass303_4788
	    || method317() == Class303.aClass303_4793) {
	    if (class241_sub3 != null)
		class241_sub3.method14618(-174251917);
	} else if (class241_sub3 == null) {
	    boolean bool = (((Class57) this).aBool793
			    && ((((Class57) this).anInt791 > 0
				 && (((Class57) this).anInt747
				     < ((Class57) this).anInt791))
				|| ((Class57) this).anInt791 < 0));
	    if (((Class57) this).aList779.isEmpty()) {
		if (!bool) {
		    method1416();
		    method1394(Class303.aClass303_4793);
		}
	    } else if (!bool) {
		method1416();
		method1394(Class303.aClass303_4788);
	    }
	    if (bool)
		method1404(true);
	} else
	    method1417(class241_sub3);
    }
    
    public void method300(RSByteBuffer class241_sub3) {
	if (method317() == Class303.aClass303_4788
	    || method317() == Class303.aClass303_4793) {
	    if (class241_sub3 != null)
		class241_sub3.method14618(-174251917);
	} else if (class241_sub3 == null) {
	    boolean bool = (((Class57) this).aBool793
			    && ((((Class57) this).anInt791 > 0
				 && (((Class57) this).anInt747
				     < ((Class57) this).anInt791))
				|| ((Class57) this).anInt791 < 0));
	    if (((Class57) this).aList779.isEmpty()) {
		if (!bool) {
		    method1416();
		    method1394(Class303.aClass303_4793);
		}
	    } else if (!bool) {
		method1416();
		method1394(Class303.aClass303_4788);
	    }
	    if (bool)
		method1404(true);
	} else
	    method1417(class241_sub3);
    }
    
    public void method301(RSByteBuffer class241_sub3) {
	if (method317() == Class303.aClass303_4788
	    || method317() == Class303.aClass303_4793) {
	    if (class241_sub3 != null)
		class241_sub3.method14618(-174251917);
	} else if (class241_sub3 == null) {
	    boolean bool = (((Class57) this).aBool793
			    && ((((Class57) this).anInt791 > 0
				 && (((Class57) this).anInt747
				     < ((Class57) this).anInt791))
				|| ((Class57) this).anInt791 < 0));
	    if (((Class57) this).aList779.isEmpty()) {
		if (!bool) {
		    method1416();
		    method1394(Class303.aClass303_4793);
		}
	    } else if (!bool) {
		method1416();
		method1394(Class303.aClass303_4788);
	    }
	    if (bool)
		method1404(true);
	} else
	    method1417(class241_sub3);
    }
    
    public int method310(int i) {
	return i * (method319().anInt4875 * -32980023 / 8);
    }
    
    boolean method1433(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) 23) != 79
	    || class241_sub3.readUnsignedByte((byte) -73) != 103
	    || class241_sub3.readUnsignedByte((byte) 12) != 103
	    || class241_sub3.readUnsignedByte((byte) -55) != 83)
	    return false;
	return true;
    }
    
    public void method304() {
	if (method317() == Class303.aClass303_4794
	    || method317() == Class303.aClass303_4790
	    || method317() == Class303.aClass303_4792) {
	    method1394(Class303.aClass303_4789);
	    method1405();
	}
    }
    
    public int method305() {
	return method1424();
    }
    
    public int method313() {
	return method1424();
    }
    
    RSByteBuffer method1434(int i) {
	return new RSByteBuffer(i, true);
    }
    
    public int method9() {
	return method1424();
    }
    
    public int method309(int i) {
	return i / (method319().anInt4875 * -32980023 / 8);
    }
    
    void method1435(Class60[] class60s) {
	if (class60s != null) {
	    for (int i = 0; i < class60s.length; i++)
		method1402(class60s[i]);
	}
    }
    
    public int method285(int i) {
	return i * (method319().anInt4875 * -32980023 / 8);
    }
    
    int method1436() {
	if (method154())
	    return ((Class57) this).anInt796;
	throw new RuntimeException("");
    }
    
    void method1437() {
	((Class57) this).aByteArray803 = null;
    }
    
    public Class320 method328() {
	return ((Class57) this).aClass320_740;
    }
    
    RSByteBuffer method1438(int i) {
	return new RSByteBuffer(i, true);
    }
    
    public Class320 method315() {
	return ((Class57) this).aClass320_740;
    }
    
    public Class320 method284() {
	return ((Class57) this).aClass320_740;
    }
    
    public Class320 method303() {
	return ((Class57) this).aClass320_740;
    }
    
    public void method318(int i, Class320 class320, Class329 class329,
			  int i_142_) {
	((Class57) this).anInt749 = i_142_;
	if (method1398(i, class320, class329)) {
	    ((Class57) this).aClass320_740 = class320;
	    ((Class57) this).aClass329_748 = class329;
	} else
	    throw new RuntimeException("");
    }
    
    boolean method1439(int i, Class320 class320, Class329 class329) {
	if (class320 == Class320.aClass320_4878)
	    return true;
	if (class320 == Class320.aClass320_4873)
	    return true;
	if (class320 == Class320.aClass320_4874)
	    return true;
	if (class320 == Class320.aClass320_4876)
	    return true;
	return false;
    }
    
    boolean method1440(int i, Class320 class320, Class329 class329) {
	if (class320 == Class320.aClass320_4878)
	    return true;
	if (class320 == Class320.aClass320_4873)
	    return true;
	if (class320 == Class320.aClass320_4874)
	    return true;
	if (class320 == Class320.aClass320_4876)
	    return true;
	return false;
    }
    
    public void method306(RSByteBuffer class241_sub3) {
	if (method317() == Class303.aClass303_4788
	    || method317() == Class303.aClass303_4793) {
	    if (class241_sub3 != null)
		class241_sub3.method14618(-174251917);
	} else if (class241_sub3 == null) {
	    boolean bool = (((Class57) this).aBool793
			    && ((((Class57) this).anInt791 > 0
				 && (((Class57) this).anInt747
				     < ((Class57) this).anInt791))
				|| ((Class57) this).anInt791 < 0));
	    if (((Class57) this).aList779.isEmpty()) {
		if (!bool) {
		    method1416();
		    method1394(Class303.aClass303_4793);
		}
	    } else if (!bool) {
		method1416();
		method1394(Class303.aClass303_4788);
	    }
	    if (bool)
		method1404(true);
	} else
	    method1417(class241_sub3);
    }
    
    int method1441(int i) {
	int i_143_ = 0;
	int i_144_ = 0;
	int i_145_;
	for (/**/; i >= 8 - ((Class57) this).anInt805; i -= i_145_) {
	    i_145_ = 8 - ((Class57) this).anInt805;
	    int i_146_ = (1 << i_145_) - 1;
	    i_143_
		+= ((((Class57) this).aByteArray803[((Class57) this).anInt804]
		     >> ((Class57) this).anInt805)
		    & i_146_) << i_144_;
	    ((Class57) this).anInt805 = 0;
	    ((Class57) this).anInt804++;
	    i_144_ += i_145_;
	}
	if (i > 0) {
	    i_145_ = (1 << i) - 1;
	    i_143_
		+= ((((Class57) this).aByteArray803[((Class57) this).anInt804]
		     >> ((Class57) this).anInt805)
		    & i_145_) << i_144_;
	    ((Class57) this).anInt805 += i;
	}
	return i_143_;
    }
    
    int method1442() {
	if (((Class57) this).aBool781)
	    return ((Class57) this).anInt743;
	throw new RuntimeException("");
    }
    
    int method1443() {
	if (((Class57) this).aBool781)
	    return ((Class57) this).anInt743;
	throw new RuntimeException("");
    }
    
    public int method200(int i) {
	return i / (method319().anInt4875 * -32980023 / 8);
    }
    
    public int method278() {
	if (((Class57) this).aBool781)
	    return (method1396() < ((Class57) this).anInt749
		    ? ((Class57) this).anInt749 : method1396());
	throw new RuntimeException("");
    }
    
    public int method321() {
	if (((Class57) this).aBool781)
	    return (method1396() < ((Class57) this).anInt749
		    ? ((Class57) this).anInt749 : method1396());
	throw new RuntimeException("");
    }
    
    public int method281() {
	if (((Class57) this).aBool781)
	    return (method1396() < ((Class57) this).anInt749
		    ? ((Class57) this).anInt749 : method1396());
	throw new RuntimeException("");
    }
    
    void method1444(Class60[] class60s) {
	if (class60s != null) {
	    for (int i = 0; i < class60s.length; i++)
		method1402(class60s[i]);
	}
    }
    
    public synchronized boolean method324() {
	return ((Class57) this).aBool782;
    }
    
    synchronized void method1445(boolean bool) {
	((Class57) this).aBool782 = bool;
    }
    
    synchronized void method1446(boolean bool) {
	((Class57) this).aBool782 = bool;
    }
    
    Class60[] method1447(int i, int i_147_) {
	Class60[] class60s = new Class60[i];
	for (int i_148_ = 0; i_148_ < class60s.length; i_148_++)
	    class60s[i_148_] = method1423(i_147_);
	return class60s;
    }
    
    Class60[] method1448(int i, int i_149_) {
	Class60[] class60s = new Class60[i];
	for (int i_150_ = 0; i_150_ < class60s.length; i_150_++)
	    class60s[i_150_] = method1423(i_149_);
	return class60s;
    }
    
    Class60 method1449(int i) {
	synchronized (aClass129_802) {
	    Object object = null;
	    Class60 class60 = (Class60) aClass129_802.method3033((byte) 2);
	    Class60 class60_151_ = null;
	    int i_152_ = i;
	    for (/**/; class60 != null;
		 class60 = (Class60) aClass129_802.method3034(1638462798)) {
		if (((Class60) class60).aFloatArray1018.length > i
		    && !((Class60) class60).aBool1017
		    && (class60_151_ == null
			|| (((Class60) class60).aFloatArray1018.length
			    < i_152_))) {
		    class60_151_ = class60;
		    i_152_ = ((Class60) class60_151_).aFloatArray1018.length;
		}
		if (((Class60) class60).aFloatArray1018.length == i
		    && !((Class60) class60).aBool1017)
		    break;
	    }
	    if (class60 == null)
		class60 = class60_151_;
	    if (class60 == null) {
		class60 = new Class60(this);
		int i_153_ = 0;
		boolean bool = false;
		while (!bool && i_153_ < 1000) {
		    if (aClass129_802.get((long) i_153_) != null)
			i_153_++;
		    else
			bool = true;
		}
		((Class60) class60).anInt1015 = i_153_;
		float[] fs = new float[i];
		((Class60) class60).aFloatArray1018 = fs;
		((Class60) class60).aBool1017 = true;
		((Class60) class60).anInt1016 = i;
		if (aClass129_802.method3028(1808615088) >= i * 4) {
		    /* empty */
		}
		aClass129_802.method3026(class60,
					 (long) ((Class60) class60).anInt1015,
					 fs.length * 4, 1124261259);
	    } else {
		for (int i_154_ = 0;
		     i_154_ < ((Class60) class60).aFloatArray1018.length;
		     i_154_++)
		    ((Class60) class60).aFloatArray1018[i_154_] = 0.0F;
		((Class60) class60).anInt1016 = i;
	    }
	    ((Class60) class60).aBool1017 = true;
	    Class60 class60_155_ = class60;
	    return class60_155_;
	}
    }
    
    void method1450(Class60 class60) {
	if (class60 != null) {
	    synchronized (aClass129_802) {
		((Class60) class60).aBool1017 = false;
	    }
	}
    }
    
    public RSByteBuffer method289(int i) {
	RSByteBuffer class241_sub3 = method1422(i);
	return class241_sub3;
    }
    
    synchronized void method1451(boolean bool) {
	if (!bool) {
	    ((Class57) this).anInt753 = 0;
	    ((Class57) this).anInt741 = 0;
	    ((Class57) this).aBoolArray759 = null;
	    ((Class57) this).anIntArray760 = null;
	    method1435(((Class57) this).aClass60Array798);
	    ((Class57) this).aClass60Array798 = null;
	    method1435(((Class57) this).aClass60Array761);
	    ((Class57) this).aClass60Array761 = null;
	    ((Class57) this).anInt767 = 0;
	    ((Class57) this).anInt777 = 0;
	    ((Class57) this).aBoolArray764 = null;
	    method1435(((Class57) this).aClass60Array746);
	    ((Class57) this).aClass60Array746 = null;
	    method1402(((Class57) this).aClass60_766);
	    method1402(((Class57) this).aClass60_799);
	    method1402(((Class57) this).aClass60_806);
	    method1402(((Class57) this).aClass60_797);
	    method1402(((Class57) this).aClass60_745);
	    method1402(((Class57) this).aClass60_771);
	    ((Class57) this).aClass60_766 = null;
	    ((Class57) this).aClass60_799 = null;
	    ((Class57) this).aClass60_806 = null;
	    ((Class57) this).aClass60_797 = null;
	    ((Class57) this).aClass60_745 = null;
	    ((Class57) this).aClass60_771 = null;
	    ((Class57) this).anIntArray765 = null;
	    ((Class57) this).anIntArray773 = null;
	}
	((Class57) this).anInt786 = 0;
	Iterator iterator = ((Class57) this).aList775.iterator();
	while (iterator.hasNext()) {
	    RSByteBuffer class241_sub3 = (RSByteBuffer) iterator.next();
	    class241_sub3.method14618(-174251917);
	}
	((Class57) this).aList775.clear();
	((Class57) this).aBool774 = false;
	if (((Class57) this).aClass241_Sub3_776 != null) {
	    synchronized (((Class57) this).aClass241_Sub3_776) {
		((Class57) this).aClass241_Sub3_776.method14618(-174251917);
		((Class57) this).aClass241_Sub3_776 = null;
	    }
	}
	((Class57) this).anInt795 = 0;
	((Class57) this).anInt778 = 0;
	if (!bool) {
	    synchronized (((Class57) this).aList779) {
		Iterator iterator_156_ = ((Class57) this).aList779.iterator();
		while (iterator_156_.hasNext()) {
		    RSByteBuffer class241_sub3
			= (RSByteBuffer) iterator_156_.next();
		    class241_sub3.method14618(-174251917);
		}
		((Class57) this).aList779.clear();
	    }
	    ((Class57) this).anInt800 = 0;
	}
	synchronized (((Class57) this).aList768) {
	    Iterator iterator_157_ = ((Class57) this).aList768.iterator();
	    while (iterator_157_.hasNext()) {
		RSByteBuffer class241_sub3
		    = (RSByteBuffer) iterator_157_.next();
		class241_sub3.method14618(-174251917);
	    }
	    ((Class57) this).aList768.clear();
	}
	((Class57) this).aBool780 = false;
	((Class57) this).anInt783 = 0;
	((Class57) this).anInt763 = -1;
	((Class57) this).anInt790 = -1;
	if (!bool) {
	    method1401(false);
	    ((Class57) this).aBool781 = false;
	    ((Class57) this).anInt750 = -1;
	    ((Class57) this).anInt751 = -1;
	    ((Class57) this).anInt791 = 0;
	    ((Class57) this).anInt747 = 0;
	    ((Class57) this).anInt784 = -1;
	    ((Class57) this).anInt785 = -1;
	    ((Class57) this).anInt769 = -1;
	    ((Class57) this).anInt789 = -1;
	    ((Class57) this).aBool787 = false;
	    ((Class57) this).aBool793 = false;
	} else {
	    ((Class57) this).anInt747++;
	    ((Class57) this).aBool787 = true;
	}
    }
    
    void method1452() {
	if (method317() != Class303.aClass303_4788) {
	    method1503();
	    if (method317() == Class303.aClass303_4789)
		method1394(Class303.aClass303_4792);
	}
    }
    
    void method1453() {
	if (method317() != Class303.aClass303_4788) {
	    method1503();
	    if (method317() == Class303.aClass303_4789)
		method1394(Class303.aClass303_4792);
	}
    }
    
    void method1454() {
	if (method317() != Class303.aClass303_4788) {
	    method1503();
	    if (method317() == Class303.aClass303_4789)
		method1394(Class303.aClass303_4792);
	}
    }
    
    void method1455(RSByteBuffer class241_sub3) {
	((Class57) this).aList775.add(class241_sub3);
    }
    
    void method1456(RSByteBuffer class241_sub3) {
	((Class57) this).aList775.add(class241_sub3);
    }
    
    void method1457(RSByteBuffer class241_sub3) {
	((Class57) this).aList775.add(class241_sub3);
    }
    
    public Class329 method327() {
	return ((Class57) this).aClass329_748;
    }
    
    boolean method1458() {
	return ((Class57) this).aBool774;
    }
    
    boolean method1459() {
	return ((Class57) this).aBool774;
    }
    
    boolean method1460() {
	return ((Class57) this).aBool774;
    }
    
    boolean method1461() {
	return ((Class57) this).aBool774;
    }
    
    int method1462() {
	return ((Class57) this).anInt805;
    }
    
    boolean method1463(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) 30) != 79
	    || class241_sub3.readUnsignedByte((byte) -7) != 103
	    || class241_sub3.readUnsignedByte((byte) -5) != 103
	    || class241_sub3.readUnsignedByte((byte) -100) != 83)
	    return false;
	return true;
    }
    
    boolean method1464(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) 18) != 79
	    || class241_sub3.readUnsignedByte((byte) 16) != 103
	    || class241_sub3.readUnsignedByte((byte) -23) != 103
	    || class241_sub3.readUnsignedByte((byte) -16) != 83)
	    return false;
	return true;
    }
    
    public int method287(int i) {
	return i * (method319().anInt4875 * -32980023 / 8);
    }
    
    boolean method1465(byte[] is, int i, int i_158_) {
	if (is[i] != i_158_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    public Class303 method279() {
	return ((Class57) this).aClass303_770;
    }
    
    int method1466() {
	return ((Class57) this).anInt804;
    }
    
    public void method282() {
	if (method317() == Class303.aClass303_4794
	    || method317() == Class303.aClass303_4790
	    || method317() == Class303.aClass303_4792) {
	    method1394(Class303.aClass303_4789);
	    method1405();
	}
    }
    
    boolean method1467(RSByteBuffer class241_sub3) {
	if (class241_sub3.readUnsignedByte((byte) 78) != 79
	    || class241_sub3.readUnsignedByte((byte) 36) != 103
	    || class241_sub3.readUnsignedByte((byte) -101) != 103
	    || class241_sub3.readUnsignedByte((byte) -4) != 83)
	    return false;
	return true;
    }
    
    void method1468(byte[] is, int i) {
	((Class57) this).anInt786 = 0;
	if (!method154()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_159_ = 0;
	    if (method1409(is, i, 1))
		i_159_ = 1;
	    else if (method1409(is, i, 3))
		i_159_ = 3;
	    else if (method1409(is, i, 5))
		i_159_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_159_).toString());
	    if (i_159_ == 1) {
		method1430(is, i + 7);
		int i_160_ = method1441(32);
		((Class57) this).anInt743 = method1441(8);
		((Class57) this).anInt796 = method1441(32);
		((Class57) this).anInt801 = method1441(32);
		((Class57) this).anInt742 = method1441(32);
		((Class57) this).anInt762 = method1441(32);
		((Class57) this).anInt753 = 1 << method1441(4);
		((Class57) this).anInt741 = 1 << method1441(4);
		int i_161_ = 1 << method1441(1);
		if (i_160_ != 0 || i_161_ == 0)
		    throw new RuntimeException("");
		((Class57) this).aBool781 = true;
		((Class57) this).anInt763++;
	    } else if (i_159_ != 3 && i_159_ == 5) {
		if (!method1409(is, i, 5))
		    throw new RuntimeException("");
		method1430(is, i + 7);
		if (((Class57) this).aClass60Array746 != null) {
		    method1435(((Class57) this).aClass60Array746);
		    ((Class57) this).aClass60Array746 = null;
		}
		((Class57) this).aClass60Array746
		    = method1400(((Class57) this).anInt743,
				 ((Class57) this).anInt741);
		for (int i_162_ = 0; i_162_ < 2; i_162_++) {
		    int i_163_ = (i_162_ != 0 ? ((Class57) this).anInt741
				  : ((Class57) this).anInt753);
		    int i_164_ = i_163_ >> 1;
		    int i_165_ = i_163_ >> 2;
		    int i_166_ = i_163_ >> 3;
		    Class60 class60 = method1423(i_164_);
		    for (int i_167_ = 0; i_167_ < i_165_; i_167_++) {
			((Class60) class60).aFloatArray1018[2 * i_167_]
			    = (float) Math.cos((double) (4 * i_167_)
					       * 3.141592653589793
					       / (double) i_163_);
			((Class60) class60).aFloatArray1018[2 * i_167_ + 1]
			    = -(float) Math.sin((double) (4 * i_167_)
						* 3.141592653589793
						/ (double) i_163_);
		    }
		    Class60 class60_168_ = method1423(i_164_);
		    for (int i_169_ = 0; i_169_ < i_165_; i_169_++) {
			((Class60) class60_168_).aFloatArray1018[2 * i_169_]
			    = (float) Math.cos((double) (2 * i_169_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_163_));
			((Class60) class60_168_).aFloatArray1018[(2 * i_169_
								  + 1)]
			    = (float) Math.sin((double) (2 * i_169_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_163_));
		    }
		    Class60 class60_170_ = method1423(i_165_);
		    for (int i_171_ = 0; i_171_ < i_166_; i_171_++) {
			((Class60) class60_170_).aFloatArray1018[2 * i_171_]
			    = (float) Math.cos((double) (4 * i_171_ + 2)
					       * 3.141592653589793
					       / (double) i_163_);
			((Class60) class60_170_).aFloatArray1018[(2 * i_171_
								  + 1)]
			    = -(float) Math.sin((double) (4 * i_171_ + 2)
						* 3.141592653589793
						/ (double) i_163_);
		    }
		    int[] is_172_ = new int[i_166_];
		    int i_173_ = Class436.method7795(i_166_ - 1, (byte) -85);
		    for (int i_174_ = 0; i_174_ < i_166_; i_174_++)
			is_172_[i_174_] = Class199.method4043(i_174_, i_173_,
							      (short) 4907);
		    if (i_162_ != 0) {
			((Class57) this).aClass60_797 = class60;
			((Class57) this).aClass60_745 = class60_168_;
			((Class57) this).aClass60_771 = class60_170_;
			((Class57) this).anIntArray773 = is_172_;
		    } else {
			((Class57) this).aClass60_766 = class60;
			((Class57) this).aClass60_799 = class60_168_;
			((Class57) this).aClass60_806 = class60_170_;
			((Class57) this).anIntArray765 = is_172_;
		    }
		}
		method1413();
		int i_175_ = method1441(6) + 1;
		for (int i_176_ = 0; i_176_ < i_175_; i_176_++)
		    method1441(16);
		i_175_ = method1441(6) + 1;
		if (((Class57) this).aClass51Array756 == null
		    || ((Class57) this).aClass51Array756.length != i_175_)
		    ((Class57) this).aClass51Array756 = new Class51[i_175_];
		for (int i_177_ = 0; i_177_ < i_175_; i_177_++) {
		    if (((Class57) this).aClass51Array756[i_177_] == null)
			((Class57) this).aClass51Array756[i_177_]
			    = new Class51();
		    ((Class57) this).aClass51Array756[i_177_]
			.method1258(this, ((Class57) this).anInt743);
		}
		int i_178_ = method1441(6) + 1;
		if (((Class57) this).aClass45Array757 == null
		    || ((Class57) this).aClass45Array757.length != i_178_)
		    ((Class57) this).aClass45Array757 = new Class45[i_178_];
		for (int i_179_ = 0; i_179_ < i_178_; i_179_++) {
		    if (((Class57) this).aClass45Array757[i_179_] == null)
			((Class57) this).aClass45Array757[i_179_]
			    = new Class45();
		    ((Class57) this).aClass45Array757[i_179_].method1109(this);
		}
		int i_180_ = method1441(6) + 1;
		if (((Class57) this).aClass36Array758 == null
		    || ((Class57) this).aClass36Array758.length != i_180_)
		    ((Class57) this).aClass36Array758 = new Class36[i_180_];
		for (int i_181_ = 0; i_181_ < i_180_; i_181_++) {
		    if (((Class57) this).aClass36Array758[i_181_] == null)
			((Class57) this).aClass36Array758[i_181_]
			    = new Class36();
		    ((Class57) this).aClass36Array758[i_181_].method1005(this);
		}
		int i_182_ = method1441(6) + 1;
		((Class57) this).aBoolArray759 = new boolean[i_182_];
		((Class57) this).anIntArray760 = new int[i_182_];
		for (int i_183_ = 0; i_183_ < i_182_; i_183_++) {
		    ((Class57) this).aBoolArray759[i_183_] = method1411() != 0;
		    method1441(16);
		    method1441(16);
		    ((Class57) this).anIntArray760[i_183_] = method1441(8);
		}
		method1401(true);
	    }
	}
    }
    
    int method1469() {
	return ((Class57) this).anInt804;
    }
    
    int method1470() {
	return ((Class57) this).anInt804;
    }
    
    public Class303 method317() {
	return ((Class57) this).aClass303_770;
    }
    
    int method1471() {
	return ((Class57) this).anInt805;
    }
    
    void method1472(byte[] is, int i) {
	((Class57) this).aByteArray803 = is;
	((Class57) this).anInt804 = i;
	((Class57) this).anInt805 = 0;
    }
    
    void method1473(byte[] is, int i) {
	((Class57) this).aByteArray803 = is;
	((Class57) this).anInt804 = i;
	((Class57) this).anInt805 = 0;
    }
    
    int method1474(int i) {
	int i_184_ = 0;
	int i_185_ = 0;
	int i_186_;
	for (/**/; i >= 8 - ((Class57) this).anInt805; i -= i_186_) {
	    i_186_ = 8 - ((Class57) this).anInt805;
	    int i_187_ = (1 << i_186_) - 1;
	    i_184_
		+= ((((Class57) this).aByteArray803[((Class57) this).anInt804]
		     >> ((Class57) this).anInt805)
		    & i_187_) << i_185_;
	    ((Class57) this).anInt805 = 0;
	    ((Class57) this).anInt804++;
	    i_185_ += i_186_;
	}
	if (i > 0) {
	    i_186_ = (1 << i) - 1;
	    i_184_
		+= ((((Class57) this).aByteArray803[((Class57) this).anInt804]
		     >> ((Class57) this).anInt805)
		    & i_186_) << i_185_;
	    ((Class57) this).anInt805 += i;
	}
	return i_184_;
    }
    
    public void method292(boolean bool) {
	if (!bool)
	    method190();
	else if (method317() == Class303.aClass303_4793) {
	    method1404(true);
	    method1394(Class303.aClass303_4792);
	}
    }
    
    public Class57(float f) {
	((Class57) this).anInt778 = 0;
	((Class57) this).aList779 = new ArrayList();
	((Class57) this).aList752 = new ArrayList();
	((Class57) this).aList794 = new ArrayList();
	((Class57) this).anAtomicReference754 = new AtomicReference(null);
	((Class57) this).anInt772 = 0;
	((Class57) this).aBool793 = false;
	((Class57) this).anInt800 = 0;
	((Class57) this).aBoolArray739 = null;
	((Class57) this).aBoolArray807 = null;
	((Class57) this).aBoolArray808 = null;
	((Class57) this).aFloat792 = f;
	((Class57) this).aClass320_740 = Class320.aClass320_4878;
	((Class57) this).aClass329_748 = Class329.aClass329_5031;
	method1404(false);
    }
    
    void method1475() {
	int i = method1441(8) + 1;
	Iterator iterator = aList788.iterator();
	while (iterator.hasNext()) {
	    Class48 class48 = (Class48) iterator.next();
	    if (((Class48) class48).anInt640 == 0
		&& ((Class48) class48).anInt636 == 0) {
		if (((Class48) class48).aClass34Array641.length == i
		    && (((Class48) class48).anInt639
			== ((Class57) this).anInt743)
		    && (((Class48) class48).anInt637
			== ((Class57) this).anInt796)
		    && (((Class48) class48).anInt638
			== ((Class57) this).anInt742)) {
		    ((Class57) this).aClass34Array755
			= ((Class48) class48).aClass34Array641;
		    for (int i_188_ = 0;
			 i_188_ < ((Class57) this).aClass34Array755.length;
			 i_188_++)
			((Class57) this).aClass34Array755[i_188_]
			    .method978(this);
		    return;
		}
	    }
	}
	((Class57) this).aClass34Array755 = new Class34[i];
	for (int i_189_ = 0; i_189_ < i; i_189_++) {
	    if (((Class57) this).aClass34Array755[i_189_] == null)
		((Class57) this).aClass34Array755[i_189_] = new Class34();
	    ((Class57) this).aClass34Array755[i_189_].method979(this);
	}
	Class48 class48
	    = new Class48(((Class57) this).anInt743, ((Class57) this).anInt796,
			  ((Class57) this).anInt801, ((Class57) this).anInt762,
			  ((Class57) this).anInt742,
			  ((Class57) this).aClass34Array755);
	aList788.add(class48);
    }
    
    boolean method1476(byte[] is, int i, int i_190_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_190_ > is.length)
	    return false;
	method1430(is, i);
	int i_191_ = method1411();
	if (i_191_ != 0) {
	    method1414(is, i);
	    return false;
	}
	if (!method154())
	    throw new RuntimeException();
	int i_192_
	    = method1441(method1415(((Class57) this).anIntArray760.length
				    - 1));
	boolean bool = ((Class57) this).aBoolArray759[i_192_];
	int i_193_
	    = bool ? ((Class57) this).anInt741 : ((Class57) this).anInt753;
	boolean bool_194_ = false;
	boolean bool_195_ = false;
	if (bool) {
	    bool_194_ = method1411() != 0;
	    bool_195_ = method1411() != 0;
	}
	int i_196_ = i_193_ >> 1;
	int i_197_;
	int i_198_;
	int i_199_;
	if (bool && !bool_194_) {
	    i_197_ = (i_193_ >> 2) - (((Class57) this).anInt753 >> 2);
	    i_198_ = (i_193_ >> 2) + (((Class57) this).anInt753 >> 2);
	    i_199_ = ((Class57) this).anInt753 >> 1;
	} else {
	    i_197_ = 0;
	    i_198_ = i_196_;
	    i_199_ = i_193_ >> 1;
	}
	int i_200_;
	int i_201_;
	int i_202_;
	if (bool && !bool_195_) {
	    i_200_ = i_193_ - (i_193_ >> 2) - (((Class57) this).anInt753 >> 2);
	    i_201_ = i_193_ - (i_193_ >> 2) + (((Class57) this).anInt753 >> 2);
	    i_202_ = ((Class57) this).anInt753 >> 1;
	} else {
	    i_200_ = i_196_;
	    i_201_ = i_193_;
	    i_202_ = i_193_ >> 1;
	}
	Class36 class36 = (((Class57) this).aClass36Array758
			   [((Class57) this).anIntArray760[i_192_]]);
	if (((Class57) this).aBoolArray739 == null
	    || (((Class57) this).aBoolArray739.length
		!= ((Class57) this).anInt743)) {
	    ((Class57) this).aBoolArray739
		= new boolean[((Class57) this).anInt743];
	    ((Class57) this).aBoolArray807
		= new boolean[((Class57) this).anInt743];
	}
	for (int i_203_ = 0; i_203_ < ((Class57) this).anInt743; i_203_++) {
	    int i_204_ = (((Class36) class36).anIntArray380 != null
			  ? ((Class36) class36).anIntArray380[i_203_] : 0);
	    int i_205_ = i_204_;
	    int i_206_ = ((Class36) class36).anIntArray379[i_205_];
	    ((Class57) this).aBoolArray739[i_203_]
		= !((Class57) this).aClass51Array756[i_206_]
		       .method1260(i_203_);
	    ((Class57) this).aBoolArray807[i_203_]
		= ((Class57) this).aBoolArray739[i_203_];
	}
	for (int i_207_ = 0; i_207_ < ((Class36) class36).anInt376; i_207_++) {
	    if (!(((Class57) this).aBoolArray739
		  [((Class36) class36).anIntArray382[i_207_]])
		|| !(((Class57) this).aBoolArray739
		     [((Class36) class36).anIntArray383[i_207_]])) {
		((Class57) this).aBoolArray739[(((Class36) class36)
						.anIntArray382[i_207_])]
		    = false;
		((Class57) this).aBoolArray739[(((Class36) class36)
						.anIntArray383[i_207_])]
		    = false;
	    }
	}
	if (((Class57) this).aBoolArray808 == null
	    || (((Class57) this).aBoolArray808.length
		!= ((Class57) this).anInt743))
	    ((Class57) this).aBoolArray808
		= new boolean[((Class57) this).anInt743];
	for (int i_208_ = 0; i_208_ < ((Class36) class36).anInt378; i_208_++) {
	    int i_209_ = 0;
	    for (int i_210_ = 0; i_210_ < ((Class57) this).anInt743;
		 i_210_++) {
		int i_211_
		    = (((Class36) class36).anIntArray380 != null
		       ? ((Class36) class36).anIntArray380[i_210_] : i_208_);
		if (i_211_ == i_208_)
		    ((Class57) this).aBoolArray808[i_209_++]
			= ((Class57) this).aBoolArray739[i_210_];
	    }
	    Class45 class45 = (((Class57) this).aClass45Array757
			       [((Class36) class36).anIntArray377[i_208_]]);
	    Object object = null;
	    Class60[] class60s;
	    if (((Class45) class45).anInt613 == 2) {
		Class60[] class60s_212_
		    = method1400(1, ((Class57) this).anInt743 * i_193_);
		for (int i_213_ = 0; i_213_ < i_193_; i_213_++) {
		    for (int i_214_ = 0; i_214_ < ((Class57) this).anInt743;
			 i_214_++) {
			try {
			    ((Class60) class60s_212_[0]).aFloatArray1018
				[i_213_ * ((Class57) this).anInt743 + i_214_]
				= (((Class60)
				    ((Class57) this).aClass60Array746[i_214_])
				   .aFloatArray1018[i_213_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class60s_212_
		    = class45.method1111(class60s_212_, i_193_ >> 1,
					 ((Class57) this).aBoolArray808);
		class60s = ((Class57) this).aClass60Array746;
		for (int i_215_ = 0; i_215_ < i_193_; i_215_++) {
		    for (int i_216_ = 0; i_216_ < ((Class57) this).anInt743;
			 i_216_++) {
			try {
			    ((Class60) class60s[i_216_]).aFloatArray1018
				[i_215_]
				= (((Class60) class60s_212_[0]).aFloatArray1018
				   [(((Class57) this).anInt743 * i_215_
				     + i_216_)]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method1435(class60s_212_);
		Object object_217_ = null;
	    } else
		class60s
		    = class45.method1111(((Class57) this).aClass60Array746,
					 i_193_ >> 1,
					 ((Class57) this).aBoolArray808);
	    if (((Class36) class36).anIntArray380 != null) {
		i_209_ = 0;
		for (int i_218_ = 0; i_218_ < ((Class57) this).anInt743;
		     i_218_++) {
		    int i_219_ = ((Class36) class36).anIntArray380[i_218_];
		    if (i_219_ == i_208_)
			((Class57) this).aClass60Array746[i_218_]
			    = class60s[i_209_++];
		}
	    } else {
		if (((Class57) this).aClass60Array746 != class60s)
		    method1435(((Class57) this).aClass60Array746);
		((Class57) this).aClass60Array746 = class60s;
	    }
	}
	for (int i_220_ = ((Class36) class36).anInt376 - 1; i_220_ >= 0;
	     i_220_--) {
	    Class60 class60 = (((Class57) this).aClass60Array746
			       [((Class36) class36).anIntArray382[i_220_]]);
	    Class60 class60_221_
		= (((Class57) this).aClass60Array746
		   [((Class36) class36).anIntArray383[i_220_]]);
	    for (int i_222_ = 0; i_222_ < ((Class60) class60).anInt1016;
		 i_222_++) {
		float f = ((Class60) class60).aFloatArray1018[i_222_];
		float f_223_
		    = ((Class60) class60_221_).aFloatArray1018[i_222_];
		float f_224_ = f;
		float f_225_ = f_223_;
		if (f > 0.0F) {
		    if (f_223_ > 0.0F) {
			f_224_ = f;
			f_225_ = f - f_223_;
		    } else {
			f_225_ = f;
			f_224_ = f + f_223_;
		    }
		} else if (f_223_ > 0.0F) {
		    f_224_ = f;
		    f_225_ = f + f_223_;
		} else {
		    f_225_ = f;
		    f_224_ = f - f_223_;
		}
		((Class60) class60).aFloatArray1018[i_222_] = f_224_;
		((Class60) class60_221_).aFloatArray1018[i_222_] = f_225_;
	    }
	}
	for (int i_226_ = 0; i_226_ < ((Class57) this).aBoolArray739.length;
	     i_226_++)
	    ((Class57) this).aBoolArray739[i_226_]
		= ((Class57) this).aBoolArray807[i_226_];
	for (int i_227_ = 0; i_227_ < ((Class57) this).anInt743; i_227_++) {
	    if (!((Class57) this).aBoolArray739[i_227_]) {
		int i_228_ = (((Class36) class36).anIntArray380 != null
			      ? ((Class36) class36).anIntArray380[i_227_] : 0);
		int i_229_ = i_228_;
		int i_230_ = ((Class36) class36).anIntArray379[i_229_];
		((Class57) this).aClass51Array756[i_230_].method1275(i_227_);
		((Class57) this).aClass51Array756[i_230_].method1262
		    (((Class57) this).aClass60Array746[i_227_], i_193_ >> 1,
		     i_227_);
	    }
	}
	for (int i_231_ = 0; i_231_ < ((Class57) this).anInt743; i_231_++) {
	    if (((Class57) this).aBoolArray739[i_231_]) {
		for (int i_232_ = i_193_ >> 1; i_232_ < i_193_; i_232_++)
		    ((Class60) ((Class57) this).aClass60Array746[i_231_])
			.aFloatArray1018[i_232_]
			= 0.0F;
	    } else {
		int i_233_ = i_193_ >> 1;
		int i_234_ = i_193_ >> 2;
		int i_235_ = i_193_ >> 3;
		Class60 class60 = ((Class57) this).aClass60Array746[i_231_];
		for (int i_236_ = 0; i_236_ < i_233_; i_236_++)
		    ((Class60) class60).aFloatArray1018[i_236_] *= 0.5F;
		for (int i_237_ = i_233_; i_237_ < i_193_; i_237_++)
		    ((Class60) class60).aFloatArray1018[i_237_]
			= -(((Class60) class60).aFloatArray1018
			    [i_193_ - i_237_ - 1]);
		Class60 class60_238_ = (bool ? ((Class57) this).aClass60_797
					: ((Class57) this).aClass60_766);
		Class60 class60_239_ = (bool ? ((Class57) this).aClass60_745
					: ((Class57) this).aClass60_799);
		Class60 class60_240_ = (bool ? ((Class57) this).aClass60_771
					: ((Class57) this).aClass60_806);
		int[] is_241_ = (bool ? ((Class57) this).anIntArray773
				 : ((Class57) this).anIntArray765);
		for (int i_242_ = 0; i_242_ < i_234_; i_242_++) {
		    float f = (((Class60) class60).aFloatArray1018[4 * i_242_]
			       - (((Class60) class60).aFloatArray1018
				  [i_193_ - 4 * i_242_ - 1]));
		    float f_243_
			= (((Class60) class60).aFloatArray1018[4 * i_242_ + 2]
			   - (((Class60) class60).aFloatArray1018
			      [i_193_ - 4 * i_242_ - 3]));
		    float f_244_
			= ((Class60) class60_238_).aFloatArray1018[2 * i_242_];
		    float f_245_ = (((Class60) class60_238_).aFloatArray1018
				    [2 * i_242_ + 1]);
		    ((Class60) class60).aFloatArray1018[(i_193_ - 4 * i_242_
							 - 1)]
			= f * f_244_ - f_243_ * f_245_;
		    ((Class60) class60).aFloatArray1018[(i_193_ - 4 * i_242_
							 - 3)]
			= f * f_245_ + f_243_ * f_244_;
		}
		for (int i_246_ = 0; i_246_ < i_235_; i_246_++) {
		    float f = (((Class60) class60).aFloatArray1018
			       [i_233_ + 3 + 4 * i_246_]);
		    float f_247_ = (((Class60) class60).aFloatArray1018
				    [i_233_ + 1 + 4 * i_246_]);
		    float f_248_
			= ((Class60) class60).aFloatArray1018[4 * i_246_ + 3];
		    float f_249_
			= ((Class60) class60).aFloatArray1018[4 * i_246_ + 1];
		    ((Class60) class60).aFloatArray1018[(i_233_ + 3
							 + 4 * i_246_)]
			= f + f_248_;
		    ((Class60) class60).aFloatArray1018[(i_233_ + 1
							 + 4 * i_246_)]
			= f_247_ + f_249_;
		    float f_250_ = (((Class60) class60_238_).aFloatArray1018
				    [i_233_ - 4 - 4 * i_246_]);
		    float f_251_ = (((Class60) class60_238_).aFloatArray1018
				    [i_233_ - 3 - 4 * i_246_]);
		    ((Class60) class60).aFloatArray1018[4 * i_246_ + 3]
			= (f - f_248_) * f_250_ - (f_247_ - f_249_) * f_251_;
		    ((Class60) class60).aFloatArray1018[4 * i_246_ + 1]
			= (f_247_ - f_249_) * f_250_ + (f - f_248_) * f_251_;
		}
		int i_252_ = Class436.method7795(i_193_ - 1, (byte) -92);
		for (int i_253_ = 0; i_253_ < i_252_ - 3; i_253_++) {
		    int i_254_ = i_193_ >> i_253_ + 2;
		    int i_255_ = 8 << i_253_;
		    for (int i_256_ = 0; i_256_ < 2 << i_253_; i_256_++) {
			int i_257_ = i_193_ - i_254_ * 2 * i_256_;
			int i_258_ = i_193_ - i_254_ * (2 * i_256_ + 1);
			for (int i_259_ = 0; i_259_ < i_193_ >> i_253_ + 4;
			     i_259_++) {
			    int i_260_ = 4 * i_259_;
			    float f = (((Class60) class60).aFloatArray1018
				       [i_257_ - 1 - i_260_]);
			    float f_261_ = (((Class60) class60).aFloatArray1018
					    [i_257_ - 3 - i_260_]);
			    float f_262_ = (((Class60) class60).aFloatArray1018
					    [i_258_ - 1 - i_260_]);
			    float f_263_ = (((Class60) class60).aFloatArray1018
					    [i_258_ - 3 - i_260_]);
			    ((Class60) class60).aFloatArray1018[(i_257_ - 1
								 - i_260_)]
				= f + f_262_;
			    ((Class60) class60).aFloatArray1018[(i_257_ - 3
								 - i_260_)]
				= f_261_ + f_263_;
			    float f_264_ = (((Class60) class60_238_)
					    .aFloatArray1018[i_259_ * i_255_]);
			    float f_265_
				= (((Class60) class60_238_).aFloatArray1018
				   [i_259_ * i_255_ + 1]);
			    ((Class60) class60).aFloatArray1018[(i_258_ - 1
								 - i_260_)]
				= ((f - f_262_) * f_264_
				   - (f_261_ - f_263_) * f_265_);
			    ((Class60) class60).aFloatArray1018[(i_258_ - 3
								 - i_260_)]
				= ((f_261_ - f_263_) * f_264_
				   + (f - f_262_) * f_265_);
			}
		    }
		}
		for (int i_266_ = 1; i_266_ < i_235_ - 1; i_266_++) {
		    int i_267_ = is_241_[i_266_];
		    if (i_266_ < i_267_) {
			int i_268_ = 8 * i_266_;
			int i_269_ = 8 * i_267_;
			float f
			    = ((Class60) class60).aFloatArray1018[i_268_ + 1];
			((Class60) class60).aFloatArray1018[i_268_ + 1]
			    = ((Class60) class60).aFloatArray1018[i_269_ + 1];
			((Class60) class60).aFloatArray1018[i_269_ + 1] = f;
			f = ((Class60) class60).aFloatArray1018[i_268_ + 3];
			((Class60) class60).aFloatArray1018[i_268_ + 3]
			    = ((Class60) class60).aFloatArray1018[i_269_ + 3];
			((Class60) class60).aFloatArray1018[i_269_ + 3] = f;
			f = ((Class60) class60).aFloatArray1018[i_268_ + 5];
			((Class60) class60).aFloatArray1018[i_268_ + 5]
			    = ((Class60) class60).aFloatArray1018[i_269_ + 5];
			((Class60) class60).aFloatArray1018[i_269_ + 5] = f;
			f = ((Class60) class60).aFloatArray1018[i_268_ + 7];
			((Class60) class60).aFloatArray1018[i_268_ + 7]
			    = ((Class60) class60).aFloatArray1018[i_269_ + 7];
			((Class60) class60).aFloatArray1018[i_269_ + 7] = f;
		    }
		}
		for (int i_270_ = 0; i_270_ < i_233_; i_270_++)
		    ((Class60) class60).aFloatArray1018[i_270_]
			= ((Class60) class60).aFloatArray1018[2 * i_270_ + 1];
		for (int i_271_ = 0; i_271_ < i_235_; i_271_++) {
		    ((Class60) class60).aFloatArray1018[(i_193_ - 1
							 - 2 * i_271_)]
			= ((Class60) class60).aFloatArray1018[4 * i_271_];
		    ((Class60) class60).aFloatArray1018[(i_193_ - 2
							 - 2 * i_271_)]
			= ((Class60) class60).aFloatArray1018[4 * i_271_ + 1];
		    ((Class60) class60).aFloatArray1018[(i_193_ - i_234_ - 1
							 - 2 * i_271_)]
			= ((Class60) class60).aFloatArray1018[4 * i_271_ + 2];
		    ((Class60) class60).aFloatArray1018[(i_193_ - i_234_ - 2
							 - 2 * i_271_)]
			= ((Class60) class60).aFloatArray1018[4 * i_271_ + 3];
		}
		for (int i_272_ = 0; i_272_ < i_235_; i_272_++) {
		    float f
			= ((Class60) class60_240_).aFloatArray1018[2 * i_272_];
		    float f_273_ = (((Class60) class60_240_).aFloatArray1018
				    [2 * i_272_ + 1]);
		    float f_274_ = (((Class60) class60).aFloatArray1018
				    [i_233_ + 2 * i_272_]);
		    float f_275_ = (((Class60) class60).aFloatArray1018
				    [i_233_ + 2 * i_272_ + 1]);
		    float f_276_ = (((Class60) class60).aFloatArray1018
				    [i_193_ - 2 - 2 * i_272_]);
		    float f_277_ = (((Class60) class60).aFloatArray1018
				    [i_193_ - 1 - 2 * i_272_]);
		    float f_278_
			= f_273_ * (f_274_ - f_276_) + f * (f_275_ + f_277_);
		    ((Class60) class60).aFloatArray1018[i_233_ + 2 * i_272_]
			= (f_274_ + f_276_ + f_278_) * 0.5F;
		    ((Class60) class60).aFloatArray1018[(i_193_ - 2
							 - 2 * i_272_)]
			= (f_274_ + f_276_ - f_278_) * 0.5F;
		    f_278_
			= f_273_ * (f_275_ + f_277_) - f * (f_274_ - f_276_);
		    ((Class60) class60).aFloatArray1018[(i_233_ + 2 * i_272_
							 + 1)]
			= (f_275_ - f_277_ + f_278_) * 0.5F;
		    ((Class60) class60).aFloatArray1018[(i_193_ - 1
							 - 2 * i_272_)]
			= (-f_275_ + f_277_ + f_278_) * 0.5F;
		}
		for (int i_279_ = 0; i_279_ < i_234_; i_279_++) {
		    ((Class60) class60).aFloatArray1018[i_279_]
			= (((((Class60) class60).aFloatArray1018
			     [2 * i_279_ + i_233_])
			    * (((Class60) class60_239_).aFloatArray1018
			       [2 * i_279_]))
			   + ((((Class60) class60).aFloatArray1018
			       [2 * i_279_ + 1 + i_233_])
			      * (((Class60) class60_239_).aFloatArray1018
				 [2 * i_279_ + 1])));
		    ((Class60) class60).aFloatArray1018[i_233_ - 1 - i_279_]
			= (((((Class60) class60).aFloatArray1018
			     [2 * i_279_ + i_233_])
			    * (((Class60) class60_239_).aFloatArray1018
			       [2 * i_279_ + 1]))
			   - ((((Class60) class60).aFloatArray1018
			       [2 * i_279_ + 1 + i_233_])
			      * (((Class60) class60_239_).aFloatArray1018
				 [2 * i_279_])));
		}
		for (int i_280_ = 0; i_280_ < i_234_; i_280_++)
		    ((Class60) class60).aFloatArray1018[(i_193_ - i_234_
							 + i_280_)]
			= -((Class60) class60).aFloatArray1018[i_280_];
		for (int i_281_ = 0; i_281_ < i_234_; i_281_++)
		    ((Class60) class60).aFloatArray1018[i_281_]
			= ((Class60) class60).aFloatArray1018[i_234_ + i_281_];
		for (int i_282_ = 0; i_282_ < i_234_; i_282_++)
		    ((Class60) class60).aFloatArray1018[i_234_ + i_282_]
			= -(((Class60) class60).aFloatArray1018
			    [i_234_ - i_282_ - 1]);
		for (int i_283_ = 0; i_283_ < i_234_; i_283_++)
		    ((Class60) class60).aFloatArray1018[i_233_ + i_283_]
			= (((Class60) class60).aFloatArray1018
			   [i_193_ - i_283_ - 1]);
		for (int i_284_ = i_197_; i_284_ < i_198_; i_284_++) {
		    float f
			= (float) Math.sin(((double) (i_284_ - i_197_) + 0.5)
					   / (double) i_199_ * 0.5
					   * 3.141592653589793);
		    ((Class60) ((Class57) this).aClass60Array746[i_231_])
			.aFloatArray1018[i_284_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_285_ = i_200_; i_285_ < i_201_; i_285_++) {
		    float f
			= (float) Math.sin((((double) (i_285_ - i_200_) + 0.5)
					    / (double) i_202_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    ((Class60) ((Class57) this).aClass60Array746[i_231_])
			.aFloatArray1018[i_285_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class60[] class60s = null;
	if (((Class57) this).anInt767 > 0) {
	    int i_286_ = ((Class57) this).anInt767 + i_193_ >> 2;
	    class60s = method1400(((Class57) this).anInt743, i_286_);
	    for (int i_287_ = 0; i_287_ < ((Class57) this).anInt743;
		 i_287_++) {
		if (!((Class57) this).aBoolArray764[i_287_]) {
		    for (int i_288_ = 0; i_288_ < ((Class57) this).anInt777;
			 i_288_++) {
			int i_289_ = (((Class57) this).anInt767 >> 1) + i_288_;
			((Class60) class60s[i_287_]).aFloatArray1018[i_288_]
			    += ((Class60) (((Class57) this).aClass60Array761
					   [i_287_])).aFloatArray1018[i_289_];
		    }
		}
		if (!((Class57) this).aBoolArray739[i_287_]) {
		    for (int i_290_ = i_197_; i_290_ < i_193_ >> 1; i_290_++) {
			int i_291_ = (((Class60) class60s[i_287_]).anInt1016
				      - (i_193_ >> 1) + i_290_);
			((Class60) class60s[i_287_]).aFloatArray1018[i_291_]
			    += ((Class60) (((Class57) this).aClass60Array746
					   [i_287_])).aFloatArray1018[i_290_];
		    }
		}
	    }
	}
	Class60[] class60s_292_ = ((Class57) this).aClass60Array761;
	((Class57) this).aClass60Array761 = ((Class57) this).aClass60Array746;
	((Class57) this).aClass60Array746 = class60s_292_;
	((Class57) this).anInt767 = i_193_;
	((Class57) this).anInt777 = i_201_ - (i_193_ >> 1);
	((Class57) this).aBoolArray764 = ((Class57) this).aBoolArray739;
	atomicreference.set(class60s);
	return true;
    }
    
    void method1477(byte[] is, int i) {
	((Class57) this).anInt786 = 0;
	if (!method154()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_293_ = 0;
	    if (method1409(is, i, 1))
		i_293_ = 1;
	    else if (method1409(is, i, 3))
		i_293_ = 3;
	    else if (method1409(is, i, 5))
		i_293_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_293_).toString());
	    if (i_293_ == 1) {
		method1430(is, i + 7);
		int i_294_ = method1441(32);
		((Class57) this).anInt743 = method1441(8);
		((Class57) this).anInt796 = method1441(32);
		((Class57) this).anInt801 = method1441(32);
		((Class57) this).anInt742 = method1441(32);
		((Class57) this).anInt762 = method1441(32);
		((Class57) this).anInt753 = 1 << method1441(4);
		((Class57) this).anInt741 = 1 << method1441(4);
		int i_295_ = 1 << method1441(1);
		if (i_294_ != 0 || i_295_ == 0)
		    throw new RuntimeException("");
		((Class57) this).aBool781 = true;
		((Class57) this).anInt763++;
	    } else if (i_293_ != 3 && i_293_ == 5) {
		if (!method1409(is, i, 5))
		    throw new RuntimeException("");
		method1430(is, i + 7);
		if (((Class57) this).aClass60Array746 != null) {
		    method1435(((Class57) this).aClass60Array746);
		    ((Class57) this).aClass60Array746 = null;
		}
		((Class57) this).aClass60Array746
		    = method1400(((Class57) this).anInt743,
				 ((Class57) this).anInt741);
		for (int i_296_ = 0; i_296_ < 2; i_296_++) {
		    int i_297_ = (i_296_ != 0 ? ((Class57) this).anInt741
				  : ((Class57) this).anInt753);
		    int i_298_ = i_297_ >> 1;
		    int i_299_ = i_297_ >> 2;
		    int i_300_ = i_297_ >> 3;
		    Class60 class60 = method1423(i_298_);
		    for (int i_301_ = 0; i_301_ < i_299_; i_301_++) {
			((Class60) class60).aFloatArray1018[2 * i_301_]
			    = (float) Math.cos((double) (4 * i_301_)
					       * 3.141592653589793
					       / (double) i_297_);
			((Class60) class60).aFloatArray1018[2 * i_301_ + 1]
			    = -(float) Math.sin((double) (4 * i_301_)
						* 3.141592653589793
						/ (double) i_297_);
		    }
		    Class60 class60_302_ = method1423(i_298_);
		    for (int i_303_ = 0; i_303_ < i_299_; i_303_++) {
			((Class60) class60_302_).aFloatArray1018[2 * i_303_]
			    = (float) Math.cos((double) (2 * i_303_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_297_));
			((Class60) class60_302_).aFloatArray1018[(2 * i_303_
								  + 1)]
			    = (float) Math.sin((double) (2 * i_303_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_297_));
		    }
		    Class60 class60_304_ = method1423(i_299_);
		    for (int i_305_ = 0; i_305_ < i_300_; i_305_++) {
			((Class60) class60_304_).aFloatArray1018[2 * i_305_]
			    = (float) Math.cos((double) (4 * i_305_ + 2)
					       * 3.141592653589793
					       / (double) i_297_);
			((Class60) class60_304_).aFloatArray1018[(2 * i_305_
								  + 1)]
			    = -(float) Math.sin((double) (4 * i_305_ + 2)
						* 3.141592653589793
						/ (double) i_297_);
		    }
		    int[] is_306_ = new int[i_300_];
		    int i_307_ = Class436.method7795(i_300_ - 1, (byte) -90);
		    for (int i_308_ = 0; i_308_ < i_300_; i_308_++)
			is_306_[i_308_] = Class199.method4043(i_308_, i_307_,
							      (short) 21692);
		    if (i_296_ != 0) {
			((Class57) this).aClass60_797 = class60;
			((Class57) this).aClass60_745 = class60_302_;
			((Class57) this).aClass60_771 = class60_304_;
			((Class57) this).anIntArray773 = is_306_;
		    } else {
			((Class57) this).aClass60_766 = class60;
			((Class57) this).aClass60_799 = class60_302_;
			((Class57) this).aClass60_806 = class60_304_;
			((Class57) this).anIntArray765 = is_306_;
		    }
		}
		method1413();
		int i_309_ = method1441(6) + 1;
		for (int i_310_ = 0; i_310_ < i_309_; i_310_++)
		    method1441(16);
		i_309_ = method1441(6) + 1;
		if (((Class57) this).aClass51Array756 == null
		    || ((Class57) this).aClass51Array756.length != i_309_)
		    ((Class57) this).aClass51Array756 = new Class51[i_309_];
		for (int i_311_ = 0; i_311_ < i_309_; i_311_++) {
		    if (((Class57) this).aClass51Array756[i_311_] == null)
			((Class57) this).aClass51Array756[i_311_]
			    = new Class51();
		    ((Class57) this).aClass51Array756[i_311_]
			.method1258(this, ((Class57) this).anInt743);
		}
		int i_312_ = method1441(6) + 1;
		if (((Class57) this).aClass45Array757 == null
		    || ((Class57) this).aClass45Array757.length != i_312_)
		    ((Class57) this).aClass45Array757 = new Class45[i_312_];
		for (int i_313_ = 0; i_313_ < i_312_; i_313_++) {
		    if (((Class57) this).aClass45Array757[i_313_] == null)
			((Class57) this).aClass45Array757[i_313_]
			    = new Class45();
		    ((Class57) this).aClass45Array757[i_313_].method1109(this);
		}
		int i_314_ = method1441(6) + 1;
		if (((Class57) this).aClass36Array758 == null
		    || ((Class57) this).aClass36Array758.length != i_314_)
		    ((Class57) this).aClass36Array758 = new Class36[i_314_];
		for (int i_315_ = 0; i_315_ < i_314_; i_315_++) {
		    if (((Class57) this).aClass36Array758[i_315_] == null)
			((Class57) this).aClass36Array758[i_315_]
			    = new Class36();
		    ((Class57) this).aClass36Array758[i_315_].method1005(this);
		}
		int i_316_ = method1441(6) + 1;
		((Class57) this).aBoolArray759 = new boolean[i_316_];
		((Class57) this).anIntArray760 = new int[i_316_];
		for (int i_317_ = 0; i_317_ < i_316_; i_317_++) {
		    ((Class57) this).aBoolArray759[i_317_] = method1411() != 0;
		    method1441(16);
		    method1441(16);
		    ((Class57) this).anIntArray760[i_317_] = method1441(8);
		}
		method1401(true);
	    }
	}
    }
    
    RSByteBuffer method1478(int i) {
	RSByteBuffer class241_sub3 = method1438(method287(i));
	int i_318_ = i;
	synchronized (((Class57) this).aList779) {
	    while (!((Class57) this).aList779.isEmpty()) {
		RSByteBuffer class241_sub3_319_
		    = (RSByteBuffer) ((Class57) this).aList779.remove(0);
		((Class57) this).anInt800
		    -= (method200(class241_sub3_319_.pointer * 421967667)
			/ method223());
		int i_320_ = method287(i_318_);
		int i_321_
		    = (class241_sub3_319_.pointer * 421967667 < i_320_
		       ? class241_sub3_319_.pointer * 421967667 : i_320_);
		class241_sub3.writeBytes(class241_sub3_319_.payload, 0,
					  i_321_, 752061035);
		i_318_ -= method200(i_321_);
		int i_322_ = class241_sub3_319_.pointer * 421967667 - i_321_;
		if (i_322_ != 0) {
		    System.arraycopy(class241_sub3_319_.payload, i_321_,
				     class241_sub3_319_.payload, 0,
				     i_322_);
		    class241_sub3_319_.pointer = i_322_ * -681042949;
		    ((Class57) this).anInt800
			+= method200(i_322_) / method223();
		    ((Class57) this).aList779.add(0, class241_sub3_319_);
		} else
		    class241_sub3_319_.method14618(-174251917);
		if (i_318_ <= 0)
		    break;
	    }
	    if (((Class57) this).aList779.isEmpty()
		&& method317() == Class303.aClass303_4788)
		method1394(Class303.aClass303_4793);
	}
	return class241_sub3;
    }
    
    int method1479() {
	return ((Class57) this).anInt804;
    }
    
    int method1480(int i) {
	int i_323_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_323_++;
	return i_323_;
    }
    
    public Class320 method314() {
	return ((Class57) this).aClass320_740;
    }
    
    boolean method1481(byte[] is, int i, int i_324_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_324_ > is.length)
	    return false;
	method1430(is, i);
	int i_325_ = method1411();
	if (i_325_ != 0) {
	    method1414(is, i);
	    return false;
	}
	if (!method154())
	    throw new RuntimeException();
	int i_326_
	    = method1441(method1415(((Class57) this).anIntArray760.length
				    - 1));
	boolean bool = ((Class57) this).aBoolArray759[i_326_];
	int i_327_
	    = bool ? ((Class57) this).anInt741 : ((Class57) this).anInt753;
	boolean bool_328_ = false;
	boolean bool_329_ = false;
	if (bool) {
	    bool_328_ = method1411() != 0;
	    bool_329_ = method1411() != 0;
	}
	int i_330_ = i_327_ >> 1;
	int i_331_;
	int i_332_;
	int i_333_;
	if (bool && !bool_328_) {
	    i_331_ = (i_327_ >> 2) - (((Class57) this).anInt753 >> 2);
	    i_332_ = (i_327_ >> 2) + (((Class57) this).anInt753 >> 2);
	    i_333_ = ((Class57) this).anInt753 >> 1;
	} else {
	    i_331_ = 0;
	    i_332_ = i_330_;
	    i_333_ = i_327_ >> 1;
	}
	int i_334_;
	int i_335_;
	int i_336_;
	if (bool && !bool_329_) {
	    i_334_ = i_327_ - (i_327_ >> 2) - (((Class57) this).anInt753 >> 2);
	    i_335_ = i_327_ - (i_327_ >> 2) + (((Class57) this).anInt753 >> 2);
	    i_336_ = ((Class57) this).anInt753 >> 1;
	} else {
	    i_334_ = i_330_;
	    i_335_ = i_327_;
	    i_336_ = i_327_ >> 1;
	}
	Class36 class36 = (((Class57) this).aClass36Array758
			   [((Class57) this).anIntArray760[i_326_]]);
	if (((Class57) this).aBoolArray739 == null
	    || (((Class57) this).aBoolArray739.length
		!= ((Class57) this).anInt743)) {
	    ((Class57) this).aBoolArray739
		= new boolean[((Class57) this).anInt743];
	    ((Class57) this).aBoolArray807
		= new boolean[((Class57) this).anInt743];
	}
	for (int i_337_ = 0; i_337_ < ((Class57) this).anInt743; i_337_++) {
	    int i_338_ = (((Class36) class36).anIntArray380 != null
			  ? ((Class36) class36).anIntArray380[i_337_] : 0);
	    int i_339_ = i_338_;
	    int i_340_ = ((Class36) class36).anIntArray379[i_339_];
	    ((Class57) this).aBoolArray739[i_337_]
		= !((Class57) this).aClass51Array756[i_340_]
		       .method1260(i_337_);
	    ((Class57) this).aBoolArray807[i_337_]
		= ((Class57) this).aBoolArray739[i_337_];
	}
	for (int i_341_ = 0; i_341_ < ((Class36) class36).anInt376; i_341_++) {
	    if (!(((Class57) this).aBoolArray739
		  [((Class36) class36).anIntArray382[i_341_]])
		|| !(((Class57) this).aBoolArray739
		     [((Class36) class36).anIntArray383[i_341_]])) {
		((Class57) this).aBoolArray739[(((Class36) class36)
						.anIntArray382[i_341_])]
		    = false;
		((Class57) this).aBoolArray739[(((Class36) class36)
						.anIntArray383[i_341_])]
		    = false;
	    }
	}
	if (((Class57) this).aBoolArray808 == null
	    || (((Class57) this).aBoolArray808.length
		!= ((Class57) this).anInt743))
	    ((Class57) this).aBoolArray808
		= new boolean[((Class57) this).anInt743];
	for (int i_342_ = 0; i_342_ < ((Class36) class36).anInt378; i_342_++) {
	    int i_343_ = 0;
	    for (int i_344_ = 0; i_344_ < ((Class57) this).anInt743;
		 i_344_++) {
		int i_345_
		    = (((Class36) class36).anIntArray380 != null
		       ? ((Class36) class36).anIntArray380[i_344_] : i_342_);
		if (i_345_ == i_342_)
		    ((Class57) this).aBoolArray808[i_343_++]
			= ((Class57) this).aBoolArray739[i_344_];
	    }
	    Class45 class45 = (((Class57) this).aClass45Array757
			       [((Class36) class36).anIntArray377[i_342_]]);
	    Object object = null;
	    Class60[] class60s;
	    if (((Class45) class45).anInt613 == 2) {
		Class60[] class60s_346_
		    = method1400(1, ((Class57) this).anInt743 * i_327_);
		for (int i_347_ = 0; i_347_ < i_327_; i_347_++) {
		    for (int i_348_ = 0; i_348_ < ((Class57) this).anInt743;
			 i_348_++) {
			try {
			    ((Class60) class60s_346_[0]).aFloatArray1018
				[i_347_ * ((Class57) this).anInt743 + i_348_]
				= (((Class60)
				    ((Class57) this).aClass60Array746[i_348_])
				   .aFloatArray1018[i_347_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class60s_346_
		    = class45.method1111(class60s_346_, i_327_ >> 1,
					 ((Class57) this).aBoolArray808);
		class60s = ((Class57) this).aClass60Array746;
		for (int i_349_ = 0; i_349_ < i_327_; i_349_++) {
		    for (int i_350_ = 0; i_350_ < ((Class57) this).anInt743;
			 i_350_++) {
			try {
			    ((Class60) class60s[i_350_]).aFloatArray1018
				[i_349_]
				= (((Class60) class60s_346_[0]).aFloatArray1018
				   [(((Class57) this).anInt743 * i_349_
				     + i_350_)]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method1435(class60s_346_);
		Object object_351_ = null;
	    } else
		class60s
		    = class45.method1111(((Class57) this).aClass60Array746,
					 i_327_ >> 1,
					 ((Class57) this).aBoolArray808);
	    if (((Class36) class36).anIntArray380 != null) {
		i_343_ = 0;
		for (int i_352_ = 0; i_352_ < ((Class57) this).anInt743;
		     i_352_++) {
		    int i_353_ = ((Class36) class36).anIntArray380[i_352_];
		    if (i_353_ == i_342_)
			((Class57) this).aClass60Array746[i_352_]
			    = class60s[i_343_++];
		}
	    } else {
		if (((Class57) this).aClass60Array746 != class60s)
		    method1435(((Class57) this).aClass60Array746);
		((Class57) this).aClass60Array746 = class60s;
	    }
	}
	for (int i_354_ = ((Class36) class36).anInt376 - 1; i_354_ >= 0;
	     i_354_--) {
	    Class60 class60 = (((Class57) this).aClass60Array746
			       [((Class36) class36).anIntArray382[i_354_]]);
	    Class60 class60_355_
		= (((Class57) this).aClass60Array746
		   [((Class36) class36).anIntArray383[i_354_]]);
	    for (int i_356_ = 0; i_356_ < ((Class60) class60).anInt1016;
		 i_356_++) {
		float f = ((Class60) class60).aFloatArray1018[i_356_];
		float f_357_
		    = ((Class60) class60_355_).aFloatArray1018[i_356_];
		float f_358_ = f;
		float f_359_ = f_357_;
		if (f > 0.0F) {
		    if (f_357_ > 0.0F) {
			f_358_ = f;
			f_359_ = f - f_357_;
		    } else {
			f_359_ = f;
			f_358_ = f + f_357_;
		    }
		} else if (f_357_ > 0.0F) {
		    f_358_ = f;
		    f_359_ = f + f_357_;
		} else {
		    f_359_ = f;
		    f_358_ = f - f_357_;
		}
		((Class60) class60).aFloatArray1018[i_356_] = f_358_;
		((Class60) class60_355_).aFloatArray1018[i_356_] = f_359_;
	    }
	}
	for (int i_360_ = 0; i_360_ < ((Class57) this).aBoolArray739.length;
	     i_360_++)
	    ((Class57) this).aBoolArray739[i_360_]
		= ((Class57) this).aBoolArray807[i_360_];
	for (int i_361_ = 0; i_361_ < ((Class57) this).anInt743; i_361_++) {
	    if (!((Class57) this).aBoolArray739[i_361_]) {
		int i_362_ = (((Class36) class36).anIntArray380 != null
			      ? ((Class36) class36).anIntArray380[i_361_] : 0);
		int i_363_ = i_362_;
		int i_364_ = ((Class36) class36).anIntArray379[i_363_];
		((Class57) this).aClass51Array756[i_364_].method1275(i_361_);
		((Class57) this).aClass51Array756[i_364_].method1262
		    (((Class57) this).aClass60Array746[i_361_], i_327_ >> 1,
		     i_361_);
	    }
	}
	for (int i_365_ = 0; i_365_ < ((Class57) this).anInt743; i_365_++) {
	    if (((Class57) this).aBoolArray739[i_365_]) {
		for (int i_366_ = i_327_ >> 1; i_366_ < i_327_; i_366_++)
		    ((Class60) ((Class57) this).aClass60Array746[i_365_])
			.aFloatArray1018[i_366_]
			= 0.0F;
	    } else {
		int i_367_ = i_327_ >> 1;
		int i_368_ = i_327_ >> 2;
		int i_369_ = i_327_ >> 3;
		Class60 class60 = ((Class57) this).aClass60Array746[i_365_];
		for (int i_370_ = 0; i_370_ < i_367_; i_370_++)
		    ((Class60) class60).aFloatArray1018[i_370_] *= 0.5F;
		for (int i_371_ = i_367_; i_371_ < i_327_; i_371_++)
		    ((Class60) class60).aFloatArray1018[i_371_]
			= -(((Class60) class60).aFloatArray1018
			    [i_327_ - i_371_ - 1]);
		Class60 class60_372_ = (bool ? ((Class57) this).aClass60_797
					: ((Class57) this).aClass60_766);
		Class60 class60_373_ = (bool ? ((Class57) this).aClass60_745
					: ((Class57) this).aClass60_799);
		Class60 class60_374_ = (bool ? ((Class57) this).aClass60_771
					: ((Class57) this).aClass60_806);
		int[] is_375_ = (bool ? ((Class57) this).anIntArray773
				 : ((Class57) this).anIntArray765);
		for (int i_376_ = 0; i_376_ < i_368_; i_376_++) {
		    float f = (((Class60) class60).aFloatArray1018[4 * i_376_]
			       - (((Class60) class60).aFloatArray1018
				  [i_327_ - 4 * i_376_ - 1]));
		    float f_377_
			= (((Class60) class60).aFloatArray1018[4 * i_376_ + 2]
			   - (((Class60) class60).aFloatArray1018
			      [i_327_ - 4 * i_376_ - 3]));
		    float f_378_
			= ((Class60) class60_372_).aFloatArray1018[2 * i_376_];
		    float f_379_ = (((Class60) class60_372_).aFloatArray1018
				    [2 * i_376_ + 1]);
		    ((Class60) class60).aFloatArray1018[(i_327_ - 4 * i_376_
							 - 1)]
			= f * f_378_ - f_377_ * f_379_;
		    ((Class60) class60).aFloatArray1018[(i_327_ - 4 * i_376_
							 - 3)]
			= f * f_379_ + f_377_ * f_378_;
		}
		for (int i_380_ = 0; i_380_ < i_369_; i_380_++) {
		    float f = (((Class60) class60).aFloatArray1018
			       [i_367_ + 3 + 4 * i_380_]);
		    float f_381_ = (((Class60) class60).aFloatArray1018
				    [i_367_ + 1 + 4 * i_380_]);
		    float f_382_
			= ((Class60) class60).aFloatArray1018[4 * i_380_ + 3];
		    float f_383_
			= ((Class60) class60).aFloatArray1018[4 * i_380_ + 1];
		    ((Class60) class60).aFloatArray1018[(i_367_ + 3
							 + 4 * i_380_)]
			= f + f_382_;
		    ((Class60) class60).aFloatArray1018[(i_367_ + 1
							 + 4 * i_380_)]
			= f_381_ + f_383_;
		    float f_384_ = (((Class60) class60_372_).aFloatArray1018
				    [i_367_ - 4 - 4 * i_380_]);
		    float f_385_ = (((Class60) class60_372_).aFloatArray1018
				    [i_367_ - 3 - 4 * i_380_]);
		    ((Class60) class60).aFloatArray1018[4 * i_380_ + 3]
			= (f - f_382_) * f_384_ - (f_381_ - f_383_) * f_385_;
		    ((Class60) class60).aFloatArray1018[4 * i_380_ + 1]
			= (f_381_ - f_383_) * f_384_ + (f - f_382_) * f_385_;
		}
		int i_386_ = Class436.method7795(i_327_ - 1, (byte) -16);
		for (int i_387_ = 0; i_387_ < i_386_ - 3; i_387_++) {
		    int i_388_ = i_327_ >> i_387_ + 2;
		    int i_389_ = 8 << i_387_;
		    for (int i_390_ = 0; i_390_ < 2 << i_387_; i_390_++) {
			int i_391_ = i_327_ - i_388_ * 2 * i_390_;
			int i_392_ = i_327_ - i_388_ * (2 * i_390_ + 1);
			for (int i_393_ = 0; i_393_ < i_327_ >> i_387_ + 4;
			     i_393_++) {
			    int i_394_ = 4 * i_393_;
			    float f = (((Class60) class60).aFloatArray1018
				       [i_391_ - 1 - i_394_]);
			    float f_395_ = (((Class60) class60).aFloatArray1018
					    [i_391_ - 3 - i_394_]);
			    float f_396_ = (((Class60) class60).aFloatArray1018
					    [i_392_ - 1 - i_394_]);
			    float f_397_ = (((Class60) class60).aFloatArray1018
					    [i_392_ - 3 - i_394_]);
			    ((Class60) class60).aFloatArray1018[(i_391_ - 1
								 - i_394_)]
				= f + f_396_;
			    ((Class60) class60).aFloatArray1018[(i_391_ - 3
								 - i_394_)]
				= f_395_ + f_397_;
			    float f_398_ = (((Class60) class60_372_)
					    .aFloatArray1018[i_393_ * i_389_]);
			    float f_399_
				= (((Class60) class60_372_).aFloatArray1018
				   [i_393_ * i_389_ + 1]);
			    ((Class60) class60).aFloatArray1018[(i_392_ - 1
								 - i_394_)]
				= ((f - f_396_) * f_398_
				   - (f_395_ - f_397_) * f_399_);
			    ((Class60) class60).aFloatArray1018[(i_392_ - 3
								 - i_394_)]
				= ((f_395_ - f_397_) * f_398_
				   + (f - f_396_) * f_399_);
			}
		    }
		}
		for (int i_400_ = 1; i_400_ < i_369_ - 1; i_400_++) {
		    int i_401_ = is_375_[i_400_];
		    if (i_400_ < i_401_) {
			int i_402_ = 8 * i_400_;
			int i_403_ = 8 * i_401_;
			float f
			    = ((Class60) class60).aFloatArray1018[i_402_ + 1];
			((Class60) class60).aFloatArray1018[i_402_ + 1]
			    = ((Class60) class60).aFloatArray1018[i_403_ + 1];
			((Class60) class60).aFloatArray1018[i_403_ + 1] = f;
			f = ((Class60) class60).aFloatArray1018[i_402_ + 3];
			((Class60) class60).aFloatArray1018[i_402_ + 3]
			    = ((Class60) class60).aFloatArray1018[i_403_ + 3];
			((Class60) class60).aFloatArray1018[i_403_ + 3] = f;
			f = ((Class60) class60).aFloatArray1018[i_402_ + 5];
			((Class60) class60).aFloatArray1018[i_402_ + 5]
			    = ((Class60) class60).aFloatArray1018[i_403_ + 5];
			((Class60) class60).aFloatArray1018[i_403_ + 5] = f;
			f = ((Class60) class60).aFloatArray1018[i_402_ + 7];
			((Class60) class60).aFloatArray1018[i_402_ + 7]
			    = ((Class60) class60).aFloatArray1018[i_403_ + 7];
			((Class60) class60).aFloatArray1018[i_403_ + 7] = f;
		    }
		}
		for (int i_404_ = 0; i_404_ < i_367_; i_404_++)
		    ((Class60) class60).aFloatArray1018[i_404_]
			= ((Class60) class60).aFloatArray1018[2 * i_404_ + 1];
		for (int i_405_ = 0; i_405_ < i_369_; i_405_++) {
		    ((Class60) class60).aFloatArray1018[(i_327_ - 1
							 - 2 * i_405_)]
			= ((Class60) class60).aFloatArray1018[4 * i_405_];
		    ((Class60) class60).aFloatArray1018[(i_327_ - 2
							 - 2 * i_405_)]
			= ((Class60) class60).aFloatArray1018[4 * i_405_ + 1];
		    ((Class60) class60).aFloatArray1018[(i_327_ - i_368_ - 1
							 - 2 * i_405_)]
			= ((Class60) class60).aFloatArray1018[4 * i_405_ + 2];
		    ((Class60) class60).aFloatArray1018[(i_327_ - i_368_ - 2
							 - 2 * i_405_)]
			= ((Class60) class60).aFloatArray1018[4 * i_405_ + 3];
		}
		for (int i_406_ = 0; i_406_ < i_369_; i_406_++) {
		    float f
			= ((Class60) class60_374_).aFloatArray1018[2 * i_406_];
		    float f_407_ = (((Class60) class60_374_).aFloatArray1018
				    [2 * i_406_ + 1]);
		    float f_408_ = (((Class60) class60).aFloatArray1018
				    [i_367_ + 2 * i_406_]);
		    float f_409_ = (((Class60) class60).aFloatArray1018
				    [i_367_ + 2 * i_406_ + 1]);
		    float f_410_ = (((Class60) class60).aFloatArray1018
				    [i_327_ - 2 - 2 * i_406_]);
		    float f_411_ = (((Class60) class60).aFloatArray1018
				    [i_327_ - 1 - 2 * i_406_]);
		    float f_412_
			= f_407_ * (f_408_ - f_410_) + f * (f_409_ + f_411_);
		    ((Class60) class60).aFloatArray1018[i_367_ + 2 * i_406_]
			= (f_408_ + f_410_ + f_412_) * 0.5F;
		    ((Class60) class60).aFloatArray1018[(i_327_ - 2
							 - 2 * i_406_)]
			= (f_408_ + f_410_ - f_412_) * 0.5F;
		    f_412_
			= f_407_ * (f_409_ + f_411_) - f * (f_408_ - f_410_);
		    ((Class60) class60).aFloatArray1018[(i_367_ + 2 * i_406_
							 + 1)]
			= (f_409_ - f_411_ + f_412_) * 0.5F;
		    ((Class60) class60).aFloatArray1018[(i_327_ - 1
							 - 2 * i_406_)]
			= (-f_409_ + f_411_ + f_412_) * 0.5F;
		}
		for (int i_413_ = 0; i_413_ < i_368_; i_413_++) {
		    ((Class60) class60).aFloatArray1018[i_413_]
			= (((((Class60) class60).aFloatArray1018
			     [2 * i_413_ + i_367_])
			    * (((Class60) class60_373_).aFloatArray1018
			       [2 * i_413_]))
			   + ((((Class60) class60).aFloatArray1018
			       [2 * i_413_ + 1 + i_367_])
			      * (((Class60) class60_373_).aFloatArray1018
				 [2 * i_413_ + 1])));
		    ((Class60) class60).aFloatArray1018[i_367_ - 1 - i_413_]
			= (((((Class60) class60).aFloatArray1018
			     [2 * i_413_ + i_367_])
			    * (((Class60) class60_373_).aFloatArray1018
			       [2 * i_413_ + 1]))
			   - ((((Class60) class60).aFloatArray1018
			       [2 * i_413_ + 1 + i_367_])
			      * (((Class60) class60_373_).aFloatArray1018
				 [2 * i_413_])));
		}
		for (int i_414_ = 0; i_414_ < i_368_; i_414_++)
		    ((Class60) class60).aFloatArray1018[(i_327_ - i_368_
							 + i_414_)]
			= -((Class60) class60).aFloatArray1018[i_414_];
		for (int i_415_ = 0; i_415_ < i_368_; i_415_++)
		    ((Class60) class60).aFloatArray1018[i_415_]
			= ((Class60) class60).aFloatArray1018[i_368_ + i_415_];
		for (int i_416_ = 0; i_416_ < i_368_; i_416_++)
		    ((Class60) class60).aFloatArray1018[i_368_ + i_416_]
			= -(((Class60) class60).aFloatArray1018
			    [i_368_ - i_416_ - 1]);
		for (int i_417_ = 0; i_417_ < i_368_; i_417_++)
		    ((Class60) class60).aFloatArray1018[i_367_ + i_417_]
			= (((Class60) class60).aFloatArray1018
			   [i_327_ - i_417_ - 1]);
		for (int i_418_ = i_331_; i_418_ < i_332_; i_418_++) {
		    float f
			= (float) Math.sin(((double) (i_418_ - i_331_) + 0.5)
					   / (double) i_333_ * 0.5
					   * 3.141592653589793);
		    ((Class60) ((Class57) this).aClass60Array746[i_365_])
			.aFloatArray1018[i_418_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_419_ = i_334_; i_419_ < i_335_; i_419_++) {
		    float f
			= (float) Math.sin((((double) (i_419_ - i_334_) + 0.5)
					    / (double) i_336_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    ((Class60) ((Class57) this).aClass60Array746[i_365_])
			.aFloatArray1018[i_419_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class60[] class60s = null;
	if (((Class57) this).anInt767 > 0) {
	    int i_420_ = ((Class57) this).anInt767 + i_327_ >> 2;
	    class60s = method1400(((Class57) this).anInt743, i_420_);
	    for (int i_421_ = 0; i_421_ < ((Class57) this).anInt743;
		 i_421_++) {
		if (!((Class57) this).aBoolArray764[i_421_]) {
		    for (int i_422_ = 0; i_422_ < ((Class57) this).anInt777;
			 i_422_++) {
			int i_423_ = (((Class57) this).anInt767 >> 1) + i_422_;
			((Class60) class60s[i_421_]).aFloatArray1018[i_422_]
			    += ((Class60) (((Class57) this).aClass60Array761
					   [i_421_])).aFloatArray1018[i_423_];
		    }
		}
		if (!((Class57) this).aBoolArray739[i_421_]) {
		    for (int i_424_ = i_331_; i_424_ < i_327_ >> 1; i_424_++) {
			int i_425_ = (((Class60) class60s[i_421_]).anInt1016
				      - (i_327_ >> 1) + i_424_);
			((Class60) class60s[i_421_]).aFloatArray1018[i_425_]
			    += ((Class60) (((Class57) this).aClass60Array746
					   [i_421_])).aFloatArray1018[i_424_];
		    }
		}
	    }
	}
	Class60[] class60s_426_ = ((Class57) this).aClass60Array761;
	((Class57) this).aClass60Array761 = ((Class57) this).aClass60Array746;
	((Class57) this).aClass60Array746 = class60s_426_;
	((Class57) this).anInt767 = i_327_;
	((Class57) this).anInt777 = i_335_ - (i_327_ >> 1);
	((Class57) this).aBoolArray764 = ((Class57) this).aBoolArray739;
	atomicreference.set(class60s);
	return true;
    }
    
    boolean method1482(byte[] is, int i, int i_427_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_427_ > is.length)
	    return false;
	method1430(is, i);
	int i_428_ = method1411();
	if (i_428_ != 0) {
	    method1414(is, i);
	    return false;
	}
	if (!method154())
	    throw new RuntimeException();
	int i_429_
	    = method1441(method1415(((Class57) this).anIntArray760.length
				    - 1));
	boolean bool = ((Class57) this).aBoolArray759[i_429_];
	int i_430_
	    = bool ? ((Class57) this).anInt741 : ((Class57) this).anInt753;
	boolean bool_431_ = false;
	boolean bool_432_ = false;
	if (bool) {
	    bool_431_ = method1411() != 0;
	    bool_432_ = method1411() != 0;
	}
	int i_433_ = i_430_ >> 1;
	int i_434_;
	int i_435_;
	int i_436_;
	if (bool && !bool_431_) {
	    i_434_ = (i_430_ >> 2) - (((Class57) this).anInt753 >> 2);
	    i_435_ = (i_430_ >> 2) + (((Class57) this).anInt753 >> 2);
	    i_436_ = ((Class57) this).anInt753 >> 1;
	} else {
	    i_434_ = 0;
	    i_435_ = i_433_;
	    i_436_ = i_430_ >> 1;
	}
	int i_437_;
	int i_438_;
	int i_439_;
	if (bool && !bool_432_) {
	    i_437_ = i_430_ - (i_430_ >> 2) - (((Class57) this).anInt753 >> 2);
	    i_438_ = i_430_ - (i_430_ >> 2) + (((Class57) this).anInt753 >> 2);
	    i_439_ = ((Class57) this).anInt753 >> 1;
	} else {
	    i_437_ = i_433_;
	    i_438_ = i_430_;
	    i_439_ = i_430_ >> 1;
	}
	Class36 class36 = (((Class57) this).aClass36Array758
			   [((Class57) this).anIntArray760[i_429_]]);
	if (((Class57) this).aBoolArray739 == null
	    || (((Class57) this).aBoolArray739.length
		!= ((Class57) this).anInt743)) {
	    ((Class57) this).aBoolArray739
		= new boolean[((Class57) this).anInt743];
	    ((Class57) this).aBoolArray807
		= new boolean[((Class57) this).anInt743];
	}
	for (int i_440_ = 0; i_440_ < ((Class57) this).anInt743; i_440_++) {
	    int i_441_ = (((Class36) class36).anIntArray380 != null
			  ? ((Class36) class36).anIntArray380[i_440_] : 0);
	    int i_442_ = i_441_;
	    int i_443_ = ((Class36) class36).anIntArray379[i_442_];
	    ((Class57) this).aBoolArray739[i_440_]
		= !((Class57) this).aClass51Array756[i_443_]
		       .method1260(i_440_);
	    ((Class57) this).aBoolArray807[i_440_]
		= ((Class57) this).aBoolArray739[i_440_];
	}
	for (int i_444_ = 0; i_444_ < ((Class36) class36).anInt376; i_444_++) {
	    if (!(((Class57) this).aBoolArray739
		  [((Class36) class36).anIntArray382[i_444_]])
		|| !(((Class57) this).aBoolArray739
		     [((Class36) class36).anIntArray383[i_444_]])) {
		((Class57) this).aBoolArray739[(((Class36) class36)
						.anIntArray382[i_444_])]
		    = false;
		((Class57) this).aBoolArray739[(((Class36) class36)
						.anIntArray383[i_444_])]
		    = false;
	    }
	}
	if (((Class57) this).aBoolArray808 == null
	    || (((Class57) this).aBoolArray808.length
		!= ((Class57) this).anInt743))
	    ((Class57) this).aBoolArray808
		= new boolean[((Class57) this).anInt743];
	for (int i_445_ = 0; i_445_ < ((Class36) class36).anInt378; i_445_++) {
	    int i_446_ = 0;
	    for (int i_447_ = 0; i_447_ < ((Class57) this).anInt743;
		 i_447_++) {
		int i_448_
		    = (((Class36) class36).anIntArray380 != null
		       ? ((Class36) class36).anIntArray380[i_447_] : i_445_);
		if (i_448_ == i_445_)
		    ((Class57) this).aBoolArray808[i_446_++]
			= ((Class57) this).aBoolArray739[i_447_];
	    }
	    Class45 class45 = (((Class57) this).aClass45Array757
			       [((Class36) class36).anIntArray377[i_445_]]);
	    Object object = null;
	    Class60[] class60s;
	    if (((Class45) class45).anInt613 == 2) {
		Class60[] class60s_449_
		    = method1400(1, ((Class57) this).anInt743 * i_430_);
		for (int i_450_ = 0; i_450_ < i_430_; i_450_++) {
		    for (int i_451_ = 0; i_451_ < ((Class57) this).anInt743;
			 i_451_++) {
			try {
			    ((Class60) class60s_449_[0]).aFloatArray1018
				[i_450_ * ((Class57) this).anInt743 + i_451_]
				= (((Class60)
				    ((Class57) this).aClass60Array746[i_451_])
				   .aFloatArray1018[i_450_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class60s_449_
		    = class45.method1111(class60s_449_, i_430_ >> 1,
					 ((Class57) this).aBoolArray808);
		class60s = ((Class57) this).aClass60Array746;
		for (int i_452_ = 0; i_452_ < i_430_; i_452_++) {
		    for (int i_453_ = 0; i_453_ < ((Class57) this).anInt743;
			 i_453_++) {
			try {
			    ((Class60) class60s[i_453_]).aFloatArray1018
				[i_452_]
				= (((Class60) class60s_449_[0]).aFloatArray1018
				   [(((Class57) this).anInt743 * i_452_
				     + i_453_)]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method1435(class60s_449_);
		Object object_454_ = null;
	    } else
		class60s
		    = class45.method1111(((Class57) this).aClass60Array746,
					 i_430_ >> 1,
					 ((Class57) this).aBoolArray808);
	    if (((Class36) class36).anIntArray380 != null) {
		i_446_ = 0;
		for (int i_455_ = 0; i_455_ < ((Class57) this).anInt743;
		     i_455_++) {
		    int i_456_ = ((Class36) class36).anIntArray380[i_455_];
		    if (i_456_ == i_445_)
			((Class57) this).aClass60Array746[i_455_]
			    = class60s[i_446_++];
		}
	    } else {
		if (((Class57) this).aClass60Array746 != class60s)
		    method1435(((Class57) this).aClass60Array746);
		((Class57) this).aClass60Array746 = class60s;
	    }
	}
	for (int i_457_ = ((Class36) class36).anInt376 - 1; i_457_ >= 0;
	     i_457_--) {
	    Class60 class60 = (((Class57) this).aClass60Array746
			       [((Class36) class36).anIntArray382[i_457_]]);
	    Class60 class60_458_
		= (((Class57) this).aClass60Array746
		   [((Class36) class36).anIntArray383[i_457_]]);
	    for (int i_459_ = 0; i_459_ < ((Class60) class60).anInt1016;
		 i_459_++) {
		float f = ((Class60) class60).aFloatArray1018[i_459_];
		float f_460_
		    = ((Class60) class60_458_).aFloatArray1018[i_459_];
		float f_461_ = f;
		float f_462_ = f_460_;
		if (f > 0.0F) {
		    if (f_460_ > 0.0F) {
			f_461_ = f;
			f_462_ = f - f_460_;
		    } else {
			f_462_ = f;
			f_461_ = f + f_460_;
		    }
		} else if (f_460_ > 0.0F) {
		    f_461_ = f;
		    f_462_ = f + f_460_;
		} else {
		    f_462_ = f;
		    f_461_ = f - f_460_;
		}
		((Class60) class60).aFloatArray1018[i_459_] = f_461_;
		((Class60) class60_458_).aFloatArray1018[i_459_] = f_462_;
	    }
	}
	for (int i_463_ = 0; i_463_ < ((Class57) this).aBoolArray739.length;
	     i_463_++)
	    ((Class57) this).aBoolArray739[i_463_]
		= ((Class57) this).aBoolArray807[i_463_];
	for (int i_464_ = 0; i_464_ < ((Class57) this).anInt743; i_464_++) {
	    if (!((Class57) this).aBoolArray739[i_464_]) {
		int i_465_ = (((Class36) class36).anIntArray380 != null
			      ? ((Class36) class36).anIntArray380[i_464_] : 0);
		int i_466_ = i_465_;
		int i_467_ = ((Class36) class36).anIntArray379[i_466_];
		((Class57) this).aClass51Array756[i_467_].method1275(i_464_);
		((Class57) this).aClass51Array756[i_467_].method1262
		    (((Class57) this).aClass60Array746[i_464_], i_430_ >> 1,
		     i_464_);
	    }
	}
	for (int i_468_ = 0; i_468_ < ((Class57) this).anInt743; i_468_++) {
	    if (((Class57) this).aBoolArray739[i_468_]) {
		for (int i_469_ = i_430_ >> 1; i_469_ < i_430_; i_469_++)
		    ((Class60) ((Class57) this).aClass60Array746[i_468_])
			.aFloatArray1018[i_469_]
			= 0.0F;
	    } else {
		int i_470_ = i_430_ >> 1;
		int i_471_ = i_430_ >> 2;
		int i_472_ = i_430_ >> 3;
		Class60 class60 = ((Class57) this).aClass60Array746[i_468_];
		for (int i_473_ = 0; i_473_ < i_470_; i_473_++)
		    ((Class60) class60).aFloatArray1018[i_473_] *= 0.5F;
		for (int i_474_ = i_470_; i_474_ < i_430_; i_474_++)
		    ((Class60) class60).aFloatArray1018[i_474_]
			= -(((Class60) class60).aFloatArray1018
			    [i_430_ - i_474_ - 1]);
		Class60 class60_475_ = (bool ? ((Class57) this).aClass60_797
					: ((Class57) this).aClass60_766);
		Class60 class60_476_ = (bool ? ((Class57) this).aClass60_745
					: ((Class57) this).aClass60_799);
		Class60 class60_477_ = (bool ? ((Class57) this).aClass60_771
					: ((Class57) this).aClass60_806);
		int[] is_478_ = (bool ? ((Class57) this).anIntArray773
				 : ((Class57) this).anIntArray765);
		for (int i_479_ = 0; i_479_ < i_471_; i_479_++) {
		    float f = (((Class60) class60).aFloatArray1018[4 * i_479_]
			       - (((Class60) class60).aFloatArray1018
				  [i_430_ - 4 * i_479_ - 1]));
		    float f_480_
			= (((Class60) class60).aFloatArray1018[4 * i_479_ + 2]
			   - (((Class60) class60).aFloatArray1018
			      [i_430_ - 4 * i_479_ - 3]));
		    float f_481_
			= ((Class60) class60_475_).aFloatArray1018[2 * i_479_];
		    float f_482_ = (((Class60) class60_475_).aFloatArray1018
				    [2 * i_479_ + 1]);
		    ((Class60) class60).aFloatArray1018[(i_430_ - 4 * i_479_
							 - 1)]
			= f * f_481_ - f_480_ * f_482_;
		    ((Class60) class60).aFloatArray1018[(i_430_ - 4 * i_479_
							 - 3)]
			= f * f_482_ + f_480_ * f_481_;
		}
		for (int i_483_ = 0; i_483_ < i_472_; i_483_++) {
		    float f = (((Class60) class60).aFloatArray1018
			       [i_470_ + 3 + 4 * i_483_]);
		    float f_484_ = (((Class60) class60).aFloatArray1018
				    [i_470_ + 1 + 4 * i_483_]);
		    float f_485_
			= ((Class60) class60).aFloatArray1018[4 * i_483_ + 3];
		    float f_486_
			= ((Class60) class60).aFloatArray1018[4 * i_483_ + 1];
		    ((Class60) class60).aFloatArray1018[(i_470_ + 3
							 + 4 * i_483_)]
			= f + f_485_;
		    ((Class60) class60).aFloatArray1018[(i_470_ + 1
							 + 4 * i_483_)]
			= f_484_ + f_486_;
		    float f_487_ = (((Class60) class60_475_).aFloatArray1018
				    [i_470_ - 4 - 4 * i_483_]);
		    float f_488_ = (((Class60) class60_475_).aFloatArray1018
				    [i_470_ - 3 - 4 * i_483_]);
		    ((Class60) class60).aFloatArray1018[4 * i_483_ + 3]
			= (f - f_485_) * f_487_ - (f_484_ - f_486_) * f_488_;
		    ((Class60) class60).aFloatArray1018[4 * i_483_ + 1]
			= (f_484_ - f_486_) * f_487_ + (f - f_485_) * f_488_;
		}
		int i_489_ = Class436.method7795(i_430_ - 1, (byte) -53);
		for (int i_490_ = 0; i_490_ < i_489_ - 3; i_490_++) {
		    int i_491_ = i_430_ >> i_490_ + 2;
		    int i_492_ = 8 << i_490_;
		    for (int i_493_ = 0; i_493_ < 2 << i_490_; i_493_++) {
			int i_494_ = i_430_ - i_491_ * 2 * i_493_;
			int i_495_ = i_430_ - i_491_ * (2 * i_493_ + 1);
			for (int i_496_ = 0; i_496_ < i_430_ >> i_490_ + 4;
			     i_496_++) {
			    int i_497_ = 4 * i_496_;
			    float f = (((Class60) class60).aFloatArray1018
				       [i_494_ - 1 - i_497_]);
			    float f_498_ = (((Class60) class60).aFloatArray1018
					    [i_494_ - 3 - i_497_]);
			    float f_499_ = (((Class60) class60).aFloatArray1018
					    [i_495_ - 1 - i_497_]);
			    float f_500_ = (((Class60) class60).aFloatArray1018
					    [i_495_ - 3 - i_497_]);
			    ((Class60) class60).aFloatArray1018[(i_494_ - 1
								 - i_497_)]
				= f + f_499_;
			    ((Class60) class60).aFloatArray1018[(i_494_ - 3
								 - i_497_)]
				= f_498_ + f_500_;
			    float f_501_ = (((Class60) class60_475_)
					    .aFloatArray1018[i_496_ * i_492_]);
			    float f_502_
				= (((Class60) class60_475_).aFloatArray1018
				   [i_496_ * i_492_ + 1]);
			    ((Class60) class60).aFloatArray1018[(i_495_ - 1
								 - i_497_)]
				= ((f - f_499_) * f_501_
				   - (f_498_ - f_500_) * f_502_);
			    ((Class60) class60).aFloatArray1018[(i_495_ - 3
								 - i_497_)]
				= ((f_498_ - f_500_) * f_501_
				   + (f - f_499_) * f_502_);
			}
		    }
		}
		for (int i_503_ = 1; i_503_ < i_472_ - 1; i_503_++) {
		    int i_504_ = is_478_[i_503_];
		    if (i_503_ < i_504_) {
			int i_505_ = 8 * i_503_;
			int i_506_ = 8 * i_504_;
			float f
			    = ((Class60) class60).aFloatArray1018[i_505_ + 1];
			((Class60) class60).aFloatArray1018[i_505_ + 1]
			    = ((Class60) class60).aFloatArray1018[i_506_ + 1];
			((Class60) class60).aFloatArray1018[i_506_ + 1] = f;
			f = ((Class60) class60).aFloatArray1018[i_505_ + 3];
			((Class60) class60).aFloatArray1018[i_505_ + 3]
			    = ((Class60) class60).aFloatArray1018[i_506_ + 3];
			((Class60) class60).aFloatArray1018[i_506_ + 3] = f;
			f = ((Class60) class60).aFloatArray1018[i_505_ + 5];
			((Class60) class60).aFloatArray1018[i_505_ + 5]
			    = ((Class60) class60).aFloatArray1018[i_506_ + 5];
			((Class60) class60).aFloatArray1018[i_506_ + 5] = f;
			f = ((Class60) class60).aFloatArray1018[i_505_ + 7];
			((Class60) class60).aFloatArray1018[i_505_ + 7]
			    = ((Class60) class60).aFloatArray1018[i_506_ + 7];
			((Class60) class60).aFloatArray1018[i_506_ + 7] = f;
		    }
		}
		for (int i_507_ = 0; i_507_ < i_470_; i_507_++)
		    ((Class60) class60).aFloatArray1018[i_507_]
			= ((Class60) class60).aFloatArray1018[2 * i_507_ + 1];
		for (int i_508_ = 0; i_508_ < i_472_; i_508_++) {
		    ((Class60) class60).aFloatArray1018[(i_430_ - 1
							 - 2 * i_508_)]
			= ((Class60) class60).aFloatArray1018[4 * i_508_];
		    ((Class60) class60).aFloatArray1018[(i_430_ - 2
							 - 2 * i_508_)]
			= ((Class60) class60).aFloatArray1018[4 * i_508_ + 1];
		    ((Class60) class60).aFloatArray1018[(i_430_ - i_471_ - 1
							 - 2 * i_508_)]
			= ((Class60) class60).aFloatArray1018[4 * i_508_ + 2];
		    ((Class60) class60).aFloatArray1018[(i_430_ - i_471_ - 2
							 - 2 * i_508_)]
			= ((Class60) class60).aFloatArray1018[4 * i_508_ + 3];
		}
		for (int i_509_ = 0; i_509_ < i_472_; i_509_++) {
		    float f
			= ((Class60) class60_477_).aFloatArray1018[2 * i_509_];
		    float f_510_ = (((Class60) class60_477_).aFloatArray1018
				    [2 * i_509_ + 1]);
		    float f_511_ = (((Class60) class60).aFloatArray1018
				    [i_470_ + 2 * i_509_]);
		    float f_512_ = (((Class60) class60).aFloatArray1018
				    [i_470_ + 2 * i_509_ + 1]);
		    float f_513_ = (((Class60) class60).aFloatArray1018
				    [i_430_ - 2 - 2 * i_509_]);
		    float f_514_ = (((Class60) class60).aFloatArray1018
				    [i_430_ - 1 - 2 * i_509_]);
		    float f_515_
			= f_510_ * (f_511_ - f_513_) + f * (f_512_ + f_514_);
		    ((Class60) class60).aFloatArray1018[i_470_ + 2 * i_509_]
			= (f_511_ + f_513_ + f_515_) * 0.5F;
		    ((Class60) class60).aFloatArray1018[(i_430_ - 2
							 - 2 * i_509_)]
			= (f_511_ + f_513_ - f_515_) * 0.5F;
		    f_515_
			= f_510_ * (f_512_ + f_514_) - f * (f_511_ - f_513_);
		    ((Class60) class60).aFloatArray1018[(i_470_ + 2 * i_509_
							 + 1)]
			= (f_512_ - f_514_ + f_515_) * 0.5F;
		    ((Class60) class60).aFloatArray1018[(i_430_ - 1
							 - 2 * i_509_)]
			= (-f_512_ + f_514_ + f_515_) * 0.5F;
		}
		for (int i_516_ = 0; i_516_ < i_471_; i_516_++) {
		    ((Class60) class60).aFloatArray1018[i_516_]
			= (((((Class60) class60).aFloatArray1018
			     [2 * i_516_ + i_470_])
			    * (((Class60) class60_476_).aFloatArray1018
			       [2 * i_516_]))
			   + ((((Class60) class60).aFloatArray1018
			       [2 * i_516_ + 1 + i_470_])
			      * (((Class60) class60_476_).aFloatArray1018
				 [2 * i_516_ + 1])));
		    ((Class60) class60).aFloatArray1018[i_470_ - 1 - i_516_]
			= (((((Class60) class60).aFloatArray1018
			     [2 * i_516_ + i_470_])
			    * (((Class60) class60_476_).aFloatArray1018
			       [2 * i_516_ + 1]))
			   - ((((Class60) class60).aFloatArray1018
			       [2 * i_516_ + 1 + i_470_])
			      * (((Class60) class60_476_).aFloatArray1018
				 [2 * i_516_])));
		}
		for (int i_517_ = 0; i_517_ < i_471_; i_517_++)
		    ((Class60) class60).aFloatArray1018[(i_430_ - i_471_
							 + i_517_)]
			= -((Class60) class60).aFloatArray1018[i_517_];
		for (int i_518_ = 0; i_518_ < i_471_; i_518_++)
		    ((Class60) class60).aFloatArray1018[i_518_]
			= ((Class60) class60).aFloatArray1018[i_471_ + i_518_];
		for (int i_519_ = 0; i_519_ < i_471_; i_519_++)
		    ((Class60) class60).aFloatArray1018[i_471_ + i_519_]
			= -(((Class60) class60).aFloatArray1018
			    [i_471_ - i_519_ - 1]);
		for (int i_520_ = 0; i_520_ < i_471_; i_520_++)
		    ((Class60) class60).aFloatArray1018[i_470_ + i_520_]
			= (((Class60) class60).aFloatArray1018
			   [i_430_ - i_520_ - 1]);
		for (int i_521_ = i_434_; i_521_ < i_435_; i_521_++) {
		    float f
			= (float) Math.sin(((double) (i_521_ - i_434_) + 0.5)
					   / (double) i_436_ * 0.5
					   * 3.141592653589793);
		    ((Class60) ((Class57) this).aClass60Array746[i_468_])
			.aFloatArray1018[i_521_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_522_ = i_437_; i_522_ < i_438_; i_522_++) {
		    float f
			= (float) Math.sin((((double) (i_522_ - i_437_) + 0.5)
					    / (double) i_439_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    ((Class60) ((Class57) this).aClass60Array746[i_468_])
			.aFloatArray1018[i_522_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class60[] class60s = null;
	if (((Class57) this).anInt767 > 0) {
	    int i_523_ = ((Class57) this).anInt767 + i_430_ >> 2;
	    class60s = method1400(((Class57) this).anInt743, i_523_);
	    for (int i_524_ = 0; i_524_ < ((Class57) this).anInt743;
		 i_524_++) {
		if (!((Class57) this).aBoolArray764[i_524_]) {
		    for (int i_525_ = 0; i_525_ < ((Class57) this).anInt777;
			 i_525_++) {
			int i_526_ = (((Class57) this).anInt767 >> 1) + i_525_;
			((Class60) class60s[i_524_]).aFloatArray1018[i_525_]
			    += ((Class60) (((Class57) this).aClass60Array761
					   [i_524_])).aFloatArray1018[i_526_];
		    }
		}
		if (!((Class57) this).aBoolArray739[i_524_]) {
		    for (int i_527_ = i_434_; i_527_ < i_430_ >> 1; i_527_++) {
			int i_528_ = (((Class60) class60s[i_524_]).anInt1016
				      - (i_430_ >> 1) + i_527_);
			((Class60) class60s[i_524_]).aFloatArray1018[i_528_]
			    += ((Class60) (((Class57) this).aClass60Array746
					   [i_524_])).aFloatArray1018[i_527_];
		    }
		}
	    }
	}
	Class60[] class60s_529_ = ((Class57) this).aClass60Array761;
	((Class57) this).aClass60Array761 = ((Class57) this).aClass60Array746;
	((Class57) this).aClass60Array746 = class60s_529_;
	((Class57) this).anInt767 = i_430_;
	((Class57) this).anInt777 = i_438_ - (i_430_ >> 1);
	((Class57) this).aBoolArray764 = ((Class57) this).aBoolArray739;
	atomicreference.set(class60s);
	return true;
    }
    
    void method1483() {
	if (method317() != Class303.aClass303_4794
	    && method317() != Class303.aClass303_4791
	    && (!((Class57) this).aBool782
		|| !((float) (((Class57) this).anInt800 / method1397())
		     > ((Class57) this).aFloat792))) {
	    if (!method1407()) {
		RSByteBuffer class241_sub3
		    = ((RSByteBuffer)
		       ((((Class57) this).aList768 != null
			 && !((Class57) this).aList768.isEmpty())
			? ((Class57) this).aList768.get(0) : null));
		if (class241_sub3 == null) {
		    if (!((Class57) this).aBool780) {
			method1394(Class303.aClass303_4791);
			((Class57) this).anInterface34_744
			    .method191(-2091621460);
			((Class57) this).aBool780 = true;
		    }
		    return;
		}
		((Class57) this).aBool780 = false;
		((Class57) this).aBool774 = true;
		((Class57) this).aList768.remove(0);
		method1406(class241_sub3);
	    }
	    method1432();
	}
    }
    
    synchronized void method1484(RSByteBuffer class241_sub3) {
	((Class57) this).aList768.add(class241_sub3);
	method1394(Class303.aClass303_4792);
    }
    
    synchronized void method1485() {
	int i = (((Class57) this).aClass241_Sub3_776 != null
		 ? ((Class57) this).aClass241_Sub3_776.pointer * 421967667
		 : 0);
	int i_530_ = 0;
	Iterator iterator = ((Class57) this).aList775.iterator();
	while (iterator.hasNext()) {
	    RSByteBuffer class241_sub3 = (RSByteBuffer) iterator.next();
	    i_530_ += class241_sub3.pointer * 421967667;
	}
	if (((Class57) this).aClass241_Sub3_776 != null) {
	    if ((((Class57) this).aClass241_Sub3_776.payload.length
		 - ((Class57) this).aClass241_Sub3_776.pointer * 421967667)
		< i_530_) {
		RSByteBuffer class241_sub3
		    = method1438(i_530_ + ((Class57) this).anInt795);
		class241_sub3.writeBytes
		    (((Class57) this).aClass241_Sub3_776.payload,
		     (((Class57) this).aClass241_Sub3_776.pointer * 421967667
		      - ((Class57) this).anInt778),
		     ((Class57) this).anInt795, 752061035);
		((Class57) this).aClass241_Sub3_776.method14618(-174251917);
		((Class57) this).aClass241_Sub3_776 = class241_sub3;
		i = ((Class57) this).anInt778;
	    }
	} else {
	    ((Class57) this).aClass241_Sub3_776 = method1438(i_530_);
	    ((Class57) this).anInt795 = 0;
	    i = 0;
	}
	iterator = ((Class57) this).aList775.iterator();
	while (iterator.hasNext()) {
	    RSByteBuffer class241_sub3 = (RSByteBuffer) iterator.next();
	    ((Class57) this).aClass241_Sub3_776.writeBytes
		(class241_sub3.payload, 0,
		 class241_sub3.pointer * 421967667, 752061035);
	    ((Class57) this).anInt795 += class241_sub3.pointer * 421967667;
	    class241_sub3.method14618(-174251917);
	}
	((Class57) this).aClass241_Sub3_776.pointer
	    = (i - ((Class57) this).anInt778) * -681042949;
	((Class57) this).anInt778 = 0;
	((Class57) this).aList775.clear();
	while (((Class57) this).aBool774
	       && (((Class57) this).aClass241_Sub3_776.pointer * 421967667
		   < (((Class57) this).aClass241_Sub3_776
		      .payload).length)) {
	    if (((Class57) this).aBool782
		&& ((float) (((Class57) this).anInt800 / method1397())
		    > ((Class57) this).aFloat792))
		break;
	    if (((Class57) this).aClass241_Sub3_776 == null
		|| ((Class57) this).anInt795 < 27) {
		if (((Class57) this).aClass241_Sub3_776 != null) {
		    ((Class57) this).anInt778 = ((Class57) this).anInt795;
		    ((Class57) this).aClass241_Sub3_776.pointer
			+= ((Class57) this).anInt795 * -681042949;
		}
		((Class57) this).aBool774 = false;
		break;
	    }
	    int i_531_
		= ((Class57) this).aClass241_Sub3_776.pointer * 421967667;
	    int i_532_ = 0;
	    int i_533_ = 0;
	    if (!method1408(((Class57) this).aClass241_Sub3_776))
		break;
	    ((Class57) this).anInt790++;
	    if (((Class57) this).anInt789 < 0)
		((Class57) this).anInt769++;
	    ((Class57) this).aList752.clear();
	    ((Class57) this).aList794.clear();
	    ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) 69);
	    int i_534_
		= ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) -32);
	    int i_535_
		= ((((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) 18)
		    & 0xff)
		   | (((Class57) this).aClass241_Sub3_776
			  .readUnsignedByte((byte) 69)
		      & 0xff) << 8
		   | (((Class57) this).aClass241_Sub3_776
			  .readUnsignedByte((byte) -79)
		      & 0xff) << 16
		   | ((Class57) this).aClass241_Sub3_776
			 .readUnsignedByte((byte) 44) << 24);
	    i_532_ = i_535_ - i_532_;
	    ((Class57) this).aClass241_Sub3_776.pointer += 1988214704;
	    int i_536_
		= ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) -31);
	    int i_537_
		= ((Class57) this).aClass241_Sub3_776.pointer * 421967667;
	    int i_538_ = i_537_ + i_536_;
	    if (i_538_ > i_531_ + ((Class57) this).anInt795) {
		((Class57) this).aClass241_Sub3_776.pointer
		    = (i_531_ + ((Class57) this).anInt795) * -681042949;
		((Class57) this).anInt778
		    = (((Class57) this).aClass241_Sub3_776.pointer
		       * 421967667) - i_531_;
		((Class57) this).aBool774 = false;
	    }
	    int i_539_ = i_538_;
	    int i_540_ = 0;
	    if (((Class57) this).aBool774) {
		for (int i_541_ = 0; i_541_ < i_536_; i_541_++) {
		    int i_542_ = ((((Class57) this).aClass241_Sub3_776
				   .payload[i_537_++])
				  & 0xff);
		    i_538_ += i_542_;
		    i_540_ += i_542_;
		    if (i_538_ > i_531_ + ((Class57) this).anInt795) {
			((Class57) this).aClass241_Sub3_776.pointer
			    = ((i_531_ + ((Class57) this).anInt795)
			       * -681042949);
			((Class57) this).anInt778
			    = (((Class57) this).aClass241_Sub3_776.pointer
			       * 421967667) - i_531_;
			((Class57) this).aBool774 = false;
			break;
		    }
		    if (i_542_ < 255) {
			((Class57) this).aList752.add(Integer.valueOf(i_539_));
			((Class57) this).aList794.add(Integer.valueOf(i_540_));
			i_539_ = i_538_;
			i_540_ = 0;
		    }
		}
	    }
	    if (((Class57) this).aBool774) {
		int i_543_ = i_538_;
		int i_544_ = -1;
		Iterator iterator_545_ = ((Class57) this).aList752.iterator();
		Iterator iterator_546_ = ((Class57) this).aList794.iterator();
		boolean bool = false;
		((Class57) this).anInt772 = 0;
		while (iterator_545_.hasNext()) {
		    Integer integer = (Integer) iterator_545_.next();
		    Integer integer_547_ = (Integer) iterator_546_.next();
		    i_544_++;
		    if (method154() && ((Class57) this).aBool787 == true
			&& (((Class57) this).anInt790
			    < ((Class57) this).anInt769)
			&& i_544_ < ((Class57) this).anInt789) {
			Class57 class57_548_ = this;
			((Class57) class57_548_).anInt783
			    = ((Class57) class57_548_).anInt783 + (bool ? 0
								   : i_532_);
			bool = true;
		    } else {
			((Class57) this).anAtomicReference754.set(null);
			boolean bool_549_
			    = method1476((((Class57) this).aClass241_Sub3_776
					  .payload),
					 integer.intValue(),
					 integer_547_.intValue(),
					 (((Class57) this)
					  .anAtomicReference754));
			Class60[] class60s
			    = ((Class60[])
			       ((Class57) this).anAtomicReference754.get());
			if (bool_549_
			    && (((Class57) this).aBool787 != true
				|| (((Class57) this).anInt790
				    >= ((Class57) this).anInt769)
				|| i_544_ >= ((Class57) this).anInt789)) {
			    if (class60s != null) {
				int i_550_ = ((Class60) class60s[0]).anInt1016;
				((Class57) this).anInt786 += i_550_;
				if (((Class57) this).anInt786 > i_535_
				    && i_534_ == 4) {
				    ((Class57) this).anInt772
					= (((Class57) this).anInt786 - i_535_
					   - ((Class57) this).anInt772);
				    i_550_ -= ((Class57) this).anInt772;
				    if (((Class57) this).anInt772
					> ((Class60) class60s[0]).anInt1016)
					((Class57) this).anInt772
					    = (((Class60) class60s[0])
					       .anInt1016);
				    if (i_550_ < 0)
					i_550_ = 0;
				}
				int i_551_ = 0;
				int i_552_
				    = method287(i_550_) * class60s.length;
				if (((Class57) this).aBool787 == true
				    && (((Class57) this).anInt783
					< ((Class57) this).anInt750)) {
				    int i_553_ = i_552_;
				    i_552_
					-= method287(((Class57) this).anInt750
						     - (((Class57) this)
							.anInt783));
				    if (i_552_ <= 0) {
					((Class57) this).anInt783
					    += method200(i_553_);
					method1435(class60s);
					Object object = null;
					continue;
				    }
				    i_551_ += (((Class57) this).anInt750
					       - ((Class57) this).anInt783);
				}
				if ((((Class57) this).anInt783 + i_550_
				     > ((Class57) this).anInt751)
				    && ((((Class57) this).anInt747
					 < ((Class57) this).anInt791)
					|| ((Class57) this).anInt791 < 0)
				    && ((Class57) this).aBool793) {
				    i_552_
					-= method287(((Class57) this).anInt783
						     + i_550_
						     - (((Class57) this)
							.anInt751)
						     - 1);
				    if (i_552_ <= 0) {
					method1435(class60s);
					Object object = null;
					continue;
				    }
				}
				int i_554_ = method223();
				if (method1396() < method223()) {
				    int i_555_ = method223() - method1396();
				    i_552_ += i_552_ / method1396() * i_555_;
				}
				RSByteBuffer class241_sub3
				    = method1438(i_552_);
				for (int i_556_ = i_551_; i_556_ < i_550_;
				     i_556_++) {
				    boolean bool_557_
					= ((Class57) this).aBool787;
				    if (((Class57) this).anInt791 != 0) {
					if (((Class57) this).anInt783
					    == ((Class57) this).anInt750) {
					    if (((Class57) this).anInt784
						< 0) {
						((Class57) this).anInt784
						    = (((Class57) this)
						       .anInt763);
						((Class57) this).anInt789
						    = i_544_;
					    }
					    ((Class57) this).aBool787 = false;
					}
					if ((((Class57) this).anInt783
					     == ((Class57) this).anInt751)
					    && ((Class57) this).anInt785 < 0)
					    ((Class57) this).anInt785
						= ((Class57) this).anInt763;
					if ((((Class57) this).anInt783
					     > ((Class57) this).anInt751)
					    && ((((Class57) this).anInt747
						 < ((Class57) this).anInt791)
						|| (((Class57) this).anInt791
						    < 0))
					    && ((Class57) this).aBool793)
					    bool_557_ = true;
				    }
				    if (bool_557_
					&& ((((Class57) this).anInt783
					     < ((Class57) this).anInt750)
					    || (((Class57) this).anInt783
						> (((Class57) this)
						   .anInt751)))) {
					((Class57) this).anInt783++;
					if (++i_533_ > i_532_)
					    throw new RuntimeException();
				    } else {
					for (int i_558_ = 0; i_558_ < i_554_;
					     i_558_++) {
					    float f;
					    if (i_558_ < class60s.length)
						f = (((Class60)
						      class60s[i_558_])
						     .aFloatArray1018[i_556_]);
					    else
						f = (((Class60)
						      (class60s
						       [(i_558_
							 % method1396())]))
						     .aFloatArray1018[i_556_]);
					    if (((Class57) this).aClass320_740
						== Class320.aClass320_4878) {
						int i_559_ = method1418(f);
						if ((((Class57) this)
						     .aClass329_748)
						    == Class329.aClass329_5031)
						    class241_sub3.method14621
							(i_559_, (byte) 19);
						else
						    class241_sub3.writeShort
							(i_559_, -484048531);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4874)) {
						int i_560_ = method1419(f);
						if ((((Class57) this)
						     .aClass329_748)
						    == Class329.aClass329_5031)
						    class241_sub3.method14621
							(i_560_, (byte) -50);
						else
						    class241_sub3.writeShort
							(i_560_, -484048531);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4873)) {
						int i_561_ = method1499(f);
						class241_sub3.writeByte
						    (i_561_, -1644083057);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4876)) {
						int i_562_ = method1421(f);
						class241_sub3.writeByte
						    (i_562_, 1162390531);
					    }
					}
					((Class57) this).anInt783++;
					i_533_++;
				    }
				}
				synchronized (((Class57) this).aList779) {
				    ((Class57) this).anInt800
					+= (method200(class241_sub3.pointer
						      * 421967667)
					    / method223());
				    ((Class57) this).aList779
					.add(class241_sub3);
				}
			    }
			} else if (method154()) {
			    ((Class57) this).anInt767 = 0;
			    if (((Class57) this).aClass60Array761 == null
				|| (((Class57) this).aClass60Array761 != null
				    && (((((Class57) this)
					  .aClass60Array761).length
					 != ((Class57) this).anInt743)
					|| ((((Class60) (((Class57) this)
							 .aClass60Array761[0]))
					     .anInt1016)
					    != ((Class57) this).anInt741)))) {
				if (((Class57) this).aClass60Array761 != null)
				    method1435(((Class57) this)
					       .aClass60Array761);
				((Class57) this).aClass60Array761
				    = method1400(((Class57) this).anInt743,
						 ((Class57) this).anInt741);
			    }
			}
			method1435(class60s);
			Object object = null;
		    }
		}
		((Class57) this).aClass241_Sub3_776.pointer
		    = i_543_ * -681042949;
		((Class57) this).anInt795 -= i_543_ - i_531_;
	    }
	}
    }
    
    synchronized void method1486() {
	int i = (((Class57) this).aClass241_Sub3_776 != null
		 ? ((Class57) this).aClass241_Sub3_776.pointer * 421967667
		 : 0);
	int i_563_ = 0;
	Iterator iterator = ((Class57) this).aList775.iterator();
	while (iterator.hasNext()) {
	    RSByteBuffer class241_sub3 = (RSByteBuffer) iterator.next();
	    i_563_ += class241_sub3.pointer * 421967667;
	}
	if (((Class57) this).aClass241_Sub3_776 != null) {
	    if ((((Class57) this).aClass241_Sub3_776.payload.length
		 - ((Class57) this).aClass241_Sub3_776.pointer * 421967667)
		< i_563_) {
		RSByteBuffer class241_sub3
		    = method1438(i_563_ + ((Class57) this).anInt795);
		class241_sub3.writeBytes
		    (((Class57) this).aClass241_Sub3_776.payload,
		     (((Class57) this).aClass241_Sub3_776.pointer * 421967667
		      - ((Class57) this).anInt778),
		     ((Class57) this).anInt795, 752061035);
		((Class57) this).aClass241_Sub3_776.method14618(-174251917);
		((Class57) this).aClass241_Sub3_776 = class241_sub3;
		i = ((Class57) this).anInt778;
	    }
	} else {
	    ((Class57) this).aClass241_Sub3_776 = method1438(i_563_);
	    ((Class57) this).anInt795 = 0;
	    i = 0;
	}
	iterator = ((Class57) this).aList775.iterator();
	while (iterator.hasNext()) {
	    RSByteBuffer class241_sub3 = (RSByteBuffer) iterator.next();
	    ((Class57) this).aClass241_Sub3_776.writeBytes
		(class241_sub3.payload, 0,
		 class241_sub3.pointer * 421967667, 752061035);
	    ((Class57) this).anInt795 += class241_sub3.pointer * 421967667;
	    class241_sub3.method14618(-174251917);
	}
	((Class57) this).aClass241_Sub3_776.pointer
	    = (i - ((Class57) this).anInt778) * -681042949;
	((Class57) this).anInt778 = 0;
	((Class57) this).aList775.clear();
	while (((Class57) this).aBool774
	       && (((Class57) this).aClass241_Sub3_776.pointer * 421967667
		   < (((Class57) this).aClass241_Sub3_776
		      .payload).length)) {
	    if (((Class57) this).aBool782
		&& ((float) (((Class57) this).anInt800 / method1397())
		    > ((Class57) this).aFloat792))
		break;
	    if (((Class57) this).aClass241_Sub3_776 == null
		|| ((Class57) this).anInt795 < 27) {
		if (((Class57) this).aClass241_Sub3_776 != null) {
		    ((Class57) this).anInt778 = ((Class57) this).anInt795;
		    ((Class57) this).aClass241_Sub3_776.pointer
			+= ((Class57) this).anInt795 * -681042949;
		}
		((Class57) this).aBool774 = false;
		break;
	    }
	    int i_564_
		= ((Class57) this).aClass241_Sub3_776.pointer * 421967667;
	    int i_565_ = 0;
	    int i_566_ = 0;
	    if (!method1408(((Class57) this).aClass241_Sub3_776))
		break;
	    ((Class57) this).anInt790++;
	    if (((Class57) this).anInt789 < 0)
		((Class57) this).anInt769++;
	    ((Class57) this).aList752.clear();
	    ((Class57) this).aList794.clear();
	    ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) 45);
	    int i_567_
		= ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) -1);
	    int i_568_
		= ((((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) 7)
		    & 0xff)
		   | (((Class57) this).aClass241_Sub3_776
			  .readUnsignedByte((byte) -8)
		      & 0xff) << 8
		   | (((Class57) this).aClass241_Sub3_776
			  .readUnsignedByte((byte) 14)
		      & 0xff) << 16
		   | ((Class57) this).aClass241_Sub3_776
			 .readUnsignedByte((byte) -65) << 24);
	    i_565_ = i_568_ - i_565_;
	    ((Class57) this).aClass241_Sub3_776.pointer += 1988214704;
	    int i_569_
		= ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) -104);
	    int i_570_
		= ((Class57) this).aClass241_Sub3_776.pointer * 421967667;
	    int i_571_ = i_570_ + i_569_;
	    if (i_571_ > i_564_ + ((Class57) this).anInt795) {
		((Class57) this).aClass241_Sub3_776.pointer
		    = (i_564_ + ((Class57) this).anInt795) * -681042949;
		((Class57) this).anInt778
		    = (((Class57) this).aClass241_Sub3_776.pointer
		       * 421967667) - i_564_;
		((Class57) this).aBool774 = false;
	    }
	    int i_572_ = i_571_;
	    int i_573_ = 0;
	    if (((Class57) this).aBool774) {
		for (int i_574_ = 0; i_574_ < i_569_; i_574_++) {
		    int i_575_ = ((((Class57) this).aClass241_Sub3_776
				   .payload[i_570_++])
				  & 0xff);
		    i_571_ += i_575_;
		    i_573_ += i_575_;
		    if (i_571_ > i_564_ + ((Class57) this).anInt795) {
			((Class57) this).aClass241_Sub3_776.pointer
			    = ((i_564_ + ((Class57) this).anInt795)
			       * -681042949);
			((Class57) this).anInt778
			    = (((Class57) this).aClass241_Sub3_776.pointer
			       * 421967667) - i_564_;
			((Class57) this).aBool774 = false;
			break;
		    }
		    if (i_575_ < 255) {
			((Class57) this).aList752.add(Integer.valueOf(i_572_));
			((Class57) this).aList794.add(Integer.valueOf(i_573_));
			i_572_ = i_571_;
			i_573_ = 0;
		    }
		}
	    }
	    if (((Class57) this).aBool774) {
		int i_576_ = i_571_;
		int i_577_ = -1;
		Iterator iterator_578_ = ((Class57) this).aList752.iterator();
		Iterator iterator_579_ = ((Class57) this).aList794.iterator();
		boolean bool = false;
		((Class57) this).anInt772 = 0;
		while (iterator_578_.hasNext()) {
		    Integer integer = (Integer) iterator_578_.next();
		    Integer integer_580_ = (Integer) iterator_579_.next();
		    i_577_++;
		    if (method154() && ((Class57) this).aBool787 == true
			&& (((Class57) this).anInt790
			    < ((Class57) this).anInt769)
			&& i_577_ < ((Class57) this).anInt789) {
			Class57 class57_581_ = this;
			((Class57) class57_581_).anInt783
			    = ((Class57) class57_581_).anInt783 + (bool ? 0
								   : i_565_);
			bool = true;
		    } else {
			((Class57) this).anAtomicReference754.set(null);
			boolean bool_582_
			    = method1476((((Class57) this).aClass241_Sub3_776
					  .payload),
					 integer.intValue(),
					 integer_580_.intValue(),
					 (((Class57) this)
					  .anAtomicReference754));
			Class60[] class60s
			    = ((Class60[])
			       ((Class57) this).anAtomicReference754.get());
			if (bool_582_
			    && (((Class57) this).aBool787 != true
				|| (((Class57) this).anInt790
				    >= ((Class57) this).anInt769)
				|| i_577_ >= ((Class57) this).anInt789)) {
			    if (class60s != null) {
				int i_583_ = ((Class60) class60s[0]).anInt1016;
				((Class57) this).anInt786 += i_583_;
				if (((Class57) this).anInt786 > i_568_
				    && i_567_ == 4) {
				    ((Class57) this).anInt772
					= (((Class57) this).anInt786 - i_568_
					   - ((Class57) this).anInt772);
				    i_583_ -= ((Class57) this).anInt772;
				    if (((Class57) this).anInt772
					> ((Class60) class60s[0]).anInt1016)
					((Class57) this).anInt772
					    = (((Class60) class60s[0])
					       .anInt1016);
				    if (i_583_ < 0)
					i_583_ = 0;
				}
				int i_584_ = 0;
				int i_585_
				    = method287(i_583_) * class60s.length;
				if (((Class57) this).aBool787 == true
				    && (((Class57) this).anInt783
					< ((Class57) this).anInt750)) {
				    int i_586_ = i_585_;
				    i_585_
					-= method287(((Class57) this).anInt750
						     - (((Class57) this)
							.anInt783));
				    if (i_585_ <= 0) {
					((Class57) this).anInt783
					    += method200(i_586_);
					method1435(class60s);
					Object object = null;
					continue;
				    }
				    i_584_ += (((Class57) this).anInt750
					       - ((Class57) this).anInt783);
				}
				if ((((Class57) this).anInt783 + i_583_
				     > ((Class57) this).anInt751)
				    && ((((Class57) this).anInt747
					 < ((Class57) this).anInt791)
					|| ((Class57) this).anInt791 < 0)
				    && ((Class57) this).aBool793) {
				    i_585_
					-= method287(((Class57) this).anInt783
						     + i_583_
						     - (((Class57) this)
							.anInt751)
						     - 1);
				    if (i_585_ <= 0) {
					method1435(class60s);
					Object object = null;
					continue;
				    }
				}
				int i_587_ = method223();
				if (method1396() < method223()) {
				    int i_588_ = method223() - method1396();
				    i_585_ += i_585_ / method1396() * i_588_;
				}
				RSByteBuffer class241_sub3
				    = method1438(i_585_);
				for (int i_589_ = i_584_; i_589_ < i_583_;
				     i_589_++) {
				    boolean bool_590_
					= ((Class57) this).aBool787;
				    if (((Class57) this).anInt791 != 0) {
					if (((Class57) this).anInt783
					    == ((Class57) this).anInt750) {
					    if (((Class57) this).anInt784
						< 0) {
						((Class57) this).anInt784
						    = (((Class57) this)
						       .anInt763);
						((Class57) this).anInt789
						    = i_577_;
					    }
					    ((Class57) this).aBool787 = false;
					}
					if ((((Class57) this).anInt783
					     == ((Class57) this).anInt751)
					    && ((Class57) this).anInt785 < 0)
					    ((Class57) this).anInt785
						= ((Class57) this).anInt763;
					if ((((Class57) this).anInt783
					     > ((Class57) this).anInt751)
					    && ((((Class57) this).anInt747
						 < ((Class57) this).anInt791)
						|| (((Class57) this).anInt791
						    < 0))
					    && ((Class57) this).aBool793)
					    bool_590_ = true;
				    }
				    if (bool_590_
					&& ((((Class57) this).anInt783
					     < ((Class57) this).anInt750)
					    || (((Class57) this).anInt783
						> (((Class57) this)
						   .anInt751)))) {
					((Class57) this).anInt783++;
					if (++i_566_ > i_565_)
					    throw new RuntimeException();
				    } else {
					for (int i_591_ = 0; i_591_ < i_587_;
					     i_591_++) {
					    float f;
					    if (i_591_ < class60s.length)
						f = (((Class60)
						      class60s[i_591_])
						     .aFloatArray1018[i_589_]);
					    else
						f = (((Class60)
						      (class60s
						       [(i_591_
							 % method1396())]))
						     .aFloatArray1018[i_589_]);
					    if (((Class57) this).aClass320_740
						== Class320.aClass320_4878) {
						int i_592_ = method1418(f);
						if ((((Class57) this)
						     .aClass329_748)
						    == Class329.aClass329_5031)
						    class241_sub3.method14621
							(i_592_, (byte) -16);
						else
						    class241_sub3.writeShort
							(i_592_, -484048531);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4874)) {
						int i_593_ = method1419(f);
						if ((((Class57) this)
						     .aClass329_748)
						    == Class329.aClass329_5031)
						    class241_sub3.method14621
							(i_593_, (byte) -9);
						else
						    class241_sub3.writeShort
							(i_593_, -484048531);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4873)) {
						int i_594_ = method1499(f);
						class241_sub3.writeByte
						    (i_594_, -683157617);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4876)) {
						int i_595_ = method1421(f);
						class241_sub3.writeByte
						    (i_595_, -610759934);
					    }
					}
					((Class57) this).anInt783++;
					i_566_++;
				    }
				}
				synchronized (((Class57) this).aList779) {
				    ((Class57) this).anInt800
					+= (method200(class241_sub3.pointer
						      * 421967667)
					    / method223());
				    ((Class57) this).aList779
					.add(class241_sub3);
				}
			    }
			} else if (method154()) {
			    ((Class57) this).anInt767 = 0;
			    if (((Class57) this).aClass60Array761 == null
				|| (((Class57) this).aClass60Array761 != null
				    && (((((Class57) this)
					  .aClass60Array761).length
					 != ((Class57) this).anInt743)
					|| ((((Class60) (((Class57) this)
							 .aClass60Array761[0]))
					     .anInt1016)
					    != ((Class57) this).anInt741)))) {
				if (((Class57) this).aClass60Array761 != null)
				    method1435(((Class57) this)
					       .aClass60Array761);
				((Class57) this).aClass60Array761
				    = method1400(((Class57) this).anInt743,
						 ((Class57) this).anInt741);
			    }
			}
			method1435(class60s);
			Object object = null;
		    }
		}
		((Class57) this).aClass241_Sub3_776.pointer
		    = i_576_ * -681042949;
		((Class57) this).anInt795 -= i_576_ - i_564_;
	    }
	}
    }
    
    synchronized void method1487() {
	int i = (((Class57) this).aClass241_Sub3_776 != null
		 ? ((Class57) this).aClass241_Sub3_776.pointer * 421967667
		 : 0);
	int i_596_ = 0;
	Iterator iterator = ((Class57) this).aList775.iterator();
	while (iterator.hasNext()) {
	    RSByteBuffer class241_sub3 = (RSByteBuffer) iterator.next();
	    i_596_ += class241_sub3.pointer * 421967667;
	}
	if (((Class57) this).aClass241_Sub3_776 != null) {
	    if ((((Class57) this).aClass241_Sub3_776.payload.length
		 - ((Class57) this).aClass241_Sub3_776.pointer * 421967667)
		< i_596_) {
		RSByteBuffer class241_sub3
		    = method1438(i_596_ + ((Class57) this).anInt795);
		class241_sub3.writeBytes
		    (((Class57) this).aClass241_Sub3_776.payload,
		     (((Class57) this).aClass241_Sub3_776.pointer * 421967667
		      - ((Class57) this).anInt778),
		     ((Class57) this).anInt795, 752061035);
		((Class57) this).aClass241_Sub3_776.method14618(-174251917);
		((Class57) this).aClass241_Sub3_776 = class241_sub3;
		i = ((Class57) this).anInt778;
	    }
	} else {
	    ((Class57) this).aClass241_Sub3_776 = method1438(i_596_);
	    ((Class57) this).anInt795 = 0;
	    i = 0;
	}
	iterator = ((Class57) this).aList775.iterator();
	while (iterator.hasNext()) {
	    RSByteBuffer class241_sub3 = (RSByteBuffer) iterator.next();
	    ((Class57) this).aClass241_Sub3_776.writeBytes
		(class241_sub3.payload, 0,
		 class241_sub3.pointer * 421967667, 752061035);
	    ((Class57) this).anInt795 += class241_sub3.pointer * 421967667;
	    class241_sub3.method14618(-174251917);
	}
	((Class57) this).aClass241_Sub3_776.pointer
	    = (i - ((Class57) this).anInt778) * -681042949;
	((Class57) this).anInt778 = 0;
	((Class57) this).aList775.clear();
	while (((Class57) this).aBool774
	       && (((Class57) this).aClass241_Sub3_776.pointer * 421967667
		   < (((Class57) this).aClass241_Sub3_776
		      .payload).length)) {
	    if (((Class57) this).aBool782
		&& ((float) (((Class57) this).anInt800 / method1397())
		    > ((Class57) this).aFloat792))
		break;
	    if (((Class57) this).aClass241_Sub3_776 == null
		|| ((Class57) this).anInt795 < 27) {
		if (((Class57) this).aClass241_Sub3_776 != null) {
		    ((Class57) this).anInt778 = ((Class57) this).anInt795;
		    ((Class57) this).aClass241_Sub3_776.pointer
			+= ((Class57) this).anInt795 * -681042949;
		}
		((Class57) this).aBool774 = false;
		break;
	    }
	    int i_597_
		= ((Class57) this).aClass241_Sub3_776.pointer * 421967667;
	    int i_598_ = 0;
	    int i_599_ = 0;
	    if (!method1408(((Class57) this).aClass241_Sub3_776))
		break;
	    ((Class57) this).anInt790++;
	    if (((Class57) this).anInt789 < 0)
		((Class57) this).anInt769++;
	    ((Class57) this).aList752.clear();
	    ((Class57) this).aList794.clear();
	    ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) -34);
	    int i_600_
		= ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) -60);
	    int i_601_
		= ((((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) -28)
		    & 0xff)
		   | (((Class57) this).aClass241_Sub3_776
			  .readUnsignedByte((byte) -46)
		      & 0xff) << 8
		   | (((Class57) this).aClass241_Sub3_776
			  .readUnsignedByte((byte) -50)
		      & 0xff) << 16
		   | ((Class57) this).aClass241_Sub3_776
			 .readUnsignedByte((byte) -17) << 24);
	    i_598_ = i_601_ - i_598_;
	    ((Class57) this).aClass241_Sub3_776.pointer += 1988214704;
	    int i_602_
		= ((Class57) this).aClass241_Sub3_776.readUnsignedByte((byte) 108);
	    int i_603_
		= ((Class57) this).aClass241_Sub3_776.pointer * 421967667;
	    int i_604_ = i_603_ + i_602_;
	    if (i_604_ > i_597_ + ((Class57) this).anInt795) {
		((Class57) this).aClass241_Sub3_776.pointer
		    = (i_597_ + ((Class57) this).anInt795) * -681042949;
		((Class57) this).anInt778
		    = (((Class57) this).aClass241_Sub3_776.pointer
		       * 421967667) - i_597_;
		((Class57) this).aBool774 = false;
	    }
	    int i_605_ = i_604_;
	    int i_606_ = 0;
	    if (((Class57) this).aBool774) {
		for (int i_607_ = 0; i_607_ < i_602_; i_607_++) {
		    int i_608_ = ((((Class57) this).aClass241_Sub3_776
				   .payload[i_603_++])
				  & 0xff);
		    i_604_ += i_608_;
		    i_606_ += i_608_;
		    if (i_604_ > i_597_ + ((Class57) this).anInt795) {
			((Class57) this).aClass241_Sub3_776.pointer
			    = ((i_597_ + ((Class57) this).anInt795)
			       * -681042949);
			((Class57) this).anInt778
			    = (((Class57) this).aClass241_Sub3_776.pointer
			       * 421967667) - i_597_;
			((Class57) this).aBool774 = false;
			break;
		    }
		    if (i_608_ < 255) {
			((Class57) this).aList752.add(Integer.valueOf(i_605_));
			((Class57) this).aList794.add(Integer.valueOf(i_606_));
			i_605_ = i_604_;
			i_606_ = 0;
		    }
		}
	    }
	    if (((Class57) this).aBool774) {
		int i_609_ = i_604_;
		int i_610_ = -1;
		Iterator iterator_611_ = ((Class57) this).aList752.iterator();
		Iterator iterator_612_ = ((Class57) this).aList794.iterator();
		boolean bool = false;
		((Class57) this).anInt772 = 0;
		while (iterator_611_.hasNext()) {
		    Integer integer = (Integer) iterator_611_.next();
		    Integer integer_613_ = (Integer) iterator_612_.next();
		    i_610_++;
		    if (method154() && ((Class57) this).aBool787 == true
			&& (((Class57) this).anInt790
			    < ((Class57) this).anInt769)
			&& i_610_ < ((Class57) this).anInt789) {
			Class57 class57_614_ = this;
			((Class57) class57_614_).anInt783
			    = ((Class57) class57_614_).anInt783 + (bool ? 0
								   : i_598_);
			bool = true;
		    } else {
			((Class57) this).anAtomicReference754.set(null);
			boolean bool_615_
			    = method1476((((Class57) this).aClass241_Sub3_776
					  .payload),
					 integer.intValue(),
					 integer_613_.intValue(),
					 (((Class57) this)
					  .anAtomicReference754));
			Class60[] class60s
			    = ((Class60[])
			       ((Class57) this).anAtomicReference754.get());
			if (bool_615_
			    && (((Class57) this).aBool787 != true
				|| (((Class57) this).anInt790
				    >= ((Class57) this).anInt769)
				|| i_610_ >= ((Class57) this).anInt789)) {
			    if (class60s != null) {
				int i_616_ = ((Class60) class60s[0]).anInt1016;
				((Class57) this).anInt786 += i_616_;
				if (((Class57) this).anInt786 > i_601_
				    && i_600_ == 4) {
				    ((Class57) this).anInt772
					= (((Class57) this).anInt786 - i_601_
					   - ((Class57) this).anInt772);
				    i_616_ -= ((Class57) this).anInt772;
				    if (((Class57) this).anInt772
					> ((Class60) class60s[0]).anInt1016)
					((Class57) this).anInt772
					    = (((Class60) class60s[0])
					       .anInt1016);
				    if (i_616_ < 0)
					i_616_ = 0;
				}
				int i_617_ = 0;
				int i_618_
				    = method287(i_616_) * class60s.length;
				if (((Class57) this).aBool787 == true
				    && (((Class57) this).anInt783
					< ((Class57) this).anInt750)) {
				    int i_619_ = i_618_;
				    i_618_
					-= method287(((Class57) this).anInt750
						     - (((Class57) this)
							.anInt783));
				    if (i_618_ <= 0) {
					((Class57) this).anInt783
					    += method200(i_619_);
					method1435(class60s);
					Object object = null;
					continue;
				    }
				    i_617_ += (((Class57) this).anInt750
					       - ((Class57) this).anInt783);
				}
				if ((((Class57) this).anInt783 + i_616_
				     > ((Class57) this).anInt751)
				    && ((((Class57) this).anInt747
					 < ((Class57) this).anInt791)
					|| ((Class57) this).anInt791 < 0)
				    && ((Class57) this).aBool793) {
				    i_618_
					-= method287(((Class57) this).anInt783
						     + i_616_
						     - (((Class57) this)
							.anInt751)
						     - 1);
				    if (i_618_ <= 0) {
					method1435(class60s);
					Object object = null;
					continue;
				    }
				}
				int i_620_ = method223();
				if (method1396() < method223()) {
				    int i_621_ = method223() - method1396();
				    i_618_ += i_618_ / method1396() * i_621_;
				}
				RSByteBuffer class241_sub3
				    = method1438(i_618_);
				for (int i_622_ = i_617_; i_622_ < i_616_;
				     i_622_++) {
				    boolean bool_623_
					= ((Class57) this).aBool787;
				    if (((Class57) this).anInt791 != 0) {
					if (((Class57) this).anInt783
					    == ((Class57) this).anInt750) {
					    if (((Class57) this).anInt784
						< 0) {
						((Class57) this).anInt784
						    = (((Class57) this)
						       .anInt763);
						((Class57) this).anInt789
						    = i_610_;
					    }
					    ((Class57) this).aBool787 = false;
					}
					if ((((Class57) this).anInt783
					     == ((Class57) this).anInt751)
					    && ((Class57) this).anInt785 < 0)
					    ((Class57) this).anInt785
						= ((Class57) this).anInt763;
					if ((((Class57) this).anInt783
					     > ((Class57) this).anInt751)
					    && ((((Class57) this).anInt747
						 < ((Class57) this).anInt791)
						|| (((Class57) this).anInt791
						    < 0))
					    && ((Class57) this).aBool793)
					    bool_623_ = true;
				    }
				    if (bool_623_
					&& ((((Class57) this).anInt783
					     < ((Class57) this).anInt750)
					    || (((Class57) this).anInt783
						> (((Class57) this)
						   .anInt751)))) {
					((Class57) this).anInt783++;
					if (++i_599_ > i_598_)
					    throw new RuntimeException();
				    } else {
					for (int i_624_ = 0; i_624_ < i_620_;
					     i_624_++) {
					    float f;
					    if (i_624_ < class60s.length)
						f = (((Class60)
						      class60s[i_624_])
						     .aFloatArray1018[i_622_]);
					    else
						f = (((Class60)
						      (class60s
						       [(i_624_
							 % method1396())]))
						     .aFloatArray1018[i_622_]);
					    if (((Class57) this).aClass320_740
						== Class320.aClass320_4878) {
						int i_625_ = method1418(f);
						if ((((Class57) this)
						     .aClass329_748)
						    == Class329.aClass329_5031)
						    class241_sub3.method14621
							(i_625_, (byte) -97);
						else
						    class241_sub3.writeShort
							(i_625_, -484048531);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4874)) {
						int i_626_ = method1419(f);
						if ((((Class57) this)
						     .aClass329_748)
						    == Class329.aClass329_5031)
						    class241_sub3.method14621
							(i_626_, (byte) -5);
						else
						    class241_sub3.writeShort
							(i_626_, -484048531);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4873)) {
						int i_627_ = method1499(f);
						class241_sub3.writeByte
						    (i_627_, 1011594312);
					    } else if ((((Class57) this)
							.aClass320_740)
						       == (Class320
							   .aClass320_4876)) {
						int i_628_ = method1421(f);
						class241_sub3.writeByte
						    (i_628_, -1550547187);
					    }
					}
					((Class57) this).anInt783++;
					i_599_++;
				    }
				}
				synchronized (((Class57) this).aList779) {
				    ((Class57) this).anInt800
					+= (method200(class241_sub3.pointer
						      * 421967667)
					    / method223());
				    ((Class57) this).aList779
					.add(class241_sub3);
				}
			    }
			} else if (method154()) {
			    ((Class57) this).anInt767 = 0;
			    if (((Class57) this).aClass60Array761 == null
				|| (((Class57) this).aClass60Array761 != null
				    && (((((Class57) this)
					  .aClass60Array761).length
					 != ((Class57) this).anInt743)
					|| ((((Class60) (((Class57) this)
							 .aClass60Array761[0]))
					     .anInt1016)
					    != ((Class57) this).anInt741)))) {
				if (((Class57) this).aClass60Array761 != null)
				    method1435(((Class57) this)
					       .aClass60Array761);
				((Class57) this).aClass60Array761
				    = method1400(((Class57) this).anInt743,
						 ((Class57) this).anInt741);
			    }
			}
			method1435(class60s);
			Object object = null;
		    }
		}
		((Class57) this).aClass241_Sub3_776.pointer
		    = i_609_ * -681042949;
		((Class57) this).anInt795 -= i_609_ - i_597_;
	    }
	}
    }
    
    int method1488(float f) {
	int i = (int) (f * 32767.0F);
	if (i > 32767)
	    return 32767;
	if (i < -32768)
	    return -32768;
	return i;
    }
    
    int method1489(float f) {
	int i = (int) (f * 32767.0F);
	if (i > 32767)
	    return 32767;
	if (i < -32768)
	    return -32768;
	return i;
    }
    
    int method1490(float f) {
	int i = (int) (f * 32767.0F);
	if (i > 32767)
	    return 32767;
	if (i < -32768)
	    return -32768;
	return i;
    }
    
    int method1491(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    int method1492(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    int method1493(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    int method1494(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    int method1495(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    int method1496(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    int method1497(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    RSByteBuffer method1498(int i) {
	RSByteBuffer class241_sub3 = method1438(method287(i));
	int i_629_ = i;
	synchronized (((Class57) this).aList779) {
	    while (!((Class57) this).aList779.isEmpty()) {
		RSByteBuffer class241_sub3_630_
		    = (RSByteBuffer) ((Class57) this).aList779.remove(0);
		((Class57) this).anInt800
		    -= (method200(class241_sub3_630_.pointer * 421967667)
			/ method223());
		int i_631_ = method287(i_629_);
		int i_632_
		    = (class241_sub3_630_.pointer * 421967667 < i_631_
		       ? class241_sub3_630_.pointer * 421967667 : i_631_);
		class241_sub3.writeBytes(class241_sub3_630_.payload, 0,
					  i_632_, 752061035);
		i_629_ -= method200(i_632_);
		int i_633_ = class241_sub3_630_.pointer * 421967667 - i_632_;
		if (i_633_ != 0) {
		    System.arraycopy(class241_sub3_630_.payload, i_632_,
				     class241_sub3_630_.payload, 0,
				     i_633_);
		    class241_sub3_630_.pointer = i_633_ * -681042949;
		    ((Class57) this).anInt800
			+= method200(i_633_) / method223();
		    ((Class57) this).aList779.add(0, class241_sub3_630_);
		} else
		    class241_sub3_630_.method14618(-174251917);
		if (i_629_ <= 0)
		    break;
	    }
	    if (((Class57) this).aList779.isEmpty()
		&& method317() == Class303.aClass303_4788)
		method1394(Class303.aClass303_4793);
	}
	return class241_sub3;
    }
    
    public void method290(boolean bool) {
	if (!bool)
	    method190();
	else if (method317() == Class303.aClass303_4793) {
	    method1404(true);
	    method1394(Class303.aClass303_4792);
	}
    }
    
    int method1499(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    RSByteBuffer method1500(int i) {
	return new RSByteBuffer(i, true);
    }
    
    RSByteBuffer method1501(int i) {
	return new RSByteBuffer(i, true);
    }
    
    public synchronized boolean method154() {
	return ((Class57) this).aBool782;
    }
    
    int method1502() {
	return ((Class57) this).anInt800;
    }
    
    public void method293() {
	if (method317() != Class303.aClass303_4789) {
	    method1404(false);
	    method1394(Class303.aClass303_4790);
	} else {
	    method1404(false);
	    method1394(Class303.aClass303_4794);
	}
    }
    
    public void method297(boolean bool, int i, int i_634_, int i_635_) {
	((Class57) this).aBool793 = bool;
	((Class57) this).anInt791 = i;
	((Class57) this).anInt750 = i_634_;
	((Class57) this).anInt751 = i_635_;
    }
    
    void method1503() {
	if (method317() != Class303.aClass303_4794
	    && method317() != Class303.aClass303_4791
	    && (!((Class57) this).aBool782
		|| !((float) (((Class57) this).anInt800 / method1397())
		     > ((Class57) this).aFloat792))) {
	    if (!method1407()) {
		RSByteBuffer class241_sub3
		    = ((RSByteBuffer)
		       ((((Class57) this).aList768 != null
			 && !((Class57) this).aList768.isEmpty())
			? ((Class57) this).aList768.get(0) : null));
		if (class241_sub3 == null) {
		    if (!((Class57) this).aBool780) {
			method1394(Class303.aClass303_4791);
			((Class57) this).anInterface34_744
			    .method191(-2091621460);
			((Class57) this).aBool780 = true;
		    }
		    return;
		}
		((Class57) this).aBool780 = false;
		((Class57) this).aBool774 = true;
		((Class57) this).aList768.remove(0);
		method1406(class241_sub3);
	    }
	    method1432();
	}
    }
    
    float method1504(int i) {
	int i_636_ = i & 0x1fffff;
	int i_637_ = i & ~0x7fffffff;
	int i_638_ = (i & 0x7fe00000) >> 21;
	if (i_637_ != 0)
	    i_636_ = -i_636_;
	return (float) ((double) i_636_
			* Math.pow(2.0, (double) (i_638_ - 788)));
    }
    
    public RSByteBuffer method286(int i) {
	RSByteBuffer class241_sub3 = method1422(i);
	return class241_sub3;
    }
    
    public RSByteBuffer method316(int i) {
	RSByteBuffer class241_sub3 = method1422(i);
	return class241_sub3;
    }
}
