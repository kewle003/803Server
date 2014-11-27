/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class144
{
    static final int anInt1675 = 16;
    static final int anInt1676 = 4000;
    static final int anInt1677 = 128;
    Class142_Sub3 aClass142_Sub3_1678;
    boolean aBool1679;
    Class142_Sub4[] aClass142_Sub4Array1680 = null;
    static final int anInt1681 = 128;
    Class142_Sub4[] aClass142_Sub4Array1682;
    Class142_Sub3 aClass142_Sub3_1683;
    Class142_Sub3 aClass142_Sub3_1684 = null;
    static Object anObject1685;
    static Object anObject1686;
    static Object anObject1687;
    
    static void method3208(Class103_Sub1 class103_sub1) {
	if (anObject1685 == null) {
	    Class347_Sub2_Sub1 class347_sub2_sub1 = new Class347_Sub2_Sub1();
	    byte[] is = class347_sub2_sub1.method17424(128, 128, 16);
	    anObject1685
		= ChatLine.method17107(is, false, -1365546174);
	}
	if (anObject1686 == null) {
	    Class347_Sub1_Sub2 class347_sub1_sub2 = new Class347_Sub1_Sub2();
	    byte[] is = class347_sub1_sub2.method17534(128, 128, 16);
	    anObject1686
		= ChatLine.method17107(is, false, -619193058);
	}
	Class181 class181 = ((Class103_Sub1) class103_sub1).aClass181_9135;
	if (class181.method3779() && anObject1687 == null) {
	    byte[] is = Class587.method12858(128, 128, 16, 8,
					     new Class586_Sub1(419684), 4.0F,
					     4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1687
		= ChatLine.method17107(is, false, -1254283690);
	}
    }
    
    Class144(Class103_Sub1 class103_sub1) {
	((Class144) this).aClass142_Sub4Array1682 = null;
	((Class144) this).aClass142_Sub3_1683 = null;
	((Class144) this).aClass142_Sub3_1678 = null;
	((Class144) this).aBool1679
	    = ((Class103_Sub1) class103_sub1).aBool9208;
	method3209(class103_sub1);
	if (!((Class144) this).aBool1679) {
	    ((Class144) this).aClass142_Sub4Array1680 = new Class142_Sub4[16];
	    for (int i = 0; i < 16; i++) {
		byte[] is = Class380.method6881(anObject1685, i * 32768, 32768,
						1679943959);
		((Class144) this).aClass142_Sub4Array1680[i]
		    = new Class142_Sub4(class103_sub1, 3553,
					Class175.aClass175_2114,
					Class102.aClass102_1440, 128, 128,
					true, is, Class175.aClass175_2114,
					false);
	    }
	    ((Class144) this).aClass142_Sub4Array1682 = new Class142_Sub4[16];
	    for (int i = 0; i < 16; i++) {
		byte[] is = Class380.method6881(anObject1686, i * 32768, 32768,
						1679943959);
		((Class144) this).aClass142_Sub4Array1682[i]
		    = new Class142_Sub4(class103_sub1, 3553,
					Class175.aClass175_2114,
					Class102.aClass102_1440, 128, 128,
					true, is, Class175.aClass175_2114,
					false);
	    }
	} else {
	    byte[] is = Class445.method7894(anObject1685, false, -284932600);
	    ((Class144) this).aClass142_Sub3_1684
		= new Class142_Sub3(class103_sub1, Class175.aClass175_2114,
				    Class102.aClass102_1440, 128, 128, 16, is,
				    Class175.aClass175_2114);
	    is = Class445.method7894(anObject1686, false, -284932600);
	    ((Class144) this).aClass142_Sub3_1683
		= new Class142_Sub3(class103_sub1, Class175.aClass175_2114,
				    Class102.aClass102_1440, 128, 128, 16, is,
				    Class175.aClass175_2114);
	    Class181 class181 = ((Class103_Sub1) class103_sub1).aClass181_9135;
	    if (class181.method3779()) {
		is = Class445.method7894(anObject1687, false, -284932600);
		((Class144) this).aClass142_Sub3_1678
		    = new Class142_Sub3(class103_sub1, Class175.aClass175_2110,
					Class102.aClass102_1440, 128, 128, 16);
		Class142_Sub3 class142_sub3
		    = new Class142_Sub3(class103_sub1, Class175.aClass175_2116,
					Class102.aClass102_1440, 128, 128, 16,
					is, Class175.aClass175_2116);
		if (!class181.method3775(((Class144) this).aClass142_Sub3_1678,
					 class142_sub3, 2.0F)) {
		    ((Class144) this).aClass142_Sub3_1678.method3173();
		    ((Class144) this).aClass142_Sub3_1678 = null;
		} else
		    ((Class144) this).aClass142_Sub3_1678.method3169();
		class142_sub3.method3173();
	    }
	}
    }
    
    static void method3209(Class103_Sub1 class103_sub1) {
	if (anObject1685 == null) {
	    Class347_Sub2_Sub1 class347_sub2_sub1 = new Class347_Sub2_Sub1();
	    byte[] is = class347_sub2_sub1.method17424(128, 128, 16);
	    anObject1685
		= ChatLine.method17107(is, false, -1528013781);
	}
	if (anObject1686 == null) {
	    Class347_Sub1_Sub2 class347_sub1_sub2 = new Class347_Sub1_Sub2();
	    byte[] is = class347_sub1_sub2.method17534(128, 128, 16);
	    anObject1686
		= ChatLine.method17107(is, false, -1196239030);
	}
	Class181 class181 = ((Class103_Sub1) class103_sub1).aClass181_9135;
	if (class181.method3779() && anObject1687 == null) {
	    byte[] is = Class587.method12858(128, 128, 16, 8,
					     new Class586_Sub1(419684), 4.0F,
					     4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1687
		= ChatLine.method17107(is, false, -1170232522);
	}
    }
    
    static void method3210(Class103_Sub1 class103_sub1) {
	if (anObject1685 == null) {
	    Class347_Sub2_Sub1 class347_sub2_sub1 = new Class347_Sub2_Sub1();
	    byte[] is = class347_sub2_sub1.method17424(128, 128, 16);
	    anObject1685
		= ChatLine.method17107(is, false, -1160289766);
	}
	if (anObject1686 == null) {
	    Class347_Sub1_Sub2 class347_sub1_sub2 = new Class347_Sub1_Sub2();
	    byte[] is = class347_sub1_sub2.method17534(128, 128, 16);
	    anObject1686
		= ChatLine.method17107(is, false, -1899897402);
	}
	Class181 class181 = ((Class103_Sub1) class103_sub1).aClass181_9135;
	if (class181.method3779() && anObject1687 == null) {
	    byte[] is = Class587.method12858(128, 128, 16, 8,
					     new Class586_Sub1(419684), 4.0F,
					     4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1687
		= ChatLine.method17107(is, false, -1736441347);
	}
    }
    
    static void method3211(Class103_Sub1 class103_sub1) {
	if (anObject1685 == null) {
	    Class347_Sub2_Sub1 class347_sub2_sub1 = new Class347_Sub2_Sub1();
	    byte[] is = class347_sub2_sub1.method17424(128, 128, 16);
	    anObject1685
		= ChatLine.method17107(is, false, -1105163508);
	}
	if (anObject1686 == null) {
	    Class347_Sub1_Sub2 class347_sub1_sub2 = new Class347_Sub1_Sub2();
	    byte[] is = class347_sub1_sub2.method17534(128, 128, 16);
	    anObject1686
		= ChatLine.method17107(is, false, -1382549529);
	}
	Class181 class181 = ((Class103_Sub1) class103_sub1).aClass181_9135;
	if (class181.method3779() && anObject1687 == null) {
	    byte[] is = Class587.method12858(128, 128, 16, 8,
					     new Class586_Sub1(419684), 4.0F,
					     4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1687
		= ChatLine.method17107(is, false, -1946353678);
	}
    }
}
