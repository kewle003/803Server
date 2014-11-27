/* Class398_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class398_Sub1 extends Class398
{
    static final String aString8606 = "java.net.useSystemProxies";
    ProxySelector aProxySelector8607 = ProxySelector.getDefault();
    
    public Socket method7123() throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_0_
	    = ((Class398_Sub1) this).anInt5793 * -1626481923 == 443;
	List list;
	List list_1_;
	try {
	    list = (((Class398_Sub1) this).aProxySelector8607.select
		    (new URI(new StringBuilder().append
				 (bool_0_ ? "https" : "http").append
				 ("://").append
				 (((Class398_Sub1) this).aString5792)
				 .toString())));
	    list_1_ = (((Class398_Sub1) this).aProxySelector8607.select
		       (new URI(new StringBuilder().append
				    (bool_0_ ? "http" : "https").append
				    ("://").append
				    (((Class398_Sub1) this).aString5792)
				    .toString())));
	} catch (URISyntaxException urisyntaxexception) {
	    return method7122(105782646);
	}
	list.addAll(list_1_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_2_ = objects;
	for (int i = 0; i < objects_2_.length; i++) {
	    Object object = objects_2_[i];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_3_ = method14062(proxy, -2118609553);
		if (null == socket_3_)
		    continue;
		socket = socket_3_;
	    } catch (IOException_Sub1 ioexception_sub1_4_) {
		ioexception_sub1 = ioexception_sub1_4_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method7122(-1934947442);
    }
    
    public Socket method7127(int i) throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_5_
	    = ((Class398_Sub1) this).anInt5793 * -1626481923 == 443;
	List list;
	List list_6_;
	try {
	    list = (((Class398_Sub1) this).aProxySelector8607.select
		    (new URI(new StringBuilder().append
				 (bool_5_ ? "https" : "http").append
				 ("://").append
				 (((Class398_Sub1) this).aString5792)
				 .toString())));
	    list_6_ = (((Class398_Sub1) this).aProxySelector8607.select
		       (new URI(new StringBuilder().append
				    (bool_5_ ? "http" : "https").append
				    ("://").append
				    (((Class398_Sub1) this).aString5792)
				    .toString())));
	} catch (URISyntaxException urisyntaxexception) {
	    return method7122(1595905253);
	}
	list.addAll(list_6_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_7_ = objects;
	for (int i_8_ = 0; i_8_ < objects_7_.length; i_8_++) {
	    Object object = objects_7_[i_8_];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_9_ = method14062(proxy, -2080562146);
		if (null == socket_9_)
		    continue;
		socket = socket_9_;
	    } catch (IOException_Sub1 ioexception_sub1_10_) {
		ioexception_sub1 = ioexception_sub1_10_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method7122(466279662);
    }
    
    Class398_Sub1() {
	/* empty */
    }
    
    Socket method14060(String string, int i, String string_11_, int i_12_)
	throws IOException {
	Socket socket = new Socket(string, i);
	socket.setSoTimeout(10000);
	OutputStream outputstream = socket.getOutputStream();
	if (string_11_ == null)
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (((Class398_Sub1) this).aString5792).append
				   (":").append
				   (-1626481923
				    * ((Class398_Sub1) this).anInt5793)
				   .append
				   (" HTTP/1.0\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	else
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (((Class398_Sub1) this).aString5792).append
				   (":").append
				   (((Class398_Sub1) this).anInt5793
				    * -1626481923)
				   .append
				   (" HTTP/1.0\n").append
				   (string_11_).append
				   ("\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	outputstream.flush();
	BufferedReader bufferedreader
	    = new BufferedReader(new InputStreamReader(socket
							   .getInputStream()));
	String string_13_ = bufferedreader.readLine();
	if (string_13_ != null) {
	    if (string_13_.startsWith("HTTP/1.0 200")
		|| string_13_.startsWith("HTTP/1.1 200"))
		return socket;
	    if (string_13_.startsWith("HTTP/1.0 407")
		|| string_13_.startsWith("HTTP/1.1 407")) {
		int i_14_ = 0;
		String string_15_ = "proxy-authenticate: ";
		for (string_13_ = bufferedreader.readLine();
		     string_13_ != null && i_14_ < 50; i_14_++) {
		    if (string_13_.toLowerCase().startsWith(string_15_)) {
			string_13_
			    = string_13_.substring(string_15_.length()).trim();
			int i_16_ = string_13_.indexOf(' ');
			if (i_16_ != -1)
			    string_13_ = string_13_.substring(0, i_16_);
			throw new IOException_Sub1(string_13_);
		    }
		    string_13_ = bufferedreader.readLine();
		}
		throw new IOException_Sub1("");
	    }
	}
	outputstream.close();
	bufferedreader.close();
	socket.close();
	return null;
    }
    
    Socket method14061(Proxy proxy) throws IOException {
	if (proxy.type() == Proxy.Type.DIRECT)
	    return method7122(232767352);
	java.net.SocketAddress socketaddress = proxy.address();
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (proxy.type() == Proxy.Type.HTTP) {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method
		    = var_class.getDeclaredMethod("getProxyAuth",
						  (new Class[]
						   { java.lang.String.class,
						     Integer.TYPE }));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (null != object) {
		    Method method_17_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_17_.setAccessible(true);
		    if (((Boolean) method_17_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_18_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_18_.setAccessible(true);
			Method method_19_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				new Class[] { java.net.URL.class,
					      java.lang.String.class }));
			method_19_.setAccessible(true);
			String string_20_
			    = ((String)
			       method_18_.invoke(object, new Object[0]));
			String string_21_
			    = ((String)
			       (method_19_.invoke
				(object, (new Object[]
					  { new URL(new StringBuilder().append
							("https://").append
							(((Class398_Sub1) this)
							 .aString5792)
							.append
							("/").toString()),
					    "https" }))));
			string = new StringBuilder().append(string_20_).append
				     (": ").append
				     (string_21_).toString();
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return method14060(inetsocketaddress.getHostName(),
			       inetsocketaddress.getPort(), string, 421681240);
	}
	if (proxy.type() == Proxy.Type.SOCKS) {
	    Socket socket = new Socket(proxy);
	    socket.connect(new InetSocketAddress((((Class398_Sub1) this)
						  .aString5792),
						 (-1626481923
						  * (((Class398_Sub1) this)
						     .anInt5793))));
	    return socket;
	}
	return null;
    }
    
    public Socket method7120() throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_22_
	    = ((Class398_Sub1) this).anInt5793 * -1626481923 == 443;
	List list;
	List list_23_;
	try {
	    list = (((Class398_Sub1) this).aProxySelector8607.select
		    (new URI(new StringBuilder().append
				 (bool_22_ ? "https" : "http").append
				 ("://").append
				 (((Class398_Sub1) this).aString5792)
				 .toString())));
	    list_23_ = (((Class398_Sub1) this).aProxySelector8607.select
			(new URI(new StringBuilder().append
				     (bool_22_ ? "http" : "https").append
				     ("://").append
				     (((Class398_Sub1) this).aString5792)
				     .toString())));
	} catch (URISyntaxException urisyntaxexception) {
	    return method7122(1597513680);
	}
	list.addAll(list_23_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_24_ = objects;
	for (int i = 0; i < objects_24_.length; i++) {
	    Object object = objects_24_[i];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_25_ = method14062(proxy, -2027074525);
		if (null == socket_25_)
		    continue;
		socket = socket_25_;
	    } catch (IOException_Sub1 ioexception_sub1_26_) {
		ioexception_sub1 = ioexception_sub1_26_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method7122(1635725507);
    }
    
    public Socket method7124() throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_27_
	    = ((Class398_Sub1) this).anInt5793 * -1626481923 == 443;
	List list;
	List list_28_;
	try {
	    list = (((Class398_Sub1) this).aProxySelector8607.select
		    (new URI(new StringBuilder().append
				 (bool_27_ ? "https" : "http").append
				 ("://").append
				 (((Class398_Sub1) this).aString5792)
				 .toString())));
	    list_28_ = (((Class398_Sub1) this).aProxySelector8607.select
			(new URI(new StringBuilder().append
				     (bool_27_ ? "http" : "https").append
				     ("://").append
				     (((Class398_Sub1) this).aString5792)
				     .toString())));
	} catch (URISyntaxException urisyntaxexception) {
	    return method7122(189088718);
	}
	list.addAll(list_28_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_29_ = objects;
	for (int i = 0; i < objects_29_.length; i++) {
	    Object object = objects_29_[i];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_30_ = method14062(proxy, -2091736665);
		if (null == socket_30_)
		    continue;
		socket = socket_30_;
	    } catch (IOException_Sub1 ioexception_sub1_31_) {
		ioexception_sub1 = ioexception_sub1_31_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method7122(1019763577);
    }
    
    public Socket method7125() throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_32_
	    = ((Class398_Sub1) this).anInt5793 * -1626481923 == 443;
	List list;
	List list_33_;
	try {
	    list = (((Class398_Sub1) this).aProxySelector8607.select
		    (new URI(new StringBuilder().append
				 (bool_32_ ? "https" : "http").append
				 ("://").append
				 (((Class398_Sub1) this).aString5792)
				 .toString())));
	    list_33_ = (((Class398_Sub1) this).aProxySelector8607.select
			(new URI(new StringBuilder().append
				     (bool_32_ ? "http" : "https").append
				     ("://").append
				     (((Class398_Sub1) this).aString5792)
				     .toString())));
	} catch (URISyntaxException urisyntaxexception) {
	    return method7122(1750570211);
	}
	list.addAll(list_33_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_34_ = objects;
	for (int i = 0; i < objects_34_.length; i++) {
	    Object object = objects_34_[i];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_35_ = method14062(proxy, -1754105413);
		if (null == socket_35_)
		    continue;
		socket = socket_35_;
	    } catch (IOException_Sub1 ioexception_sub1_36_) {
		ioexception_sub1 = ioexception_sub1_36_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method7122(-2003973755);
    }
    
    Socket method14062(Proxy proxy, int i) throws IOException {
	if (proxy.type() == Proxy.Type.DIRECT)
	    return method7122(-548632910);
	java.net.SocketAddress socketaddress = proxy.address();
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (proxy.type() == Proxy.Type.HTTP) {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method
		    = var_class.getDeclaredMethod("getProxyAuth",
						  (new Class[]
						   { java.lang.String.class,
						     Integer.TYPE }));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (null != object) {
		    Method method_37_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_37_.setAccessible(true);
		    if (((Boolean) method_37_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_38_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_38_.setAccessible(true);
			Method method_39_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				new Class[] { java.net.URL.class,
					      java.lang.String.class }));
			method_39_.setAccessible(true);
			String string_40_
			    = ((String)
			       method_38_.invoke(object, new Object[0]));
			String string_41_
			    = ((String)
			       (method_39_.invoke
				(object, (new Object[]
					  { new URL(new StringBuilder().append
							("https://").append
							(((Class398_Sub1) this)
							 .aString5792)
							.append
							("/").toString()),
					    "https" }))));
			string = new StringBuilder().append(string_40_).append
				     (": ").append
				     (string_41_).toString();
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return method14060(inetsocketaddress.getHostName(),
			       inetsocketaddress.getPort(), string, 421681240);
	}
	if (proxy.type() == Proxy.Type.SOCKS) {
	    Socket socket = new Socket(proxy);
	    socket.connect(new InetSocketAddress((((Class398_Sub1) this)
						  .aString5792),
						 (-1626481923
						  * (((Class398_Sub1) this)
						     .anInt5793))));
	    return socket;
	}
	return null;
    }
    
    Socket method14063(Proxy proxy) throws IOException {
	if (proxy.type() == Proxy.Type.DIRECT)
	    return method7122(2088783673);
	java.net.SocketAddress socketaddress = proxy.address();
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (proxy.type() == Proxy.Type.HTTP) {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method
		    = var_class.getDeclaredMethod("getProxyAuth",
						  (new Class[]
						   { java.lang.String.class,
						     Integer.TYPE }));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (null != object) {
		    Method method_42_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_42_.setAccessible(true);
		    if (((Boolean) method_42_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_43_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_43_.setAccessible(true);
			Method method_44_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				new Class[] { java.net.URL.class,
					      java.lang.String.class }));
			method_44_.setAccessible(true);
			String string_45_
			    = ((String)
			       method_43_.invoke(object, new Object[0]));
			String string_46_
			    = ((String)
			       (method_44_.invoke
				(object, (new Object[]
					  { new URL(new StringBuilder().append
							("https://").append
							(((Class398_Sub1) this)
							 .aString5792)
							.append
							("/").toString()),
					    "https" }))));
			string = new StringBuilder().append(string_45_).append
				     (": ").append
				     (string_46_).toString();
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return method14060(inetsocketaddress.getHostName(),
			       inetsocketaddress.getPort(), string, 421681240);
	}
	if (proxy.type() == Proxy.Type.SOCKS) {
	    Socket socket = new Socket(proxy);
	    socket.connect(new InetSocketAddress((((Class398_Sub1) this)
						  .aString5792),
						 (-1626481923
						  * (((Class398_Sub1) this)
						     .anInt5793))));
	    return socket;
	}
	return null;
    }
    
    Socket method14064(String string, int i, String string_47_)
	throws IOException {
	Socket socket = new Socket(string, i);
	socket.setSoTimeout(10000);
	OutputStream outputstream = socket.getOutputStream();
	if (string_47_ == null)
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (((Class398_Sub1) this).aString5792).append
				   (":").append
				   (-1626481923
				    * ((Class398_Sub1) this).anInt5793)
				   .append
				   (" HTTP/1.0\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	else
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (((Class398_Sub1) this).aString5792).append
				   (":").append
				   (((Class398_Sub1) this).anInt5793
				    * -1626481923)
				   .append
				   (" HTTP/1.0\n").append
				   (string_47_).append
				   ("\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	outputstream.flush();
	BufferedReader bufferedreader
	    = new BufferedReader(new InputStreamReader(socket
							   .getInputStream()));
	String string_48_ = bufferedreader.readLine();
	if (string_48_ != null) {
	    if (string_48_.startsWith("HTTP/1.0 200")
		|| string_48_.startsWith("HTTP/1.1 200"))
		return socket;
	    if (string_48_.startsWith("HTTP/1.0 407")
		|| string_48_.startsWith("HTTP/1.1 407")) {
		int i_49_ = 0;
		String string_50_ = "proxy-authenticate: ";
		for (string_48_ = bufferedreader.readLine();
		     string_48_ != null && i_49_ < 50; i_49_++) {
		    if (string_48_.toLowerCase().startsWith(string_50_)) {
			string_48_
			    = string_48_.substring(string_50_.length()).trim();
			int i_51_ = string_48_.indexOf(' ');
			if (i_51_ != -1)
			    string_48_ = string_48_.substring(0, i_51_);
			throw new IOException_Sub1(string_48_);
		    }
		    string_48_ = bufferedreader.readLine();
		}
		throw new IOException_Sub1("");
	    }
	}
	outputstream.close();
	bufferedreader.close();
	socket.close();
	return null;
    }
}
