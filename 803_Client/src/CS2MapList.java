/* Class419 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CS2MapList
{
    Class129 recentUse = new Class129(128);//aClass129_6029
    JS5 configClient;//aClass210_6030
    public static Class350 aClass350_6031;
    
    public ClientScriptMap method7510(int i) {
	ClientScriptMap class406;
	synchronized (recentUse) {
	    class406 = ((ClientScriptMap)
			recentUse.get((long) i));
	}
	if (null != class406)
	    return class406;
	byte[] is
	    = (configClient.getfile
	       (Js5ConfigGroup.aClass37_391.getClientGroupId(i, (byte) -89),
		Js5ConfigGroup.aClass37_391.getClientFileId(i, 1014207253), 1072469438));
	class406 = new ClientScriptMap();
	if (is != null)
	    class406.decode(new RSByteBuffer(is), 1795982222);
	synchronized (recentUse) {
	    recentUse.put(class406, (long) i);
	}
	return class406;
    }
    
    public CS2MapList(GameDefinition game, Language locale, JS5 cs2Maps) {
		configClient = cs2Maps;
		if (null != configClient) {
		    int i = configClient.getFileCount((byte) -39) - 1;
		    Js5ConfigGroup.aClass37_391.getGroupSize(-1597395705);
		    configClient.getContainerCount(i, (byte) -123);
		}
    }
    
    public ClientScriptMap method7511(int i) {
	ClientScriptMap class406;
	synchronized (recentUse) {
	    class406 = ((ClientScriptMap)
			recentUse.get((long) i));
	}
	if (null != class406)
	    return class406;
	byte[] is
	    = (configClient.getfile
	       (Js5ConfigGroup.aClass37_391.getClientGroupId(i, (byte) -85),
		Js5ConfigGroup.aClass37_391.getClientFileId(i, 1334553259), 1300156407));
	class406 = new ClientScriptMap();
	if (is != null)
	    class406.decode(new RSByteBuffer(is), 1883542373);
	synchronized (recentUse) {
	    recentUse.put(class406, (long) i);
	}
	return class406;
    }
    
    public ClientScriptMap list/*method7512*/(int i, byte i_0_) {
		ClientScriptMap class406;
		synchronized (recentUse) {
		    class406 = ((ClientScriptMap) recentUse.get((long) i));
		}
		if (null != class406) {
		    return class406;
		}
		byte[] is = configClient.getfile(
				Js5ConfigGroup.aClass37_391.getClientGroupId(i, (byte) -14),
				Js5ConfigGroup.aClass37_391.getClientFileId(i, 666412466), 1433895694);
		class406 = new ClientScriptMap();
		if (is != null) {
		    class406.decode(new RSByteBuffer(is), 1566335459);
		}
		synchronized (recentUse) {
		    recentUse.put(class406, (long) i);
		}
		return class406;
    }
    
    public static Class533 method7513(RSByteBuffer class241_sub3, int i) {
	int i_1_ = class241_sub3.readUnsignedByte((byte) -34);
	int[] is = new int[i_1_];
	for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
	    is[i_2_] = class241_sub3.readUnsignedByte((byte) -55);
	return new Class533(is);
    }
}
