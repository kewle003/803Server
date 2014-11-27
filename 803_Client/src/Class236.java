/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class236 implements Runnable
{
    Class238 aClass238_2710;
    LinkedList aLinkedList2711;
    volatile boolean aBool2712 = false;
    public static Class103 aClass103_2713;
    
    public void method4702(Class234 class234) {
	synchronized (aLinkedList2711) {
	    aLinkedList2711.add(class234);
	    aLinkedList2711.notify();
	}
    }
    
    public void method4703(ObjectDefinitionLoader class532, int i) {
	aClass238_2710.method4760(class532, 1756482407);
    }
    
    void method4704(Class238 class238) {
	aClass238_2710 = class238;
    }
    
    public boolean method4705(int i) {
	return aBool2712;
    }
    
    public Class238 method4706(int i) {
	return aClass238_2710;
    }
    
    public void method4707(Class234 class234, int i) {
	synchronized (aLinkedList2711) {
	    aLinkedList2711.add(class234);
	    aLinkedList2711.notify();
	}
    }
    
    public void run() {
	for (;;)
	    method4719(-517379324);
    }
    
    void method4708(Class234 class234) {
	if (MapType.aClass235_2707 == ((Class234) class234).mapType)
	    aClass238_2710.method4768((byte) 5);
	else
	    aClass238_2710.setMapScene(class234, 1635675489);
	for (boolean bool
		 = aClass238_2710.loadRegion((byte) -110);
	     !bool;
	     bool = aClass238_2710.loadRegion((byte) -97)) {
	    /* empty */
	}
	aClass238_2710.method4763(1837326089);
	client.aClass238_8477.method4763(1668080262);
    }
    
    void loadMap/*method4709*/(Class234 class234, byte i) {
		if (MapType.aClass235_2707 == ((Class234) class234).mapType) {
		    aClass238_2710.method4768((byte) 5);
		} else {
		    aClass238_2710.setMapScene(class234, 1673592235);
		}
		for (boolean completed = aClass238_2710.loadRegion((byte) -43); !completed;
				completed = aClass238_2710.loadRegion((byte) -12)) {
		    /* empty */
		}
		aClass238_2710.method4763(2040605145);
		client.aClass238_8477.method4763(1679739791);
    }
    
    public void method4710() {
	for (;;)
	    method4719(-668262122);
    }
    
    public void method4711() {
	for (;;)
	    method4719(-463343403);
    }
    
    public void method4712() {
	for (;;)
	    method4719(-2033605972);
    }
    
    public void method4713() {
	for (;;)
	    method4719(-1953697117);
    }
    
    public void method4714(ObjectDefinitionLoader class532) {
	aClass238_2710.method4760(class532, 1756482407);
    }
    
    public void method4715(ObjectDefinitionLoader class532) {
	aClass238_2710.method4760(class532, 1756482407);
    }
    
    public void method4716(Class234 class234) {
	synchronized (aLinkedList2711) {
	    aLinkedList2711.add(class234);
	    aLinkedList2711.notify();
	}
    }
    
    void method4717(Class238 class238) {
	aClass238_2710 = class238;
    }
    
    public boolean method4718() {
	return aBool2712;
    }
    
    void method4719(int i) {
	Object object = null;
	Class234 class234;
	synchronized (aLinkedList2711) {
	    try {
		aLinkedList2711.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class234
		= (Class234) aLinkedList2711.pollFirst();
	}
	do {
	    try {
		try {
		    if (class234 != null) {
			aBool2712 = true;
			loadMap(class234, (byte) 0);
		    }
		} catch (Exception exception) {
		    aBool2712 = false;
		    break;
		}
		aBool2712 = false;
	    } catch (Throwable object_0_) {
		aBool2712 = false;
		throw object_0_;
	    }
	} while (false);
    }
    
    void method4720(Class238 class238, int i) {
	aClass238_2710 = class238;
    }
    
    public Class238 method4721() {
	return aClass238_2710;
    }
    
    void method4722(Class238 class238) {
	aClass238_2710 = class238;
    }
    
    void method4723() {
	Object object = null;
	Class234 class234;
	synchronized (aLinkedList2711) {
	    try {
		aLinkedList2711.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class234
		= (Class234) aLinkedList2711.pollFirst();
	}
	do {
	    try {
		try {
		    if (class234 != null) {
			aBool2712 = true;
			loadMap(class234, (byte) 0);
		    }
		} catch (Exception exception) {
		    aBool2712 = false;
		    break;
		}
		aBool2712 = false;
	    } catch (Throwable object_1_) {
		aBool2712 = false;
		throw object_1_;
	    }
	} while (false);
    }
    
    public Class236() {
	aLinkedList2711 = new LinkedList();
	aClass238_2710 = new Class238(true);
    }
    
    void method4724() {
	Object object = null;
	Class234 class234;
	synchronized (aLinkedList2711) {
	    try {
		aLinkedList2711.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class234
		= (Class234) aLinkedList2711.pollFirst();
	}
	do {
	    try {
		try {
		    if (class234 != null) {
			aBool2712 = true;
			loadMap(class234, (byte) 0);
		    }
		} catch (Exception exception) {
		    aBool2712 = false;
		    break;
		}
		aBool2712 = false;
	    } catch (Throwable object_2_) {
		aBool2712 = false;
		throw object_2_;
	    }
	} while (false);
    }
    
    static final void method4725(ClientScriptData class454, int i) {
	Class133.method3090((((ClientScriptData) class454).integerStack
			     [((((ClientScriptData) class454).intStackPointer -= 1736754263)
			       * 1482319719)]),
			    -728565441);
    }
    
    static final void method4726(ClientScriptData class454, byte i) {
	Class241_Sub38.method16439(class454,
				   Class21.myPlayer,
				   -1847570570);
    }
    
    static void method4727(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = (Class326_Sub3.aClass482_10288.method11010
	       ((((ClientScriptData) class454).integerStack
		 [1482319719 * ((ClientScriptData) class454).intStackPointer - 2]),
		(short) -3256)
	       .aStringArray6437
	       [(((ClientScriptData) class454).integerStack
		 [((ClientScriptData) class454).intStackPointer * 1482319719 - 1])]);
	((ClientScriptData) class454).intStackPointer -= -821458770;
    }
    
    static void method4728(Class103 class103, byte i) {
	int i_3_ = Class16.anInt156 * 1011088115;
	int i_4_ = 904064679 * Class380.anInt5660;
	int i_5_ = 1139603851 * Class593.anInt7631;
	int i_6_ = LoadingScreenDef.anInt5500 * 630071575 - 3;
	int i_7_ = 20;
	if (null == Class445_Sub12.aClass96_8651
	    || null == Class175.aClass639_2122) {
	    Class445_Sub12.aClass96_8651
		= ((Class96)
		   Class425.aClass344_6080.method6161((client
						       .anInterface26_8552),
						      (193407783
						       * Class200.anInt2398),
						      true, true, 138589064));
	    Class175.aClass639_2122
		= Class425.aClass344_6080.method6141(client.anInterface26_8552,
						     (193407783
						      * Class200.anInt2398),
						     (byte) 86);
	    if (Class445_Sub12.aClass96_8651 != null
		&& null != Class175.aClass639_2122) {
		Class198.method4036((byte) 4);
		int i_8_ = i_3_ + i_5_ / 2;
		if (i_8_ + i_5_ > Class494.canvasWid * -1080559003)
		    i_8_ = Class494.canvasWid * -1080559003 - i_5_;
		if (i_8_ < 0)
		    i_8_ = 0;
		Class630.method13488(i_8_, 904064679 * Class380.anInt5660,
				     (byte) -6);
		return;
	    }
	}
	Class96 class96;
	if (Class445_Sub12.aClass96_8651 == null
	    || Class175.aClass639_2122 == null)
	    class96 = Class81.aClass96_1149;
	else
	    class96 = Class445_Sub12.aClass96_8651;
	Class639 class639 = OnlineStatus.method7519(1896664073);
	Class445_Sub27.method14369
	    (class103, Class16.anInt156 * 1011088115,
	     Class380.anInt5660 * 904064679, 1139603851 * Class593.anInt7631,
	     LoadingScreenDef.anInt5500 * 630071575, i_7_, class96, class639,
	     ClientMessage.CHOOSEOPTION.getLocalisedMessage(VarPlayerDomain.currentLocale,
						 (short) 17676),
	     (byte) 0);
	int i_9_ = (255 - -254997353 * Class25.anInt212
		    - Class16.anInt144 * 932005875);
	if (i_9_ < 0)
	    i_9_ = 0;
	int i_10_ = Class106.aClass580_1503.method12718(1320688470);
	int i_11_ = Class106.aClass580_1503.method12740((byte) -108);
	if (!Class16.aBool171) {
	    int i_12_ = 0;
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			Class16.aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			Class16.aClass429_150.method7692(450623094))) {
		int i_13_ = ((1149989507 * Class16.anInt164
			      * (Class16.anInt148 * 1327183635 - 1 - i_12_))
			     + (1 + (i_4_ + i_7_
				     + class639.anInt8258 * -351886683)));
		if (i_10_ > Class16.anInt156 * 1011088115
		    && i_10_ < (1011088115 * Class16.anInt156
				+ Class593.anInt7631 * 1139603851)
		    && i_11_ > i_13_ - -351886683 * class639.anInt8258 - 1
		    && i_11_ < 326424439 * class639.anInt8260 + i_13_
		    && (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aBool10876))
		    class103.method2396(1011088115 * Class16.anInt156,
					(i_13_
					 - -351886683 * class639.anInt8258),
					Class593.anInt7631 * 1139603851,
					Class16.anInt164 * 1149989507,
					(i_9_ << 24
					 | 382464113 * Class509.anInt6682),
					1);
		i_12_++;
	    }
	} else {
	    int i_14_ = 0;
	    for (Class241_Sub39_Sub10 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			Class16.aClass410_152.method7440(-1397088259));
		 class241_sub39_sub10 != null;
		 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			Class16.aClass410_152.method7435((byte) -1))) {
		int i_15_ = (1149989507 * Class16.anInt164 * i_14_
			     + (1 + (i_7_ + i_4_
				     + -351886683 * class639.anInt8258)));
		if (i_10_ > 1011088115 * Class16.anInt156
		    && i_10_ < (Class593.anInt7631 * 1139603851
				+ 1011088115 * Class16.anInt156)
		    && i_11_ > i_15_ - -351886683 * class639.anInt8258 - 1
		    && i_11_ < i_15_ + 326424439 * class639.anInt8260
		    && ((((Class241_Sub39_Sub10) class241_sub39_sub10)
			 .anInt10867) * 1633676605 > 1
			|| ((Class241_Sub39_Sub11) (Class241_Sub39_Sub11)
			    (((Class241_Sub39_Sub10) class241_sub39_sub10)
			     .aClass410_10866.aClass241_Sub39_5934
			     .aClass241_Sub39_10148)).aBool10876))
		    class103.method2396(1011088115 * Class16.anInt156,
					(i_15_
					 - class639.anInt8258 * -351886683),
					Class593.anInt7631 * 1139603851,
					1149989507 * Class16.anInt164,
					(i_9_ << 24
					 | Class509.anInt6682 * 382464113),
					1);
		i_14_++;
	    }
	    if (null != Class16.aClass241_Sub39_Sub10_143) {
		Class445_Sub27.method14369(class103,
					   1955430821 * Class193.anInt2298,
					   Class4.anInt16 * 282057643,
					   Class16.anInt147 * -885853667,
					   Class395.anInt5784 * -950722911,
					   i_7_, class96, class639,
					   (((Class241_Sub39_Sub10)
					     Class16.aClass241_Sub39_Sub10_143)
					    .aString10865),
					   (byte) 0);
		i_14_ = 0;
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10)
			     Class16.aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7440(-1397088259));
		     null != class241_sub39_sub11;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10)
			     Class16.aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7435((byte) -1))) {
		    int i_16_ = (1149989507 * Class16.anInt164 * i_14_
				 + (1 + (Class4.anInt16 * 282057643 + i_7_
					 + -351886683 * class639.anInt8258)));
		    if (i_10_ > Class193.anInt2298 * 1955430821
			&& i_10_ < (1955430821 * Class193.anInt2298
				    + Class16.anInt147 * -885853667)
			&& i_11_ > i_16_ - -351886683 * class639.anInt8258 - 1
			&& i_11_ < i_16_ + class639.anInt8260 * 326424439
			&& (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aBool10876))
			class103.method2396(1955430821 * Class193.anInt2298,
					    i_16_ - (-351886683
						     * class639.anInt8258),
					    Class16.anInt147 * -885853667,
					    1149989507 * Class16.anInt164,
					    (i_9_ << 24
					     | Class509.anInt6682 * 382464113),
					    1);
		    i_14_++;
		}
		Class158.method3403(class103, 1955430821 * Class193.anInt2298,
				    282057643 * Class4.anInt16,
				    -885853667 * Class16.anInt147,
				    Class395.anInt5784 * -950722911, i_7_,
				    -945785035);
	    }
	}
	Class158.method3403(class103, 1011088115 * Class16.anInt156,
			    904064679 * Class380.anInt5660,
			    1139603851 * Class593.anInt7631,
			    630071575 * LoadingScreenDef.anInt5500, i_7_, -712693632);
	if (!Class16.aBool171) {
	    int i_17_ = 0;
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			Class16.aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			Class16.aClass429_150.method7692(591524152))) {
		int i_18_ = (((Class16.anInt148 * 1327183635 - 1 - i_17_)
			      * (Class16.anInt164 * 1149989507))
			     + (class639.anInt8258 * -351886683 + (i_7_ + i_4_)
				+ 1));
		Class338.method6113(i_10_, i_11_, i_3_, i_4_, i_5_, i_6_,
				    i_18_, class241_sub39_sub11, class96,
				    class639,
				    (BaseVarType.anInt2541 * -304788339
				     | ~0xffffff),
				    433761765 * Class8.anInt45 | ~0xffffff,
				    802613034);
		i_17_++;
	    }
	} else {
	    int i_19_ = 0;
	    for (Class241_Sub39_Sub10 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			Class16.aClass410_152.method7440(-1397088259));
		 class241_sub39_sub10 != null;
		 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			Class16.aClass410_152.method7435((byte) -1))) {
		int i_20_ = (i_19_ * (1149989507 * Class16.anInt164)
			     + (Class380.anInt5660 * 904064679 + i_7_
				+ -351886683 * class639.anInt8258 + 1));
		if (1 == (((Class241_Sub39_Sub10) class241_sub39_sub10)
			  .anInt10867) * 1633676605)
		    Class338.method6113
			(i_10_, i_11_, Class16.anInt156 * 1011088115,
			 904064679 * Class380.anInt5660,
			 1139603851 * Class593.anInt7631,
			 LoadingScreenDef.anInt5500 * 630071575, i_20_,
			 ((Class241_Sub39_Sub11)
			  (((Class241_Sub39_Sub10) class241_sub39_sub10)
			   .aClass410_10866.aClass241_Sub39_5934
			   .aClass241_Sub39_10148)),
			 class96, class639,
			 BaseVarType.anInt2541 * -304788339 | ~0xffffff,
			 Class8.anInt45 * 433761765 | ~0xffffff, 2066931770);
		else
		    Class544.method11985
			(i_10_, i_11_, 1011088115 * Class16.anInt156,
			 904064679 * Class380.anInt5660,
			 Class593.anInt7631 * 1139603851,
			 LoadingScreenDef.anInt5500 * 630071575, i_20_,
			 class241_sub39_sub10, class96, class639,
			 -304788339 * BaseVarType.anInt2541 | ~0xffffff,
			 Class8.anInt45 * 433761765 | ~0xffffff, 1256837828);
		i_19_++;
	    }
	    if (null != Class16.aClass241_Sub39_Sub10_143) {
		i_19_ = 0;
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10)
			     Class16.aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7440(-1397088259));
		     null != class241_sub39_sub11;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10)
			     Class16.aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7435((byte) -1))) {
		    int i_21_ = (class639.anInt8258 * -351886683
				 + (i_7_ + 282057643 * Class4.anInt16) + 1
				 + i_19_ * (Class16.anInt164 * 1149989507));
		    Class338.method6113(i_10_, i_11_,
					Class193.anInt2298 * 1955430821,
					282057643 * Class4.anInt16,
					-885853667 * Class16.anInt147,
					Class395.anInt5784 * -950722911, i_21_,
					class241_sub39_sub11, class96,
					class639,
					(BaseVarType.anInt2541 * -304788339
					 | ~0xffffff),
					Class8.anInt45 * 433761765 | ~0xffffff,
					1782513898);
		    i_19_++;
		}
	    }
	}
    }
}
