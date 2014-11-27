/* Class409 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class409
{
    Class444 aClass444_5917;
    public static final int anInt5918 = 2;
    boolean aBool5919;
    public static final int anInt5920 = 0;
    int anInt5921;
    AnimationDefinition aClass549_5922;
    int anInt5923;
    int anInt5924;
    int anInt5925;
    boolean aBool5926 = false;
    boolean aBool5927;
    int anInt5928;
    int anInt5929;
    public static final int anInt5930 = 1;
    Class444 aClass444_5931;
    public static InvTypeList aClass617_5932;
    
    public final void method7343(int i, boolean bool) {
	method7351(i, 0, 0, bool, -1302211377);
    }
    
    Class409(boolean bool) {
	((Class409) this).aBool5919 = false;
	((Class409) this).anInt5928 = 0;
	((Class409) this).aBool5927 = false;
	((Class409) this).aBool5919 = bool;
	((Class409) this).aClass444_5917 = new Class444();
	if (((Class409) this).aBool5919)
	    ((Class409) this).aClass444_5931 = new Class444();
	else
	    ((Class409) this).aClass444_5931 = null;
    }
    
    public final void method7344(int i, boolean bool, boolean bool_0_,
				 int i_1_) {
	method7352(i, 0, 0, bool, bool_0_, 1309155970);
    }
    
    public final AnimationDefinition method7345(byte i) {
	return ((Class409) this).aClass549_5922;
    }
    
    public final int method7346(int i) {
	return (null != ((Class409) this).aClass549_5922
		? ((Class409) this).aClass549_5922.animationID * -1986105329
		: -1);
    }
    
    public final void method7347(int i, int i_2_) {
	method7351(i, 0, 0, false, -1302211377);
    }
    
    public final void method7348(int i, int i_3_, int i_4_) {
	method7351(i, i_3_, 0, false, -1302211377);
    }
    
    public final boolean method7349(int i) {
	return 0 != ((Class409) this).anInt5924 * -560831499;
    }
    
    public final boolean method7350() {
	return ((Class409) this).aBool5926;
    }
    
    public final void method7351(int i, int i_5_, int i_6_, boolean bool,
				 int i_7_) {
	method7352(i, i_5_, i_6_, bool, false, -110568783);
    }
    
    final void method7352(int i, int i_8_, int i_9_, boolean bool,
			  boolean bool_10_, int i_11_) {
	if (i != method7346(-1943505313)) {
	    if (-1 != i) {
		if (null != ((Class409) this).aClass549_5922
		    && (-1986105329
			* ((Class409) this).aClass549_5922.animationID) == i) {
		    if (((Class409) this).aClass549_5922.anInt7078 * 1834456867
			== 0)
			return;
		} else
		    ((Class409) this).aClass549_5922
			= VarBasicType.aClass556_9995.getAnimationDefinition(i,
								   (byte) -66);
		((Class409) this).anInt5923 = 0;
		((Class409) this).anInt5924 = 892137565 * i_8_;
		((Class409) this).anInt5928 = i_9_ * 1402559807;
		((Class409) this).aBool5927 = bool_10_;
		if (bool) {
		    ((Class409) this).anInt5929
			= ((int) (Math.random()
				  * (double) (((Class409) this).aClass549_5922
					      .anIntArray7069).length)
			   * -407028541);
		    ((Class409) this).anInt5921
			= ((int) (Math.random()
				  * (double) (((Class409) this).aClass549_5922
					      .frameDurations
					      [-105753621 * (((Class409) this)
							     .anInt5929)]))
			   * -783982885);
		} else {
		    ((Class409) this).anInt5929 = 0;
		    ((Class409) this).anInt5921 = 0;
		}
		((Class409) this).anInt5925
		    = -1674126959 + ((Class409) this).anInt5929 * 2125839131;
		if (-1696135311 * ((Class409) this).anInt5925 < 0
		    || (-1696135311 * ((Class409) this).anInt5925
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length))
		    ((Class409) this).anInt5925 = 1674126959;
		if (-560831499 * ((Class409) this).anInt5924 == 0)
		    method7366(((Class409) this).aClass549_5922,
			       -105753621 * ((Class409) this).anInt5929,
			       839353766);
		((Class409) this).aBool5926 = false;
	    } else
		((Class409) this).aClass549_5922 = null;
	    method7368((byte) 33);
	}
    }
    
    public final void method7353(int i, byte i_12_) {
	((Class409) this).anInt5929 = 0;
	((Class409) this).anInt5925
	    = (((Class409) this).aClass549_5922.anIntArray7069.length > 1 ? 1
	       : -1) * -1674126959;
	((Class409) this).anInt5921 = 0;
	((Class409) this).aBool5926 = false;
	((Class409) this).anInt5924 = 892137565 * i;
	((Class409) this).anInt5923 = 0;
	if (null != ((Class409) this).aClass549_5922
	    & ((Class409) this).aClass549_5922.anIntArray7069 != null) {
	    method7366(((Class409) this).aClass549_5922,
		       -105753621 * ((Class409) this).anInt5929, 4771790);
	    method7368((byte) 49);
	}
    }
    
    public final int method7354(byte i) {
	return -560831499 * ((Class409) this).anInt5924;
    }
    
    public final void method7355(int i, int i_13_) {
	((Class409) this).anInt5924 = 892137565 * i;
    }
    
    public final int method7356(int i) {
	if (method7367(274859022)) {
	    int i_14_ = 0;
	    if (method7367(173991582)) {
		i_14_ |= 258215707 * ((Class444) (((Class409) this)
						  .aClass444_5917)).anInt6169;
		if (((Class409) this).aBool5919
		    && null != ((Class409) this).aClass549_5922.anIntArray7071)
		    i_14_ |= (258215707
			      * (((Class444) ((Class409) this).aClass444_5931)
				 .anInt6169));
	    }
	    return i_14_;
	}
	return 0;
    }
    
    public final void method7357(Class89 class89, int i, byte i_15_) {
	if (null != ((Class409) this).aClass549_5922) {
	    if (((Class409) this).aClass549_5922.anIntArray7069 != null
		&& method7367(-207351530)) {
		class89.method1879
		    ((((Class444) ((Class409) this).aClass444_5917)
		      .aClass241_Sub39_Sub2_6171),
		     (((Class444) ((Class409) this).aClass444_5917).anInt6167
		      * 1417332431),
		     (((Class444) ((Class409) this).aClass444_5917)
		      .aClass241_Sub39_Sub2_6170),
		     (((Class444) ((Class409) this).aClass444_5917).anInt6168
		      * -1124323391),
		     604859731 * ((Class409) this).anInt5921,
		     (((Class409) this).aClass549_5922.frameDurations
		      [-105753621 * ((Class409) this).anInt5929]),
		     i, ((Class409) this).aClass549_5922.aBool7083);
		if (((Class409) this).aBool5919
		    && ((Class409) this).aClass549_5922.anIntArray7071 != null
		    && ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		    class89.method1879
			((((Class444) ((Class409) this).aClass444_5931)
			  .aClass241_Sub39_Sub2_6171),
			 1417332431 * ((Class444) (((Class409) this)
						   .aClass444_5931)).anInt6167,
			 (((Class444) ((Class409) this).aClass444_5931)
			  .aClass241_Sub39_Sub2_6170),
			 (((Class444) ((Class409) this).aClass444_5931)
			  .anInt6168) * -1124323391,
			 604859731 * ((Class409) this).anInt5921,
			 (((Class409) this).aClass549_5922.frameDurations
			  [((Class409) this).anInt5929 * -105753621]),
			 i, ((Class409) this).aClass549_5922.aBool7083);
	    }
	}
    }
    
    public final void method7358(Class89 class89, int i, int i_16_,
				 int i_17_) {
	if (((Class409) this).aClass549_5922.anIntArray7069 != null
	    && method7367(-1077404488)) {
	    class89.method2008((((Class444) ((Class409) this).aClass444_5917)
				.aClass241_Sub39_Sub2_6171),
			       (((Class444) ((Class409) this).aClass444_5917)
				.anInt6167) * 1417332431,
			       (((Class444) ((Class409) this).aClass444_5917)
				.aClass241_Sub39_Sub2_6170),
			       (((Class444) ((Class409) this).aClass444_5917)
				.anInt6168) * -1124323391,
			       ((Class409) this).anInt5921 * 604859731,
			       (((Class409) this).aClass549_5922.frameDurations
				[-105753621 * ((Class409) this).anInt5929]),
			       i, i_16_,
			       ((Class409) this).aClass549_5922.aBool7083,
			       null);
	    if (((Class409) this).aBool5919
		&& null != ((Class409) this).aClass549_5922.anIntArray7071
		&& ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		class89.method2008
		    ((((Class444) ((Class409) this).aClass444_5931)
		      .aClass241_Sub39_Sub2_6171),
		     1417332431 * ((Class444)
				   ((Class409) this).aClass444_5931).anInt6167,
		     (((Class444) ((Class409) this).aClass444_5931)
		      .aClass241_Sub39_Sub2_6170),
		     -1124323391 * ((Class444) (((Class409) this)
						.aClass444_5931)).anInt6168,
		     604859731 * ((Class409) this).anInt5921,
		     (((Class409) this).aClass549_5922.frameDurations
		      [-105753621 * ((Class409) this).anInt5929]),
		     i, i_16_, ((Class409) this).aClass549_5922.aBool7083,
		     null);
	}
    }
    
    public final void method7359(int i, boolean bool) {
	method7351(i, 0, 0, bool, -1302211377);
    }
    
    final void method7360() {
	((Class409) this).aClass444_5917.method7877((byte) 1);
	if (((Class409) this).aBool5919)
	    ((Class409) this).aClass444_5931.method7877((byte) 1);
    }
    
    public final void method7361(byte i) {
	((Class409) this).anInt5923 = 0;
    }
    
    final boolean method7362() {
	if (null != ((Class409) this).aClass549_5922) {
	    boolean bool = (((Class409) this).aClass444_5917.method7873
			    (VarBasicType.aClass556_9995,
			     ((Class409) this).aClass549_5922,
			     ((Class409) this).anInt5929 * -105753621,
			     ((Class409) this).anInt5925 * -1696135311,
			     ((Class409) this).aClass549_5922.anIntArray7069,
			     2098972085));
	    if (bool && ((Class409) this).aBool5919
		&& null != ((Class409) this).aClass549_5922.anIntArray7071)
		((Class409) this).aClass444_5931.method7873
		    (VarBasicType.aClass556_9995,
		     ((Class409) this).aClass549_5922,
		     ((Class409) this).anInt5929 * -105753621,
		     -1696135311 * ((Class409) this).anInt5925,
		     ((Class409) this).aClass549_5922.anIntArray7071,
		     1605103773);
	    return bool;
	}
	return false;
    }
    
    public final void method7363(Class89 class89) {
	if (null != ((Class409) this).aClass549_5922.anIntArray7069
	    && method7367(1478539864)) {
	    class89.method1937((((Class444) ((Class409) this).aClass444_5917)
				.aClass241_Sub39_Sub2_6171),
			       1417332431 * (((Class444)
					      ((Class409) this).aClass444_5917)
					     .anInt6167));
	    if (((Class409) this).aBool5919
		&& ((Class409) this).aClass549_5922.anIntArray7071 != null
		&& ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		class89.method1937((((Class444)
				     ((Class409) this).aClass444_5931)
				    .aClass241_Sub39_Sub2_6171),
				   1417332431 * (((Class444) (((Class409) this)
							      .aClass444_5931))
						 .anInt6167));
	}
    }
    
    public final boolean method7364(int i) {
	return null != ((Class409) this).aClass549_5922;
    }
    
    public final boolean method7365(int i, int i_18_) {
	if (((Class409) this).aClass549_5922 == null
	    | (i -= -560831499 * ((Class409) this).anInt5924) <= 0)
	    return false;
	return (((Class409) this).aClass549_5922.aBool7066
		| (604859731 * ((Class409) this).anInt5921 + i
		   > (((Class409) this).aClass549_5922.frameDurations
		      [-105753621 * ((Class409) this).anInt5929])));
    }
    
    void method7366(AnimationDefinition class549, int i, int i_19_) {
	/* empty */
    }
    
    final boolean method7367(int i) {
	if (null != ((Class409) this).aClass549_5922) {
	    boolean bool = (((Class409) this).aClass444_5917.method7873
			    (VarBasicType.aClass556_9995,
			     ((Class409) this).aClass549_5922,
			     ((Class409) this).anInt5929 * -105753621,
			     ((Class409) this).anInt5925 * -1696135311,
			     ((Class409) this).aClass549_5922.anIntArray7069,
			     272983447));
	    if (bool && ((Class409) this).aBool5919
		&& null != ((Class409) this).aClass549_5922.anIntArray7071)
		((Class409) this).aClass444_5931.method7873
		    (VarBasicType.aClass556_9995,
		     ((Class409) this).aClass549_5922,
		     ((Class409) this).anInt5929 * -105753621,
		     -1696135311 * ((Class409) this).anInt5925,
		     ((Class409) this).aClass549_5922.anIntArray7071,
		     653631260);
	    return bool;
	}
	return false;
    }
    
    final void method7368(byte i) {
	((Class409) this).aClass444_5917.method7877((byte) 1);
	if (((Class409) this).aBool5919)
	    ((Class409) this).aClass444_5931.method7877((byte) 1);
    }
    
    public final int method7369() {
	return (null != ((Class409) this).aClass549_5922
		? ((Class409) this).aClass549_5922.animationID * -1986105329
		: -1);
    }
    
    public static final void method7370(Class89 class89, Class409 class409,
					Class409 class409_20_) {
	if (class409.method7367(-2111213479)
	    && class409_20_.method7367(752254088)) {
	    AnimationDefinition class549 = ((Class409) class409).aClass549_5922;
	    AnimationDefinition class549_21_ = ((Class409) class409_20_).aClass549_5922;
	    class89.method1881
		((((Class444) ((Class409) class409).aClass444_5917)
		  .aClass241_Sub39_Sub2_6171),
		 (((Class444) ((Class409) class409).aClass444_5917).anInt6167
		  * 1417332431),
		 (((Class444) ((Class409) class409).aClass444_5917)
		  .aClass241_Sub39_Sub2_6170),
		 -1124323391 * ((Class444) (((Class409) class409)
					    .aClass444_5917)).anInt6168,
		 604859731 * ((Class409) class409).anInt5921,
		 (class549.frameDurations
		  [-105753621 * ((Class409) class409).anInt5929]),
		 (((Class444) ((Class409) class409_20_).aClass444_5917)
		  .aClass241_Sub39_Sub2_6171),
		 (((Class444) ((Class409) class409_20_).aClass444_5917)
		  .anInt6167) * 1417332431,
		 (((Class444) ((Class409) class409_20_).aClass444_5917)
		  .aClass241_Sub39_Sub2_6170),
		 -1124323391 * ((Class444) (((Class409) class409_20_)
					    .aClass444_5917)).anInt6168,
		 604859731 * ((Class409) class409_20_).anInt5921,
		 (class549_21_.frameDurations
		  [-105753621 * ((Class409) class409_20_).anInt5929]),
		 (class549.config != null
		  ? class549.config.aBoolArray7014 : null),
		 class549.aBool7083 | class549_21_.aBool7083);
	}
    }
    
    public static void method7371(AnimationDefinitionLoader class556) {
	VarBasicType.aClass556_9995 = class556;
    }
    
    public final AnimationDefinition method7372() {
	return ((Class409) this).aClass549_5922;
    }
    
    public final void method7373(Class409 class409_22_) {
	((Class409) this).aClass549_5922
	    = ((Class409) class409_22_).aClass549_5922;
	((Class409) this).aBool5926 = ((Class409) class409_22_).aBool5926;
	((Class409) this).aBool5919 = ((Class409) class409_22_).aBool5919;
	((Class409) this).anInt5924 = ((Class409) class409_22_).anInt5924 * 1;
	((Class409) this).anInt5923 = ((Class409) class409_22_).anInt5923 * 1;
	((Class409) this).anInt5929 = 1 * ((Class409) class409_22_).anInt5929;
	((Class409) this).anInt5925 = 1 * ((Class409) class409_22_).anInt5925;
	((Class409) this).anInt5921 = ((Class409) class409_22_).anInt5921 * 1;
	method7368((byte) -71);
    }
    
    public final void method7374(Class409 class409_23_) {
	((Class409) this).aClass549_5922
	    = ((Class409) class409_23_).aClass549_5922;
	((Class409) this).aBool5926 = ((Class409) class409_23_).aBool5926;
	((Class409) this).aBool5919 = ((Class409) class409_23_).aBool5919;
	((Class409) this).anInt5924 = ((Class409) class409_23_).anInt5924 * 1;
	((Class409) this).anInt5923 = ((Class409) class409_23_).anInt5923 * 1;
	((Class409) this).anInt5929 = 1 * ((Class409) class409_23_).anInt5929;
	((Class409) this).anInt5925 = 1 * ((Class409) class409_23_).anInt5925;
	((Class409) this).anInt5921 = ((Class409) class409_23_).anInt5921 * 1;
	method7368((byte) -57);
    }
    
    public final boolean method7375() {
	return null != ((Class409) this).aClass549_5922;
    }
    
    public final boolean method7376() {
	return null != ((Class409) this).aClass549_5922;
    }
    
    public final void method7377() {
	((Class409) this).anInt5923 = 0;
    }
    
    public final AnimationDefinition method7378() {
	return ((Class409) this).aClass549_5922;
    }
    
    public final void method7379(int i) {
	method7353(0, (byte) -54);
    }
    
    public final void method7380(Class409 class409_24_) {
	((Class409) this).aClass549_5922
	    = ((Class409) class409_24_).aClass549_5922;
	((Class409) this).aBool5926 = ((Class409) class409_24_).aBool5926;
	((Class409) this).aBool5919 = ((Class409) class409_24_).aBool5919;
	((Class409) this).anInt5924 = ((Class409) class409_24_).anInt5924 * 1;
	((Class409) this).anInt5923 = ((Class409) class409_24_).anInt5923 * 1;
	((Class409) this).anInt5929 = 1 * ((Class409) class409_24_).anInt5929;
	((Class409) this).anInt5925 = 1 * ((Class409) class409_24_).anInt5925;
	((Class409) this).anInt5921 = ((Class409) class409_24_).anInt5921 * 1;
	method7368((byte) -3);
    }
    
    public final int method7381() {
	return (null != ((Class409) this).aClass549_5922
		? ((Class409) this).aClass549_5922.animationID * -1986105329
		: -1);
    }
    
    public final void method7382(int i) {
	method7351(i, 0, 0, false, -1302211377);
    }
    
    public static final void method7383(Class89 class89, Class409 class409,
					Class409 class409_25_) {
	if (class409.method7367(-413326786)
	    && class409_25_.method7367(-784800381)) {
	    AnimationDefinition class549 = ((Class409) class409).aClass549_5922;
	    AnimationDefinition class549_26_ = ((Class409) class409_25_).aClass549_5922;
	    class89.method1881
		((((Class444) ((Class409) class409).aClass444_5917)
		  .aClass241_Sub39_Sub2_6171),
		 (((Class444) ((Class409) class409).aClass444_5917).anInt6167
		  * 1417332431),
		 (((Class444) ((Class409) class409).aClass444_5917)
		  .aClass241_Sub39_Sub2_6170),
		 -1124323391 * ((Class444) (((Class409) class409)
					    .aClass444_5917)).anInt6168,
		 604859731 * ((Class409) class409).anInt5921,
		 (class549.frameDurations
		  [-105753621 * ((Class409) class409).anInt5929]),
		 (((Class444) ((Class409) class409_25_).aClass444_5917)
		  .aClass241_Sub39_Sub2_6171),
		 (((Class444) ((Class409) class409_25_).aClass444_5917)
		  .anInt6167) * 1417332431,
		 (((Class444) ((Class409) class409_25_).aClass444_5917)
		  .aClass241_Sub39_Sub2_6170),
		 -1124323391 * ((Class444) (((Class409) class409_25_)
					    .aClass444_5917)).anInt6168,
		 604859731 * ((Class409) class409_25_).anInt5921,
		 (class549_26_.frameDurations
		  [-105753621 * ((Class409) class409_25_).anInt5929]),
		 (class549.config != null
		  ? class549.config.aBoolArray7014 : null),
		 class549.aBool7083 | class549_26_.aBool7083);
	}
    }
    
    public final void method7384(int i) {
	method7351(i, 0, 0, false, -1302211377);
    }
    
    public final void method7385(int i) {
	method7351(i, 0, 0, false, -1302211377);
    }
    
    public final void method7386(int i, int i_27_) {
	method7351(i, i_27_, 0, false, -1302211377);
    }
    
    void method7387(AnimationDefinition class549, int i) {
	/* empty */
    }
    
    public final void method7388(int i, int i_28_) {
	method7351(i, i_28_, 0, false, -1302211377);
    }
    
    public final void method7389(int i, int i_29_) {
	method7351(i, i_29_, 0, false, -1302211377);
    }
    
    void method7390(AnimationDefinition class549, int i) {
	/* empty */
    }
    
    public final void method7391(int i, int i_30_) {
	method7351(i, i_30_, 0, false, -1302211377);
    }
    
    public final int method7392() {
	return (null != ((Class409) this).aClass549_5922
		? ((Class409) this).aClass549_5922.animationID * -1986105329
		: -1);
    }
    
    public final void method7393(int i, boolean bool, boolean bool_31_) {
	method7352(i, 0, 0, bool, bool_31_, -1976738231);
    }
    
    public final void method7394(int i, boolean bool, boolean bool_32_) {
	method7352(i, 0, 0, bool, bool_32_, 1284740475);
    }
    
    public final void method7395(int i) {
	method7351(i, 0, 0, false, -1302211377);
    }
    
    final void method7396(int i, int i_33_, int i_34_, boolean bool,
			  boolean bool_35_) {
	if (i != method7346(-473392184)) {
	    if (-1 != i) {
		if (null != ((Class409) this).aClass549_5922
		    && (-1986105329
			* ((Class409) this).aClass549_5922.animationID) == i) {
		    if (((Class409) this).aClass549_5922.anInt7078 * 1834456867
			== 0)
			return;
		} else
		    ((Class409) this).aClass549_5922
			= VarBasicType.aClass556_9995.getAnimationDefinition(i,
								   (byte) 10);
		((Class409) this).anInt5923 = 0;
		((Class409) this).anInt5924 = 892137565 * i_33_;
		((Class409) this).anInt5928 = i_34_ * 1402559807;
		((Class409) this).aBool5927 = bool_35_;
		if (bool) {
		    ((Class409) this).anInt5929
			= ((int) (Math.random()
				  * (double) (((Class409) this).aClass549_5922
					      .anIntArray7069).length)
			   * -407028541);
		    ((Class409) this).anInt5921
			= ((int) (Math.random()
				  * (double) (((Class409) this).aClass549_5922
					      .frameDurations
					      [-105753621 * (((Class409) this)
							     .anInt5929)]))
			   * -783982885);
		} else {
		    ((Class409) this).anInt5929 = 0;
		    ((Class409) this).anInt5921 = 0;
		}
		((Class409) this).anInt5925
		    = -1674126959 + ((Class409) this).anInt5929 * 2125839131;
		if (-1696135311 * ((Class409) this).anInt5925 < 0
		    || (-1696135311 * ((Class409) this).anInt5925
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length))
		    ((Class409) this).anInt5925 = 1674126959;
		if (-560831499 * ((Class409) this).anInt5924 == 0)
		    method7366(((Class409) this).aClass549_5922,
			       -105753621 * ((Class409) this).anInt5929,
			       1367679878);
		((Class409) this).aBool5926 = false;
	    } else
		((Class409) this).aClass549_5922 = null;
	    method7368((byte) -1);
	}
    }
    
    public final boolean method7397() {
	return 0 != ((Class409) this).anInt5924 * -560831499;
    }
    
    public final void method7398(Class89 class89, byte i) {
	if (null != ((Class409) this).aClass549_5922.anIntArray7069
	    && method7367(-269687683)) {
	    class89.method1937((((Class444) ((Class409) this).aClass444_5917)
				.aClass241_Sub39_Sub2_6171),
			       1417332431 * (((Class444)
					      ((Class409) this).aClass444_5917)
					     .anInt6167));
	    if (((Class409) this).aBool5919
		&& ((Class409) this).aClass549_5922.anIntArray7071 != null
		&& ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		class89.method1937((((Class444)
				     ((Class409) this).aClass444_5931)
				    .aClass241_Sub39_Sub2_6171),
				   1417332431 * (((Class444) (((Class409) this)
							      .aClass444_5931))
						 .anInt6167));
	}
    }
    
    public final int method7399() {
	return -560831499 * ((Class409) this).anInt5924;
    }
    
    public final void method7400(int i) {
	((Class409) this).anInt5924 = 892137565 * i;
    }
    
    public final void method7401(int i) {
	((Class409) this).anInt5924 = 892137565 * i;
    }
    
    public final void method7402(int i, int i_36_, int i_37_, boolean bool) {
	method7352(i, i_36_, i_37_, bool, false, 1383285501);
    }
    
    public final void method7403(Class89 class89, int i) {
	if (null != ((Class409) this).aClass549_5922) {
	    if (((Class409) this).aClass549_5922.anIntArray7069 != null
		&& method7367(726364825)) {
		class89.method1879
		    ((((Class444) ((Class409) this).aClass444_5917)
		      .aClass241_Sub39_Sub2_6171),
		     (((Class444) ((Class409) this).aClass444_5917).anInt6167
		      * 1417332431),
		     (((Class444) ((Class409) this).aClass444_5917)
		      .aClass241_Sub39_Sub2_6170),
		     (((Class444) ((Class409) this).aClass444_5917).anInt6168
		      * -1124323391),
		     604859731 * ((Class409) this).anInt5921,
		     (((Class409) this).aClass549_5922.frameDurations
		      [-105753621 * ((Class409) this).anInt5929]),
		     i, ((Class409) this).aClass549_5922.aBool7083);
		if (((Class409) this).aBool5919
		    && ((Class409) this).aClass549_5922.anIntArray7071 != null
		    && ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		    class89.method1879
			((((Class444) ((Class409) this).aClass444_5931)
			  .aClass241_Sub39_Sub2_6171),
			 1417332431 * ((Class444) (((Class409) this)
						   .aClass444_5931)).anInt6167,
			 (((Class444) ((Class409) this).aClass444_5931)
			  .aClass241_Sub39_Sub2_6170),
			 (((Class444) ((Class409) this).aClass444_5931)
			  .anInt6168) * -1124323391,
			 604859731 * ((Class409) this).anInt5921,
			 (((Class409) this).aClass549_5922.frameDurations
			  [((Class409) this).anInt5929 * -105753621]),
			 i, ((Class409) this).aClass549_5922.aBool7083);
	    }
	}
    }
    
    public final void method7404(Class89 class89, int i) {
	if (null != ((Class409) this).aClass549_5922) {
	    if (((Class409) this).aClass549_5922.anIntArray7069 != null
		&& method7367(-775067385)) {
		class89.method1879
		    ((((Class444) ((Class409) this).aClass444_5917)
		      .aClass241_Sub39_Sub2_6171),
		     (((Class444) ((Class409) this).aClass444_5917).anInt6167
		      * 1417332431),
		     (((Class444) ((Class409) this).aClass444_5917)
		      .aClass241_Sub39_Sub2_6170),
		     (((Class444) ((Class409) this).aClass444_5917).anInt6168
		      * -1124323391),
		     604859731 * ((Class409) this).anInt5921,
		     (((Class409) this).aClass549_5922.frameDurations
		      [-105753621 * ((Class409) this).anInt5929]),
		     i, ((Class409) this).aClass549_5922.aBool7083);
		if (((Class409) this).aBool5919
		    && ((Class409) this).aClass549_5922.anIntArray7071 != null
		    && ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		    class89.method1879
			((((Class444) ((Class409) this).aClass444_5931)
			  .aClass241_Sub39_Sub2_6171),
			 1417332431 * ((Class444) (((Class409) this)
						   .aClass444_5931)).anInt6167,
			 (((Class444) ((Class409) this).aClass444_5931)
			  .aClass241_Sub39_Sub2_6170),
			 (((Class444) ((Class409) this).aClass444_5931)
			  .anInt6168) * -1124323391,
			 604859731 * ((Class409) this).anInt5921,
			 (((Class409) this).aClass549_5922.frameDurations
			  [((Class409) this).anInt5929 * -105753621]),
			 i, ((Class409) this).aClass549_5922.aBool7083);
	    }
	}
    }
    
    public final boolean method7405(int i) {
	if (((Class409) this).aClass549_5922 == null
	    | (i -= -560831499 * ((Class409) this).anInt5924) <= 0)
	    return false;
	return (((Class409) this).aClass549_5922.aBool7066
		| (604859731 * ((Class409) this).anInt5921 + i
		   > (((Class409) this).aClass549_5922.frameDurations
		      [-105753621 * ((Class409) this).anInt5929])));
    }
    
    public final void method7406(Class89 class89, int i, int i_38_) {
	if (((Class409) this).aClass549_5922.anIntArray7069 != null
	    && method7367(1145239176)) {
	    class89.method2008((((Class444) ((Class409) this).aClass444_5917)
				.aClass241_Sub39_Sub2_6171),
			       (((Class444) ((Class409) this).aClass444_5917)
				.anInt6167) * 1417332431,
			       (((Class444) ((Class409) this).aClass444_5917)
				.aClass241_Sub39_Sub2_6170),
			       (((Class444) ((Class409) this).aClass444_5917)
				.anInt6168) * -1124323391,
			       ((Class409) this).anInt5921 * 604859731,
			       (((Class409) this).aClass549_5922.frameDurations
				[-105753621 * ((Class409) this).anInt5929]),
			       i, i_38_,
			       ((Class409) this).aClass549_5922.aBool7083,
			       null);
	    if (((Class409) this).aBool5919
		&& null != ((Class409) this).aClass549_5922.anIntArray7071
		&& ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		class89.method2008
		    ((((Class444) ((Class409) this).aClass444_5931)
		      .aClass241_Sub39_Sub2_6171),
		     1417332431 * ((Class444)
				   ((Class409) this).aClass444_5931).anInt6167,
		     (((Class444) ((Class409) this).aClass444_5931)
		      .aClass241_Sub39_Sub2_6170),
		     -1124323391 * ((Class444) (((Class409) this)
						.aClass444_5931)).anInt6168,
		     604859731 * ((Class409) this).anInt5921,
		     (((Class409) this).aClass549_5922.frameDurations
		      [-105753621 * ((Class409) this).anInt5929]),
		     i, i_38_, ((Class409) this).aClass549_5922.aBool7083,
		     null);
	}
    }
    
    public final void method7407(Class89 class89) {
	if (null != ((Class409) this).aClass549_5922.anIntArray7069
	    && method7367(657107321)) {
	    class89.method1937((((Class444) ((Class409) this).aClass444_5917)
				.aClass241_Sub39_Sub2_6171),
			       1417332431 * (((Class444)
					      ((Class409) this).aClass444_5917)
					     .anInt6167));
	    if (((Class409) this).aBool5919
		&& ((Class409) this).aClass549_5922.anIntArray7071 != null
		&& ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		class89.method1937((((Class444)
				     ((Class409) this).aClass444_5931)
				    .aClass241_Sub39_Sub2_6171),
				   1417332431 * (((Class444) (((Class409) this)
							      .aClass444_5931))
						 .anInt6167));
	}
    }
    
    public final void method7408(Class89 class89) {
	if (null != ((Class409) this).aClass549_5922.anIntArray7069
	    && method7367(1366174421)) {
	    class89.method1937((((Class444) ((Class409) this).aClass444_5917)
				.aClass241_Sub39_Sub2_6171),
			       1417332431 * (((Class444)
					      ((Class409) this).aClass444_5917)
					     .anInt6167));
	    if (((Class409) this).aBool5919
		&& ((Class409) this).aClass549_5922.anIntArray7071 != null
		&& ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		class89.method1937((((Class444)
				     ((Class409) this).aClass444_5931)
				    .aClass241_Sub39_Sub2_6171),
				   1417332431 * (((Class444) (((Class409) this)
							      .aClass444_5931))
						 .anInt6167));
	}
    }
    
    public final int method7409() {
	return -560831499 * ((Class409) this).anInt5924;
    }
    
    public final void method7410(int i, boolean bool) {
	method7351(i, 0, 0, bool, -1302211377);
    }
    
    public final boolean method7411(int i, byte i_39_) {
	if (null == ((Class409) this).aClass549_5922 || 0 == i)
	    return false;
	if (-560831499 * ((Class409) this).anInt5924 > 0) {
	    if (-560831499 * ((Class409) this).anInt5924 > i) {
		((Class409) this).anInt5924 -= i * 892137565;
		return false;
	    }
	    i -= -560831499 * ((Class409) this).anInt5924;
	    ((Class409) this).anInt5924 = 0;
	    method7366(((Class409) this).aClass549_5922,
		       -105753621 * ((Class409) this).anInt5929, 545888721);
	}
	i += 604859731 * ((Class409) this).anInt5921;
	boolean bool
	    = ((Class409) this).aClass549_5922.aBool7066 | AnimationDefinition.aBool7082;
	if (i > 100
	    && 1157848719 * ((Class409) this).aClass549_5922.anInt7075 > 0) {
	    int i_40_;
	    for (i_40_
		     = (((Class409) this).aClass549_5922.anIntArray7069.length
			- (1157848719
			   * ((Class409) this).aClass549_5922.anInt7075));
		 (-105753621 * ((Class409) this).anInt5929 < i_40_
		  && i > (((Class409) this).aClass549_5922.frameDurations
			  [((Class409) this).anInt5929 * -105753621]));
		 ((Class409) this).anInt5929 += -407028541)
		i -= (((Class409) this).aClass549_5922.frameDurations
		      [((Class409) this).anInt5929 * -105753621]);
	    if (((Class409) this).anInt5929 * -105753621 >= i_40_) {
		int i_41_ = 0;
		for (int i_42_ = i_40_;
		     i_42_ < (((Class409) this).aClass549_5922
			      .anIntArray7069).length;
		     i_42_++)
		    i_41_ += (((Class409) this).aClass549_5922.frameDurations
			      [i_42_]);
		if (0 == -2051337537 * ((Class409) this).anInt5928)
		    ((Class409) this).anInt5923 += i / i_41_ * 1714309981;
		i %= i_41_;
	    }
	    ((Class409) this).anInt5925
		= 2125839131 * ((Class409) this).anInt5929 + -1674126959;
	    if (-1696135311 * ((Class409) this).anInt5925
		>= ((Class409) this).aClass549_5922.anIntArray7069.length) {
		if ((1157848719 * ((Class409) this).aClass549_5922.anInt7075
		     == -1)
		    && ((Class409) this).aBool5927)
		    ((Class409) this).anInt5925 = 0;
		else
		    ((Class409) this).anInt5925
			-= (138003967
			    * ((Class409) this).aClass549_5922.anInt7075);
		if (-1696135311 * ((Class409) this).anInt5925 < 0
		    || (-1696135311 * ((Class409) this).anInt5925
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length))
		    ((Class409) this).anInt5925 = 1674126959;
	    }
	    bool = true;
	}
	while (i > (((Class409) this).aClass549_5922.frameDurations
		    [((Class409) this).anInt5929 * -105753621])) {
	    bool = true;
	    i -= (((Class409) this).aClass549_5922.frameDurations
		  [((((Class409) this).anInt5929 += -407028541) * -105753621
		    - 1)]);
	    if (((Class409) this).anInt5929 * -105753621
		>= ((Class409) this).aClass549_5922.anIntArray7069.length) {
		if ((1157848719 * ((Class409) this).aClass549_5922.anInt7075
		     != -1)
		    && 2 != ((Class409) this).anInt5928 * -2051337537) {
		    ((Class409) this).anInt5929
			-= (877497069
			    * ((Class409) this).aClass549_5922.anInt7075);
		    if (0 == ((Class409) this).anInt5928 * -2051337537)
			((Class409) this).anInt5923 += 1714309981;
		}
		if ((((Class409) this).anInt5923 * -1220845323
		     >= (-776253343
			 * ((Class409) this).aClass549_5922.anInt7079))
		    || -105753621 * ((Class409) this).anInt5929 < 0
		    || (-105753621 * ((Class409) this).anInt5929
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length)) {
		    ((Class409) this).aBool5926 = true;
		    break;
		}
	    }
	    method7366(((Class409) this).aClass549_5922,
		       -105753621 * ((Class409) this).anInt5929, 1356230691);
	    ((Class409) this).anInt5925
		= -1674126959 + 2125839131 * ((Class409) this).anInt5929;
	    if (((Class409) this).anInt5925 * -1696135311
		>= ((Class409) this).aClass549_5922.anIntArray7069.length) {
		if ((((Class409) this).aClass549_5922.anInt7075 * 1157848719
		     == -1)
		    && ((Class409) this).aBool5927)
		    ((Class409) this).anInt5925 = 0;
		else
		    ((Class409) this).anInt5925
			-= (138003967
			    * ((Class409) this).aClass549_5922.anInt7075);
		if (-1696135311 * ((Class409) this).anInt5925 < 0
		    || (-1696135311 * ((Class409) this).anInt5925
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length))
		    ((Class409) this).anInt5925 = 1674126959;
	    }
	}
	((Class409) this).anInt5921 = i * -783982885;
	if (bool)
	    method7368((byte) 80);
	return bool;
    }
    
    public final void method7412(int i) {
	((Class409) this).anInt5929 = 0;
	((Class409) this).anInt5925
	    = (((Class409) this).aClass549_5922.anIntArray7069.length > 1 ? 1
	       : -1) * -1674126959;
	((Class409) this).anInt5921 = 0;
	((Class409) this).aBool5926 = false;
	((Class409) this).anInt5924 = 892137565 * i;
	((Class409) this).anInt5923 = 0;
	if (null != ((Class409) this).aClass549_5922
	    & ((Class409) this).aClass549_5922.anIntArray7069 != null) {
	    method7366(((Class409) this).aClass549_5922,
		       -105753621 * ((Class409) this).anInt5929, 1772111022);
	    method7368((byte) -72);
	}
    }
    
    public final void method7413(Class89 class89, int i) {
	if (null != ((Class409) this).aClass549_5922) {
	    if (((Class409) this).aClass549_5922.anIntArray7069 != null
		&& method7367(1254346244)) {
		class89.method1879
		    ((((Class444) ((Class409) this).aClass444_5917)
		      .aClass241_Sub39_Sub2_6171),
		     (((Class444) ((Class409) this).aClass444_5917).anInt6167
		      * 1417332431),
		     (((Class444) ((Class409) this).aClass444_5917)
		      .aClass241_Sub39_Sub2_6170),
		     (((Class444) ((Class409) this).aClass444_5917).anInt6168
		      * -1124323391),
		     604859731 * ((Class409) this).anInt5921,
		     (((Class409) this).aClass549_5922.frameDurations
		      [-105753621 * ((Class409) this).anInt5929]),
		     i, ((Class409) this).aClass549_5922.aBool7083);
		if (((Class409) this).aBool5919
		    && ((Class409) this).aClass549_5922.anIntArray7071 != null
		    && ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		    class89.method1879
			((((Class444) ((Class409) this).aClass444_5931)
			  .aClass241_Sub39_Sub2_6171),
			 1417332431 * ((Class444) (((Class409) this)
						   .aClass444_5931)).anInt6167,
			 (((Class444) ((Class409) this).aClass444_5931)
			  .aClass241_Sub39_Sub2_6170),
			 (((Class444) ((Class409) this).aClass444_5931)
			  .anInt6168) * -1124323391,
			 604859731 * ((Class409) this).anInt5921,
			 (((Class409) this).aClass549_5922.frameDurations
			  [((Class409) this).anInt5929 * -105753621]),
			 i, ((Class409) this).aClass549_5922.aBool7083);
	    }
	}
    }
    
    public final void method7414() {
	method7353(0, (byte) -78);
    }
    
    public final void method7415() {
	method7353(0, (byte) -107);
    }
    
    public final void method7416(int i, boolean bool, byte i_43_) {
	method7351(i, 0, 0, bool, -1302211377);
    }
    
    public final boolean method7417(int i) {
	if (null == ((Class409) this).aClass549_5922 || 0 == i)
	    return false;
	if (-560831499 * ((Class409) this).anInt5924 > 0) {
	    if (-560831499 * ((Class409) this).anInt5924 > i) {
		((Class409) this).anInt5924 -= i * 892137565;
		return false;
	    }
	    i -= -560831499 * ((Class409) this).anInt5924;
	    ((Class409) this).anInt5924 = 0;
	    method7366(((Class409) this).aClass549_5922,
		       -105753621 * ((Class409) this).anInt5929, 1501806939);
	}
	i += 604859731 * ((Class409) this).anInt5921;
	boolean bool
	    = ((Class409) this).aClass549_5922.aBool7066 | AnimationDefinition.aBool7082;
	if (i > 100
	    && 1157848719 * ((Class409) this).aClass549_5922.anInt7075 > 0) {
	    int i_44_;
	    for (i_44_
		     = (((Class409) this).aClass549_5922.anIntArray7069.length
			- (1157848719
			   * ((Class409) this).aClass549_5922.anInt7075));
		 (-105753621 * ((Class409) this).anInt5929 < i_44_
		  && i > (((Class409) this).aClass549_5922.frameDurations
			  [((Class409) this).anInt5929 * -105753621]));
		 ((Class409) this).anInt5929 += -407028541)
		i -= (((Class409) this).aClass549_5922.frameDurations
		      [((Class409) this).anInt5929 * -105753621]);
	    if (((Class409) this).anInt5929 * -105753621 >= i_44_) {
		int i_45_ = 0;
		for (int i_46_ = i_44_;
		     i_46_ < (((Class409) this).aClass549_5922
			      .anIntArray7069).length;
		     i_46_++)
		    i_45_ += (((Class409) this).aClass549_5922.frameDurations
			      [i_46_]);
		if (0 == -2051337537 * ((Class409) this).anInt5928)
		    ((Class409) this).anInt5923 += i / i_45_ * 1714309981;
		i %= i_45_;
	    }
	    ((Class409) this).anInt5925
		= 2125839131 * ((Class409) this).anInt5929 + -1674126959;
	    if (-1696135311 * ((Class409) this).anInt5925
		>= ((Class409) this).aClass549_5922.anIntArray7069.length) {
		if ((1157848719 * ((Class409) this).aClass549_5922.anInt7075
		     == -1)
		    && ((Class409) this).aBool5927)
		    ((Class409) this).anInt5925 = 0;
		else
		    ((Class409) this).anInt5925
			-= (138003967
			    * ((Class409) this).aClass549_5922.anInt7075);
		if (-1696135311 * ((Class409) this).anInt5925 < 0
		    || (-1696135311 * ((Class409) this).anInt5925
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length))
		    ((Class409) this).anInt5925 = 1674126959;
	    }
	    bool = true;
	}
	while (i > (((Class409) this).aClass549_5922.frameDurations
		    [((Class409) this).anInt5929 * -105753621])) {
	    bool = true;
	    i -= (((Class409) this).aClass549_5922.frameDurations
		  [((((Class409) this).anInt5929 += -407028541) * -105753621
		    - 1)]);
	    if (((Class409) this).anInt5929 * -105753621
		>= ((Class409) this).aClass549_5922.anIntArray7069.length) {
		if ((1157848719 * ((Class409) this).aClass549_5922.anInt7075
		     != -1)
		    && 2 != ((Class409) this).anInt5928 * -2051337537) {
		    ((Class409) this).anInt5929
			-= (877497069
			    * ((Class409) this).aClass549_5922.anInt7075);
		    if (0 == ((Class409) this).anInt5928 * -2051337537)
			((Class409) this).anInt5923 += 1714309981;
		}
		if ((((Class409) this).anInt5923 * -1220845323
		     >= (-776253343
			 * ((Class409) this).aClass549_5922.anInt7079))
		    || -105753621 * ((Class409) this).anInt5929 < 0
		    || (-105753621 * ((Class409) this).anInt5929
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length)) {
		    ((Class409) this).aBool5926 = true;
		    break;
		}
	    }
	    method7366(((Class409) this).aClass549_5922,
		       -105753621 * ((Class409) this).anInt5929, 694096859);
	    ((Class409) this).anInt5925
		= -1674126959 + 2125839131 * ((Class409) this).anInt5929;
	    if (((Class409) this).anInt5925 * -1696135311
		>= ((Class409) this).aClass549_5922.anIntArray7069.length) {
		if ((((Class409) this).aClass549_5922.anInt7075 * 1157848719
		     == -1)
		    && ((Class409) this).aBool5927)
		    ((Class409) this).anInt5925 = 0;
		else
		    ((Class409) this).anInt5925
			-= (138003967
			    * ((Class409) this).aClass549_5922.anInt7075);
		if (-1696135311 * ((Class409) this).anInt5925 < 0
		    || (-1696135311 * ((Class409) this).anInt5925
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length))
		    ((Class409) this).anInt5925 = 1674126959;
	    }
	}
	((Class409) this).anInt5921 = i * -783982885;
	if (bool)
	    method7368((byte) -20);
	return bool;
    }
    
    public final boolean method7418(int i) {
	if (null == ((Class409) this).aClass549_5922 || 0 == i)
	    return false;
	if (-560831499 * ((Class409) this).anInt5924 > 0) {
	    if (-560831499 * ((Class409) this).anInt5924 > i) {
		((Class409) this).anInt5924 -= i * 892137565;
		return false;
	    }
	    i -= -560831499 * ((Class409) this).anInt5924;
	    ((Class409) this).anInt5924 = 0;
	    method7366(((Class409) this).aClass549_5922,
		       -105753621 * ((Class409) this).anInt5929, 957433351);
	}
	i += 604859731 * ((Class409) this).anInt5921;
	boolean bool
	    = ((Class409) this).aClass549_5922.aBool7066 | AnimationDefinition.aBool7082;
	if (i > 100
	    && 1157848719 * ((Class409) this).aClass549_5922.anInt7075 > 0) {
	    int i_47_;
	    for (i_47_
		     = (((Class409) this).aClass549_5922.anIntArray7069.length
			- (1157848719
			   * ((Class409) this).aClass549_5922.anInt7075));
		 (-105753621 * ((Class409) this).anInt5929 < i_47_
		  && i > (((Class409) this).aClass549_5922.frameDurations
			  [((Class409) this).anInt5929 * -105753621]));
		 ((Class409) this).anInt5929 += -407028541)
		i -= (((Class409) this).aClass549_5922.frameDurations
		      [((Class409) this).anInt5929 * -105753621]);
	    if (((Class409) this).anInt5929 * -105753621 >= i_47_) {
		int i_48_ = 0;
		for (int i_49_ = i_47_;
		     i_49_ < (((Class409) this).aClass549_5922
			      .anIntArray7069).length;
		     i_49_++)
		    i_48_ += (((Class409) this).aClass549_5922.frameDurations
			      [i_49_]);
		if (0 == -2051337537 * ((Class409) this).anInt5928)
		    ((Class409) this).anInt5923 += i / i_48_ * 1714309981;
		i %= i_48_;
	    }
	    ((Class409) this).anInt5925
		= 2125839131 * ((Class409) this).anInt5929 + -1674126959;
	    if (-1696135311 * ((Class409) this).anInt5925
		>= ((Class409) this).aClass549_5922.anIntArray7069.length) {
		if ((1157848719 * ((Class409) this).aClass549_5922.anInt7075
		     == -1)
		    && ((Class409) this).aBool5927)
		    ((Class409) this).anInt5925 = 0;
		else
		    ((Class409) this).anInt5925
			-= (138003967
			    * ((Class409) this).aClass549_5922.anInt7075);
		if (-1696135311 * ((Class409) this).anInt5925 < 0
		    || (-1696135311 * ((Class409) this).anInt5925
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length))
		    ((Class409) this).anInt5925 = 1674126959;
	    }
	    bool = true;
	}
	while (i > (((Class409) this).aClass549_5922.frameDurations
		    [((Class409) this).anInt5929 * -105753621])) {
	    bool = true;
	    i -= (((Class409) this).aClass549_5922.frameDurations
		  [((((Class409) this).anInt5929 += -407028541) * -105753621
		    - 1)]);
	    if (((Class409) this).anInt5929 * -105753621
		>= ((Class409) this).aClass549_5922.anIntArray7069.length) {
		if ((1157848719 * ((Class409) this).aClass549_5922.anInt7075
		     != -1)
		    && 2 != ((Class409) this).anInt5928 * -2051337537) {
		    ((Class409) this).anInt5929
			-= (877497069
			    * ((Class409) this).aClass549_5922.anInt7075);
		    if (0 == ((Class409) this).anInt5928 * -2051337537)
			((Class409) this).anInt5923 += 1714309981;
		}
		if ((((Class409) this).anInt5923 * -1220845323
		     >= (-776253343
			 * ((Class409) this).aClass549_5922.anInt7079))
		    || -105753621 * ((Class409) this).anInt5929 < 0
		    || (-105753621 * ((Class409) this).anInt5929
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length)) {
		    ((Class409) this).aBool5926 = true;
		    break;
		}
	    }
	    method7366(((Class409) this).aClass549_5922,
		       -105753621 * ((Class409) this).anInt5929, 132620535);
	    ((Class409) this).anInt5925
		= -1674126959 + 2125839131 * ((Class409) this).anInt5929;
	    if (((Class409) this).anInt5925 * -1696135311
		>= ((Class409) this).aClass549_5922.anIntArray7069.length) {
		if ((((Class409) this).aClass549_5922.anInt7075 * 1157848719
		     == -1)
		    && ((Class409) this).aBool5927)
		    ((Class409) this).anInt5925 = 0;
		else
		    ((Class409) this).anInt5925
			-= (138003967
			    * ((Class409) this).aClass549_5922.anInt7075);
		if (-1696135311 * ((Class409) this).anInt5925 < 0
		    || (-1696135311 * ((Class409) this).anInt5925
			>= (((Class409) this).aClass549_5922
			    .anIntArray7069).length))
		    ((Class409) this).anInt5925 = 1674126959;
	    }
	}
	((Class409) this).anInt5921 = i * -783982885;
	if (bool)
	    method7368((byte) -38);
	return bool;
    }
    
    public final boolean method7419(byte i) {
	return ((Class409) this).aBool5926;
    }
    
    public final void method7420(Class409 class409_50_, int i) {
	((Class409) this).aClass549_5922
	    = ((Class409) class409_50_).aClass549_5922;
	((Class409) this).aBool5926 = ((Class409) class409_50_).aBool5926;
	((Class409) this).aBool5919 = ((Class409) class409_50_).aBool5919;
	((Class409) this).anInt5924 = ((Class409) class409_50_).anInt5924 * 1;
	((Class409) this).anInt5923 = ((Class409) class409_50_).anInt5923 * 1;
	((Class409) this).anInt5929 = 1 * ((Class409) class409_50_).anInt5929;
	((Class409) this).anInt5925 = 1 * ((Class409) class409_50_).anInt5925;
	((Class409) this).anInt5921 = ((Class409) class409_50_).anInt5921 * 1;
	method7368((byte) 49);
    }
    
    final boolean method7421() {
	if (null != ((Class409) this).aClass549_5922) {
	    boolean bool = (((Class409) this).aClass444_5917.method7873
			    (VarBasicType.aClass556_9995,
			     ((Class409) this).aClass549_5922,
			     ((Class409) this).anInt5929 * -105753621,
			     ((Class409) this).anInt5925 * -1696135311,
			     ((Class409) this).aClass549_5922.anIntArray7069,
			     1567695691));
	    if (bool && ((Class409) this).aBool5919
		&& null != ((Class409) this).aClass549_5922.anIntArray7071)
		((Class409) this).aClass444_5931.method7873
		    (VarBasicType.aClass556_9995,
		     ((Class409) this).aClass549_5922,
		     ((Class409) this).anInt5929 * -105753621,
		     -1696135311 * ((Class409) this).anInt5925,
		     ((Class409) this).aClass549_5922.anIntArray7071,
		     719344457);
	    return bool;
	}
	return false;
    }
    
    final boolean method7422() {
	if (null != ((Class409) this).aClass549_5922) {
	    boolean bool = (((Class409) this).aClass444_5917.method7873
			    (VarBasicType.aClass556_9995,
			     ((Class409) this).aClass549_5922,
			     ((Class409) this).anInt5929 * -105753621,
			     ((Class409) this).anInt5925 * -1696135311,
			     ((Class409) this).aClass549_5922.anIntArray7069,
			     1774339167));
	    if (bool && ((Class409) this).aBool5919
		&& null != ((Class409) this).aClass549_5922.anIntArray7071)
		((Class409) this).aClass444_5931.method7873
		    (VarBasicType.aClass556_9995,
		     ((Class409) this).aClass549_5922,
		     ((Class409) this).anInt5929 * -105753621,
		     -1696135311 * ((Class409) this).anInt5925,
		     ((Class409) this).aClass549_5922.anIntArray7071,
		     1477615123);
	    return bool;
	}
	return false;
    }
    
    final boolean method7423() {
	if (null != ((Class409) this).aClass549_5922) {
	    boolean bool = (((Class409) this).aClass444_5917.method7873
			    (VarBasicType.aClass556_9995,
			     ((Class409) this).aClass549_5922,
			     ((Class409) this).anInt5929 * -105753621,
			     ((Class409) this).anInt5925 * -1696135311,
			     ((Class409) this).aClass549_5922.anIntArray7069,
			     870273522));
	    if (bool && ((Class409) this).aBool5919
		&& null != ((Class409) this).aClass549_5922.anIntArray7071)
		((Class409) this).aClass444_5931.method7873
		    (VarBasicType.aClass556_9995,
		     ((Class409) this).aClass549_5922,
		     ((Class409) this).anInt5929 * -105753621,
		     -1696135311 * ((Class409) this).anInt5925,
		     ((Class409) this).aClass549_5922.anIntArray7071,
		     1755983049);
	    return bool;
	}
	return false;
    }
    
    final void method7424() {
	((Class409) this).aClass444_5917.method7877((byte) 1);
	if (((Class409) this).aBool5919)
	    ((Class409) this).aClass444_5931.method7877((byte) 1);
    }
    
    public final void method7425(Class89 class89, int i, int i_51_) {
	if (((Class409) this).aClass549_5922.anIntArray7069 != null
	    && method7367(97110759)) {
	    class89.method2008((((Class444) ((Class409) this).aClass444_5917)
				.aClass241_Sub39_Sub2_6171),
			       (((Class444) ((Class409) this).aClass444_5917)
				.anInt6167) * 1417332431,
			       (((Class444) ((Class409) this).aClass444_5917)
				.aClass241_Sub39_Sub2_6170),
			       (((Class444) ((Class409) this).aClass444_5917)
				.anInt6168) * -1124323391,
			       ((Class409) this).anInt5921 * 604859731,
			       (((Class409) this).aClass549_5922.frameDurations
				[-105753621 * ((Class409) this).anInt5929]),
			       i, i_51_,
			       ((Class409) this).aClass549_5922.aBool7083,
			       null);
	    if (((Class409) this).aBool5919
		&& null != ((Class409) this).aClass549_5922.anIntArray7071
		&& ((Class444) ((Class409) this).aClass444_5931).aBool6166)
		class89.method2008
		    ((((Class444) ((Class409) this).aClass444_5931)
		      .aClass241_Sub39_Sub2_6171),
		     1417332431 * ((Class444)
				   ((Class409) this).aClass444_5931).anInt6167,
		     (((Class444) ((Class409) this).aClass444_5931)
		      .aClass241_Sub39_Sub2_6170),
		     -1124323391 * ((Class444) (((Class409) this)
						.aClass444_5931)).anInt6168,
		     604859731 * ((Class409) this).anInt5921,
		     (((Class409) this).aClass549_5922.frameDurations
		      [-105753621 * ((Class409) this).anInt5929]),
		     i, i_51_, ((Class409) this).aClass549_5922.aBool7083,
		     null);
	}
    }
    
    final void method7426() {
	((Class409) this).aClass444_5917.method7877((byte) 1);
	if (((Class409) this).aBool5919)
	    ((Class409) this).aClass444_5931.method7877((byte) 1);
    }
    
    static final void method7427(Class103 class103, int i, int i_52_,
				 int i_53_, int i_54_, int i_55_) {
	class103.method2445(i, i_52_, i_53_ + i, i_52_ + i_54_);
	class103.method2263(i, i_52_, i_53_, i_54_, -16777216, (byte) -10);
	if (-16261253 * Class573_Sub1.anInt8787 >= 100) {
	    float f = ((float) Class573_Sub1.anInt7391
		       / (float) Class573_Sub1.anInt7390);
	    int i_56_ = i_53_;
	    int i_57_ = i_54_;
	    if (f < 1.0F)
		i_57_ = (int) (f * (float) i_53_);
	    else
		i_56_ = (int) ((float) i_54_ / f);
	    i += (i_53_ - i_56_) / 2;
	    i_52_ += (i_54_ - i_57_) / 2;
	    if (Class117.aClass168_1554 == null
		|| Class117.aClass168_1554.method3631() != i_56_
		|| Class117.aClass168_1554.method3606() != i_57_) {
		Class573_Sub1.aClass129_7414 = Class573_Sub1.aClass129_7413;
		Class573_Sub1.method12569(Class573_Sub1.anInt7388,
					  (Class573_Sub1.anInt7391
					   + Class573_Sub1.anInt7389),
					  (Class573_Sub1.anInt7390
					   + Class573_Sub1.anInt7388),
					  Class573_Sub1.anInt7389, i, i_52_,
					  i_56_ + i, i_52_ + i_57_);
		Class573_Sub1.method12570(class103, false, false,
					  client.isP2pWorld, true);
		class103.method2291();
		Class117.aClass168_1554
		    = class103.method2290(i, i_52_, i_56_, i_57_, true);
	    }
	    Class117.aClass168_1554.method3646(i, i_52_);
	    int i_58_ = (Class483.anInt6462 * 1010648373 * i_56_
			 / Class573_Sub1.anInt7390);
	    int i_59_ = (-928895085 * Class583.anInt7583 * i_57_
			 / Class573_Sub1.anInt7391);
	    int i_60_ = ((-884090275 * Class544.anInt7049 * i_56_
			  / Class573_Sub1.anInt7390)
			 + i);
	    int i_61_ = i_52_ + i_57_ - (Class545.anInt7050 * 686934559 * i_57_
					 / Class573_Sub1.anInt7391) - i_59_;
	    int i_62_ = -1996554240;
	    if (client.currentGame == GameDefinition.STELLARDAWN)
		i_62_ = -1996488705;
	    class103.method2396(i_60_, i_61_, i_58_, i_59_, i_62_, 1);
	    class103.method2268(i_60_, i_61_, i_58_, i_59_, i_62_, 0);
	    for (Class241_Sub41 class241_sub41
		     = ((Class241_Sub41)
			Class573_Sub1.aClass429_7387.method7694(16711935));
		 class241_sub41 != null;
		 class241_sub41
		     = ((Class241_Sub41)
			Class573_Sub1.aClass429_7387.method7692(1336058905))) {
		Class515 class515
		    = (Class573_Sub1.aClass524_7370.method11745
		       (-1454932011 * class241_sub41.anInt10158, 1261525392));
		if (Class241_Sub16.method15018(class515, 644883205)) {
		    Class2 class2
			= ((Class2)
			   (Class573_Sub1.aHashMap8781.get
			    (Integer.valueOf(-1454932011
					     * class241_sub41.anInt10158))));
		    if (null == class2)
			class2 = (Class2) (Class573_Sub1.aHashMap8766.get
					   (Integer.valueOf(class515.anInt6770
							    * -1123109927)));
		    if (null != class2) {
			int i_63_;
			if (-1866104785 * ((Class2) class2).anInt13
			    > Class573_Sub1.anInt8785 * 881484909 / 2)
			    i_63_ = ((Class573_Sub1.anInt8785 * 1440352403
				      - 884649681 * ((Class2) class2).anInt13)
				     / (881484909 * Class573_Sub1.anInt8785));
			else
			    i_63_ = (((Class2) class2).anInt13 * 884649681
				     / (Class573_Sub1.anInt8785 * 881484909));
			int i_64_
			    = i + (i_56_
				   * (class241_sub41.anInt10154 * 669485685)
				   / Class573_Sub1.anInt7390);
			int i_65_
			    = (((Class573_Sub1.anInt7391
				 - class241_sub41.anInt10152 * -1535798317)
				* i_57_ / Class573_Sub1.anInt7391)
			       + i_52_);
			class103.method2263(i_64_ - 2, i_65_ - 2, 4, 4,
					    i_63_ << 24 | 0xffff00,
					    (byte) -39);
		    }
		}
	    }
	    Class573_Sub1.aClass129_7413.clean(5, -2139388518);
	}
    }
    
    static String getContextMenuOption/*method7428*/(InterfaceComponent component, int menuIdx, byte i_66_) {
		if (!client.method13624(component).method15039(menuIdx, 65280)
				&& component.onContextMenuSelect == null) {
		    return null;
		}
		if (component.contextMenuOptions == null
				|| component.contextMenuOptions.length <= menuIdx
				|| null == component.contextMenuOptions[menuIdx]
				|| component.contextMenuOptions[menuIdx].trim().length() == 0) {
		    if (client.aBool8403) {
		    	return new StringBuilder().append("Hidden-").append(menuIdx).toString();
		    }
		    return null;
		}
		return component.contextMenuOptions[menuIdx];
    }
}
