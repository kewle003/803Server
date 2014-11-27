/* Class209_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Iterator;

public class Class209_Sub1 extends Class209 {
    Class563 aClass563_10284;
    public static long aLong10285;
    
    void method16587(byte i) {
	if (aClass563_10284 != null) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(6, -85853484);
		aClass241_Sub3_2470
		    .writeTriByte(3, -701796875);
		aClass241_Sub3_2470
		    .writeShort(0, -484048531);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -249530337);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1727907786);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
    }
    
    void method4143(int i, int i_0_, int i_1_) {
	try {
	    aClass563_10284.close(2012458703);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass563_10284 = null;
	anInt2472 += 783825475;
	anInt2473 = 1270087521;
	aByte2471
	    = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt2478 = 254315631 * i;
	anInt2475 = 1455410379 * i_0_;
    }
    
    public boolean method4144(int i) {//Used
		if (aClass563_10284 != null) {
		    long l = Class50.method1249((byte) 1);
		    int i_2_ = (int) (l - (aLong2469
					   * -5921577983497540227L));
		    aLong2469 = l * -3351352901584636971L;
		    if (i_2_ > 200)
			i_2_ = 200;
		    anInt2468 += i_2_ * 1328239855;
		    if (anInt2468 * 218520079 > 30000) {
				try {
				    aClass563_10284
					.close(1932618031);
				} catch (Exception exception) {
				    /* empty */
				}
				aClass563_10284 = null;
		    }
		}
		if (null == aClass563_10284) {
		    if (method4153(2038259117) == 0 && method4170(-995747763) == 0)
		    	return true;
		    return false;
		}
		boolean bool;
		try {
		    for (Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		    		= (Class241_Sub39_Sub5_Sub3) aClass410_2464.method7440(-1397088259);
		    		class241_sub39_sub5_sub3 != null;
		    		class241_sub39_sub5_sub3 = (Class241_Sub39_Sub5_Sub3) aClass410_2464.method7435((byte) -1)) {
				aClass241_Sub3_2470.pointer = 0;
				aClass241_Sub3_2470.writeByte(1, -1755127940);
				aClass241_Sub3_2470.method14625(251842045416236843L * class241_sub39_sub5_sub3.aLong10147);
				aClass563_10284.write(aClass241_Sub3_2470.payload,
				     0, aClass241_Sub3_2470.payload.length, 1179873272);
				aClass410_2465.method7431(class241_sub39_sub5_sub3, (byte) -99);
		    }
		    for (Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		    		= (Class241_Sub39_Sub5_Sub3) aClass410_2466.method7440(-1397088259);
		    		null != class241_sub39_sub5_sub3;
		    		class241_sub39_sub5_sub3
		    		= (Class241_Sub39_Sub5_Sub3) aClass410_2466.method7435((byte) -1)) {
				aClass241_Sub3_2470.pointer = 0;
				aClass241_Sub3_2470
				    .writeByte(0, 1647473879);
				aClass241_Sub3_2470.method14625
				    (251842045416236843L
				     * class241_sub39_sub5_sub3.aLong10147);
				aClass563_10284.write
				    (aClass241_Sub3_2470.payload,
				     0,
				     (aClass241_Sub3_2470
				      .payload).length,
				     333672121);
				aClass410_2479
				    .method7431(class241_sub39_sub5_sub3, (byte) -87);
		    }
		    for (int i_3_ = 0; i_3_ < 100; i_3_++) {
				int i_4_ = aClass563_10284.method12389(-2142433432);
				if (i_4_ < 0) {
				    throw new IOException();
				}
				if (0 == i_4_) {
				    break;
				}
				anInt2468 = 0;
				if (null == aClass241_Sub39_Sub5_Sub3_2459) {
				    int i_5_ = 5 - aClass241_Sub3_2474.pointer * 421967667;
				    if (i_5_ > i_4_) {
				    	i_5_ = i_4_;
				    }
				    aClass563_10284.read
					((aClass241_Sub3_2474
					  .payload),
					 (aClass241_Sub3_2474.pointer
					  * 421967667),
					 i_5_, 2050147735);
				    if (aByte2471 != 0) {
						for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
						    aClass241_Sub3_2474
							.payload
							[(aClass241_Sub3_2474
							  .pointer) * 421967667 + i_6_]
							^= aByte2471;
				    }
				    aClass241_Sub3_2474.pointer += -681042949 * i_5_;
				    if ((aClass241_Sub3_2474.pointer * 421967667) >= 5) {
						aClass241_Sub3_2474.pointer = 0;
						int archiveid = aClass241_Sub3_2474.readUnsignedByte((byte) -66);
						int i_8_ = aClass241_Sub3_2474.readInt((byte) 114);
						boolean urgent = 0 != (i_8_ & ~0x7fffffff);
						int groupid = i_8_ & 0x7fffffff;
						long l = ((long) archiveid << 32) + (long) groupid;
						if (urgent) {
						    Iterator iterator = aClass410_2479.iterator();
						    while (iterator.hasNext()) {
								Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
								    = ((Class241_Sub39_Sub5_Sub3)
								       iterator.next());
								if ((class241_sub39_sub5_sub3.aLong10147
								     * 251842045416236843L) == l) {
								    aClass241_Sub39_Sub5_Sub3_2459 = class241_sub39_sub5_sub3;
								    break;
								}
						    }
						} else {
						    Iterator iterator = aClass410_2465.iterator();
						    while (iterator.hasNext()) {
								Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
								    = ((Class241_Sub39_Sub5_Sub3) iterator.next());
								if (l == (251842045416236843L * class241_sub39_sub5_sub3.aLong10147)) {
								    aClass241_Sub39_Sub5_Sub3_2459 = class241_sub39_sub5_sub3;
								    break;
								}
						    }
						}
						if (null == aClass241_Sub39_Sub5_Sub3_2459) {
							//System.out.println("Could not find matching request - archiveid:" + i_7_ + " groupid:" + groupid + " ctype:" + var9 + " clen:" + var8 + " xorcode:" + this.x);
	                           throw new IOException();
						}
						anInt2467 = -507273711;
						aClass241_Sub3_2474.pointer = 0;
						aClass241_Sub3_2458.pointer = 0;
				    }
				} else {
				    RSByteBuffer buffer
						= (((Class241_Sub39_Sub5_Sub3) aClass241_Sub39_Sub5_Sub3_2459).aClass241_Sub3_11450);
				    if (null == buffer) {
						int i_11_ = 5 - 421967667 * aClass241_Sub3_2458.pointer;
						if (i_11_ > i_4_)
						    i_11_ = i_4_;
						aClass563_10284.read
						    ((aClass241_Sub3_2458
						      .payload),
						     (aClass241_Sub3_2458
						      .pointer) * 421967667,
						     i_11_, 1960750205);
						if (aByte2471 != 0) {
						    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
							aClass241_Sub3_2458
							    .payload
							    [421967667 * (((Class209_Sub1) this)
									  .aClass241_Sub3_2458
									  .pointer) + i_12_]
							    ^= aByte2471;
						}
						aClass241_Sub3_2458.pointer += -681042949 * i_11_;
						if (421967667 * aClass241_Sub3_2458.pointer >= 5) {
						    aClass241_Sub3_2458.pointer = 0;
						    int ctype = aClass241_Sub3_2458.readUnsignedByte((byte) 39);
						    int clen = aClass241_Sub3_2458.readInt((byte) 83);
						    int i_15_ = 5;
						    if (0 != ctype) {
						    	i_15_ = 9;
						    }
						    buffer
							= ((Class241_Sub39_Sub5_Sub3)
							   (((Class209_Sub1) this)
							    .aClass241_Sub39_Sub5_Sub3_2459))
							      .aClass241_Sub3_11450
							= (new RSByteBuffer
							   (clen + i_15_
							    + (((Class241_Sub39_Sub5_Sub3)
								(((Class209_Sub1) this)
								 .aClass241_Sub39_Sub5_Sub3_2459))
							       .aByte11451)));
						    buffer.writeByte(ctype, -1999946315);
						    buffer.writeInt(clen, -27227248);
						    anInt2467 += -507273711;
						}
				    } else {
					int i_16_ = (buffer.payload.length
						     - (((Class241_Sub39_Sub5_Sub3)
							 (((Class209_Sub1) this)
							  .aClass241_Sub39_Sub5_Sub3_2459))
							.aByte11451));
					int i_17_
					    = (512
					       - 657940149 * anInt2467);
					if (i_17_
					    > i_16_ - 421967667 * buffer.pointer)
					    i_17_
						= i_16_ - buffer.pointer * 421967667;
					if (i_17_ > i_4_)
					    i_17_ = i_4_;
					aClass563_10284.read
					    (buffer.payload,
					    		buffer.pointer * 421967667, i_17_,
					     2096856595);
					if (0 != aByte2471) {
					    for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
					    	buffer.payload
						    [(421967667 * buffer.pointer
						      + i_18_)]
						    ^= aByte2471;
					}
					buffer.pointer += -681042949 * i_17_;
					anInt2467 += 757538717 * i_17_;
					if (i_16_ == buffer.pointer * 421967667) {
					    ((Class209_Sub1) this)
						.aClass241_Sub39_Sub5_Sub3_2459
						.method16441((byte) 2);
					    ((Class241_Sub39_Sub5_Sub3)
					     (((Class209_Sub1) this)
					      .aClass241_Sub39_Sub5_Sub3_2459)).aBool10839
						= false;
					    aClass241_Sub39_Sub5_Sub3_2459 = null;
					} else if (512 == 657940149 * anInt2467) {
					    anInt2467 = 0;
					    aClass241_Sub39_Sub5_Sub3_2459 = null;
					}
				    }
				}
		    }
		    bool = true;
		} catch (IOException ioexception) {
		    try {
		    	aClass563_10284.close(2096117852);
		    } catch (Exception exception) {
		    	/* empty */
		    }
		    aClass563_10284 = null;
		    anInt2472 += 783825475;
		    anInt2473 = -1754792254;
		    if (method4153(2112282546) == 0 && method4170(-1242908869) == 0) {
		    	return true;
		    }
		    return false;
		}
		return bool;
    }
    
    public void method4146(boolean bool, int i) {
	if (aClass563_10284 != null) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(bool ? 2 : 3, 80900643);
		aClass241_Sub3_2470.method14625(0L);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -794677108);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1597776614);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
    }
    
    public void method4165(Object object, boolean bool) {
	if (null != aClass563_10284) {
	    try {
		aClass563_10284.close(1938326456);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass563_10284 = null;
	}
	aClass563_10284 = (Class563) object;
	method16587((byte) 80);
	method4146(bool, -1742384194);
	aClass241_Sub3_2474.pointer = 0;
	aClass241_Sub3_2458.pointer = 0;
	aClass241_Sub39_Sub5_Sub3_2459 = null;
	for (;;) {
	    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		= ((Class241_Sub39_Sub5_Sub3)
		   aClass410_2465.method7432(16777472));
	    if (class241_sub39_sub5_sub3 == null)
		break;
	    ((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3)
		.aClass241_Sub3_11450
		= null;
	    aClass410_2464
		.method7431(class241_sub39_sub5_sub3, (byte) -56);
	}
	for (;;) {
	    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		= ((Class241_Sub39_Sub5_Sub3)
		   aClass410_2479.method7432(16777472));
	    if (class241_sub39_sub5_sub3 == null)
		break;
	    ((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3)
		.aClass241_Sub3_11450
		= null;
	    aClass410_2466
		.method7431(class241_sub39_sub5_sub3, (byte) -26);
	}
	if (aByte2471 != 0) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(4, 1074347648);
		aClass241_Sub3_2470
		    .writeByte(aByte2471, 14673828);
		aClass241_Sub3_2470
		    .writeInt(0, 53166607);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -158019226);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1823786378);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
	anInt2468 = 0;
	aLong2469
	    = Class50.method1249((byte) 1) * -3351352901584636971L;
    }
    
    public void method4138(int i) {
	if (aClass563_10284 != null) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(7, -532742057);
		aClass241_Sub3_2470.method14625(0L);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -2047595843);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1714495682);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
    }
    
    public boolean method4163() {
	if (aClass563_10284 != null) {
	    long l = Class50.method1249((byte) 1);
	    int i = (int) (l - (aLong2469
				* -5921577983497540227L));
	    aLong2469 = l * -3351352901584636971L;
	    if (i > 200)
		i = 200;
	    anInt2468 += i * 1328239855;
	    if (anInt2468 * 218520079 > 30000) {
		try {
		    aClass563_10284
			.close(1564609024);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
	    }
	}
	if (null == aClass563_10284) {
	    if (method4153(2095741325) == 0 && method4170(992125184) == 0)
		return true;
	    return false;
	}
	boolean bool;
	try {
	    for (Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		     = (Class241_Sub39_Sub5_Sub3) ((Class209_Sub1) this)
						      .aClass410_2464
						      .method7440(-1397088259);
		 class241_sub39_sub5_sub3 != null;
		 class241_sub39_sub5_sub3
		     = (Class241_Sub39_Sub5_Sub3) ((Class209_Sub1) this)
						      .aClass410_2464
						      .method7435((byte) -1)) {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(1, 1469278158);
		aClass241_Sub3_2470.method14625
		    (251842045416236843L
		     * class241_sub39_sub5_sub3.aLong10147);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     389344856);
		aClass410_2465
		    .method7431(class241_sub39_sub5_sub3, (byte) -27);
	    }
	    for (Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		     = (Class241_Sub39_Sub5_Sub3) ((Class209_Sub1) this)
						      .aClass410_2466
						      .method7440(-1397088259);
		 null != class241_sub39_sub5_sub3;
		 class241_sub39_sub5_sub3
		     = (Class241_Sub39_Sub5_Sub3) ((Class209_Sub1) this)
						      .aClass410_2466
						      .method7435((byte) -1)) {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(0, -307220197);
		aClass241_Sub3_2470.method14625
		    (251842045416236843L
		     * class241_sub39_sub5_sub3.aLong10147);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -1174044066);
		aClass410_2479
		    .method7431(class241_sub39_sub5_sub3, (byte) -118);
	    }
	    for (int i = 0; i < 100; i++) {
		int i_19_ = aClass563_10284
				.method12389(-2140215000);
		if (i_19_ < 0)
		    throw new IOException();
		if (0 == i_19_)
		    break;
		anInt2468 = 0;
		if (null
		    == aClass241_Sub39_Sub5_Sub3_2459) {
		    int i_20_ = 5 - (aClass241_Sub3_2474
				     .pointer) * 421967667;
		    if (i_20_ > i_19_)
			i_20_ = i_19_;
		    aClass563_10284.read
			((aClass241_Sub3_2474
			  .payload),
			 (aClass241_Sub3_2474.pointer
			  * 421967667),
			 i_20_, 2101409432);
		    if (aByte2471 != 0) {
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
			    aClass241_Sub3_2474
				.payload
				[(aClass241_Sub3_2474
				  .pointer) * 421967667 + i_21_]
				^= aByte2471;
		    }
		    aClass241_Sub3_2474.pointer
			+= -681042949 * i_20_;
		    if ((aClass241_Sub3_2474.pointer
			 * 421967667)
			>= 5) {
			aClass241_Sub3_2474.pointer
			    = 0;
			int i_22_ = ((Class209_Sub1) this)
					.aClass241_Sub3_2474
					.readUnsignedByte((byte) 15);
			int i_23_ = ((Class209_Sub1) this)
					.aClass241_Sub3_2474
					.readInt((byte) 7);
			boolean bool_24_ = 0 != (i_23_ & ~0x7fffffff);
			int i_25_ = i_23_ & 0x7fffffff;
			long l = ((long) i_22_ << 32) + (long) i_25_;
			if (bool_24_) {
			    Iterator iterator = ((Class209_Sub1) this)
						    .aClass410_2479.iterator();
			    while (iterator.hasNext()) {
				Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
				    = ((Class241_Sub39_Sub5_Sub3)
				       iterator.next());
				if ((class241_sub39_sub5_sub3.aLong10147
				     * 251842045416236843L)
				    == l) {
				    ((Class209_Sub1) this)
					.aClass241_Sub39_Sub5_Sub3_2459
					= class241_sub39_sub5_sub3;
				    break;
				}
			    }
			} else {
			    Iterator iterator = ((Class209_Sub1) this)
						    .aClass410_2465.iterator();
			    while (iterator.hasNext()) {
				Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
				    = ((Class241_Sub39_Sub5_Sub3)
				       iterator.next());
				if (l == (251842045416236843L
					  * (class241_sub39_sub5_sub3
					     .aLong10147))) {
				    ((Class209_Sub1) this)
					.aClass241_Sub39_Sub5_Sub3_2459
					= class241_sub39_sub5_sub3;
				    break;
				}
			    }
			}
			if (null == (((Class209_Sub1) this)
				     .aClass241_Sub39_Sub5_Sub3_2459))
			    throw new IOException();
			anInt2467 = -507273711;
			aClass241_Sub3_2474.pointer
			    = 0;
			aClass241_Sub3_2458.pointer
			    = 0;
		    }
		} else {
		    RSByteBuffer class241_sub3
			= (((Class241_Sub39_Sub5_Sub3)
			    (((Class209_Sub1) this)
			     .aClass241_Sub39_Sub5_Sub3_2459))
			   .aClass241_Sub3_11450);
		    if (null == class241_sub3) {
			int i_26_
			    = 5 - 421967667 * (((Class209_Sub1) this)
					       .aClass241_Sub3_2458.pointer);
			if (i_26_ > i_19_)
			    i_26_ = i_19_;
			aClass563_10284.read
			    ((aClass241_Sub3_2458
			      .payload),
			     (aClass241_Sub3_2458
			      .pointer) * 421967667,
			     i_26_, 1977516425);
			if (aByte2471 != 0) {
			    for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
				aClass241_Sub3_2458
				    .payload
				    [421967667 * (((Class209_Sub1) this)
						  .aClass241_Sub3_2458
						  .pointer) + i_27_]
				    ^= aByte2471;
			}
			aClass241_Sub3_2458.pointer
			    += -681042949 * i_26_;
			if (421967667 * (((Class209_Sub1) this)
					 .aClass241_Sub3_2458.pointer)
			    >= 5) {
			    aClass241_Sub3_2458
				.pointer
				= 0;
			    int i_28_
				= ((Class209_Sub1) this)
				      .aClass241_Sub3_2458
				      .readUnsignedByte((byte) -8);
			    int i_29_
				= ((Class209_Sub1) this)
				      .aClass241_Sub3_2458
				      .readInt((byte) 59);
			    int i_30_ = 5;
			    if (0 != i_28_)
				i_30_ = 9;
			    class241_sub3
				= ((Class241_Sub39_Sub5_Sub3)
				   (((Class209_Sub1) this)
				    .aClass241_Sub39_Sub5_Sub3_2459))
				      .aClass241_Sub3_11450
				= (new RSByteBuffer
				   (i_29_ + i_30_
				    + (((Class241_Sub39_Sub5_Sub3)
					(((Class209_Sub1) this)
					 .aClass241_Sub39_Sub5_Sub3_2459))
				       .aByte11451)));
			    class241_sub3.writeByte(i_28_, 1064119447);
			    class241_sub3.writeInt(i_29_, 1237483142);
			    anInt2467 += -507273711;
			}
		    } else {
			int i_31_ = (class241_sub3.payload.length
				     - (((Class241_Sub39_Sub5_Sub3)
					 (((Class209_Sub1) this)
					  .aClass241_Sub39_Sub5_Sub3_2459))
					.aByte11451));
			int i_32_
			    = (512
			       - 657940149 * anInt2467);
			if (i_32_
			    > i_31_ - 421967667 * class241_sub3.pointer)
			    i_32_
				= i_31_ - class241_sub3.pointer * 421967667;
			if (i_32_ > i_19_)
			    i_32_ = i_19_;
			aClass563_10284.read
			    (class241_sub3.payload,
			     class241_sub3.pointer * 421967667, i_32_,
			     1982298112);
			if (0 != aByte2471) {
			    for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
				class241_sub3.payload
				    [(421967667 * class241_sub3.pointer
				      + i_33_)]
				    ^= aByte2471;
			}
			class241_sub3.pointer += -681042949 * i_32_;
			anInt2467 += 757538717 * i_32_;
			if (i_31_ == class241_sub3.pointer * 421967667) {
			    ((Class209_Sub1) this)
				.aClass241_Sub39_Sub5_Sub3_2459
				.method16441((byte) 2);
			    ((Class241_Sub39_Sub5_Sub3)
			     (((Class209_Sub1) this)
			      .aClass241_Sub39_Sub5_Sub3_2459)).aBool10839
				= false;
			    ((Class209_Sub1) this)
				.aClass241_Sub39_Sub5_Sub3_2459
				= null;
			} else if (512 == 657940149 * (((Class209_Sub1) this)
						       .anInt2467)) {
			    anInt2467 = 0;
			    ((Class209_Sub1) this)
				.aClass241_Sub39_Sub5_Sub3_2459
				= null;
			}
		    }
		}
	    }
	    bool = true;
	} catch (IOException ioexception) {
	    try {
		aClass563_10284.close(1708161716);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass563_10284 = null;
	    anInt2472 += 783825475;
	    anInt2473 = -1754792254;
	    if (method4153(2023985774) == 0 && method4170(-1713973703) == 0)
		return true;
	    return false;
	}
	return bool;
    }
    
    public void method4166(int i) {
	if (null != aClass563_10284)
	    aClass563_10284.resetByteCounts(1555157443);
    }
    
    public void method4148(int i) {
	if (aClass563_10284 != null)
	    aClass563_10284.close(1563150436);
    }
    
    public boolean method4162() {
	if (aClass563_10284 != null) {
	    long l = Class50.method1249((byte) 1);
	    int i = (int) (l - (aLong2469
				* -5921577983497540227L));
	    aLong2469 = l * -3351352901584636971L;
	    if (i > 200)
		i = 200;
	    anInt2468 += i * 1328239855;
	    if (anInt2468 * 218520079 > 30000) {
		try {
		    aClass563_10284
			.close(2093609710);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
	    }
	}
	if (null == aClass563_10284) {
	    if (method4153(1984333965) == 0 && method4170(-1560269151) == 0)
		return true;
	    return false;
	}
	boolean bool;
	try {
	    for (Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		     = (Class241_Sub39_Sub5_Sub3) ((Class209_Sub1) this)
						      .aClass410_2464
						      .method7440(-1397088259);
		 class241_sub39_sub5_sub3 != null;
		 class241_sub39_sub5_sub3
		     = (Class241_Sub39_Sub5_Sub3) ((Class209_Sub1) this)
						      .aClass410_2464
						      .method7435((byte) -1)) {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(1, -279263286);
		aClass241_Sub3_2470.method14625
		    (251842045416236843L
		     * class241_sub39_sub5_sub3.aLong10147);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     177660012);
		aClass410_2465
		    .method7431(class241_sub39_sub5_sub3, (byte) -43);
	    }
	    for (Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		     = (Class241_Sub39_Sub5_Sub3) ((Class209_Sub1) this)
						      .aClass410_2466
						      .method7440(-1397088259);
		 null != class241_sub39_sub5_sub3;
		 class241_sub39_sub5_sub3
		     = (Class241_Sub39_Sub5_Sub3) ((Class209_Sub1) this)
						      .aClass410_2466
						      .method7435((byte) -1)) {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(0, 1376186875);
		aClass241_Sub3_2470.method14625
		    (251842045416236843L
		     * class241_sub39_sub5_sub3.aLong10147);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -1034223416);
		aClass410_2479
		    .method7431(class241_sub39_sub5_sub3, (byte) -108);
	    }
	    for (int i = 0; i < 100; i++) {
		int i_34_ = aClass563_10284
				.method12389(-2129663617);
		if (i_34_ < 0)
		    throw new IOException();
		if (0 == i_34_)
		    break;
		anInt2468 = 0;
		if (null
		    == aClass241_Sub39_Sub5_Sub3_2459) {
		    int i_35_ = 5 - (aClass241_Sub3_2474
				     .pointer) * 421967667;
		    if (i_35_ > i_34_)
			i_35_ = i_34_;
		    aClass563_10284.read
			((aClass241_Sub3_2474
			  .payload),
			 (aClass241_Sub3_2474.pointer
			  * 421967667),
			 i_35_, 2108984644);
		    if (aByte2471 != 0) {
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
			    aClass241_Sub3_2474
				.payload
				[(aClass241_Sub3_2474
				  .pointer) * 421967667 + i_36_]
				^= aByte2471;
		    }
		    aClass241_Sub3_2474.pointer
			+= -681042949 * i_35_;
		    if ((aClass241_Sub3_2474.pointer
			 * 421967667)
			>= 5) {
			aClass241_Sub3_2474.pointer
			    = 0;
			int i_37_ = ((Class209_Sub1) this)
					.aClass241_Sub3_2474
					.readUnsignedByte((byte) -41);
			int i_38_ = ((Class209_Sub1) this)
					.aClass241_Sub3_2474
					.readInt((byte) 64);
			boolean bool_39_ = 0 != (i_38_ & ~0x7fffffff);
			int i_40_ = i_38_ & 0x7fffffff;
			long l = ((long) i_37_ << 32) + (long) i_40_;
			if (bool_39_) {
			    Iterator iterator = ((Class209_Sub1) this)
						    .aClass410_2479.iterator();
			    while (iterator.hasNext()) {
				Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
				    = ((Class241_Sub39_Sub5_Sub3)
				       iterator.next());
				if ((class241_sub39_sub5_sub3.aLong10147
				     * 251842045416236843L)
				    == l) {
				    ((Class209_Sub1) this)
					.aClass241_Sub39_Sub5_Sub3_2459
					= class241_sub39_sub5_sub3;
				    break;
				}
			    }
			} else {
			    Iterator iterator = ((Class209_Sub1) this)
						    .aClass410_2465.iterator();
			    while (iterator.hasNext()) {
				Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
				    = ((Class241_Sub39_Sub5_Sub3)
				       iterator.next());
				if (l == (251842045416236843L
					  * (class241_sub39_sub5_sub3
					     .aLong10147))) {
				    ((Class209_Sub1) this)
					.aClass241_Sub39_Sub5_Sub3_2459
					= class241_sub39_sub5_sub3;
				    break;
				}
			    }
			}
			if (null == (((Class209_Sub1) this)
				     .aClass241_Sub39_Sub5_Sub3_2459))
			    throw new IOException();
			anInt2467 = -507273711;
			aClass241_Sub3_2474.pointer
			    = 0;
			aClass241_Sub3_2458.pointer
			    = 0;
		    }
		} else {
		    RSByteBuffer class241_sub3
			= (((Class241_Sub39_Sub5_Sub3)
			    (((Class209_Sub1) this)
			     .aClass241_Sub39_Sub5_Sub3_2459))
			   .aClass241_Sub3_11450);
		    if (null == class241_sub3) {
			int i_41_
			    = 5 - 421967667 * (((Class209_Sub1) this)
					       .aClass241_Sub3_2458.pointer);
			if (i_41_ > i_34_)
			    i_41_ = i_34_;
			aClass563_10284.read
			    ((aClass241_Sub3_2458
			      .payload),
			     (aClass241_Sub3_2458
			      .pointer) * 421967667,
			     i_41_, 2092959247);
			if (aByte2471 != 0) {
			    for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
				aClass241_Sub3_2458
				    .payload
				    [421967667 * (((Class209_Sub1) this)
						  .aClass241_Sub3_2458
						  .pointer) + i_42_]
				    ^= aByte2471;
			}
			aClass241_Sub3_2458.pointer
			    += -681042949 * i_41_;
			if (421967667 * (((Class209_Sub1) this)
					 .aClass241_Sub3_2458.pointer)
			    >= 5) {
			    aClass241_Sub3_2458
				.pointer
				= 0;
			    int i_43_
				= ((Class209_Sub1) this)
				      .aClass241_Sub3_2458
				      .readUnsignedByte((byte) 0);
			    int i_44_
				= ((Class209_Sub1) this)
				      .aClass241_Sub3_2458
				      .readInt((byte) 120);
			    int i_45_ = 5;
			    if (0 != i_43_)
				i_45_ = 9;
			    class241_sub3
				= ((Class241_Sub39_Sub5_Sub3)
				   (((Class209_Sub1) this)
				    .aClass241_Sub39_Sub5_Sub3_2459))
				      .aClass241_Sub3_11450
				= (new RSByteBuffer
				   (i_44_ + i_45_
				    + (((Class241_Sub39_Sub5_Sub3)
					(((Class209_Sub1) this)
					 .aClass241_Sub39_Sub5_Sub3_2459))
				       .aByte11451)));
			    class241_sub3.writeByte(i_43_, 243717738);
			    class241_sub3.writeInt(i_44_, 380499009);
			    anInt2467 += -507273711;
			}
		    } else {
			int i_46_ = (class241_sub3.payload.length
				     - (((Class241_Sub39_Sub5_Sub3)
					 (((Class209_Sub1) this)
					  .aClass241_Sub39_Sub5_Sub3_2459))
					.aByte11451));
			int i_47_
			    = (512
			       - 657940149 * anInt2467);
			if (i_47_
			    > i_46_ - 421967667 * class241_sub3.pointer)
			    i_47_
				= i_46_ - class241_sub3.pointer * 421967667;
			if (i_47_ > i_34_)
			    i_47_ = i_34_;
			aClass563_10284.read
			    (class241_sub3.payload,
			     class241_sub3.pointer * 421967667, i_47_,
			     1976158556);
			if (0 != aByte2471) {
			    for (int i_48_ = 0; i_48_ < i_47_; i_48_++)
				class241_sub3.payload
				    [(421967667 * class241_sub3.pointer
				      + i_48_)]
				    ^= aByte2471;
			}
			class241_sub3.pointer += -681042949 * i_47_;
			anInt2467 += 757538717 * i_47_;
			if (i_46_ == class241_sub3.pointer * 421967667) {
			    ((Class209_Sub1) this)
				.aClass241_Sub39_Sub5_Sub3_2459
				.method16441((byte) 2);
			    ((Class241_Sub39_Sub5_Sub3)
			     (((Class209_Sub1) this)
			      .aClass241_Sub39_Sub5_Sub3_2459)).aBool10839
				= false;
			    ((Class209_Sub1) this)
				.aClass241_Sub39_Sub5_Sub3_2459
				= null;
			} else if (512 == 657940149 * (((Class209_Sub1) this)
						       .anInt2467)) {
			    anInt2467 = 0;
			    ((Class209_Sub1) this)
				.aClass241_Sub39_Sub5_Sub3_2459
				= null;
			}
		    }
		}
	    }
	    bool = true;
	} catch (IOException ioexception) {
	    try {
		aClass563_10284.close(1953246467);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass563_10284 = null;
	    anInt2472 += 783825475;
	    anInt2473 = -1754792254;
	    if (method4153(2002920713) == 0 && method4170(59664088) == 0)
		return true;
	    return false;
	}
	return bool;
    }
    
    void method4152(int i, int i_49_) {
	try {
	    aClass563_10284.close(1873842921);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass563_10284 = null;
	anInt2472 += 783825475;
	anInt2473 = 1270087521;
	aByte2471
	    = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt2478 = 254315631 * i;
	anInt2475 = 1455410379 * i_49_;
    }
    
    public void method4142(Object object, boolean bool) {
	if (null != aClass563_10284) {
	    try {
		aClass563_10284.close(1913203051);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass563_10284 = null;
	}
	aClass563_10284 = (Class563) object;
	method16587((byte) 82);
	method4146(bool, -1742384194);
	aClass241_Sub3_2474.pointer = 0;
	aClass241_Sub3_2458.pointer = 0;
	aClass241_Sub39_Sub5_Sub3_2459 = null;
	for (;;) {
	    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		= ((Class241_Sub39_Sub5_Sub3)
		   aClass410_2465.method7432(16777472));
	    if (class241_sub39_sub5_sub3 == null)
		break;
	    ((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3)
		.aClass241_Sub3_11450
		= null;
	    aClass410_2464
		.method7431(class241_sub39_sub5_sub3, (byte) -123);
	}
	for (;;) {
	    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		= ((Class241_Sub39_Sub5_Sub3)
		   aClass410_2479.method7432(16777472));
	    if (class241_sub39_sub5_sub3 == null)
		break;
	    ((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3)
		.aClass241_Sub3_11450
		= null;
	    aClass410_2466
		.method7431(class241_sub39_sub5_sub3, (byte) -72);
	}
	if (aByte2471 != 0) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(4, 303860431);
		aClass241_Sub3_2470
		    .writeByte(aByte2471, -833955726);
		aClass241_Sub3_2470
		    .writeInt(0, -1643330657);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -421034500);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1505155925);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
	anInt2468 = 0;
	aLong2469
	    = Class50.method1249((byte) 1) * -3351352901584636971L;
    }
    
    void method16588() {
	if (aClass563_10284 != null) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(6, -8824587);
		aClass241_Sub3_2470
		    .writeTriByte(3, 1991966064);
		aClass241_Sub3_2470
		    .writeShort(0, -484048531);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     914911868);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1676147053);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
    }
    
    public void method4147(Object object, boolean bool) {
	if (null != aClass563_10284) {
	    try {
		aClass563_10284.close(1953582766);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass563_10284 = null;
	}
	aClass563_10284 = (Class563) object;
	method16587((byte) 61);
	method4146(bool, -1742384194);
	aClass241_Sub3_2474.pointer = 0;
	aClass241_Sub3_2458.pointer = 0;
	aClass241_Sub39_Sub5_Sub3_2459 = null;
	for (;;) {
	    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		= ((Class241_Sub39_Sub5_Sub3)
		   aClass410_2465.method7432(16777472));
	    if (class241_sub39_sub5_sub3 == null)
		break;
	    ((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3)
		.aClass241_Sub3_11450
		= null;
	    aClass410_2464
		.method7431(class241_sub39_sub5_sub3, (byte) -102);
	}
	for (;;) {
	    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		= ((Class241_Sub39_Sub5_Sub3)
		   aClass410_2479.method7432(16777472));
	    if (class241_sub39_sub5_sub3 == null)
		break;
	    ((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3)
		.aClass241_Sub3_11450
		= null;
	    aClass410_2466
		.method7431(class241_sub39_sub5_sub3, (byte) -115);
	}
	if (aByte2471 != 0) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(4, 365333146);
		aClass241_Sub3_2470
		    .writeByte(aByte2471, -15246139);
		aClass241_Sub3_2470
		    .writeInt(0, 2119660910);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -1801443497);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1631448053);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
	anInt2468 = 0;
	aLong2469
	    = Class50.method1249((byte) 1) * -3351352901584636971L;
    }
    
    public void method4167(boolean bool) {
	if (aClass563_10284 != null) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(bool ? 2 : 3, -1233971719);
		aClass241_Sub3_2470.method14625(0L);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -709416854);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1648587930);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
    }
    
    public void method4168(boolean bool) {
	if (aClass563_10284 != null) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(bool ? 2 : 3, -147102962);
		aClass241_Sub3_2470.method14625(0L);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -1715774314);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1941712114);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
    }
    
    public void method4169() {
	if (aClass563_10284 != null) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(7, -2083753890);
		aClass241_Sub3_2470.method14625(0L);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -1269973817);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1849536645);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
    }
    
    public void method4140() {
	if (aClass563_10284 != null) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(7, -1642266652);
		aClass241_Sub3_2470.method14625(0L);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     155130118);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(2023581950);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
    }
    
    public void method4176() {
	if (aClass563_10284 != null) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(7, 1110702204);
		aClass241_Sub3_2470.method14625(0L);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -334516567);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1634153342);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
    }
    
    public void method4172() {
	if (null != aClass563_10284)
	    aClass563_10284.resetByteCounts(1834452480);
    }
    
    void method4173(int i, int i_50_) {
	try {
	    aClass563_10284.close(1790795557);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass563_10284 = null;
	anInt2472 += 783825475;
	anInt2473 = 1270087521;
	aByte2471
	    = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt2478 = 254315631 * i;
	anInt2475 = 1455410379 * i_50_;
    }
    
    void method4174(int i, int i_51_) {
	try {
	    aClass563_10284.close(1693764746);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass563_10284 = null;
	anInt2472 += 783825475;
	anInt2473 = 1270087521;
	aByte2471
	    = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt2478 = 254315631 * i;
	anInt2475 = 1455410379 * i_51_;
    }
    
    public void method4145(Object object, boolean bool, int i) {
	if (null != aClass563_10284) {
	    try {
		aClass563_10284.close(1607117068);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass563_10284 = null;
	}
	aClass563_10284 = (Class563) object;
	method16587((byte) 94);
	method4146(bool, -1742384194);
	aClass241_Sub3_2474.pointer = 0;
	aClass241_Sub3_2458.pointer = 0;
	aClass241_Sub39_Sub5_Sub3_2459 = null;
	for (;;) {
	    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		= ((Class241_Sub39_Sub5_Sub3)
		   aClass410_2465.method7432(16777472));
	    if (class241_sub39_sub5_sub3 == null)
		break;
	    ((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3)
		.aClass241_Sub3_11450
		= null;
	    aClass410_2464
		.method7431(class241_sub39_sub5_sub3, (byte) -42);
	}
	for (;;) {
	    Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		= ((Class241_Sub39_Sub5_Sub3)
		   aClass410_2479.method7432(16777472));
	    if (class241_sub39_sub5_sub3 == null)
		break;
	    ((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3)
		.aClass241_Sub3_11450
		= null;
	    aClass410_2466
		.method7431(class241_sub39_sub5_sub3, (byte) -37);
	}
	if (aByte2471 != 0) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(4, -1870660014);
		aClass241_Sub3_2470.writeByte
		    (aByte2471, -1093097380);
		aClass241_Sub3_2470
		    .writeInt(0, 499604728);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     92518383);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(2103969179);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
	anInt2468 = 0;
	aLong2469
	    = Class50.method1249((byte) 1) * -3351352901584636971L;
    }
    
    void method16589() {
	if (aClass563_10284 != null) {
	    try {
		aClass241_Sub3_2470.pointer = 0;
		aClass241_Sub3_2470
		    .writeByte(6, -1516449557);
		aClass241_Sub3_2470
		    .writeTriByte(3, -1482831172);
		aClass241_Sub3_2470
		    .writeShort(0, -484048531);
		aClass563_10284.write
		    (aClass241_Sub3_2470.payload,
		     0,
		     (aClass241_Sub3_2470
		      .payload).length,
		     -1213755048);
	    } catch (IOException ioexception) {
		try {
		    aClass563_10284
			.close(1791755819);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass563_10284 = null;
		anInt2472 += 783825475;
		anInt2473 = -1754792254;
	    }
	}
    }
    
    public void method4177() {
	if (aClass563_10284 != null)
	    aClass563_10284.close(2021279261);
    }
    
    void method4175(int i, int i_52_) {
	try {
	    aClass563_10284.close(2116491302);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass563_10284 = null;
	anInt2472 += 783825475;
	anInt2473 = 1270087521;
	aByte2471
	    = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt2478 = 254315631 * i;
	anInt2475 = 1455410379 * i_52_;
    }
    
    static void method16590(int i, boolean bool, byte i_53_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(22, (long) i);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 = -1741260507 * (bool ? 1 : 0);
    }
}
