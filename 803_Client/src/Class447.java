/* Class447 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class447
{
    static HashTable aClass407_6181 = new HashTable(4);
    static final int anInt6182 = 4096;
    static Class436 aClass436_6183 = new Class436();
    
    public static void method7898() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     null != class241_sub10;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(1070092570)) {
	    if (((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method12788(-1556022254))
		Class19.method880(1570057341 * ((Class241_Sub10)
						class241_sub10).anInt8899,
				  (short) -13844);
	    else {
		((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method14418((byte) 78);
		try {
		    ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
			.method12819((byte) 0);
		} catch (Exception exception) {
		    VarType.method3770(new StringBuilder().append("").append
					    (1570057341 * (((Class241_Sub10)
							    class241_sub10)
							   .anInt8899))
					    .toString(),
					exception, -1778699226);
		    Class19.method880(1570057341 * ((Class241_Sub10)
						    class241_sub10).anInt8899,
				      (short) -13098);
		}
		if (!((Class241_Sub10) class241_sub10).aBool8898
		    && !((Class241_Sub10) class241_sub10).aBool8900) {
		    Class241_Sub40_Sub1 class241_sub40_sub1
			= ((Class241_Sub10) class241_sub10)
			      .aClass583_Sub1_8896.method12817(-2092413094);
		    if (class241_sub40_sub1 != null) {
			Class241_Sub18_Sub1 class241_sub18_sub1
			    = class241_sub40_sub1.method17153((byte) -76);
			if (null != class241_sub18_sub1) {
			    class241_sub18_sub1.method17128(((((Class241_Sub10)
							       class241_sub10)
							      .anInt8897)
							     * -1432782697),
							    1388121464);
			    ((Class241_Sub10) class241_sub10).aBool8898 = true;
			}
		    }
		}
	    }
	}
    }
    
    public static void method7899() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     class241_sub10 != null;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(1150263525))
	    Class19.method880((((Class241_Sub10) class241_sub10).anInt8899
			       * 1570057341),
			      (short) -22208);
    }
    
    public static void method7900() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     null != class241_sub10;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(675091009)) {
	    if (((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method12788(483034918))
		Class19.method880(1570057341 * ((Class241_Sub10)
						class241_sub10).anInt8899,
				  (short) -2096);
	    else {
		((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method14418((byte) -37);
		try {
		    ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
			.method12819((byte) 0);
		} catch (Exception exception) {
		    VarType.method3770(new StringBuilder().append("").append
					    (1570057341 * (((Class241_Sub10)
							    class241_sub10)
							   .anInt8899))
					    .toString(),
					exception, -1377129093);
		    Class19.method880(1570057341 * ((Class241_Sub10)
						    class241_sub10).anInt8899,
				      (short) -19897);
		}
		if (!((Class241_Sub10) class241_sub10).aBool8898
		    && !((Class241_Sub10) class241_sub10).aBool8900) {
		    Class241_Sub40_Sub1 class241_sub40_sub1
			= ((Class241_Sub10) class241_sub10)
			      .aClass583_Sub1_8896.method12817(-2130082227);
		    if (class241_sub40_sub1 != null) {
			Class241_Sub18_Sub1 class241_sub18_sub1
			    = class241_sub40_sub1.method17153((byte) -107);
			if (null != class241_sub18_sub1) {
			    class241_sub18_sub1.method17128(((((Class241_Sub10)
							       class241_sub10)
							      .anInt8897)
							     * -1432782697),
							    1525563309);
			    ((Class241_Sub10) class241_sub10).aBool8898 = true;
			}
		    }
		}
	    }
	}
    }
    
    public static void method7901() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     null != class241_sub10;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(913420486)) {
	    if (!((Class241_Sub10) class241_sub10).aBool8901)
		Class19.method880((((Class241_Sub10) class241_sub10).anInt8899
				   * 1570057341),
				  (short) -7958);
	    else
		((Class241_Sub10) class241_sub10).aBool8901 = false;
	}
    }
    
    static void method7902(int i, boolean bool) {
	if (bool) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4026,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShort(i, -484048531);
	    client.aClass190_8340.sendPacket(class241_sub27, -1971093356);
	} else
	    Class561.method12372(Class614.aClass614_7815, i, -1, -1324707450);
    }
    
    public static String method7903(int i) {
	Class241_Sub10 class241_sub10
	    = (Class241_Sub10) aClass407_6181.get((long) i);
	if (class241_sub10 != null) {
	    Class241_Sub40_Sub3 class241_sub40_sub3
		= ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		      .method12790(-1975906547);
	    if (class241_sub40_sub3 != null) {
		double d = ((Class241_Sub10) class241_sub10)
			       .aClass583_Sub1_8896.method12789(16711935);
		if ((double) class241_sub40_sub3.method17246(1766317249) <= d
		    && ((double) class241_sub40_sub3.method17241(1178796325)
			>= d))
		    return class241_sub40_sub3.method17242((byte) 1);
	    }
	}
	return null;
    }
    
    public static Class168 method7904(Class103 class103, int i) {
	Class241_Sub10 class241_sub10
	    = (Class241_Sub10) aClass407_6181.get((long) i);
	if (null != class241_sub10) {
	    Class241_Sub40_Sub2 class241_sub40_sub2
		= ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		      .method12786(743699049);
	    ((Class241_Sub10) class241_sub10).aBool8901 = true;
	    if (null != class241_sub40_sub2) {
		((Class436) aClass436_6183).aClass103_6129 = class103;
		return ((Class168)
			class241_sub40_sub2.method17215(aClass436_6183,
							-917347132));
	    }
	}
	return null;
    }
    
    public static void method7905(int i) {
	Class241_Sub10 class241_sub10
	    = (Class241_Sub10) aClass407_6181.get((long) i);
	if (null != class241_sub10) {
	    ((Class241_Sub10) class241_sub10).aBool8900
		= !((Class241_Sub10) class241_sub10).aBool8900;
	    ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896.method12792
		(((Class241_Sub10) class241_sub10).aBool8900, -1513167955);
	}
    }
    
    public static void method7906() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     null != class241_sub10;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(866541095)) {
	    if (((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method12788(686667378))
		Class19.method880(1570057341 * ((Class241_Sub10)
						class241_sub10).anInt8899,
				  (short) -24700);
	    else {
		((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method14418((byte) 83);
		try {
		    ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
			.method12819((byte) 0);
		} catch (Exception exception) {
		    VarType.method3770(new StringBuilder().append("").append
					    (1570057341 * (((Class241_Sub10)
							    class241_sub10)
							   .anInt8899))
					    .toString(),
					exception, 97807261);
		    Class19.method880(1570057341 * ((Class241_Sub10)
						    class241_sub10).anInt8899,
				      (short) -4469);
		}
		if (!((Class241_Sub10) class241_sub10).aBool8898
		    && !((Class241_Sub10) class241_sub10).aBool8900) {
		    Class241_Sub40_Sub1 class241_sub40_sub1
			= ((Class241_Sub10) class241_sub10)
			      .aClass583_Sub1_8896.method12817(-1947949750);
		    if (class241_sub40_sub1 != null) {
			Class241_Sub18_Sub1 class241_sub18_sub1
			    = class241_sub40_sub1.method17153((byte) 70);
			if (null != class241_sub18_sub1) {
			    class241_sub18_sub1.method17128(((((Class241_Sub10)
							       class241_sub10)
							      .anInt8897)
							     * -1432782697),
							    1590426284);
			    ((Class241_Sub10) class241_sub10).aBool8898 = true;
			}
		    }
		}
	    }
	}
    }
    
    public static void method7907() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     class241_sub10 != null;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(-66609871))
	    Class19.method880((((Class241_Sub10) class241_sub10).anInt8899
			       * 1570057341),
			      (short) -20350);
    }
    
    public static void method7908() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     null != class241_sub10;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(2084232696)) {
	    if (((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method12788(-869126630))
		Class19.method880(1570057341 * ((Class241_Sub10)
						class241_sub10).anInt8899,
				  (short) -6044);
	    else {
		((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method14418((byte) 35);
		try {
		    ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
			.method12819((byte) 0);
		} catch (Exception exception) {
		    VarType.method3770(new StringBuilder().append("").append
					    (1570057341 * (((Class241_Sub10)
							    class241_sub10)
							   .anInt8899))
					    .toString(),
					exception, -791668981);
		    Class19.method880(1570057341 * ((Class241_Sub10)
						    class241_sub10).anInt8899,
				      (short) -32569);
		}
		if (!((Class241_Sub10) class241_sub10).aBool8898
		    && !((Class241_Sub10) class241_sub10).aBool8900) {
		    Class241_Sub40_Sub1 class241_sub40_sub1
			= ((Class241_Sub10) class241_sub10)
			      .aClass583_Sub1_8896.method12817(-2144227557);
		    if (class241_sub40_sub1 != null) {
			Class241_Sub18_Sub1 class241_sub18_sub1
			    = class241_sub40_sub1.method17153((byte) -81);
			if (null != class241_sub18_sub1) {
			    class241_sub18_sub1.method17128(((((Class241_Sub10)
							       class241_sub10)
							      .anInt8897)
							     * -1432782697),
							    1428651462);
			    ((Class241_Sub10) class241_sub10).aBool8898 = true;
			}
		    }
		}
	    }
	}
    }
    
    public static void method7909() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     null != class241_sub10;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(785014505)) {
	    if (((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method12788(-200039724))
		Class19.method880(1570057341 * ((Class241_Sub10)
						class241_sub10).anInt8899,
				  (short) 155);
	    else {
		((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		    .method14418((byte) -11);
		try {
		    ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
			.method12819((byte) 0);
		} catch (Exception exception) {
		    VarType.method3770(new StringBuilder().append("").append
					    (1570057341 * (((Class241_Sub10)
							    class241_sub10)
							   .anInt8899))
					    .toString(),
					exception, -1795637205);
		    Class19.method880(1570057341 * ((Class241_Sub10)
						    class241_sub10).anInt8899,
				      (short) -21070);
		}
		if (!((Class241_Sub10) class241_sub10).aBool8898
		    && !((Class241_Sub10) class241_sub10).aBool8900) {
		    Class241_Sub40_Sub1 class241_sub40_sub1
			= ((Class241_Sub10) class241_sub10)
			      .aClass583_Sub1_8896.method12817(-2014476935);
		    if (class241_sub40_sub1 != null) {
			Class241_Sub18_Sub1 class241_sub18_sub1
			    = class241_sub40_sub1.method17153((byte) 23);
			if (null != class241_sub18_sub1) {
			    class241_sub18_sub1.method17128(((((Class241_Sub10)
							       class241_sub10)
							      .anInt8897)
							     * -1432782697),
							    1944061620);
			    ((Class241_Sub10) class241_sub10).aBool8898 = true;
			}
		    }
		}
	    }
	}
    }
    
    public static void method7910() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     null != class241_sub10;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(1967282284)) {
	    if (!((Class241_Sub10) class241_sub10).aBool8901)
		Class19.method880((((Class241_Sub10) class241_sub10).anInt8899
				   * 1570057341),
				  (short) -19396);
	    else
		((Class241_Sub10) class241_sub10).aBool8901 = false;
	}
    }
    
    public static void method7911(int i) {
	Class241_Sub10 class241_sub10
	    = (Class241_Sub10) aClass407_6181.get((long) i);
	if (null != class241_sub10) {
	    ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		.method12785(-1482290305);
	    Class445_Sub24.method14343
		(1570057341 * ((Class241_Sub10) class241_sub10).anInt8899,
		 ((Class241_Sub10) class241_sub10).aBool8895, (byte) -2);
	    class241_sub10.remove((byte) 36);
	}
    }
    
    public static void method7912() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     class241_sub10 != null;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(1180635858))
	    Class19.method880((((Class241_Sub10) class241_sub10).anInt8899
			       * 1570057341),
			      (short) -20319);
    }
    
    static void method7913(int i, boolean bool) {
	if (bool) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4026,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShort(i, -484048531);
	    client.aClass190_8340.sendPacket(class241_sub27, -1559443513);
	} else
	    Class561.method12372(Class614.aClass614_7815, i, -1, -1228128348);
    }
    
    Class447() throws Throwable {
	throw new Error();
    }
    
    public static void method7914() {
	for (Class241_Sub10 class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7294(2090894173);
	     class241_sub10 != null;
	     class241_sub10
		 = (Class241_Sub10) aClass407_6181.method7295(-306874001))
	    Class19.method880((((Class241_Sub10) class241_sub10).anInt8899
			       * 1570057341),
			      (short) -20210);
    }
    
    static final void method7915(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	ClientScriptMap.method7286(class58, class35, class454, (byte) 91);
    }
    
    static void method7916(long l) {
	Class638.aCalendar8252.setTime(new Date(l));
    }
}
