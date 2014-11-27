/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Huffman
{
    byte[] huffmanAlgorithm2;//aByteArray1150
    int[] huffmanAlgorithm1;//anIntArray1151
    int[] huffmanAlgorithm3;//anIntArray1152
    
    int decryptMessage/*method1816*/(byte[] streamBuffer, int streamOffset, byte[] messageData, 
    		int messageDataOffset, int messagedDataLength, byte i_3_) {
		if (0 == messagedDataLength) {
		    return 0;
		}
		int pointer = 0;
		messagedDataLength += messageDataOffset;
		int outputSize = streamOffset;
		for (;;) {
		    byte codeword = streamBuffer[outputSize];
		    if (codeword < 0) {
		    	pointer = huffmanAlgorithm3[pointer];
		    } else {
		    	pointer++;
		    }
		    int value;
		    if ((value = huffmanAlgorithm3[pointer]) < 0) {
		    	messageData[messageDataOffset++] = (byte) (value ^ 0xffffffff);
				if (messageDataOffset >= messagedDataLength) {
				    break;
				}
				pointer = 0;
		    }
		    if ((codeword & 0x40) != 0) {
		    	pointer = huffmanAlgorithm3[pointer];
		    } else {
		    	pointer++;
		    }
		    if ((value = huffmanAlgorithm3[pointer]) < 0) {
		    	messageData[messageDataOffset++] = (byte) (value ^ 0xffffffff);
				if (messageDataOffset >= messagedDataLength) {
				    break;
				}
				pointer = 0;
		    }
		    if ((codeword & 0x20) != 0) {
		    	pointer = huffmanAlgorithm3[pointer];
		    } else {
		    	pointer++;
		    }
		    if ((value = huffmanAlgorithm3[pointer]) < 0) {
		    	messageData[messageDataOffset++] = (byte) (value ^ 0xffffffff);
				if (messageDataOffset >= messagedDataLength) {
				    break;
				}
				pointer = 0;
		    }
		    if (0 != (codeword & 0x10)) {
		    	pointer = huffmanAlgorithm3[pointer];
		    } else {
		    	pointer++;
		    }
		    if ((value = huffmanAlgorithm3[pointer]) < 0) {
		    	messageData[messageDataOffset++] = (byte) (value ^ 0xffffffff);
				if (messageDataOffset >= messagedDataLength) {
				    break;
				}
				pointer = 0;
		    }
		    if ((codeword & 0x8) != 0) {
		    	pointer = huffmanAlgorithm3[pointer];
		    } else {
		    	pointer++;
		    }
		    if ((value = huffmanAlgorithm3[pointer]) < 0) {
		    	messageData[messageDataOffset++] = (byte) (value ^ 0xffffffff);
				if (messageDataOffset >= messagedDataLength) {
				    break;
				}
				pointer = 0;
		    }
		    if (0 != (codeword & 0x4)) {
		    	pointer = huffmanAlgorithm3[pointer];
		    } else {
		    	pointer++;
		    }
		    if ((value = huffmanAlgorithm3[pointer]) < 0) {
		    	messageData[messageDataOffset++] = (byte) (value ^ 0xffffffff);
				if (messageDataOffset >= messagedDataLength) {
				    break;
				}
				pointer = 0;
		    }
		    if ((codeword & 0x2) != 0) {
		    	pointer = huffmanAlgorithm3[pointer];
		    } else {
		    	pointer++;
		    }
		    if ((value = huffmanAlgorithm3[pointer]) < 0) {
		    	messageData[messageDataOffset++] = (byte) (value ^ 0xffffffff);
				if (messageDataOffset >= messagedDataLength) {
				    break;
				}
				pointer = 0;
		    }
		    if (0 != (codeword & 0x1)) {
		    	pointer = huffmanAlgorithm3[pointer];
		    } else {
		    	pointer++;
		    }
		    if ((value = huffmanAlgorithm3[pointer]) < 0) {
		    	messageData[messageDataOffset++] = (byte) (value ^ 0xffffffff);
				if (messageDataOffset >= messagedDataLength) {
				    break;
				}
				pointer = 0;
		    }
		    outputSize++;
		}
		return outputSize + 1 - streamOffset;
    }
    
    int encryptMessage/*method1817*/(byte[] messageData, int messageDataOffset, int messageDataLength, 
    		byte[] streamBuffer, int streamOffset, byte i_11_) {
		int i_12_ = 0;
		int i_13_ = streamOffset << 3;
		for (messageDataLength += messageDataOffset; messageDataOffset < messageDataLength; messageDataOffset++) {
		    int value = messageData[messageDataOffset] & 0xff;
		    int codeword = huffmanAlgorithm1[value];
		    int codewordSize = huffmanAlgorithm2[value];
		    if (0 == codewordSize) {
		    	throw new RuntimeException(new StringBuilder().append("").append(value).toString());
		    }
		    int streamPointer = i_13_ >> 3;
		    int i_18_ = i_13_ & 0x7;
		    i_12_ &= -i_18_ >> 31;
		    int i_19_ = streamPointer + (codewordSize + i_18_ - 1 >> 3);
		    i_18_ += 24;
		    streamBuffer[streamPointer] = (byte) (i_12_ |= codeword >>> i_18_);
		    if (streamPointer < i_19_) {
		    	streamPointer++;
				i_18_ -= 8;
				streamBuffer[streamPointer] = (byte) (i_12_ = codeword >>> i_18_);
				if (streamPointer < i_19_) {
					streamPointer++;
				    i_18_ -= 8;
				    streamBuffer[streamPointer] = (byte) (i_12_ = codeword >>> i_18_);
				    if (streamPointer < i_19_) {
				    	streamPointer++;
						i_18_ -= 8;
						streamBuffer[streamPointer] = (byte) (i_12_ = codeword >>> i_18_);
						if (streamPointer < i_19_) {
							streamPointer++;
						    i_18_ -= 8;
						    streamBuffer[streamPointer] = (byte) (i_12_ = codeword << -i_18_);
						}
				    }
				}
		    }
		    i_13_ += codewordSize;
		}
		return (7 + i_13_ >> 3) - streamOffset;
    }
    
    int method1818(byte[] is, int i, byte[] is_20_, int i_21_, int i_22_) {
	if (0 == i_22_)
	    return 0;
	int i_23_ = 0;
	i_22_ += i_21_;
	int i_24_ = i;
	for (;;) {
	    byte i_25_ = is[i_24_];
	    if (i_25_ < 0)
		i_23_ = huffmanAlgorithm3[i_23_];
	    else
		i_23_++;
	    int i_26_;
	    if ((i_26_ = huffmanAlgorithm3[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x40) != 0)
		i_23_ = huffmanAlgorithm3[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = huffmanAlgorithm3[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x20) != 0)
		i_23_ = huffmanAlgorithm3[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = huffmanAlgorithm3[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if (0 != (i_25_ & 0x10))
		i_23_ = huffmanAlgorithm3[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = huffmanAlgorithm3[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x8) != 0)
		i_23_ = huffmanAlgorithm3[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = huffmanAlgorithm3[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if (0 != (i_25_ & 0x4))
		i_23_ = huffmanAlgorithm3[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = huffmanAlgorithm3[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if ((i_25_ & 0x2) != 0)
		i_23_ = huffmanAlgorithm3[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = huffmanAlgorithm3[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    if (0 != (i_25_ & 0x1))
		i_23_ = huffmanAlgorithm3[i_23_];
	    else
		i_23_++;
	    if ((i_26_ = huffmanAlgorithm3[i_23_]) < 0) {
		is_20_[i_21_++] = (byte) (i_26_ ^ 0xffffffff);
		if (i_21_ >= i_22_)
		    break;
		i_23_ = 0;
	    }
	    i_24_++;
	}
	return i_24_ + 1 - i;
    }
    
    public Huffman(byte[] data) {
		int i = data.length;
		huffmanAlgorithm1 = new int[i];
		huffmanAlgorithm2 = data;
		int[] is_27_ = new int[33];
		huffmanAlgorithm3 = new int[8];
		int i_28_ = 0;
		for (int i_29_ = 0; i_29_ < i; i_29_++) {
		    int i_30_ = data[i_29_];
		    if (i_30_ != 0) {
			int i_31_ = 1 << 32 - i_30_;
			int i_32_ = is_27_[i_30_];
			huffmanAlgorithm1[i_29_] = i_32_;
			int i_33_;
			if (0 != (i_32_ & i_31_))
			    i_33_ = is_27_[i_30_ - 1];
			else {
			    i_33_ = i_32_ | i_31_;
			    for (int i_34_ = i_30_ - 1; i_34_ >= 1; i_34_--) {
				int i_35_ = is_27_[i_34_];
				if (i_35_ != i_32_)
				    break;
				int i_36_ = 1 << 32 - i_34_;
				if ((i_35_ & i_36_) != 0) {
				    is_27_[i_34_] = is_27_[i_34_ - 1];
				    break;
				}
				is_27_[i_34_] = i_35_ | i_36_;
			    }
			}
			is_27_[i_30_] = i_33_;
			for (int i_37_ = i_30_ + 1; i_37_ <= 32; i_37_++) {
			    if (i_32_ == is_27_[i_37_])
				is_27_[i_37_] = i_33_;
			}
			int i_38_ = 0;
			for (int i_39_ = 0; i_39_ < i_30_; i_39_++) {
			    int i_40_ = -2147483648 >>> i_39_;
			    if ((i_32_ & i_40_) != 0) {
				if (0 == huffmanAlgorithm3[i_38_])
				    huffmanAlgorithm3[i_38_] = i_28_;
				i_38_ = huffmanAlgorithm3[i_38_];
			    } else
				i_38_++;
			    if (i_38_ >= huffmanAlgorithm3.length) {
				int[] is_41_
				    = (new int
				       [huffmanAlgorithm3.length * 2]);
				for (int i_42_ = 0;
				     i_42_ < huffmanAlgorithm3.length;
				     i_42_++)
				    is_41_[i_42_]
					= huffmanAlgorithm3[i_42_];
				huffmanAlgorithm3 = is_41_;
			    }
			    i_40_ >>>= 1;
			}
			huffmanAlgorithm3[i_38_] = i_29_ ^ 0xffffffff;
			if (i_38_ >= i_28_)
			    i_28_ = i_38_ + 1;
		    }
		}
    }
    
    int method1819(byte[] is, int i, byte[] is_43_, int i_44_, int i_45_) {
	if (0 == i_45_)
	    return 0;
	int i_46_ = 0;
	i_45_ += i_44_;
	int i_47_ = i;
	for (;;) {
	    byte i_48_ = is[i_47_];
	    if (i_48_ < 0)
		i_46_ = huffmanAlgorithm3[i_46_];
	    else
		i_46_++;
	    int i_49_;
	    if ((i_49_ = huffmanAlgorithm3[i_46_]) < 0) {
		is_43_[i_44_++] = (byte) (i_49_ ^ 0xffffffff);
		if (i_44_ >= i_45_)
		    break;
		i_46_ = 0;
	    }
	    if ((i_48_ & 0x40) != 0)
		i_46_ = huffmanAlgorithm3[i_46_];
	    else
		i_46_++;
	    if ((i_49_ = huffmanAlgorithm3[i_46_]) < 0) {
		is_43_[i_44_++] = (byte) (i_49_ ^ 0xffffffff);
		if (i_44_ >= i_45_)
		    break;
		i_46_ = 0;
	    }
	    if ((i_48_ & 0x20) != 0)
		i_46_ = huffmanAlgorithm3[i_46_];
	    else
		i_46_++;
	    if ((i_49_ = huffmanAlgorithm3[i_46_]) < 0) {
		is_43_[i_44_++] = (byte) (i_49_ ^ 0xffffffff);
		if (i_44_ >= i_45_)
		    break;
		i_46_ = 0;
	    }
	    if (0 != (i_48_ & 0x10))
		i_46_ = huffmanAlgorithm3[i_46_];
	    else
		i_46_++;
	    if ((i_49_ = huffmanAlgorithm3[i_46_]) < 0) {
		is_43_[i_44_++] = (byte) (i_49_ ^ 0xffffffff);
		if (i_44_ >= i_45_)
		    break;
		i_46_ = 0;
	    }
	    if ((i_48_ & 0x8) != 0)
		i_46_ = huffmanAlgorithm3[i_46_];
	    else
		i_46_++;
	    if ((i_49_ = huffmanAlgorithm3[i_46_]) < 0) {
		is_43_[i_44_++] = (byte) (i_49_ ^ 0xffffffff);
		if (i_44_ >= i_45_)
		    break;
		i_46_ = 0;
	    }
	    if (0 != (i_48_ & 0x4))
		i_46_ = huffmanAlgorithm3[i_46_];
	    else
		i_46_++;
	    if ((i_49_ = huffmanAlgorithm3[i_46_]) < 0) {
		is_43_[i_44_++] = (byte) (i_49_ ^ 0xffffffff);
		if (i_44_ >= i_45_)
		    break;
		i_46_ = 0;
	    }
	    if ((i_48_ & 0x2) != 0)
		i_46_ = huffmanAlgorithm3[i_46_];
	    else
		i_46_++;
	    if ((i_49_ = huffmanAlgorithm3[i_46_]) < 0) {
		is_43_[i_44_++] = (byte) (i_49_ ^ 0xffffffff);
		if (i_44_ >= i_45_)
		    break;
		i_46_ = 0;
	    }
	    if (0 != (i_48_ & 0x1))
		i_46_ = huffmanAlgorithm3[i_46_];
	    else
		i_46_++;
	    if ((i_49_ = huffmanAlgorithm3[i_46_]) < 0) {
		is_43_[i_44_++] = (byte) (i_49_ ^ 0xffffffff);
		if (i_44_ >= i_45_)
		    break;
		i_46_ = 0;
	    }
	    i_47_++;
	}
	return i_47_ + 1 - i;
    }
    
    int method1820(byte[] is, int i, int i_50_, byte[] is_51_, int i_52_) {
	int i_53_ = 0;
	int i_54_ = i_52_ << 3;
	for (i_50_ += i; i < i_50_; i++) {
	    int i_55_ = is[i] & 0xff;
	    int i_56_ = huffmanAlgorithm1[i_55_];
	    int i_57_ = huffmanAlgorithm2[i_55_];
	    if (0 == i_57_)
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_55_).toString());
	    int i_58_ = i_54_ >> 3;
	    int i_59_ = i_54_ & 0x7;
	    i_53_ &= -i_59_ >> 31;
	    int i_60_ = i_58_ + (i_57_ + i_59_ - 1 >> 3);
	    i_59_ += 24;
	    is_51_[i_58_] = (byte) (i_53_ |= i_56_ >>> i_59_);
	    if (i_58_ < i_60_) {
		i_58_++;
		i_59_ -= 8;
		is_51_[i_58_] = (byte) (i_53_ = i_56_ >>> i_59_);
		if (i_58_ < i_60_) {
		    i_58_++;
		    i_59_ -= 8;
		    is_51_[i_58_] = (byte) (i_53_ = i_56_ >>> i_59_);
		    if (i_58_ < i_60_) {
			i_58_++;
			i_59_ -= 8;
			is_51_[i_58_] = (byte) (i_53_ = i_56_ >>> i_59_);
			if (i_58_ < i_60_) {
			    i_58_++;
			    i_59_ -= 8;
			    is_51_[i_58_] = (byte) (i_53_ = i_56_ << -i_59_);
			}
		    }
		}
	    }
	    i_54_ += i_57_;
	}
	return (7 + i_54_ >> 3) - i_52_;
    }
    
    int method1821(byte[] is, int i, byte[] is_61_, int i_62_, int i_63_) {
	if (0 == i_63_)
	    return 0;
	int i_64_ = 0;
	i_63_ += i_62_;
	int i_65_ = i;
	for (;;) {
	    byte i_66_ = is[i_65_];
	    if (i_66_ < 0)
		i_64_ = huffmanAlgorithm3[i_64_];
	    else
		i_64_++;
	    int i_67_;
	    if ((i_67_ = huffmanAlgorithm3[i_64_]) < 0) {
		is_61_[i_62_++] = (byte) (i_67_ ^ 0xffffffff);
		if (i_62_ >= i_63_)
		    break;
		i_64_ = 0;
	    }
	    if ((i_66_ & 0x40) != 0)
		i_64_ = huffmanAlgorithm3[i_64_];
	    else
		i_64_++;
	    if ((i_67_ = huffmanAlgorithm3[i_64_]) < 0) {
		is_61_[i_62_++] = (byte) (i_67_ ^ 0xffffffff);
		if (i_62_ >= i_63_)
		    break;
		i_64_ = 0;
	    }
	    if ((i_66_ & 0x20) != 0)
		i_64_ = huffmanAlgorithm3[i_64_];
	    else
		i_64_++;
	    if ((i_67_ = huffmanAlgorithm3[i_64_]) < 0) {
		is_61_[i_62_++] = (byte) (i_67_ ^ 0xffffffff);
		if (i_62_ >= i_63_)
		    break;
		i_64_ = 0;
	    }
	    if (0 != (i_66_ & 0x10))
		i_64_ = huffmanAlgorithm3[i_64_];
	    else
		i_64_++;
	    if ((i_67_ = huffmanAlgorithm3[i_64_]) < 0) {
		is_61_[i_62_++] = (byte) (i_67_ ^ 0xffffffff);
		if (i_62_ >= i_63_)
		    break;
		i_64_ = 0;
	    }
	    if ((i_66_ & 0x8) != 0)
		i_64_ = huffmanAlgorithm3[i_64_];
	    else
		i_64_++;
	    if ((i_67_ = huffmanAlgorithm3[i_64_]) < 0) {
		is_61_[i_62_++] = (byte) (i_67_ ^ 0xffffffff);
		if (i_62_ >= i_63_)
		    break;
		i_64_ = 0;
	    }
	    if (0 != (i_66_ & 0x4))
		i_64_ = huffmanAlgorithm3[i_64_];
	    else
		i_64_++;
	    if ((i_67_ = huffmanAlgorithm3[i_64_]) < 0) {
		is_61_[i_62_++] = (byte) (i_67_ ^ 0xffffffff);
		if (i_62_ >= i_63_)
		    break;
		i_64_ = 0;
	    }
	    if ((i_66_ & 0x2) != 0)
		i_64_ = huffmanAlgorithm3[i_64_];
	    else
		i_64_++;
	    if ((i_67_ = huffmanAlgorithm3[i_64_]) < 0) {
		is_61_[i_62_++] = (byte) (i_67_ ^ 0xffffffff);
		if (i_62_ >= i_63_)
		    break;
		i_64_ = 0;
	    }
	    if (0 != (i_66_ & 0x1))
		i_64_ = huffmanAlgorithm3[i_64_];
	    else
		i_64_++;
	    if ((i_67_ = huffmanAlgorithm3[i_64_]) < 0) {
		is_61_[i_62_++] = (byte) (i_67_ ^ 0xffffffff);
		if (i_62_ >= i_63_)
		    break;
		i_64_ = 0;
	    }
	    i_65_++;
	}
	return i_65_ + 1 - i;
    }
    
    int method1822(byte[] is, int i, byte[] is_68_, int i_69_, int i_70_) {
	if (0 == i_70_)
	    return 0;
	int i_71_ = 0;
	i_70_ += i_69_;
	int i_72_ = i;
	for (;;) {
	    byte i_73_ = is[i_72_];
	    if (i_73_ < 0)
		i_71_ = huffmanAlgorithm3[i_71_];
	    else
		i_71_++;
	    int i_74_;
	    if ((i_74_ = huffmanAlgorithm3[i_71_]) < 0) {
		is_68_[i_69_++] = (byte) (i_74_ ^ 0xffffffff);
		if (i_69_ >= i_70_)
		    break;
		i_71_ = 0;
	    }
	    if ((i_73_ & 0x40) != 0)
		i_71_ = huffmanAlgorithm3[i_71_];
	    else
		i_71_++;
	    if ((i_74_ = huffmanAlgorithm3[i_71_]) < 0) {
		is_68_[i_69_++] = (byte) (i_74_ ^ 0xffffffff);
		if (i_69_ >= i_70_)
		    break;
		i_71_ = 0;
	    }
	    if ((i_73_ & 0x20) != 0)
		i_71_ = huffmanAlgorithm3[i_71_];
	    else
		i_71_++;
	    if ((i_74_ = huffmanAlgorithm3[i_71_]) < 0) {
		is_68_[i_69_++] = (byte) (i_74_ ^ 0xffffffff);
		if (i_69_ >= i_70_)
		    break;
		i_71_ = 0;
	    }
	    if (0 != (i_73_ & 0x10))
		i_71_ = huffmanAlgorithm3[i_71_];
	    else
		i_71_++;
	    if ((i_74_ = huffmanAlgorithm3[i_71_]) < 0) {
		is_68_[i_69_++] = (byte) (i_74_ ^ 0xffffffff);
		if (i_69_ >= i_70_)
		    break;
		i_71_ = 0;
	    }
	    if ((i_73_ & 0x8) != 0)
		i_71_ = huffmanAlgorithm3[i_71_];
	    else
		i_71_++;
	    if ((i_74_ = huffmanAlgorithm3[i_71_]) < 0) {
		is_68_[i_69_++] = (byte) (i_74_ ^ 0xffffffff);
		if (i_69_ >= i_70_)
		    break;
		i_71_ = 0;
	    }
	    if (0 != (i_73_ & 0x4))
		i_71_ = huffmanAlgorithm3[i_71_];
	    else
		i_71_++;
	    if ((i_74_ = huffmanAlgorithm3[i_71_]) < 0) {
		is_68_[i_69_++] = (byte) (i_74_ ^ 0xffffffff);
		if (i_69_ >= i_70_)
		    break;
		i_71_ = 0;
	    }
	    if ((i_73_ & 0x2) != 0)
		i_71_ = huffmanAlgorithm3[i_71_];
	    else
		i_71_++;
	    if ((i_74_ = huffmanAlgorithm3[i_71_]) < 0) {
		is_68_[i_69_++] = (byte) (i_74_ ^ 0xffffffff);
		if (i_69_ >= i_70_)
		    break;
		i_71_ = 0;
	    }
	    if (0 != (i_73_ & 0x1))
		i_71_ = huffmanAlgorithm3[i_71_];
	    else
		i_71_++;
	    if ((i_74_ = huffmanAlgorithm3[i_71_]) < 0) {
		is_68_[i_69_++] = (byte) (i_74_ ^ 0xffffffff);
		if (i_69_ >= i_70_)
		    break;
		i_71_ = 0;
	    }
	    i_72_++;
	}
	return i_72_ + 1 - i;
    }
    
    static final void method1823(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
    }
    
    static final void method1824(ClientScriptData class454, int i) {
	int i_75_ = client.aClass407_8467.method7306(1564846650);
	if (1629309841 * client.anInt8466 != -1)
	    i_75_++;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_75_;
    }
    
    static void method1825(byte i) {
	Class78.aClass351_Sub1_1133 = null;
	Class15.aBool132 = false;
    }
    
    static final void method1826(ClientScriptData class454, int i) {
	int i_76_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_76_, (byte) -1);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_76_ >> 16];
	Class72.method1740(class58, class35, class454, 538285720);
    }
}
