/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Class10
{
    static BigInteger aBigInteger54;
    static BigInteger aBigInteger55
	= (new BigInteger
	   ("80782894952180643741752986186714059433953886149239752893425047584684715842049"));
    static final String aString56 = "passwordchoice.ws";
    static final int anInt57 = 1000;
    static final String aString58 = "m=accountappeal/login.ws";
    static final int anInt59 = 6;
    static final int anInt60 = 2;
    static final int anInt61 = 2;
    static final int anInt62 = 4;
    public static final int anInt63 = 5;
    static final int anInt64 = 3;
    static final int anInt65 = 7;
    static final String aString66 = "services";
    public static int anInt67;
    public static int anInt68;
    
    static boolean method576(String string) {
	if (string == null)
	    return false;
	try {
	    new URL(string);
	} catch (MalformedURLException malformedurlexception) {
	    return false;
	}
	return true;
    }
    
    static {
	aBigInteger54
	    = (new BigInteger
	       ("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"));
    }
    
    public static long method577() {
	long l;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class589.method12904("services", false,
							-1852374183))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setRequestProperty("connection", "close");
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write("data1=req");
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    RSByteBuffer class241_sub3 = new RSByteBuffer(new byte[1000]);
	    for (;;) {
		int i = inputstream.read(class241_sub3.payload,
					 421967667 * class241_sub3.pointer,
					 1000 - (421967667
						 * class241_sub3.pointer));
		if (-1 == i)
		    break;
		class241_sub3.pointer += -681042949 * i;
		if (class241_sub3.pointer * 421967667 >= 1000)
		    return 0L;
	    }
	    class241_sub3.pointer = 0;
	    long l_0_ = class241_sub3.readLong((short) 10447);
	    l = l_0_;
	} catch (Exception exception) {
	    return 0L;
	}
	return l;
    }
    
    Class10() throws Throwable {
	throw new Error();
    }
    
    public static void method578(JS5 class210, int i) {
	Class332.aClass210_5050 = class210;
    }
    
    public static int method579(int i, int i_1_, int i_2_, int i_3_) {
	i_2_ &= 0x3;
	if (i_2_ == 0)
	    return i;
	if (i_2_ == 1)
	    return i_1_;
	if (2 == i_2_)
	    return 4095 - i;
	return 4095 - i_1_;
    }
    
    public static boolean method580(int i) {
	Class241_Sub1 class241_sub1
	    = (Class241_Sub1) Class622.aClass429_7878.method7694(16711935);
	if (class241_sub1 == null)
	    return false;
	return true;
    }
    
    public static void method581(VarType class179, int i) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC
		  .method18030(1, (long) (414229387 * class179.id));
	class241_sub39_sub13.method17278((byte) -118);
    }
}
