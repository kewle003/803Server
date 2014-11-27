/* Class120_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class120_Sub22 extends Class120
{
    int anInt10624;
    int anInt10625;
    int anInt10626;
    public static String aString10627;
    public static JS5 LANDSCAPES_ARCHIVE;//aClass210_10628
    
    boolean method2957() {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition((((Class120_Sub22) this)
						   .anInt10626) * -561032075,
						  1232200923);
	boolean bool = class460.method10614(634191772);
	AnimationDefinition class549
	    = Class394.animationDefLoader
		  .getAnimationDefinition(850723107 * class460.anInt6267, (byte) -90);
	bool &= class549.method12012(1739813125);
	return bool;
    }
    
    Class120_Sub22(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub22) this).anInt10626
	    = class241_sub3.readUnsignedShort(1162222719) * -1938498595;
	((Class120_Sub22) this).anInt10625
	    = class241_sub3.readUnsignedShort(1162222719) * 27561103;
	((Class120_Sub22) this).anInt10624
	    = class241_sub3.readUnsignedByte((byte) -73) * 769317929;
    }
    
    boolean method2960(byte i) {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition((((Class120_Sub22) this)
						   .anInt10626) * -561032075,
						  1232200923);
	boolean bool = class460.method10614(-1033543438);
	AnimationDefinition class549
	    = Class394.animationDefLoader
		  .getAnimationDefinition(850723107 * class460.anInt6267, (byte) -13);
	bool &= class549.method12012(1172931261);
	return bool;
    }
    
    boolean method2962() {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition((((Class120_Sub22) this)
						   .anInt10626) * -561032075,
						  1232200923);
	boolean bool = class460.method10614(-236896388);
	AnimationDefinition class549
	    = Class394.animationDefLoader
		  .getAnimationDefinition(850723107 * class460.anInt6267, (byte) -110);
	bool &= class549.method12012(-163058589);
	return bool;
    }
    
    boolean method2964() {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition((((Class120_Sub22) this)
						   .anInt10626) * -561032075,
						  1232200923);
	boolean bool = class460.method10614(-1294226816);
	AnimationDefinition class549
	    = Class394.animationDefLoader
		  .getAnimationDefinition(850723107 * class460.anInt6267, (byte) -23);
	bool &= class549.method12012(435753612);
	return bool;
    }
    
    public static final void method16852(byte i) {
	String string = (GameShell3$FrameParameters.aString4008 != null ? GameShell3$FrameParameters.aString4008
			 : Class248.method4988(-1679579966));
	Class446.method7895(string, false, client.aBool8440, -1815142638);
    }
}
