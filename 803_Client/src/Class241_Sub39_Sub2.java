/* Class241_Sub39_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub39_Sub2 extends Class241_Sub39
{
    byte[][] aByteArrayArray10822;
    int anInt10823;
    static JS5 aClass210_10824;
    Class87[] aClass87Array10825;
    public static String osVersionRaw;//aString10826
    
    public boolean method17080() {
	if (((Class241_Sub39_Sub2) this).aClass87Array10825 != null)
	    return true;
	if (null == ((Class241_Sub39_Sub2) this).aByteArrayArray10822) {
	    synchronized (Class421.aClass210_6041) {
		if (!Class421.aClass210_6041.containerExists
		     (617703917 * ((Class241_Sub39_Sub2) this).anInt10823,
		      1056278445)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is
		    = (Class421.aClass210_6041.getChildIndicies
		       (((Class241_Sub39_Sub2) this).anInt10823 * 617703917,
			(byte) -62));
		((Class241_Sub39_Sub2) this).aByteArrayArray10822
		    = new byte[is.length][];
		for (int i = 0; i < is.length; i++)
		    ((Class241_Sub39_Sub2) this).aByteArrayArray10822[i]
			= (Class421.aClass210_6041.getfile
			   ((617703917
			     * ((Class241_Sub39_Sub2) this).anInt10823),
			    is[i], -483733113));
	    }
	}
	boolean bool = true;
	for (int i = 0;
	     i < ((Class241_Sub39_Sub2) this).aByteArrayArray10822.length;
	     i++) {
	    byte[] is = ((Class241_Sub39_Sub2) this).aByteArrayArray10822[i];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    class241_sub3.pointer = -681042949;
	    int i_0_ = class241_sub3.readUnsignedShort(1162222719);
	    synchronized (aClass210_10824) {
		bool &= aClass210_10824.method4250(i_0_, -95779801);
	    }
	}
	if (!bool)
	    return false;
	NodeCollection class429 = new NodeCollection();
	int[] is;
	synchronized (Class421.aClass210_6041) {
	    int i
		= Class421.aClass210_6041.getContainerCount((617703917
						      * ((Class241_Sub39_Sub2)
							 this).anInt10823),
						     (byte) -21);
	    ((Class241_Sub39_Sub2) this).aClass87Array10825 = new Class87[i];
	    is = Class421.aClass210_6041.getChildIndicies((617703917
						     * ((Class241_Sub39_Sub2)
							this).anInt10823),
						    (byte) -26);
	}
	for (int i = 0; i < is.length; i++) {
	    byte[] is_1_
		= ((Class241_Sub39_Sub2) this).aByteArrayArray10822[i];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is_1_);
	    class241_sub3.pointer = -681042949;
	    int i_2_ = class241_sub3.readUnsignedShort(1162222719);
	    Class241_Sub42 class241_sub42 = null;
	    for (Class241_Sub42 class241_sub42_3_
		     = (Class241_Sub42) class429.method7694(16711935);
		 null != class241_sub42_3_;
		 class241_sub42_3_
		     = (Class241_Sub42) class429.method7692(301280770)) {
		if ((-1765915457
		     * ((Class241_Sub42) class241_sub42_3_).anInt10165)
		    == i_2_) {
		    class241_sub42 = class241_sub42_3_;
		    break;
		}
	    }
	    if (class241_sub42 == null) {
		synchronized (aClass210_10824) {
		    class241_sub42
			= new Class241_Sub42(i_2_,
					     aClass210_10824
						 .method4194(i_2_, 927771373));
		}
		class429.addNode(class241_sub42, (short) -3975);
	    }
	    ((Class241_Sub39_Sub2) this).aClass87Array10825[is[i]]
		= new Class87(is_1_, class241_sub42);
	}
	((Class241_Sub39_Sub2) this).aByteArrayArray10822 = null;
	return true;
    }
    
    public boolean method17081(byte i) {
	if (((Class241_Sub39_Sub2) this).aClass87Array10825 != null)
	    return true;
	if (null == ((Class241_Sub39_Sub2) this).aByteArrayArray10822) {
	    synchronized (Class421.aClass210_6041) {
		if (!Class421.aClass210_6041.containerExists
		     (617703917 * ((Class241_Sub39_Sub2) this).anInt10823,
		      1917780298)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is
		    = (Class421.aClass210_6041.getChildIndicies
		       (((Class241_Sub39_Sub2) this).anInt10823 * 617703917,
			(byte) 76));
		((Class241_Sub39_Sub2) this).aByteArrayArray10822
		    = new byte[is.length][];
		for (int i_4_ = 0; i_4_ < is.length; i_4_++)
		    ((Class241_Sub39_Sub2) this).aByteArrayArray10822[i_4_]
			= (Class421.aClass210_6041.getfile
			   ((617703917
			     * ((Class241_Sub39_Sub2) this).anInt10823),
			    is[i_4_], 509652048));
	    }
	}
	boolean bool = true;
	for (int i_5_ = 0;
	     i_5_ < ((Class241_Sub39_Sub2) this).aByteArrayArray10822.length;
	     i_5_++) {
	    byte[] is
		= ((Class241_Sub39_Sub2) this).aByteArrayArray10822[i_5_];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    class241_sub3.pointer = -681042949;
	    int i_6_ = class241_sub3.readUnsignedShort(1162222719);
	    synchronized (aClass210_10824) {
		bool &= aClass210_10824.method4250(i_6_, -106118193);
	    }
	}
	if (!bool)
	    return false;
	NodeCollection class429 = new NodeCollection();
	int[] is;
	synchronized (Class421.aClass210_6041) {
	    int i_7_
		= Class421.aClass210_6041.getContainerCount((617703917
						      * ((Class241_Sub39_Sub2)
							 this).anInt10823),
						     (byte) -20);
	    ((Class241_Sub39_Sub2) this).aClass87Array10825
		= new Class87[i_7_];
	    is = Class421.aClass210_6041.getChildIndicies((617703917
						     * ((Class241_Sub39_Sub2)
							this).anInt10823),
						    (byte) -28);
	}
	for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
	    byte[] is_9_
		= ((Class241_Sub39_Sub2) this).aByteArrayArray10822[i_8_];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is_9_);
	    class241_sub3.pointer = -681042949;
	    int i_10_ = class241_sub3.readUnsignedShort(1162222719);
	    Class241_Sub42 class241_sub42 = null;
	    for (Class241_Sub42 class241_sub42_11_
		     = (Class241_Sub42) class429.method7694(16711935);
		 null != class241_sub42_11_;
		 class241_sub42_11_
		     = (Class241_Sub42) class429.method7692(123190579)) {
		if ((-1765915457
		     * ((Class241_Sub42) class241_sub42_11_).anInt10165)
		    == i_10_) {
		    class241_sub42 = class241_sub42_11_;
		    break;
		}
	    }
	    if (class241_sub42 == null) {
		synchronized (aClass210_10824) {
		    class241_sub42
			= new Class241_Sub42(i_10_, (aClass210_10824.method4194
						     (i_10_, -1505577437)));
		}
		class429.addNode(class241_sub42, (short) -22961);
	    }
	    ((Class241_Sub39_Sub2) this).aClass87Array10825[is[i_8_]]
		= new Class87(is_9_, class241_sub42);
	}
	((Class241_Sub39_Sub2) this).aByteArrayArray10822 = null;
	return true;
    }
    
    public boolean method17082(int i) {
	return (((Class87) ((Class241_Sub39_Sub2) this).aClass87Array10825[i])
		.aBool1274);
    }
    
    public boolean method17083(int i, byte i_12_) {
	return (((Class87) ((Class241_Sub39_Sub2) this).aClass87Array10825[i])
		.aBool1274);
    }
    
    public boolean method17084(int i) {
	return (((Class87) ((Class241_Sub39_Sub2) this).aClass87Array10825[i])
		.aBool1271);
    }
    
    public boolean method17085(int i, int i_13_) {
	return (((Class87) ((Class241_Sub39_Sub2) this).aClass87Array10825[i])
		.aBool1270);
    }
    
    public boolean method17086() {
	if (((Class241_Sub39_Sub2) this).aClass87Array10825 != null)
	    return true;
	if (null == ((Class241_Sub39_Sub2) this).aByteArrayArray10822) {
	    synchronized (Class421.aClass210_6041) {
		if (!Class421.aClass210_6041.containerExists
		     (617703917 * ((Class241_Sub39_Sub2) this).anInt10823,
		      969657966)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is
		    = (Class421.aClass210_6041.getChildIndicies
		       (((Class241_Sub39_Sub2) this).anInt10823 * 617703917,
			(byte) 11));
		((Class241_Sub39_Sub2) this).aByteArrayArray10822
		    = new byte[is.length][];
		for (int i = 0; i < is.length; i++)
		    ((Class241_Sub39_Sub2) this).aByteArrayArray10822[i]
			= (Class421.aClass210_6041.getfile
			   ((617703917
			     * ((Class241_Sub39_Sub2) this).anInt10823),
			    is[i], -1451390798));
	    }
	}
	boolean bool = true;
	for (int i = 0;
	     i < ((Class241_Sub39_Sub2) this).aByteArrayArray10822.length;
	     i++) {
	    byte[] is = ((Class241_Sub39_Sub2) this).aByteArrayArray10822[i];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    class241_sub3.pointer = -681042949;
	    int i_14_ = class241_sub3.readUnsignedShort(1162222719);
	    synchronized (aClass210_10824) {
		bool &= aClass210_10824.method4250(i_14_, 951918907);
	    }
	}
	if (!bool)
	    return false;
	NodeCollection class429 = new NodeCollection();
	int[] is;
	synchronized (Class421.aClass210_6041) {
	    int i
		= Class421.aClass210_6041.getContainerCount((617703917
						      * ((Class241_Sub39_Sub2)
							 this).anInt10823),
						     (byte) -128);
	    ((Class241_Sub39_Sub2) this).aClass87Array10825 = new Class87[i];
	    is = Class421.aClass210_6041.getChildIndicies((617703917
						     * ((Class241_Sub39_Sub2)
							this).anInt10823),
						    (byte) -44);
	}
	for (int i = 0; i < is.length; i++) {
	    byte[] is_15_
		= ((Class241_Sub39_Sub2) this).aByteArrayArray10822[i];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is_15_);
	    class241_sub3.pointer = -681042949;
	    int i_16_ = class241_sub3.readUnsignedShort(1162222719);
	    Class241_Sub42 class241_sub42 = null;
	    for (Class241_Sub42 class241_sub42_17_
		     = (Class241_Sub42) class429.method7694(16711935);
		 null != class241_sub42_17_;
		 class241_sub42_17_
		     = (Class241_Sub42) class429.method7692(1901814584)) {
		if ((-1765915457
		     * ((Class241_Sub42) class241_sub42_17_).anInt10165)
		    == i_16_) {
		    class241_sub42 = class241_sub42_17_;
		    break;
		}
	    }
	    if (class241_sub42 == null) {
		synchronized (aClass210_10824) {
		    class241_sub42
			= new Class241_Sub42(i_16_, (aClass210_10824.method4194
						     (i_16_, -1038120211)));
		}
		class429.addNode(class241_sub42, (short) -27382);
	    }
	    ((Class241_Sub39_Sub2) this).aClass87Array10825[is[i]]
		= new Class87(is_15_, class241_sub42);
	}
	((Class241_Sub39_Sub2) this).aByteArrayArray10822 = null;
	return true;
    }
    
    public boolean method17087(int i) {
	return (((Class87) ((Class241_Sub39_Sub2) this).aClass87Array10825[i])
		.aBool1270);
    }
    
    public boolean method17088(int i) {
	return (((Class87) ((Class241_Sub39_Sub2) this).aClass87Array10825[i])
		.aBool1270);
    }
    
    public boolean method17089(int i) {
	return (((Class87) ((Class241_Sub39_Sub2) this).aClass87Array10825[i])
		.aBool1274);
    }
    
    public boolean method17090(int i, byte i_18_) {
	return (((Class87) ((Class241_Sub39_Sub2) this).aClass87Array10825[i])
		.aBool1271);
    }
    
    public Class241_Sub39_Sub2(int i) {
	((Class241_Sub39_Sub2) this).anInt10823 = -344368155 * i;
    }
    
    static final void method17091(ClientScriptData class454, int i) {
	int i_19_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_20_ = Class241_Sub5_Sub9.aClass241_Sub9_11043
			.aClass445_Sub6_8891.method14143(1895681223);
	if (i_20_ != i_19_) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub6_8891,
		 i_19_, (byte) 2);
	    Class167.method3600((short) -21985);
	    client.aBool8297 = false;
	}
    }
}
