/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public class Class438
{
    static Map aMap6143 = new HashMap();
    
    public static Interface47 method7817(Class var_class, int i) {
	synchronized (aMap6143) {
	    Map map = (Map) aMap6143.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface47[] interface47s
		    = (Interface47[]) var_class.getEnumConstants();
		for (int i_0_ = 0; i_0_ < interface47s.length; i_0_++) {
		    Interface47 interface47 = interface47s[i_0_];
		    map.put(Integer.valueOf(interface47.getId((byte) 0)),
			    interface47);
		}
		aMap6143.put(var_class, map);
	    }
	    Interface47 interface47
		= (Interface47) map.get(Integer.valueOf(i));
	    return interface47;
	}
    }
    
    public static Interface47 method7818(Interface47[] interface47s, int i) {
	Interface47[] interface47s_1_ = interface47s;
	for (int i_2_ = 0; i_2_ < interface47s_1_.length; i_2_++) {
	    Interface47 interface47 = interface47s_1_[i_2_];
	    if (i == interface47.getId((byte) 0))
		return interface47;
	}
	return null;
    }
    
    Class438() throws Throwable {
	throw new Error();
    }
    
    public static Interface47 method7819(Interface47[] interface47s, int i) {
	Interface47[] interface47s_3_ = interface47s;
	for (int i_4_ = 0; i_4_ < interface47s_3_.length; i_4_++) {
	    Interface47 interface47 = interface47s_3_[i_4_];
	    if (i == interface47.getId((byte) 0))
		return interface47;
	}
	return null;
    }
    
    public static Interface47 method7820(Interface47[] interface47s, int i) {
	Interface47[] interface47s_5_ = interface47s;
	for (int i_6_ = 0; i_6_ < interface47s_5_.length; i_6_++) {
	    Interface47 interface47 = interface47s_5_[i_6_];
	    if (i == interface47.getId((byte) 0))
		return interface47;
	}
	return null;
    }
}
