/* Class597 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class597
{
    public static final long aLong7704 = 94608000L;
    
    Class597() throws Throwable {
	throw new Error();
    }
    
    public static final void method13113(int i) {
	if (!client.aBool8280) {
	    client.aFloat8394 += (24.0F - client.aFloat8394) / 2.0F;
	    client.aBool8392 = true;
	    client.aBool8280 = true;
	}
    }
    
    static final void method13114(int i, int i_0_) {
	client.anIntArray8423 = new int[i];
	client.anIntArray8424 = new int[i];
	client.anIntArray8425 = new int[i];
	client.anIntArray8529 = new int[i];
	client.anIntArray8427 = new int[i];
    }
    
    static void setVarc/*method13115*/(int key, int value, int i_2_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(1, (long) key);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 = value * -1741260507;
    }
}
