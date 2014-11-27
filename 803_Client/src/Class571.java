/* Class571 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class571 implements Runnable
{
    int anInt7360;
    InputStream anInputStream7361;
    int anInt7362;
    byte[] aByteArray7363;
    int anInt7364 = 0;
    Thread aThread7365;
    IOException anIOException7366;
    
    int method12519(byte[] is, int i, int i_0_) throws IOException {
	if (i_0_ < 0 || i < 0 || i + i_0_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_1_;
	    if (anInt7364 * 952160297
		<= anInt7360 * -774780355)
		i_1_ = (anInt7360 * -774780355
			- 952160297 * anInt7364);
	    else
		i_1_ = (anInt7362 * 1120173493
			- anInt7364 * 952160297
			+ -774780355 * anInt7360);
	    if (i_0_ > i_1_)
		i_0_ = i_1_;
	    if (i_0_ == 0 && null != anIOException7366)
		throw new IOException(anIOException7366
					  .toString());
	    if (anInt7364 * 952160297 + i_0_
		<= 1120173493 * anInt7362)
		System.arraycopy(aByteArray7363,
				 952160297 * anInt7364, is,
				 i, i_0_);
	    else {
		int i_2_ = (1120173493 * anInt7362
			    - anInt7364 * 952160297);
		System.arraycopy(aByteArray7363,
				 anInt7364 * 952160297, is,
				 i, i_2_);
		System.arraycopy(aByteArray7363, 0, is,
				 i_2_ + i, i_0_ - i_2_);
	    }
	    anInt7364
		= 39046169 * ((i_0_ + 952160297 * anInt7364)
			      % (1120173493 * anInt7362));
	    this.notifyAll();
	    int i_3_ = i_0_;
	    return i_3_;
	}
    }
    
    Class571(InputStream inputstream, int i) {
		anInt7360 = 0;
		anInputStream7361 = inputstream;
		anInt7362 = 403982493 * (i + 1);
		aByteArray7363 = new byte[anInt7362 * 1120173493];
		aThread7365 = new Thread(this);
		aThread7365.setDaemon(true);
		aThread7365.start();
    }
    
    void method12520(int i) {
    	anInputStream7361 = new InputStream_Sub1();
    }
    
    public void method12521() {
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7366 != null)
			return;
		    if (952160297 * anInt7364 == 0)
			i = (anInt7362 * 1120173493
			     - -774780355 * anInt7360 - 1);
		    else if (anInt7364 * 952160297
			     <= -774780355 * anInt7360)
			i = (anInt7362 * 1120173493
			     - -774780355 * anInt7360);
		    else
			i = (anInt7364 * 952160297
			     - anInt7360 * -774780355 - 1);
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_4_;
	    try {
		i_4_ = (anInputStream7361.read
			(aByteArray7363,
			 -774780355 * anInt7360, i));
		if (i_4_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7366 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7360
		    = (1191157013
		       * ((-774780355 * anInt7360 + i_4_)
			  % (1120173493 * anInt7362)));
	    }
	}
    }
    
    int method12522(byte[] is, int i, int i_5_, int i_6_) throws IOException {
		if (i_5_ < 0 || i < 0 || i + i_5_ > is.length)
		    throw new IOException();
		synchronized (this) {
		    int i_7_;
		    if (anInt7364 * 952160297
			<= anInt7360 * -774780355)
			i_7_ = (anInt7360 * -774780355
				- 952160297 * anInt7364);
		    else
			i_7_ = (anInt7362 * 1120173493
				- anInt7364 * 952160297
				+ -774780355 * anInt7360);
		    if (i_5_ > i_7_)
			i_5_ = i_7_;
		    if (i_5_ == 0 && null != anIOException7366)
			throw new IOException(anIOException7366
						  .toString());
		    if (anInt7364 * 952160297 + i_5_
			<= 1120173493 * anInt7362)
			System.arraycopy(aByteArray7363,
					 952160297 * anInt7364, is,
					 i, i_5_);
		    else {
			int i_8_ = (1120173493 * anInt7362
				    - anInt7364 * 952160297);
			System.arraycopy(aByteArray7363,
					 anInt7364 * 952160297, is,
					 i, i_8_);
			System.arraycopy(aByteArray7363, 0, is,
					 i_8_ + i, i_5_ - i_8_);
		    }
		    anInt7364
			= 39046169 * ((i_5_ + 952160297 * anInt7364)
				      % (1120173493 * anInt7362));
		    this.notifyAll();
		    int i_9_ = i_5_;
		    return i_9_;
		}
    }
    
    void method12523(int i) {
	synchronized (this) {
	    if (null == anIOException7366)
		anIOException7366 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread7365.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method12524() {
	synchronized (this) {
	    if (null == anIOException7366)
		anIOException7366 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread7365.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public void method12525() {
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7366 != null)
			return;
		    if (952160297 * anInt7364 == 0)
			i = (anInt7362 * 1120173493
			     - -774780355 * anInt7360 - 1);
		    else if (anInt7364 * 952160297
			     <= -774780355 * anInt7360)
			i = (anInt7362 * 1120173493
			     - -774780355 * anInt7360);
		    else
			i = (anInt7364 * 952160297
			     - anInt7360 * -774780355 - 1);
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_10_;
	    try {
		i_10_ = (anInputStream7361.read
			 (aByteArray7363,
			  -774780355 * anInt7360, i));
		if (i_10_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7366 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7360
		    = (1191157013
		       * ((-774780355 * anInt7360 + i_10_)
			  % (1120173493 * anInt7362)));
	    }
	}
    }
    
    public void method12526() {
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7366 != null)
			return;
		    if (952160297 * anInt7364 == 0)
			i = (anInt7362 * 1120173493
			     - -774780355 * anInt7360 - 1);
		    else if (anInt7364 * 952160297
			     <= -774780355 * anInt7360)
			i = (anInt7362 * 1120173493
			     - -774780355 * anInt7360);
		    else
			i = (anInt7364 * 952160297
			     - anInt7360 * -774780355 - 1);
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_11_;
	    try {
		i_11_ = (anInputStream7361.read
			 (aByteArray7363,
			  -774780355 * anInt7360, i));
		if (i_11_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7366 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7360
		    = (1191157013
		       * ((-774780355 * anInt7360 + i_11_)
			  % (1120173493 * anInt7362)));
	    }
	}
    }
    
    boolean method12527(int i, int i_12_) throws IOException {
		if (i <= 0 || i >= anInt7362 * 1120173493)
		    throw new IOException();
		synchronized (this) {
		    int i_13_;
		    if (anInt7364 * 952160297
			<= -774780355 * anInt7360)
			i_13_ = (-774780355 * anInt7360
				 - 952160297 * anInt7364);
		    else
			i_13_ = (anInt7360 * -774780355
				 + (anInt7362 * 1120173493
				    - 952160297 * anInt7364));
		    if (i_13_ < i) {
			if (anIOException7366 != null) {
			    throw new IOException(anIOException7366.toString());
			}
			this.notifyAll();
			boolean bool = false;
			return bool;
		    }
		    boolean bool = true;
		    return bool;
		}
    }
    
    void method12528() {
	synchronized (this) {
	    if (null == anIOException7366)
		anIOException7366 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread7365.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    boolean method12529(int i) throws IOException {
	if (i <= 0 || i >= anInt7362 * 1120173493)
	    throw new IOException();
	synchronized (this) {
	    int i_14_;
	    if (anInt7364 * 952160297
		<= -774780355 * anInt7360)
		i_14_ = (-774780355 * anInt7360
			 - 952160297 * anInt7364);
	    else
		i_14_ = (anInt7360 * -774780355
			 + (anInt7362 * 1120173493
			    - 952160297 * anInt7364));
	    if (i_14_ < i) {
		if (anIOException7366 != null)
		    throw new IOException(((Class571) this)
					      .anIOException7366.toString());
		this.notifyAll();
		boolean bool = false;
		return bool;
	    }
	    boolean bool = true;
	    return bool;
	}
    }
    
    boolean method12530(int i) throws IOException {
	if (i <= 0 || i >= anInt7362 * 1120173493)
	    throw new IOException();
	synchronized (this) {
	    int i_15_;
	    if (anInt7364 * 952160297
		<= -774780355 * anInt7360)
		i_15_ = (-774780355 * anInt7360
			 - 952160297 * anInt7364);
	    else
		i_15_ = (anInt7360 * -774780355
			 + (anInt7362 * 1120173493
			    - 952160297 * anInt7364));
	    if (i_15_ < i) {
		if (anIOException7366 != null)
		    throw new IOException(((Class571) this)
					      .anIOException7366.toString());
		this.notifyAll();
		boolean bool = false;
		return bool;
	    }
	    boolean bool = true;
	    return bool;
	}
    }
    
    int method12531() throws IOException {
	synchronized (this) {
	    int i;
	    if (952160297 * anInt7364
		<= -774780355 * anInt7360)
		i = (anInt7360 * -774780355
		     - 952160297 * anInt7364);
	    else
		i = (anInt7360 * -774780355
		     + (1120173493 * anInt7362
			- 952160297 * anInt7364));
	    if (anIOException7366 != null)
		throw new IOException(anIOException7366
					  .toString());
	    this.notifyAll();
	    int i_16_ = i;
	    return i_16_;
	}
    }
    
    int method12532() throws IOException {
	synchronized (this) {
	    int i;
	    if (952160297 * anInt7364
		<= -774780355 * anInt7360)
		i = (anInt7360 * -774780355
		     - 952160297 * anInt7364);
	    else
		i = (anInt7360 * -774780355
		     + (1120173493 * anInt7362
			- 952160297 * anInt7364));
	    if (anIOException7366 != null)
		throw new IOException(anIOException7366
					  .toString());
	    this.notifyAll();
	    int i_17_ = i;
	    return i_17_;
	}
    }
    
    public void run() {
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7366 != null)
			return;
		    if (952160297 * anInt7364 == 0)
			i = (anInt7362 * 1120173493
			     - -774780355 * anInt7360 - 1);
		    else if (anInt7364 * 952160297
			     <= -774780355 * anInt7360)
			i = (anInt7362 * 1120173493
			     - -774780355 * anInt7360);
		    else
			i = (anInt7364 * 952160297
			     - anInt7360 * -774780355 - 1);
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_18_;
	    try {
		i_18_ = (anInputStream7361.read
			 (aByteArray7363,
			  -774780355 * anInt7360, i));
		if (i_18_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7366 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7360
		    = (1191157013
		       * ((-774780355 * anInt7360 + i_18_)
			  % (1120173493 * anInt7362)));
	    }
	}
    }
    
    int method12533(byte[] is, int i, int i_19_) throws IOException {
	if (i_19_ < 0 || i < 0 || i + i_19_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_20_;
	    if (anInt7364 * 952160297
		<= anInt7360 * -774780355)
		i_20_ = (anInt7360 * -774780355
			 - 952160297 * anInt7364);
	    else
		i_20_ = (anInt7362 * 1120173493
			 - anInt7364 * 952160297
			 + -774780355 * anInt7360);
	    if (i_19_ > i_20_)
		i_19_ = i_20_;
	    if (i_19_ == 0 && null != anIOException7366)
		throw new IOException(anIOException7366
					  .toString());
	    if (anInt7364 * 952160297 + i_19_
		<= 1120173493 * anInt7362)
		System.arraycopy(aByteArray7363,
				 952160297 * anInt7364, is,
				 i, i_19_);
	    else {
		int i_21_ = (1120173493 * anInt7362
			     - anInt7364 * 952160297);
		System.arraycopy(aByteArray7363,
				 anInt7364 * 952160297, is,
				 i, i_21_);
		System.arraycopy(aByteArray7363, 0, is,
				 i_21_ + i, i_19_ - i_21_);
	    }
	    anInt7364
		= 39046169 * ((i_19_ + 952160297 * anInt7364)
			      % (1120173493 * anInt7362));
	    this.notifyAll();
	    int i_22_ = i_19_;
	    return i_22_;
	}
    }
    
    int method12534(byte[] is, int i, int i_23_) throws IOException {
	if (i_23_ < 0 || i < 0 || i + i_23_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_24_;
	    if (anInt7364 * 952160297
		<= anInt7360 * -774780355)
		i_24_ = (anInt7360 * -774780355
			 - 952160297 * anInt7364);
	    else
		i_24_ = (anInt7362 * 1120173493
			 - anInt7364 * 952160297
			 + -774780355 * anInt7360);
	    if (i_23_ > i_24_)
		i_23_ = i_24_;
	    if (i_23_ == 0 && null != anIOException7366)
		throw new IOException(anIOException7366
					  .toString());
	    if (anInt7364 * 952160297 + i_23_
		<= 1120173493 * anInt7362)
		System.arraycopy(aByteArray7363,
				 952160297 * anInt7364, is,
				 i, i_23_);
	    else {
		int i_25_ = (1120173493 * anInt7362
			     - anInt7364 * 952160297);
		System.arraycopy(aByteArray7363,
				 anInt7364 * 952160297, is,
				 i, i_25_);
		System.arraycopy(aByteArray7363, 0, is,
				 i_25_ + i, i_23_ - i_25_);
	    }
	    anInt7364
		= 39046169 * ((i_23_ + 952160297 * anInt7364)
			      % (1120173493 * anInt7362));
	    this.notifyAll();
	    int i_26_ = i_23_;
	    return i_26_;
	}
    }
    
    void method12535() {
	synchronized (this) {
	    if (null == anIOException7366)
		anIOException7366 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread7365.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method12536() {
	synchronized (this) {
	    if (null == anIOException7366)
		anIOException7366 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread7365.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public void method12537() {
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7366 != null)
			return;
		    if (952160297 * anInt7364 == 0)
			i = (anInt7362 * 1120173493
			     - -774780355 * anInt7360 - 1);
		    else if (anInt7364 * 952160297
			     <= -774780355 * anInt7360)
			i = (anInt7362 * 1120173493
			     - -774780355 * anInt7360);
		    else
			i = (anInt7364 * 952160297
			     - anInt7360 * -774780355 - 1);
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_27_;
	    try {
		i_27_ = (anInputStream7361.read
			 (aByteArray7363,
			  -774780355 * anInt7360, i));
		if (i_27_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7366 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7360
		    = (1191157013
		       * ((-774780355 * anInt7360 + i_27_)
			  % (1120173493 * anInt7362)));
	    }
	}
    }
    
    void method12538() {
	anInputStream7361 = new InputStream_Sub1();
    }
    
    void method12539() {
	anInputStream7361 = new InputStream_Sub1();
    }
    
    int method12540(byte i) throws IOException {
		synchronized (this) {
		    int i_28_;
		    if (952160297 * anInt7364
			<= -774780355 * anInt7360)
			i_28_ = (anInt7360 * -774780355
				 - 952160297 * anInt7364);
		    else
			i_28_ = (anInt7360 * -774780355
				 + (1120173493 * anInt7362
				    - 952160297 * anInt7364));
		    if (anIOException7366 != null) {
		    	throw new IOException(anIOException7366.toString());
		    }
		    this.notifyAll();
		    int i_29_ = i_28_;
		    return i_29_;
		}
	}
    
    void method12541() {
	anInputStream7361 = new InputStream_Sub1();
    }
    
    static final void method12542(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = VarPlayerDomain.currentLocale.getId((byte) 0);
    }
    
    static final void method12543(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	class58.aString849 = (String) (((ClientScriptData) class454).objectStack
				       [(((ClientScriptData) class454).objectStackPointer
					 -= -1650705371) * -290357331]);
    }
    
    public static void method12544(int i) {
	Class445_Sub30.aClass168_8711 = null;
	Class23.aClass168_208 = null;
	Class363.aClass168_5533 = null;
	Class570.aClass168_7359 = null;
	Class363.aClass168_5534 = null;
	Exception_Sub5.aClass168_10705 = null;
	Class102.aClass168_1448 = null;
	Class479.aClass168_6416 = null;
	Class445_Sub12.aClass96_8651 = null;
	Class175.aClass639_2122 = null;
    }
}
