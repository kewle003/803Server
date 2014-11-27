/* Class538 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationConfigLoader
{
    JS5 configDefContainer;//aClass210_6993
    Class129 aClass129_6994 = new Class129(64);
    static byte[][][] aByteArrayArrayArray6995;
    public static JS5 aClass210_6996;
    
    AnimationConfig getConfig/*method11903*/(int configID, int i_0_) {
		AnimationConfig config;
		synchronized (aClass129_6994) {
			config = ((AnimationConfig) aClass129_6994.get((long) configID));
		}
		if (null != config) {
		    return config;
		}
		byte[] data;
		synchronized (configDefContainer) {
			data = configDefContainer.getfile(
		    		(-1379677837 * (Js5ConfigGroup.ANIMATION_CONFIG.id)),
		    		configID, -870564878);
		}
		config = new AnimationConfig();
		if (data != null) {
			config.read(new RSByteBuffer(data), -2139513482);
		}
		synchronized (aClass129_6994) {
		    aClass129_6994.put(config, (long) configID);
		}
		return config;
    }
    
    public AnimationConfigLoader(GameDefinition game, Language locale, JS5 configArchive) {
	configDefContainer = configArchive;
	if (null != configDefContainer)
	    configDefContainer.getContainerCount(((Js5ConfigGroup.ANIMATION_CONFIG
							  .id)
							 * -1379677837),
							(byte) -123);
    }
    
    AnimationConfig method11904(int i) {
	AnimationConfig class543;
	synchronized (aClass129_6994) {
	    class543 = ((AnimationConfig)
			aClass129_6994.get((long) i));
	}
	if (null != class543)
	    return class543;
	byte[] is;
	synchronized (configDefContainer) {
	    is = configDefContainer.getfile((-1379677837
							      * (Js5ConfigGroup
								 .ANIMATION_CONFIG
								 .id)),
							     i, 1531823086);
	}
	class543 = new AnimationConfig();
	if (is != null)
	    class543.read(new RSByteBuffer(is), -577703239);
	synchronized (aClass129_6994) {
	    aClass129_6994.put(class543, (long) i);
	}
	return class543;
    }
    
    AnimationConfig method11905(int i) {
	AnimationConfig class543;
	synchronized (aClass129_6994) {
	    class543 = ((AnimationConfig)
			aClass129_6994.get((long) i));
	}
	if (null != class543)
	    return class543;
	byte[] is;
	synchronized (configDefContainer) {
	    is = configDefContainer.getfile((-1379677837
							      * (Js5ConfigGroup
								 .ANIMATION_CONFIG
								 .id)),
							     i, 1340430719);
	}
	class543 = new AnimationConfig();
	if (is != null)
	    class543.read(new RSByteBuffer(is), -1068143040);
	synchronized (aClass129_6994) {
	    aClass129_6994.put(class543, (long) i);
	}
	return class543;
    }
    
    public static int method11906(int i, int i_1_) {
	Class41 class41 = (Class41) Class44.aMap610.get(Integer.valueOf(i));
	if (class41 == null)
	    return 0;
	return class41.method1054(1697232341);
    }
    
    static final void method11907(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (-1 == i_3_)
	    throw new RuntimeException();
	ClientScriptMap class406
	    = Class105_Sub1.cs2MapsList.list(i_3_, (byte) -18);
	if (class406.type != i_2_)
	    throw new RuntimeException();
	if (class406.aChar5898 != 's')
	    throw new RuntimeException();
	int[] is = class406.method7248(string, 329349084);
	if (i_4_ < 0 || is == null || is.length <= i_4_)
	    throw new RuntimeException();
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = is[i_4_];
    }
}
