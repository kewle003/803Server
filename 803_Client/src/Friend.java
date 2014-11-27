/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Friend
{
    public int serverNodeID;//anInt186
    public String previousName;//aString187
    public String currentName;//aString188
    public String serverName;//aString189
    public int anInt190;
    public String note;//aString191
    public boolean aBool192;
    public boolean aBool193;
    public int anInt194;
    public int serverFlags;//anInt195
    
    Friend() {
	/* empty */
    }
    
    static final void method863(ClientScriptData class454, int i) {
	WorldTile.method16486(true, -932590045);
	Class486.method11126((byte) -128);
	client.aClass238_8477.method4768((byte) 5);
	Class167.method3600((short) 12063);
	client.aBool8297 = false;
    }
    
    public static String method864(byte[] is, int i, int i_0_, int i_1_) {
	char[] cs = new char[i_0_];
	int i_2_ = 0;
	int i_3_ = i;
	int i_4_ = i_0_ + i;
	while (i_3_ < i_4_) {
	    int i_5_ = is[i_3_++] & 0xff;
	    int i_6_;
	    if (i_5_ < 128) {
		if (i_5_ == 0)
		    i_6_ = 65533;
		else
		    i_6_ = i_5_;
	    } else if (i_5_ < 192)
		i_6_ = 65533;
	    else if (i_5_ < 224) {
		if (i_3_ < i_4_ && (is[i_3_] & 0xc0) == 128) {
		    i_6_ = (i_5_ & 0x1f) << 6 | is[i_3_++] & 0x3f;
		    if (i_6_ < 128)
			i_6_ = 65533;
		} else
		    i_6_ = 65533;
	    } else if (i_5_ < 240) {
		if (1 + i_3_ < i_4_ && (is[i_3_] & 0xc0) == 128
		    && (is[1 + i_3_] & 0xc0) == 128) {
		    i_6_ = ((i_5_ & 0xf) << 12 | (is[i_3_++] & 0x3f) << 6
			    | is[i_3_++] & 0x3f);
		    if (i_6_ < 2048)
			i_6_ = 65533;
		} else
		    i_6_ = 65533;
	    } else if (i_5_ < 248) {
		if (2 + i_3_ < i_4_ && (is[i_3_] & 0xc0) == 128
		    && 128 == (is[1 + i_3_] & 0xc0)
		    && 128 == (is[2 + i_3_] & 0xc0)) {
		    i_6_ = ((i_5_ & 0x7) << 18 | (is[i_3_++] & 0x3f) << 12
			    | (is[i_3_++] & 0x3f) << 6 | is[i_3_++] & 0x3f);
		    if (i_6_ < 65536 || i_6_ > 1114111)
			i_6_ = 65533;
		    else
			i_6_ = 65533;
		} else
		    i_6_ = 65533;
	    } else
		i_6_ = 65533;
	    cs[i_2_++] = (char) i_6_;
	}
	return new String(cs, 0, i_2_);
    }
    
    public static void method865(Class629 class629, int i) {
	Class223.method4490(new Class546(class629), -1683813496);
    }
    
    static Class247_Sub2 method866(int i) {
	Class247_Sub2 class247_sub2
	    = ((Class247_Sub2)
	       Class247_Sub2.aClass421_10072.method7527(2034617147));
	if (class247_sub2 != null) {
	    Class247_Sub2.anInt10067 -= 2136455217;
	    return class247_sub2;
	}
	return new Class247_Sub2();
    }
}
