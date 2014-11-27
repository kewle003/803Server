/* Frame - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer
{
    public int anInt10632;
    public int anInt10633;
    public int[] pixels;
    
    public Frame(int i, int i_0_) {
	anInt10632 = i * -1683445117;
	anInt10633 = i_0_ * -1468263031;
	pixels = new int[-2139589589 * anInt10632 * (anInt10633 * -201002823)];
    }
    
    private static native void init();
    
    protected native void clear();
    
    static {
	init();
    }
    
    protected native void b();
}
