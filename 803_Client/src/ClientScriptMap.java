/* Class406 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ClientScriptMap
{
    public char aChar5898;
    public char type;//aChar5899
    String defaultstr = "null";//aString5900
    int count = 0;//anInt5901
    Map<Integer, Serializable> valueMap;//aMap5902
    Object[] valueArray;//anObjectArray5903
    HashMap aHashMap5904;
    int anInt5905;
    
    public int[] method7248(Object object, int i) {
	if (1744664043 * count == 0)
	    return null;
	if (aHashMap5904 == null)
	    method7257((byte) 127);
	return (int[]) aHashMap5904.get(object);
    }
    
    public String method7249(int i) {
	Object object = getValue(i, -2038603664);
	if (object == null) {
	    return defaultstr;
	}
	return (String) object;
    }
    
    Object method7250(int i) {
	if (valueArray != null) {
	    if (i < 0 || i >= valueArray.length)
		return null;
	    return valueArray[i];
	}
	if (null != valueMap)
	    return valueMap.get(new Integer(i));
	return null;
    }
    
    public int[] method7251(Object object) {
	if (1744664043 * count == 0)
	    return null;
	if (aHashMap5904 == null)
	    method7257((byte) 87);
	return (int[]) aHashMap5904.get(object);
    }
    
    public String getStringValue/*method7252*/(int key, int i_0_) {
		Object object = getValue(key, -2119852881);
		if (object == null) {
		    return defaultstr;
		}
		return (String) object;
    }
    
    Object getValue/*method7253*/(int key, int i_1_) {
		if (valueArray != null) {
		    if (key < 0 || key >= valueArray.length) {
		    	return null;
		    }
		    return valueArray[key];
		}
		if (null != valueMap) {
		    return valueMap.get(new Integer(key));
		}
		return null;
    }
    
    public boolean method7254(Object object, int i) {
	if (0 == count * 1744664043)
	    return false;
	if (aHashMap5904 == null)
	    method7257((byte) 117);
	return aHashMap5904.containsKey(object);
    }
    
    void method7255() {
	HashMap<Object, List> hashmap = new HashMap<Object, List>();
	if (valueArray != null) {
	    for (int i = 0; i < valueArray.length;
		 i++) {
		if (null != valueArray[i]) {
		    Object object = valueArray[i];
		    List<Integer> list = (List) hashmap.get(object);
		    if (list == null) {
				list = new LinkedList<Integer>();
				hashmap.put(object, list);
		    }
		    list.add(new Integer(i));
		}
	    }
	} else if (null != valueMap) {
	    Iterator iterator = valueMap.entrySet().iterator();
	    while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			Object object = entry.getValue();
			List list = (List) hashmap.get(object);
			if (list == null) {
			    list = new LinkedList();
			    hashmap.put(object, list);
			}
			list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap5904 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i = 0;
	    Iterator iterator_2_ = list.iterator();
	    while (iterator_2_.hasNext()) {
		Integer integer = (Integer) iterator_2_.next();
		is[i++] = integer.intValue();
	    }
	    if (valueArray == null)
		Arrays.sort(is);
	    aHashMap5904.put(entry.getKey(), is);
	}
    }
    
    public int method7256(int i) {
	return count * 1744664043;
    }
    
    void method7257(byte i) {
	HashMap hashmap = new HashMap();
	if (valueArray != null) {
	    for (int i_3_ = 0;
		 i_3_ < valueArray.length; i_3_++) {
		if (null != valueArray[i_3_]) {
		    Object object = valueArray[i_3_];
		    List list = (List) hashmap.get(object);
		    if (list == null) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i_3_));
		}
	    }
	} else if (null != valueMap) {
	    Iterator iterator
		= valueMap.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (list == null) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap5904 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i_4_ = 0;
	    Iterator iterator_5_ = list.iterator();
	    while (iterator_5_.hasNext()) {
		Integer integer = (Integer) iterator_5_.next();
		is[i_4_++] = integer.intValue();
	    }
	    if (valueArray == null)
		Arrays.sort(is);
	    aHashMap5904.put(entry.getKey(), is);
	}
    }
    
    ClientScriptMap() {
    	/* empty */
    }
    
    void method7258(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 35);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, -561408397);
	}
    }
    
    void method7259(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    type
		= Class80.method1809(class241_sub3.getByte(881838218),
				     1862549031);
	else if (i == 2)
	    aChar5898
		= Class80.method1809(class241_sub3.getByte(1002355253),
				     474577996);
	else if (3 == i)
	    defaultstr
		= class241_sub3.readString(-1594297390);
	else if (i == 4)
	    anInt5905
		= class241_sub3.readInt((byte) 7) * 347924541;
	else if (i == 5 || i == 6) {
	    count
		= class241_sub3.readUnsignedShort(1162222719) * 1895566019;
	    valueMap
		= new HashMap(count * 1744664043);
	    for (int i_6_ = 0; i_6_ < count * 1744664043;
		 i_6_++) {
		int i_7_ = class241_sub3.readInt((byte) 23);
		java.io.Serializable serializable;
		if (i == 5)
		    serializable = class241_sub3.readString(1481239523);
		else
		    serializable
			= new Integer(class241_sub3.readInt((byte) 99));
		valueMap.put(new Integer(i_7_),
					       serializable);
	    }
	} else if (i == 7 || i == 8) {
	    int i_8_ = class241_sub3.readUnsignedShort(1162222719);
	    count
		= class241_sub3.readUnsignedShort(1162222719) * 1895566019;
	    valueArray = new Object[i_8_];
	    for (int i_9_ = 0; i_9_ < count * 1744664043;
		 i_9_++) {
		int i_10_ = class241_sub3.readUnsignedShort(1162222719);
		if (i == 7)
		    valueArray[i_10_]
			= class241_sub3.readString(-682768669);
		else
		    valueArray[i_10_]
			= new Integer(class241_sub3.readInt((byte) 105));
	    }
	}
    }
    
    void method7260(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    type
		= Class80.method1809(class241_sub3.getByte(-563101306),
				     715153592);
	else if (i == 2)
	    aChar5898
		= Class80.method1809(class241_sub3.getByte(595884036),
				     -326263795);
	else if (3 == i)
	    defaultstr
		= class241_sub3.readString(-1783662195);
	else if (i == 4)
	    anInt5905
		= class241_sub3.readInt((byte) 86) * 347924541;
	else if (i == 5 || i == 6) {
	    count
		= class241_sub3.readUnsignedShort(1162222719) * 1895566019;
	    valueMap
		= new HashMap(count * 1744664043);
	    for (int i_11_ = 0;
		 i_11_ < count * 1744664043; i_11_++) {
		int i_12_ = class241_sub3.readInt((byte) 46);
		java.io.Serializable serializable;
		if (i == 5)
		    serializable = class241_sub3.readString(1113950077);
		else
		    serializable
			= new Integer(class241_sub3.readInt((byte) 70));
		valueMap.put(new Integer(i_12_),
					       serializable);
	    }
	} else if (i == 7 || i == 8) {
	    int i_13_ = class241_sub3.readUnsignedShort(1162222719);
	    count
		= class241_sub3.readUnsignedShort(1162222719) * 1895566019;
	    valueArray = new Object[i_13_];
	    for (int i_14_ = 0;
		 i_14_ < count * 1744664043; i_14_++) {
		int i_15_ = class241_sub3.readUnsignedShort(1162222719);
		if (i == 7)
		    valueArray[i_15_]
			= class241_sub3.readString(50769149);
		else
		    valueArray[i_15_]
			= new Integer(class241_sub3.readInt((byte) 26));
	    }
	}
    }
    
    void method7261(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    type
		= Class80.method1809(class241_sub3.getByte(-851498483),
				     -1719164181);
	else if (i == 2)
	    aChar5898 = Class80.method1809(class241_sub3.getByte(92067111),
					   -1243847826);
	else if (3 == i)
	    defaultstr
		= class241_sub3.readString(-707406799);
	else if (i == 4)
	    anInt5905
		= class241_sub3.readInt((byte) 95) * 347924541;
	else if (i == 5 || i == 6) {
	    count
		= class241_sub3.readUnsignedShort(1162222719) * 1895566019;
	    valueMap
		= new HashMap(count * 1744664043);
	    for (int i_16_ = 0;
		 i_16_ < count * 1744664043; i_16_++) {
		int i_17_ = class241_sub3.readInt((byte) 14);
		java.io.Serializable serializable;
		if (i == 5)
		    serializable = class241_sub3.readString(-1452460106);
		else
		    serializable
			= new Integer(class241_sub3.readInt((byte) 88));
		valueMap.put(new Integer(i_17_),
					       serializable);
	    }
	} else if (i == 7 || i == 8) {
	    int i_18_ = class241_sub3.readUnsignedShort(1162222719);
	    count
		= class241_sub3.readUnsignedShort(1162222719) * 1895566019;
	    valueArray = new Object[i_18_];
	    for (int i_19_ = 0;
		 i_19_ < count * 1744664043; i_19_++) {
		int i_20_ = class241_sub3.readUnsignedShort(1162222719);
		if (i == 7)
		    valueArray[i_20_]
			= class241_sub3.readString(-973491764);
		else
		    valueArray[i_20_]
			= new Integer(class241_sub3.readInt((byte) 24));
	    }
	}
    }
    
    public int method7262(int i) {
	Object object = getValue(i, -2053093190);
	if (object == null)
	    return anInt5905 * -110039275;
	return ((Integer) object).intValue();
    }
    
    public int method7263(int i) {
	Object object = getValue(i, -2105782646);
	if (object == null)
	    return anInt5905 * -110039275;
	return ((Integer) object).intValue();
    }
    
    void decode/*method7264*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 50);
		    if (opcode == 0) {
		    	break;
		    }
		    decode(buffer, opcode, -309542047);
		}
    }
    
    public int method7265(int i) {
	Object object = getValue(i, -2039721706);
	if (object == null)
	    return anInt5905 * -110039275;
	return ((Integer) object).intValue();
    }
    
    public boolean method7266(Object object) {
	if (0 == count * 1744664043)
	    return false;
	if (aHashMap5904 == null)
	    method7257((byte) 89);
	return aHashMap5904.containsKey(object);
    }
    
    public String method7267(int i) {
	Object object = getValue(i, -2112393593);
	if (object == null)
	    return defaultstr;
	return (String) object;
    }
    
    Object method7268(int i) {
	if (valueArray != null) {
	    if (i < 0 || i >= valueArray.length)
		return null;
	    return valueArray[i];
	}
	if (null != valueMap)
	    return valueMap.get(new Integer(i));
	return null;
    }
    
    Object method7269(int i) {
	if (valueArray != null) {
	    if (i < 0 || i >= valueArray.length)
		return null;
	    return valueArray[i];
	}
	if (null != valueMap)
	    return valueMap.get(new Integer(i));
	return null;
    }
    
    public int method7270(int i) {
	Object object = getValue(i, -2123259779);
	if (object == null)
	    return anInt5905 * -110039275;
	return ((Integer) object).intValue();
    }
    
    public int getIntValue/*method7271*/(int key, int i_22_) {
		Object object = getValue(key, -2098641721);
		if (object == null) {
		    return anInt5905 * -110039275;
		}
		return ((Integer) object).intValue();
    }
    
    public boolean method7272(Object object) {
	if (0 == count * 1744664043)
	    return false;
	if (aHashMap5904 == null)
	    method7257((byte) 119);
	return aHashMap5904.containsKey(object);
    }
    
    public boolean method7273(Object object) {
	if (0 == count * 1744664043)
	    return false;
	if (aHashMap5904 == null)
	    method7257((byte) 123);
	return aHashMap5904.containsKey(object);
    }
    
    public boolean method7274(Object object) {
	if (0 == count * 1744664043)
	    return false;
	if (aHashMap5904 == null)
	    method7257((byte) 62);
	return aHashMap5904.containsKey(object);
    }
    
    public int[] method7275(Object object) {
	if (1744664043 * count == 0)
	    return null;
	if (aHashMap5904 == null)
	    method7257((byte) 7);
	return (int[]) aHashMap5904.get(object);
    }
    
    public int[] method7276(Object object) {
	if (1744664043 * count == 0)
	    return null;
	if (aHashMap5904 == null)
	    method7257((byte) 18);
	return (int[]) aHashMap5904.get(object);
    }
    
    void method7277(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 29);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, 1857023251);
	}
    }
    
    public int method7278() {
	return count * 1744664043;
    }
    
    public int method7279() {
	return count * 1744664043;
    }
    
    void decode/*method7280*/(RSByteBuffer buffer, int i, int i_23_) {
		if (i == 1) {
		    type = Class80.method1809(buffer.getByte(-1274685063), -533075597);
		} else if (i == 2) {
		    aChar5898 = Class80.method1809(buffer.getByte(1523404119), 653641657);
		} else if (3 == i) {
		    defaultstr = buffer.readString(-1223143424);
		} else if (i == 4) {
		    anInt5905 = buffer.readInt((byte) 104) * 347924541;
		} else if (i == 5 || i == 6) {
		    count = buffer.readUnsignedShort(1162222719) * 1895566019;
		    valueMap = new HashMap<Integer, Serializable>(count * 1744664043);
		    for (int index = 0; index < count * 1744664043; index++) {
				int key = buffer.readInt((byte) 127);
				java.io.Serializable serializable;
				if (i == 5) {
				    serializable = buffer.readString(-642016219);
				} else {
				    serializable = new Integer(buffer.readInt((byte) 12));
				}
				valueMap.put(new Integer(key), serializable);
		    }
		} else if (i == 7 || i == 8) {
		    int maxValue = buffer.readUnsignedShort(1162222719);
		    count = buffer.readUnsignedShort(1162222719) * 1895566019;
		    valueArray = new Object[maxValue];
		    for (int index = 0; index < count * 1744664043; index++) {
				int key = buffer.readUnsignedShort(1162222719);
				if (i == 7) {
				    valueArray[key] = buffer.readString(-1990144723);
				} else {
				    valueArray[key] = new Integer(buffer.readInt((byte) 108));
				}
		    }
		}
    }
    
    void method7281() {
	HashMap hashmap = new HashMap();
	if (valueArray != null) {
	    for (int i = 0; i < valueArray.length;
		 i++) {
		if (null != valueArray[i]) {
		    Object object = valueArray[i];
		    List list = (List) hashmap.get(object);
		    if (list == null) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i));
		}
	    }
	} else if (null != valueMap) {
	    Iterator iterator
		= valueMap.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (list == null) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap5904 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i = 0;
	    Iterator iterator_29_ = list.iterator();
	    while (iterator_29_.hasNext()) {
		Integer integer = (Integer) iterator_29_.next();
		is[i++] = integer.intValue();
	    }
	    if (valueArray == null)
		Arrays.sort(is);
	    aHashMap5904.put(entry.getKey(), is);
	}
    }
    
    void method7282() {
	HashMap hashmap = new HashMap();
	if (valueArray != null) {
	    for (int i = 0; i < valueArray.length;
		 i++) {
		if (null != valueArray[i]) {
		    Object object = valueArray[i];
		    List list = (List) hashmap.get(object);
		    if (list == null) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i));
		}
	    }
	} else if (null != valueMap) {
	    Iterator iterator
		= valueMap.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (list == null) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap5904 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i = 0;
	    Iterator iterator_30_ = list.iterator();
	    while (iterator_30_.hasNext()) {
		Integer integer = (Integer) iterator_30_.next();
		is[i++] = integer.intValue();
	    }
	    if (valueArray == null)
		Arrays.sort(is);
	    aHashMap5904.put(entry.getKey(), is);
	}
    }
    
    static final void setMouseOutEvent/*method7283*/(InterfaceComponent component, 
    		InterfaceDefinition iFace, ClientScriptData scriptData, int i) {
		String params = (String) 
				scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331];
		if (Class8.extractVarWatchKeys(params, scriptData, (byte) -51) != null) {
			params = params.substring(0, params.length() - 1);
		}
		component.onMouseOutScript
		    = Class299.extractCs2Params(params, scriptData, -1124046399);
		component.hasClientScript = true;
    }
    
    static final void method7284(int i, int i_31_, int i_32_, int i_33_,
				 Class536 class536, short i_34_) {
	if (i_32_ >= 1 && i_33_ >= 1
	    && i_32_ <= client.aClass238_8477.method4744(-1984886056) - 2
	    && i_33_ <= client.aClass238_8477.method4745(68361278) - 2) {
	    if (client.aClass238_8477.method4751(-576456403) != null) {
		Interface24 interface24
		    = client.aClass238_8477.method4759(-35878102)
			  .method16543(i, i_31_, i_32_, i_33_, -1265731864);
		if (interface24 != null) {
		    if (interface24 instanceof Class475_Sub1_Sub1_Sub2)
			((Class475_Sub1_Sub1_Sub2) interface24)
			    .method17762(class536, (byte) -63);
		    else if (interface24 instanceof Class475_Sub1_Sub4_Sub2)
			((Class475_Sub1_Sub4_Sub2) interface24)
			    .method17758(class536, -1064874128);
		    else if (interface24 instanceof Class475_Sub1_Sub3_Sub1)
			((Class475_Sub1_Sub3_Sub1) interface24)
			    .method17699(class536, (byte) -33);
		    else if (interface24 instanceof Class475_Sub1_Sub5_Sub1)
			((Class475_Sub1_Sub5_Sub1) interface24)
			    .method17718(class536, (byte) 0);
		}
	    }
	}
    }
    
    static final void decodePlayerUpdates/*method7285*/(RSBitBuffer buffer, int size,
				 int i_35_) {
		GPI.maskUpdateCount = 0;
		Class98.decodeLocationUpdates(buffer, 1810201569);
		//System.out.println("Post-location size: "+(buffer.pointer * 421967667));
		Class185.decodePlayerMasks(buffer, -691757210);
		//System.out.println("Post-masks size: "+(buffer.pointer * 421967667));
		if (size != buffer.pointer * 421967667) {
		    throw new RuntimeException(new StringBuilder()
		    	.append(buffer.pointer * 421967667)
				.append(" ").append(size).toString());
		}
    }
    
    static final void method7286(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, byte i) {
	class58.flipHorizontally
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	WorldType.refreshComponent(class58, 672982784);
    }
}
