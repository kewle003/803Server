import java.util.Arrays;

/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.js5;
public final class JS5 {
    boolean aBool2481;
    Object[] anObjectArray2482;
    ReferenceTable referenceTable = null;//aClass286_2483
    static final int anInt2484 = 1;
    static final int anInt2485 = 0;
    Object[][] anObjectArrayArray2486;
    public static final int anInt2487 = 1;
    static Class606 aClass606_2488 = new Class606();
    public static final int anInt2489 = 2;
    Class279 aClass279_2490;
    static boolean aBool2491 = false;
    static int anInt2492 = 0;
    static final int anInt2493 = 0;
    int anInt2494;
    public static ItemDefinitionLoader itemDefLoader;//aClass618_2495
    
    public synchronized int method4179() {
	if (!method4180(-108709767))
	    return 0;
	int i = 0;
	int i_0_ = 0;
	for (int i_1_ = 0; i_1_ < anObjectArray2482.length;
	     i_1_++) {
	    if ((((ReferenceTable) referenceTable).entryChildCounts
		 [i_1_])
		> 0) {
		i += 100;
		i_0_ += method4192(i_1_, -417121787);
	    }
	}
	if (0 == i)
	    return 100;
	int i_2_ = 100 * i_0_ / i;
	return i_2_;
    }
    
    synchronized boolean method4180(int i) {
		if (null == referenceTable) {
			referenceTable = aClass279_2490.method5458(-2064113656);
			if (null == referenceTable) {
				return false;
			}
			anObjectArray2482 = new Object[-546788063 * (((ReferenceTable) referenceTable).indexCount)];
			anObjectArrayArray2486 = new Object[-546788063 * (((ReferenceTable) referenceTable).indexCount)][];
		}
		return true;
    }
    
    public int method4181() {
	if (!method4180(-108709767))
	    throw new IllegalStateException("");
	return (-1738285289
		* ((ReferenceTable) referenceTable).anInt4456);
    }
    
    synchronized boolean method4182(int i) {
	if (!method4180(-108709767))
	    return false;
	if (i < 0
	    || i >= (((ReferenceTable) referenceTable)
		     .entryChildIndexCount).length
	    || (((ReferenceTable) referenceTable).entryChildIndexCount[i]
		== 0)) {
	    if (aBool2491)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    public synchronized boolean method4183/*method4183*/(int i, int i_3_, int i_4_) {
		if (!method4180(-108709767)) {
			return false;
		}
		if (i < 0 || i_3_ < 0
			|| i >= (((ReferenceTable) referenceTable).entryChildIndexCount).length
			|| i_3_ >= (((ReferenceTable) referenceTable).entryChildIndexCount[i])) {
			if (aBool2491) {
				throw new IllegalArgumentException(new StringBuilder().append(i)
						.append(" ").append(i_3_).toString());
			}
			return false;
		}
		return true;
    }
    
    synchronized void method4184(int i, int i_5_) {
		if (aBool2481) {
		    anObjectArray2482[i] = aClass279_2490.method5457(i, 1215367460);
		} else {
		    anObjectArray2482[i] = ChatLine.method17107(aClass279_2490.method5457(i, 1680838039), false, -692093866);
		}
    }
    
    public int method4185(int i) {
	if (!method4237(i, 1736754263))
	    return 0;
	return ((ReferenceTable) referenceTable).entryChildIndexCount[i];
    }
    
    public byte[] getfile/*method4186*/(int archiveID, int entryID, int i_7_) {
    	return method4187(archiveID, entryID, null, 1936260285);
    }
    
    public synchronized byte[] method4187(int archiveID, int entryID, int[] is, int i_9_) {
		if (!method4183(archiveID, entryID, -851133587)) {
		    return null;
		}
		byte[] is_10_ = null;
		if (null == anObjectArrayArray2486[archiveID]
				|| null == anObjectArrayArray2486[archiveID][entryID]) {
		    boolean bool = unpackContainer(archiveID, entryID, is, -30758129);
		    if (!bool) {
				method4184(archiveID, 1608332179);
				bool = unpackContainer(archiveID, entryID, is, -2084971840);
				if (!bool) {
				    return null;
				}
		    }
		}
		if (null == anObjectArrayArray2486[archiveID]) {
		    throw new RuntimeException("");
		}
		if (null != anObjectArrayArray2486[archiveID][entryID]) {
		    is_10_ = Class445.method7894(anObjectArrayArray2486[archiveID][entryID], false, -284932600);
		    if (null == is_10_) {
		    	throw new RuntimeException("");
		    }
		}
		if (null != is_10_) {
		    if (1 == anInt2494 * 21593439) {
				anObjectArrayArray2486[archiveID][entryID] = null;
				if (1 == referenceTable.entryChildIndexCount[archiveID]) {
				    anObjectArrayArray2486[archiveID] = null;
				}
		    } else if (21593439 * anInt2494 == 2) {
		    	anObjectArrayArray2486[archiveID] = null;
		    }
		}
		return is_10_;
    }
    
    public synchronized boolean method4188(int i, int i_11_, int i_12_) {
	if (!method4183(i, i_11_, -948014018))
	    return false;
	if (anObjectArrayArray2486[i] != null
	    && null != anObjectArrayArray2486[i][i_11_])
	    return true;
	if (null != anObjectArray2482[i])
	    return true;
	method4184(i, 1652098047);
	if (null != anObjectArray2482[i])
	    return true;
	return false;
    }
    
    public int method4189(int i) {
	if (!method4237(i, 1736754263))
	    return 0;
	return ((ReferenceTable) referenceTable).entryChildIndexCount[i];
    }
    
    public synchronized boolean containerExists/*method4190*/(int i, int i_13_) {
		if (!method4237(i, 1736754263)) {
		    return false;
		}
		if (anObjectArray2482[i] != null) {
		    return true;
		}
		method4184(i, 1198508647);
		if (null != anObjectArray2482[i]) {
		    return true;
		}
		return false;
    }
    
    public synchronized boolean method4191(byte i) {
	if (!method4180(-108709767))
	    return false;
	boolean bool = true;
	for (int i_14_ = 0;
	     i_14_ < (((ReferenceTable) referenceTable)
		      .entryIndicies).length;
	     i_14_++) {
	    int i_15_ = (((ReferenceTable) referenceTable)
			 .entryIndicies[i_14_]);
	    if (null == anObjectArray2482[i_15_]) {
		method4184(i_15_, -815953028);
		if (null == anObjectArray2482[i_15_])
		    bool = false;
	    }
	}
	return bool;
    }
    
    synchronized int method4192(int i, int i_16_) {
	if (!method4237(i, 1736754263))
	    return 0;
	if (anObjectArray2482[i] != null)
	    return 100;
	return aClass279_2490.method5459(i, (short) 15268);
    }
    
    public synchronized int method4193(int i) {
	if (!method4180(-108709767))
	    return 0;
	int i_17_ = 0;
	int i_18_ = 0;
	for (int i_19_ = 0; i_19_ < anObjectArray2482.length;
	     i_19_++) {
	    if ((((ReferenceTable) referenceTable).entryChildCounts
		 [i_19_])
		> 0) {
		i_17_ += 100;
		i_18_ += method4192(i_19_, -417121787);
	    }
	}
	if (0 == i_17_)
	    return 100;
	int i_20_ = 100 * i_18_ / i_17_;
	return i_20_;
    }
    
    public synchronized byte[] method4194(int i, int i_21_) {
		if (!method4180(-108709767)) {
		    return null;
		}
		if (1 == (((ReferenceTable) referenceTable).entryChildIndexCount).length) {
		    return getfile(0, i, -848719498);
		}
		if (!method4237(i, 1736754263)) {
		    return null;
		}
		if (1 == ((ReferenceTable) referenceTable).entryChildIndexCount[i]) {
		    return getfile(i, 0, -124605185);
		}
		throw new RuntimeException();
    }
    
    public int method4195(byte i) {
		if (!method4180(-108709767))
		    throw new IllegalStateException("");
		return (-1738285289 * ((ReferenceTable) referenceTable).anInt4456);
    }
    
    public synchronized boolean method4196(int i, int i_22_) {
	if (!method4180(-108709767))
	    return false;
	if (i < 0 || i_22_ < 0
	    || i >= (((ReferenceTable) referenceTable)
		     .entryChildIndexCount).length
	    || i_22_ >= (((ReferenceTable) referenceTable)
			 .entryChildIndexCount[i])) {
	    if (aBool2491)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_22_).toString());
	    return false;
	}
	return true;
    }
    
