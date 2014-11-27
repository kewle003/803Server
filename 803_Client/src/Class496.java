/* Class496 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class496 implements Runnable
{
    static int anInt6524;
    public static JS5 OBJECTS_ARCHIVE;//aClass210_6525
    public static int anInt6526;
    static int anInt6527;
    
    public void method11285() {
	try {
	    IcmpService_Sub1.anIcmpService_Sub1_8806.run();
	} catch (Throwable throwable) {
	    /* empty */
	}
	IcmpService_Sub1.anIcmpService_Sub1_8806 = null;
    }
    
    public void method11286() {
	try {
	    IcmpService_Sub1.anIcmpService_Sub1_8806.run();
	} catch (Throwable throwable) {
	    /* empty */
	}
	IcmpService_Sub1.anIcmpService_Sub1_8806 = null;
    }
    
    public void method11287() {
	try {
	    IcmpService_Sub1.anIcmpService_Sub1_8806.run();
	} catch (Throwable throwable) {
	    /* empty */
	}
	IcmpService_Sub1.anIcmpService_Sub1_8806 = null;
    }
    
    public void run() {
	try {
	    IcmpService_Sub1.anIcmpService_Sub1_8806.run();
	} catch (Throwable throwable) {
	    /* empty */
	}
	IcmpService_Sub1.anIcmpService_Sub1_8806 = null;
    }
    
    public void method11288() {
	try {
	    IcmpService_Sub1.anIcmpService_Sub1_8806.run();
	} catch (Throwable throwable) {
	    /* empty */
	}
	IcmpService_Sub1.anIcmpService_Sub1_8806 = null;
    }
    
    static final void method11289(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	class58.aBool854
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	WorldType.refreshComponent(class58, -1171899708);
	if (-1 == -389932081 * class58.slot1 && !class35.aBool374)
	    Class393_Sub1.method16516(class58.componentHash * 445907013,
				      1424271639);
    }
    
    static final void method11290(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1) ? 1 : 0,
	     (byte) 2);
	client.aClass238_8477.method4768((byte) 5);
	Class167.method3600((short) 25454);
	client.aBool8297 = false;
    }
    
    static final void method11291(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1506923943 * Class111.anInt1513;
    }
    
    public static void setClientStage/*method11292*/(int i, byte i_0_) {
	if (i != client.anInt8288 * 1766317249) {
	    client.anInt8554 = 0;
	    if (4 == i || 6 == i)
		SoundManager.method1247(187622417);
	    if (i != 4 && Class120_Sub14.aClass563_10538 != null) {
		Class120_Sub14.aClass563_10538.close(2090809936);
		Class120_Sub14.aClass563_10538 = null;
	    }
	    if (i == 17)
		Class291.method5685((8 == 1766317249 * client.anInt8288
				     || 10 == client.anInt8288 * 1766317249
				     || ((Class128.aClass513_1589.login_interface
					  * 1972130549)
					 != 1629309841 * client.anInt8466)),
				    -621279051);
	    if (2 == i) {
		boolean bool;
		if (-1 == -698136643 * Class128.aClass513_1589.lobby_interface)
		    bool = (11 == 1766317249 * client.anInt8288
			    || client.anInt8288 * 1766317249 == 5);
		else
		    bool = (1629309841 * client.anInt8466
			    != -698136643 * Class128.aClass513_1589.lobby_interface);
		Class120_Sub3.method15582(bool, -1333600798);
	    }
	    if (i == 11 || i == 5) {
		if (!CsDelta_SetMemberVarBit.method17444(6182000))
		    return;
	    } else if (12 == i
		       || i == 16 && 14 != client.anInt8288 * 1766317249) {
		if (!SoundManager.method1247(655075002))
		    return;
	    } else if (10 == i)
		GraphicsDefinitionLoader.method10594(670331584);
	    if (Class354_Sub1.method16677(i, (byte) -31))
		client.aClass238_8477.method4763(1551460035);
	    if (i == 9 || i == 17)
		Class2.method458(-1269946541);
	    boolean bool = (15 == i || Class279_Sub1.method16640(i, (byte) -52)
			    || Class523.method11733(i, 863847180));
	    boolean bool_1_
		= (15 == client.anInt8288 * 1766317249
		   || Class279_Sub1.method16640(1766317249 * client.anInt8288,
						(byte) 123)
		   || Class523.method11733(1766317249 * client.anInt8288,
					   306208997));
	    if (bool != bool_1_)
		Class117.aClass209_1552.method4146(!bool, -1742384194);
	    if (Class354_Sub1.method16677(i, (byte) 34) || 4 == i || 6 == i)
		Class236.aClass103_2713.method2252();
	    client.anInt8288 = -1327058111 * i;
	}
    }
    
    static void setCookie/*method11293*/(String string, int i) {
		client.aString8269 = string;
		if (Class262.getEnvironment(526133278) != GameShell3.Environment.APPLICATION) {
		    try {
				String string_2_
				    = Class421.gameApplet.getParameter(Class260.aClass260_4236.aString4258);
				String string_3_
				    = Class421.gameApplet.getParameter(Class260.aClass260_4229.aString4258);
				String string_4_ = new StringBuilder().append(string_2_).append
						       ("settings=").append
						       (string).append
						       ("; version=1; path=/; domain=").append
						       (string_3_).toString();
				if (string.length() == 0) {
				    string_4_ = new StringBuilder().append(string_4_).append
					      ("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0") .toString();
				} else {
				    string_4_ = new StringBuilder().append(string_4_).append
					      ("; Expires=").append
					      (Class193.method3942(Class50.method1249((byte) 1)
								   + 94608000000L))
					      .append("; Max-Age=").append(94608000L).toString();
				}
				Class396.jsEval(Class421.gameApplet,
						new StringBuilder().append("document.cookie=\"")
							.append(string_4_).append("\"").toString(),
						890677872);
		    } catch (Throwable throwable) {
		    	/* empty */
		    }
		}
    }
}
