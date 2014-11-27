/* Class611 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Map;

public class Class611
{
    public int anInt7763;
    public int anInt7764;
    public int anInt7765;
    public static Map<VarDomainType, VarTypeList> varTypes;//aMap7766
    
    Class611(int i, int i_0_, int i_1_) {
	anInt7765 = i * 1566435709;
	anInt7764 = 1360589873 * i_0_;
	anInt7763 = -1326309785 * i_1_;
    }
    
    static void method13229(RSByteBuffer class241_sub3, int i, byte i_2_) {
	if (null != GameShell3.uidDat) {
	    try {
		GameShell3.uidDat.method7463(0L);
		GameShell3.uidDat.method7467((class241_sub3
						    .payload),
						   i, 24, (short) 11780);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static Class241_Sub39_Sub12 method13230(JS5 class210, int i, int i_3_,
					    int i_4_) {
	RSByteBuffer class241_sub3
	    = new RSByteBuffer(class210.getfile(i, i_3_, 278075946));
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = new Class241_Sub39_Sub12(i_3_,
				       class241_sub3.readString(1049159534),
				       class241_sub3.readString(19873398),
				       class241_sub3.readInt((byte) 84),
				       class241_sub3.readInt((byte) 125),
				       (class241_sub3.readUnsignedByte((byte) -99)
					== 1),
				       class241_sub3.readUnsignedByte((byte) -106),
				       class241_sub3.readUnsignedByte((byte) 110));
	int i_5_ = class241_sub3.readUnsignedByte((byte) -95);
	for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
	    ((Class241_Sub39_Sub12) class241_sub39_sub12).aClass429_10923
		.addNode
		(new Class241_Sub13(class241_sub3.readUnsignedByte((byte) -23),
				    class241_sub3.readUnsignedShort(1162222719),
				    class241_sub3.readUnsignedShort(1162222719),
				    class241_sub3.readUnsignedShort(1162222719),
				    class241_sub3.readUnsignedShort(1162222719),
				    class241_sub3.readUnsignedShort(1162222719),
				    class241_sub3.readUnsignedShort(1162222719),
				    class241_sub3.readUnsignedShort(1162222719),
				    class241_sub3.readUnsignedShort(1162222719)),
		 (short) -7769);
	class241_sub39_sub12.method17258((short) -16577);
	return class241_sub39_sub12;
    }
}
