/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

//package com.jagex.game.runetek6.config.vartype;
public abstract class VarType implements Interface16 {
    public boolean aBool2130;
    static int anInt2131;
    public ScriptVarType dataType;//aClass302_2132
    public VarTransmitLevel clientTransmitLevel = VarTransmitLevel.NEVER;//aClass300_2133
    public VarDomainType domain;//aClass218_2134
    public int id;//anInt2135
    
    VarType(VarDomainType class218, int i) {
		aBool2130 = true;
		domain = class218;
		id = 267480099 * i;
    }
    
    public void method3763(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 16);
	    if (i == 0)
		break;
	    Class163 class163
		= ((Class163)
		   Class531.method11848(Class257.method5063((byte) -69), i,
					813207597));
	    if (class163 != null) {
		switch (((Class163) class163).anInt2041 * 1744036015) {
		case 3:
		    clientTransmitLevel
			= ((VarTransmitLevel)
			   Class531.method11848(Class128
						    .method3015(-636738398),
						class241_sub3
						    .readUnsignedByte((byte) 9),
						-797322410));
		    break;
		case 1:
		    class241_sub3.readJagString(1964580567);
		    break;
		case 5:
		    aBool2130 = false;
		    break;
		default:
		    throw new IllegalStateException("");
		case 4:
		    Class531.method11848(ClanChannelDelta.method6937(-1929865725),
					 class241_sub3.readUnsignedByte((byte) -89),
					 -1550102761);
		    break;
		case 6: {
		    int i_0_ = class241_sub3.readUnsignedByte((byte) 113);
		    dataType
			= ((ScriptVarType)
			   Class531.method11848(ScriptVarType
						    .method5835(1880187324),
						i_0_, -1518645761));
		    if (null == dataType)
			throw new IllegalStateException("");
		    break;
		}
		case 2:
		    /* empty */
		}
	    } else
		decode(class241_sub3, i, 1615859279);
	}
    }
    
    abstract void decode/*method3764*/(RSByteBuffer buffer, int opcode, int i_1_);
    
    public void decode/*method3765*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) -66);
		    if (opcode == 0) {
		    	break;
		    }
		    Class163 class163
			= ((Class163)
			   Class531.method11848(Class257.method5063((byte) -1), opcode, -2076182491));
		    if (class163 != null) {
				switch (((Class163) class163).anInt2041 * 1744036015) {
				case 3:
				    clientTransmitLevel
					= ((VarTransmitLevel)
					   Class531.method11848(Class128
								    .method3015(-1232077396),
								    buffer
								    .readUnsignedByte((byte) -41),
								510804112));
				    break;
				case 1:
					buffer.readJagString(1393955896);
				    break;
				case 5:
				    aBool2130 = false;
				    break;
				default:
				    throw new IllegalStateException("");
				case 4:
				    Class531.method11848(ClanChannelDelta.method6937(-801939996),
				    		buffer.readUnsignedByte((byte) -54),
							 357275195);
				    break;
				case 6: {
				    int i_3_ = buffer.readUnsignedByte((byte) 49);
				    dataType = ((ScriptVarType)
					   Class531.method11848(ScriptVarType
								    .method5835(-798836176),
								i_3_, -1156825896));
				    if (null == dataType)
				    	throw new IllegalStateException("");
				    break;
				}
				case 2:
				    /* empty */
				}
		    } else
		    	decode(buffer, opcode, 1494227949);
		}
    }
    
    public Object getDefaultValue/*method3766*/(int i) {
    	return domain.getDefaultValue(this, (byte) 0);
    }
    
    boolean isValidDefinition/*method3767*/(int i) {
		if (null == domain || dataType == null) {
		    return false;
		}
		return true;
    }
    
    abstract void method3768(RSByteBuffer class241_sub3, int i);
    
    static final void method3769(int i) {
		WorldType.refreshComponent(client.aClass58_8365, -478595392);
		Class380.anInt5658 += -998023361;
		if (!client.aBool8487 || !client.aBool8505) {
		    if (Class380.anInt5658 * 1509429439 > 1) {
				client.aClass58_8365 = null;
				client.aClass58_8499 = null;
		    }
		} else {
		    int i_4_ = Class106.aClass580_1503.method12718(371553934);
		    int i_5_ = Class106.aClass580_1503.method12740((byte) -117);
		    i_4_ -= 355524037 * client.anInt8479;
		    i_5_ -= client.anInt8484 * 1393910517;
		    if (i_4_ < client.anInt8483 * -1979323687) {
		    	i_4_ = client.anInt8483 * -1979323687;
		    }
		    if (i_4_ + 439139681 * client.aClass58_8365.anInt850
		    		> (client.anInt8485 * 1726283367 + client.anInt8483 * -1979323687)) {
		    	i_4_ = (1726283367 * client.anInt8485
		    			+ client.anInt8483 * -1979323687
		    			- client.aClass58_8365.anInt850 * 439139681);
		    }
		    if (i_5_ < -1896782001 * client.anInt8547) {
		    	i_5_ = -1896782001 * client.anInt8547;
		    }
		    if (1463495207 * client.aClass58_8365.scrollMinY + i_5_
		    		> (client.anInt8486 * -1178156477 + -1896782001 * client.anInt8547)) {
		    	i_5_ = (-1896782001 * client.anInt8547
		    			+ -1178156477 * client.anInt8486
		    			- client.aClass58_8365.scrollMinY * 1463495207);
		    }
		    int i_6_;
		    int i_7_;
		    if (client.aClass58_8499 == Class634.aClass58_8065) {
				i_6_ = i_4_;
				i_7_ = i_5_;
		    } else {
				i_6_ = (i_4_ - client.anInt8483 * -1979323687
						+ -1735856329 * client.aClass58_8499.anInt860);
				i_7_ = (-1669999329 * client.aClass58_8499.scrollCurrentY
						+ (i_5_ - -1896782001 * client.anInt8547));
		    }
		    if (!Class106.aClass580_1503.method12717(137892171)) {
				if (client.aBool8490) {
				    Class520.method11688(-1745561770);
				    if (null != client.aClass58_8365.anObjectArray953) {
						ClientScriptCaller caller = new ClientScriptCaller();
						caller.component = client.aClass58_8365;
						caller.anInt8969 = i_6_ * 144290589;
						caller.anInt8971 = 1023053741 * i_7_;
						InterfaceComponent class58 = client.method13625(client.aClass58_8365);
						InterfaceComponent class58_8_ = client.aClass58_8481;
						boolean bool = false;
						for (/**/;
						     (class58_8_ != null
						      && -152977625 * class58_8_.parentNode != -1
						      && null != class58);
						     class58_8_
							 = Class187.aClass35Array2203[445907013 * class58_8_.componentHash >> 16]
							    .components[(class58_8_.parentNode * -152977625 & 0xffff)]) {
						    if (class58.componentHash * 445907013
						    		== class58_8_.componentHash * 445907013) {
								bool = true;
								break;
						    }
						}
						if (class58_8_ != null && class58 != null
								&& class58 != Class634.aClass58_8065 && !bool) {
							caller.prevComponent = Class634.aClass58_8065;
						} else {
							caller.prevComponent = client.aClass58_8481;
						}
						caller.paramaters = client.aClass58_8365.anObjectArray953;
						Class42.method1067(caller, 963429157);
				    }
				    if (null != client.aClass58_8481
				    		&& client.method13625(client.aClass58_8365) != null) {
				    	Class260.method5089(client.aClass58_8365,
				    			client.aClass58_8481, -438083198);
				    }
				} else if ((1 == client.anInt8456 * -1306008071
					    || ClientScriptCaller.method14988(412837396))
					   && 1327183635 * Class16.anInt148 > 2) {
				    Class501.method11445((355524037 * client.anInt8479
							  + client.anInt8488 * 1521569595),
							 (1393910517 * client.anInt8484
							  + client.anInt8489 * 1447405621),
							 (byte) 14);
				} else if (Class83.method1834(16711935)) {
				    Class501.method11445((client.anInt8488 * 1521569595
							  + client.anInt8479 * 355524037),
							 (1393910517 * client.anInt8484
							  + 1447405621 * client.anInt8489),
							 (byte) 83);
				}
				client.aClass58_8365 = null;
				client.aClass58_8499 = null;
		    } else {
				if (Class380.anInt5658 * 1509429439
						> client.aClass58_8365.anInt921 * 54944289) {
				    int i_9_ = i_4_ - 1521569595 * client.anInt8488;
				    int i_10_ = i_5_ - client.anInt8489 * 1447405621;
				    if (i_9_ > client.aClass58_8365.anInt939 * 1588155237
					|| i_9_ < -(1588155237 * client.aClass58_8365.anInt939)
					|| i_10_ > client.aClass58_8365.anInt939 * 1588155237
					|| i_10_ < -(client.aClass58_8365.anInt939
						     * 1588155237))
					client.aBool8490 = true;
				}
				if (client.aClass58_8365.anObjectArray952 != null && client.aBool8490) {
				    ClientScriptCaller caller = new ClientScriptCaller();
				    caller.component = client.aClass58_8365;
				    caller.anInt8969 = i_6_ * 144290589;
				    caller.anInt8971 = i_7_ * 1023053741;
				    caller.paramaters = client.aClass58_8365.anObjectArray952;
				    Class42.method1067(caller, -535131430);
				}
		    }
		}
    }
    
    public static void method3770(String string, Throwable throwable, int i) {
	try {
	    String string_11_ = "";
	    if (null != throwable) {
	    	throwable.printStackTrace();
	    	string_11_ = ServerConnection.method3912(throwable, -208615733);
	    }
	    if (null != string) {
		if (null != throwable)
		    string_11_ = new StringBuilder().append(string_11_).append
				     (" | ").toString();
		string_11_ = new StringBuilder().append(string_11_).append
				 (string).toString();
	    }
	    CsDelta_SetName.method17448(string_11_, -1250319220);
	    string_11_ = Class582.method12774(string_11_, -2076672226);
	    if (Class421.anApplet6042 != null) {
		String string_12_ = "Unknown";
		String string_13_ = "1.1";
		try {
		    string_12_ = System.getProperty("java.vendor");
		    string_13_ = System.getProperty("java.version");
		} catch (Exception exception) {
		    /* empty */
		}
		URL url
		    = (new URL
		       (Class421.anApplet6042.getCodeBase(),
			new StringBuilder().append("clienterror.ws?c=").append
			    (-644092443 * RuntimeException_Sub3.anInt11294)
			    .append
			    ("&cs=").append
			    (364911843 * RuntimeException_Sub3.anInt11295)
			    .append
			    ("&u=").append
			    (null != RuntimeException_Sub3.myPlayerDisplayName
			     ? Class582.method12774((RuntimeException_Sub3
						     .myPlayerDisplayName),
						    -2079506338)
			     : new StringBuilder().append("").append
				   (RuntimeException_Sub3.aLong11292
				    * -3684180253031378575L)
				   .toString())
			    .append
			    ("&v1=").append
			    (Class582.method12774(string_12_, -2125957326))
			    .append
			    ("&v2=").append
			    (Class582.method12774(string_13_, -2063206626))
			    .append
			    ("&e=").append
			    (string_11_).toString()));
		DataInputStream datainputstream
		    = new DataInputStream(url.openStream());
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }
}
