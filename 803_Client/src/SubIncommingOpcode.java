/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SubIncommingOpcode
{
    public static SubIncommingOpcode aClass341_5299;
    public static SubIncommingOpcode aClass341_5300;
    public static SubIncommingOpcode aClass341_5301;
    public static SubIncommingOpcode aClass341_5302;
    public static SubIncommingOpcode aClass341_5303 = new SubIncommingOpcode(-1);
    public static SubIncommingOpcode ADD_GROUND_ITEM;//aClass341_5304
    public static SubIncommingOpcode REMOVE_GROUND_ITEM;//aClass341_5305
    public static SubIncommingOpcode aClass341_5306;
    public static SubIncommingOpcode aClass341_5307;
    public static SubIncommingOpcode aClass341_5308;
    public static SubIncommingOpcode PROJECTILE;//aClass341_5309
    public static SubIncommingOpcode aClass341_5310 = new SubIncommingOpcode(7);
    public static SubIncommingOpcode SPAWN_OBJECT;//aClass341_5311
    public static SubIncommingOpcode DESTROY_OBJECT;//aClass341_5312
    public static SubIncommingOpcode TILE_MESSAGE;//aClass341_5313
    
    static {
		aClass341_5301 = new SubIncommingOpcode(5);
		aClass341_5302 = new SubIncommingOpcode(7);
		aClass341_5306 = new SubIncommingOpcode(10);
		aClass341_5299 = new SubIncommingOpcode(9);
		REMOVE_GROUND_ITEM = new SubIncommingOpcode(3);
		PROJECTILE = new SubIncommingOpcode(18);
		aClass341_5307 = new SubIncommingOpcode(8);
		DESTROY_OBJECT = new SubIncommingOpcode(2);
		aClass341_5300 = new SubIncommingOpcode(7);
		aClass341_5308 = new SubIncommingOpcode(21);
		SPAWN_OBJECT = new SubIncommingOpcode(6);
		ADD_GROUND_ITEM = new SubIncommingOpcode(5);
		TILE_MESSAGE = new SubIncommingOpcode(-1);
    }
    
    SubIncommingOpcode(int size) {
    	/* empty */
    }
    
    static final void method6126(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).anInt6231 -= 1421070234;
	if ((((ClientScriptData) class454).longStack
	     [-735224571 * ((ClientScriptData) class454).anInt6231])
	    <= (((ClientScriptData) class454).longStack
		[1 + ((ClientScriptData) class454).anInt6231 * -735224571]))
	    ((ClientScriptData) class454).step
		+= ((((ClientScriptData) class454).integerConstants
		     [1938982693 * ((ClientScriptData) class454).step])
		    * 1924545709);
    }
    
    static final void method6127(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	ItemDefinition class623
	    = JS5.itemDefLoader.list(i_0_, (short) 6409);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class623.anInt7939 * 142216489;
    }
}
