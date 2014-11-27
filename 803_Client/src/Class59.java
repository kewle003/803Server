/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.Map;

final class Class59 implements Interface2
{
    public long method20(String string) {
	return Class163.method3531(string, -1832875103);
    }
    
    public long method22(String string, int i) {
	return Class163.method3531(string, -1257673677);
    }
    
    public long method21(String string) {
	return Class163.method3531(string, -2069611275);
    }
    
    static final void method1596(ClientScriptData class454, byte i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -82);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	Class332.method6058(class58, class35, class454, -1720279330);
    }
    
    static final void method1597(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -43) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray981
	    = Class299.extractCs2Params(string, class454, -1144509006);
	class58.hasClientScript = true;
    }
    
    static final void method1598(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (i_1_ < 0)
	    i_1_ = 0;
	client.anInt8385 = 222075277 * (client.anInt8390 * 1189851199 + i_1_);
    }
    
    public static void method1599(int i) {
	for (Class241_Sub10 class241_sub10
		 = ((Class241_Sub10)
		    Class447.aClass407_6181.method7294(2090894173));
	     null != class241_sub10;
	     class241_sub10 = (Class241_Sub10) Class447.aClass407_6181
						   .method7295(1468007208)) {
	    if (!((Class241_Sub10) class241_sub10).aBool8901)
		Class19.method880((((Class241_Sub10) class241_sub10).anInt8899
				   * 1570057341),
				  (short) -16407);
	    else
		((Class241_Sub10) class241_sub10).aBool8901 = false;
	}
    }
    
    static final void method1600(int i, int i_2_, int i_3_) {
	if (Class573_Sub1.aFloat7408 < Class573_Sub1.aFloat7402) {
	    Class573_Sub1.aFloat7408
		+= (double) Class573_Sub1.aFloat7408 / 30.0;
	    if (Class573_Sub1.aFloat7408 > Class573_Sub1.aFloat7402)
		Class573_Sub1.aFloat7408 = Class573_Sub1.aFloat7402;
	    Class288.method5661(497318259);
	    Class573_Sub1.anInt7381 = (int) Class573_Sub1.aFloat7402 >> 1;
	    Class573_Sub1.aByteArrayArrayArray7380
		= Class336.method6078(Class573_Sub1.anInt7381, 526485992);
	} else if (Class573_Sub1.aFloat7408 > Class573_Sub1.aFloat7402) {
	    Class573_Sub1.aFloat7408
		-= (double) Class573_Sub1.aFloat7408 / 30.0;
	    if (Class573_Sub1.aFloat7408 < Class573_Sub1.aFloat7402)
		Class573_Sub1.aFloat7408 = Class573_Sub1.aFloat7402;
	    Class288.method5661(497318259);
	    Class573_Sub1.anInt7381 = (int) Class573_Sub1.aFloat7402 >> 1;
	    Class573_Sub1.aByteArrayArrayArray7380
		= Class336.method6078(Class573_Sub1.anInt7381, 1334270001);
	}
	if (-1 != -1959962429 * Class573_Sub1.anInt8773
	    && Class573_Sub1.anInt8794 * 1985083461 != -1) {
	    int i_4_ = (-1959962429 * Class573_Sub1.anInt8773
			- 257473507 * WorldTile.anInt10182);
	    if (i_4_ != 0)
		i_4_ /= Math.min(Class573_Sub1.anInt8769 * 432783869,
				 Math.abs(i_4_));
	    int i_5_ = (1985083461 * Class573_Sub1.anInt8794
			- WorldTile.anInt10183 * 291545115);
	    if (i_5_ != 0)
		i_5_ /= Math.min(432783869 * Class573_Sub1.anInt8769,
				 Math.abs(i_5_));
	    WorldTile.anInt10182
		= (i_4_ + 257473507 * WorldTile.anInt10182) * -1822006837;
	    WorldTile.anInt10183
		= -1182123501 * (i_5_ + 291545115 * WorldTile.anInt10183);
	    if (0 == i_4_ && i_5_ == 0) {
		Class573_Sub1.anInt8773 = -362944491;
		Class573_Sub1.anInt8794 = -1265261197;
	    }
	    Class288.method5661(497318259);
	}
	Iterator iterator = Class573_Sub1.aHashMap8781.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class2 class2 = (Class2) ((Map.Entry) iterator.next()).getValue();
	    ((Class2) class2).anInt13 -= -668481841;
	    if (0 == ((Class2) class2).anInt13 * -1866104785) {
		if (1883083225 * ((Class2) class2).anInt12 <= 1
		    && !Class573_Sub1.aBool8771)
		    iterator.remove();
		else {
		    ((Class2) class2).anInt12 -= -733094295;
		    ((Class2) class2).anInt13
			= -902921693 * Class573_Sub1.anInt8785;
		}
	    }
	}
	iterator = Class573_Sub1.aHashMap8766.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class2 class2 = (Class2) ((Map.Entry) iterator.next()).getValue();
	    ((Class2) class2).anInt13 -= -668481841;
	    if (0 == -1866104785 * ((Class2) class2).anInt13) {
		if (1883083225 * ((Class2) class2).anInt12 <= 1
		    && !Class573_Sub1.aBool8771)
		    iterator.remove();
		else {
		    ((Class2) class2).anInt12 -= -733094295;
		    ((Class2) class2).anInt13
			= -902921693 * Class573_Sub1.anInt8785;
		}
	    }
	}
	if (Class573_Sub1.aBool8775
	    && Class120_Sub23.aClass429_10631 != null) {
	    for (Class241_Sub46 class241_sub46
		     = ((Class241_Sub46)
			Class120_Sub23.aClass429_10631.method7694(16711935));
		 class241_sub46 != null;
		 class241_sub46
		     = (Class241_Sub46) Class120_Sub23.aClass429_10631
					    .method7692(1415325014)) {
		Class515 class515
		    = (Class573_Sub1.aClass524_7370.method11745
		       (-1454932011 * (((Class241_Sub46) class241_sub46)
				       .aClass241_Sub41_10273.anInt10158),
			100254915));
		if (class241_sub46.method16583(i, i_2_, -2133380153)) {
		    if (null != class515.aStringArray6745) {
			if (null != class515.aStringArray6745[4])
			    Class534.method11882
				(class515.aStringArray6745[4],
				 class515.aString6746, -1, 1012, -1,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 false, -1236921043);
			if (null != class515.aStringArray6745[3])
			    Class534.method11882
				(class515.aStringArray6745[3],
				 class515.aString6746, -1, 1011, -1,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 false, -1236921043);
			if (class515.aStringArray6745[2] != null)
			    Class534.method11882
				(class515.aStringArray6745[2],
				 class515.aString6746, -1, 1010, -1,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 false, -1236921043);
			if (class515.aStringArray6745[1] != null)
			    Class534.method11882
				(class515.aStringArray6745[1],
				 class515.aString6746, -1, 1009, -1,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 -1123109927 * class515.anInt6770, 0, true,
				 false,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 false, -1236921043);
			if (null != class515.aStringArray6745[0])
			    Class534.method11882
				(class515.aStringArray6745[0],
				 class515.aString6746, -1, 1008, -1,
				 (long) ((((Class241_Sub46) class241_sub46)
					  .aClass241_Sub41_10273.anInt10158)
					 * -1454932011),
				 class515.anInt6770 * -1123109927, 0, true,
				 false,
				 (long) (-1454932011
					 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273
					    .anInt10158)),
				 false, -1236921043);
		    }
		    if (!((Class241_Sub46) class241_sub46)
			 .aClass241_Sub41_10273.aBool10155) {
			((Class241_Sub46) class241_sub46)
			    .aClass241_Sub41_10273.aBool10155
			    = true;
			Class561.method12372(Class614.aClass614_7810,
					     (((Class241_Sub46) class241_sub46)
					      .aClass241_Sub41_10273
					      .anInt10158) * -1454932011,
					     class515.anInt6770 * -1123109927,
					     1153846207);
		    }
		    if (((Class241_Sub46) class241_sub46).aClass241_Sub41_10273
			.aBool10155)
			Class561.method12372
			    (Class614.aClass614_7808,
			     -1454932011 * (((Class241_Sub46) class241_sub46)
					    .aClass241_Sub41_10273.anInt10158),
			     class515.anInt6770 * -1123109927, 1762774925);
		} else if (((Class241_Sub46) class241_sub46)
			   .aClass241_Sub41_10273.aBool10155) {
		    ((Class241_Sub46) class241_sub46).aClass241_Sub41_10273
			.aBool10155
			= false;
		    Class561.method12372(Class614.aClass614_7811,
					 (-1454932011
					  * (((Class241_Sub46) class241_sub46)
					     .aClass241_Sub41_10273
					     .anInt10158)),
					 -1123109927 * class515.anInt6770,
					 -863867906);
		}
	    }
	}
    }
    
    static final void method1601(ClientScriptData class454, short i) {
	Class271.method5313((byte) 29);
    }
}
