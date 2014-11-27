/* Class619 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class619
{
    Class129 aClass129_7851 = new Class129(64);
    JS5 aClass210_7852;
    
    public void method13309() {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.reset(-1498665719);
	}
    }
    
    public Class612 method13310(int i, int i_0_) {
	Class612 class612;
	synchronized (((Class619) this).aClass129_7851) {
	    class612 = ((Class612)
			((Class619) this).aClass129_7851.get((long) i));
	}
	if (null != class612)
	    return class612;
	byte[] is;
	synchronized (((Class619) this).aClass210_7852) {
	    is = ((Class619) this).aClass210_7852.getfile(((Js5ConfigGroup
							       .aClass37_403
							       .id)
							      * -1379677837),
							     i, -1060299421);
	}
	class612 = new Class612();
	if (null != is)
	    class612.method13232(new RSByteBuffer(is), -869615090);
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.put(class612, (long) i);
	}
	return class612;
    }
    
    public void method13311() {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.removeSoftReferences((byte) 32);
	}
    }
    
    public void method13312() {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.reset(-35710603);
	}
    }
    
    public void method13313() {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.removeSoftReferences((byte) -57);
	}
    }
    
    public Class612 method13314(int i) {
	Class612 class612;
	synchronized (((Class619) this).aClass129_7851) {
	    class612 = ((Class612)
			((Class619) this).aClass129_7851.get((long) i));
	}
	if (null != class612)
	    return class612;
	byte[] is;
	synchronized (((Class619) this).aClass210_7852) {
	    is = ((Class619) this).aClass210_7852.getfile(((Js5ConfigGroup
							       .aClass37_403
							       .id)
							      * -1379677837),
							     i, 304612657);
	}
	class612 = new Class612();
	if (null != is)
	    class612.method13232(new RSByteBuffer(is), -869615090);
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.put(class612, (long) i);
	}
	return class612;
    }
    
    public Class612 method13315(int i) {
	Class612 class612;
	synchronized (((Class619) this).aClass129_7851) {
	    class612 = ((Class612)
			((Class619) this).aClass129_7851.get((long) i));
	}
	if (null != class612)
	    return class612;
	byte[] is;
	synchronized (((Class619) this).aClass210_7852) {
	    is = ((Class619) this).aClass210_7852.getfile(((Js5ConfigGroup
							       .aClass37_403
							       .id)
							      * -1379677837),
							     i, -536426962);
	}
	class612 = new Class612();
	if (null != is)
	    class612.method13232(new RSByteBuffer(is), -869615090);
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.put(class612, (long) i);
	}
	return class612;
    }
    
    public Class612 method13316(int i) {
	Class612 class612;
	synchronized (((Class619) this).aClass129_7851) {
	    class612 = ((Class612)
			((Class619) this).aClass129_7851.get((long) i));
	}
	if (null != class612)
	    return class612;
	byte[] is;
	synchronized (((Class619) this).aClass210_7852) {
	    is = ((Class619) this).aClass210_7852.getfile(((Js5ConfigGroup
							       .aClass37_403
							       .id)
							      * -1379677837),
							     i, -1519236775);
	}
	class612 = new Class612();
	if (null != is)
	    class612.method13232(new RSByteBuffer(is), -869615090);
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.put(class612, (long) i);
	}
	return class612;
    }
    
    public void method13317(int i) {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.clean(i, -2125086525);
	}
    }
    
    public void method13318(int i) {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.clean(i, -2124681191);
	}
    }
    
    public void method13319() {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.reset(151580913);
	}
    }
    
    public void method13320() {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.removeSoftReferences((byte) -57);
	}
    }
    
    public void method13321(int i) {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.clean(i, -2085804431);
	}
    }
    
    public Class619(GameDefinition class471, Language class437, JS5 class210) {
	((Class619) this).aClass210_7852 = class210;
	((Class619) this).aClass210_7852.getContainerCount((-1379677837
						     * (Js5ConfigGroup.aClass37_403
							.id)),
						    (byte) -73);
    }
    
    public void method13322() {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.removeSoftReferences((byte) 54);
	}
    }
    
    public void method13323(int i, byte i_1_) {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.clean(i, -2072159660);
	}
    }
    
    public void method13324(int i) {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.reset(-413651821);
	}
    }
    
    public void method13325() {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.removeSoftReferences((byte) -17);
	}
    }
    
    public void method13326(int i) {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.removeSoftReferences((byte) -4);
	}
    }
    
    public void method13327() {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.removeSoftReferences((byte) -31);
	}
    }
    
    public void method13328() {
	synchronized (((Class619) this).aClass129_7851) {
	    ((Class619) this).aClass129_7851.removeSoftReferences((byte) 8);
	}
    }
    
    static void method13329(int i) {
	/* empty */
    }
    
    static final void setVarcompMouseOutEvent/*method13330*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		ClientScriptMap.setMouseOutEvent(component, iFace, scriptData, -126427795);
    }
}
