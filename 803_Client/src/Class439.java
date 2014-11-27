/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class Class439 implements Interface47
{
    public static Class439 aClass439_6144;
    public static Class439 aClass439_6145;
    public int anInt6146;
    public static Class439 aClass439_6147 = new Class439(4, 0);
    int anInt6148;
    public static Class439 aClass439_6149;
    public static Class439 aClass439_6150;
    public static Class439 aClass439_6151;
    public static Class439 aClass439_6152;
    public static Class439 aClass439_6153;
    
    public Class439 method7821() {
	switch (anInt6146 * 1591010161) {
	case 4:
	    return aClass439_6144;
	case 0:
	    return aClass439_6147;
	case 3:
	    return aClass439_6150;
	case 6:
	    return aClass439_6145;
	case 7:
	    return aClass439_6152;
	case 2:
	    return aClass439_6151;
	case 5:
	    return aClass439_6153;
	case 1:
	    return aClass439_6149;
	default:
	    throw new IllegalStateException();
	}
    }
    
    public int getId(byte i) {
	return 1828622517 * ((Class439) this).anInt6148;
    }
    
    public Class439 method7822(int i) {
	switch (anInt6146 * 1591010161) {
	case 4:
	    return aClass439_6144;
	case 0:
	    return aClass439_6147;
	case 3:
	    return aClass439_6150;
	case 6:
	    return aClass439_6145;
	case 7:
	    return aClass439_6152;
	case 2:
	    return aClass439_6151;
	case 5:
	    return aClass439_6153;
	case 1:
	    return aClass439_6149;
	default:
	    throw new IllegalStateException();
	}
    }
    
    static {
	aClass439_6145 = new Class439(1, 1);
	aClass439_6153 = new Class439(3, 2);
	aClass439_6151 = new Class439(7, 3);
	aClass439_6144 = new Class439(0, 4);
	aClass439_6149 = new Class439(6, 5);
	aClass439_6150 = new Class439(5, 6);
	aClass439_6152 = new Class439(2, 7);
    }
    
    public int method9() {
	return 1828622517 * ((Class439) this).anInt6148;
    }
    
    public int method147() {
	return 1828622517 * ((Class439) this).anInt6148;
    }
    
    public int method11() {
	return 1828622517 * ((Class439) this).anInt6148;
    }
    
    Class439(int i, int i_0_) {
	anInt6146 = 1403878801 * i;
	((Class439) this).anInt6148 = 1799478685 * i_0_;
    }
    
    public int method10() {
	return 1828622517 * ((Class439) this).anInt6148;
    }
    
    public Class439 method7823() {
	switch (anInt6146 * 1591010161) {
	case 4:
	    return aClass439_6144;
	case 0:
	    return aClass439_6147;
	case 3:
	    return aClass439_6150;
	case 6:
	    return aClass439_6145;
	case 7:
	    return aClass439_6152;
	case 2:
	    return aClass439_6151;
	case 5:
	    return aClass439_6153;
	case 1:
	    return aClass439_6149;
	default:
	    throw new IllegalStateException();
	}
    }
    
    static final void setFriendsChatUpdateEvent/*method7824*/(InterfaceComponent component, 
    		InterfaceDefinition iFace, ClientScriptData scriptData, byte i) {
		String params = (String) scriptData.objectStack
					  [(scriptData.objectStackPointer -= -1650705371) * -290357331];
		if (Class8.extractVarWatchKeys(params, scriptData, (byte) -75) != null) {
			params = params.substring(0, params.length() - 1);
		}
		component.onFriendsChatUpdateScript
		    = Class299.extractCs2Params(params, scriptData, 715998010);
		component.hasClientScript = true;
    }
    
    public static String method7825(long l, int i, boolean bool, int i_1_) {
	Calendar calendar;
	if (bool) {
	    Class103_Sub2.method15432(l);
	    calendar = Class638.aCalendar8253;
	} else {
	    Class447.method7916(l);
	    calendar = Class638.aCalendar8252;
	}
	int i_2_ = calendar.get(5);
	int i_3_ = calendar.get(2);
	int i_4_ = calendar.get(1);
	int i_5_ = calendar.get(11);
	int i_6_ = calendar.get(12);
	if (3 == i)
	    return VarTransmitLevel.method5824(l, i, bool, 1473893111);
	return new StringBuilder().append(Integer.toString(i_2_ / 10)).append
		   (i_2_ % 10).append
		   ("-").append
		   (Class638.aStringArrayArray8254[i][i_3_]).append
		   ("-").append
		   (i_4_).append
		   (" ").append
		   (i_5_ / 10).append
		   (i_5_ % 10).append
		   (":").append
		   (i_6_ / 10).append
		   (i_6_ % 10).toString();
    }
}
