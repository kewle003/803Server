/* Class638 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Class638
{
    static Calendar aCalendar8252;
    static Calendar aCalendar8253;
    static String[][] aStringArrayArray8254
	= { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
	      "Oct", "Nov", "Dec" },
	    { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug",
	      "Sep", "Okt", "Nov", "Dez" },
	    { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil",
	      "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" },
	    { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set",
	      "out", "nov", "dez" },
	    { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep",
	      "okt", "nov", "dec" },
	    { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
	      "Oct", "Nov", "Dec" },
	    { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep",
	      "oct", "nov", "dic" } };
    
    static String method13534(long l, int i, boolean bool) {
	Calendar calendar;
	if (bool) {
	    Class103_Sub2.method15432(l);
	    calendar = aCalendar8253;
	} else {
	    Class447.method7916(l);
	    calendar = aCalendar8252;
	}
	int i_0_ = calendar.get(5);
	int i_1_ = calendar.get(2) + 1;
	int i_2_ = calendar.get(1);
	int i_3_ = calendar.get(11);
	int i_4_ = calendar.get(12);
	return new StringBuilder().append(Integer.toString(i_0_ / 10)).append
		   (i_0_ % 10).append
		   ("/").append
		   (i_1_ / 10).append
		   (i_1_ % 10).append
		   ("/").append
		   (i_2_ % 100 / 10).append
		   (i_2_ % 10).append
		   (" ").append
		   (i_3_ / 10).append
		   (i_3_ % 10).append
		   (":").append
		   (i_4_ / 10).append
		   (i_4_ % 10).toString();
    }
    
    static {
	aCalendar8252 = Calendar.getInstance();
	aCalendar8253 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
    
    public static String method13535(long l, int i, boolean bool) {
	Calendar calendar;
	if (bool) {
	    Class103_Sub2.method15432(l);
	    calendar = aCalendar8253;
	} else {
	    Class447.method7916(l);
	    calendar = aCalendar8252;
	}
	int i_5_ = calendar.get(5);
	int i_6_ = calendar.get(2);
	int i_7_ = calendar.get(1);
	int i_8_ = calendar.get(11);
	int i_9_ = calendar.get(12);
	if (3 == i)
	    return VarTransmitLevel.method5824(l, i, bool, 1473893111);
	return new StringBuilder().append(Integer.toString(i_5_ / 10)).append
		   (i_5_ % 10).append
		   ("-").append
		   (aStringArrayArray8254[i][i_6_]).append
		   ("-").append
		   (i_7_).append
		   (" ").append
		   (i_8_ / 10).append
		   (i_8_ % 10).append
		   (":").append
		   (i_9_ / 10).append
		   (i_9_ % 10).toString();
    }
    
    public static String method13536(long l, int i) {
	Class447.method7916(l);
	int i_10_ = aCalendar8252.get(5);
	int i_11_ = aCalendar8252.get(2);
	int i_12_ = aCalendar8252.get(1);
	if (i == 3)
	    return LoadingScreenDef.method6487(l, i, 2103154536);
	return new StringBuilder().append(Integer.toString(i_10_ / 10)).append
		   (i_10_ % 10).append
		   ("-").append
		   (aStringArrayArray8254[i][i_11_]).append
		   ("-").append
		   (i_12_).toString();
    }
    
    public static String method13537(long l, int i) {
	Class447.method7916(l);
	int i_13_ = aCalendar8252.get(5);
	int i_14_ = aCalendar8252.get(2);
	int i_15_ = aCalendar8252.get(1);
	if (i == 3)
	    return LoadingScreenDef.method6487(l, i, -923368324);
	return new StringBuilder().append(Integer.toString(i_13_ / 10)).append
		   (i_13_ % 10).append
		   ("-").append
		   (aStringArrayArray8254[i][i_14_]).append
		   ("-").append
		   (i_15_).toString();
    }
    
    public static String method13538(long l, int i) {
	Class447.method7916(l);
	int i_16_ = aCalendar8252.get(5);
	int i_17_ = aCalendar8252.get(2);
	int i_18_ = aCalendar8252.get(1);
	if (i == 3)
	    return LoadingScreenDef.method6487(l, i, 936936924);
	return new StringBuilder().append(Integer.toString(i_16_ / 10)).append
		   (i_16_ % 10).append
		   ("-").append
		   (aStringArrayArray8254[i][i_17_]).append
		   ("-").append
		   (i_18_).toString();
    }
    
    public static int method13539(long l) {
	return (int) (l / 86400000L) - 11745;
    }
    
    public static int[] method13540(int i) {
	int[] is = new int[3];
	Class447.method7916(Class436.method7799(i, (byte) 32));
	is[0] = aCalendar8252.get(5);
	is[1] = aCalendar8252.get(2);
	is[2] = aCalendar8252.get(1);
	return is;
    }
    
    static String method13541(long l, int i, boolean bool) {
	Calendar calendar;
	if (bool) {
	    Class103_Sub2.method15432(l);
	    calendar = aCalendar8253;
	} else {
	    Class447.method7916(l);
	    calendar = aCalendar8252;
	}
	int i_19_ = calendar.get(5);
	int i_20_ = calendar.get(2) + 1;
	int i_21_ = calendar.get(1);
	int i_22_ = calendar.get(11);
	int i_23_ = calendar.get(12);
	return new StringBuilder().append(Integer.toString(i_19_ / 10)).append
		   (i_19_ % 10).append
		   ("/").append
		   (i_20_ / 10).append
		   (i_20_ % 10).append
		   ("/").append
		   (i_21_ % 100 / 10).append
		   (i_21_ % 10).append
		   (" ").append
		   (i_22_ / 10).append
		   (i_22_ % 10).append
		   (":").append
		   (i_23_ / 10).append
		   (i_23_ % 10).toString();
    }
    
    static String method13542(long l, int i) {
	Class447.method7916(l);
	int i_24_ = aCalendar8252.get(5);
	int i_25_ = aCalendar8252.get(2) + 1;
	int i_26_ = aCalendar8252.get(1);
	return new StringBuilder().append(Integer.toString(i_24_ / 10)).append
		   (i_24_ % 10).append
		   ("/").append
		   (i_25_ / 10).append
		   (i_25_ % 10).append
		   ("/").append
		   (i_26_ % 100 / 10).append
		   (i_26_ % 10).toString();
    }
    
    public static int method13543(long l) {
	return (int) (l / 86400000L) - 11745;
    }
    
    public static int method13544(long l) {
	return (int) (l / 86400000L) - 11745;
    }
    
    Class638() throws Throwable {
	throw new Error();
    }
    
    public static int method13545(long l) {
	return (int) (l / 86400000L) - 11745;
    }
    
    static void method13546(long l) {
	aCalendar8252.setTime(new Date(l));
    }
    
    static void method13547(long l) {
	aCalendar8252.setTime(new Date(l));
    }
    
    static void method13548(long l) {
	aCalendar8252.setTime(new Date(l));
    }
    
    static void method13549(long l) {
	aCalendar8252.setTime(new Date(l));
    }
    
    public static int method13550(long l) {
	Class447.method7916(l);
	return aCalendar8252.get(1);
    }
    
    public static int[] method13551(int i) {
	int[] is = new int[3];
	Class447.method7916(Class436.method7799(i, (byte) 32));
	is[0] = aCalendar8252.get(5);
	is[1] = aCalendar8252.get(2);
	is[2] = aCalendar8252.get(1);
	return is;
    }
    
    public static long method13552(int i, int i_27_, int i_28_, int i_29_,
				   int i_30_, int i_31_) {
	aCalendar8253.clear();
	aCalendar8253.set(i_31_, i_30_, i_29_, i_28_, i_27_, i);
	return aCalendar8253.getTime().getTime();
    }
    
    public static long method13553(int i) {
	return (long) (i + 11745) * 86400000L;
    }
    
    public static long method13554(int i) {
	return (long) (i + 11745) * 86400000L;
    }
    
    public static int method13555(long l) {
	Class447.method7916(l);
	return aCalendar8252.get(1);
    }
    
    public static String method13556(long l, int i, boolean bool) {
	Calendar calendar;
	if (bool) {
	    Class103_Sub2.method15432(l);
	    calendar = aCalendar8253;
	} else {
	    Class447.method7916(l);
	    calendar = aCalendar8252;
	}
	int i_32_ = calendar.get(5);
	int i_33_ = calendar.get(2);
	int i_34_ = calendar.get(1);
	int i_35_ = calendar.get(11);
	int i_36_ = calendar.get(12);
	if (3 == i)
	    return VarTransmitLevel.method5824(l, i, bool, 1473893111);
	return new StringBuilder().append(Integer.toString(i_32_ / 10)).append
		   (i_32_ % 10).append
		   ("-").append
		   (aStringArrayArray8254[i][i_33_]).append
		   ("-").append
		   (i_34_).append
		   (" ").append
		   (i_35_ / 10).append
		   (i_35_ % 10).append
		   (":").append
		   (i_36_ / 10).append
		   (i_36_ % 10).toString();
    }
    
    public static void method13557
	(Entity class475_sub1_sub1_sub3, int[] is, int i,
	 boolean bool, byte i_37_) {
	if (class475_sub1_sub1_sub3.anIntArray11397 != null) {
	    boolean bool_38_ = true;
	    for (int i_39_ = 0;
		 i_39_ < class475_sub1_sub1_sub3.anIntArray11397.length;
		 i_39_++) {
		if (class475_sub1_sub1_sub3.anIntArray11397[i_39_]
		    != is[i_39_]) {
		    bool_38_ = false;
		    break;
		}
	    }
	    Class409 class409 = class475_sub1_sub1_sub3.aClass409_11375;
	    if (bool_38_ && class409.method7364(-40539334)) {
		AnimationDefinition class549 = class475_sub1_sub1_sub3.aClass409_11375
					.method7345((byte) -57);
		int i_40_ = 1834456867 * class549.anInt7078;
		if (1 == i_40_)
		    class409.method7353(i, (byte) 5);
		if (2 == i_40_)
		    class409.method7361((byte) 35);
	    }
	}
	boolean bool_41_ = true;
	for (int i_42_ = 0; i_42_ < is.length; i_42_++) {
	    if (-1 != is[i_42_])
		bool_41_ = false;
	    if (null == class475_sub1_sub1_sub3.anIntArray11397
		|| -1 == class475_sub1_sub1_sub3.anIntArray11397[i_42_]
		|| ((Class394.animationDefLoader.getAnimationDefinition(is[i_42_], (byte) -9)
		     .anInt7076) * -397642129
		    >= (Class394.animationDefLoader.getAnimationDefinition
			(class475_sub1_sub1_sub3.anIntArray11397[i_42_],
			 (byte) 11)
			.anInt7076) * -397642129)) {
		class475_sub1_sub1_sub3.anIntArray11397 = is;
		class475_sub1_sub1_sub3.aClass409_11375.method7355(i,
								   624915991);
		if (bool)
		    class475_sub1_sub1_sub3.anInt11430
			= -1740946833 * class475_sub1_sub1_sub3.queuedStepCount;
	    }
	}
	if (bool_41_) {
	    class475_sub1_sub1_sub3.anIntArray11397 = is;
	    class475_sub1_sub1_sub3.aClass409_11375.method7355(i, 898928319);
	    if (bool)
		class475_sub1_sub1_sub3.anInt11430
		    = class475_sub1_sub1_sub3.queuedStepCount * -1740946833;
	}
    }
    
    public static void method13558
	(NPC class475_sub1_sub1_sub3_sub2, int i) {
	for (Class241_Sub38 class241_sub38
		 = ((Class241_Sub38)
		    Class241_Sub38.aClass429_10117.method7694(16711935));
	     class241_sub38 != null;
	     class241_sub38 = (Class241_Sub38) Class241_Sub38
						   .aClass429_10117
						   .method7692(242957501)) {
	    if ((((Class241_Sub38) class241_sub38)
		 .aClass475_Sub1_Sub1_Sub3_Sub2_10130)
		== class475_sub1_sub1_sub3_sub2) {
		if (null
		    != ((Class241_Sub38) class241_sub38).aClass221_10141) {
		    ((Class241_Sub38) class241_sub38).aClass221_10141
			.method4405(100, -230814921);
		    Class402.soundManager.method1136((((Class241_Sub38)
							class241_sub38)
						       .aClass221_10141),
						      (byte) -9);
		    ((Class241_Sub38) class241_sub38).aClass221_10141 = null;
		}
		class241_sub38.remove((byte) 36);
		break;
	    }
	}
    }
}