    public int getContainerCount/*method4197*/(int i, byte i_23_) {
		if (!method4237(i, 1736754263))
		    return 0;
		return referenceTable.entryChildIndexCount[i];
    }
    
    public int getFileCount/*method4198*/(byte i) {
		if (!method4180(-108709767)) {
		    return -1;
		}
		return referenceTable.entryChildIndexCount.length;
    }
    
    public synchronized void method4199(int i, byte i_24_) {
	if (method4237(i, 1736754263)) {
	    if (null != anObjectArrayArray2486)
		anObjectArrayArray2486[i] = null;
	}
    }
    
    public boolean method4200(String string, String string_25_) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	string_25_ = string_25_.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -2050784986), (byte) 5));
	if (i < 0)
	    return false;
	int i_26_ = (((ReferenceTable) referenceTable)
			 .childIdentifiers[i].getIndex
		     (Class494.convertStringIdentifier(string_25_, -903903714), (byte) 5));
	if (i_26_ < 0)
	    return false;
	return true;
    }
    
    synchronized boolean unpackContainer/*method4201*/(int containerID, int entryID, int[] is, int i_28_) {
		if (!method4237(containerID, 1736754263))
		    return false;
		if (null == anObjectArray2482[containerID])
		    return false;
		int size = ((ReferenceTable) referenceTable).entryChildCounts[containerID];
		int[] is_30_ = (((ReferenceTable) referenceTable).entryChildIndices[containerID]);
		if (anObjectArrayArray2486[containerID] == null) {
		    anObjectArrayArray2486[containerID] = new Object[referenceTable.entryChildIndexCount[containerID]];
		}
		Object[] objects = anObjectArrayArray2486[containerID];
		boolean bool = true;
		for (int i_31_ = 0; i_31_ < size; i_31_++) {
		    int i_32_;
		    if (null == is_30_)
			i_32_ = i_31_;
		    else
			i_32_ = is_30_[i_31_];
		    if (null == objects[i_32_]) {
			bool = false;
			break;
		    }
		}
		if (bool)
		    return true;
		byte[] is_33_;
		if (null != is && (0 != is[0] || 0 != is[1] || 0 != is[2] || is[3] != 0)) {
		    is_33_ = Class445.method7894(anObjectArray2482[containerID], true, -284932600);
		    RSByteBuffer class241_sub3 = new RSByteBuffer(is_33_);
		    int i_34_ = class241_sub3.readUnsignedByte((byte) -3);
		    int i_35_ = class241_sub3.readInt((byte) 126);
		    int i_36_ = (i_34_ == 0 ? 5 : 9) + i_35_;
		    class241_sub3.method14666(is, 5, i_36_, 1045381640);
		} else
		    is_33_
			= Class445.method7894(anObjectArray2482[containerID],
					      false, -284932600);
		byte[] data;
		try {
			data = GPI.method4022(is_33_, 1881317228);
		} catch (RuntimeException runtimeexception) {
		    throw Class474.method10871
			      (runtimeexception,
			       new StringBuilder().append(is != null).append(" ")
				   .append
				   (containerID).append
				   (" ").append
				   (is_33_.length).append
				   (" ").append
				   (Class238.method4880(is_33_, is_33_.length,
							722114365))
				   .append
				   (" ").append
				   (Class238.method4880(is_33_, is_33_.length - 2,
							-2049615255))
				   .append
				   (" ").append
				   (((ReferenceTable) referenceTable)
				    .entryCrcs[containerID])
				   .append
				   (" ").append
				   (-1738285289
				    * (((ReferenceTable) referenceTable)
				       .anInt4456))
				   .toString());
		}
		if (aBool2481)
		    anObjectArray2482[containerID] = null;
		if (size > 1) {
		    if (2 != 21593439 * anInt2494) {
				int i_38_ = data.length;
				int chunks = data[--i_38_] & 0xff;
				i_38_ -= chunks * size * 4;
				RSByteBuffer buffer = new RSByteBuffer(data);
				int[] sizes = new int[size];
				buffer.pointer = i_38_ * -681042949;
				for (int chunk = 0; chunk < chunks; chunk++) {
				    int chunkSize = 0;
				    for (int id = 0; id < size; id++) {
				    	chunkSize += buffer.readInt((byte) 78);
						sizes[id] += chunkSize;
				    }
				}
				byte[][] entries = new byte[size][];
				for (int id = 0; id < size; id++) {
					entries[id] = new byte[sizes[id]];
				    sizes[id] = 0;
				}
				buffer.pointer = -681042949 * i_38_;
				int i_46_ = 0;
				for (int chunk = 0; chunk < chunks; chunk++) {
				    int i_48_ = 0;
				    for (int id = 0; id < size; id++) {
						i_48_ += buffer.readInt((byte) 18);
						System.arraycopy(data, i_46_, entries[id], sizes[id], i_48_);
						sizes[id] += i_48_;
						i_46_ += i_48_;
				    }
				}
				for (int id = 0; id < size; id++) {
				    int i_51_;
				    if (null == is_30_)
				    	i_51_ = id;
				    else
				    	i_51_ = is_30_[id];
				    if (0 == anInt2494 * 21593439)
				    	objects[i_51_] = ChatLine.method17107(entries[id],
									      false,
									      -2022811604);
				    else
				    	objects[i_51_] = entries[id];
				}
		    } else {
				int i_52_ = data.length;
				int i_53_ = data[--i_52_] & 0xff;
				i_52_ -= i_53_ * size * 4;
				RSByteBuffer buffer = new RSByteBuffer(data);
				int i_54_ = 0;
				int i_55_ = 0;
				buffer.pointer = i_52_ * -681042949;
				for (int i_56_ = 0; i_56_ < i_53_; i_56_++) {
				    int i_57_ = 0;
				    for (int i_58_ = 0; i_58_ < size; i_58_++) {
						i_57_ += buffer.readInt((byte) 39);
						int i_59_;
						if (null == is_30_) {
						    i_59_ = i_58_;
						} else {
						    i_59_ = is_30_[i_58_];
						}
						if (entryID == i_59_) {
						    i_54_ += i_57_;
						    i_55_ = i_59_;
						}
				    }
				}
				if (i_54_ == 0)
				    return true;
				byte[] is_60_ = new byte[i_54_];
				i_54_ = 0;
				buffer.pointer = i_52_ * -681042949;
				int i_61_ = 0;
				for (int i_62_ = 0; i_62_ < i_53_; i_62_++) {
				    int i_63_ = 0;
				    for (int i_64_ = 0; i_64_ < size; i_64_++) {
					i_63_ += buffer.readInt((byte) 24);
					int i_65_;
					if (null == is_30_)
					    i_65_ = i_64_;
					else
					    i_65_ = is_30_[i_64_];
					if (i_65_ == entryID) {
					    System.arraycopy(data, i_61_, is_60_, i_54_,
							     i_63_);
					    i_54_ += i_63_;
					}
					i_61_ += i_63_;
				    }
				}
				objects[i_55_] = is_60_;
		    }
		} else {
		    int i_66_;
		    if (null == is_30_)
			i_66_ = 0;
		    else
			i_66_ = is_30_[0];
		    if (0 == anInt2494 * 21593439)
			objects[i_66_] = ChatLine.method17107(data, false,
									 -1749047174);
		    else
			objects[i_66_] = data;
		}
		return true;
    }
    
    public int identifierToIndex/*method4202*/(String identifier, int i) {
		if (!method4180(-108709767)) {
		    return -1;
		}
		identifier = identifier.toLowerCase();
		int index = (((ReferenceTable) referenceTable).identifiers.getIndex(
				Class494.convertStringIdentifier(identifier, -1804229851), (byte) 5));
		if (!method4237(index, 1736754263)) {
		    return -1;
		}
		return index;
    }
    
    public int method4203(int i, int i_68_) {
	if (!method4180(-108709767))
	    return -1;
	int i_69_ = ((ReferenceTable) referenceTable)
			.identifiers.getIndex(i, (byte) 5);
	if (!method4237(i_69_, 1736754263))
	    return -1;
	return i_69_;
    }
    
    public boolean method4204(String string, int i) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	int i_70_ = (((ReferenceTable) referenceTable)
			 .identifiers.getIndex
		     (Class494.convertStringIdentifier(string, -1024344037), (byte) 5));
	if (i_70_ < 0)
	    return false;
	return true;
    }
    
    public boolean method4205(String string, String string_71_, byte i) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	string_71_ = string_71_.toLowerCase();
	int i_72_ = (((ReferenceTable) referenceTable)
			 .identifiers.getIndex
		     (Class494.convertStringIdentifier(string, -1311943828), (byte) 5));
	if (i_72_ < 0)
	    return false;
	int i_73_
	    = (((ReferenceTable) referenceTable)
		   .childIdentifiers[i_72_].getIndex
	       (Class494.convertStringIdentifier(string_71_, -1522352499), (byte) 5));
	if (i_73_ < 0)
	    return false;
	return true;
    }
    
    public synchronized byte[] readContainerByIndentifiers/*method4206*/(
    		String containerIdentifier, String childIdentifier,  int i) {
		if (!method4180(-108709767)) {
		    return null;
		}
		containerIdentifier = containerIdentifier.toLowerCase();
		childIdentifier = childIdentifier.toLowerCase();
		int containerID = referenceTable.identifiers.getIndex(
				Class494.convertStringIdentifier(containerIdentifier, -1166756010), (byte) 5);
		if (!method4237(containerID, 1736754263)) {
		    return null;
		}
		int childID = referenceTable.childIdentifiers[containerID].getIndex(
				Class494.convertStringIdentifier(childIdentifier, -668107067), (byte) 5);
		return getfile(containerID, childID, 1702077038);
    }
    
    boolean method4207(String string, String string_77_, int i) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	string_77_ = string_77_.toLowerCase();
	int i_78_ = (((ReferenceTable) referenceTable)
			 .identifiers.getIndex
		     (Class494.convertStringIdentifier(string, -1446183968), (byte) 5));
	if (!method4237(i_78_, 1736754263))
	    return false;
	int i_79_ = (((ReferenceTable) referenceTable)
			 .childIdentifiers[i_78_].getIndex
		     (Class494.convertStringIdentifier(string_77_, -674761561), (byte) 5));
	return method4188(i_78_, i_79_, -2144411945);
    }
    
    public int method4208() {
	if (!method4180(-108709767))
	    throw new IllegalStateException("");
	return (-1738285289
		* ((ReferenceTable) referenceTable).anInt4456);
    }
    
    synchronized boolean method4209(int i) {
	if (!method4180(-108709767))
	    return false;
	if (i < 0
	    || i >= (((ReferenceTable) referenceTable)
		     .entryChildIndexCount).length
	    || (((ReferenceTable) referenceTable).entryChildIndexCount[i]
		== 0)) {
	    if (aBool2491)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    public int method4210(String string, int i) {
	if (!method4180(-108709767))
	    return 0;
	string = string.toLowerCase();
	int i_80_ = (((ReferenceTable) referenceTable)
			 .identifiers.getIndex
		     (Class494.convertStringIdentifier(string, -1114911296), (byte) 5));
	return method4192(i_80_, -417121787);
    }
    
    public int method4211(int i) {
	if (!method4237(i, 1736754263))
	    return 0;
	return ((ReferenceTable) referenceTable).entryChildIndexCount[i];
    }
    
    synchronized boolean method4212() {
	if (null == referenceTable) {
	    referenceTable
		= aClass279_2490.method5458(-2064113656);
	    if (null == referenceTable)
		return false;
	    anObjectArray2482
		= (new Object
		   [-546788063 * (((ReferenceTable) referenceTable)
				  .indexCount)]);
	    anObjectArrayArray2486
		= (new Object
		   [-546788063 * (((ReferenceTable) referenceTable)
				  .indexCount)]
		   []);
	}
	return true;
    }
    
    public int method4213() {
	if (!method4180(-108709767))
	    throw new IllegalStateException("");
	return (-1738285289
		* ((ReferenceTable) referenceTable).anInt4456);
    }
    
    public int method4214() {
	if (!method4180(-108709767))
	    throw new IllegalStateException("");
	return (-1738285289
		* ((ReferenceTable) referenceTable).anInt4456);
    }
    
    public synchronized boolean method4215(int i) {
	if (!method4180(-108709767))
	    return false;
	if (1 == (((ReferenceTable) referenceTable)
		  .entryChildIndexCount).length)
	    return method4188(0, i, -1077698173);
	if (!method4237(i, 1736754263))
	    return false;
	if (((ReferenceTable) referenceTable).entryChildIndexCount[i]
	    == 1)
	    return method4188(i, 0, -1793601022);
	throw new RuntimeException();
    }
    
    public synchronized int[] getChildIndicies/*method4216*/(int fileID, byte i_81_) {
		if (!method4237(fileID, 1736754263)) {
		    return null;
		}
		int[] indicies = (((ReferenceTable) referenceTable).entryChildIndices[fileID]);
		if (null == indicies) {
			indicies = new int[(((ReferenceTable) referenceTable).entryChildCounts[fileID])];
		    for (int index = 0; index < indicies.length; index++) {
		    	indicies[index] = index;
		    }
		}
		return indicies;
    }
    
    public void method4217(boolean bool, boolean bool_83_, int i) {
		if (method4180(-108709767)) {
		    if (bool) {
				((ReferenceTable) referenceTable).entryIdentifiers = null;
				((ReferenceTable) referenceTable).identifiers = null;
		    }
		    if (bool_83_) {
				((ReferenceTable) referenceTable).entryChildIdentifiers = null;
				((ReferenceTable) referenceTable).childIdentifiers = null;
		    }
		}
    }
    
    public boolean method4218(int i, byte i_84_) {
		if (!method4180(-108709767)) {
			return false;
		}
		if (((ReferenceTable) referenceTable).entryChildIndexCount.length == 1)
			return method4183(0, i, -1731379809);
		if (!method4237(i, 1736754263)) {
			return false;
		}
		if (((ReferenceTable) referenceTable).entryChildIndexCount[i] == 1) {
			return method4183(i, 0, -1819980033);
		}
		throw new RuntimeException();
    }
    
    synchronized boolean method4219(int i) {
	if (!method4180(-108709767))
	    return false;
	if (i < 0
	    || i >= (((ReferenceTable) referenceTable)
		     .entryChildIndexCount).length
	    || (((ReferenceTable) referenceTable).entryChildIndexCount[i]
		== 0)) {
	    if (aBool2491)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    synchronized boolean method4220(int i) {
	if (!method4180(-108709767))
	    return false;
	if (i < 0
	    || i >= (((ReferenceTable) referenceTable)
		     .entryChildIndexCount).length
	    || (((ReferenceTable) referenceTable).entryChildIndexCount[i]
		== 0)) {
	    if (aBool2491)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    public synchronized boolean method4221(int i, int i_85_) {
	if (!method4180(-108709767))
	    return false;
	if (i < 0 || i_85_ < 0
	    || i >= (((ReferenceTable) referenceTable)
		     .entryChildIndexCount).length
	    || i_85_ >= (((ReferenceTable) referenceTable)
			 .entryChildIndexCount[i])) {
	    if (aBool2491)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_85_).toString());
	    return false;
	}
	return true;
    }
    
    boolean method4222(String string, String string_86_) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	string_86_ = string_86_.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -1695748267), (byte) 5));
	if (!method4237(i, 1736754263))
	    return false;
	int i_87_
	    = (((ReferenceTable) referenceTable)
		   .childIdentifiers[i].getIndex
	       (Class494.convertStringIdentifier(string_86_, -1739269463), (byte) 5));
	return method4188(i, i_87_, -921229859);
    }
    
    public void method4223(int i) {
	aClass279_2490.method5462(i, 16711935);
    }
    
    public int method4224(String string) {
	if (!method4180(-108709767))
	    return -1;
	string = string.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -881027141), (byte) 5));
	if (!method4237(i, 1736754263))
	    return -1;
	return i;
    }
    
    public void method4225(int i) {
	aClass279_2490.method5462(i, 16711935);
    }
    
    public byte[] method4226(int i, int i_88_) {
	return method4187(i, i_88_, null, 1906851862);
    }
    
    public byte[] method4227(int i, int i_89_) {
	return method4187(i, i_89_, null, 1858934995);
    }
    
    public byte[] method4228(int i, int i_90_) {
	return method4187(i, i_90_, null, 1943543529);
    }
    
    public JS5(Class279 class279, boolean bool, int i) {
	if (i < 0 || i > 2)
	    throw new IllegalArgumentException("");
	aClass279_2490 = class279;
	aBool2481 = bool;
	anInt2494 = 2140544671 * i;
    }
    
    public synchronized byte[] method4229(int i, int i_91_, int[] is) {
	if (!method4183(i, i_91_, -1184562205))
	    return null;
	byte[] is_92_ = null;
	if (null == anObjectArrayArray2486[i]
	    || null == anObjectArrayArray2486[i][i_91_]) {
	    boolean bool = unpackContainer(i, i_91_, is, 1692541238);
	    if (!bool) {
		method4184(i, 19341472);
		bool = unpackContainer(i, i_91_, is, 167393625);
		if (!bool)
		    return null;
	    }
	}
	if (null == anObjectArrayArray2486[i])
	    throw new RuntimeException("");
	if (null != anObjectArrayArray2486[i][i_91_]) {
	    is_92_ = Class445.method7894((((JS5) this)
					  .anObjectArrayArray2486[i][i_91_]),
					 false, -284932600);
	    if (null == is_92_)
		throw new RuntimeException("");
	}
	if (null != is_92_) {
	    if (1 == anInt2494 * 21593439) {
		anObjectArrayArray2486[i][i_91_] = null;
		if (1 == (((ReferenceTable) referenceTable)
			  .entryChildIndexCount[i]))
		    anObjectArrayArray2486[i] = null;
	    } else if (21593439 * anInt2494 == 2)
		anObjectArrayArray2486[i] = null;
	}
	return is_92_;
    }
    
    public void method4230(int i) {
	aClass279_2490.method5462(i, 16711935);
    }
    
    public synchronized boolean method4231(int i) {
	if (!method4180(-108709767))
	    return false;
	if (1 == (((ReferenceTable) referenceTable)
		  .entryChildIndexCount).length)
	    return method4188(0, i, -1346375696);
	if (!method4237(i, 1736754263))
	    return false;
	if (((ReferenceTable) referenceTable).entryChildIndexCount[i]
	    == 1)
	    return method4188(i, 0, -1607698419);
	throw new RuntimeException();
    }
    
    public synchronized boolean method4232(int i, int i_93_) {
	if (!method4183(i, i_93_, -964209294))
	    return false;
	if (anObjectArrayArray2486[i] != null
	    && null != anObjectArrayArray2486[i][i_93_])
	    return true;
	if (null != anObjectArray2482[i])
	    return true;
	method4184(i, 1466202459);
	if (null != anObjectArray2482[i])
	    return true;
	return false;
    }
    
    public synchronized boolean method4233(int i) {
	if (!method4180(-108709767))
	    return false;
	if (1 == (((ReferenceTable) referenceTable)
		  .entryChildIndexCount).length)
	    return method4188(0, i, -1746498520);
	if (!method4237(i, 1736754263))
	    return false;
	if (((ReferenceTable) referenceTable).entryChildIndexCount[i]
	    == 1)
	    return method4188(i, 0, -1900072339);
	throw new RuntimeException();
    }
    
    public boolean method4234(String string) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -808267887), (byte) 5));
	if (i < 0)
	    return false;
	return true;
    }
    
    public synchronized boolean method4235(int i) {
	if (!method4237(i, 1736754263))
	    return false;
	if (anObjectArray2482[i] != null)
	    return true;
	method4184(i, 828442112);
	if (null != anObjectArray2482[i])
	    return true;
	return false;
    }
    
    public synchronized boolean method4236(int i) {
	if (!method4237(i, 1736754263))
	    return false;
	if (anObjectArray2482[i] != null)
	    return true;
	method4184(i, 1785211350);
	if (null != anObjectArray2482[i])
	    return true;
	return false;
    }
    
    synchronized boolean method4237(int i, int i_94_) {
	if (!method4180(-108709767))
	    return false;
	if (i < 0
	    || i >= (((ReferenceTable) referenceTable)
		     .entryChildIndexCount).length
	    || (((ReferenceTable) referenceTable).entryChildIndexCount[i]
		== 0)) {
	    if (aBool2491)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    public synchronized boolean method4238() {
	if (!method4180(-108709767))
	    return false;
	boolean bool = true;
	for (int i = 0; i < (((ReferenceTable) referenceTable)
			     .entryIndicies).length; i++) {
	    int i_95_ = (((ReferenceTable) referenceTable)
			 .entryIndicies[i]);
	    if (null == anObjectArray2482[i_95_]) {
		method4184(i_95_, 1744371297);
		if (null == anObjectArray2482[i_95_])
		    bool = false;
	    }
	}
	return bool;
    }
    
    public synchronized int method4239() {
	if (!method4180(-108709767))
	    return 0;
	int i = 0;
	int i_96_ = 0;
	for (int i_97_ = 0; i_97_ < anObjectArray2482.length;
	     i_97_++) {
	    if ((((ReferenceTable) referenceTable).entryChildCounts
		 [i_97_])
		> 0) {
		i += 100;
		i_96_ += method4192(i_97_, -417121787);
	    }
	}
	if (0 == i)
	    return 100;
	int i_98_ = 100 * i_96_ / i;
	return i_98_;
    }
    
    public void method4240(boolean bool, boolean bool_99_) {
	if (method4180(-108709767)) {
	    if (bool) {
		((ReferenceTable) referenceTable).entryIdentifiers
		    = null;
		((ReferenceTable) referenceTable).identifiers
		    = null;
	    }
	    if (bool_99_) {
		((ReferenceTable) referenceTable)
		    .entryChildIdentifiers
		    = null;
		((ReferenceTable) referenceTable).childIdentifiers
		    = null;
	    }
	}
    }
    
    public void method4241(int i, byte i_100_) {
    	aClass279_2490.method5462(i, 16711935);
    }
    
    public synchronized byte[] method4242(int i) {
	if (!method4180(-108709767))
	    return null;
	if (1 == (((ReferenceTable) referenceTable)
		  .entryChildIndexCount).length)
	    return getfile(0, i, 1917441483);
	if (!method4237(i, 1736754263))
	    return null;
	if (1
	    == ((ReferenceTable) referenceTable).entryChildIndexCount[i])
	    return getfile(i, 0, 2017544975);
	throw new RuntimeException();
    }
    
    public synchronized byte[] method4243(int i) {
	if (!method4180(-108709767))
	    return null;
	if (1 == (((ReferenceTable) referenceTable)
		  .entryChildIndexCount).length)
	    return getfile(0, i, -855640580);
	if (!method4237(i, 1736754263))
	    return null;
	if (1
	    == ((ReferenceTable) referenceTable).entryChildIndexCount[i])
	    return getfile(i, 0, -1233348653);
	throw new RuntimeException();
    }
    
    public synchronized byte[] method4244(int i) {
	if (!method4180(-108709767))
	    return null;
	if (1 == (((ReferenceTable) referenceTable)
		  .entryChildIndexCount).length)
	    return getfile(0, i, 33457101);
	if (!method4237(i, 1736754263))
	    return null;
	if (1
	    == ((ReferenceTable) referenceTable).entryChildIndexCount[i])
	    return getfile(i, 0, -215518765);
	throw new RuntimeException();
    }
    
    public synchronized byte[] method4245(int i) {
	if (!method4180(-108709767))
	    return null;
	if (1 == (((ReferenceTable) referenceTable)
		  .entryChildIndexCount).length)
	    return getfile(0, i, 172096827);
	if (!method4237(i, 1736754263))
	    return null;
	if (1
	    == ((ReferenceTable) referenceTable).entryChildIndexCount[i])
	    return getfile(i, 0, -1364282596);
	throw new RuntimeException();
    }
    
    public synchronized int[] method4246(int i) {
	if (!method4237(i, 1736754263))
	    return null;
	int[] is = (((ReferenceTable) referenceTable)
		    .entryChildIndices[i]);
	if (null == is) {
	    is = new int[(((ReferenceTable) referenceTable)
			  .entryChildCounts[i])];
	    for (int i_101_ = 0; i_101_ < is.length; i_101_++)
		is[i_101_] = i_101_;
	}
	return is;
    }
    
    synchronized boolean method4247(int i) {
	if (!method4180(-108709767))
	    return false;
	if (i < 0
	    || i >= (((ReferenceTable) referenceTable)
		     .entryChildIndexCount).length
	    || (((ReferenceTable) referenceTable).entryChildIndexCount[i]
		== 0)) {
	    if (aBool2491)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    public boolean method4248(int i) {
	if (!method4180(-108709767))
	    return false;
	if (((ReferenceTable) referenceTable).entryChildIndexCount.length
	    == 1)
	    return method4183(0, i, -1440482588);
	if (!method4237(i, 1736754263))
	    return false;
	if (((ReferenceTable) referenceTable).entryChildIndexCount[i]
	    == 1)
	    return method4183(i, 0, -837974442);
	throw new RuntimeException();
    }
    
    public synchronized boolean method4249(int i) {
	if (!method4180(-108709767))
	    return false;
	if (1 == (((ReferenceTable) referenceTable)
		  .entryChildIndexCount).length)
	    return method4188(0, i, -1625884041);
	if (!method4237(i, 1736754263))
	    return false;
	if (((ReferenceTable) referenceTable).entryChildIndexCount[i]
	    == 1)
	    return method4188(i, 0, -632074057);
	throw new RuntimeException();
    }
    
    public synchronized boolean method4250(int i, int i_102_) {
	if (!method4180(-108709767))
	    return false;
	if (1 == (((ReferenceTable) referenceTable)
		  .entryChildIndexCount).length)
	    return method4188(0, i, -795276837);
	if (!method4237(i, 1736754263))
	    return false;
	if (((ReferenceTable) referenceTable).entryChildIndexCount[i]
	    == 1)
	    return method4188(i, 0, -652157064);
	throw new RuntimeException();
    }
    
    public synchronized int method4251() {
	if (!method4180(-108709767))
	    return 0;
	int i = 0;
	int i_103_ = 0;
	for (int i_104_ = 0;
	     i_104_ < anObjectArray2482.length; i_104_++) {
	    if ((((ReferenceTable) referenceTable).entryChildCounts
		 [i_104_])
		> 0) {
		i += 100;
		i_103_ += method4192(i_104_, -417121787);
	    }
	}
	if (0 == i)
	    return 100;
	int i_105_ = 100 * i_103_ / i;
	return i_105_;
    }
    
    public int method4252() {
	if (!method4180(-108709767))
	    return -1;
	return (((ReferenceTable) referenceTable)
		.entryChildIndexCount).length;
    }
    
    public int method4253() {
	if (!method4180(-108709767))
	    return -1;
	return (((ReferenceTable) referenceTable)
		.entryChildIndexCount).length;
    }
    
    public synchronized void method4254(int i) {
	if (method4237(i, 1736754263)) {
	    if (null != anObjectArrayArray2486)
		anObjectArrayArray2486[i] = null;
	}
    }
    
    public boolean method4255(String string, String string_106_) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	string_106_ = string_106_.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -2122702460), (byte) 5));
	if (i < 0)
	    return false;
	int i_107_
	    = (((ReferenceTable) referenceTable)
		   .childIdentifiers[i].getIndex
	       (Class494.convertStringIdentifier(string_106_, -1350640848), (byte) 5));
	if (i_107_ < 0)
	    return false;
	return true;
    }
    
    public int method4256(String string) {
	if (!method4180(-108709767))
	    return -1;
	string = string.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -1083459070), (byte) 5));
	if (!method4237(i, 1736754263))
	    return -1;
	return i;
    }
    
    public boolean method4257(String string, byte i) {
	int i_108_ = identifierToIndex("", -187631888);
	if (-1 != i_108_)
	    return method4207("", string, 2045757793);
	return method4207(string, "", 2032925217);
    }
    
    public synchronized byte[] method4258(int i, int i_109_, int[] is) {
	if (!method4183(i, i_109_, -968357114))
	    return null;
	byte[] is_110_ = null;
	if (null == anObjectArrayArray2486[i]
	    || null == anObjectArrayArray2486[i][i_109_]) {
	    boolean bool = unpackContainer(i, i_109_, is, -1724280502);
	    if (!bool) {
		method4184(i, -643535297);
		bool = unpackContainer(i, i_109_, is, 903569103);
		if (!bool)
		    return null;
	    }
	}
	if (null == anObjectArrayArray2486[i])
	    throw new RuntimeException("");
	if (null != anObjectArrayArray2486[i][i_109_]) {
	    is_110_ = Class445.method7894((((JS5) this)
					   .anObjectArrayArray2486[i][i_109_]),
					  false, -284932600);
	    if (null == is_110_)
		throw new RuntimeException("");
	}
	if (null != is_110_) {
	    if (1 == anInt2494 * 21593439) {
		anObjectArrayArray2486[i][i_109_] = null;
		if (1 == (((ReferenceTable) referenceTable)
			  .entryChildIndexCount[i]))
		    anObjectArrayArray2486[i] = null;
	    } else if (21593439 * anInt2494 == 2)
		anObjectArrayArray2486[i] = null;
	}
	return is_110_;
    }
    
    public int method4259(int i) {
	if (!method4180(-108709767))
	    return -1;
	int i_111_ = ((ReferenceTable) referenceTable)
			 .identifiers.getIndex(i, (byte) 5);
	if (!method4237(i_111_, 1736754263))
	    return -1;
	return i_111_;
    }
    
    public int method4260(int i) {
	if (!method4180(-108709767))
	    return -1;
	int i_112_ = ((ReferenceTable) referenceTable)
			 .identifiers.getIndex(i, (byte) 5);
	if (!method4237(i_112_, 1736754263))
	    return -1;
	return i_112_;
    }
    
    public int method4261(int i) {
	if (!method4180(-108709767))
	    return -1;
	int i_113_ = ((ReferenceTable) referenceTable)
			 .identifiers.getIndex(i, (byte) 5);
	if (!method4237(i_113_, 1736754263))
	    return -1;
	return i_113_;
    }
    
    public boolean method4262(String string) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -1065170301), (byte) 5));
	if (i < 0)
	    return false;
	return true;
    }
    
    public synchronized int[] method4263(int i) {
	if (!method4237(i, 1736754263))
	    return null;
	int[] is = (((ReferenceTable) referenceTable)
		    .entryChildIndices[i]);
	if (null == is) {
	    is = new int[(((ReferenceTable) referenceTable)
			  .entryChildCounts[i])];
	    for (int i_114_ = 0; i_114_ < is.length; i_114_++)
		is[i_114_] = i_114_;
	}
	return is;
    }
    
    public boolean method4264(String string) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -1728766997), (byte) 5));
	if (i < 0)
	    return false;
	return true;
    }
    
    public boolean containerIdentifierExists/*method4265*/(String identifier, int i) {
		if (!method4180(-108709767)) {
			return false;
		}
		identifier = identifier.toLowerCase();
		int index = (((ReferenceTable) referenceTable).identifiers.getIndex(
				Class494.convertStringIdentifier(identifier, -1299332513), (byte) 5));
		return containerExists(index, 148292523);
    }
    
    public synchronized boolean method4266() {
	if (!method4180(-108709767))
	    return false;
	boolean bool = true;
	for (int i = 0; i < (((ReferenceTable) referenceTable)
			     .entryIndicies).length; i++) {
	    int i_116_ = (((ReferenceTable) referenceTable)
			  .entryIndicies[i]);
	    if (null == anObjectArray2482[i_116_]) {
		method4184(i_116_, 875011117);
		if (null == anObjectArray2482[i_116_])
		    bool = false;
	    }
	}
	return bool;
    }
    
    public synchronized byte[] method4267(String string, String string_117_) {
	if (!method4180(-108709767))
	    return null;
	string = string.toLowerCase();
	string_117_ = string_117_.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -1762882532), (byte) 5));
	if (!method4237(i, 1736754263))
	    return null;
	int i_118_
	    = (((ReferenceTable) referenceTable)
		   .childIdentifiers[i].getIndex
	       (Class494.convertStringIdentifier(string_117_, -1352960359), (byte) 5));
	return getfile(i, i_118_, 1088353106);
    }
    
    public synchronized byte[] method4268(String string, String string_119_) {
	if (!method4180(-108709767))
	    return null;
	string = string.toLowerCase();
	string_119_ = string_119_.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -1442950881), (byte) 5));
	if (!method4237(i, 1736754263))
	    return null;
	int i_120_
	    = (((ReferenceTable) referenceTable)
		   .childIdentifiers[i].getIndex
	       (Class494.convertStringIdentifier(string_119_, -1255659667), (byte) 5));
	return getfile(i, i_120_, 1494318696);
    }
    
    public synchronized byte[] method4269(String string, String string_121_) {
	if (!method4180(-108709767))
	    return null;
	string = string.toLowerCase();
	string_121_ = string_121_.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -1757525200), (byte) 5));
	if (!method4237(i, 1736754263))
	    return null;
	int i_122_
	    = (((ReferenceTable) referenceTable)
		   .childIdentifiers[i].getIndex
	       (Class494.convertStringIdentifier(string_121_, -1736682143), (byte) 5));
	return getfile(i, i_122_, -736220285);
    }
    
    public int method4270(String string) {
	if (!method4180(-108709767))
	    return -1;
	string = string.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -669663477), (byte) 5));
	if (!method4237(i, 1736754263))
	    return -1;
	return i;
    }
    
    boolean method4271(String string, String string_123_) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	string_123_ = string_123_.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -2132047162), (byte) 5));
	if (!method4237(i, 1736754263))
	    return false;
	int i_124_
	    = (((ReferenceTable) referenceTable)
		   .childIdentifiers[i].getIndex
	       (Class494.convertStringIdentifier(string_123_, -1350211210), (byte) 5));
	return method4188(i, i_124_, -1987981558);
    }
    
    public boolean method4272(String string) {
	if (!method4180(-108709767))
	    return false;
	string = string.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -1901394263), (byte) 5));
	return containerExists(i, -428560509);
    }
    
    public int method4273(String string) {
	if (!method4180(-108709767))
	    return 0;
	string = string.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -1529404765), (byte) 5));
	return method4192(i, -417121787);
    }
    
    public int method4274(String string) {
	if (!method4180(-108709767))
	    return 0;
	string = string.toLowerCase();
	int i = (((ReferenceTable) referenceTable)
		     .identifiers.getIndex
		 (Class494.convertStringIdentifier(string, -1274593107), (byte) 5));
	return method4192(i, -417121787);
    }
    
    static final byte[] method4275(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	int i = class241_sub3.readUnsignedByte((byte) 14);
	int i_125_ = class241_sub3.readInt((byte) 5);
	if (i_125_ < 0 || (anInt2492 * -1077414777 != 0
			   && i_125_ > anInt2492 * -1077414777))
	    throw new RuntimeException();
	if (0 == i) {
	    byte[] is_126_ = new byte[i_125_];
	    class241_sub3.readBytes(is_126_, 0, i_125_, (byte) 39);
	    return is_126_;
	}
	int i_127_ = class241_sub3.readInt((byte) 29);
	if (i_127_ < 0 || (-1077414777 * anInt2492 != 0
			   && i_127_ > anInt2492 * -1077414777))
	    throw new RuntimeException();
	byte[] is_128_ = new byte[i_127_];
	if (1 == i)
	    Class435.method7784(is_128_, i_127_, is, i_125_, 9);
	else {
	    synchronized (aClass606_2488) {
		aClass606_2488.method13214(class241_sub3, is_128_, 1856264071);
	    }
	}
	return is_128_;
    }
    
    static final byte[] method4276(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	int i = class241_sub3.readUnsignedByte((byte) -12);
	int i_129_ = class241_sub3.readInt((byte) 98);
	if (i_129_ < 0 || (anInt2492 * -1077414777 != 0
			   && i_129_ > anInt2492 * -1077414777))
	    throw new RuntimeException();
	if (0 == i) {
	    byte[] is_130_ = new byte[i_129_];
	    class241_sub3.readBytes(is_130_, 0, i_129_, (byte) -14);
	    return is_130_;
	}
	int i_131_ = class241_sub3.readInt((byte) 88);
	if (i_131_ < 0 || (-1077414777 * anInt2492 != 0
			   && i_131_ > anInt2492 * -1077414777))
	    throw new RuntimeException();
	byte[] is_132_ = new byte[i_131_];
	if (1 == i)
	    Class435.method7784(is_132_, i_131_, is, i_129_, 9);
	else {
	    synchronized (aClass606_2488) {
		aClass606_2488.method13214(class241_sub3, is_132_,
					   -1920916479);
	    }
	}
	return is_132_;
    }
    
    static final byte[] method4277(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	int i = class241_sub3.readUnsignedByte((byte) 95);
	int i_133_ = class241_sub3.readInt((byte) 39);
	if (i_133_ < 0 || (anInt2492 * -1077414777 != 0
			   && i_133_ > anInt2492 * -1077414777))
	    throw new RuntimeException();
	if (0 == i) {
	    byte[] is_134_ = new byte[i_133_];
	    class241_sub3.readBytes(is_134_, 0, i_133_, (byte) -12);
	    return is_134_;
	}
	int i_135_ = class241_sub3.readInt((byte) 120);
	if (i_135_ < 0 || (-1077414777 * anInt2492 != 0
			   && i_135_ > anInt2492 * -1077414777))
	    throw new RuntimeException();
	byte[] is_136_ = new byte[i_135_];
	if (1 == i)
	    Class435.method7784(is_136_, i_135_, is, i_133_, 9);
	else {
	    synchronized (aClass606_2488) {
		aClass606_2488.method13214(class241_sub3, is_136_, 467108604);
	    }
	}
	return is_136_;
    }
    
    static final byte[] method4278(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	int i = class241_sub3.readUnsignedByte((byte) -33);
	int i_137_ = class241_sub3.readInt((byte) 113);
	if (i_137_ < 0 || (anInt2492 * -1077414777 != 0
			   && i_137_ > anInt2492 * -1077414777))
	    throw new RuntimeException();
	if (0 == i) {
	    byte[] is_138_ = new byte[i_137_];
	    class241_sub3.readBytes(is_138_, 0, i_137_, (byte) 29);
	    return is_138_;
	}
	int i_139_ = class241_sub3.readInt((byte) 91);
	if (i_139_ < 0 || (-1077414777 * anInt2492 != 0
			   && i_139_ > anInt2492 * -1077414777))
	    throw new RuntimeException();
	byte[] is_140_ = new byte[i_139_];
	if (1 == i)
	    Class435.method7784(is_140_, i_139_, is, i_137_, 9);
	else {
	    synchronized (aClass606_2488) {
		aClass606_2488.method13214(class241_sub3, is_140_, 2119779108);
	    }
	}
	return is_140_;
    }
    
    public static void method4279(JS5 class210, Class107 class107,
				  Interface6 interface6, int i) {
	Class448.aClass210_6192 = class210;
	Class128.aClass107_1588 = class107;
	Class589.anInterface6_7614 = interface6;
    }
}
