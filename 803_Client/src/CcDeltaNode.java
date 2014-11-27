/* Class241_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class CcDeltaNode extends Node
{
    public static Class70 aClass70_9022;
    
    abstract void method15088(ClanChannel class241_sub6);
    
    abstract void decode(RSByteBuffer buffer, byte i);//method15089
    
    abstract void applyToClanChannel(ClanChannel channel, byte i);//method15090
    
    CcDeltaNode() {
	/* empty */
    }
    
    abstract void method15091(ClanChannel class241_sub6);
    
    abstract void method15092(ClanChannel class241_sub6);
    
    abstract void method15093(RSByteBuffer class241_sub3);
    
    abstract void method15094(ClanChannel class241_sub6);
    
    static boolean method15095(boolean bool, boolean bool_0_, String string,
			       String string_1_, long l) {
	Class13.aBool80 = bool;
	if (!bool_0_)
	    Class13.anInt81 = -1017556759;
	Class13.aBool78 = bool_0_;
	Class13.aString112 = string;
	Class13.aString113 = string_1_;
	Class13.aLong82 = l * -7226492194362182485L;
	if (!Class13.aBool78 && (Class13.aString112.equals("")
				 || Class13.aString113.equals(""))) {
	    Class175.setLoginResponse(3, -1615655703);
	    ParamType.method13195((byte) -27);
	    return false;
	}
	if (-47430143 * Class13.anInt77 != 172) {
	    Class13.anInt94 = 0;
	    Class13.anInt123 = -1465399761;
	    Class13.anInt83 = -437675423;
	}
	Exception_Sub5.aClass190_10704.aBool2275 = false;
	Class175.setLoginResponse(-3, -2055678956);
	Class13.anInt101 = -1152359031;
	Class13.anInt121 = 0;
	Class13.anInt115 = 0;
	return true;
    }
}
