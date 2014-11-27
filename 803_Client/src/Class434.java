/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class434
{
    Class351 aClass351_6119;
    static int anInt6120;
    
    public abstract void method7750(Class79 class79, Class266 class266, int i,
				    int i_0_, float f);
    
    Class434(Class351 class351) {
	((Class434) this).aClass351_6119 = class351;
    }
    
    public abstract void method7751(float f, byte i);
    
    public abstract Class287 method7752();
    
    public abstract Class287 method7753(short i);
    
    public abstract void method7754(Class79 class79, Class266 class266, int i,
				    int i_1_, float f, int i_2_);
    
    public abstract void method7755(RSByteBuffer class241_sub3, int i);
    
    public abstract void method7756(RSByteBuffer class241_sub3);
    
    public abstract void method7757(float f);
    
    public abstract boolean method7758();
    
    public abstract boolean method7759();
    
    public abstract void method7760(Class79 class79, Class266 class266, int i,
				    int i_3_, float f);
    
    public abstract void method7761(float f);
    
    public abstract boolean method7762(int i);
    
    public abstract Class287 method7763();
    
    public abstract void method7764(RSByteBuffer class241_sub3);
    
    public abstract Class287 method7765();
    
    public abstract Class287 method7766();
    
    public abstract Class287 method7767(byte i);
    
    public abstract Class287 method7768();
    
    public abstract Class287 method7769();
    
    static final void method7770(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1) ? 1 : 0,
	     (byte) 2);
	Class167.method3600((short) -7468);
	client.aBool8297 = false;
    }
    
    static void method7771(Class103 class103, InterfaceComponent class58, int i) {
	boolean bool
	    = ((JS5.itemDefLoader.method13296
		(class103, class58.slot2 * 877329925,
		 1809275135 * class58.anInt975, -980602175 * class58.anInt872,
		 ~0xffffff | class58.anInt881 * 1143403757,
		 -1412069699 * class58.anInt895,
		 (class58.aBool988
		  ? Class21.myPlayer.aClass490_11499
		  : null),
		 (byte) 0))
	       == null);
	if (bool) {
	    Class23.aClass429_207.addNode
		(new Class241_Sub33(class58.slot2 * 877329925,
				    1809275135 * class58.anInt975,
				    -980602175 * class58.anInt872,
				    ~0xffffff | 1143403757 * class58.anInt881,
				    class58.anInt895 * -1412069699,
				    class58.aBool988),
		 (short) -25351);
	    WorldType.refreshComponent(class58, -771486568);
	}
    }
    
    static void method7772(int i, byte i_4_) {
	WorldTile.anInt10182 = -1822006837 * i;
	Class573_Sub1.anInt8773 = -362944491;
	Class573_Sub1.anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
}
