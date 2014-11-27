/* Class461 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class461
{
    static char[] aCharArray6280 = new char[64];
    static char[] aCharArray6281;
    static int[] anIntArray6282;
    
    static int method10633(String string, byte[] is, int i) {
	int i_0_ = i;
	int i_1_ = string.length();
	for (int i_2_ = 0; i_2_ < i_1_; i_2_ += 4) {
	    int i_3_ = Class576.method12669(string.charAt(i_2_), 1356249974);
	    int i_4_
		= (1 + i_2_ < i_1_
		   ? Class576.method12669(string.charAt(i_2_ + 1), 2113642585)
		   : -1);
	    int i_5_
		= (2 + i_2_ < i_1_
		   ? Class576.method12669(string.charAt(i_2_ + 2), -2136425759)
		   : -1);
	    int i_6_
		= (i_2_ + 3 < i_1_
		   ? Class576.method12669(string.charAt(3 + i_2_), -1727254747)
		   : -1);
	    is[i++] = (byte) (i_3_ << 2 | i_4_ >>> 4);
	    if (-1 == i_5_)
		break;
	    is[i++] = (byte) ((i_4_ & 0xf) << 4 | i_5_ >>> 2);
	    if (i_6_ == -1)
		break;
	    is[i++] = (byte) ((i_5_ & 0x3) << 6 | i_6_);
	}
	return i - i_0_;
    }
    
    Class461() throws Throwable {
	throw new Error();
    }
    
    static int method10634(char c) {
	if (c >= 0 && c < anIntArray6282.length)
	    return anIntArray6282[c];
	return -1;
    }
    
    static int method10635(String string, byte[] is, int i) {
	int i_7_ = i;
	int i_8_ = string.length();
	for (int i_9_ = 0; i_9_ < i_8_; i_9_ += 4) {
	    int i_10_ = Class576.method12669(string.charAt(i_9_), 1675320027);
	    int i_11_
		= (1 + i_9_ < i_8_
		   ? Class576.method12669(string.charAt(i_9_ + 1), -35086785)
		   : -1);
	    int i_12_
		= (2 + i_9_ < i_8_
		   ? Class576.method12669(string.charAt(i_9_ + 2), 1004236878)
		   : -1);
	    int i_13_
		= (i_9_ + 3 < i_8_
		   ? Class576.method12669(string.charAt(3 + i_9_), 275465999)
		   : -1);
	    is[i++] = (byte) (i_10_ << 2 | i_11_ >>> 4);
	    if (-1 == i_12_)
		break;
	    is[i++] = (byte) ((i_11_ & 0xf) << 4 | i_12_ >>> 2);
	    if (i_13_ == -1)
		break;
	    is[i++] = (byte) ((i_12_ & 0x3) << 6 | i_13_);
	}
	return i - i_7_;
    }
    
    static int method10636(char c) {
	if (c >= 0 && c < anIntArray6282.length)
	    return anIntArray6282[c];
	return -1;
    }
    
    static {
	for (int i = 0; i < 26; i++)
	    aCharArray6280[i] = (char) (65 + i);
	for (int i = 26; i < 52; i++)
	    aCharArray6280[i] = (char) (i + 97 - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray6280[i] = (char) (48 + i - 52);
	aCharArray6280[62] = '+';
	aCharArray6280[63] = '/';
	aCharArray6281 = new char[64];
	for (int i = 0; i < 26; i++)
	    aCharArray6281[i] = (char) (i + 65);
	for (int i = 26; i < 52; i++)
	    aCharArray6281[i] = (char) (i + 97 - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray6281[i] = (char) (i + 48 - 52);
	aCharArray6281[62] = '*';
	aCharArray6281[63] = '-';
	anIntArray6282 = new int[128];
	for (int i = 0; i < anIntArray6282.length; i++)
	    anIntArray6282[i] = -1;
	for (int i = 65; i <= 90; i++)
	    anIntArray6282[i] = i - 65;
	for (int i = 97; i <= 122; i++)
	    anIntArray6282[i] = 26 + (i - 97);
	for (int i = 48; i <= 57; i++)
	    anIntArray6282[i] = i - 48 + 52;
	int[] is = anIntArray6282;
	anIntArray6282[43] = 62;
	is[42] = 62;
	int[] is_14_ = anIntArray6282;
	anIntArray6282[47] = 63;
	is_14_[45] = 63;
    }
    
    public static String method10637(byte[] is) {
	return Class92.method2074(is, 0, is.length, 1658938467);
    }
    
    static String method10638(byte[] is, int i, int i_15_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_16_ = i; i_16_ < i_15_ + i; i_16_ += 3) {
	    int i_17_ = is[i_16_] & 0xff;
	    stringbuilder.append(aCharArray6280[i_17_ >>> 2]);
	    if (i_16_ < i_15_ - 1) {
		int i_18_ = is[i_16_ + 1] & 0xff;
		stringbuilder
		    .append(aCharArray6280[(i_17_ & 0x3) << 4 | i_18_ >>> 4]);
		if (i_16_ < i_15_ - 2) {
		    int i_19_ = is[i_16_ + 2] & 0xff;
		    stringbuilder.append
			(aCharArray6280[(i_18_ & 0xf) << 2 | i_19_ >>> 6])
			.append(aCharArray6280[i_19_ & 0x3f]);
		} else
		    stringbuilder.append
			(aCharArray6280[(i_18_ & 0xf) << 2]).append('=');
	    } else
		stringbuilder.append(aCharArray6280[(i_17_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    static int method10639(char c) {
	if (c >= 0 && c < anIntArray6282.length)
	    return anIntArray6282[c];
	return -1;
    }
    
    static String method10640(byte[] is, int i, int i_20_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_21_ = i; i_21_ < i_20_ + i; i_21_ += 3) {
	    int i_22_ = is[i_21_] & 0xff;
	    stringbuilder.append(aCharArray6280[i_22_ >>> 2]);
	    if (i_21_ < i_20_ - 1) {
		int i_23_ = is[i_21_ + 1] & 0xff;
		stringbuilder
		    .append(aCharArray6280[(i_22_ & 0x3) << 4 | i_23_ >>> 4]);
		if (i_21_ < i_20_ - 2) {
		    int i_24_ = is[i_21_ + 2] & 0xff;
		    stringbuilder.append
			(aCharArray6280[(i_23_ & 0xf) << 2 | i_24_ >>> 6])
			.append(aCharArray6280[i_24_ & 0x3f]);
		} else
		    stringbuilder.append
			(aCharArray6280[(i_23_ & 0xf) << 2]).append('=');
	    } else
		stringbuilder.append(aCharArray6280[(i_22_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    static void method10641(int i) {
	Class185.aBool2185 = false;
	Class69.method1683((byte) 14);
    }
    
    static Class241_Sub27 createWalkPacket/*method10642*/(int localX, int localY, int type, int i_27_) {
		Class241_Sub27 packet = null;
		if (0 == type) {
			packet = Class445_Sub26.makePacket(
					OutgoingOpcode.WALKING_PACKET,
					client.aClass190_8340.packetCipher,
					16711935);
		}
		if (1 == type) {
			packet = Class445_Sub26.makePacket(
					OutgoingOpcode.MINI_WALKING_PACKET,
					client.aClass190_8340.packetCipher,
					16711935);
		}
		GameScene currentPos = client.aClass238_8477.method4806((byte) 1);
		packet.data.writeShortA(currentPos.baseX * 127679513 + localX, -1097584359);
		packet.data.writeLEShortA(currentPos.baseY * 468558693 + localY, (byte) 102);
		packet.data.writeByteA(InvType.isForceRun(1319366149) ? 1 : 0, 1975940366);
		Class194.minimapFlagX = -980260023 * localX;
		Class194.minimapFlagY = localY * -1262506991;
		Class194.aBool2302 = false;
		Class41.method1064(-946763748);
		return packet;
    }
    
    public static void method10643(int i, int i_28_, int i_29_,
				   ObjectDefinition class526, int i_30_) {
	for (Class241_Sub38 class241_sub38
		 = ((Class241_Sub38)
		    Class241_Sub38.aClass429_10116.method7694(16711935));
	     null != class241_sub38;
	     class241_sub38 = (Class241_Sub38) Class241_Sub38
						   .aClass429_10116
						   .method7692(-102611816)) {
	    if (i == 1193750551 * ((Class241_Sub38) class241_sub38).anInt10119
		&& i_28_ << 9 == (((Class241_Sub38) class241_sub38).anInt10121
				  * 627217157)
		&& i_29_ << 9 == (((Class241_Sub38) class241_sub38).anInt10137
				  * 268994875)
		&& (((Class241_Sub38) class241_sub38).aClass526_10132.objectID
		    * -2079513015) == -2079513015 * class526.objectID) {
		if (((Class241_Sub38) class241_sub38).aClass221_10141
		    != null) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(100, -831520299);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -91);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		class241_sub38.remove((byte) 36);
		break;
	    }
	}
    }
}
