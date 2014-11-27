/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class314
{
    int anInt4836;
    long aLong4837;
    
    Class314(Class367[] class367s) {
	for (int i = 0; i < class367s.length; i++)
	    method5891(class367s[i]);
    }
    
    public final int method5888() {
	return ((Class314) this).anInt4836;
    }
    
    final int method5889(int i) {
	return ((int) (((Class314) this).aLong4837 >> Class367.anInt5546 * i)
		& 0xf);
    }
    
    public final Class367 method5890(int i) {
	return Class367.method6559(method5889(i));
    }
    
    Class314(Class367 class367) {
	((Class314) this).aLong4837 = (long) ((Class367) class367).anInt5560;
	((Class314) this).anInt4836 = 1;
    }
    
    final void method5891(Class367 class367) {
	((Class314) this).aLong4837
	    |= (long) (((Class367) class367).anInt5560
		       << Class367.anInt5546 * ((Class314) this).anInt4836++);
    }
    
    final int method5892(int i) {
	return ((int) (((Class314) this).aLong4837 >> Class367.anInt5546 * i)
		& 0xf);
    }
    
    public final Class367 method5893(int i) {
	return Class367.method6559(method5889(i));
    }
    
    public final int method5894() {
	return ((Class314) this).anInt4836;
    }
    
    final int method5895(int i) {
	return ((int) (((Class314) this).aLong4837 >> Class367.anInt5546 * i)
		& 0xf);
    }
    
    final void method5896(Class367 class367) {
	((Class314) this).aLong4837
	    |= (long) (((Class367) class367).anInt5560
		       << Class367.anInt5546 * ((Class314) this).anInt4836++);
    }
}
