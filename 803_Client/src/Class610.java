/* Class610 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class610
{
    Class611[] aClass611Array7760;
    boolean aBool7761;
    public static GeneralMapList generalMapList;//aClass624_7762
    
    Class610(boolean bool, Class611[] class611s) {
	((Class610) this).aBool7761 = bool;
	((Class610) this).aClass611Array7760 = class611s;
    }
    
    static void method13227(byte i) {
	Class194.anInt2311 = 0;
	Class194.minimapFlagX = 980260023;
	Class194.minimapFlagY = 1262506991;
    }
    
    public static void method13228(int i, byte i_0_) {
	Class2 class2
	    = (Class2) Class573_Sub1.aHashMap8766.get(Integer.valueOf(i));
	if (null == class2)
	    class2 = new Class2();
	((Class2) class2).anInt12 = -1980703257 * Class573_Sub1.anInt8783;
	((Class2) class2).anInt13 = -902921693 * Class573_Sub1.anInt8785;
	Class573_Sub1.aHashMap8766.put(Integer.valueOf(i), class2);
    }
}
