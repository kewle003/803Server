/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Vector;

public class Class382
{
    Interface43 anInterface43_5667;
    Class105_Sub2 aClass105_Sub2_5668;
    Class366 aClass366_5669;
    Vector aVector5670 = new Vector();
    Interface43 anInterface43_5671;
    Interface43 anInterface43_5672;
    Interface4 anInterface4_5673;
    Interface4 anInterface4_5674;
    int anInt5675 = 0;
    Interface4 anInterface4_5676;
    Class103_Sub3 aClass103_Sub3_5677;
    Interface5 anInterface5_5678;
    Class105_Sub2 aClass105_Sub2_5679;
    int anInt5680;
    Class102 aClass102_5681;
    boolean aBool5682;
    Interface4 anInterface4_5683;
    Interface40 anInterface40_5684;
    Interface5 anInterface5_5685;
    int anInt5686;
    int anInt5687 = 0;
    
    void method6891() {
	if (((Class382) this).aClass105_Sub2_5668 != null) {
	    ((Class382) this).aClass105_Sub2_5668.method28();
	    ((Class382) this).aClass105_Sub2_5668 = null;
	}
	if (((Class382) this).anInterface4_5676 != null) {
	    ((Class382) this).anInterface4_5676.method28();
	    ((Class382) this).anInterface4_5676 = null;
	}
	if (((Class382) this).anInterface5_5678 != null) {
	    ((Class382) this).anInterface5_5678.method28();
	    ((Class382) this).anInterface5_5678 = null;
	}
	if (((Class382) this).aClass105_Sub2_5679 != null)
	    ((Class382) this).aClass105_Sub2_5679.method28();
	if (((Class382) this).anInterface4_5673 != null)
	    ((Class382) this).anInterface4_5673.method28();
	if (((Class382) this).anInterface4_5674 != null)
	    ((Class382) this).anInterface4_5674.method28();
	if (((Class382) this).anInterface4_5683 != null)
	    ((Class382) this).anInterface4_5683.method28();
	if (((Class382) this).anInterface43_5667 != null)
	    ((Class382) this).anInterface43_5667.method28();
	if (((Class382) this).anInterface43_5671 != null)
	    ((Class382) this).anInterface43_5671.method28();
	if (((Class382) this).anInterface43_5672 != null)
	    ((Class382) this).anInterface43_5672.method28();
	if (((Class382) this).anInterface5_5685 != null)
	    ((Class382) this).anInterface5_5685.method28();
	int i = ((Class382) this).aVector5670.size();
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    Class368 class368
		= (Class368) ((Class382) this).aVector5670.elementAt(i_0_);
	    class368.method6564();
	}
    }
    
    void method6892() {
	if (((Class382) this).anInterface40_5684 == null) {
	    ((Class382) this).anInterface40_5684
		= ((Class382) this).aClass103_Sub3_5677.method15752(false);
	    ((Class382) this).anInterface40_5684.method221(12, 4);
	    ByteBuffer bytebuffer
		= ((Class382) this).aClass103_Sub3_5677.aByteBuffer9490;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    ((Class382) this).anInterface40_5684.method268
		(0, bytebuffer.position(),
		 ((Class382) this).aClass103_Sub3_5677.aLong9491);
	    ((Class382) this).aClass366_5669
		= (((Class382) this).aClass103_Sub3_5677.method15697
		   (new Class314[] { new Class314(Class367.aClass367_5559) }));
	}
    }
    
    void method6893() {
	if (((Class382) this).anInterface40_5684 == null) {
	    ((Class382) this).anInterface40_5684
		= ((Class382) this).aClass103_Sub3_5677.method15752(false);
	    ((Class382) this).anInterface40_5684.method221(12, 4);
	    ByteBuffer bytebuffer
		= ((Class382) this).aClass103_Sub3_5677.aByteBuffer9490;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    ((Class382) this).anInterface40_5684.method268
		(0, bytebuffer.position(),
		 ((Class382) this).aClass103_Sub3_5677.aLong9491);
	    ((Class382) this).aClass366_5669
		= (((Class382) this).aClass103_Sub3_5677.method15697
		   (new Class314[] { new Class314(Class367.aClass367_5559) }));
	}
    }
    
    void method6894() {
	((Class382) this).aClass103_Sub3_5677
	    .method15955(0, ((Class382) this).anInterface40_5684);
	((Class382) this).aClass103_Sub3_5677
	    .method15716(((Class382) this).aClass366_5669);
	((Class382) this).aClass103_Sub3_5677
	    .method15623(Class310.aClass310_4822, 0, 1);
    }
    
    boolean method6895(Class368 class368) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < ((Class382) this).aVector5670.size(); i++) {
	    if (!bool && class368.method6569() < method6898(i).method6569()) {
		bool = true;
		if (!method6896(vector, vector.size(), class368))
		    return false;
	    }
	    vector.addElement(method6898(i));
	}
	if (!bool && !method6896(vector, vector.size(), class368))
	    return false;
	((Class382) this).aVector5670 = vector;
	return true;
    }
    
    boolean method6896(Vector vector, int i, Class368 class368) {
	if (class368.method6565() || class368.method6571()) {
	    vector.insertElementAt(class368, i);
	    class368.method6590(((Class382) this).anInt5686,
				((Class382) this).anInt5680);
	    int i_1_ = class368.method6570();
	    if (i_1_ > ((Class382) this).anInt5675)
		((Class382) this).anInt5675 = i_1_;
	    ((Class368) class368).aBool5564 = true;
	    return true;
	}
	return false;
    }
    
    void method6897(Class368 class368) {
	class368.method6564();
	((Class368) class368).aBool5564 = false;
	((Class382) this).aVector5670.removeElement(class368);
    }
    
    Class368 method6898(int i) {
	return (Class368) ((Class382) this).aVector5670.elementAt(i);
    }
    
    Class382(Class103_Sub3 class103_sub3, int i, int i_2_) {
	((Class382) this).aClass103_Sub3_5677 = class103_sub3;
	((Class382) this).aClass102_5681 = Class102.aClass102_1440;
	((Class382) this).anInt5686 = i;
	((Class382) this).anInt5680 = i_2_;
    }
    
    Class368 method6899(int i) {
	return (Class368) ((Class382) this).aVector5670.elementAt(i);
    }
    
    void method6900() {
	if (((Class382) this).aBool5682) {
	    if (((Class382) this).aClass105_Sub2_5668 != null) {
		((Class382) this).aClass103_Sub3_5677.method2245
		    (((Class382) this).aClass105_Sub2_5668, -1255584743);
		((Class382) this).aClass103_Sub3_5677.method2244
		    (((Class382) this).aClass105_Sub2_5679, -519163929);
		((Class382) this).aClass105_Sub2_5668.method15587
		    (0, 0, ((Class382) this).anInt5686,
		     ((Class382) this).anInt5680, 0, 0, true,
		     ((Class382) this).anInterface5_5685 != null);
	    }
	    method6901();
	    ((Class382) this).aBool5682 = false;
	}
    }
    
    void method6901() {
	((Class382) this).aClass103_Sub3_5677.method2279(true);
	((Class382) this).aClass103_Sub3_5677.method15727();
	((Class382) this).aClass103_Sub3_5677.method15640(0);
	((Class382) this).aClass103_Sub3_5677.method15655(1);
	((Class382) this).aClass103_Sub3_5677.method2572();
	((Class382) this).aClass105_Sub2_5679.method15584(null);
	((Class382) this).aClass103_Sub3_5677.method15639(0, 0);
	int i = ((Class382) this).aVector5670.size();
	Vector vector = ((Class382) this).aVector5670;
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    if (((Class368) ((Class382) this).aVector5670.elementAt(i_3_))
		    .method6573()) {
		vector = new Vector();
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
		    if (!((Class368)
			  ((Class382) this).aVector5670.elementAt(i_4_))
			     .method6573())
			vector.addElement(((Class382) this).aVector5670
					      .elementAt(i_4_));
		}
		i = vector.size();
		break;
	    }
	}
	((Class382) this).anInterface43_5672.method150();
	for (int i_5_ = 0; i_5_ < i; i_5_++) {
	    Class368 class368 = (Class368) vector.elementAt(i_5_);
	    int i_6_ = class368.method6587();
	    boolean bool = i_5_ == i - 1;
	    boolean bool_7_ = false;
	    for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
		if (i_8_ == i_6_ - 1) {
		    if (bool)
			((Class382) this).aClass103_Sub3_5677.method2245
			    (((Class382) this).aClass105_Sub2_5679,
			     -1522592998);
		    else {
			bool_7_ = true;
			((Class382) this).aClass105_Sub2_5679.method15585
			    (0, ((Class382) this).anInterface4_5683);
		    }
		} else
		    ((Class382) this).aClass105_Sub2_5679
			.method15585(0, ((Class382) this).anInterface4_5674);
		Interface43 interface43 = ((Class382) this).anInterface43_5667;
		if (i_8_ == 0)
		    interface43 = ((Class382) this).anInterface43_5672;
		class368.method6578(i_8_,
				    ((Class382) this).aClass105_Sub2_5679,
				    interface43,
				    ((Class382) this).anInterface5_5685,
				    ((Class382) this).anInterface43_5672,
				    bool && i_8_ == i_6_ - 1);
		method6917();
		class368.method6561(i_8_);
		if (bool_7_)
		    ((Class382) this).anInterface43_5672.method150();
		Interface43 interface43_9_
		    = ((Class382) this).anInterface43_5667;
		((Class382) this).anInterface43_5667
		    = ((Class382) this).anInterface43_5671;
		((Class382) this).anInterface43_5671 = interface43_9_;
		Interface4 interface4 = ((Class382) this).anInterface4_5673;
		((Class382) this).anInterface4_5673
		    = ((Class382) this).anInterface4_5674;
		((Class382) this).anInterface4_5674 = interface4;
	    }
	}
	((Class382) this).aClass103_Sub3_5677.method15640(1);
	((Class382) this).aClass103_Sub3_5677.method15655(0);
	((Class382) this).aClass103_Sub3_5677.method2279(false);
	Object object = null;
    }
    
    void method6902() {
	if (((Class382) this).aClass105_Sub2_5668 != null) {
	    ((Class382) this).aClass105_Sub2_5668.method28();
	    ((Class382) this).aClass105_Sub2_5668 = null;
	}
	if (((Class382) this).anInterface4_5676 != null) {
	    ((Class382) this).anInterface4_5676.method28();
	    ((Class382) this).anInterface4_5676 = null;
	}
	if (((Class382) this).anInterface5_5678 != null) {
	    ((Class382) this).anInterface5_5678.method28();
	    ((Class382) this).anInterface5_5678 = null;
	}
	if (((Class382) this).aClass105_Sub2_5679 != null)
	    ((Class382) this).aClass105_Sub2_5679.method28();
	if (((Class382) this).anInterface4_5673 != null)
	    ((Class382) this).anInterface4_5673.method28();
	if (((Class382) this).anInterface4_5674 != null)
	    ((Class382) this).anInterface4_5674.method28();
	if (((Class382) this).anInterface4_5683 != null)
	    ((Class382) this).anInterface4_5683.method28();
	if (((Class382) this).anInterface43_5667 != null)
	    ((Class382) this).anInterface43_5667.method28();
	if (((Class382) this).anInterface43_5671 != null)
	    ((Class382) this).anInterface43_5671.method28();
	if (((Class382) this).anInterface43_5672 != null)
	    ((Class382) this).anInterface43_5672.method28();
	if (((Class382) this).anInterface5_5685 != null)
	    ((Class382) this).anInterface5_5685.method28();
	int i = ((Class382) this).aVector5670.size();
	for (int i_10_ = 0; i_10_ < i; i_10_++) {
	    Class368 class368
		= (Class368) ((Class382) this).aVector5670.elementAt(i_10_);
	    class368.method6564();
	}
    }
    
    void method6903() {
	if (((Class382) this).anInterface40_5684 == null) {
	    ((Class382) this).anInterface40_5684
		= ((Class382) this).aClass103_Sub3_5677.method15752(false);
	    ((Class382) this).anInterface40_5684.method221(12, 4);
	    ByteBuffer bytebuffer
		= ((Class382) this).aClass103_Sub3_5677.aByteBuffer9490;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    ((Class382) this).anInterface40_5684.method268
		(0, bytebuffer.position(),
		 ((Class382) this).aClass103_Sub3_5677.aLong9491);
	    ((Class382) this).aClass366_5669
		= (((Class382) this).aClass103_Sub3_5677.method15697
		   (new Class314[] { new Class314(Class367.aClass367_5559) }));
	}
    }
    
    Class368 method6904(int i) {
	return (Class368) ((Class382) this).aVector5670.elementAt(i);
    }
    
    void method6905() {
	if (((Class382) this).anInterface40_5684 == null) {
	    ((Class382) this).anInterface40_5684
		= ((Class382) this).aClass103_Sub3_5677.method15752(false);
	    ((Class382) this).anInterface40_5684.method221(12, 4);
	    ByteBuffer bytebuffer
		= ((Class382) this).aClass103_Sub3_5677.aByteBuffer9490;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    ((Class382) this).anInterface40_5684.method268
		(0, bytebuffer.position(),
		 ((Class382) this).aClass103_Sub3_5677.aLong9491);
	    ((Class382) this).aClass366_5669
		= (((Class382) this).aClass103_Sub3_5677.method15697
		   (new Class314[] { new Class314(Class367.aClass367_5559) }));
	}
    }
    
    boolean method6906() {
	int i = ((Class382) this).aVector5670.size();
	for (int i_11_ = 0; i_11_ < i; i_11_++) {
	    if (!((Class368) ((Class382) this).aVector5670.elementAt(i_11_))
		     .method6573())
		return false;
	}
	return true;
    }
    
    void method6907() {
	((Class382) this).aClass103_Sub3_5677
	    .method15955(0, ((Class382) this).anInterface40_5684);
	((Class382) this).aClass103_Sub3_5677
	    .method15716(((Class382) this).aClass366_5669);
	((Class382) this).aClass103_Sub3_5677
	    .method15623(Class310.aClass310_4822, 0, 1);
    }
    
    void method6908() {
	((Class382) this).aClass103_Sub3_5677
	    .method15955(0, ((Class382) this).anInterface40_5684);
	((Class382) this).aClass103_Sub3_5677
	    .method15716(((Class382) this).aClass366_5669);
	((Class382) this).aClass103_Sub3_5677
	    .method15623(Class310.aClass310_4822, 0, 1);
    }
    
    void method6909() {
	method6892();
	switch (((Class382) this).anInt5675) {
	case 1:
	    ((Class382) this).aClass102_5681 = Class102.aClass102_1444;
	    break;
	default:
	    throw new RuntimeException();
	case 2:
	    ((Class382) this).aClass102_5681 = Class102.aClass102_1443;
	    break;
	case 0:
	    ((Class382) this).aClass102_5681 = Class102.aClass102_1440;
	}
	((Class382) this).aClass105_Sub2_5679
	    = ((Class382) this).aClass103_Sub3_5677.method2248();
	if (((Class382) this).aClass103_Sub3_5677.anInt9623 > 1
	    && ((Class382) this).aClass103_Sub3_5677.aBool9632
	    && ((Class382) this).aClass103_Sub3_5677.aBool9622) {
	    ((Class382) this).aClass105_Sub2_5668
		= ((Class382) this).aClass103_Sub3_5677.method2248();
	    ((Class382) this).anInterface4_5676
		= (((Class382) this).aClass103_Sub3_5677.method2461
		   (((Class382) this).anInt5686, ((Class382) this).anInt5680,
		    Class175.aClass175_2110, ((Class382) this).aClass102_5681,
		    ((Class382) this).aClass103_Sub3_5677.anInt9623));
	    ((Class382) this).anInterface5_5678
		= (((Class382) this).aClass103_Sub3_5677.method2550
		   (((Class382) this).anInt5686, ((Class382) this).anInt5680,
		    ((Class382) this).aClass103_Sub3_5677.anInt9623));
	}
	((Class382) this).anInterface43_5667
	    = (((Class382) this).aClass103_Sub3_5677.method15684
	       (Class175.aClass175_2110, ((Class382) this).aClass102_5681,
		((Class382) this).anInt5686, ((Class382) this).anInt5680));
	((Class382) this).anInterface4_5673
	    = ((Class382) this).anInterface43_5667.method274(0);
	((Class382) this).anInterface43_5671
	    = (((Class382) this).aClass103_Sub3_5677.method15684
	       (Class175.aClass175_2110, ((Class382) this).aClass102_5681,
		((Class382) this).anInt5686, ((Class382) this).anInt5680));
	((Class382) this).anInterface4_5674
	    = ((Class382) this).anInterface43_5671.method274(0);
	((Class382) this).anInterface43_5672
	    = (((Class382) this).aClass103_Sub3_5677.method15684
	       (Class175.aClass175_2110, ((Class382) this).aClass102_5681,
		((Class382) this).anInt5686, ((Class382) this).anInt5680));
	((Class382) this).anInterface4_5683
	    = ((Class382) this).anInterface43_5672.method274(0);
	((Class382) this).anInterface5_5685
	    = (((Class382) this).aClass103_Sub3_5677.method2249
	       (((Class382) this).anInterface43_5672.method55(),
		((Class382) this).anInterface43_5672.method49()));
	int i = ((Class382) this).aVector5670.size();
	for (int i_12_ = 0; i_12_ < i; i_12_++) {
	    Class368 class368
		= (Class368) ((Class382) this).aVector5670.elementAt(i_12_);
	    class368.method6590(((Class382) this).anInt5686,
				((Class382) this).anInt5680);
	}
    }
    
    boolean method6910(Class368 class368) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < ((Class382) this).aVector5670.size(); i++) {
	    if (!bool && class368.method6569() < method6898(i).method6569()) {
		bool = true;
		if (!method6896(vector, vector.size(), class368))
		    return false;
	    }
	    vector.addElement(method6898(i));
	}
	if (!bool && !method6896(vector, vector.size(), class368))
	    return false;
	((Class382) this).aVector5670 = vector;
	return true;
    }
    
    boolean method6911(int i, int i_13_, int i_14_, int i_15_) {
	if (((Class382) this).aVector5670.isEmpty() || method6906())
	    return false;
	if (((Class382) this).anInt5686 != i_14_
	    || ((Class382) this).anInt5680 != i_15_
	    || (((Class382) this).aClass103_Sub3_5677.anInt9623
		!= ((Class382) this).anInt5687)) {
	    ((Class382) this).anInt5687
		= ((Class382) this).aClass103_Sub3_5677.anInt9623;
	    ((Class382) this).anInt5686 = i_14_;
	    ((Class382) this).anInt5680 = i_15_;
	    method6902();
	    method6927();
	}
	((Class382) this).aClass105_Sub2_5679
	    .method15585(0, ((Class382) this).anInterface4_5683);
	if (((Class382) this).anInterface5_5685 != null)
	    ((Class382) this).aClass105_Sub2_5679
		.method15584(((Class382) this).anInterface5_5685);
	if (((Class382) this).aClass105_Sub2_5668 != null) {
	    ((Class382) this).aClass105_Sub2_5668
		.method15585(0, ((Class382) this).anInterface4_5676);
	    ((Class382) this).aClass105_Sub2_5668
		.method15584(((Class382) this).anInterface5_5678);
	    ((Class382) this).aClass103_Sub3_5677
		.method2244(((Class382) this).aClass105_Sub2_5668, -519163929);
	} else
	    ((Class382) this).aClass103_Sub3_5677
		.method2244(((Class382) this).aClass105_Sub2_5679, -519163929);
	((Class382) this).aClass103_Sub3_5677.method2450(3, -16777216);
	((Class382) this).aClass103_Sub3_5677.method15761(15);
	((Class382) this).aClass103_Sub3_5677.method15706(0);
	if (!((Class382) this).aClass105_Sub2_5679.method15586())
	    throw new RuntimeException("");
	((Class382) this).aBool5682 = true;
	return true;
    }
    
    boolean method6912(Vector vector, int i, Class368 class368) {
	if (class368.method6565() || class368.method6571()) {
	    vector.insertElementAt(class368, i);
	    class368.method6590(((Class382) this).anInt5686,
				((Class382) this).anInt5680);
	    int i_16_ = class368.method6570();
	    if (i_16_ > ((Class382) this).anInt5675)
		((Class382) this).anInt5675 = i_16_;
	    ((Class368) class368).aBool5564 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6913() {
	int i = ((Class382) this).aVector5670.size();
	for (int i_17_ = 0; i_17_ < i; i_17_++) {
	    if (!((Class368) ((Class382) this).aVector5670.elementAt(i_17_))
		     .method6573())
		return false;
	}
	return true;
    }
    
    Class368 method6914(int i) {
	return (Class368) ((Class382) this).aVector5670.elementAt(i);
    }
    
    Class368 method6915(int i) {
	return (Class368) ((Class382) this).aVector5670.elementAt(i);
    }
    
    Class368 method6916(int i) {
	return (Class368) ((Class382) this).aVector5670.elementAt(i);
    }
    
    void method6917() {
	((Class382) this).aClass103_Sub3_5677
	    .method15955(0, ((Class382) this).anInterface40_5684);
	((Class382) this).aClass103_Sub3_5677
	    .method15716(((Class382) this).aClass366_5669);
	((Class382) this).aClass103_Sub3_5677
	    .method15623(Class310.aClass310_4822, 0, 1);
    }
    
    void method6918() {
	((Class382) this).aClass103_Sub3_5677.method2279(true);
	((Class382) this).aClass103_Sub3_5677.method15727();
	((Class382) this).aClass103_Sub3_5677.method15640(0);
	((Class382) this).aClass103_Sub3_5677.method15655(1);
	((Class382) this).aClass103_Sub3_5677.method2572();
	((Class382) this).aClass105_Sub2_5679.method15584(null);
	((Class382) this).aClass103_Sub3_5677.method15639(0, 0);
	int i = ((Class382) this).aVector5670.size();
	Vector vector = ((Class382) this).aVector5670;
	for (int i_18_ = 0; i_18_ < i; i_18_++) {
	    if (((Class368) ((Class382) this).aVector5670.elementAt(i_18_))
		    .method6573()) {
		vector = new Vector();
		for (int i_19_ = 0; i_19_ < i; i_19_++) {
		    if (!((Class368)
			  ((Class382) this).aVector5670.elementAt(i_19_))
			     .method6573())
			vector.addElement(((Class382) this).aVector5670
					      .elementAt(i_19_));
		}
		i = vector.size();
		break;
	    }
	}
	((Class382) this).anInterface43_5672.method150();
	for (int i_20_ = 0; i_20_ < i; i_20_++) {
	    Class368 class368 = (Class368) vector.elementAt(i_20_);
	    int i_21_ = class368.method6587();
	    boolean bool = i_20_ == i - 1;
	    boolean bool_22_ = false;
	    for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
		if (i_23_ == i_21_ - 1) {
		    if (bool)
			((Class382) this).aClass103_Sub3_5677.method2245
			    (((Class382) this).aClass105_Sub2_5679,
			     -2044518362);
		    else {
			bool_22_ = true;
			((Class382) this).aClass105_Sub2_5679.method15585
			    (0, ((Class382) this).anInterface4_5683);
		    }
		} else
		    ((Class382) this).aClass105_Sub2_5679
			.method15585(0, ((Class382) this).anInterface4_5674);
		Interface43 interface43 = ((Class382) this).anInterface43_5667;
		if (i_23_ == 0)
		    interface43 = ((Class382) this).anInterface43_5672;
		class368.method6578(i_23_,
				    ((Class382) this).aClass105_Sub2_5679,
				    interface43,
				    ((Class382) this).anInterface5_5685,
				    ((Class382) this).anInterface43_5672,
				    bool && i_23_ == i_21_ - 1);
		method6917();
		class368.method6561(i_23_);
		if (bool_22_)
		    ((Class382) this).anInterface43_5672.method150();
		Interface43 interface43_24_
		    = ((Class382) this).anInterface43_5667;
		((Class382) this).anInterface43_5667
		    = ((Class382) this).anInterface43_5671;
		((Class382) this).anInterface43_5671 = interface43_24_;
		Interface4 interface4 = ((Class382) this).anInterface4_5673;
		((Class382) this).anInterface4_5673
		    = ((Class382) this).anInterface4_5674;
		((Class382) this).anInterface4_5674 = interface4;
	    }
	}
	((Class382) this).aClass103_Sub3_5677.method15640(1);
	((Class382) this).aClass103_Sub3_5677.method15655(0);
	((Class382) this).aClass103_Sub3_5677.method2279(false);
	Object object = null;
    }
    
    boolean method6919() {
	int i = ((Class382) this).aVector5670.size();
	for (int i_25_ = 0; i_25_ < i; i_25_++) {
	    if (!((Class368) ((Class382) this).aVector5670.elementAt(i_25_))
		     .method6573())
		return false;
	}
	return true;
    }
    
    void method6920() {
	if (((Class382) this).aClass105_Sub2_5668 != null) {
	    ((Class382) this).aClass105_Sub2_5668.method28();
	    ((Class382) this).aClass105_Sub2_5668 = null;
	}
	if (((Class382) this).anInterface4_5676 != null) {
	    ((Class382) this).anInterface4_5676.method28();
	    ((Class382) this).anInterface4_5676 = null;
	}
	if (((Class382) this).anInterface5_5678 != null) {
	    ((Class382) this).anInterface5_5678.method28();
	    ((Class382) this).anInterface5_5678 = null;
	}
	if (((Class382) this).aClass105_Sub2_5679 != null)
	    ((Class382) this).aClass105_Sub2_5679.method28();
	if (((Class382) this).anInterface4_5673 != null)
	    ((Class382) this).anInterface4_5673.method28();
	if (((Class382) this).anInterface4_5674 != null)
	    ((Class382) this).anInterface4_5674.method28();
	if (((Class382) this).anInterface4_5683 != null)
	    ((Class382) this).anInterface4_5683.method28();
	if (((Class382) this).anInterface43_5667 != null)
	    ((Class382) this).anInterface43_5667.method28();
	if (((Class382) this).anInterface43_5671 != null)
	    ((Class382) this).anInterface43_5671.method28();
	if (((Class382) this).anInterface43_5672 != null)
	    ((Class382) this).anInterface43_5672.method28();
	if (((Class382) this).anInterface5_5685 != null)
	    ((Class382) this).anInterface5_5685.method28();
	int i = ((Class382) this).aVector5670.size();
	for (int i_26_ = 0; i_26_ < i; i_26_++) {
	    Class368 class368
		= (Class368) ((Class382) this).aVector5670.elementAt(i_26_);
	    class368.method6564();
	}
    }
    
    boolean method6921(int i, int i_27_, int i_28_, int i_29_) {
	if (((Class382) this).aVector5670.isEmpty() || method6906())
	    return false;
	if (((Class382) this).anInt5686 != i_28_
	    || ((Class382) this).anInt5680 != i_29_
	    || (((Class382) this).aClass103_Sub3_5677.anInt9623
		!= ((Class382) this).anInt5687)) {
	    ((Class382) this).anInt5687
		= ((Class382) this).aClass103_Sub3_5677.anInt9623;
	    ((Class382) this).anInt5686 = i_28_;
	    ((Class382) this).anInt5680 = i_29_;
	    method6902();
	    method6927();
	}
	((Class382) this).aClass105_Sub2_5679
	    .method15585(0, ((Class382) this).anInterface4_5683);
	if (((Class382) this).anInterface5_5685 != null)
	    ((Class382) this).aClass105_Sub2_5679
		.method15584(((Class382) this).anInterface5_5685);
	if (((Class382) this).aClass105_Sub2_5668 != null) {
	    ((Class382) this).aClass105_Sub2_5668
		.method15585(0, ((Class382) this).anInterface4_5676);
	    ((Class382) this).aClass105_Sub2_5668
		.method15584(((Class382) this).anInterface5_5678);
	    ((Class382) this).aClass103_Sub3_5677
		.method2244(((Class382) this).aClass105_Sub2_5668, -519163929);
	} else
	    ((Class382) this).aClass103_Sub3_5677
		.method2244(((Class382) this).aClass105_Sub2_5679, -519163929);
	((Class382) this).aClass103_Sub3_5677.method2450(3, -16777216);
	((Class382) this).aClass103_Sub3_5677.method15761(15);
	((Class382) this).aClass103_Sub3_5677.method15706(0);
	if (!((Class382) this).aClass105_Sub2_5679.method15586())
	    throw new RuntimeException("");
	((Class382) this).aBool5682 = true;
	return true;
    }
    
    boolean method6922(int i, int i_30_, int i_31_, int i_32_) {
	if (((Class382) this).aVector5670.isEmpty() || method6906())
	    return false;
	if (((Class382) this).anInt5686 != i_31_
	    || ((Class382) this).anInt5680 != i_32_
	    || (((Class382) this).aClass103_Sub3_5677.anInt9623
		!= ((Class382) this).anInt5687)) {
	    ((Class382) this).anInt5687
		= ((Class382) this).aClass103_Sub3_5677.anInt9623;
	    ((Class382) this).anInt5686 = i_31_;
	    ((Class382) this).anInt5680 = i_32_;
	    method6902();
	    method6927();
	}
	((Class382) this).aClass105_Sub2_5679
	    .method15585(0, ((Class382) this).anInterface4_5683);
	if (((Class382) this).anInterface5_5685 != null)
	    ((Class382) this).aClass105_Sub2_5679
		.method15584(((Class382) this).anInterface5_5685);
	if (((Class382) this).aClass105_Sub2_5668 != null) {
	    ((Class382) this).aClass105_Sub2_5668
		.method15585(0, ((Class382) this).anInterface4_5676);
	    ((Class382) this).aClass105_Sub2_5668
		.method15584(((Class382) this).anInterface5_5678);
	    ((Class382) this).aClass103_Sub3_5677
		.method2244(((Class382) this).aClass105_Sub2_5668, -519163929);
	} else
	    ((Class382) this).aClass103_Sub3_5677
		.method2244(((Class382) this).aClass105_Sub2_5679, -519163929);
	((Class382) this).aClass103_Sub3_5677.method2450(3, -16777216);
	((Class382) this).aClass103_Sub3_5677.method15761(15);
	((Class382) this).aClass103_Sub3_5677.method15706(0);
	if (!((Class382) this).aClass105_Sub2_5679.method15586())
	    throw new RuntimeException("");
	((Class382) this).aBool5682 = true;
	return true;
    }
    
    void method6923() {
	if (((Class382) this).aBool5682) {
	    if (((Class382) this).aClass105_Sub2_5668 != null) {
		((Class382) this).aClass103_Sub3_5677.method2245
		    (((Class382) this).aClass105_Sub2_5668, -1303882275);
		((Class382) this).aClass103_Sub3_5677.method2244
		    (((Class382) this).aClass105_Sub2_5679, -519163929);
		((Class382) this).aClass105_Sub2_5668.method15587
		    (0, 0, ((Class382) this).anInt5686,
		     ((Class382) this).anInt5680, 0, 0, true,
		     ((Class382) this).anInterface5_5685 != null);
	    }
	    method6901();
	    ((Class382) this).aBool5682 = false;
	}
    }
    
    boolean method6924(int i, int i_33_, int i_34_, int i_35_) {
	if (((Class382) this).aVector5670.isEmpty() || method6906())
	    return false;
	if (((Class382) this).anInt5686 != i_34_
	    || ((Class382) this).anInt5680 != i_35_
	    || (((Class382) this).aClass103_Sub3_5677.anInt9623
		!= ((Class382) this).anInt5687)) {
	    ((Class382) this).anInt5687
		= ((Class382) this).aClass103_Sub3_5677.anInt9623;
	    ((Class382) this).anInt5686 = i_34_;
	    ((Class382) this).anInt5680 = i_35_;
	    method6902();
	    method6927();
	}
	((Class382) this).aClass105_Sub2_5679
	    .method15585(0, ((Class382) this).anInterface4_5683);
	if (((Class382) this).anInterface5_5685 != null)
	    ((Class382) this).aClass105_Sub2_5679
		.method15584(((Class382) this).anInterface5_5685);
	if (((Class382) this).aClass105_Sub2_5668 != null) {
	    ((Class382) this).aClass105_Sub2_5668
		.method15585(0, ((Class382) this).anInterface4_5676);
	    ((Class382) this).aClass105_Sub2_5668
		.method15584(((Class382) this).anInterface5_5678);
	    ((Class382) this).aClass103_Sub3_5677
		.method2244(((Class382) this).aClass105_Sub2_5668, -519163929);
	} else
	    ((Class382) this).aClass103_Sub3_5677
		.method2244(((Class382) this).aClass105_Sub2_5679, -519163929);
	((Class382) this).aClass103_Sub3_5677.method2450(3, -16777216);
	((Class382) this).aClass103_Sub3_5677.method15761(15);
	((Class382) this).aClass103_Sub3_5677.method15706(0);
	if (!((Class382) this).aClass105_Sub2_5679.method15586())
	    throw new RuntimeException("");
	((Class382) this).aBool5682 = true;
	return true;
    }
    
    boolean method6925(int i, int i_36_, int i_37_, int i_38_) {
	if (((Class382) this).aVector5670.isEmpty() || method6906())
	    return false;
	if (((Class382) this).anInt5686 != i_37_
	    || ((Class382) this).anInt5680 != i_38_
	    || (((Class382) this).aClass103_Sub3_5677.anInt9623
		!= ((Class382) this).anInt5687)) {
	    ((Class382) this).anInt5687
		= ((Class382) this).aClass103_Sub3_5677.anInt9623;
	    ((Class382) this).anInt5686 = i_37_;
	    ((Class382) this).anInt5680 = i_38_;
	    method6902();
	    method6927();
	}
	((Class382) this).aClass105_Sub2_5679
	    .method15585(0, ((Class382) this).anInterface4_5683);
	if (((Class382) this).anInterface5_5685 != null)
	    ((Class382) this).aClass105_Sub2_5679
		.method15584(((Class382) this).anInterface5_5685);
	if (((Class382) this).aClass105_Sub2_5668 != null) {
	    ((Class382) this).aClass105_Sub2_5668
		.method15585(0, ((Class382) this).anInterface4_5676);
	    ((Class382) this).aClass105_Sub2_5668
		.method15584(((Class382) this).anInterface5_5678);
	    ((Class382) this).aClass103_Sub3_5677
		.method2244(((Class382) this).aClass105_Sub2_5668, -519163929);
	} else
	    ((Class382) this).aClass103_Sub3_5677
		.method2244(((Class382) this).aClass105_Sub2_5679, -519163929);
	((Class382) this).aClass103_Sub3_5677.method2450(3, -16777216);
	((Class382) this).aClass103_Sub3_5677.method15761(15);
	((Class382) this).aClass103_Sub3_5677.method15706(0);
	if (!((Class382) this).aClass105_Sub2_5679.method15586())
	    throw new RuntimeException("");
	((Class382) this).aBool5682 = true;
	return true;
    }
    
    void method6926() {
	if (((Class382) this).aBool5682) {
	    if (((Class382) this).aClass105_Sub2_5668 != null) {
		((Class382) this).aClass103_Sub3_5677.method2245
		    (((Class382) this).aClass105_Sub2_5668, -1215352944);
		((Class382) this).aClass103_Sub3_5677.method2244
		    (((Class382) this).aClass105_Sub2_5679, -519163929);
		((Class382) this).aClass105_Sub2_5668.method15587
		    (0, 0, ((Class382) this).anInt5686,
		     ((Class382) this).anInt5680, 0, 0, true,
		     ((Class382) this).anInterface5_5685 != null);
	    }
	    method6901();
	    ((Class382) this).aBool5682 = false;
	}
    }
    
    void method6927() {
	method6892();
	switch (((Class382) this).anInt5675) {
	case 1:
	    ((Class382) this).aClass102_5681 = Class102.aClass102_1444;
	    break;
	default:
	    throw new RuntimeException();
	case 2:
	    ((Class382) this).aClass102_5681 = Class102.aClass102_1443;
	    break;
	case 0:
	    ((Class382) this).aClass102_5681 = Class102.aClass102_1440;
	}
	((Class382) this).aClass105_Sub2_5679
	    = ((Class382) this).aClass103_Sub3_5677.method2248();
	if (((Class382) this).aClass103_Sub3_5677.anInt9623 > 1
	    && ((Class382) this).aClass103_Sub3_5677.aBool9632
	    && ((Class382) this).aClass103_Sub3_5677.aBool9622) {
	    ((Class382) this).aClass105_Sub2_5668
		= ((Class382) this).aClass103_Sub3_5677.method2248();
	    ((Class382) this).anInterface4_5676
		= (((Class382) this).aClass103_Sub3_5677.method2461
		   (((Class382) this).anInt5686, ((Class382) this).anInt5680,
		    Class175.aClass175_2110, ((Class382) this).aClass102_5681,
		    ((Class382) this).aClass103_Sub3_5677.anInt9623));
	    ((Class382) this).anInterface5_5678
		= (((Class382) this).aClass103_Sub3_5677.method2550
		   (((Class382) this).anInt5686, ((Class382) this).anInt5680,
		    ((Class382) this).aClass103_Sub3_5677.anInt9623));
	}
	((Class382) this).anInterface43_5667
	    = (((Class382) this).aClass103_Sub3_5677.method15684
	       (Class175.aClass175_2110, ((Class382) this).aClass102_5681,
		((Class382) this).anInt5686, ((Class382) this).anInt5680));
	((Class382) this).anInterface4_5673
	    = ((Class382) this).anInterface43_5667.method274(0);
	((Class382) this).anInterface43_5671
	    = (((Class382) this).aClass103_Sub3_5677.method15684
	       (Class175.aClass175_2110, ((Class382) this).aClass102_5681,
		((Class382) this).anInt5686, ((Class382) this).anInt5680));
	((Class382) this).anInterface4_5674
	    = ((Class382) this).anInterface43_5671.method274(0);
	((Class382) this).anInterface43_5672
	    = (((Class382) this).aClass103_Sub3_5677.method15684
	       (Class175.aClass175_2110, ((Class382) this).aClass102_5681,
		((Class382) this).anInt5686, ((Class382) this).anInt5680));
	((Class382) this).anInterface4_5683
	    = ((Class382) this).anInterface43_5672.method274(0);
	((Class382) this).anInterface5_5685
	    = (((Class382) this).aClass103_Sub3_5677.method2249
	       (((Class382) this).anInterface43_5672.method55(),
		((Class382) this).anInterface43_5672.method49()));
	int i = ((Class382) this).aVector5670.size();
	for (int i_39_ = 0; i_39_ < i; i_39_++) {
	    Class368 class368
		= (Class368) ((Class382) this).aVector5670.elementAt(i_39_);
	    class368.method6590(((Class382) this).anInt5686,
				((Class382) this).anInt5680);
	}
    }
    
    boolean method6928(Class368 class368) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < ((Class382) this).aVector5670.size(); i++) {
	    if (!bool && class368.method6569() < method6898(i).method6569()) {
		bool = true;
		if (!method6896(vector, vector.size(), class368))
		    return false;
	    }
	    vector.addElement(method6898(i));
	}
	if (!bool && !method6896(vector, vector.size(), class368))
	    return false;
	((Class382) this).aVector5670 = vector;
	return true;
    }
    
    void method6929(Class368 class368) {
	class368.method6564();
	((Class368) class368).aBool5564 = false;
	((Class382) this).aVector5670.removeElement(class368);
    }
}
