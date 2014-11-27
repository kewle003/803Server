/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class4 implements Runnable
{
    volatile String aString14;
    InetAddress anInetAddress15;
    static int anInt16;
    
    Class4(int i) throws UnknownHostException {
	((Class4) this).anInetAddress15
	    = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff),
						    (byte) (i >> 16 & 0xff),
						    (byte) (i >> 8 & 0xff),
						    (byte) (i & 0xff) });
    }
    
    public void method467() {
	((Class4) this).aString14
	    = ((Class4) this).anInetAddress15.getHostName();
    }
    
    public void run() {
	((Class4) this).aString14
	    = ((Class4) this).anInetAddress15.getHostName();
    }
    
    public void method468() {
	((Class4) this).aString14
	    = ((Class4) this).anInetAddress15.getHostName();
    }
    
    public void method469() {
	((Class4) this).aString14
	    = ((Class4) this).anInetAddress15.getHostName();
    }
    
    public String method470(int i) {
	return ((Class4) this).aString14;
    }
    
    public void method471() {
	((Class4) this).aString14
	    = ((Class4) this).anInetAddress15.getHostName();
    }
    
    public static Class593 method472(byte i) {
	Class593_Sub1 class593_sub1;
	try {
	    class593_sub1 = new Class593_Sub1();
	} catch (Throwable throwable) {
	    return new Class593_Sub2();
	}
	return class593_sub1;
    }
    
    static final void method473(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class241_Sub11 class241_sub11
	    = (Class241_Sub11) client.aClass407_8467.get((long) i_0_);
	if (class241_sub11 != null
	    && i_1_ == class241_sub11.interfaceID * -443552671)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    public static void method474
	(Player class475_sub1_sub1_sub3_sub1, int i) {
	Class241_Sub38 class241_sub38
	    = ((Class241_Sub38)
	       (Class241_Sub38.aClass407_10118.get
		((long) (-546698383
			 * class475_sub1_sub1_sub3_sub1.entityIndex))));
	if (class241_sub38 == null)
	    Class612.method13238(class475_sub1_sub1_sub3_sub1.nodePlane,
				 (class475_sub1_sub1_sub3_sub1.scenePositionXQueue
				  [0]),
				 (class475_sub1_sub1_sub3_sub1.scenePositionYQueue
				  [0]),
				 0, null, null, class475_sub1_sub1_sub3_sub1,
				 (byte) 123);
	else
	    class241_sub38.method16432(348472444);
    }
}
