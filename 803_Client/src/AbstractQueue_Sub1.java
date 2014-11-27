/* AbstractQueue_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue<Object>
{
    Class318[] aClass318Array10711;
    int anInt10712;
    Map aMap10713;
    Comparator aComparator10714;
    int anInt10715 = 0;
    
    public int size() {
	return -1573335367 * ((AbstractQueue_Sub1) this).anInt10712;
    }
    
    public AbstractQueue_Sub1(int i, Comparator comparator) {
	((AbstractQueue_Sub1) this).aClass318Array10711 = new Class318[i];
	((AbstractQueue_Sub1) this).aMap10713 = new HashMap();
	((AbstractQueue_Sub1) this).aComparator10714 = comparator;
    }
    
    public AbstractQueue_Sub1(int i) {
	this(i, null);
    }
    
    public boolean remove(Object object) {
	Class318 class318
	    = (Class318) ((AbstractQueue_Sub1) this).aMap10713.remove(object);
	if (null == class318)
	    return false;
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	((AbstractQueue_Sub1) this).anInt10712 -= -337848439;
	if (-1573335367 * ((AbstractQueue_Sub1) this).anInt10712
	    == -1186221987 * ((Class318) class318).anInt4866) {
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[((AbstractQueue_Sub1) this).anInt10712 * -1573335367]
		= null;
	    return true;
	}
	Class318 class318_0_
	    = (((AbstractQueue_Sub1) this).aClass318Array10711
	       [((AbstractQueue_Sub1) this).anInt10712 * -1573335367]);
	((AbstractQueue_Sub1) this).aClass318Array10711
	    [-1573335367 * ((AbstractQueue_Sub1) this).anInt10712]
	    = null;
	((AbstractQueue_Sub1) this).aClass318Array10711
	    [-1186221987 * ((Class318) class318).anInt4866]
	    = class318_0_;
	((Class318) (((AbstractQueue_Sub1) this).aClass318Array10711
		     [-1186221987 * ((Class318) class318).anInt4866]))
	    .anInt4866
	    = 1 * ((Class318) class318).anInt4866;
	method16995(-1186221987 * ((Class318) class318).anInt4866, (byte) 27);
	if (class318_0_ == (((AbstractQueue_Sub1) this).aClass318Array10711
			    [-1186221987 * ((Class318) class318).anInt4866]))
	    method16974(((Class318) class318).anInt4866 * -1186221987,
			519699323);
	return true;
    }
    
    public boolean offer(Object object) {
	if (((AbstractQueue_Sub1) this).aMap10713.containsKey(object))
	    throw new IllegalArgumentException("");
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	int i = ((AbstractQueue_Sub1) this).anInt10712 * -1573335367;
	if (i >= ((AbstractQueue_Sub1) this).aClass318Array10711.length)
	    method16993((byte) 7);
	((AbstractQueue_Sub1) this).anInt10712 += -337848439;
	if (i == 0) {
	    ((AbstractQueue_Sub1) this).aClass318Array10711[0]
		= new Class318(object, 0);
	    ((AbstractQueue_Sub1) this).aMap10713.put
		(object, ((AbstractQueue_Sub1) this).aClass318Array10711[0]);
	} else {
	    ((AbstractQueue_Sub1) this).aClass318Array10711[i]
		= new Class318(object, i);
	    ((AbstractQueue_Sub1) this).aMap10713.put
		(object, ((AbstractQueue_Sub1) this).aClass318Array10711[i]);
	    method16974(i, 519699323);
	}
	return true;
    }
    
    public Object peek() {
	if (((AbstractQueue_Sub1) this).anInt10712 * -1573335367 == 0)
	    return null;
	return (((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[0])
		.anObject4867);
    }
    
    public Iterator method16972() {
	return new Class327(this);
    }
    
    public int method16973() {
	return -1573335367 * ((AbstractQueue_Sub1) this).anInt10712;
    }
    
    void method16974(int i, int i_1_) {
	Class318 class318 = ((AbstractQueue_Sub1) this).aClass318Array10711[i];
	int i_2_;
	for (/**/; i > 0; i = i_2_) {
	    i_2_ = i - 1 >>> 1;
	    Class318 class318_3_
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_2_];
	    if (null != ((AbstractQueue_Sub1) this).aComparator10714) {
		if ((((AbstractQueue_Sub1) this).aComparator10714.compare
		     (((Class318) class318).anObject4867,
		      ((Class318) class318_3_).anObject4867))
		    >= 0)
		    break;
	    } else if (((Comparable) ((Class318) class318).anObject4867)
			   .compareTo(((Class318) class318_3_).anObject4867)
		       >= 0)
		break;
	    ((AbstractQueue_Sub1) this).aClass318Array10711[i] = class318_3_;
	    ((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
		.anInt4866
		= i * -32922635;
	}
	((AbstractQueue_Sub1) this).aClass318Array10711[i] = class318;
	((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
	    .anInt4866
	    = i * -32922635;
    }
    
    public boolean method16975(Object object) {
	if (((AbstractQueue_Sub1) this).aMap10713.containsKey(object))
	    throw new IllegalArgumentException("");
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	int i = ((AbstractQueue_Sub1) this).anInt10712 * -1573335367;
	if (i >= ((AbstractQueue_Sub1) this).aClass318Array10711.length)
	    method16993((byte) 7);
	((AbstractQueue_Sub1) this).anInt10712 += -337848439;
	if (i == 0) {
	    ((AbstractQueue_Sub1) this).aClass318Array10711[0]
		= new Class318(object, 0);
	    ((AbstractQueue_Sub1) this).aMap10713.put
		(object, ((AbstractQueue_Sub1) this).aClass318Array10711[0]);
	} else {
	    ((AbstractQueue_Sub1) this).aClass318Array10711[i]
		= new Class318(object, i);
	    ((AbstractQueue_Sub1) this).aMap10713.put
		(object, ((AbstractQueue_Sub1) this).aClass318Array10711[i]);
	    method16974(i, 519699323);
	}
	return true;
    }
    
    public boolean contains(Object object) {
	return ((AbstractQueue_Sub1) this).aMap10713.containsKey(object);
    }
    
    public Object[] toArray() {
	Object[] objects = super.toArray();
	if (((AbstractQueue_Sub1) this).aComparator10714 != null)
	    Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator10714);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    public Iterator iterator() {
	return new Class327(this);
    }
    
    void method16976() {
	int i = 1 + (((AbstractQueue_Sub1) this).aClass318Array10711.length
		     << 1);
	((AbstractQueue_Sub1) this).aClass318Array10711
	    = ((Class318[])
	       Arrays.copyOf(((AbstractQueue_Sub1) this).aClass318Array10711,
			     i));
    }
    
    void method16977() {
	int i = 1 + (((AbstractQueue_Sub1) this).aClass318Array10711.length
		     << 1);
	((AbstractQueue_Sub1) this).aClass318Array10711
	    = ((Class318[])
	       Arrays.copyOf(((AbstractQueue_Sub1) this).aClass318Array10711,
			     i));
    }
    
    public boolean method16978(Object object) {
	return ((AbstractQueue_Sub1) this).aMap10713.containsKey(object);
    }
    
    void method16979() {
	int i = 1 + (((AbstractQueue_Sub1) this).aClass318Array10711.length
		     << 1);
	((AbstractQueue_Sub1) this).aClass318Array10711
	    = ((Class318[])
	       Arrays.copyOf(((AbstractQueue_Sub1) this).aClass318Array10711,
			     i));
    }
    
    public Object[] method16980() {
	Object[] objects = super.toArray();
	if (((AbstractQueue_Sub1) this).aComparator10714 != null)
	    Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator10714);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    void method16981(int i) {
	Class318 class318 = ((AbstractQueue_Sub1) this).aClass318Array10711[i];
	int i_4_;
	for (int i_5_
		 = -1573335367 * ((AbstractQueue_Sub1) this).anInt10712 >>> 1;
	     i < i_5_; i = i_4_) {
	    int i_6_ = (i << 1) + 1;
	    Class318 class318_7_
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_6_];
	    int i_8_ = (i << 1) + 2;
	    Class318 class318_9_
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_8_];
	    if (null != ((AbstractQueue_Sub1) this).aComparator10714) {
		if (i_8_ < -1573335367 * ((AbstractQueue_Sub1) this).anInt10712
		    && (((AbstractQueue_Sub1) this).aComparator10714.compare
			(((Class318) class318_7_).anObject4867,
			 ((Class318) class318_9_).anObject4867)) > 0)
		    i_4_ = i_8_;
		else
		    i_4_ = i_6_;
	    } else if ((i_8_
			< -1573335367 * ((AbstractQueue_Sub1) this).anInt10712)
		       && (((Comparable) ((Class318) class318_7_).anObject4867)
			       .compareTo
			   (((Class318) class318_9_).anObject4867)) > 0)
		i_4_ = i_8_;
	    else
		i_4_ = i_6_;
	    if (null != ((AbstractQueue_Sub1) this).aComparator10714) {
		if ((((AbstractQueue_Sub1) this).aComparator10714.compare
		     (((Class318) class318).anObject4867,
		      ((Class318) (((AbstractQueue_Sub1) this)
				   .aClass318Array10711[i_4_])).anObject4867))
		    <= 0)
		    break;
	    } else if ((((Comparable) ((Class318) class318).anObject4867)
			    .compareTo
			(((Class318) (((AbstractQueue_Sub1) this)
				      .aClass318Array10711[i_4_]))
			 .anObject4867))
		       <= 0)
		break;
	    ((AbstractQueue_Sub1) this).aClass318Array10711[i]
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_4_];
	    ((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
		.anInt4866
		= i * -32922635;
	}
	((AbstractQueue_Sub1) this).aClass318Array10711[i] = class318;
	((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
	    .anInt4866
	    = i * -32922635;
    }
    
    public Object method16982() {
	if (((AbstractQueue_Sub1) this).anInt10712 * -1573335367 == 0)
	    return null;
	return (((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[0])
		.anObject4867);
    }
    
    public Object method16983() {
	if (0 == ((AbstractQueue_Sub1) this).anInt10712 * -1573335367)
	    return null;
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	Object object
	    = (((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[0])
	       .anObject4867);
	((AbstractQueue_Sub1) this).aMap10713.remove(object);
	((AbstractQueue_Sub1) this).anInt10712 -= -337848439;
	if (0 == ((AbstractQueue_Sub1) this).anInt10712 * -1573335367)
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[((AbstractQueue_Sub1) this).anInt10712 * -1573335367]
		= null;
	else {
	    ((AbstractQueue_Sub1) this).aClass318Array10711[0]
		= (((AbstractQueue_Sub1) this).aClass318Array10711
		   [((AbstractQueue_Sub1) this).anInt10712 * -1573335367]);
	    ((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[0])
		.anInt4866
		= 0;
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[-1573335367 * ((AbstractQueue_Sub1) this).anInt10712]
		= null;
	    method16995(0, (byte) 27);
	}
	return object;
    }
    
    public Object method16984() {
	if (0 == ((AbstractQueue_Sub1) this).anInt10712 * -1573335367)
	    return null;
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	Object object
	    = (((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[0])
	       .anObject4867);
	((AbstractQueue_Sub1) this).aMap10713.remove(object);
	((AbstractQueue_Sub1) this).anInt10712 -= -337848439;
	if (0 == ((AbstractQueue_Sub1) this).anInt10712 * -1573335367)
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[((AbstractQueue_Sub1) this).anInt10712 * -1573335367]
		= null;
	else {
	    ((AbstractQueue_Sub1) this).aClass318Array10711[0]
		= (((AbstractQueue_Sub1) this).aClass318Array10711
		   [((AbstractQueue_Sub1) this).anInt10712 * -1573335367]);
	    ((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[0])
		.anInt4866
		= 0;
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[-1573335367 * ((AbstractQueue_Sub1) this).anInt10712]
		= null;
	    method16995(0, (byte) 27);
	}
	return object;
    }
    
    public Object method16985() {
	if (0 == ((AbstractQueue_Sub1) this).anInt10712 * -1573335367)
	    return null;
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	Object object
	    = (((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[0])
	       .anObject4867);
	((AbstractQueue_Sub1) this).aMap10713.remove(object);
	((AbstractQueue_Sub1) this).anInt10712 -= -337848439;
	if (0 == ((AbstractQueue_Sub1) this).anInt10712 * -1573335367)
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[((AbstractQueue_Sub1) this).anInt10712 * -1573335367]
		= null;
	else {
	    ((AbstractQueue_Sub1) this).aClass318Array10711[0]
		= (((AbstractQueue_Sub1) this).aClass318Array10711
		   [((AbstractQueue_Sub1) this).anInt10712 * -1573335367]);
	    ((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[0])
		.anInt4866
		= 0;
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[-1573335367 * ((AbstractQueue_Sub1) this).anInt10712]
		= null;
	    method16995(0, (byte) 27);
	}
	return object;
    }
    
    public boolean method16986(Object object) {
	Class318 class318
	    = (Class318) ((AbstractQueue_Sub1) this).aMap10713.remove(object);
	if (null == class318)
	    return false;
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	((AbstractQueue_Sub1) this).anInt10712 -= -337848439;
	if (-1573335367 * ((AbstractQueue_Sub1) this).anInt10712
	    == -1186221987 * ((Class318) class318).anInt4866) {
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[((AbstractQueue_Sub1) this).anInt10712 * -1573335367]
		= null;
	    return true;
	}
	Class318 class318_10_
	    = (((AbstractQueue_Sub1) this).aClass318Array10711
	       [((AbstractQueue_Sub1) this).anInt10712 * -1573335367]);
	((AbstractQueue_Sub1) this).aClass318Array10711
	    [-1573335367 * ((AbstractQueue_Sub1) this).anInt10712]
	    = null;
	((AbstractQueue_Sub1) this).aClass318Array10711
	    [-1186221987 * ((Class318) class318).anInt4866]
	    = class318_10_;
	((Class318) (((AbstractQueue_Sub1) this).aClass318Array10711
		     [-1186221987 * ((Class318) class318).anInt4866]))
	    .anInt4866
	    = 1 * ((Class318) class318).anInt4866;
	method16995(-1186221987 * ((Class318) class318).anInt4866, (byte) 27);
	if (class318_10_ == (((AbstractQueue_Sub1) this).aClass318Array10711
			     [-1186221987 * ((Class318) class318).anInt4866]))
	    method16974(((Class318) class318).anInt4866 * -1186221987,
			519699323);
	return true;
    }
    
    public boolean method16987(Object object) {
	Class318 class318
	    = (Class318) ((AbstractQueue_Sub1) this).aMap10713.remove(object);
	if (null == class318)
	    return false;
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	((AbstractQueue_Sub1) this).anInt10712 -= -337848439;
	if (-1573335367 * ((AbstractQueue_Sub1) this).anInt10712
	    == -1186221987 * ((Class318) class318).anInt4866) {
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[((AbstractQueue_Sub1) this).anInt10712 * -1573335367]
		= null;
	    return true;
	}
	Class318 class318_11_
	    = (((AbstractQueue_Sub1) this).aClass318Array10711
	       [((AbstractQueue_Sub1) this).anInt10712 * -1573335367]);
	((AbstractQueue_Sub1) this).aClass318Array10711
	    [-1573335367 * ((AbstractQueue_Sub1) this).anInt10712]
	    = null;
	((AbstractQueue_Sub1) this).aClass318Array10711
	    [-1186221987 * ((Class318) class318).anInt4866]
	    = class318_11_;
	((Class318) (((AbstractQueue_Sub1) this).aClass318Array10711
		     [-1186221987 * ((Class318) class318).anInt4866]))
	    .anInt4866
	    = 1 * ((Class318) class318).anInt4866;
	method16995(-1186221987 * ((Class318) class318).anInt4866, (byte) 27);
	if (class318_11_ == (((AbstractQueue_Sub1) this).aClass318Array10711
			     [-1186221987 * ((Class318) class318).anInt4866]))
	    method16974(((Class318) class318).anInt4866 * -1186221987,
			519699323);
	return true;
    }
    
    public Object[] method16988() {
	Object[] objects = super.toArray();
	if (((AbstractQueue_Sub1) this).aComparator10714 != null)
	    Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator10714);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    void method16989(int i) {
	Class318 class318 = ((AbstractQueue_Sub1) this).aClass318Array10711[i];
	int i_12_;
	for (/**/; i > 0; i = i_12_) {
	    i_12_ = i - 1 >>> 1;
	    Class318 class318_13_
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_12_];
	    if (null != ((AbstractQueue_Sub1) this).aComparator10714) {
		if ((((AbstractQueue_Sub1) this).aComparator10714.compare
		     (((Class318) class318).anObject4867,
		      ((Class318) class318_13_).anObject4867))
		    >= 0)
		    break;
	    } else if (((Comparable) ((Class318) class318).anObject4867)
			   .compareTo(((Class318) class318_13_).anObject4867)
		       >= 0)
		break;
	    ((AbstractQueue_Sub1) this).aClass318Array10711[i] = class318_13_;
	    ((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
		.anInt4866
		= i * -32922635;
	}
	((AbstractQueue_Sub1) this).aClass318Array10711[i] = class318;
	((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
	    .anInt4866
	    = i * -32922635;
    }
    
    public boolean method16990(Object object) {
	if (((AbstractQueue_Sub1) this).aMap10713.containsKey(object))
	    throw new IllegalArgumentException("");
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	int i = ((AbstractQueue_Sub1) this).anInt10712 * -1573335367;
	if (i >= ((AbstractQueue_Sub1) this).aClass318Array10711.length)
	    method16993((byte) 7);
	((AbstractQueue_Sub1) this).anInt10712 += -337848439;
	if (i == 0) {
	    ((AbstractQueue_Sub1) this).aClass318Array10711[0]
		= new Class318(object, 0);
	    ((AbstractQueue_Sub1) this).aMap10713.put
		(object, ((AbstractQueue_Sub1) this).aClass318Array10711[0]);
	} else {
	    ((AbstractQueue_Sub1) this).aClass318Array10711[i]
		= new Class318(object, i);
	    ((AbstractQueue_Sub1) this).aMap10713.put
		(object, ((AbstractQueue_Sub1) this).aClass318Array10711[i]);
	    method16974(i, 519699323);
	}
	return true;
    }
    
    void method16991(int i) {
	Class318 class318 = ((AbstractQueue_Sub1) this).aClass318Array10711[i];
	int i_14_;
	for (int i_15_
		 = -1573335367 * ((AbstractQueue_Sub1) this).anInt10712 >>> 1;
	     i < i_15_; i = i_14_) {
	    int i_16_ = (i << 1) + 1;
	    Class318 class318_17_
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_16_];
	    int i_18_ = (i << 1) + 2;
	    Class318 class318_19_
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_18_];
	    if (null != ((AbstractQueue_Sub1) this).aComparator10714) {
		if ((i_18_
		     < -1573335367 * ((AbstractQueue_Sub1) this).anInt10712)
		    && (((AbstractQueue_Sub1) this).aComparator10714.compare
			(((Class318) class318_17_).anObject4867,
			 ((Class318) class318_19_).anObject4867)) > 0)
		    i_14_ = i_18_;
		else
		    i_14_ = i_16_;
	    } else if ((i_18_
			< -1573335367 * ((AbstractQueue_Sub1) this).anInt10712)
		       && (((Comparable)
			    ((Class318) class318_17_).anObject4867)
			       .compareTo
			   (((Class318) class318_19_).anObject4867)) > 0)
		i_14_ = i_18_;
	    else
		i_14_ = i_16_;
	    if (null != ((AbstractQueue_Sub1) this).aComparator10714) {
		if ((((AbstractQueue_Sub1) this).aComparator10714.compare
		     (((Class318) class318).anObject4867,
		      ((Class318) (((AbstractQueue_Sub1) this)
				   .aClass318Array10711[i_14_])).anObject4867))
		    <= 0)
		    break;
	    } else if ((((Comparable) ((Class318) class318).anObject4867)
			    .compareTo
			(((Class318) (((AbstractQueue_Sub1) this)
				      .aClass318Array10711[i_14_]))
			 .anObject4867))
		       <= 0)
		break;
	    ((AbstractQueue_Sub1) this).aClass318Array10711[i]
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_14_];
	    ((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
		.anInt4866
		= i * -32922635;
	}
	((AbstractQueue_Sub1) this).aClass318Array10711[i] = class318;
	((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
	    .anInt4866
	    = i * -32922635;
    }
    
    void method16992(int i) {
	Class318 class318 = ((AbstractQueue_Sub1) this).aClass318Array10711[i];
	int i_20_;
	for (int i_21_
		 = -1573335367 * ((AbstractQueue_Sub1) this).anInt10712 >>> 1;
	     i < i_21_; i = i_20_) {
	    int i_22_ = (i << 1) + 1;
	    Class318 class318_23_
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_22_];
	    int i_24_ = (i << 1) + 2;
	    Class318 class318_25_
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_24_];
	    if (null != ((AbstractQueue_Sub1) this).aComparator10714) {
		if ((i_24_
		     < -1573335367 * ((AbstractQueue_Sub1) this).anInt10712)
		    && (((AbstractQueue_Sub1) this).aComparator10714.compare
			(((Class318) class318_23_).anObject4867,
			 ((Class318) class318_25_).anObject4867)) > 0)
		    i_20_ = i_24_;
		else
		    i_20_ = i_22_;
	    } else if ((i_24_
			< -1573335367 * ((AbstractQueue_Sub1) this).anInt10712)
		       && (((Comparable)
			    ((Class318) class318_23_).anObject4867)
			       .compareTo
			   (((Class318) class318_25_).anObject4867)) > 0)
		i_20_ = i_24_;
	    else
		i_20_ = i_22_;
	    if (null != ((AbstractQueue_Sub1) this).aComparator10714) {
		if ((((AbstractQueue_Sub1) this).aComparator10714.compare
		     (((Class318) class318).anObject4867,
		      ((Class318) (((AbstractQueue_Sub1) this)
				   .aClass318Array10711[i_20_])).anObject4867))
		    <= 0)
		    break;
	    } else if ((((Comparable) ((Class318) class318).anObject4867)
			    .compareTo
			(((Class318) (((AbstractQueue_Sub1) this)
				      .aClass318Array10711[i_20_]))
			 .anObject4867))
		       <= 0)
		break;
	    ((AbstractQueue_Sub1) this).aClass318Array10711[i]
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_20_];
	    ((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
		.anInt4866
		= i * -32922635;
	}
	((AbstractQueue_Sub1) this).aClass318Array10711[i] = class318;
	((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
	    .anInt4866
	    = i * -32922635;
    }
    
    void method16993(byte i) {
	int i_26_ = 1 + (((AbstractQueue_Sub1) this).aClass318Array10711.length
			 << 1);
	((AbstractQueue_Sub1) this).aClass318Array10711
	    = ((Class318[])
	       Arrays.copyOf(((AbstractQueue_Sub1) this).aClass318Array10711,
			     i_26_));
    }
    
    public Object poll() {
	if (0 == ((AbstractQueue_Sub1) this).anInt10712 * -1573335367)
	    return null;
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	Object object
	    = (((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[0])
	       .anObject4867);
	((AbstractQueue_Sub1) this).aMap10713.remove(object);
	((AbstractQueue_Sub1) this).anInt10712 -= -337848439;
	if (0 == ((AbstractQueue_Sub1) this).anInt10712 * -1573335367)
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[((AbstractQueue_Sub1) this).anInt10712 * -1573335367]
		= null;
	else {
	    ((AbstractQueue_Sub1) this).aClass318Array10711[0]
		= (((AbstractQueue_Sub1) this).aClass318Array10711
		   [((AbstractQueue_Sub1) this).anInt10712 * -1573335367]);
	    ((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[0])
		.anInt4866
		= 0;
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[-1573335367 * ((AbstractQueue_Sub1) this).anInt10712]
		= null;
	    method16995(0, (byte) 27);
	}
	return object;
    }
    
    void method16994() {
	int i = 1 + (((AbstractQueue_Sub1) this).aClass318Array10711.length
		     << 1);
	((AbstractQueue_Sub1) this).aClass318Array10711
	    = ((Class318[])
	       Arrays.copyOf(((AbstractQueue_Sub1) this).aClass318Array10711,
			     i));
    }
    
    void method16995(int i, byte i_27_) {
	Class318 class318 = ((AbstractQueue_Sub1) this).aClass318Array10711[i];
	int i_28_;
	for (int i_29_
		 = -1573335367 * ((AbstractQueue_Sub1) this).anInt10712 >>> 1;
	     i < i_29_; i = i_28_) {
	    int i_30_ = (i << 1) + 1;
	    Class318 class318_31_
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_30_];
	    int i_32_ = (i << 1) + 2;
	    Class318 class318_33_
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_32_];
	    if (null != ((AbstractQueue_Sub1) this).aComparator10714) {
		if ((i_32_
		     < -1573335367 * ((AbstractQueue_Sub1) this).anInt10712)
		    && (((AbstractQueue_Sub1) this).aComparator10714.compare
			(((Class318) class318_31_).anObject4867,
			 ((Class318) class318_33_).anObject4867)) > 0)
		    i_28_ = i_32_;
		else
		    i_28_ = i_30_;
	    } else if ((i_32_
			< -1573335367 * ((AbstractQueue_Sub1) this).anInt10712)
		       && (((Comparable)
			    ((Class318) class318_31_).anObject4867)
			       .compareTo
			   (((Class318) class318_33_).anObject4867)) > 0)
		i_28_ = i_32_;
	    else
		i_28_ = i_30_;
	    if (null != ((AbstractQueue_Sub1) this).aComparator10714) {
		if ((((AbstractQueue_Sub1) this).aComparator10714.compare
		     (((Class318) class318).anObject4867,
		      ((Class318) (((AbstractQueue_Sub1) this)
				   .aClass318Array10711[i_28_])).anObject4867))
		    <= 0)
		    break;
	    } else if ((((Comparable) ((Class318) class318).anObject4867)
			    .compareTo
			(((Class318) (((AbstractQueue_Sub1) this)
				      .aClass318Array10711[i_28_]))
			 .anObject4867))
		       <= 0)
		break;
	    ((AbstractQueue_Sub1) this).aClass318Array10711[i]
		= ((AbstractQueue_Sub1) this).aClass318Array10711[i_28_];
	    ((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
		.anInt4866
		= i * -32922635;
	}
	((AbstractQueue_Sub1) this).aClass318Array10711[i] = class318;
	((Class318) ((AbstractQueue_Sub1) this).aClass318Array10711[i])
	    .anInt4866
	    = i * -32922635;
    }
    
    public Iterator method16996() {
	return new Class327(this);
    }
    
    public boolean method16997(Object object) {
	Class318 class318
	    = (Class318) ((AbstractQueue_Sub1) this).aMap10713.remove(object);
	if (null == class318)
	    return false;
	((AbstractQueue_Sub1) this).anInt10715 += -1459081295;
	((AbstractQueue_Sub1) this).anInt10712 -= -337848439;
	if (-1573335367 * ((AbstractQueue_Sub1) this).anInt10712
	    == -1186221987 * ((Class318) class318).anInt4866) {
	    ((AbstractQueue_Sub1) this).aClass318Array10711
		[((AbstractQueue_Sub1) this).anInt10712 * -1573335367]
		= null;
	    return true;
	}
	Class318 class318_34_
	    = (((AbstractQueue_Sub1) this).aClass318Array10711
	       [((AbstractQueue_Sub1) this).anInt10712 * -1573335367]);
	((AbstractQueue_Sub1) this).aClass318Array10711
	    [-1573335367 * ((AbstractQueue_Sub1) this).anInt10712]
	    = null;
	((AbstractQueue_Sub1) this).aClass318Array10711
	    [-1186221987 * ((Class318) class318).anInt4866]
	    = class318_34_;
	((Class318) (((AbstractQueue_Sub1) this).aClass318Array10711
		     [-1186221987 * ((Class318) class318).anInt4866]))
	    .anInt4866
	    = 1 * ((Class318) class318).anInt4866;
	method16995(-1186221987 * ((Class318) class318).anInt4866, (byte) 27);
	if (class318_34_ == (((AbstractQueue_Sub1) this).aClass318Array10711
			     [-1186221987 * ((Class318) class318).anInt4866]))
	    method16974(((Class318) class318).anInt4866 * -1186221987,
			519699323);
	return true;
    }
    
    public int method16998() {
	return -1573335367 * ((AbstractQueue_Sub1) this).anInt10712;
    }
}
