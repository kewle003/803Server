/* Class612 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class612
{
    public int anInt7767;
    public int anInt7768 = 0;
    public int anInt7769;
    public int anInt7770;
    
    void method13231(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt7768 = class241_sub3.readUnsignedByte((byte) 92) * 919351747;
	else if (i == 2)
	    anInt7770 = class241_sub3.readUnsignedShort(1162222719) * 491414167;
	else if (3 == i)
	    anInt7769 = class241_sub3.readUnsignedShort(1162222719) * 876932499;
	else if (4 == i)
	    anInt7767 = class241_sub3.readShort((byte) 107) * -429395865;
    }
    
    void method13232(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_0_ = class241_sub3.readUnsignedByte((byte) -21);
	    if (i_0_ == 0)
		break;
	    method13233(class241_sub3, i_0_, (byte) -3);
	}
    }
    
    void method13233(RSByteBuffer class241_sub3, int i, byte i_1_) {
	if (i == 1)
	    anInt7768 = class241_sub3.readUnsignedByte((byte) 20) * 919351747;
	else if (i == 2)
	    anInt7770 = class241_sub3.readUnsignedShort(1162222719) * 491414167;
	else if (3 == i)
	    anInt7769 = class241_sub3.readUnsignedShort(1162222719) * 876932499;
	else if (4 == i)
	    anInt7767 = class241_sub3.readShort((byte) 111) * -429395865;
    }
    
    void method13234(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -29);
	    if (i == 0)
		break;
	    method13233(class241_sub3, i, (byte) -39);
	}
    }
    
    void method13235(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -53);
	    if (i == 0)
		break;
	    method13233(class241_sub3, i, (byte) -66);
	}
    }
    
    Class612() {
	anInt7767 = 0;
	anInt7769 = 661428224;
	anInt7770 = 1393866752;
    }
    
    void method13236(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt7768 = class241_sub3.readUnsignedByte((byte) -89) * 919351747;
	else if (i == 2)
	    anInt7770 = class241_sub3.readUnsignedShort(1162222719) * 491414167;
	else if (3 == i)
	    anInt7769 = class241_sub3.readUnsignedShort(1162222719) * 876932499;
	else if (4 == i)
	    anInt7767 = class241_sub3.readShort((byte) 48) * -429395865;
    }
    
    void method13237(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt7768 = class241_sub3.readUnsignedByte((byte) 3) * 919351747;
	else if (i == 2)
	    anInt7770 = class241_sub3.readUnsignedShort(1162222719) * 491414167;
	else if (3 == i)
	    anInt7769 = class241_sub3.readUnsignedShort(1162222719) * 876932499;
	else if (4 == i)
	    anInt7767 = class241_sub3.readShort((byte) 126) * -429395865;
    }
    
    public static void method13238
	(int i, int i_2_, int i_3_, int i_4_, ObjectDefinition class526,
	 NPC class475_sub1_sub1_sub3_sub2,
	 Player class475_sub1_sub1_sub3_sub1,
	 byte i_5_) {
	Class241_Sub38 class241_sub38 = new Class241_Sub38();
	((Class241_Sub38) class241_sub38).anInt10119 = i * 1647904679;
	((Class241_Sub38) class241_sub38).anInt10121
	    = -1165213235 * (i_2_ << 9);
	((Class241_Sub38) class241_sub38).anInt10137
	    = (i_3_ << 9) * -1759680525;
	if (null != class526) {
	    ((Class241_Sub38) class241_sub38).aClass526_10132 = class526;
	    int i_6_ = class526.sizeX * 1351092869;
	    int i_7_ = class526.sizeY * 333584223;
	    if (i_4_ == 1 || 3 == i_4_) {
		i_6_ = class526.sizeY * 333584223;
		i_7_ = 1351092869 * class526.sizeX;
	    }
	    ((Class241_Sub38) class241_sub38).anInt10122
		= 2091577895 * (i_2_ + i_6_ << 9);
	    ((Class241_Sub38) class241_sub38).anInt10123
		= (i_3_ + i_7_ << 9) * 1727276991;
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
		class241_sub38.method16432(1628246272);
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
	    Class241_Sub38.aClass429_10116.addNode(class241_sub38,
						      (short) -23393);
	    Class402.soundManager.method1155((((Class241_Sub38)
						class241_sub38).anInt10140
					       * 1309234459),
					      (byte) 8);
	    Class402.soundManager.method1154(((Class241_Sub38)
					       class241_sub38).anIntArray10145,
					      -57598067);
	} else if (class475_sub1_sub1_sub3_sub2 != null) {
	    ((Class241_Sub38) class241_sub38)
		.aClass475_Sub1_Sub1_Sub3_Sub2_10130
		= class475_sub1_sub1_sub3_sub2;
	    NPCDefinition class401 = class475_sub1_sub1_sub3_sub2.definition;
	    if (class401.transformTo != null) {
		((Class241_Sub38) class241_sub38).aBool10120 = true;
		class401 = class401.method7176(Class1.aClass19_11,
					       Class1.aClass19_11, (byte) 111);
	    }
	    if (null != class401) {
		((Class241_Sub38) class241_sub38).anInt10122
		    = (i_2_ + class401.size * 19489015 << 9) * 2091577895;
		((Class241_Sub38) class241_sub38).anInt10123
		    = 1727276991 * (19489015 * class401.size + i_3_ << 9);
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
	    Class241_Sub38.aClass429_10117.addNode(class241_sub38,
						      (short) -21679);
	} else if (null != class475_sub1_sub1_sub3_sub1) {
	    ((Class241_Sub38) class241_sub38)
		.aClass475_Sub1_Sub1_Sub3_Sub1_10131
		= class475_sub1_sub1_sub3_sub1;
	    ((Class241_Sub38) class241_sub38).anInt10122
		= (i_2_ + class475_sub1_sub1_sub3_sub1.method17782(-455159814)
		   << 9) * 2091577895;
	    ((Class241_Sub38) class241_sub38).anInt10123
		= (i_3_ + class475_sub1_sub1_sub3_sub1.method17782(94846196)
		   << 9) * 1727276991;
	    ((Class241_Sub38) class241_sub38).anInt10140
		= Class490.method11238(class475_sub1_sub1_sub3_sub1,
				       -1723991365) * 516554003;
	    ((Class241_Sub38) class241_sub38).anInt10127
		= (-2021578193
		   * (class475_sub1_sub1_sub3_sub1.anInt11513 * 1294463297
		      << 9));
	    ((Class241_Sub38) class241_sub38).anInt10128
		= 776085649 * class475_sub1_sub1_sub3_sub1.anInt11514;
	    ((Class241_Sub38) class241_sub38).anInt10139 = -490109696;
	    ((Class241_Sub38) class241_sub38).anInt10138 = 591836416;
	    ((Class241_Sub38) class241_sub38).anInt10126 = 0;
	    Class241_Sub38.aClass407_10118.put
		(class241_sub38,
		 (long) (class475_sub1_sub1_sub3_sub1.entityIndex
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
}
