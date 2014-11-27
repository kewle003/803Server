/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class22
{
    static Class22 aClass22_204 = new Class22();
    static Class22 aClass22_205 = new Class22();
    
    Class22() {
	/* empty */
    }
    
    public static void method899(boolean bool, int i) {
		if (1 != -831877317 * client.anInt8266 && 3 != client.anInt8266 * -831877317) {
			if (!bool) {
				if (null != Class104.aClass120Array1479) {
					Class120[] class120s = Class104.aClass120Array1479;
					for (int i_0_ = 0; i_0_ < class120s.length; i_0_++) {
						Class120 class120 = class120s[i_0_];
						class120.method2959(1429093523);
					}
				}
				if (-1 != 1161532437 * Class104.anInt1483)
					Class402.soundManager.method1169((Class104.anInt1483
									   * 1161532437),
									  255, 5201956);
			}
			client.anInt8266 = 1322480115;
			HitMarkType.aClass241_Sub3_7297 = null;
			client.aBool8354 = false;
			if (Class104.anInt1477 * -1324293729 > 0) {
				Class561.method12372(Class614.aClass614_7823,
						 -1324293729 * Class104.anInt1477, -1,
						 -1829529273);
			}
			Class208.method4135(-1070756622);
			Class241_Sub27 packet = Class445_Sub26.makePacket(
					OutgoingOpcode.aClass253_4047,
					client.aClass190_8340.packetCipher, 16711935);
			packet.data.writeByte(bool ? 1 : 0, 1026936693);
			client.aClass190_8340.sendPacket(packet, -1753292554);
		}
    }
    
    static final void method900(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aBool8386 ? 1 : 0;
    }
    
    public static int method901(CharSequence charsequence,
				CharSequence charsequence_1_,
				Language class437, int i) {
	int i_2_ = charsequence.length();
	int i_3_ = charsequence_1_.length();
	int i_4_ = 0;
	int i_5_ = 0;
	char c = '\0';
	char c_6_ = '\0';
	while (i_4_ - c < i_2_ || i_5_ - c_6_ < i_3_) {
	    if (i_4_ - c >= i_2_)
		return -1;
	    if (i_5_ - c_6_ >= i_3_)
		return 1;
	    char c_7_;
	    if (c != 0) {
		c_7_ = c;
		boolean bool = false;
	    } else
		c_7_ = charsequence.charAt(i_4_++);
	    char c_8_;
	    if (c_6_ != 0) {
		c_8_ = c_6_;
		boolean bool = false;
	    } else
		c_8_ = charsequence_1_.charAt(i_5_++);
	    c = Class241_Sub21.method15058(c_7_, (byte) -44);
	    c_6_ = Class241_Sub21.method15058(c_8_, (byte) -72);
	    c_7_ = Class554.method12274(c_7_, class437, 128038617);
	    c_8_ = Class554.method12274(c_8_, class437, 128038617);
	    if (c_7_ != c_8_ && (Character.toUpperCase(c_7_)
				 != Character.toUpperCase(c_8_))) {
		c_7_ = Character.toLowerCase(c_7_);
		c_8_ = Character.toLowerCase(c_8_);
		if (c_7_ != c_8_)
		    return (Class500.method11373(c_7_, class437, (byte) 17)
			    - Class500.method11373(c_8_, class437,
						   (byte) 107));
	    }
	}
	int i_9_ = Math.min(i_2_, i_3_);
	for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
	    if (Language.aClass437_6130 == class437) {
		i_4_ = i_2_ - 1 - i_10_;
		i_5_ = i_3_ - 1 - i_10_;
	    } else
		i_4_ = i_5_ = i_10_;
	    char c_11_ = charsequence.charAt(i_4_);
	    char c_12_ = charsequence_1_.charAt(i_5_);
	    if (c_11_ != c_12_ && (Character.toUpperCase(c_11_)
				   != Character.toUpperCase(c_12_))) {
		c_11_ = Character.toLowerCase(c_11_);
		c_12_ = Character.toLowerCase(c_12_);
		if (c_11_ != c_12_)
		    return (Class500.method11373(c_11_, class437, (byte) 98)
			    - Class500.method11373(c_12_, class437,
						   (byte) 39));
	    }
	}
	int i_13_ = i_2_ - i_3_;
	if (0 != i_13_)
	    return i_13_;
	for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
	    char c_15_ = charsequence.charAt(i_14_);
	    char c_16_ = charsequence_1_.charAt(i_14_);
	    if (c_15_ != c_16_)
		return (Class500.method11373(c_15_, class437, (byte) 48)
			- Class500.method11373(c_16_, class437, (byte) 97));
	}
	return 0;
    }
    
    static final void method902(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = ((ClientScriptData) class454).varEntity
		  .method14464(-421670689);
    }
    
    static final void method903(int i, int i_17_, int i_18_, byte i_19_) {
	String string = new StringBuilder().append("tele ").append(i).append
			    (Class6.aString30).append
			    (i_17_ >> 6).append
			    (Class6.aString30).append
			    (i_18_ >> 6).append
			    (Class6.aString30).append
			    (i_17_ & 0x3f).append
			    (Class6.aString30).append
			    (i_18_ & 0x3f).toString();
	System.out.println(string);
	Class120_Sub10.runCommand(string, true, false, 1044342367);
    }
    
    public static final void method904(int i) {
	if (!client.aBool8388) {
	    client.aFloat8356 += (-12.0F - client.aFloat8356) / 2.0F;
	    client.aBool8392 = true;
	    client.aBool8388 = true;
	}
    }
    
    static final void method905(int i) {
	for (int i_20_ = 0; i_20_ < client.localNpcCount * -1837469873; i_20_++) {
	    int i_21_ = client.localNpcIndicies[i_20_];
	    ObjectNode class241_sub26
		= ((ObjectNode)
		   client.aClass407_8457.get((long) i_21_));
	    if (null != class241_sub26) {
		NPC class475_sub1_sub1_sub3_sub2
		    = ((NPC)
		       class241_sub26.objectValue);
		Class120_Sub4.method15604(class475_sub1_sub1_sub3_sub2, false,
					  (byte) 2);
	    }
	}
    }
}
