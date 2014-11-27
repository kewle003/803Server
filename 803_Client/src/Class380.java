/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class Class380
{
    Class351 aClass351_5656;
    public static Class577 aClass577_5657;
    static int anInt5658;
    public static byte currentFcKickReq;//aByte5659
    static int anInt5660;
    
    public abstract Class241_Sub16 method6857(int i);
    
    public abstract void method6858(float f, int[][][] is, Class215 class215,
				    int i, int i_0_, int i_1_);
    
    public abstract boolean method6859(byte i);
    
    public abstract double[] method6860(short i);
    
    Class380(Class351 class351) {
	((Class380) this).aClass351_5656 = class351;
    }
    
    public abstract void method6861(RSByteBuffer class241_sub3);
    
    public abstract float method6862(short i);
    
    public abstract void method6863(Class79 class79, int i, int i_2_,
				    byte i_3_);
    
    public abstract void method6864(RSByteBuffer class241_sub3, byte i);
    
    public abstract void method6865(float f, int[][][] is, Class215 class215,
				    int i, int i_4_);
    
    public abstract void method6866(float f, int[][][] is, Class215 class215,
				    int i, int i_5_);
    
    public abstract Class287 method6867(int i);
    
    public abstract Class287 method6868();
    
    public abstract boolean method6869();
    
    public abstract void method6870(RSByteBuffer class241_sub3);
    
    public abstract Class287 method6871();
    
    public abstract boolean method6872();
    
    public abstract Class241_Sub16 method6873();
    
    public abstract Class241_Sub16 method6874();
    
    public abstract float method6875();
    
    public abstract float method6876();
    
    public abstract void method6877(Class79 class79, int i, int i_6_);
    
    public abstract Class287 method6878();
    
    public abstract double[] method6879();
    
    public static Class319 method6880(RSByteBuffer class241_sub3, int i) {
	int i_7_ = class241_sub3.readBigSmart((byte) -47);
	Class330 class330 = (Class200.method4070((byte) 6)
			     [class241_sub3.readUnsignedByte((byte) 48)]);
	Class324 class324 = (Class327.method6016((byte) -43)
			     [class241_sub3.readUnsignedByte((byte) 16)]);
	int i_8_ = class241_sub3.readShort((byte) 65);
	int i_9_ = class241_sub3.readShort((byte) 76);
	return new Class319(i_7_, class330, class324, i_8_, i_9_);
    }
    
    public static byte[] method6881(Object object, int i, int i_10_,
				    int i_11_) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    return Arrays.copyOfRange(is, i, i + i_10_);
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[i_10_];
	    bytebuffer.position(i);
	    bytebuffer.get(is, 0, i_10_);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    public static void method6882(InterfaceDefinition class35, InterfaceComponent class58,
				  boolean bool, int i) {
	Class224.method4499(class35.components, class58, bool, (byte) 1);
    }
    
    static final void method6883(ClientScriptData class454, byte i) {
	int i_12_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int[] is = Class455.method10570(i_12_, 1966263026);
	Class430.method7703(is, 0, ((ClientScriptData) class454).integerStack,
			    1482319719 * ((ClientScriptData) class454).intStackPointer, 3);
	((ClientScriptData) class454).intStackPointer += 915295493;
    }
    
    static final void method6884(ClientScriptData class454, short i) {
	Class241_Sub39_Sub11 class241_sub39_sub11
	    = Class585.method12849(219624452);
	if (Class26.method953(class241_sub39_sub11, -1347698923) == 4) {
	    ObjectNode class241_sub26
		= ((ObjectNode)
		   (client.aClass407_8457.get
		    (class241_sub39_sub11.method17210(-932860891))));
	    if (class241_sub26 != null) {
		((ClientScriptData) class454).varEntity
		    = (Entity) class241_sub26.objectValue;
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = 1;
		return;
	    }
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
    }
}
