/* Class502 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;

public class SkillDefaults implements Iterable<Skill>
{
    Skill[] skills;//aClass511Array6613
    
    public Iterator<?> method11446() {
    	return new SkillTypeIterator(skills);
    }
    
    void decode/*method11447*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) -22);
		    if (0 == opcode) {
		    	break;
		    }
		    if (opcode == 1) {
				int count = buffer.readUnsignedByte((byte) 40);
				int lastSkill = 0;
				LinkedList<Skill> skillList = new LinkedList<Skill>();
				for (int index = 0; index < count; index++) {
				    int skillID = buffer.readUnsignedByte((byte) -33);
				    int i_5_ = buffer.readUnsignedShort(1162222719);
				    int flags = buffer.readUnsignedByte((byte) -2);
				    boolean bool = 0 != (flags & 0x1);
				    int i_7_ = 0;
				    if ((flags & 0x2) != 0) {
				    	i_7_ = buffer.readUnsignedByte((byte) 29);
				    }
				    boolean bool_8_ = buffer.readUnsignedByte((byte) 73) == 1;
				    skillList.add(new Skill(skillID, i_5_, bool, bool_8_, i_7_));
				    if (skillID > lastSkill) {
				    	lastSkill = skillID;
				    }
				}
				skills = new Skill[1 + lastSkill];
				Iterator<Skill> iterator = skillList.iterator();
				while (iterator.hasNext()) {
				    Skill class511 = (Skill) iterator.next();
				    skills[class511.getID((short) 26164)] = class511;
				}
		    }
		}
    }
    
    public int method11448(int i) {
	return skills.length;
    }
    
    public Skill method11449(int i) {
	return skills[i];
    }
    
    public Iterator<Skill> iterator() {
    	return new SkillTypeIterator(skills);
    }
    
    void method11450(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 73);
	    if (0 == i)
		break;
	    if (i == 1) {
		int i_9_ = class241_sub3.readUnsignedByte((byte) 46);
		int i_10_ = 0;
		LinkedList<Skill> linkedlist = new LinkedList<Skill>();
		for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
		    int i_12_ = class241_sub3.readUnsignedByte((byte) -27);
		    int i_13_ = class241_sub3.readUnsignedShort(1162222719);
		    int i_14_ = class241_sub3.readUnsignedByte((byte) -71);
		    boolean bool = 0 != (i_14_ & 0x1);
		    int i_15_ = 0;
		    if ((i_14_ & 0x2) != 0)
			i_15_ = class241_sub3.readUnsignedByte((byte) 70);
		    boolean bool_16_
			= class241_sub3.readUnsignedByte((byte) -35) == 1;
		    linkedlist.add(new Skill(i_12_, i_13_, bool, bool_16_,
						i_15_));
		    if (i_12_ > i_10_)
			i_10_ = i_12_;
		}
		skills = new Skill[1 + i_10_];
		Iterator<Skill> iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
		    Skill class511 = (Skill) iterator.next();
		    skills
			[class511.getID((short) 26523)]
			= class511;
		}
	    }
	}
    }
    
    public int method11451() {
	return skills.length;
    }
    
    public SkillDefaults(JS5 class210) {
		byte[] data = class210.method4194((DefaultsGroup.SKILL.js5GroupId * 692631693),
						639131734);
		if (data == null) {
		    skills = new Skill[0];
		} else {
		    decode(new RSByteBuffer(data), -525726969);
		}
    }
    
    public int method11452() {
	return skills.length;
    }
    
    public int method11453() {
	return skills.length;
    }
    
    public Skill method11454(int i) {
	return skills[i];
    }
    
    public Skill method11455(int i, int i_17_) {
    	return skills[i];
    }
    
    public Iterator<?> method11456() {
	return new SkillTypeIterator(skills);
    }
    
    public int method11457() {
	return skills.length;
    }
    
    static final void method11458(int i, int i_18_, int i_19_, int i_20_,
				  boolean bool, int i_21_) {
	if (client.aClass238_8477.method4751(-950678320) == null)
	    Class236.aClass103_2713.method2263(i, i_18_, i_19_, i_20_,
					       -16777216, (byte) -37);
	else {
	    Class287 class287
		= (Class21.myPlayer.method10874()
		   .aClass287_4386);
	    boolean bool_22_ = false;
	    if (-831877317 * client.anInt8266 != 3) {
		if (!client.aBool8354)
		    bool_22_ = true;
	    } else {
		if ((int) class287.aFloat4477 < 0
		    || ((int) class287.aFloat4477
			>= client.aClass238_8477.method4744(-1625382273) * 512)
		    || (int) class287.aFloat4479 < 0
		    || ((int) class287.aFloat4479
			>= client.aClass238_8477.method4745(417081552) * 512))
		    bool_22_ = true;
		if (4 == Class296.anInt4513 * 115241065
		    && !Class445_Sub16.aClass351_Sub1_8660
			    .method6280(608116945))
		    bool_22_ = true;
	    }
	    if (bool_22_)
		Class236.aClass103_2713.method2263(i, i_18_, i_19_, i_20_,
						   -16777216, (byte) -125);
	    else {
		client.anInt8407 += -670256331;
		if (Class21.myPlayer != null
		    && ((int) class287.aFloat4477
			- (Class21.myPlayer
			       .method17782(-1259912716)
			   - 1) * 256) >> 9 == Class194.minimapFlagX * 1813149433
		    && (((int) class287.aFloat4479
			 - (Class21.myPlayer
				.method17782(465438054)
			    - 1) * 256) >> 9
			== Class194.minimapFlagY * 884131057)) {
		    Class194.minimapFlagX = 980260023;
		    Class194.minimapFlagY = 1262506991;
		    Class41.method1064(1020815542);
		}
		Class16.method856(-1101935092);
		if (!bool)
		    Class483.method11046(1942460979);
		Class602.method13180(-1078707678);
		for (int i_23_ = 0; i_23_ < client.aClass246Array8302.length;
		     i_23_++) {
		    if (null != client.aClass246Array8302[i_23_]
			&& !client.aClass246Array8302[i_23_]
				.method4926(-421392193)
			&& client.aClass246Array8302[i_23_]
			       .method4927(Class236.aClass103_2713, (byte) 0))
			client.aClass246Array8302[i_23_].method4923
			    (client.aClass238_8477.method4751(-1988903259),
			     (byte) 121);
		}
		Class46.method1128(i, i_18_, i_19_, i_20_, true, -94307266);
		i = client.anInt8559 * -1253702721;
		i_18_ = client.anInt8560 * -11341805;
		i_19_ = client.anInt8561 * 1045658563;
		i_20_ = -343750905 * client.anInt8562;
		Class470.method10769(i, i_18_, -825298050);
		if (Class296.anInt4513 * 115241065 == 3) {
		    int i_24_ = (int) client.aFloat8406;
		    if (client.anInt8542 * 56985941 >> 8 > i_24_)
			i_24_ = client.anInt8542 * 56985941 >> 8;
		    if (client.aBoolArray8517[4]
			&& client.anIntArray8413[4] + 128 > i_24_)
			i_24_ = 128 + client.anIntArray8413[4];
		    int i_25_ = ((client.anInt8521 * 1832425067
				  + (int) client.aFloat8581)
				 & 0x3fff);
		    Class120_Sub19.method16844
			(Class291.anInt4488 * 97141979,
			 (Class96_Sub5.method16046((int) class287.aFloat4477,
						   (int) class287.aFloat4479,
						   993680393 * (Class357_Sub1
								.anInt10357),
						   -89685807)
			  - client.anInt8385 * 1957253445),
			 Class354_Sub2.anInt10492 * 970310639, i_24_, i_25_,
			 600 + (i_24_ >> 3) * 3 << 2, i_20_, 2043118216);
		} else if (Class296.anInt4513 * 115241065 == 5) {
		    int i_26_ = (int) client.aFloat8406;
		    if (client.anInt8542 * 56985941 >> 8 > i_26_)
			i_26_ = client.anInt8542 * 56985941 >> 8;
		    if (client.aBoolArray8517[4]
			&& 128 + client.anIntArray8413[4] > i_26_)
			i_26_ = client.anIntArray8413[4] + 128;
		    int i_27_ = (int) client.aFloat8581 & 0x3fff;
		    Class120_Sub19.method16844
			(Class291.anInt4488 * 97141979,
			 ((Class96_Sub5.method16046
			   (client.anInt8557 * 1750875065,
			    -1494721987 * client.anInt8361,
			    Class357_Sub1.anInt10357 * 993680393, -87201928))
			  - client.anInt8385 * 1957253445),
			 Class354_Sub2.anInt10492 * 970310639, i_26_, i_27_,
			 (i_26_ >> 3) * 3 + 600 << 2, i_20_, 2024217455);
		} else if (2 == Class296.anInt4513 * 115241065)
		    Class117.method2930(i_20_, 1548611405);
		int i_28_ = Class462.anInt6284 * 133333741;
		int i_29_ = -781800491 * Class175.anInt2123;
		int i_30_ = Class636.anInt8248 * -271636831;
		int i_31_ = -1323229803 * Class496.anInt6527;
		int i_32_ = Class322.anInt4909 * -2112344687;
		for (int i_33_ = 0; i_33_ < 5; i_33_++) {
		    if (client.aBoolArray8517[i_33_]) {
			int i_34_
			    = (int) ((Math.random()
				      * (double) (2 * (client.anIntArray8367
						       [i_33_])
						  + 1))
				     - (double) client.anIntArray8367[i_33_]
				     + (Math.sin((double) (client
							   .anIntArray8549
							   [i_33_])
						 / 100.0
						 * (double) (client
							     .anIntArray8550
							     [i_33_]))
					* (double) (client.anIntArray8413
						    [i_33_])));
			if (0 == i_33_)
			    Class462.anInt6284 += 1680747237 * (i_34_ << 2);
			if (1 == i_33_)
			    Class175.anInt2123 += -1365297795 * (i_34_ << 2);
			if (2 == i_33_)
			    Class636.anInt8248 += (i_34_ << 2) * -1181860511;
			if (3 == i_33_)
			    Class322.anInt4909
				= (2118136689
				   * (i_34_ + Class322.anInt4909 * -2112344687
				      & 0x3fff));
			if (4 == i_33_) {
			    Class496.anInt6527 += i_34_ * 709117373;
			    if (Class496.anInt6527 * -1323229803 < 1024)
				Class496.anInt6527 = 286716928;
			    else if (-1323229803 * Class496.anInt6527 > 3072)
				Class496.anInt6527 = 860150784;
			}
		    }
		}
		if (133333741 * Class462.anInt6284 < 0)
		    Class462.anInt6284 = 0;
		if (133333741 * Class462.anInt6284
		    > ((client.aClass238_8477.method4751(-1275848730).anInt7138
			* 120442351)
		       << 9) - 1)
		    Class462.anInt6284
			= (((client.aClass238_8477.method4751(-2104434748)
			     .anInt7138) * 120442351
			    << 9)
			   - 1) * 1680747237;
		if (Class636.anInt8248 * -271636831 < 0)
		    Class636.anInt8248 = 0;
		if (-271636831 * Class636.anInt8248
		    > ((client.aClass238_8477.method4751(-2098820252).anInt7142
			* -2069974325)
		       << 9) - 1)
		    Class636.anInt8248
			= (((client.aClass238_8477.method4751(-1511256767)
			     .anInt7142) * -2069974325
			    << 9)
			   - 1) * -1181860511;
		RS3File.method7342(-1954516413);
		Class236.aClass103_2713.method2254(i, i_18_, i_19_, i_20_);
		Class236.aClass103_2713.method2279(true);
		Class236.aClass103_2713.method2445(i, i_18_, i + i_19_,
						   i_20_ + i_18_);
		Class500 class500 = client.aClass238_8477.method4833
					(432700674).method11433(-2112632459);
		int i_35_ = class500.method11370((byte) -71);
		Class79 class79 = new Class79();
		GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		if (Class518.method11661(1913716201))
		    Class78.aClass351_Sub1_1133.method6281
			(class79, client.aClass266_8290, client.aClass268_8289,
			 class522.baseX * 127679513 << 9,
			 468558693 * class522.baseY << 9, 2116600775);
		else if (Class296.anInt4513 * 115241065 == 4)
		    Class445_Sub16.aClass351_Sub1_8660.method6281
			(class79, client.aClass266_8290, client.aClass268_8289,
			 class522.baseX * 127679513 << 9,
			 468558693 * class522.baseY << 9, 997903844);
		else {
		    client.aClass266_8290.method5131
			((float) -(Class462.anInt6284 * 133333741),
			 (float) -(-781800491 * Class175.anInt2123),
			 (float) -(Class636.anInt8248 * -271636831));
		    client.aClass266_8290.method5128
			(0.0F, -1.0F, 0.0F,
			 Class282.method5490(-(-2112344687
					       * Class322.anInt4909)
					     & 0x3fff));
		    client.aClass266_8290.method5128
			(-1.0F, 0.0F, 0.0F,
			 Class282.method5490(-(Class496.anInt6527
					       * -1323229803) & 0x3fff));
		    client.aClass266_8290.method5128
			(0.0F, 0.0F, -1.0F,
			 Class282.method5490(-(Class120_Sub18.anInt10605
					       * 361066033) & 0x3fff));
		    Class403.method7211(client.aClass268_8289, true,
					(float) (i_19_ / 2),
					(float) (i_20_ / 2),
					(float) (424661625 * client.anInt8398
						 << 1),
					(float) (424661625 * client.anInt8398
						 << 1),
					i_19_, i_20_, 1001344706);
		}
		Class236.aClass103_2713.method2512(client.aClass266_8290);
		Class236.aClass103_2713.method2309(client.aClass268_8289);
		if (class500.method11348(869654694) != null) {
		    Class236.aClass103_2713.method2311(1.0F);
		    Class236.aClass103_2713.method2227(16777215, 0.0F, 0.0F,
						       1.0F, 0.0F, 0.0F);
		    if (4 == Class296.anInt4513 * 115241065) {
			int i_36_ = (int) ((double) Class445_Sub16
							.aClass351_Sub1_8660
							.method6291((byte) 2)
					   * 2607.5945876176133);
			int i_37_ = (int) ((double) Class445_Sub16
							.aClass351_Sub1_8660
							.method6292((byte) 93)
					   * 2607.5945876176133);
			class500.method11348(869654694).method12876
			    (Class236.aClass103_2713,
			     client.anInt8468 * -2097885235 << 3, i, i_18_,
			     i_19_, i_20_, i_36_, i_37_, 0, i_35_, true, false,
			     238232950);
		    } else
			class500.method11348(869654694).method12876
			    (Class236.aClass103_2713,
			     -2097885235 * client.anInt8468 << 3, i, i_18_,
			     i_19_, i_20_, -1323229803 * Class496.anInt6527,
			     Class322.anInt4909 * -2112344687,
			     361066033 * Class120_Sub18.anInt10605, i_35_,
			     true, false, 1272847214);
		    Class236.aClass103_2713.method2291();
		} else
		    Class236.aClass103_2713.method2450(3, i_35_);
		Class236.aClass103_2713.method2279(false);
		Class247_Sub1.method16303(client.aClass266_8290,
					  client.aClass268_8289, i_19_, i_20_,
					  (byte) 0);
		client.aClass238_8477.method4833(-327520510)
		    .method11377(client.aClass238_8477, 617930567);
		byte i_38_
		    = (Class241_Sub5_Sub9.aClass241_Sub9_11043
			   .aClass445_Sub26_8870.method14352((byte) -96) == 2
		       ? (byte) (485246749 * client.anInt8407) : (byte) 1);
		if (Class518.method11661(1913716201)
		    || 115241065 * Class296.anInt4513 == 4)
		    client.aClass238_8477.method4751(-969319569).method12164
			(client.anInt8296, class79.anInt1137 * 238159603,
			 -1348336023 * class79.anInt1136,
			 676728033 * class79.anInt1135,
			 client.aClass238_8477.method4785(-1218485036),
			 client.anIntArray8423, client.anIntArray8424,
			 client.anIntArray8425, client.anIntArray8529,
			 client.anIntArray8427,
			 1 + (Class21.myPlayer
			      .nodePlane),
			 i_38_, (int) class287.aFloat4477 >> 9,
			 (int) class287.aFloat4479 >> 9,
			 (Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub35_8859.method14946((byte) -10)
			  == 0),
			 true, 0, true);
		else
		    client.aClass238_8477.method4751(-526452478).method12164
			(client.anInt8296, 133333741 * Class462.anInt6284,
			 -781800491 * Class175.anInt2123,
			 Class636.anInt8248 * -271636831,
			 client.aClass238_8477.method4785(-1218485036),
			 client.anIntArray8423, client.anIntArray8424,
			 client.anIntArray8425, client.anIntArray8529,
			 client.anIntArray8427,
			 1 + (Class21.myPlayer
			      .nodePlane),
			 i_38_, (int) class287.aFloat4477 >> 9,
			 (int) class287.aFloat4479 >> 9,
			 Class241_Sub5_Sub9.aClass241_Sub9_11043
			     .aClass445_Sub35_8859.method14946((byte) 42) == 0,
			 true, 0, true);
		client.anInt8554 += -1256543245;
		if (!Class236.aClass103_2713.method2323()
		    && 19 == 1766317249 * client.anInt8288)
		    Class580.method12745(i, i_18_, i_19_, i_20_, -12057414);
		client.aClass238_8477.method4751(-1950827523)
		    .method12122(-258155064);
		Class462.anInt6284 = i_28_ * 1680747237;
		Class175.anInt2123 = -1365297795 * i_29_;
		Class636.anInt8248 = i_30_ * -1181860511;
		Class496.anInt6527 = i_31_ * 709117373;
		Class322.anInt4909 = 2118136689 * i_32_;
		if (client.aBool8540
		    && Class117.aClass209_1552.method4153(2073464963) == 0)
		    client.aBool8540 = false;
		if (client.aBool8540) {
		    Class236.aClass103_2713.method2263(i, i_18_, i_19_, i_20_,
						       -16777216, (byte) -3);
		    Class434_Sub5.method14141
			(ClientMessage.LOADING.getLocalisedMessage((VarPlayerDomain
							      .currentLocale),
							     (short) 23311),
			 false, Class236.aClass103_2713, Class5.aClass96_26,
			 Class5.aClass639_25, 188734422);
		}
		Class403.method7211(client.aClass268_8289, false,
				    (float) (i_19_ / 2 + i),
				    (float) (i_18_ + i_20_ / 2),
				    (float) (424661625 * client.anInt8398
					     << 1),
				    (float) (client.anInt8398 * 424661625
					     << 1),
				    i_19_, i_20_, 697571081);
		Class236.aClass103_2713.method2309(client.aClass268_8289);
		Class632.method13503(client.aClass268_8289, (byte) -87);
	    }
	}
    }
    
    public static int method11459(int i) {
	if (2.0 == (double) Class573_Sub1.aFloat7402)
	    return 25;
	if ((double) Class573_Sub1.aFloat7402 == 3.0)
	    return 37;
	if ((double) Class573_Sub1.aFloat7402 == 4.0)
	    return 50;
	if (6.0 == (double) Class573_Sub1.aFloat7402)
	    return 75;
	if (8.0 == (double) Class573_Sub1.aFloat7402)
	    return 100;
	return 200;
    }
}
