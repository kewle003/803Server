/* Class436 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class436 implements Interface23
{
    Class103 aClass103_6129;
    
    public Object method136(int[] is, int i, int i_0_, int i_1_, int i_2_,
			    boolean bool, int i_3_) {
	return ((Class436) this).aClass103_6129.method2287(is, i, i_0_, i_1_,
							   i_2_, false);
    }
    
    public Object method137(int[] is, int i, int i_4_, int i_5_, int i_6_,
			    boolean bool) {
	return ((Class436) this).aClass103_6129.method2287(is, i, i_4_, i_5_,
							   i_6_, false);
    }
    
    Class436() {
	/* empty */
    }
    
    public static int method7795(int i, byte i_7_) {
	int i_8_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_8_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_8_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_8_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_8_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_8_++;
	}
	return i_8_ + i;
    }
    
    static final void method7796(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	client.aShort8555
	    = (short) (((ClientScriptData) class454).integerStack
		       [((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (client.aShort8555 <= 0)
	    client.aShort8555 = (short) 1;
	client.aShort8556
	    = (short) (((ClientScriptData) class454).integerStack
		       [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	if (client.aShort8556 <= 0)
	    client.aShort8556 = (short) 32767;
	else if (client.aShort8556 < client.aShort8555)
	    client.aShort8556 = client.aShort8555;
	client.aShort8476
	    = (short) (((ClientScriptData) class454).integerStack
		       [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (client.aShort8476 <= 0)
	    client.aShort8476 = (short) 1;
	client.aShort8558
	    = (short) (((ClientScriptData) class454).integerStack
		       [3 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	if (client.aShort8558 <= 0)
	    client.aShort8558 = (short) 32767;
	else if (client.aShort8558 < client.aShort8476)
	    client.aShort8558 = client.aShort8476;
    }
    
    static void method7797(String[] strings, short i) {
	if (strings.length > 1) {
	    for (int i_9_ = 0; i_9_ < strings.length; i_9_++) {
		if (strings[i_9_].startsWith("pause")) {
		    int i_10_ = 5;
		    try {
			i_10_ = Integer.parseInt(strings[i_9_].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class21.addline(new StringBuilder().append
					  ("Pausing for ").append
					  (i_10_).append
					  (" seconds...").toString(),
				      (byte) 85);
		    Class105_Sub1_Sub3.aStringArray11135 = strings;
		    Class185.anInt2186 = 288805643 * (1 + i_9_);
		    AnimationConfig.aLong7015
			= (Class50.method1249((byte) 1)
			   + (long) (i_10_ * 1000)) * -8901969350305866015L;
		    break;
		}
		Class185.aString2181 = strings[i_9_];
		Class120_Sub16.method16797(false, (byte) 85);
	    }
	} else {
	    Class185.aString2181
		= new StringBuilder().append(Class185.aString2181).append
		      (strings[0]).toString();
	    Class185.anInt2182 += strings[0].length() * 527811085;
	}
    }
    
    static final void method7798(ClientScriptData class454, byte i) {
	int i_11_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (JS5.itemDefLoader.list(i_11_, (short) 4448)
	       .value) * 483161521;
    }
    
    public static long method7799(int i, byte i_12_) {
	return (long) (i + 11745) * 86400000L;
    }
}
