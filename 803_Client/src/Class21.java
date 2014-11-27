/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Class21 implements Runnable
{
    Queue aQueue200 = new LinkedList();
    Thread aThread201 = new Thread(this);
    volatile boolean aBool202;
    public static Player myPlayer;//aClass475_Sub1_Sub1_Sub3_Sub1_203
    
    Class198 method887(URL url, int i) {
	Class198 class198 = new Class198(url);
	synchronized (this) {
	    ((Class21) this).aQueue200.add(class198);
	    this.notify();
	}
	return class198;
    }
    
    public void run() {
	while (!((Class21) this).aBool202) {
	    try {
		Class198 class198;
		synchronized (this) {
		    class198 = (Class198) ((Class21) this).aQueue200.poll();
		    if (class198 == null) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= ((Class198) class198).anURL2382.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			((Class198) class198).aByteArray2383 = is;
		    }
		    ((Class198) class198).aBool2381 = true;
		} catch (IOException ioexception) {
		    ((Class198) class198).aBool2381 = true;
		}
	    } catch (Exception exception) {
		VarType.method3770(null, exception, -573662926);
	    }
	}
    }
    
    void method888() {
	((Class21) this).aBool202 = true;
	try {
	    synchronized (this) {
		this.notify();
	    }
	    ((Class21) this).aThread201.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method889(byte i) {
	((Class21) this).aBool202 = true;
	try {
	    synchronized (this) {
		this.notify();
	    }
	    ((Class21) this).aThread201.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public void method890() {
	while (!((Class21) this).aBool202) {
	    try {
		Class198 class198;
		synchronized (this) {
		    class198 = (Class198) ((Class21) this).aQueue200.poll();
		    if (class198 == null) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= ((Class198) class198).anURL2382.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			((Class198) class198).aByteArray2383 = is;
		    }
		    ((Class198) class198).aBool2381 = true;
		} catch (IOException ioexception) {
		    ((Class198) class198).aBool2381 = true;
		}
	    } catch (Exception exception) {
		VarType.method3770(null, exception, -905838591);
	    }
	}
    }
    
    public void method891() {
	while (!((Class21) this).aBool202) {
	    try {
		Class198 class198;
		synchronized (this) {
		    class198 = (Class198) ((Class21) this).aQueue200.poll();
		    if (class198 == null) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= ((Class198) class198).anURL2382.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			((Class198) class198).aByteArray2383 = is;
		    }
		    ((Class198) class198).aBool2381 = true;
		} catch (IOException ioexception) {
		    ((Class198) class198).aBool2381 = true;
		}
	    } catch (Exception exception) {
		VarType.method3770(null, exception, -1608799193);
	    }
	}
    }
    
    public void method892() {
	while (!((Class21) this).aBool202) {
	    try {
		Class198 class198;
		synchronized (this) {
		    class198 = (Class198) ((Class21) this).aQueue200.poll();
		    if (class198 == null) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= ((Class198) class198).anURL2382.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			((Class198) class198).aByteArray2383 = is;
		    }
		    ((Class198) class198).aBool2381 = true;
		} catch (IOException ioexception) {
		    ((Class198) class198).aBool2381 = true;
		}
	    } catch (Exception exception) {
		VarType.method3770(null, exception, 461766258);
	    }
	}
    }
    
    Class21() {
	((Class21) this).aThread201.setPriority(1);
	((Class21) this).aThread201.start();
    }
    
    public void method893() {
	while (!((Class21) this).aBool202) {
	    try {
		Class198 class198;
		synchronized (this) {
		    class198 = (Class198) ((Class21) this).aQueue200.poll();
		    if (class198 == null) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= ((Class198) class198).anURL2382.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			((Class198) class198).aByteArray2383 = is;
		    }
		    ((Class198) class198).aBool2381 = true;
		} catch (IOException ioexception) {
		    ((Class198) class198).aBool2381 = true;
		}
	    } catch (Exception exception) {
		VarType.method3770(null, exception, -1856141715);
	    }
	}
    }
    
    static final void method894(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_3_ = 255;
	int i_4_ = 256;
	Class402.soundManager.method1162(Class112.aClass112_1522, i_0_, i_1_,
					  i_3_,
					  Class130.aClass130_1597
					      .method3067(-960497231),
					  Class127.aClass127_1587, 0.0F, 0.0F,
					  null, 0, i_4_, i_2_, -1220840324);
    }
    
    static final void method895(ClientScriptData class454, byte i) {
	if (Class24.guestClanSettings != null) {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1;
	    ((ClientScriptData) class454).clanSettings = Class24.guestClanSettings;
	    ((ClientScriptData) class454).aMap6241.put
		(VarDomainType.CLAN_SETTING,
		 Class499.method11333(((ClientScriptData) class454).clanSettings,
				      (byte) -1));
	} else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    static final void method896(ClientScriptData class454, int i) {
	int i_5_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_6_ = client.aClass220Array8426[i_5_].method4383((byte) 0);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_6_ == 2 ? 1 : 0;
    }
    
    public static void addline/*method897*/(String string, byte i) {
		if (Exception_Sub3.aStringArray10694 == null) {
		    Class81.openDeveloperConsole(-1911882338);
		}
		client.aCalendar8329.setTime(new Date(Class50.method1249((byte) 1)));
		int i_7_ = client.aCalendar8329.get(11);
		int i_8_ = client.aCalendar8329.get(12);
		int i_9_ = client.aCalendar8329.get(13);
		String string_10_
		    = new StringBuilder().append(Integer.toString(i_7_ / 10)).append
			  (i_7_ % 10).append
			  (":").append
			  (i_8_ / 10).append
			  (i_8_ % 10).append
			  (":").append
			  (i_9_ / 10).append
			  (i_9_ % 10).toString();
		String[] strings = Class225.method4625(string, '\n', 1785589306);
		for (int i_11_ = 0; i_11_ < strings.length; i_11_++) {
		    for (int i_12_ = 310017649 * Class185.anInt2179; i_12_ > 0;
			 i_12_--)
			Exception_Sub3.aStringArray10694[i_12_]
			    = Exception_Sub3.aStringArray10694[i_12_ - 1];
		    Exception_Sub3.aStringArray10694[0]
			= new StringBuilder().append(string_10_).append(": ").append
			      (strings[i_11_]).toString();
		    if (null != Class185.aFileOutputStream2187) {
			try {
			    Class185.aFileOutputStream2187.write
				(Class542.getMessageData(new StringBuilder().append
							  (Exception_Sub3
							   .aStringArray10694[0])
							  .append
							  ("\n").toString(),
						      468558693));
			} catch (IOException ioexception) {
			    /* empty */
			}
		    }
		    if (Class185.anInt2179 * 310017649
			< Exception_Sub3.aStringArray10694.length - 1) {
			Class185.anInt2179 += 561611409;
			if (-1770035745 * Class185.anInt2184 > 0)
			    Class185.anInt2184 += 1734252063;
		    }
		}
    }
    
    static final void method898(ClientScriptData class454, int i) {
	((ClientScriptData) class454).varEntity.method17794
	    ((((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     -1071831848);
    }
}
