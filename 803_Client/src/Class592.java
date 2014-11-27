/* Class592 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class592
{
    static Hashtable<String, File> aHashtable7627;
    static File aFile7628;
    static boolean aBool7629 = false;
    
    public static File method12919(String string) {
	if (!aBool7629)
	    throw new RuntimeException("");
	File file = (File) aHashtable7627.get(string);
	if (file != null)
	    return file;
	File file_0_ = new File(aFile7628, string);
	RandomAccessFile randomaccessfile = null;
	File file_1_;
	try {
	    File file_2_ = new File(file_0_.getParent());
	    if (!file_2_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_0_, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    aHashtable7627.put(string, file_0_);
	    file_1_ = file_0_;
	} catch (Exception exception) {
	    try {
		if (randomaccessfile != null) {
		    randomaccessfile.close();
		    //Object object = null;
		}
	    } catch (Exception exception_3_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_1_;
    }
    
    static {
	aHashtable7627 = new Hashtable<String, File>(16);
    }
    
    public static File method12920(String string) {
	if (!aBool7629)
	    throw new RuntimeException("");
	File file = (File) aHashtable7627.get(string);
	if (file != null)
	    return file;
	File file_4_ = new File(aFile7628, string);
	RandomAccessFile randomaccessfile = null;
	File file_5_;
	try {
	    File file_6_ = new File(file_4_.getParent());
	    if (!file_6_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_4_, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    aHashtable7627.put(string, file_4_);
	    file_5_ = file_4_;
	} catch (Exception exception) {
	    try {
		if (randomaccessfile != null) {
		    randomaccessfile.close();
		    //Object object = null;
		}
	    } catch (Exception exception_7_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_5_;
    }
    
    public static File method12921(String string) {
	if (!aBool7629)
	    throw new RuntimeException("");
	File file = (File) aHashtable7627.get(string);
	if (file != null)
	    return file;
	File file_8_ = new File(aFile7628, string);
	RandomAccessFile randomaccessfile = null;
	File file_9_;
	try {
	    File file_10_ = new File(file_8_.getParent());
	    if (!file_10_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_8_, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    aHashtable7627.put(string, file_8_);
	    file_9_ = file_8_;
	} catch (Exception exception) {
	    try {
		if (randomaccessfile != null) {
		    randomaccessfile.close();
		    //Object object = null;
		}
	    } catch (Exception exception_11_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_9_;
    }
    
    public static File method12922(String string) {
	if (!aBool7629)
	    throw new RuntimeException("");
	File file = (File) aHashtable7627.get(string);
	if (file != null)
	    return file;
	File file_12_ = new File(aFile7628, string);
	RandomAccessFile randomaccessfile = null;
	File file_13_;
	try {
	    File file_14_ = new File(file_12_.getParent());
	    if (!file_14_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_12_, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    aHashtable7627.put(string, file_12_);
	    file_13_ = file_12_;
	} catch (Exception exception) {
	    try {
		if (randomaccessfile != null) {
		    randomaccessfile.close();
		    //Object object = null;
		}
	    } catch (Exception exception_15_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_13_;
    }
    
    Class592() throws Throwable {
	throw new Error();
    }
    
    static void method12923(File file) {
	aFile7628 = file;
	if (!aFile7628.exists())
	    throw new RuntimeException("");
	aBool7629 = true;
    }
    
    public static final void method12924(int i, int i_16_) {
	for (int i_17_ = 0; i_17_ < 5; i_17_++)
	    client.aBoolArray8517[i_17_] = false;
	client.anInt8418 = 2047280193;
	client.anInt8480 = -759340061;
	Class180.anInt2136 = 0;
	Class62.anInt1029 = 0;
	Class254.anInt4134 = -162819257;
	Class245.anInt3961 = -1540801703;
	Class296.anInt4513 = 1415978969 * i;
	if (4 != 115241065 * Class296.anInt4513)
	    Class322.aLong4910 = 0L;
    }
    
    static final void method12925(ClientScriptData class454, int i) {
	boolean bool
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	if (bool)
	    method12924(4, 138421740);
	else
	    method12924(3, 952847594);
    }
}
