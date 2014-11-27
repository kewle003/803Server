/* Class241_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;

import jaclib.hardware_info.HardwareInfo;

public class Class241_Sub12 extends Node
{
    static final int anInt8906 = 1;
    int anInt8907;
    static final int anInt8908 = 2;
    int anInt8909;
    static final int anInt8910 = 4;
    static final int anInt8911 = 3;
    boolean aBool8912;
    static final int anInt8913 = 7;
    static final int anInt8914 = 2;
    int anInt8915;
    static final int anInt8916 = 3;
    static final int anInt8917 = 5;
    static final int anInt8918 = 6;
    static final int anInt8919 = 7;
    static final int anInt8920 = 8;
    static final int anInt8921 = 9;
    static final int anInt8922 = 3;
    static final int anInt8923 = 21;
    static final int anInt8924 = 22;
    String aString8925;
    static final int anInt8926 = 1;
    static final int anInt8927 = 1;
    static final int anInt8928 = 2;
    static final int anInt8929 = 20;
    static final int anInt8930 = 4;
    static final int anInt8931 = 4;
    public int anInt8932;
    int anInt8933;
    public int anInt8934;
    boolean aBool8935;
    int anInt8936;
    static final int anInt8937 = 0;
    int anInt8938;
    String aString8939;
    public int anInt8940;
    int anInt8941;
    String aString8942;
    String aString8943;
    public static final int anInt8944 = 0;
    String aString8945;
    int anInt8946;
    int anInt8947;
    int anInt8948;
    int anInt8949;
    String aString8950;
    String aString8951;
    int[] anIntArray8952 = new int[3];
    int anInt8953;
    static final int anInt8954 = 23;
    
    void method14953() {
	if (((Class241_Sub12) this).aString8942.length() > 40)
	    ((Class241_Sub12) this).aString8942
		= ((Class241_Sub12) this).aString8942.substring(0, 40);
	if (((Class241_Sub12) this).aString8939.length() > 40)
	    ((Class241_Sub12) this).aString8939
		= ((Class241_Sub12) this).aString8939.substring(0, 40);
	if (((Class241_Sub12) this).aString8943.length() > 10)
	    ((Class241_Sub12) this).aString8943
		= ((Class241_Sub12) this).aString8943.substring(0, 10);
	if (((Class241_Sub12) this).aString8945.length() > 10)
	    ((Class241_Sub12) this).aString8945
		= ((Class241_Sub12) this).aString8945.substring(0, 10);
	if (((Class241_Sub12) this).aString8925.length() > 120)
	    ((Class241_Sub12) this).aString8925
		= ((Class241_Sub12) this).aString8925.substring(0, 120);
    }
    
    public int method14954(byte i) {
	int i_0_ = 38;
	i_0_ += Class467.method10740(((Class241_Sub12) this).aString8942,
				     -18130900);
	i_0_ += Class467.method10740(((Class241_Sub12) this).aString8939,
				     -18130900);
	i_0_ += Class467.method10740(((Class241_Sub12) this).aString8943,
				     -18130900);
	i_0_ += Class467.method10740(((Class241_Sub12) this).aString8945,
				     -18130900);
	i_0_ += Class467.method10740(((Class241_Sub12) this).aString8950,
				     -18130900);
	i_0_ += Class467.method10740(((Class241_Sub12) this).aString8951,
				     -18130900);
	i_0_ += Class467.method10740(((Class241_Sub12) this).aString8925,
				     -18130900);
	return i_0_;
    }
    
    public Class241_Sub12(boolean bool) {
	if (bool) {
	    if (Class83.osName.startsWith("win"))
		((Class241_Sub12) this).anInt8915 = -322391921;
	    else if (Class83.osName.startsWith("mac"))
		((Class241_Sub12) this).anInt8915 = -644783842;
	    else if (Class83.osName.startsWith("linux"))
		((Class241_Sub12) this).anInt8915 = -967175763;
	    else
		((Class241_Sub12) this).anInt8915 = -1289567684;
	    if (Class320.osArchRaw.startsWith("amd64")
		|| Class320.osArchRaw.startsWith("x86_64"))
		((Class241_Sub12) this).aBool8912 = true;
	    else
		((Class241_Sub12) this).aBool8912 = false;
	    if (1 == ((Class241_Sub12) this).anInt8915 * -939364753) {
		if (Class241_Sub39_Sub2.osVersionRaw.indexOf("4.0") != -1)
		    ((Class241_Sub12) this).anInt8936 = -1875580721;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("4.1") != -1)
		    ((Class241_Sub12) this).anInt8936 = 543805854;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("4.9") != -1)
		    ((Class241_Sub12) this).anInt8936 = -1331774867;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("5.0") != -1)
		    ((Class241_Sub12) this).anInt8936 = 1087611708;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("5.1") != -1)
		    ((Class241_Sub12) this).anInt8936 = -787969013;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("5.2") != -1)
		    ((Class241_Sub12) this).anInt8936 = -2119743880;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("6.0") != -1)
		    ((Class241_Sub12) this).anInt8936 = 1631417562;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("6.1") != -1)
		    ((Class241_Sub12) this).anInt8936 = -244163159;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("6.2") != -1)
		    ((Class241_Sub12) this).anInt8936 = 299642695;
	    } else if (((Class241_Sub12) this).anInt8915 * -939364753 == 2) {
		if (Class241_Sub39_Sub2.osVersionRaw.indexOf("10.4") != -1)
		    ((Class241_Sub12) this).anInt8936 = 1143091244;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("10.5")
			 != -1)
		    ((Class241_Sub12) this).anInt8936 = -732489477;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("10.6")
			 != -1)
		    ((Class241_Sub12) this).anInt8936 = 1686897098;
		else if (Class241_Sub39_Sub2.osVersionRaw.indexOf("10.7")
			 != -1)
		    ((Class241_Sub12) this).anInt8936 = -188683623;
	    }
	    if (Class222.javaVendor.toLowerCase().indexOf("sun") != -1)
		((Class241_Sub12) this).anInt8953 = -1694085227;
	    else if (Class222.javaVendor.toLowerCase().indexOf("microsoft")
		     != -1)
		((Class241_Sub12) this).anInt8953 = 906796842;
	    else if (Class222.javaVendor.toLowerCase().indexOf("apple") != -1)
		((Class241_Sub12) this).anInt8953 = -787288385;
	    else
		((Class241_Sub12) this).anInt8953 = 1813593684;
	    int i = 2;
	    int i_1_ = 0;
	    try {
		for (/**/; i < InterfaceDefinition.javaVersion.length(); i++) {
		    int i_2_ = InterfaceDefinition.javaVersion.charAt(i);
		    if (i_2_ < 48 || i_2_ > 57)
			break;
		    i_1_ = i_1_ * 10 + (i_2_ - 48);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    anInt8932 = i_1_ * -1062752361;
	    i = InterfaceDefinition.javaVersion.indexOf('.', 2) + 1;
	    i_1_ = 0;
	    try {
		for (/**/; i < InterfaceDefinition.javaVersion.length(); i++) {
		    int i_3_ = InterfaceDefinition.javaVersion.charAt(i);
		    if (i_3_ < 48 || i_3_ > 57)
			break;
		    i_1_ = i_1_ * 10 + (i_3_ - 48);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    ((Class241_Sub12) this).anInt8933 = 1516721135 * i_1_;
	    i = InterfaceDefinition.javaVersion.indexOf('_', 4) + 1;
	    i_1_ = 0;
	    try {
		for (/**/; i < InterfaceDefinition.javaVersion.length(); i++) {
		    int i_4_ = InterfaceDefinition.javaVersion.charAt(i);
		    if (i_4_ < 48 || i_4_ > 57)
			break;
		    i_1_ = 10 * i_1_ + (i_4_ - 48);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    anInt8934 = i_1_ * -1221559225;
	    ((Class241_Sub12) this).aBool8935 = false;
	    ((Class241_Sub12) this).anInt8907
		= GameShell3.maxmemory * -120938385;
	    if (anInt8932 * -877281241 > 3)
		((Class241_Sub12) this).anInt8938
		    = GameShell3.cpucount * 1083602251;
	    else
		((Class241_Sub12) this).anInt8938 = 0;
	    try {
		int[] is = HardwareInfo.getCPUInfo();
		if (null != is && is.length == 3) {
		    ((Class241_Sub12) this).anInt8948 = is[0] * 563960227;
		    ((Class241_Sub12) this).anInt8941 = -1059609869 * is[1];
		    anInt8940 = is[2] * 630210131;
		}
		int[] is_5_ = HardwareInfo.getRawCPUInfo();
		if (is_5_ != null && 0 == is_5_.length % 5) {
		    HashMap hashmap = new HashMap();
		    for (int i_6_ = 0; i_6_ < is_5_.length / 5; i_6_++) {
			int i_7_ = is_5_[i_6_ * 5];
			int i_8_ = is_5_[i_6_ * 5 + 1];
			int i_9_ = is_5_[2 + 5 * i_6_];
			int i_10_ = is_5_[i_6_ * 5 + 3];
			int i_11_ = is_5_[i_6_ * 5 + 4];
			Class417 class417
			    = new Class417(i_7_, i_8_, i_9_, i_10_, i_11_);
			hashmap.put(Integer.valueOf(i_7_), class417);
		    }
		    Class417 class417
			= (Class417) hashmap.get(Integer.valueOf(0));
		    if (null != class417) {
			RSByteBuffer class241_sub3 = new RSByteBuffer(13);
			class241_sub3.method14687((((Class417) class417)
						   .anInt6015) * -1099864045,
						  1667437844);
			class241_sub3.method14687((((Class417) class417)
						   .anInt6017) * -1924929961,
						  23075455);
			class241_sub3.method14687((-2116219055
						   * (((Class417) class417)
						      .anInt6016)),
						  -474056966);
			class241_sub3.pointer = 0;
			((Class241_Sub12) this).aString8950
			    = class241_sub3.readString(123675176);
		    }
		    Class417 class417_12_
			= (Class417) hashmap.get(Integer.valueOf(1));
		    if (class417_12_ != null) {
			((Class241_Sub12) this).anInt8909
			    = ((Class417) class417_12_).anInt6013 * 164710653;
			int i_13_ = (((Class417) class417_12_).anInt6015
				     * -1099864045);
			((Class241_Sub12) this).anInt8949
			    = 1402638937 * (i_13_ >> 16 & 0xff);
			((Class241_Sub12) this).anIntArray8952[0]
			    = (-2116219055
			       * ((Class417) class417_12_).anInt6016);
			((Class241_Sub12) this).anIntArray8952[1]
			    = (-1924929961
			       * ((Class417) class417_12_).anInt6017);
		    }
		    Class417 class417_14_
			= (Class417) hashmap.get(Integer.valueOf(-2147483647));
		    if (null != class417_14_)
			((Class241_Sub12) this).anIntArray8952[2]
			    = (((Class417) class417_14_).anInt6017
			       * -1924929961);
		    RSByteBuffer class241_sub3 = new RSByteBuffer(49);
		    for (int i_15_ = -2147483646; i_15_ <= -2147483644;
			 i_15_++) {
			Class417 class417_16_
			    = (Class417) hashmap.get(Integer.valueOf(i_15_));
			if (class417_16_ != null) {
			    class241_sub3.method14687((((Class417)
							class417_16_).anInt6013
						       * -1595823875),
						      -400082130);
			    class241_sub3.method14687((-1099864045
						       * (((Class417)
							   class417_16_)
							  .anInt6015)),
						      1156222222);
			    class241_sub3.method14687((((Class417)
							class417_16_).anInt6016
						       * -2116219055),
						      1315660141);
			    class241_sub3.method14687((-1924929961
						       * (((Class417)
							   class417_16_)
							  .anInt6017)),
						      -1686241600);
			}
		    }
		    class241_sub3.pointer = 0;
		    ((Class241_Sub12) this).aString8951
			= class241_sub3.readString(-1482168371);
		}
		String[][] strings
		    = HardwareInfo.getDXDiagDisplayDevicesProps();
		if (null != strings && strings.length > 0
		    && null != strings[0]) {
		    for (int i_17_ = 0; i_17_ < strings[0].length;
			 i_17_ += 2) {
			if (strings[0][i_17_]
				.equalsIgnoreCase("szDescription"))
			    ((Class241_Sub12) this).aString8942
				= strings[0][i_17_ + 1];
			else if (strings[0][i_17_].equalsIgnoreCase
				 ("szDriverDateEnglish")) {
			    String string = strings[0][1 + i_17_];
			    try {
				int i_18_ = string.indexOf("/");
				int i_19_ = string.indexOf("/", i_18_ + 1);
				((Class241_Sub12) this).anInt8947
				    = ((Integer.parseInt
					(string.substring(0, i_18_)))
				       * 1290858255);
				((Class241_Sub12) this).anInt8946
				    = ((Integer.parseInt
					(string.substring
					 (i_19_ + 1,
					  string.indexOf(" ", i_19_))))
				       * -706610717);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
		    }
		}
		String[] strings_20_ = HardwareInfo.getDXDiagSystemProps();
		if (null != strings_20_) {
		    String string = "";
		    String string_21_ = "";
		    String string_22_ = "";
		    for (int i_23_ = 0; i_23_ < strings_20_.length;
			 i_23_ += 2) {
			if (strings_20_[i_23_]
				.equalsIgnoreCase("dwDirectXVersionMajor"))
			    string = strings_20_[1 + i_23_];
			else if (strings_20_[i_23_].equalsIgnoreCase
				 ("dwDirectXVersionMinor"))
			    string_21_ = strings_20_[1 + i_23_];
			else if (strings_20_[i_23_].equalsIgnoreCase
				 ("dwDirectXVersionLetter"))
			    string_22_ = strings_20_[i_23_ + 1];
		    }
		    ((Class241_Sub12) this).aString8943
			= new StringBuilder().append(string).append(".").append
			      (string_21_).append
			      (string_22_).toString();
		}
	    } catch (Throwable throwable) {
		anInt8940 = 0;
	    }
	}
	if (((Class241_Sub12) this).aString8942 == null)
	    ((Class241_Sub12) this).aString8942 = "";
	if (null == ((Class241_Sub12) this).aString8939)
	    ((Class241_Sub12) this).aString8939 = "";
	if (null == ((Class241_Sub12) this).aString8943)
	    ((Class241_Sub12) this).aString8943 = "";
	if (((Class241_Sub12) this).aString8945 == null)
	    ((Class241_Sub12) this).aString8945 = "";
	if (((Class241_Sub12) this).aString8950 == null)
	    ((Class241_Sub12) this).aString8950 = "";
	if (null == ((Class241_Sub12) this).aString8951)
	    ((Class241_Sub12) this).aString8951 = "";
	if (null == ((Class241_Sub12) this).aString8925)
	    ((Class241_Sub12) this).aString8925 = "";
	method14959(-998705801);
    }
    
    public void method14955(RSByteBuffer class241_sub3) {
	class241_sub3.writeByte(7, -2087966529);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8915
				   * -939364753),
				  -1989090828);
	class241_sub3.writeByte(((Class241_Sub12) this).aBool8912 ? 1 : 0,
				  99154169);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8936
				   * 1529814575),
				  -861847720);
	class241_sub3.writeByte((463897533
				   * ((Class241_Sub12) this).anInt8953),
				  -1574242833);
	class241_sub3.writeByte(anInt8932 * -877281241, 430602242);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8933
				   * -737789169),
				  251124768);
	class241_sub3.writeByte(-1844155017 * anInt8934, -1112927179);
	class241_sub3.writeByte(((Class241_Sub12) this).aBool8935 ? 1 : 0,
				  275770303);
	class241_sub3.writeShort((((Class241_Sub12) this).anInt8907
				   * -1724165573),
				  -484048531);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8938
				   * -832140659),
				  1672565680);
	class241_sub3.writeTriByte(anInt8940 * -2096187941, 1239139244);
	class241_sub3.writeShort((855983675
				   * ((Class241_Sub12) this).anInt8941),
				  -484048531);
	class241_sub3.method14630(((Class241_Sub12) this).aString8942,
				  -1789699806);
	class241_sub3.method14630(((Class241_Sub12) this).aString8939,
				  -2057905086);
	class241_sub3.method14630(((Class241_Sub12) this).aString8943,
				  -1421295984);
	class241_sub3.method14630(((Class241_Sub12) this).aString8945,
				  1102259359);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8947
				   * -536731665),
				  -14987165);
	class241_sub3.writeShort((237048779
				   * ((Class241_Sub12) this).anInt8946),
				  -484048531);
	class241_sub3.method14630(((Class241_Sub12) this).aString8950,
				  1411354971);
	class241_sub3.method14630(((Class241_Sub12) this).aString8951,
				  -2103262754);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8948
				   * 1454154251),
				  1395919170);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8949
				   * -673475095),
				  -1733365016);
	for (int i = 0; i < ((Class241_Sub12) this).anIntArray8952.length; i++)
	    class241_sub3.writeInt((((Class241_Sub12) this).anIntArray8952
				       [i]),
				      -70790263);
	class241_sub3.writeInt((((Class241_Sub12) this).anInt8909
				   * -1880104959),
				  -1812482202);
	class241_sub3.method14630(((Class241_Sub12) this).aString8925,
				  -1258292496);
    }
    
    public void method14956(RSByteBuffer class241_sub3, int i) {
	class241_sub3.writeByte(7, -915306433);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8915
				   * -939364753),
				  -1838929740);
	class241_sub3.writeByte(((Class241_Sub12) this).aBool8912 ? 1 : 0,
				  -1917977512);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8936
				   * 1529814575),
				  428617510);
	class241_sub3.writeByte((463897533
				   * ((Class241_Sub12) this).anInt8953),
				  806279738);
	class241_sub3.writeByte(anInt8932 * -877281241, 211096627);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8933
				   * -737789169),
				  926541756);
	class241_sub3.writeByte(-1844155017 * anInt8934, -456117035);
	class241_sub3.writeByte(((Class241_Sub12) this).aBool8935 ? 1 : 0,
				  -1967207461);
	class241_sub3.writeShort((((Class241_Sub12) this).anInt8907
				   * -1724165573),
				  -484048531);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8938
				   * -832140659),
				  -1873381475);
	class241_sub3.writeTriByte(anInt8940 * -2096187941, 1276581133);
	class241_sub3.writeShort((855983675
				   * ((Class241_Sub12) this).anInt8941),
				  -484048531);
	class241_sub3.method14630(((Class241_Sub12) this).aString8942,
				  242842331);
	class241_sub3.method14630(((Class241_Sub12) this).aString8939,
				  1603589621);
	class241_sub3.method14630(((Class241_Sub12) this).aString8943,
				  1571472783);
	class241_sub3.method14630(((Class241_Sub12) this).aString8945,
				  -1453862510);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8947
				   * -536731665),
				  1429747189);
	class241_sub3.writeShort((237048779
				   * ((Class241_Sub12) this).anInt8946),
				  -484048531);
	class241_sub3.method14630(((Class241_Sub12) this).aString8950,
				  1235059626);
	class241_sub3.method14630(((Class241_Sub12) this).aString8951,
				  100329830);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8948
				   * 1454154251),
				  -1578311308);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8949
				   * -673475095),
				  660481120);
	for (int i_24_ = 0;
	     i_24_ < ((Class241_Sub12) this).anIntArray8952.length; i_24_++)
	    class241_sub3.writeInt((((Class241_Sub12) this).anIntArray8952
				       [i_24_]),
				      -730241498);
	class241_sub3.writeInt((((Class241_Sub12) this).anInt8909
				   * -1880104959),
				  1911063032);
	class241_sub3.method14630(((Class241_Sub12) this).aString8925,
				  1388242242);
    }
    
    void method14957() {
	if (((Class241_Sub12) this).aString8942.length() > 40)
	    ((Class241_Sub12) this).aString8942
		= ((Class241_Sub12) this).aString8942.substring(0, 40);
	if (((Class241_Sub12) this).aString8939.length() > 40)
	    ((Class241_Sub12) this).aString8939
		= ((Class241_Sub12) this).aString8939.substring(0, 40);
	if (((Class241_Sub12) this).aString8943.length() > 10)
	    ((Class241_Sub12) this).aString8943
		= ((Class241_Sub12) this).aString8943.substring(0, 10);
	if (((Class241_Sub12) this).aString8945.length() > 10)
	    ((Class241_Sub12) this).aString8945
		= ((Class241_Sub12) this).aString8945.substring(0, 10);
	if (((Class241_Sub12) this).aString8925.length() > 120)
	    ((Class241_Sub12) this).aString8925
		= ((Class241_Sub12) this).aString8925.substring(0, 120);
    }
    
    public void method14958(RSByteBuffer class241_sub3) {
	class241_sub3.writeByte(7, -976705375);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8915
				   * -939364753),
				  173550426);
	class241_sub3.writeByte(((Class241_Sub12) this).aBool8912 ? 1 : 0,
				  -1032534431);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8936
				   * 1529814575),
				  -2115769035);
	class241_sub3.writeByte((463897533
				   * ((Class241_Sub12) this).anInt8953),
				  639555178);
	class241_sub3.writeByte(anInt8932 * -877281241, -210441636);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8933
				   * -737789169),
				  383806692);
	class241_sub3.writeByte(-1844155017 * anInt8934, -1557392916);
	class241_sub3.writeByte(((Class241_Sub12) this).aBool8935 ? 1 : 0,
				  116766434);
	class241_sub3.writeShort((((Class241_Sub12) this).anInt8907
				   * -1724165573),
				  -484048531);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8938
				   * -832140659),
				  -677733321);
	class241_sub3.writeTriByte(anInt8940 * -2096187941, 453379553);
	class241_sub3.writeShort((855983675
				   * ((Class241_Sub12) this).anInt8941),
				  -484048531);
	class241_sub3.method14630(((Class241_Sub12) this).aString8942,
				  -1532630585);
	class241_sub3.method14630(((Class241_Sub12) this).aString8939,
				  -334823717);
	class241_sub3.method14630(((Class241_Sub12) this).aString8943,
				  1877491316);
	class241_sub3.method14630(((Class241_Sub12) this).aString8945,
				  -552039767);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8947
				   * -536731665),
				  -40025917);
	class241_sub3.writeShort((237048779
				   * ((Class241_Sub12) this).anInt8946),
				  -484048531);
	class241_sub3.method14630(((Class241_Sub12) this).aString8950,
				  1243110508);
	class241_sub3.method14630(((Class241_Sub12) this).aString8951,
				  -1218613530);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8948
				   * 1454154251),
				  1386559930);
	class241_sub3.writeByte((((Class241_Sub12) this).anInt8949
				   * -673475095),
				  -1480434423);
	for (int i = 0; i < ((Class241_Sub12) this).anIntArray8952.length; i++)
	    class241_sub3.writeInt((((Class241_Sub12) this).anIntArray8952
				       [i]),
				      -1635412367);
	class241_sub3.writeInt((((Class241_Sub12) this).anInt8909
				   * -1880104959),
				  1438990429);
	class241_sub3.method14630(((Class241_Sub12) this).aString8925,
				  1471019192);
    }
    
    void method14959(int i) {
	if (((Class241_Sub12) this).aString8942.length() > 40)
	    ((Class241_Sub12) this).aString8942
		= ((Class241_Sub12) this).aString8942.substring(0, 40);
	if (((Class241_Sub12) this).aString8939.length() > 40)
	    ((Class241_Sub12) this).aString8939
		= ((Class241_Sub12) this).aString8939.substring(0, 40);
	if (((Class241_Sub12) this).aString8943.length() > 10)
	    ((Class241_Sub12) this).aString8943
		= ((Class241_Sub12) this).aString8943.substring(0, 10);
	if (((Class241_Sub12) this).aString8945.length() > 10)
	    ((Class241_Sub12) this).aString8945
		= ((Class241_Sub12) this).aString8945.substring(0, 10);
	if (((Class241_Sub12) this).aString8925.length() > 120)
	    ((Class241_Sub12) this).aString8925
		= ((Class241_Sub12) this).aString8925.substring(0, 120);
    }
    
    public int method14960() {
	int i = 38;
	i += Class467.method10740(((Class241_Sub12) this).aString8942,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8939,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8943,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8945,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8950,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8951,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8925,
				  -18130900);
	return i;
    }
    
    public int method14961() {
	int i = 38;
	i += Class467.method10740(((Class241_Sub12) this).aString8942,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8939,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8943,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8945,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8950,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8951,
				  -18130900);
	i += Class467.method10740(((Class241_Sub12) this).aString8925,
				  -18130900);
	return i;
    }
    
    static final void method14962(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aBool8267 ? 1 : 0;
    }
}
