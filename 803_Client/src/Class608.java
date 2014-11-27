/* Class608 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class608
{
    public Interface32[] anInterface32Array7757;
    public static JS5 WORLD_MAP_ARCHIVE;//aClass210_7758
    
    Class608() {
	/* empty */
    }
    
    void method13217(RSByteBuffer class241_sub3, int i) {
	anInterface32Array7757
	    = new Interface32[class241_sub3.readUnsignedByte((byte) 20)];
	Class331[] class331s = Class234.method4695(2013232343);
	for (int i_0_ = 0; i_0_ < anInterface32Array7757.length; i_0_++)
	    anInterface32Array7757[i_0_]
		= method13219(class241_sub3,
			      class331s[class241_sub3.readUnsignedByte((byte) -12)],
			      65280);
    }
    
    Interface32 method13218(RSByteBuffer class241_sub3, Class331 class331) {
	if (Class331.aClass331_5046 == class331)
	    return Class354_Sub2.method16772(class241_sub3, -219060421);
	if (Class331.aClass331_5045 == class331)
	    return Class249.method5008(class241_sub3, 634640561);
	if (Class331.aClass331_5040 == class331)
	    return Class506.method11484(class241_sub3, -783565805);
	if (Class331.aClass331_5042 == class331)
	    return Class42.method1070(class241_sub3, -2030829961);
	if (class331 == Class331.aClass331_5041)
	    return Class380.method6880(class241_sub3, 83979853);
	if (class331 == Class331.aClass331_5038)
	    return Class339.method6118(class241_sub3, (byte) -8);
	if (class331 == Class331.aClass331_5037)
	    return Class133.method3089(class241_sub3, -2036259935);
	if (class331 == Class331.aClass331_5043)
	    return JSFunction.method6232(class241_sub3, (short) 255);
	if (class331 == Class331.aClass331_5044)
	    return Class275.method5346(class241_sub3, -1918996210);
	if (Class331.aClass331_5036 == class331)
	    return Class86.method1852(class241_sub3, -1837227444);
	if (class331 == Class331.aClass331_5039)
	    return Class213.method4307(class241_sub3, -2013467318);
	return null;
    }
    
    Interface32 method13219(RSByteBuffer class241_sub3, Class331 class331,
			    int i) {
	if (Class331.aClass331_5046 == class331)
	    return Class354_Sub2.method16772(class241_sub3, 1520023484);
	if (Class331.aClass331_5045 == class331)
	    return Class249.method5008(class241_sub3, 634640561);
	if (Class331.aClass331_5040 == class331)
	    return Class506.method11484(class241_sub3, -783565805);
	if (Class331.aClass331_5042 == class331)
	    return Class42.method1070(class241_sub3, -2030829961);
	if (class331 == Class331.aClass331_5041)
	    return Class380.method6880(class241_sub3, 83979853);
	if (class331 == Class331.aClass331_5038)
	    return Class339.method6118(class241_sub3, (byte) -11);
	if (class331 == Class331.aClass331_5037)
	    return Class133.method3089(class241_sub3, -2056322583);
	if (class331 == Class331.aClass331_5043)
	    return JSFunction.method6232(class241_sub3, (short) 255);
	if (class331 == Class331.aClass331_5044)
	    return Class275.method5346(class241_sub3, -1348476955);
	if (Class331.aClass331_5036 == class331)
	    return Class86.method1852(class241_sub3, -2104594967);
	if (class331 == Class331.aClass331_5039)
	    return Class213.method4307(class241_sub3, -2013467318);
	return null;
    }
    
    void method13220(RSByteBuffer class241_sub3) {
	anInterface32Array7757
	    = new Interface32[class241_sub3.readUnsignedByte((byte) -37)];
	Class331[] class331s = Class234.method4695(2013232343);
	for (int i = 0; i < anInterface32Array7757.length; i++)
	    anInterface32Array7757[i]
		= method13219(class241_sub3,
			      class331s[class241_sub3.readUnsignedByte((byte) -15)],
			      65280);
    }
    
    void method13221(RSByteBuffer class241_sub3) {
	anInterface32Array7757
	    = new Interface32[class241_sub3.readUnsignedByte((byte) -38)];
	Class331[] class331s = Class234.method4695(2013232343);
	for (int i = 0; i < anInterface32Array7757.length; i++)
	    anInterface32Array7757[i]
		= method13219(class241_sub3,
			      class331s[class241_sub3.readUnsignedByte((byte) 22)],
			      65280);
    }
    
    static final void setSkillUpdateEvent/*method13222*/(InterfaceComponent component, 
    		InterfaceDefinition iFace, ClientScriptData clientScript, int i) {
		String params = (String) clientScript.objectStack
					  [(clientScript.objectStackPointer -= -1650705371) * -290357331];
		int[] watchKeys = Class8.extractVarWatchKeys(params, clientScript, (byte) -74);
		if (null != watchKeys) {
			params = params.substring(0, params.length() - 1);
		}
		component.onSkillUpdateScript
		    = Class299.extractCs2Params(params, clientScript, 1787839437);
		component.skillUpdateWatch = watchKeys;
		component.hasClientScript = true;
    }
}
