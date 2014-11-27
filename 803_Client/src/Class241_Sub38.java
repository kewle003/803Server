/* Class241_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub38 extends Node
{
    static final int anInt10115 = 2;
    static NodeCollection aClass429_10116 = new NodeCollection();
    static NodeCollection aClass429_10117 = new NodeCollection();
    static HashTable aClass407_10118 = new HashTable(16);
    int anInt10119;
    boolean aBool10120;
    int anInt10121;
    int anInt10122;
    int anInt10123;
    Class287 aClass287_10124;
    Class287 aClass287_10125 = new Class287(0.0F, 0.0F, 0.0F);
    int anInt10126;
    int anInt10127;
    int anInt10128;
    static final int anInt10129 = 0;
    NPC aClass475_Sub1_Sub1_Sub3_Sub2_10130;
    Player aClass475_Sub1_Sub1_Sub3_Sub1_10131;
    ObjectDefinition aClass526_10132;
    static final int anInt10133 = 1;
    static final int anInt10134 = 3;
    static final int anInt10135 = 512;
    int anInt10136;
    int anInt10137;
    int anInt10138;
    int anInt10139;
    int anInt10140;
    Class221 aClass221_10141;
    Class221 aClass221_10142;
    int anInt10143;
    int anInt10144;
    int[] anIntArray10145;
    int anInt10146;
    
    public static void method16420
	(NPC class475_sub1_sub1_sub3_sub2) {
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7694(16711935);
	     class241_sub38 != null;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7692(1758101266)) {
	    if ((((Class241_Sub38) class241_sub38)
		 .aClass475_Sub1_Sub1_Sub3_Sub2_10130)
		== class475_sub1_sub1_sub3_sub2) {
		if (null
		    != ((Class241_Sub38) class241_sub38).aClass221_10141) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(100, -1517636931);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -102);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		class241_sub38.remove((byte) 36);
		break;
	    }
	}
    }
    
    public static void method16421(int i, int i_0_, int i_1_, int i_2_) {
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7694(16711935);
	     null != class241_sub38;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7692(684743714))
	    GameShell3$FrameParameters.method5023(class241_sub38, i, i_0_, i_1_, i_2_, (byte) 0);
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7694(16711935);
	     class241_sub38 != null;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7692(-323516817)) {
	    int i_3_ = 1;
	    Class554 class554 = ((Class241_Sub38) class241_sub38)
				    .aClass475_Sub1_Sub1_Sub3_Sub2_10130
				    .method17787(-400879212);
	    int i_4_ = ((Class241_Sub38) class241_sub38)
			   .aClass475_Sub1_Sub1_Sub3_Sub2_10130
			   .aClass409_Sub1_11405.method7346(-539164499);
	    if (-1 == i_4_ || (((Class241_Sub38) class241_sub38)
			       .aClass475_Sub1_Sub1_Sub3_Sub2_10130
			       .aClass409_Sub1_11405.aBool8600))
		i_3_ = 0;
	    else if (class554.anInt7213 * -1503148783 == i_4_
		     || i_4_ == 1122571643 * class554.anInt7214
		     || i_4_ == -1591850491 * class554.anInt7226
		     || i_4_ == class554.anInt7215 * -526852481)
		i_3_ = 2;
	    else if (i_4_ == -504629317 * class554.anInt7217
		     || i_4_ == class554.anInt7216 * 62833745
		     || i_4_ == 2130754419 * class554.anInt7220
		     || i_4_ == -216997439 * class554.anInt7212)
		i_3_ = 3;
	    if (i_3_ != (((Class241_Sub38) class241_sub38).anInt10136
			 * -1894401483)) {
		int i_5_ = (Class130.method3072
			    ((((Class241_Sub38) class241_sub38)
			      .aClass475_Sub1_Sub1_Sub3_Sub2_10130),
			     -2037844536));
		NPCDefinition class401
		    = (((Class241_Sub38) class241_sub38)
		       .aClass475_Sub1_Sub1_Sub3_Sub2_10130.definition);
		if (class401.transformTo != null)
		    class401
			= class401.method7176(Class1.aClass19_11,
					      Class1.aClass19_11, (byte) 101);
		if (null == class401 || i_5_ == -1) {
		    ((Class241_Sub38) class241_sub38).anInt10140 = -516554003;
		    ((Class241_Sub38) class241_sub38).anInt10136
			= -757118947 * i_3_;
		} else if (i_5_
			   != 1309234459 * (((Class241_Sub38) class241_sub38)
					    .anInt10140)) {
		    boolean bool = false;
		    if (((Class241_Sub38) class241_sub38).aClass221_10141
			!= null) {
			((Class241_Sub38) class241_sub38).anInt10128
			    -= 1457631744;
			if ((-1813901463
			     * ((Class241_Sub38) class241_sub38).anInt10128)
			    <= 0) {
			    ((Class241_Sub38) class241_sub38)
				.aClass221_10141.method4405(100, -712918578);
			    Class402.soundManager.method1136
				((((Class241_Sub38) class241_sub38)
				  .aClass221_10141),
				 (byte) -80);
			    ((Class241_Sub38) class241_sub38).aClass221_10141
				= null;
			    bool = true;
			}
		    } else
			bool = true;
		    if (bool) {
			((Class241_Sub38) class241_sub38).anInt10128
			    = 508697239 * class401.anInt5857;
			((Class241_Sub38) class241_sub38).anInt10140
			    = 516554003 * i_5_;
			((Class241_Sub38) class241_sub38).anInt10136
			    = i_3_ * -757118947;
		    }
		} else {
		    ((Class241_Sub38) class241_sub38).anInt10136
			= i_3_ * -757118947;
		    ((Class241_Sub38) class241_sub38).anInt10128
			= class401.anInt5857 * 508697239;
		}
	    }
	    Class287 class287
		= (((Class241_Sub38) class241_sub38)
		       .aClass475_Sub1_Sub1_Sub3_Sub2_10130.method10874
		   ().aClass287_4386);
	    ((Class241_Sub38) class241_sub38).anInt10121
		= -1165213235 * (int) class287.aFloat4477;
	    ((Class241_Sub38) class241_sub38).anInt10122
		= ((int) class287.aFloat4477
		   + (((Class241_Sub38) class241_sub38)
			  .aClass475_Sub1_Sub1_Sub3_Sub2_10130
			  .method17782(2129087940)
		      << 8)) * 2091577895;
	    ((Class241_Sub38) class241_sub38).anInt10137
		= (int) class287.aFloat4479 * -1759680525;
	    ((Class241_Sub38) class241_sub38).anInt10123
		= ((int) class287.aFloat4479
		   + (((Class241_Sub38) class241_sub38)
			  .aClass475_Sub1_Sub1_Sub3_Sub2_10130
			  .method17782(-853862894)
		      << 8)) * 1727276991;
	    ((Class241_Sub38) class241_sub38).anInt10119
		= ((((Class241_Sub38) class241_sub38)
		    .aClass475_Sub1_Sub1_Sub3_Sub2_10130.nodePlane)
		   * 1647904679);
	    GameShell3$FrameParameters.method5023(class241_sub38, i, i_0_, i_1_, i_2_, (byte) 0);
	}
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass407_10118.method7294(2090894173);
	     null != class241_sub38;
	     class241_sub38
		 = (Class241_Sub38) aClass407_10118.method7295(368594951)) {
	    int i_6_ = 1;
	    Class554 class554 = ((Class241_Sub38) class241_sub38)
				    .aClass475_Sub1_Sub1_Sub3_Sub1_10131
				    .method17787(-1421686627);
	    int i_7_ = ((Class241_Sub38) class241_sub38)
			   .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			   .aClass409_Sub1_11405.method7346(-1710909841);
	    if (i_7_ == -1 || (((Class241_Sub38) class241_sub38)
			       .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			       .aClass409_Sub1_11405.aBool8600))
		i_6_ = 0;
	    else if (-1503148783 * class554.anInt7213 == i_7_
		     || i_7_ == class554.anInt7214 * 1122571643
		     || i_7_ == -1591850491 * class554.anInt7226
		     || i_7_ == class554.anInt7215 * -526852481)
		i_6_ = 2;
	    else if (i_7_ == -504629317 * class554.anInt7217
		     || i_7_ == 62833745 * class554.anInt7216
		     || i_7_ == 2130754419 * class554.anInt7220
		     || i_7_ == class554.anInt7212 * -216997439)
		i_6_ = 3;
	    if (((Class241_Sub38) class241_sub38).anInt10136 * -1894401483
		!= i_6_) {
		int i_8_ = (Class490.method11238
			    ((((Class241_Sub38) class241_sub38)
			      .aClass475_Sub1_Sub1_Sub3_Sub1_10131),
			     -116897283));
		if (i_8_ != (1309234459
			     * ((Class241_Sub38) class241_sub38).anInt10140)) {
		    boolean bool = false;
		    if (((Class241_Sub38) class241_sub38).aClass221_10141
			!= null) {
			((Class241_Sub38) class241_sub38).anInt10128
			    -= 1457631744;
			if ((-1813901463
			     * ((Class241_Sub38) class241_sub38).anInt10128)
			    <= 0) {
			    ((Class241_Sub38) class241_sub38)
				.aClass221_10141.method4405(100, -965021183);
			    Class402.soundManager.method1136
				((((Class241_Sub38) class241_sub38)
				  .aClass221_10141),
				 (byte) -120);
			    ((Class241_Sub38) class241_sub38).aClass221_10141
				= null;
			    bool = true;
			}
		    } else
			bool = true;
		    if (bool) {
			((Class241_Sub38) class241_sub38).anInt10128
			    = 776085649 * (((Class241_Sub38) class241_sub38)
					   .aClass475_Sub1_Sub1_Sub3_Sub1_10131
					   .anInt11514);
			((Class241_Sub38) class241_sub38).anInt10140
			    = 516554003 * i_8_;
			((Class241_Sub38) class241_sub38).anInt10136
			    = i_6_ * -757118947;
		    }
		} else {
		    ((Class241_Sub38) class241_sub38).anInt10128
			= ((((Class241_Sub38) class241_sub38)
			    .aClass475_Sub1_Sub1_Sub3_Sub1_10131.anInt11514)
			   * 776085649);
		    ((Class241_Sub38) class241_sub38).anInt10136
			= i_6_ * -757118947;
		}
	    }
	    Class287 class287
		= (((Class241_Sub38) class241_sub38)
		       .aClass475_Sub1_Sub1_Sub3_Sub1_10131.method10874
		   ().aClass287_4386);
	    ((Class241_Sub38) class241_sub38).anInt10121
		= -1165213235 * (int) class287.aFloat4477;
	    ((Class241_Sub38) class241_sub38).anInt10122
		= ((int) class287.aFloat4477
		   + (((Class241_Sub38) class241_sub38)
			  .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			  .method17782(950970890)
		      << 8)) * 2091577895;
	    ((Class241_Sub38) class241_sub38).anInt10137
		= (int) class287.aFloat4479 * -1759680525;
	    ((Class241_Sub38) class241_sub38).anInt10123
		= ((int) class287.aFloat4479
		   + (((Class241_Sub38) class241_sub38)
			  .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			  .method17782(1338981515)
		      << 8)) * 1727276991;
	    ((Class241_Sub38) class241_sub38).anInt10119
		= ((((Class241_Sub38) class241_sub38)
		    .aClass475_Sub1_Sub1_Sub3_Sub1_10131.nodePlane)
		   * 1647904679);
	    GameShell3$FrameParameters.method5023(class241_sub38, i, i_0_, i_1_, i_2_, (byte) 0);
	}
    }
    
    public static void method16422
	(Player class475_sub1_sub1_sub3_sub1) {
	Class241_Sub38 class241_sub38
	    = ((Class241_Sub38)
	       (aClass407_10118.get
		((long) (-546698383
			 * class475_sub1_sub1_sub3_sub1.entityIndex))));
	if (class241_sub38 == null)
	    Class612.method13238(class475_sub1_sub1_sub3_sub1.nodePlane,
				 (class475_sub1_sub1_sub3_sub1.scenePositionXQueue
				  [0]),
				 (class475_sub1_sub1_sub3_sub1.scenePositionYQueue
				  [0]),
				 0, null, null, class475_sub1_sub1_sub3_sub1,
				 (byte) 36);
	else
	    class241_sub38.method16432(680054326);
    }
    
    public static void method16423(boolean bool) {
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7694(16711935);
	     class241_sub38 != null;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7692(318613878)) {
	    if (null != ((Class241_Sub38) class241_sub38).aClass221_10141) {
		((Class241_Sub38) class241_sub38).aClass221_10141
		    .method4405(150, -1163805424);
		Class402.soundManager.method1136((((Class241_Sub38)
						    class241_sub38)
						   .aClass221_10141),
						  (byte) -47);
		((Class241_Sub38) class241_sub38).aClass221_10141 = null;
	    }
	    if (null != ((Class241_Sub38) class241_sub38).aClass221_10142) {
		((Class241_Sub38) class241_sub38).aClass221_10142
		    .method4405(150, -289117163);
		Class402.soundManager.method1136((((Class241_Sub38)
						    class241_sub38)
						   .aClass221_10142),
						  (byte) -56);
		((Class241_Sub38) class241_sub38).aClass221_10142 = null;
	    }
	    class241_sub38.remove((byte) 36);
	}
	if (bool) {
	    for (Class241_Sub38 class241_sub38
		     = (Class241_Sub38) aClass429_10117.method7694(16711935);
		 class241_sub38 != null;
		 class241_sub38 = ((Class241_Sub38)
				   aClass429_10117.method7692(-286317965))) {
		if (((Class241_Sub38) class241_sub38).aClass221_10141
		    != null) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(150, -1414297675);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -74);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		class241_sub38.remove((byte) 36);
	    }
	    for (Class241_Sub38 class241_sub38
		     = (Class241_Sub38) aClass407_10118.method7294(2090894173);
		 class241_sub38 != null;
		 class241_sub38 = ((Class241_Sub38)
				   aClass407_10118.method7295(-90730517))) {
		if (((Class241_Sub38) class241_sub38).aClass221_10141
		    != null) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(150, -1982131677);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -88);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		class241_sub38.remove((byte) 36);
	    }
	}
    }
    
    public static void method16424(boolean bool) {
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7694(16711935);
	     class241_sub38 != null;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7692(1876319302)) {
	    if (null != ((Class241_Sub38) class241_sub38).aClass221_10141) {
		((Class241_Sub38) class241_sub38).aClass221_10141
		    .method4405(150, -668621657);
		Class402.soundManager.method1136((((Class241_Sub38)
						    class241_sub38)
						   .aClass221_10141),
						  (byte) -23);
		((Class241_Sub38) class241_sub38).aClass221_10141 = null;
	    }
	    if (null != ((Class241_Sub38) class241_sub38).aClass221_10142) {
		((Class241_Sub38) class241_sub38).aClass221_10142
		    .method4405(150, -29293176);
		Class402.soundManager.method1136((((Class241_Sub38)
						    class241_sub38)
						   .aClass221_10142),
						  (byte) -108);
		((Class241_Sub38) class241_sub38).aClass221_10142 = null;
	    }
	    class241_sub38.remove((byte) 36);
	}
	if (bool) {
	    for (Class241_Sub38 class241_sub38
		     = (Class241_Sub38) aClass429_10117.method7694(16711935);
		 class241_sub38 != null;
		 class241_sub38 = ((Class241_Sub38)
				   aClass429_10117.method7692(1811580054))) {
		if (((Class241_Sub38) class241_sub38).aClass221_10141
		    != null) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(150, -73145400);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -121);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		class241_sub38.remove((byte) 36);
	    }
	    for (Class241_Sub38 class241_sub38
		     = (Class241_Sub38) aClass407_10118.method7294(2090894173);
		 class241_sub38 != null;
		 class241_sub38 = ((Class241_Sub38)
				   aClass407_10118.method7295(-303585151))) {
		if (((Class241_Sub38) class241_sub38).aClass221_10141
		    != null) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(150, -114872179);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -33);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		class241_sub38.remove((byte) 36);
	    }
	}
    }
    
    public static void method16425() {
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7694(16711935);
	     null != class241_sub38;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7692(-334290259)) {
	    if (((Class241_Sub38) class241_sub38).aBool10120)
		class241_sub38.method16432(656073602);
	}
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7694(16711935);
	     class241_sub38 != null;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7692(394657830)) {
	    if (((Class241_Sub38) class241_sub38).aBool10120)
		class241_sub38.method16432(2030235151);
	}
    }
    
    public static void method16426() {
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7694(16711935);
	     null != class241_sub38;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7692(1446147855)) {
	    if (((Class241_Sub38) class241_sub38).aBool10120)
		class241_sub38.method16432(2074714634);
	}
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7694(16711935);
	     class241_sub38 != null;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7692(1445362470)) {
	    if (((Class241_Sub38) class241_sub38).aBool10120)
		class241_sub38.method16432(472482417);
	}
    }
    
    void method16427() {
	int i = 1309234459 * ((Class241_Sub38) this).anInt10140;
	if (((Class241_Sub38) this).aClass526_10132 != null) {
	    ObjectDefinition class526
		= (((Class241_Sub38) this).aClass526_10132.method11768
		   (Class1.aClass19_11,
		    (4 == client.anInt8266 * -831877317
		     ? (Interface11) Class104.anInterface11_1485
		     : Class1.aClass19_11),
		    -513940247));
	    if (null != class526) {
		((Class241_Sub38) this).anInt10140
		    = class526.anInt6886 * -1637559899;
		((Class241_Sub38) this).anInt10127
		    = (837167253 * class526.anInt6841 << 9) * -2021578193;
		((Class241_Sub38) this).anInt10128
		    = class526.anInt6889 * 1943750543;
		((Class241_Sub38) this).anInt10143
		    = class526.anInt6887 * -2124586309;
		((Class241_Sub38) this).anInt10144
		    = class526.anInt6891 * -487054103;
		((Class241_Sub38) this).anIntArray10145
		    = class526.anIntArray6892;
		((Class241_Sub38) this).anInt10139
		    = class526.anInt6855 * -934793689;
		((Class241_Sub38) this).anInt10138
		    = 47376031 * class526.anInt6900;
	    } else {
		((Class241_Sub38) this).anInt10140 = -516554003;
		((Class241_Sub38) this).anInt10127 = 0;
		((Class241_Sub38) this).anInt10128 = 0;
		((Class241_Sub38) this).anInt10143 = 0;
		((Class241_Sub38) this).anInt10144 = 0;
		((Class241_Sub38) this).anIntArray10145 = null;
		((Class241_Sub38) this).anInt10139 = -490109696;
		((Class241_Sub38) this).anInt10138 = 591836416;
		((Class241_Sub38) this).anInt10126 = 0;
	    }
	} else if (((Class241_Sub38) this).aClass475_Sub1_Sub1_Sub3_Sub2_10130
		   != null) {
	    int i_9_
		= Class130.method3072((((Class241_Sub38) this)
				       .aClass475_Sub1_Sub1_Sub3_Sub2_10130),
				      -2037844536);
	    if (i != i_9_) {
		((Class241_Sub38) this).anInt10140 = i_9_ * 516554003;
		NPCDefinition class401
		    = (((Class241_Sub38) this)
		       .aClass475_Sub1_Sub1_Sub3_Sub2_10130.definition);
		if (null != class401.transformTo)
		    class401
			= class401.method7176(Class1.aClass19_11,
					      Class1.aClass19_11, (byte) 86);
		if (class401 != null) {
		    ((Class241_Sub38) this).anInt10127
			= -2021578193 * (413101209 * class401.anInt5866 << 9);
		    ((Class241_Sub38) this).anInt10126
			= (class401.anInt5856 * 1256957735 << 9) * -1530155547;
		    ((Class241_Sub38) this).anInt10128
			= 508697239 * class401.anInt5857;
		    ((Class241_Sub38) this).anInt10139
			= class401.anInt5825 * 49411927;
		    ((Class241_Sub38) this).anInt10138
			= -1030406663 * class401.anInt5850;
		} else {
		    ((Class241_Sub38) this).anInt10126 = 0;
		    ((Class241_Sub38) this).anInt10127 = 0;
		    ((Class241_Sub38) this).anInt10128 = 0;
		    ((Class241_Sub38) this).anInt10139 = -490109696;
		    ((Class241_Sub38) this).anInt10138 = 591836416;
		}
	    }
	} else if (null != (((Class241_Sub38) this)
			    .aClass475_Sub1_Sub1_Sub3_Sub1_10131)) {
	    ((Class241_Sub38) this).anInt10140
		= Class490.method11238((((Class241_Sub38) this)
					.aClass475_Sub1_Sub1_Sub3_Sub1_10131),
				       1259090408) * 516554003;
	    ((Class241_Sub38) this).anInt10127
		= (-2021578193
		   * (1294463297 * (((Class241_Sub38) this)
				    .aClass475_Sub1_Sub1_Sub3_Sub1_10131
				    .anInt11513)
		      << 9));
	    ((Class241_Sub38) this).anInt10126 = 0;
	    ((Class241_Sub38) this).anInt10128
		= 776085649 * (((Class241_Sub38) this)
			       .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			       .anInt11514);
	    ((Class241_Sub38) this).anInt10139 = -490109696;
	    ((Class241_Sub38) this).anInt10138 = 591836416;
	}
	if (i != ((Class241_Sub38) this).anInt10140 * 1309234459
	    && ((Class241_Sub38) this).aClass221_10141 != null
	    && null != ((Class241_Sub38) this).aClass221_10141) {
	    ((Class241_Sub38) this).aClass221_10141.method4405(100,
							       -147792869);
	    Class402.soundManager.method1136((((Class241_Sub38) this)
					       .aClass221_10141),
					      (byte) 14);
	    ((Class241_Sub38) this).aClass221_10141 = null;
	}
    }
    
    void method16428() {
	int i = 1309234459 * ((Class241_Sub38) this).anInt10140;
	if (((Class241_Sub38) this).aClass526_10132 != null) {
	    ObjectDefinition class526
		= (((Class241_Sub38) this).aClass526_10132.method11768
		   (Class1.aClass19_11,
		    (4 == client.anInt8266 * -831877317
		     ? (Interface11) Class104.anInterface11_1485
		     : Class1.aClass19_11),
		    -642733322));
	    if (null != class526) {
		((Class241_Sub38) this).anInt10140
		    = class526.anInt6886 * -1637559899;
		((Class241_Sub38) this).anInt10127
		    = (837167253 * class526.anInt6841 << 9) * -2021578193;
		((Class241_Sub38) this).anInt10128
		    = class526.anInt6889 * 1943750543;
		((Class241_Sub38) this).anInt10143
		    = class526.anInt6887 * -2124586309;
		((Class241_Sub38) this).anInt10144
		    = class526.anInt6891 * -487054103;
		((Class241_Sub38) this).anIntArray10145
		    = class526.anIntArray6892;
		((Class241_Sub38) this).anInt10139
		    = class526.anInt6855 * -934793689;
		((Class241_Sub38) this).anInt10138
		    = 47376031 * class526.anInt6900;
	    } else {
		((Class241_Sub38) this).anInt10140 = -516554003;
		((Class241_Sub38) this).anInt10127 = 0;
		((Class241_Sub38) this).anInt10128 = 0;
		((Class241_Sub38) this).anInt10143 = 0;
		((Class241_Sub38) this).anInt10144 = 0;
		((Class241_Sub38) this).anIntArray10145 = null;
		((Class241_Sub38) this).anInt10139 = -490109696;
		((Class241_Sub38) this).anInt10138 = 591836416;
		((Class241_Sub38) this).anInt10126 = 0;
	    }
	} else if (((Class241_Sub38) this).aClass475_Sub1_Sub1_Sub3_Sub2_10130
		   != null) {
	    int i_10_
		= Class130.method3072((((Class241_Sub38) this)
				       .aClass475_Sub1_Sub1_Sub3_Sub2_10130),
				      -2037844536);
	    if (i != i_10_) {
		((Class241_Sub38) this).anInt10140 = i_10_ * 516554003;
		NPCDefinition class401
		    = (((Class241_Sub38) this)
		       .aClass475_Sub1_Sub1_Sub3_Sub2_10130.definition);
		if (null != class401.transformTo)
		    class401
			= class401.method7176(Class1.aClass19_11,
					      Class1.aClass19_11, (byte) 93);
		if (class401 != null) {
		    ((Class241_Sub38) this).anInt10127
			= -2021578193 * (413101209 * class401.anInt5866 << 9);
		    ((Class241_Sub38) this).anInt10126
			= (class401.anInt5856 * 1256957735 << 9) * -1530155547;
		    ((Class241_Sub38) this).anInt10128
			= 508697239 * class401.anInt5857;
		    ((Class241_Sub38) this).anInt10139
			= class401.anInt5825 * 49411927;
		    ((Class241_Sub38) this).anInt10138
			= -1030406663 * class401.anInt5850;
		} else {
		    ((Class241_Sub38) this).anInt10126 = 0;
		    ((Class241_Sub38) this).anInt10127 = 0;
		    ((Class241_Sub38) this).anInt10128 = 0;
		    ((Class241_Sub38) this).anInt10139 = -490109696;
		    ((Class241_Sub38) this).anInt10138 = 591836416;
		}
	    }
	} else if (null != (((Class241_Sub38) this)
			    .aClass475_Sub1_Sub1_Sub3_Sub1_10131)) {
	    ((Class241_Sub38) this).anInt10140
		= Class490.method11238((((Class241_Sub38) this)
					.aClass475_Sub1_Sub1_Sub3_Sub1_10131),
				       -301413903) * 516554003;
	    ((Class241_Sub38) this).anInt10127
		= (-2021578193
		   * (1294463297 * (((Class241_Sub38) this)
				    .aClass475_Sub1_Sub1_Sub3_Sub1_10131
				    .anInt11513)
		      << 9));
	    ((Class241_Sub38) this).anInt10126 = 0;
	    ((Class241_Sub38) this).anInt10128
		= 776085649 * (((Class241_Sub38) this)
			       .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			       .anInt11514);
	    ((Class241_Sub38) this).anInt10139 = -490109696;
	    ((Class241_Sub38) this).anInt10138 = 591836416;
	}
	if (i != ((Class241_Sub38) this).anInt10140 * 1309234459
	    && ((Class241_Sub38) this).aClass221_10141 != null
	    && null != ((Class241_Sub38) this).aClass221_10141) {
	    ((Class241_Sub38) this).aClass221_10141.method4405(100,
							       -1207024937);
	    Class402.soundManager.method1136((((Class241_Sub38) this)
					       .aClass221_10141),
					      (byte) -24);
	    ((Class241_Sub38) this).aClass221_10141 = null;
	}
    }
    
    void method16429() {
	int i = 1309234459 * ((Class241_Sub38) this).anInt10140;
	if (((Class241_Sub38) this).aClass526_10132 != null) {
	    ObjectDefinition class526
		= (((Class241_Sub38) this).aClass526_10132.method11768
		   (Class1.aClass19_11,
		    (4 == client.anInt8266 * -831877317
		     ? (Interface11) Class104.anInterface11_1485
		     : Class1.aClass19_11),
		    -1882367883));
	    if (null != class526) {
		((Class241_Sub38) this).anInt10140
		    = class526.anInt6886 * -1637559899;
		((Class241_Sub38) this).anInt10127
		    = (837167253 * class526.anInt6841 << 9) * -2021578193;
		((Class241_Sub38) this).anInt10128
		    = class526.anInt6889 * 1943750543;
		((Class241_Sub38) this).anInt10143
		    = class526.anInt6887 * -2124586309;
		((Class241_Sub38) this).anInt10144
		    = class526.anInt6891 * -487054103;
		((Class241_Sub38) this).anIntArray10145
		    = class526.anIntArray6892;
		((Class241_Sub38) this).anInt10139
		    = class526.anInt6855 * -934793689;
		((Class241_Sub38) this).anInt10138
		    = 47376031 * class526.anInt6900;
	    } else {
		((Class241_Sub38) this).anInt10140 = -516554003;
		((Class241_Sub38) this).anInt10127 = 0;
		((Class241_Sub38) this).anInt10128 = 0;
		((Class241_Sub38) this).anInt10143 = 0;
		((Class241_Sub38) this).anInt10144 = 0;
		((Class241_Sub38) this).anIntArray10145 = null;
		((Class241_Sub38) this).anInt10139 = -490109696;
		((Class241_Sub38) this).anInt10138 = 591836416;
		((Class241_Sub38) this).anInt10126 = 0;
	    }
	} else if (((Class241_Sub38) this).aClass475_Sub1_Sub1_Sub3_Sub2_10130
		   != null) {
	    int i_11_
		= Class130.method3072((((Class241_Sub38) this)
				       .aClass475_Sub1_Sub1_Sub3_Sub2_10130),
				      -2037844536);
	    if (i != i_11_) {
		((Class241_Sub38) this).anInt10140 = i_11_ * 516554003;
		NPCDefinition class401
		    = (((Class241_Sub38) this)
		       .aClass475_Sub1_Sub1_Sub3_Sub2_10130.definition);
		if (null != class401.transformTo)
		    class401
			= class401.method7176(Class1.aClass19_11,
					      Class1.aClass19_11, (byte) 86);
		if (class401 != null) {
		    ((Class241_Sub38) this).anInt10127
			= -2021578193 * (413101209 * class401.anInt5866 << 9);
		    ((Class241_Sub38) this).anInt10126
			= (class401.anInt5856 * 1256957735 << 9) * -1530155547;
		    ((Class241_Sub38) this).anInt10128
			= 508697239 * class401.anInt5857;
		    ((Class241_Sub38) this).anInt10139
			= class401.anInt5825 * 49411927;
		    ((Class241_Sub38) this).anInt10138
			= -1030406663 * class401.anInt5850;
		} else {
		    ((Class241_Sub38) this).anInt10126 = 0;
		    ((Class241_Sub38) this).anInt10127 = 0;
		    ((Class241_Sub38) this).anInt10128 = 0;
		    ((Class241_Sub38) this).anInt10139 = -490109696;
		    ((Class241_Sub38) this).anInt10138 = 591836416;
		}
	    }
	} else if (null != (((Class241_Sub38) this)
			    .aClass475_Sub1_Sub1_Sub3_Sub1_10131)) {
	    ((Class241_Sub38) this).anInt10140
		= Class490.method11238((((Class241_Sub38) this)
					.aClass475_Sub1_Sub1_Sub3_Sub1_10131),
				       1990839547) * 516554003;
	    ((Class241_Sub38) this).anInt10127
		= (-2021578193
		   * (1294463297 * (((Class241_Sub38) this)
				    .aClass475_Sub1_Sub1_Sub3_Sub1_10131
				    .anInt11513)
		      << 9));
	    ((Class241_Sub38) this).anInt10126 = 0;
	    ((Class241_Sub38) this).anInt10128
		= 776085649 * (((Class241_Sub38) this)
			       .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			       .anInt11514);
	    ((Class241_Sub38) this).anInt10139 = -490109696;
	    ((Class241_Sub38) this).anInt10138 = 591836416;
	}
	if (i != ((Class241_Sub38) this).anInt10140 * 1309234459
	    && ((Class241_Sub38) this).aClass221_10141 != null
	    && null != ((Class241_Sub38) this).aClass221_10141) {
	    ((Class241_Sub38) this).aClass221_10141.method4405(100,
							       -495537518);
	    Class402.soundManager.method1136((((Class241_Sub38) this)
					       .aClass221_10141),
					      (byte) -103);
	    ((Class241_Sub38) this).aClass221_10141 = null;
	}
    }
    
    static void method16430(Class241_Sub38 class241_sub38, int i, int i_12_,
			    int i_13_, int i_14_) {
	if (-1 != 1309234459 * ((Class241_Sub38) class241_sub38).anInt10140
	    || null != ((Class241_Sub38) class241_sub38).anIntArray10145) {
	    int i_15_
		= ((Class241_Sub38) class241_sub38).anInt10128 * -1813901463;
	    if (((Class241_Sub38) class241_sub38).anInt10127 * 1736072399 == 0
		|| Class241_Sub5_Sub9.aClass241_Sub9_11043
		       .aClass445_Sub6_8888.method14143(2094807112) == 0
		|| (1193750551 * ((Class241_Sub38) class241_sub38).anInt10119
		    != i)) {
		if (((Class241_Sub38) class241_sub38).aClass221_10141
		    != null) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(100, -1302295338);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -72);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
	    } else {
		if (null != ((Class241_Sub38) class241_sub38).aClass221_10141
		    && (((Class241_Sub38) class241_sub38).aClass221_10141
			    .method4398(-2083685623) == Class223.aClass223_2600
			|| (((Class241_Sub38) class241_sub38)
				.aClass221_10141.method4398(-1939571079)
			    == Class223.aClass223_2596))) {
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -100);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		if (null
		    == ((Class241_Sub38) class241_sub38).aClass221_10141) {
		    if ((1309234459
			 * ((Class241_Sub38) class241_sub38).anInt10140)
			>= 0) {
			int i_16_ = 256;
			int i_17_
			    = (int) ((0.5F
				      * (float) ((((Class241_Sub38)
						   class241_sub38).anInt10122
						  * -2146083433)
						 - (((Class241_Sub38)
						     class241_sub38).anInt10121
						    * 627217157)))
				     + (float) (627217157 * (((Class241_Sub38)
							      class241_sub38)
							     .anInt10121)));
			int i_18_
			    = (int) ((float) (268994875
					      * ((Class241_Sub38)
						 class241_sub38).anInt10137)
				     + 0.5F * (float) ((1952696383
							* (((Class241_Sub38)
							    class241_sub38)
							   .anInt10123))
						       - (268994875
							  * (((Class241_Sub38)
							      class241_sub38)
							     .anInt10137))));
			((Class241_Sub38) class241_sub38).aClass287_10125
			    .aFloat4477
			    = (float) i_17_;
			((Class241_Sub38) class241_sub38).aClass287_10125
			    .aFloat4479
			    = (float) i_18_;
			((Class241_Sub38) class241_sub38).aClass221_10141
			    = (Class402.soundManager.method1161
			       (Class112.aClass112_1526, class241_sub38,
				1309234459 * (((Class241_Sub38) class241_sub38)
					      .anInt10140),
				-1, 0,
				Class130.aClass130_1604.method3067(-960497231),
				Class127.aClass127_1584,
				(float) (1376241645
					 * (((Class241_Sub38) class241_sub38)
					    .anInt10126)),
				(float) ((((Class241_Sub38) class241_sub38)
					  .anInt10127)
					 * 1736072399),
				(((Class241_Sub38) class241_sub38)
				 .aClass287_10125),
				0, i_16_, false, 1948486739));
			if (null != (((Class241_Sub38) class241_sub38)
				     .aClass221_10141)) {
			    float f = (float) i_15_ / 255.0F;
			    ((Class241_Sub38) class241_sub38)
				.aClass221_10141
				.method4440(f, 150, -1561158154);
			    ((Class241_Sub38) class241_sub38)
				.aClass221_10141.method4392(2135330945);
			}
		    }
		} else {
		    int i_19_
			= (int) ((float) ((((Class241_Sub38) class241_sub38)
					   .anInt10122) * -2146083433
					  - (((Class241_Sub38) class241_sub38)
					     .anInt10121) * 627217157) * 0.5F
				 + (float) (627217157
					    * ((Class241_Sub38)
					       class241_sub38).anInt10121));
		    int i_20_
			= (int) ((float) ((((Class241_Sub38) class241_sub38)
					   .anInt10123) * 1952696383
					  - (((Class241_Sub38) class241_sub38)
					     .anInt10137) * 268994875) * 0.5F
				 + (float) (268994875
					    * ((Class241_Sub38)
					       class241_sub38).anInt10137));
		    ((Class241_Sub38) class241_sub38).aClass287_10125
			.aFloat4477
			= (float) i_19_;
		    ((Class241_Sub38) class241_sub38).aClass287_10125
			.aFloat4479
			= (float) i_20_;
		}
		if (null
		    == ((Class241_Sub38) class241_sub38).aClass221_10142) {
		    if ((null
			 != ((Class241_Sub38) class241_sub38).anIntArray10145)
			&& (((Class241_Sub38) class241_sub38).anInt10146
			    -= 1463017049 * i_14_) * 1721076201 <= 0) {
			int i_21_
			    = (((((Class241_Sub38) class241_sub38).anInt10139
				 * -1282947251) == 256
				&& (1118959517 * ((Class241_Sub38)
						  class241_sub38).anInt10138
				    == 256))
			       ? 256
			       : ((int) (Math.random()
					 * (double) ((-1282947251
						      * (((Class241_Sub38)
							  class241_sub38)
							 .anInt10139))
						     - ((((Class241_Sub38)
							  class241_sub38)
							 .anInt10138)
							* 1118959517)))
				  + (((Class241_Sub38) class241_sub38)
				     .anInt10138) * 1118959517));
			int i_22_
			    = (int) (Math.random()
				     * (double) (((Class241_Sub38)
						  class241_sub38)
						 .anIntArray10145).length);
			int i_23_
			    = (int) ((float) (627217157
					      * ((Class241_Sub38)
						 class241_sub38).anInt10121)
				     + (float) ((((Class241_Sub38)
						  class241_sub38).anInt10122
						 * -2146083433)
						- (((Class241_Sub38)
						    class241_sub38).anInt10121
						   * 627217157)) * 0.5F);
			int i_24_
			    = (int) ((float) (((Class241_Sub38)
					       class241_sub38).anInt10137
					      * 268994875)
				     + 0.5F * (float) (((((Class241_Sub38)
							  class241_sub38)
							 .anInt10123)
							* 1952696383)
						       - ((((Class241_Sub38)
							    class241_sub38)
							   .anInt10137)
							  * 268994875)));
			((Class241_Sub38) class241_sub38).aClass287_10124
			    .aFloat4477
			    = (float) i_23_;
			((Class241_Sub38) class241_sub38).aClass287_10124
			    .aFloat4479
			    = (float) i_24_;
			((Class241_Sub38) class241_sub38).aClass221_10142
			    = (Class402.soundManager.method1161
			       (Class112.aClass112_1514, class241_sub38,
				(((Class241_Sub38) class241_sub38)
				 .anIntArray10145[i_22_]),
				0, i_15_,
				Class130.aClass130_1595.method3067(-960497231),
				Class127.aClass127_1584,
				(float) ((((Class241_Sub38) class241_sub38)
					  .anInt10126)
					 * 1376241645),
				(float) ((((Class241_Sub38) class241_sub38)
					  .anInt10126) * 1376241645
					 + 1736072399 * (((Class241_Sub38)
							  class241_sub38)
							 .anInt10127)),
				(((Class241_Sub38) class241_sub38)
				 .aClass287_10124),
				0, i_21_, false, -979404095));
			if (null != (((Class241_Sub38) class241_sub38)
				     .aClass221_10142))
			    ((Class241_Sub38) class241_sub38)
				.aClass221_10142.method4392(1933053547);
			((Class241_Sub38) class241_sub38).anInt10146
			    = ((473638539 * (((Class241_Sub38) class241_sub38)
					     .anInt10143)
				+ (int) (Math.random()
					 * (double) ((-1567734647
						      * (((Class241_Sub38)
							  class241_sub38)
							 .anInt10144))
						     - ((((Class241_Sub38)
							  class241_sub38)
							 .anInt10143)
							* 473638539))))
			       * 1463017049);
		    }
		} else {
		    int i_25_
			= (int) ((float) ((((Class241_Sub38) class241_sub38)
					   .anInt10121)
					  * 627217157)
				 + 0.5F * (float) ((((Class241_Sub38)
						     class241_sub38).anInt10122
						    * -2146083433)
						   - ((((Class241_Sub38)
							class241_sub38)
						       .anInt10121)
						      * 627217157)));
		    int i_26_
			= (int) ((float) (268994875
					  * (((Class241_Sub38) class241_sub38)
					     .anInt10137))
				 + (float) ((((Class241_Sub38) class241_sub38)
					     .anInt10123) * 1952696383
					    - (((Class241_Sub38)
						class241_sub38).anInt10137
					       * 268994875)) * 0.5F);
		    ((Class241_Sub38) class241_sub38).aClass287_10124
			.aFloat4477
			= (float) i_25_;
		    ((Class241_Sub38) class241_sub38).aClass287_10124
			.aFloat4479
			= (float) i_26_;
		    if (((Class241_Sub38) class241_sub38).aClass221_10142
			    .method4398(-1919172035) == Class223.aClass223_2600
			|| (((Class241_Sub38) class241_sub38)
				.aClass221_10142.method4398(-2112869887)
			    == Class223.aClass223_2596)) {
			Class402.soundManager.method1136((((Class241_Sub38)
							    class241_sub38)
							   .aClass221_10142),
							  (byte) -87);
			((Class241_Sub38) class241_sub38).aClass221_10142
			    = null;
		    }
		}
	    }
	}
    }
    
    public static void method16431(int i, int i_27_, int i_28_, int i_29_) {
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7694(16711935);
	     null != class241_sub38;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10116.method7692(1270585557))
	    GameShell3$FrameParameters.method5023(class241_sub38, i, i_27_, i_28_, i_29_,
				(byte) 0);
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7694(16711935);
	     class241_sub38 != null;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7692(1808894756)) {
	    int i_30_ = 1;
	    Class554 class554 = ((Class241_Sub38) class241_sub38)
				    .aClass475_Sub1_Sub1_Sub3_Sub2_10130
				    .method17787(1456948429);
	    int i_31_ = ((Class241_Sub38) class241_sub38)
			    .aClass475_Sub1_Sub1_Sub3_Sub2_10130
			    .aClass409_Sub1_11405.method7346(-547212384);
	    if (-1 == i_31_ || (((Class241_Sub38) class241_sub38)
				.aClass475_Sub1_Sub1_Sub3_Sub2_10130
				.aClass409_Sub1_11405.aBool8600))
		i_30_ = 0;
	    else if (class554.anInt7213 * -1503148783 == i_31_
		     || i_31_ == 1122571643 * class554.anInt7214
		     || i_31_ == -1591850491 * class554.anInt7226
		     || i_31_ == class554.anInt7215 * -526852481)
		i_30_ = 2;
	    else if (i_31_ == -504629317 * class554.anInt7217
		     || i_31_ == class554.anInt7216 * 62833745
		     || i_31_ == 2130754419 * class554.anInt7220
		     || i_31_ == -216997439 * class554.anInt7212)
		i_30_ = 3;
	    if (i_30_ != (((Class241_Sub38) class241_sub38).anInt10136
			  * -1894401483)) {
		int i_32_ = (Class130.method3072
			     ((((Class241_Sub38) class241_sub38)
			       .aClass475_Sub1_Sub1_Sub3_Sub2_10130),
			      -2037844536));
		NPCDefinition class401
		    = (((Class241_Sub38) class241_sub38)
		       .aClass475_Sub1_Sub1_Sub3_Sub2_10130.definition);
		if (class401.transformTo != null)
		    class401
			= class401.method7176(Class1.aClass19_11,
					      Class1.aClass19_11, (byte) 10);
		if (null == class401 || i_32_ == -1) {
		    ((Class241_Sub38) class241_sub38).anInt10140 = -516554003;
		    ((Class241_Sub38) class241_sub38).anInt10136
			= -757118947 * i_30_;
		} else if (i_32_
			   != 1309234459 * (((Class241_Sub38) class241_sub38)
					    .anInt10140)) {
		    boolean bool = false;
		    if (((Class241_Sub38) class241_sub38).aClass221_10141
			!= null) {
			((Class241_Sub38) class241_sub38).anInt10128
			    -= 1457631744;
			if ((-1813901463
			     * ((Class241_Sub38) class241_sub38).anInt10128)
			    <= 0) {
			    ((Class241_Sub38) class241_sub38)
				.aClass221_10141.method4405(100, -1262502251);
			    Class402.soundManager.method1136
				((((Class241_Sub38) class241_sub38)
				  .aClass221_10141),
				 (byte) -112);
			    ((Class241_Sub38) class241_sub38).aClass221_10141
				= null;
			    bool = true;
			}
		    } else
			bool = true;
		    if (bool) {
			((Class241_Sub38) class241_sub38).anInt10128
			    = 508697239 * class401.anInt5857;
			((Class241_Sub38) class241_sub38).anInt10140
			    = 516554003 * i_32_;
			((Class241_Sub38) class241_sub38).anInt10136
			    = i_30_ * -757118947;
		    }
		} else {
		    ((Class241_Sub38) class241_sub38).anInt10136
			= i_30_ * -757118947;
		    ((Class241_Sub38) class241_sub38).anInt10128
			= class401.anInt5857 * 508697239;
		}
	    }
	    Class287 class287
		= (((Class241_Sub38) class241_sub38)
		       .aClass475_Sub1_Sub1_Sub3_Sub2_10130.method10874
		   ().aClass287_4386);
	    ((Class241_Sub38) class241_sub38).anInt10121
		= -1165213235 * (int) class287.aFloat4477;
	    ((Class241_Sub38) class241_sub38).anInt10122
		= ((int) class287.aFloat4477
		   + (((Class241_Sub38) class241_sub38)
			  .aClass475_Sub1_Sub1_Sub3_Sub2_10130
			  .method17782(860039629)
		      << 8)) * 2091577895;
	    ((Class241_Sub38) class241_sub38).anInt10137
		= (int) class287.aFloat4479 * -1759680525;
	    ((Class241_Sub38) class241_sub38).anInt10123
		= ((int) class287.aFloat4479
		   + (((Class241_Sub38) class241_sub38)
			  .aClass475_Sub1_Sub1_Sub3_Sub2_10130
			  .method17782(148292110)
		      << 8)) * 1727276991;
	    ((Class241_Sub38) class241_sub38).anInt10119
		= ((((Class241_Sub38) class241_sub38)
		    .aClass475_Sub1_Sub1_Sub3_Sub2_10130.nodePlane)
		   * 1647904679);
	    GameShell3$FrameParameters.method5023(class241_sub38, i, i_27_, i_28_, i_29_,
				(byte) 0);
	}
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass407_10118.method7294(2090894173);
	     null != class241_sub38;
	     class241_sub38
		 = (Class241_Sub38) aClass407_10118.method7295(971232955)) {
	    int i_33_ = 1;
	    Class554 class554 = ((Class241_Sub38) class241_sub38)
				    .aClass475_Sub1_Sub1_Sub3_Sub1_10131
				    .method17787(683320023);
	    int i_34_ = ((Class241_Sub38) class241_sub38)
			    .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			    .aClass409_Sub1_11405.method7346(-1957438589);
	    if (i_34_ == -1 || (((Class241_Sub38) class241_sub38)
				.aClass475_Sub1_Sub1_Sub3_Sub1_10131
				.aClass409_Sub1_11405.aBool8600))
		i_33_ = 0;
	    else if (-1503148783 * class554.anInt7213 == i_34_
		     || i_34_ == class554.anInt7214 * 1122571643
		     || i_34_ == -1591850491 * class554.anInt7226
		     || i_34_ == class554.anInt7215 * -526852481)
		i_33_ = 2;
	    else if (i_34_ == -504629317 * class554.anInt7217
		     || i_34_ == 62833745 * class554.anInt7216
		     || i_34_ == 2130754419 * class554.anInt7220
		     || i_34_ == class554.anInt7212 * -216997439)
		i_33_ = 3;
	    if (((Class241_Sub38) class241_sub38).anInt10136 * -1894401483
		!= i_33_) {
		int i_35_ = (Class490.method11238
			     ((((Class241_Sub38) class241_sub38)
			       .aClass475_Sub1_Sub1_Sub3_Sub1_10131),
			      -516131305));
		if (i_35_ != 1309234459 * (((Class241_Sub38) class241_sub38)
					   .anInt10140)) {
		    boolean bool = false;
		    if (((Class241_Sub38) class241_sub38).aClass221_10141
			!= null) {
			((Class241_Sub38) class241_sub38).anInt10128
			    -= 1457631744;
			if ((-1813901463
			     * ((Class241_Sub38) class241_sub38).anInt10128)
			    <= 0) {
			    ((Class241_Sub38) class241_sub38)
				.aClass221_10141.method4405(100, -1997290639);
			    Class402.soundManager.method1136
				((((Class241_Sub38) class241_sub38)
				  .aClass221_10141),
				 (byte) -6);
			    ((Class241_Sub38) class241_sub38).aClass221_10141
				= null;
			    bool = true;
			}
		    } else
			bool = true;
		    if (bool) {
			((Class241_Sub38) class241_sub38).anInt10128
			    = 776085649 * (((Class241_Sub38) class241_sub38)
					   .aClass475_Sub1_Sub1_Sub3_Sub1_10131
					   .anInt11514);
			((Class241_Sub38) class241_sub38).anInt10140
			    = 516554003 * i_35_;
			((Class241_Sub38) class241_sub38).anInt10136
			    = i_33_ * -757118947;
		    }
		} else {
		    ((Class241_Sub38) class241_sub38).anInt10128
			= ((((Class241_Sub38) class241_sub38)
			    .aClass475_Sub1_Sub1_Sub3_Sub1_10131.anInt11514)
			   * 776085649);
		    ((Class241_Sub38) class241_sub38).anInt10136
			= i_33_ * -757118947;
		}
	    }
	    Class287 class287
		= (((Class241_Sub38) class241_sub38)
		       .aClass475_Sub1_Sub1_Sub3_Sub1_10131.method10874
		   ().aClass287_4386);
	    ((Class241_Sub38) class241_sub38).anInt10121
		= -1165213235 * (int) class287.aFloat4477;
	    ((Class241_Sub38) class241_sub38).anInt10122
		= ((int) class287.aFloat4477
		   + (((Class241_Sub38) class241_sub38)
			  .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			  .method17782(429480127)
		      << 8)) * 2091577895;
	    ((Class241_Sub38) class241_sub38).anInt10137
		= (int) class287.aFloat4479 * -1759680525;
	    ((Class241_Sub38) class241_sub38).anInt10123
		= ((int) class287.aFloat4479
		   + (((Class241_Sub38) class241_sub38)
			  .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			  .method17782(-1074555427)
		      << 8)) * 1727276991;
	    ((Class241_Sub38) class241_sub38).anInt10119
		= ((((Class241_Sub38) class241_sub38)
		    .aClass475_Sub1_Sub1_Sub3_Sub1_10131.nodePlane)
		   * 1647904679);
	    GameShell3$FrameParameters.method5023(class241_sub38, i, i_27_, i_28_, i_29_,
				(byte) 0);
	}
    }
    
    void method16432(int i) {
	int i_36_ = 1309234459 * ((Class241_Sub38) this).anInt10140;
	if (((Class241_Sub38) this).aClass526_10132 != null) {
	    ObjectDefinition class526
		= (((Class241_Sub38) this).aClass526_10132.method11768(Class1.aClass19_11,
		    (4 == client.anInt8266 * -831877317
		     ? (Interface11) Class104.anInterface11_1485
		     : Class1.aClass19_11),
		    -494054881));
	    if (null != class526) {
		((Class241_Sub38) this).anInt10140
		    = class526.anInt6886 * -1637559899;
		((Class241_Sub38) this).anInt10127
		    = (837167253 * class526.anInt6841 << 9) * -2021578193;
		((Class241_Sub38) this).anInt10128
		    = class526.anInt6889 * 1943750543;
		((Class241_Sub38) this).anInt10143
		    = class526.anInt6887 * -2124586309;
		((Class241_Sub38) this).anInt10144
		    = class526.anInt6891 * -487054103;
		((Class241_Sub38) this).anIntArray10145
		    = class526.anIntArray6892;
		((Class241_Sub38) this).anInt10139
		    = class526.anInt6855 * -934793689;
		((Class241_Sub38) this).anInt10138
		    = 47376031 * class526.anInt6900;
	    } else {
		((Class241_Sub38) this).anInt10140 = -516554003;
		((Class241_Sub38) this).anInt10127 = 0;
		((Class241_Sub38) this).anInt10128 = 0;
		((Class241_Sub38) this).anInt10143 = 0;
		((Class241_Sub38) this).anInt10144 = 0;
		((Class241_Sub38) this).anIntArray10145 = null;
		((Class241_Sub38) this).anInt10139 = -490109696;
		((Class241_Sub38) this).anInt10138 = 591836416;
		((Class241_Sub38) this).anInt10126 = 0;
	    }
	} else if (((Class241_Sub38) this).aClass475_Sub1_Sub1_Sub3_Sub2_10130
		   != null) {
	    int i_37_
		= Class130.method3072((((Class241_Sub38) this)
				       .aClass475_Sub1_Sub1_Sub3_Sub2_10130),
				      -2037844536);
	    if (i_36_ != i_37_) {
		((Class241_Sub38) this).anInt10140 = i_37_ * 516554003;
		NPCDefinition class401
		    = (((Class241_Sub38) this)
		       .aClass475_Sub1_Sub1_Sub3_Sub2_10130.definition);
		if (null != class401.transformTo)
		    class401
			= class401.method7176(Class1.aClass19_11,
					      Class1.aClass19_11, (byte) 5);
		if (class401 != null) {
		    ((Class241_Sub38) this).anInt10127
			= -2021578193 * (413101209 * class401.anInt5866 << 9);
		    ((Class241_Sub38) this).anInt10126
			= (class401.anInt5856 * 1256957735 << 9) * -1530155547;
		    ((Class241_Sub38) this).anInt10128
			= 508697239 * class401.anInt5857;
		    ((Class241_Sub38) this).anInt10139
			= class401.anInt5825 * 49411927;
		    ((Class241_Sub38) this).anInt10138
			= -1030406663 * class401.anInt5850;
		} else {
		    ((Class241_Sub38) this).anInt10126 = 0;
		    ((Class241_Sub38) this).anInt10127 = 0;
		    ((Class241_Sub38) this).anInt10128 = 0;
		    ((Class241_Sub38) this).anInt10139 = -490109696;
		    ((Class241_Sub38) this).anInt10138 = 591836416;
		}
	    }
	} else if (null != (((Class241_Sub38) this)
			    .aClass475_Sub1_Sub1_Sub3_Sub1_10131)) {
	    ((Class241_Sub38) this).anInt10140
		= Class490.method11238((((Class241_Sub38) this)
					.aClass475_Sub1_Sub1_Sub3_Sub1_10131),
				       1451751068) * 516554003;
	    ((Class241_Sub38) this).anInt10127
		= (-2021578193
		   * (1294463297 * (((Class241_Sub38) this)
				    .aClass475_Sub1_Sub1_Sub3_Sub1_10131
				    .anInt11513)
		      << 9));
	    ((Class241_Sub38) this).anInt10126 = 0;
	    ((Class241_Sub38) this).anInt10128
		= 776085649 * (((Class241_Sub38) this)
			       .aClass475_Sub1_Sub1_Sub3_Sub1_10131
			       .anInt11514);
	    ((Class241_Sub38) this).anInt10139 = -490109696;
	    ((Class241_Sub38) this).anInt10138 = 591836416;
	}
	if (i_36_ != ((Class241_Sub38) this).anInt10140 * 1309234459
	    && ((Class241_Sub38) this).aClass221_10141 != null
	    && null != ((Class241_Sub38) this).aClass221_10141) {
	    ((Class241_Sub38) this).aClass221_10141.method4405(100,
							       -183000498);
	    Class402.soundManager.method1136((((Class241_Sub38) this)
					       .aClass221_10141),
					      (byte) -15);
	    ((Class241_Sub38) this).aClass221_10141 = null;
	}
    }
    
    public static void method16433
	(NPC class475_sub1_sub1_sub3_sub2) {
	for (Class241_Sub38 class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7694(16711935);
	     class241_sub38 != null;
	     class241_sub38
		 = (Class241_Sub38) aClass429_10117.method7692(-23048150)) {
	    if ((((Class241_Sub38) class241_sub38)
		 .aClass475_Sub1_Sub1_Sub3_Sub2_10130)
		== class475_sub1_sub1_sub3_sub2) {
		if (null
		    != ((Class241_Sub38) class241_sub38).aClass221_10141) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(100, -54313170);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -110);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		class241_sub38.remove((byte) 36);
		break;
	    }
	}
    }
    
    public static void method16434
	(Player class475_sub1_sub1_sub3_sub1) {
	Class241_Sub38 class241_sub38
	    = ((Class241_Sub38)
	       aClass407_10118.get((long) ((class475_sub1_sub1_sub3_sub1
						   .entityIndex)
						  * -546698383)));
	if (null != class241_sub38) {
	    if (((Class241_Sub38) class241_sub38).aClass221_10141 != null) {
		((Class241_Sub38) class241_sub38).aClass221_10141
		    .method4405(100, -923259418);
		Class402.soundManager.method1136((((Class241_Sub38)
						    class241_sub38)
						   .aClass221_10141),
						  (byte) -27);
		((Class241_Sub38) class241_sub38).aClass221_10141 = null;
	    }
	    class241_sub38.remove((byte) 36);
	}
    }
    
    public static void method16435
	(int i, int i_38_, int i_39_, int i_40_, ObjectDefinition class526,
	 NPC class475_sub1_sub1_sub3_sub2,
	 Player class475_sub1_sub1_sub3_sub1) {
	Class241_Sub38 class241_sub38 = new Class241_Sub38();
	((Class241_Sub38) class241_sub38).anInt10119 = i * 1647904679;
	((Class241_Sub38) class241_sub38).anInt10121
	    = -1165213235 * (i_38_ << 9);
	((Class241_Sub38) class241_sub38).anInt10137
	    = (i_39_ << 9) * -1759680525;
	if (null != class526) {
	    ((Class241_Sub38) class241_sub38).aClass526_10132 = class526;
	    int i_41_ = class526.sizeX * 1351092869;
	    int i_42_ = class526.sizeY * 333584223;
	    if (i_40_ == 1 || 3 == i_40_) {
		i_41_ = class526.sizeY * 333584223;
		i_42_ = 1351092869 * class526.sizeX;
	    }
	    ((Class241_Sub38) class241_sub38).anInt10122
		= 2091577895 * (i_38_ + i_41_ << 9);
	    ((Class241_Sub38) class241_sub38).anInt10123
		= (i_39_ + i_42_ << 9) * 1727276991;
	    ((Class241_Sub38) class241_sub38).anInt10140
		= class526.anInt6886 * -1637559899;
	    ((Class241_Sub38) class241_sub38).anInt10127
		= (class526.anInt6841 * 837167253 << 9) * -2021578193;
	    ((Class241_Sub38) class241_sub38).anInt10128
		= class526.anInt6889 * 1943750543;
	    ((Class241_Sub38) class241_sub38).anInt10143
		= class526.anInt6887 * -2124586309;
	    ((Class241_Sub38) class241_sub38).anInt10144
		= class526.anInt6891 * -487054103;
	    ((Class241_Sub38) class241_sub38).anIntArray10145
		= class526.anIntArray6892;
	    ((Class241_Sub38) class241_sub38).anInt10139
		= class526.anInt6855 * -934793689;
	    ((Class241_Sub38) class241_sub38).anInt10138
		= class526.anInt6900 * 47376031;
	    ((Class241_Sub38) class241_sub38).anInt10126
		= (873029439 * class526.anInt6888 << 9) * -1530155547;
	    if (class526.toObjectIDs != null) {
		((Class241_Sub38) class241_sub38).aBool10120 = true;
		class241_sub38.method16432(1874524786);
	    }
	    if (((Class241_Sub38) class241_sub38).anIntArray10145 != null)
		((Class241_Sub38) class241_sub38).anInt10146
		    = (((473638539
			 * ((Class241_Sub38) class241_sub38).anInt10143)
			+ (int) (Math.random()
				 * (double) ((((Class241_Sub38) class241_sub38)
					      .anInt10144) * -1567734647
					     - 473638539 * (((Class241_Sub38)
							     class241_sub38)
							    .anInt10143))))
		       * 1463017049);
	    aClass429_10116.addNode(class241_sub38, (short) -32155);
	    Class402.soundManager.method1155((((Class241_Sub38)
						class241_sub38).anInt10140
					       * 1309234459),
					      (byte) 8);
	    Class402.soundManager.method1154(((Class241_Sub38)
					       class241_sub38).anIntArray10145,
					      -1796163270);
	} else if (class475_sub1_sub1_sub3_sub2 != null) {
	    ((Class241_Sub38) class241_sub38)
		.aClass475_Sub1_Sub1_Sub3_Sub2_10130
		= class475_sub1_sub1_sub3_sub2;
	    NPCDefinition class401 = class475_sub1_sub1_sub3_sub2.definition;
	    if (class401.transformTo != null) {
		((Class241_Sub38) class241_sub38).aBool10120 = true;
		class401 = class401.method7176(Class1.aClass19_11,
					       Class1.aClass19_11, (byte) 98);
	    }
	    if (null != class401) {
		((Class241_Sub38) class241_sub38).anInt10122
		    = ((i_38_ + class401.size * 19489015 << 9)
		       * 2091577895);
		((Class241_Sub38) class241_sub38).anInt10123
		    = 1727276991 * (19489015 * class401.size + i_39_
				    << 9);
		((Class241_Sub38) class241_sub38).anInt10140
		    = Class130.method3072(class475_sub1_sub1_sub3_sub2,
					  -2037844536) * 516554003;
		((Class241_Sub38) class241_sub38).anInt10127
		    = -2021578193 * (class401.anInt5866 * 413101209 << 9);
		((Class241_Sub38) class241_sub38).anInt10128
		    = class401.anInt5857 * 508697239;
		((Class241_Sub38) class241_sub38).anInt10139
		    = class401.anInt5825 * 49411927;
		((Class241_Sub38) class241_sub38).anInt10138
		    = class401.anInt5850 * -1030406663;
		((Class241_Sub38) class241_sub38).anInt10126
		    = -1530155547 * (class401.anInt5856 * 1256957735 << 9);
		Class402.soundManager
		    .method1155(class401.anInt5819 * 1319993127, (byte) 8);
		Class402.soundManager
		    .method1155(-199136369 * class401.anInt5852, (byte) 8);
		Class402.soundManager
		    .method1155(class401.anInt5808 * -97900731, (byte) 8);
		Class402.soundManager
		    .method1155(class401.anInt5858 * -1561948383, (byte) 8);
	    }
	    aClass429_10117.addNode(class241_sub38, (short) -9578);
	} else if (null != class475_sub1_sub1_sub3_sub1) {
	    ((Class241_Sub38) class241_sub38)
		.aClass475_Sub1_Sub1_Sub3_Sub1_10131
		= class475_sub1_sub1_sub3_sub1;
	    ((Class241_Sub38) class241_sub38).anInt10122
		= (i_38_ + class475_sub1_sub1_sub3_sub1.method17782(662281005)
		   << 9) * 2091577895;
	    ((Class241_Sub38) class241_sub38).anInt10123
		= (i_39_ + class475_sub1_sub1_sub3_sub1.method17782(665372194)
		   << 9) * 1727276991;
	    ((Class241_Sub38) class241_sub38).anInt10140
		= Class490.method11238(class475_sub1_sub1_sub3_sub1,
				       -1947912086) * 516554003;
	    ((Class241_Sub38) class241_sub38).anInt10127
		= (-2021578193
		   * (class475_sub1_sub1_sub3_sub1.anInt11513 * 1294463297
		      << 9));
	    ((Class241_Sub38) class241_sub38).anInt10128
		= 776085649 * class475_sub1_sub1_sub3_sub1.anInt11514;
	    ((Class241_Sub38) class241_sub38).anInt10139 = -490109696;
	    ((Class241_Sub38) class241_sub38).anInt10138 = 591836416;
	    ((Class241_Sub38) class241_sub38).anInt10126 = 0;
	    aClass407_10118.put(class241_sub38,
				       (long) ((class475_sub1_sub1_sub3_sub1
						.entityIndex)
					       * -546698383));
	    Class402.soundManager.method1155((class475_sub1_sub1_sub3_sub1
					       .anInt11509) * -196777165,
					      (byte) 8);
	    Class402.soundManager.method1155((-405630403
					       * (class475_sub1_sub1_sub3_sub1
						  .anInt11510)),
					      (byte) 8);
	    Class402.soundManager.method1155((446821985
					       * (class475_sub1_sub1_sub3_sub1
						  .anInt11505)),
					      (byte) 8);
	    Class402.soundManager.method1155((869941981
					       * (class475_sub1_sub1_sub3_sub1
						  .anInt11512)),
					      (byte) 8);
	}
    }
    
    static int method16436
	(NPC class475_sub1_sub1_sub3_sub2) {
	NPCDefinition class401 = class475_sub1_sub1_sub3_sub2.definition;
	if (null != class401.transformTo) {
	    class401 = class401.method7176(Class1.aClass19_11,
					   Class1.aClass19_11, (byte) 106);
	    if (class401 == null)
		return -1;
	}
	int i = -97900731 * class401.anInt5808;
	Class554 class554
	    = class475_sub1_sub1_sub3_sub2.method17787(-1075426960);
	int i_43_ = class475_sub1_sub1_sub3_sub2.aClass409_Sub1_11405
			.method7346(-823874371);
	if (-1 == i_43_
	    || class475_sub1_sub1_sub3_sub2.aClass409_Sub1_11405.aBool8600)
	    i = class401.anInt5819 * 1319993127;
	else if (i_43_ == class554.anInt7213 * -1503148783
		 || i_43_ == 1122571643 * class554.anInt7214
		 || -1591850491 * class554.anInt7226 == i_43_
		 || class554.anInt7215 * -526852481 == i_43_)
	    i = -1561948383 * class401.anInt5858;
	else if (i_43_ == -504629317 * class554.anInt7217
		 || class554.anInt7216 * 62833745 == i_43_
		 || 2130754419 * class554.anInt7220 == i_43_
		 || i_43_ == -216997439 * class554.anInt7212)
	    i = class401.anInt5852 * -199136369;
	return i;
    }
    
    static int method16437
	(Player class475_sub1_sub1_sub3_sub1) {
	int i = 446821985 * class475_sub1_sub1_sub3_sub1.anInt11505;
	Class554 class554
	    = class475_sub1_sub1_sub3_sub1.method17787(-1314564941);
	int i_44_ = class475_sub1_sub1_sub3_sub1.aClass409_Sub1_11405
			.method7346(-807522982);
	if (-1 == i_44_
	    || class475_sub1_sub1_sub3_sub1.aClass409_Sub1_11405.aBool8600)
	    i = -196777165 * class475_sub1_sub1_sub3_sub1.anInt11509;
	else if (i_44_ == class554.anInt7213 * -1503148783
		 || class554.anInt7214 * 1122571643 == i_44_
		 || i_44_ == class554.anInt7226 * -1591850491
		 || -526852481 * class554.anInt7215 == i_44_)
	    i = 869941981 * class475_sub1_sub1_sub3_sub1.anInt11512;
	else if (i_44_ == -504629317 * class554.anInt7217
		 || i_44_ == class554.anInt7216 * 62833745
		 || class554.anInt7220 * 2130754419 == i_44_
		 || i_44_ == -216997439 * class554.anInt7212)
	    i = class475_sub1_sub1_sub3_sub1.anInt11510 * -405630403;
	return i;
    }
    
    Class241_Sub38() {
	((Class241_Sub38) this).aClass287_10124
	    = new Class287(0.0F, 0.0F, 0.0F);
	((Class241_Sub38) this).anInt10136 = 0;
    }
    
    public static void method16438
	(int i, int i_45_, int i_46_, int i_47_, ObjectDefinition class526,
	 NPC class475_sub1_sub1_sub3_sub2,
	 Player class475_sub1_sub1_sub3_sub1) {
	Class241_Sub38 class241_sub38 = new Class241_Sub38();
	((Class241_Sub38) class241_sub38).anInt10119 = i * 1647904679;
	((Class241_Sub38) class241_sub38).anInt10121
	    = -1165213235 * (i_45_ << 9);
	((Class241_Sub38) class241_sub38).anInt10137
	    = (i_46_ << 9) * -1759680525;
	if (null != class526) {
	    ((Class241_Sub38) class241_sub38).aClass526_10132 = class526;
	    int i_48_ = class526.sizeX * 1351092869;
	    int i_49_ = class526.sizeY * 333584223;
	    if (i_47_ == 1 || 3 == i_47_) {
		i_48_ = class526.sizeY * 333584223;
		i_49_ = 1351092869 * class526.sizeX;
	    }
	    ((Class241_Sub38) class241_sub38).anInt10122
		= 2091577895 * (i_45_ + i_48_ << 9);
	    ((Class241_Sub38) class241_sub38).anInt10123
		= (i_46_ + i_49_ << 9) * 1727276991;
	    ((Class241_Sub38) class241_sub38).anInt10140
		= class526.anInt6886 * -1637559899;
	    ((Class241_Sub38) class241_sub38).anInt10127
		= (class526.anInt6841 * 837167253 << 9) * -2021578193;
	    ((Class241_Sub38) class241_sub38).anInt10128
		= class526.anInt6889 * 1943750543;
	    ((Class241_Sub38) class241_sub38).anInt10143
		= class526.anInt6887 * -2124586309;
	    ((Class241_Sub38) class241_sub38).anInt10144
		= class526.anInt6891 * -487054103;
	    ((Class241_Sub38) class241_sub38).anIntArray10145
		= class526.anIntArray6892;
	    ((Class241_Sub38) class241_sub38).anInt10139
		= class526.anInt6855 * -934793689;
	    ((Class241_Sub38) class241_sub38).anInt10138
		= class526.anInt6900 * 47376031;
	    ((Class241_Sub38) class241_sub38).anInt10126
		= (873029439 * class526.anInt6888 << 9) * -1530155547;
	    if (class526.toObjectIDs != null) {
		((Class241_Sub38) class241_sub38).aBool10120 = true;
		class241_sub38.method16432(1186505363);
	    }
	    if (((Class241_Sub38) class241_sub38).anIntArray10145 != null)
		((Class241_Sub38) class241_sub38).anInt10146
		    = (((473638539
			 * ((Class241_Sub38) class241_sub38).anInt10143)
			+ (int) (Math.random()
				 * (double) ((((Class241_Sub38) class241_sub38)
					      .anInt10144) * -1567734647
					     - 473638539 * (((Class241_Sub38)
							     class241_sub38)
							    .anInt10143))))
		       * 1463017049);
	    aClass429_10116.addNode(class241_sub38, (short) -3638);
	    Class402.soundManager.method1155((((Class241_Sub38)
						class241_sub38).anInt10140
					       * 1309234459),
					      (byte) 8);
	    Class402.soundManager.method1154(((Class241_Sub38)
					       class241_sub38).anIntArray10145,
					      2139420702);
	} else if (class475_sub1_sub1_sub3_sub2 != null) {
	    ((Class241_Sub38) class241_sub38)
		.aClass475_Sub1_Sub1_Sub3_Sub2_10130
		= class475_sub1_sub1_sub3_sub2;
	    NPCDefinition class401 = class475_sub1_sub1_sub3_sub2.definition;
	    if (class401.transformTo != null) {
		((Class241_Sub38) class241_sub38).aBool10120 = true;
		class401 = class401.method7176(Class1.aClass19_11,
					       Class1.aClass19_11, (byte) 31);
	    }
	    if (null != class401) {
		((Class241_Sub38) class241_sub38).anInt10122
		    = ((i_45_ + class401.size * 19489015 << 9)
		       * 2091577895);
		((Class241_Sub38) class241_sub38).anInt10123
		    = 1727276991 * (19489015 * class401.size + i_46_
				    << 9);
		((Class241_Sub38) class241_sub38).anInt10140
		    = Class130.method3072(class475_sub1_sub1_sub3_sub2,
					  -2037844536) * 516554003;
		((Class241_Sub38) class241_sub38).anInt10127
		    = -2021578193 * (class401.anInt5866 * 413101209 << 9);
		((Class241_Sub38) class241_sub38).anInt10128
		    = class401.anInt5857 * 508697239;
		((Class241_Sub38) class241_sub38).anInt10139
		    = class401.anInt5825 * 49411927;
		((Class241_Sub38) class241_sub38).anInt10138
		    = class401.anInt5850 * -1030406663;
		((Class241_Sub38) class241_sub38).anInt10126
		    = -1530155547 * (class401.anInt5856 * 1256957735 << 9);
		Class402.soundManager
		    .method1155(class401.anInt5819 * 1319993127, (byte) 8);
		Class402.soundManager
		    .method1155(-199136369 * class401.anInt5852, (byte) 8);
		Class402.soundManager
		    .method1155(class401.anInt5808 * -97900731, (byte) 8);
		Class402.soundManager
		    .method1155(class401.anInt5858 * -1561948383, (byte) 8);
	    }
	    aClass429_10117.addNode(class241_sub38, (short) -27386);
	} else if (null != class475_sub1_sub1_sub3_sub1) {
	    ((Class241_Sub38) class241_sub38)
		.aClass475_Sub1_Sub1_Sub3_Sub1_10131
		= class475_sub1_sub1_sub3_sub1;
	    ((Class241_Sub38) class241_sub38).anInt10122
		= (i_45_ + class475_sub1_sub1_sub3_sub1.method17782(943894916)
		   << 9) * 2091577895;
	    ((Class241_Sub38) class241_sub38).anInt10123
		= (i_46_ + class475_sub1_sub1_sub3_sub1.method17782(-255486531)
		   << 9) * 1727276991;
	    ((Class241_Sub38) class241_sub38).anInt10140
		= Class490.method11238(class475_sub1_sub1_sub3_sub1,
				       -1614376932) * 516554003;
	    ((Class241_Sub38) class241_sub38).anInt10127
		= (-2021578193
		   * (class475_sub1_sub1_sub3_sub1.anInt11513 * 1294463297
		      << 9));
	    ((Class241_Sub38) class241_sub38).anInt10128
		= 776085649 * class475_sub1_sub1_sub3_sub1.anInt11514;
	    ((Class241_Sub38) class241_sub38).anInt10139 = -490109696;
	    ((Class241_Sub38) class241_sub38).anInt10138 = 591836416;
	    ((Class241_Sub38) class241_sub38).anInt10126 = 0;
	    aClass407_10118.put(class241_sub38,
				       (long) ((class475_sub1_sub1_sub3_sub1
						.entityIndex)
					       * -546698383));
	    Class402.soundManager.method1155((class475_sub1_sub1_sub3_sub1
					       .anInt11509) * -196777165,
					      (byte) 8);
	    Class402.soundManager.method1155((-405630403
					       * (class475_sub1_sub1_sub3_sub1
						  .anInt11510)),
					      (byte) 8);
	    Class402.soundManager.method1155((446821985
					       * (class475_sub1_sub1_sub3_sub1
						  .anInt11505)),
					      (byte) 8);
	    Class402.soundManager.method1155((869941981
					       * (class475_sub1_sub1_sub3_sub1
						  .anInt11512)),
					      (byte) 8);
	}
    }
    
    static final void method16439
	(ClientScriptData class454, Entity class475_sub1_sub1_sub3,
	 int i) {
	((ClientScriptData) class454).intStackPointer -= -727622047;
	int i_50_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_51_ = (((ClientScriptData) class454).integerStack
		     [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_52_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	int i_53_ = (((ClientScriptData) class454).integerStack
		     [3 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_54_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 4]);
	boolean bool = ((((ClientScriptData) class454).integerStack
			 [((ClientScriptData) class454).intStackPointer * 1482319719 + 5])
			== 1);
	int i_55_ = (((ClientScriptData) class454).integerStack
		     [6 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (Class445_Sub16.aClass351_Sub1_8660.method6332((short) -24721)
	    != Class39.aClass39_586)
	    throw new RuntimeException();
	Class380_Sub2 class380_sub2
	    = ((Class380_Sub2)
	       Class445_Sub16.aClass351_Sub1_8660.method6283(2145339797));
	Class278 class278 = new Class278();
	Class278 class278_56_ = new Class278();
	class278.method5409(0.0F, 1.0F, 0.0F,
			    (float) (3.141592653589793 * (double) i_54_ * 2.0
				     / 16384.0));
	Class287 class287 = new Class287(1.0F, 0.0F, 0.0F);
	class287.method5592(class278);
	class287.method5603();
	class278_56_.method5385(class287,
				(float) (2.0
					 * ((double) i_53_ * 3.141592653589793)
					 / 16384.0));
	class278.method5396(class278_56_);
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	int i_57_ = class522.baseX * 127679513 << 9;
	int i_58_ = 468558693 * class522.baseY << 9;
	if (class475_sub1_sub1_sub3 != null)
	    class380_sub2.method16692(class475_sub1_sub1_sub3,
				      new Class287((float) i_50_,
						   (float) i_51_,
						   (float) i_52_),
				      class278, bool, i_55_,
				      (client.aClass238_8477.method4759
				       (-35878102).anIntArrayArrayArray4562),
				      client.aClass238_8477
					  .method4753((byte) -35),
				      i_57_, i_58_, -1679429909);
	client.aBool8392 = true;
    }
    
    static void method16440(long[] ls, int[] is, int i, int i_59_,
			    byte i_60_) {
	if (i < i_59_) {
	    int i_61_ = (i + i_59_) / 2;
	    int i_62_ = i;
	    long l = ls[i_61_];
	    ls[i_61_] = ls[i_59_];
	    ls[i_59_] = l;
	    int i_63_ = is[i_61_];
	    is[i_61_] = is[i_59_];
	    is[i_59_] = i_63_;
	    int i_64_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_65_ = i; i_65_ < i_59_; i_65_++) {
		if (ls[i_65_] < l + (long) (i_65_ & i_64_)) {
		    long l_66_ = ls[i_65_];
		    ls[i_65_] = ls[i_62_];
		    ls[i_62_] = l_66_;
		    int i_67_ = is[i_65_];
		    is[i_65_] = is[i_62_];
		    is[i_62_++] = i_67_;
		}
	    }
	    ls[i_59_] = ls[i_62_];
	    ls[i_62_] = l;
	    is[i_59_] = is[i_62_];
	    is[i_62_] = i_63_;
	    method16440(ls, is, i, i_62_ - 1, (byte) 62);
	    method16440(ls, is, 1 + i_62_, i_59_, (byte) 33);
	}
    }
}
