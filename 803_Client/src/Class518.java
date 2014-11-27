/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class518 implements Interface47
{
    int anInt6785;
    static Class518 aClass518_6786;
    static Class518 aClass518_6787 = new Class518(0);
    public static Class518 aClass518_6788;
    
    static {
	aClass518_6786 = new Class518(1);
	aClass518_6788 = new Class518(2);
    }
    
    public int method11() {
	return -1038753661 * ((Class518) this).anInt6785;
    }
    
    Class518(int i) {
	((Class518) this).anInt6785 = i * 331968043;
    }
    
    public int method9() {
	return -1038753661 * ((Class518) this).anInt6785;
    }
    
    public int method10() {
	return -1038753661 * ((Class518) this).anInt6785;
    }
    
    static Class518[] method11657() {
	return (new Class518[]
		{ aClass518_6787, aClass518_6788, aClass518_6786 });
    }
    
    public int method147() {
	return -1038753661 * ((Class518) this).anInt6785;
    }
    
    public int getId(byte i) {
	return -1038753661 * ((Class518) this).anInt6785;
    }
    
    public static Class81 method11658(int i, int i_0_) {
	if (i == -1948433703 * ((Class81) Class81.aClass81_1145).anInt1142)
	    return Class81.aClass81_1145;
	if (i == -1948433703 * ((Class81) Class81.aClass81_1143).anInt1142)
	    return Class81.aClass81_1143;
	if (i == -1948433703 * ((Class81) Class81.aClass81_1144).anInt1142)
	    return Class81.aClass81_1144;
	if (i == -1948433703 * ((Class81) Class81.aClass81_1148).anInt1142)
	    return Class81.aClass81_1148;
	if (i == -1948433703 * ((Class81) Class81.aClass81_1146).anInt1142)
	    return Class81.aClass81_1146;
	if (((Class81) Class81.aClass81_1147).anInt1142 * -1948433703 == i)
	    return Class81.aClass81_1147;
	return null;
    }
    
    public static short[] method11659(short[] is, int i) {
	if (null == is)
	    return null;
	short[] is_1_ = new short[is.length];
	System.arraycopy(is, 0, is_1_, 0, is.length);
	return is_1_;
    }
    
    public static Class639 method11660(JS5 class210, int i, int i_2_,
				       byte i_3_) {
	byte[] is = class210.getfile(i, i_2_, 1849801009);
	if (null == is)
	    return null;
	return new Class639(is);
    }
    
    static boolean method11661(int i) {
	return Class15.aBool132;
    }
    
    static String method11662(InterfaceComponent component, byte i) {
		if (client.method13624(component).method15040((short) -18349) == 0) {
		    return null;
		}
		if (null == component.aString849 || component.aString849.trim().length() == 0) {
		    if (client.aBool8403) {
		    	return "Hidden-use";
		    }
		    return null;
		}
		return component.aString849;
    }
    
    public static void method11663(int i) {
	Class68.aBool1064 = true;
	Class349.aString5383 = Class13.aString112;
	Class445_Sub11.aString8646 = Class13.aString113;
	Class362_Sub1.gameLogout(false, 1427801706);
	Class86.method1850(620294792);
	Class68.aClass359Array1065 = null;
	Class281.aClass280_4428 = null;
	Class496.setClientStage(0, (byte) -103);
    }
}
