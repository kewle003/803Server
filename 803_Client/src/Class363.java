/* Class363 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class363 implements Runnable
{
    volatile boolean aBool5530;
    Class355[] aClass355Array5531;
    Thread aThread5532;
    public static Class168 aClass168_5533;
    public static Class168 aClass168_5534;
    
    Class355 method6521(int i, int i_0_) {
	if (((Class363) this).aClass355Array5531 == null || i < 0
	    || i >= ((Class363) this).aClass355Array5531.length)
	    return null;
	return ((Class363) this).aClass355Array5531[i];
    }
    
    Class363() {
	/* empty */
    }
    
    public void method6522() {
	try {
	    int i = (Class470.aClass470_6345 == Class416.aClass470_6012 ? 80
		     : Class395.aClass397_5777.nodeID * -2019487531 + 7000);
	    BufferedReader bufferedreader
		= (new BufferedReader
		   (new InputStreamReader
		    (new DataInputStream
		     (new URL
			  (new StringBuilder().append("http://").append
			       (Class395.aClass397_5777.aString5786).append
			       (":").append
			       (i).append
			       ("/news.ws?game=").append
			       (-1202509675 * client.currentGame.anInt6357)
			       .toString())
			  .openStream()))));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; null != string; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (0 != strings.length % 3)
		return;
	    ((Class363) this).aClass355Array5531
		= new Class355[strings.length / 3];
	    for (int i_1_ = 0; i_1_ < strings.length; i_1_ += 3)
		((Class363) this).aClass355Array5531[i_1_ / 3]
		    = new Class355(strings[i_1_], strings[1 + i_1_],
				   strings[2 + i_1_]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	((Class363) this).aBool5530 = true;
    }
    
    public void run() {
	try {
	    int i = (Class470.aClass470_6345 == Class416.aClass470_6012 ? 80
		     : Class395.aClass397_5777.nodeID * -2019487531 + 7000);
	    BufferedReader bufferedreader
		= (new BufferedReader
		   (new InputStreamReader
		    (new DataInputStream
		     (new URL
			  (new StringBuilder().append("http://").append
			       (Class395.aClass397_5777.aString5786).append
			       (":").append
			       (i).append
			       ("/news.ws?game=").append
			       (-1202509675 * client.currentGame.anInt6357)
			       .toString())
			  .openStream()))));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; null != string; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (0 != strings.length % 3)
		return;
	    ((Class363) this).aClass355Array5531
		= new Class355[strings.length / 3];
	    for (int i_2_ = 0; i_2_ < strings.length; i_2_ += 3)
		((Class363) this).aClass355Array5531[i_2_ / 3]
		    = new Class355(strings[i_2_], strings[1 + i_2_],
				   strings[2 + i_2_]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	((Class363) this).aBool5530 = true;
    }
    
    public void method6523() {
	try {
	    int i = (Class470.aClass470_6345 == Class416.aClass470_6012 ? 80
		     : Class395.aClass397_5777.nodeID * -2019487531 + 7000);
	    BufferedReader bufferedreader
		= (new BufferedReader
		   (new InputStreamReader
		    (new DataInputStream
		     (new URL
			  (new StringBuilder().append("http://").append
			       (Class395.aClass397_5777.aString5786).append
			       (":").append
			       (i).append
			       ("/news.ws?game=").append
			       (-1202509675 * client.currentGame.anInt6357)
			       .toString())
			  .openStream()))));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; null != string; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (0 != strings.length % 3)
		return;
	    ((Class363) this).aClass355Array5531
		= new Class355[strings.length / 3];
	    for (int i_3_ = 0; i_3_ < strings.length; i_3_ += 3)
		((Class363) this).aClass355Array5531[i_3_ / 3]
		    = new Class355(strings[i_3_], strings[1 + i_3_],
				   strings[2 + i_3_]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	((Class363) this).aBool5530 = true;
    }
    
    boolean method6524() {
	if (((Class363) this).aBool5530)
	    return true;
	if (((Class363) this).aThread5532 == null) {
	    ((Class363) this).aThread5532 = new Thread(this);
	    ((Class363) this).aThread5532.start();
	}
	return ((Class363) this).aBool5530;
    }
    
    public void method6525() {
	try {
	    int i = (Class470.aClass470_6345 == Class416.aClass470_6012 ? 80
		     : Class395.aClass397_5777.nodeID * -2019487531 + 7000);
	    BufferedReader bufferedreader
		= (new BufferedReader
		   (new InputStreamReader
		    (new DataInputStream
		     (new URL
			  (new StringBuilder().append("http://").append
			       (Class395.aClass397_5777.aString5786).append
			       (":").append
			       (i).append
			       ("/news.ws?game=").append
			       (-1202509675 * client.currentGame.anInt6357)
			       .toString())
			  .openStream()))));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; null != string; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (0 != strings.length % 3)
		return;
	    ((Class363) this).aClass355Array5531
		= new Class355[strings.length / 3];
	    for (int i_4_ = 0; i_4_ < strings.length; i_4_ += 3)
		((Class363) this).aClass355Array5531[i_4_ / 3]
		    = new Class355(strings[i_4_], strings[1 + i_4_],
				   strings[2 + i_4_]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	((Class363) this).aBool5530 = true;
    }
    
    public void method6526() {
	try {
	    int i = (Class470.aClass470_6345 == Class416.aClass470_6012 ? 80
		     : Class395.aClass397_5777.nodeID * -2019487531 + 7000);
	    BufferedReader bufferedreader
		= (new BufferedReader
		   (new InputStreamReader
		    (new DataInputStream
		     (new URL
			  (new StringBuilder().append("http://").append
			       (Class395.aClass397_5777.aString5786).append
			       (":").append
			       (i).append
			       ("/news.ws?game=").append
			       (-1202509675 * client.currentGame.anInt6357)
			       .toString())
			  .openStream()))));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; null != string; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (0 != strings.length % 3)
		return;
	    ((Class363) this).aClass355Array5531
		= new Class355[strings.length / 3];
	    for (int i_5_ = 0; i_5_ < strings.length; i_5_ += 3)
		((Class363) this).aClass355Array5531[i_5_ / 3]
		    = new Class355(strings[i_5_], strings[1 + i_5_],
				   strings[2 + i_5_]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	((Class363) this).aBool5530 = true;
    }
    
    boolean method6527() {
	if (((Class363) this).aBool5530)
	    return true;
	if (((Class363) this).aThread5532 == null) {
	    ((Class363) this).aThread5532 = new Thread(this);
	    ((Class363) this).aThread5532.start();
	}
	return ((Class363) this).aBool5530;
    }
    
    boolean method6528(int i) {
	if (((Class363) this).aBool5530)
	    return true;
	if (((Class363) this).aThread5532 == null) {
	    ((Class363) this).aThread5532 = new Thread(this);
	    ((Class363) this).aThread5532.start();
	}
	return ((Class363) this).aBool5530;
    }
    
    boolean method6529() {
	if (((Class363) this).aBool5530)
	    return true;
	if (((Class363) this).aThread5532 == null) {
	    ((Class363) this).aThread5532 = new Thread(this);
	    ((Class363) this).aThread5532.start();
	}
	return ((Class363) this).aBool5530;
    }
    
    static final void method6530(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	InvType class241_sub39_sub19
	    = Class409.aClass617_5932.list((((ClientScriptData) class454)
						   .integerStack
						   [(1482319719
						     * (((ClientScriptData) class454)
							.intStackPointer))]),
						  (byte) 126);
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_7_ = -1;
	for (int i_8_ = 0; i_8_ < class241_sub39_sub19.anInt11225 * -662691093;
	     i_8_++) {
	    if (class241_sub39_sub19.anIntArray11224[i_8_] == i_6_) {
		i_7_ = class241_sub39_sub19.anIntArray11226[i_8_];
		break;
	    }
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_7_;
    }
}
