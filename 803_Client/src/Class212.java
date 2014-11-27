/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class212 implements Interface47
{
    static Class212 aClass212_2503;
    static Class212 aClass212_2504;
    static Class212 aClass212_2505 = new Class212(0);
    int anInt2506;
    public static int anInt2507;
    
    public static Class212[] method4287() {
	return (new Class212[]
		{ aClass212_2505, aClass212_2503, aClass212_2504 });
    }
    
    Class212(int i) {
	((Class212) this).anInt2506 = i * -1503505485;
    }
    
    static {
	aClass212_2504 = new Class212(1);
	aClass212_2503 = new Class212(2);
    }
    
    public int getId(byte i) {
	return -1819896965 * ((Class212) this).anInt2506;
    }
    
    public int method10() {
	return -1819896965 * ((Class212) this).anInt2506;
    }
    
    public int method11() {
	return -1819896965 * ((Class212) this).anInt2506;
    }
    
    public int method147() {
	return -1819896965 * ((Class212) this).anInt2506;
    }
    
    public static Class212[] method4288() {
	return (new Class212[]
		{ aClass212_2505, aClass212_2503, aClass212_2504 });
    }
    
    public int method9() {
	return -1819896965 * ((Class212) this).anInt2506;
    }
    
    public static boolean method4289(int i, int i_0_) {
	return i == 0 || i == 2;
    }
    
    static final void ifLtEqSkip/*method4290*/(ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= -821458770;
		if (scriptData.integerStack[1482319719 * scriptData.intStackPointer]
				<= scriptData.integerStack[1 + scriptData.intStackPointer * 1482319719]) {
			scriptData.step += (1924545709 * scriptData.integerConstants[1938982693 * scriptData.step]);
		}
    }
    
    static final void method4291(ClientScriptData class454, int i) {
	ServerConnection class190 = ClanChannelDelta.method6943(-1496278189);
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4075,
					 class190.packetCipher, 16711935);
	class241_sub27.data.writeByte(0, -2074706436);
	int i_1_
	    = 421967667 * class241_sub27.data.pointer;
	class241_sub27.data.writeByte(3, -1005009723);
	class241_sub27.data.writeShort
	    (((ClientScriptData) class454).aClass333_6242.anInt5058 * -1422545021,
	     -484048531);
	((ClientScriptData) class454).aClass333_6242.aClass241_Sub39_Sub9_5059
	    .method17176
	    (class241_sub27.data,
	     ((ClientScriptData) class454).aClass333_6242.anIntArray5060, 56142522);
	class241_sub27.data.endPacketVarByte
	    ((class241_sub27.data.pointer * 421967667
	      - i_1_),
	     1699176826);
	class190.sendPacket(class241_sub27, -1750724956);
    }
    
    static final void method4292(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub30_8878
		  .method14386(-801965113);
    }
    
    static void method4293(InterfaceComponent class58, Class135 class135, int i, int i_2_,
			   int i_3_, int i_4_, Class168 class168, double d) {
	if (class168 != null) {
	    int i_5_;
	    if (4 == 115241065 * Class296.anInt4513)
		i_5_ = ((int) ((double) Class445_Sub16.aClass351_Sub1_8660
					    .method6292((byte) 44)
			       * 2607.5945876176133)
			+ 390680985 * client.anInt8513) & 0x3fff;
	    else if (5 == Class296.anInt4513 * 115241065)
		i_5_ = (int) client.aFloat8581 & 0x3fff;
	    else
		i_5_ = ((int) client.aFloat8581 + 390680985 * client.anInt8513
			& 0x3fff);
	    int i_6_ = (Math.max(439139681 * class58.anInt850 / 2,
				 1463495207 * class58.scrollMinY / 2)
			+ 10);
	    int i_7_ = i_4_ * i_4_ + i_3_ * i_3_;
	    if (i_7_ <= i_6_ * i_6_) {
		int i_8_ = Class282.anIntArray4430[i_5_];
		int i_9_ = Class282.anIntArray4441[i_5_];
		if (Class296.anInt4513 * 115241065 != 5) {
		    i_8_ = 256 * i_8_ / (256 + client.anInt8377 * 1747300637);
		    i_9_ = i_9_ * 256 / (256 + client.anInt8377 * 1747300637);
		}
		int i_10_ = i_3_ * i_9_ + i_8_ * i_4_ >> 14;
		int i_11_ = i_4_ * i_9_ - i_8_ * i_3_ >> 14;
		double d_12_ = d / 100.0;
		if (null != class135) {
		    if (1.0 == d_12_)
			class168.method3679((i
					     + 439139681 * class58.anInt850 / 2
					     + i_10_
					     - class168.method64() / 2),
					    (i_2_
					     + (1463495207 * class58.scrollMinY
						/ 2)
					     - i_11_ - class168.method3616()),
					    class135, i, i_2_);
		    else
			class168.method3614
			    ((i_10_ + (class58.anInt850 * 439139681 / 2 + i)
			      - (int) ((double) (class168.method64() / 2)
				       * d_12_)),
			     (1463495207 * class58.scrollMinY / 2 + i_2_ - i_11_
			      - (int) ((double) class168.method3616()
				       * d_12_)),
			     (int) ((double) class168.method64() * d_12_),
			     (int) ((double) class168.method3616() * d_12_));
		} else {
		    if (1.0 == d_12_)
			class168.method3646
			    ((i_10_ + (i + 439139681 * class58.anInt850 / 2)
			      - class168.method64() / 2),
			     (i_2_ + class58.scrollMinY * 1463495207 / 2 - i_11_
			      - class168.method3616()));
		    class168.method3614
			((i + 439139681 * class58.anInt850 / 2 + i_10_
			  - (int) ((double) (class168.method64() / 2)
				   * d_12_)),
			 (1463495207 * class58.scrollMinY / 2 + i_2_ - i_11_
			  - (int) ((double) class168.method3616() * d_12_)),
			 (int) ((double) class168.method64() * d_12_),
			 (int) ((double) class168.method3616() * d_12_));
		}
	    }
	}
    }
    
    static final void method4294(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.publicChatStatus * 1460689079;
    }
}
