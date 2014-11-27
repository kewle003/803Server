/* Class475_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class475_Sub1 extends Class475
{
    Class475_Sub1 aClass475_Sub1_8743;
    public Class552 aClass552_8744;
    public byte aByte8745;
    public byte nodePlane;//aByte8746
    int anInt8747;
    public Class97[] aClass97Array8748;
    
    int method14447(byte i) {
	return 0;
    }
    
    abstract boolean method14448(Class103 class103, int i, int i_0_, int i_1_);
    
    public boolean method14449() {
	return true;
    }
    
    abstract boolean method14450(int i);
    
    abstract boolean method14451();
    
    abstract boolean method14452(byte i);
    
    abstract void method14453(Class103 class103,
			      Class475_Sub1 class475_sub1_2_, int i, int i_3_,
			      int i_4_, boolean bool, int i_5_);
    
    abstract void method14454(byte i);
    
    abstract Class542 method14455(Class103 class103, int i);
    
    abstract boolean method14456();
    
    public abstract Class535 method14457(Class103 class103, int i);
    
    abstract int method14458(Class241_Sub43[] class241_sub43s, int i);
    
    static Class535 method14459(int i, int i_6_, int i_7_, Class89 class89) {
	if (class89 == null)
	    return null;
	Class535 class535
	    = new Class535(i, i_6_, i_7_, class89.method1893(),
			   class89.method1895(), class89.method1906(),
			   class89.method1902(), class89.method1865(),
			   class89.method1899(), class89.method1996());
	return class535;
    }
    
    abstract boolean method14460(int i);
    
    public boolean method14461(int i) {
	return true;
    }
    
    abstract boolean method14462(Class103 class103);
    
    int method14463(int i, int i_8_, Class241_Sub43[] class241_sub43s,
		    int i_9_) {
	long l = (((Class552) aClass552_8744).aLongArrayArrayArray7177
		  [nodePlane][i][i_8_]);
	long l_10_ = 0L;
	int i_11_ = 0;
	for (/**/; l_10_ <= 48L; l_10_ += 16L) {
	    int i_12_ = (int) (l >> (int) l_10_ & 0xffffL);
	    if (i_12_ <= 0)
		break;
	    class241_sub43s[i_11_++]
		= (((Class552) aClass552_8744).aClass544Array7178[i_12_ - 1]
		   .aClass241_Sub43_7038);
	}
	for (int i_13_ = i_11_; i_13_ < 4; i_13_++)
	    class241_sub43s[i_13_] = null;
	return i_11_;
    }
    
    public int method14464(int i) {
	return -method14468((byte) 105);
    }
    
    void method14465(int i, int i_14_) {
	aClass97Array8748 = new Class97[i];
	for (int i_15_ = 0; i_15_ < aClass97Array8748.length; i_15_++)
	    aClass97Array8748[i_15_] = new Class97();
    }
    
    abstract boolean method14466();
    
    abstract boolean method14467();
    
    public abstract int method14468(byte i);
    
    abstract boolean method14469(byte i);
    
    public abstract Class535 method14470(Class103 class103);
    
    public int method14471() {
	return -method14468((byte) 33);
    }
    
    abstract Class542 method14472(Class103 class103);
    
    abstract Class542 method14473(Class103 class103);
    
    abstract Class542 method14474(Class103 class103);
    
    abstract Class542 method14475(Class103 class103);
    
    abstract void method14476(Class103 class103);
    
    abstract boolean method14477();
    
    abstract void method14478();
    
    abstract boolean method14479();
    
    abstract void method14480(Class103 class103,
			      Class475_Sub1 class475_sub1_16_, int i,
			      int i_17_, int i_18_, boolean bool);
    
    abstract void method14481(Class103 class103,
			      Class475_Sub1 class475_sub1_19_, int i,
			      int i_20_, int i_21_, boolean bool);
    
    abstract void method14482(Class103 class103,
			      Class475_Sub1 class475_sub1_22_, int i,
			      int i_23_, int i_24_, boolean bool);
    
    abstract void method14483();
    
    static Class535 method14484(int i, int i_25_, int i_26_, Class89 class89) {
	if (class89 == null)
	    return null;
	Class535 class535
	    = new Class535(i, i_25_, i_26_, class89.method1893(),
			   class89.method1895(), class89.method1906(),
			   class89.method1902(), class89.method1865(),
			   class89.method1899(), class89.method1996());
	return class535;
    }
    
    int method14485() {
	return 0;
    }
    
    abstract boolean method14486();
    
    int method14487() {
	return 0;
    }
    
    abstract boolean method14488(Class103 class103, int i, int i_27_);
    
    abstract int method14489(Class241_Sub43[] class241_sub43s);
    
    abstract boolean method14490(Class103 class103);
    
    int method14491() {
	return 0;
    }
    
    public abstract int method14492();
    
    abstract void method14493(Class103 class103, byte i);
    
    public boolean method14494() {
	return true;
    }
    
    int method14495(int i, int i_28_, Class241_Sub43[] class241_sub43s) {
	long l = (((Class552) aClass552_8744).aLongArrayArrayArray7177
		  [nodePlane][i][i_28_]);
	long l_29_ = 0L;
	int i_30_ = 0;
	for (/**/; l_29_ <= 48L; l_29_ += 16L) {
	    int i_31_ = (int) (l >> (int) l_29_ & 0xffffL);
	    if (i_31_ <= 0)
		break;
	    class241_sub43s[i_30_++]
		= (((Class552) aClass552_8744).aClass544Array7178[i_31_ - 1]
		   .aClass241_Sub43_7038);
	}
	for (int i_32_ = i_30_; i_32_ < 4; i_32_++)
	    class241_sub43s[i_32_] = null;
	return i_30_;
    }
    
    Class475_Sub1(Class552 class552) {
	aClass552_8744 = class552;
    }
    
    abstract boolean method14496(Class103 class103, byte i);
    
    static void method14497(Class535 class535, int i, int i_33_, int i_34_,
			    Class89 class89) {
	if (class89 != null)
	    class535.method11884(i, i_33_, i_34_, class89.method1893(),
				 class89.method1895(), class89.method1906(),
				 class89.method1902(), class89.method1865(),
				 class89.method1899(), class89.method1996());
    }
    
    void method14498(int i) {
	aClass97Array8748 = new Class97[i];
	for (int i_35_ = 0; i_35_ < aClass97Array8748.length; i_35_++)
	    aClass97Array8748[i_35_] = new Class97();
    }
}
