/* Class120_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub16 extends Class120
{
    int anInt10562;
    public static int anInt10563;
    
    public void method2958(int i) {
	Class25.aClass93Array213
	    [((Class120_Sub16) this).anInt10562 * -1767824849]
	    .method2080(2141341829);
    }
    
    public void method2961() {
	Class25.aClass93Array213
	    [((Class120_Sub16) this).anInt10562 * -1767824849]
	    .method2080(1263017110);
    }
    
    Class120_Sub16(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub16) this).anInt10562
	    = class241_sub3.readUnsignedShort(1162222719) * 865428687;
    }
    
    public static void method16795(Class640 class640, String string, int i,
				   Throwable throwable, int i_0_) {
	Class223.method4490(new Class558(class640, string, i, throwable),
			    -1635658426);
    }
    
    static final void method16796(ClientScriptData class454, int i) {
	throw new RuntimeException("");
    }
    
    static void method16797(boolean bool, byte i) {
	Class185.aString2181 = Class185.aString2181.trim();
	Class185.anInt2190 = 0;
	if (Class185.aString2181.length() == 0)
	    Class185.anInt2182 = 0;
	else {
	    Class21.addline(new StringBuilder().append("--> ").append
				  (Class185.aString2181).toString(),
			      (byte) 85);
	    Class120_Sub10.runCommand(Class185.aString2181, false, bool,
				       131798161);
	    if (!bool) {
		Class185.anInt2182 = 0;
		Class185.aString2181 = "";
	    } else
		Class185.anInt2182 = Class185.aString2181.length() * 527811085;
	}
    }
}
