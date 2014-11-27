/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GameShell3$FrameParameters
{
    String aString4002;
    int anInt4003;
    int anInt4004;
    int anInt4005;
    int anInt4006;
    static Class425 aClass425_4007;
    static String aString4008;
    
    int getWidth/*method5009*/(int i) {
    	return anInt4005 * 1156775563;
    }
    
    int getHeight/*method5010*/(int i) {
    	return anInt4003 * 1627224475;
    }
    
    int method5011() {
	return anInt4003 * 1627224475;
    }
    
    int getXMargin/*method5012*/(int i) {
    	return -128364395 * anInt4004;
    }
    
    int getYMargin/*method5013*/(int i) {
    	return anInt4006 * -1007254129;
    }
    
    int method5014() {
	return -128364395 * anInt4004;
    }
    
    String getTitle/*method5015*/(int i) {
    	return aString4002;
    }
    
    int method5016() {
	return anInt4003 * 1627224475;
    }
    
    int method5017() {
	return anInt4003 * 1627224475;
    }
    
    public GameShell3$FrameParameters(int i, int i_0_, int i_1_, int i_2_, String string) {
	anInt4005 = i * 1943468323;
	anInt4003 = i_0_ * -1143847789;
	anInt4004 = i_1_ * -1972962627;
	anInt4006 = 1787623791 * i_2_;
	aString4002 = string;
    }
    
    int method5018() {
	return anInt4006 * -1007254129;
    }
    
    String method5019() {
	return aString4002;
    }
    
    static final void setVarcompKeyTypedEvent/*method5020*/(ClientScriptData class454, byte i) {
		Class455 class455 = (((ClientScriptData) class454).aBool6246
				     ? ((ClientScriptData) class454).aClass455_6230
				     : ((ClientScriptData) class454).aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
		Class467.setKeyTypedEvent(component, class35, class454, 1891774440);
    }
    
    static final void method5021(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (!Class236.aClass103_2713.method2215())
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 3;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub10_8881.method7880(i_3_, 996762312);
    }
    
    public static Class83 method5022(int i, short i_4_) {
	Class83[] class83s = Class112.method2779(-1612114981);
	for (int i_5_ = 0; i_5_ < class83s.length; i_5_++) {
	    Class83 class83 = class83s[i_5_];
	    if (((Class83) class83).anInt1156 * -1013075467 == i)
		return class83;
	}
	return null;
    }
    
    static void method5023(Class241_Sub38 class241_sub38, int i, int i_6_,
			   int i_7_, int i_8_, byte i_9_) {
	if (-1 != 1309234459 * ((Class241_Sub38) class241_sub38).anInt10140
	    || null != ((Class241_Sub38) class241_sub38).anIntArray10145) {
	    int i_10_
		= ((Class241_Sub38) class241_sub38).anInt10128 * -1813901463;
	    if (((Class241_Sub38) class241_sub38).anInt10127 * 1736072399 == 0
		|| Class241_Sub5_Sub9.aClass241_Sub9_11043
		       .aClass445_Sub6_8888.method14143(2124179514) == 0
		|| (1193750551 * ((Class241_Sub38) class241_sub38).anInt10119
		    != i)) {
		if (((Class241_Sub38) class241_sub38).aClass221_10141
		    != null) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(100, -1504174534);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -36);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
	    } else {
		if (null != ((Class241_Sub38) class241_sub38).aClass221_10141
		    && (((Class241_Sub38) class241_sub38).aClass221_10141
			    .method4398(-1893266515) == Class223.aClass223_2600
			|| (((Class241_Sub38) class241_sub38)
				.aClass221_10141.method4398(-1992441766)
			    == Class223.aClass223_2596))) {
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -112);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		if (null
		    == ((Class241_Sub38) class241_sub38).aClass221_10141) {
		    if ((1309234459
			 * ((Class241_Sub38) class241_sub38).anInt10140)
			>= 0) {
			int i_11_ = 256;
			int i_12_
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
			int i_13_
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
			    = (float) i_12_;
			((Class241_Sub38) class241_sub38).aClass287_10125
			    .aFloat4479
			    = (float) i_13_;
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
				0, i_11_, false, -308793216));
			if (null != (((Class241_Sub38) class241_sub38)
				     .aClass221_10141)) {
			    float f = (float) i_10_ / 255.0F;
			    ((Class241_Sub38) class241_sub38)
				.aClass221_10141.method4440(f, 150, 395082677);
			    ((Class241_Sub38) class241_sub38)
				.aClass221_10141.method4392(1358653509);
			}
		    }
		} else {
		    int i_14_
			= (int) ((float) ((((Class241_Sub38) class241_sub38)
					   .anInt10122) * -2146083433
					  - (((Class241_Sub38) class241_sub38)
					     .anInt10121) * 627217157) * 0.5F
				 + (float) (627217157
					    * ((Class241_Sub38)
					       class241_sub38).anInt10121));
		    int i_15_
			= (int) ((float) ((((Class241_Sub38) class241_sub38)
					   .anInt10123) * 1952696383
					  - (((Class241_Sub38) class241_sub38)
					     .anInt10137) * 268994875) * 0.5F
				 + (float) (268994875
					    * ((Class241_Sub38)
					       class241_sub38).anInt10137));
		    ((Class241_Sub38) class241_sub38).aClass287_10125
			.aFloat4477
			= (float) i_14_;
		    ((Class241_Sub38) class241_sub38).aClass287_10125
			.aFloat4479
			= (float) i_15_;
		}
		if (null
		    == ((Class241_Sub38) class241_sub38).aClass221_10142) {
		    if ((null
			 != ((Class241_Sub38) class241_sub38).anIntArray10145)
			&& (((Class241_Sub38) class241_sub38).anInt10146
			    -= 1463017049 * i_8_) * 1721076201 <= 0) {
			int i_16_
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
			int i_17_
			    = (int) (Math.random()
				     * (double) (((Class241_Sub38)
						  class241_sub38)
						 .anIntArray10145).length);
			int i_18_
			    = (int) ((float) (627217157
					      * ((Class241_Sub38)
						 class241_sub38).anInt10121)
				     + (float) ((((Class241_Sub38)
						  class241_sub38).anInt10122
						 * -2146083433)
						- (((Class241_Sub38)
						    class241_sub38).anInt10121
						   * 627217157)) * 0.5F);
			int i_19_
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
			    = (float) i_18_;
			((Class241_Sub38) class241_sub38).aClass287_10124
			    .aFloat4479
			    = (float) i_19_;
			((Class241_Sub38) class241_sub38).aClass221_10142
			    = (Class402.soundManager.method1161
			       (Class112.aClass112_1514, class241_sub38,
				(((Class241_Sub38) class241_sub38)
				 .anIntArray10145[i_17_]),
				0, i_10_,
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
				0, i_16_, false, 2058317434));
			if (null != (((Class241_Sub38) class241_sub38)
				     .aClass221_10142))
			    ((Class241_Sub38) class241_sub38)
				.aClass221_10142.method4392(1440328547);
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
		    int i_20_
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
		    int i_21_
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
			= (float) i_20_;
		    ((Class241_Sub38) class241_sub38).aClass287_10124
			.aFloat4479
			= (float) i_21_;
		    if (((Class241_Sub38) class241_sub38).aClass221_10142
			    .method4398(-1895585598) == Class223.aClass223_2600
			|| (((Class241_Sub38) class241_sub38)
				.aClass221_10142.method4398(-1853918451)
			    == Class223.aClass223_2596)) {
			Class402.soundManager.method1136((((Class241_Sub38)
							    class241_sub38)
							   .aClass221_10142),
							  (byte) -118);
			((Class241_Sub38) class241_sub38).aClass221_10142
			    = null;
		    }
		}
	    }
	}
    }
}
