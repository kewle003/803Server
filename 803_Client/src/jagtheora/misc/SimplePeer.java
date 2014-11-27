/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer
{
    private long peer;
    
    protected SimplePeer() {
	/* empty */
    }
    
    private static native void init();
    
    public final boolean method7215() {
	return 0L == peer;
    }
    
    private final void setPeer(long l) {
	peer = l;
    }
    
    public final void method7216() {
	if (!method7215())
	    clear();
    }
    
    protected abstract void clear();
    
    protected void finalize() throws Throwable {
	if (!method7215())
	    method7216();
	super.finalize();
    }
    
    static {
	init();
    }
    
    protected void method7217() throws Throwable {
	if (!method7215())
	    method7216();
	super.finalize();
    }
    
    protected void method7218() throws Throwable {
	if (!method7215())
	    method7216();
	super.finalize();
    }
    
    protected void method7219() throws Throwable {
	if (!method7215())
	    method7216();
	super.finalize();
    }
    
    protected void method7220() throws Throwable {
	if (!method7215())
	    method7216();
	super.finalize();
    }
    
    public final boolean method7221() {
	return 0L == peer;
    }
    
    public final boolean method7222() {
	return 0L == peer;
    }
    
    public final void method7223() {
	if (!method7215())
	    clear();
    }
    
    protected abstract void b();
}
