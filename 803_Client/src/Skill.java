/* Class511 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Skill
{
    int maxF2pLevel;//anInt6684
    int maxP2pLevel;//anInt6685
    boolean p2pOnly;//aBool6686
    int maxExperience;//anInt6687
    int skillID;//anInt6688
    static int[] levelXpNeeded = new int[120];//anIntArray6689
    
    int method11530() {
	return skillID * 1368378995;
    }
    
    int getID/*method11531*/(short i) {
    	return skillID * 1368378995;
    }
    
    public boolean isMembers/*method11532*/(int i) {
    	return p2pOnly;
    }
    
    public int method11533(int i) {
	return -81221939 * maxExperience;
    }
    
    public boolean method11534() {
	return p2pOnly;
    }
    
    public boolean hasExperienceCap/*method11535*/(int i) {
    	return -1 != maxExperience * -81221939;
    }
    
    public int calculateLevel/*method11536*/(int xp, int i_0_) {
		int level = 1;
		int maxLevel = 1819326271 * maxP2pLevel - 1;
		for (int index = 0; index < maxLevel && xp >= levelXpNeeded[index]; index++) {
			level = 2 + index;
		}
		return level;
    }
    
    public int calculateDecimalLevel/*method11537*/(int i, int i_4_) {
		int xp = i / 10;
		return calculateLevel(xp, -1621400555);
    }
    
    public boolean method11538() {
	return -1 != maxExperience * -81221939;
    }
    
    int method11539(int i, int i_6_) {
    	return getXpNeeded(i, (byte) 89) * 10;
    }
    
    static {
		int xp = 0;
		for (int level = 0; level < 120; level++) {
		    int i_8_ = level + 1;
		    int i_9_ = (int) ((double) i_8_
				      + 300.0 * Math.pow(2.0, (double) i_8_ / 7.0));
		    xp += i_9_;
		    levelXpNeeded[level] = xp / 4;
		}
    }
    
    public int method11540() {
	return -81221939 * maxExperience;
    }
    
    int method11541() {
	return skillID * 1368378995;
    }
    
    public boolean method11542() {
	return p2pOnly;
    }
    
    public int method11543(int i) {
	int i_10_ = i / 10;
	return calculateLevel(i_10_, -1621400555);
    }
    
    Skill(int id, int maxP2pLevel, boolean p2pOnly, boolean bool_12_, int maxF2pLevel) {
		this.skillID = id * 93095611;
		this.maxP2pLevel = maxP2pLevel * 21936319;
		this.p2pOnly = p2pOnly;
		if (p2pOnly) {
			this.maxF2pLevel = -1266998883 * maxF2pLevel;
			this.maxExperience = method11539(maxF2pLevel, 90863981) * 35370501;
		} else {
			this.maxF2pLevel = 1266998883;
			this.maxExperience = -35370501;
		}
    }
    
    public boolean method11544() {
    	return p2pOnly;
    }
    
    public boolean method11545() {
    	return -1 != maxExperience * -81221939;
    }
    
    public int getF2pLevelCap/*method11546*/(byte i) {
    	return 1742695605 * maxF2pLevel;
    }
    
    public boolean method11547() {
	return -1 != maxExperience * -81221939;
    }
    
    public int method11548(int i) {
	int i_14_ = 1;
	int i_15_ = 1819326271 * maxP2pLevel - 1;
	for (int i_16_ = 0; i_16_ < i_15_ && i >= levelXpNeeded[i_16_];
	     i_16_++)
	    i_14_ = 2 + i_16_;
	return i_14_;
    }
    
    public int method11549(int i) {
	int i_17_ = 1;
	int i_18_ = 1819326271 * maxP2pLevel - 1;
	for (int i_19_ = 0; i_19_ < i_18_ && i >= levelXpNeeded[i_19_];
	     i_19_++)
	    i_17_ = 2 + i_19_;
	return i_17_;
    }
    
    int method11550(int i) {
	if (i < 0)
	    i = 0;
	if (i > 1819326271 * maxP2pLevel)
	    i = 1819326271 * maxP2pLevel;
	if (i < 2)
	    return 0;
	return levelXpNeeded[i - 2];
    }
    
    public int method11551(int i) {
	int i_20_ = i / 10;
	return calculateLevel(i_20_, -1621400555);
    }
    
    int getXpNeeded/*method11552*/(int level, byte i_21_) {
		if (level < 0) {
			level = 0;
		}
		if (level > 1819326271 * maxP2pLevel) {
			level = 1819326271 * maxP2pLevel;
		}
		if (level < 2) {
		    return 0;
		}
		return levelXpNeeded[level - 2];
    }
    
    int method11553(int i) {
	return getXpNeeded(i, (byte) 76) * 10;
    }
    
    int method11554(int i) {
	return getXpNeeded(i, (byte) 7) * 10;
    }
    
    static final void method11555(ClientScriptData class454, int i) {
	int i_22_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_22_, (byte) -75);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_22_ >> 16];
	Class590.setFriendsUpdateEvent(class58, class35, class454, (byte) 69);
    }
    
    static final void method11556(ClientScriptData class454, byte i) {
	int i_23_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (i_23_ < 0 || i_23_ > 5 || i_23_ == 2)
	    i_23_ = 3;
	GraphicsDefaults.method11570(i_23_, false, 1945822518);
    }
    
    static final void method11557(ClientScriptData class454, byte i) {
	int i_24_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class515 class515
	    = Class441.aClass524_6158.method11745(i_24_, 1526277167);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 723243945 * class515.anInt6760;
    }
}
