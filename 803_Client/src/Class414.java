/* Class414 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public class Class414
{
    byte[] aByteArray5989;
    int anInt5990;
    byte[] aByteArray5991;
    long aLong5992 = 1631644266215397699L;
    RS3File aClass408_5993;
    long aLong5994 = -8925997660351456107L;
    long aLong5995;
    static final int anInt5996 = 200000000;
    long aLong5997;
    long aLong5998;
    long aLong5999;
    int anInt6000;
    
    public void method7460(byte[] is, short i) throws IOException {
	method7470(is, 0, is.length, 1354963796);
    }
    
    public void method7461(int i) throws IOException {
		method7477(1436579511);
		aClass408_5993.close((byte) 87);
    }
    
    public void method7462(byte[] is) throws IOException {
	method7470(is, 0, is.length, 1368125989);
    }
    
    public void method7463(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong5997 = l * -3877180244500261145L;
    }
    
    public void method7464(byte[] is, int i, int i_0_) throws IOException {
	do {
	    try {
		if ((-6653074524845744937L * aLong5997
		     + (long) i_0_)
		    > 2696977074689990279L * aLong5999)
		    aLong5999
			= (aLong5997 * -6653074524845744937L
			   + (long) i_0_) * -1430888519046428873L;
		if (3493980375725420867L * aLong5994 != -1L
		    && ((-6653074524845744937L * aLong5997
			 < aLong5994 * 3493980375725420867L)
			|| (aLong5997 * -6653074524845744937L
			    > ((aLong5994
				* 3493980375725420867L)
			       + (long) (-1775489303
					 * anInt5990)))))
		    method7477(1759184511);
		if (3493980375725420867L * aLong5994 != -1L
		    && (((long) i_0_
			 + aLong5997 * -6653074524845744937L)
			> ((long) aByteArray5989.length
			   + (3493980375725420867L
			      * aLong5994)))) {
		    int i_1_
			= (int) ((long) aByteArray5989.length
				 - ((-6653074524845744937L
				     * aLong5997)
				    - (3493980375725420867L
				       * aLong5994)));
		    System.arraycopy(is, i, aByteArray5989,
				     (int) ((aLong5997
					     * -6653074524845744937L)
					    - (3493980375725420867L
					       * aLong5994)),
				     i_1_);
		    aLong5997
			+= -3877180244500261145L * (long) i_1_;
		    i += i_1_;
		    i_0_ -= i_1_;
		    anInt5990
			= aByteArray5989.length * 1570867545;
		    method7477(1552663645);
		}
		if (i_0_ > aByteArray5989.length) {
		    if (-7615237788361993379L * aLong5995
			!= (-6653074524845744937L
			    * aLong5997)) {
			aClass408_5993.method7337
			    (aLong5997
			     * -6653074524845744937L);
			aLong5995
			    = (4457832291735863747L
			       * aLong5997);
		    }
		    aClass408_5993.write(is, i, i_0_,
								(byte) 98);
		    aLong5995
			+= 7701611828442339573L * (long) i_0_;
		    if (aLong5995 * -7615237788361993379L
			> aLong5998 * 4665325981712574627L)
			aLong5998
			    = (aLong5995
			       * -8040745274738437121L);
		    long l = -1L;
		    long l_2_ = -1L;
		    if ((aLong5997 * -6653074524845744937L
			 >= (aLong5992
			     * -3405686123260869483L))
			&& (-6653074524845744937L * aLong5997
			    < ((-3405686123260869483L
				* aLong5992)
			       + (long) (anInt6000
					 * 899276777))))
			l = (-6653074524845744937L
			     * aLong5997);
		    else if (((aLong5992
			       * -3405686123260869483L)
			      >= (-6653074524845744937L
				  * aLong5997))
			     && ((-3405686123260869483L
				  * aLong5992)
				 < ((long) i_0_
				    + (-6653074524845744937L
				       * aLong5997))))
			l = (-3405686123260869483L
			     * aLong5992);
		    if (((aLong5997 * -6653074524845744937L
			  + (long) i_0_)
			 > -3405686123260869483L * aLong5992)
			&& ((long) i_0_ + (-6653074524845744937L
					   * aLong5997)
			    <= ((long) (anInt6000
					* 899276777)
				+ (-3405686123260869483L
				   * aLong5992))))
			l_2_ = (long) i_0_ + (aLong5997
					      * -6653074524845744937L);
		    else if ((((aLong5992
				* -3405686123260869483L)
			       + (long) (anInt6000
					 * 899276777))
			      > (-6653074524845744937L
				 * aLong5997))
			     && (((long) (anInt6000
					  * 899276777)
				  + (aLong5992
				     * -3405686123260869483L))
				 <= ((long) i_0_
				     + (-6653074524845744937L
					* aLong5997))))
			l_2_ = ((-3405686123260869483L
				 * aLong5992)
				+ (long) (899276777
					  * anInt6000));
		    if (l > -1L && l_2_ > l) {
			int i_3_ = (int) (l_2_ - l);
			System.arraycopy(is,
					 (int) (l + (long) i
						- (-6653074524845744937L
						   * (((Class414) this)
						      .aLong5997))),
					 aByteArray5991,
					 (int) (l
						- (aLong5992
						   * -3405686123260869483L)),
					 i_3_);
		    }
		    aLong5997
			+= -3877180244500261145L * (long) i_0_;
		} else {
		    if (i_0_ <= 0)
			break;
		    if (-1L
			== 3493980375725420867L * aLong5994)
			aLong5994
			    = (aLong5997
			       * -7031407673962073379L);
		    System.arraycopy(is, i, aByteArray5989,
				     (int) ((aLong5997
					     * -6653074524845744937L)
					    - (3493980375725420867L
					       * aLong5994)),
				     i_0_);
		    aLong5997
			+= -3877180244500261145L * (long) i_0_;
		    if ((-6653074524845744937L * aLong5997
			 - 3493980375725420867L * aLong5994)
			> (long) (anInt5990 * -1775489303))
			anInt5990
			    = (1570867545
			       * (int) ((aLong5997
					 * -6653074524845744937L)
					- (aLong5994
					   * 3493980375725420867L)));
		}
	    } catch (IOException ioexception) {
		aLong5995 = -7701611828442339573L;
		throw ioexception;
	    }
	    break;
	} while (false);
    }
    
    public void method7465(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong5997 = l * -3877180244500261145L;
    }
    
    void method7466(byte i) throws IOException {
	anInt6000 = 0;
	if (aLong5995 * -7615237788361993379L
	    != -6653074524845744937L * aLong5997) {
	    aClass408_5993.method7337
		(aLong5997 * -6653074524845744937L);
	    aLong5995
		= 4457832291735863747L * aLong5997;
	}
	aLong5992
	    = 6944118550209033403L * aLong5997;
	int i_4_;
	for (/**/;
	     (899276777 * anInt6000
	      < aByteArray5991.length);
	     anInt6000 += 2116479065 * i_4_) {
	    int i_5_ = (aByteArray5991.length
			- 899276777 * anInt6000);
	    if (i_5_ > 200000000)
		i_5_ = 200000000;
	    i_4_ = (aClass408_5993.method7327
		    (aByteArray5991,
		     anInt6000 * 899276777, i_5_,
		     (byte) 100));
	    if (-1 == i_4_)
		break;
	    aLong5995 += (long) i_4_ * 7701611828442339573L;
	}
    }
    
    public void method7467(byte[] is, int i, int i_6_, short i_7_)
	throws IOException {
	do {
	    try {
		if ((-6653074524845744937L * aLong5997
		     + (long) i_6_)
		    > 2696977074689990279L * aLong5999)
		    aLong5999
			= (aLong5997 * -6653074524845744937L
			   + (long) i_6_) * -1430888519046428873L;
		if (3493980375725420867L * aLong5994 != -1L
		    && ((-6653074524845744937L * aLong5997
			 < aLong5994 * 3493980375725420867L)
			|| (aLong5997 * -6653074524845744937L
			    > ((aLong5994
				* 3493980375725420867L)
			       + (long) (-1775489303
					 * anInt5990)))))
		    method7477(1257625727);
		if (3493980375725420867L * aLong5994 != -1L
		    && (((long) i_6_
			 + aLong5997 * -6653074524845744937L)
			> ((long) aByteArray5989.length
			   + (3493980375725420867L
			      * aLong5994)))) {
		    int i_8_
			= (int) ((long) aByteArray5989.length
				 - ((-6653074524845744937L
				     * aLong5997)
				    - (3493980375725420867L
				       * aLong5994)));
		    System.arraycopy(is, i, aByteArray5989,
				     (int) ((aLong5997
					     * -6653074524845744937L)
					    - (3493980375725420867L
					       * aLong5994)),
				     i_8_);
		    aLong5997
			+= -3877180244500261145L * (long) i_8_;
		    i += i_8_;
		    i_6_ -= i_8_;
		    anInt5990
			= aByteArray5989.length * 1570867545;
		    method7477(838799812);
		}
		if (i_6_ > aByteArray5989.length) {
		    if (-7615237788361993379L * aLong5995
			!= (-6653074524845744937L
			    * aLong5997)) {
			aClass408_5993.method7337
			    (aLong5997
			     * -6653074524845744937L);
			aLong5995
			    = (4457832291735863747L
			       * aLong5997);
		    }
		    aClass408_5993.write(is, i, i_6_,
								(byte) 71);
		    aLong5995
			+= 7701611828442339573L * (long) i_6_;
		    if (aLong5995 * -7615237788361993379L
			> aLong5998 * 4665325981712574627L)
			aLong5998
			    = (aLong5995
			       * -8040745274738437121L);
		    long l = -1L;
		    long l_9_ = -1L;
		    if ((aLong5997 * -6653074524845744937L
			 >= (aLong5992
			     * -3405686123260869483L))
			&& (-6653074524845744937L * aLong5997
			    < ((-3405686123260869483L
				* aLong5992)
			       + (long) (anInt6000
					 * 899276777))))
			l = (-6653074524845744937L
			     * aLong5997);
		    else if (((aLong5992
			       * -3405686123260869483L)
			      >= (-6653074524845744937L
				  * aLong5997))
			     && ((-3405686123260869483L
				  * aLong5992)
				 < ((long) i_6_
				    + (-6653074524845744937L
				       * aLong5997))))
			l = (-3405686123260869483L
			     * aLong5992);
		    if (((aLong5997 * -6653074524845744937L
			  + (long) i_6_)
			 > -3405686123260869483L * aLong5992)
			&& ((long) i_6_ + (-6653074524845744937L
					   * aLong5997)
			    <= ((long) (anInt6000
					* 899276777)
				+ (-3405686123260869483L
				   * aLong5992))))
			l_9_ = (long) i_6_ + (aLong5997
					      * -6653074524845744937L);
		    else if ((((aLong5992
				* -3405686123260869483L)
			       + (long) (anInt6000
					 * 899276777))
			      > (-6653074524845744937L
				 * aLong5997))
			     && (((long) (anInt6000
					  * 899276777)
				  + (aLong5992
				     * -3405686123260869483L))
				 <= ((long) i_6_
				     + (-6653074524845744937L
					* aLong5997))))
			l_9_ = ((-3405686123260869483L
				 * aLong5992)
				+ (long) (899276777
					  * anInt6000));
		    if (l > -1L && l_9_ > l) {
			int i_10_ = (int) (l_9_ - l);
			System.arraycopy(is,
					 (int) (l + (long) i
						- (-6653074524845744937L
						   * (((Class414) this)
						      .aLong5997))),
					 aByteArray5991,
					 (int) (l
						- (aLong5992
						   * -3405686123260869483L)),
					 i_10_);
		    }
		    aLong5997
			+= -3877180244500261145L * (long) i_6_;
		} else {
		    if (i_6_ <= 0)
			break;
		    if (-1L
			== 3493980375725420867L * aLong5994)
			aLong5994
			    = (aLong5997
			       * -7031407673962073379L);
		    System.arraycopy(is, i, aByteArray5989,
				     (int) ((aLong5997
					     * -6653074524845744937L)
					    - (3493980375725420867L
					       * aLong5994)),
				     i_6_);
		    aLong5997
			+= -3877180244500261145L * (long) i_6_;
		    if ((-6653074524845744937L * aLong5997
			 - 3493980375725420867L * aLong5994)
			> (long) (anInt5990 * -1775489303))
			anInt5990
			    = (1570867545
			       * (int) ((aLong5997
					 * -6653074524845744937L)
					- (aLong5994
					   * 3493980375725420867L)));
		}
	    } catch (IOException ioexception) {
		aLong5995 = -7701611828442339573L;
		throw ioexception;
	    }
	    break;
	} while (false);
    }
    
    public long method7468(byte i) {
	return aLong5999 * 2696977074689990279L;
    }
    
    public Class414(RS3File class408, int i, int i_11_) throws IOException {
	anInt5990 = 0;
	aClass408_5993 = class408;
	aLong5999
	    = ((aLong5998
		= class408.method7326(-542107572) * 4497992972704221963L)
	       * 9011141751817564165L);
	aByteArray5991 = new byte[i];
	aByteArray5989 = new byte[i_11_];
	aLong5997 = 0L;
    }
    
    public void method7469(byte[] is) throws IOException {
	method7470(is, 0, is.length, 1540492759);
    }
    
    public void method7470(byte[] is, int i, int i_12_, int i_13_)
	throws IOException {
	try {
	    if (i + i_12_ > is.length)
		throw new ArrayIndexOutOfBoundsException(i_12_ + i
							 - is.length);
	    if (aLong5994 * 3493980375725420867L != -1L
		&& (aLong5997 * -6653074524845744937L
		    >= aLong5994 * 3493980375725420867L)
		&& ((-6653074524845744937L * aLong5997
		     + (long) i_12_)
		    <= ((long) (anInt5990 * -1775489303)
			+ (aLong5994
			   * 3493980375725420867L)))) {
		System.arraycopy(aByteArray5989,
				 (int) ((aLong5997
					 * -6653074524845744937L)
					- (3493980375725420867L
					   * aLong5994)),
				 is, i, i_12_);
		aLong5997
		    += -3877180244500261145L * (long) i_12_;
		return;
	    }
	    long l = aLong5997 * -6653074524845744937L;
	    int i_14_ = i;
	    int i_15_ = i_12_;
	    if ((aLong5997 * -6653074524845744937L
		 >= aLong5992 * -3405686123260869483L)
		&& (aLong5997 * -6653074524845744937L
		    < ((long) (anInt6000 * 899276777)
		       + (aLong5992
			  * -3405686123260869483L)))) {
		int i_16_
		    = (int) ((long) (899276777 * anInt6000)
			     - ((aLong5997
				 * -6653074524845744937L)
				- (-3405686123260869483L
				   * aLong5992)));
		if (i_16_ > i_12_)
		    i_16_ = i_12_;
		System.arraycopy(aByteArray5991,
				 (int) ((aLong5997
					 * -6653074524845744937L)
					- (-3405686123260869483L
					   * aLong5992)),
				 is, i, i_16_);
		aLong5997
		    += -3877180244500261145L * (long) i_16_;
		i += i_16_;
		i_12_ -= i_16_;
	    }
	    if (i_12_ > aByteArray5991.length) {
		aClass408_5993.method7337
		    (aLong5997 * -6653074524845744937L);
		aLong5995
		    = aLong5997 * 4457832291735863747L;
		int i_17_;
		for (/**/; i_12_ > 0; i_12_ -= i_17_) {
		    i_17_ = aClass408_5993
				.method7327(is, i, i_12_, (byte) 124);
		    if (-1 == i_17_)
			break;
		    aLong5995
			+= (long) i_17_ * 7701611828442339573L;
		    aLong5997
			+= (long) i_17_ * -3877180244500261145L;
		    i += i_17_;
		}
	    } else if (i_12_ > 0) {
		method7466((byte) -74);
		int i_18_ = i_12_;
		if (i_18_ > anInt6000 * 899276777)
		    i_18_ = 899276777 * anInt6000;
		System.arraycopy(aByteArray5991, 0, is, i,
				 i_18_);
		i += i_18_;
		i_12_ -= i_18_;
		aLong5997
		    += -3877180244500261145L * (long) i_18_;
	    }
	    if (-1L != 3493980375725420867L * aLong5994) {
		if ((aLong5994 * 3493980375725420867L
		     > -6653074524845744937L * aLong5997)
		    && i_12_ > 0) {
		    int i_19_ = i + (int) ((3493980375725420867L
					    * aLong5994)
					   - (aLong5997
					      * -6653074524845744937L));
		    if (i_19_ > i_12_ + i)
			i_19_ = i_12_ + i;
		    while (i < i_19_) {
			is[i++] = (byte) 0;
			i_12_--;
			aLong5997 += -3877180244500261145L;
		    }
		}
		long l_20_ = -1L;
		long l_21_ = -1L;
		if (aLong5994 * 3493980375725420867L >= l
		    && (aLong5994 * 3493980375725420867L
			< (long) i_15_ + l))
		    l_20_ = 3493980375725420867L * aLong5994;
		else if (l >= (aLong5994
			       * 3493980375725420867L)
			 && l < ((long) (-1775489303
					 * anInt5990)
				 + (aLong5994
				    * 3493980375725420867L)))
		    l_20_ = l;
		if ((3493980375725420867L * aLong5994
		     + (long) (-1775489303 * anInt5990)) > l
		    && (((long) (anInt5990 * -1775489303)
			 + aLong5994 * 3493980375725420867L)
			<= l + (long) i_15_))
		    l_21_ = ((long) (anInt5990 * -1775489303)
			     + (aLong5994
				* 3493980375725420867L));
		else if ((l + (long) i_15_
			  > aLong5994 * 3493980375725420867L)
			 && (l + (long) i_15_
			     <= ((aLong5994
				  * 3493980375725420867L)
				 + (long) (anInt5990
					   * -1775489303))))
		    l_21_ = (long) i_15_ + l;
		if (l_20_ > -1L && l_21_ > l_20_) {
		    int i_22_ = (int) (l_21_ - l_20_);
		    System.arraycopy(aByteArray5989,
				     (int) (l_20_
					    - (3493980375725420867L
					       * aLong5994)),
				     is, i_14_ + (int) (l_20_ - l), i_22_);
		    if (l_21_ > (aLong5997
				 * -6653074524845744937L)) {
			i_12_ -= l_21_ - (-6653074524845744937L
					  * aLong5997);
			aLong5997
			    = -3877180244500261145L * l_21_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong5995 = -7701611828442339573L;
	    throw ioexception;
	}
	if (i_12_ > 0)
	    throw new EOFException();
    }
    
    public long method7471() {
	return aLong5999 * 2696977074689990279L;
    }
    
    public long method7472() {
	return aLong5999 * 2696977074689990279L;
    }
    
    void method7473() throws IOException {
	if (aLong5994 * 3493980375725420867L != -1L) {
	    if (aLong5995 * -7615237788361993379L
		!= 3493980375725420867L * aLong5994) {
		aClass408_5993.method7337
		    (aLong5994 * 3493980375725420867L);
		aLong5995
		    = aLong5994 * -5442182245158392545L;
	    }
	    aClass408_5993.write
		(aByteArray5989, 0,
		 -1775489303 * anInt5990, (byte) 18);
	    aLong5995
		+= (long) anInt5990 * -958016458361455363L;
	    if (aLong5995 * -7615237788361993379L
		> 4665325981712574627L * aLong5998)
		aLong5998
		    = aLong5995 * -8040745274738437121L;
	    long l = -1L;
	    long l_23_ = -1L;
	    if ((3493980375725420867L * aLong5994
		 >= -3405686123260869483L * aLong5992)
		&& (aLong5994 * 3493980375725420867L
		    < (-3405686123260869483L * aLong5992
		       + (long) (anInt6000 * 899276777))))
		l = aLong5994 * 3493980375725420867L;
	    else if ((aLong5992 * -3405686123260869483L
		      >= 3493980375725420867L * aLong5994)
		     && (-3405686123260869483L * aLong5992
			 < ((long) (anInt5990 * -1775489303)
			    + (3493980375725420867L
			       * aLong5994))))
		l = aLong5992 * -3405686123260869483L;
	    if ((((long) (anInt5990 * -1775489303)
		  + 3493980375725420867L * aLong5994)
		 > aLong5992 * -3405686123260869483L)
		&& (((long) (anInt5990 * -1775489303)
		     + 3493980375725420867L * aLong5994)
		    <= ((long) (899276777 * anInt6000)
			+ (-3405686123260869483L
			   * aLong5992))))
		l_23_ = (aLong5994 * 3493980375725420867L
			 + (long) (anInt5990 * -1775489303));
	    else if (((aLong5992 * -3405686123260869483L
		       + (long) (899276777 * anInt6000))
		      > 3493980375725420867L * aLong5994)
		     && ((aLong5992 * -3405686123260869483L
			  + (long) (899276777 * anInt6000))
			 <= ((long) (-1775489303 * anInt5990)
			     + (aLong5994
				* 3493980375725420867L))))
		l_23_ = (aLong5992 * -3405686123260869483L
			 + (long) (anInt6000 * 899276777));
	    if (l > -1L && l_23_ > l) {
		int i = (int) (l_23_ - l);
		System.arraycopy(aByteArray5989,
				 (int) (l - (3493980375725420867L
					     * aLong5994)),
				 aByteArray5991,
				 (int) (l - (-3405686123260869483L
					     * aLong5992)),
				 i);
	    }
	    aLong5994 = -8925997660351456107L;
	    anInt5990 = 0;
	}
    }
    
    public long method7474() {
	return aLong5999 * 2696977074689990279L;
    }
    
    public void method7475(byte[] is) throws IOException {
	method7470(is, 0, is.length, 1357406107);
    }
    
    void method7476() throws IOException {
	anInt6000 = 0;
	if (aLong5995 * -7615237788361993379L
	    != -6653074524845744937L * aLong5997) {
	    aClass408_5993.method7337
		(aLong5997 * -6653074524845744937L);
	    aLong5995
		= 4457832291735863747L * aLong5997;
	}
	aLong5992
	    = 6944118550209033403L * aLong5997;
	int i;
	for (/**/;
	     (899276777 * anInt6000
	      < aByteArray5991.length);
	     anInt6000 += 2116479065 * i) {
	    int i_24_ = (aByteArray5991.length
			 - 899276777 * anInt6000);
	    if (i_24_ > 200000000)
		i_24_ = 200000000;
	    i = (aClass408_5993.method7327
		 (aByteArray5991,
		  anInt6000 * 899276777, i_24_, (byte) 96));
	    if (-1 == i)
		break;
	    aLong5995 += (long) i * 7701611828442339573L;
	}
    }
    
    void method7477(int i) throws IOException {
	if (aLong5994 * 3493980375725420867L != -1L) {
	    if (aLong5995 * -7615237788361993379L
		!= 3493980375725420867L * aLong5994) {
		aClass408_5993.method7337
		    (aLong5994 * 3493980375725420867L);
		aLong5995
		    = aLong5994 * -5442182245158392545L;
	    }
	    aClass408_5993.write
		(aByteArray5989, 0,
		 -1775489303 * anInt5990, (byte) 44);
	    aLong5995
		+= (long) anInt5990 * -958016458361455363L;
	    if (aLong5995 * -7615237788361993379L
		> 4665325981712574627L * aLong5998)
		aLong5998
		    = aLong5995 * -8040745274738437121L;
	    long l = -1L;
	    long l_25_ = -1L;
	    if ((3493980375725420867L * aLong5994
		 >= -3405686123260869483L * aLong5992)
		&& (aLong5994 * 3493980375725420867L
		    < (-3405686123260869483L * aLong5992
		       + (long) (anInt6000 * 899276777))))
		l = aLong5994 * 3493980375725420867L;
	    else if ((aLong5992 * -3405686123260869483L
		      >= 3493980375725420867L * aLong5994)
		     && (-3405686123260869483L * aLong5992
			 < ((long) (anInt5990 * -1775489303)
			    + (3493980375725420867L
			       * aLong5994))))
		l = aLong5992 * -3405686123260869483L;
	    if ((((long) (anInt5990 * -1775489303)
		  + 3493980375725420867L * aLong5994)
		 > aLong5992 * -3405686123260869483L)
		&& (((long) (anInt5990 * -1775489303)
		     + 3493980375725420867L * aLong5994)
		    <= ((long) (899276777 * anInt6000)
			+ (-3405686123260869483L
			   * aLong5992))))
		l_25_ = (aLong5994 * 3493980375725420867L
			 + (long) (anInt5990 * -1775489303));
	    else if (((aLong5992 * -3405686123260869483L
		       + (long) (899276777 * anInt6000))
		      > 3493980375725420867L * aLong5994)
		     && ((aLong5992 * -3405686123260869483L
			  + (long) (899276777 * anInt6000))
			 <= ((long) (-1775489303 * anInt5990)
			     + (aLong5994
				* 3493980375725420867L))))
		l_25_ = (aLong5992 * -3405686123260869483L
			 + (long) (anInt6000 * 899276777));
	    if (l > -1L && l_25_ > l) {
		int i_26_ = (int) (l_25_ - l);
		System.arraycopy(aByteArray5989,
				 (int) (l - (3493980375725420867L
					     * aLong5994)),
				 aByteArray5991,
				 (int) (l - (-3405686123260869483L
					     * aLong5992)),
				 i_26_);
	    }
	    aLong5994 = -8925997660351456107L;
	    anInt5990 = 0;
	}
    }
    
    public void method7478(byte[] is, int i, int i_27_) throws IOException {
	do {
	    try {
		if ((-6653074524845744937L * aLong5997
		     + (long) i_27_)
		    > 2696977074689990279L * aLong5999)
		    aLong5999
			= (aLong5997 * -6653074524845744937L
			   + (long) i_27_) * -1430888519046428873L;
		if (3493980375725420867L * aLong5994 != -1L
		    && ((-6653074524845744937L * aLong5997
			 < aLong5994 * 3493980375725420867L)
			|| (aLong5997 * -6653074524845744937L
			    > ((aLong5994
				* 3493980375725420867L)
			       + (long) (-1775489303
					 * anInt5990)))))
		    method7477(1449085183);
		if (3493980375725420867L * aLong5994 != -1L
		    && (((long) i_27_
			 + aLong5997 * -6653074524845744937L)
			> ((long) aByteArray5989.length
			   + (3493980375725420867L
			      * aLong5994)))) {
		    int i_28_
			= (int) ((long) aByteArray5989.length
				 - ((-6653074524845744937L
				     * aLong5997)
				    - (3493980375725420867L
				       * aLong5994)));
		    System.arraycopy(is, i, aByteArray5989,
				     (int) ((aLong5997
					     * -6653074524845744937L)
					    - (3493980375725420867L
					       * aLong5994)),
				     i_28_);
		    aLong5997
			+= -3877180244500261145L * (long) i_28_;
		    i += i_28_;
		    i_27_ -= i_28_;
		    anInt5990
			= aByteArray5989.length * 1570867545;
		    method7477(1030375373);
		}
		if (i_27_ > aByteArray5989.length) {
		    if (-7615237788361993379L * aLong5995
			!= (-6653074524845744937L
			    * aLong5997)) {
			aClass408_5993.method7337
			    (aLong5997
			     * -6653074524845744937L);
			aLong5995
			    = (4457832291735863747L
			       * aLong5997);
		    }
		    aClass408_5993.write(is, i, i_27_,
								(byte) 126);
		    aLong5995
			+= 7701611828442339573L * (long) i_27_;
		    if (aLong5995 * -7615237788361993379L
			> aLong5998 * 4665325981712574627L)
			aLong5998
			    = (aLong5995
			       * -8040745274738437121L);
		    long l = -1L;
		    long l_29_ = -1L;
		    if ((aLong5997 * -6653074524845744937L
			 >= (aLong5992
			     * -3405686123260869483L))
			&& (-6653074524845744937L * aLong5997
			    < ((-3405686123260869483L
				* aLong5992)
			       + (long) (anInt6000
					 * 899276777))))
			l = (-6653074524845744937L
			     * aLong5997);
		    else if (((aLong5992
			       * -3405686123260869483L)
			      >= (-6653074524845744937L
				  * aLong5997))
			     && ((-3405686123260869483L
				  * aLong5992)
				 < ((long) i_27_
				    + (-6653074524845744937L
				       * aLong5997))))
			l = (-3405686123260869483L
			     * aLong5992);
		    if (((aLong5997 * -6653074524845744937L
			  + (long) i_27_)
			 > -3405686123260869483L * aLong5992)
			&& ((long) i_27_ + (-6653074524845744937L
					    * aLong5997)
			    <= ((long) (anInt6000
					* 899276777)
				+ (-3405686123260869483L
				   * aLong5992))))
			l_29_ = (long) i_27_ + (aLong5997
						* -6653074524845744937L);
		    else if ((((aLong5992
				* -3405686123260869483L)
			       + (long) (anInt6000
					 * 899276777))
			      > (-6653074524845744937L
				 * aLong5997))
			     && (((long) (anInt6000
					  * 899276777)
				  + (aLong5992
				     * -3405686123260869483L))
				 <= ((long) i_27_
				     + (-6653074524845744937L
					* aLong5997))))
			l_29_ = ((-3405686123260869483L
				  * aLong5992)
				 + (long) (899276777
					   * anInt6000));
		    if (l > -1L && l_29_ > l) {
			int i_30_ = (int) (l_29_ - l);
			System.arraycopy(is,
					 (int) (l + (long) i
						- (-6653074524845744937L
						   * (((Class414) this)
						      .aLong5997))),
					 aByteArray5991,
					 (int) (l
						- (aLong5992
						   * -3405686123260869483L)),
					 i_30_);
		    }
		    aLong5997
			+= -3877180244500261145L * (long) i_27_;
		} else {
		    if (i_27_ <= 0)
			break;
		    if (-1L
			== 3493980375725420867L * aLong5994)
			aLong5994
			    = (aLong5997
			       * -7031407673962073379L);
		    System.arraycopy(is, i, aByteArray5989,
				     (int) ((aLong5997
					     * -6653074524845744937L)
					    - (3493980375725420867L
					       * aLong5994)),
				     i_27_);
		    aLong5997
			+= -3877180244500261145L * (long) i_27_;
		    if ((-6653074524845744937L * aLong5997
			 - 3493980375725420867L * aLong5994)
			> (long) (anInt5990 * -1775489303))
			anInt5990
			    = (1570867545
			       * (int) ((aLong5997
					 * -6653074524845744937L)
					- (aLong5994
					   * 3493980375725420867L)));
		}
	    } catch (IOException ioexception) {
		aLong5995 = -7701611828442339573L;
		throw ioexception;
	    }
	    break;
	} while (false);
    }
    
    void method7479() throws IOException {
	if (aLong5994 * 3493980375725420867L != -1L) {
	    if (aLong5995 * -7615237788361993379L
		!= 3493980375725420867L * aLong5994) {
		aClass408_5993.method7337
		    (aLong5994 * 3493980375725420867L);
		aLong5995
		    = aLong5994 * -5442182245158392545L;
	    }
	    aClass408_5993.write
		(aByteArray5989, 0,
		 -1775489303 * anInt5990, (byte) 89);
	    aLong5995
		+= (long) anInt5990 * -958016458361455363L;
	    if (aLong5995 * -7615237788361993379L
		> 4665325981712574627L * aLong5998)
		aLong5998
		    = aLong5995 * -8040745274738437121L;
	    long l = -1L;
	    long l_31_ = -1L;
	    if ((3493980375725420867L * aLong5994
		 >= -3405686123260869483L * aLong5992)
		&& (aLong5994 * 3493980375725420867L
		    < (-3405686123260869483L * aLong5992
		       + (long) (anInt6000 * 899276777))))
		l = aLong5994 * 3493980375725420867L;
	    else if ((aLong5992 * -3405686123260869483L
		      >= 3493980375725420867L * aLong5994)
		     && (-3405686123260869483L * aLong5992
			 < ((long) (anInt5990 * -1775489303)
			    + (3493980375725420867L
			       * aLong5994))))
		l = aLong5992 * -3405686123260869483L;
	    if ((((long) (anInt5990 * -1775489303)
		  + 3493980375725420867L * aLong5994)
		 > aLong5992 * -3405686123260869483L)
		&& (((long) (anInt5990 * -1775489303)
		     + 3493980375725420867L * aLong5994)
		    <= ((long) (899276777 * anInt6000)
			+ (-3405686123260869483L
			   * aLong5992))))
		l_31_ = (aLong5994 * 3493980375725420867L
			 + (long) (anInt5990 * -1775489303));
	    else if (((aLong5992 * -3405686123260869483L
		       + (long) (899276777 * anInt6000))
		      > 3493980375725420867L * aLong5994)
		     && ((aLong5992 * -3405686123260869483L
			  + (long) (899276777 * anInt6000))
			 <= ((long) (-1775489303 * anInt5990)
			     + (aLong5994
				* 3493980375725420867L))))
		l_31_ = (aLong5992 * -3405686123260869483L
			 + (long) (anInt6000 * 899276777));
	    if (l > -1L && l_31_ > l) {
		int i = (int) (l_31_ - l);
		System.arraycopy(aByteArray5989,
				 (int) (l - (3493980375725420867L
					     * aLong5994)),
				 aByteArray5991,
				 (int) (l - (-3405686123260869483L
					     * aLong5992)),
				 i);
	    }
	    aLong5994 = -8925997660351456107L;
	    anInt5990 = 0;
	}
    }
    
    public void method7480(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong5997 = l * -3877180244500261145L;
    }
    
    public static void method7481(String string, int i) {
	Class318.appendChatboxMessage(0, 0, "", "", "", string, -1570244605);
    }
}
