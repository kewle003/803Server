/* Class199_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Map;

//package com.jagex.game.runetek6.config.vartype.bit;
public class VarBitTypeListClient extends Class199 {
    JS5 configClient;//aClass210_10634
    Map<VarDomainType, VarTypeList> listContainer;//aMap10635
    public static final int DEFAULT_CACHE_SIZE = 64;//anInt10636
    Class129 recentUse = new Class129(64);//aClass129_10637
    
    public VarBitType method16864(int i) {
		VarBitType class316;
		synchronized (recentUse) {
		    class316 = (VarBitType) recentUse
					      .get((long) i);
		    if (null == class316) {
			byte[] is = (configClient.getfile
				     (Js5ConfigGroup.VAR_BIT.id * -1379677837, i,
				      -662737270));
			class316 = new VarBitType();
			class316.id = i * -2115085683;
			((VarBitType) class316).myList = this;
			if (null != is)
			    class316.decode(new RSByteBuffer(is), false,
						152086021);
			recentUse.put(class316, (long) i);
		    }
		}
		return class316;
    }
    
    public VarBitType list/*method16865*/(int key, byte i_0_) {
		VarBitType class316;
		synchronized (recentUse) {
		    class316 = (VarBitType) recentUse.get((long) key);
		    if (null == class316) {
				byte[] data = configClient.getfile(
						Js5ConfigGroup.VAR_BIT.id * -1379677837, key, -1000604166);
				class316 = new VarBitType();
				class316.id = key * -2115085683;
				((VarBitType) class316).myList = this;
				if (null != data) {
				    class316.decode(new RSByteBuffer(data), false, 152086021);
				}
				recentUse.put(class316, (long) key);
		    }
		}
		return class316;
    }
    
    public void cacheReset/*method16866*/(int i) {
		synchronized (recentUse) {
		    recentUse.reset(-987185484);
		}
    }
    
    public void cacheClean/*method16867*/(int i, int i_1_) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2020810893);
		}
    }
    
    public void cacheRemoveSoftReferences/*method16868*/(byte i) {
		synchronized (recentUse) {
		    recentUse.removeSoftReferences((byte) -5);
		}
    }
    
    public void method16869(int i, int i_2_) {
	synchronized (recentUse) {
	    recentUse.reset(-1356007359);
	    recentUse = new Class129(i);
	}
    }
    
    public void method16870(int i) {
	synchronized (recentUse) {
	    recentUse.clean(i, -2037003356);
	}
    }
    
    public VarBitType method16871(int i) {
	VarBitType class316;
	synchronized (recentUse) {
	    class316 = (VarBitType) recentUse
				      .get((long) i);
	    if (null == class316) {
		byte[] is = (configClient.getfile
			     (Js5ConfigGroup.VAR_BIT.id * -1379677837, i,
			      911241838));
		class316 = new VarBitType();
		class316.id = i * -2115085683;
		((VarBitType) class316).myList = this;
		if (null != is)
		    class316.decode(new RSByteBuffer(is), false,
					152086021);
		recentUse.put(class316, (long) i);
	    }
	}
	return class316;
    }
    
    public VarBitType method16872(int i) {
	VarBitType class316;
	synchronized (recentUse) {
	    class316 = (VarBitType) recentUse
				      .get((long) i);
	    if (null == class316) {
		byte[] is = (configClient.getfile
			     (Js5ConfigGroup.VAR_BIT.id * -1379677837, i,
			      -1295446581));
		class316 = new VarBitType();
		class316.id = i * -2115085683;
		((VarBitType) class316).myList = this;
		if (null != is)
		    class316.decode(new RSByteBuffer(is), false,
					152086021);
		recentUse.put(class316,
								  (long) i);
	    }
	}
	return class316;
    }
    
    public void method16873(int i) {
	synchronized (recentUse) {
	    recentUse.reset(330468499);
	    recentUse = new Class129(i);
	}
    }
    
    public void method16874(int i) {
	synchronized (recentUse) {
	    recentUse.reset(-1699629311);
	    recentUse = new Class129(i);
	}
    }
    
    public void method16875(int i) {
	synchronized (recentUse) {
	    recentUse.reset(-1345720481);
	    recentUse = new Class129(i);
	}
    }
    
    public VarBitType method16876(int i) {
	VarBitType class316;
	synchronized (recentUse) {
	    class316 = (VarBitType) recentUse
				      .get((long) i);
	    if (null == class316) {
		byte[] is = (configClient.getfile
			     (Js5ConfigGroup.VAR_BIT.id * -1379677837, i,
			      162403231));
		class316 = new VarBitType();
		class316.id = i * -2115085683;
		((VarBitType) class316).myList = this;
		if (null != is)
		    class316.decode(new RSByteBuffer(is), false,
					152086021);
		recentUse.put(class316,
								  (long) i);
	    }
	}
	return class316;
    }
    
    public VarBitTypeListClient(GameDefinition game, Language locale, JS5 class210, Map<VarDomainType, VarTypeList> map) {
    	super(game, locale, class210 != null ? class210.getContainerCount((Js5ConfigGroup.VAR_BIT.id) * -1379677837, (byte) -67) : 0);
		configClient = class210;
		listContainer = map;
    }
    
    static final void method16877(ClientScriptData class454, int i) {
	ServerConnection class190 = ClanChannelDelta.method6943(-1355863552);
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4075,
					 class190.packetCipher, 16711935);
	class241_sub27.data.writeByte(0, 1257322686);
	int i_3_
	    = class241_sub27.data.pointer * 421967667;
	class241_sub27.data.writeByte(0, -1153057877);
	class241_sub27.data.writeShort
	    (-1422545021 * ((ClientScriptData) class454).aClass333_6242.anInt5058,
	     -484048531);
	((ClientScriptData) class454).aClass333_6242.aClass241_Sub39_Sub9_5059
	    .method17176
	    (class241_sub27.data,
	     ((ClientScriptData) class454).aClass333_6242.anIntArray5060, 56142522);
	class241_sub27.data.endPacketVarByte
	    ((class241_sub27.data.pointer * 421967667
	      - i_3_),
	     722132523);
	class190.sendPacket(class241_sub27, -1825145219);
    }
    
    static final void method16878(ClientScriptData class454, short i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	Class639 class639 = Class518.method11660(Class120_Sub7.FONTS_ARCHIVE,
						 i_5_, 0, (byte) -91);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class639.method13568(string, i_4_,
				   Class445_Sub9.aClass168Array8642,
				   -730547518);
    }
}
