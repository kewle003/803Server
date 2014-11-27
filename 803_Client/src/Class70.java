/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class70 implements Runnable
{
    int anInt1077;
    boolean aBool1078;
    String aString1079;
    Interface37 anInterface37_1080;
    Interface37 anInterface37_1081 = new Class356();
    volatile boolean aBool1082;
    long aLong1083;
    String aString1084;
    long aLong1085;
    int anInt1086;
    LoadingScreenDef aClass359_1087;
    
    public void method1691() {
	while (!((Class70) this).aBool1082) {
	    long l = Class50.method1249((byte) 1);
	    synchronized (this) {
		try {
		    ((Class70) this).anInt1077 += -750208279;
		    if (((Class70) this).anInterface37_1081
			instanceof Class356)
			((Class70) this).anInterface37_1081
			    .method196(((Class70) this).aBool1078, (byte) -34);
		    else {
			long l_0_ = Class50.method1249((byte) 1);
			if (Class236.aClass103_2713 != null
			    && null != ((Class70) this).anInterface37_1080
			    && ((Class70) this).anInterface37_1080
				   .method200(426084078) != 0
			    && ((-7299236459702022819L
				 * ((Class70) this).aLong1085)
				>= l_0_ - (long) ((Class70) this)
						     .anInterface37_1080
						     .method200(426084078))) {
			    int i = (int) (255L
					   * (l_0_
					      - (-7299236459702022819L
						 * ((Class70) this).aLong1085))
					   / (long) ((Class70) this)
							.anInterface37_1080
							.method200(426084078));
			    int i_1_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_1_ = i_1_ << 24 | 0xffffff;
			    Class109.method2765((byte) -73);
			    Class236.aClass103_2713.method2450(1, 0);
			    Class168 class168
				= (Class236.aClass103_2713.method2285
				   (-1080559003 * Class494.canvasWid,
				    963058943 * Class67.canvasHei, true,
				    1335668576));
			    Class105_Sub2 class105_sub2
				= Class236.aClass103_2713.method2248();
			    class105_sub2.method15585(0,
						      class168.method3608());
			    Class236.aClass103_2713.method2244(class105_sub2,
							       -519163929);
			    ((Class70) this).anInterface37_1080
				.method196(true, (byte) -102);
			    Class236.aClass103_2713.method2245(class105_sub2,
							       -595314002);
			    class168.method3666(0, 0, 0, i_1_, 1);
			    Class236.aClass103_2713.method2244(class105_sub2,
							       -519163929);
			    Class236.aClass103_2713.method2450(1, 0);
			    ((Class70) this).anInterface37_1081
				.method196(true, (byte) -54);
			    Class236.aClass103_2713.method2245(class105_sub2,
							       -108821627);
			    class168.method3666(0, 0, 0, i, 1);
			} else {
			    if (null != ((Class70) this).anInterface37_1080) {
				((Class70) this).aBool1078 = true;
				((Class70) this).anInterface37_1080
				    .method207(1959897076);
				((Class70) this).anInterface37_1080 = null;
			    }
			    if (((Class70) this).aBool1078) {
				Class109.method2765((byte) -92);
				if (Class236.aClass103_2713 != null)
				    Class236.aClass103_2713.method2450(1, 0);
			    }
			    ((Class70) this).anInterface37_1081.method196
				((((Class70) this).aBool1078
				  || (null != Class236.aClass103_2713
				      && Class236.aClass103_2713
					     .method2502())),
				 (byte) -46);
			}
			try {
			    if (null != Class236.aClass103_2713
				&& !(((Class70) this).anInterface37_1081
				     instanceof Class356))
				Class236.aClass103_2713.method2217((byte) 106);
			} catch (Exception_Sub2 exception_sub2) {
			    VarType.method3770
				(new StringBuilder().append
				     (exception_sub2.getMessage()).append
				     (ObjectDefinition.aclient6907
					  .method12985((byte) 0))
				     .toString(),
				 exception_sub2, -1274718268);
			    GraphicsDefaults.method11570(0, true, 1945822518);
			}
		    }
		    ((Class70) this).aBool1078 = false;
		    if (null != Class236.aClass103_2713
			&& !(((Class70) this).anInterface37_1081
			     instanceof Class356)
			&& ((((Class70) this).aClass359_1087.anInt5478
			     * -601665271)
			    < -601665271 * LoadingScreenDef.LOADING_STAGE_15.anInt5478))
			Class495.method11283(819498745);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_2_ = Class50.method1249((byte) 1);
	    int i = (int) (20L - (l_2_ - l));
	    if (i > 0)
		Class380_Sub2.method16722((long) i);
	}
    }
    
    int method1692(int i) {
	return ((Class70) this).anInt1077 * 1179762009;
    }
    
    public String method1693(short i) {
	return ((Class70) this).aString1084;
    }
    
    synchronized boolean method1694(int i) {
	return (((Class70) this).anInterface37_1081.method198
		(((Class70) this).aLong1085 * -7299236459702022819L));
    }
    
    synchronized void method1695(Interface37 interface37, int i) {
	((Class70) this).anInterface37_1080
	    = ((Class70) this).anInterface37_1081;
	((Class70) this).anInterface37_1081 = interface37;
	((Class70) this).aLong1085
	    = Class50.method1249((byte) 1) * -8965078323170300171L;
    }
    
    synchronized void method1696(long l, String string, String string_3_,
				 int i, LoadingScreenDef class359, int i_4_) {
	((Class70) this).aLong1083 = l * -3350888782126308629L;
	((Class70) this).aString1079 = string;
	((Class70) this).aString1084 = string_3_;
	((Class70) this).anInt1086 = -1486451155 * i;
	((Class70) this).aClass359_1087 = class359;
    }
    
    public int method1697(byte i) {
	if (null == ((Class70) this).aClass359_1087)
	    return 0;
	int i_5_ = -601665271 * ((Class70) this).aClass359_1087.anInt5478;
	if (((LoadingScreenDef) ((Class70) this).aClass359_1087).aBool5499
	    && (((Class70) this).anInt1086 * 1644622245
		< (((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5497
		   * 633090493)))
	    return 1644622245 * ((Class70) this).anInt1086 + 1;
	if (i_5_ < 0 || i_5_ >= Class68.aClass359Array1065.length - 1)
	    return 100;
	if ((-1299978731
	     * ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5496)
	    == ((Class70) this).anInt1086 * 1644622245)
	    return (633090493
		    * ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5497);
	return (-1299978731
		* ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5496);
    }
    
    synchronized void method1698() {
	((Class70) this).aBool1078 = true;
    }
    
    synchronized void method1699(int i) {
	((Class70) this).aBool1078 = true;
    }
    
    public String method1700(int i) {
	return ((Class70) this).aString1079;
    }
    
    int method1701() {
	return ((Class70) this).anInt1077 * 1179762009;
    }
    
    public LoadingScreenDef method1702(int i) {
	return ((Class70) this).aClass359_1087;
    }
    
    void method1703(byte i) {
	((Class70) this).aBool1082 = true;
    }
    
    public void run() {
	while (!((Class70) this).aBool1082) {
	    long l = Class50.method1249((byte) 1);
	    synchronized (this) {
		try {
		    ((Class70) this).anInt1077 += -750208279;
		    if (((Class70) this).anInterface37_1081
			instanceof Class356)
			((Class70) this).anInterface37_1081
			    .method196(((Class70) this).aBool1078, (byte) -40);
		    else {
			long l_6_ = Class50.method1249((byte) 1);
			if (Class236.aClass103_2713 != null
			    && null != ((Class70) this).anInterface37_1080
			    && ((Class70) this).anInterface37_1080
				   .method200(426084078) != 0
			    && ((-7299236459702022819L
				 * ((Class70) this).aLong1085)
				>= l_6_ - (long) ((Class70) this)
						     .anInterface37_1080
						     .method200(426084078))) {
			    int i = (int) (255L
					   * (l_6_
					      - (-7299236459702022819L
						 * ((Class70) this).aLong1085))
					   / (long) ((Class70) this)
							.anInterface37_1080
							.method200(426084078));
			    int i_7_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_7_ = i_7_ << 24 | 0xffffff;
			    Class109.method2765((byte) -115);
			    Class236.aClass103_2713.method2450(1, 0);
			    Class168 class168
				= (Class236.aClass103_2713.method2285
				   (-1080559003 * Class494.canvasWid,
				    963058943 * Class67.canvasHei, true,
				    1702269185));
			    Class105_Sub2 class105_sub2
				= Class236.aClass103_2713.method2248();
			    class105_sub2.method15585(0,
						      class168.method3608());
			    Class236.aClass103_2713.method2244(class105_sub2,
							       -519163929);
			    ((Class70) this).anInterface37_1080
				.method196(true, (byte) -64);
			    Class236.aClass103_2713.method2245(class105_sub2,
							       246193541);
			    class168.method3666(0, 0, 0, i_7_, 1);
			    Class236.aClass103_2713.method2244(class105_sub2,
							       -519163929);
			    Class236.aClass103_2713.method2450(1, 0);
			    ((Class70) this).anInterface37_1081
				.method196(true, (byte) -22);
			    Class236.aClass103_2713.method2245(class105_sub2,
							       -1653581629);
			    class168.method3666(0, 0, 0, i, 1);
			} else {
			    if (null != ((Class70) this).anInterface37_1080) {
				((Class70) this).aBool1078 = true;
				((Class70) this).anInterface37_1080
				    .method207(1367604988);
				((Class70) this).anInterface37_1080 = null;
			    }
			    if (((Class70) this).aBool1078) {
				Class109.method2765((byte) -21);
				if (Class236.aClass103_2713 != null)
				    Class236.aClass103_2713.method2450(1, 0);
			    }
			    ((Class70) this).anInterface37_1081.method196
				((((Class70) this).aBool1078
				  || (null != Class236.aClass103_2713
				      && Class236.aClass103_2713
					     .method2502())),
				 (byte) -29);
			}
			try {
			    if (null != Class236.aClass103_2713
				&& !(((Class70) this).anInterface37_1081
				     instanceof Class356))
				Class236.aClass103_2713.method2217((byte) 36);
			} catch (Exception_Sub2 exception_sub2) {
			    VarType.method3770
				(new StringBuilder().append
				     (exception_sub2.getMessage()).append
				     (ObjectDefinition.aclient6907
					  .method12985((byte) 2))
				     .toString(),
				 exception_sub2, -791676757);
			    GraphicsDefaults.method11570(0, true, 1945822518);
			}
		    }
		    ((Class70) this).aBool1078 = false;
		    if (null != Class236.aClass103_2713
			&& !(((Class70) this).anInterface37_1081
			     instanceof Class356)
			&& ((((Class70) this).aClass359_1087.anInt5478
			     * -601665271)
			    < -601665271 * LoadingScreenDef.LOADING_STAGE_15.anInt5478))
			Class495.method11283(-2075305113);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_8_ = Class50.method1249((byte) 1);
	    int i = (int) (20L - (l_8_ - l));
	    if (i > 0)
		Class380_Sub2.method16722((long) i);
	}
    }
    
    public void method1704() {
	while (!((Class70) this).aBool1082) {
	    long l = Class50.method1249((byte) 1);
	    synchronized (this) {
		try {
		    ((Class70) this).anInt1077 += -750208279;
		    if (((Class70) this).anInterface37_1081
			instanceof Class356)
			((Class70) this).anInterface37_1081
			    .method196(((Class70) this).aBool1078, (byte) -92);
		    else {
			long l_9_ = Class50.method1249((byte) 1);
			if (Class236.aClass103_2713 != null
			    && null != ((Class70) this).anInterface37_1080
			    && ((Class70) this).anInterface37_1080
				   .method200(426084078) != 0
			    && ((-7299236459702022819L
				 * ((Class70) this).aLong1085)
				>= l_9_ - (long) ((Class70) this)
						     .anInterface37_1080
						     .method200(426084078))) {
			    int i = (int) (255L
					   * (l_9_
					      - (-7299236459702022819L
						 * ((Class70) this).aLong1085))
					   / (long) ((Class70) this)
							.anInterface37_1080
							.method200(426084078));
			    int i_10_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_10_ = i_10_ << 24 | 0xffffff;
			    Class109.method2765((byte) -72);
			    Class236.aClass103_2713.method2450(1, 0);
			    Class168 class168
				= (Class236.aClass103_2713.method2285
				   (-1080559003 * Class494.canvasWid,
				    963058943 * Class67.canvasHei, true,
				    1235799333));
			    Class105_Sub2 class105_sub2
				= Class236.aClass103_2713.method2248();
			    class105_sub2.method15585(0,
						      class168.method3608());
			    Class236.aClass103_2713.method2244(class105_sub2,
							       -519163929);
			    ((Class70) this).anInterface37_1080
				.method196(true, (byte) -36);
			    Class236.aClass103_2713.method2245(class105_sub2,
							       34799812);
			    class168.method3666(0, 0, 0, i_10_, 1);
			    Class236.aClass103_2713.method2244(class105_sub2,
							       -519163929);
			    Class236.aClass103_2713.method2450(1, 0);
			    ((Class70) this).anInterface37_1081
				.method196(true, (byte) -69);
			    Class236.aClass103_2713.method2245(class105_sub2,
							       577527025);
			    class168.method3666(0, 0, 0, i, 1);
			} else {
			    if (null != ((Class70) this).anInterface37_1080) {
				((Class70) this).aBool1078 = true;
				((Class70) this).anInterface37_1080
				    .method207(1107949838);
				((Class70) this).anInterface37_1080 = null;
			    }
			    if (((Class70) this).aBool1078) {
				Class109.method2765((byte) -17);
				if (Class236.aClass103_2713 != null)
				    Class236.aClass103_2713.method2450(1, 0);
			    }
			    ((Class70) this).anInterface37_1081.method196
				((((Class70) this).aBool1078
				  || (null != Class236.aClass103_2713
				      && Class236.aClass103_2713
					     .method2502())),
				 (byte) -90);
			}
			try {
			    if (null != Class236.aClass103_2713
				&& !(((Class70) this).anInterface37_1081
				     instanceof Class356))
				Class236.aClass103_2713.method2217((byte) 32);
			} catch (Exception_Sub2 exception_sub2) {
			    VarType.method3770
				(new StringBuilder().append
				     (exception_sub2.getMessage()).append
				     (ObjectDefinition.aclient6907
					  .method12985((byte) 22))
				     .toString(),
				 exception_sub2, -699617680);
			    GraphicsDefaults.method11570(0, true, 1945822518);
			}
		    }
		    ((Class70) this).aBool1078 = false;
		    if (null != Class236.aClass103_2713
			&& !(((Class70) this).anInterface37_1081
			     instanceof Class356)
			&& ((((Class70) this).aClass359_1087.anInt5478
			     * -601665271)
			    < -601665271 * LoadingScreenDef.LOADING_STAGE_15.anInt5478))
			Class495.method11283(548438476);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_11_ = Class50.method1249((byte) 1);
	    int i = (int) (20L - (l_11_ - l));
	    if (i > 0)
		Class380_Sub2.method16722((long) i);
	}
    }
    
    public int method1705() {
	if (null == ((Class70) this).aClass359_1087)
	    return 0;
	int i = -601665271 * ((Class70) this).aClass359_1087.anInt5478;
	if (((LoadingScreenDef) ((Class70) this).aClass359_1087).aBool5499
	    && (((Class70) this).anInt1086 * 1644622245
		< (((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5497
		   * 633090493)))
	    return 1644622245 * ((Class70) this).anInt1086 + 1;
	if (i < 0 || i >= Class68.aClass359Array1065.length - 1)
	    return 100;
	if ((-1299978731
	     * ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5496)
	    == ((Class70) this).anInt1086 * 1644622245)
	    return (633090493
		    * ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5497);
	return (-1299978731
		* ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5496);
    }
    
    public long method1706(int i) {
	return 7096617100120389059L * ((Class70) this).aLong1083;
    }
    
    public void method1707() {
	while (!((Class70) this).aBool1082) {
	    long l = Class50.method1249((byte) 1);
	    synchronized (this) {
		try {
		    ((Class70) this).anInt1077 += -750208279;
		    if (((Class70) this).anInterface37_1081
			instanceof Class356)
			((Class70) this).anInterface37_1081
			    .method196(((Class70) this).aBool1078, (byte) -98);
		    else {
			long l_12_ = Class50.method1249((byte) 1);
			if (Class236.aClass103_2713 != null
			    && null != ((Class70) this).anInterface37_1080
			    && ((Class70) this).anInterface37_1080
				   .method200(426084078) != 0
			    && ((-7299236459702022819L
				 * ((Class70) this).aLong1085)
				>= l_12_ - (long) ((Class70) this)
						      .anInterface37_1080
						      .method200(426084078))) {
			    int i = (int) (255L
					   * (l_12_
					      - (-7299236459702022819L
						 * ((Class70) this).aLong1085))
					   / (long) ((Class70) this)
							.anInterface37_1080
							.method200(426084078));
			    int i_13_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_13_ = i_13_ << 24 | 0xffffff;
			    Class109.method2765((byte) -64);
			    Class236.aClass103_2713.method2450(1, 0);
			    Class168 class168
				= (Class236.aClass103_2713.method2285
				   (-1080559003 * Class494.canvasWid,
				    963058943 * Class67.canvasHei, true,
				    1919499087));
			    Class105_Sub2 class105_sub2
				= Class236.aClass103_2713.method2248();
			    class105_sub2.method15585(0,
						      class168.method3608());
			    Class236.aClass103_2713.method2244(class105_sub2,
							       -519163929);
			    ((Class70) this).anInterface37_1080
				.method196(true, (byte) -65);
			    Class236.aClass103_2713.method2245(class105_sub2,
							       -876331642);
			    class168.method3666(0, 0, 0, i_13_, 1);
			    Class236.aClass103_2713.method2244(class105_sub2,
							       -519163929);
			    Class236.aClass103_2713.method2450(1, 0);
			    ((Class70) this).anInterface37_1081
				.method196(true, (byte) -128);
			    Class236.aClass103_2713.method2245(class105_sub2,
							       -1357869929);
			    class168.method3666(0, 0, 0, i, 1);
			} else {
			    if (null != ((Class70) this).anInterface37_1080) {
				((Class70) this).aBool1078 = true;
				((Class70) this).anInterface37_1080
				    .method207(1425797062);
				((Class70) this).anInterface37_1080 = null;
			    }
			    if (((Class70) this).aBool1078) {
				Class109.method2765((byte) -57);
				if (Class236.aClass103_2713 != null)
				    Class236.aClass103_2713.method2450(1, 0);
			    }
			    ((Class70) this).anInterface37_1081.method196
				((((Class70) this).aBool1078
				  || (null != Class236.aClass103_2713
				      && Class236.aClass103_2713
					     .method2502())),
				 (byte) -51);
			}
			try {
			    if (null != Class236.aClass103_2713
				&& !(((Class70) this).anInterface37_1081
				     instanceof Class356))
				Class236.aClass103_2713.method2217((byte) 60);
			} catch (Exception_Sub2 exception_sub2) {
			    VarType.method3770
				(new StringBuilder().append
				     (exception_sub2.getMessage()).append
				     (ObjectDefinition.aclient6907
					  .method12985((byte) -69))
				     .toString(),
				 exception_sub2, 37459579);
			    GraphicsDefaults.method11570(0, true, 1945822518);
			}
		    }
		    ((Class70) this).aBool1078 = false;
		    if (null != Class236.aClass103_2713
			&& !(((Class70) this).anInterface37_1081
			     instanceof Class356)
			&& ((((Class70) this).aClass359_1087.anInt5478
			     * -601665271)
			    < -601665271 * LoadingScreenDef.LOADING_STAGE_15.anInt5478))
			Class495.method11283(-1012663232);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_14_ = Class50.method1249((byte) 1);
	    int i = (int) (20L - (l_14_ - l));
	    if (i > 0)
		Class380_Sub2.method16722((long) i);
	}
    }
    
    int method1708() {
	return ((Class70) this).anInt1077 * 1179762009;
    }
    
    int method1709() {
	return ((Class70) this).anInt1077 * 1179762009;
    }
    
    int method1710() {
	return ((Class70) this).anInt1077 * 1179762009;
    }
    
    public long method1711() {
	return 7096617100120389059L * ((Class70) this).aLong1083;
    }
    
    Class70() {
	((Class70) this).anInterface37_1080 = null;
    }
    
    public int method1712() {
	if (null == ((Class70) this).aClass359_1087)
	    return 0;
	int i = -601665271 * ((Class70) this).aClass359_1087.anInt5478;
	if (((LoadingScreenDef) ((Class70) this).aClass359_1087).aBool5499
	    && (((Class70) this).anInt1086 * 1644622245
		< (((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5497
		   * 633090493)))
	    return 1644622245 * ((Class70) this).anInt1086 + 1;
	if (i < 0 || i >= Class68.aClass359Array1065.length - 1)
	    return 100;
	if ((-1299978731
	     * ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5496)
	    == ((Class70) this).anInt1086 * 1644622245)
	    return (633090493
		    * ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5497);
	return (-1299978731
		* ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5496);
    }
    
    synchronized void method1713() {
	((Class70) this).aBool1078 = true;
    }
    
    synchronized void method1714() {
	((Class70) this).aBool1078 = true;
    }
    
    public void method1715() {
	while (!((Class70) this).aBool1082) {
	    long l = Class50.method1249((byte) 1);
	    synchronized (this) {
		try {
		    ((Class70) this).anInt1077 += -750208279;
		    if (((Class70) this).anInterface37_1081
			instanceof Class356)
			((Class70) this).anInterface37_1081
			    .method196(((Class70) this).aBool1078, (byte) -1);
		    else {
			long l_15_ = Class50.method1249((byte) 1);
			if (Class236.aClass103_2713 != null
			    && null != ((Class70) this).anInterface37_1080
			    && ((Class70) this).anInterface37_1080
				   .method200(426084078) != 0
			    && ((-7299236459702022819L
				 * ((Class70) this).aLong1085)
				>= l_15_ - (long) ((Class70) this)
						      .anInterface37_1080
						      .method200(426084078))) {
			    int i = (int) (255L
					   * (l_15_
					      - (-7299236459702022819L
						 * ((Class70) this).aLong1085))
					   / (long) ((Class70) this)
							.anInterface37_1080
							.method200(426084078));
			    int i_16_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_16_ = i_16_ << 24 | 0xffffff;
			    Class109.method2765((byte) -56);
			    Class236.aClass103_2713.method2450(1, 0);
			    Class168 class168
				= (Class236.aClass103_2713.method2285
				   (-1080559003 * Class494.canvasWid,
				    963058943 * Class67.canvasHei, true,
				    1803071652));
			    Class105_Sub2 class105_sub2
				= Class236.aClass103_2713.method2248();
			    class105_sub2.method15585(0,
						      class168.method3608());
			    Class236.aClass103_2713.method2244(class105_sub2,
							       -519163929);
			    ((Class70) this).anInterface37_1080
				.method196(true, (byte) -55);
			    Class236.aClass103_2713.method2245(class105_sub2,
							       -1602721159);
			    class168.method3666(0, 0, 0, i_16_, 1);
			    Class236.aClass103_2713.method2244(class105_sub2,
							       -519163929);
			    Class236.aClass103_2713.method2450(1, 0);
			    ((Class70) this).anInterface37_1081
				.method196(true, (byte) -77);
			    Class236.aClass103_2713.method2245(class105_sub2,
							       1000944827);
			    class168.method3666(0, 0, 0, i, 1);
			} else {
			    if (null != ((Class70) this).anInterface37_1080) {
				((Class70) this).aBool1078 = true;
				((Class70) this).anInterface37_1080
				    .method207(2052255728);
				((Class70) this).anInterface37_1080 = null;
			    }
			    if (((Class70) this).aBool1078) {
				Class109.method2765((byte) -29);
				if (Class236.aClass103_2713 != null)
				    Class236.aClass103_2713.method2450(1, 0);
			    }
			    ((Class70) this).anInterface37_1081.method196
				((((Class70) this).aBool1078
				  || (null != Class236.aClass103_2713
				      && Class236.aClass103_2713
					     .method2502())),
				 (byte) -10);
			}
			try {
			    if (null != Class236.aClass103_2713
				&& !(((Class70) this).anInterface37_1081
				     instanceof Class356))
				Class236.aClass103_2713.method2217((byte) 106);
			} catch (Exception_Sub2 exception_sub2) {
			    VarType.method3770
				(new StringBuilder().append
				     (exception_sub2.getMessage()).append
				     (ObjectDefinition.aclient6907
					  .method12985((byte) 27))
				     .toString(),
				 exception_sub2, -942501450);
			    GraphicsDefaults.method11570(0, true, 1945822518);
			}
		    }
		    ((Class70) this).aBool1078 = false;
		    if (null != Class236.aClass103_2713
			&& !(((Class70) this).anInterface37_1081
			     instanceof Class356)
			&& ((((Class70) this).aClass359_1087.anInt5478
			     * -601665271)
			    < -601665271 * LoadingScreenDef.LOADING_STAGE_15.anInt5478))
			Class495.method11283(-759235113);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_17_ = Class50.method1249((byte) 1);
	    int i = (int) (20L - (l_17_ - l));
	    if (i > 0)
		Class380_Sub2.method16722((long) i);
	}
    }
    
    public int method1716(int i) {
	return 1644622245 * ((Class70) this).anInt1086;
    }
    
    public int method1717() {
	if (null == ((Class70) this).aClass359_1087)
	    return 0;
	int i = -601665271 * ((Class70) this).aClass359_1087.anInt5478;
	if (((LoadingScreenDef) ((Class70) this).aClass359_1087).aBool5499
	    && (((Class70) this).anInt1086 * 1644622245
		< (((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5497
		   * 633090493)))
	    return 1644622245 * ((Class70) this).anInt1086 + 1;
	if (i < 0 || i >= Class68.aClass359Array1065.length - 1)
	    return 100;
	if ((-1299978731
	     * ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5496)
	    == ((Class70) this).anInt1086 * 1644622245)
	    return (633090493
		    * ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5497);
	return (-1299978731
		* ((LoadingScreenDef) ((Class70) this).aClass359_1087).anInt5496);
    }
    
    public String method1718() {
	return ((Class70) this).aString1084;
    }
    
    public String method1719() {
	return ((Class70) this).aString1079;
    }
    
    public String method1720() {
	return ((Class70) this).aString1079;
    }
    
    public long method1721() {
	return 7096617100120389059L * ((Class70) this).aLong1083;
    }
    
    synchronized void method1722(Interface37 interface37) {
	((Class70) this).anInterface37_1080
	    = ((Class70) this).anInterface37_1081;
	((Class70) this).anInterface37_1081 = interface37;
	((Class70) this).aLong1085
	    = Class50.method1249((byte) 1) * -8965078323170300171L;
    }
    
    void method1723() {
	((Class70) this).aBool1082 = true;
    }
    
    void method1724() {
	((Class70) this).aBool1082 = true;
    }
    
    public static final int method1725(int i) {
	return (int) (1000000000L
		      / (GameShell3.aLong7633 * 6418136547495746967L));
    }
    
    public static void method1726(int i) {
	Class484.aClass464_Sub1_6463.method10682(-1231811563);
	Class484.aClass464_Sub2_6464.method10682(-1231811563);
	Class484.aLong6467 = 6972232757595454843L;
	Class484.aBool6465 = true;
    }
    
    static final void method1727(InterfaceComponent class58, int i, int i_18_, int i_19_,
				 ClientScriptData class454, int i_20_) {
	if (null == class58.anIntArray926)
	    throw new RuntimeException();
	class58.anIntArray926[i] = i_18_;
	class58.anIntArray831[i] = i_19_;
    }
    
    static final void setVarpChangeEvent/*method1728*/(InterfaceComponent component, 
    		InterfaceDefinition iFace, ClientScriptData scriptData, int i) {
		String params = (String) 
				scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331];
		int[] watchKeys = Class8.extractVarWatchKeys(params, scriptData, (byte) -114);
		if (null != watchKeys) {
			params = params.substring(0, params.length() - 1);
		}
		component.onVarpChangeScript
		    = Class299.extractCs2Params(params, scriptData, 409493613);
		component.varpChangeWatch = watchKeys;
		component.hasClientScript = true;
    }
    
    static final void method1729(int i) {
	Iterator iterator = client.aClass407_8454.iterator();
	while (iterator.hasNext()) {
	    Class241_Sub39_Sub7 class241_sub39_sub7
		= (Class241_Sub39_Sub7) iterator.next();
	    Class475_Sub1_Sub1_Sub5 class475_sub1_sub1_sub5
		= (((Class241_Sub39_Sub7) class241_sub39_sub7)
		   .aClass475_Sub1_Sub1_Sub5_10856);
	    class475_sub1_sub1_sub5.method17931(1, (byte) -72);
	    if (class475_sub1_sub1_sub5.method17949((byte) 127)) {
		class241_sub39_sub7.remove((byte) 36);
		class475_sub1_sub1_sub5.method17935((byte) 35);
	    }
	}
    }
    
    static final void method1730(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 199873715 * Class450.clientScriptStepCount;
    }
    
    static final void concatStrings/*method1731*/(ClientScriptData scriptData, short i) {
		int numOfStrings = scriptData.integerConstants[1938982693 * scriptData.step];
		scriptData.objectStackPointer -= numOfStrings * -1650705371;
		String string = Class296.method5727(scriptData.objectStack,
					  -290357331 * scriptData.objectStackPointer,
					  numOfStrings, 2071541172);
		scriptData.objectStack[(scriptData.objectStackPointer += -1650705371) * -290357331 - 1]
			= string;
    }
}
