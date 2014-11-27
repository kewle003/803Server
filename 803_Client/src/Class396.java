/* Class396 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

//package rs2.client.web;
public class Class396
{
    public static void method7101(Applet applet, String string)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    public static void jsEval/*method7102*/(Applet applet, String code, int i) throws Throwable {
    	JSObject.getWindow(applet).eval(code);
    }
    
    public static void method7103(Applet applet, String string)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    public static Object method7104(Applet applet, String string,
				    Object[] objects, int i) throws Throwable {
	return JSObject.getWindow(applet).call(string, objects);
    }
    
    Class396() throws Throwable {
	throw new Error();
    }
    
    public static Object method7105(Applet applet, String string)
	throws Throwable {
	return JSObject.getWindow(applet).call(string, null);
    }
    
    public static void method7106(Applet applet, String string)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    public static Object method7107(Applet applet, String string)
	throws Throwable {
	return JSObject.getWindow(applet).call(string, null);
    }
    
    public static Object method7108(Applet applet, String string)
	throws Throwable {
	return JSObject.getWindow(applet).call(string, null);
    }
    
    public static Object callNoParamater/*method7109*/(Applet applet, String string, byte i) throws Throwable {
    	return JSObject.getWindow(applet).call(string, null);
    }
}
