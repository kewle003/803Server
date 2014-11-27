/* Class476 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class476
{
    public int anInt6398;
    JS5 aClass210_6399;
    Class129 aClass129_6400 = new Class129(64);
    
    public Class467 method10905(int i) {
	Class467 class467;
	synchronized (((Class476) this).aClass129_6400) {
	    class467 = ((Class467)
			((Class476) this).aClass129_6400.get((long) i));
	}
	if (null != class467)
	    return class467;
	byte[] is;
	synchronized (((Class476) this).aClass210_6399) {
	    is = ((Class476) this).aClass210_6399.getfile(((Js5ConfigGroup
							       .aClass37_385
							       .id)
							      * -1379677837),
							     i, -175680609);
	}
	class467 = new Class467();
	((Class467) class467).anInt6319 = i * 2137468395;
	if (null != is)
	    class467.method10733(new RSByteBuffer(is), -297417533);
	class467.method10726((byte) -26);
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.put(class467, (long) i);
	}
	return class467;
    }
    
    public Class467 method10906(int i, int i_0_) {
	Class467 class467;
	synchronized (((Class476) this).aClass129_6400) {
	    class467 = ((Class467)
			((Class476) this).aClass129_6400.get((long) i));
	}
	if (null != class467)
	    return class467;
	byte[] is;
	synchronized (((Class476) this).aClass210_6399) {
	    is = ((Class476) this).aClass210_6399.getfile(((Js5ConfigGroup
							       .aClass37_385
							       .id)
							      * -1379677837),
							     i, 1519852579);
	}
	class467 = new Class467();
	((Class467) class467).anInt6319 = i * 2137468395;
	if (null != is)
	    class467.method10733(new RSByteBuffer(is), 475975748);
	class467.method10726((byte) -126);
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.put(class467, (long) i);
	}
	return class467;
    }
    
    public void method10907(byte i) {
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.reset(-1046278787);
	}
    }
    
    public void method10908(int i, int i_1_) {
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.clean(i, -2081468765);
	}
    }
    
    public void method10909(byte i) {
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.removeSoftReferences((byte) 54);
	}
    }
    
    public Class467 method10910(int i) {
	Class467 class467;
	synchronized (((Class476) this).aClass129_6400) {
	    class467 = ((Class467)
			((Class476) this).aClass129_6400.get((long) i));
	}
	if (null != class467)
	    return class467;
	byte[] is;
	synchronized (((Class476) this).aClass210_6399) {
	    is = ((Class476) this).aClass210_6399.getfile(((Js5ConfigGroup
							       .aClass37_385
							       .id)
							      * -1379677837),
							     i, 450328548);
	}
	class467 = new Class467();
	((Class467) class467).anInt6319 = i * 2137468395;
	if (null != is)
	    class467.method10733(new RSByteBuffer(is), -1361217956);
	class467.method10726((byte) -81);
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.put(class467, (long) i);
	}
	return class467;
    }
    
    public Class467 method10911(int i) {
	Class467 class467;
	synchronized (((Class476) this).aClass129_6400) {
	    class467 = ((Class467)
			((Class476) this).aClass129_6400.get((long) i));
	}
	if (null != class467)
	    return class467;
	byte[] is;
	synchronized (((Class476) this).aClass210_6399) {
	    is = ((Class476) this).aClass210_6399.getfile(((Js5ConfigGroup
							       .aClass37_385
							       .id)
							      * -1379677837),
							     i, -839771855);
	}
	class467 = new Class467();
	((Class467) class467).anInt6319 = i * 2137468395;
	if (null != is)
	    class467.method10733(new RSByteBuffer(is), -844475405);
	class467.method10726((byte) -67);
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.put(class467, (long) i);
	}
	return class467;
    }
    
    public void method10912() {
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.reset(-763903743);
	}
    }
    
    public void method10913(int i) {
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.clean(i, -2116359939);
	}
    }
    
    public void method10914() {
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.reset(-705073967);
	}
    }
    
    public Class476(GameDefinition class471, Language class437, JS5 class210) {
	((Class476) this).aClass210_6399 = class210;
	anInt6398
	    = (((Class476) this).aClass210_6399.getContainerCount((-1379677837
							    * (Js5ConfigGroup
							       .aClass37_385
							       .id)),
							   (byte) -100)
	       * -1632224691);
    }
    
    public void method10915() {
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.removeSoftReferences((byte) 104);
	}
    }
    
    public void method10916() {
	synchronized (((Class476) this).aClass129_6400) {
	    ((Class476) this).aClass129_6400.removeSoftReferences((byte) -54);
	}
    }
}
