/* Class520 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.List;

public class Class520 implements Interface52
{
    byte[] aByteArray6793;
    int anInt6794;
    JS5 aClass210_6795;
    Class508 aClass508_6796 = Class508.aClass508_6674;
    Interface53 anInterface53_6797;
    Class393 aClass393_6798;
    boolean aBool6799;
    int anInt6800;
    Class129 aClass129_6801;
    boolean aBool6802;
    public static SparseVarDomain varClanDomain;//aClass136_6803
    
    List method11676() {
	if (((Class520) this).aClass129_6801 == null
	    || !((Class520) this).aBool6802)
	    return null;
	Object object = null;
	List list;
	synchronized (((Class520) this).aClass129_6801) {
	    list
		= (List) (((Class520) this).aClass129_6801.get
			  ((long) (-710646469 * ((Class520) this).anInt6794)));
	    if (list == null && ((Class520) this).aBool6802) {
		list = new ArrayList();
		((Class520) this).aClass129_6801.method3026
		    (list, (long) (-710646469 * ((Class520) this).anInt6794),
		     0, -1074446627);
	    }
	}
	return list;
    }
    
    public RSByteBuffer method399(int i) {
	if (((Class520) this).aClass129_6801 == null)
	    return null;
	RSByteBuffer class241_sub3 = null;
	if (null != ((Class520) this).anInterface53_6797)
	    ((Class520) this).anInterface53_6797.method416(this, -1878188820);
	synchronized (((Class520) this).aClass129_6801) {
	    List list = method11679(1712943228);
	    if (list.size() > i)
		class241_sub3 = (RSByteBuffer) list.get(i);
	}
	return class241_sub3;
    }
    
    public Class508 method390() {
	return ((Class520) this).aClass508_6796;
    }
    
    public Class508 method373(byte i) {
	return ((Class520) this).aClass508_6796;
    }
    
    public boolean method414(int i) {
	return false;
    }
    
    void method11677(int i) {
	/* empty */
    }
    
    public byte[] method375(int i, int i_0_) {
	if (((Class520) this).anInterface53_6797 != null)
	    ((Class520) this).anInterface53_6797.method416(this, -1930535462);
	return ((Class520) this).aByteArray6793;
    }
    
    public int method405(int i) {
	if (null != ((Class520) this).aByteArray6793)
	    return ((Class520) this).aByteArray6793.length;
	return 0;
    }
    
    public Class301 method377(int i) {
	return Class301.aClass301_4611;
    }
    
    public int method408(byte i) {
	return ((Class520) this).anInt6794 * -710646469;
    }
    
    public void method404(RSByteBuffer class241_sub3, int i) {
	if (((Class520) this).aClass129_6801 != null) {
	    if (null != ((Class520) this).anInterface53_6797)
		((Class520) this).anInterface53_6797.method416(this,
							       -1361764718);
	    if (((Class520) this).aBool6799)
		throw new RuntimeException("");
	    synchronized (((Class520) this).aClass129_6801) {
		List list = method11679(1712943228);
		if (null != list) {
		    list.add(class241_sub3);
		    ((Class520) this).anInt6800
			+= 1643237573 * class241_sub3.payload.length;
		    method11678(list, ((Class520) this).anInt6800 * -5165555,
				-1249704839);
		}
	    }
	}
    }
    
    public int method397() {
	if (((Class520) this).aClass129_6801 == null)
	    return 0;
	int i = 0;
	synchronized (((Class520) this).aClass129_6801) {
	    List list = method11679(1712943228);
	    if (null != list)
		i = list.size();
	}
	return i;
    }
    
    public boolean method382(int i, int i_1_) {
	if (null == ((Class520) this).aClass129_6801)
	    return false;
	boolean bool = false;
	synchronized (((Class520) this).aClass129_6801) {
	    List list = method11679(1712943228);
	    if (list != null && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public Class221 method389(int i) {
	Class221 class221 = new Class221(((Class520) this).aClass393_6798);
	class221.method4437(this, (byte) -7);
	return class221;
    }
    
    public void method409(boolean bool) {
	if (null != ((Class520) this).anInterface53_6797)
	    ((Class520) this).anInterface53_6797.method416(this, -1618347086);
	((Class520) this).aBool6799 = bool;
    }
    
    public void method384(boolean bool, byte i) {
	if (null != ((Class520) this).anInterface53_6797)
	    ((Class520) this).anInterface53_6797.method416(this, -1736490663);
	((Class520) this).aBool6799 = bool;
    }
    
    public boolean method376() {
	return (((Class520) this).aClass129_6801 != null
		&& ((Class520) this).aBool6802);
    }
    
    void method11678(List list, int i, int i_2_) {
	if (null != ((Class520) this).aClass129_6801 && null != list
	    && i >= 0) {
	    synchronized (((Class520) this).aClass129_6801) {
		((Class520) this).aClass129_6801.method3046
		    ((long) (-710646469 * ((Class520) this).anInt6794));
		if (i
		    <= ((Class520) this).aClass129_6801.method3052(1997420807))
		    ((Class520) this).aClass129_6801.method3026
			(list,
			 (long) (-710646469 * ((Class520) this).anInt6794), i,
			 -422333580);
		else {
		    ((Class520) this).aBool6802 = false;
		    ((Class520) this).aBool6799 = false;
		    ((Class520) this).anInt6800 = 0;
		}
	    }
	}
    }
    
    List method11679(int i) {
	if (((Class520) this).aClass129_6801 == null
	    || !((Class520) this).aBool6802)
	    return null;
	Object object = null;
	List list;
	synchronized (((Class520) this).aClass129_6801) {
	    list
		= (List) (((Class520) this).aClass129_6801.get
			  ((long) (-710646469 * ((Class520) this).anInt6794)));
	    if (list == null && ((Class520) this).aBool6802) {
		list = new ArrayList();
		((Class520) this).aClass129_6801.method3026
		    (list, (long) (-710646469 * ((Class520) this).anInt6794),
		     0, -65382169);
	    }
	}
	return list;
    }
    
    public boolean method407() {
	if (((Class520) this).aClass129_6801 == null)
	    return false;
	List list = method11679(1712943228);
	if (null == list || list.size() <= 0)
	    ((Class520) this).aBool6799 = false;
	return ((Class520) this).aBool6799;
    }
    
    public Class221 method387() {
	Class221 class221 = new Class221(((Class520) this).aClass393_6798);
	class221.method4437(this, (byte) -65);
	return class221;
    }
    
    public Class221 method388() {
	Class221 class221 = new Class221(((Class520) this).aClass393_6798);
	class221.method4437(this, (byte) -90);
	return class221;
    }
    
    public Class508 method393() {
	return ((Class520) this).aClass508_6796;
    }
    
    public boolean method381(int i) {
	return (((Class520) this).aClass129_6801 != null
		&& ((Class520) this).aBool6802);
    }
    
    public Class520(JS5 class210, int i, Class393 class393,
		    Interface53 interface53, Class129 class129) {
	((Class520) this).aClass210_6795 = class210;
	((Class520) this).anInt6794 = 212413427 * i;
	((Class520) this).aClass393_6798 = class393;
	((Class520) this).anInterface53_6797 = interface53;
	((Class520) this).aClass129_6801 = class129;
	((Class520) this).aBool6802 = ((Class520) this).aClass129_6801 != null;
	((Class520) this).aClass508_6796 = Class508.aClass508_6673;
    }
    
    public boolean method243() {
	return false;
    }
    
    public boolean method244() {
	return false;
    }
    
    void method11680() {
	/* empty */
    }
    
    public int method403() {
	if (((Class520) this).aClass129_6801 == null)
	    return 0;
	int i = 0;
	synchronized (((Class520) this).aClass129_6801) {
	    List list = method11679(1712943228);
	    if (null != list)
		i = list.size();
	}
	return i;
    }
    
    public int method211() {
	if (null != ((Class520) this).aByteArray6793)
	    return ((Class520) this).aByteArray6793.length;
	return 0;
    }
    
    public int method394() {
	if (null != ((Class520) this).aByteArray6793)
	    return ((Class520) this).aByteArray6793.length;
	return 0;
    }
    
    public Class301 method395() {
	return Class301.aClass301_4611;
    }
    
    public int method396() {
	return ((Class520) this).anInt6794 * -710646469;
    }
    
    public int method412() {
	return ((Class520) this).anInt6794 * -710646469;
    }
    
    public void method392(RSByteBuffer class241_sub3) {
	if (((Class520) this).aClass129_6801 != null) {
	    if (null != ((Class520) this).anInterface53_6797)
		((Class520) this).anInterface53_6797.method416(this,
							       -1899029782);
	    if (((Class520) this).aBool6799)
		throw new RuntimeException("");
	    synchronized (((Class520) this).aClass129_6801) {
		List list = method11679(1712943228);
		if (null != list) {
		    list.add(class241_sub3);
		    ((Class520) this).anInt6800
			+= 1643237573 * class241_sub3.payload.length;
		    method11678(list, ((Class520) this).anInt6800 * -5165555,
				-1249704839);
		}
	    }
	}
    }
    
    public void method194() {
	if (((Class520) this).aClass508_6796 == Class508.aClass508_6673) {
	    byte[] is
		= (((Class520) this).aClass210_6795.method4194
		   (-710646469 * ((Class520) this).anInt6794, -1891382157));
	    if (null != is) {
		((Class520) this).aByteArray6793 = is;
		method11677(629800624);
		((Class520) this).aClass508_6796 = Class508.aClass508_6672;
		if (null != ((Class520) this).anInterface53_6797)
		    ((Class520) this).anInterface53_6797.method419
			(this, is.length,
			 -710646469 * ((Class520) this).anInt6794, false,
			 (byte) 82);
	    }
	}
    }
    
    public boolean method400(int i) {
	if (null == ((Class520) this).aClass129_6801)
	    return false;
	boolean bool = false;
	synchronized (((Class520) this).aClass129_6801) {
	    List list = method11679(1712943228);
	    if (list != null && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public boolean method401(int i) {
	if (null == ((Class520) this).aClass129_6801)
	    return false;
	boolean bool = false;
	synchronized (((Class520) this).aClass129_6801) {
	    List list = method11679(1712943228);
	    if (list != null && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public boolean method402() {
	return (((Class520) this).aClass129_6801 != null
		&& ((Class520) this).aBool6802);
    }
    
    public boolean method385(byte i) {
	if (((Class520) this).aClass129_6801 == null)
	    return false;
	List list = method11679(1712943228);
	if (null == list || list.size() <= 0)
	    ((Class520) this).aBool6799 = false;
	return ((Class520) this).aBool6799;
    }
    
    public boolean method378() {
	return (((Class520) this).aClass129_6801 != null
		&& ((Class520) this).aBool6802);
    }
    
    public boolean method374() {
	return (((Class520) this).aClass129_6801 != null
		&& ((Class520) this).aBool6802);
    }
    
    public int method406() {
	if (((Class520) this).aClass129_6801 == null)
	    return 0;
	int i = 0;
	synchronized (((Class520) this).aClass129_6801) {
	    List list = method11679(1712943228);
	    if (null != list)
		i = list.size();
	}
	return i;
    }
    
    public boolean method398() {
	if (((Class520) this).aClass129_6801 == null)
	    return false;
	List list = method11679(1712943228);
	if (null == list || list.size() <= 0)
	    ((Class520) this).aBool6799 = false;
	return ((Class520) this).aBool6799;
    }
    
    public Class508 method391() {
	return ((Class520) this).aClass508_6796;
    }
    
    public boolean method413() {
	if (((Class520) this).aClass129_6801 == null)
	    return false;
	List list = method11679(1712943228);
	if (null == list || list.size() <= 0)
	    ((Class520) this).aBool6799 = false;
	return ((Class520) this).aBool6799;
    }
    
    public int method383(byte i) {
	if (((Class520) this).aClass129_6801 == null)
	    return 0;
	int i_3_ = 0;
	synchronized (((Class520) this).aClass129_6801) {
	    List list = method11679(1712943228);
	    if (null != list)
		i_3_ = list.size();
	}
	return i_3_;
    }
    
    public void method410(boolean bool) {
	if (null != ((Class520) this).anInterface53_6797)
	    ((Class520) this).anInterface53_6797.method416(this, -1532550538);
	((Class520) this).aBool6799 = bool;
    }
    
    public void method411(boolean bool) {
	if (null != ((Class520) this).anInterface53_6797)
	    ((Class520) this).anInterface53_6797.method416(this, -1345824509);
	((Class520) this).aBool6799 = bool;
    }
    
    public int method379() {
	if (((Class520) this).aClass129_6801 == null)
	    return 0;
	int i = 0;
	synchronized (((Class520) this).aClass129_6801) {
	    List list = method11679(1712943228);
	    if (null != list)
		i = list.size();
	}
	return i;
    }
    
    public RSByteBuffer method380(int i, short i_4_) {
	if (((Class520) this).aClass129_6801 == null)
	    return null;
	RSByteBuffer class241_sub3 = null;
	if (null != ((Class520) this).anInterface53_6797)
	    ((Class520) this).anInterface53_6797.method416(this, -1736964176);
	synchronized (((Class520) this).aClass129_6801) {
	    List list = method11679(1712943228);
	    if (list.size() > i)
		class241_sub3 = (RSByteBuffer) list.get(i);
	}
	return class241_sub3;
    }
    
    public byte[] method386(int i) {
	if (((Class520) this).anInterface53_6797 != null)
	    ((Class520) this).anInterface53_6797.method416(this, -1945432768);
	return ((Class520) this).aByteArray6793;
    }
    
    void method11681(List list, int i) {
	if (null != ((Class520) this).aClass129_6801 && null != list
	    && i >= 0) {
	    synchronized (((Class520) this).aClass129_6801) {
		((Class520) this).aClass129_6801.method3046
		    ((long) (-710646469 * ((Class520) this).anInt6794));
		if (i
		    <= ((Class520) this).aClass129_6801.method3052(1859274039))
		    ((Class520) this).aClass129_6801.method3026
			(list,
			 (long) (-710646469 * ((Class520) this).anInt6794), i,
			 931875015);
		else {
		    ((Class520) this).aBool6802 = false;
		    ((Class520) this).aBool6799 = false;
		    ((Class520) this).anInt6800 = 0;
		}
	    }
	}
    }
    
    void method11682(List list, int i) {
	if (null != ((Class520) this).aClass129_6801 && null != list
	    && i >= 0) {
	    synchronized (((Class520) this).aClass129_6801) {
		((Class520) this).aClass129_6801.method3046
		    ((long) (-710646469 * ((Class520) this).anInt6794));
		if (i
		    <= ((Class520) this).aClass129_6801.method3052(2025001316))
		    ((Class520) this).aClass129_6801.method3026
			(list,
			 (long) (-710646469 * ((Class520) this).anInt6794), i,
			 2134291071);
		else {
		    ((Class520) this).aBool6802 = false;
		    ((Class520) this).aBool6799 = false;
		    ((Class520) this).anInt6800 = 0;
		}
	    }
	}
    }
    
    void method11683(List list, int i) {
	if (null != ((Class520) this).aClass129_6801 && null != list
	    && i >= 0) {
	    synchronized (((Class520) this).aClass129_6801) {
		((Class520) this).aClass129_6801.method3046
		    ((long) (-710646469 * ((Class520) this).anInt6794));
		if (i
		    <= ((Class520) this).aClass129_6801.method3052(1770826430))
		    ((Class520) this).aClass129_6801.method3026
			(list,
			 (long) (-710646469 * ((Class520) this).anInt6794), i,
			 -1069743926);
		else {
		    ((Class520) this).aBool6802 = false;
		    ((Class520) this).aBool6799 = false;
		    ((Class520) this).anInt6800 = 0;
		}
	    }
	}
    }
    
    List method11684() {
	if (((Class520) this).aClass129_6801 == null
	    || !((Class520) this).aBool6802)
	    return null;
	Object object = null;
	List list;
	synchronized (((Class520) this).aClass129_6801) {
	    list
		= (List) (((Class520) this).aClass129_6801.get
			  ((long) (-710646469 * ((Class520) this).anInt6794)));
	    if (list == null && ((Class520) this).aBool6802) {
		list = new ArrayList();
		((Class520) this).aClass129_6801.method3026
		    (list, (long) (-710646469 * ((Class520) this).anInt6794),
		     0, -1118437217);
	    }
	}
	return list;
    }
    
    public void method191(int i) {
	if (((Class520) this).aClass508_6796 == Class508.aClass508_6673) {
	    byte[] is
		= (((Class520) this).aClass210_6795.method4194
		   (-710646469 * ((Class520) this).anInt6794, -1169861487));
	    if (null != is) {
		((Class520) this).aByteArray6793 = is;
		method11677(1610414688);
		((Class520) this).aClass508_6796 = Class508.aClass508_6672;
		if (null != ((Class520) this).anInterface53_6797)
		    ((Class520) this).anInterface53_6797.method419
			(this, is.length,
			 -710646469 * ((Class520) this).anInt6794, false,
			 (byte) 83);
	    }
	}
    }
    
    static final void method11685(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (Class445_Sub16.aClass351_Sub1_8660.method6282(-754974720)
	       .anInt603) * 96863531;
    }
    
    static final void method11686(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	class58.anInt840
	    = (((ClientScriptData) class454).integerStack
	       [((ClientScriptData) class454).intStackPointer * 1482319719]) * -356193255;
	class58.anInt901
	    = (1441256465
	       * (((ClientScriptData) class454).integerStack
		  [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]));
	class58.anInt968
	    = ((((ClientScriptData) class454).integerStack
		[1482319719 * ((ClientScriptData) class454).intStackPointer + 2])
	       * 1004286759);
	class58.anInt827
	    = (((ClientScriptData) class454).integerStack
	       [((ClientScriptData) class454).intStackPointer * 1482319719 + 3]) * 802990507;
	WorldType.refreshComponent(class58, -629778215);
    }
    
    static final void method11687(ClientScriptData scriptData, byte i) {
    	scriptData.intStackPointer -= -821458770;
		int i_5_ = scriptData.integerStack[1482319719 * scriptData.intStackPointer];
		int i_6_ = scriptData.integerStack[1482319719 * scriptData.intStackPointer + 1];
		Class455 class455;
		if (scriptData.aBool6246) {
		    class455 = scriptData.aClass455_6230;
		} else {
		    class455 = scriptData.aClass455_6229;
		}
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = (-1 != i_6_ && class455.method10557(i_5_, i_6_, (byte) 118) ? 1
		       : 0);
    }
    
    public static void method11688(int i) {
	if (client.aBool8544) {
	    InterfaceComponent class58
		= Class218_Sub3.method16576(-1349195347 * RSGraphics.prevComponentHash,
					    client.prevComponentSlot1 * 1196348233,
					    (byte) -35);
	    if (class58 != null && null != class58.anObjectArray929) {
		ClientScriptCaller class241_sub14 = new ClientScriptCaller();
		class241_sub14.component = class58;
		class241_sub14.paramaters = class58.anObjectArray929;
		Class42.method1067(class241_sub14, 733578118);
	    }
	    client.anInt8458 = -1675324311;
	    client.prevComponentSlot2 = -944055605;
	    client.aBool8544 = false;
	    if (null != class58)
		WorldType.refreshComponent(class58, -1176554171);
	}
    }
    
    public static final void method11689(int i, boolean bool, int i_7_) {
	if (Class324.mainClanChannel != null
	    && (i >= 0
		&& i < 81956567 * Class324.mainClanChannel.memberCount)) {
	    ClanChannelUser class373
		= Class324.mainClanChannel.channelUsers[i];
	    ServerConnection class190 = ClanChannelDelta.method6943(-1129963730);
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4105,
					     class190.packetCipher,
					     16711935);
	    class241_sub27.data.writeByte
		(3 + Class421.getEncodedStringLength(class373.displayName, -1665177667),
		 -1766999181);
	    class241_sub27.data.writeShort(i, -484048531);
	    class241_sub27.data.writeByte(bool ? 1 : 0,
								856155255);
	    class241_sub27.data
		.writeString(class373.displayName, -462962329);
	    class190.sendPacket(class241_sub27, -2019941252);
	}
    }
    
    public static int method11690(int i) {
	return Class128.aClass513_1589.aBool6726 ? 4 : 3;
    }
    
    static final void method11691(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_8_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_9_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (i_8_ == 99)
	    Class21.addline(string, (byte) 85);
	else if (i_8_ == 98)
	    Class1.method453(string, -1941707254);
	else
	    Class318.appendChatboxMessage(i_8_, i_9_, "", "", "", string, -1913090321);
    }
    
    static final void storeCompScrollMinY/*method11692*/(ClientScriptData scriptData, int i) {
		int i_10_ 
			= scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent(i_10_, (byte) -5);
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = component.scrollMinY * 1463495207;
    }
    
    static Class335[] method11693(byte i) {
	return (new Class335[]
		{ Class335.aClass335_5069, Class335.aClass335_5063,
		  Class335.aClass335_5073, Class335.aClass335_5071,
		  Class335.aClass335_5066, Class335.aClass335_5074,
		  Class335.aClass335_5067, Class335.aClass335_5068,
		  Class335.aClass335_5075, Class335.aClass335_5065,
		  Class335.aClass335_5064, Class335.aClass335_5072,
		  Class335.aClass335_5070 });
    }
    
    public static Class89 method11694(Class103 class103, int i, int i_11_,
				      int i_12_, int i_13_, Class89 class89,
				      short i_14_, byte i_15_,
				      Class409 class409, int i_16_) {
	if (null == class89)
	    return null;
	int i_17_ = 2055;
	if (null != class409) {
	    i_17_ |= class409.method7356(-1290073110);
	    i_17_ &= ~0x200;
	}
	long l = (long) ((i_14_ & 0xffff) << 8 | i_15_);
	Class89 class89_18_;
	synchronized (Class24.aClass129_210) {
	    class89_18_ = (Class89) Class24.aClass129_210.get(l);
	}
	if (null == class89_18_
	    || class103.method2301(class89_18_.method1866(), i_17_) != 0) {
	    if (class89_18_ != null)
		i_17_ = class103.method2302(i_17_, class89_18_.method1866());
	    Class161 class161 = new Class161(4, 2, 2);
	    int i_19_ = 128;
	    int[] is = new int[4];
	    is[0] = class161.method3451(-i_19_, 0, -i_19_);
	    is[1] = class161.method3451(i_19_, 0, -i_19_);
	    is[2] = class161.method3451(i_19_, 0, i_19_);
	    is[3] = class161.method3451(-i_19_, 0, i_19_);
	    class161.method3452(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_15_,
				i_14_);
	    class161.method3452(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_15_,
				i_14_);
	    class161.method3468((short) 1, (short) 2, (short) 0);
	    class161.method3468((short) 2, (short) 3, (short) 0);
	    class89_18_
		= class103.method2356(class161, i_17_,
				      Class24.anInt209 * 610682175, 64, 768);
	    synchronized (Class24.aClass129_210) {
		Class24.aClass129_210.put(class89_18_, l);
	    }
	}
	int i_20_ = class89.method1895();
	int i_21_ = class89.method1906();
	int i_22_ = class89.method1899();
	int i_23_ = class89.method1996();
	if (null != class409) {
	    class89_18_ = class89_18_.method2019((byte) 3, i_17_, true);
	    class89_18_.method1863(i_21_ - i_20_ >> 1, 128,
				   i_23_ - i_22_ >> 1);
	    class89_18_.method1927(i_21_ + i_20_ >> 1, 0, i_23_ + i_22_ >> 1);
	    class409.method7398(class89_18_, (byte) 14);
	} else {
	    class89_18_ = class89_18_.method2019((byte) 3, i_17_, true);
	    class89_18_.method1863(i_21_ - i_20_ >> 1, 128,
				   i_23_ - i_22_ >> 1);
	    class89_18_.method1927(i_21_ + i_20_ >> 1, 0, i_23_ + i_22_ >> 1);
	}
	if (i_11_ != 0)
	    class89_18_.method1870(i_11_);
	if (i_12_ != 0)
	    class89_18_.method1980(i_12_);
	if (0 != i_13_)
	    class89_18_.method1927(0, i_13_, 0);
	return class89_18_;
    }
    
    static final void method11695(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class417.anInt6018 * 1013157163;
    }
}
