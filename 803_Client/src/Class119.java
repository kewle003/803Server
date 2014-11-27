/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class119
{
    static HashMap aHashMap1561 = new HashMap();
    public static final long aLong1562 = 1000L;
    static Map aMap1563;
    public static Class578 aClass578_1564;
    
    static String method2942(Date date, String string, TimeZone timezone,
			     Language class437) {
	if (null == aMap1563) {
	    aMap1563 = new HashMap(7);
	    Language[] class437s = Language.method7812((byte) 17);
	    for (int i = 0; i < class437s.length; i++) {
		Language class437_0_ = class437s[i];
		aMap1563.put(class437_0_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap1563.get(class437);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class437.method7800(2056542009));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_1_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_1_;
    }
    
    public static String method2943(Date date, String string, int i) {
	return method2947(date, string, method2945(1852192587),
			  Language.LOCALE_EN, 1740980575);
    }
    
    static TimeZone method2944(String string, int i) {
	synchronized (aHashMap1561) {
	    TimeZone timezone = (TimeZone) aHashMap1561.get(string);
	    if (null == timezone) {
		timezone = TimeZone.getTimeZone(string);
		aHashMap1561.put(string, timezone);
	    }
	    TimeZone timezone_2_ = timezone;
	    return timezone_2_;
	}
    }
    
    static TimeZone method2945(int i) {
	return method2944("Europe/London", -88353210);
    }
    
    static String method2946(Date date, String string, TimeZone timezone,
			     Language class437) {
	if (null == aMap1563) {
	    aMap1563 = new HashMap(7);
	    Language[] class437s = Language.method7812((byte) 5);
	    for (int i = 0; i < class437s.length; i++) {
		Language class437_3_ = class437s[i];
		aMap1563.put(class437_3_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap1563.get(class437);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class437.method7800(-611623424));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_4_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_4_;
    }
    
    static String method2947(Date date, String string, TimeZone timezone,
			     Language class437, int i) {
	if (null == aMap1563) {
	    aMap1563 = new HashMap(7);
	    Language[] class437s = Language.method7812((byte) 79);
	    for (int i_5_ = 0; i_5_ < class437s.length; i_5_++) {
		Language class437_6_ = class437s[i_5_];
		aMap1563.put(class437_6_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap1563.get(class437);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class437.method7800(-1128523070));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_7_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_7_;
    }
    
    public static String method2948(Date date, String string) {
	return method2947(date, string, method2945(1766578827),
			  Language.LOCALE_EN, 1569932976);
    }
    
    static {
	Calendar.getInstance(method2944("Europe/London", 1675499930));
    }
    
    static String method2949(Date date, String string, TimeZone timezone,
			     Language class437) {
	if (null == aMap1563) {
	    aMap1563 = new HashMap(7);
	    Language[] class437s = Language.method7812((byte) 83);
	    for (int i = 0; i < class437s.length; i++) {
		Language class437_8_ = class437s[i];
		aMap1563.put(class437_8_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap1563.get(class437);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class437.method7800(1329067293));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_9_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_9_;
    }
    
    static TimeZone method2950() {
	return method2944("Europe/London", 1220159722);
    }
    
    static String method2951(Date date, String string, TimeZone timezone,
			     Language class437) {
	if (null == aMap1563) {
	    aMap1563 = new HashMap(7);
	    Language[] class437s = Language.method7812((byte) 90);
	    for (int i = 0; i < class437s.length; i++) {
		Language class437_10_ = class437s[i];
		aMap1563.put(class437_10_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap1563.get(class437);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class437.method7800(-377654091));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_11_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_11_;
    }
    
    static String method2952(Date date, String string, TimeZone timezone,
			     Language class437) {
	if (null == aMap1563) {
	    aMap1563 = new HashMap(7);
	    Language[] class437s = Language.method7812((byte) 14);
	    for (int i = 0; i < class437s.length; i++) {
		Language class437_12_ = class437s[i];
		aMap1563.put(class437_12_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap1563.get(class437);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class437.method7800(-1384749150));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_13_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_13_;
    }
    
    static TimeZone method2953() {
	return method2944("Europe/London", -849700838);
    }
    
    static TimeZone method2954() {
	return method2944("Europe/London", 1663697957);
    }
    
    Class119() throws Throwable {
	throw new Error();
    }
    
    static TimeZone method2955(String string) {
		synchronized (aHashMap1561) {
		    TimeZone timezone = (TimeZone) aHashMap1561.get(string);
		    if (null == timezone) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap1561.put(string, timezone);
		    }
		    TimeZone timezone_14_ = timezone;
		    return timezone_14_;
		}
    }
    
    static final void setComponentTextFormat/*method2956*/(InterfaceComponent component, InterfaceDefinition iFace,
				 ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= 915295493;
    	component.horizontalTextAlign
		    = -1373413059 * scriptData.integerStack[scriptData.intStackPointer * 1482319719];
    	component.verticalTextAlign
		    = (-230258529 * scriptData.integerStack[1 + 1482319719 * scriptData.intStackPointer]);
    	component.textLineHeight
		    = (-1852374183 * scriptData.integerStack[2 + 1482319719 * scriptData.intStackPointer]);
		WorldType.refreshComponent(component, 159740063);
    }
}
