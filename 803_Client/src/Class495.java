/* Class495 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class495 implements VarDomain
{
    ClanSettings clanSettings;//aClass374_6522
    static JS5 aClass210_6523;
    
    public long getVarValueLong(VarType type, byte i) {
		Long value = clanSettings.method6705(
				(client.currentGame.anInt6357 * -1202509675 << 16
				   | type.id * 414229387), (byte) -4);
		if (value == null) {
		    return ((Long) type.getDefaultValue(1844954279)).longValue();
		}
		return value.longValue();
    }
    
    public void dummyMethod83(VarType class179, int i) {
    	throw new UnsupportedOperationException();
    }
    
    Class495(ClanSettings settings) {
    	clanSettings = settings;
    }
    
    public Object getVarValue(VarType type, int i) {
		if (type.dataType != ScriptVarType.STRING) {
		    throw new IllegalArgumentException("");
		}
		return clanSettings.method6670(
				(-1202509675 * client.currentGame.anInt6357 << 16
						| 414229387 * type.id), 1186810875);
    }
    
    public int getVarBitValue(VarBitType type, short i) {
    	return type.getVarbitValue(getVarValueInt(type.baseVar, -1592469554), 1331836255);
    }
    
    public void setVarValueInt(VarType class179, int i, int i_0_) {
    	throw new UnsupportedOperationException();
    }
    
    public int getVarValueInt(VarType type, int i) {
		Integer value = clanSettings.getVarValueInt(
				(client.currentGame.anInt6357 * -1202509675 << 16 | 414229387 * type.id), 2036208753);
		if (null == value) {
		    return ((Integer) type.getDefaultValue(2025426224)).intValue();
		}
		return value.intValue();
    }
    
    public void method74(VarType class179, long l) {
    	throw new UnsupportedOperationException();
    }
    
    public void setVarValue(VarType class179, Object object, byte i) {
    	throw new UnsupportedOperationException();
    }
    
    public int dummyMethod67(VarType class179) {
	Integer integer
	    = (clanSettings.getVarValueInt
	       ((client.currentGame.anInt6357 * -1202509675 << 16
		 | 414229387 * class179.id),
		2012716745));
	if (null == integer)
	    return ((Integer) class179.getDefaultValue(2054060557)).intValue();
	return integer.intValue();
    }
    
    public int dummyMethod66(VarType class179) {
	Integer integer
	    = (clanSettings.getVarValueInt
	       ((client.currentGame.anInt6357 * -1202509675 << 16
		 | 414229387 * class179.id),
		1833051336));
	if (null == integer)
	    return ((Integer) class179.getDefaultValue(1995837592)).intValue();
	return integer.intValue();
    }
    
    public int dummyMethod65(VarType class179) {
	Integer integer
	    = (clanSettings.getVarValueInt
	       ((client.currentGame.anInt6357 * -1202509675 << 16
		 | 414229387 * class179.id),
		1746556484));
	if (null == integer)
	    return ((Integer) class179.getDefaultValue(1777172513)).intValue();
	return integer.intValue();
    }
    
    public int dummyMethod70(VarType class179) {
	Integer integer
	    = (clanSettings.getVarValueInt
	       ((client.currentGame.anInt6357 * -1202509675 << 16
		 | 414229387 * class179.id),
		2035822218));
	if (null == integer)
	    return ((Integer) class179.getDefaultValue(2097399198)).intValue();
	return integer.intValue();
    }
    
    public int dummyMethod71(VarBitType class316) {
	return class316.getVarbitValue(getVarValueInt(class316.baseVar,
					    -883524795),
				   1168050372);
    }
    
    public int dummyMethod72(VarBitType class316) {
	return class316.getVarbitValue(getVarValueInt(class316.baseVar,
					    -1601271568),
				   1460643783);
    }
    
    public long method87(VarType class179) {
	Long var_long = (clanSettings.method6705
			 ((client.currentGame.anInt6357 * -1202509675 << 16
			   | class179.id * 414229387),
			  (byte) -110));
	if (var_long == null)
	    return ((Long) class179.getDefaultValue(1903618292)).longValue();
	return var_long.longValue();
    }
    
    public void dummyMethod82(VarType class179, int i) {
	throw new UnsupportedOperationException();
    }
    
    public void dummyMethod84(VarType class179, int i) {
	throw new UnsupportedOperationException();
    }
    
    public long method85(VarType class179) {
	Long var_long = (clanSettings.method6705
			 ((client.currentGame.anInt6357 * -1202509675 << 16
			   | class179.id * 414229387),
			  (byte) -63));
	if (var_long == null)
	    return ((Long) class179.getDefaultValue(1785432214)).longValue();
	return var_long.longValue();
    }
    
    public long method86(VarType class179) {
	Long var_long = (clanSettings.method6705
			 ((client.currentGame.anInt6357 * -1202509675 << 16
			   | class179.id * 414229387),
			  (byte) 16));
	if (var_long == null)
	    return ((Long) class179.getDefaultValue(1899536285)).longValue();
	return var_long.longValue();
    }
    
    public void setVarBitValue(VarBitType class316, int i, int i_1_) {
    	throw new UnsupportedOperationException();
    }
    
    public void dummyMethod76(VarBitType class316, int i) {
    	throw new UnsupportedOperationException();
    }
    
    public void method88(VarType class179, long l) {
    	throw new UnsupportedOperationException();
    }
    
    public void method89(VarType class179, long l) {
    	throw new UnsupportedOperationException();
    }
    
    public Object dummyMethod73(VarType type) {
		if (type.dataType != ScriptVarType.STRING) {
		    throw new IllegalArgumentException("");
		}
		return (clanSettings.method6670
			((-1202509675 * client.currentGame.anInt6357 << 16
			  | 414229387 * type.id),
			 1186810875));
    }
    
    public void dummyMethod90(VarType class179, Object object) {
    	throw new UnsupportedOperationException();
    }
    
    public void method91(VarBitType class316, int i) {
    	throw new UnsupportedOperationException();
    }
    
    public void setVarValueLong(VarType class179, long l) {
    	throw new UnsupportedOperationException();
    }
    
    static final void storeClanBanCount/*method11282*/(ClientScriptData scriptData, int i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= -1789847393 * scriptData.clanSettings.banCount;
    }
    
    public static void method11283(int i) {
	synchronized (ObjectDefinition.aclient6907) {
	    if (null != Class228.aFrame2674) {
		/* empty */
	    } else {
		Container container = Class109.getTopContainer((byte) 10);
		if (null == container) {
		    /* empty */
		} else {
		    Class294.frameWid
			= container.getSize().width * -1987094301;
		    Class43.frameHei
			= container.getSize().height * -1914494005;
		    if (Class241_Sub40_Sub1.frame == container) {
			Insets insets
			    = Class241_Sub40_Sub1.frame.getInsets();
			Class294.frameWid
			    -= -1987094301 * (insets.left + insets.right);
			Class43.frameHei
			    -= -1914494005 * (insets.top + insets.bottom);
		    }
		    if (Class294.frameWid * 884255947 <= 0)
			Class294.frameWid = -1987094301;
		    if (-828675613 * Class43.frameHei <= 0)
			Class43.frameHei = -1914494005;
		    if (Class474.getDisplayMode(1220927330) != 1)
			JSFunction.method6229((byte) -51);
		    else {
			Class494.canvasWid = -864153001 * client.anInt8432;
			client.leftMargin
			    = -490474037 * ((884255947 * Class294.frameWid
					     - client.anInt8432 * -2047397293)
					    / 2);
			Class67.canvasHei = 361973913 * client.anInt8433;
			client.topMargin = 0;
		    }
		    if (Class416.aClass470_6012 != Class470.aClass470_6345
			&& -1080559003 * Class494.canvasWid < 1024
			&& Class67.canvasHei * 963058943 >= 768) {
			/* empty */
		    }
		    Class344.canvas.setSize((Class494.canvasWid
						  * -1080559003),
						 (963058943
						  * Class67.canvasHei));
		    if (null != Class236.aClass103_2713)
			Class236.aClass103_2713.method2424
			    (Class344.canvas,
			     Class494.canvasWid * -1080559003,
			     Class67.canvasHei * 963058943, -1267275510);
		    if (Class241_Sub40_Sub1.frame == container) {
			Insets insets
			    = Class241_Sub40_Sub1.frame.getInsets();
			Class344.canvas.setLocation
			    (client.leftMargin * -2063759389 + insets.left,
			     client.topMargin * 303720107 + insets.top);
		    } else
			Class344.canvas.setLocation((-2063759389
							  * client.leftMargin),
							 (303720107
							  * client.topMargin));
		    Class88.method1856((byte) -83);
		    if (1629309841 * client.anInt8466 != -1)
			Class105_Sub1_Sub3_Sub1.method17885(true, -1839871006);
		    Class109.method2765((byte) -98);
		}
	    }
	}
    }
    
    public static void method11284(int[] is, int[] is_2_, int i, int i_3_,
				   int i_4_) {
	if (i < i_3_) {
	    int i_5_ = (i + i_3_) / 2;
	    int i_6_ = i;
	    int i_7_ = is[i_5_];
	    is[i_5_] = is[i_3_];
	    is[i_3_] = i_7_;
	    int i_8_ = is_2_[i_5_];
	    is_2_[i_5_] = is_2_[i_3_];
	    is_2_[i_3_] = i_8_;
	    int i_9_ = i_7_ == 2147483647 ? 0 : 1;
	    for (int i_10_ = i; i_10_ < i_3_; i_10_++) {
		if (is[i_10_] < (i_10_ & i_9_) + i_7_) {
		    int i_11_ = is[i_10_];
		    is[i_10_] = is[i_6_];
		    is[i_6_] = i_11_;
		    int i_12_ = is_2_[i_10_];
		    is_2_[i_10_] = is_2_[i_6_];
		    is_2_[i_6_++] = i_12_;
		}
	    }
	    is[i_3_] = is[i_6_];
	    is[i_6_] = i_7_;
	    is_2_[i_3_] = is_2_[i_6_];
	    is_2_[i_6_] = i_8_;
	    method11284(is, is_2_, i, i_6_ - 1, -574134170);
	    method11284(is, is_2_, i_6_ + 1, i_3_, -2107104429);
	}
    }
}
