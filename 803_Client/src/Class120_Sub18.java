/* Class120_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class120_Sub18 extends Class120
{
    int anInt10600;
    int anInt10601;
    int anInt10602;
    int[] anIntArray10603;
    public static Class585 aClass585_10604;
    static int anInt10605;
    static boolean aBool10606;
    
    public void method2958(int i) {
	Entity class475_sub1_sub1_sub3
	    = Class25.aClass93Array213
		  [-2008898269 * ((Class120_Sub18) this).anInt10602]
		  .method2083(-1393176598);
	if (-1184371471 * ((Class120_Sub18) this).anInt10600 == 0)
	    Class638.method13557(class475_sub1_sub1_sub3,
				 ((Class120_Sub18) this).anIntArray10603, 0,
				 false, (byte) 104);
	else
	    Class107.method2685(class475_sub1_sub1_sub3,
				new int[] { -589855149 * ((Class120_Sub18)
							  this).anInt10601 },
				new int[] { 0 },
				new int[] { ((Class120_Sub18) this).anInt10600
					    * -1184371471 },
				2098201935);
    }
    
    boolean method2960(byte i) {
	AnimationDefinition class549
	    = Class394.animationDefLoader.getAnimationDefinition((-589855149
						   * (((Class120_Sub18) this)
						      .anInt10601)),
						  (byte) -77);
	return class549.method12012(636396281);
    }
    
    Class120_Sub18(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub18) this).anInt10602
	    = class241_sub3.readUnsignedShort(1162222719) * -1981107573;
	((Class120_Sub18) this).anIntArray10603 = new int[4];
	((Class120_Sub18) this).anInt10601
	    = class241_sub3.readBigSmart((byte) -24) * 1266593243;
	Arrays.fill(((Class120_Sub18) this).anIntArray10603, 0,
		    ((Class120_Sub18) this).anIntArray10603.length,
		    -589855149 * ((Class120_Sub18) this).anInt10601);
	((Class120_Sub18) this).anInt10600
	    = class241_sub3.readInt((byte) 83) * -323124207;
    }
    
    public void method2961() {
	Entity class475_sub1_sub1_sub3
	    = Class25.aClass93Array213
		  [-2008898269 * ((Class120_Sub18) this).anInt10602]
		  .method2083(-1693920754);
	if (-1184371471 * ((Class120_Sub18) this).anInt10600 == 0)
	    Class638.method13557(class475_sub1_sub1_sub3,
				 ((Class120_Sub18) this).anIntArray10603, 0,
				 false, (byte) 56);
	else
	    Class107.method2685(class475_sub1_sub1_sub3,
				new int[] { -589855149 * ((Class120_Sub18)
							  this).anInt10601 },
				new int[] { 0 },
				new int[] { ((Class120_Sub18) this).anInt10600
					    * -1184371471 },
				-1183809084);
    }
    
    boolean method2962() {
	AnimationDefinition class549
	    = Class394.animationDefLoader.getAnimationDefinition((-589855149
						   * (((Class120_Sub18) this)
						      .anInt10601)),
						  (byte) -21);
	return class549.method12012(553499853);
    }
    
    boolean method2957() {
	AnimationDefinition class549
	    = Class394.animationDefLoader.getAnimationDefinition((-589855149
						   * (((Class120_Sub18) this)
						      .anInt10601)),
						  (byte) -12);
	return class549.method12012(1409515032);
    }
    
    boolean method2964() {
	AnimationDefinition class549
	    = Class394.animationDefLoader.getAnimationDefinition((-589855149
						   * (((Class120_Sub18) this)
						      .anInt10601)),
						  (byte) -103);
	return class549.method12012(1705166918);
    }
    
    static final void method16833(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	float f = ((float) (((ClientScriptData) class454).integerStack
			    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1])
		   / 1000.0F);
	Class445_Sub16.aClass351_Sub1_8660.method6275(i_0_, f, 1206592475);
    }
}
