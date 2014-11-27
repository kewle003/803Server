/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;

class Class177 implements Runnable
{
    Class393_Sub1 this$0;
    public static JS5 TEXTURES_ARCHIVE;//aClass210_2124s
    public static VarPlayerTypeListClient VAR_PLAYER_LIST;//aClass199_Sub2_Sub1_2125
    
    public void method3758() {
	try {
	    while (!((Class393_Sub1) ((Class177) this).this$0).aBool10205) {
		HashMap hashmap
		    = ((Class177) this).this$0.method16514(965437100);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4528((byte) 11);
		    }
		}
		Class380_Sub2.method16722(25L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -2084478528);
	}
    }
    
    public void run() {
	try {
	    while (!((Class393_Sub1) ((Class177) this).this$0).aBool10205) {
		HashMap hashmap
		    = ((Class177) this).this$0.method16514(884616251);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4528((byte) 95);
		    }
		}
		Class380_Sub2.method16722(25L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, 298354199);
	}
    }
    
    public void method3759() {
	try {
	    while (!((Class393_Sub1) ((Class177) this).this$0).aBool10205) {
		HashMap hashmap
		    = ((Class177) this).this$0.method16514(633349556);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4528((byte) 112);
		    }
		}
		Class380_Sub2.method16722(25L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -1567092558);
	}
    }
    
    public void method3760() {
	try {
	    while (!((Class393_Sub1) ((Class177) this).this$0).aBool10205) {
		HashMap hashmap
		    = ((Class177) this).this$0.method16514(-871883223);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4528((byte) 85);
		    }
		}
		Class380_Sub2.method16722(25L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -903128054);
	}
    }
    
    public void method3761() {
	try {
	    while (!((Class393_Sub1) ((Class177) this).this$0).aBool10205) {
		HashMap hashmap
		    = ((Class177) this).this$0.method16514(911557003);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4528((byte) 101);
		    }
		}
		Class380_Sub2.method16722(25L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -92504942);
	}
    }
    
    Class177(Class393_Sub1 class393_sub1) {
	((Class177) this).this$0 = class393_sub1;
    }
    
    static final void method3762(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864
		  .method14500(538386430) == 1 ? 1 : 0;
    }
}
