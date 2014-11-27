/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class19 implements Interface11, Interface13, Interface50
{
    VarBitTypeListClient aClass199_Sub1_196;
    SkillData[] skills;//aClass498Array197
    VarPlayerTypeListClient aClass199_Sub2_Sub1_198;
    public VarPlayerDomain varPlayerDomain;//aClass517_199
    
    public VarBitType method93(int i, int i_0_) {
		VarBitType class316 = aClass199_Sub1_196.list(i, (byte) -27);
		if (class316.baseVar.domain != VarDomainType.PLAYER)
			return null;
		return class316;
    }
    
    public int getBaseLevel/*method867*/(int skillID, byte i_1_) {
    	return skills[skillID].getBaseLevel((byte) -8);
    }
    
    public int getCurrentLevel/*method868*/(int skillID, int i_2_) {
    	return skills[skillID].getCurrentLevel(-1321162838);
    }
    
    public int dummyMethod66(VarType class179) {
    	return varPlayerDomain.getVarValueInt(class179, -1641627572);
    }
    
    public int getExperience/*method869*/(int skillID, int i_3_) {
    	return skills[skillID].getExperience((byte) 31);
    }
    
    public int getSkillBaseLevel/*method367*/(int skillID, int i_4_) {
    	return skills[skillID].getBaseLevel(
    			(client.isP2pWorld ? WorldType.MEMBERS : WorldType.FREE),
    			(byte) 107);
    }
    
    public VarType method96(VarDomainType class218, int i, byte i_5_) {
		if (class218 != VarDomainType.PLAYER)
		    return null;
		return aClass199_Sub2_Sub1_198.list(i, -1520797714);
    }
    
    public int dummyMethod72(VarBitType class316) {
    	return varPlayerDomain.getVarBitValue(class316, (short) 9502);
    }
    
    public int getVarValueInt(VarType type, int i) {
    	return varPlayerDomain.getVarValueInt(type, -2135975441);
    }
    
    public int getVarBitValue(VarBitType type, short i) {
    	return varPlayerDomain.getVarBitValue(type, (short) 20748);
    }
    
    public int method870(int i) {
	return (skills[i].method11321
		((client.isP2pWorld ? WorldType.MEMBERS
		  : WorldType.FREE),
		 -1785241109));
    }
    
    public int method871(int i) {
    	return skills[i].getExperience((byte) -107);
    }
    
    public int method872(int i) {
    	return (skills[i].method11321
		((client.isP2pWorld ? WorldType.MEMBERS
		  : WorldType.FREE),
		 -825280029));
    }
    
    public int method873(int i) {
    	return skills[i].getExperience((byte) -34);
    }
    
    public int method874(int i) {
    	return skills[i].getCurrentLevel(195002575);
    }
    
    public int method875(int i) {
    	return skills[i].getCurrentLevel(-1290225051);
    }
    
    public int method366(int i) {
	return (skills[i].getBaseLevel
		((client.isP2pWorld ? WorldType.MEMBERS
		  : WorldType.FREE),
		 (byte) 31));
    }
    
    public int method876(int i) {
	return (skills[i].method11321
		((client.isP2pWorld ? WorldType.MEMBERS
		  : WorldType.FREE),
		 -575295225));
    }
    
    public int dummyMethod67(VarType class179) {
    	return varPlayerDomain.getVarValueInt(class179, -840297652);
    }
    
    public int method877(int i) {
    	return skills[i].getBaseLevel((byte) -124);
    }
    
    public VarType method94(VarDomainType class218, int i) {
	if (class218 != VarDomainType.PLAYER)
	    return null;
	return aClass199_Sub2_Sub1_198
		   .list(i, -1717736755);
    }
    
    public VarBitType method95(int i) {
	VarBitType class316
	    = aClass199_Sub1_196.list(i, (byte) -78);
	if (class316.baseVar.domain != VarDomainType.PLAYER)
	    return null;
	return class316;
    }
    
    public int method878(int i) {
	return (skills[i].method11321
		((client.isP2pWorld ? WorldType.MEMBERS
		  : WorldType.FREE),
		 -1833503057));
    }
    
    public Class19(VarPlayerTypeListClient class199_sub2_sub1, VarBitTypeListClient class199_sub1, int skillCount) {
		skills = new SkillData[skillCount];
		varPlayerDomain = new VarPlayerDomain();
		aClass199_Sub2_Sub1_198 = class199_sub2_sub1;
		aClass199_Sub1_196 = class199_sub1;
    }
    
    public VarBitType method92(int i) {
	VarBitType class316
	    = aClass199_Sub1_196.list(i, (byte) -93);
	if (class316.baseVar.domain != VarDomainType.PLAYER)
	    return null;
	return class316;
    }
    
    public int dummyMethod65(VarType class179) {
	return varPlayerDomain.getVarValueInt(class179, -1361788379);
    }
    
    public int dummyMethod70(VarType class179) {
	return varPlayerDomain.getVarValueInt(class179, -1114479578);
    }
    
    public int dummyMethod71(VarBitType class316) {
	return varPlayerDomain.getVarBitValue(class316, (short) 22979);
    }
    
    public int method879(int i, int i_6_) {
	return (skills[i].method11321
		((client.isP2pWorld ? WorldType.MEMBERS
		  : WorldType.FREE),
		 -1821005354));
    }
    
    public static void method880(int i, short i_7_) {
	Class241_Sub10 class241_sub10
	    = (Class241_Sub10) Class447.aClass407_6181.get((long) i);
	if (null != class241_sub10) {
	    ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		.method12785(-1594642095);
	    Class445_Sub24.method14343
		(1570057341 * ((Class241_Sub10) class241_sub10).anInt8899,
		 ((Class241_Sub10) class241_sub10).aBool8895, (byte) -39);
	    class241_sub10.remove((byte) 36);
	}
    }
    
    public static void method881(boolean bool, int i) {
	for (Class241_Sub38 class241_sub38
		 = ((Class241_Sub38)
		    Class241_Sub38.aClass429_10116.method7694(16711935));
	     class241_sub38 != null;
	     class241_sub38 = (Class241_Sub38) Class241_Sub38
						   .aClass429_10116
						   .method7692(1072618368)) {
	    if (null != ((Class241_Sub38) class241_sub38).aClass221_10141) {
		((Class241_Sub38) class241_sub38).aClass221_10141
		    .method4405(150, -769295114);
		Class402.soundManager.method1136((((Class241_Sub38)
						    class241_sub38)
						   .aClass221_10141),
						  (byte) -69);
		((Class241_Sub38) class241_sub38).aClass221_10141 = null;
	    }
	    if (null != ((Class241_Sub38) class241_sub38).aClass221_10142) {
		((Class241_Sub38) class241_sub38).aClass221_10142
		    .method4405(150, -1149657721);
		Class402.soundManager.method1136((((Class241_Sub38)
						    class241_sub38)
						   .aClass221_10142),
						  (byte) -105);
		((Class241_Sub38) class241_sub38).aClass221_10142 = null;
	    }
	    class241_sub38.remove((byte) 36);
	}
	if (bool) {
	    for (Class241_Sub38 class241_sub38
		     = ((Class241_Sub38)
			Class241_Sub38.aClass429_10117.method7694(16711935));
		 class241_sub38 != null;
		 class241_sub38
		     = (Class241_Sub38) Class241_Sub38.aClass429_10117
					    .method7692(218402202)) {
		if (((Class241_Sub38) class241_sub38).aClass221_10141
		    != null) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(150, -772731967);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -78);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		class241_sub38.remove((byte) 36);
	    }
	    for (Class241_Sub38 class241_sub38
		     = ((Class241_Sub38)
			Class241_Sub38.aClass407_10118.method7294(2090894173));
		 class241_sub38 != null;
		 class241_sub38
		     = (Class241_Sub38) Class241_Sub38.aClass407_10118
					    .method7295(-206595303)) {
		if (((Class241_Sub38) class241_sub38).aClass221_10141
		    != null) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(150, -912084326);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -36);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		class241_sub38.remove((byte) 36);
	    }
	}
    }
}
