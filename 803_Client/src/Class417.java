/* Class417 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class417
{
    int anInt6013;
    int anInt6014;
    int anInt6015;
    int anInt6016;
    int anInt6017;
    public static int anInt6018;
    public static InterfaceComponent aClass58_6019;
    
    public int method7492() {
	return ((Class417) this).anInt6014 * 998919751;
    }
    
    Class417(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	((Class417) this).anInt6014 = -1252328585 * i;
	((Class417) this).anInt6013 = 2073408597 * i_0_;
	((Class417) this).anInt6015 = i_1_ * 584753691;
	((Class417) this).anInt6016 = 833722801 * i_2_;
	((Class417) this).anInt6017 = i_3_ * -773692057;
    }
    
    public int method7493() {
	return ((Class417) this).anInt6014 * 998919751;
    }
    
    public int hashCode() {
	return ((Class417) this).anInt6014 * 998919751;
    }
    
    static void method7494(Class103 class103, InterfaceComponent class58, int i, int i_4_,
			   int i_5_) {
	if (null != Class21.myPlayer) {
	    class103.method2291();
	    Class118 class118 = null;
	    Class135 class135 = null;
	    if (5 == class58.componentType * -1579470857) {
		class118 = class58.method1518(class103, -1050909397);
		if (class118 == null)
		    return;
		class135 = class118.aClass135_1559;
		if ((1403518843 * class118.anInt1560
		     != 439139681 * class58.anInt850)
		    || (574765281 * class118.anInt1556
			!= 1463495207 * class58.scrollMinY))
		    throw new IllegalStateException("");
	    }
	    class103.method2445(i, i_4_, i + 439139681 * class58.anInt850,
				i_4_ + 1463495207 * class58.scrollMinY);
	    if (2 != 630280401 * Class194.anInt2311
		&& 630280401 * Class194.anInt2311 != 5
		&& Class65.aClass168_1046 != null) {
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		int i_6_;
		int i_7_;
		int i_8_;
		int i_9_;
		if (5 == 115241065 * Class296.anInt4513) {
		    i_6_ = 1750875065 * client.anInt8557;
		    i_7_ = -1494721987 * client.anInt8361;
		    i_8_ = (int) -client.aFloat8581 & 0x3fff;
		    i_9_ = 4096;
		} else {
		    Class287 class287
			= (Class21.myPlayer
			       .method10874
			   ().aClass287_4386);
		    i_6_ = (int) class287.aFloat4477;
		    i_7_ = (int) class287.aFloat4479;
		    if (115241065 * Class296.anInt4513 == 4)
			i_8_ = ((int) -((double) Class445_Sub16
						     .aClass351_Sub1_8660
						     .method6292((byte) 22)
					* 2607.5945876176133)
				+ 390680985 * client.anInt8513) & 0x3fff;
		    else
			i_8_ = (390680985 * client.anInt8513
				+ (int) -client.aFloat8581) & 0x3fff;
		    i_9_ = 4096 - client.anInt8377 * -2107960880;
		}
		int i_10_ = 48 + i_6_ / 128;
		int i_11_
		    = (48 + client.aClass238_8477.method4745(-397950162) * 4
		       - i_7_ / 128);
		if (class135 != null)
		    Class65.aClass168_1046.method3625
			(((float) (class58.anInt850 * 439139681) / 2.0F
			  + (float) i),
			 ((float) (class58.scrollMinY * 1463495207) / 2.0F
			  + (float) i_4_),
			 (float) i_10_, (float) i_11_, i_9_, i_8_ << 2,
			 class135, i, i_4_);
		else
		    Class65.aClass168_1046.method3623
			(((float) (class58.anInt850 * 439139681) / 2.0F
			  + (float) i),
			 ((float) (1463495207 * class58.scrollMinY) / 2.0F
			  + (float) i_4_),
			 (float) i_10_, (float) i_11_, i_9_, i_8_ << 2, 1, -1,
			 1);
		Class564 class564
		    = client.aClass238_8477.method4860(872032846);
		for (IntegerNode class241_sub22
			 = ((IntegerNode)
			    Class194.aClass429_2307.method7694(16711935));
		     null != class241_sub22;
		     class241_sub22
			 = ((IntegerNode)
			    Class194.aClass429_2307.method7692(125582843))) {
		    int i_12_ = -1859754807 * class241_sub22.intValue;
		    int i_13_
			= ((class564.anIntArray7306[i_12_] >> 14 & 0x3fff)
			   - class522.baseX * 127679513);
		    int i_14_ = ((class564.anIntArray7306[i_12_] & 0x3fff)
				 - class522.baseY * 468558693);
		    int i_15_ = 2 + 4 * i_13_ - i_6_ / 128;
		    int i_16_ = 4 * i_14_ + 2 - i_7_ / 128;
		    Class106.method2674(class103, class135, class58, i, i_4_,
					i_15_, i_16_,
					class564.anIntArray7307[i_12_],
					(byte) 95);
		}
		for (int i_17_ = 0; i_17_ < Class194.anInt2303 * -1037886889;
		     i_17_++) {
		    int i_18_
			= 4 * Class194.anIntArray2304[i_17_] + 2 - i_6_ / 128;
		    int i_19_
			= 2 + 4 * Class194.anIntArray2313[i_17_] - i_7_ / 128;
		    ObjectDefinition class526
			= (client.aClass238_8477.getObjectLoader(-2005536183)
			       .getObjectDefinition
			   (Class194.anIntArray2306[i_17_], 577892407));
		    if (class526.toObjectIDs != null) {
			class526 = class526.method11768(Class1.aClass19_11,
							Class1.aClass19_11,
							-2087233753);
			if (null == class526
			    || 8166631 * class526.mapSpriteID == -1)
			    continue;
		    }
		    Class106.method2674(class103, class135, class58, i, i_4_,
					i_18_, i_19_,
					8166631 * class526.mapSpriteID,
					(byte) 93);
		}
		for (WorldTile class241_sub44
			 = ((WorldTile)
			    client.aClass407_8452.method7294(2090894173));
		     class241_sub44 != null;
		     class241_sub44
			 = ((WorldTile)
			    client.aClass407_8452.method7295(1771463952))) {
		    int i_20_ = (int) ((class241_sub44.hashCode
					* 4356572401218184725L) >> 28
				       & 0x3L);
		    if (Class194.anInt2299 * -1342949133 == i_20_) {
			int i_21_ = ((int) ((4356572401218184725L
					     * class241_sub44.hashCode)
					    & 0x3fffL)
				     - 127679513 * class522.baseX);
			int i_22_ = ((int) ((class241_sub44.hashCode
					     * 4356572401218184725L) >> 14
					    & 0x3fffL)
				     - class522.baseY * 468558693);
			int i_23_ = i_21_ * 4 + 2 - i_6_ / 128;
			int i_24_ = 4 * i_22_ + 2 - i_7_ / 128;
			Class1.method452(class58, class135, i, i_4_, i_23_,
					 i_24_, HitMarkTypeList.aClass168Array7251[0],
					 1887978493);
		    }
		}
		Class96_Sub1.method15364(class103, i_6_, i_7_, class58,
					 class135, i, i_4_, (byte) 40);
		Class12.method601(i_6_, i_7_, class58, class135, i, i_4_,
				  965864214);
		Class371.method6631(i_6_, i_7_, class58, class118, i, i_4_,
				    (byte) 0);
		if (5 != 115241065 * Class296.anInt4513) {
		    if (1813149433 * Class194.minimapFlagX != -1) {
			int i_25_
			    = (2 + -1337336860 * Class194.minimapFlagX
			       - i_6_ / 128
			       + (Class21.myPlayer
				      .method17782(135423588)
				  - 1) * 2);
			int i_26_
			    = (Class194.minimapFlagY * -758443068 + 2 - i_7_ / 128
			       + (Class21.myPlayer
				      .method17782(1719321008)
				  - 1) * 2);
			Class1.method452(class58, class135, i, i_4_, i_25_,
					 i_26_,
					 (Class360.aClass168Array5502
					  [Class194.aBool2302 ? 1 : 0]),
					 1695778506);
		    }
		    if (!Class21.myPlayer.hidden)
			class103.method2263((class58.anInt850 * 439139681 / 2
					     + i - 1),
					    i_4_ + (class58.scrollMinY
						    * 1463495207 / 2) - 1,
					    3, 3, -1, (byte) -44);
		}
	    } else if (null != class135)
		class103.method2495(-16777216, class135, i, i_4_);
	}
    }
    
    public static Class241_Sub39_Sub6 method7495
	(int i, Class42 class42, RSByteBuffer class241_sub3, byte i_27_) {
	if (class42 == Class42.aClass42_599)
	    return new Class241_Sub39_Sub6_Sub1(i, class241_sub3);
	if (Class42.aClass42_600 == class42)
	    return new Class241_Sub39_Sub6_Sub2(i, class241_sub3);
	return null;
    }
}
