/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GameDefinition
{
    public static GameDefinition STELLARDAWN;//aClass471_6349
    static GameDefinition SCRATCH;
    public String aString6351;
    static GameDefinition TRANSFORMERS;//aClass471_6352
    static GameDefinition ALTERNATEREALITY;//aClass471_6353
    static GameDefinition aClass471_6354;//aClass471_6354
    public String name;//aString6355
    public static GameDefinition RUNESCAPE;//aClass471_6356
    public int anInt6357;
    
    static GameDefinition[] method10775() {
	return (new GameDefinition[]
		{ SCRATCH, STELLARDAWN, TRANSFORMERS,
		  ALTERNATEREALITY, RUNESCAPE, aClass471_6354 });
    }
    
    static {
    	RUNESCAPE = new GameDefinition("runescape", "RuneScape", 0, Class600.RUNESCAPE);
		STELLARDAWN = new GameDefinition("stellardawn", "Stellar Dawn", 1, Class600.STELLAR_DAWN);
		ALTERNATEREALITY = new GameDefinition("game3", "Game 3", 2, Class600.RUNESCAPE);
		TRANSFORMERS = new GameDefinition("game4", "Game 4", 3, Class600.TRANSFORMERS);
		SCRATCH = new GameDefinition("game5", "Game 5", 4, Class600.SCRATCH);
		aClass471_6354 = new GameDefinition("oldscape", "RuneScape 2007", 5, Class600.RUNESCAPE);
    }
    
    public static GameDefinition method10776(int i) {
	GameDefinition[] class471s = Class568.method12476(-560900133);
	for (int i_0_ = 0; i_0_ < class471s.length; i_0_++) {
	    GameDefinition class471 = class471s[i_0_];
	    if (i == -1202509675 * class471.anInt6357)
		return class471;
	}
	return null;
    }
    
    public static GameDefinition method10777(int i) {
	GameDefinition[] class471s = Class568.method12476(-1080074593);
	for (int i_1_ = 0; i_1_ < class471s.length; i_1_++) {
	    GameDefinition class471 = class471s[i_1_];
	    if (i == -1202509675 * class471.anInt6357)
		return class471;
	}
	return null;
    }
    
    static GameDefinition[] method10778() {
	return (new GameDefinition[]
		{ SCRATCH, STELLARDAWN, TRANSFORMERS,
		  ALTERNATEREALITY, RUNESCAPE, aClass471_6354 });
    }
    
    public static GameDefinition method10779(int i) {
	GameDefinition[] class471s = Class568.method12476(-1817456015);
	for (int i_2_ = 0; i_2_ < class471s.length; i_2_++) {
	    GameDefinition class471 = class471s[i_2_];
	    if (i == -1202509675 * class471.anInt6357)
		return class471;
	}
	return null;
    }
    
    GameDefinition(String string, String string_3_, int i, Class600 class600) {
	name = string;
	aString6351 = string_3_;
	anInt6357 = 1917477565 * i;
    }
    
    public static GameDefinition method10780(int i) {
	GameDefinition[] class471s = Class568.method12476(1950504838);
	for (int i_4_ = 0; i_4_ < class471s.length; i_4_++) {
	    GameDefinition class471 = class471s[i_4_];
	    if (i == -1202509675 * class471.anInt6357)
		return class471;
	}
	return null;
    }
    
    static int method10781(int i, int i_5_, int i_6_) {
	int i_7_ = i >> 31 & i_5_ - 1;
	return i_7_ + (i + (i >>> 31)) % i_5_;
    }
}
