/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source
{
    private int anInt5447 = 1065735775;
    private long aLong5448;
    
    protected NativeBuffer() {
	/* empty */
    }
    
    public final int method55() {
	return anInt5447 * 1353710177;
    }
    
    public final long method98() {
	return -1349871533772643801L * aLong5448;
    }
    
    public void method103(byte[] is, int i, int i_0_, int i_1_) {
	if (-1349871533772643801L * aLong5448 == 0L | is == null | i < 0
	    | i + i_1_ > is.length | i_0_ < 0
	    | i_0_ + i_1_ > anInt5447 * 1353710177)
	    throw new RuntimeException();
	put(aLong5448 * -1349871533772643801L, is, i, i_0_, i_1_);
    }
    
    private final native void get(long l, byte[] is, int i, int i_2_,
				  int i_3_);
    
    private final native void put(long l, byte[] is, int i, int i_4_,
				  int i_5_);
    
    public void method104(byte[] is, int i, int i_6_, int i_7_) {
	if (-1349871533772643801L * aLong5448 == 0L | is == null | i < 0
	    | i + i_7_ > is.length | i_6_ < 0
	    | i_6_ + i_7_ > anInt5447 * 1353710177)
	    throw new RuntimeException();
	put(aLong5448 * -1349871533772643801L, is, i, i_6_, i_7_);
    }
    
    public void method105(byte[] is, int i, int i_8_, int i_9_) {
	if (-1349871533772643801L * aLong5448 == 0L | is == null | i < 0
	    | i + i_9_ > is.length | i_8_ < 0
	    | i_8_ + i_9_ > anInt5447 * 1353710177)
	    throw new RuntimeException();
	put(aLong5448 * -1349871533772643801L, is, i, i_8_, i_9_);
    }
    
    public void method106(byte[] is, int i, int i_10_, int i_11_) {
	if (-1349871533772643801L * aLong5448 == 0L | is == null | i < 0
	    | i + i_11_ > is.length | i_10_ < 0
	    | i_10_ + i_11_ > anInt5447 * 1353710177)
	    throw new RuntimeException();
	put(aLong5448 * -1349871533772643801L, is, i, i_10_, i_11_);
    }
    
    public final int method54() {
	return anInt5447 * 1353710177;
    }
    
    public final int method48() {
	return anInt5447 * 1353710177;
    }
    
    public final long method56() {
	return -1349871533772643801L * aLong5448;
    }
}
