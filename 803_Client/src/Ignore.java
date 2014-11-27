/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

//package rs2.client.friends;
public class Ignore {
    public String currentName;//aString39
    public String previousName;//aString40
    public boolean temporary;//aBool41
    public String note;//aString42
    
    Ignore() {
    	/* empty */
    }
    
    static void method509(int i) {
		if (Class185.aFileOutputStream2187 != null) {
		    try {
		    	Class185.aFileOutputStream2187.close();
		    } catch (IOException ioexception) {
		    	/* empty */
		    }
		}
		Class185.aFileOutputStream2187 = null;
    }
    
    public static void method510(int i) {
    	Class194.anInt2299 = -472227899;
    }
}
