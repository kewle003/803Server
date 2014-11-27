/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class292
{
    static final int anInt4489 = 32768;
    JS5 aClass210_4490;
    Class129 aClass129_4491 = new Class129(64);
    static final int anInt4492 = 0;
    JS5 aClass210_4493;
    
    public Class292(Language class437, JS5 class210,
		    JS5 class210_0_) {
	((Class292) this).aClass210_4490 = class210;
	((Class292) this).aClass210_4493 = class210_0_;
	if (null != ((Class292) this).aClass210_4490)
	    ((Class292) this).aClass210_4490.getContainerCount(0, (byte) -71);
	if (null != ((Class292) this).aClass210_4493)
	    ((Class292) this).aClass210_4493.getContainerCount(0, (byte) -14);
    }
    
    public Class241_Sub39_Sub14 method5686(int i, byte i_1_) {
	Class241_Sub39_Sub14 class241_sub39_sub14
	    = ((Class241_Sub39_Sub14)
	       ((Class292) this).aClass129_4491.get((long) i));
	if (null != class241_sub39_sub14)
	    return class241_sub39_sub14;
	byte[] is;
	if (i >= 32768)
	    is = ((Class292) this).aClass210_4493.getfile(0, i & 0x7fff,
							     -1272241350);
	else
	    is = ((Class292) this).aClass210_4490.getfile(0, i, 1533989451);
	class241_sub39_sub14 = new Class241_Sub39_Sub14();
	if (is != null)
	    class241_sub39_sub14.method17376(new RSByteBuffer(is), (byte) 81);
	if (i >= 32768)
	    class241_sub39_sub14.method17383(-1518383545);
	((Class292) this).aClass129_4491.put(class241_sub39_sub14,
						    (long) i);
	return class241_sub39_sub14;
    }
    
    public Class241_Sub39_Sub14 method5687(int i) {
	Class241_Sub39_Sub14 class241_sub39_sub14
	    = ((Class241_Sub39_Sub14)
	       ((Class292) this).aClass129_4491.get((long) i));
	if (null != class241_sub39_sub14)
	    return class241_sub39_sub14;
	byte[] is;
	if (i >= 32768)
	    is = ((Class292) this).aClass210_4493.getfile(0, i & 0x7fff,
							     -538554528);
	else
	    is = ((Class292) this).aClass210_4490.getfile(0, i, -692406283);
	class241_sub39_sub14 = new Class241_Sub39_Sub14();
	if (is != null)
	    class241_sub39_sub14.method17376(new RSByteBuffer(is), (byte) 86);
	if (i >= 32768)
	    class241_sub39_sub14.method17383(-114510609);
	((Class292) this).aClass129_4491.put(class241_sub39_sub14,
						    (long) i);
	return class241_sub39_sub14;
    }
    
    static String method5688(String string, int i) {
	if (Class240.aString2771.startsWith("win"))
	    return new StringBuilder().append(string).append(".dll")
		       .toString();
	if (Class240.aString2771.startsWith("linux"))
	    return new StringBuilder().append("lib").append(string).append
		       (".so").toString();
	if (Class240.aString2771.startsWith("mac"))
	    return new StringBuilder().append("lib").append(string).append
		       (".dylib").toString();
	return null;
    }
    
    static final void stripCodeBlocks/*method5689*/(ClientScriptData scriptData, int i) {
		String string = (String) 
				scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331];
		StringBuilder stringbuilder = new StringBuilder(string.length());
		boolean bool = false;
		for (int index = 0; index < string.length(); index++) {
		    char c = string.charAt(index);
		    if (c == '<') {
		    	bool = true;
		    } else if (c == '>') {
		    	bool = false;
		    } else if (!bool) {
		    	stringbuilder.append(c);
		    }
		}
		scriptData.objectStack[(scriptData.objectStackPointer += -1650705371) * -290357331 - 1]
		    = stringbuilder.toString();
    }
}
