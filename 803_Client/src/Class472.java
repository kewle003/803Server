/* Class472 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class472 implements Interface49
{
    public void method213(boolean bool) {
	/* empty */
    }
    
    public void method361(boolean bool, int i) {
	/* empty */
    }
    
    public void method360(int i, int i_0_, int i_1_, int i_2_) {
	int i_3_ = i >> 16;
	int i_4_ = i & 0xffff;
	synchronized (Class484.aQueue6468) {
	    Class484.aQueue6468.add(Class490.method11239(i_3_, i_4_, i_0_,
							 i_1_, 1881948882));
	}
    }
    
    public void method362(boolean bool) {
	/* empty */
    }
    
    public void method363(int i, int i_5_, int i_6_) {
	int i_7_ = i >> 16;
	int i_8_ = i & 0xffff;
	synchronized (Class484.aQueue6468) {
	    Class484.aQueue6468.add(Class490.method11239(i_7_, i_8_, i_5_,
							 i_6_, 1754795866));
	}
    }
    
    public void method212(boolean bool) {
	/* empty */
    }
    
    public void method359(int i, int i_9_, int i_10_) {
	int i_11_ = i >> 16;
	int i_12_ = i & 0xffff;
	synchronized (Class484.aQueue6468) {
	    Class484.aQueue6468.add(Class490.method11239(i_11_, i_12_, i_9_,
							 i_10_, 2001182295));
	}
    }
    
    public void method364(int i, int i_13_, int i_14_) {
	int i_15_ = i >> 16;
	int i_16_ = i & 0xffff;
	synchronized (Class484.aQueue6468) {
	    Class484.aQueue6468.add(Class490.method11239(i_15_, i_16_, i_13_,
							 i_14_, 1850932471));
	}
    }
    
    public void method365(int i, int i_17_, int i_18_) {
	int i_19_ = i >> 16;
	int i_20_ = i & 0xffff;
	synchronized (Class484.aQueue6468) {
	    Class484.aQueue6468.add(Class490.method11239(i_19_, i_20_, i_17_,
							 i_18_, 1727979231));
	}
    }
    
    public static final int method10782(ObjectDefinitionLoader objLoader, byte[] data, int i, int i_21_, int i_22_, int i_23_,
	 Class477 class477, Class477 class477_24_, byte i_25_) {
		int i_26_ = 0;
		RSByteBuffer buffer = new RSByteBuffer(data);
		int objectID = -1;
		for (;;) {
		    int modifier = buffer.readSmart2(-76202703);
		    if (modifier == 0) {
		    	break;
		    }
		    objectID += modifier;
		    int location = 0;
		    boolean bool = false;
		    for (;;) {
				if (bool) {
				    int i_30_ = buffer.readSmart((short) -17933);
				    if (0 == i_30_) {
				    	break;
				    }
				    buffer.readUnsignedByte((byte) -89);
				} else {
				    int locationModifier = buffer.readSmart((short) -6617);
				    if (0 == locationModifier) {
				    	break;
				    }
				    location += locationModifier - 1;
				    int i_32_ = location & 0x3f;
				    int i_33_ = location >> 6 & 0x3f;
				    int objectData = buffer.readUnsignedByte((byte) -65) >> 2;
				    int direction = objectData & 0x3;
				    objectData >>= 2;
				    int i_36_ = i + i_33_;
				    int i_37_ = i_32_ + i_21_;
				    ObjectDefinition objDef = objLoader.getObjectDefinition(objectID, 577892407);
				    int i_38_;
				    int i_39_;
				    if (0 == (direction & 0x1)) {
						i_38_ = objDef.sizeX * 1351092869;
						i_39_ = 333584223 * objDef.sizeY;
				    } else {
						i_38_ = objDef.sizeY * 333584223;
						i_39_ = objDef.sizeX * 1351092869;
				    }
				    if (i_36_ < i_22_ && i_37_ < i_23_ && i_36_ + i_38_ >= 0 && i_39_ + i_37_ >= 0) {
						if ((Class527.aClass527_6917.anInt6931 * -2030829961 != objectData)
								|| Class241_Sub5_Sub9.aClass241_Sub9_11043
								.aClass445_Sub18_8862.method14262((byte) 104) != 0
								|| 0 != -1389471035 * objDef.anInt6848
								|| 1 == objDef.clipType * 811987171
								|| objDef.aBool6879) {
						    if (!objDef.method11764(class477_24_, 212986876)) {
								class477.anInt6401 = objectID * 1036614483;
								i_26_++;
						    }
						    bool = true;
						}
				    }
				}
		    }
		}
		return i_26_;
    }
}
