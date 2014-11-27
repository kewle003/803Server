/* Class326_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class326_Sub3 extends Class326
{
    public int anInt10286;
    public int anInt10287;
    public static Class482 aClass482_10288;
    
    public Class331 method182() {
	return Class331.aClass331_5045;
    }
    
    public Class331 method183(int i) {
	return Class331.aClass331_5045;
    }
    
    Class326_Sub3(Class330 class330, Class324 class324, int i, int i_0_,
		  int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
		  int i_7_) {
	super(class330, class324, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
	anInt10286 = i_6_ * -3917097;
	anInt10287 = i_7_ * 1723145135;
    }
    
    public Class331 method184() {
	return Class331.aClass331_5045;
    }
    
    public static Class326 method16591(RSByteBuffer class241_sub3) {
	Class326 class326 = Class257.method5058(class241_sub3, 2086367452);
	int i = class241_sub3.readInt((byte) 10);
	int i_8_ = class241_sub3.readInt((byte) 106);
	return new Class326_Sub3(class326.aClass330_5008,
				 class326.aClass324_5007,
				 601610705 * class326.anInt5014,
				 -942384019 * class326.anInt5009,
				 -664032457 * class326.anInt5006,
				 class326.anInt5011 * 524993587,
				 -305994951 * class326.anInt5012,
				 -2074180427 * class326.anInt5013,
				 class326.anInt5010 * -401483607, i, i_8_);
    }
    
    public static Class326 method16592(RSByteBuffer class241_sub3) {
	Class326 class326 = Class257.method5058(class241_sub3, 2036782689);
	int i = class241_sub3.readInt((byte) 18);
	int i_9_ = class241_sub3.readInt((byte) 32);
	return new Class326_Sub3(class326.aClass330_5008,
				 class326.aClass324_5007,
				 601610705 * class326.anInt5014,
				 -942384019 * class326.anInt5009,
				 -664032457 * class326.anInt5006,
				 class326.anInt5011 * 524993587,
				 -305994951 * class326.anInt5012,
				 -2074180427 * class326.anInt5013,
				 class326.anInt5010 * -401483607, i, i_9_);
    }
    
    public static Class326 method16593(RSByteBuffer class241_sub3) {
	Class326 class326 = Class257.method5058(class241_sub3, 1987443757);
	int i = class241_sub3.readInt((byte) 5);
	int i_10_ = class241_sub3.readInt((byte) 32);
	return new Class326_Sub3(class326.aClass330_5008,
				 class326.aClass324_5007,
				 601610705 * class326.anInt5014,
				 -942384019 * class326.anInt5009,
				 -664032457 * class326.anInt5006,
				 class326.anInt5011 * 524993587,
				 -305994951 * class326.anInt5012,
				 -2074180427 * class326.anInt5013,
				 class326.anInt5010 * -401483607, i, i_10_);
    }
    
    static final void method16594
	(Entity class475_sub1_sub1_sub3, boolean bool,
	 short i) {
	Class554 class554 = class475_sub1_sub1_sub3.method17787(-1006015715);
	if (-316498507 * class475_sub1_sub1_sub3.queuedStepCount == 0) {
	    class475_sub1_sub1_sub3.anInt11429 = 0;
	    Class88.anInt1296 = 1648604203 * Class448.aClass448_6191.aByte6187;
	    Class238.anInt2757 = 0;
	} else {
	    if (class475_sub1_sub1_sub3.aClass409_11375.method7364(1597449234)
		&& !class475_sub1_sub1_sub3.aClass409_11375
			.method7349(-1197912931)) {
		AnimationDefinition class549 = class475_sub1_sub1_sub3.aClass409_11375
					.method7345((byte) 34);
		if (-928701413 * class475_sub1_sub1_sub3.anInt11430 > 0
		    && 0 == class549.anInt7088 * 2119332939) {
		    class475_sub1_sub1_sub3.anInt11429 += 720693663;
		    Class88.anInt1296
			= Class448.aClass448_6191.aByte6187 * 1648604203;
		    Class238.anInt2757 = 0;
		    return;
		}
		if (-928701413 * class475_sub1_sub1_sub3.anInt11430 <= 0
		    && 377701637 * class549.anInt7081 == 0) {
		    class475_sub1_sub1_sub3.anInt11429 += 720693663;
		    Class88.anInt1296
			= Class448.aClass448_6191.aByte6187 * 1648604203;
		    Class238.anInt2757 = 0;
		    return;
		}
	    }
	    for (int i_11_ = 0;
		 i_11_ < class475_sub1_sub1_sub3.aClass244Array11404.length;
		 i_11_++) {
		if ((class475_sub1_sub1_sub3.aClass244Array11404[i_11_]
		     .graphicsID) * 1967872619 != -1
		    && class475_sub1_sub1_sub3.aClass244Array11404[i_11_]
			   .aClass409_3935.method7349(-182971839)) {
		    GraphicsDefinition class460
			= (Class240.graphicsDefLoader.getGraphicsDefinition
			   ((class475_sub1_sub1_sub3.aClass244Array11404[i_11_]
			     .graphicsID) * 1967872619,
			    1232200923));
		    if (class460.aBool6277
			&& class460.anInt6267 * 850723107 != -1) {
			AnimationDefinition class549
			    = (Class394.animationDefLoader.getAnimationDefinition
			       (850723107 * class460.anInt6267, (byte) -104));
			if (-928701413 * class475_sub1_sub1_sub3.anInt11430 > 0
			    && 0 == class549.anInt7088 * 2119332939) {
			    class475_sub1_sub1_sub3.anInt11429 += 720693663;
			    Class88.anInt1296
				= (Class448.aClass448_6191.aByte6187
				   * 1648604203);
			    Class238.anInt2757 = 0;
			    return;
			}
			if ((-928701413 * class475_sub1_sub1_sub3.anInt11430
			     <= 0)
			    && 0 == 377701637 * class549.anInt7081) {
			    class475_sub1_sub1_sub3.anInt11429 += 720693663;
			    Class88.anInt1296
				= (1648604203
				   * Class448.aClass448_6191.aByte6187);
			    Class238.anInt2757 = 0;
			    return;
			}
		    }
		}
	    }
	    Class287 class287
		= Class287.method5562(class475_sub1_sub1_sub3.method10874()
				      .aClass287_4386);
	    int i_12_ = (int) class287.aFloat4477;
	    int i_13_ = (int) class287.aFloat4479;
	    int i_14_
		= ((512
		    * (class475_sub1_sub1_sub3.scenePositionXQueue
		       [-316498507 * class475_sub1_sub1_sub3.queuedStepCount - 1]))
		   + class475_sub1_sub1_sub3.method17782(-1158702590) * 256);
	    int i_15_
		= ((512
		    * (class475_sub1_sub1_sub3.scenePositionYQueue
		       [-316498507 * class475_sub1_sub1_sub3.queuedStepCount - 1]))
		   + class475_sub1_sub1_sub3.method17782(1010978455) * 256);
	    if (i_12_ < i_14_) {
		if (i_13_ < i_15_)
		    class475_sub1_sub1_sub3.method17804(10240, 1767426013);
		else if (i_13_ > i_15_)
		    class475_sub1_sub1_sub3.method17804(14336, 2107432544);
		else
		    class475_sub1_sub1_sub3.method17804(12288, 1223574506);
	    } else if (i_12_ > i_14_) {
		if (i_13_ < i_15_)
		    class475_sub1_sub1_sub3.method17804(6144, 1840591445);
		else if (i_13_ > i_15_)
		    class475_sub1_sub1_sub3.method17804(2048, 1591011661);
		else
		    class475_sub1_sub1_sub3.method17804(4096, 1413625190);
	    } else if (i_13_ < i_15_)
		class475_sub1_sub1_sub3.method17804(8192, 1724328059);
	    else if (i_13_ > i_15_)
		class475_sub1_sub1_sub3.method17804(0, 1829685766);
	    int i_16_
		= (class475_sub1_sub1_sub3.moveTypeQueue
		   [class475_sub1_sub1_sub3.queuedStepCount * -316498507 - 1]);
	    if (!bool && (i_14_ - i_12_ > 1024 || i_14_ - i_12_ < -1024
			  || i_15_ - i_13_ > 1024 || i_15_ - i_13_ < -1024)) {
		class475_sub1_sub1_sub3.method10880((float) i_14_,
						    class287.aFloat4474,
						    (float) i_15_);
		class475_sub1_sub1_sub3.setDirection((950504489
						     * (class475_sub1_sub1_sub3
							.anInt11421)),
						    false, (byte) 91);
		class475_sub1_sub1_sub3.queuedStepCount -= 1631398045;
		if (class475_sub1_sub1_sub3.anInt11430 * -928701413 > 0)
		    class475_sub1_sub1_sub3.anInt11430 -= -2111039981;
		Class88.anInt1296
		    = Class448.aClass448_6191.aByte6187 * 1648604203;
		Class238.anInt2757 = 0;
		class287.method5564();
	    } else {
		int i_17_ = 16;
		boolean bool_18_ = true;
		if (class475_sub1_sub1_sub3
		    instanceof NPC)
		    bool_18_
			= ((NPC)
			   class475_sub1_sub1_sub3).definition.aBool5840;
		if (bool_18_) {
		    int i_19_ = (950504489 * class475_sub1_sub1_sub3.anInt11421
				 - -267726731 * (class475_sub1_sub1_sub3
						 .aClass8_11406.anInt44));
		    if (i_19_ != 0
			&& -1 == -36064791 * class475_sub1_sub1_sub3.facingEntity
			&& 0 != (-683062517
				 * class475_sub1_sub1_sub3.anInt11400))
			i_17_ = 8;
		    if (!bool
			&& -316498507 * class475_sub1_sub1_sub3.queuedStepCount > 2)
			i_17_ = 24;
		    if (!bool
			&& class475_sub1_sub1_sub3.queuedStepCount * -316498507 > 3)
			i_17_ = 32;
		} else {
		    if (!bool
			&& class475_sub1_sub1_sub3.queuedStepCount * -316498507 > 1)
			i_17_ = 24;
		    if (!bool
			&& class475_sub1_sub1_sub3.queuedStepCount * -316498507 > 2)
			i_17_ = 32;
		}
		if (-1986268577 * class475_sub1_sub1_sub3.anInt11429 > 0
		    && -316498507 * class475_sub1_sub1_sub3.queuedStepCount > 1) {
		    i_17_ = 32;
		    class475_sub1_sub1_sub3.anInt11429 -= 720693663;
		}
		if (Class448.aClass448_6184.aByte6187 == i_16_)
		    i_17_ <<= 1;
		else if (i_16_ == Class448.aClass448_6185.aByte6187)
		    i_17_ >>= 1;
		if (class554.anInt7244 * -145520949 != -1) {
		    i_17_ <<= 9;
		    if (class475_sub1_sub1_sub3.queuedStepCount * -316498507 == 1) {
			int i_20_
			    = (class475_sub1_sub1_sub3.anInt11431 * 461934783
			       * (461934783
				  * class475_sub1_sub1_sub3.anInt11431));
			int i_21_ = (((int) class287.aFloat4477 > i_14_
				      ? (int) class287.aFloat4477 - i_14_
				      : i_14_ - (int) class287.aFloat4477)
				     << 9);
			int i_22_ = (((int) class287.aFloat4479 > i_15_
				      ? (int) class287.aFloat4479 - i_15_
				      : i_15_ - (int) class287.aFloat4479)
				     << 9);
			int i_23_ = i_21_ > i_22_ ? i_21_ : i_22_;
			int i_24_ = i_23_ * (-291041898 * class554.anInt7244);
			if (i_20_ > i_24_) {
			    Entity class475_sub1_sub1_sub3_25_;
			    (class475_sub1_sub1_sub3_25_
			     = class475_sub1_sub1_sub3).anInt11431
				= (461934783
				   * class475_sub1_sub1_sub3_25_.anInt11431 / 2
				   * -2110595265);
			} else if (i_20_ / 2 > i_23_) {
			    class475_sub1_sub1_sub3.anInt11431
				-= 161415413 * class554.anInt7244;
			    if (class475_sub1_sub1_sub3.anInt11431 * 461934783
				< 0)
				class475_sub1_sub1_sub3.anInt11431 = 0;
			} else if ((class475_sub1_sub1_sub3.anInt11431
				    * 461934783)
				   < i_17_) {
			    class475_sub1_sub1_sub3.anInt11431
				+= 161415413 * class554.anInt7244;
			    if (461934783 * class475_sub1_sub1_sub3.anInt11431
				> i_17_)
				class475_sub1_sub1_sub3.anInt11431
				    = -2110595265 * i_17_;
			}
		    } else if (461934783 * class475_sub1_sub1_sub3.anInt11431
			       < i_17_) {
			class475_sub1_sub1_sub3.anInt11431
			    += class554.anInt7244 * 161415413;
			if (461934783 * class475_sub1_sub1_sub3.anInt11431
			    > i_17_)
			    class475_sub1_sub1_sub3.anInt11431
				= -2110595265 * i_17_;
		    } else if (class475_sub1_sub1_sub3.anInt11431 * 461934783
			       > 0) {
			class475_sub1_sub1_sub3.anInt11431
			    -= 161415413 * class554.anInt7244;
			if (class475_sub1_sub1_sub3.anInt11431 * 461934783 < 0)
			    class475_sub1_sub1_sub3.anInt11431 = 0;
		    }
		    i_17_
			= 461934783 * class475_sub1_sub1_sub3.anInt11431 >> 9;
		    if (i_17_ < 1)
			i_17_ = 1;
		}
		Class238.anInt2757 = 0;
		if (i_12_ != i_14_ || i_15_ != i_13_) {
		    if (i_12_ < i_14_) {
			class287.aFloat4477 += (float) i_17_;
			Class238.anInt2757
			    = -1329217311 * (Class238.anInt2757 * -1951431903
					     | 0x4);
			if (class287.aFloat4477 > (float) i_14_)
			    class287.aFloat4477 = (float) i_14_;
		    } else if (i_12_ > i_14_) {
			class287.aFloat4477 -= (float) i_17_;
			Class238.anInt2757 = (Class238.anInt2757 * -1951431903
					      | 0x8) * -1329217311;
			if (class287.aFloat4477 < (float) i_14_)
			    class287.aFloat4477 = (float) i_14_;
		    }
		    if (i_13_ < i_15_) {
			class287.aFloat4479 += (float) i_17_;
			Class238.anInt2757
			    = -1329217311 * (Class238.anInt2757 * -1951431903
					     | 0x1);
			if (class287.aFloat4479 > (float) i_15_)
			    class287.aFloat4479 = (float) i_15_;
		    } else if (i_13_ > i_15_) {
			class287.aFloat4479 -= (float) i_17_;
			Class238.anInt2757 = (-1951431903 * Class238.anInt2757
					      | 0x2) * -1329217311;
			if (class287.aFloat4479 < (float) i_15_)
			    class287.aFloat4479 = (float) i_15_;
		    }
		    class475_sub1_sub1_sub3.method10898(class287);
		    if (i_17_ >= 32)
			Class88.anInt1296
			    = 1648604203 * Class448.aClass448_6184.aByte6187;
		    else
			Class88.anInt1296 = 1648604203 * i_16_;
		} else
		    Class88.anInt1296
			= Class448.aClass448_6191.aByte6187 * 1648604203;
		if ((int) class287.aFloat4477 == i_14_
		    && (int) class287.aFloat4479 == i_15_) {
		    class475_sub1_sub1_sub3.queuedStepCount -= 1631398045;
		    if (-928701413 * class475_sub1_sub1_sub3.anInt11430 > 0)
			class475_sub1_sub1_sub3.anInt11430 -= -2111039981;
		}
		class287.method5564();
	    }
	}
    }
    
    public static final int method16595(String string, int i) {
	if (string == null || string.length() == 0)
	    return -1;
	for (int i_26_ = 0; i_26_ < client.ignoreListSize * -750736473; i_26_++) {
	    if (string.equalsIgnoreCase(client.ignoreList[i_26_]
					.currentName))
		return i_26_;
	}
	return -1;
    }
}
