/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

public class Class149
{
    Buffer aBuffer1705;
    Class103_Sub1 aClass103_Sub1_1706;
    
    void method3232(byte[] is, int i) {
	if (((Class149) this).aBuffer1705 == null
	    || ((Class149) this).aBuffer1705.method55() < i)
	    ((Class149) this).aBuffer1705
		= ((Class103_Sub1) ((Class149) this).aClass103_Sub1_1706)
		      .aNativeHeap9165.method963(i, false);
	((Class149) this).aBuffer1705.method103(is, 0, 0, i);
    }
    
    void method3233(byte[] is, int i) {
	if (((Class149) this).aBuffer1705 == null
	    || ((Class149) this).aBuffer1705.method55() < i)
	    ((Class149) this).aBuffer1705
		= ((Class103_Sub1) ((Class149) this).aClass103_Sub1_1706)
		      .aNativeHeap9165.method963(i, false);
	((Class149) this).aBuffer1705.method103(is, 0, 0, i);
    }
    
    void method3234(byte[] is, int i) {
	if (((Class149) this).aBuffer1705 == null
	    || ((Class149) this).aBuffer1705.method55() < i)
	    ((Class149) this).aBuffer1705
		= ((Class103_Sub1) ((Class149) this).aClass103_Sub1_1706)
		      .aNativeHeap9165.method963(i, false);
	((Class149) this).aBuffer1705.method103(is, 0, 0, i);
    }
    
    Class149(Class103_Sub1 class103_sub1, byte[] is, int i) {
	((Class149) this).aClass103_Sub1_1706 = class103_sub1;
	((Class149) this).aBuffer1705
	    = ((Class103_Sub1) ((Class149) this).aClass103_Sub1_1706)
		  .aNativeHeap9165.method963(i, false);
	if (is != null)
	    ((Class149) this).aBuffer1705.method103(is, 0, 0, i);
    }
    
    Class149(Class103_Sub1 class103_sub1, Buffer buffer) {
	((Class149) this).aClass103_Sub1_1706 = class103_sub1;
	((Class149) this).aBuffer1705 = buffer;
    }
}
