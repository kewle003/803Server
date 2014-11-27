/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class308
{
    Map aMap4815 = new HashMap();
    Class393 aClass393_4816;
    
    public Class322 method5855(int i, int i_0_, float f,
			       Interface29 interface29) {
	if (method5858(i, (byte) 0) != null)
	    return null;
	Class322 class322 = null;
	if (-1 != i_0_)
	    class322 = method5858(i_0_, (byte) 0);
	Object object
	    = ((Class308) this).aClass393_4816.method7040(class322, -31177373);
	Class322 class322_1_
	    = new Class322(i, f, object, this, interface29, class322);
	((Class308) this).aMap4815.put(Integer.valueOf(i), class322_1_);
	return class322_1_;
    }
    
    public void method5856(int i) {
	Iterator iterator = ((Class308) this).aMap4815.values().iterator();
	while (iterator.hasNext()) {
	    Class322 class322 = (Class322) iterator.next();
	    class322.method5944(-357028700);
	}
    }
    
    public Class322 method5857(int i, int i_2_, float f,
			       Interface29 interface29, int i_3_) {
	if (method5858(i, (byte) 0) != null)
	    return null;
	Class322 class322 = null;
	if (-1 != i_2_)
	    class322 = method5858(i_2_, (byte) 0);
	Object object
	    = ((Class308) this).aClass393_4816.method7040(class322, -31177373);
	Class322 class322_4_
	    = new Class322(i, f, object, this, interface29, class322);
	((Class308) this).aMap4815.put(Integer.valueOf(i), class322_4_);
	return class322_4_;
    }
    
    public Class322 method5858(int i, byte i_5_) {
	return (Class322) ((Class308) this).aMap4815.get(Integer.valueOf(i));
    }
    
    public void method5859() {
	Iterator iterator = ((Class308) this).aMap4815.values().iterator();
	while (iterator.hasNext()) {
	    Class322 class322 = (Class322) iterator.next();
	    class322.method5944(-13339464);
	}
    }
    
    public void method5860() {
	Iterator iterator = ((Class308) this).aMap4815.values().iterator();
	while (iterator.hasNext()) {
	    Class322 class322 = (Class322) iterator.next();
	    class322.method5944(-965440883);
	}
    }
    
    public void method5861() {
	Iterator iterator = ((Class308) this).aMap4815.values().iterator();
	while (iterator.hasNext()) {
	    Class322 class322 = (Class322) iterator.next();
	    class322.method5944(330161194);
	}
    }
    
    public Class322 method5862(int i, int i_6_, float f,
			       Interface29 interface29) {
	if (method5858(i, (byte) 0) != null)
	    return null;
	Class322 class322 = null;
	if (-1 != i_6_)
	    class322 = method5858(i_6_, (byte) 0);
	Object object
	    = ((Class308) this).aClass393_4816.method7040(class322, -31177373);
	Class322 class322_7_
	    = new Class322(i, f, object, this, interface29, class322);
	((Class308) this).aMap4815.put(Integer.valueOf(i), class322_7_);
	return class322_7_;
    }
    
    public Class322 method5863(int i, int i_8_, float f,
			       Interface29 interface29) {
	if (method5858(i, (byte) 0) != null)
	    return null;
	Class322 class322 = null;
	if (-1 != i_8_)
	    class322 = method5858(i_8_, (byte) 0);
	Object object
	    = ((Class308) this).aClass393_4816.method7040(class322, -31177373);
	Class322 class322_9_
	    = new Class322(i, f, object, this, interface29, class322);
	((Class308) this).aMap4815.put(Integer.valueOf(i), class322_9_);
	return class322_9_;
    }
    
    public Class308(Class393 class393) {
	((Class308) this).aClass393_4816 = class393;
    }
    
    public Class322 method5864(int i) {
	return (Class322) ((Class308) this).aMap4815.get(Integer.valueOf(i));
    }
    
    public Class322 method5865(int i, int i_10_, float f,
			       Interface29 interface29) {
	if (method5858(i, (byte) 0) != null)
	    return null;
	Class322 class322 = null;
	if (-1 != i_10_)
	    class322 = method5858(i_10_, (byte) 0);
	Object object
	    = ((Class308) this).aClass393_4816.method7040(class322, -31177373);
	Class322 class322_11_
	    = new Class322(i, f, object, this, interface29, class322);
	((Class308) this).aMap4815.put(Integer.valueOf(i), class322_11_);
	return class322_11_;
    }
    
    public Class322 method5866(int i) {
	return (Class322) ((Class308) this).aMap4815.get(Integer.valueOf(i));
    }
    
    public void method5867() {
	Iterator iterator = ((Class308) this).aMap4815.values().iterator();
	while (iterator.hasNext()) {
	    Class322 class322 = (Class322) iterator.next();
	    class322.method5944(379391459);
	}
    }
    
    static final void createComponent/*method5868*/(ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= 915295493;
		int parentHash = scriptData.integerStack[scriptData.intStackPointer * 1482319719];
		int type = scriptData.integerStack[1 + scriptData.intStackPointer * 1482319719];
		int childID = scriptData.integerStack[2 + 1482319719 * scriptData.intStackPointer];
		Js5ConfigGroup.getInterfaceComponent(parentHash, (byte) -68);
		Class134.createComponent(Class187.aClass35Array2203[parentHash >>> 16],
				parentHash & 0xffff, type, childID,
				scriptData.aBool6246, scriptData, (byte) 0);
    }
    
    static final void method5869(ClientScriptData class454, int i) {
	int i_15_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_15_, (byte) -3);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_15_ >> 16];
	Class582.method12770(class58, class35, class454, (byte) 103);
    }
    
    static final void storeClanMemberName/*method5870*/(ClientScriptData scriptData, byte i) {
    	int index = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
    	scriptData.objectStack[(scriptData.objectStackPointer += -1650705371) * -290357331 - 1]
    			= scriptData.clanSettings.clanMemberNames[index];
    }
    
    static final void method5871(ClientScriptData class454, int i) {
	int i_17_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_17_, (byte) -12);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1687836431 * class58.colour;
    }
    
    public static long method5872(int i, int i_18_, int i_19_, int i_20_,
				  int i_21_, int i_22_, short i_23_) {
	Class638.aCalendar8253.clear();
	Class638.aCalendar8253.set(i_22_, i_21_, i_20_, i_19_, i_18_, i);
	return Class638.aCalendar8253.getTime().getTime();
    }
    
    public static void method5873(int i) {
	Class393.aShort5766 = client.aShort8476;
	Class222.aShort2590 = client.aShort8558;
	Class202.aShort2413 = client.aShort8555;
	Class120_Sub21.aShort10623 = client.aShort8556;
	Class104.aBool1482 = true;
	Class104.anInt1483
	    = Class402.soundManager.method1164(-530598395) * -1512989891;
	if (0 != -473060273 * Class104.anInt1481
	    && 0 != Class104.anInt1478 * -289277799) {
	    client.aShort8555 = (short) 334;
	    client.aShort8556 = (short) 334;
	    client.aShort8558 = client.aShort8476
		= (short) (-1688691200 * Class104.anInt1481
			   / (Class104.anInt1478 * -289277799));
	}
    }
    
    static final void method5874(int i) {
	Class639.aClass58Array8261 = null;
	Class67.method1647(client.anInt8466 * 1629309841, 0, 0,
			   -1080559003 * Class494.canvasWid,
			   963058943 * Class67.canvasHei, 0, 0, -1, (byte) 79);
	if (Class639.aClass58Array8261 != null) {
	    Class64.method1632(Class639.aClass58Array8261, -1412584499, 0, 0,
			       -1080559003 * Class494.canvasWid,
			       Class67.canvasHei * 963058943,
			       Class424.anInt6069 * -1458583115,
			       449221973 * Class463.anInt6289,
			       (client.aClass58_8499 == Class634.aClass58_8065
				? -1
				: (client.aClass58_8499.anInt1010
				   * -2057625155)),
			       true, -1519548783);
	    Class639.aClass58Array8261 = null;
	}
    }
    
    public static final void closeInterface/*method5875*/(boolean bool, byte i) {
		Class241_Sub27 packet = Class445_Sub26.makePacket(
				OutgoingOpcode.CLOSE_INTERFACE_PACKET,
				client.aClass190_8340.packetCipher, 16711935);
		client.aClass190_8340.sendPacket(packet, -1666416835);
		for (Class241_Sub11 class241_sub11 = ((Class241_Sub11) client.aClass407_8467.method7294(2090894173));
		     class241_sub11 != null;
		     class241_sub11 = ((Class241_Sub11)
				       client.aClass407_8467.method7295(-342727115))) {
		    if (!class241_sub11.hasNext((byte) 98)) {
		    	class241_sub11 = (Class241_Sub11) client.aClass407_8467.method7294(2090894173);
				if (class241_sub11 == null) {
				    break;
				}
		    }
		    if (0 == class241_sub11.clipped * 1233847279) {
		    	Class40.method1047(class241_sub11, true, bool, -1391450971);
		    }
		}
		if (null != client.aClass58_8384) {
		    WorldType.refreshComponent(client.aClass58_8384, 693614440);
		    client.aClass58_8384 = null;
		}
    }
    
    static final void method5876(ClientScriptData class454, byte i) {
	int i_24_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_24_, (byte) -119);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -448902767 * class58.anInt809;
    }
    
    static final void method5877(ClientScriptData class454, int i) {
	int i_25_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (i_25_ == 0)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class573_Sub1.aBool8772 ? 1 : 0;
	else if (i_25_ == 1)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class573_Sub1.aBool8791 ? 1 : 0;
	else if (i_25_ == 2)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class573_Sub1.aBool8792 ? 1 : 0;
	else
	    throw new RuntimeException();
    }
}
