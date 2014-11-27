/* Exception_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub4 extends Exception
{
    public String aString10696;
    public int anInt10697;
    
    public Exception_Sub4(int i, String string) {
	this(i, string, null);
    }
    
    public Exception_Sub4(int i, String string, Throwable throwable) {
	super(throwable);
	aString10696 = string;
	anInt10697 = i * 1626765569;
    }
    
    static void method16945(Class103 class103, ObjectDefinition class526, int i,
			    int i_0_, int i_1_, byte i_2_) {
	Class601 class601
	    = Class8.aClass598_46.method13117(class526.anInt6864 * -1848119147,
					      -55488957);
	if (-1 != class601.anInt7729 * 1186810875) {
	    if (class526.aBool6865) {
		i += class526.anInt6851 * 1592819903;
		i &= 0x3;
	    } else
		i = 0;
	    Class168 class168
		= class601.method13157(class103, i, class526.aBool6867,
				       (byte) -70);
	    if (null != class168) {
		int i_3_ = 1351092869 * class526.sizeX;
		int i_4_ = 333584223 * class526.sizeY;
		if ((i & 0x1) == 1) {
		    i_3_ = class526.sizeY * 333584223;
		    i_4_ = 1351092869 * class526.sizeX;
		}
		int i_5_ = class168.method64();
		int i_6_ = class168.method3616();
		if (class601.aBool7726) {
		    i_5_ = i_3_ * 4;
		    i_6_ = i_4_ * 4;
		}
		if (class601.anInt7727 * 987858283 != 0)
		    class168.method3615(i_0_, i_1_ - 4 * (i_4_ - 1), i_5_,
					i_6_, 0,
					(~0xffffff
					 | 987858283 * class601.anInt7727),
					1);
		else
		    class168.method3614(i_0_, i_1_ - 4 * (i_4_ - 1), i_5_,
					i_6_);
	    }
	}
    }
}
