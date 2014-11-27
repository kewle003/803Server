/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

import jaclib.ping.Ping;

public class Class463 implements Runnable
{
    Queue aQueue6285;
    Thread aThread6286;
    Object anObject6287 = new Object();
    public static VarBasicTypeListClient VAR_CLIENT_LIST;//aClass199_Sub2_Sub2_6288
    static int anInt6289;
    
    public Class463() {
	((Class463) this).aQueue6285 = new LinkedList();
	((Class463) this).aThread6286 = new Thread(this);
	((Class463) this).aThread6286.setDaemon(true);
	((Class463) this).aThread6286.start();
    }
    
    public Class468 method10661(String string, int i) {
	if (null == ((Class463) this).aThread6286)
	    throw new IllegalStateException("");
	if (string == null)
	    throw new IllegalArgumentException("");
	Class468 class468 = new Class468(string);
	method10663(class468, -134027957);
	return class468;
    }
    
    public void method10662(int i) {
	if (null != ((Class463) this).aThread6286) {
	    method10663(((Class463) this).anObject6287, -1255499536);
	    try {
		((Class463) this).aThread6286.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    ((Class463) this).aThread6286 = null;
	}
    }
    
    void method10663(Object object, int i) {
	synchronized (((Class463) this).aQueue6285) {
	    ((Class463) this).aQueue6285.add(object);
	    ((Class463) this).aQueue6285.notify();
	}
    }
    
    public Class468 method10664(String string) {
	if (null == ((Class463) this).aThread6286)
	    throw new IllegalStateException("");
	if (string == null)
	    throw new IllegalArgumentException("");
	Class468 class468 = new Class468(string);
	method10663(class468, -584797197);
	return class468;
    }
    
    public void method10665() {
	for (;;) {
	    Class468 class468;
	    synchronized (((Class463) this).aQueue6285) {
		Object object;
		for (object = ((Class463) this).aQueue6285.poll();
		     null == object;
		     object = ((Class463) this).aQueue6285.poll()) {
		    try {
			((Class463) this).aQueue6285.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (object == ((Class463) this).anObject6287)
		    break;
		class468 = (Class468) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName
			  (((Class468) class468).aString6334).getAddress();
		i = Ping.method956(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class468.anInt6335 = i * -878280651;
	}
    }
    
    public void method10666() {
	for (;;) {
	    Class468 class468;
	    synchronized (((Class463) this).aQueue6285) {
		Object object;
		for (object = ((Class463) this).aQueue6285.poll();
		     null == object;
		     object = ((Class463) this).aQueue6285.poll()) {
		    try {
			((Class463) this).aQueue6285.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (object == ((Class463) this).anObject6287)
		    break;
		class468 = (Class468) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName
			  (((Class468) class468).aString6334).getAddress();
		i = Ping.method956(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class468.anInt6335 = i * -878280651;
	}
    }
    
    public void method10667() {
	for (;;) {
	    Class468 class468;
	    synchronized (((Class463) this).aQueue6285) {
		Object object;
		for (object = ((Class463) this).aQueue6285.poll();
		     null == object;
		     object = ((Class463) this).aQueue6285.poll()) {
		    try {
			((Class463) this).aQueue6285.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (object == ((Class463) this).anObject6287)
		    break;
		class468 = (Class468) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName
			  (((Class468) class468).aString6334).getAddress();
		i = Ping.method956(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class468.anInt6335 = i * -878280651;
	}
    }
    
    public void run() {
	for (;;) {
	    Class468 class468;
	    synchronized (((Class463) this).aQueue6285) {
		Object object;
		for (object = ((Class463) this).aQueue6285.poll();
		     null == object;
		     object = ((Class463) this).aQueue6285.poll()) {
		    try {
			((Class463) this).aQueue6285.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (object == ((Class463) this).anObject6287)
		    break;
		class468 = (Class468) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName
			  (((Class468) class468).aString6334).getAddress();
		i = Ping.method956(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class468.anInt6335 = i * -878280651;
	}
    }
    
    public Class468 method10668(String string) {
	if (null == ((Class463) this).aThread6286)
	    throw new IllegalStateException("");
	if (string == null)
	    throw new IllegalArgumentException("");
	Class468 class468 = new Class468(string);
	method10663(class468, -954002486);
	return class468;
    }
    
    public Class468 method10669(String string) {
	if (null == ((Class463) this).aThread6286)
	    throw new IllegalStateException("");
	if (string == null)
	    throw new IllegalArgumentException("");
	Class468 class468 = new Class468(string);
	method10663(class468, -1587012329);
	return class468;
    }
    
    public void method10670() {
	if (null != ((Class463) this).aThread6286) {
	    method10663(((Class463) this).anObject6287, -475167671);
	    try {
		((Class463) this).aThread6286.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    ((Class463) this).aThread6286 = null;
	}
    }
    
    public void method10671() {
	for (;;) {
	    Class468 class468;
	    synchronized (((Class463) this).aQueue6285) {
		Object object;
		for (object = ((Class463) this).aQueue6285.poll();
		     null == object;
		     object = ((Class463) this).aQueue6285.poll()) {
		    try {
			((Class463) this).aQueue6285.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (object == ((Class463) this).anObject6287)
		    break;
		class468 = (Class468) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName
			  (((Class468) class468).aString6334).getAddress();
		i = Ping.method956(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class468.anInt6335 = i * -878280651;
	}
    }
    
    public void method10672() {
	if (null != ((Class463) this).aThread6286) {
	    method10663(((Class463) this).anObject6287, -2064283096);
	    try {
		((Class463) this).aThread6286.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    ((Class463) this).aThread6286 = null;
	}
    }
    
    void method10673(Object object) {
	synchronized (((Class463) this).aQueue6285) {
	    ((Class463) this).aQueue6285.add(object);
	    ((Class463) this).aQueue6285.notify();
	}
    }
    
    void method10674(Object object) {
	synchronized (((Class463) this).aQueue6285) {
	    ((Class463) this).aQueue6285.add(object);
	    ((Class463) this).aQueue6285.notify();
	}
    }
    
    static final void method10675(ClientScriptData class454, byte i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -2);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	Class64.method1627(class58, class35, class454, 1386354640);
    }
    
    public static boolean method10676(int i, int i_1_, int i_2_) {
	if (!Class16.aBool141)
	    return false;
	int i_3_ = i >> 16;
	int i_4_ = i & 0xffff;
	if (Class187.aClass35Array2203[i_3_] == null
	    || Class187.aClass35Array2203[i_3_].components[i_4_] == null)
	    return false;
	InterfaceComponent class58
	    = Class187.aClass35Array2203[i_3_].components[i_4_];
	if (i_1_ != -1 || 0 != class58.componentType * -1579470857) {
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			Class16.aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			Class16.aClass429_150.method7692(449931024))) {
		if (i_1_ == (((Class241_Sub39_Sub11) class241_sub39_sub11)
			     .anInt10873) * -510105715
		    && ((((Class241_Sub39_Sub11) class241_sub39_sub11)
			 .anInt10874) * 1841217923
			== class58.componentHash * 445907013)
		    && (58 == (((Class241_Sub39_Sub11) class241_sub39_sub11)
			       .anInt10879) * -142243581
			|| (1007
			    == (((Class241_Sub39_Sub11) class241_sub39_sub11)
				.anInt10879) * -142243581)
			|| (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .anInt10879) * -142243581 == 25
			|| (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .anInt10879) * -142243581 == 57
			|| 30 == (((Class241_Sub39_Sub11) class241_sub39_sub11)
				  .anInt10879) * -142243581))
		    return true;
	    }
	} else {
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			Class16.aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			Class16.aClass429_150.method7692(1235233342))) {
		if ((((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10879
		     * -142243581) == 58
		    || 1007 == (((Class241_Sub39_Sub11) class241_sub39_sub11)
				.anInt10879) * -142243581
		    || -142243581 * ((Class241_Sub39_Sub11)
				     class241_sub39_sub11).anInt10879 == 25
		    || 57 == (((Class241_Sub39_Sub11) class241_sub39_sub11)
			      .anInt10879) * -142243581
		    || 30 == -142243581 * ((Class241_Sub39_Sub11)
					   class241_sub39_sub11).anInt10879) {
		    for (InterfaceComponent class58_5_
			     = Js5ConfigGroup.getInterfaceComponent((((Class241_Sub39_Sub11)
						    class241_sub39_sub11)
						   .anInt10874) * 1841217923,
						  (byte) -62);
			 class58_5_ != null;
			 class58_5_
			     = LoadingScreenDef.method6489((Class187.aClass35Array2203
						    [(class58_5_.componentHash
						      * 445907013) >> 16]),
						   class58_5_, 750881102)) {
			if (445907013 * class58.componentHash
			    == class58_5_.componentHash * 445907013)
			    return true;
		    }
		}
	    }
	}
	return false;
    }
    
    static final void method10677(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
    }
    
    static final void method10678(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	class58.aBool868 = 1 == i_6_;
	WorldType.refreshComponent(class58, 433318437);
    }
    
    static final void processInScreenNPCs/*method10679*/(int i) {
		RSBitBuffer buffer = ((ServerConnection) client.aClass190_8340).inputBuffer;
		buffer.initBitAccess(1628510173);
		int localNpcCount = buffer.readBits(8, 467989923);
		if (localNpcCount < client.localNpcCount * -1837469873) {
		    for (int index = localNpcCount; index < -1837469873 * client.localNpcCount; index++) {
		    	client.anIntArray8338[(client.anInt8337 += 785860361) * 380401465 - 1]
		    		= client.localNpcIndicies[index];
		    }
		}
		if (localNpcCount > client.localNpcCount * -1837469873) {
		    throw new RuntimeException();
		}
		client.localNpcCount = 0;
		for (int index = 0; index < localNpcCount; index++) {
		    int npcIndex = client.localNpcIndicies[index];
		    NPC npc = ((NPC) (((ObjectNode) client.aClass407_8457.get((long) npcIndex)).objectValue));
		    int needsUpdate = buffer.readBits(1, 1566267940);
		    if (needsUpdate == 0) {
				client.localNpcIndicies[(client.localNpcCount += 1541490607) * -1837469873 - 1] = npcIndex;
				npc.anInt11410 = client.anInt8455 * 949142241;
		    } else {
				int updateType = buffer.readBits(2, 843373587);
				if (0 == updateType) {//No movement
				    client.localNpcIndicies[(client.localNpcCount += 1541490607) * -1837469873 - 1] = npcIndex;
				    npc.anInt11410 = client.anInt8455 * 949142241;
				    client.npcMaskUpdates[(client.anInt8334 += 480969173) * 2038574973 - 1] = npcIndex;
				} else if (1 == updateType) {//Walk movement
				    client.localNpcIndicies[(client.localNpcCount += 1541490607) * -1837469873 - 1] = npcIndex;
				    npc.anInt11410 = 949142241 * client.anInt8455;
				    Class439 class439 = ((Class439) Class531.method11848(
				    		Class303.method5853(-282275125),
				    		buffer.readBits(3, 1028524453),
				    		-760118849));
				    npc.method18006(class439, Class448.aClass448_6186.aByte6187, -1149394010);
				    int hasUpdate = buffer.readBits(1, -983870174);
				    if (hasUpdate == 1) {
				    	client.npcMaskUpdates[(client.anInt8334 += 480969173) * 2038574973 - 1] = npcIndex;
				    }
				} else if (updateType == 2) {//Run movement
				    client.localNpcIndicies[(client.localNpcCount += 1541490607) * -1837469873 - 1] = npcIndex;
				    npc.anInt11410 = 949142241 * client.anInt8455;
				    if (buffer.readBits(1, 1598868895) == 1) {
						Class439 class439 = ((Class439) Class531.method11848(
								Class303.method5853(1805881075),
								buffer.readBits(3, 1366716344),
								-757045712));
						npc.method18006(class439, Class448.aClass448_6184.aByte6187, -1172140002);
						Class439 class439_14_ = ((Class439) Class531.method11848(
								Class303.method5853(1952530345),
								buffer.readBits(3, 1287763255),
								1313391300));
						npc.method18006(class439_14_, Class448.aClass448_6184.aByte6187, 2047736391);
				    } else {
						Class439 class439
						    = ((Class439)
						       (Class531.method11848
							(Class303.method5853(116030496),
									buffer.readBits(3, -486241724),
							 -2026829464)));
						npc.method18006(class439, Class448.aClass448_6185.aByte6187, -1906238387);
				    }
				    int hasUpdate = buffer.readBits(1, 701507072);
				    if (1 == hasUpdate) {
				    	client.npcMaskUpdates[(client.anInt8334 += 480969173) * 2038574973 - 1] = npcIndex;
				    }
				} else if (updateType == 3) {
				    client.anIntArray8338[(client.anInt8337 += 785860361) * 380401465 - 1] = npcIndex;
				}
		    }
		}
    }
}
