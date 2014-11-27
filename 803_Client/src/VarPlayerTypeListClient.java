/* Class199_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarPlayerTypeListClient extends VarTypeList
{
    JS5 configClient;//aClass210_10689
    Class129 recentUse = new Class129(64);//aClass129_10690
    
    public void cacheReset/*method16936*/(int i) {
		synchronized (recentUse) {
		    recentUse.reset(311958756);
		}
    }
    
    public VarType list/*method16892*/(int i, int i_0_) {
		VarPlayerType class179_sub2;
		synchronized (recentUse) {
		    class179_sub2 = (VarPlayerType) recentUse.get((long) i);
			if (class179_sub2 == null) {
				byte[] data = configClient.getfile(
						(variableDomain.getJs5GroupID(-655025853).id * -1379677837),
						i, 83861693);
				class179_sub2 = new VarPlayerType(variableDomain, i);
				if (null != data) {
				    class179_sub2.decode(new RSByteBuffer(data), 1943278720);
				}
				recentUse.put(class179_sub2, (long) i);
		    }
		}
		return class179_sub2;
    }
    
    public VarType method16886(int i) {
	VarPlayerType class179_sub2;
	synchronized (recentUse) {
	    class179_sub2
		= (VarPlayerType) recentUse.get((long) i);
	    if (class179_sub2 == null) {
		byte[] is
		    = (configClient.getfile
		       ((variableDomain.getJs5GroupID(-655025853).id
			 * -1379677837),
			i, 217600686));
		class179_sub2 = new VarPlayerType(variableDomain, i);
		if (null != is)
		    class179_sub2.decode(new RSByteBuffer(is),
					     -1783433916);
		recentUse
		    .put(class179_sub2, (long) i);
	    }
	}
	return class179_sub2;
    }
    
    public void cacheClean/*method16937*/(int i, int i_1_) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2078385047);
		}
    }
    
    public void method16938() {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) -46);
	}
    }
    
    public VarType method16888(int i) {
	VarPlayerType class179_sub2;
	synchronized (recentUse) {
	    class179_sub2
		= (VarPlayerType) ((VarPlayerTypeListClient) this)
				      .recentUse.get((long) i);
	    if (class179_sub2 == null) {
		byte[] is
		    = (configClient.getfile
		       ((variableDomain.getJs5GroupID(-655025853).id
			 * -1379677837),
			i, 544339136));
		class179_sub2 = new VarPlayerType(variableDomain, i);
		if (null != is)
		    class179_sub2.decode(new RSByteBuffer(is),
					     -878242690);
		recentUse
		    .put(class179_sub2, (long) i);
	    }
	}
	return class179_sub2;
    }
    
    public void cacheRemoveSoftReferences/*method16939*/(short i) {
		synchronized (recentUse) {
		    recentUse.removeSoftReferences((byte) 28);
		}
    }
    
    public VarType method16890(int i) {
	VarPlayerType class179_sub2;
	synchronized (recentUse) {
	    class179_sub2
		= (VarPlayerType) ((VarPlayerTypeListClient) this)
				      .recentUse.get((long) i);
	    if (class179_sub2 == null) {
		byte[] is
		    = (configClient.getfile
		       ((variableDomain.getJs5GroupID(-655025853).id
			 * -1379677837),
			i, 904064835));
		class179_sub2 = new VarPlayerType(variableDomain, i);
		if (null != is)
		    class179_sub2.decode(new RSByteBuffer(is),
					     -1080956358);
		recentUse
		    .put(class179_sub2, (long) i);
	    }
	}
	return class179_sub2;
    }
    
    public VarPlayerTypeListClient(GameDefinition class471, VarDomainType class218, Language lang, JS5 class210) {
    	super(class471, class218, lang,
	      (class210 != null ? class210.getContainerCount(
	    		  (class218.getJs5GroupID(-655025853).id * -1379677837),
	    		  (byte) -10) : 0));
    	configClient = class210;
    }
}
