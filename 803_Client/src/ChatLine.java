/* Class241_Sub39_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class ChatLine extends Class241_Sub39
{
    public String name;//aString10828
    public int time;//anInt10829
    public String clan;//aString10830
    public int flags;//anInt10831
    public String nameSimple;//aString10832
    public String nameUnfiltered;//aString10833
    public int anInt10834 = Class564.method12418((byte) -29) * 2062137391;
    public int type;//anInt10835
    public int anInt10836;
    public String message;//aString10837
    
    void method17104(int type, int flags, String name, String nameUnfiltered,
		     String nameSimple, String clan, int i_4_,
		     String message, int i_6_) {//Used
		this.anInt10834 = Class564.method12418((byte) -120) * 2062137391;
		this.time = 1428919781 * client.anInt8296;
		this.type = 287613289 * type;
		this.flags = flags * 680359851;
		this.name = name;
		this.nameUnfiltered = nameUnfiltered;
		this.nameSimple = nameSimple;
		this.clan = clan;
		this.anInt10836 = -221168477 * i_4_;
		this.message = message;
    }
    
    void dummyMethod17105(int i, int i_7_, String string, String string_8_,
		     String string_9_, String string_10_, int i_11_,
		     String string_12_) {
	anInt10834 = Class564.method12418((byte) -111) * 2062137391;
	time = 1428919781 * client.anInt8296;
	type = 287613289 * i;
	flags = i_7_ * 680359851;
	name = string;
	nameUnfiltered = string_8_;
	nameSimple = string_9_;
	clan = string_10_;
	anInt10836 = -221168477 * i_11_;
	message = string_12_;
    }
    
    ChatLine(int type, int flags, String name, String nameUnfiltered,
			String nameSimple, String clan, int i_17_, String message) {
		this.time = client.anInt8296 * 1428919781;
		this.type = type * 287613289;
		this.flags = 680359851 * flags;
		this.name = name;
		this.nameUnfiltered = nameUnfiltered;
		this.nameSimple = nameSimple;
		this.clan = clan;
		this.anInt10836 = -221168477 * i_17_;
		this.message = message;
    }
    
    void method17106(int i, int i_19_, String string, String string_20_,
		     String string_21_, String string_22_, int i_23_,
		     String string_24_) {
	anInt10834 = Class564.method12418((byte) -5) * 2062137391;
	time = 1428919781 * client.anInt8296;
	type = 287613289 * i;
	flags = i_19_ * 680359851;
	name = string;
	nameUnfiltered = string_20_;
	nameSimple = string_21_;
	clan = string_22_;
	anInt10836 = -221168477 * i_23_;
	message = string_24_;
    }
    
    public static Object method17107(byte[] is, boolean bool, int i) {
	if (null == is)
	    return null;
	if (is.length > 136) {
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
	    bytebuffer.position(0);
	    bytebuffer.put(is);
	    return bytebuffer;
	}
	if (bool)
	    return Arrays.copyOf(is, is.length);
	return is;
    }
}
