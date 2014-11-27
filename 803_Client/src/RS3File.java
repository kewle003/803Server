/* Class408 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class RS3File {
    long aLong5914;
    RandomAccessFile aRandomAccessFile5915;
    long aLong5916;
    
    final void method7323(long l) throws IOException {
	aRandomAccessFile5915.seek(l);
	aLong5916 = 2523691259215588497L * l;
    }
    
    final void method7324(long l) throws IOException {
	aRandomAccessFile5915.seek(l);
	aLong5916 = 2523691259215588497L * l;
    }
    
    public final void write/*method7325*/(byte[] is, int i, int i_0_, byte i_1_) throws IOException {
		if ((long) i_0_ + -7940257685608098703L * aLong5916
		    > -4048362436993379387L * aLong5914) {
		    aRandomAccessFile5915
			.seek(-4048362436993379387L * aLong5914);
		    aRandomAccessFile5915.write(1);
		    throw new EOFException();
		}
		aRandomAccessFile5915.write(is, i, i_0_);
		aLong5916 += (long) i_0_ * 2523691259215588497L;
    }
    
    public RS3File(File file, String mode, long l) throws IOException {
		if (-1L == l) {
		    l = 9223372036854775807L;
		}
		if (file.length() > l) {
		    file.delete();
		}
		aRandomAccessFile5915 = new RandomAccessFile(file, mode);
		aLong5914 = l * 4940177064336192269L;
		aLong5916 = 0L;
		int i = aRandomAccessFile5915.read();
		if (-1 != i && !mode.equals("r")) {
		    aRandomAccessFile5915.seek(0L);
		    aRandomAccessFile5915.write(i);
		}
		aRandomAccessFile5915.seek(0L);
    }
    
    public final long method7326(int i) throws IOException {
	return aRandomAccessFile5915.length();
    }
    
    public final int method7327(byte[] is, int i, int i_2_, byte i_3_)
	throws IOException {
	int i_4_ = aRandomAccessFile5915.read(is, i, i_2_);
	if (i_4_ > 0)
	    aLong5916 += (long) i_4_ * 2523691259215588497L;
	return i_4_;
    }
    
    public void finalize() throws Throwable {
	if (null != aRandomAccessFile5915) {
	    System.out.println("");
	    close((byte) 51);
	}
    }
    
    public final void close/*method7328*/(byte i) throws IOException {
		if (aRandomAccessFile5915 != null) {
		    aRandomAccessFile5915.close();
		    aRandomAccessFile5915 = null;
		}
    }
    
    void method7329() throws Throwable {
	if (null != aRandomAccessFile5915) {
	    System.out.println("");
	    close((byte) 28);
	}
    }
    
    void method7330() throws Throwable {
	if (null != aRandomAccessFile5915) {
	    System.out.println("");
	    close((byte) 109);
	}
    }
    
    void method7331() throws Throwable {
	if (null != aRandomAccessFile5915) {
	    System.out.println("");
	    close((byte) 71);
	}
    }
    
    final void method7332(long l) throws IOException {
	aRandomAccessFile5915.seek(l);
	aLong5916 = 2523691259215588497L * l;
    }
    
    public final void method7333(byte[] is, int i, int i_5_)
	throws IOException {
	if ((long) i_5_ + -7940257685608098703L * aLong5916
	    > -4048362436993379387L * aLong5914) {
	    aRandomAccessFile5915
		.seek(-4048362436993379387L * aLong5914);
	    aRandomAccessFile5915.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile5915.write(is, i, i_5_);
	aLong5916 += (long) i_5_ * 2523691259215588497L;
    }
    
    void method7334() throws Throwable {
	if (null != aRandomAccessFile5915) {
	    System.out.println("");
	    close((byte) 113);
	}
    }
    
    final void method7335(long l) throws IOException {
	aRandomAccessFile5915.seek(l);
	aLong5916 = 2523691259215588497L * l;
    }
    
    public final void method7336(byte[] is, int i, int i_6_)
	throws IOException {
	if ((long) i_6_ + -7940257685608098703L * aLong5916
	    > -4048362436993379387L * aLong5914) {
	    aRandomAccessFile5915
		.seek(-4048362436993379387L * aLong5914);
	    aRandomAccessFile5915.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile5915.write(is, i, i_6_);
	aLong5916 += (long) i_6_ * 2523691259215588497L;
    }
    
    final void method7337(long l) throws IOException {
	aRandomAccessFile5915.seek(l);
	aLong5916 = 2523691259215588497L * l;
    }
    
    public final void method7338() throws IOException {
	if (aRandomAccessFile5915 != null) {
	    aRandomAccessFile5915.close();
	    aRandomAccessFile5915 = null;
	}
    }
    
    public final long method7339() throws IOException {
	return aRandomAccessFile5915.length();
    }
    
    public final int method7340(byte[] is, int i, int i_7_)
	throws IOException {
	int i_8_ = aRandomAccessFile5915.read(is, i, i_7_);
	if (i_8_ > 0)
	    aLong5916 += (long) i_8_ * 2523691259215588497L;
	return i_8_;
    }
    
    static final void method7341(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	class58.anInt939
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * 1397007981);
    }
    
    static final void method7342(int i) {
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870
		.method14352((byte) -2)
	    == 2) {
	    byte[][][] is = client.aClass238_8477.method4785(-1218485036);
	    byte i_9_ = (byte) (client.anInt8407 * 485246749 - 4 & 0xff);
	    int i_10_ = (485246749 * client.anInt8407
			 % client.aClass238_8477.method4744(-1928116772));
	    for (int i_11_ = 0; i_11_ < 4; i_11_++) {
		for (int i_12_ = 0;
		     i_12_ < client.aClass238_8477.method4745(1732729366);
		     i_12_++)
		    is[i_11_][i_10_][i_12_] = i_9_;
	    }
	    if (993680393 * Class357_Sub1.anInt10357 != 3) {
		for (int i_13_ = 0; i_13_ < 2; i_13_++) {
		    client.anIntArray8423[i_13_] = -1000000;
		    client.anIntArray8424[i_13_] = 1000000;
		    client.anIntArray8425[i_13_] = 0;
		    client.anIntArray8427[i_13_] = 1000000;
		    client.anIntArray8529[i_13_] = 0;
		}
		Class287 class287
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386);
		Class215 class215
		    = client.aClass238_8477.method4753((byte) -20);
		Class552 class552
		    = client.aClass238_8477.method4751(-1996970837);
		if (3 == 115241065 * Class296.anInt4513
		    || 4 == 115241065 * Class296.anInt4513
		    || -1 != 1163043607 * Class245.anInt3961) {
		    GameScene class522
			= client.aClass238_8477.method4806((byte) 1);
		    int i_14_;
		    int i_15_;
		    if (115241065 * Class296.anInt4513 == 4) {
			Class287 class287_16_
			    = Class445_Sub16.aClass351_Sub1_8660.method6284
				  ((byte) 1).method7767((byte) 91);
			if (Float.isNaN(class287_16_.aFloat4477))
			    return;
			i_14_ = ((int) class287_16_.aFloat4477
				 - (127679513 * class522.baseX << 9));
			i_15_ = ((int) class287_16_.aFloat4479
				 - (468558693 * class522.baseY << 9));
			if (i_14_ < 0 || i_15_ < 0
			    || (i_14_ >> 9
				>= (class215.heightmapData
				    [(993680393
				      * Class357_Sub1.anInt10357)]).length)
			    || (i_15_ >> 9
				>= (class215.heightmapData
				    [Class357_Sub1.anInt10357 * 993680393]
				    [i_14_ >> 9]).length))
			    return;
		    } else if (115241065 * Class296.anInt4513 == 3) {
			i_14_ = (int) class287.aFloat4477;
			i_15_ = (int) class287.aFloat4479;
		    } else {
			i_14_ = 1163043607 * Class245.anInt3961;
			i_15_ = Class254.anInt4134 * -703473271;
		    }
		    if (((class215.heightmapData
			  [Class357_Sub1.anInt10357 * 993680393][i_14_ >> 9]
			  [i_15_ >> 9])
			 & 0x4)
			!= 0)
			Class569.method12485((class552
					      .aClass548ArrayArrayArray7169),
					     0, i_14_ >> 9, i_15_ >> 9, false,
					     -1059931813);
		    else {
			int i_17_;
			int i_18_;
			if (4 == 115241065 * Class296.anInt4513) {
			    Class287 class287_19_
				= Class445_Sub16.aClass351_Sub1_8660.method6283
				      (2086450049).method6867(-1982081827);
			    i_17_ = (((int) class287_19_.aFloat4477 >> 9)
				     - class522.baseX * 127679513);
			    i_18_ = (((int) class287_19_.aFloat4479 >> 9)
				     - class522.baseY * 468558693);
			    if (i_17_ < 0 || i_18_ < 0
				|| (i_17_
				    >= (class215.heightmapData
					[(993680393
					  * Class357_Sub1.anInt10357)]).length)
				|| (i_18_
				    >= (class215.heightmapData
					[993680393 * Class357_Sub1.anInt10357]
					[i_17_]).length))
				return;
			} else {
			    i_17_ = 133333741 * Class462.anInt6284 >> 9;
			    i_18_ = Class636.anInt8248 * -271636831 >> 9;
			}
			int i_20_ = i_14_ >> 9;
			int i_21_ = i_15_ >> 9;
			if (class215.method4334(i_17_, i_18_, -1994651959)) {
			    int i_22_ = (Class96_Sub5.method16046
					 (133333741 * Class462.anInt6284,
					  Class636.anInt8248 * -271636831, 3,
					  399660685));
			    if (-781800491 * Class175.anInt2123 >= i_22_)
				Class569.method12485
				    (class552.aClass548ArrayArrayArray7169, 1,
				     i_17_, i_18_, false, 221240698);
			} else {
			while_57_:
			    do {
				if (Class496.anInt6527 * -1323229803 < 2560) {
				    int i_23_;
				    if (i_20_ > i_17_)
					i_23_ = i_20_ - i_17_;
				    else
					i_23_ = i_17_ - i_20_;
				    int i_24_;
				    if (i_21_ > i_18_)
					i_24_ = i_21_ - i_18_;
				    else
					i_24_ = i_18_ - i_21_;
				    if (0 == i_23_ && i_24_ == 0
					|| (i_23_
					    <= -client.aClass238_8477
						    .method4744(-1403452066))
					|| (i_23_
					    >= client.aClass238_8477
						   .method4744(-2022312558))
					|| (i_24_
					    <= -client.aClass238_8477
						    .method4745(2056732470))
					|| (i_24_
					    >= client.aClass238_8477
						   .method4745(1828663954))) {
					if (4
					    != 115241065 * Class296.anInt4513)
					    VarType.method3770
						(new StringBuilder().append
						     (i_17_).append
						     (Class6.aString30).append
						     (i_18_).append
						     (" ").append
						     (i_20_).append
						     (Class6.aString30).append
						     (i_21_).append
						     (" ").append
						     (127679513
						      * class522.baseX)
						     .append
						     (Class6.aString30).append
						     (468558693
						      * class522.baseY)
						     .toString(),
						 new RuntimeException(),
						 -463128219);
					break;
				    }
				    if (i_23_ > i_24_) {
					int i_25_ = 65536 * i_24_ / i_23_;
					int i_26_ = 32768;
				    while_56_:
					do {
					    for (;;) {
						if (i_20_ == i_17_)
						    break while_56_;
						if (i_17_ < i_20_)
						    i_17_++;
						else if (i_17_ > i_20_)
						    i_17_--;
						if (((class215
						      .heightmapData
						      [((Class357_Sub1
							 .anInt10357)
							* 993680393)]
						      [i_17_][i_18_])
						     & 0x4)
						    != 0) {
						    Class569.method12485
							((class552
							  .aClass548ArrayArrayArray7169),
							 1, i_17_, i_18_,
							 false, 197411423);
						    break while_56_;
						}
						if ((i_18_ + 1
						     < (class215
							.heightmapData
							[((Class357_Sub1
							   .anInt10357)
							  * 993680393)]
							[i_17_]).length)
						    && ((class215
							 .heightmapData
							 [((Class357_Sub1
							    .anInt10357)
							   * 993680393)]
							 [i_17_][i_18_ + 1])
							& 0x4) != 0) {
						    Class569.method12485
							((class552
							  .aClass548ArrayArrayArray7169),
							 1, i_17_, i_18_ + 1,
							 false, -1264701884);
						    break while_56_;
						}
						if (i_18_ > 0
						    && ((class215
							 .heightmapData
							 [(993680393
							   * (Class357_Sub1
							      .anInt10357))]
							 [i_17_][i_18_ - 1])
							& 0x4) != 0) {
						    Class569.method12485
							((class552
							  .aClass548ArrayArrayArray7169),
							 1, i_17_, i_18_ - 1,
							 false, -1063477730);
						    break while_56_;
						}
						i_26_ += i_25_;
						if (i_26_ >= 65536) {
						    i_26_ -= 65536;
						    if (i_18_ < i_21_) {
							if ((++i_18_ + 1
							     < (class215
								.heightmapData
								[((Class357_Sub1
								   .anInt10357)
								  * 993680393)]
								[i_17_]).length)
							    && (0
								!= ((class215
								     .heightmapData
								     [(993680393
								       * (Class357_Sub1
									  .anInt10357))]
								     [i_17_]
								     [1 + i_18_])
								    & 0x4))) {
							    Class569
								.method12485
								((class552
								  .aClass548ArrayArrayArray7169),
								 1, i_17_,
								 1 + i_18_,
								 false,
								 232714827);
							    break while_56_;
							}
						    } else if (i_18_ > i_21_
							       && --i_18_ > 0
							       && (0
								   != ((class215
									.heightmapData
									[(993680393
									  * Class357_Sub1.anInt10357)]
									[i_17_]
									[(i_18_
									  - 1)])
								       & 0x4)))
							break;
						}
					    }
					    Class569.method12485
						((class552
						  .aClass548ArrayArrayArray7169),
						 1, i_17_, i_18_ - 1, false,
						 -174917168);
					} while (false);
				    } else {
					int i_27_ = 65536 * i_23_ / i_24_;
					int i_28_ = 32768;
					for (;;) {
					    if (i_18_ == i_21_)
						break while_57_;
					    if (i_18_ < i_21_)
						i_18_++;
					    else if (i_18_ > i_21_)
						i_18_--;
					    if (((class215
						  .heightmapData
						  [993680393 * (Class357_Sub1
								.anInt10357)]
						  [i_17_][i_18_])
						 & 0x4)
						!= 0) {
						Class569.method12485
						    ((class552
						      .aClass548ArrayArrayArray7169),
						     1, i_17_, i_18_, false,
						     -1452930202);
						break while_57_;
					    }
					    if ((1 + i_17_
						 < (class215
						    .heightmapData
						    [(993680393
						      * (Class357_Sub1
							 .anInt10357))]).length)
						&& ((class215
						     .heightmapData
						     [(993680393
						       * (Class357_Sub1
							  .anInt10357))]
						     [i_17_ + 1][i_18_])
						    & 0x4) != 0) {
						Class569.method12485
						    ((class552
						      .aClass548ArrayArrayArray7169),
						     1, i_17_ + 1, i_18_,
						     false, -488799317);
						break while_57_;
					    }
					    if (i_17_ > 0
						&& ((class215
						     .heightmapData
						     [(Class357_Sub1.anInt10357
						       * 993680393)]
						     [i_17_ - 1][i_18_])
						    & 0x4) != 0) {
						Class569.method12485
						    ((class552
						      .aClass548ArrayArrayArray7169),
						     1, i_17_ - 1, i_18_,
						     false, 217102265);
						break while_57_;
					    }
					    i_28_ += i_27_;
					    if (i_28_ >= 65536) {
						i_28_ -= 65536;
						if (i_17_ < i_20_) {
						    if ((++i_17_ + 1
							 < (class215
							    .heightmapData
							    [(993680393
							      * (Class357_Sub1
								 .anInt10357))]).length)
							&& (0
							    != ((class215
								 .heightmapData
								 [((Class357_Sub1
								    .anInt10357)
								   * 993680393)]
								 [1 + i_17_]
								 [i_18_])
								& 0x4))) {
							Class569.method12485
							    ((class552
							      .aClass548ArrayArrayArray7169),
							     1, 1 + i_17_,
							     i_18_, false,
							     -630280489);
							break while_57_;
						    }
						} else if (i_17_ > i_20_
							   && --i_17_ > 0
							   && (0
							       != ((class215
								    .heightmapData
								    [((Class357_Sub1
								       .anInt10357)
								      * 993680393)]
								    [i_17_ - 1]
								    [i_18_])
								   & 0x4)))
						    break;
					    }
					}
					Class569.method12485
					    ((class552
					      .aClass548ArrayArrayArray7169),
					     1, i_17_ - 1, i_18_, false,
					     -1722611514);
				    }
				}
			    } while (false);
			}
		    }
		} else {
		    int i_29_
			= (Class96_Sub5.method16046
			   (133333741 * Class462.anInt6284,
			    -271636831 * Class636.anInt8248,
			    993680393 * Class357_Sub1.anInt10357, 1348838607));
		    if (i_29_ - -781800491 * Class175.anInt2123 < 3200
			&& ((class215.heightmapData
			     [Class357_Sub1.anInt10357 * 993680393]
			     [133333741 * Class462.anInt6284 >> 9]
			     [-271636831 * Class636.anInt8248 >> 9])
			    & 0x4) != 0)
			Class569.method12485
			    (class552.aClass548ArrayArrayArray7169, 1,
			     Class462.anInt6284 * 133333741 >> 9,
			     Class636.anInt8248 * -271636831 >> 9, false,
			     -2112680038);
		}
	    }
	}
    }
}
