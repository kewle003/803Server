/* Class574 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class574
{
    Class574() throws Throwable {
	throw new Error();
    }
    
    static final void storeClanMemberJoinDay/*method12659*/(ClientScriptData scriptData, byte i) {
		int index = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = scriptData.clanSettings.clanMemberJoinDays[index];
    }
    
    public static boolean method12660(int i, int i_1_) {
	return (i >= Class527.aClass527_6929.anInt6931 * -2030829961
		&& i <= -2030829961 * Class527.aClass527_6923.anInt6931);
    }
    
    public static final void method12661(int i) {
	for (WorldObject class241_sub30
		 = ((WorldObject)
		    WorldObject.aClass429_10039.method7694(16711935));
	     null != class241_sub30;
	     class241_sub30 = (WorldObject) WorldObject
						   .aClass429_10039
						   .method7692(1546895006)) {
	    if (!((WorldObject) class241_sub30).aBool10046) {
		((WorldObject) class241_sub30).aBool10051 = true;
		if (1204421839 * class241_sub30.posX >= 0
		    && -320018831 * class241_sub30.posY >= 0
		    && (class241_sub30.posX * 1204421839
			< client.aClass238_8477.method4744(-1692932107))
		    && (-320018831 * class241_sub30.posY
			< client.aClass238_8477.method4745(-2113827140)))
		    Class583.method12830(class241_sub30, 1835068090);
	    } else
		class241_sub30.remove((byte) 36);
	}
	for (WorldObject class241_sub30
		 = ((WorldObject)
		    WorldObject.aClass429_10053.method7694(16711935));
	     null != class241_sub30;
	     class241_sub30 = (WorldObject) WorldObject
						   .aClass429_10053
						   .method7692(1077357247)) {
	    if (!((WorldObject) class241_sub30).aBool10046)
		((WorldObject) class241_sub30).aBool10051 = true;
	    else
		class241_sub30.remove((byte) 36);
	}
    }
}
