/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;
import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source
{
    private int anInt1073;
    public NativeHeap aNativeHeap1074;
    private int anInt1075;
    private boolean aBool1076 = true;
    
    NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
	aNativeHeap1074 = nativeheap;
	anInt1075 = i * -1722519089;
	anInt1073 = i_0_ * 1548324919;
    }
    
    private final synchronized boolean method1685() {
	return aNativeHeap1074.method962() && aBool1076;
    }
    
    public final long method98() {
	return aNativeHeap1074.getBufferAddress(anInt1075 * 925693231);
    }
    
    public final int method55() {
	return anInt1073 * 118171015;
    }
    
    public final synchronized void method103(byte[] is, int i, int i_1_,
					     int i_2_) {
	if (!method1685() | null == is | i < 0 | i_2_ + i > is.length
	    | i_1_ < 0 | i_2_ + i_1_ > anInt1073 * 118171015)
	    throw new RuntimeException();
	aNativeHeap1074.put(925693231 * anInt1075, is, i, i_1_, i_2_);
    }
    
    public final synchronized void method1686() {
	if (method1685())
	    aNativeHeap1074.deallocateBuffer(925693231 * anInt1075);
	aBool1076 = false;
    }
    
    protected final synchronized void finalize() throws Throwable {
	super.finalize();
	method1686();
    }
    
    public final synchronized void method104(byte[] is, int i, int i_3_,
					     int i_4_) {
	if (!method1685() | null == is | i < 0 | i_4_ + i > is.length
	    | i_3_ < 0 | i_4_ + i_3_ > anInt1073 * 118171015)
	    throw new RuntimeException();
	aNativeHeap1074.put(925693231 * anInt1075, is, i, i_3_, i_4_);
    }
    
    public final synchronized void method105(byte[] is, int i, int i_5_,
					     int i_6_) {
	if (!method1685() | null == is | i < 0 | i_6_ + i > is.length
	    | i_5_ < 0 | i_6_ + i_5_ > anInt1073 * 118171015)
	    throw new RuntimeException();
	aNativeHeap1074.put(925693231 * anInt1075, is, i, i_5_, i_6_);
    }
    
    public final synchronized void method106(byte[] is, int i, int i_7_,
					     int i_8_) {
	if (!method1685() | null == is | i < 0 | i_8_ + i > is.length
	    | i_7_ < 0 | i_8_ + i_7_ > anInt1073 * 118171015)
	    throw new RuntimeException();
	aNativeHeap1074.put(925693231 * anInt1075, is, i, i_7_, i_8_);
    }
    
    protected final synchronized void method1687() throws Throwable {
	super.finalize();
	method1686();
    }
    
    protected final synchronized void method1688() throws Throwable {
	super.finalize();
	method1686();
    }
    
    protected final synchronized void method1689() throws Throwable {
	super.finalize();
	method1686();
    }
    
    protected final synchronized void method1690() throws Throwable {
	super.finalize();
	method1686();
    }
    
    public final int method54() {
	return anInt1073 * 118171015;
    }
    
    public final int method48() {
	return anInt1073 * 118171015;
    }
    
    public final long method56() {
	return aNativeHeap1074.getBufferAddress(anInt1075 * 925693231);
    }
}
