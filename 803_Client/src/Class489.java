/* Class489 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class489
{
    int anInt6484;
    boolean aBool6485;
    List aList6486;
    public boolean aBool6487 = false;
    long aLong6488;
    long aLong6489;
    boolean aBool6490;
    Class247_Sub1_Sub1_Sub1[] aClass247_Sub1_Sub1_Sub1Array6491;
    boolean aBool6492;
    int anInt6493;
    int anInt6494;
    List aList6495;
    int anInt6496;
    Class98 aClass98_6497;
    static boolean[] aBoolArray6498 = new boolean[64];
    static boolean[] aBoolArray6499 = new boolean[16];
    
    void method11149(int i, boolean bool) {
	Class487.aList6475.add(this);
	((Class489) this).aLong6489 = (long) i;
	((Class489) this).aLong6488 = (long) i;
	((Class489) this).aBool6492 = true;
	((Class489) this).aBool6490 = bool;
    }
    
    void method11150(Class552 class552, Class103 class103) {
	((Class489) this).aClass98_6497.aClass441_1353.method7841((byte) -25);
	Iterator iterator = ((Class489) this).aList6486.iterator();
	while (iterator.hasNext()) {
	    Class505 class505 = (Class505) iterator.next();
	    class505.method11471(class552, class103,
				 ((Class489) this).aLong6488);
	}
    }
    
    void method11151(int i, boolean bool) {
	Class487.aList6475.add(this);
	((Class489) this).aLong6489 = (long) i;
	((Class489) this).aLong6488 = (long) i;
	((Class489) this).aBool6492 = true;
	((Class489) this).aBool6490 = bool;
    }
    
    public void method11152() {
	((Class489) this).aBool6492 = true;
    }
    
    boolean method11153(Class103 class103, long l) {
	if (((Class489) this).aLong6489 != ((Class489) this).aLong6488)
	    method11154();
	else
	    method11155();
	if (l - ((Class489) this).aLong6489 > 750L) {
	    method11175();
	    return false;
	}
	int i = (int) (l - ((Class489) this).aLong6488);
	if (((Class489) this).aBool6492) {
	    Iterator iterator = ((Class489) this).aList6486.iterator();
	    while (iterator.hasNext()) {
		Class505 class505 = (Class505) iterator.next();
		for (int i_0_ = 0;
		     i_0_ < (((Class505) class505).aClass325_6637.anInt4990
			     * -1987882239);
		     i_0_++)
		    class505.method11470(class103, l, 1,
					 !((Class489) this).aBool6485,
					 1847837874);
	    }
	    ((Class489) this).aBool6492 = false;
	}
	Iterator iterator = ((Class489) this).aList6486.iterator();
	while (iterator.hasNext()) {
	    Class505 class505 = (Class505) iterator.next();
	    class505.method11470(class103, l, i, !((Class489) this).aBool6485,
				 1915043471);
	}
	((Class489) this).aLong6488 = l;
	return true;
    }
    
    public void method11154() {
	((Class489) this).aBool6485 = true;
    }
    
    void method11155() {
	((Class489) this).aBool6485 = false;
    }
    
    boolean method11156(Class103 class103, long l) {
	if (((Class489) this).aLong6489 != ((Class489) this).aLong6488)
	    method11154();
	else
	    method11155();
	if (l - ((Class489) this).aLong6489 > 750L) {
	    method11175();
	    return false;
	}
	int i = (int) (l - ((Class489) this).aLong6488);
	if (((Class489) this).aBool6492) {
	    Iterator iterator = ((Class489) this).aList6486.iterator();
	    while (iterator.hasNext()) {
		Class505 class505 = (Class505) iterator.next();
		for (int i_1_ = 0;
		     i_1_ < (((Class505) class505).aClass325_6637.anInt4990
			     * -1987882239);
		     i_1_++)
		    class505.method11470(class103, l, 1,
					 !((Class489) this).aBool6485,
					 2053387356);
	    }
	    ((Class489) this).aBool6492 = false;
	}
	Iterator iterator = ((Class489) this).aList6486.iterator();
	while (iterator.hasNext()) {
	    Class505 class505 = (Class505) iterator.next();
	    class505.method11470(class103, l, i, !((Class489) this).aBool6485,
				 1809280216);
	}
	((Class489) this).aLong6488 = l;
	return true;
    }
    
    public void method11157(long l) {
	((Class489) this).aLong6489 = l;
    }
    
    public void method11158(Class103 class103, long l, Class106[] class106s,
			    Class167[] class167s, boolean bool) {
	if (!aBool6487) {
	    method11185(class103, class106s, bool);
	    method11160(class167s, bool);
	    ((Class489) this).aLong6489 = l;
	}
    }
    
    public void method11159() {
	((Class489) this).aBool6485 = true;
    }
    
    void method11160(Class167[] class167s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray6499[i] = false;
	Iterator iterator = ((Class489) this).aList6495.iterator();
    while_66_:
	while (iterator.hasNext()) {
	    Class241_Sub4 class241_sub4 = (Class241_Sub4) iterator.next();
	    if (class167s != null) {
		for (int i = 0; i < class167s.length; i++) {
		    if ((((Class241_Sub4) class241_sub4).aClass167_8809
			 == class167s[i])
			|| (((Class241_Sub4) class241_sub4).aClass167_8809
			    == class167s[i].aClass167_2057)) {
			aBoolArray6499[i] = true;
			class241_sub4.method14861(28468800);
			continue while_66_;
		    }
		}
	    }
	    if (!bool) {
		class241_sub4.remove((byte) 36);
		((Class489) this).anInt6493--;
		if (class241_sub4.hasNext((byte) 94)) {
		    class241_sub4.remove((byte) 36);
		    Class487.anInt6479 -= 3932619;
		}
	    }
	}
	if (class167s != null) {
	    for (int i = 0; (i < class167s.length && i != 16
			     && ((Class489) this).anInt6493 != 16); i++) {
		if (!aBoolArray6499[i]) {
		    Class241_Sub4 class241_sub4 = null;
		    if ((class167s[i].method3594((byte) -40).anInt5092
			 * 2676085) == 1
			&& Class487.anInt6479 * 1754143715 < 32) {
			class241_sub4 = new Class241_Sub4(class167s[i], this);
			Class487.aClass407_6471.put
			    (class241_sub4,
			     (long) (class167s[i].anInt2059 * -1649062923));
			Class487.anInt6479 += 3932619;
		    }
		    if (class241_sub4 == null)
			class241_sub4 = new Class241_Sub4(class167s[i], this);
		    ((Class489) this).aList6495.add(class241_sub4);
		    ((Class489) this).anInt6493++;
		    aBoolArray6499[i] = true;
		}
	    }
	}
    }
    
    public Class98 method11161() {
	return ((Class489) this).aClass98_6497;
    }
    
    public void method11162(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
	((Class489) this).anInt6496 = i;
    }
    
    void method11163(Class552 class552, Class103 class103) {
	((Class489) this).aClass98_6497.aClass441_1353.method7841((byte) -107);
	Iterator iterator = ((Class489) this).aList6486.iterator();
	while (iterator.hasNext()) {
	    Class505 class505 = (Class505) iterator.next();
	    class505.method11471(class552, class103,
				 ((Class489) this).aLong6488);
	}
    }
    
    public Class98 method11164() {
	return ((Class489) this).aClass98_6497;
    }
    
    void method11165(Class103 class103, Class106[] class106s, boolean bool) {
	for (int i = 0; i < 64; i++)
	    aBoolArray6498[i] = false;
	Iterator iterator = ((Class489) this).aList6486.iterator();
    while_67_:
	while (iterator.hasNext()) {
	    Class505 class505 = (Class505) iterator.next();
	    if (class106s != null) {
		for (int i = 0; i < class106s.length; i++) {
		    if (((Class505) class505).aClass106_6653 == class106s[i]
			|| (((Class505) class505).aClass106_6653
			    == class106s[i].aClass106_1488)) {
			aBoolArray6498[i] = true;
			class505.method11477(-775661303);
			((Class505) class505).aBool6642 = false;
			continue while_67_;
		    }
		}
	    }
	    if (!bool) {
		if (((Class505) class505).anInt6648 * -1133320343 == 0) {
		    iterator.remove();
		    ((Class489) this).anInt6484--;
		} else
		    ((Class505) class505).aBool6642 = true;
	    }
	}
	if (class106s != null) {
	    for (int i = 0; (i < class106s.length && i != 64
			     && ((Class489) this).anInt6484 != 64); i++) {
		if (!aBoolArray6498[i]) {
		    Class505 class505
			= new Class505(class103, class106s[i], this,
				       ((Class489) this).aLong6489);
		    ((Class489) this).aList6486.add(class505);
		    ((Class489) this).anInt6484++;
		    aBoolArray6498[i] = true;
		}
	    }
	}
    }
    
    public void method11166() {
	((Class489) this).aBool6492 = true;
    }
    
    void method11167(int i, boolean bool) {
	Class487.aList6475.add(this);
	((Class489) this).aLong6489 = (long) i;
	((Class489) this).aLong6488 = (long) i;
	((Class489) this).aBool6492 = true;
	((Class489) this).aBool6490 = bool;
    }
    
    public void method11168(Class103 class103, long l, Class106[] class106s,
			    Class167[] class167s, boolean bool) {
	if (!aBool6487) {
	    method11185(class103, class106s, bool);
	    method11160(class167s, bool);
	    ((Class489) this).aLong6489 = l;
	}
    }
    
    void method11169(int i, boolean bool) {
	Class487.aList6475.add(this);
	((Class489) this).aLong6489 = (long) i;
	((Class489) this).aLong6488 = (long) i;
	((Class489) this).aBool6492 = true;
	((Class489) this).aBool6490 = bool;
    }
    
    void method11170(int i, boolean bool) {
	Class487.aList6475.add(this);
	((Class489) this).aLong6489 = (long) i;
	((Class489) this).aLong6488 = (long) i;
	((Class489) this).aBool6492 = true;
	((Class489) this).aBool6490 = bool;
    }
    
    public Class98 method11171() {
	((Class489) this).aClass98_6497.aClass441_1353.method7841((byte) -89);
	for (int i = 0;
	     i < ((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491.length;
	     i++) {
	    if (((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i] != null
		&& (((Class247_Sub1_Sub1_Sub1)
		     ((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i])
		    .aClass505_11276) != null)
		((Class489) this).aClass98_6497.aClass441_1353.method7834
		    (((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i],
		     1951886472);
	}
	return ((Class489) this).aClass98_6497;
    }
    
    public void method11172() {
	((Class489) this).aBool6492 = true;
    }
    
    public void method11173(Class103 class103, long l, Class106[] class106s,
			    Class167[] class167s, boolean bool) {
	if (!aBool6487) {
	    method11185(class103, class106s, bool);
	    method11160(class167s, bool);
	    ((Class489) this).aLong6489 = l;
	}
    }
    
    void method11174() {
	aBool6487 = true;
	Iterator iterator = ((Class489) this).aList6495.iterator();
	while (iterator.hasNext()) {
	    Class241_Sub4 class241_sub4 = (Class241_Sub4) iterator.next();
	    if ((((Class241_Sub4) class241_sub4).aClass338_8810.anInt5092
		 * 2676085)
		== 1)
		class241_sub4.remove((byte) 36);
	}
	for (int i = 0;
	     i < ((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491.length;
	     i++) {
	    if (((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i]
		!= null) {
		((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i]
		    .method17650();
		((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i] = null;
	    }
	}
	((Class489) this).anInt6494 = 0;
	((Class489) this).aList6486 = new LinkedList();
	((Class489) this).anInt6484 = 0;
	((Class489) this).aList6495 = new LinkedList();
	((Class489) this).anInt6493 = 0;
    }
    
    void method11175() {
	aBool6487 = true;
	Iterator iterator = ((Class489) this).aList6495.iterator();
	while (iterator.hasNext()) {
	    Class241_Sub4 class241_sub4 = (Class241_Sub4) iterator.next();
	    if ((((Class241_Sub4) class241_sub4).aClass338_8810.anInt5092
		 * 2676085)
		== 1)
		class241_sub4.remove((byte) 36);
	}
	for (int i = 0;
	     i < ((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491.length;
	     i++) {
	    if (((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i]
		!= null) {
		((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i]
		    .method17650();
		((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i] = null;
	    }
	}
	((Class489) this).anInt6494 = 0;
	((Class489) this).aList6486 = new LinkedList();
	((Class489) this).anInt6484 = 0;
	((Class489) this).aList6495 = new LinkedList();
	((Class489) this).anInt6493 = 0;
    }
    
    void method11176(Class167[] class167s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray6499[i] = false;
	Iterator iterator = ((Class489) this).aList6495.iterator();
    while_68_:
	while (iterator.hasNext()) {
	    Class241_Sub4 class241_sub4 = (Class241_Sub4) iterator.next();
	    if (class167s != null) {
		for (int i = 0; i < class167s.length; i++) {
		    if ((((Class241_Sub4) class241_sub4).aClass167_8809
			 == class167s[i])
			|| (((Class241_Sub4) class241_sub4).aClass167_8809
			    == class167s[i].aClass167_2057)) {
			aBoolArray6499[i] = true;
			class241_sub4.method14861(445428816);
			continue while_68_;
		    }
		}
	    }
	    if (!bool) {
		class241_sub4.remove((byte) 36);
		((Class489) this).anInt6493--;
		if (class241_sub4.hasNext((byte) 80)) {
		    class241_sub4.remove((byte) 36);
		    Class487.anInt6479 -= 3932619;
		}
	    }
	}
	if (class167s != null) {
	    for (int i = 0; (i < class167s.length && i != 16
			     && ((Class489) this).anInt6493 != 16); i++) {
		if (!aBoolArray6499[i]) {
		    Class241_Sub4 class241_sub4 = null;
		    if ((class167s[i].method3594((byte) 22).anInt5092 * 2676085
			 == 1)
			&& Class487.anInt6479 * 1754143715 < 32) {
			class241_sub4 = new Class241_Sub4(class167s[i], this);
			Class487.aClass407_6471.put
			    (class241_sub4,
			     (long) (class167s[i].anInt2059 * -1649062923));
			Class487.anInt6479 += 3932619;
		    }
		    if (class241_sub4 == null)
			class241_sub4 = new Class241_Sub4(class167s[i], this);
		    ((Class489) this).aList6495.add(class241_sub4);
		    ((Class489) this).anInt6493++;
		    aBoolArray6499[i] = true;
		}
	    }
	}
    }
    
    void method11177() {
	aBool6487 = true;
	Iterator iterator = ((Class489) this).aList6495.iterator();
	while (iterator.hasNext()) {
	    Class241_Sub4 class241_sub4 = (Class241_Sub4) iterator.next();
	    if ((((Class241_Sub4) class241_sub4).aClass338_8810.anInt5092
		 * 2676085)
		== 1)
		class241_sub4.remove((byte) 36);
	}
	for (int i = 0;
	     i < ((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491.length;
	     i++) {
	    if (((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i]
		!= null) {
		((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i]
		    .method17650();
		((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i] = null;
	    }
	}
	((Class489) this).anInt6494 = 0;
	((Class489) this).aList6486 = new LinkedList();
	((Class489) this).anInt6484 = 0;
	((Class489) this).aList6495 = new LinkedList();
	((Class489) this).anInt6493 = 0;
    }
    
    public void method11178(long l) {
	((Class489) this).aLong6489 = l;
    }
    
    public void method11179(long l) {
	((Class489) this).aLong6489 = l;
    }
    
    void method11180(Class167[] class167s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray6499[i] = false;
	Iterator iterator = ((Class489) this).aList6495.iterator();
    while_69_:
	while (iterator.hasNext()) {
	    Class241_Sub4 class241_sub4 = (Class241_Sub4) iterator.next();
	    if (class167s != null) {
		for (int i = 0; i < class167s.length; i++) {
		    if ((((Class241_Sub4) class241_sub4).aClass167_8809
			 == class167s[i])
			|| (((Class241_Sub4) class241_sub4).aClass167_8809
			    == class167s[i].aClass167_2057)) {
			aBoolArray6499[i] = true;
			class241_sub4.method14861(1248898675);
			continue while_69_;
		    }
		}
	    }
	    if (!bool) {
		class241_sub4.remove((byte) 36);
		((Class489) this).anInt6493--;
		if (class241_sub4.hasNext((byte) 53)) {
		    class241_sub4.remove((byte) 36);
		    Class487.anInt6479 -= 3932619;
		}
	    }
	}
	if (class167s != null) {
	    for (int i = 0; (i < class167s.length && i != 16
			     && ((Class489) this).anInt6493 != 16); i++) {
		if (!aBoolArray6499[i]) {
		    Class241_Sub4 class241_sub4 = null;
		    if ((class167s[i].method3594((byte) -70).anInt5092
			 * 2676085) == 1
			&& Class487.anInt6479 * 1754143715 < 32) {
			class241_sub4 = new Class241_Sub4(class167s[i], this);
			Class487.aClass407_6471.put
			    (class241_sub4,
			     (long) (class167s[i].anInt2059 * -1649062923));
			Class487.anInt6479 += 3932619;
		    }
		    if (class241_sub4 == null)
			class241_sub4 = new Class241_Sub4(class167s[i], this);
		    ((Class489) this).aList6495.add(class241_sub4);
		    ((Class489) this).anInt6493++;
		    aBoolArray6499[i] = true;
		}
	    }
	}
    }
    
    public void method11181(Class103 class103, long l, Class106[] class106s,
			    Class167[] class167s, boolean bool) {
	if (!aBool6487) {
	    method11185(class103, class106s, bool);
	    method11160(class167s, bool);
	    ((Class489) this).aLong6489 = l;
	}
    }
    
    public static Class489 method11182(int i, boolean bool) {
	if (Class487.anInt6472 * 741457535
	    != Class487.anInt6474 * -212561199) {
	    Class489 class489
		= Class42.aClass489Array602[Class487.anInt6474 * -212561199];
	    Class487.anInt6474
		= ((Class487.anInt6474 * -212561199 + 1
		    & Class90.anIntArray1300[Class487.anInt6480 * 275753719])
		   * -315685327);
	    class489.method11151(i, bool);
	    return class489;
	}
	return new Class489(i, bool);
    }
    
    public void method11183(Class103 class103, long l, Class106[] class106s,
			    Class167[] class167s, boolean bool) {
	if (!aBool6487) {
	    method11185(class103, class106s, bool);
	    method11160(class167s, bool);
	    ((Class489) this).aLong6489 = l;
	}
    }
    
    public void method11184() {
	((Class489) this).aBool6492 = true;
    }
    
    void method11185(Class103 class103, Class106[] class106s, boolean bool) {
	for (int i = 0; i < 64; i++)
	    aBoolArray6498[i] = false;
	Iterator iterator = ((Class489) this).aList6486.iterator();
    while_70_:
	while (iterator.hasNext()) {
	    Class505 class505 = (Class505) iterator.next();
	    if (class106s != null) {
		for (int i = 0; i < class106s.length; i++) {
		    if (((Class505) class505).aClass106_6653 == class106s[i]
			|| (((Class505) class505).aClass106_6653
			    == class106s[i].aClass106_1488)) {
			aBoolArray6498[i] = true;
			class505.method11477(-1707802298);
			((Class505) class505).aBool6642 = false;
			continue while_70_;
		    }
		}
	    }
	    if (!bool) {
		if (((Class505) class505).anInt6648 * -1133320343 == 0) {
		    iterator.remove();
		    ((Class489) this).anInt6484--;
		} else
		    ((Class505) class505).aBool6642 = true;
	    }
	}
	if (class106s != null) {
	    for (int i = 0; (i < class106s.length && i != 64
			     && ((Class489) this).anInt6484 != 64); i++) {
		if (!aBoolArray6498[i]) {
		    Class505 class505
			= new Class505(class103, class106s[i], this,
				       ((Class489) this).aLong6489);
		    ((Class489) this).aList6486.add(class505);
		    ((Class489) this).anInt6484++;
		    aBoolArray6498[i] = true;
		}
	    }
	}
    }
    
    void method11186(Class103 class103, Class106[] class106s, boolean bool) {
	for (int i = 0; i < 64; i++)
	    aBoolArray6498[i] = false;
	Iterator iterator = ((Class489) this).aList6486.iterator();
    while_71_:
	while (iterator.hasNext()) {
	    Class505 class505 = (Class505) iterator.next();
	    if (class106s != null) {
		for (int i = 0; i < class106s.length; i++) {
		    if (((Class505) class505).aClass106_6653 == class106s[i]
			|| (((Class505) class505).aClass106_6653
			    == class106s[i].aClass106_1488)) {
			aBoolArray6498[i] = true;
			class505.method11477(1207540796);
			((Class505) class505).aBool6642 = false;
			continue while_71_;
		    }
		}
	    }
	    if (!bool) {
		if (((Class505) class505).anInt6648 * -1133320343 == 0) {
		    iterator.remove();
		    ((Class489) this).anInt6484--;
		} else
		    ((Class505) class505).aBool6642 = true;
	    }
	}
	if (class106s != null) {
	    for (int i = 0; (i < class106s.length && i != 64
			     && ((Class489) this).anInt6484 != 64); i++) {
		if (!aBoolArray6498[i]) {
		    Class505 class505
			= new Class505(class103, class106s[i], this,
				       ((Class489) this).aLong6489);
		    ((Class489) this).aList6486.add(class505);
		    ((Class489) this).anInt6484++;
		    aBoolArray6498[i] = true;
		}
	    }
	}
    }
    
    Class489(int i, boolean bool) {
	((Class489) this).aBool6485 = false;
	((Class489) this).anInt6494 = 0;
	((Class489) this).aList6486 = new LinkedList();
	((Class489) this).anInt6484 = 0;
	((Class489) this).aList6495 = new LinkedList();
	((Class489) this).anInt6493 = 0;
	((Class489) this).aBool6492 = false;
	((Class489) this).aBool6490 = false;
	((Class489) this).aClass98_6497 = new Class98();
	((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491
	    = new Class247_Sub1_Sub1_Sub1[8192];
	method11151(i, bool);
    }
    
    public static Class489 method11187(int i, boolean bool) {
	if (Class487.anInt6472 * 741457535
	    != Class487.anInt6474 * -212561199) {
	    Class489 class489
		= Class42.aClass489Array602[Class487.anInt6474 * -212561199];
	    Class487.anInt6474
		= ((Class487.anInt6474 * -212561199 + 1
		    & Class90.anIntArray1300[Class487.anInt6480 * 275753719])
		   * -315685327);
	    class489.method11151(i, bool);
	    return class489;
	}
	return new Class489(i, bool);
    }
    
    void method11188(Class167[] class167s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray6499[i] = false;
	Iterator iterator = ((Class489) this).aList6495.iterator();
    while_72_:
	while (iterator.hasNext()) {
	    Class241_Sub4 class241_sub4 = (Class241_Sub4) iterator.next();
	    if (class167s != null) {
		for (int i = 0; i < class167s.length; i++) {
		    if ((((Class241_Sub4) class241_sub4).aClass167_8809
			 == class167s[i])
			|| (((Class241_Sub4) class241_sub4).aClass167_8809
			    == class167s[i].aClass167_2057)) {
			aBoolArray6499[i] = true;
			class241_sub4.method14861(1452507132);
			continue while_72_;
		    }
		}
	    }
	    if (!bool) {
		class241_sub4.remove((byte) 36);
		((Class489) this).anInt6493--;
		if (class241_sub4.hasNext((byte) 110)) {
		    class241_sub4.remove((byte) 36);
		    Class487.anInt6479 -= 3932619;
		}
	    }
	}
	if (class167s != null) {
	    for (int i = 0; (i < class167s.length && i != 16
			     && ((Class489) this).anInt6493 != 16); i++) {
		if (!aBoolArray6499[i]) {
		    Class241_Sub4 class241_sub4 = null;
		    if ((class167s[i].method3594((byte) 35).anInt5092 * 2676085
			 == 1)
			&& Class487.anInt6479 * 1754143715 < 32) {
			class241_sub4 = new Class241_Sub4(class167s[i], this);
			Class487.aClass407_6471.put
			    (class241_sub4,
			     (long) (class167s[i].anInt2059 * -1649062923));
			Class487.anInt6479 += 3932619;
		    }
		    if (class241_sub4 == null)
			class241_sub4 = new Class241_Sub4(class167s[i], this);
		    ((Class489) this).aList6495.add(class241_sub4);
		    ((Class489) this).anInt6493++;
		    aBoolArray6499[i] = true;
		}
	    }
	}
    }
    
    public Class98 method11189() {
	((Class489) this).aClass98_6497.aClass441_1353.method7841((byte) -123);
	for (int i = 0;
	     i < ((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491.length;
	     i++) {
	    if (((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i] != null
		&& (((Class247_Sub1_Sub1_Sub1)
		     ((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i])
		    .aClass505_11276) != null)
		((Class489) this).aClass98_6497.aClass441_1353.method7834
		    (((Class489) this).aClass247_Sub1_Sub1_Sub1Array6491[i],
		     1771108537);
	}
	return ((Class489) this).aClass98_6497;
    }
    
    public void method11190(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
	((Class489) this).anInt6496 = i;
    }
    
    public void method11191(int i, int i_10_, int i_11_, int i_12_,
			    int i_13_) {
	((Class489) this).anInt6496 = i;
    }
    
    public void method11192(Class103 class103, long l, Class106[] class106s,
			    Class167[] class167s, boolean bool) {
	if (!aBool6487) {
	    method11185(class103, class106s, bool);
	    method11160(class167s, bool);
	    ((Class489) this).aLong6489 = l;
	}
    }
    
    void method11193(Class552 class552, Class103 class103) {
	((Class489) this).aClass98_6497.aClass441_1353.method7841((byte) -97);
	Iterator iterator = ((Class489) this).aList6486.iterator();
	while (iterator.hasNext()) {
	    Class505 class505 = (Class505) iterator.next();
	    class505.method11471(class552, class103,
				 ((Class489) this).aLong6488);
	}
    }
    
    void method11194(Class552 class552, Class103 class103) {
	((Class489) this).aClass98_6497.aClass441_1353.method7841((byte) -107);
	Iterator iterator = ((Class489) this).aList6486.iterator();
	while (iterator.hasNext()) {
	    Class505 class505 = (Class505) iterator.next();
	    class505.method11471(class552, class103,
				 ((Class489) this).aLong6488);
	}
    }
    
    public Class98 method11195() {
	return ((Class489) this).aClass98_6497;
    }
    
    public Class98 method11196() {
	return ((Class489) this).aClass98_6497;
    }
    
    public Class98 method11197() {
	return ((Class489) this).aClass98_6497;
    }
    
    public void method11198() {
	((Class489) this).aBool6485 = true;
    }
    
    public Class98 method11199() {
	return ((Class489) this).aClass98_6497;
    }
}
