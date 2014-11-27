/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class86
{
    public int anInt1251;
    public int anInt1252;
    public int anInt1253;
    int anInt1254;
    public int anInt1255;
    public int anInt1256;
    public int anInt1257;
    static LoadingScreenDef currentLoadingStage;//aClass359_1258
    
    public boolean method1848(Class86 class86_0_) {
	return (1897985763 * anInt1251 == 1897985763 * class86_0_.anInt1251
		&& (anInt1252 * -1282025259
		    == class86_0_.anInt1252 * -1282025259)
		&& anInt1253 * 642800105 == class86_0_.anInt1253 * 642800105
		&& (((Class86) class86_0_).anInt1254 * 2116256207
		    == 2116256207 * ((Class86) this).anInt1254)
		&& anInt1255 * -449077211 == class86_0_.anInt1255 * -449077211
		&& (-1432134215 * anInt1256
		    == class86_0_.anInt1256 * -1432134215)
		&& (-235993003 * anInt1257
		    == class86_0_.anInt1257 * -235993003));
    }
    
    public Class86() {
	/* empty */
    }
    
    public boolean method1849(Class86 class86_1_, int i) {
	return (1897985763 * anInt1251 == 1897985763 * class86_1_.anInt1251
		&& (anInt1252 * -1282025259
		    == class86_1_.anInt1252 * -1282025259)
		&& anInt1253 * 642800105 == class86_1_.anInt1253 * 642800105
		&& (((Class86) class86_1_).anInt1254 * 2116256207
		    == 2116256207 * ((Class86) this).anInt1254)
		&& anInt1255 * -449077211 == class86_1_.anInt1255 * -449077211
		&& (-1432134215 * anInt1256
		    == class86_1_.anInt1256 * -1432134215)
		&& (-235993003 * anInt1257
		    == class86_1_.anInt1257 * -235993003));
    }
    
    public Class86(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
		   int i_7_) {
	anInt1251 = i * 271449803;
	anInt1252 = 789618813 * i_2_;
	anInt1253 = i_3_ * -2110386599;
	((Class86) this).anInt1254 = -300686033 * i_4_;
	anInt1255 = i_5_ * -456688723;
	anInt1256 = i_6_ * 1423284361;
	anInt1257 = i_7_ * 1044755709;
    }
    
    public static void method1850(int i) {
	Class271.anInt4361 = 0;
	Class271.anInt4360 = 0;
    }
    
    static final void method1851(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	Class562.method12379(class58, class454, (byte) 0);
    }
    
    public static Class326 method1852(RSByteBuffer class241_sub3, int i) {
	Class326_Sub1 class326_sub1
	    = (Class326_Sub1) Class133.method3089(class241_sub3, -2086288329);
	int i_8_ = class241_sub3.readShort((byte) 91);
	return new Class326_Sub1_Sub1(class326_sub1.aClass330_5008,
				      class326_sub1.aClass324_5007,
				      601610705 * class326_sub1.anInt5014,
				      class326_sub1.anInt5009 * -942384019,
				      -664032457 * class326_sub1.anInt5006,
				      class326_sub1.anInt5011 * 524993587,
				      class326_sub1.anInt5012 * -305994951,
				      -2074180427 * class326_sub1.anInt5013,
				      -401483607 * class326_sub1.anInt5010,
				      class326_sub1.anInt10202 * 860023435,
				      class326_sub1.anInt10201 * 1154655587,
				      class326_sub1.anInt10200 * -393748375,
				      -1457812133 * class326_sub1.anInt10198,
				      750680363 * class326_sub1.anInt10203,
				      class326_sub1.anInt10199 * -644451775,
				      i_8_);
    }
    
    static final void method1853(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class24.method929(class58, class35, class454, (byte) 106);
    }
}
