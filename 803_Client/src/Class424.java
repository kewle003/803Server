/* Class424 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class Class424
{
    static String aString6068;
    static int anInt6069;
    
    public static byte[] method7561(Object object, int i, int i_0_) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    return Arrays.copyOfRange(is, i, i + i_0_);
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[i_0_];
	    bytebuffer.position(i);
	    bytebuffer.get(is, 0, i_0_);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    Class424() throws Throwable {
	throw new Error();
    }
    
    public static Object method7562(byte[] is, boolean bool) {
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
    
    public static Object method7563(byte[] is, boolean bool) {
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
    
    public static Object method7564(byte[] is, boolean bool) {
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
    
    public static byte[] method7565(Object object, boolean bool) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (bool)
		return Arrays.copyOf(is, is.length);
	    return is;
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[bytebuffer.capacity()];
	    bytebuffer.position(0);
	    bytebuffer.get(is);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    public static Object method7566(byte[] is, boolean bool) {
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
    
    static final void method7567(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class281.method5488(class58, class35, false, 0, class454, -1939441449);
    }
}
