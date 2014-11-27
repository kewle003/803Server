/* Class625 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class625
{
    static final int anInt7960 = 1;
    JS5 menus;//aClass210_7961
    static final int anInt7962 = 32768;
    public int anInt7963;
    Class129 recentUse;//aClass129_7964
    public int anInt7965 = 0;
    JS5 messages;//aClass210_7966
    Interface51 anInterface51_7967;
    
    public Class241_Sub39_Sub9 list/*method13439*/(int id, int i_0_) {
		Class241_Sub39_Sub9 qcNode = ((Class241_Sub39_Sub9) recentUse.get((long) id));
		if (null != qcNode) {
		    return qcNode;
		}
		byte[] data;
		if (id >= 32768) {
			data = menus.getfile(1, id & 0x7fff, 517361037);
		} else {
			data = messages.getfile(1, id, -499399255);
		}
		qcNode = new Class241_Sub39_Sub9();
		qcNode.myList = this;
		if (null != data) {
			qcNode.decode(new RSByteBuffer(data), 486763411);
		}
		if (id >= 32768) {
			qcNode.method17182((short) -1108);
		}
		recentUse.put(qcNode, (long) id);
		return qcNode;
    }
    
    String dummyMethod13440(Class465 class465, int[] is, long l) {
	if (anInterface51_7967 != null) {
	    String string
		= anInterface51_7967.method371(class465, is,
								 l);
	    if (string != null)
		return string;
	}
	return Long.toString(l);
    }
    
    String method13441(Class465 class465, int[] is, long l) {//Used
		if (anInterface51_7967 != null) {
		    String string = anInterface51_7967.method371(class465, is, l);
		    if (string != null) {
		    	return string;
		    }
		}
		return Long.toString(l);
    }
    
    public Class241_Sub39_Sub9 dummyMethod13442(int i) {
		Class241_Sub39_Sub9 class241_sub39_sub9
		    = ((Class241_Sub39_Sub9)
		       recentUse.get((long) i));
		if (null != class241_sub39_sub9)
		    return class241_sub39_sub9;
		byte[] is;
		if (i >= 32768)
		    is = menus.getfile(1, i & 0x7fff,
								     -850732048);
		else
		    is = messages.getfile(1, i,
								     -1008275164);
		class241_sub39_sub9 = new Class241_Sub39_Sub9();
		((Class241_Sub39_Sub9) class241_sub39_sub9).myList = this;
		if (null != is)
		    class241_sub39_sub9.decode(new RSByteBuffer(is), 733509810);
		if (i >= 32768)
		    class241_sub39_sub9.method17182((short) -11108);
		recentUse.put(class241_sub39_sub9,
							    (long) i);
		return class241_sub39_sub9;
    }
    
    public Class241_Sub39_Sub9 dummyMethod13443(int i) {
		Class241_Sub39_Sub9 class241_sub39_sub9
		    = ((Class241_Sub39_Sub9)
		       recentUse.get((long) i));
		if (null != class241_sub39_sub9)
		    return class241_sub39_sub9;
		byte[] is;
		if (i >= 32768)
		    is = menus.getfile(1, i & 0x7fff,
								     -353129375);
		else
		    is = messages.getfile(1, i, 1744060698);
		class241_sub39_sub9 = new Class241_Sub39_Sub9();
		((Class241_Sub39_Sub9) class241_sub39_sub9).myList = this;
		if (null != is)
		    class241_sub39_sub9.decode(new RSByteBuffer(is),
						    -1717368481);
		if (i >= 32768)
		    class241_sub39_sub9.method17182((short) -25519);
		recentUse.put(class241_sub39_sub9,
							    (long) i);
		return class241_sub39_sub9;
    }
    
    public Class625(Language lang, JS5 qcMessages, JS5 qcMenus, Interface51 interface51) {
		this.anInt7963 = 0;
		this.recentUse = new Class129(64);
		this.anInterface51_7967 = null;
		this.messages = qcMessages;
		this.menus = qcMenus;
		this.anInterface51_7967 = interface51;
		if (null != messages) {
		    anInt7965 = (messages.getContainerCount(1, (byte) -68) * 1085855847);
		}
		if (null != menus) {
		    anInt7963 = (menus.getContainerCount(1, (byte) -74) * 1477549153);
		}
    }
    
    String dummyMethod13444(Class465 class465, int[] is, long l) {
		if (anInterface51_7967 != null) {
		    String string = anInterface51_7967.method371(class465, is, l);
		    if (string != null) {
		    	return string;
		    }
		}
		return Long.toString(l);
    }
    
    public static Class527[] method13445(int i) {
		return (new Class527[]
			{ Class527.aClass527_6927, Class527.aClass527_6921,
			  Class527.aClass527_6929, Class527.aClass527_6924,
			  Class527.aClass527_6912, Class527.aClass527_6923,
			  Class527.aClass527_6916, Class527.aClass527_6917,
			  Class527.aClass527_6910, Class527.aClass527_6928,
			  Class527.aClass527_6908, Class527.aClass527_6922,
			  Class527.aClass527_6915, Class527.aClass527_6911,
			  Class527.aClass527_6909, Class527.aClass527_6913,
			  Class527.aClass527_6920, Class527.aClass527_6914,
			  Class527.aClass527_6926, Class527.aClass527_6932,
			  Class527.aClass527_6925, Class527.aClass527_6930,
			  Class527.aClass527_6919 });
    }
}
