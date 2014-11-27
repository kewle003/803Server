/* Class617 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class InvTypeList implements Interface17
{
    JS5 configClient;//aClass210_7833
    Class129 recentUse = new Class129(64);//aClass129_7834
    static int anInt7835;
    
    public InvType method13276(int i) {
	InvType class241_sub39_sub19;
	synchronized (recentUse) {
	    class241_sub39_sub19
		= ((InvType)
		   recentUse.get((long) i));
	}
	if (null != class241_sub39_sub19)
	    return class241_sub39_sub19;
	byte[] is;
	synchronized (configClient) {
	    is = configClient.getfile(((Js5ConfigGroup
							       .INVTYPE
							       .id)
							      * -1379677837),
							     i, 281619530);
	}
	class241_sub39_sub19 = new InvType();
	if (is != null)
	    class241_sub39_sub19.decode(new RSByteBuffer(is),
					     1561096005);
	synchronized (recentUse) {
	    recentUse.put(class241_sub39_sub19,
							(long) i);
	}
	return class241_sub39_sub19;
    }
    
    public InvTypeList(GameDefinition class471, Language class437, JS5 class210) {
		this.configClient = class210;
		this.configClient.getContainerCount((Js5ConfigGroup.INVTYPE.id) * -1379677837, (byte) -78);
    }
    
    public InvType method13277(int i) {
	InvType class241_sub39_sub19;
	synchronized (recentUse) {
	    class241_sub39_sub19
		= ((InvType)
		   recentUse.get((long) i));
	}
	if (null != class241_sub39_sub19)
	    return class241_sub39_sub19;
	byte[] is;
	synchronized (configClient) {
	    is = configClient.getfile(((Js5ConfigGroup
							       .INVTYPE
							       .id)
							      * -1379677837),
							     i, 2110305537);
	}
	class241_sub39_sub19 = new InvType();
	if (is != null)
	    class241_sub39_sub19.decode(new RSByteBuffer(is),
					     1625548987);
	synchronized (recentUse) {
	    recentUse.put(class241_sub39_sub19,
							(long) i);
	}
	return class241_sub39_sub19;
    }
    
    public InvType list/*method13278*/(int id, byte i_0_) {
		InvType invType;
		synchronized (recentUse) {
			invType = ((InvType) recentUse.get((long) id));
		}
		if (null != invType) {
		    return invType;
		}
		byte[] data;
		synchronized (configClient) {
			data = configClient.getfile(
		    		(Js5ConfigGroup.INVTYPE.id * -1379677837), id, -123859439);
		}
		invType = new InvType();
		if (data != null) {
			invType.decode(new RSByteBuffer(data), 1974136365);
		}
		synchronized (recentUse) {
		    recentUse.put(invType, (long) id);
		}
		return invType;
    }
    
    public static Interface52 method13279
	(JS5 class210, int i, Interface53 interface53, boolean bool,
	 Class129 class129, int i_1_) {
	if (null != Class483.aClass393_6461) {
	    if (bool)
		return new Class506(class210, i, Class483.aClass393_6461,
				    interface53);
	    return new Class520(class210, i, Class483.aClass393_6461,
				interface53, class129);
	}
	return null;
    }
}
