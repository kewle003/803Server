/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;

class Class170 implements Runnable
{
    Class393_Sub1 this$0;
    
    public void method3680() {
	try {
	    while (!((Class393_Sub1) ((Class170) this).this$0).aBool10205) {
		HashMap hashmap
		    = ((Class170) this).this$0.method16514(-1086316066);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4531((byte) 0);
		    }
		}
		Class380_Sub2.method16722(50L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -1500034602);
	}
    }
    
    public void method3681() {
	try {
	    while (!((Class393_Sub1) ((Class170) this).this$0).aBool10205) {
		HashMap hashmap
		    = ((Class170) this).this$0.method16514(765265422);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4531((byte) 0);
		    }
		}
		Class380_Sub2.method16722(50L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, 323408840);
	}
    }
    
    public void method3682() {
	try {
	    while (!((Class393_Sub1) ((Class170) this).this$0).aBool10205) {
		HashMap hashmap
		    = ((Class170) this).this$0.method16514(1794350582);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4531((byte) 0);
		    }
		}
		Class380_Sub2.method16722(50L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -1956584704);
	}
    }
    
    public void run() {
	try {
	    while (!((Class393_Sub1) ((Class170) this).this$0).aBool10205) {
		HashMap hashmap
		    = ((Class170) this).this$0.method16514(1749159317);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4531((byte) 0);
		    }
		}
		Class380_Sub2.method16722(50L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -2063405108);
	}
    }
    
    public void method3683() {
	try {
	    while (!((Class393_Sub1) ((Class170) this).this$0).aBool10205) {
		HashMap hashmap
		    = ((Class170) this).this$0.method16514(1033673494);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4531((byte) 0);
		    }
		}
		Class380_Sub2.method16722(50L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -501289229);
	}
    }
    
    Class170(Class393_Sub1 class393_sub1) {
	((Class170) this).this$0 = class393_sub1;
    }
    
    static final void method3684(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
    }
    
    public static void method3685(Class493 class493, byte i) {
	if (Class388.aClass388_5718 == ((Class493) class493).aClass388_6517)
	    Class483.aClass393_6461 = new Class393_Sub2(class493);
	else if (Class388.aClass388_5717
		 == ((Class493) class493).aClass388_6517)
	    Class483.aClass393_6461 = new Class393_Sub1(class493);
	else
	    throw new RuntimeException();
    }
    
    static final void method3686(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (2 == -2020075851 * client.friendListStage
	    && i_0_ < 1557840217 * client.friendListSize)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= client.friendList[i_0_].note;
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
    }
}
