/* Class567 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class Class567 implements Runnable
{
    int anInt7323 = 0;
    OutputStream anOutputStream7324;
    boolean aBool7325;
    byte[] aByteArray7326;
    int anInt7327;
    int anInt7328 = 0;
    IOException anIOException7329;
    Thread aThread7330;
    static int anInt7331;
    
    void method12444(byte[] is, int i, int i_0_) throws IOException {
	if (i_0_ < 0 || i < 0 || i + i_0_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    if (anIOException7329 != null)
		throw new IOException(anIOException7329
					  .toString());
	    int i_1_;
	    if (anInt7323 * -1531314227
		<= anInt7328 * 620665675)
		i_1_ = (-1531314227 * anInt7323
			+ (anInt7327 * -2070916653
			   - anInt7328 * 620665675)
			- 1);
	    else
		i_1_ = (-1531314227 * anInt7323
			- anInt7328 * 620665675 - 1);
	    if (i_1_ < i_0_)
		throw new IOException("");
	    if (i_0_ + 620665675 * anInt7328
		<= -2070916653 * anInt7327)
		System.arraycopy(is, i, aByteArray7326,
				 620665675 * anInt7328,
				 i_0_);
	    else {
		int i_2_ = (-2070916653 * anInt7327
			    - 620665675 * anInt7328);
		System.arraycopy(is, i, aByteArray7326,
				 620665675 * anInt7328,
				 i_2_);
		System.arraycopy(is, i_2_ + i,
				 aByteArray7326, 0,
				 i_0_ - i_2_);
	    }
	    anInt7328
		= (-2077976989
		   * ((i_0_ + 620665675 * anInt7328)
		      % (-2070916653 * anInt7327)));
	    this.notifyAll();
	}
    }
    
    void method12445(byte i) {
	synchronized (this) {
	    aBool7325 = true;
	    this.notifyAll();
	}
	try {
	    aThread7330.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    boolean method12446() {
	if (aBool7325) {
	    try {
		anOutputStream7324.close();
		if (null == anIOException7329)
		    anIOException7329 = new IOException("");
	    } catch (IOException ioexception) {
		if (anIOException7329 == null)
		    anIOException7329
			= new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    Class567(OutputStream outputstream, int i) {
	anOutputStream7324 = outputstream;
	anInt7327 = (i + 1) * -677040549;
	aByteArray7326
	    = new byte[anInt7327 * -2070916653];
	aThread7330 = new Thread(this);
	aThread7330.setDaemon(true);
	aThread7330.start();
    }
    
    void method12447(byte[] is, int i, int i_3_, byte i_4_)
	throws IOException {
	if (i_3_ < 0 || i < 0 || i + i_3_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    if (anIOException7329 != null)
		throw new IOException(anIOException7329
					  .toString());
	    int i_5_;
	    if (anInt7323 * -1531314227
		<= anInt7328 * 620665675)
		i_5_ = (-1531314227 * anInt7323
			+ (anInt7327 * -2070916653
			   - anInt7328 * 620665675)
			- 1);
	    else
		i_5_ = (-1531314227 * anInt7323
			- anInt7328 * 620665675 - 1);
	    if (i_5_ < i_3_)
		throw new IOException("");
	    if (i_3_ + 620665675 * anInt7328
		<= -2070916653 * anInt7327)
		System.arraycopy(is, i, aByteArray7326,
				 620665675 * anInt7328,
				 i_3_);
	    else {
		int i_6_ = (-2070916653 * anInt7327
			    - 620665675 * anInt7328);
		System.arraycopy(is, i, aByteArray7326,
				 620665675 * anInt7328,
				 i_6_);
		System.arraycopy(is, i_6_ + i,
				 aByteArray7326, 0,
				 i_3_ - i_6_);
	    }
	    anInt7328
		= (-2077976989
		   * ((i_3_ + 620665675 * anInt7328)
		      % (-2070916653 * anInt7327)));
	    this.notifyAll();
	}
    }
    
    void method12448(byte i) {
	anOutputStream7324 = new OutputStream_Sub1();
    }
    
    public void method12449() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (null != anIOException7329)
			return;
		    if (anInt7323 * -1531314227
			<= 620665675 * anInt7328)
			i = (620665675 * anInt7328
			     - -1531314227 * anInt7323);
		    else
			i = (anInt7328 * 620665675
			     + (-2070916653 * anInt7327
				- -1531314227 * anInt7323));
		    if (i > 0)
			break;
		    try {
			anOutputStream7324.flush();
		    } catch (IOException ioexception) {
			anIOException7329 = ioexception;
			return;
		    }
		    if (method12452(224094359))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (anInt7323 * -1531314227 + i
		    <= -2070916653 * anInt7327)
		    anOutputStream7324.write
			(aByteArray7326,
			 anInt7323 * -1531314227, i);
		else {
		    int i_7_ = (-2070916653 * anInt7327
				- anInt7323 * -1531314227);
		    anOutputStream7324.write
			(aByteArray7326,
			 -1531314227 * anInt7323, i_7_);
		    anOutputStream7324
			.write(aByteArray7326, 0, i - i_7_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7329 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7323
		    = (-1696922363
		       * ((i + anInt7323 * -1531314227)
			  % (-2070916653 * anInt7327)));
	    }
	} while (!method12452(1940924066));
    }
    
    public void method12450() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (null != anIOException7329)
			return;
		    if (anInt7323 * -1531314227
			<= 620665675 * anInt7328)
			i = (620665675 * anInt7328
			     - -1531314227 * anInt7323);
		    else
			i = (anInt7328 * 620665675
			     + (-2070916653 * anInt7327
				- -1531314227 * anInt7323));
		    if (i > 0)
			break;
		    try {
			anOutputStream7324.flush();
		    } catch (IOException ioexception) {
			anIOException7329 = ioexception;
			return;
		    }
		    if (method12452(-361289555))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (anInt7323 * -1531314227 + i
		    <= -2070916653 * anInt7327)
		    anOutputStream7324.write
			(aByteArray7326,
			 anInt7323 * -1531314227, i);
		else {
		    int i_8_ = (-2070916653 * anInt7327
				- anInt7323 * -1531314227);
		    anOutputStream7324.write
			(aByteArray7326,
			 -1531314227 * anInt7323, i_8_);
		    anOutputStream7324
			.write(aByteArray7326, 0, i - i_8_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7329 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7323
		    = (-1696922363
		       * ((i + anInt7323 * -1531314227)
			  % (-2070916653 * anInt7327)));
	    }
	} while (!method12452(510856377));
    }
    
    public void run() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (null != anIOException7329)
			return;
		    if (anInt7323 * -1531314227
			<= 620665675 * anInt7328)
			i = (620665675 * anInt7328
			     - -1531314227 * anInt7323);
		    else
			i = (anInt7328 * 620665675
			     + (-2070916653 * anInt7327
				- -1531314227 * anInt7323));
		    if (i > 0)
			break;
		    try {
			anOutputStream7324.flush();
		    } catch (IOException ioexception) {
			anIOException7329 = ioexception;
			return;
		    }
		    if (method12452(1719988309))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (anInt7323 * -1531314227 + i
		    <= -2070916653 * anInt7327)
		    anOutputStream7324.write
			(aByteArray7326,
			 anInt7323 * -1531314227, i);
		else {
		    int i_9_ = (-2070916653 * anInt7327
				- anInt7323 * -1531314227);
		    anOutputStream7324.write
			(aByteArray7326,
			 -1531314227 * anInt7323, i_9_);
		    anOutputStream7324
			.write(aByteArray7326, 0, i - i_9_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7329 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7323
		    = (-1696922363
		       * ((i + anInt7323 * -1531314227)
			  % (-2070916653 * anInt7327)));
	    }
	} while (!method12452(1663124699));
    }
    
    public void method12451() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (null != anIOException7329)
			return;
		    if (anInt7323 * -1531314227
			<= 620665675 * anInt7328)
			i = (620665675 * anInt7328
			     - -1531314227 * anInt7323);
		    else
			i = (anInt7328 * 620665675
			     + (-2070916653 * anInt7327
				- -1531314227 * anInt7323));
		    if (i > 0)
			break;
		    try {
			anOutputStream7324.flush();
		    } catch (IOException ioexception) {
			anIOException7329 = ioexception;
			return;
		    }
		    if (method12452(1525529689))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (anInt7323 * -1531314227 + i
		    <= -2070916653 * anInt7327)
		    anOutputStream7324.write
			(aByteArray7326,
			 anInt7323 * -1531314227, i);
		else {
		    int i_10_ = (-2070916653 * anInt7327
				 - anInt7323 * -1531314227);
		    anOutputStream7324.write
			(aByteArray7326,
			 -1531314227 * anInt7323, i_10_);
		    anOutputStream7324
			.write(aByteArray7326, 0, i - i_10_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7329 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7323
		    = (-1696922363
		       * ((i + anInt7323 * -1531314227)
			  % (-2070916653 * anInt7327)));
	    }
	} while (!method12452(-525076527));
    }
    
    boolean method12452(int i) {
	if (aBool7325) {
	    try {
		anOutputStream7324.close();
		if (null == anIOException7329)
		    anIOException7329 = new IOException("");
	    } catch (IOException ioexception) {
		if (anIOException7329 == null)
		    anIOException7329
			= new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    void method12453() {
	anOutputStream7324 = new OutputStream_Sub1();
    }
    
    void method12454() {
	anOutputStream7324 = new OutputStream_Sub1();
    }
    
    public void method12455() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (null != anIOException7329)
			return;
		    if (anInt7323 * -1531314227
			<= 620665675 * anInt7328)
			i = (620665675 * anInt7328
			     - -1531314227 * anInt7323);
		    else
			i = (anInt7328 * 620665675
			     + (-2070916653 * anInt7327
				- -1531314227 * anInt7323));
		    if (i > 0)
			break;
		    try {
			anOutputStream7324.flush();
		    } catch (IOException ioexception) {
			anIOException7329 = ioexception;
			return;
		    }
		    if (method12452(-1465483753))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (anInt7323 * -1531314227 + i
		    <= -2070916653 * anInt7327)
		    anOutputStream7324.write
			(aByteArray7326,
			 anInt7323 * -1531314227, i);
		else {
		    int i_11_ = (-2070916653 * anInt7327
				 - anInt7323 * -1531314227);
		    anOutputStream7324.write
			(aByteArray7326,
			 -1531314227 * anInt7323, i_11_);
		    anOutputStream7324
			.write(aByteArray7326, 0, i - i_11_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7329 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7323
		    = (-1696922363
		       * ((i + anInt7323 * -1531314227)
			  % (-2070916653 * anInt7327)));
	    }
	} while (!method12452(-1240168083));
    }
    
    void method12456() {
    	anOutputStream7324 = new OutputStream_Sub1();
    }
    
    void method12457() {
    	anOutputStream7324 = new OutputStream_Sub1();
    }
    
    static final void method12458(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class583_Sub1.method14420(class58, class35, class454, -974164005);
    }
    
    static final void method12459(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class13.anInt75 * -2029421995;
    }
}
