/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream
{
    private Buffer aBuffer2140;
    private int anInt2141;
    private int anInt2142;
    private int anInt2143;
    private byte[] aByteArray2144;
    private static boolean aBool2145 = getLSB(-65536) == -1;
    
    public Stream() {
	this(4096);
    }
    
    private Stream(int i) {
	aByteArray2144 = new byte[i];
    }
    
    public Stream(Buffer buffer) {
	this(buffer, 0, buffer.method55());
    }
    
    private Stream(Buffer buffer, int i, int i_0_) {
	this(buffer.method55() < 4096 ? buffer.method55() : 4096);
	method3781(buffer, i, i_0_);
    }
    
    private void method3781(Buffer buffer, int i, int i_1_) {
	method3787();
	aBuffer2140 = buffer;
	anInt2142 = -1256528777 * i;
	anInt2141 = (i_1_ + i) * 179007467;
	if (1569538243 * anInt2141 > buffer.method55())
	    throw new RuntimeException();
    }
    
    public int method3782() {
	return anInt2143 * 1306413011 + anInt2142 * 1395799367;
    }
    
    public void method3783(int i) {
	method3787();
	anInt2142 = i * -1256528777;
    }
    
    public void method3784(int i) {
	if (1306413011 * anInt2143 >= aByteArray2144.length)
	    method3787();
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1] = (byte) i;
    }
    
    public void method3785(float f) {
	if (anInt2143 * 1306413011 + 3 >= aByteArray2144.length)
	    method3787();
	int i = floatToRawIntBits(f);
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1]
	    = (byte) (i >> 24);
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1]
	    = (byte) (i >> 16);
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1]
	    = (byte) (i >> 8);
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1] = (byte) i;
    }
    
    public void method3786(float f) {
	if (1306413011 * anInt2143 + 3 >= aByteArray2144.length)
	    method3787();
	int i = floatToRawIntBits(f);
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1] = (byte) i;
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1]
	    = (byte) (i >> 8);
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1]
	    = (byte) (i >> 16);
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method3787() {
	if (anInt2143 * 1306413011 > 0) {
	    if (1395799367 * anInt2142 + 1306413011 * anInt2143
		> 1569538243 * anInt2141)
		throw new RuntimeException();
	    aBuffer2140.method103(aByteArray2144, 0, 1395799367 * anInt2142,
				  1306413011 * anInt2143);
	    anInt2142 += -1531359467 * anInt2143;
	    anInt2143 = 0;
	}
    }
    
    public static final boolean method3788() {
	return aBool2145;
    }
    
    public static native int floatToRawIntBits(float f);
    
    private static final native byte getLSB(int i);
    
    private void method3789(Buffer buffer, int i, int i_2_) {
	method3787();
	aBuffer2140 = buffer;
	anInt2142 = -1256528777 * i;
	anInt2141 = (i_2_ + i) * 179007467;
	if (1569538243 * anInt2141 > buffer.method55())
	    throw new RuntimeException();
    }
    
    private void method3790(Buffer buffer, int i, int i_3_) {
	method3787();
	aBuffer2140 = buffer;
	anInt2142 = -1256528777 * i;
	anInt2141 = (i_3_ + i) * 179007467;
	if (1569538243 * anInt2141 > buffer.method55())
	    throw new RuntimeException();
    }
    
    private void method3791(Buffer buffer, int i, int i_4_) {
	method3787();
	aBuffer2140 = buffer;
	anInt2142 = -1256528777 * i;
	anInt2141 = (i_4_ + i) * 179007467;
	if (1569538243 * anInt2141 > buffer.method55())
	    throw new RuntimeException();
    }
    
    private void method3792(Buffer buffer, int i, int i_5_) {
	method3787();
	aBuffer2140 = buffer;
	anInt2142 = -1256528777 * i;
	anInt2141 = (i_5_ + i) * 179007467;
	if (1569538243 * anInt2141 > buffer.method55())
	    throw new RuntimeException();
    }
    
    public int method3793() {
	return anInt2143 * 1306413011 + anInt2142 * 1395799367;
    }
    
    public int method3794() {
	return anInt2143 * 1306413011 + anInt2142 * 1395799367;
    }
    
    public void method3795(int i) {
	method3787();
	anInt2142 = i * -1256528777;
    }
    
    public void method3796(int i) {
	if (1306413011 * anInt2143 >= aByteArray2144.length)
	    method3787();
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1] = (byte) i;
    }
    
    public void method3797(float f) {
	if (1306413011 * anInt2143 + 3 >= aByteArray2144.length)
	    method3787();
	int i = floatToRawIntBits(f);
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1] = (byte) i;
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1]
	    = (byte) (i >> 8);
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1]
	    = (byte) (i >> 16);
	aByteArray2144[(anInt2143 += -478238629) * 1306413011 - 1]
	    = (byte) (i >> 24);
    }
    
    public static final boolean method3798() {
	return aBool2145;
    }
}
