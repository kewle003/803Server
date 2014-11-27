/* Class397 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Server
{
    public int nodeID;//anInt5785
    public String aString5786;
    boolean aBool5787;
    public int anInt5788;
    boolean aBool5789;
    public int anInt5790 = -1234642926;
    
    public boolean method7110(Server class397_0_) {
	if (null == class397_0_)
	    return false;
	return (nodeID * -2019487531 == class397_0_.nodeID * -2019487531
		&& aString5786.equals(class397_0_.aString5786));
    }
    
    public Socket method7111(int i) throws IOException {
	if (!((Server) this).aBool5787)
	    return new Socket(InetAddress.getByName(aString5786),
			      (((Server) this).aBool5789
			       ? anInt5788 * -642864645
			       : -1771987139 * anInt5790));
	return Class466.method10721
		   (aString5786,
		    (((Server) this).aBool5789 ? -642864645 * anInt5788
		     : -1771987139 * anInt5790),
		    722134026)
		   .method7127(1321023561);
    }
    
    public int method7112(int i) {
	if (((Server) this).aBool5789)
	    return -642864645 * anInt5788;
	return anInt5790 * -1771987139;
    }
    
    public boolean method7113(Server class397_1_, byte i) {
	if (null == class397_1_)
	    return false;
	return (nodeID * -2019487531 == class397_1_.nodeID * -2019487531
		&& aString5786.equals(class397_1_.aString5786));
    }
    
    public void method7114(int i) {
	if (!((Server) this).aBool5789) {
	    ((Server) this).aBool5789 = true;
	    ((Server) this).aBool5787 = true;
	} else if (((Server) this).aBool5787)
	    ((Server) this).aBool5787 = false;
	else
	    ((Server) this).aBool5789 = false;
    }
    
    public int method7115() {
	if (((Server) this).aBool5789)
	    return -642864645 * anInt5788;
	return anInt5790 * -1771987139;
    }
    
    public void method7116() {
	if (!((Server) this).aBool5789) {
	    ((Server) this).aBool5789 = true;
	    ((Server) this).aBool5787 = true;
	} else if (((Server) this).aBool5787)
	    ((Server) this).aBool5787 = false;
	else
	    ((Server) this).aBool5789 = false;
    }
    
    public Server() {
	anInt5788 = -582075583;
	((Server) this).aBool5789 = true;
	((Server) this).aBool5787 = false;
    }
    
    static final void method7117(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = string.substring(i_2_, i_3_);
    }
    
    static final void method7118(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class207.method4122(class58, class35, class454, -1539942107);
    }
    
    static final void method7119(ClientScriptData class454, int i) {
	HitMarkTypeList.method12294(1448273096);
    }
}
