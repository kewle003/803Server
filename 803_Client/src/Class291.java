/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class Class291 implements Runnable
{
    Class410 aClass410_4484 = new Class410();
    boolean aBool4485;
    int anInt4486 = 0;
    Thread aThread4487;
    public static int anInt4488;
    
    Class241_Sub39_Sub5_Sub1 method5665(int i, Class568 class568, byte i_0_) {
	Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1
	    = new Class241_Sub39_Sub5_Sub1();
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).anInt11267
	    = 452010955;
	class241_sub39_sub5_sub1.aLong10147 = (long) i * 7038950999658635139L;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aClass568_11264
	    = class568;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).urgent
	    = false;
	method5669(class241_sub39_sub5_sub1, (byte) 120);
	return class241_sub39_sub5_sub1;
    }
    
    Class241_Sub39_Sub5_Sub1 method5666(int i, Class568 class568, int i_1_) {
	Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1
	    = new Class241_Sub39_Sub5_Sub1();
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).anInt11267
	    = -1280985447;
	synchronized (((Class291) this).aClass410_4484) {
	    for (Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1_2_
		     = (Class241_Sub39_Sub5_Sub1) ((Class291) this)
						      .aClass410_4484
						      .method7440(-1397088259);
		 class241_sub39_sub5_sub1_2_ != null;
		 class241_sub39_sub5_sub1_2_
		     = (Class241_Sub39_Sub5_Sub1) ((Class291) this)
						      .aClass410_4484
						      .method7435((byte) -1)) {
		if ((class241_sub39_sub5_sub1_2_.aLong10147
		     * 251842045416236843L) == (long) i
		    && class568 == (((Class241_Sub39_Sub5_Sub1)
				     class241_sub39_sub5_sub1_2_)
				    .aClass568_11264)
		    && 2 == (((Class241_Sub39_Sub5_Sub1)
			      class241_sub39_sub5_sub1_2_).anInt11267
			     * -354927191)) {
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aByteArray11269
			= ((Class241_Sub39_Sub5_Sub1)
			   class241_sub39_sub5_sub1_2_).aByteArray11269;
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aBool10839
			= false;
		    Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1_3_
			= class241_sub39_sub5_sub1;
		    return class241_sub39_sub5_sub1_3_;
		}
	    }
	}
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aByteArray11269
	    = class568.method12461(i, -1553863495);
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aBool10839
	    = false;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).urgent
	    = true;
	return class241_sub39_sub5_sub1;
    }
    
    Class241_Sub39_Sub5_Sub1 method5667(int i, byte[] is, Class568 class568,
					int i_4_) {
	Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1
	    = new Class241_Sub39_Sub5_Sub1();
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).anInt11267
	    = 1732996402;
	class241_sub39_sub5_sub1.aLong10147 = (long) i * 7038950999658635139L;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aByteArray11269
	    = is;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aClass568_11264
	    = class568;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).urgent
	    = false;
	method5669(class241_sub39_sub5_sub1, (byte) 35);
	return class241_sub39_sub5_sub1;
    }
    
    public void method5668() {
	((Class291) this).aBool4485 = true;
	synchronized (((Class291) this).aClass410_4484) {
	    ((Class291) this).aClass410_4484.notifyAll();
	}
	try {
	    ((Class291) this).aThread4487.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	((Class291) this).aThread4487 = null;
    }
    
    void method5669(Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1,
		    byte i) {
	synchronized (((Class291) this).aClass410_4484) {
	    ((Class291) this).aClass410_4484
		.method7431(class241_sub39_sub5_sub1, (byte) -45);
	    ((Class291) this).anInt4486 += -1866001993;
	    ((Class291) this).aClass410_4484.notifyAll();
	}
    }
    
    public void run() {
	while (!((Class291) this).aBool4485) {
	    Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1;
	    synchronized (((Class291) this).aClass410_4484) {
		class241_sub39_sub5_sub1
		    = ((Class241_Sub39_Sub5_Sub1)
		       ((Class291) this).aClass410_4484.method7432(16777472));
		if (null != class241_sub39_sub5_sub1)
		    ((Class291) this).anInt4486 -= -1866001993;
		else {
		    try {
			((Class291) this).aClass410_4484.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if ((((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
		     .anInt11267) * -354927191
		    == 2)
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aClass568_11264.method12471
			((int) (251842045416236843L
				* class241_sub39_sub5_sub1.aLong10147),
			 (((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			  .aByteArray11269),
			 (((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			  .aByteArray11269).length,
			 -1961974377);
		else if (-354927191 * ((Class241_Sub39_Sub5_Sub1)
				       class241_sub39_sub5_sub1).anInt11267
			 == 3)
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aByteArray11269
			= (((Class241_Sub39_Sub5_Sub1)
			    class241_sub39_sub5_sub1)
			       .aClass568_11264.method12461
			   ((int) (251842045416236843L
				   * class241_sub39_sub5_sub1.aLong10147),
			    98120481));
	    } catch (Exception exception) {
		VarType.method3770(null, exception, 67546509);
	    }
	    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aBool10839
		= false;
	}
    }
    
    public int method5670(byte i) {
	synchronized (((Class291) this).aClass410_4484) {
	    int i_5_ = -162161657 * ((Class291) this).anInt4486;
	    return i_5_;
	}
    }
    
    public void method5671(int i) {
	((Class291) this).aBool4485 = true;
	synchronized (((Class291) this).aClass410_4484) {
	    ((Class291) this).aClass410_4484.notifyAll();
	}
	try {
	    ((Class291) this).aThread4487.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	((Class291) this).aThread4487 = null;
    }
    
    public void method5672() {
	while (!((Class291) this).aBool4485) {
	    Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1;
	    synchronized (((Class291) this).aClass410_4484) {
		class241_sub39_sub5_sub1
		    = ((Class241_Sub39_Sub5_Sub1)
		       ((Class291) this).aClass410_4484.method7432(16777472));
		if (null != class241_sub39_sub5_sub1)
		    ((Class291) this).anInt4486 -= -1866001993;
		else {
		    try {
			((Class291) this).aClass410_4484.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if ((((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
		     .anInt11267) * -354927191
		    == 2)
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aClass568_11264.method12471
			((int) (251842045416236843L
				* class241_sub39_sub5_sub1.aLong10147),
			 (((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			  .aByteArray11269),
			 (((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			  .aByteArray11269).length,
			 -1961974377);
		else if (-354927191 * ((Class241_Sub39_Sub5_Sub1)
				       class241_sub39_sub5_sub1).anInt11267
			 == 3)
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aByteArray11269
			= (((Class241_Sub39_Sub5_Sub1)
			    class241_sub39_sub5_sub1)
			       .aClass568_11264.method12461
			   ((int) (251842045416236843L
				   * class241_sub39_sub5_sub1.aLong10147),
			    -383443695));
	    } catch (Exception exception) {
		VarType.method3770(null, exception, 273861200);
	    }
	    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aBool10839
		= false;
	}
    }
    
    public void method5673() {
	while (!((Class291) this).aBool4485) {
	    Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1;
	    synchronized (((Class291) this).aClass410_4484) {
		class241_sub39_sub5_sub1
		    = ((Class241_Sub39_Sub5_Sub1)
		       ((Class291) this).aClass410_4484.method7432(16777472));
		if (null != class241_sub39_sub5_sub1)
		    ((Class291) this).anInt4486 -= -1866001993;
		else {
		    try {
			((Class291) this).aClass410_4484.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if ((((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
		     .anInt11267) * -354927191
		    == 2)
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aClass568_11264.method12471
			((int) (251842045416236843L
				* class241_sub39_sub5_sub1.aLong10147),
			 (((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			  .aByteArray11269),
			 (((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			  .aByteArray11269).length,
			 -1961974377);
		else if (-354927191 * ((Class241_Sub39_Sub5_Sub1)
				       class241_sub39_sub5_sub1).anInt11267
			 == 3)
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aByteArray11269
			= (((Class241_Sub39_Sub5_Sub1)
			    class241_sub39_sub5_sub1)
			       .aClass568_11264.method12461
			   ((int) (251842045416236843L
				   * class241_sub39_sub5_sub1.aLong10147),
			    -349524325));
	    } catch (Exception exception) {
		VarType.method3770(null, exception, -187872432);
	    }
	    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aBool10839
		= false;
	}
    }
    
    public void method5674() {
	((Class291) this).aBool4485 = true;
	synchronized (((Class291) this).aClass410_4484) {
	    ((Class291) this).aClass410_4484.notifyAll();
	}
	try {
	    ((Class291) this).aThread4487.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	((Class291) this).aThread4487 = null;
    }
    
    public void method5675() {
	while (!((Class291) this).aBool4485) {
	    Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1;
	    synchronized (((Class291) this).aClass410_4484) {
		class241_sub39_sub5_sub1
		    = ((Class241_Sub39_Sub5_Sub1)
		       ((Class291) this).aClass410_4484.method7432(16777472));
		if (null != class241_sub39_sub5_sub1)
		    ((Class291) this).anInt4486 -= -1866001993;
		else {
		    try {
			((Class291) this).aClass410_4484.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if ((((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
		     .anInt11267) * -354927191
		    == 2)
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aClass568_11264.method12471
			((int) (251842045416236843L
				* class241_sub39_sub5_sub1.aLong10147),
			 (((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			  .aByteArray11269),
			 (((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			  .aByteArray11269).length,
			 -1961974377);
		else if (-354927191 * ((Class241_Sub39_Sub5_Sub1)
				       class241_sub39_sub5_sub1).anInt11267
			 == 3)
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aByteArray11269
			= (((Class241_Sub39_Sub5_Sub1)
			    class241_sub39_sub5_sub1)
			       .aClass568_11264.method12461
			   ((int) (251842045416236843L
				   * class241_sub39_sub5_sub1.aLong10147),
			    -1766621884));
	    } catch (Exception exception) {
		VarType.method3770(null, exception, -980664188);
	    }
	    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aBool10839
		= false;
	}
    }
    
    public Class291() {
	((Class291) this).aBool4485 = false;
	((Class291) this).aThread4487 = new Thread(this);
	((Class291) this).aThread4487.setDaemon(true);
	((Class291) this).aThread4487.start();
	((Class291) this).aThread4487.setPriority(1);
    }
    
    Class241_Sub39_Sub5_Sub1 method5676(int i, byte[] is, Class568 class568) {
	Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1
	    = new Class241_Sub39_Sub5_Sub1();
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).anInt11267
	    = 1732996402;
	class241_sub39_sub5_sub1.aLong10147 = (long) i * 7038950999658635139L;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aByteArray11269
	    = is;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aClass568_11264
	    = class568;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).urgent
	    = false;
	method5669(class241_sub39_sub5_sub1, (byte) 7);
	return class241_sub39_sub5_sub1;
    }
    
    Class241_Sub39_Sub5_Sub1 method5677(int i, byte[] is, Class568 class568) {
	Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1
	    = new Class241_Sub39_Sub5_Sub1();
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).anInt11267
	    = 1732996402;
	class241_sub39_sub5_sub1.aLong10147 = (long) i * 7038950999658635139L;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aByteArray11269
	    = is;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aClass568_11264
	    = class568;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).urgent
	    = false;
	method5669(class241_sub39_sub5_sub1, (byte) 46);
	return class241_sub39_sub5_sub1;
    }
    
    Class241_Sub39_Sub5_Sub1 method5678(int i, byte[] is, Class568 class568) {
	Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1
	    = new Class241_Sub39_Sub5_Sub1();
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).anInt11267
	    = 1732996402;
	class241_sub39_sub5_sub1.aLong10147 = (long) i * 7038950999658635139L;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aByteArray11269
	    = is;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aClass568_11264
	    = class568;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).urgent
	    = false;
	method5669(class241_sub39_sub5_sub1, (byte) 29);
	return class241_sub39_sub5_sub1;
    }
    
    void method5679(Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1) {
	synchronized (((Class291) this).aClass410_4484) {
	    ((Class291) this).aClass410_4484
		.method7431(class241_sub39_sub5_sub1, (byte) -98);
	    ((Class291) this).anInt4486 += -1866001993;
	    ((Class291) this).aClass410_4484.notifyAll();
	}
    }
    
    public void method5680() {
	while (!((Class291) this).aBool4485) {
	    Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1;
	    synchronized (((Class291) this).aClass410_4484) {
		class241_sub39_sub5_sub1
		    = ((Class241_Sub39_Sub5_Sub1)
		       ((Class291) this).aClass410_4484.method7432(16777472));
		if (null != class241_sub39_sub5_sub1)
		    ((Class291) this).anInt4486 -= -1866001993;
		else {
		    try {
			((Class291) this).aClass410_4484.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if ((((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
		     .anInt11267) * -354927191
		    == 2)
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aClass568_11264.method12471
			((int) (251842045416236843L
				* class241_sub39_sub5_sub1.aLong10147),
			 (((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			  .aByteArray11269),
			 (((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			  .aByteArray11269).length,
			 -1961974377);
		else if (-354927191 * ((Class241_Sub39_Sub5_Sub1)
				       class241_sub39_sub5_sub1).anInt11267
			 == 3)
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aByteArray11269
			= (((Class241_Sub39_Sub5_Sub1)
			    class241_sub39_sub5_sub1)
			       .aClass568_11264.method12461
			   ((int) (251842045416236843L
				   * class241_sub39_sub5_sub1.aLong10147),
			    769652799));
	    } catch (Exception exception) {
		VarType.method3770(null, exception, -989772360);
	    }
	    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aBool10839
		= false;
	}
    }
    
    public int method5681() {
	synchronized (((Class291) this).aClass410_4484) {
	    int i = -162161657 * ((Class291) this).anInt4486;
	    return i;
	}
    }
    
    Class241_Sub39_Sub5_Sub1 method5682(int i, Class568 class568) {
	Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1
	    = new Class241_Sub39_Sub5_Sub1();
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).anInt11267
	    = -1280985447;
	synchronized (((Class291) this).aClass410_4484) {
	    for (Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1_6_
		     = (Class241_Sub39_Sub5_Sub1) ((Class291) this)
						      .aClass410_4484
						      .method7440(-1397088259);
		 class241_sub39_sub5_sub1_6_ != null;
		 class241_sub39_sub5_sub1_6_
		     = (Class241_Sub39_Sub5_Sub1) ((Class291) this)
						      .aClass410_4484
						      .method7435((byte) -1)) {
		if ((class241_sub39_sub5_sub1_6_.aLong10147
		     * 251842045416236843L) == (long) i
		    && class568 == (((Class241_Sub39_Sub5_Sub1)
				     class241_sub39_sub5_sub1_6_)
				    .aClass568_11264)
		    && 2 == (((Class241_Sub39_Sub5_Sub1)
			      class241_sub39_sub5_sub1_6_).anInt11267
			     * -354927191)) {
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aByteArray11269
			= ((Class241_Sub39_Sub5_Sub1)
			   class241_sub39_sub5_sub1_6_).aByteArray11269;
		    ((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1)
			.aBool10839
			= false;
		    Class241_Sub39_Sub5_Sub1 class241_sub39_sub5_sub1_7_
			= class241_sub39_sub5_sub1;
		    return class241_sub39_sub5_sub1_7_;
		}
	    }
	}
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aByteArray11269
	    = class568.method12461(i, 1965335303);
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).aBool10839
	    = false;
	((Class241_Sub39_Sub5_Sub1) class241_sub39_sub5_sub1).urgent
	    = true;
	return class241_sub39_sub5_sub1;
    }
    
    static final void method5683(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	class58.aBool904 = false;
	WorldType.refreshComponent(class58, 1171689784);
    }
    
    static final void method5684(int i) {
		if (1043710575 * client.systemUpdateTimer > 1) {
			client.systemUpdateTimer -= -1917854577;
			client.anInt8271 = -674075855 * client.anInt8494;
		}
		if (client.aClass190_8340.aBool2275) {
			client.aClass190_8340.aBool2275 = false;
			Class199.dropClient(733548576);
		} else {
			if (!Class16.aBool141) {
				Class274.method5345(-368210354);
			}
			for (int i_8_ = 0;
					(i_8_ < 100 && Class325.method5996(client.aClass190_8340, 65280));
					i_8_++) {
				/* empty */
			}
			if (client.anInt8288 * 1766317249 == 19) {
				while (Class10.method580(375393141)) {
					Class241_Sub27 class241_sub27
					= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4066,
									 (client.aClass190_8340
									  .packetCipher),
									 16711935);
					class241_sub27.data
					.writeByte(0, -2072147108);
					int i_9_
					= (class241_sub27.data.pointer
					   * 421967667);
					GPI.method4020((class241_sub27
							 .data),
							-681655468);
					class241_sub27.data.endPacketVarByte
					((class241_sub27.data.pointer
					  * 421967667) - i_9_,
					 928631115);
					client.aClass190_8340.sendPacket(class241_sub27,
									 -1889838890);
				}
				if (Class583.aClass468_7582 != null) {
					if (-1 != Class583.aClass468_7582.anInt6335 * -2078748131) {
						Class241_Sub27 packet = Class445_Sub26.makePacket(
								OutgoingOpcode.CLIENT_SPECS_PACKET,
								client.aClass190_8340.packetCipher, 16711935);
						if (null == Class40.aGarbageCollectorMXBean595
							|| !Class40.aGarbageCollectorMXBean595.isValid()) {
							try {
								Iterator iterator = ManagementFactory.getGarbageCollectorMXBeans ().iterator();
								while (iterator.hasNext()) {
									GarbageCollectorMXBean garbagecollectormxbean = ((GarbageCollectorMXBean) iterator.next());
									if (garbagecollectormxbean.isValid()) {
										Class40.aGarbageCollectorMXBean595 = garbagecollectormxbean;
										client.aLong8382 = -6594977245604296569L;
										client.aLong8578 = 7478820782681760321L;
									}
								}
							} catch (Throwable throwable) {
							/* empty */
							}
						}
						long l = Class50.method1249((byte) 1);
						int i_10_ = -1;
						if (null != Class40.aGarbageCollectorMXBean595) {
							long l_11_ = Class40.aGarbageCollectorMXBean595.getCollectionTime();
							if (-1L != 8140060998999282239L * client.aLong8578) {
								long l_12_ = l_11_ - (client.aLong8578 * 8140060998999282239L);
								long l_13_ = l - (client.aLong8382 * 7665559713957446345L);
								if (0L != l_13_)
									i_10_ = (int) (l_12_ * 100L / l_13_);
							}
							client.aLong8578 = l_11_ * -7478820782681760321L;
							client.aLong8382 = l * 6594977245604296569L;
						}
						packet.data.writeByteA(i_10_, 2071169927);//Heap
						packet.data.writeShortA(//Ping
								-2078748131 * Class583.aClass468_7582.anInt6335, -377993802);
						packet.data.writeByteC(client.currentFpsRate * 2016113751, 868520951);//fps
						client.aClass190_8340.sendPacket(packet, -1999548595);
						Class583.aClass468_7582 = null;
						Class593.aLong7630
							= (30000L + l) * 1028970121568271007L;
					}
				} else if (Class50.method1249((byte) 1)
					   >= Class593.aLong7630 * 3022506747164844383L)
					Class583.aClass468_7582
					= client.aClass463_8344.method10661((Class193
										 .aClass397_2297
										 .aString5786),
										227852321);
				Class254.method5036((short) 22556);
				Class222.method4483((byte) 51);
				Class241_Sub24 class241_sub24
					= ((Class241_Sub24)
					   client.aClass429_8311.method7694(16711935));
				if (client.aClass238_8477.method4751(-1360680080) != null) {
					if (Class296.anInt4513 * 115241065 == 1)
					Class25.method940(-369116268);
					else if (6 == 115241065 * Class296.anInt4513)
					Class515.method11603(1864761948);
				}
				if (client.aBool8388)
					client.aBool8388 = false;
				else
					client.aFloat8356 /= 2.0F;
				if (client.aBool8280)
					client.aBool8280 = false;
				else
					client.aFloat8394 /= 2.0F;
				if (Class518.method11661(1913716201))
					Class65.method1635(-1663342685);
				else if (4 == 115241065 * Class296.anInt4513) {
					GameScene class522
					= client.aClass238_8477.method4806((byte) 1);
					int i_14_ = class522.baseX * 127679513 << 9;
					int i_15_ = 468558693 * class522.baseY << 9;
					if (1712881158198858679L * Class322.aLong4910 <= 0L)
					Class322.aLong4910 = (Class50.method1249((byte) 1)
								  * 8538800743975565831L);
					float f = (float) (Class50.method1249((byte) 1)
							   - (Class322.aLong4910
							  * 1712881158198858679L));
					int i_16_ = 1000 / Class70.method1725(-515961130);
					i_16_ *= 1.25;
					for (/**/; f > 0.0F; f -= (float) i_16_) {
					float f_17_ = Math.min(f, (float) i_16_);
					Class445_Sub16.aClass351_Sub1_8660.method6255
						(f_17_ / 1000.0F,
						 (client.aClass238_8477.method4759(-35878102)
						  .anIntArrayArrayArray4562),
						 client.aClass238_8477.method4753((byte) -117),
						 i_14_, i_15_, -1742751015);
					}
					Class322.aLong4910
					= Class50.method1249((byte) 1) * 8538800743975565831L;
				}
				HitMarkTypeList.method12293(1339850374);
				if (1766317249 * client.anInt8288 == 19) {
					client.aClass238_8477.method4833(-1128855379)
					.method11377(client.aClass238_8477, 88110544);
					Class551.method12097((byte) -50);
					if (client.anInt8554 * -1320229573 > 10)
					((ServerConnection) client.aClass190_8340).anInt2269
						+= -1897901625;
					if ((((ServerConnection) client.aClass190_8340).anInt2269
					 * 1728454647)
					> 2250)
					Class199.dropClient(-945064155);
					else {
					if (3 == client.anInt8266 * -831877317) {
						Class350.method6252((byte) 112);
						Class22.method905(-255381426);
					} else if (Class218_Sub3.aClass491_10256
							   .anInterface54_6514.method423
						   (class241_sub24,
							client.anInterface58Array8318,
							802559093 * client.anInt8317,
							Class119.aClass578_1564, 266547939))
						Class22.method899(false, 1044032998);
					else {
						if (client.anInt8266 * -831877317 == 0
						&& Class120_Sub23.method16855((2040707973
										   * (client
										  .anInt8352)),
										  2080785461)) {
						client.aClass238_8477.setMapScene
							(new Class234(MapType.aClass235_2701,
								  null),
							 2045681122);
						client.anInt8266 = -1650007066;
						}
						if (2 == client.anInt8266 * -831877317
						&& 9 != client.anInt8288 * 1766317249) {
						Class104.aClass407_1480.method7293(1006181481);
						client.anInt8266 = 994953164;
						client.anInt8332
							= 1905889125 * client.anInt8296;
						client.anInt8575 = 0;
						client.aBool8354 = false;
						Class308.method5873(1437292906);
						}
						if (client.anInt8266 * -831877317 == 4) {
						int i_18_ = (client.anInt8296
								 - 599001709 * client.anInt8332);
						if (client.anInt8575 * -1456140803
							< Class104.aClass120Array1479.length) {
							do {
							Class120 class120
								= (Class104.aClass120Array1479
								   [(client.anInt8575
								 * -1456140803)]);
							if (class120.anInt1565 * -1616509629
								> i_18_)
								break;
							class120.method2958(-1283122770);
							} while (client.anInt8266 * -831877317 == 4
								 && ((client.anInt8575
								  += 2117416789) * -1456140803
								 < (Class104
									.aClass120Array1479).length));
						}
						if (client.anInt8266 * -831877317 == 4) {
							for (int i_19_ = 0;
							 (i_19_
							  < Class25.aClass93Array213.length);
							 i_19_++) {
							Class93 class93
								= Class25.aClass93Array213[i_19_];
							if (class93.aBool1323) {
								Entity class475_sub1_sub1_sub3
								= class93
									  .method2083(-566058819);
								Class120_Sub4.method15604
								(class475_sub1_sub1_sub3, true,
								 (byte) 2);
							}
							}
						}
						}
					}
					Class123.method2993(-799408084);
					Class70.method1729(-198214668);
					Class120_Sub19.method16843(-1538735320);
					RSAKeys.method861(false, (byte) 66);
					Class218_Sub1.method16528(Class236.aClass103_2713,
								  Class234.aClass107_2699,
								  439139681);
					client.anInt8515 += 1460270017;
					if (client.anInt8417 * -345380151 != 0) {
						client.anInt8416 += 1592666028;
						if (1862316495 * client.anInt8416 >= 400)
						client.anInt8417 = 0;
					}
					if (Class566.aClass58_7322 != null) {
						client.anInt8274 += -167372623;
						if (1187065937 * client.anInt8274 >= 15) {
						WorldType.refreshComponent(Class566.aClass58_7322,
									 579195114);
						Class566.aClass58_7322 = null;
						}
					}
					client.aClass58_8481 = null;
					client.aBool8487 = false;
					client.aBool8505 = false;
					Class417.aClass58_6019 = null;
					Class637.method13532(null, -1, -1, (byte) -67);
					if (!client.aBool8544) {
						client.anInt8458 = -1675324311;
					}
					Class38.method1032(1718788017);
					client.anInt8494 += -1142137609;
					if (client.aBool8518) {
						Class241_Sub27 packet = Class445_Sub26.makePacket(
								OutgoingOpcode.aClass253_4009,
								client.aClass190_8340.packetCipher, 16711935);
						packet.data.writeIntV2(
								(SparseVarDomain.anInt1619 * -87032705 << 28
									| InvTypeList.anInt7835 * -1019310987 << 14
									| ScriptVarType.anInt4787 * -888662077),
								-1833782877);
						client.aClass190_8340.sendPacket(packet, -1696576844);
						client.aBool8518 = false;
					}
					for (;;) {
						ClientScriptCaller scriptCaller
							= ((ClientScriptCaller) client.aClass429_8389.getNext(-1689753483));
						if (null == scriptCaller) {
							break;
						}
						InterfaceComponent component = scriptCaller.component;
						if (-389932081 * component.slot1 >= 0) {
							InterfaceComponent class58_20_
								= Js5ConfigGroup.getInterfaceComponent((-152977625 * component.parentNode),
									 (byte) -48);
						if (class58_20_ == null
							|| class58_20_.aClass58Array836 == null
							|| (-389932081 * component.slot1
							>= class58_20_.aClass58Array836.length)
							|| ((class58_20_.aClass58Array836
							 [-389932081 * component.slot1])
							!= component))
							continue;
						}
						Class42.method1067(scriptCaller, -1992003444);
					}
					for (;;) {
						ClientScriptCaller class241_sub14
						= ((ClientScriptCaller)
						   client.aClass429_8548
							   .getNext(-1253753070));
						if (null == class241_sub14)
						break;
						InterfaceComponent class58 = class241_sub14.component;
						if (-389932081 * class58.slot1 >= 0) {
						InterfaceComponent class58_21_
							= Js5ConfigGroup.getInterfaceComponent((class58.parentNode
									  * -152977625),
									 (byte) -96);
						if (null == class58_21_
							|| class58_21_.aClass58Array836 == null
							|| (class58.slot1 * -389932081
							>= class58_21_.aClass58Array836.length)
							|| ((class58_21_.aClass58Array836
							 [class58.slot1 * -389932081])
							!= class58))
							continue;
						}
						Class42.method1067(class241_sub14, -1282788624);
					}
					for (;;) {
						ClientScriptCaller class241_sub14
						= ((ClientScriptCaller)
						   client.aClass429_8541
							   .getNext(-1970422428));
						if (class241_sub14 == null)
						break;
						InterfaceComponent class58 = class241_sub14.component;
						if (-389932081 * class58.slot1 >= 0) {
						InterfaceComponent class58_22_
							= Js5ConfigGroup.getInterfaceComponent((-152977625
									  * class58.parentNode),
									 (byte) -109);
						if (null == class58_22_
							|| class58_22_.aClass58Array836 == null
							|| (-389932081 * class58.slot1
							>= class58_22_.aClass58Array836.length)
							|| ((class58_22_.aClass58Array836
							 [class58.slot1 * -389932081])
							!= class58))
							continue;
						}
						Class42.method1067(class241_sub14, -1197867398);
					}
					if (null == Class417.aClass58_6019)
						client.anInt8439 = 0;
					if (null != client.aClass58_8365)
						VarType.method3769(-952138302);
					Class260.method5083(1461367093);
					if (482866503 * client.playerRights > 0
						&& Class119.aClass578_1564.isKeyPressed(82,
										   -1016346882)
						&& Class119.aClass578_1564.isKeyPressed(81,
										   -1016346882)
						&& 395781823 * client.anInt8312 != 0) {
						int i_23_
						= ((Class21.myPlayer
							.nodePlane)
						   - client.anInt8312 * 395781823);
						if (i_23_ < 0)
						i_23_ = 0;
						else if (i_23_ > 3)
						i_23_ = 3;
						GameScene class522
						= client.aClass238_8477.method4806((byte) 1);
						Class22.method903
						(i_23_,
						 ((Class21.myPlayer
						   .scenePositionXQueue[0])
						  + 127679513 * class522.baseX),
						 (class522.baseY * 468558693
						  + (Class21.myPlayer
							 .scenePositionYQueue[0])),
						 (byte) -48);
					}
					for (int i_24_ = 0; i_24_ < 5; i_24_++)
						client.anIntArray8550[i_24_]++;
					if (Class473.varClientDomain.aBool9851
						&& ((953346207998596737L
						 * Class473.varClientDomain.aLong9857)
						< Class50.method1249((byte) 1) - 60000L))
						Class85.method1845((byte) 3);
					Class473.varClientDomain.method16183(929667653);
					for (Class247_Sub3 class247_sub3
						 = (Class247_Sub3) client.aClass421_8568
									   .method7525(456617894);
						 class247_sub3 != null;
						 class247_sub3 = ((Class247_Sub3)
								  client.aClass421_8568
								  .method7526(-1857895576))) {
						if ((long) ((((Class247_Sub3) class247_sub3)
							 .anInt10082)
							* -1368629837)
						< Class50.method1249((byte) 1) / 1000L - 5L) {
						if (((Class247_Sub3) class247_sub3).aShort10080
							> 0)
							Class318.appendChatboxMessage
							(5, 0, "", "", "",
							 new StringBuilder().append
								 (((Class247_Sub3) class247_sub3)
								  .aString10081)
								 .append
								 (ClientMessage.FRIENDLOGIN
								  .getLocalisedMessage
								  (VarPlayerDomain.currentLocale,
								   (short) 21720))
								 .toString(),
							 -1552961331);
						if (((Class247_Sub3) class247_sub3).aShort10080
							== 0)
							Class318.appendChatboxMessage
							(5, 0, "", "", "",
							 new StringBuilder().append
								 (((Class247_Sub3) class247_sub3)
								  .aString10081)
								 .append
								 (ClientMessage.FRIENDLOGOUT
								  .getLocalisedMessage
								  (VarPlayerDomain.currentLocale,
								   (short) 29421))
								 .toString(),
							 -1678811901);
						class247_sub3.method4944((byte) -72);
						}
					}
					client.anInt8374 += 1468345523;
					if (-1979882885 * client.anInt8374 > 500) {
						client.anInt8374 = 0;
						int i_25_ = (int) (Math.random() * 8.0);
						if (1 == (i_25_ & 0x1))
						client.anInt8491
							+= -1291335545 * client.anInt8375;
						if ((i_25_ & 0x2) == 2)
						client.anInt8370
							+= client.anInt8371 * -1524898297;
						if (4 == (i_25_ & 0x4))
						client.anInt8521
							+= client.anInt8373 * -672927281;
					}
					if (1643420029 * client.anInt8491 < -54)
						client.anInt8375 = 1609604998;
					if (client.anInt8491 * 1643420029 > 53)
						client.anInt8375 = -1609604998;
					if (client.anInt8370 * -1397076359 < -55)
						client.anInt8371 = -444549282;
					if (-1397076359 * client.anInt8370 > 63)
						client.anInt8371 = 444549282;
					if (1832425067 * client.anInt8521 < -42)
						client.anInt8373 = -1246730931;
					if (1832425067 * client.anInt8521 > 40)
						client.anInt8373 = 1246730931;
					client.anInt8379 += -393829359;
					if (6474993 * client.anInt8379 > 502) {
						client.anInt8379 = 0;
						int i_26_ = (int) (Math.random() * 8.0);
						if (1 == (i_26_ & 0x1))
						client.anInt8513
							+= client.anInt8463 * 2020396967;
						if (2 == (i_26_ & 0x2))
						client.anInt8377
							+= client.anInt8493 * -2036518465;
					}
					if (client.anInt8513 * 390680985 < -65)
						client.anInt8463 = -1238570402;
					if (390680985 * client.anInt8513 > 68)
						client.anInt8463 = 1238570402;
					if (client.anInt8377 * 1747300637 < -22)
						client.anInt8493 = 452594187;
					if (client.anInt8377 * 1747300637 > 12)
						client.anInt8493 = -452594187;
					client.aClass190_8340.anInt2262 += 1768708987;
					if (1352485811 * client.aClass190_8340.anInt2262
						> 50) {
						Class241_Sub27 class241_sub27
						= Class445_Sub26.makePacket((OutgoingOpcode
										  .PING_PACKET),
										 (client
										  .aClass190_8340
										  .packetCipher),
										 16711935);
						client.aClass190_8340.sendPacket(class241_sub27,
										 -1873055800);
					}
					if (client.aBool8343) {
						ClanChannelDelta.method6944(-2145292621);
						client.aBool8343 = false;
					}
					try {
						client.aClass190_8340.method3894((byte) 100);
					} catch (IOException ioexception) {
									ioexception.printStackTrace();
						Class199.dropClient(-2119021074);
					}
					}
				}
			}
		}
    }
    
    public static void method5685(boolean bool, int i) {
	if (bool) {
	    if (-1 != 1629309841 * client.anInt8466)
		Class451.method10535(1629309841 * client.anInt8466,
				     (byte) -19);
	    for (Class241_Sub11 class241_sub11
		     = ((Class241_Sub11)
			client.aClass407_8467.method7294(2090894173));
		 null != class241_sub11;
		 class241_sub11
		     = ((Class241_Sub11)
			client.aClass407_8467.method7295(2112212147))) {
		if (!class241_sub11.hasNext((byte) 67)) {
		    class241_sub11
			= ((Class241_Sub11)
			   client.aClass407_8467.method7294(2090894173));
		    if (class241_sub11 == null)
			break;
		}
		Class40.method1047(class241_sub11, true, false, -1530953398);
	    }
	    client.anInt8466 = -1376966001;
	    client.aClass407_8467 = new HashTable(8);
	    Class339.method6120(1094481360);
	    client.anInt8466 = -214927579 * Class128.aClass513_1589.login_interface;
	    if (-1 != 1629309841 * client.anInt8466) {
			Class105_Sub1_Sub3_Sub1.method17885(false, -1963781630);
			Class69.method1683((byte) 14);
			Class107.method2686(client.anInt8466 * 1629309841, null, -578799681);
	    }
	}
	Class277.method5372(850948475);
	Class13.hasLobby = false;
	Class598.method13133(-2053161307);
	client.anInt8458 = -1675324311;
	Class241_Sub23.setCursor(client.anInt8383 * -1459654511, 821079114);
	Class21.myPlayer
	    = new Player(null);
	Class21.myPlayer.method10880
	    ((float) (client.aClass238_8477.method4744(-1974634091) * 512 / 2),
	     0.0F,
	     (float) (client.aClass238_8477.method4745(682710068) * 512 / 2));
	Class21.myPlayer.scenePositionXQueue[0]
	    = client.aClass238_8477.method4744(-1840506165) / 2;
	Class21.myPlayer.scenePositionYQueue[0]
	    = client.aClass238_8477.method4745(-1556606305) / 2;
	Class636.anInt8248 = 0;
	Class462.anInt6284 = 0;
	if (Class296.anInt4513 * 115241065 == 1) {
	    Class462.anInt6284
		= (Class563.anInt7304 * -1773918963 << 9) * 1680747237;
	    Class636.anInt8248
		= (Class473.anInt6379 * -845335575 << 9) * -1181860511;
	} else
	    Class515.method11603(1601140854);
	client.aClass238_8477.method4833(-979973164).method11400(347730101);
    }
}
