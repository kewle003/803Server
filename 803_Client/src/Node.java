/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node
{
    public long hashCode;//aLong2774
    public Node previousNode;//aClass241_2775
    public Node nextNode;//aClass241_2776
    
    public boolean method4893() {
	if (null == nextNode)
	    return false;
	return true;
    }
    
    public void remove/*method4894*/(byte i) {
		if (null != nextNode) {
		    nextNode.previousNode = previousNode;
		    previousNode.nextNode = nextNode;
		    previousNode = null;
		    nextNode = null;
		}
    }
    
    public boolean hasNext/*method4895*/(byte i) {
		if (null == nextNode)
		    return false;
		return true;
    }
    
    public void method4896() {
	if (null != nextNode) {
	    nextNode.previousNode = previousNode;
	    previousNode.nextNode = nextNode;
	    previousNode = null;
	    nextNode = null;
	}
    }
    
    public void method4897() {
	if (null != nextNode) {
	    nextNode.previousNode = previousNode;
	    previousNode.nextNode = nextNode;
	    previousNode = null;
	    nextNode = null;
	}
    }
    
    public boolean method4898() {
	if (null == nextNode)
	    return false;
	return true;
    }
    
    public boolean method4899() {
	if (null == nextNode)
	    return false;
	return true;
    }
    
    static final void method4900(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.hidden ? 1 : 0;
    }
}
