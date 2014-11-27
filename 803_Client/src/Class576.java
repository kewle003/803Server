/* Class576 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class576
{
    boolean aBool7444;
    int anInt7445;
    int anInt7446;
    public List aList7447 = new LinkedList();
    
    Class576(boolean bool) {
	((Class576) this).aBool7444 = false;
	((Class576) this).anInt7446 = 0;
	((Class576) this).anInt7445 = 0;
	((Class576) this).aBool7444 = bool;
    }
    
    void method12662(Class542 class542, int i) {
	Class475_Sub1 class475_sub1 = class542.aClass475_Sub1_7011;
	boolean bool = true;
	Class97[] class97s = class542.aClass475_Sub1_7011.aClass97Array8748;
	for (int i_0_ = 0; i_0_ < class97s.length; i_0_++) {
	    if (class97s[i_0_].aBool1352) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    ((Class542) class542).aClass576_7013 = this;
	    if (((Class576) this).aBool7444) {
		Iterator iterator = aList7447.iterator();
		while (iterator.hasNext()) {
		    Class542 class542_1_ = (Class542) iterator.next();
		    if (class475_sub1 == class542_1_.aClass475_Sub1_7011) {
			iterator.remove();
			Class67.method1648(class542_1_, 1887393945);
		    }
		}
	    }
	    ListIterator listiterator = aList7447.listIterator();
	    while (listiterator.hasNext()) {
		Class542 class542_2_ = (Class542) listiterator.next();
		if (1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		    >= (1364632497
			* (((Class475_Sub1) class542_2_.aClass475_Sub1_7011)
			   .anInt8747))) {
		    listiterator.previous();
		    listiterator.add(class542);
		    return;
		}
	    }
	    aList7447.add(class542);
	}
    }
    
    public void method12663(byte i) {
	Iterator iterator = aList7447.iterator();
	while (iterator.hasNext()) {
	    Class542 class542 = (Class542) iterator.next();
	    iterator.remove();
	    Class67.method1648(class542, 1374369467);
	}
    }
    
    public void method12664() {
	Iterator iterator = aList7447.iterator();
	while (iterator.hasNext()) {
	    Class542 class542 = (Class542) iterator.next();
	    iterator.remove();
	    Class67.method1648(class542, 1446529598);
	}
    }
    
    public void method12665() {
	Iterator iterator = aList7447.iterator();
	while (iterator.hasNext()) {
	    Class542 class542 = (Class542) iterator.next();
	    iterator.remove();
	    Class67.method1648(class542, 1596277014);
	}
    }
    
    void method12666(Class542 class542) {
	Class475_Sub1 class475_sub1 = class542.aClass475_Sub1_7011;
	boolean bool = true;
	Class97[] class97s = class542.aClass475_Sub1_7011.aClass97Array8748;
	for (int i = 0; i < class97s.length; i++) {
	    if (class97s[i].aBool1352) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    ((Class542) class542).aClass576_7013 = this;
	    if (((Class576) this).aBool7444) {
		Iterator iterator = aList7447.iterator();
		while (iterator.hasNext()) {
		    Class542 class542_3_ = (Class542) iterator.next();
		    if (class475_sub1 == class542_3_.aClass475_Sub1_7011) {
			iterator.remove();
			Class67.method1648(class542_3_, 1354722597);
		    }
		}
	    }
	    ListIterator listiterator = aList7447.listIterator();
	    while (listiterator.hasNext()) {
		Class542 class542_4_ = (Class542) listiterator.next();
		if (1364632497 * ((Class475_Sub1) class475_sub1).anInt8747
		    >= (1364632497
			* (((Class475_Sub1) class542_4_.aClass475_Sub1_7011)
			   .anInt8747))) {
		    listiterator.previous();
		    listiterator.add(class542);
		    return;
		}
	    }
	    aList7447.add(class542);
	}
    }
    
    static final void method12667(ClientScriptData class454, int i) {
	int i_5_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_5_, (byte) -51);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_5_ >> 16];
	Class114.method2796(class58, class35, class454, 65280);
    }
    
    static final void method12668(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
    }
    
    static int method12669(char c, int i) {
	if (c >= 0 && c < Class461.anIntArray6282.length)
	    return Class461.anIntArray6282[c];
	return -1;
    }
    
    static void method12670(Class103 class103, Class241_Sub41 class241_sub41,
			    Class515 class515, short i) {
	Class168 class168 = class515.method11584(class103, -1211709463);
	if (class168 != null) {
	    int i_6_ = class168.method3631();
	    if (class168.method3606() > i_6_)
		i_6_ = class168.method3606();
	    int i_7_ = 10;
	    int i_8_ = class241_sub41.anInt10156 * 843218033;
	    int i_9_ = -464680849 * class241_sub41.anInt10157;
	    int i_10_ = 0;
	    int i_11_ = 0;
	    if (class515.aString6756 != null) {
		i_11_
		    = Class40.aClass639_594.method13596(class515.aString6756,
							(-1080559003
							 * Class494.canvasWid),
							0, null, -1765159520);
		i_10_ = Class40.aClass639_594.method13567(class515.aString6756,
							  (Class494.canvasWid
							   * -1080559003),
							  null, -1748093514);
	    }
	    int i_12_ = 843218033 * class241_sub41.anInt10156 + i_6_ / 2;
	    int i_13_ = class241_sub41.anInt10157 * -464680849;
	    if (i_8_ < Class573_Sub1.anInt7430 + i_6_) {
		i_8_ = Class573_Sub1.anInt7430;
		i_12_ = (i_10_ / 2
			 + (i_7_ + (Class573_Sub1.anInt7430 + i_6_ / 2)) + 5);
	    } else if (i_8_ > Class573_Sub1.anInt7395 - i_6_) {
		i_8_ = Class573_Sub1.anInt7395 - i_6_;
		i_12_ = (Class573_Sub1.anInt7395 - i_6_ / 2 - i_7_ - i_10_ / 2
			 - 5);
	    }
	    if (i_9_ < i_6_ + Class573_Sub1.anInt7431) {
		i_9_ = Class573_Sub1.anInt7431;
		i_13_ = Class573_Sub1.anInt7431 + i_7_ + i_6_ / 2;
	    } else if (i_9_ > Class573_Sub1.anInt7425 - i_6_) {
		i_9_ = Class573_Sub1.anInt7425 - i_6_;
		i_13_ = Class573_Sub1.anInt7425 - i_6_ / 2 - i_7_ - i_11_;
	    }
	    int i_14_
		= (int) (Math.atan2((double) (i_8_
					      - (843218033
						 * class241_sub41.anInt10156)),
				    (double) (i_9_ - (class241_sub41.anInt10157
						      * -464680849)))
			 / 3.141592653589793 * 32767.0) & 0xffff;
	    class168.method3620((float) i_8_ + (float) i_6_ / 2.0F,
				(float) i_6_ / 2.0F + (float) i_9_, 4096,
				i_14_);
	    int i_15_ = -2;
	    int i_16_ = -2;
	    int i_17_ = -2;
	    int i_18_ = -2;
	    if (null != class515.aString6756) {
		i_15_ = i_12_ - i_10_ / 2 - 5;
		i_16_ = i_13_;
		i_17_ = 10 + (i_10_ + i_15_);
		i_18_ = 3 + (i_16_ + i_11_);
		if (153554575 * class515.anInt6741 != 0)
		    class103.method2263(i_15_, i_16_, i_17_ - i_15_,
					i_18_ - i_16_,
					153554575 * class515.anInt6741,
					(byte) -6);
		if (0 != 1284846821 * class515.anInt6767)
		    class103.method2262(i_15_, i_16_, i_17_ - i_15_,
					i_18_ - i_16_,
					class515.anInt6767 * 1284846821,
					989077154);
		Class355.aClass96_5452.method2114
		    (class515.aString6756, i_12_, i_13_, i_10_, i_11_,
		     ~0xffffff | 2101573455 * class515.anInt6750,
		     -105193781 * Class573_Sub1.aClass497_7374.anInt6545, 1, 0,
		     0, null, null, null, 0, 0, -880697319);
	    }
	    if (-1 != -705700883 * class515.anInt6772
		|| class515.aString6756 != null) {
		Class241_Sub46 class241_sub46
		    = new Class241_Sub46(class241_sub41);
		((Class241_Sub46) class241_sub46).anInt10269
		    = -325331477 * (i_8_ - i_6_ / 2);
		((Class241_Sub46) class241_sub46).anInt10268
		    = (i_8_ + i_6_ / 2) * 781884803;
		((Class241_Sub46) class241_sub46).anInt10275
		    = (i_9_ - i_6_) * -645579975;
		((Class241_Sub46) class241_sub46).anInt10267
		    = i_9_ * -1470931421;
		((Class241_Sub46) class241_sub46).anInt10270
		    = 492641787 * i_15_;
		((Class241_Sub46) class241_sub46).anInt10272
		    = -717652979 * i_17_;
		((Class241_Sub46) class241_sub46).anInt10271
		    = i_16_ * -1274657791;
		((Class241_Sub46) class241_sub46).anInt10274
		    = 872919199 * i_18_;
		Class120_Sub23.aClass429_10631.addNode(class241_sub46,
							  (short) -22250);
	    }
	}
    }
}
