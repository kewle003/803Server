/* Class416 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class416 implements Interface46
{
    Interface27 anInterface27_6010;
    Map<Integer, Class254> aMap6011;
    public static Class470 aClass470_6012;
    
    public void method338() {
	if (null != aMap6011)
	    aMap6011.clear();
    }
    
    public int method343(int i, int i_0_) {
	if (aMap6011 != null) {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 != null)
		return ((Integer) class254.value).intValue();
	}
	return ((Integer)
		anInterface27_6010.getDefaultValue(i, (byte) 1))
		   .intValue();
    }
    
    public void method350() {
	if (null != aMap6011)
	    aMap6011.clear();
    }
    
    public long method331(int i, int i_1_) {
	if (aMap6011 != null) {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 != null)
		return ((Long) class254.value).longValue();
	}
	return ((Long)
		anInterface27_6010.getDefaultValue(i, (byte) 1))
		   .longValue();
    }
    
    public void method341(int i, long l) {
	if (null == aMap6011) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i, Long.valueOf(l)));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (null == class254)
		aMap6011
		    .put(Integer.valueOf(i), new Class254(i, Long.valueOf(l)));
	    else
		class254.value = Long.valueOf(l);
	}
    }
    
    public Object method344(int i, int i_2_) {
	if (aMap6011 != null) {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 != null)
		return class254.value;
	}
	return anInterface27_6010.getDefaultValue(i, (byte) 1);
    }
    
    public void method335(int i, Object object, byte i_3_) {
		if (aMap6011 == null) {
		    aMap6011 = new HashMap<Integer, Class254>();
		    aMap6011.put(Integer.valueOf(i), new Class254(i, object));
		} else {
		    Class254 class254 = ((Class254) aMap6011.get(Integer.valueOf(i)));
		    if (null == class254) {
		    	aMap6011.put(Integer.valueOf(i), new Class254(i, object));
		    } else {
		    	class254.value = object;
		    }
		}
    }
    
    public void method195(int i) {
	if (null != aMap6011)
	    aMap6011.clear();
    }
    
    public void method334(int i, byte i_4_) {
	if (aMap6011 != null)
	    aMap6011.remove(Integer.valueOf(i));
    }
    
    public void method356(int i, int i_5_) {
	if (aMap6011 == null) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i,
							Integer
							    .valueOf(i_5_)));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 == null)
		aMap6011.put
		    (Integer.valueOf(i),
		     new Class254(i, Integer.valueOf(i_5_)));
	    else
		class254.value = Integer.valueOf(i_5_);
	}
    }
    
    public Iterator<?> method7489() {
	if (aMap6011 == null)
	    return Collections.emptyList().iterator();
	return aMap6011.values().iterator();
    }
    
    public Iterator iterator() {
		if (aMap6011 == null) {
		    return Collections.emptyList().iterator();
		}
		return aMap6011.values().iterator();
    }
    
    public int method336(int i) {
	if (aMap6011 != null) {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 != null)
		return ((Integer) class254.value).intValue();
	}
	return ((Integer)
		anInterface27_6010.getDefaultValue(i, (byte) 1))
		   .intValue();
    }
    
    public int method200(int i) {
	if (aMap6011 != null) {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 != null)
		return ((Integer) class254.value).intValue();
	}
	return ((Integer)
		anInterface27_6010.getDefaultValue(i, (byte) 1))
		   .intValue();
    }
    
    public void method337(int i, int i_6_) {
	if (aMap6011 == null) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i,
							Integer
							    .valueOf(i_6_)));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 == null)
		aMap6011.put
		    (Integer.valueOf(i),
		     new Class254(i, Integer.valueOf(i_6_)));
	    else
		class254.value = Integer.valueOf(i_6_);
	}
    }
    
    public void method346(int i, long l) {
	if (null == aMap6011) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i, Long.valueOf(l)));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (null == class254)
		aMap6011
		    .put(Integer.valueOf(i), new Class254(i, Long.valueOf(l)));
	    else
		class254.value = Long.valueOf(l);
	}
    }
    
    public void method339(int i, int i_7_) {
	if (aMap6011 == null) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i,
							Integer
							    .valueOf(i_7_)));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 == null)
		aMap6011.put
		    (Integer.valueOf(i),
		     new Class254(i, Integer.valueOf(i_7_)));
	    else
		class254.value = Integer.valueOf(i_7_);
	}
    }
    
    public void method340(int i, long l) {
	if (null == aMap6011) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i, Long.valueOf(l)));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (null == class254)
		aMap6011
		    .put(Integer.valueOf(i), new Class254(i, Long.valueOf(l)));
	    else
		class254.value = Long.valueOf(l);
	}
    }
    
    public Object method354(int i) {
	if (aMap6011 != null) {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 != null)
		return class254.value;
	}
	return anInterface27_6010.getDefaultValue(i, (byte) 1);
    }
    
    public Object method332(int i) {
	if (aMap6011 != null) {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 != null)
		return class254.value;
	}
	return anInterface27_6010.getDefaultValue(i, (byte) 1);
    }
    
    public Iterator<?> method7490() {
		if (aMap6011 == null)
		    return Collections.emptyList().iterator();
		return aMap6011.values().iterator();
    }
    
    public void method342(int i, long l) {
	if (null == aMap6011) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i, Long.valueOf(l)));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (null == class254)
		aMap6011
		    .put(Integer.valueOf(i), new Class254(i, Long.valueOf(l)));
	    else
		class254.value = Long.valueOf(l);
	}
    }
    
    public Object method345(int i) {
	if (aMap6011 != null) {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 != null)
		return class254.value;
	}
	return anInterface27_6010.getDefaultValue(i, (byte) 1);
    }
    
    public Object method352(int i) {
	if (aMap6011 != null) {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 != null)
		return class254.value;
	}
	return anInterface27_6010.getDefaultValue(i, (byte) 1);
    }
    
    public void method347(int i, Object object) {
	if (aMap6011 == null) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i, object));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (null == class254)
		aMap6011.put(Integer.valueOf(i),
					       new Class254(i, object));
	    else
		class254.value = object;
	}
    }
    
    public void method355(int i, Object object) {
	if (aMap6011 == null) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i, object));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (null == class254)
		aMap6011.put(Integer.valueOf(i),
					       new Class254(i, object));
	    else
		class254.value = object;
	}
    }
    
    public void method349(int i, Object object) {
	if (aMap6011 == null) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i, object));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (null == class254)
		aMap6011.put(Integer.valueOf(i),
					       new Class254(i, object));
	    else
		class254.value = object;
	}
    }
    
    public void method330(int i, int i_8_, int i_9_) {
	if (aMap6011 == null) {
	    aMap6011 = new HashMap<Integer, Class254>();
	    aMap6011.put(Integer.valueOf(i),
					   new Class254(i,
							Integer
							    .valueOf(i_8_)));
	} else {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 == null)
		aMap6011.put
		    (Integer.valueOf(i),
		     new Class254(i, Integer.valueOf(i_8_)));
	    else
		class254.value = Integer.valueOf(i_8_);
	}
    }
    
    public void method351() {
	if (null != aMap6011)
	    aMap6011.clear();
    }
    
    public void method353(int i) {
	if (aMap6011 != null)
	    aMap6011.remove(Integer.valueOf(i));
    }
    
    public Class416(Interface27 interface27) {
	anInterface27_6010 = interface27;
    }
    
    public void method329(int i) {
	if (aMap6011 != null)
	    aMap6011.remove(Integer.valueOf(i));
    }
    
    public void method333(int i) {
	if (aMap6011 != null)
	    aMap6011.remove(Integer.valueOf(i));
    }
    
    public void method348(int i) {
	if (aMap6011 != null)
	    aMap6011.remove(Integer.valueOf(i));
    }
    
    public void method357(int i) {
	if (aMap6011 != null)
	    aMap6011.remove(Integer.valueOf(i));
    }
    
    public long method358(int i) {
	if (aMap6011 != null) {
	    Class254 class254
		= ((Class254)
		   aMap6011.get(Integer.valueOf(i)));
	    if (class254 != null)
		return ((Long) class254.value).longValue();
	}
	return ((Long)
		anInterface27_6010.getDefaultValue(i, (byte) 1))
		   .longValue();
    }
    
    public static void method7491(int i, int i_10_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(15, (long) i);
	class241_sub39_sub13.method17278((byte) -19);
    }
}
