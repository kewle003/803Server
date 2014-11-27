/* Class351_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class351_Sub1 extends Class351
{
    int anInt10610 = 0;
    
    public void method16834(RSByteBuffer class241_sub3, int i, short i_0_) {
	int i_1_ = 421967667 * class241_sub3.pointer;
	int i_2_ = class241_sub3.readUnsignedByte((byte) -40);
	method6257(Class351.method6406(i_2_ & 0x1, (byte) 71), 170709369);
	if ((i_2_ & 0x8) != 0) {
	    Class61 class61
		= Class580_Sub1.method14520(class241_sub3
						.readUnsignedByte((byte) -23),
					    580547376);
	    if (class61 != ((Class351_Sub1) this).aClass61_5403) {
		try {
		    method6258(class61, true, -834248127);
		} catch (Exception_Sub5 exception_sub5) {
		    exception_sub5.printStackTrace();
		}
	    }
	}
	if ((i_2_ & 0x10) != 0) {
	    Class39 class39
		= Class281.method5489(class241_sub3.readUnsignedByte((byte) -88),
				      (short) -20065);
	    if (class39 != ((Class351_Sub1) this).aClass39_5394) {
		try {
		    method6267(class39, true, -499963207);
		} catch (Exception_Sub5 exception_sub5) {
		    exception_sub5.printStackTrace();
		}
	    }
	}
	if (1 == (i_2_ >> 7 & 0x1)) {
	    int i_3_ = class241_sub3.readUnsignedShort(1162222719);
	    if (1 == (i_3_ >> (-725014073
			       * ((Class77) Class77.aClass77_1114).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5389
		    .method5602(class241_sub3);
	    if (1 == (i_3_ >> (-725014073
			       * ((Class77) Class77.aClass77_1118).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5424
		    .method5602(class241_sub3);
	    if (1 == (i_3_ >> (-725014073
			       * ((Class77) Class77.aClass77_1116).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5412
		    .method5602(class241_sub3);
	    if (1 == (i_3_ >> (((Class77) Class77.aClass77_1122).anInt1129
			       * -725014073)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5392
		    .method5602(class241_sub3);
	    if (1 == (i_3_ >> (((Class77) Class77.aClass77_1124).anInt1129
			       * -725014073)
		      & 0x1)) {
		((Class351_Sub1) this).aFloat5400
		    = class241_sub3.method14650(-2105009782);
		((Class351_Sub1) this).aFloat5416
		    = class241_sub3.method14650(-1320260735);
	    }
	    if (1 == (i_3_ >> (((Class77) Class77.aClass77_1119).anInt1129
			       * -725014073)
		      & 0x1)) {
		((Class351_Sub1) this).aFloat5419
		    = class241_sub3.method14650(-273991462);
		((Class351_Sub1) this).aFloat5407
		    = class241_sub3.method14650(-1915496143);
	    }
	    if (((i_3_
		  >> -725014073 * ((Class77) Class77.aClass77_1120).anInt1129)
		 & 0x1)
		== 1)
		((Class351_Sub1) this).aClass76_5391
		    = Class563.method12408(class241_sub3
					       .readUnsignedByte((byte) 41),
					   -1953619734);
	    if (((i_3_
		  >> ((Class77) Class77.aClass77_1121).anInt1129 * -725014073)
		 & 0x1)
		== 1) {
		((Class351_Sub1) this).anInt5398
		    = class241_sub3.readTriByte(1771646547) * 303787355;
		class241_sub3.readUnsignedByte((byte) 37);
	    }
	    if (1 == (i_3_ >> (((Class77) Class77.aClass77_1117).anInt1129
			       * -725014073)
		      & 0x1)) {
		int i_4_ = class241_sub3.readUnsignedByte((byte) 27);
		((Class351_Sub1) this).aBool5421 = (i_4_ & 0x1) == 1;
		((Class351_Sub1) this).aBool5422 = 2 == (i_4_ & 0x2);
	    }
	    if (((i_3_
		  >> ((Class77) Class77.aClass77_1123).anInt1129 * -725014073)
		 & 0x1)
		== 1) {
		int i_5_ = class241_sub3.readUnsignedByte((byte) -31);
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
		    int i_7_ = class241_sub3.readUnsignedByte((byte) -85);
		    int i_8_ = class241_sub3.readUnsignedByte((byte) -72);
		    if (i_7_ == 0)
			method6277(i_8_, (byte) -42);
		    else {
			Class42 class42
			    = Class85.method1844(class241_sub3
						     .readUnsignedByte((byte) 34),
						 1740707608);
			boolean bool = true;
			Iterator iterator
			    = ((Class351_Sub1) this).aClass407_5425.iterator();
			while (iterator.hasNext()) {
			    Class241_Sub39_Sub6 class241_sub39_sub6
				= (Class241_Sub39_Sub6) iterator.next();
			    if (2083383801 * class241_sub39_sub6.anInt10841
				== i_8_) {
				class241_sub39_sub6.method17114(class241_sub3,
								1768294825);
				bool = false;
				break;
			    }
			}
			if (bool)
			    method6276(Class417.method7495(i_8_, class42,
							   class241_sub3,
							   (byte) 3),
				       1848439153);
		    }
		}
	    }
	    if (1 == (i_3_ >> (-725014073
			       * ((Class77) Class77.aClass77_1115).anInt1129)
		      & 0x1)) {
		((Class351_Sub1) this).anInt5423
		    = class241_sub3.readUnsignedShort(1162222719) * -316347629;
		((Class351_Sub1) this).aFloat5395
		    = class241_sub3.method14650(-1074129501);
	    }
	    if (((i_3_
		  >> -725014073 * ((Class77) Class77.aClass77_1125).anInt1129)
		 & 0x1)
		== 1)
		((Class351_Sub1) this).aClass73_5397
		    = Class404.method7224(class241_sub3
					      .readUnsignedByte((byte) -36),
					  (byte) -105);
	    if (((i_3_
		  >> -725014073 * ((Class77) Class77.aClass77_1126).anInt1129)
		 & 0x1)
		== 1) {
		((Class351_Sub1) this).aClass287_5411
		    .method5602(class241_sub3);
		((Class351_Sub1) this).aClass287_5393
		    .method5602(class241_sub3);
		((Class351_Sub1) this).aFloat5406
		    = class241_sub3.method14650(-1056891491);
		((Class351_Sub1) this).aFloat5414
		    = class241_sub3.method14650(-1227107911);
	    }
	    if (1 == (i_3_ >> (-725014073
			       * ((Class77) Class77.aClass77_1127).anInt1129)
		      & 0x1))
		class241_sub3.method14650(-759509587);
	    if (1 == (i_3_ >> (-725014073
			       * ((Class77) Class77.aClass77_1128).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aFloat5399
		    = class241_sub3.method14650(-385971908);
	}
	if (((Class351_Sub1) this).aClass434_5413 != null
	    && (i_2_ >> 5 & 0x1) == 1)
	    ((Class351_Sub1) this).aClass434_5413.method7755(class241_sub3,
							     568360891);
	if (null != ((Class351_Sub1) this).aClass380_5409
	    && (i_2_ >> 6 & 0x1) == 1)
	    ((Class351_Sub1) this).aClass380_5409.method6864(class241_sub3,
							     (byte) 16);
	if (i != class241_sub3.pointer * 421967667 - i_1_)
	    throw new RuntimeException(new StringBuilder().append
					   (class241_sub3.pointer * 421967667
					    - i_1_)
					   .append
					   (",").append
					   (i).toString());
    }
    
    public int method16835(int i) {
	((Class351_Sub1) this).anInt10610 += -1681459389;
	if (2087898475 * ((Class351_Sub1) this).anInt10610 == 126)
	    ((Class351_Sub1) this).anInt10610 = 0;
	return 2087898475 * ((Class351_Sub1) this).anInt10610;
    }
    
    public int method16836() {
	((Class351_Sub1) this).anInt10610 += -1681459389;
	if (2087898475 * ((Class351_Sub1) this).anInt10610 == 126)
	    ((Class351_Sub1) this).anInt10610 = 0;
	return 2087898475 * ((Class351_Sub1) this).anInt10610;
    }
    
    public void method16837(RSByteBuffer class241_sub3, int i) {
	int i_9_ = 421967667 * class241_sub3.pointer;
	int i_10_ = class241_sub3.readUnsignedByte((byte) -56);
	method6257(Class351.method6406(i_10_ & 0x1, (byte) 36), 170709369);
	if ((i_10_ & 0x8) != 0) {
	    Class61 class61
		= Class580_Sub1.method14520(class241_sub3
						.readUnsignedByte((byte) -25),
					    1613244615);
	    if (class61 != ((Class351_Sub1) this).aClass61_5403) {
		try {
		    method6258(class61, true, -503189889);
		} catch (Exception_Sub5 exception_sub5) {
		    exception_sub5.printStackTrace();
		}
	    }
	}
	if ((i_10_ & 0x10) != 0) {
	    Class39 class39
		= Class281.method5489(class241_sub3.readUnsignedByte((byte) 66),
				      (short) 1751);
	    if (class39 != ((Class351_Sub1) this).aClass39_5394) {
		try {
		    method6267(class39, true, -153993258);
		} catch (Exception_Sub5 exception_sub5) {
		    exception_sub5.printStackTrace();
		}
	    }
	}
	if (1 == (i_10_ >> 7 & 0x1)) {
	    int i_11_ = class241_sub3.readUnsignedShort(1162222719);
	    if (1 == (i_11_ >> (-725014073
				* ((Class77) Class77.aClass77_1114).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5389
		    .method5602(class241_sub3);
	    if (1 == (i_11_ >> (-725014073
				* ((Class77) Class77.aClass77_1118).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5424
		    .method5602(class241_sub3);
	    if (1 == (i_11_ >> (-725014073
				* ((Class77) Class77.aClass77_1116).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5412
		    .method5602(class241_sub3);
	    if (1 == (i_11_ >> (((Class77) Class77.aClass77_1122).anInt1129
				* -725014073)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5392
		    .method5602(class241_sub3);
	    if (1 == (i_11_ >> (((Class77) Class77.aClass77_1124).anInt1129
				* -725014073)
		      & 0x1)) {
		((Class351_Sub1) this).aFloat5400
		    = class241_sub3.method14650(-346306485);
		((Class351_Sub1) this).aFloat5416
		    = class241_sub3.method14650(-1507288267);
	    }
	    if (1 == (i_11_ >> (((Class77) Class77.aClass77_1119).anInt1129
				* -725014073)
		      & 0x1)) {
		((Class351_Sub1) this).aFloat5419
		    = class241_sub3.method14650(-1229407400);
		((Class351_Sub1) this).aFloat5407
		    = class241_sub3.method14650(-2067436175);
	    }
	    if (((i_11_
		  >> -725014073 * ((Class77) Class77.aClass77_1120).anInt1129)
		 & 0x1)
		== 1)
		((Class351_Sub1) this).aClass76_5391
		    = Class563.method12408(class241_sub3
					       .readUnsignedByte((byte) -69),
					   -2078012973);
	    if (((i_11_
		  >> ((Class77) Class77.aClass77_1121).anInt1129 * -725014073)
		 & 0x1)
		== 1) {
		((Class351_Sub1) this).anInt5398
		    = class241_sub3.readTriByte(1771646547) * 303787355;
		class241_sub3.readUnsignedByte((byte) 83);
	    }
	    if (1 == (i_11_ >> (((Class77) Class77.aClass77_1117).anInt1129
				* -725014073)
		      & 0x1)) {
		int i_12_ = class241_sub3.readUnsignedByte((byte) 68);
		((Class351_Sub1) this).aBool5421 = (i_12_ & 0x1) == 1;
		((Class351_Sub1) this).aBool5422 = 2 == (i_12_ & 0x2);
	    }
	    if (((i_11_
		  >> ((Class77) Class77.aClass77_1123).anInt1129 * -725014073)
		 & 0x1)
		== 1) {
		int i_13_ = class241_sub3.readUnsignedByte((byte) 18);
		for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
		    int i_15_ = class241_sub3.readUnsignedByte((byte) 15);
		    int i_16_ = class241_sub3.readUnsignedByte((byte) -27);
		    if (i_15_ == 0)
			method6277(i_16_, (byte) 13);
		    else {
			Class42 class42
			    = Class85.method1844(class241_sub3
						     .readUnsignedByte((byte) -9),
						 2146491195);
			boolean bool = true;
			Iterator iterator
			    = ((Class351_Sub1) this).aClass407_5425.iterator();
			while (iterator.hasNext()) {
			    Class241_Sub39_Sub6 class241_sub39_sub6
				= (Class241_Sub39_Sub6) iterator.next();
			    if (2083383801 * class241_sub39_sub6.anInt10841
				== i_16_) {
				class241_sub39_sub6.method17114(class241_sub3,
								-57476366);
				bool = false;
				break;
			    }
			}
			if (bool)
			    method6276(Class417.method7495(i_16_, class42,
							   class241_sub3,
							   (byte) 16),
				       1580887909);
		    }
		}
	    }
	    if (1 == (i_11_ >> (-725014073
				* ((Class77) Class77.aClass77_1115).anInt1129)
		      & 0x1)) {
		((Class351_Sub1) this).anInt5423
		    = class241_sub3.readUnsignedShort(1162222719) * -316347629;
		((Class351_Sub1) this).aFloat5395
		    = class241_sub3.method14650(-708660328);
	    }
	    if (((i_11_
		  >> -725014073 * ((Class77) Class77.aClass77_1125).anInt1129)
		 & 0x1)
		== 1)
		((Class351_Sub1) this).aClass73_5397
		    = Class404.method7224(class241_sub3
					      .readUnsignedByte((byte) -41),
					  (byte) -108);
	    if (((i_11_
		  >> -725014073 * ((Class77) Class77.aClass77_1126).anInt1129)
		 & 0x1)
		== 1) {
		((Class351_Sub1) this).aClass287_5411
		    .method5602(class241_sub3);
		((Class351_Sub1) this).aClass287_5393
		    .method5602(class241_sub3);
		((Class351_Sub1) this).aFloat5406
		    = class241_sub3.method14650(-1620059840);
		((Class351_Sub1) this).aFloat5414
		    = class241_sub3.method14650(-325365898);
	    }
	    if (1 == (i_11_ >> (-725014073
				* ((Class77) Class77.aClass77_1127).anInt1129)
		      & 0x1))
		class241_sub3.method14650(-290183162);
	    if (1 == (i_11_ >> (-725014073
				* ((Class77) Class77.aClass77_1128).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aFloat5399
		    = class241_sub3.method14650(-1245201828);
	}
	if (((Class351_Sub1) this).aClass434_5413 != null
	    && (i_10_ >> 5 & 0x1) == 1)
	    ((Class351_Sub1) this).aClass434_5413.method7755(class241_sub3,
							     568360891);
	if (null != ((Class351_Sub1) this).aClass380_5409
	    && (i_10_ >> 6 & 0x1) == 1)
	    ((Class351_Sub1) this).aClass380_5409.method6864(class241_sub3,
							     (byte) 16);
	if (i != class241_sub3.pointer * 421967667 - i_9_)
	    throw new RuntimeException(new StringBuilder().append
					   (class241_sub3.pointer * 421967667
					    - i_9_)
					   .append
					   (",").append
					   (i).toString());
    }
    
    public Class351_Sub1(Interface3 interface3) {
	super(Class63.aClass63_1030, interface3);
    }
    
    public void method16838(RSByteBuffer class241_sub3, int i) {
	int i_17_ = 421967667 * class241_sub3.pointer;
	int i_18_ = class241_sub3.readUnsignedByte((byte) -56);
	method6257(Class351.method6406(i_18_ & 0x1, (byte) 20), 170709369);
	if ((i_18_ & 0x8) != 0) {
	    Class61 class61
		= Class580_Sub1.method14520(class241_sub3
						.readUnsignedByte((byte) -10),
					    2080672165);
	    if (class61 != ((Class351_Sub1) this).aClass61_5403) {
		try {
		    method6258(class61, true, -2127134776);
		} catch (Exception_Sub5 exception_sub5) {
		    exception_sub5.printStackTrace();
		}
	    }
	}
	if ((i_18_ & 0x10) != 0) {
	    Class39 class39
		= Class281.method5489(class241_sub3.readUnsignedByte((byte) -26),
				      (short) -14672);
	    if (class39 != ((Class351_Sub1) this).aClass39_5394) {
		try {
		    method6267(class39, true, -1568300959);
		} catch (Exception_Sub5 exception_sub5) {
		    exception_sub5.printStackTrace();
		}
	    }
	}
	if (1 == (i_18_ >> 7 & 0x1)) {
	    int i_19_ = class241_sub3.readUnsignedShort(1162222719);
	    if (1 == (i_19_ >> (-725014073
				* ((Class77) Class77.aClass77_1114).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5389
		    .method5602(class241_sub3);
	    if (1 == (i_19_ >> (-725014073
				* ((Class77) Class77.aClass77_1118).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5424
		    .method5602(class241_sub3);
	    if (1 == (i_19_ >> (-725014073
				* ((Class77) Class77.aClass77_1116).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5412
		    .method5602(class241_sub3);
	    if (1 == (i_19_ >> (((Class77) Class77.aClass77_1122).anInt1129
				* -725014073)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5392
		    .method5602(class241_sub3);
	    if (1 == (i_19_ >> (((Class77) Class77.aClass77_1124).anInt1129
				* -725014073)
		      & 0x1)) {
		((Class351_Sub1) this).aFloat5400
		    = class241_sub3.method14650(-1510479480);
		((Class351_Sub1) this).aFloat5416
		    = class241_sub3.method14650(-643191755);
	    }
	    if (1 == (i_19_ >> (((Class77) Class77.aClass77_1119).anInt1129
				* -725014073)
		      & 0x1)) {
		((Class351_Sub1) this).aFloat5419
		    = class241_sub3.method14650(-1495917326);
		((Class351_Sub1) this).aFloat5407
		    = class241_sub3.method14650(-252896679);
	    }
	    if (((i_19_
		  >> -725014073 * ((Class77) Class77.aClass77_1120).anInt1129)
		 & 0x1)
		== 1)
		((Class351_Sub1) this).aClass76_5391
		    = Class563.method12408(class241_sub3
					       .readUnsignedByte((byte) -39),
					   -1875561824);
	    if (((i_19_
		  >> ((Class77) Class77.aClass77_1121).anInt1129 * -725014073)
		 & 0x1)
		== 1) {
		((Class351_Sub1) this).anInt5398
		    = class241_sub3.readTriByte(1771646547) * 303787355;
		class241_sub3.readUnsignedByte((byte) 40);
	    }
	    if (1 == (i_19_ >> (((Class77) Class77.aClass77_1117).anInt1129
				* -725014073)
		      & 0x1)) {
		int i_20_ = class241_sub3.readUnsignedByte((byte) 17);
		((Class351_Sub1) this).aBool5421 = (i_20_ & 0x1) == 1;
		((Class351_Sub1) this).aBool5422 = 2 == (i_20_ & 0x2);
	    }
	    if (((i_19_
		  >> ((Class77) Class77.aClass77_1123).anInt1129 * -725014073)
		 & 0x1)
		== 1) {
		int i_21_ = class241_sub3.readUnsignedByte((byte) -24);
		for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
		    int i_23_ = class241_sub3.readUnsignedByte((byte) -77);
		    int i_24_ = class241_sub3.readUnsignedByte((byte) -5);
		    if (i_23_ == 0)
			method6277(i_24_, (byte) 21);
		    else {
			Class42 class42
			    = Class85.method1844(class241_sub3
						     .readUnsignedByte((byte) 59),
						 2130289941);
			boolean bool = true;
			Iterator iterator
			    = ((Class351_Sub1) this).aClass407_5425.iterator();
			while (iterator.hasNext()) {
			    Class241_Sub39_Sub6 class241_sub39_sub6
				= (Class241_Sub39_Sub6) iterator.next();
			    if (2083383801 * class241_sub39_sub6.anInt10841
				== i_24_) {
				class241_sub39_sub6.method17114(class241_sub3,
								104498619);
				bool = false;
				break;
			    }
			}
			if (bool)
			    method6276(Class417.method7495(i_24_, class42,
							   class241_sub3,
							   (byte) 13),
				       1009542640);
		    }
		}
	    }
	    if (1 == (i_19_ >> (-725014073
				* ((Class77) Class77.aClass77_1115).anInt1129)
		      & 0x1)) {
		((Class351_Sub1) this).anInt5423
		    = class241_sub3.readUnsignedShort(1162222719) * -316347629;
		((Class351_Sub1) this).aFloat5395
		    = class241_sub3.method14650(-277050841);
	    }
	    if (((i_19_
		  >> -725014073 * ((Class77) Class77.aClass77_1125).anInt1129)
		 & 0x1)
		== 1)
		((Class351_Sub1) this).aClass73_5397
		    = Class404.method7224(class241_sub3.readUnsignedByte((byte) 6),
					  (byte) -66);
	    if (((i_19_
		  >> -725014073 * ((Class77) Class77.aClass77_1126).anInt1129)
		 & 0x1)
		== 1) {
		((Class351_Sub1) this).aClass287_5411
		    .method5602(class241_sub3);
		((Class351_Sub1) this).aClass287_5393
		    .method5602(class241_sub3);
		((Class351_Sub1) this).aFloat5406
		    = class241_sub3.method14650(-1051354761);
		((Class351_Sub1) this).aFloat5414
		    = class241_sub3.method14650(-1332756556);
	    }
	    if (1 == (i_19_ >> (-725014073
				* ((Class77) Class77.aClass77_1127).anInt1129)
		      & 0x1))
		class241_sub3.method14650(-312583826);
	    if (1 == (i_19_ >> (-725014073
				* ((Class77) Class77.aClass77_1128).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aFloat5399
		    = class241_sub3.method14650(-1452838358);
	}
	if (((Class351_Sub1) this).aClass434_5413 != null
	    && (i_18_ >> 5 & 0x1) == 1)
	    ((Class351_Sub1) this).aClass434_5413.method7755(class241_sub3,
							     568360891);
	if (null != ((Class351_Sub1) this).aClass380_5409
	    && (i_18_ >> 6 & 0x1) == 1)
	    ((Class351_Sub1) this).aClass380_5409.method6864(class241_sub3,
							     (byte) 16);
	if (i != class241_sub3.pointer * 421967667 - i_17_)
	    throw new RuntimeException(new StringBuilder().append
					   (class241_sub3.pointer * 421967667
					    - i_17_)
					   .append
					   (",").append
					   (i).toString());
    }
    
    public void method16839(RSByteBuffer class241_sub3, int i) {
	int i_25_ = 421967667 * class241_sub3.pointer;
	int i_26_ = class241_sub3.readUnsignedByte((byte) 18);
	method6257(Class351.method6406(i_26_ & 0x1, (byte) 103), 170709369);
	if ((i_26_ & 0x8) != 0) {
	    Class61 class61
		= Class580_Sub1.method14520(class241_sub3
						.readUnsignedByte((byte) -70),
					    -913341956);
	    if (class61 != ((Class351_Sub1) this).aClass61_5403) {
		try {
		    method6258(class61, true, 123396653);
		} catch (Exception_Sub5 exception_sub5) {
		    exception_sub5.printStackTrace();
		}
	    }
	}
	if ((i_26_ & 0x10) != 0) {
	    Class39 class39
		= Class281.method5489(class241_sub3.readUnsignedByte((byte) 37),
				      (short) -18519);
	    if (class39 != ((Class351_Sub1) this).aClass39_5394) {
		try {
		    method6267(class39, true, -7052382);
		} catch (Exception_Sub5 exception_sub5) {
		    exception_sub5.printStackTrace();
		}
	    }
	}
	if (1 == (i_26_ >> 7 & 0x1)) {
	    int i_27_ = class241_sub3.readUnsignedShort(1162222719);
	    if (1 == (i_27_ >> (-725014073
				* ((Class77) Class77.aClass77_1114).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5389
		    .method5602(class241_sub3);
	    if (1 == (i_27_ >> (-725014073
				* ((Class77) Class77.aClass77_1118).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5424
		    .method5602(class241_sub3);
	    if (1 == (i_27_ >> (-725014073
				* ((Class77) Class77.aClass77_1116).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5412
		    .method5602(class241_sub3);
	    if (1 == (i_27_ >> (((Class77) Class77.aClass77_1122).anInt1129
				* -725014073)
		      & 0x1))
		((Class351_Sub1) this).aClass287_5392
		    .method5602(class241_sub3);
	    if (1 == (i_27_ >> (((Class77) Class77.aClass77_1124).anInt1129
				* -725014073)
		      & 0x1)) {
		((Class351_Sub1) this).aFloat5400
		    = class241_sub3.method14650(-1103417816);
		((Class351_Sub1) this).aFloat5416
		    = class241_sub3.method14650(-1976434006);
	    }
	    if (1 == (i_27_ >> (((Class77) Class77.aClass77_1119).anInt1129
				* -725014073)
		      & 0x1)) {
		((Class351_Sub1) this).aFloat5419
		    = class241_sub3.method14650(-337713777);
		((Class351_Sub1) this).aFloat5407
		    = class241_sub3.method14650(-1028040790);
	    }
	    if (((i_27_
		  >> -725014073 * ((Class77) Class77.aClass77_1120).anInt1129)
		 & 0x1)
		== 1)
		((Class351_Sub1) this).aClass76_5391
		    = Class563.method12408(class241_sub3
					       .readUnsignedByte((byte) 110),
					   -1993903475);
	    if (((i_27_
		  >> ((Class77) Class77.aClass77_1121).anInt1129 * -725014073)
		 & 0x1)
		== 1) {
		((Class351_Sub1) this).anInt5398
		    = class241_sub3.readTriByte(1771646547) * 303787355;
		class241_sub3.readUnsignedByte((byte) 27);
	    }
	    if (1 == (i_27_ >> (((Class77) Class77.aClass77_1117).anInt1129
				* -725014073)
		      & 0x1)) {
		int i_28_ = class241_sub3.readUnsignedByte((byte) 30);
		((Class351_Sub1) this).aBool5421 = (i_28_ & 0x1) == 1;
		((Class351_Sub1) this).aBool5422 = 2 == (i_28_ & 0x2);
	    }
	    if (((i_27_
		  >> ((Class77) Class77.aClass77_1123).anInt1129 * -725014073)
		 & 0x1)
		== 1) {
		int i_29_ = class241_sub3.readUnsignedByte((byte) -29);
		for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
		    int i_31_ = class241_sub3.readUnsignedByte((byte) -21);
		    int i_32_ = class241_sub3.readUnsignedByte((byte) 54);
		    if (i_31_ == 0)
			method6277(i_32_, (byte) 95);
		    else {
			Class42 class42
			    = Class85.method1844(class241_sub3
						     .readUnsignedByte((byte) -2),
						 1647823011);
			boolean bool = true;
			Iterator iterator
			    = ((Class351_Sub1) this).aClass407_5425.iterator();
			while (iterator.hasNext()) {
			    Class241_Sub39_Sub6 class241_sub39_sub6
				= (Class241_Sub39_Sub6) iterator.next();
			    if (2083383801 * class241_sub39_sub6.anInt10841
				== i_32_) {
				class241_sub39_sub6.method17114(class241_sub3,
								1411437228);
				bool = false;
				break;
			    }
			}
			if (bool)
			    method6276(Class417.method7495(i_32_, class42,
							   class241_sub3,
							   (byte) 44),
				       1796793970);
		    }
		}
	    }
	    if (1 == (i_27_ >> (-725014073
				* ((Class77) Class77.aClass77_1115).anInt1129)
		      & 0x1)) {
		((Class351_Sub1) this).anInt5423
		    = class241_sub3.readUnsignedShort(1162222719) * -316347629;
		((Class351_Sub1) this).aFloat5395
		    = class241_sub3.method14650(-938535908);
	    }
	    if (((i_27_
		  >> -725014073 * ((Class77) Class77.aClass77_1125).anInt1129)
		 & 0x1)
		== 1)
		((Class351_Sub1) this).aClass73_5397
		    = Class404.method7224(class241_sub3.readUnsignedByte((byte) 22),
					  (byte) -80);
	    if (((i_27_
		  >> -725014073 * ((Class77) Class77.aClass77_1126).anInt1129)
		 & 0x1)
		== 1) {
		((Class351_Sub1) this).aClass287_5411
		    .method5602(class241_sub3);
		((Class351_Sub1) this).aClass287_5393
		    .method5602(class241_sub3);
		((Class351_Sub1) this).aFloat5406
		    = class241_sub3.method14650(-209660816);
		((Class351_Sub1) this).aFloat5414
		    = class241_sub3.method14650(-695183717);
	    }
	    if (1 == (i_27_ >> (-725014073
				* ((Class77) Class77.aClass77_1127).anInt1129)
		      & 0x1))
		class241_sub3.method14650(-1018662087);
	    if (1 == (i_27_ >> (-725014073
				* ((Class77) Class77.aClass77_1128).anInt1129)
		      & 0x1))
		((Class351_Sub1) this).aFloat5399
		    = class241_sub3.method14650(-1209366919);
	}
	if (((Class351_Sub1) this).aClass434_5413 != null
	    && (i_26_ >> 5 & 0x1) == 1)
	    ((Class351_Sub1) this).aClass434_5413.method7755(class241_sub3,
							     568360891);
	if (null != ((Class351_Sub1) this).aClass380_5409
	    && (i_26_ >> 6 & 0x1) == 1)
	    ((Class351_Sub1) this).aClass380_5409.method6864(class241_sub3,
							     (byte) 16);
	if (i != class241_sub3.pointer * 421967667 - i_25_)
	    throw new RuntimeException(new StringBuilder().append
					   (class241_sub3.pointer * 421967667
					    - i_25_)
					   .append
					   (",").append
					   (i).toString());
    }
    
    static int method16840(int i) {
	return 13;
    }
    
    public static void method16841(byte i) {
	RSAKeys.method861(true, (byte) -77);
    }
    
    public static boolean method16842(int i, boolean bool, int i_33_) {
	if (i == -1310014867 * Class573_Sub1.anInt8790)
	    Class573_Sub1.aBool8774 = bool;
	else if (2090457349 * Class573_Sub1.anInt8767 == i)
	    Class573_Sub1.aBool8780 = bool;
	else if (i == Class573_Sub1.anInt8768 * -1104278553)
	    Class573_Sub1.aBool8776 = bool;
	else
	    return false;
	return true;
    }
}
