/* Class464 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public abstract class Class464
{
    int anInt6290;
    long aLong6291;
    long aLong6292;
    int anInt6293;
    NodeCollection aClass429_6294 = new NodeCollection();
    
    abstract void method10680(RSByteBuffer class241_sub3,
			      Class241_Sub24 class241_sub24);
    
    void method10681(byte i) {
		if (method10690(1816486515)) {
			Class241_Sub27 packet = null;
			int startOffset = 0;
			int i_1_ = 0;
			int interfaceCount = 0;
			Iterator iterator = aClass429_6294.iterator();
			while (iterator.hasNext()) {
				Class241_Sub24 class241_sub24 = (Class241_Sub24) iterator.next();
				if (null != packet && (421967667 * (packet.data.pointer) - startOffset >= 252 - (6 + method10685((byte) 95)))) {
					break;
				}
				class241_sub24.remove((byte) 36);
				int posX = class241_sub24.getY((byte) 95);
				if (posX < -1) {
					posX = -1;
				} else if (posX > 65534) {
					posX = 65534;
				}
				int posY = class241_sub24.getX((byte) -5);
				if (posY < -1) {
					posY = -1;
				} else if (posY > 65534) {
					posY = 65534;
				}
				if (anInt6290 * 1980466661 == posY && posX == anInt6293 * 209718611) {
					class241_sub24.method15070(-63491259);
				} else {
					if (packet == null) {
						packet = makePacket(-234269752);
						packet.data.writeByte(0, -1275738458);
						startOffset = (packet.data.pointer) * 421967667;
						packet.data.pointer += -1362085898;//2
						i_1_ = 0;
						interfaceCount = 0;
					}
					int i_5_;
					int i_6_;
					int i_7_;
					if (-1L != (aLong6292 * -3288374089961196625L)) {
						i_5_ = posY - 1980466661 * anInt6290;
						i_6_ = posX - 209718611 * anInt6293;
						i_7_ = (int) ((class241_sub24.method15069(-335060091)
								- (aLong6292 * -3288374089961196625L)) / 20L);
						i_1_ += (class241_sub24.method15069(-178958593)
								- (aLong6292 * -3288374089961196625L)) % 20L;
					} else {
						i_5_ = posY;
						i_6_ = posX;
						i_7_ = 2147483647;
					}
					anInt6290 = -1765789715 * posY;
					anInt6293 = posX * 1175174875;
					if (i_7_ < 8 && i_5_ >= -32 && i_5_ <= 31 && i_6_ >= -32 && i_6_ <= 31) {
						i_5_ += 32;
						i_6_ += 32;
						packet.data.writeShort((i_5_ << 6) + (i_7_ << 12) + i_6_, -484048531);
					} else if (i_7_ < 32 && i_5_ >= -128 && i_5_ <= 127 && i_6_ >= -128 && i_6_ <= 127) {
						i_5_ += 128;
						i_6_ += 128;
						packet.data.writeByte(128 + i_7_, -1556161683);
						packet.data.writeShort(i_6_ + (i_5_ << 8), -484048531);
					} else if (i_7_ < 32) {
						packet.data.writeByte(192 + i_7_, -1305570763);
						if (posY == -1 || posX == -1) {
							packet.data.writeInt(-2147483648, -1140473660);
						} else {
							packet.data.writeInt(posY | posX << 16, -383525236);
						}
					} else {
						packet.data.writeShort((i_7_ & 0x1fff) + 57344, -484048531);
						if (-1 == posY || posX == -1) {
							packet.data.writeInt(-2147483648, -1832924958);
						} else {
							packet.data.writeInt(posY | posX << 16, 1018086778);
						}
					}
					interfaceCount++;
					method10686(packet.data, class241_sub24, 1512653022);
					aLong6292 = (class241_sub24.method15069(-681941094) * -2188398077916249265L);
					class241_sub24.method15070(-1622992257);
				}
			}
			if (packet != null) {
				packet.data.endPacketVarByte((packet.data.pointer * 421967667) - startOffset, 1794336190);
				int endOffset = (421967667 * packet.data.pointer);
				packet.data.pointer = startOffset * -681042949;
				packet.data.writeByte(i_1_ / interfaceCount, 480080862);
				packet.data.writeByte(i_1_ % interfaceCount, 656601850);
				packet.data.pointer = endOffset * -681042949;
				client.aClass190_8340.sendPacket(packet, -1676933926);
			}
		}
		method10687((byte) 49);
    }
    
    void method10682(int i) {
	aClass429_6294.method7652((byte) 92);
	aLong6291 = 2372392126859809783L;
	aLong6292 = 2188398077916249265L;
	anInt6290 = 1765789715;
	anInt6293 = -1175174875;
    }
    
    void method10683(Class241_Sub24 class241_sub24, int i) {
	aClass429_6294.addNode(class241_sub24,
						    (short) -26688);
    }
    
    void method10684() {
	if (method10690(-983075632)) {
	    Class241_Sub27 class241_sub27 = null;
	    int i = 0;
	    int i_9_ = 0;
	    int i_10_ = 0;
	    Iterator iterator = aClass429_6294.iterator();
	    while (iterator.hasNext()) {
		Class241_Sub24 class241_sub24
		    = (Class241_Sub24) iterator.next();
		if (null != class241_sub27
		    && (421967667 * (class241_sub27.data
				     .pointer) - i
			>= 252 - (6 + method10685((byte) 76))))
		    break;
		class241_sub24.remove((byte) 36);
		int i_11_ = class241_sub24.getY((byte) 84);
		if (i_11_ < -1)
		    i_11_ = -1;
		else if (i_11_ > 65534)
		    i_11_ = 65534;
		int i_12_ = class241_sub24.getX((byte) -41);
		if (i_12_ < -1)
		    i_12_ = -1;
		else if (i_12_ > 65534)
		    i_12_ = 65534;
		if (anInt6290 * 1980466661 == i_12_
		    && i_11_ == anInt6293 * 209718611)
		    class241_sub24.method15070(715572663);
		else {
		    if (class241_sub27 == null) {
			class241_sub27 = makePacket(-368232647);
			class241_sub27.data
			    .writeByte(0, 950423569);
			i = (class241_sub27.data.pointer
			     * 421967667);
			class241_sub27.data.pointer
			    += -1362085898;
			i_9_ = 0;
			i_10_ = 0;
		    }
		    int i_13_;
		    int i_14_;
		    int i_15_;
		    if (-1L != (aLong6292
				* -3288374089961196625L)) {
			i_13_
			    = i_12_ - 1980466661 * anInt6290;
			i_14_
			    = i_11_ - 209718611 * anInt6293;
			i_15_ = (int) ((class241_sub24.method15069(1609527956)
					- (aLong6292
					   * -3288374089961196625L))
				       / 20L);
			i_9_ += (class241_sub24.method15069(-1263201748)
				 - (aLong6292
				    * -3288374089961196625L)) % 20L;
		    } else {
			i_13_ = i_12_;
			i_14_ = i_11_;
			i_15_ = 2147483647;
		    }
		    anInt6290 = -1765789715 * i_12_;
		    anInt6293 = i_11_ * 1175174875;
		    if (i_15_ < 8 && i_13_ >= -32 && i_13_ <= 31
			&& i_14_ >= -32 && i_14_ <= 31) {
			i_13_ += 32;
			i_14_ += 32;
			class241_sub27.data.writeShort
			    ((i_13_ << 6) + (i_15_ << 12) + i_14_, -484048531);
		    } else if (i_15_ < 32 && i_13_ >= -128 && i_13_ <= 127
			       && i_14_ >= -128 && i_14_ <= 127) {
			i_13_ += 128;
			i_14_ += 128;
			class241_sub27.data
			    .writeByte(128 + i_15_, 1454028483);
			class241_sub27.data
			    .writeShort(i_14_ + (i_13_ << 8), -484048531);
		    } else if (i_15_ < 32) {
			class241_sub27.data
			    .writeByte(192 + i_15_, -87606026);
			if (i_12_ == -1 || i_11_ == -1)
			    class241_sub27.data
				.writeInt(-2147483648, 436648241);
			else
			    class241_sub27.data
				.writeInt(i_12_ | i_11_ << 16, -1756431989);
		    } else {
			class241_sub27.data
			    .writeShort((i_15_ & 0x1fff) + 57344, -484048531);
			if (-1 == i_12_ || i_11_ == -1)
			    class241_sub27.data
				.writeInt(-2147483648, 228203583);
			else
			    class241_sub27.data
				.writeInt(i_12_ | i_11_ << 16, -173437915);
		    }
		    i_10_++;
		    method10686(class241_sub27.data,
				class241_sub24, 2002205922);
		    aLong6292
			= (class241_sub24.method15069(612427993)
			   * -2188398077916249265L);
		    class241_sub24.method15070(-1986449124);
		}
	    }
	    if (class241_sub27 != null) {
		class241_sub27.data.endPacketVarByte
		    ((class241_sub27.data.pointer
		      * 421967667) - i,
		     1964165088);
		int i_16_
		    = (421967667
		       * class241_sub27.data.pointer);
		class241_sub27.data.pointer
		    = i * -681042949;
		class241_sub27.data
		    .writeByte(i_9_ / i_10_, 929615016);
		class241_sub27.data
		    .writeByte(i_9_ % i_10_, 1171013783);
		class241_sub27.data.pointer
		    = i_16_ * -681042949;
		client.aClass190_8340.sendPacket(class241_sub27, -1804518926);
	    }
	}
	method10687((byte) -46);
    }
    
    abstract int method10685(byte i);
    
    abstract void method10686(RSByteBuffer class241_sub3,
			      Class241_Sub24 class241_sub24, int i);
    
    abstract void method10687(byte i);
    
    void method10688() {
	aClass429_6294.method7652((byte) 90);
	aLong6291 = 2372392126859809783L;
	aLong6292 = 2188398077916249265L;
	anInt6290 = 1765789715;
	anInt6293 = -1175174875;
    }
    
    abstract Class241_Sub27 makePacket(int i);
    
    abstract boolean method10690(int i);
    
    abstract void method10691();
    
    abstract void method10692();
    
    abstract boolean method10693();
    
    abstract Class241_Sub27 method10694();
    
    abstract int method10695();
    
    abstract void method10696(RSByteBuffer class241_sub3,
			      Class241_Sub24 class241_sub24);
    
    abstract void method10697(RSByteBuffer class241_sub3,
			      Class241_Sub24 class241_sub24);
    
    Class464() {
	aLong6291 = 2372392126859809783L;
	aLong6292 = 2188398077916249265L;
	anInt6290 = 1765789715;
	anInt6293 = -1175174875;
    }
    
    void method10698() {
	if (method10690(-1760359516)) {
	    Class241_Sub27 class241_sub27 = null;
	    int i = 0;
	    int i_17_ = 0;
	    int i_18_ = 0;
	    Iterator iterator = aClass429_6294.iterator();
	    while (iterator.hasNext()) {
		Class241_Sub24 class241_sub24
		    = (Class241_Sub24) iterator.next();
		if (null != class241_sub27
		    && (421967667 * (class241_sub27.data
				     .pointer) - i
			>= 252 - (6 + method10685((byte) -99))))
		    break;
		class241_sub24.remove((byte) 36);
		int i_19_ = class241_sub24.getY((byte) 97);
		if (i_19_ < -1)
		    i_19_ = -1;
		else if (i_19_ > 65534)
		    i_19_ = 65534;
		int i_20_ = class241_sub24.getX((byte) 84);
		if (i_20_ < -1)
		    i_20_ = -1;
		else if (i_20_ > 65534)
		    i_20_ = 65534;
		if (anInt6290 * 1980466661 == i_20_
		    && i_19_ == anInt6293 * 209718611)
		    class241_sub24.method15070(-1605383282);
		else {
		    if (class241_sub27 == null) {
			class241_sub27 = makePacket(-1742661498);
			class241_sub27.data
			    .writeByte(0, -90938266);
			i = (class241_sub27.data.pointer
			     * 421967667);
			class241_sub27.data.pointer
			    += -1362085898;
			i_17_ = 0;
			i_18_ = 0;
		    }
		    int i_21_;
		    int i_22_;
		    int i_23_;
		    if (-1L != (aLong6292
				* -3288374089961196625L)) {
			i_21_
			    = i_20_ - 1980466661 * anInt6290;
			i_22_
			    = i_19_ - 209718611 * anInt6293;
			i_23_ = (int) ((class241_sub24.method15069(404880786)
					- (aLong6292
					   * -3288374089961196625L))
				       / 20L);
			i_17_ += (class241_sub24.method15069(-1723083320)
				  - (aLong6292
				     * -3288374089961196625L)) % 20L;
		    } else {
			i_21_ = i_20_;
			i_22_ = i_19_;
			i_23_ = 2147483647;
		    }
		    anInt6290 = -1765789715 * i_20_;
		    anInt6293 = i_19_ * 1175174875;
		    if (i_23_ < 8 && i_21_ >= -32 && i_21_ <= 31
			&& i_22_ >= -32 && i_22_ <= 31) {
			i_21_ += 32;
			i_22_ += 32;
			class241_sub27.data.writeShort
			    ((i_21_ << 6) + (i_23_ << 12) + i_22_, -484048531);
		    } else if (i_23_ < 32 && i_21_ >= -128 && i_21_ <= 127
			       && i_22_ >= -128 && i_22_ <= 127) {
			i_21_ += 128;
			i_22_ += 128;
			class241_sub27.data
			    .writeByte(128 + i_23_, -1542589504);
			class241_sub27.data
			    .writeShort(i_22_ + (i_21_ << 8), -484048531);
		    } else if (i_23_ < 32) {
			class241_sub27.data
			    .writeByte(192 + i_23_, -380336314);
			if (i_20_ == -1 || i_19_ == -1)
			    class241_sub27.data
				.writeInt(-2147483648, -746525812);
			else
			    class241_sub27.data
				.writeInt(i_20_ | i_19_ << 16, 249921921);
		    } else {
			class241_sub27.data
			    .writeShort((i_23_ & 0x1fff) + 57344, -484048531);
			if (-1 == i_20_ || i_19_ == -1)
			    class241_sub27.data
				.writeInt(-2147483648, -915616528);
			else
			    class241_sub27.data
				.writeInt(i_20_ | i_19_ << 16, 2091898662);
		    }
		    i_18_++;
		    method10686(class241_sub27.data,
				class241_sub24, 1097422114);
		    aLong6292
			= (class241_sub24.method15069(1874965298)
			   * -2188398077916249265L);
		    class241_sub24.method15070(-1206046828);
		}
	    }
	    if (class241_sub27 != null) {
		class241_sub27.data.endPacketVarByte
		    ((class241_sub27.data.pointer
		      * 421967667) - i,
		     2068890831);
		int i_24_
		    = (421967667
		       * class241_sub27.data.pointer);
		class241_sub27.data.pointer
		    = i * -681042949;
		class241_sub27.data
		    .writeByte(i_17_ / i_18_, -396526207);
		class241_sub27.data
		    .writeByte(i_17_ % i_18_, -1245379102);
		class241_sub27.data.pointer
		    = i_24_ * -681042949;
		client.aClass190_8340.sendPacket(class241_sub27, -1499076266);
	    }
	}
	method10687((byte) -22);
    }
    
    void method10699() {
	if (method10690(-188127230)) {
	    Class241_Sub27 class241_sub27 = null;
	    int i = 0;
	    int i_25_ = 0;
	    int i_26_ = 0;
	    Iterator iterator = aClass429_6294.iterator();
	    while (iterator.hasNext()) {
		Class241_Sub24 class241_sub24
		    = (Class241_Sub24) iterator.next();
		if (null != class241_sub27
		    && (421967667 * (class241_sub27.data
				     .pointer) - i
			>= 252 - (6 + method10685((byte) -29))))
		    break;
		class241_sub24.remove((byte) 36);
		int i_27_ = class241_sub24.getY((byte) 116);
		if (i_27_ < -1)
		    i_27_ = -1;
		else if (i_27_ > 65534)
		    i_27_ = 65534;
		int i_28_ = class241_sub24.getX((byte) -93);
		if (i_28_ < -1)
		    i_28_ = -1;
		else if (i_28_ > 65534)
		    i_28_ = 65534;
		if (anInt6290 * 1980466661 == i_28_
		    && i_27_ == anInt6293 * 209718611)
		    class241_sub24.method15070(-1991770167);
		else {
		    if (class241_sub27 == null) {
			class241_sub27 = makePacket(-257825198);
			class241_sub27.data
			    .writeByte(0, -1343041008);
			i = (class241_sub27.data.pointer
			     * 421967667);
			class241_sub27.data.pointer
			    += -1362085898;
			i_25_ = 0;
			i_26_ = 0;
		    }
		    int i_29_;
		    int i_30_;
		    int i_31_;
		    if (-1L != (aLong6292
				* -3288374089961196625L)) {
			i_29_
			    = i_28_ - 1980466661 * anInt6290;
			i_30_
			    = i_27_ - 209718611 * anInt6293;
			i_31_ = (int) ((class241_sub24.method15069(-1687671286)
					- (aLong6292
					   * -3288374089961196625L))
				       / 20L);
			i_25_ += (class241_sub24.method15069(-1271553168)
				  - (aLong6292
				     * -3288374089961196625L)) % 20L;
		    } else {
			i_29_ = i_28_;
			i_30_ = i_27_;
			i_31_ = 2147483647;
		    }
		    anInt6290 = -1765789715 * i_28_;
		    anInt6293 = i_27_ * 1175174875;
		    if (i_31_ < 8 && i_29_ >= -32 && i_29_ <= 31
			&& i_30_ >= -32 && i_30_ <= 31) {
			i_29_ += 32;
			i_30_ += 32;
			class241_sub27.data.writeShort
			    ((i_29_ << 6) + (i_31_ << 12) + i_30_, -484048531);
		    } else if (i_31_ < 32 && i_29_ >= -128 && i_29_ <= 127
			       && i_30_ >= -128 && i_30_ <= 127) {
			i_29_ += 128;
			i_30_ += 128;
			class241_sub27.data
			    .writeByte(128 + i_31_, -645191822);
			class241_sub27.data
			    .writeShort(i_30_ + (i_29_ << 8), -484048531);
		    } else if (i_31_ < 32) {
			class241_sub27.data
			    .writeByte(192 + i_31_, -1284175042);
			if (i_28_ == -1 || i_27_ == -1)
			    class241_sub27.data
				.writeInt(-2147483648, -719257508);
			else
			    class241_sub27.data
				.writeInt(i_28_ | i_27_ << 16, -1137609610);
		    } else {
			class241_sub27.data
			    .writeShort((i_31_ & 0x1fff) + 57344, -484048531);
			if (-1 == i_28_ || i_27_ == -1)
			    class241_sub27.data
				.writeInt(-2147483648, 577562300);
			else
			    class241_sub27.data
				.writeInt(i_28_ | i_27_ << 16, 1929169526);
		    }
		    i_26_++;
		    method10686(class241_sub27.data,
				class241_sub24, 1857306634);
		    aLong6292
			= (class241_sub24.method15069(1363044012)
			   * -2188398077916249265L);
		    class241_sub24.method15070(713617110);
		}
	    }
	    if (class241_sub27 != null) {
		class241_sub27.data.endPacketVarByte
		    ((class241_sub27.data.pointer
		      * 421967667) - i,
		     1367491591);
		int i_32_
		    = (421967667
		       * class241_sub27.data.pointer);
		class241_sub27.data.pointer
		    = i * -681042949;
		class241_sub27.data
		    .writeByte(i_25_ / i_26_, -1164683158);
		class241_sub27.data
		    .writeByte(i_25_ % i_26_, -1304779655);
		class241_sub27.data.pointer
		    = i_32_ * -681042949;
		client.aClass190_8340.sendPacket(class241_sub27, -1596830575);
	    }
	}
	method10687((byte) 90);
    }
    
    int method10700(Class241_Sub24 class241_sub24, int i, int i_33_) {
	long l;
	if (-1L == 7243247455889973817L * aLong6291)
	    l = (long) i;
	else {
	    l = (class241_sub24.method15069(-448905530)
		 - 7243247455889973817L * aLong6291);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong6291
	    = class241_sub24.method15069(-282680155) * -2372392126859809783L;
	return (int) l;
    }
    
    abstract void method10701();
    
    void method10702() {
	aClass429_6294.method7652((byte) 71);
	aLong6291 = 2372392126859809783L;
	aLong6292 = 2188398077916249265L;
	anInt6290 = 1765789715;
	anInt6293 = -1175174875;
    }
    
    int method10703(Class241_Sub24 class241_sub24, int i) {
	long l;
	if (-1L == 7243247455889973817L * aLong6291)
	    l = (long) i;
	else {
	    l = (class241_sub24.method15069(-2037600751)
		 - 7243247455889973817L * aLong6291);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong6291
	    = class241_sub24.method15069(1928771733) * -2372392126859809783L;
	return (int) l;
    }
    
    static final void method10704(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	Class76.method1771(class58, class454, -693666608);
    }
    
    static final void setMainVarClanSettings/*method10705*/(ClientScriptData scriptData, byte i) {
		if (GraphicsDefinitionLoader.mainClanSettings != null) {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= 1;
			scriptData.clanSettings = GraphicsDefinitionLoader.mainClanSettings;
			scriptData.aMap6241.put(
					VarDomainType.CLAN_SETTING,
					Class499.method11333(scriptData.clanSettings, (byte) -1));
		} else {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= 0;
		}
    }
    
    static final void method10706(ClientScriptData class454, int i) {
	Class448.method7924(694012827);
	Class486.method11126((byte) -11);
	client.aClass238_8477.method4768((byte) 5);
	Class167.method3600((short) 7254);
	client.aBool8297 = false;
    }
    
    public static void method10707(String[] strings, int[] is, int i) {
		Class501.method11444(strings, is, 0, strings.length - 1, -324903265);
    }
    
    static final void method10708(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
    }
}
