/* Class627 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class Class627
{
    static void method13464(File file, byte[] is, int i) throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    static void method13465(File file, byte[] is, int i) throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    static void method13466(File file, byte[] is, int i) throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    Class627() throws Throwable {
	throw new Error();
    }
    
    public static byte[] method13467(File file) {
	return Class54.method1307(file, (int) file.length(), (byte) 43);
    }
    
    public static byte[] method13468(File file) {
	return Class54.method1307(file, (int) file.length(), (byte) 46);
    }
    
    static final void method13469(ClientScriptData class454, short i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class610.method13228(i_0_, (byte) 88);
    }
    
    static final void setGuestChannel/*method13470*/(ClientScriptData scriptData, byte i) {
		if (null != Class239.guestClanChannel) {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= 1;
			scriptData.currentChannel = Class239.guestClanChannel;
		} else {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= 0;
		}
    }
}
