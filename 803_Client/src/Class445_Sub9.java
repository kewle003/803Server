/* Class445_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class445_Sub9 extends Class445
{
    public static Class168[] aClass168Array8642;
    
    public int method14176() {
	return anInt6176 * 2034617147;
    }
    
    public Class445_Sub9(int i, Class241_Sub9 class241_sub9) {
	super(i, class241_sub9);
    }
    
    public void method14177(int i) {
	/* empty */
    }
    
    int method7881(int i) {
	return 0;
    }
    
    int method7886(int i) {
	return 1;
    }
    
    void method7882(int i, int i_0_) {
	anInt6176 = i * -679946765;
    }
    
    public int method14178(int i) {
	return anInt6176 * 2034617147;
    }
    
    int method7880(int i, int i_1_) {
	return 1;
    }
    
    public Class445_Sub9(Class241_Sub9 class241_sub9) {
	super(class241_sub9);
    }
    
    int method7885() {
	return 0;
    }
    
    int method7879(int i) {
	return 1;
    }
    
    int method7887(int i) {
	return 1;
    }
    
    int method7883() {
	return 0;
    }
    
    void method7888(int i) {
	anInt6176 = i * -679946765;
    }
    
    void method7889(int i) {
	anInt6176 = i * -679946765;
    }
    
    int method7884() {
	return 0;
    }
    
    public void method14179() {
	/* empty */
    }
    
    public int method14180() {
	return anInt6176 * 2034617147;
    }
    
    public void method14181() {
	/* empty */
    }
    
    public int method14182() {
	return anInt6176 * 2034617147;
    }
    
    static Class416 method14183(RSByteBuffer buffer, VarTypeList class199_sub2, int i) {
		Class416 class416 = new Class416(class199_sub2);
		for (;;) {
		    int i_2_ = buffer.readUnsignedByte((byte) -51);
		    if (i_2_ == 255)
			break;
		    BaseVarType class217
			= ((BaseVarType)
			   Class494.method11278(BaseVarType.class, i_2_, (byte) -12));
		    for (;;) {
			int i_3_ = buffer.readUnsignedByte((byte) 30);
			if (i_3_ == 255)
			    break;
			buffer.pointer -= -681042949;
			Class254 class254
			    = class199_sub2.decodeVarValue(buffer, class217,
							-1843925137);
			if (class254 != null)
			    class416.method335(class254.key * 623518843,
					       class254.value, (byte) -14);
		    }
		}
		return class416;
    }
    
    public static void method14184(RSByteBuffer class241_sub3, int i) {
	byte[] is = new byte[24];
	try {
	    GameShell3.uidDat.method7463(0L);
	    GameShell3.uidDat.method7460(is, (short) 29380);
	    int i_4_;
	    for (i_4_ = 0; i_4_ < 24 && is[i_4_] == 0; i_4_++) {
		/* empty */
	    }
	    if (i_4_ >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i_5_ = 0; i_5_ < 24; i_5_++)
		is[i_5_] = (byte) -1;
	}
	class241_sub3.writeBytes(is, 0, 24, 752061035);
    }
    
    static void method14185(int i) {
	Class192.aClass129_2295.removeSoftReferences((byte) -53);
    }
}
