/* Class399 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class399
{
    public Object anObject5794;
    public Object anObject5795;
    
    public String method7130() {
	return new StringBuilder().append(anObject5795).append(", ").append
		   (anObject5794).toString();
    }
    
    public boolean method7131(Object object) {
	if (object == null || !(object instanceof Class399))
	    return false;
	Class399 class399_0_ = (Class399) object;
	if (anObject5795 == null) {
	    if (class399_0_.anObject5795 != null)
		return false;
	} else if (!anObject5795.equals(class399_0_.anObject5795))
	    return false;
	if (anObject5794 == null) {
	    if (class399_0_.anObject5794 != null)
		return false;
	} else if (!anObject5794.equals(class399_0_.anObject5794))
	    return false;
	return true;
    }
    
    public boolean equals(Object object) {
	if (object == null || !(object instanceof Class399))
	    return false;
	Class399 class399_1_ = (Class399) object;
	if (anObject5795 == null) {
	    if (class399_1_.anObject5795 != null)
		return false;
	} else if (!anObject5795.equals(class399_1_.anObject5795))
	    return false;
	if (anObject5794 == null) {
	    if (class399_1_.anObject5794 != null)
		return false;
	} else if (!anObject5794.equals(class399_1_.anObject5794))
	    return false;
	return true;
    }
    
    public Class399(Object object, Object object_2_) {
	anObject5795 = object;
	anObject5794 = object_2_;
    }
    
    public boolean method7132(Object object) {
	if (object == null || !(object instanceof Class399))
	    return false;
	Class399 class399_3_ = (Class399) object;
	if (anObject5795 == null) {
	    if (class399_3_.anObject5795 != null)
		return false;
	} else if (!anObject5795.equals(class399_3_.anObject5795))
	    return false;
	if (anObject5794 == null) {
	    if (class399_3_.anObject5794 != null)
		return false;
	} else if (!anObject5794.equals(class399_3_.anObject5794))
	    return false;
	return true;
    }
    
    public boolean method7133(Object object) {
	if (object == null || !(object instanceof Class399))
	    return false;
	Class399 class399_4_ = (Class399) object;
	if (anObject5795 == null) {
	    if (class399_4_.anObject5795 != null)
		return false;
	} else if (!anObject5795.equals(class399_4_.anObject5795))
	    return false;
	if (anObject5794 == null) {
	    if (class399_4_.anObject5794 != null)
		return false;
	} else if (!anObject5794.equals(class399_4_.anObject5794))
	    return false;
	return true;
    }
    
    public int hashCode() {
	int i = 0;
	if (anObject5795 != null)
	    i += anObject5795.hashCode();
	if (anObject5794 != null)
	    i += 31 * anObject5794.hashCode();
	return i;
    }
    
    public String method7134() {
	return new StringBuilder().append(anObject5795).append(", ").append
		   (anObject5794).toString();
    }
    
    public String toString() {
	return new StringBuilder().append(anObject5795).append(", ").append
		   (anObject5794).toString();
    }
    
    public String method7135() {
	return new StringBuilder().append(anObject5795).append(", ").append
		   (anObject5794).toString();
    }
    
    public int method7136() {
	int i = 0;
	if (anObject5795 != null)
	    i += anObject5795.hashCode();
	if (anObject5794 != null)
	    i += 31 * anObject5794.hashCode();
	return i;
    }
    
    public int method7137() {
	int i = 0;
	if (anObject5795 != null)
	    i += anObject5795.hashCode();
	if (anObject5794 != null)
	    i += 31 * anObject5794.hashCode();
	return i;
    }
}
