/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

import jaclib.ping.Ping;

public class Class11 implements Runnable
{
    volatile long aLong69 = -6868182564157667459L;
    InetAddress anInetAddress70;
    volatile boolean aBool71 = true;
    String aString72;
    
    long method582(byte i) {
	return ((Class11) this).aLong69 * -4797581434802022869L;
    }
    
    void method583(String string, int i) {
	((Class11) this).aString72 = string;
	((Class11) this).anInetAddress70 = null;
	((Class11) this).aLong69 = -6868182564157667459L;
	if (((Class11) this).aString72 != null) {
	    try {
		((Class11) this).anInetAddress70
		    = InetAddress.getByName(((Class11) this).aString72);
	    } catch (UnknownHostException unknownhostexception) {
		/* empty */
	    }
	}
    }
    
    long method584() {
	return ((Class11) this).aLong69 * -4797581434802022869L;
    }
    
    void method585(int i) {
	((Class11) this).aBool71 = false;
    }
    
    public void run() {
	while (((Class11) this).aBool71)
	    method586((byte) 74);
    }
    
    void method586(byte i) {
	if (((Class11) this).anInetAddress70 != null) {
	    try {
		byte[] is = ((Class11) this).anInetAddress70.getAddress();
		((Class11) this).aLong69
		    = (long) Ping.method956(is[0], is[1], is[2], is[3],
					    10000L) * 6868182564157667459L;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	Class380_Sub2.method16722(1000L);
    }
    
    long method587() {
	return ((Class11) this).aLong69 * -4797581434802022869L;
    }
    
    long method588() {
	return ((Class11) this).aLong69 * -4797581434802022869L;
    }
    
    void method589() {
	((Class11) this).aBool71 = false;
    }
    
    public void method590() {
	while (((Class11) this).aBool71)
	    method586((byte) 100);
    }
    
    public void method591() {
	while (((Class11) this).aBool71)
	    method586((byte) 24);
    }
    
    public void method592() {
	while (((Class11) this).aBool71)
	    method586((byte) 20);
    }
    
    public void method593() {
	while (((Class11) this).aBool71)
	    method586((byte) 20);
    }
    
    Class11() {
	/* empty */
    }
    
    void method594() {
	if (((Class11) this).anInetAddress70 != null) {
	    try {
		byte[] is = ((Class11) this).anInetAddress70.getAddress();
		((Class11) this).aLong69
		    = (long) Ping.method956(is[0], is[1], is[2], is[3],
					    10000L) * 6868182564157667459L;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	Class380_Sub2.method16722(1000L);
    }
    
    void method595() {
	if (((Class11) this).anInetAddress70 != null) {
	    try {
		byte[] is = ((Class11) this).anInetAddress70.getAddress();
		((Class11) this).aLong69
		    = (long) Ping.method956(is[0], is[1], is[2], is[3],
					    10000L) * 6868182564157667459L;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	Class380_Sub2.method16722(1000L);
    }
    
    static void method596(Class241_Sub39_Sub11 class241_sub39_sub11, int i) {
	if (!Class16.aBool141) {
	    class241_sub39_sub11.remove((byte) 36);
	    Class16.anInt148 -= 431696667;
	    if (!((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10878) {
		long l = (544876251290631095L
			  * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			     .aLong10872));
		Class241_Sub39_Sub10 class241_sub39_sub10;
		for (class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    Class16.aClass407_180.get(l));
		     (null != class241_sub39_sub10
		      && !(((Class241_Sub39_Sub10) class241_sub39_sub10)
			       .aString10865.equals
			   (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aString10869)));
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    Class16.aClass407_180.method7289((byte) -13))) {
		    /* empty */
		}
		if (null != class241_sub39_sub10
		    && class241_sub39_sub10.method17205(class241_sub39_sub11,
							830096014))
		    Class88.method1854(class241_sub39_sub10, (byte) 22);
	    } else {
		for (Class241_Sub39_Sub10 class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    Class16.aClass410_152.method7440(-1397088259));
		     class241_sub39_sub10 != null;
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    Class16.aClass410_152.method7435((byte) -1))) {
		    if (((Class241_Sub39_Sub10) class241_sub39_sub10)
			    .aString10865.equals
			(((Class241_Sub39_Sub11) class241_sub39_sub11)
			 .aString10869)) {
			boolean bool = false;
			for (Class241_Sub39_Sub11 class241_sub39_sub11_0_
				 = ((Class241_Sub39_Sub11)
				    ((Class241_Sub39_Sub10)
				     class241_sub39_sub10)
					.aClass410_10866
					.method7440(-1397088259));
			     null != class241_sub39_sub11_0_;
			     class241_sub39_sub11_0_
				 = ((Class241_Sub39_Sub11)
				    ((Class241_Sub39_Sub10)
				     class241_sub39_sub10)
					.aClass410_10866
					.method7435((byte) -1))) {
			    if (class241_sub39_sub11_0_
				== class241_sub39_sub11) {
				if (class241_sub39_sub10.method17205
				    (class241_sub39_sub11, 1700246656))
				    Class88.method1854(class241_sub39_sub10,
						       (byte) -96);
				bool = true;
				break;
			    }
			}
			if (bool)
			    break;
		    }
		}
	    }
	}
    }
    
    static final void skipTableSpecifiedSteps/*method597*/(ClientScriptData scriptData, byte i) {
		HashTable jumpTable
		    = scriptData.script.aClass407Array10820
		    		[(scriptData.integerConstants[1938982693 * scriptData.step])];
		IntegerNode intNode = ((IntegerNode)
		    		jumpTable.get((long) scriptData.integerStack
		    				[(scriptData.intStackPointer -= 1736754263) * 1482319719]));
		if (intNode != null) {
			scriptData.step += intNode.intValue * 1064777685;
		}
    }
    
    static final void method598(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (Class21.myPlayer.aClass490_11499 != null)
	    Class21.myPlayer.aClass490_11499
		.method11203(i_1_, i_2_, (byte) 1);
    }
    
    static final void storeChannelName/*method599*/(ClientScriptData scriptData, int i) {
    	scriptData.objectStack[(scriptData.objectStackPointer += -1650705371) * -290357331 - 1]
    			= scriptData.currentChannel.channelName;
    }
    
    static final void method600(ClientScriptData class454, byte i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (Class442.aBool6160) {
	    Class446[] class446s = VarBitType.method5911(-2135419018);
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -954685139 * class446s[i_3_].anInt6177;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class446s[i_3_].anInt6180 * -1042155793;
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	}
    }
}
