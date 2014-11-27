/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class327 implements Iterator
{
    int anInt5016;
    int anInt5017 = 0;
    AbstractQueue_Sub1 anAbstractQueue_Sub1_5018;
    static Class411 aClass411_5019;
    static int anInt5020;
    
    public Object method6007() {
	if (627241061 * ((Class327) this).anInt5016
	    != (((AbstractQueue_Sub1)
		 ((Class327) this).anAbstractQueue_Sub1_5018).anInt10715
		* -1751991983))
	    throw new ConcurrentModificationException();
	if (((Class327) this).anInt5017 * -1711797251
	    < (((AbstractQueue_Sub1)
		((Class327) this).anAbstractQueue_Sub1_5018).anInt10712
	       * -1573335367)) {
	    Object object
		= (((Class318) (((AbstractQueue_Sub1)
				 ((Class327) this).anAbstractQueue_Sub1_5018)
				.aClass318Array10711
				[-1711797251 * ((Class327) this).anInt5017]))
		   .anObject4867);
	    ((Class327) this).anInt5017 += -1480414891;
	    return object;
	}
	throw new NoSuchElementException();
    }
    
    public boolean hasNext() {
	return (-1711797251 * ((Class327) this).anInt5017
		< -1573335367 * (((AbstractQueue_Sub1)
				  ((Class327) this).anAbstractQueue_Sub1_5018)
				 .anInt10712));
    }
    
    public Object next() {
	if (627241061 * ((Class327) this).anInt5016
	    != (((AbstractQueue_Sub1)
		 ((Class327) this).anAbstractQueue_Sub1_5018).anInt10715
		* -1751991983))
	    throw new ConcurrentModificationException();
	if (((Class327) this).anInt5017 * -1711797251
	    < (((AbstractQueue_Sub1)
		((Class327) this).anAbstractQueue_Sub1_5018).anInt10712
	       * -1573335367)) {
	    Object object
		= (((Class318) (((AbstractQueue_Sub1)
				 ((Class327) this).anAbstractQueue_Sub1_5018)
				.aClass318Array10711
				[-1711797251 * ((Class327) this).anInt5017]))
		   .anObject4867);
	    ((Class327) this).anInt5017 += -1480414891;
	    return object;
	}
	throw new NoSuchElementException();
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method6008() {
	return (-1711797251 * ((Class327) this).anInt5017
		< -1573335367 * (((AbstractQueue_Sub1)
				  ((Class327) this).anAbstractQueue_Sub1_5018)
				 .anInt10712));
    }
    
    public boolean method6009() {
	return (-1711797251 * ((Class327) this).anInt5017
		< -1573335367 * (((AbstractQueue_Sub1)
				  ((Class327) this).anAbstractQueue_Sub1_5018)
				 .anInt10712));
    }
    
    public void method6010() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method6011() {
	return (-1711797251 * ((Class327) this).anInt5017
		< -1573335367 * (((AbstractQueue_Sub1)
				  ((Class327) this).anAbstractQueue_Sub1_5018)
				 .anInt10712));
    }
    
    public void method6012() {
	throw new UnsupportedOperationException();
    }
    
    public Object method6013() {
	if (627241061 * ((Class327) this).anInt5016
	    != (((AbstractQueue_Sub1)
		 ((Class327) this).anAbstractQueue_Sub1_5018).anInt10715
		* -1751991983))
	    throw new ConcurrentModificationException();
	if (((Class327) this).anInt5017 * -1711797251
	    < (((AbstractQueue_Sub1)
		((Class327) this).anAbstractQueue_Sub1_5018).anInt10712
	       * -1573335367)) {
	    Object object
		= (((Class318) (((AbstractQueue_Sub1)
				 ((Class327) this).anAbstractQueue_Sub1_5018)
				.aClass318Array10711
				[-1711797251 * ((Class327) this).anInt5017]))
		   .anObject4867);
	    ((Class327) this).anInt5017 += -1480414891;
	    return object;
	}
	throw new NoSuchElementException();
    }
    
    public void method6014() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method6015() {
	return (-1711797251 * ((Class327) this).anInt5017
		< -1573335367 * (((AbstractQueue_Sub1)
				  ((Class327) this).anAbstractQueue_Sub1_5018)
				 .anInt10712));
    }
    
    Class327(AbstractQueue_Sub1 abstractqueue_sub1) {
	((Class327) this).anInt5016
	    = 604272765 * (((AbstractQueue_Sub1)
			    ((Class327) this).anAbstractQueue_Sub1_5018)
			   .anInt10715);
	((Class327) this).anAbstractQueue_Sub1_5018 = abstractqueue_sub1;
    }
    
    public static Class324[] method6016(byte i) {
	return (new Class324[]
		{ Class324.aClass324_4922, Class324.aClass324_4923,
		  Class324.aClass324_4924 });
    }
    
    public static int method6017(byte i) {
	return -811276229 * Class421.anInt6039;
    }
    
    static final void isIgnoreTemporary/*method6018*/(ClientScriptData scriptData, int i) {
		int slotID = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = client.ignoreList[slotID].temporary ? 1 : 0;
    }
}
