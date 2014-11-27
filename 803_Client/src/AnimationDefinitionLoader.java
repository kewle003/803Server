/* Class556 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class AnimationDefinitionLoader
{
    JS5 animationDefContainer;//aClass210_7252
    AnimationConfigLoader animationConfigLoader;//aClass538_7253
    Class129 animationCache = new Class129(64);//aClass129_7254
    Class129 aClass129_7255 = new Class129(100);
    
    public AnimationDefinition method12295(int i) {
	AnimationDefinition class549;
	synchronized (animationCache) {
	    class549 = ((AnimationDefinition)
			animationCache.get((long) i));
	}
	if (class549 != null)
	    return class549;
	byte[] is;
	synchronized (animationDefContainer) {
	    is = (animationDefContainer.getfile
		  (Js5ConfigGroup.ANIMATION_DEFINITIONS.getClientGroupId(i, (byte) -112),
		   Js5ConfigGroup.ANIMATION_DEFINITIONS.getClientFileId(i, -432850244),
		   2073161535));
	}
	class549 = new AnimationDefinition();
	class549.animationID = -382566673 * i;
	((AnimationDefinition) class549).loader = this;
	if (is != null)
	    class549.read(new RSByteBuffer(is), 2014100708);
	class549.postDecodeEvent((short) -4172);
	synchronized (animationCache) {
	    animationCache.put(class549, (long) i);
	}
	return class549;
    }
    
    public AnimationDefinition method12296(int i) {
	AnimationDefinition class549;
	synchronized (animationCache) {
	    class549 = ((AnimationDefinition)
			animationCache.get((long) i));
	}
	if (class549 != null)
	    return class549;
	byte[] is;
	synchronized (animationDefContainer) {
	    is = (animationDefContainer.getfile
		  (Js5ConfigGroup.ANIMATION_DEFINITIONS.getClientGroupId(i, (byte) -120),
		   Js5ConfigGroup.ANIMATION_DEFINITIONS.getClientFileId(i, 2145744195), 302512881));
	}
	class549 = new AnimationDefinition();
	class549.animationID = -382566673 * i;
	((AnimationDefinition) class549).loader = this;
	if (is != null)
	    class549.read(new RSByteBuffer(is), -82027735);
	class549.postDecodeEvent((short) -30807);
	synchronized (animationCache) {
	    animationCache.put(class549, (long) i);
	}
	return class549;
    }
    
    public Class241_Sub39_Sub2 method12297(int i, int i_0_) {
	Class241_Sub39_Sub2 class241_sub39_sub2;
	synchronized (aClass129_7255) {
	    class241_sub39_sub2
		= ((Class241_Sub39_Sub2)
		   aClass129_7255.get((long) i));
	    if (null == class241_sub39_sub2) {
		class241_sub39_sub2 = new Class241_Sub39_Sub2(i);
		aClass129_7255
		    .put(class241_sub39_sub2, (long) i);
	    }
	    if (!class241_sub39_sub2.method17081((byte) 99)) {
		Class241_Sub39_Sub2 class241_sub39_sub2_1_ = null;
		return class241_sub39_sub2_1_;
	    }
	}
	return class241_sub39_sub2;
    }
    
    public void method12298(int i) {
	synchronized (animationCache) {
	    animationCache.reset(-1480108812);
	}
	synchronized (aClass129_7255) {
	    aClass129_7255.reset(-594420640);
	}
    }
    
    public void method12299(int i, byte i_2_) {
	synchronized (animationCache) {
	    animationCache.clean(i, -2121066982);
	}
	synchronized (aClass129_7255) {
	    aClass129_7255.clean(i, -2116874541);
	}
    }
    
    public void method12300(short i) {
	synchronized (animationCache) {
	    animationCache.removeSoftReferences((byte) -17);
	}
	synchronized (aClass129_7255) {
	    aClass129_7255.removeSoftReferences((byte) 41);
	}
    }
    
    public AnimationDefinitionLoader(GameDefinition game, Language locale, JS5 animations,
		    JS5 class210_3_, JS5 class210_4_,
		    AnimationConfigLoader config) {
	animationDefContainer = animations;
	animationConfigLoader = config;
	if (null != animationDefContainer) {
	    int i = animationDefContainer.getFileCount((byte) 23) - 1;
	    Js5ConfigGroup.ANIMATION_DEFINITIONS.getGroupSize(-1248203587);
	    animationDefContainer.getContainerCount(i, (byte) -113);
	}
	Class241_Sub18_Sub1.method17152(class210_3_, class210_4_, 2, -1385838031);
    }
    
    public AnimationDefinition method12301(int i) {
	AnimationDefinition class549;
	synchronized (animationCache) {
	    class549 = ((AnimationDefinition) animationCache.get((long) i));
	}
	if (class549 != null)
	    return class549;
	byte[] is;
	synchronized (animationDefContainer) {
	    is = (animationDefContainer.getfile
		  (Js5ConfigGroup.ANIMATION_DEFINITIONS.getClientGroupId(i, (byte) -102),
		   Js5ConfigGroup.ANIMATION_DEFINITIONS.getClientFileId(i, 379197095), -306029162));
	}
	class549 = new AnimationDefinition();
	class549.animationID = -382566673 * i;
	((AnimationDefinition) class549).loader = this;
	if (is != null)
	    class549.read(new RSByteBuffer(is), 1156030115);
	class549.postDecodeEvent((short) -9200);
	synchronized (animationCache) {
	    animationCache.put(class549, (long) i);
	}
	return class549;
    }
    
    public AnimationDefinition getAnimationDefinition/*method12302*/(int animID, byte i_5_) {
		AnimationDefinition animation;
		synchronized (animationCache) {
		    animation = ((AnimationDefinition) animationCache.get((long) animID));
		}
		if (animation != null) {
		    return animation;
		}
		byte[] data;
		synchronized (animationDefContainer) {
		    data = animationDefContainer.getfile(
	                    Js5ConfigGroup.ANIMATION_DEFINITIONS.getClientGroupId(animID, (byte) -43),
	                    Js5ConfigGroup.ANIMATION_DEFINITIONS.getClientFileId(animID, -961296872),
	                    -1384343665);
		}
		animation = new AnimationDefinition();
		animation.animationID = -382566673 * animID;
		animation.loader = this;
		if (data != null) {
		    animation.read(new RSByteBuffer(data), -202163631);
		}
		animation.postDecodeEvent((short) -6701);
		synchronized (animationCache) {
		    animationCache.put(animation, (long) animID);
		}
		return animation;
    }
    
    public Class241_Sub39_Sub2 method12303(int i) {
	Class241_Sub39_Sub2 class241_sub39_sub2;
	synchronized (aClass129_7255) {
	    class241_sub39_sub2
		= ((Class241_Sub39_Sub2)
		   aClass129_7255.get((long) i));
	    if (null == class241_sub39_sub2) {
		class241_sub39_sub2 = new Class241_Sub39_Sub2(i);
		aClass129_7255
		    .put(class241_sub39_sub2, (long) i);
	    }
	    if (!class241_sub39_sub2.method17081((byte) 99)) {
		Class241_Sub39_Sub2 class241_sub39_sub2_6_ = null;
		return class241_sub39_sub2_6_;
	    }
	}
	return class241_sub39_sub2;
    }
    
    public void method12304(int i) {
	synchronized (animationCache) {
	    animationCache.clean(i, -2000923922);
	}
	synchronized (aClass129_7255) {
	    aClass129_7255.clean(i, -2114209144);
	}
    }
    
    public Class241_Sub39_Sub2 method12305(int i) {
	Class241_Sub39_Sub2 class241_sub39_sub2;
	synchronized (aClass129_7255) {
	    class241_sub39_sub2
		= ((Class241_Sub39_Sub2)
		   aClass129_7255.get((long) i));
	    if (null == class241_sub39_sub2) {
		class241_sub39_sub2 = new Class241_Sub39_Sub2(i);
		aClass129_7255
		    .put(class241_sub39_sub2, (long) i);
	    }
	    if (!class241_sub39_sub2.method17081((byte) 99)) {
		Class241_Sub39_Sub2 class241_sub39_sub2_7_ = null;
		return class241_sub39_sub2_7_;
	    }
	}
	return class241_sub39_sub2;
    }
    
    public void method12306() {
	synchronized (animationCache) {
	    animationCache.reset(57876157);
	}
	synchronized (aClass129_7255) {
	    aClass129_7255.reset(-361430769);
	}
    }
    
    public void method12307(int i) {
	synchronized (animationCache) {
	    animationCache.clean(i, -2130813141);
	}
	synchronized (aClass129_7255) {
	    aClass129_7255.clean(i, -2058729048);
	}
    }
    
    public void method12308() {
	synchronized (animationCache) {
	    animationCache.removeSoftReferences((byte) 76);
	}
	synchronized (aClass129_7255) {
	    aClass129_7255.removeSoftReferences((byte) -26);
	}
    }
    
    public void method12309() {
	synchronized (animationCache) {
	    animationCache.removeSoftReferences((byte) -19);
	}
	synchronized (aClass129_7255) {
	    aClass129_7255.removeSoftReferences((byte) 13);
	}
    }
    
    public Class241_Sub39_Sub2 method12310(int i) {
	Class241_Sub39_Sub2 class241_sub39_sub2;
	synchronized (aClass129_7255) {
	    class241_sub39_sub2
		= ((Class241_Sub39_Sub2)
		   aClass129_7255.get((long) i));
	    if (null == class241_sub39_sub2) {
		class241_sub39_sub2 = new Class241_Sub39_Sub2(i);
		aClass129_7255
		    .put(class241_sub39_sub2, (long) i);
	    }
	    if (!class241_sub39_sub2.method17081((byte) 99)) {
		Class241_Sub39_Sub2 class241_sub39_sub2_8_ = null;
		return class241_sub39_sub2_8_;
	    }
	}
	return class241_sub39_sub2;
    }
    
    static final void method12311(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	boolean bool
	    = ObjectDefinition.aclient6907.method13000(new File(string), (byte) -26);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = bool ? 1 : 0;
    }
    
    static final void method12312(ClientScriptData class454, short i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
    }
    
    static void method12313(int i, boolean bool, int i_9_) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -264504252);
	if (class241_sub34 != null)
	    class241_sub34.remove((byte) 36);
    }
    
    static final void method12314(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class303.method5847(class58, class35, class454, 1844383761);
    }
    
    static boolean method12315(Class533 class533, byte i) {
    	return Class482.method11024(class533, null, 1908001291);
    }
}
