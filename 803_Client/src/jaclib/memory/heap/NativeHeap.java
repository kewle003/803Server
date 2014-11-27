/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap
{
    long peer;
    private int anInt362;
    private boolean aBool363;
    
    public NativeHeap(int i) {
	anInt362 = i * 915026941;
	allocateHeap(anInt362 * -1828208299);
	aBool363 = true;
    }
    
    synchronized boolean method962() {
	return aBool363;
    }
    
    public NativeHeapBuffer method963(int i, boolean bool) {
	if (!aBool363)
	    throw new IllegalStateException();
	return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }
    
    public synchronized void method964() {
	if (aBool363)
	    deallocateHeap();
	aBool363 = false;
    }
    
    private native void allocateHeap(int i);
    
    private native void deallocateHeap();
    
    synchronized native int allocateBuffer(int i, boolean bool);
    
    synchronized native long getBufferAddress(int i);
    
    synchronized native void get(int i, byte[] is, int i_0_, int i_1_,
				 int i_2_);
    
    synchronized native void put(int i, byte[] is, int i_3_, int i_4_,
				 int i_5_);
    
    synchronized native void deallocateBuffer(int i);
    
    public synchronized native void copy(long l, long l_6_, int i);
    
    protected synchronized void finalize() throws Throwable {
	super.finalize();
	method964();
    }
    
    protected synchronized void method965() throws Throwable {
	super.finalize();
	method964();
    }
    
    protected synchronized void method966() throws Throwable {
	super.finalize();
	method964();
    }
    
    protected synchronized void method967() throws Throwable {
	super.finalize();
	method964();
    }
    
    protected synchronized void method968() throws Throwable {
	super.finalize();
	method964();
    }
    
    synchronized boolean method969() {
	return aBool363;
    }
    
    synchronized boolean method970() {
	return aBool363;
    }
    
    synchronized boolean method971() {
	return aBool363;
    }
    
    public NativeHeapBuffer method972(int i, boolean bool) {
	if (!aBool363)
	    throw new IllegalStateException();
	return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }
    
    public NativeHeapBuffer method973(int i, boolean bool) {
	if (!aBool363)
	    throw new IllegalStateException();
	return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }
    
    public synchronized void method974() {
	if (aBool363)
	    deallocateHeap();
	aBool363 = false;
    }
    
    public synchronized void method975() {
	if (aBool363)
	    deallocateHeap();
	aBool363 = false;
    }
}
