/* Class488 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class488
{
    String aString6481;
    int anInt6482;
    static int anInt6483;
    
    Class488() {
	/* empty */
    }
    
    public static void method11148(int i) {
	if (Class262.getEnvironment(-1452035864) != GameShell3.Environment.APPLICATION) {
	    try {
		String string
		    = Class421.gameApplet
			  .getParameter(Class260.aClass260_4229.aString4258);
		int i_0_
		    = (int) (Class50.method1249((byte) 1) / 86400000L) - 11745;
		String string_1_
		    = new StringBuilder().append("usrdob=").append(i_0_).append
			  ("; version=1; path=/; domain=").append
			  (string).toString();
		Class396.jsEval(Class421.gameApplet,
				    new StringBuilder().append
					("document.cookie=\"").append
					(string_1_).append
					("\"").toString(),
				    -1267564239);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
}
