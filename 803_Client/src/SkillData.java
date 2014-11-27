/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SkillData
{
    boolean includesDecimal;//aBool6548
    Skill skill;//aClass511_6549
    int baseLevel;//anInt6550
    int experience = 0;//anInt6551
    static final int MAX_EXPERIENCE = 2000000000;//anInt6552
    int currentLevel;//anInt6553
    
    public void setExperience/*method11299*/(int xp, int i_0_) {
		experience = -2123968799 * xp;
		if (experience * 1342371105 < 0) {
		    experience = 0;
		} else if (includesDecimal && experience * 1342371105 > 2000000000) {
		    experience = -617671680;
		} else if (!includesDecimal && 1342371105 * experience > 200000000) {
		    experience = 2085716480;
		}
		calculateFixedLevel(1056012951);
    }
    
    public int getExperience/*method11300*/(byte i) {
    	return 1342371105 * experience;
    }
    
    public int method11301() {
    	return -2102479745 * baseLevel;
    }
    
    public int method11302(WorldType class453) {
	if (WorldType.FREE == class453
	    && skill.isMembers(1277541329)
	    && skill.hasExperienceCap(-925720412)) {
	    int i = skill.getF2pLevelCap((byte) 10);
	    if (baseLevel * -2102479745 > i)
		return i;
	}
	return -2102479745 * baseLevel;
    }
    
    public int getBaseLevel/*method11303*/(byte i) {
    	return -2102479745 * baseLevel;
    }
    
    void calculateFixedLevel/*method11304*/(int i) {
		if (includesDecimal) {
		    baseLevel = skill.calculateDecimalLevel(experience * 1342371105, -327094284) * 1894583167;
		} else {
		    baseLevel = skill.calculateLevel(experience * 1342371105, -1621400555) * 1894583167;
		}
    }
    
    public int method11305() {
	return -2102479745 * baseLevel;
    }
    
    public void setCurrentLevel/*method11306*/(int level, int i_1_) {
    	currentLevel = -559026605 * level;
    }
    
    void method11307() {
	if (includesDecimal)
	    baseLevel
		= ((skill.calculateDecimalLevel
		    (experience * 1342371105, 939828678))
		   * 1894583167);
	else
	    baseLevel
		= ((skill.calculateLevel
		    (experience * 1342371105, -1621400555))
		   * 1894583167);
    }
    
    public int method11308() {
	return 1342371105 * experience;
    }
    
    public int method11309(WorldType class453) {
	if (WorldType.FREE == class453
	    && skill.isMembers(806762179)
	    && skill.hasExperienceCap(-1186848385)) {
	    int i = skill.method11533(-418806387);
	    if (!includesDecimal)
		i /= 10;
	    if (experience * 1342371105 > i)
		return i;
	}
	return experience * 1342371105;
    }
    
    public void method11310(int i) {
	experience = -2123968799 * i;
	if (experience * 1342371105 < 0)
	    experience = 0;
	else if (includesDecimal
		 && experience * 1342371105 > 2000000000)
	    experience = -617671680;
	else if (!includesDecimal
		 && 1342371105 * experience > 200000000)
	    experience = 2085716480;
	calculateFixedLevel(206721217);
    }
    
    public void method11311(int i) {
	experience = -2123968799 * i;
	if (experience * 1342371105 < 0)
	    experience = 0;
	else if (includesDecimal
		 && experience * 1342371105 > 2000000000)
	    experience = -617671680;
	else if (!includesDecimal
		 && 1342371105 * experience > 200000000)
	    experience = 2085716480;
	calculateFixedLevel(1266044430);
    }
    
    public void method11312(int i) {
	experience = -2123968799 * i;
	if (experience * 1342371105 < 0)
	    experience = 0;
	else if (includesDecimal
		 && experience * 1342371105 > 2000000000)
	    experience = -617671680;
	else if (!includesDecimal
		 && 1342371105 * experience > 200000000)
	    experience = 2085716480;
	calculateFixedLevel(-1710861872);
    }
    
    void method11313() {
	if (includesDecimal)
	    baseLevel
		= ((skill.calculateDecimalLevel
		    (experience * 1342371105, 360741686))
		   * 1894583167);
	else
	    baseLevel
		= ((skill.calculateLevel
		    (experience * 1342371105, -1621400555))
		   * 1894583167);
    }
    
    public int method11314() {
	return -2102479745 * baseLevel;
    }
    
    void method11315() {
	if (includesDecimal)
	    baseLevel
		= ((skill.calculateDecimalLevel
		    (experience * 1342371105, -1369495396))
		   * 1894583167);
	else
	    baseLevel
		= ((skill.calculateLevel
		    (experience * 1342371105, -1621400555))
		   * 1894583167);
    }
    
    public int method11316(WorldType class453) {
	if (WorldType.FREE == class453
	    && skill.isMembers(-211580485)
	    && skill.hasExperienceCap(-1605223151)) {
	    int i = skill.getF2pLevelCap((byte) 3);
	    if (baseLevel * -2102479745 > i)
		return i;
	}
	return -2102479745 * baseLevel;
    }
    
    public int getBaseLevel/*method11317*/(WorldType worldType, byte i) {
		if (WorldType.FREE == worldType
				&& skill.isMembers(1999343894)
				&& skill.hasExperienceCap(-964688974)) {
		    int levelCap = skill.getF2pLevelCap((byte) 83);
		    if (baseLevel * -2102479745 > levelCap) {
		    	return levelCap;
		    }
		}
		return -2102479745 * baseLevel;
    }
    
    public int method11318() {
	return 361530843 * currentLevel;
    }
    
    public void method11319(int i) {
	currentLevel = -559026605 * i;
    }
    
    public int getCurrentLevel/*method11320*/(int i) {
    	return 361530843 * currentLevel;
    }
    
    public SkillData(Skill class511, boolean bool) {
		baseLevel = 1894583167;
		currentLevel = -559026605;
		skill = class511;
		includesDecimal = bool;
    }
    
    public int method11321(WorldType class453, int i) {
	if (WorldType.FREE == class453
	    && skill.isMembers(-323536396)
	    && skill.hasExperienceCap(-1725647849)) {
	    int i_3_
		= skill.method11533(-627539459);
	    if (!includesDecimal)
		i_3_ /= 10;
	    if (experience * 1342371105 > i_3_)
		return i_3_;
	}
	return experience * 1342371105;
    }
    
    static final void method11322(ClientScriptData class454, byte i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_4_, (byte) -85);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_4_ >> 16];
	Class463.method10678(class58, class35, class454, -825263292);
    }
    
    static final void method11323(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class106.aClass580_1503.method12740((byte) -17);
    }
    
    static final void storeClanAllowNonMembers/*method11324*/(ClientScriptData scriptData, int i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= scriptData.clanSettings.allowNonMembers ? 1 : 0;
    }
    
    static final void method11325(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_5_ - i_6_;
    }
    
    static void method11326(RSByteBuffer data, short i) {
		int i_7_ = data.readSmart((short) -9989);
		Class50.aClass488Array675 = new Class488[i_7_];
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
		    Class50.aClass488Array675[i_8_] = new Class488();
		    ((Class488) Class50.aClass488Array675[i_8_]).anInt6482
			= data.readSmart((short) -32462) * -35021977;
		    ((Class488) Class50.aClass488Array675[i_8_]).aString6481
			= data.readJagString(-307199965);
		}
		Class120_Sub15.anInt10541
		    = data.readSmart((short) -2390) * 1544459289;
		Class509.anInt6681
		    = data.readSmart((short) -18322) * -1726919567;
		Class212.anInt2507
		    = data.readSmart((short) -10150) * -2037743751;
		Class509.aClass507_Sub1Array6676
		    = new Class507_Sub1[(Class509.anInt6681 * -505875311 - Class120_Sub15.anInt10541 * 1652918313 + 1)];
		for (int i_9_ = 0; i_9_ < Class212.anInt2507 * 1153743561; i_9_++) {
		    int i_10_ = data.readSmart((short) -15686);
		    Class507_Sub1 class507_sub1
			= (Class509.aClass507_Sub1Array6676[i_10_]
			   = new Class507_Sub1());
		    ((Class507_Sub1) class507_sub1).anInt6668
			= data.readUnsignedByte((byte) 59) * 1853116281;
		    class507_sub1.anInt6664
			= data.readInt((byte) 97) * 1830645075;
		    ((Class507_Sub1) class507_sub1).anInt8740
			= data.readSmart((short) -1889) * -116440339;
		    if (516909797 * ((Class507_Sub1) class507_sub1).anInt8740 != 0)
			((Class507_Sub1) class507_sub1).aString8738
			    = data.readJagString(1225810028);
		    class507_sub1.anInt8739
			= -1012035375 * (i_10_
					 + Class120_Sub15.anInt10541 * 1652918313);
		    class507_sub1.aString8737 = data.readJagString(-1822797622);
		    class507_sub1.aString8736 = data.readJagString(651294073);
		}
		Class186.anInt2194 = data.readInt((byte) 90) * -1626990291;
		Class509.aBool6680 = true;
    }
    
    static final void method11327(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	int i_11_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	class58.slot2 = -1725308621;
	if (i_11_ != class58.anInt995 * 88137753) {
	    class58.anInt995 = i_11_ * -560956375;
	    WorldType.refreshComponent(class58, -740013002);
	}
	if (class58.slot1 * -389932081 == -1 && !class35.aBool374)
	    Class613.method13245(class58.componentHash * 445907013, -1722886836);
    }
    
    static void method11328(int i, int i_12_, int i_13_, int i_14_, int i_15_,
			    int i_16_, Class536 class536, int i_17_) {
	WorldObject class241_sub30 = null;
	for (WorldObject class241_sub30_18_
		 = ((WorldObject)
		    WorldObject.aClass429_10053.method7694(16711935));
	     null != class241_sub30_18_;
	     class241_sub30_18_
		 = ((WorldObject)
		    WorldObject.aClass429_10053.method7692(997353410))) {
	    if (i == (-603972145
		      * ((WorldObject) class241_sub30_18_).plane)
		&& class241_sub30_18_.posX * 1204421839 == i_12_
		&& i_13_ == -320018831 * class241_sub30_18_.posY
		&& i_14_ == -759362859 * (((WorldObject) class241_sub30_18_)
					  .anInt10040)) {
		class241_sub30 = class241_sub30_18_;
		break;
	    }
	}
	if (class241_sub30 == null) {
	    class241_sub30 = new WorldObject();
	    ((WorldObject) class241_sub30).plane = i * -1040332497;
	    ((WorldObject) class241_sub30).anInt10040 = i_14_ * 1838800509;
	    class241_sub30.posX = i_12_ * -620199377;
	    class241_sub30.posY = -1643505007 * i_13_;
	    WorldObject.aClass429_10053.addNode(class241_sub30,
						      (short) -26975);
	}
	class241_sub30.id = i_15_ * -1404181681;
	((WorldObject) class241_sub30).type = i_16_ * 385240221;
	((WorldObject) class241_sub30).aClass536_10049 = class536;
	((WorldObject) class241_sub30).aBool10051 = true;
	((WorldObject) class241_sub30).aBool10046 = false;
    }
}
