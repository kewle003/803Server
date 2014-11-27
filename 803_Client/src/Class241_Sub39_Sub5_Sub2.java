/* Class241_Sub39_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Class241_Sub39_Sub5_Sub2 extends Class241_Sub39_Sub5
{
    Future aFuture11281;
    int anInt11282;
    
    int method17109(int i) {
	if (((Class241_Sub39_Sub5_Sub2) this).aFuture11281 == null)
	    return 0;
	return (((Class241_Sub39_Sub5_Sub2) this).aFuture11281.isDone() ? 100
		: 0);
    }
    
    void method17660(Future future, int i) {
	((Class241_Sub39_Sub5_Sub2) this).aFuture11281 = future;
    }
    
    Class241_Sub39_Sub5_Sub2(int i) {
	((Class241_Sub39_Sub5_Sub2) this).anInt11282 = 934547175 * i;
    }
    
    byte[] method17108(int i) {
	do {
	    if (((Class241_Sub39_Sub5_Sub2) this).aFuture11281.isDone()) {
		byte[] is;
		try {
		    is = ((Class293)
			  ((Class241_Sub39_Sub5_Sub2) this).aFuture11281.get())
			     .method5690(1036565818);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    byte[] method17110() {
	do {
	    if (((Class241_Sub39_Sub5_Sub2) this).aFuture11281.isDone()) {
		byte[] is;
		try {
		    is = ((Class293)
			  ((Class241_Sub39_Sub5_Sub2) this).aFuture11281.get())
			     .method5690(1036565818);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    int method17111() {
	if (((Class241_Sub39_Sub5_Sub2) this).aFuture11281 == null)
	    return 0;
	return (((Class241_Sub39_Sub5_Sub2) this).aFuture11281.isDone() ? 100
		: 0);
    }
}
