/* Class578 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class578
{
    static final int anInt7451 = 141;
    static final int anInt7452 = 152;
    static final int anInt7453 = 87;
    static final int anInt7454 = 24;
    static final int anInt7455 = 4;
    static final int anInt7456 = 5;
    static final int anInt7457 = 6;
    static final int anInt7458 = 7;
    static final int anInt7459 = 8;
    static final int anInt7460 = 2;
    static final int anInt7461 = 10;
    public static final int anInt7462 = 104;
    static final int anInt7463 = 12;
    static final int anInt7464 = 16;
    static final int anInt7465 = 17;
    static final int anInt7466 = 69;
    static final int anInt7467 = 19;
    static final int anInt7468 = 20;
    static final int anInt7469 = 21;
    static final int anInt7470 = 3;
    static final int anInt7471 = 135;
    static final int anInt7472 = 100;
    static final int anInt7473 = 25;
    static final int anInt7474 = 22;
    static final int anInt7475 = 27;
    static final int anInt7476 = 32;
    static final int anInt7477 = 33;
    static final int anInt7478 = 34;
    static final int anInt7479 = 37;
    static final int anInt7480 = 36;
    static final int anInt7481 = 129;
    static final int anInt7482 = 38;
    static final int anInt7483 = 13;
    public static final int anInt7484 = 84;
    static final int anInt7485 = 41;
    static final int anInt7486 = 42;
    static final int anInt7487 = 43;
    static final int anInt7488 = 48;
    static final int anInt7489 = 49;
    static final int anInt7490 = 50;
    static final int anInt7491 = 51;
    static final int anInt7492 = 136;
    static final int anInt7493 = 53;
    static final int anInt7494 = 54;
    public static final int anInt7495 = 81;
    static final int anInt7496 = 56;
    static final int anInt7497 = 57;
    static final int anInt7498 = 58;
    static final int anInt7499 = 64;
    static final int anInt7500 = 65;
    static final int anInt7501 = 40;
    static final int anInt7502 = 1;
    static final int anInt7503 = 151;
    public static final int anInt7504 = 97;
    static final int anInt7505 = 70;
    static final int anInt7506 = 71;
    static final int anInt7507 = 72;
    static final int anInt7508 = 35;
    public static final int anInt7509 = 80;
    static final int anInt7510 = 73;
    public static final int anInt7511 = 82;
    static final int anInt7512 = 83;
    public static final int anInt7513 = 28;
    public static final int anInt7514 = 85;
    static final int anInt7515 = 140;
    static final int anInt7516 = 59;
    public static final int anInt7517 = 67;
    static final int anInt7518 = 55;
    static final int anInt7519 = 89;
    public static final int anInt7520 = 103;
    static final int anInt7521 = 23;
    static final int anInt7522 = 90;
    static final int anInt7523 = 91;
    public static final int anInt7524 = 96;
    public static final int anInt7525 = 102;
    public static final int anInt7526 = 98;
    public static final int anInt7527 = 99;
    public static final int anInt7528 = 66;
    public static final int anInt7529 = 101;
    static final int anInt7530 = 74;
    static final int anInt7531 = 153;
    static final int anInt7532 = 68;
    public static final int anInt7533 = 105;
    static final int anInt7534 = 128;
    static final int anInt7535 = 130;
    static final int anInt7536 = 52;
    static final int anInt7537 = 131;
    static final int anInt7538 = 132;
    static final int anInt7539 = 133;
    static final int anInt7540 = 134;
    static final int anInt7541 = 139;
    public static final int anInt7542 = 86;
    static final int anInt7543 = 137;
    static final int anInt7544 = 138;
    static final int anInt7545 = 88;
    static final int anInt7546 = 11;
    static final int anInt7547 = 9;
    static final int anInt7548 = 142;
    static final int anInt7549 = 143;
    static final int anInt7550 = 150;
    static final int anInt7551 = 26;
    static final int anInt7552 = 18;
    static final int anInt7553 = 39;
    static final int anInt7554 = 160;
    static final int anInt7555 = 161;
    static final int anInt7556 = 162;
    
    public abstract void method12688();
    
    public abstract void processKeys(int i);//method12689
    
    Class578() {
	/* empty */
    }
    
    public abstract Interface58 method12690(short i);
    
    public abstract void method12691(byte i);
    
    public abstract Interface58 method12692();
    
    public abstract boolean method12693(int i);
    
    public abstract boolean method12694(int i);
    
    public abstract void method12695();
    
    public abstract boolean isKeyPressed(int i, int i_0_);
    
    public abstract void method12697();
    
    static final void storeChannelUserRank/*method12698*/(ClientScriptData scriptData, int i) {
		int memberIndex = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = scriptData.currentChannel.channelUsers[memberIndex].rank;
    }
    
    static final void method12699(ClientScriptData class454, byte i) {
	if (Class442.aBool6160 && Class228.aFrame2674 != null)
	    Class537.method11899(Class241_Sub5_Sub9.aClass241_Sub9_11043
				     .aClass445_Sub30_8878
				     .method14386(-801965113),
				 -1, -1, false, 1482319719);
	if (Class262.getEnvironment(2058996158) == GameShell3.Environment.APPLICATION) {
	    Class85.method1845((byte) 3);
	    System.exit(0);
	} else
	    Class120_Sub22.method16852((byte) -43);
    }
    
    public static void method12700(int i, int i_2_) {
	Class241_Sub10 class241_sub10
	    = (Class241_Sub10) Class447.aClass407_6181.get((long) i);
	if (null != class241_sub10) {
	    ((Class241_Sub10) class241_sub10).aBool8900
		= !((Class241_Sub10) class241_sub10).aBool8900;
	    ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896.method12792
		(((Class241_Sub10) class241_sub10).aBool8900, -1645765418);
	}
    }
    
    static Entity method12701(int i, int i_3_, int i_4_,
					       byte i_5_) {
	Class548 class548 = (client.aClass238_8477.method4751(-628161143)
			     .aClass548ArrayArrayArray7169[i][i_3_][i_4_]);
	if (null == class548)
	    return null;
	Entity class475_sub1_sub1_sub3 = null;
	int i_6_ = -1;
	for (Class541 class541 = class548.aClass541_7053; class541 != null;
	     class541 = class541.aClass541_7005) {
	    Class475_Sub1_Sub1 class475_sub1_sub1
		= class541.aClass475_Sub1_Sub1_7004;
	    if (class475_sub1_sub1 instanceof Entity) {
		Entity class475_sub1_sub1_sub3_7_
		    = (Entity) class475_sub1_sub1;
		int i_8_ = ((class475_sub1_sub1_sub3_7_.method17782(-901112641)
			     - 1) * 256
			    + 252);
		Class287 class287
		    = class475_sub1_sub1_sub3_7_.method10874().aClass287_4386;
		int i_9_ = (int) class287.aFloat4477 - i_8_ >> 9;
		int i_10_ = (int) class287.aFloat4479 - i_8_ >> 9;
		int i_11_ = i_8_ + (int) class287.aFloat4477 >> 9;
		int i_12_ = (int) class287.aFloat4479 + i_8_ >> 9;
		if (i_9_ <= i_3_ && i_10_ <= i_4_ && i_11_ >= i_3_
		    && i_12_ >= i_4_) {
		    int i_13_ = (1 + i_11_ - i_3_) * (i_12_ + 1 - i_4_);
		    if (i_13_ > i_6_) {
			class475_sub1_sub1_sub3 = class475_sub1_sub1_sub3_7_;
			i_6_ = i_13_;
		    }
		}
	    }
	}
	return class475_sub1_sub1_sub3;
    }
    
    static final void method12702(ClientScriptData class454, int i) {
	int i_14_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856
		  .method7880(i_14_, 996762312);
    }
    
    static final void method12703(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = string.toLowerCase();
    }
}
