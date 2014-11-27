/* Class241_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class241_Sub2 extends Node
{
    protected static final int anInt8719 = 4095;
    protected static final int anInt8720 = 4096;
    protected static final int anInt8721 = 8192;
    protected static final int anInt8722 = 2048;
    public static final float aFloat8723 = 4096.0F;
    protected static final int anInt8724 = 12;
    
    Class241_Sub2(int i, boolean bool) {
	/* empty */
    }
    
    static Class71[] method14415(int i) {
	return new Class71[] { Class71.aClass71_1088, Class71.aClass71_1091,
			       Class71.aClass71_1089, Class71.aClass71_1090,
			       Class71.aClass71_1092 };
    }
    
    static void method14416(Class103 class103, int i) {
	int i_0_ = -10660793;
	Class410.method7456(class103, 1011088115 * Class16.anInt156,
			    Class380.anInt5660 * 904064679,
			    Class593.anInt7631 * 1139603851,
			    630071575 * LoadingScreenDef.anInt5500, i_0_, -16777216,
			    (byte) 60);
	Class81.aClass96_1149.method2128
	    (ClientMessage.CHOOSEOPTION.getLocalisedMessage(VarPlayerDomain.currentLocale,
						 (short) 21830),
	     1011088115 * Class16.anInt156 + 3,
	     14 + Class380.anInt5660 * 904064679, i_0_, -1, 1841717961);
	int i_1_ = Class106.aClass580_1503.method12718(105549568);
	int i_2_ = Class106.aClass580_1503.method12740((byte) -55);
	if (!Class16.aBool171) {
	    int i_3_ = 0;
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			Class16.aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			Class16.aClass429_150.method7692(830958568))) {
		int i_4_ = (31 + 904064679 * Class380.anInt5660
			    + ((Class16.anInt148 * 1327183635 - 1 - i_3_)
			       * (Class16.anInt164 * 1149989507)));
		Class338.method6113(i_1_, i_2_, Class16.anInt156 * 1011088115,
				    904064679 * Class380.anInt5660,
				    1139603851 * Class593.anInt7631,
				    630071575 * LoadingScreenDef.anInt5500, i_4_,
				    class241_sub39_sub11,
				    Class81.aClass96_1149, Class5.aClass639_19,
				    -1, -256, 1867858700);
		i_3_++;
	    }
	} else {
	    int i_5_ = 0;
	    for (Class241_Sub39_Sub10 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			Class16.aClass410_152.method7440(-1397088259));
		 class241_sub39_sub10 != null;
		 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			Class16.aClass410_152.method7435((byte) -1))) {
		int i_6_ = (Class380.anInt5660 * 904064679 + 31
			    + i_5_ * (Class16.anInt164 * 1149989507));
		if (1633676605 * (((Class241_Sub39_Sub10) class241_sub39_sub10)
				  .anInt10867)
		    == 1)
		    Class338.method6113(i_1_, i_2_,
					1011088115 * Class16.anInt156,
					Class380.anInt5660 * 904064679,
					Class593.anInt7631 * 1139603851,
					630071575 * LoadingScreenDef.anInt5500, i_6_,
					((Class241_Sub39_Sub11)
					 (((Class241_Sub39_Sub10)
					   class241_sub39_sub10)
					  .aClass410_10866.aClass241_Sub39_5934
					  .aClass241_Sub39_10148)),
					Class81.aClass96_1149,
					Class5.aClass639_19, -1, -256,
					1447140079);
		else
		    Class544.method11985(i_1_, i_2_,
					 Class16.anInt156 * 1011088115,
					 Class380.anInt5660 * 904064679,
					 Class593.anInt7631 * 1139603851,
					 630071575 * LoadingScreenDef.anInt5500, i_6_,
					 class241_sub39_sub10,
					 Class81.aClass96_1149,
					 Class5.aClass639_19, -1, -256,
					 -1823088018);
		i_5_++;
	    }
	    if (null != Class16.aClass241_Sub39_Sub10_143) {
		Class410.method7456(class103, Class193.anInt2298 * 1955430821,
				    282057643 * Class4.anInt16,
				    -885853667 * Class16.anInt147,
				    -950722911 * Class395.anInt5784, i_0_,
				    -16777216, (byte) 91);
		Class81.aClass96_1149.method2128
		    (((Class241_Sub39_Sub10)
		      Class16.aClass241_Sub39_Sub10_143).aString10865,
		     3 + 1955430821 * Class193.anInt2298,
		     14 + Class4.anInt16 * 282057643, i_0_, -1, 1841717961);
		i_5_ = 0;
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10)
			     Class16.aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7440(-1397088259));
		     null != class241_sub39_sub11;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10)
			     Class16.aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7435((byte) -1))) {
		    int i_7_ = (31 + 282057643 * Class4.anInt16
				+ 1149989507 * Class16.anInt164 * i_5_);
		    Class338.method6113(i_1_, i_2_,
					Class193.anInt2298 * 1955430821,
					282057643 * Class4.anInt16,
					Class16.anInt147 * -885853667,
					-950722911 * Class395.anInt5784, i_7_,
					class241_sub39_sub11,
					Class81.aClass96_1149,
					Class5.aClass639_19, -1, -256,
					610933720);
		    i_5_++;
		}
	    }
	}
    }
}
