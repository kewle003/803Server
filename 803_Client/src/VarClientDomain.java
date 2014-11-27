/* Class136_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class VarClientDomain extends SparseVarDomain
{
    int layoutInfoSent;//anInt9850
    public boolean aBool9851 = false;
    static final int anInt9852 = 1;
    boolean aBool9853;
    Set<Integer> aSet9854;
    long aLong9855;
    Class254[] interfaceLayoutInfo;//aClass254Array9856
    public long aLong9857 = 5678095026217719423L;
    VarTransmitLevel[] transmitLevels;//aClass300Array9858
    
    public void dummyMethod90(VarType class179, Object object) {
	if ((transmitLevels
	     [class179.id * 414229387])
	    == VarTransmitLevel.ON_SET_DIFFERENT)
	    aBool9851 = true;
	else if ((transmitLevels
		  [class179.id * 414229387])
		 == VarTransmitLevel.ON_SET_ALWAYS) {
	    if (object instanceof String) {
		String string = (String) object;
		if (string.length() > 80)
		    object = string.substring(0, 80);
	    }
	    Object object_0_ = getVarValue(class179, 1707970465);
	    if (object != null && object_0_ != null
		&& !object.equals(object_0_)) {
		aBool9853 = true;
		aSet9854.add(Integer.valueOf(414229387 * class179.id));
	    } else if ((object == null) != (null == object_0_)) {
		aBool9853 = true;
		aSet9854.add(Integer.valueOf(class179.id * 414229387));
	    }
	}
	super.setVarValue(class179, object, (byte) 73);
    }
    
    public void setVarValueInt(VarType type, int value, int i_1_) {
		if ((transmitLevels[414229387 * type.id]) == VarTransmitLevel.ON_SET_DIFFERENT) {
		    aBool9851 = true;
		} else if (VarTransmitLevel.ON_SET_ALWAYS == transmitLevels[414229387 * type.id]
				&& getVarValueInt(type, -134229016) != value) {
		    aBool9853 = true;
		    aSet9854.add(Integer.valueOf(414229387 * type.id));
		}
		super.setVarValueInt(type, value, 1033667844);
    }
    
    public void resetLayoutInfo/*method16178*/(byte i) {
		if (null != interfaceLayoutInfo && (layoutInfoSent * -1830972147 >= interfaceLayoutInfo.length)) {
		    interfaceLayoutInfo = null;
		    layoutInfoSent = 0;
		}
    }
    
    public void setVarValue(VarType type, Object value, byte i) {
		if (transmitLevels[type.id * 414229387] == VarTransmitLevel.ON_SET_DIFFERENT) {
		    aBool9851 = true;
		} else if (transmitLevels[type.id * 414229387] == VarTransmitLevel.ON_SET_ALWAYS) {
		    if (value instanceof String) {
		    	String string = (String) value;
				if (string.length() > 80) {
					value = string.substring(0, 80);
				}
		    }
		    Object object_2_ = getVarValue(type, -2113083805);
		    if (value != null && object_2_ != null
		    		&& !value.equals(object_2_)) {
				aBool9853 = true;
				aSet9854.add(Integer.valueOf(414229387 * type.id));
		    } else if ((value == null) != (null == object_2_)) {
				aBool9853 = true;
				aSet9854.add(Integer.valueOf(type.id * 414229387));
		    }
		}
		super.setVarValue(type, value, (byte) 11);
    }
    
    public void method16179(int i) {
	for (int i_3_ = 0;
	     i_3_ < transmitLevels.length; i_3_++) {
	    if ((transmitLevels[i_3_]
		 == VarTransmitLevel.NEVER)
		|| (transmitLevels[i_3_]
		    == VarTransmitLevel.ON_SET_ALWAYS))
		varValues.method334(i_3_, (byte) 0);
	}
	aSet9854.clear();
	aBool9853 = false;
	interfaceLayoutInfo = null;
	aLong9855 = 3501525299975799157L;
    }
    
    public void method16180(int i) {
    	layoutInfoSent = 0;
    }
    
    public void load/*method16181*/(RS3File class408, byte i) {//Used
		do {
		    try {
				try {
				    byte[] data = new byte[(int) class408.method7326(-542107572)];
				    int i_4_;
				    for (int i_5_ = 0; i_5_ < data.length; i_5_ += i_4_) {
						i_4_ = class408.method7327(data, i_5_, data.length - i_5_, (byte) 119);
						if (i_4_ == -1) {
						    throw new EOFException();
						}
				    }
				    RSByteBuffer buffer = new RSByteBuffer(data);
				    if ((buffer.payload.length - buffer.pointer * 421967667) < 1) {
						try {
						    class408.close((byte) 47);
						} catch (Exception exception) {
						    /* empty */
						}
						break;
				    }
				    int i_6_ = buffer.readUnsignedByte((byte) -5);
				    if (i_6_ < 0 || i_6_ > 1) {
						try {
						    class408.close((byte) 39);
						} catch (Exception exception) {
						    /* empty */
						}
						break;
				    }
				    if ((buffer.payload.length - buffer.pointer * 421967667) < 2) {
						try {
						    class408.close((byte) 78);
						} catch (Exception exception) {
						    /* empty */
						}
						break;
				    }
				    int varCount = buffer.readUnsignedShort(1162222719);
				    if ((buffer.payload.length - buffer.pointer * 421967667) < varCount * 6) {
						try {
						    class408.close((byte) 92);
						} catch (Exception exception) {
						    /* empty */
						}
						break;
				    }
				    for (int index = 0; index < varCount; index++) {
						Class254 class254 = Class463.VAR_CLIENT_LIST.decodeVarValue(buffer, (byte) 121);
						if ((transmitLevels[623518843 * class254.key] == VarTransmitLevel.ON_SET_DIFFERENT)
								&& (Class463.VAR_CLIENT_LIST.list(class254.key * 623518843,-2060087840)
							    .dataType.getVarBaseType(-1011275099).javaClass
							    .isAssignableFrom(class254.value.getClass()))) {
						    varValues.method335((623518843 * class254.key),
										 class254.value, (byte) 36);
						}
				    }
				} catch (Exception exception) {
				    try {
				    	class408.close((byte) 39);
				    } catch (Exception exception_9_) {
				    	exception = exception_9_;
				    }
				    break;
				}
				try {
				    class408.close((byte) 87);
				} catch (Exception exception) {
				    /* empty */
				}
		    } catch (Exception exception) {
				try {
				    class408.close((byte) 65);
				} catch (Exception exception_10_) {
				    /* empty */
				}
				throw exception;
		    }
		} while (false);
    }
    
    public void save/*method16182*/(RS3File prefFile, int i) {
		do {
		    try {
				try {
				    int packetSize = 3;
				    int varCount = 0;
				    Iterator<Object> iterator = varValues.iterator();
				    while (iterator.hasNext()) {
						Class254 class254 = (Class254) iterator.next();
						if (VarTransmitLevel.ON_SET_DIFFERENT == transmitLevels[class254.key * 623518843]) {
							packetSize += Class463.VAR_CLIENT_LIST.getValueEncodingLength(class254, -1414692321);
							varCount++;
						}
				    }
				    RSByteBuffer buffer = new RSByteBuffer(packetSize);
				    buffer.writeByte(1, 668222883);
				    buffer.writeShort(varCount, -484048531);
				    Iterator<Object> iterator_12_ = varValues.iterator();
				    while (iterator_12_.hasNext()) {
						Class254 class254 = (Class254) iterator_12_.next();
						if (transmitLevels[class254.key * 623518843] == VarTransmitLevel.ON_SET_DIFFERENT) {
						    Class463.VAR_CLIENT_LIST.encodeVarValue(buffer, class254, -1351118327);
						}
				    }
				    prefFile.write(buffer.payload, 0, 421967667 * buffer.pointer, (byte) 14);
				} catch (Exception exception) {
				    try {
				    	prefFile.close((byte) 106);
				    } catch (Exception exception_13_) {
				    	exception = exception_13_;
				    }
				    break;
				}
				try {
					prefFile.close((byte) 127);
				} catch (Exception exception) {
				    /* empty */
				}
		    } catch (Throwable object) {
				try {
					prefFile.close((byte) 39);
				} catch (Exception exception) {
				    /* empty */
				}
				throw object;
		    }
		} while (false);
		aLong9857 = Class50.method1249((byte) 1) * -5678095026217719423L;
		aBool9851 = false;
    }
    
    public void method16183(int i) {
		if (Class50.method1249((byte) 1) >= -4937952234456893149L * aLong9855) {
		    if (null == interfaceLayoutInfo) {
				if (!aBool9853) {
				    return;
				}
				interfaceLayoutInfo = new Class254[aSet9854.size()];
				int index = 0;
				Iterator<Integer> iterator = aSet9854.iterator();
				while (iterator.hasNext()) {
				    int i_15_ = ((Integer) iterator.next()).intValue();
				    interfaceLayoutInfo[index++] = new Class254(i_15_, varValues.method344(i_15_, 1923320593));
				}
				layoutInfoSent = 0;
				aBool9853 = false;
				aSet9854.clear();
		    }
		    if (null != interfaceLayoutInfo && (-1830972147 * layoutInfoSent < interfaceLayoutInfo.length)) {
		    	ServerConnection conn = ClanChannelDelta.method6943(-1883155490);
				if (conn.anInt2258 * -350916327 <= 1200) {
				    Class241_Sub27 packet = Class445_Sub26.makePacket(
				    		OutgoingOpcode.INTERFACE_LAYOUT_PACKET,
				    		conn.packetCipher, 16711935);
				    packet.data.writeShort(0, -484048531);
				    int start = (packet.data.pointer * 421967667);
				    packet.data.pointer += -681042949;
				    for (/**/; (-1830972147 * layoutInfoSent < interfaceLayoutInfo.length); layoutInfoSent += -1170980411) {
						Class254 class254 = interfaceLayoutInfo[(-1830972147 * layoutInfoSent)];
						if ((conn.anInt2258 * -350916327
						     + packet.data.pointer * 421967667
						     + Class463.VAR_CLIENT_LIST.getValueEncodingLength(class254, 723576566)) > 1500) {
						    break;
						}
						Class463.VAR_CLIENT_LIST.encodeVarValue(packet.data, class254, -1357183154);
				    }
				    packet.data.endPacketVarShort(421967667 * (packet.data.pointer) - start, (byte) 127);
				    if (-1830972147 * layoutInfoSent >= interfaceLayoutInfo.length) {
				    	packet.data.payload[start] = (byte) 1;
				    } else {
				    	packet.data.payload[start] = (byte) 0;
				    }
				    conn.sendPacket(packet, -1780666335);
				    aLong9855 = ((Class50.method1249((byte) 1) + 1000L) * -3501525299975799157L);
				}
		    }
		}
    }
    
    public void method16184() {
	if (null != interfaceLayoutInfo
	    && (layoutInfoSent * -1830972147
		>= interfaceLayoutInfo.length)) {
	    interfaceLayoutInfo = null;
	    layoutInfoSent = 0;
	}
    }
    
    public void dummyMethod83(VarType class179, int i) {
	if ((transmitLevels
	     [414229387 * class179.id])
	    == VarTransmitLevel.ON_SET_DIFFERENT)
	    aBool9851 = true;
	else if (VarTransmitLevel.ON_SET_ALWAYS == (((VarClientDomain) this)
					     .transmitLevels
					     [414229387 * class179.id])
		 && getVarValueInt(class179, -397976578) != i) {
	    aBool9853 = true;
	    aSet9854
		.add(Integer.valueOf(414229387 * class179.id));
	}
	super.setVarValueInt(class179, i, 1143979563);
    }
    
    public void method16185(RS3File class408) {
	do {
	    try {
		try {
		    byte[] is
			= new byte[(int) class408.method7326(-542107572)];
		    int i;
		    for (int i_17_ = 0; i_17_ < is.length; i_17_ += i) {
			i = class408.method7327(is, i_17_, is.length - i_17_,
						(byte) 84);
			if (i == -1)
			    throw new EOFException();
		    }
		    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 1) {
			try {
			    class408.close((byte) 44);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_18_ = class241_sub3.readUnsignedByte((byte) 35);
		    if (i_18_ < 0 || i_18_ > 1) {
			try {
			    class408.close((byte) 4);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 2) {
			try {
			    class408.close((byte) 84);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_19_ = class241_sub3.readUnsignedShort(1162222719);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< i_19_ * 6) {
			try {
			    class408.close((byte) 57);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
			Class254 class254
			    = Class463.VAR_CLIENT_LIST
				  .decodeVarValue(class241_sub3, (byte) 37);
			if (((transmitLevels
			      [623518843 * class254.key])
			     == VarTransmitLevel.ON_SET_DIFFERENT)
			    && (Class463.VAR_CLIENT_LIST.list
				    (class254.key * 623518843,
				     -1623915015)
				    .dataType.getVarBaseType
				    (304715822).javaClass.isAssignableFrom
				(class254.value.getClass())))
			    varValues.method335((623518843
							  * (class254
							     .key)),
							 class254.value,
							 (byte) -90);
		    }
		} catch (Exception exception) {
		    try {
			class408.close((byte) 46);
		    } catch (Exception exception_21_) {
			exception = exception_21_;
		    }
		    break;
		}
		try {
		    class408.close((byte) 13);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Throwable object) {
		try {
		    class408.close((byte) 107);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void dummyMethod84(VarType class179, int i) {
	if ((transmitLevels
	     [414229387 * class179.id])
	    == VarTransmitLevel.ON_SET_DIFFERENT)
	    aBool9851 = true;
	else if (VarTransmitLevel.ON_SET_ALWAYS == (((VarClientDomain) this)
					     .transmitLevels
					     [414229387 * class179.id])
		 && getVarValueInt(class179, -90145833) != i) {
	    aBool9853 = true;
	    aSet9854
		.add(Integer.valueOf(414229387 * class179.id));
	}
	super.setVarValueInt(class179, i, -318450539);
    }
    
    public void method74(VarType class179, long l) {
	if ((transmitLevels
	     [414229387 * class179.id])
	    == VarTransmitLevel.ON_SET_DIFFERENT)
	    aBool9851 = true;
	else if (VarTransmitLevel.ON_SET_ALWAYS == (((VarClientDomain) this)
					     .transmitLevels
					     [class179.id * 414229387])
		 && getVarValueLong(class179, (byte) 26) != l) {
	    aBool9853 = true;
	    aSet9854
		.add(Integer.valueOf(414229387 * class179.id));
	}
	super.setVarValueLong(class179, l);
    }
    
    public void method88(VarType class179, long l) {
	if ((transmitLevels
	     [414229387 * class179.id])
	    == VarTransmitLevel.ON_SET_DIFFERENT)
	    aBool9851 = true;
	else if (VarTransmitLevel.ON_SET_ALWAYS == (((VarClientDomain) this)
					     .transmitLevels
					     [class179.id * 414229387])
		 && getVarValueLong(class179, (byte) 40) != l) {
	    aBool9853 = true;
	    aSet9854
		.add(Integer.valueOf(414229387 * class179.id));
	}
	super.setVarValueLong(class179, l);
    }
    
    public void method89(VarType class179, long l) {
	if ((transmitLevels
	     [414229387 * class179.id])
	    == VarTransmitLevel.ON_SET_DIFFERENT)
	    aBool9851 = true;
	else if (VarTransmitLevel.ON_SET_ALWAYS == (((VarClientDomain) this)
					     .transmitLevels
					     [class179.id * 414229387])
		 && getVarValueLong(class179, (byte) 108) != l) {
	    aBool9853 = true;
	    aSet9854
		.add(Integer.valueOf(414229387 * class179.id));
	}
	super.setVarValueLong(class179, l);
    }
    
    public void method16186() {
	for (int i = 0; i < transmitLevels.length;
	     i++) {
	    if ((transmitLevels[i]
		 == VarTransmitLevel.NEVER)
		|| (transmitLevels[i]
		    == VarTransmitLevel.ON_SET_ALWAYS))
		varValues.method334(i, (byte) 0);
	}
	aSet9854.clear();
	aBool9853 = false;
	interfaceLayoutInfo = null;
	aLong9855 = 3501525299975799157L;
    }
    
    public void setVarValueLong(VarType class179, long l) {
	if ((transmitLevels
	     [414229387 * class179.id])
	    == VarTransmitLevel.ON_SET_DIFFERENT)
	    aBool9851 = true;
	else if (VarTransmitLevel.ON_SET_ALWAYS == (((VarClientDomain) this)
					     .transmitLevels
					     [class179.id * 414229387])
		 && getVarValueLong(class179, (byte) 43) != l) {
	    aBool9853 = true;
	    aSet9854
		.add(Integer.valueOf(414229387 * class179.id));
	}
	super.setVarValueLong(class179, l);
    }
    
    public void method16187() {
	for (int i = 0; i < transmitLevels.length;
	     i++) {
	    if ((transmitLevels[i]
		 == VarTransmitLevel.NEVER)
		|| (transmitLevels[i]
		    == VarTransmitLevel.ON_SET_ALWAYS))
		varValues.method334(i, (byte) 0);
	}
	aSet9854.clear();
	aBool9853 = false;
	interfaceLayoutInfo = null;
	aLong9855 = 3501525299975799157L;
    }
    
    public void method16188() {
	for (int i = 0; i < transmitLevels.length;
	     i++) {
	    if ((transmitLevels[i]
		 == VarTransmitLevel.NEVER)
		|| (transmitLevels[i]
		    == VarTransmitLevel.ON_SET_ALWAYS))
		varValues.method334(i, (byte) 0);
	}
	aSet9854.clear();
	aBool9853 = false;
	interfaceLayoutInfo = null;
	aLong9855 = 3501525299975799157L;
    }
    
    public void method16189() {
	layoutInfoSent = 0;
    }
    
    public void method16190() {
	layoutInfoSent = 0;
    }
    
    public void method16191() {
	layoutInfoSent = 0;
    }
    
    public void method16192(RS3File class408) {
	do {
	    try {
		try {
		    byte[] is
			= new byte[(int) class408.method7326(-542107572)];
		    int i;
		    for (int i_22_ = 0; i_22_ < is.length; i_22_ += i) {
			i = class408.method7327(is, i_22_, is.length - i_22_,
						(byte) 103);
			if (i == -1)
			    throw new EOFException();
		    }
		    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 1) {
			try {
			    class408.close((byte) 40);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_23_ = class241_sub3.readUnsignedByte((byte) 5);
		    if (i_23_ < 0 || i_23_ > 1) {
			try {
			    class408.close((byte) 52);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 2) {
			try {
			    class408.close((byte) 103);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_24_ = class241_sub3.readUnsignedShort(1162222719);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< i_24_ * 6) {
			try {
			    class408.close((byte) 48);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
			Class254 class254
			    = Class463.VAR_CLIENT_LIST
				  .decodeVarValue(class241_sub3, (byte) 9);
			if (((transmitLevels
			      [623518843 * class254.key])
			     == VarTransmitLevel.ON_SET_DIFFERENT)
			    && (Class463.VAR_CLIENT_LIST.list
				    (class254.key * 623518843,
				     -2033830832)
				    .dataType.getVarBaseType
				    (-1833944304).javaClass.isAssignableFrom
				(class254.value.getClass())))
			    varValues.method335((623518843
							  * (class254
							     .key)),
							 class254.value,
							 (byte) -97);
		    }
		} catch (Exception exception) {
		    try {
			class408.close((byte) 102);
		    } catch (Exception exception_26_) {
			exception = exception_26_;
		    }
		    break;
		}
		try {
		    class408.close((byte) 103);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Throwable object) {
		try {
		    class408.close((byte) 52);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method16193(RS3File class408) {
	do {
	    try {
		try {
		    byte[] is
			= new byte[(int) class408.method7326(-542107572)];
		    int i;
		    for (int i_27_ = 0; i_27_ < is.length; i_27_ += i) {
			i = class408.method7327(is, i_27_, is.length - i_27_,
						(byte) 108);
			if (i == -1)
			    throw new EOFException();
		    }
		    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 1) {
			try {
			    class408.close((byte) 105);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_28_ = class241_sub3.readUnsignedByte((byte) -93);
		    if (i_28_ < 0 || i_28_ > 1) {
			try {
			    class408.close((byte) 97);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 2) {
			try {
			    class408.close((byte) 90);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_29_ = class241_sub3.readUnsignedShort(1162222719);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< i_29_ * 6) {
			try {
			    class408.close((byte) 50);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
			Class254 class254
			    = Class463.VAR_CLIENT_LIST
				  .decodeVarValue(class241_sub3, (byte) 32);
			if (((transmitLevels
			      [623518843 * class254.key])
			     == VarTransmitLevel.ON_SET_DIFFERENT)
			    && (Class463.VAR_CLIENT_LIST.list
				    (class254.key * 623518843,
				     -1956665416)
				    .dataType.getVarBaseType
				    (990429109).javaClass.isAssignableFrom
				(class254.value.getClass())))
			    varValues.method335((623518843
							  * (class254
							     .key)),
							 class254.value,
							 (byte) -95);
		    }
		} catch (Exception exception) {
		    try {
			class408.close((byte) 37);
		    } catch (Exception exception_31_) {
			exception = exception_31_;
		    }
		    break;
		}
		try {
		    class408.close((byte) 105);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Throwable object) {
		try {
		    class408.close((byte) 26);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void dummyMethod16194(RS3File class408) {
	do {
	    try {
		try {
		    int i = 3;
		    int i_32_ = 0;
		    Iterator<Object> iterator = varValues.iterator();
		    while (iterator.hasNext()) {
			Class254 class254 = (Class254) iterator.next();
			if (VarTransmitLevel.ON_SET_DIFFERENT
			    == (transmitLevels
				[class254.key * 623518843])) {
			    i += Class463.VAR_CLIENT_LIST
				     .getValueEncodingLength(class254, -1008205396);
			    i_32_++;
			}
		    }
		    RSByteBuffer class241_sub3 = new RSByteBuffer(i);
		    class241_sub3.writeByte(1, -1322326486);
		    class241_sub3.writeShort(i_32_, -484048531);
		    Iterator<Object> iterator_33_ = varValues.iterator();
		    while (iterator_33_.hasNext()) {
			Class254 class254 = (Class254) iterator_33_.next();
			if ((transmitLevels
			     [class254.key * 623518843])
			    == VarTransmitLevel.ON_SET_DIFFERENT)
			    Class463.VAR_CLIENT_LIST.encodeVarValue
				(class241_sub3, class254, -301576454);
		    }
		    class408.write(class241_sub3.payload, 0,
					421967667 * class241_sub3.pointer,
					(byte) 103);
		} catch (Exception exception) {
		    try {
			class408.close((byte) 114);
		    } catch (Exception exception_34_) {
			exception = exception_34_;
		    }
		    break;
		}
		try {
		    class408.close((byte) 9);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Throwable object) {
		try {
		    class408.close((byte) 19);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
	aLong9857 = Class50.method1249((byte) 1) * -5678095026217719423L;
	aBool9851 = false;
    }
    
    public void dummyMethod16195(RS3File class408) {
	do {
	    try {
		try {
		    byte[] is
			= new byte[(int) class408.method7326(-542107572)];
		    int i;
		    for (int i_35_ = 0; i_35_ < is.length; i_35_ += i) {
			i = class408.method7327(is, i_35_, is.length - i_35_,
						(byte) 78);
			if (i == -1)
			    throw new EOFException();
		    }
		    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 1) {
			try {
			    class408.close((byte) 56);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_36_ = class241_sub3.readUnsignedByte((byte) 13);
		    if (i_36_ < 0 || i_36_ > 1) {
			try {
			    class408.close((byte) 22);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 2) {
			try {
			    class408.close((byte) 7);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_37_ = class241_sub3.readUnsignedShort(1162222719);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< i_37_ * 6) {
			try {
			    class408.close((byte) 69);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
			Class254 class254
			    = Class463.VAR_CLIENT_LIST
				  .decodeVarValue(class241_sub3, (byte) 40);
			if (((transmitLevels
			      [623518843 * class254.key])
			     == VarTransmitLevel.ON_SET_DIFFERENT)
			    && (Class463.VAR_CLIENT_LIST.list
				    (class254.key * 623518843,
				     -1487521425)
				    .dataType.getVarBaseType
				    (503895739).javaClass.isAssignableFrom
				(class254.value.getClass())))
			    varValues.method335((623518843
							  * (class254
							     .key)),
							 class254.value,
							 (byte) -72);
		    }
		} catch (Exception exception) {
		    try {
			class408.close((byte) 125);
		    } catch (Exception exception_39_) {
			exception = exception_39_;
		    }
		    break;
		}
		try {
		    class408.close((byte) 16);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Throwable object) {
		try {
		    class408.close((byte) 64);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void dummyMethod16196(RS3File class408) {
	do {
	    try {
		try {
		    byte[] is
			= new byte[(int) class408.method7326(-542107572)];
		    int i;
		    for (int i_40_ = 0; i_40_ < is.length; i_40_ += i) {
			i = class408.method7327(is, i_40_, is.length - i_40_,
						(byte) 35);
			if (i == -1)
			    throw new EOFException();
		    }
		    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 1) {
			try {
			    class408.close((byte) 42);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_41_ = class241_sub3.readUnsignedByte((byte) -27);
		    if (i_41_ < 0 || i_41_ > 1) {
			try {
			    class408.close((byte) 38);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 2) {
			try {
			    class408.close((byte) 63);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_42_ = class241_sub3.readUnsignedShort(1162222719);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< i_42_ * 6) {
			try {
			    class408.close((byte) 102);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
			Class254 class254
			    = Class463.VAR_CLIENT_LIST
				  .decodeVarValue(class241_sub3, (byte) 101);
			if (((transmitLevels
			      [623518843 * class254.key])
			     == VarTransmitLevel.ON_SET_DIFFERENT)
			    && (Class463.VAR_CLIENT_LIST.list
				    (class254.key * 623518843,
				     -2119360512)
				    .dataType.getVarBaseType
				    (-1602387073).javaClass.isAssignableFrom
				(class254.value.getClass())))
			    varValues.method335((623518843
							  * (class254
							     .key)),
							 class254.value,
							 (byte) 100);
		    }
		} catch (Exception exception) {
		    try {
			class408.close((byte) 62);
		    } catch (Exception exception_44_) {
			exception = exception_44_;
		    }
		    break;
		}
		try {
		    class408.close((byte) 100);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Throwable object) {
		try {
		    class408.close((byte) 110);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method16197(RS3File class408) {
	do {
	    try {
		try {
		    byte[] is
			= new byte[(int) class408.method7326(-542107572)];
		    int i;
		    for (int i_45_ = 0; i_45_ < is.length; i_45_ += i) {
			i = class408.method7327(is, i_45_, is.length - i_45_,
						(byte) 127);
			if (i == -1)
			    throw new EOFException();
		    }
		    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 1) {
			try {
			    class408.close((byte) 82);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_46_ = class241_sub3.readUnsignedByte((byte) 29);
		    if (i_46_ < 0 || i_46_ > 1) {
			try {
			    class408.close((byte) 31);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< 2) {
			try {
			    class408.close((byte) 92);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_47_ = class241_sub3.readUnsignedShort(1162222719);
		    if ((class241_sub3.payload.length
			 - class241_sub3.pointer * 421967667)
			< i_47_ * 6) {
			try {
			    class408.close((byte) 17);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
			Class254 class254
			    = Class463.VAR_CLIENT_LIST
				  .decodeVarValue(class241_sub3, (byte) 89);
			if (((transmitLevels
			      [623518843 * class254.key])
			     == VarTransmitLevel.ON_SET_DIFFERENT)
			    && (Class463.VAR_CLIENT_LIST.list
				    (class254.key * 623518843,
				     -1882432991)
				    .dataType.getVarBaseType
				    (-81261824).javaClass.isAssignableFrom
				(class254.value.getClass())))
			    varValues.method335((623518843
							  * (class254
							     .key)),
							 class254.value,
							 (byte) -70);
		    }
		} catch (Exception exception) {
		    try {
			class408.close((byte) 95);
		    } catch (Exception exception_49_) {
			exception = exception_49_;
		    }
		    break;
		}
		try {
		    class408.close((byte) 85);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Throwable object) {
		try {
		    class408.close((byte) 31);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method16198(RS3File class408) {
	do {
	    try {
		try {
		    int i = 3;
		    int i_50_ = 0;
		    Iterator<Object> iterator = varValues.iterator();
		    while (iterator.hasNext()) {
			Class254 class254 = (Class254) iterator.next();
			if (VarTransmitLevel.ON_SET_DIFFERENT
			    == (transmitLevels
				[class254.key * 623518843])) {
			    i += Class463.VAR_CLIENT_LIST
				     .getValueEncodingLength(class254, -406924052);
			    i_50_++;
			}
		    }
		    RSByteBuffer class241_sub3 = new RSByteBuffer(i);
		    class241_sub3.writeByte(1, -986494717);
		    class241_sub3.writeShort(i_50_, -484048531);
		    Iterator<Object> iterator_51_ = varValues.iterator();
		    while (iterator_51_.hasNext()) {
			Class254 class254 = (Class254) iterator_51_.next();
			if ((transmitLevels
			     [class254.key * 623518843])
			    == VarTransmitLevel.ON_SET_DIFFERENT)
			    Class463.VAR_CLIENT_LIST.encodeVarValue
				(class241_sub3, class254, -855028016);
		    }
		    class408.write(class241_sub3.payload, 0,
					421967667 * class241_sub3.pointer,
					(byte) 45);
		} catch (Exception exception) {
		    try {
			class408.close((byte) 92);
		    } catch (Exception exception_52_) {
			exception = exception_52_;
		    }
		    break;
		}
		try {
		    class408.close((byte) 18);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Throwable object) {
		try {
		    class408.close((byte) 53);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
	aLong9857 = Class50.method1249((byte) 1) * -5678095026217719423L;
	aBool9851 = false;
    }
    
    public void method16199() {
	if (Class50.method1249((byte) 1)
	    >= -4937952234456893149L * aLong9855) {
	    if (null == interfaceLayoutInfo) {
		if (!aBool9853)
		    return;
		interfaceLayoutInfo
		    = new Class254[aSet9854.size()];
		int i = 0;
		Iterator<Integer> iterator = aSet9854.iterator();
		while (iterator.hasNext()) {
		    int i_53_ = ((Integer) iterator.next()).intValue();
		    interfaceLayoutInfo[i++]
			= new Class254(i_53_,
				       varValues
					   .method344(i_53_, 2003153764));
		}
		layoutInfoSent = 0;
		aBool9853 = false;
		aSet9854.clear();
	    }
	    if (null != interfaceLayoutInfo
		&& (-1830972147 * layoutInfoSent
		    < interfaceLayoutInfo.length)) {
		ServerConnection class190 = ClanChannelDelta.method6943(-1522509709);
		if (class190.anInt2258 * -350916327 <= 1200) {
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.INTERFACE_LAYOUT_PACKET,
						     class190.packetCipher,
						     16711935);
		    class241_sub27.data
			.writeShort(0, -484048531);
		    int i = (class241_sub27.data.pointer
			     * 421967667);
		    class241_sub27.data.pointer
			+= -681042949;
		    for (/**/;
			 (-1830972147 * layoutInfoSent
			  < interfaceLayoutInfo.length);
			 layoutInfoSent += -1170980411) {
			Class254 class254
			    = (interfaceLayoutInfo
			       [(-1830972147
				 * layoutInfoSent)]);
			if ((class190.anInt2258 * -350916327
			     + (class241_sub27.data
				.pointer) * 421967667
			     + Class463.VAR_CLIENT_LIST
				   .getValueEncodingLength(class254, -1343260804))
			    > 1500)
			    break;
			Class463.VAR_CLIENT_LIST.encodeVarValue
			    (class241_sub27.data, class254,
			     -1537532026);
		    }
		    class241_sub27.data.endPacketVarShort
			(421967667 * (class241_sub27.data
				      .pointer) - i,
			 (byte) 116);
		    if (-1830972147 * layoutInfoSent
			>= interfaceLayoutInfo.length)
			class241_sub27.data
			    .payload[i]
			    = (byte) 1;
		    else
			class241_sub27.data
			    .payload[i]
			    = (byte) 0;
		    class190.sendPacket(class241_sub27, -1800447505);
		    aLong9855
			= ((Class50.method1249((byte) 1) + 1000L)
			   * -3501525299975799157L);
		}
	    }
	}
    }
    
    public void dummyMethod82(VarType class179, int i) {
	if ((transmitLevels
	     [414229387 * class179.id]) == VarTransmitLevel.ON_SET_DIFFERENT)
	    aBool9851 = true;
	else if (VarTransmitLevel.ON_SET_ALWAYS == (((VarClientDomain) this)
					     .transmitLevels
					     [414229387 * class179.id])
		 && getVarValueInt(class179, -704084531) != i) {
	    aBool9853 = true;
	    aSet9854.add(Integer.valueOf(414229387 * class179.id));
	}
	super.setVarValueInt(class179, i, -1828324260);
    }
    
    public VarClientDomain(VarTypeList class199_sub2) {
		super(class199_sub2);
		aBool9853 = false;
		aLong9855 = 3501525299975799157L;
		layoutInfoSent = 0;
		transmitLevels = new VarTransmitLevel[class199_sub2.length(1766317249)];
		for (int i = 0; i < class199_sub2.length(1766317249); i++) {
		    transmitLevels[i] = class199_sub2.list(i, -1532901884).clientTransmitLevel;
		}
		aSet9854 = new HashSet<Integer>(class199_sub2.length(1766317249));
    }
}
