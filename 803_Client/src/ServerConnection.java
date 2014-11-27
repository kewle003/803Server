/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class ServerConnection
{
    static final int anInt2255 = 15000;
    IsaacCipher aClass418_2256;
    NodeCollection aClass429_2257 = new NodeCollection();
    public int anInt2258 = 0;
    RSByteBuffer aClass241_Sub3_2259 = new RSByteBuffer(1700);
    public IsaacCipher packetCipher;//aClass418_2260
    IncommingOpcode currentPacket;//aClass340_2261
    public int anInt2262;
    RSBitBuffer inputBuffer = new RSBitBuffer(15000);//aClass241_Sub3_Sub1_2263
    int incommingPacketSize;//anInt2264
    boolean aBool2265;
    int anInt2266;
    Class563 aClass563_2267;
    int anInt2268;
    int anInt2269;
    int anInt2270;
    int anInt2271;
    IncommingOpcode aClass340_2272;
    IncommingOpcode aClass340_2273;
    IncommingOpcode aClass340_2274;
    public boolean aBool2275;
    Class11 aClass11_2276;
    
    public final void sendPacket/*method3879*/(Class241_Sub27 packet, int i) {
		aClass429_2257.addNode(packet, (short) -12604);
		packet.size = -1491571931 * packet.data.pointer;
		packet.data.pointer = 0;
		anInt2258 += packet.size * -1914692337;
    }
    
    final void method3880(byte i) {
	aClass429_2257.method7652((byte) 5);
	anInt2258 = 0;
    }
    
    public Class563 method3881() {
	return aClass563_2267;
    }
    
    void method3882() {
	if (client.anInt8296 % 50 == 0) {
	    anInt2270
		= anInt2268 * -1357556075;
	    anInt2268 = 0;
	    anInt2271
		= 2101157665 * anInt2266;
	    anInt2266 = 0;
	}
    }
    
    void method3883() {
	if (aClass563_2267 != null) {
	    aClass563_2267.close(1609152357);
	    aClass563_2267 = null;
	}
	aClass11_2276.method583(null, 381417906);
    }
    
    void method3884(Class563 class563, String string) {
	aClass563_2267 = class563;
	aClass11_2276.method583(string, 381417906);
    }
    
    void closeConnection/*method3885*/(int i) {
		if (aClass563_2267 != null) {
		    aClass563_2267.close(2045715857);
		    aClass563_2267 = null;
		}
		aClass11_2276.method583(null, 381417906);
    }
    
    void method3886(short i) {
	aClass563_2267 = null;
	aClass11_2276.method583(null, 381417906);
    }
    
    public Class563 getIO/*method3887*/(int i) {
    	return aClass563_2267;
    }
    
    final void method3888() {
	aClass429_2257.method7652((byte) 61);
	anInt2258 = 0;
    }
    
    public final void method3889(Class241_Sub27 class241_sub27) {
	aClass429_2257.addNode(class241_sub27,
						    (short) -28940);
	class241_sub27.size
	    = -1491571931 * class241_sub27.data.pointer;
	class241_sub27.data.pointer = 0;
	anInt2258 += class241_sub27.size * -1914692337;
    }
    
    public final void method3890(Class241_Sub27 class241_sub27) {
	aClass429_2257.addNode(class241_sub27,
						    (short) -14438);
	class241_sub27.size
	    = -1491571931 * class241_sub27.data.pointer;
	class241_sub27.data.pointer = 0;
	anInt2258 += class241_sub27.size * -1914692337;
    }
    
    void method3891() {
	if (client.anInt8296 % 50 == 0) {
	    anInt2270
		= anInt2268 * -1357556075;
	    anInt2268 = 0;
	    anInt2271
		= 2101157665 * anInt2266;
	    anInt2266 = 0;
	}
    }
    
    void method3892(Class563 class563, String string, int i) {
	aClass563_2267 = class563;
	aClass11_2276.method583(string, 381417906);
    }
    
    ServerConnection() {
	currentPacket = null;
	incommingPacketSize = 0;
	aBool2265 = true;
	anInt2269 = 0;
	anInt2262 = 0;
	aBool2275 = false;
	aClass11_2276 = new Class11();
	Thread thread = new Thread(aClass11_2276);
	thread.setDaemon(true);
	thread.setPriority(1);
	thread.start();
    }
    
    void method3893() {
	if (client.anInt8296 % 50 == 0) {
	    anInt2270
		= anInt2268 * -1357556075;
	    anInt2268 = 0;
	    anInt2271
		= 2101157665 * anInt2266;
	    anInt2266 = 0;
	}
    }
    
    public final void method3894(byte i) throws IOException {
	if (null != aClass563_2267
	    && -350916327 * anInt2258 > 0) {
	    aClass241_Sub3_2259.pointer = 0;
	    for (;;) {
		Class241_Sub27 class241_sub27
		    = ((Class241_Sub27)
		       aClass429_2257.method7694(16711935));
		if (class241_sub27 == null
		    || (-286165641 * class241_sub27.size
			> ((aClass241_Sub3_2259
			    .payload).length
			   - (aClass241_Sub3_2259.pointer
			      * 421967667))))
		    break;
		aClass241_Sub3_2259.writeBytes
		    (class241_sub27.data.payload, 0,
		     class241_sub27.size * -286165641, 752061035);
		anInt2258 -= class241_sub27.size * -1914692337;
		class241_sub27.remove((byte) 36);
		class241_sub27.data
		    .method14618(-174251917);
		class241_sub27.method15096(422792578);
	    }
	    aClass563_2267.write
		(aClass241_Sub3_2259.payload, 0,
		 aClass241_Sub3_2259.pointer * 421967667,
		 -2007848067);
	    anInt2268
		+= (aClass241_Sub3_2259.pointer
		    * -1469939145);
	    anInt2262 = 0;
	}
    }
    
    void method3895(Class563 class563, String string) {
	aClass563_2267 = class563;
	aClass11_2276.method583(string, 381417906);
    }
    
    void method3896(Class563 class563, String string) {
	aClass563_2267 = class563;
	aClass11_2276.method583(string, 381417906);
    }
    
    void method3897(Class563 class563, String string) {
	aClass563_2267 = class563;
	aClass11_2276.method583(string, 381417906);
    }
    
    public final void method3898(Class241_Sub27 class241_sub27) {
	aClass429_2257.addNode(class241_sub27,
						    (short) -25752);
	class241_sub27.size
	    = -1491571931 * class241_sub27.data.pointer;
	class241_sub27.data.pointer = 0;
	anInt2258 += class241_sub27.size * -1914692337;
    }
    
    void method3899() {
	if (aClass563_2267 != null) {
	    aClass563_2267.close(1832720773);
	    aClass563_2267 = null;
	}
	aClass11_2276.method583(null, 381417906);
    }
    
    void method3900() {
	if (client.anInt8296 % 50 == 0) {
	    anInt2270
		= anInt2268 * -1357556075;
	    anInt2268 = 0;
	    anInt2271
		= 2101157665 * anInt2266;
	    anInt2266 = 0;
	}
    }
    
    void method3901() {
	if (aClass563_2267 != null) {
	    aClass563_2267.close(1777190057);
	    aClass563_2267 = null;
	}
	aClass11_2276.method583(null, 381417906);
    }
    
    void method3902() {
	aClass563_2267 = null;
	aClass11_2276.method583(null, 381417906);
    }
    
    void method3903() {
	aClass563_2267 = null;
	aClass11_2276.method583(null, 381417906);
    }
    
    void method3904(int i) {
	if (client.anInt8296 % 50 == 0) {
	    anInt2270
		= anInt2268 * -1357556075;
	    anInt2268 = 0;
	    anInt2271
		= 2101157665 * anInt2266;
	    anInt2266 = 0;
	}
    }
    
    public Class563 method3905() {
	return aClass563_2267;
    }
    
    static final void method3906(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	long l = (long) (((ClientScriptData) class454).integerStack
			 [((ClientScriptData) class454).intStackPointer * 1482319719]);
	long l_0_
	    = (long) (((ClientScriptData) class454).integerStack
		      [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	long l_1_
	    = (long) (((ClientScriptData) class454).integerStack
		      [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) (l * l_1_ / l_0_);
    }
    
    static final void method3907(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = string.indexOf(i_2_, i_3_);
    }
    
    static final void method3908(ClientScriptData class454, int i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	ItemDefinition class623
	    = JS5.itemDefLoader.list(i_4_, (short) -10109);
	if (class623.noteTemplateID * -1365591143 >= 0
	    && class623.noteID * -2142812803 >= 0)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class623.noteID * -2142812803;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= i_4_;
    }
    
    static int method3909(CharSequence charsequence, char c, short i) {
	int i_5_ = 0;
	int i_6_ = charsequence.length();
	for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
	    if (charsequence.charAt(i_7_) == c)
		i_5_++;
	}
	return i_5_;
    }
    
    static void method3910(int i, int i_8_, int i_9_, int i_10_, boolean bool,
			   int i_11_) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	Class241_Sub34 class241_sub34
	    = (Class241_Sub34) Class241_Sub34.aClass407_10083.get(l);
	if (class241_sub34 == null) {
	    class241_sub34 = new Class241_Sub34();
	    Class241_Sub34.aClass407_10083.put(class241_sub34, l);
	}
	if (((Class241_Sub34) class241_sub34).anIntArray10085.length <= i_8_) {
	    int[] is = new int[1 + i_8_];
	    int[] is_12_ = new int[1 + i_8_];
	    for (int i_13_ = 0;
		 (i_13_
		  < ((Class241_Sub34) class241_sub34).anIntArray10085.length);
		 i_13_++) {
		is[i_13_]
		    = ((Class241_Sub34) class241_sub34).anIntArray10085[i_13_];
		is_12_[i_13_]
		    = ((Class241_Sub34) class241_sub34).anIntArray10086[i_13_];
	    }
	    for (int i_14_ = (((Class241_Sub34) class241_sub34)
			      .anIntArray10085).length;
		 i_14_ < i_8_; i_14_++) {
		is[i_14_] = -1;
		is_12_[i_14_] = 0;
	    }
	    ((Class241_Sub34) class241_sub34).anIntArray10085 = is;
	    ((Class241_Sub34) class241_sub34).anIntArray10086 = is_12_;
	}
	((Class241_Sub34) class241_sub34).anIntArray10085[i_8_] = i_9_;
	((Class241_Sub34) class241_sub34).anIntArray10086[i_8_] = i_10_;
    }
    
    static final void method3911(long l) {
	int i = 1750875065 * client.anInt8557;
	int i_15_ = client.anInt8361 * -1494721987;
	if (i != 97141979 * Class291.anInt4488) {
	    int i_16_ = i - 97141979 * Class291.anInt4488;
	    int i_17_ = (int) ((long) i_16_ * l / 320L);
	    if (i_16_ > 0) {
		if (i_17_ == 0)
		    i_17_ = 1;
		else if (i_17_ > i_16_)
		    i_17_ = i_16_;
	    } else if (i_17_ == 0)
		i_17_ = -1;
	    else if (i_17_ < i_16_)
		i_17_ = i_16_;
	    Class291.anInt4488 += i_17_ * 1081349971;
	}
	if (i_15_ != Class354_Sub2.anInt10492 * 970310639) {
	    int i_18_ = i_15_ - 970310639 * Class354_Sub2.anInt10492;
	    int i_19_ = (int) ((long) i_18_ * l / 320L);
	    if (i_18_ > 0) {
		if (i_19_ == 0)
		    i_19_ = 1;
		else if (i_19_ > i_18_)
		    i_19_ = i_18_;
	    } else if (i_19_ == 0)
		i_19_ = -1;
	    else if (i_19_ < i_18_)
		i_19_ = i_18_;
	    Class354_Sub2.anInt10492 += -258618609 * i_19_;
	}
	client.aFloat8581 += 8.0F * (client.aFloat8394 * (float) l / 40.0F);
	client.aFloat8406 += (float) l * client.aFloat8356 / 40.0F * 8.0F;
	VarPlayerDomain.method11656(-2058285189);
    }
    
    static String method3912(Throwable throwable, int i) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub3) {
	    RuntimeException_Sub3 runtimeexception_sub3
		= (RuntimeException_Sub3) throwable;
	    string = new StringBuilder().append
			 (((RuntimeException_Sub3) runtimeexception_sub3)
			  .aString11296)
			 .append
			 (" | ").toString();
	    throwable = (((RuntimeException_Sub3) runtimeexception_sub3)
			 .aThrowable11297);
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_20_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_20_));
	String string_21_ = bufferedreader.readLine();
	for (;;) {
	    String string_22_ = bufferedreader.readLine();
	    if (null == string_22_)
		break;
	    int i_23_ = string_22_.indexOf('(');
	    int i_24_ = string_22_.indexOf(')', i_23_ + 1);
	    String string_25_;
	    if (i_23_ != -1)
		string_25_ = string_22_.substring(0, i_23_);
	    else
		string_25_ = string_22_;
	    string_25_ = string_25_.trim();
	    string_25_ = string_25_.substring(string_25_.lastIndexOf(' ') + 1);
	    string_25_
		= string_25_.substring(string_25_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_25_)
			 .toString();
	    if (-1 != i_23_ && -1 != i_24_) {
		int i_26_ = string_22_.indexOf(".java:", i_23_);
		if (i_26_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_22_.substring(5 + i_26_, i_24_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_21_).toString();
	return string;
    }
}
