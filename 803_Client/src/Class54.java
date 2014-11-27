/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class54
{
    byte[] aByteArray692;
    int anInt693;
    static JS5 aClass210_694;
    
    String method1298(int i) {
	int i_0_ = method1300(1931728606);
	if (-1 == i_0_)
	    return null;
	if (i_0_ > 256)
	    throw new RuntimeException_Sub4();
	String string
	    = new String(((Class54) this).aByteArray692,
			 ((Class54) this).anInt693 * -145964977, i_0_);
	((Class54) this).anInt693 += i_0_ * -1649256785;
	return string;
    }
    
    String method1299() {
	int i = method1300(2058794082);
	if (-1 == i)
	    return null;
	if (i > 256)
	    throw new RuntimeException_Sub4();
	String string = new String(((Class54) this).aByteArray692,
				   ((Class54) this).anInt693 * -145964977, i);
	((Class54) this).anInt693 += i * -1649256785;
	return string;
    }
    
    int method1300(int i) {
	short i_1_ = 0;
	for (int i_2_ = 0; i_2_ < 2; i_2_++)
	    i_1_ |= ((((Class54) this).aByteArray692
		      [((((Class54) this).anInt693 += -1649256785) * -145964977
			- 1)])
		     & 0xff) << 8 * i_2_;
	return i_1_;
    }
    
    Class54(byte[] is) {
	((Class54) this).aByteArray692 = is;
	((Class54) this).anInt693 = 0;
    }
    
    public static boolean method1301(int i, int[] is, byte i_3_) {
		if (Class473.aBoolArray6378[i])
		    return true;
		Class187.aClass35Array2203[i]
		    = Class551.method12094(i, is, Class187.aClass35Array2203[i], false,
					   (byte) -79);
		if (Class187.aClass35Array2203[i] == null)
		    return false;
		Class473.aBoolArray6378[i] = true;
		return true;
    }
    
    static final void method1302(int i, HashTable class407, byte i_4_) {
	if (i != -1 && class407.get((long) i) == null)
	    class407.put(new Node(), (long) i);
    }
    
    static final void method1303(ClientScriptData class454, int i) {
	int i_5_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 433971195 * client.aClass220Array8426[i_5_].anInt2564;
    }
    
    static final void method1304(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aShort8341;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.aShort8569;
    }
    
    static final void method1305(ClientScriptData class454, int i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	NPC class475_sub1_sub1_sub3_sub2
	    = ((NPC)
	       ((ClientScriptData) class454).varEntity);
	int i_7_ = class475_sub1_sub1_sub3_sub2.method18011(i_6_, -2112129276);
	int i_8_ = class475_sub1_sub1_sub3_sub2.method17995(i_6_, 772486670);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_7_;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_8_;
    }
    
    public static int method1306(int i, int i_9_, float f, int i_10_) {
	return CsDelta_Add.method17423(i, i_9_, (int) f, -1102342848);
    }
    
    static byte[] method1307(File file, int i, byte i_11_) {
		byte[] is;
		try {
		    byte[] is_12_ = new byte[i];
		    Class483.readFile(file, is_12_, i, 1826360497);
		    is = is_12_;
		} catch (IOException ioexception) {
		    return null;
		}
		return is;
    }
    
    static final void method1308(ClientScriptData class454, int i) {
	int i_13_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class1.aClass19_11.getBaseLevel(i_13_, (byte) 88);
    }
}
