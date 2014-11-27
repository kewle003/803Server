/* Class241_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class WorldObject extends Node
{
    public static NodeCollection aClass429_10039 = new NodeCollection();
    int anInt10040;
    public int posX;//anInt10041
    public int posY;//anInt10042
    int anInt10043;
    public int id;//anInt10044
    public int rotation;//anInt10045
    boolean aBool10046;
    int plane;//anInt10047
    int type;//anInt10048
    Class536 aClass536_10049;
    int anInt10050;
    boolean aBool10051 = true;
    int anInt10052;
    public static NodeCollection aClass429_10053 = new NodeCollection();
    static long aLong10054 = 432003252590924863L;
    
    static final void method16304(WorldObject class241_sub30,
				  boolean bool) {
	if (((WorldObject) class241_sub30).aBool10046) {
	    if (-1815667827 * ((WorldObject) class241_sub30).anInt10043 < 0
		|| Class466.method10722(client.aClass238_8477
					    .getObjectLoader(-1964166013),
					(((WorldObject) class241_sub30)
					 .anInt10043) * -1815667827,
					(((WorldObject) class241_sub30)
					 .anInt10050) * -1863540143,
					(byte) -126)) {
		if (!bool)
		    Class519.method11673
			((-603972145
			  * ((WorldObject) class241_sub30).plane),
			 (-759362859
			  * ((WorldObject) class241_sub30).anInt10040),
			 class241_sub30.posX * 1204421839,
			 -320018831 * class241_sub30.posY,
			 (-1815667827
			  * ((WorldObject) class241_sub30).anInt10043),
			 (-184303891
			  * ((WorldObject) class241_sub30).anInt10052),
			 (((WorldObject) class241_sub30).anInt10050
			  * -1863540143),
			 -1, 0, 349221961);
		else
		    ClientScriptMap.method7284((-603972145
					 * (((WorldObject) class241_sub30)
					    .plane)),
					(-759362859
					 * (((WorldObject) class241_sub30)
					    .anInt10040)),
					class241_sub30.posX * 1204421839,
					class241_sub30.posY * -320018831,
					null, (short) 499);
		class241_sub30.remove((byte) 36);
	    }
	} else if (((WorldObject) class241_sub30).aBool10051
		   && 1204421839 * class241_sub30.posX >= 1
		   && class241_sub30.posY * -320018831 >= 1
		   && (class241_sub30.posX * 1204421839
		       <= client.aClass238_8477.method4744(-1967147999) - 2)
		   && (-320018831 * class241_sub30.posY
		       <= client.aClass238_8477.method4745(-890194865) - 2)
		   && (289493935 * class241_sub30.id < 0
		       || Class466.method10722(client.aClass238_8477
						   .getObjectLoader(-2069399338),
					       (289493935
						* class241_sub30.id),
					       -1631938123 * (((WorldObject)
							       class241_sub30)
							      .type),
					       (byte) -42))) {
	    if (!bool)
		Class519.method11673
		    (((WorldObject) class241_sub30).plane * -603972145,
		     ((WorldObject) class241_sub30).anInt10040 * -759362859,
		     1204421839 * class241_sub30.posX,
		     -320018831 * class241_sub30.posY,
		     class241_sub30.id * 289493935,
		     1543441831 * class241_sub30.rotation,
		     (-1631938123
		      * ((WorldObject) class241_sub30).type),
		     -1, 0, -1426424827);
	    else
		ClientScriptMap.method7284
		    (-603972145 * ((WorldObject) class241_sub30).plane,
		     ((WorldObject) class241_sub30).anInt10040 * -759362859,
		     class241_sub30.posX * 1204421839,
		     class241_sub30.posY * -320018831,
		     ((WorldObject) class241_sub30).aClass536_10049,
		     (short) 499);
	    ((WorldObject) class241_sub30).aBool10051 = false;
	    if (!bool
		&& (-1815667827 * ((WorldObject) class241_sub30).anInt10043
		    == class241_sub30.id * 289493935)
		&& -1 == (-1815667827
			  * ((WorldObject) class241_sub30).anInt10043))
		class241_sub30.remove((byte) 36);
	    else if (!bool
		     && ((((WorldObject) class241_sub30).anInt10043
			  * -1815667827)
			 == class241_sub30.id * 289493935)
		     && (1543441831 * class241_sub30.rotation
			 == (-184303891
			     * ((WorldObject) class241_sub30).anInt10052))
		     && ((((WorldObject) class241_sub30).type
			  * -1631938123)
			 == (((WorldObject) class241_sub30).anInt10050
			     * -1863540143)))
		class241_sub30.remove((byte) 36);
	}
    }
    
    static final void method16305(int i, int i_0_, int i_1_, int i_2_,
				  Class536 class536) {
	if (i_1_ >= 1 && i_2_ >= 1
	    && i_1_ <= client.aClass238_8477.method4744(-2073378672) - 2
	    && i_2_ <= client.aClass238_8477.method4745(-1427471047) - 2) {
	    if (client.aClass238_8477.method4751(-576264724) != null) {
		Interface24 interface24
		    = client.aClass238_8477.method4759(-35878102)
			  .method16543(i, i_0_, i_1_, i_2_, 1392618684);
		if (interface24 != null) {
		    if (interface24 instanceof Class475_Sub1_Sub1_Sub2)
			((Class475_Sub1_Sub1_Sub2) interface24)
			    .method17762(class536, (byte) -27);
		    else if (interface24 instanceof Class475_Sub1_Sub4_Sub2)
			((Class475_Sub1_Sub4_Sub2) interface24)
			    .method17758(class536, 752917681);
		    else if (interface24 instanceof Class475_Sub1_Sub3_Sub1)
			((Class475_Sub1_Sub3_Sub1) interface24)
			    .method17699(class536, (byte) -115);
		    else if (interface24 instanceof Class475_Sub1_Sub5_Sub1)
			((Class475_Sub1_Sub5_Sub1) interface24)
			    .method17718(class536, (byte) 0);
		}
	    }
	}
    }
    
    static final void method16306(WorldObject class241_sub30,
				  boolean bool) {
	if (((WorldObject) class241_sub30).aBool10046) {
	    if (-1815667827 * ((WorldObject) class241_sub30).anInt10043 < 0
		|| Class466.method10722(client.aClass238_8477
					    .getObjectLoader(-2098179352),
					(((WorldObject) class241_sub30)
					 .anInt10043) * -1815667827,
					(((WorldObject) class241_sub30)
					 .anInt10050) * -1863540143,
					(byte) -50)) {
		if (!bool)
		    Class519.method11673
			((-603972145
			  * ((WorldObject) class241_sub30).plane),
			 (-759362859
			  * ((WorldObject) class241_sub30).anInt10040),
			 class241_sub30.posX * 1204421839,
			 -320018831 * class241_sub30.posY,
			 (-1815667827
			  * ((WorldObject) class241_sub30).anInt10043),
			 (-184303891
			  * ((WorldObject) class241_sub30).anInt10052),
			 (((WorldObject) class241_sub30).anInt10050
			  * -1863540143),
			 -1, 0, -1414844068);
		else
		    ClientScriptMap.method7284((-603972145
					 * (((WorldObject) class241_sub30)
					    .plane)),
					(-759362859
					 * (((WorldObject) class241_sub30)
					    .anInt10040)),
					class241_sub30.posX * 1204421839,
					class241_sub30.posY * -320018831,
					null, (short) 499);
		class241_sub30.remove((byte) 36);
	    }
	} else if (((WorldObject) class241_sub30).aBool10051
		   && 1204421839 * class241_sub30.posX >= 1
		   && class241_sub30.posY * -320018831 >= 1
		   && (class241_sub30.posX * 1204421839
		       <= client.aClass238_8477.method4744(-1819379950) - 2)
		   && (-320018831 * class241_sub30.posY
		       <= client.aClass238_8477.method4745(409345633) - 2)
		   && (289493935 * class241_sub30.id < 0
		       || Class466.method10722(client.aClass238_8477
						   .getObjectLoader(-2124060035),
					       (289493935
						* class241_sub30.id),
					       -1631938123 * (((WorldObject)
							       class241_sub30)
							      .type),
					       (byte) -24))) {
	    if (!bool)
		Class519.method11673
		    (((WorldObject) class241_sub30).plane * -603972145,
		     ((WorldObject) class241_sub30).anInt10040 * -759362859,
		     1204421839 * class241_sub30.posX,
		     -320018831 * class241_sub30.posY,
		     class241_sub30.id * 289493935,
		     1543441831 * class241_sub30.rotation,
		     (-1631938123
		      * ((WorldObject) class241_sub30).type),
		     -1, 0, -261613498);
	    else
		ClientScriptMap.method7284
		    (-603972145 * ((WorldObject) class241_sub30).plane,
		     ((WorldObject) class241_sub30).anInt10040 * -759362859,
		     class241_sub30.posX * 1204421839,
		     class241_sub30.posY * -320018831,
		     ((WorldObject) class241_sub30).aClass536_10049,
		     (short) 499);
	    ((WorldObject) class241_sub30).aBool10051 = false;
	    if (!bool
		&& (-1815667827 * ((WorldObject) class241_sub30).anInt10043
		    == class241_sub30.id * 289493935)
		&& -1 == (-1815667827
			  * ((WorldObject) class241_sub30).anInt10043))
		class241_sub30.remove((byte) 36);
	    else if (!bool
		     && ((((WorldObject) class241_sub30).anInt10043
			  * -1815667827)
			 == class241_sub30.id * 289493935)
		     && (1543441831 * class241_sub30.rotation
			 == (-184303891
			     * ((WorldObject) class241_sub30).anInt10052))
		     && ((((WorldObject) class241_sub30).type
			  * -1631938123)
			 == (((WorldObject) class241_sub30).anInt10050
			     * -1863540143)))
		class241_sub30.remove((byte) 36);
	}
    }
    
    public static void method16307(int i, int i_3_, int i_4_, int i_5_,
				   int i_6_, int i_7_, int i_8_) {
	WorldObject class241_sub30 = null;
	for (WorldObject class241_sub30_9_
		 = (WorldObject) aClass429_10039.method7694(16711935);
	     class241_sub30_9_ != null;
	     class241_sub30_9_
		 = (WorldObject) aClass429_10039.method7692(202503450)) {
	    if ((-603972145 * ((WorldObject) class241_sub30_9_).plane
		 == i)
		&& i_3_ == 1204421839 * class241_sub30_9_.posX
		&& i_4_ == -320018831 * class241_sub30_9_.posY
		&& (((WorldObject) class241_sub30_9_).anInt10040
		    * -759362859) == i_5_) {
		class241_sub30 = class241_sub30_9_;
		break;
	    }
	}
	if (class241_sub30 == null) {
	    class241_sub30 = new WorldObject();
	    ((WorldObject) class241_sub30).plane = i * -1040332497;
	    ((WorldObject) class241_sub30).anInt10040 = i_5_ * 1838800509;
	    class241_sub30.posX = i_3_ * -620199377;
	    class241_sub30.posY = -1643505007 * i_4_;
	    if (i_3_ >= 0 && i_4_ >= 0
		&& i_3_ < client.aClass238_8477.method4744(-1639873279)
		&& i_4_ < client.aClass238_8477.method4745(1883206132))
		Class583.method12830(class241_sub30, 2127092165);
	    aClass429_10039.addNode(class241_sub30, (short) -1812);
	}
	class241_sub30.id = i_6_ * -1404181681;
	((WorldObject) class241_sub30).type = 385240221 * i_7_;
	class241_sub30.rotation = i_8_ * 875612695;
	((WorldObject) class241_sub30).aBool10051 = true;
	((WorldObject) class241_sub30).aBool10046 = false;
    }
    
    static void method16308(int i, int i_10_, int i_11_, int i_12_, int i_13_,
			    int i_14_, Class536 class536) {
	WorldObject class241_sub30 = null;
	for (WorldObject class241_sub30_15_
		 = (WorldObject) aClass429_10053.method7694(16711935);
	     null != class241_sub30_15_;
	     class241_sub30_15_
		 = (WorldObject) aClass429_10053.method7692(-38958122)) {
	    if (i == (-603972145
		      * ((WorldObject) class241_sub30_15_).plane)
		&& class241_sub30_15_.posX * 1204421839 == i_10_
		&& i_11_ == -320018831 * class241_sub30_15_.posY
		&& i_12_ == -759362859 * (((WorldObject) class241_sub30_15_)
					  .anInt10040)) {
		class241_sub30 = class241_sub30_15_;
		break;
	    }
	}
	if (class241_sub30 == null) {
	    class241_sub30 = new WorldObject();
	    ((WorldObject) class241_sub30).plane = i * -1040332497;
	    ((WorldObject) class241_sub30).anInt10040 = i_12_ * 1838800509;
	    class241_sub30.posX = i_10_ * -620199377;
	    class241_sub30.posY = -1643505007 * i_11_;
	    aClass429_10053.addNode(class241_sub30, (short) -27894);
	}
	class241_sub30.id = i_13_ * -1404181681;
	((WorldObject) class241_sub30).type = i_14_ * 385240221;
	((WorldObject) class241_sub30).aClass536_10049 = class536;
	((WorldObject) class241_sub30).aBool10051 = true;
	((WorldObject) class241_sub30).aBool10046 = false;
    }
    
    static void method16309(int i, int i_16_, int i_17_, int i_18_, int i_19_,
			    int i_20_, Class536 class536) {
	WorldObject class241_sub30 = null;
	for (WorldObject class241_sub30_21_
		 = (WorldObject) aClass429_10053.method7694(16711935);
	     null != class241_sub30_21_;
	     class241_sub30_21_
		 = (WorldObject) aClass429_10053.method7692(-368492509)) {
	    if (i == (-603972145
		      * ((WorldObject) class241_sub30_21_).plane)
		&& class241_sub30_21_.posX * 1204421839 == i_16_
		&& i_17_ == -320018831 * class241_sub30_21_.posY
		&& i_18_ == -759362859 * (((WorldObject) class241_sub30_21_)
					  .anInt10040)) {
		class241_sub30 = class241_sub30_21_;
		break;
	    }
	}
	if (class241_sub30 == null) {
	    class241_sub30 = new WorldObject();
	    ((WorldObject) class241_sub30).plane = i * -1040332497;
	    ((WorldObject) class241_sub30).anInt10040 = i_18_ * 1838800509;
	    class241_sub30.posX = i_16_ * -620199377;
	    class241_sub30.posY = -1643505007 * i_17_;
	    aClass429_10053.addNode(class241_sub30, (short) -3522);
	}
	class241_sub30.id = i_19_ * -1404181681;
	((WorldObject) class241_sub30).type = i_20_ * 385240221;
	((WorldObject) class241_sub30).aClass536_10049 = class536;
	((WorldObject) class241_sub30).aBool10051 = true;
	((WorldObject) class241_sub30).aBool10046 = false;
    }
    
    WorldObject() {
	((WorldObject) this).aBool10046 = false;
    }
    
    static void method16310(int i, int i_22_, int i_23_, int i_24_, int i_25_,
			    int i_26_, Class536 class536) {
	WorldObject class241_sub30 = null;
	for (WorldObject class241_sub30_27_
		 = (WorldObject) aClass429_10053.method7694(16711935);
	     null != class241_sub30_27_;
	     class241_sub30_27_
		 = (WorldObject) aClass429_10053.method7692(687130430)) {
	    if (i == (-603972145
		      * ((WorldObject) class241_sub30_27_).plane)
		&& class241_sub30_27_.posX * 1204421839 == i_22_
		&& i_23_ == -320018831 * class241_sub30_27_.posY
		&& i_24_ == -759362859 * (((WorldObject) class241_sub30_27_)
					  .anInt10040)) {
		class241_sub30 = class241_sub30_27_;
		break;
	    }
	}
	if (class241_sub30 == null) {
	    class241_sub30 = new WorldObject();
	    ((WorldObject) class241_sub30).plane = i * -1040332497;
	    ((WorldObject) class241_sub30).anInt10040 = i_24_ * 1838800509;
	    class241_sub30.posX = i_22_ * -620199377;
	    class241_sub30.posY = -1643505007 * i_23_;
	    aClass429_10053.addNode(class241_sub30, (short) -17407);
	}
	class241_sub30.id = i_25_ * -1404181681;
	((WorldObject) class241_sub30).type = i_26_ * 385240221;
	((WorldObject) class241_sub30).aClass536_10049 = class536;
	((WorldObject) class241_sub30).aBool10051 = true;
	((WorldObject) class241_sub30).aBool10046 = false;
    }
    
    public static final void method16311() {
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10039.method7694(16711935);
	     null != class241_sub30;
	     class241_sub30
		 = (WorldObject) aClass429_10039.method7692(2118463406)) {
	    if (!((WorldObject) class241_sub30).aBool10046) {
		((WorldObject) class241_sub30).aBool10051 = true;
		if (1204421839 * class241_sub30.posX >= 0
		    && -320018831 * class241_sub30.posY >= 0
		    && (class241_sub30.posX * 1204421839
			< client.aClass238_8477.method4744(-1373699262))
		    && (-320018831 * class241_sub30.posY
			< client.aClass238_8477.method4745(-996827491)))
		    Class583.method12830(class241_sub30, 1949579167);
	    } else
		class241_sub30.remove((byte) 36);
	}
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10053.method7694(16711935);
	     null != class241_sub30;
	     class241_sub30
		 = (WorldObject) aClass429_10053.method7692(799661180)) {
	    if (!((WorldObject) class241_sub30).aBool10046)
		((WorldObject) class241_sub30).aBool10051 = true;
	    else
		class241_sub30.remove((byte) 36);
	}
    }
    
    static final void method16312(int i, int i_28_, int i_29_, int i_30_,
				  int i_31_, int i_32_, int i_33_, int i_34_,
				  int i_35_) {
	if (i_29_ >= 1 && i_30_ >= 1
	    && i_29_ <= client.aClass238_8477.method4744(-1761727086) - 2
	    && i_30_ <= client.aClass238_8477.method4745(1207633404) - 2) {
	    int i_36_ = i;
	    if (i_36_ < 3 && client.aClass238_8477.method4753((byte) -117)
				 .method4331(i_29_, i_30_, -25692510))
		i_36_++;
	    if (client.aClass238_8477.method4751(-1306511877) != null) {
		client.aClass238_8477.method4759(-35878102).method16545
		    (Class236.aClass103_2713, i, i_28_, i_29_, i_30_,
		     (byte) 85);
		if (i_31_ >= 0) {
		    int i_37_
			= Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub18_8862.method14262((byte) 123);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub18_8862),
			 1, (byte) 2);
		    client.aClass238_8477.method4759(-35878102).method16539
			(Class236.aClass103_2713, i_36_, i, i_29_, i_30_,
			 i_31_, i_32_, i_33_, i_34_, i_35_, 1892864491);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub18_8862),
			 i_37_, (byte) 2);
		}
		Class558.method12326((Class21.myPlayer
				      .nodePlane),
				     1112096598);
	    }
	}
    }
    
    static final void method16313(WorldObject class241_sub30) {
	Class552 class552 = client.aClass238_8477.method4751(-1684141633);
	if (class552 != null) {
	    Interface24 interface24 = null;
	    if (0 == ((WorldObject) class241_sub30).anInt10040 * -759362859)
		interface24
		    = ((Interface24)
		       (class552.method12132
			((-603972145
			  * ((WorldObject) class241_sub30).plane),
			 1204421839 * class241_sub30.posX,
			 class241_sub30.posY * -320018831, (byte) 7)));
	    if (1 == ((WorldObject) class241_sub30).anInt10040 * -759362859)
		interface24
		    = ((Interface24)
		       class552.method12162((((WorldObject) class241_sub30)
					     .plane) * -603972145,
					    (class241_sub30.posX
					     * 1204421839),
					    (class241_sub30.posY
					     * -320018831),
					    1748765374));
	    if (((WorldObject) class241_sub30).anInt10040 * -759362859 == 2)
		interface24
		    = (Interface24) (class552.method12136
				     (-603972145 * ((WorldObject)
						    class241_sub30).plane,
				      1204421839 * class241_sub30.posX,
				      class241_sub30.posY * -320018831,
				      client.anInterface57_8577, 917697065));
	    if (((WorldObject) class241_sub30).anInt10040 * -759362859 == 3)
		interface24
		    = ((Interface24)
		       class552.method12100((((WorldObject) class241_sub30)
					     .plane) * -603972145,
					    (class241_sub30.posX
					     * 1204421839),
					    (class241_sub30.posY
					     * -320018831),
					    2112002823));
	    if (interface24 != null) {
		((WorldObject) class241_sub30).anInt10043
		    = interface24.method146((byte) 0) * 995991365;
		((WorldObject) class241_sub30).anInt10050
		    = interface24.method139(591463713) * 1860167345;
		((WorldObject) class241_sub30).anInt10052
		    = interface24.method140(409509873) * 606228197;
	    } else {
		((WorldObject) class241_sub30).anInt10043 = -995991365;
		((WorldObject) class241_sub30).anInt10050 = 0;
		((WorldObject) class241_sub30).anInt10052 = 0;
	    }
	}
    }
    
    static final void method16314() {
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10039.method7694(16711935);
	     class241_sub30 != null;
	     class241_sub30
		 = (WorldObject) aClass429_10039.method7692(1554787198))
	    Class65.method1640(class241_sub30, false, (byte) 12);
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10053.method7694(16711935);
	     null != class241_sub30;
	     class241_sub30
		 = (WorldObject) aClass429_10053.method7692(779199777))
	    Class65.method1640(class241_sub30, true, (byte) 21);
    }
    
    static final void method16315() {
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10039.method7694(16711935);
	     class241_sub30 != null;
	     class241_sub30
		 = (WorldObject) aClass429_10039.method7692(733924076))
	    Class65.method1640(class241_sub30, false, (byte) 19);
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10053.method7694(16711935);
	     null != class241_sub30;
	     class241_sub30
		 = (WorldObject) aClass429_10053.method7692(892014952))
	    Class65.method1640(class241_sub30, true, (byte) 3);
    }
    
    public static void method16316(int i, int i_38_, int i_39_, int i_40_,
				   int i_41_, int i_42_, int i_43_) {
	WorldObject class241_sub30 = null;
	for (WorldObject class241_sub30_44_
		 = (WorldObject) aClass429_10039.method7694(16711935);
	     class241_sub30_44_ != null;
	     class241_sub30_44_
		 = (WorldObject) aClass429_10039.method7692(-437725991)) {
	    if ((-603972145 * ((WorldObject) class241_sub30_44_).plane
		 == i)
		&& i_38_ == 1204421839 * class241_sub30_44_.posX
		&& i_39_ == -320018831 * class241_sub30_44_.posY
		&& (((WorldObject) class241_sub30_44_).anInt10040
		    * -759362859) == i_40_) {
		class241_sub30 = class241_sub30_44_;
		break;
	    }
	}
	if (class241_sub30 == null) {
	    class241_sub30 = new WorldObject();
	    ((WorldObject) class241_sub30).plane = i * -1040332497;
	    ((WorldObject) class241_sub30).anInt10040 = i_40_ * 1838800509;
	    class241_sub30.posX = i_38_ * -620199377;
	    class241_sub30.posY = -1643505007 * i_39_;
	    if (i_38_ >= 0 && i_39_ >= 0
		&& i_38_ < client.aClass238_8477.method4744(-1877522410)
		&& i_39_ < client.aClass238_8477.method4745(2019220032))
		Class583.method12830(class241_sub30, 1919324570);
	    aClass429_10039.addNode(class241_sub30, (short) -21031);
	}
	class241_sub30.id = i_41_ * -1404181681;
	((WorldObject) class241_sub30).type = 385240221 * i_42_;
	class241_sub30.rotation = i_43_ * 875612695;
	((WorldObject) class241_sub30).aBool10051 = true;
	((WorldObject) class241_sub30).aBool10046 = false;
    }
    
    static final void method16317() {
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10039.method7694(16711935);
	     class241_sub30 != null;
	     class241_sub30
		 = (WorldObject) aClass429_10039.method7692(1373992440))
	    Class65.method1640(class241_sub30, false, (byte) -43);
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10053.method7694(16711935);
	     null != class241_sub30;
	     class241_sub30
		 = (WorldObject) aClass429_10053.method7692(123514201))
	    Class65.method1640(class241_sub30, true, (byte) 36);
    }
    
    static final void method16318(WorldObject class241_sub30,
				  boolean bool) {
	if (((WorldObject) class241_sub30).aBool10046) {
	    if (-1815667827 * ((WorldObject) class241_sub30).anInt10043 < 0
		|| Class466.method10722(client.aClass238_8477
					    .getObjectLoader(-2081706580),
					(((WorldObject) class241_sub30)
					 .anInt10043) * -1815667827,
					(((WorldObject) class241_sub30)
					 .anInt10050) * -1863540143,
					(byte) -104)) {
		if (!bool)
		    Class519.method11673
			((-603972145
			  * ((WorldObject) class241_sub30).plane),
			 (-759362859
			  * ((WorldObject) class241_sub30).anInt10040),
			 class241_sub30.posX * 1204421839,
			 -320018831 * class241_sub30.posY,
			 (-1815667827
			  * ((WorldObject) class241_sub30).anInt10043),
			 (-184303891
			  * ((WorldObject) class241_sub30).anInt10052),
			 (((WorldObject) class241_sub30).anInt10050
			  * -1863540143),
			 -1, 0, 411179248);
		else
		    ClientScriptMap.method7284((-603972145
					 * (((WorldObject) class241_sub30)
					    .plane)),
					(-759362859
					 * (((WorldObject) class241_sub30)
					    .anInt10040)),
					class241_sub30.posX * 1204421839,
					class241_sub30.posY * -320018831,
					null, (short) 499);
		class241_sub30.remove((byte) 36);
	    }
	} else if (((WorldObject) class241_sub30).aBool10051
		   && 1204421839 * class241_sub30.posX >= 1
		   && class241_sub30.posY * -320018831 >= 1
		   && (class241_sub30.posX * 1204421839
		       <= client.aClass238_8477.method4744(-1775808525) - 2)
		   && (-320018831 * class241_sub30.posY
		       <= client.aClass238_8477.method4745(-2048605199) - 2)
		   && (289493935 * class241_sub30.id < 0
		       || Class466.method10722(client.aClass238_8477
						   .getObjectLoader(-1852202184),
					       (289493935
						* class241_sub30.id),
					       -1631938123 * (((WorldObject)
							       class241_sub30)
							      .type),
					       (byte) -30))) {
	    if (!bool)
		Class519.method11673
		    (((WorldObject) class241_sub30).plane * -603972145,
		     ((WorldObject) class241_sub30).anInt10040 * -759362859,
		     1204421839 * class241_sub30.posX,
		     -320018831 * class241_sub30.posY,
		     class241_sub30.id * 289493935,
		     1543441831 * class241_sub30.rotation,
		     (-1631938123
		      * ((WorldObject) class241_sub30).type),
		     -1, 0, -1135580260);
	    else
		ClientScriptMap.method7284
		    (-603972145 * ((WorldObject) class241_sub30).plane,
		     ((WorldObject) class241_sub30).anInt10040 * -759362859,
		     class241_sub30.posX * 1204421839,
		     class241_sub30.posY * -320018831,
		     ((WorldObject) class241_sub30).aClass536_10049,
		     (short) 499);
	    ((WorldObject) class241_sub30).aBool10051 = false;
	    if (!bool
		&& (-1815667827 * ((WorldObject) class241_sub30).anInt10043
		    == class241_sub30.id * 289493935)
		&& -1 == (-1815667827
			  * ((WorldObject) class241_sub30).anInt10043))
		class241_sub30.remove((byte) 36);
	    else if (!bool
		     && ((((WorldObject) class241_sub30).anInt10043
			  * -1815667827)
			 == class241_sub30.id * 289493935)
		     && (1543441831 * class241_sub30.rotation
			 == (-184303891
			     * ((WorldObject) class241_sub30).anInt10052))
		     && ((((WorldObject) class241_sub30).type
			  * -1631938123)
			 == (((WorldObject) class241_sub30).anInt10050
			     * -1863540143)))
		class241_sub30.remove((byte) 36);
	}
    }
    
    static final void method16319(WorldObject class241_sub30,
				  boolean bool) {
	if (((WorldObject) class241_sub30).aBool10046) {
	    if (-1815667827 * ((WorldObject) class241_sub30).anInt10043 < 0
		|| Class466.method10722(client.aClass238_8477
					    .getObjectLoader(-1869001041),
					(((WorldObject) class241_sub30)
					 .anInt10043) * -1815667827,
					(((WorldObject) class241_sub30)
					 .anInt10050) * -1863540143,
					(byte) -100)) {
		if (!bool)
		    Class519.method11673
			((-603972145
			  * ((WorldObject) class241_sub30).plane),
			 (-759362859
			  * ((WorldObject) class241_sub30).anInt10040),
			 class241_sub30.posX * 1204421839,
			 -320018831 * class241_sub30.posY,
			 (-1815667827
			  * ((WorldObject) class241_sub30).anInt10043),
			 (-184303891
			  * ((WorldObject) class241_sub30).anInt10052),
			 (((WorldObject) class241_sub30).anInt10050
			  * -1863540143),
			 -1, 0, -227829259);
		else
		    ClientScriptMap.method7284((-603972145
					 * (((WorldObject) class241_sub30)
					    .plane)),
					(-759362859
					 * (((WorldObject) class241_sub30)
					    .anInt10040)),
					class241_sub30.posX * 1204421839,
					class241_sub30.posY * -320018831,
					null, (short) 499);
		class241_sub30.remove((byte) 36);
	    }
	} else if (((WorldObject) class241_sub30).aBool10051
		   && 1204421839 * class241_sub30.posX >= 1
		   && class241_sub30.posY * -320018831 >= 1
		   && (class241_sub30.posX * 1204421839
		       <= client.aClass238_8477.method4744(-2062027563) - 2)
		   && (-320018831 * class241_sub30.posY
		       <= client.aClass238_8477.method4745(1618249098) - 2)
		   && (289493935 * class241_sub30.id < 0
		       || Class466.method10722(client.aClass238_8477
						   .getObjectLoader(-2047054457),
					       (289493935
						* class241_sub30.id),
					       -1631938123 * (((WorldObject)
							       class241_sub30)
							      .type),
					       (byte) -81))) {
	    if (!bool)
		Class519.method11673
		    (((WorldObject) class241_sub30).plane * -603972145,
		     ((WorldObject) class241_sub30).anInt10040 * -759362859,
		     1204421839 * class241_sub30.posX,
		     -320018831 * class241_sub30.posY,
		     class241_sub30.id * 289493935,
		     1543441831 * class241_sub30.rotation,
		     (-1631938123
		      * ((WorldObject) class241_sub30).type),
		     -1, 0, -2035373990);
	    else
		ClientScriptMap.method7284
		    (-603972145 * ((WorldObject) class241_sub30).plane,
		     ((WorldObject) class241_sub30).anInt10040 * -759362859,
		     class241_sub30.posX * 1204421839,
		     class241_sub30.posY * -320018831,
		     ((WorldObject) class241_sub30).aClass536_10049,
		     (short) 499);
	    ((WorldObject) class241_sub30).aBool10051 = false;
	    if (!bool
		&& (-1815667827 * ((WorldObject) class241_sub30).anInt10043
		    == class241_sub30.id * 289493935)
		&& -1 == (-1815667827
			  * ((WorldObject) class241_sub30).anInt10043))
		class241_sub30.remove((byte) 36);
	    else if (!bool
		     && ((((WorldObject) class241_sub30).anInt10043
			  * -1815667827)
			 == class241_sub30.id * 289493935)
		     && (1543441831 * class241_sub30.rotation
			 == (-184303891
			     * ((WorldObject) class241_sub30).anInt10052))
		     && ((((WorldObject) class241_sub30).type
			  * -1631938123)
			 == (((WorldObject) class241_sub30).anInt10050
			     * -1863540143)))
		class241_sub30.remove((byte) 36);
	}
    }
    
    static final void method16320(int i, int i_45_, int i_46_, int i_47_,
				  Class536 class536) {
	if (i_46_ >= 1 && i_47_ >= 1
	    && i_46_ <= client.aClass238_8477.method4744(-2077412448) - 2
	    && i_47_ <= client.aClass238_8477.method4745(2102276334) - 2) {
	    if (client.aClass238_8477.method4751(-2022033983) != null) {
		Interface24 interface24
		    = client.aClass238_8477.method4759(-35878102)
			  .method16543(i, i_45_, i_46_, i_47_, 1181489463);
		if (interface24 != null) {
		    if (interface24 instanceof Class475_Sub1_Sub1_Sub2)
			((Class475_Sub1_Sub1_Sub2) interface24)
			    .method17762(class536, (byte) -82);
		    else if (interface24 instanceof Class475_Sub1_Sub4_Sub2)
			((Class475_Sub1_Sub4_Sub2) interface24)
			    .method17758(class536, -721233956);
		    else if (interface24 instanceof Class475_Sub1_Sub3_Sub1)
			((Class475_Sub1_Sub3_Sub1) interface24)
			    .method17699(class536, (byte) -48);
		    else if (interface24 instanceof Class475_Sub1_Sub5_Sub1)
			((Class475_Sub1_Sub5_Sub1) interface24)
			    .method17718(class536, (byte) 0);
		}
	    }
	}
    }
    
    static final void method16321(WorldObject class241_sub30,
				  boolean bool) {
	if (((WorldObject) class241_sub30).aBool10046) {
	    if (-1815667827 * ((WorldObject) class241_sub30).anInt10043 < 0
		|| Class466.method10722(client.aClass238_8477
					    .getObjectLoader(-1990607432),
					(((WorldObject) class241_sub30)
					 .anInt10043) * -1815667827,
					(((WorldObject) class241_sub30)
					 .anInt10050) * -1863540143,
					(byte) -102)) {
		if (!bool)
		    Class519.method11673
			((-603972145
			  * ((WorldObject) class241_sub30).plane),
			 (-759362859
			  * ((WorldObject) class241_sub30).anInt10040),
			 class241_sub30.posX * 1204421839,
			 -320018831 * class241_sub30.posY,
			 (-1815667827
			  * ((WorldObject) class241_sub30).anInt10043),
			 (-184303891
			  * ((WorldObject) class241_sub30).anInt10052),
			 (((WorldObject) class241_sub30).anInt10050
			  * -1863540143),
			 -1, 0, -824283103);
		else
		    ClientScriptMap.method7284((-603972145
					 * (((WorldObject) class241_sub30)
					    .plane)),
					(-759362859
					 * (((WorldObject) class241_sub30)
					    .anInt10040)),
					class241_sub30.posX * 1204421839,
					class241_sub30.posY * -320018831,
					null, (short) 499);
		class241_sub30.remove((byte) 36);
	    }
	} else if (((WorldObject) class241_sub30).aBool10051
		   && 1204421839 * class241_sub30.posX >= 1
		   && class241_sub30.posY * -320018831 >= 1
		   && (class241_sub30.posX * 1204421839
		       <= client.aClass238_8477.method4744(-1893291601) - 2)
		   && (-320018831 * class241_sub30.posY
		       <= client.aClass238_8477.method4745(-275024075) - 2)
		   && (289493935 * class241_sub30.id < 0
		       || Class466.method10722(client.aClass238_8477
						   .getObjectLoader(-2091277084),
					       (289493935
						* class241_sub30.id),
					       -1631938123 * (((WorldObject)
							       class241_sub30)
							      .type),
					       (byte) -123))) {
	    if (!bool)
		Class519.method11673
		    (((WorldObject) class241_sub30).plane * -603972145,
		     ((WorldObject) class241_sub30).anInt10040 * -759362859,
		     1204421839 * class241_sub30.posX,
		     -320018831 * class241_sub30.posY,
		     class241_sub30.id * 289493935,
		     1543441831 * class241_sub30.rotation,
		     (-1631938123
		      * ((WorldObject) class241_sub30).type),
		     -1, 0, -1547450974);
	    else
		ClientScriptMap.method7284
		    (-603972145 * ((WorldObject) class241_sub30).plane,
		     ((WorldObject) class241_sub30).anInt10040 * -759362859,
		     class241_sub30.posX * 1204421839,
		     class241_sub30.posY * -320018831,
		     ((WorldObject) class241_sub30).aClass536_10049,
		     (short) 499);
	    ((WorldObject) class241_sub30).aBool10051 = false;
	    if (!bool
		&& (-1815667827 * ((WorldObject) class241_sub30).anInt10043
		    == class241_sub30.id * 289493935)
		&& -1 == (-1815667827
			  * ((WorldObject) class241_sub30).anInt10043))
		class241_sub30.remove((byte) 36);
	    else if (!bool
		     && ((((WorldObject) class241_sub30).anInt10043
			  * -1815667827)
			 == class241_sub30.id * 289493935)
		     && (1543441831 * class241_sub30.rotation
			 == (-184303891
			     * ((WorldObject) class241_sub30).anInt10052))
		     && ((((WorldObject) class241_sub30).type
			  * -1631938123)
			 == (((WorldObject) class241_sub30).anInt10050
			     * -1863540143)))
		class241_sub30.remove((byte) 36);
	}
    }
    
    static final void method16322() {
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10039.method7694(16711935);
	     class241_sub30 != null;
	     class241_sub30
		 = (WorldObject) aClass429_10039.method7692(2039197820))
	    Class65.method1640(class241_sub30, false, (byte) 55);
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10053.method7694(16711935);
	     null != class241_sub30;
	     class241_sub30
		 = (WorldObject) aClass429_10053.method7692(647347014))
	    Class65.method1640(class241_sub30, true, (byte) -19);
    }
    
    static final void method16323(int i, int i_48_, int i_49_, int i_50_,
				  int i_51_, int i_52_, int i_53_, int i_54_,
				  int i_55_) {
	if (i_49_ >= 1 && i_50_ >= 1
	    && i_49_ <= client.aClass238_8477.method4744(-1931304415) - 2
	    && i_50_ <= client.aClass238_8477.method4745(-47463291) - 2) {
	    int i_56_ = i;
	    if (i_56_ < 3 && client.aClass238_8477.method4753((byte) -127)
				 .method4331(i_49_, i_50_, -1233518781))
		i_56_++;
	    if (client.aClass238_8477.method4751(-1656525637) != null) {
		client.aClass238_8477.method4759(-35878102).method16545
		    (Class236.aClass103_2713, i, i_48_, i_49_, i_50_,
		     (byte) 71);
		if (i_51_ >= 0) {
		    int i_57_
			= Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub18_8862.method14262((byte) 58);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub18_8862),
			 1, (byte) 2);
		    client.aClass238_8477.method4759(-35878102).method16539
			(Class236.aClass103_2713, i_56_, i, i_49_, i_50_,
			 i_51_, i_52_, i_53_, i_54_, i_55_, 1892864491);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub18_8862),
			 i_57_, (byte) 2);
		}
		Class558.method12326((Class21.myPlayer
				      .nodePlane),
				     1407575811);
	    }
	}
    }
    
    static final void method16324(int i, int i_58_, int i_59_, int i_60_,
				  int i_61_, int i_62_, int i_63_, int i_64_,
				  int i_65_) {
	if (i_59_ >= 1 && i_60_ >= 1
	    && i_59_ <= client.aClass238_8477.method4744(-2062544581) - 2
	    && i_60_ <= client.aClass238_8477.method4745(-706130612) - 2) {
	    int i_66_ = i;
	    if (i_66_ < 3 && client.aClass238_8477.method4753((byte) -1)
				 .method4331(i_59_, i_60_, 208927842))
		i_66_++;
	    if (client.aClass238_8477.method4751(-528945727) != null) {
		client.aClass238_8477.method4759(-35878102).method16545
		    (Class236.aClass103_2713, i, i_58_, i_59_, i_60_,
		     (byte) 56);
		if (i_61_ >= 0) {
		    int i_67_
			= Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub18_8862.method14262((byte) 104);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub18_8862),
			 1, (byte) 2);
		    client.aClass238_8477.method4759(-35878102).method16539
			(Class236.aClass103_2713, i_66_, i, i_59_, i_60_,
			 i_61_, i_62_, i_63_, i_64_, i_65_, 1892864491);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub18_8862),
			 i_67_, (byte) 2);
		}
		Class558.method12326((Class21.myPlayer
				      .nodePlane),
				     1503068625);
	    }
	}
    }
    
    static final void method16325(int i, int i_68_, int i_69_, int i_70_,
				  int i_71_, int i_72_, int i_73_, int i_74_,
				  int i_75_) {
	if (i_69_ >= 1 && i_70_ >= 1
	    && i_69_ <= client.aClass238_8477.method4744(-2029445062) - 2
	    && i_70_ <= client.aClass238_8477.method4745(27938222) - 2) {
	    int i_76_ = i;
	    if (i_76_ < 3 && client.aClass238_8477.method4753((byte) -86)
				 .method4331(i_69_, i_70_, 1303997355))
		i_76_++;
	    if (client.aClass238_8477.method4751(-1799155072) != null) {
		client.aClass238_8477.method4759(-35878102).method16545
		    (Class236.aClass103_2713, i, i_68_, i_69_, i_70_,
		     (byte) -10);
		if (i_71_ >= 0) {
		    int i_77_
			= Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub18_8862.method14262((byte) 9);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub18_8862),
			 1, (byte) 2);
		    client.aClass238_8477.method4759(-35878102).method16539
			(Class236.aClass103_2713, i_76_, i, i_69_, i_70_,
			 i_71_, i_72_, i_73_, i_74_, i_75_, 1892864491);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub18_8862),
			 i_77_, (byte) 2);
		}
		Class558.method12326((Class21.myPlayer
				      .nodePlane),
				     2005745595);
	    }
	}
    }
    
    static void method16326(int i, int i_78_, int i_79_, int i_80_, int i_81_,
			    int i_82_, Class536 class536) {
	WorldObject class241_sub30 = null;
	for (WorldObject class241_sub30_83_
		 = (WorldObject) aClass429_10053.method7694(16711935);
	     null != class241_sub30_83_;
	     class241_sub30_83_
		 = (WorldObject) aClass429_10053.method7692(-325991962)) {
	    if (i == (-603972145
		      * ((WorldObject) class241_sub30_83_).plane)
		&& class241_sub30_83_.posX * 1204421839 == i_78_
		&& i_79_ == -320018831 * class241_sub30_83_.posY
		&& i_80_ == -759362859 * (((WorldObject) class241_sub30_83_)
					  .anInt10040)) {
		class241_sub30 = class241_sub30_83_;
		break;
	    }
	}
	if (class241_sub30 == null) {
	    class241_sub30 = new WorldObject();
	    ((WorldObject) class241_sub30).plane = i * -1040332497;
	    ((WorldObject) class241_sub30).anInt10040 = i_80_ * 1838800509;
	    class241_sub30.posX = i_78_ * -620199377;
	    class241_sub30.posY = -1643505007 * i_79_;
	    aClass429_10053.addNode(class241_sub30, (short) -10859);
	}
	class241_sub30.id = i_81_ * -1404181681;
	((WorldObject) class241_sub30).type = i_82_ * 385240221;
	((WorldObject) class241_sub30).aClass536_10049 = class536;
	((WorldObject) class241_sub30).aBool10051 = true;
	((WorldObject) class241_sub30).aBool10046 = false;
    }
    
    static final void method16327(int i, int i_84_, int i_85_, int i_86_,
				  Class536 class536) {
	if (i_85_ >= 1 && i_86_ >= 1
	    && i_85_ <= client.aClass238_8477.method4744(-1952011225) - 2
	    && i_86_ <= client.aClass238_8477.method4745(1970555215) - 2) {
	    if (client.aClass238_8477.method4751(-1102248068) != null) {
		Interface24 interface24
		    = client.aClass238_8477.method4759(-35878102)
			  .method16543(i, i_84_, i_85_, i_86_, 1992278002);
		if (interface24 != null) {
		    if (interface24 instanceof Class475_Sub1_Sub1_Sub2)
			((Class475_Sub1_Sub1_Sub2) interface24)
			    .method17762(class536, (byte) -120);
		    else if (interface24 instanceof Class475_Sub1_Sub4_Sub2)
			((Class475_Sub1_Sub4_Sub2) interface24)
			    .method17758(class536, -1208679599);
		    else if (interface24 instanceof Class475_Sub1_Sub3_Sub1)
			((Class475_Sub1_Sub3_Sub1) interface24)
			    .method17699(class536, (byte) -81);
		    else if (interface24 instanceof Class475_Sub1_Sub5_Sub1)
			((Class475_Sub1_Sub5_Sub1) interface24)
			    .method17718(class536, (byte) 0);
		}
	    }
	}
    }
    
    public static final void method16328() {
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10039.method7694(16711935);
	     null != class241_sub30;
	     class241_sub30
		 = (WorldObject) aClass429_10039.method7692(1820499441)) {
	    if (!((WorldObject) class241_sub30).aBool10046) {
		((WorldObject) class241_sub30).aBool10051 = true;
		if (1204421839 * class241_sub30.posX >= 0
		    && -320018831 * class241_sub30.posY >= 0
		    && (class241_sub30.posX * 1204421839
			< client.aClass238_8477.method4744(-1508275087))
		    && (-320018831 * class241_sub30.posY
			< client.aClass238_8477.method4745(75143049)))
		    Class583.method12830(class241_sub30, 1896730686);
	    } else
		class241_sub30.remove((byte) 36);
	}
	for (WorldObject class241_sub30
		 = (WorldObject) aClass429_10053.method7694(16711935);
	     null != class241_sub30;
	     class241_sub30
		 = (WorldObject) aClass429_10053.method7692(1465987659)) {
	    if (!((WorldObject) class241_sub30).aBool10046)
		((WorldObject) class241_sub30).aBool10051 = true;
	    else
		class241_sub30.remove((byte) 36);
	}
    }
    
    static final void method16329(int i, int i_87_, int i_88_, int i_89_,
				  Class536 class536) {
	if (i_88_ >= 1 && i_89_ >= 1
	    && i_88_ <= client.aClass238_8477.method4744(-1919451023) - 2
	    && i_89_ <= client.aClass238_8477.method4745(1212934540) - 2) {
	    if (client.aClass238_8477.method4751(-2032615781) != null) {
		Interface24 interface24
		    = client.aClass238_8477.method4759(-35878102)
			  .method16543(i, i_87_, i_88_, i_89_, -1257696146);
		if (interface24 != null) {
		    if (interface24 instanceof Class475_Sub1_Sub1_Sub2)
			((Class475_Sub1_Sub1_Sub2) interface24)
			    .method17762(class536, (byte) -106);
		    else if (interface24 instanceof Class475_Sub1_Sub4_Sub2)
			((Class475_Sub1_Sub4_Sub2) interface24)
			    .method17758(class536, -1254441103);
		    else if (interface24 instanceof Class475_Sub1_Sub3_Sub1)
			((Class475_Sub1_Sub3_Sub1) interface24)
			    .method17699(class536, (byte) -73);
		    else if (interface24 instanceof Class475_Sub1_Sub5_Sub1)
			((Class475_Sub1_Sub5_Sub1) interface24)
			    .method17718(class536, (byte) 0);
		}
	    }
	}
    }
}
