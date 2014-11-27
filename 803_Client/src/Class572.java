/* Class572 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

class Class572 implements Runnable
{
    Class393_Sub2 this$0;
    
    public void method12545() {
	try {
	    while (!((Class393_Sub2) ((Class572) this).this$0).aBool10261) {
		HashMap hashmap
		    = ((Class572) this).this$0.method16579(287613289);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4528((byte) 2);
		    }
		}
		Class380_Sub2.method16722(10L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -1353268378);
	    exception.printStackTrace();
	}
    }
    
    public void run() {
	try {
	    while (!((Class393_Sub2) ((Class572) this).this$0).aBool10261) {
		HashMap hashmap
		    = ((Class572) this).this$0.method16579(287613289);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4528((byte) 120);
		    }
		}
		Class380_Sub2.method16722(10L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -284327284);
	    exception.printStackTrace();
	}
    }
    
    Class572(Class393_Sub2 class393_sub2) {
	((Class572) this).this$0 = class393_sub2;
    }
    
    public void method12546() {
	try {
	    while (!((Class393_Sub2) ((Class572) this).this$0).aBool10261) {
		HashMap hashmap
		    = ((Class572) this).this$0.method16579(287613289);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4528((byte) 32);
		    }
		}
		Class380_Sub2.method16722(10L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -1843551810);
	    exception.printStackTrace();
	}
    }
    
    public void method12547() {
	try {
	    while (!((Class393_Sub2) ((Class572) this).this$0).aBool10261) {
		HashMap hashmap
		    = ((Class572) this).this$0.method16579(287613289);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4528((byte) 21);
		    }
		}
		Class380_Sub2.method16722(10L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -1245100764);
	    exception.printStackTrace();
	}
    }
    
    public void method12548() {
	try {
	    while (!((Class393_Sub2) ((Class572) this).this$0).aBool10261) {
		HashMap hashmap
		    = ((Class572) this).this$0.method16579(287613289);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class301 class301 = (Class301) iterator.next();
		    if (!class301.aBool4618) {
			Class225[] class225s
			    = (Class225[]) hashmap.get(class301);
			for (int i = 0; i < class225s.length; i++)
			    class225s[i].method4528((byte) 29);
		    }
		}
		Class380_Sub2.method16722(10L);
	    }
	} catch (Exception exception) {
	    VarType.method3770(null, exception, -788544895);
	    exception.printStackTrace();
	}
    }
    
    public static void method12549(boolean bool, int i) {
	Class402.soundManager.method1235(1858337380);
	if (Class120_Sub1.method15109(client.anInt8288 * 1766317249,
				      -246896658)) {
	    ServerConnection[] class190s = client.aClass190Array8397;
	    for (int i_0_ = 0; i_0_ < class190s.length; i_0_++) {
		ServerConnection class190 = class190s[i_0_];
		class190.anInt2262 += 1768708987;
		if (1352485811 * class190.anInt2262 < 50 && !bool)
		    return;
		class190.anInt2262 = 0;
		if (!class190.aBool2275
		    && class190.getIO(-1835460326) != null) {
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.PING_PACKET,
						     class190.packetCipher,
						     16711935);
		    class190.sendPacket(class241_sub27, -1676769239);
		    try {
			class190.method3894((byte) 100);
		    } catch (IOException ioexception) {
			class190.aBool2275 = true;
		    }
		}
	    }
	    Class402.soundManager.method1235(-710435034);
	}
    }
    
    static final int method12550(int i, int i_1_, int i_2_) {
	int i_3_ = (Class55.method1372(i - 1, i_1_ - 1, 1764733934)
		    + Class55.method1372(1 + i, i_1_ - 1, 1939506884)
		    + Class55.method1372(i - 1, i_1_ + 1, 1862143941)
		    + Class55.method1372(1 + i, 1 + i_1_, 2115185305));
	int i_4_ = (Class55.method1372(i - 1, i_1_, 2143109134)
		    + Class55.method1372(i + 1, i_1_, 1925333963)
		    + Class55.method1372(i, i_1_ - 1, 1860129742)
		    + Class55.method1372(i, 1 + i_1_, 2102232897));
	int i_5_ = Class55.method1372(i, i_1_, 2113304067);
	return i_3_ / 16 + i_4_ / 8 + i_5_ / 4;
    }
    
    static final void method12551(ClientScriptData class454, int i) {
	CharSequence charsequence
	    = ((CharSequence)
	       (((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer -= -1650705371) * -290357331
		  + 1)]));
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = Class582.method12774(charsequence, -2036143902);
    }
    
    static void method12552(int i, int i_6_, InterfaceComponent class58, int i_7_) {
	int i_8_ = i + class58.anInt850 * 439139681;
	int i_9_ = i_6_ + 15;
	if (client.aBool8449) {
	    int i_10_ = -256;
	    if (2016113751 * client.currentFpsRate < 20)
		i_10_ = -65536;
	    Class5.aClass96_26.method2112(new StringBuilder().append
					      ("Fps:").append
					      (client.currentFpsRate * 2016113751)
					      .append
					      (" (").append
					      (client.anInt7635 * -2022955371)
					      .append
					      (" ms)").toString(),
					  i_8_, i_9_, i_10_, -1, -1592501357);
	    i_9_ += 15;
	    Runtime runtime = Runtime.getRuntime();
	    long l = runtime.totalMemory() / 1024L;
	    long l_11_ = l - runtime.freeMemory() / 1024L;
	    int i_12_ = -256;
	    if (l_11_ > 262144L)
		i_12_ = -65536;
	    Class5.aClass96_26.method2112(new StringBuilder().append
					      ("Mem:").append
					      (l_11_).append
					      ("/").append
					      (l).append
					      ("k").toString(),
					  i_8_, i_9_, i_12_, -1, -1996148636);
	    i_9_ += 15;
	    long l_13_ = ((ServerConnection) client.aClass190_8340).aClass11_2276
			     .method582((byte) 23);
	    String string = "N/A";
	    if (l_13_ != -1L) {
		string = new StringBuilder().append(l_13_).append("ms")
			     .toString();
		if (l_13_ > 500L)
		    string
			= new StringBuilder().append
			      (Class338.method6112(16711680, 884546849)).append
			      (string).append
			      (Class338.method6112(16776960, 880248015))
			      .toString();
	    }
	    Class5.aClass96_26.method2112
		(new StringBuilder().append("Game: In:").append
		     (915471049 * ((ServerConnection) client.aClass190_8340).anInt2271)
		     .append
		     ("B/s ").append
		     ("Out:").append
		     (1339887889
		      * ((ServerConnection) client.aClass190_8340).anInt2270)
		     .append
		     ("B/s ").append
		     ("Ping:").append
		     (string).toString(),
		 i_8_, i_9_, -256, -1, -1866368630);
	    i_9_ += 15;
	    long l_14_ = ((ServerConnection) client.aClass190_8339).aClass11_2276
			     .method582((byte) 6);
	    String string_15_ = "N/A";
	    if (l_14_ != -1L) {
		string_15_ = new StringBuilder().append(l_14_).append("ms")
				 .toString();
		if (l_14_ > 500L)
		    string_15_
			= new StringBuilder().append
			      (Class338.method6112(16711680, 879514516)).append
			      (string_15_).append
			      (Class338.method6112(16776960, -1548211289))
			      .toString();
	    }
	    Class5.aClass96_26.method2112
		(new StringBuilder().append("Lobby: In:").append
		     (((ServerConnection) client.aClass190_8339).anInt2271 * 915471049)
		     .append
		     ("B/s ").append
		     ("Out:").append
		     (((ServerConnection) client.aClass190_8339).anInt2270
		      * 1339887889)
		     .append
		     ("B/s ").append
		     ("Ping:").append
		     (string_15_).toString(),
		 i_8_, i_9_, -256, -1, -1732977319);
	    i_9_ += 15;
	    int i_16_ = Class236.aClass103_2713.method2342() / 1024;
	    Class5.aClass96_26.method2112(new StringBuilder().append
					      ("Offheap:").append
					      (i_16_).append
					      ("k").toString(),
					  i_8_, i_9_,
					  i_16_ > 65536 ? -65536 : -256, -1,
					  -2120014657);
	    i_9_ += 15;
	    int i_17_ = 0;
	    int i_18_ = 0;
	    int i_19_ = 0;
	    for (int i_20_ = 0;
		 i_20_ < Class579.cacheFiles.length; i_20_++) {
		if (Class579.cacheFiles[i_20_] != null
		    && Class579.cacheFiles[i_20_]
			   .method16608(-1011566238)) {
		    i_17_ += Class579.cacheFiles[i_20_]
				 .method16619(-2055296199);
		    i_18_ += Class579.cacheFiles[i_20_]
				 .method16609(-1162931226);
		    i_19_ += Class579.cacheFiles[i_20_]
				 .method16606((byte) 15);
		}
	    }
	    int i_21_ = 0 == i_17_ ? 0 : 100 * i_19_ / i_17_;
	    int i_22_ = i_17_ == 0 ? 0 : i_18_ * 10000 / i_17_;
	    String string_23_
		= new StringBuilder().append("Cache:").append
		      (Class247.method4952((long) i_22_, 2, true,
					   Language.LOCALE_EN,
					   -1250186516))
		      .append
		      ("% (").append
		      (i_21_).append
		      ("%)").toString();
	    Class247_Sub2.aClass96_10073.method2112(string_23_, i_8_, i_9_,
						    -256, -1, -1894291982);
	    i_9_ += 12;
	}
    }
}
