/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

//package rs2.client.sound;
public class SoundManager {
    static final int anInt642 = 0;
    static final int anInt643 = 8192;
    static final int anInt644 = 16384;
    HashMap<Integer, Object> aHashMap645;
    HashMap<Integer, Object> aHashMap646;
    static final int anInt647 = 16384;
    static final int anInt648 = 4096;
    boolean initialised;//aBool649
    static final int anInt650 = 8192;
    List<Class221> aList651;
    int anInt652;
    Class287 aClass287_653;
    List<Object> aList654;
    Class129 aClass129_655;
    Class129 aClass129_656;
    Class129 aClass129_657;
    static final int anInt658 = 4096;
    List<Object> aList659 = new ArrayList<Object>();
    HashMap<Integer, Class113> aHashMap660;
    int anInt661;
    Class221 aClass221_662;
    Class221 aClass221_663;
    boolean aBool664;
    int anInt665;
    int anInt666;
    Interface20 anInterface20_667;
    Interface20 anInterface20_668;
    Interface20 anInterface20_669;
    Interface20 anInterface20_670;
    boolean aBool671;
    public static JS5 aClass210_672;
    
    public void method1136(Class221 class221, byte i) {
		class221.method4416(this, (byte) 1);
		aList651.add(class221);
    }
    
    List<Object> method1137(short i) {
	return aList654;
    }
    
    public void method1138(int i, int i_0_) {
	if (initialised && !aBool671) {
	    if (i_0_ != 0 && i != -1) {
		if (!aBool671
		    && null != aClass221_662)
		    aClass221_662.method4394(-361348801);
		Class221 class221
		    = method1161(Class112.aClass112_1525, this, i, 0, i_0_,
				 Class130.aClass130_1596
				     .method3067(-960497231),
				 Class127.aClass127_1587, 0.0F, 0.0F, null, 0,
				 255, true, 92516089);
		if (class221 != null) {
		    class221.method4392(718258539);
		    method1136(class221, (byte) 10);
		    aBool671 = true;
		    anInt666 = i * 891254239;
		}
	    }
	}
    }
    
    public void method1139(int i, int i_1_) {
	if (initialised && !aBool671) {
	    if (i_1_ != 0 && i != -1) {
		if (!aBool671
		    && null != aClass221_662)
		    aClass221_662.method4394(-361348801);
		Class221 class221
		    = method1161(Class112.aClass112_1525, this, i, 0, i_1_,
				 Class130.aClass130_1596
				     .method3067(-960497231),
				 Class127.aClass127_1587, 0.0F, 0.0F, null, 0,
				 255, true, 780876403);
		if (class221 != null) {
		    class221.method4392(743518813);
		    method1136(class221, (byte) -91);
		    aBool671 = true;
		    anInt666 = i * 891254239;
		}
	    }
	}
    }
    
    Class287 method1140(int i) {
	return aClass287_653;
    }
    
    Class221 method1141() {
	Iterator<Class221> iterator = aList651.iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    if (class221.method4402((byte) -65) == Class112.aClass112_1524
		&& class221.method4398(-1892586775) == Class223.aClass223_2597)
		return class221;
	}
	return null;
    }
    
    public void method1142() {
	if (initialised) {
	    Class445_Sub15.method14246(807261473);
	    if (null != Class21.myPlayer
		&& (Class21.myPlayer.method10874()
		    != null)) {
		if (null == aClass287_653)
		    aClass287_653 = new Class287();
		aClass287_653.aFloat4477
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386.aFloat4477);
		aClass287_653.aFloat4474 = 0.0F;
		aClass287_653.aFloat4479
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386.aFloat4479);
	    }
	    Iterator<Object> iterator
		= aHashMap646.values().iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		interface52.method191(-1480953777);
	    }
	    iterator = aHashMap645.values().iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		interface52.method191(-1795337403);
	    }
	    iterator = aList654.iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		if (interface52.method414(-1018457940))
		    aHashMap645.remove
			(Integer.valueOf(interface52.method408((byte) 1)));
		else
		    aHashMap646.remove
			(Integer.valueOf(interface52.method408((byte) 1)));
	    }
	    aList654.clear();
	    if (aClass221_663 != null
		&& (aClass221_663.method4398(-1954704744)
		    == Class223.aClass223_2593)
		&& !aBool664
		&& client.aClass190_8340.packetCipher != null
		&& Class120_Sub1.method15109(1766317249 * client.anInt8288,
					     1962226447)) {
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4061,
						 (client.aClass190_8340
						  .packetCipher),
						 16711935);
		class241_sub27.data.writeInt
		    (aClass221_663.method4418((byte) 107)
			 .method408((byte) 1),
		     -1370106983);
		client.aClass190_8340.sendPacket(class241_sub27, -2049310688);
		aBool664 = true;
	    }
	    iterator = aList659.iterator();
	    while (iterator.hasNext()) {
		Class221 class221 = (Class221) iterator.next();
		class221.method4415(-1963107253);
		class221.method4397(-812340972);
		Class223 class223 = class221.method4398(-1886046171);
		if (class221.method4400(-2140344943) == this) {
		    if (Class223.aClass223_2596 == class223
			|| Class223.aClass223_2600 == class223) {
			if ((class221.method4402((byte) -43)
			     == Class112.aClass112_1524)
			    || (class221.method4402((byte) -64)
				== Class112.aClass112_1525)) {
			    if (class221 == aClass221_663) {
				aBool664 = false;
				aClass221_663 = null;
				class221.method4390(-552117084);
				aList651.remove(class221);
			    } else {
				int i = class221.method4418((byte) 80)
					    .method408((byte) 1);
				boolean bool
				    = (method1179(Class130.aClass130_1596
						      .method3067(-960497231),
						  (byte) -52)
				       > 0.0F);
				if (!aBool671 && bool) {
				    if (i == (-1330999365
					      * anInt661)) {
					method1167(i, -404964539);
					anInt661 = 90710669;
				    }
				    class221.method4390(1801936395);
				    aList651.remove(class221);
				} else if ((anInt666
					    * 172131871)
					   == i) {
				    anInt666 = -891254239;
				    aBool671 = false;
				    class221.method4390(-1332646308);
				    aList651.remove(class221);
				    Iterator<Object> iterator_2_
					= aList659.iterator();
				    while (iterator_2_.hasNext()) {
					Class221 class221_3_
					    = (Class221) iterator_2_.next();
					if (class221_3_.method4402((byte) -56)
					    == Class112.aClass112_1524) {
					    int i_4_
						= class221_3_.method4418
						      ((byte) 15)
						      .method408((byte) 1);
					    if (((anInt661
						  * -1330999365) == i_4_
						 && ((class221_3_.method4398
						      (-1990794618))
						     == (Class223
							 .aClass223_2596)))
						|| ((class221_3_.method4398
						     (-2056110836))
						    == Class223.aClass223_2594)
						|| ((class221_3_.method4398
						     (-1954379965))
						    == Class223.aClass223_2595)
						|| ((class221_3_.method4398
						     (-1880432513))
						    == (Class223
							.aClass223_2593))) {
						if ((class221_3_.method4398
						     (-1874740471))
						    == Class223.aClass223_2596)
						    class221_3_
							.method4395((byte) 0);
						else
						    class221_3_
							.method4392(984994040);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (false == aBool671
					|| i != (anInt661
						 * -1330999365)) {
					class221.method4390(1801800970);
					aList651
					    .remove(class221);
				    }
				    if (false == aBool671
					&& (anInt661
					    * -1330999365) == i) {
					anInt661 = 90710669;
					aClass221_662 = null;
				    }
				}
			    }
			} else {
			    Iterator<Integer> iterator_5_
				= aHashMap660.keySet()
				      .iterator();
			    while (iterator_5_.hasNext()) {
				int i = ((Integer) iterator_5_.next())
					    .intValue();
				Class113 class113
				    = (Class113) ((SoundManager) this)
						     .aHashMap660
						     .get(Integer.valueOf(i));
				if (class113.method2784(1163001070)
					.contains(class221)) {
				    class113.method2783(class221, 47448214);
				    break;
				}
			    }
			    class221.method4390(-868063173);
			    aList651.remove(class221);
			}
		    } else if ((class221.method4398(-2055981993)
				!= Class223.aClass223_2598)
			       && (class221.method4403((byte) -49)
				   == Class130.aClass130_1596
					  .method3067(-960497231))) {
			boolean bool = (method1179(Class130.aClass130_1596
						       .method3067(-960497231),
						   (byte) -97)
					> 1.0E-4F);
			if (!bool)
			    class221.method4405(150, -1888214695);
		    }
		}
	    }
	}
    }
    
    public int method1143() {
	return -1351800929 * anInt665;
    }
    
    public void method1144(int i) {
	Class563.method12410((byte) 5);
    }
    
    Class129 method1145() {
	return aClass129_656;
    }
    
    public void method1146(int i, int i_6_) {
	Class113 class113
	    = (Class113) aHashMap660.get(Integer.valueOf(i));
	if (null != class113) {
	    List<?> list = class113.method2784(1163001070);
	    Iterator<?> iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class221 class221 = (Class221) iterator.next();
		if (!class221.method4414(1125783157))
		    class221.method4392(813129422);
	    }
	}
    }
    
    public void method1147(int i, int i_7_) {
	Class113 class113
	    = (Class113) aHashMap660.get(Integer.valueOf(i));
	if (class113 != null) {
	    List<?> list = class113.method2784(1163001070);
	    Iterator<?> iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class221 class221 = (Class221) iterator.next();
		class221.method4405(50, -432876204);
	    }
	}
    }
    
    public void method1148() {
	if (initialised) {
	    Class445_Sub15.method14246(1283823446);
	    if (null != Class21.myPlayer
		&& (Class21.myPlayer.method10874()
		    != null)) {
		if (null == aClass287_653)
		    aClass287_653 = new Class287();
		aClass287_653.aFloat4477
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386.aFloat4477);
		aClass287_653.aFloat4474 = 0.0F;
		aClass287_653.aFloat4479
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386.aFloat4479);
	    }
	    Iterator<Object> iterator
		= aHashMap646.values().iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		interface52.method191(-404988403);
	    }
	    iterator = aHashMap645.values().iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		interface52.method191(-993638429);
	    }
	    iterator = aList654.iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		if (interface52.method414(-726234997))
		    aHashMap645.remove
			(Integer.valueOf(interface52.method408((byte) 1)));
		else
		    aHashMap646.remove
			(Integer.valueOf(interface52.method408((byte) 1)));
	    }
	    aList654.clear();
	    if (aClass221_663 != null
		&& (aClass221_663.method4398(-1954061668)
		    == Class223.aClass223_2593)
		&& !aBool664
		&& client.aClass190_8340.packetCipher != null
		&& Class120_Sub1.method15109(1766317249 * client.anInt8288,
					     -1347215486)) {
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4061,
						 (client.aClass190_8340
						  .packetCipher),
						 16711935);
		class241_sub27.data.writeInt
		    (aClass221_663.method4418((byte) 90)
			 .method408((byte) 1),
		     351513740);
		client.aClass190_8340.sendPacket(class241_sub27, -1789074697);
		aBool664 = true;
	    }
	    iterator = aList659.iterator();
	    while (iterator.hasNext()) {
		Class221 class221 = (Class221) iterator.next();
		class221.method4415(1004188649);
		class221.method4397(-1628414291);
		Class223 class223 = class221.method4398(-2068740733);
		if (class221.method4400(-2131432709) == this) {
		    if (Class223.aClass223_2596 == class223
			|| Class223.aClass223_2600 == class223) {
			if ((class221.method4402((byte) -3)
			     == Class112.aClass112_1524)
			    || (class221.method4402((byte) -22)
				== Class112.aClass112_1525)) {
			    if (class221 == aClass221_663) {
				aBool664 = false;
				aClass221_663 = null;
				class221.method4390(784862680);
				aList651.remove(class221);
			    } else {
				int i = class221.method4418((byte) 115)
					    .method408((byte) 1);
				boolean bool
				    = (method1179(Class130.aClass130_1596
						      .method3067(-960497231),
						  (byte) -31)
				       > 0.0F);
				if (!aBool671 && bool) {
				    if (i == (-1330999365
					      * anInt661)) {
					method1167(i, -1343442582);
					anInt661 = 90710669;
				    }
				    class221.method4390(-304704134);
				    aList651.remove(class221);
				} else if ((anInt666
					    * 172131871)
					   == i) {
				    anInt666 = -891254239;
				    aBool671 = false;
				    class221.method4390(1594142936);
				    aList651.remove(class221);
				    Iterator<Object> iterator_8_
					= aList659.iterator();
				    while (iterator_8_.hasNext()) {
					Class221 class221_9_
					    = (Class221) iterator_8_.next();
					if (class221_9_.method4402((byte) -83)
					    == Class112.aClass112_1524) {
					    int i_10_
						= class221_9_.method4418
						      ((byte) 89)
						      .method408((byte) 1);
					    if (((anInt661
						  * -1330999365) == i_10_
						 && ((class221_9_.method4398
						      (-1950022412))
						     == (Class223
							 .aClass223_2596)))
						|| ((class221_9_.method4398
						     (-1922888364))
						    == Class223.aClass223_2594)
						|| ((class221_9_.method4398
						     (-2034726920))
						    == Class223.aClass223_2595)
						|| ((class221_9_.method4398
						     (-1884304183))
						    == (Class223
							.aClass223_2593))) {
						if ((class221_9_.method4398
						     (-1898736750))
						    == Class223.aClass223_2596)
						    class221_9_
							.method4395((byte) 0);
						else
						    class221_9_.method4392
							(1595721981);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (false == aBool671
					|| i != (anInt661
						 * -1330999365)) {
					class221.method4390(-1083451626);
					aList651
					    .remove(class221);
				    }
				    if (false == aBool671
					&& (anInt661
					    * -1330999365) == i) {
					anInt661 = 90710669;
					aClass221_662 = null;
				    }
				}
			    }
			} else {
			    Iterator<Integer> iterator_11_
				= aHashMap660.keySet()
				      .iterator();
			    while (iterator_11_.hasNext()) {
				int i = ((Integer) iterator_11_.next())
					    .intValue();
				Class113 class113
				    = (Class113) ((SoundManager) this)
						     .aHashMap660
						     .get(Integer.valueOf(i));
				if (class113.method2784(1163001070)
					.contains(class221)) {
				    class113.method2783(class221, 744443427);
				    break;
				}
			    }
			    class221.method4390(-565851742);
			    aList651.remove(class221);
			}
		    } else if ((class221.method4398(-2011106901)
				!= Class223.aClass223_2598)
			       && (class221.method4403((byte) -22)
				   == Class130.aClass130_1596
					  .method3067(-960497231))) {
			boolean bool = (method1179(Class130.aClass130_1596
						       .method3067(-960497231),
						   (byte) -79)
					> 1.0E-4F);
			if (!bool)
			    class221.method4405(150, -163760847);
		    }
		}
	    }
	}
    }
    
    void method1149(int i) {
	Class92 class92 = new Class92(this);
	Class121 class121 = new Class121(this);
	Class128 class128 = new Class128(this);
	Class114 class114 = new Class114(this);
	Class124 class124 = new Class124(this);
	Class499.method11334(Class91.aClass91_1314.method2062(-1196793017),
			     Class91.aClass91_1317.method2062(-1876741767),
			     0.2F, class92, (byte) 58);
	Class499.method11334(Class91.aClass91_1315.method2062(520336579),
			     Class91.aClass91_1317.method2062(-1840934096),
			     1.0F, class121, (byte) 67);
	Class499.method11334(Class91.aClass91_1319.method2062(992945512),
			     Class91.aClass91_1317.method2062(358250994), 1.0F,
			     class128, (byte) 68);
	Class499.method11334(Class91.aClass91_1313.method2062(-1000945833),
			     Class91.aClass91_1317.method2062(-1558225995),
			     0.8F, class114, (byte) 41);
	Class499.method11334(Class91.aClass91_1318.method2062(307226226),
			     Class91.aClass91_1317.method2062(1242749874),
			     1.0F, class124, (byte) 50);
	Class499.method11334(Class130.aClass130_1596.method3067(-960497231),
			     Class91.aClass91_1315.method2062(71670622), 1.0F,
			     null, (byte) 12);
	Class499.method11334(Class130.aClass130_1603.method3067(-960497231),
			     Class91.aClass91_1318.method2062(-1477422482),
			     1.0F, null, (byte) 66);
	Class499.method11334(Class130.aClass130_1597.method3067(-960497231),
			     Class91.aClass91_1314.method2062(197248652), 1.0F,
			     null, (byte) 117);
	Class499.method11334(Class130.aClass130_1598.method3067(-960497231),
			     Class91.aClass91_1314.method2062(-1398410544),
			     1.0F, null, (byte) 48);
	Class499.method11334(Class130.aClass130_1605.method3067(-960497231),
			     Class91.aClass91_1314.method2062(-95018601), 1.0F,
			     null, (byte) 125);
	Class499.method11334(Class130.aClass130_1600.method3067(-960497231),
			     Class91.aClass91_1314.method2062(-374279914),
			     1.0F, null, (byte) 104);
	Class499.method11334(Class130.aClass130_1599.method3067(-960497231),
			     Class91.aClass91_1314.method2062(-1142198022),
			     1.0F, null, (byte) 30);
	Class499.method11334(Class130.aClass130_1602.method3067(-960497231),
			     Class91.aClass91_1313.method2062(-1606138946),
			     1.0F, null, (byte) 21);
	Class499.method11334(Class130.aClass130_1604.method3067(-960497231),
			     Class130.aClass130_1602.method3067(-960497231),
			     1.0F, null, (byte) 121);
	Class499.method11334(Class130.aClass130_1595.method3067(-960497231),
			     Class130.aClass130_1602.method3067(-960497231),
			     1.0F, null, (byte) 104);
	ClanChannelDelta.method6945
	    (Class130.aClass130_1596.method3067(-960497231), (byte) -90)
	    .method5938(0.75F, -1291412036);
    }
    
    Class129 method1150(int i) {
	return aClass129_655;
    }
    
    public void method1151(int i, int i_12_, byte i_13_) {
	Class322 class322 = ClanChannelDelta.method6945(i, (byte) -102);
	if (class322 != null) {
	    float f = 1.5258789E-5F * (float) i_12_;
	    class322.method5938(f, -1054734180);
	}
    }
    
    Interface52 method1152(int i, boolean bool) {
	if (!initialised)
	    return null;
	Interface52 interface52
	    = ((Interface52)
	       (bool ? aClass129_656.get((long) i)
		: aClass129_655.get((long) i)));
	if (null == interface52) {
	    if (bool)
		interface52 = (Interface52) aHashMap645
						.get(Integer.valueOf(i));
	    else
		interface52 = (Interface52) aHashMap646
						.get(Integer.valueOf(i));
	}
	return interface52;
    }
    
    public void method1153(int i, int i_14_) {
		Iterator<Class221> iterator = aList651.iterator();
		while (iterator.hasNext()) {
		    Class221 class221 = (Class221) iterator.next();
		    int i_15_ = class221.method4403((byte) -117);
		    boolean bool = Class490.method11234(i_15_, i, (byte) -57);
		    if (bool) {
		    	class221.method4405(50, -287633803);
		    }
		}
    }
    
    void method1154(int[] is, int i) {
	if (initialised && null != is) {
	    int[] is_16_ = is;
	    for (int i_17_ = 0; i_17_ < is_16_.length; i_17_++) {
		int i_18_ = is_16_[i_17_];
		method1155(i_18_, (byte) 8);
	    }
	}
    }
    
    public void method1155(int i, byte i_19_) {
	if (initialised && i >= 0)
	    method1157(i, false, -1172613925);
    }
    
    Interface52 method1156(int i, boolean bool, byte i_20_) {
	if (!initialised)
	    return null;
	Interface52 interface52
	    = ((Interface52)
	       (bool ? aClass129_656.get((long) i)
		: aClass129_655.get((long) i)));
	if (null == interface52) {
	    if (bool)
		interface52 = (Interface52) aHashMap645
						.get(Integer.valueOf(i));
	    else
		interface52 = (Interface52) aHashMap646
						.get(Integer.valueOf(i));
	}
	return interface52;
    }
    
    Interface52 method1157(int i, boolean bool, int i_21_) {
	if (!initialised)
	    return null;
	Interface52 interface52 = method1156(i, bool, (byte) -20);
	if (interface52 == null) {
	    Class111 class111 = new Class111(this);
	    interface52 = InvTypeList.method13279((bool ? Class507.aClass210_6671
						: AnimationConfigLoader.aClass210_6996),
					       i, class111, bool,
					       aClass129_657,
					       1427511937);
	    if (bool)
		aHashMap645.put(Integer.valueOf(i),
						 interface52);
	    else
		aHashMap646.put(Integer.valueOf(i),
						 interface52);
	}
	return interface52;
    }
    
    Class221 method1158(Interface52 interface52, byte i) {
	if (!initialised)
	    return null;
	int i_22_ = 0;
	Iterator<Object> iterator = aList659.iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    i_22_++;
	    if (class221.method4398(-1936572660) == Class223.aClass223_2602) {
		class221.method4437(interface52, (byte) -50);
		return class221;
	    }
	}
	if (i_22_ >= -1150925559 * anInt652)
	    return null;
	Class221 class221 = interface52.method389(967191857);
	aList659.add(class221);
	return class221;
    }
    
    public void method1159(Class221 class221) {
	class221.method4416(this, (byte) 1);
	aList651.add(class221);
    }
    
    public Class221 method1160
	(Class112 class112, Object object, int i, int i_23_, int i_24_,
	 int i_25_, Class127 class127, float f, float f_26_, Class287 class287,
	 int i_27_, int i_28_, boolean bool) {
	if (!initialised)
	    return null;
	if (object == null)
	    return null;
	i_24_ = Math.max(0, Math.min(i_24_, 255));
	i_28_ = Math.max(0, i_28_);
	if (Class127.aClass127_1587 != class127
	    && !method1204(aClass287_653, class287, f_26_,
			   -710193194))
	    return null;
	if (i_28_ <= 0)
	    i_28_ = 255;
	float f_29_ = (float) i_24_ / 255.0F;
	float f_30_ = (float) i_28_ / 255.0F;
	Interface52 interface52 = method1157(i, bool, -1213704926);
	Class221 class221 = method1158(interface52, (byte) 16);
	if (null == class221)
	    return null;
	class221.method4416(object, (byte) 1);
	class221.method4428(i_25_, 1287675464);
	if (Class127.aClass127_1587 != class127) {
	    class221.method4393(true, (byte) -47);
	    class221.method4407(class287, -15882518);
	    class221.method4411(f, -1615952332);
	    class221.method4412(f_26_, (byte) 0);
	    if (Class127.aClass127_1586 == class127)
		class221.method4396(anInterface20_669,
				    1963640292);
	    else if (Class127.aClass127_1583 == class127)
		class221.method4396(anInterface20_668,
				    -1754413374);
	    else if (Class127.aClass127_1584 == class127)
		class221.method4396(anInterface20_667,
				    767684146);
	    else if (Class127.aClass127_1585 == class127)
		class221.method4396(anInterface20_670,
				    1318488175);
	    else
		class221.method4393(false, (byte) -93);
	}
	class221.method4440(f_29_, 0, -480163187);
	class221.method4417(i_23_ > 1 || i_23_ < 0,
			    i_23_ > 0 ? i_23_ - 1 : i_23_, (byte) 80);
	class221.method4463(f_30_, -1743153946);
	class221.method4401(class112, 1343016813);
	return class221;
    }
    
    public Class221 method1161
	(Class112 class112, Object object, int i, int i_31_, int i_32_,
	 int i_33_, Class127 class127, float f, float f_34_, Class287 class287,
	 int i_35_, int i_36_, boolean bool, int i_37_) {
	if (!initialised)
	    return null;
	if (object == null)
	    return null;
	i_32_ = Math.max(0, Math.min(i_32_, 255));
	i_36_ = Math.max(0, i_36_);
	if (Class127.aClass127_1587 != class127
	    && !method1204(aClass287_653, class287, f_34_,
			   -710193194))
	    return null;
	if (i_36_ <= 0)
	    i_36_ = 255;
	float f_38_ = (float) i_32_ / 255.0F;
	float f_39_ = (float) i_36_ / 255.0F;
	Interface52 interface52 = method1157(i, bool, -2003782523);
	Class221 class221 = method1158(interface52, (byte) 63);
	if (null == class221)
	    return null;
	class221.method4416(object, (byte) 1);
	class221.method4428(i_33_, 1287675464);
	if (Class127.aClass127_1587 != class127) {
	    class221.method4393(true, (byte) -103);
	    class221.method4407(class287, -1231265014);
	    class221.method4411(f, -318293943);
	    class221.method4412(f_34_, (byte) 0);
	    if (Class127.aClass127_1586 == class127)
		class221.method4396(anInterface20_669,
				    549840350);
	    else if (Class127.aClass127_1583 == class127)
		class221.method4396(anInterface20_668,
				    -2076280973);
	    else if (Class127.aClass127_1584 == class127)
		class221.method4396(anInterface20_667,
				    -382710256);
	    else if (Class127.aClass127_1585 == class127)
		class221.method4396(anInterface20_670,
				    2015662672);
	    else
		class221.method4393(false, (byte) -95);
	}
	class221.method4440(f_38_, 0, -1667682445);
	class221.method4417(i_31_ > 1 || i_31_ < 0,
			    i_31_ > 0 ? i_31_ - 1 : i_31_, (byte) 79);
	class221.method4463(f_39_, -1823542164);
	class221.method4401(class112, 1343016813);
	return class221;
    }
    
    public void method1162(Class112 class112, int i, int i_40_, int i_41_,
			   int i_42_, Class127 class127, float f, float f_43_,
			   Class287 class287, int i_44_, int i_45_, int i_46_,
			   int i_47_) {
		if (initialised) {
		    Class221 class221 = method1161(class112, this, i, i_40_, i_41_,
						   i_42_, class127, f, f_43_, class287,
						   i_44_, i_45_, false, 1392459383);
		    if (null != class221) {
				if (0 == i_46_) {
				    class221.method4392(1058357078);
				} else {
				    class221.method4413(i_46_, false, (byte) -15);
				}
				method1136(class221, (byte) -113);
		    }
		}
    }
    
    public void method1163(int i, int i_48_, int i_49_) {
		if (-1330999365 * anInt661 != i) {
		    if (aClass221_663 != null) {
				aClass221_663.method4405(0, -1702629525);
				method1136(aClass221_663, (byte) 2);
				aClass221_663 = null;
		    }
		    Class221 class221 = method1161(Class112.aClass112_1524, this, i, 0, i_48_,
				     Class130.aClass130_1596.method3067(-960497231),
				     Class127.aClass127_1587, 0.0F, 0.0F, null, 0, 255,
				     true, 405247465);
		    if (class221 != null) {
				class221.method4438(-1114738646);
				aClass221_663 = class221;
		    }
		    aBool664 = false;
		}
    }
    
    public int method1164(int i) {
	return anInt661 * -1330999365;
    }
    
    public void method1165(int i, byte i_50_) {
	anInt665 = 1481520223 * i;
    }
    
    public void method1166() {
	Iterator<Class221> iterator = aList651.iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    if (class221.method4402((byte) -64) == Class112.aClass112_1524) {
		class221.method4405(500, -627609612);
		if (class221.method4418((byte) 41).method408((byte) 1)
		    == -1330999365 * anInt661) {
		    method1167(anInt661 * -1330999365,
			       -1001229779);
		    break;
		}
	    }
	}
	aClass221_662 = null;
	anInt661 = 90710669;
    }
    
    void method1167(int i, int i_51_) {
	if (client.aClass190_8340.packetCipher != null
	    && Class120_Sub1.method15109(1766317249 * client.anInt8288,
					 -173765140)) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4063,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeInt(i, -855546037);
	    client.aClass190_8340.sendPacket(class241_sub27, -1544535674);
	}
    }
    
    public void method1168(int i, int i_52_) {
	method1169(i, 255, -1037003726);
    }
    
    public void method1169(int i, int i_53_, int i_54_) {
	method1170(i, i_53_, false, 0, 0, 0, 0, 0, 417685557);
    }
    
    public void method1170(int i, int i_55_, boolean bool, int i_56_,
			   int i_57_, int i_58_, int i_59_, int i_60_,
			   int i_61_) {
	if (initialised
	    && i != -1330999365 * anInt661) {
	    Class221 class221 = method1202(1304568575);
	    if (class221 != null
		&& class221.method4418((byte) 10).method408((byte) 1) == i) {
		aClass221_662 = class221;
		anInt661
		    = (class221.method4418((byte) 69).method408((byte) 1)
		       * -90710669);
	    } else {
		boolean bool_62_ = false;
		if (-1330999365 * anInt661 >= 0) {
		    Iterator<Class221> iterator = aList651.iterator();
		    while (iterator.hasNext()) {
			Class221 class221_63_ = (Class221) iterator.next();
			if (class221_63_.method4402((byte) -12)
			    == Class112.aClass112_1524) {
			    class221_63_.method4405(2000, -1431558156);
			    bool_62_ = true;
			}
		    }
		}
		aClass221_662 = null;
		anInt661 = 90710669;
		Class221 class221_64_ = null;
		if (null != aClass221_663
		    && (aClass221_663.method4418((byte) 4)
			!= null)
		    && aClass221_663.method4418
			   ((byte) 100).method408((byte) 1) == i
		    && (aClass221_663.method4398(-2082222743)
			== Class223.aClass223_2593)) {
		    class221_64_ = aClass221_663;
		    aClass221_663 = null;
		    aBool664 = false;
		}
		if (class221_64_ == null) {
		    if (bool) {
			float f = (float) i_59_;
			float f_65_ = (float) i_60_;
			Class287 class287
			    = new Class287((float) i_57_, 0.0F, (float) i_58_);
			class221_64_
			    = method1161(Class112.aClass112_1524, this, i, 0,
					 bool_62_ ? 0 : i_55_,
					 ((-1351800929
					   * anInt665) == i
					  ? Class91.aClass91_1319
						.method2062(1229475263)
					  : Class130.aClass130_1596
						.method3067(-960497231)),
					 Class127.aClass127_1585, f, f_65_,
					 class287, i_56_, 255, true,
					 1340170950);
		    } else
			class221_64_
			    = method1161(Class112.aClass112_1524, this, i, 0,
					 bool_62_ ? 0 : i_55_,
					 ((-1351800929
					   * anInt665) == i
					  ? Class91.aClass91_1319
						.method2062(-640394365)
					  : Class130.aClass130_1596
						.method3067(-960497231)),
					 Class127.aClass127_1587, 0.0F, 0.0F,
					 null, 0, 255, true, 1828426991);
		}
		if (class221_64_ != null) {
		    if (false == aBool671) {
			if (bool_62_) {
			    float f = (float) i_55_ / 255.0F;
			    class221_64_.method4440(f, 2000, 484142129);
			}
			class221_64_.method4392(2132462535);
		    } else if ((class221_64_.method4398(-1945974694).anInt2603
				* 2103253931)
			       < (Class223.aClass223_2593.anInt2603
				  * 2103253931))
			class221_64_.method4438(1181170425);
		    method1136(class221_64_, (byte) -89);
		    aClass221_662 = class221_64_;
		    anInt661 = -90710669 * i;
		    if (client.aClass190_8340.packetCipher != null
			&& Class120_Sub1.method15109((1766317249
						      * client.anInt8288),
						     917552604)) {
			Class241_Sub27 class241_sub27
			    = Class445_Sub26.makePacket((OutgoingOpcode
							  .aClass253_4061),
							 (client.aClass190_8340
							  .packetCipher),
							 16711935);
			class241_sub27.data.writeInt
			    (-1330999365 * anInt661,
			     698139131);
			client.aClass190_8340.sendPacket(class241_sub27,
							 -1671750868);
		    }
		}
	    }
	}
    }
    
    public void method1171(Class221 class221, int i, int i_66_) {
	if (class221 != null) {
	    Class113 class113
		= ((Class113)
		   aHashMap660.get(Integer.valueOf(i)));
	    if (class113 == null) {
		class113 = new Class113(this);
		aHashMap660.put(Integer.valueOf(i), class113);
	    }
	    if (!class113.method2791(class221, 2090712374)) {
		class221.method4413(i_66_, true, (byte) -7);
		class113.method2782(class221, (byte) 8);
	    }
	}
    }
    
    public int method1172() {
	return anInt661 * -1330999365;
    }
    
    public void method1173(int i, int i_67_, byte i_68_) {
	if (initialised && !aBool671) {
	    if (i_67_ != 0 && i != -1) {
		if (!aBool671
		    && null != aClass221_662)
		    aClass221_662.method4394(-361348801);
		Class221 class221
		    = method1161(Class112.aClass112_1525, this, i, 0, i_67_,
				 Class130.aClass130_1596
				     .method3067(-960497231),
				 Class127.aClass127_1587, 0.0F, 0.0F, null, 0,
				 255, true, 1769806382);
		if (class221 != null) {
		    class221.method4392(1998516716);
		    method1136(class221, (byte) -123);
		    aBool671 = true;
		    anInt666 = i * 891254239;
		}
	    }
	}
    }
    
    public void method1174(int i, int i_69_, int i_70_, int i_71_) {
	int i_72_ = Class91.aClass91_1317.method2062(516492549);
	if (ClanChannelDelta.method6945(i, (byte) -18) == null
	    && (i_72_ == i_69_
		|| ClanChannelDelta.method6945(i_69_, (byte) -56) != null)) {
	    float f = (float) i_70_ * 1.5258789E-5F;
	    Class499.method11334(i, i_72_ == i_69_ ? -1 : i_69_, f, null,
				 (byte) 125);
	}
    }
    
    public void method1175() {
	if (initialised) {
	    Class445_Sub15.method14246(-1780930208);
	    if (null != Class21.myPlayer
		&& (Class21.myPlayer.method10874()
		    != null)) {
		if (null == aClass287_653)
		    aClass287_653 = new Class287();
		aClass287_653.aFloat4477
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386.aFloat4477);
		aClass287_653.aFloat4474 = 0.0F;
		aClass287_653.aFloat4479
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386.aFloat4479);
	    }
	    Iterator<Object> iterator
		= aHashMap646.values().iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		interface52.method191(-9322984);
	    }
	    iterator = aHashMap645.values().iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		interface52.method191(-620713170);
	    }
	    iterator = aList654.iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		if (interface52.method414(-295810619))
		    aHashMap645.remove
			(Integer.valueOf(interface52.method408((byte) 1)));
		else
		    aHashMap646.remove
			(Integer.valueOf(interface52.method408((byte) 1)));
	    }
	    aList654.clear();
	    if (aClass221_663 != null
		&& (aClass221_663.method4398(-2131118112)
		    == Class223.aClass223_2593)
		&& !aBool664
		&& client.aClass190_8340.packetCipher != null
		&& Class120_Sub1.method15109(1766317249 * client.anInt8288,
					     635111920)) {
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4061,
						 (client.aClass190_8340
						  .packetCipher),
						 16711935);
		class241_sub27.data.writeInt
		    (aClass221_663.method4418((byte) 61)
			 .method408((byte) 1),
		     1183808972);
		client.aClass190_8340.sendPacket(class241_sub27, -1820993566);
		aBool664 = true;
	    }
	    iterator = aList659.iterator();
	    while (iterator.hasNext()) {
		Class221 class221 = (Class221) iterator.next();
		class221.method4415(-532988945);
		class221.method4397(226285635);
		Class223 class223 = class221.method4398(-1846055061);
		if (class221.method4400(-2130614854) == this) {
		    if (Class223.aClass223_2596 == class223
			|| Class223.aClass223_2600 == class223) {
			if ((class221.method4402((byte) -113)
			     == Class112.aClass112_1524)
			    || (class221.method4402((byte) -3)
				== Class112.aClass112_1525)) {
			    if (class221 == aClass221_663) {
				aBool664 = false;
				aClass221_663 = null;
				class221.method4390(1706976898);
				aList651.remove(class221);
			    } else {
				int i = class221.method4418((byte) 26)
					    .method408((byte) 1);
				boolean bool
				    = (method1179(Class130.aClass130_1596
						      .method3067(-960497231),
						  (byte) -53)
				       > 0.0F);
				if (!aBool671 && bool) {
				    if (i == (-1330999365
					      * anInt661)) {
					method1167(i, -628350505);
					anInt661 = 90710669;
				    }
				    class221.method4390(2020984366);
				    aList651.remove(class221);
				} else if ((anInt666
					    * 172131871)
					   == i) {
				    anInt666 = -891254239;
				    aBool671 = false;
				    class221.method4390(206250826);
				    aList651.remove(class221);
				    Iterator<Object> iterator_73_
					= aList659.iterator();
				    while (iterator_73_.hasNext()) {
					Class221 class221_74_
					    = (Class221) iterator_73_.next();
					if (class221_74_.method4402((byte) -64)
					    == Class112.aClass112_1524) {
					    int i_75_
						= class221_74_.method4418
						      ((byte) 112)
						      .method408((byte) 1);
					    if (((anInt661
						  * -1330999365) == i_75_
						 && ((class221_74_.method4398
						      (-2103333045))
						     == (Class223
							 .aClass223_2596)))
						|| ((class221_74_.method4398
						     (-1912152131))
						    == Class223.aClass223_2594)
						|| ((class221_74_.method4398
						     (-1936884749))
						    == Class223.aClass223_2595)
						|| ((class221_74_.method4398
						     (-1888399343))
						    == (Class223
							.aClass223_2593))) {
						if ((class221_74_.method4398
						     (-2064788476))
						    == Class223.aClass223_2596)
						    class221_74_
							.method4395((byte) 0);
						else
						    class221_74_.method4392
							(2033191807);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (false == aBool671
					|| i != (anInt661
						 * -1330999365)) {
					class221.method4390(162801521);
					aList651
					    .remove(class221);
				    }
				    if (false == aBool671
					&& (anInt661
					    * -1330999365) == i) {
					anInt661 = 90710669;
					aClass221_662 = null;
				    }
				}
			    }
			} else {
			    Iterator<Integer> iterator_76_
				= aHashMap660.keySet()
				      .iterator();
			    while (iterator_76_.hasNext()) {
				int i = ((Integer) iterator_76_.next())
					    .intValue();
				Class113 class113
				    = (Class113) ((SoundManager) this)
						     .aHashMap660
						     .get(Integer.valueOf(i));
				if (class113.method2784(1163001070)
					.contains(class221)) {
				    class113.method2783(class221, 776453098);
				    break;
				}
			    }
			    class221.method4390(306756132);
			    aList651.remove(class221);
			}
		    } else if ((class221.method4398(-2138213277)
				!= Class223.aClass223_2598)
			       && (class221.method4403((byte) -108)
				   == Class130.aClass130_1596
					  .method3067(-960497231))) {
			boolean bool = (method1179(Class130.aClass130_1596
						       .method3067(-960497231),
						   (byte) -12)
					> 1.0E-4F);
			if (!bool)
			    class221.method4405(150, -2036585090);
		    }
		}
	    }
	}
    }
    
    List<Class221> method1176() {
	return aList651;
    }
    
    List<Class221> method1177() {
	return aList651;
    }
    
    List<Object> method1178() {
	return aList654;
    }
    
    float method1179(int i, byte i_77_) {
	Class322 class322 = ClanChannelDelta.method6945(i, (byte) -113);
	float f = 1.0F;
	for (/**/; null != class322; class322 = class322.method5939(738609862))
	    f *= class322.method5937(1094734409);
	return f;
    }
    
    List<Object> method1180() {
	return aList654;
    }
    
    Class129 method1181() {
	return aClass129_655;
    }
    
    void method1182(int i) {
	if (client.aClass190_8340.packetCipher != null
	    && Class120_Sub1.method15109(1766317249 * client.anInt8288,
					 -671519700)) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4063,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeInt(i, 967634379);
	    client.aClass190_8340.sendPacket(class241_sub27, -1960475615);
	}
    }
    
    Class129 method1183() {
	return aClass129_656;
    }
    
    Class129 method1184() {
	return aClass129_656;
    }
    
    Class287 method1185() {
	return aClass287_653;
    }
    
    public void method1186(int i) {
	method1169(i, 255, -445155232);
    }
    
    public SoundManager() {
	aList651 = new ArrayList<Class221>();
	aHashMap646 = new HashMap<Integer, Object>();
	aHashMap645 = new HashMap<Integer, Object>();
	aList654 = new ArrayList<Object>();
	aHashMap660 = new HashMap<Integer, Class113>();
	aClass221_663 = null;
	aBool664 = false;
	anInterface20_667 = new Class94(this);
	anInterface20_669 = new Class125(this);
	anInterface20_670 = new Class110(this);
	anInterface20_668 = new Class131(this);
    }
    
    public void method1187(int i, int i_78_) {
	if (-1330999365 * anInt661 != i) {
	    if (aClass221_663 != null) {
		aClass221_663.method4405(0, -104241748);
		method1136(aClass221_663, (byte) -76);
		aClass221_663 = null;
	    }
	    Class221 class221
		= method1161(Class112.aClass112_1524, this, i, 0, i_78_,
			     Class130.aClass130_1596.method3067(-960497231),
			     Class127.aClass127_1587, 0.0F, 0.0F, null, 0, 255,
			     true, 352719853);
	    if (class221 != null) {
		class221.method4438(1840149965);
		aClass221_663 = class221;
	    }
	    aBool664 = false;
	}
    }
    
    public void method1188(int i, int i_79_) {
	if (initialised && !aBool671) {
	    if (i_79_ != 0 && i != -1) {
		if (!aBool671
		    && null != aClass221_662)
		    aClass221_662.method4394(-361348801);
		Class221 class221
		    = method1161(Class112.aClass112_1525, this, i, 0, i_79_,
				 Class130.aClass130_1596
				     .method3067(-960497231),
				 Class127.aClass127_1587, 0.0F, 0.0F, null, 0,
				 255, true, -1091973584);
		if (class221 != null) {
		    class221.method4392(1454024994);
		    method1136(class221, (byte) -63);
		    aBool671 = true;
		    anInt666 = i * 891254239;
		}
	    }
	}
    }
    
    public void method1189() {
	Class563.method12410((byte) 5);
    }
    
    boolean method1190(Class287 class287, Class287 class287_80_, float f) {
	Class287 class287_81_ = Class287.method5578(class287_80_, class287);
	if (class287_81_.method5559() >= f)
	    return false;
	return true;
    }
    
    public void method1191() {
	Class563.method12410((byte) 5);
    }
    
    public void method1192(int i) {
	Class113 class113
	    = (Class113) aHashMap660.get(Integer.valueOf(i));
	if (null != class113) {
	    List<?> list = class113.method2784(1163001070);
	    Iterator<?> iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class221 class221 = (Class221) iterator.next();
		if (!class221.method4414(1125783157))
		    class221.method4392(1862706074);
	    }
	}
    }
    
    public void method1193(int i) {
	Class113 class113
	    = (Class113) aHashMap660.get(Integer.valueOf(i));
	if (null != class113) {
	    List<?> list = class113.method2784(1163001070);
	    Iterator<?> iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class221 class221 = (Class221) iterator.next();
		class221.method4438(-1326341994);
	    }
	}
    }
    
    void method1194() {
	Class92 class92 = new Class92(this);
	Class121 class121 = new Class121(this);
	Class128 class128 = new Class128(this);
	Class114 class114 = new Class114(this);
	Class124 class124 = new Class124(this);
	Class499.method11334(Class91.aClass91_1314.method2062(-1874558935),
			     Class91.aClass91_1317.method2062(251503080), 0.2F,
			     class92, (byte) 96);
	Class499.method11334(Class91.aClass91_1315.method2062(734965172),
			     Class91.aClass91_1317.method2062(-400824033),
			     1.0F, class121, (byte) 28);
	Class499.method11334(Class91.aClass91_1319.method2062(-1794987103),
			     Class91.aClass91_1317.method2062(846523224), 1.0F,
			     class128, (byte) 81);
	Class499.method11334(Class91.aClass91_1313.method2062(1164703880),
			     Class91.aClass91_1317.method2062(1290176282),
			     0.8F, class114, (byte) 93);
	Class499.method11334(Class91.aClass91_1318.method2062(-1572169747),
			     Class91.aClass91_1317.method2062(-988881953),
			     1.0F, class124, (byte) 58);
	Class499.method11334(Class130.aClass130_1596.method3067(-960497231),
			     Class91.aClass91_1315.method2062(-844603689),
			     1.0F, null, (byte) 21);
	Class499.method11334(Class130.aClass130_1603.method3067(-960497231),
			     Class91.aClass91_1318.method2062(-1387195611),
			     1.0F, null, (byte) 69);
	Class499.method11334(Class130.aClass130_1597.method3067(-960497231),
			     Class91.aClass91_1314.method2062(-355588777),
			     1.0F, null, (byte) 46);
	Class499.method11334(Class130.aClass130_1598.method3067(-960497231),
			     Class91.aClass91_1314.method2062(-517851632),
			     1.0F, null, (byte) 119);
	Class499.method11334(Class130.aClass130_1605.method3067(-960497231),
			     Class91.aClass91_1314.method2062(24464706), 1.0F,
			     null, (byte) 64);
	Class499.method11334(Class130.aClass130_1600.method3067(-960497231),
			     Class91.aClass91_1314.method2062(-1266889771),
			     1.0F, null, (byte) 3);
	Class499.method11334(Class130.aClass130_1599.method3067(-960497231),
			     Class91.aClass91_1314.method2062(-1231411403),
			     1.0F, null, (byte) 78);
	Class499.method11334(Class130.aClass130_1602.method3067(-960497231),
			     Class91.aClass91_1313.method2062(-1340099583),
			     1.0F, null, (byte) 94);
	Class499.method11334(Class130.aClass130_1604.method3067(-960497231),
			     Class130.aClass130_1602.method3067(-960497231),
			     1.0F, null, (byte) 90);
	Class499.method11334(Class130.aClass130_1595.method3067(-960497231),
			     Class130.aClass130_1602.method3067(-960497231),
			     1.0F, null, (byte) 4);
	ClanChannelDelta.method6945
	    (Class130.aClass130_1596.method3067(-960497231), (byte) -54)
	    .method5938(0.75F, -964574149);
    }
    
    float method1195(int i) {
	Class322 class322 = ClanChannelDelta.method6945(i, (byte) -44);
	float f = 1.0F;
	for (/**/; null != class322; class322 = class322.method5939(-81198474))
	    f *= class322.method5937(1094734409);
	return f;
    }
    
    public int method1196(int i) {
	return -1351800929 * anInt665;
    }
    
    public void method1197(int i) {
	if (initialised && i >= 0)
	    method1157(i, false, -1283618105);
    }
    
    void method1198(int[] is) {
	if (initialised && null != is) {
	    int[] is_82_ = is;
	    for (int i = 0; i < is_82_.length; i++) {
		int i_83_ = is_82_[i];
		method1155(i_83_, (byte) 8);
	    }
	}
    }
    
    void method1199(int[] is) {
	if (initialised && null != is) {
	    int[] is_84_ = is;
	    for (int i = 0; i < is_84_.length; i++) {
		int i_85_ = is_84_[i];
		method1155(i_85_, (byte) 8);
	    }
	}
    }
    
    public void method1200(int i) {
	if (initialised && i >= 0)
	    method1157(i, false, -1669079091);
    }
    
    public void method1201(int i) {
	if (initialised && i >= 0)
	    method1157(i, false, -1974409881);
    }
    
    Class221 method1202(int i) {
	Iterator<Class221> iterator = aList651.iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    if (class221.method4402((byte) -25) == Class112.aClass112_1524
		&& class221.method4398(-1864085091) == Class223.aClass223_2597)
		return class221;
	}
	return null;
    }
    
    public void method1203(int i) {
	if (initialised && i >= 0)
	    method1157(i, false, -1034062675);
    }
    
    boolean method1204(Class287 class287, Class287 class287_86_, float f,
		       int i) {
	Class287 class287_87_ = Class287.method5578(class287_86_, class287);
	if (class287_87_.method5559() >= f)
	    return false;
	return true;
    }
    
    Interface52 method1205(int i, boolean bool) {
	if (!initialised)
	    return null;
	Interface52 interface52 = method1156(i, bool, (byte) -49);
	if (interface52 == null) {
	    Class111 class111 = new Class111(this);
	    interface52 = InvTypeList.method13279((bool ? Class507.aClass210_6671
						: AnimationConfigLoader.aClass210_6996),
					       i, class111, bool,
					       aClass129_657,
					       1212477226);
	    if (bool)
		aHashMap645.put(Integer.valueOf(i),
						 interface52);
	    else
		aHashMap646.put(Integer.valueOf(i),
						 interface52);
	}
	return interface52;
    }
    
    Class221 method1206(Interface52 interface52) {
	if (!initialised)
	    return null;
	int i = 0;
	Iterator<Object> iterator = aList659.iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    i++;
	    if (class221.method4398(-1946004814) == Class223.aClass223_2602) {
		class221.method4437(interface52, (byte) -5);
		return class221;
	    }
	}
	if (i >= -1150925559 * anInt652)
	    return null;
	Class221 class221 = interface52.method389(458230956);
	aList659.add(class221);
	return class221;
    }
    
    public void method1207(int i, int i_88_) {
	if (!initialised) {
	    anInt652 = -1685661383 * i;
	    aClass129_655 = new Class129(i_88_, 100);
	    aClass129_656 = new Class129(10);
	    aClass129_655.method3021(new Class126(this),
						      -753982156);
	    Class493 class493 = new Class493(Class388.aClass388_5718);
	    Class170.method3685(class493, (byte) -1);
	    method1149(-2121148216);
	    anInt661 = 90710669;
	    initialised = true;
	}
    }
    
    boolean method1208(Class287 class287, Class287 class287_89_, float f) {
	Class287 class287_90_ = Class287.method5578(class287_89_, class287);
	if (class287_90_.method5559() >= f)
	    return false;
	return true;
    }
    
    public void method1209(int i) {
	Iterator<Class221> iterator = aList651.iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    int i_91_ = class221.method4403((byte) -43);
	    boolean bool = Class490.method11234(i_91_, i, (byte) -62);
	    if (bool)
		class221.method4405(50, -1563779692);
	}
    }
    
    boolean method1210(Class287 class287, Class287 class287_92_, float f) {
	Class287 class287_93_ = Class287.method5578(class287_92_, class287);
	if (class287_93_.method5559() >= f)
	    return false;
	return true;
    }
    
    public void method1211(int i) {
	anInt665 = 1481520223 * i;
    }
    
    public Class221 method1212
	(Class112 class112, Object object, int i, int i_94_, int i_95_,
	 int i_96_, Class127 class127, float f, float f_97_, Class287 class287,
	 int i_98_, int i_99_, boolean bool) {
	if (!initialised)
	    return null;
	if (object == null)
	    return null;
	i_95_ = Math.max(0, Math.min(i_95_, 255));
	i_99_ = Math.max(0, i_99_);
	if (Class127.aClass127_1587 != class127
	    && !method1204(aClass287_653, class287, f_97_,
			   -710193194))
	    return null;
	if (i_99_ <= 0)
	    i_99_ = 255;
	float f_100_ = (float) i_95_ / 255.0F;
	float f_101_ = (float) i_99_ / 255.0F;
	Interface52 interface52 = method1157(i, bool, -1557426451);
	Class221 class221 = method1158(interface52, (byte) 101);
	if (null == class221)
	    return null;
	class221.method4416(object, (byte) 1);
	class221.method4428(i_96_, 1287675464);
	if (Class127.aClass127_1587 != class127) {
	    class221.method4393(true, (byte) -23);
	    class221.method4407(class287, -818754523);
	    class221.method4411(f, -115354030);
	    class221.method4412(f_97_, (byte) 0);
	    if (Class127.aClass127_1586 == class127)
		class221.method4396(anInterface20_669,
				    -1627667882);
	    else if (Class127.aClass127_1583 == class127)
		class221.method4396(anInterface20_668,
				    -175475733);
	    else if (Class127.aClass127_1584 == class127)
		class221.method4396(anInterface20_667,
				    1743724345);
	    else if (Class127.aClass127_1585 == class127)
		class221.method4396(anInterface20_670,
				    500257853);
	    else
		class221.method4393(false, (byte) -2);
	}
	class221.method4440(f_100_, 0, -1987693526);
	class221.method4417(i_94_ > 1 || i_94_ < 0,
			    i_94_ > 0 ? i_94_ - 1 : i_94_, (byte) 35);
	class221.method4463(f_101_, -2095860796);
	class221.method4401(class112, 1343016813);
	return class221;
    }
    
    public void method1213(Class112 class112, int i, int i_102_, int i_103_,
			   int i_104_, Class127 class127, float f,
			   float f_105_, Class287 class287, int i_106_,
			   int i_107_, int i_108_) {
	if (initialised) {
	    Class221 class221
		= method1161(class112, this, i, i_102_, i_103_, i_104_,
			     class127, f, f_105_, class287, i_106_, i_107_,
			     false, -1151212819);
	    if (null != class221) {
		if (0 == i_108_)
		    class221.method4392(1154107837);
		else
		    class221.method4413(i_108_, false, (byte) 10);
		method1136(class221, (byte) -88);
	    }
	}
    }
    
    public void method1214(Class112 class112, int i, int i_109_, int i_110_,
			   int i_111_, Class127 class127, float f,
			   float f_112_, Class287 class287, int i_113_,
			   int i_114_, int i_115_) {
	if (initialised) {
	    Class221 class221
		= method1161(class112, this, i, i_109_, i_110_, i_111_,
			     class127, f, f_112_, class287, i_113_, i_114_,
			     false, -81146566);
	    if (null != class221) {
		if (0 == i_115_)
		    class221.method4392(895090781);
		else
		    class221.method4413(i_115_, false, (byte) -80);
		method1136(class221, (byte) -71);
	    }
	}
    }
    
    public void method1215(byte i) {
		Iterator<Class221> iterator = aList651.iterator();
		while (iterator.hasNext()) {
		    Class221 class221 = (Class221) iterator.next();
		    if (class221.method4402((byte) -105) == Class112.aClass112_1524) {
				class221.method4405(500, -2104321216);
				if (class221.method4418((byte) 40).method408((byte) 1)
						== -1330999365 * anInt661) {
				    method1167(anInt661 * -1330999365, -1169994328);
				    break;
				}
		    }
		}
		aClass221_662 = null;
		anInt661 = 90710669;
    }
    
    public void init/*method1216*/(int i, int i_116_, int i_117_) {
		if (!initialised) {
		    anInt652 = -1685661383 * i;
		    aClass129_655 = new Class129(i_116_, 100);
		    aClass129_656 = new Class129(10);
		    aClass129_655.method3021(new Class126(this), -994366067);
		    Class493 class493 = new Class493(Class388.aClass388_5718);
		    Class170.method3685(class493, (byte) -1);
		    method1149(-958974612);
		    anInt661 = 90710669;
		    initialised = true;
		}
    }
    
    List<Class221> method1217(byte i) {
	return aList651;
    }
    
    public void method1218(int i) {
	anInt665 = 1481520223 * i;
    }
    
    public int method1219() {
	return -1351800929 * anInt665;
    }
    
    public int method1220() {
	return -1351800929 * anInt665;
    }
    
    public void method1221(AnimationDefinition class549, int i, byte i_118_) {
		if (class549 != null && class549.handledSounds != null
		    && i < class549.handledSounds.length
		    && class549.handledSounds[i] != null) {
		    int i_119_ = class549.handledSounds[i][0];
		    int i_120_ = i_119_ >> 8;
		    int i_121_ = i_119_ >> 5 & 0x7;
		    if (class549.handledSounds[i].length > 1) {
			int i_122_ = (int) (Math.random()
					    * (double) (class549.handledSounds
							[i]).length);
			if (i_122_ > 0)
			    i_120_ = class549.handledSounds[i][i_122_];
		    }
		    int i_123_ = 256;
		    if (null != class549.soundMaxDelay
			&& null != class549.soundMinDelay)
			i_123_ = (int) ((double) class549.soundMaxDelay[i]
					+ (Math.random()
					   * (double) (class549.soundMinDelay[i]
						       - class549.soundMaxDelay[i])));
		    int i_124_ = (null == class549.anIntArray7085 ? 255
				  : class549.anIntArray7085[i]);
		    method1162(Class112.aClass112_1523, i_120_, i_121_, i_124_,
			       Class130.aClass130_1605.method3067(-960497231),
			       Class127.aClass127_1587, 0.0F, 0.0F, null, 0, i_123_, 0,
			       -576921778);
		}
    }
    
    public int method1222() {
	return -1351800929 * anInt665;
    }
    
    void method1223(int i) {
		if (client.aClass190_8340.packetCipher != null
		    && Class120_Sub1.method15109(1766317249 * client.anInt8288,
						 634965660)) {
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4063,
						     (client.aClass190_8340
						      .packetCipher),
						     16711935);
		    class241_sub27.data.writeInt(i,
									-1408483103);
		    client.aClass190_8340.sendPacket(class241_sub27, -1655444602);
		}
    }
    
    public void method1224(int i, int i_125_) {
	Class113 class113
	    = (Class113) aHashMap660.get(Integer.valueOf(i));
	if (null != class113) {
	    List<?> list = class113.method2784(1163001070);
	    Iterator<?> iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class221 class221 = (Class221) iterator.next();
		class221.method4438(1624049950);
	    }
	}
    }
    
    void method1225(int i) {
	if (client.aClass190_8340.packetCipher != null
	    && Class120_Sub1.method15109(1766317249 * client.anInt8288,
					 952043366)) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4063,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeInt(i, 141308461);
	    client.aClass190_8340.sendPacket(class241_sub27, -1529705799);
	}
    }
    
    public void method1226(int i) {
	method1169(i, 255, -482944800);
    }
    
    Class129 method1227(byte i) {
	return aClass129_656;
    }
    
    public void method1228(int i) {
	method1169(i, 255, -922262107);
    }
    
    public void method1229(int i, int i_126_) {
	method1170(i, i_126_, false, 0, 0, 0, 0, 0, -1431035457);
    }
    
    Class221 method1230() {
	Iterator<Class221> iterator = aList651.iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    if (class221.method4402((byte) -89) == Class112.aClass112_1524
		&& class221.method4398(-2017802324) == Class223.aClass223_2597)
		return class221;
	}
	return null;
    }
    
    public void method1231(Class221 class221, int i, int i_127_, int i_128_) {
	if (class221 != null) {
	    Class113 class113
		= ((Class113)
		   aHashMap660.get(Integer.valueOf(i)));
	    if (class113 == null) {
		class113 = new Class113(this);
		aHashMap660.put(Integer.valueOf(i), class113);
	    }
	    if (!class113.method2791(class221, 2122281920)) {
		class221.method4413(i_127_, true, (byte) 57);
		class113.method2782(class221, (byte) 8);
	    }
	}
    }
    
    public void method1232() {
	Iterator<Class221> iterator = aList651.iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    if (class221.method4402((byte) -73) == Class112.aClass112_1524) {
		class221.method4405(500, -545389344);
		if (class221.method4418((byte) 97).method408((byte) 1)
		    == -1330999365 * anInt661) {
		    method1167(anInt661 * -1330999365,
			       -1853388341);
		    break;
		}
	    }
	}
	aClass221_662 = null;
	anInt661 = 90710669;
    }
    
    public void method1233(AnimationDefinition class549, int i,
			   Class475_Sub1 class475_sub1, byte i_129_) {
	if (null != class549 && null != class549.handledSounds
	    && i < class549.handledSounds.length
	    && null != class549.handledSounds[i]
	    && (Class21.myPlayer.nodePlane
		== class475_sub1.nodePlane)
	    && class475_sub1.method14461(-945531897)) {
	    int i_130_ = class549.handledSounds[i][0];
	    int i_131_ = i_130_ >> 8;
	    int i_132_ = i_130_ >> 5 & 0x7;
	    int i_133_ = i_130_ & 0x1f;
	    if (class549.handledSounds[i].length > 1) {
		int i_134_ = (int) (Math.random()
				    * (double) (class549.handledSounds
						[i]).length);
		if (i_134_ > 0)
		    i_131_ = class549.handledSounds[i][i_134_];
	    }
	    int i_135_ = 256;
	    if (class549.soundMaxDelay != null
		&& class549.soundMinDelay != null)
		i_135_ = ((int) (Math.random()
				 * (double) (class549.soundMinDelay[i]
					     - class549.soundMaxDelay[i]))
			  + class549.soundMaxDelay[i]);
	    int i_136_ = (class549.anIntArray7085 == null ? 255
			  : class549.anIntArray7085[i]);
	    if (i_133_ == 0) {
		if (Class21.myPlayer == class475_sub1)
		    method1162(Class112.aClass112_1519, i_131_, i_132_, i_136_,
			       Class130.aClass130_1598.method3067(-960497231),
			       Class127.aClass127_1587, 0.0F, 0.0F, null,
			       class475_sub1.nodePlane, i_135_, 0, 76517532);
	    } else {
		if (class475_sub1
		    == Class21.myPlayer) {
		    if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8872.method14143(1896174332)
			== 0)
			return;
		} else if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			       .aClass445_Sub6_8888.method14143(2045008620)
			   == 0)
		    return;
		if (-1 != 527630809 * class549.anInt7086) {
		    int i_137_ = 0;
		    if (class475_sub1 instanceof Entity)
			i_137_ = ((Entity) class475_sub1)
				     .method17832(1654128885);
		    else if (class475_sub1 instanceof Class475_Sub1_Sub1_Sub5)
			i_137_ = ((Class475_Sub1_Sub1_Sub5) class475_sub1)
				     .method17934((byte) 36);
		    else if (class475_sub1 instanceof Projectile)
			i_137_ = ((Projectile) class475_sub1)
				     .method17886(-1300876160);
		    if (0 != i_137_
			&& i_137_ != Class21
					 .myPlayer
					 .method17832(1913065068)
			&& 1145412023 * client.anInt8316 != i_137_) {
			i_136_ = 527630809 * class549.anInt7086 * i_136_ / 100;
			if (i_136_ < 0)
			    i_136_ = 0;
			else if (i_136_ > 255)
			    i_136_ = 255;
		    }
		}
		Class287 class287 = class475_sub1.method10874().aClass287_4386;
		int i_138_ = (int) class287.aFloat4477 - 256 >> 9;
		int i_139_ = (int) class287.aFloat4479 - 256 >> 9;
		Class287 class287_140_
		    = new Class287((float) (i_138_ << 9), 0.0F,
				   (float) (i_139_ << 9));
		int i_141_ = class475_sub1.nodePlane << 24;
		method1162(Class112.aClass112_1520, i_131_, i_132_, i_136_,
			   Class130.aClass130_1605.method3067(-960497231),
			   ((Class21.myPlayer
			     != class475_sub1)
			    ? Class127.aClass127_1584
			    : Class127.aClass127_1587),
			   0.0F, (float) (i_133_ << 9), class287_140_, i_141_,
			   i_135_, 0, -1460026118);
	    }
	}
    }
    
    public void method1234(AnimationDefinition class549, int i) {
	if (class549 != null && class549.handledSounds != null
	    && i < class549.handledSounds.length
	    && class549.handledSounds[i] != null) {
	    int i_142_ = class549.handledSounds[i][0];
	    int i_143_ = i_142_ >> 8;
	    int i_144_ = i_142_ >> 5 & 0x7;
	    if (class549.handledSounds[i].length > 1) {
		int i_145_ = (int) (Math.random()
				    * (double) (class549.handledSounds
						[i]).length);
		if (i_145_ > 0)
		    i_143_ = class549.handledSounds[i][i_145_];
	    }
	    int i_146_ = 256;
	    if (null != class549.soundMaxDelay
		&& null != class549.soundMinDelay)
		i_146_ = (int) ((double) class549.soundMaxDelay[i]
				+ (Math.random()
				   * (double) (class549.soundMinDelay[i]
					       - class549.soundMaxDelay[i])));
	    int i_147_ = (null == class549.anIntArray7085 ? 255
			  : class549.anIntArray7085[i]);
	    method1162(Class112.aClass112_1523, i_143_, i_144_, i_147_,
		       Class130.aClass130_1605.method3067(-960497231),
		       Class127.aClass127_1587, 0.0F, 0.0F, null, 0, i_146_, 0,
		       -711639017);
	}
    }
    
    public void method1235(int i) {
	if (initialised) {
	    Class445_Sub15.method14246(-1913087612);
	    if (null != Class21.myPlayer
		&& (Class21.myPlayer.method10874()
		    != null)) {
		if (null == aClass287_653)
		    aClass287_653 = new Class287();
		aClass287_653.aFloat4477
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386.aFloat4477);
		aClass287_653.aFloat4474 = 0.0F;
		aClass287_653.aFloat4479
		    = (Class21.myPlayer.method10874()
		       .aClass287_4386.aFloat4479);
	    }
	    Iterator<Object> iterator
		= aHashMap646.values().iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		interface52.method191(-282135701);
	    }
	    iterator = aHashMap645.values().iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		interface52.method191(-1979343867);
	    }
	    iterator = aList654.iterator();
	    while (iterator.hasNext()) {
		Interface52 interface52 = (Interface52) iterator.next();
		if (interface52.method414(-1348702248))
		    aHashMap645.remove
			(Integer.valueOf(interface52.method408((byte) 1)));
		else
		    aHashMap646.remove
			(Integer.valueOf(interface52.method408((byte) 1)));
	    }
	    aList654.clear();
	    if (aClass221_663 != null
		&& (aClass221_663.method4398(-2053531157)
		    == Class223.aClass223_2593)
		&& !aBool664
		&& client.aClass190_8340.packetCipher != null
		&& Class120_Sub1.method15109(1766317249 * client.anInt8288,
					     30333477)) {
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4061,
						 (client.aClass190_8340
						  .packetCipher),
						 16711935);
		class241_sub27.data.writeInt
		    (aClass221_663.method4418((byte) 41)
			 .method408((byte) 1),
		     -1020461780);
		client.aClass190_8340.sendPacket(class241_sub27, -1993690526);
		aBool664 = true;
	    }
	    iterator = aList659.iterator();
	    while (iterator.hasNext()) {
		Class221 class221 = (Class221) iterator.next();
		class221.method4415(413351334);
		class221.method4397(-801494010);
		Class223 class223 = class221.method4398(-1995203353);
		if (class221.method4400(-2142405985) == this) {
		    if (Class223.aClass223_2596 == class223
			|| Class223.aClass223_2600 == class223) {
			if ((class221.method4402((byte) -36)
			     == Class112.aClass112_1524)
			    || (class221.method4402((byte) -84)
				== Class112.aClass112_1525)) {
			    if (class221 == aClass221_663) {
				aBool664 = false;
				aClass221_663 = null;
				class221.method4390(1014849212);
				aList651.remove(class221);
			    } else {
				int i_148_ = class221.method4418((byte) 37)
						 .method408((byte) 1);
				boolean bool
				    = (method1179(Class130.aClass130_1596
						      .method3067(-960497231),
						  (byte) 32)
				       > 0.0F);
				if (!aBool671 && bool) {
				    if (i_148_
					== (-1330999365
					    * anInt661)) {
					method1167(i_148_, -1768006246);
					anInt661 = 90710669;
				    }
				    class221.method4390(1193926812);
				    aList651.remove(class221);
				} else if ((anInt666
					    * 172131871)
					   == i_148_) {
				    anInt666 = -891254239;
				    aBool671 = false;
				    class221.method4390(1258531101);
				    aList651.remove(class221);
				    Iterator<Object> iterator_149_
					= aList659.iterator();
				    while (iterator_149_.hasNext()) {
					Class221 class221_150_
					    = (Class221) iterator_149_.next();
					if (class221_150_
						.method4402((byte) -96)
					    == Class112.aClass112_1524) {
					    int i_151_
						= class221_150_.method4418
						      ((byte) 35)
						      .method408((byte) 1);
					    if (((anInt661
						  * -1330999365) == i_151_
						 && ((class221_150_.method4398
						      (-2102882016))
						     == (Class223
							 .aClass223_2596)))
						|| ((class221_150_.method4398
						     (-1916731490))
						    == Class223.aClass223_2594)
						|| ((class221_150_.method4398
						     (-1980024688))
						    == Class223.aClass223_2595)
						|| ((class221_150_.method4398
						     (-2002021012))
						    == (Class223
							.aClass223_2593))) {
						if ((class221_150_.method4398
						     (-1899507228))
						    == Class223.aClass223_2596)
						    class221_150_
							.method4395((byte) 0);
						else
						    class221_150_
							.method4392(841173710);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (false == aBool671
					|| i_148_ != (anInt661
						      * -1330999365)) {
					class221.method4390(1019700825);
					aList651
					    .remove(class221);
				    }
				    if (false == aBool671
					&& (anInt661
					    * -1330999365) == i_148_) {
					anInt661 = 90710669;
					aClass221_662 = null;
				    }
				}
			    }
			} else {
			    Iterator<Integer> iterator_152_
				= aHashMap660.keySet()
				      .iterator();
			    while (iterator_152_.hasNext()) {
				int i_153_ = ((Integer) iterator_152_.next())
						 .intValue();
				Class113 class113
				    = ((Class113)
				       aHashMap660
					   .get(Integer.valueOf(i_153_)));
				if (class113.method2784(1163001070)
					.contains(class221)) {
				    class113.method2783(class221, 1001723543);
				    break;
				}
			    }
			    class221.method4390(1633229242);
			    aList651.remove(class221);
			}
		    } else if ((class221.method4398(-1825849298)
				!= Class223.aClass223_2598)
			       && (class221.method4403((byte) -36)
				   == Class130.aClass130_1596
					  .method3067(-960497231))) {
			boolean bool = (method1179(Class130.aClass130_1596
						       .method3067(-960497231),
						   (byte) -103)
					> 1.0E-4F);
			if (!bool)
			    class221.method4405(150, -539922916);
		    }
		}
	    }
	}
    }
    
    List<Object> method1236() {
	return aList654;
    }
    
    public void method1237(AnimationDefinition class549, int i,
			   Class475_Sub1 class475_sub1) {
	if (null != class549 && null != class549.handledSounds
	    && i < class549.handledSounds.length
	    && null != class549.handledSounds[i]
	    && (Class21.myPlayer.nodePlane
		== class475_sub1.nodePlane)
	    && class475_sub1.method14461(-885972445)) {
	    int i_154_ = class549.handledSounds[i][0];
	    int i_155_ = i_154_ >> 8;
	    int i_156_ = i_154_ >> 5 & 0x7;
	    int i_157_ = i_154_ & 0x1f;
	    if (class549.handledSounds[i].length > 1) {
		int i_158_ = (int) (Math.random()
				    * (double) (class549.handledSounds
						[i]).length);
		if (i_158_ > 0)
		    i_155_ = class549.handledSounds[i][i_158_];
	    }
	    int i_159_ = 256;
	    if (class549.soundMaxDelay != null
		&& class549.soundMinDelay != null)
		i_159_ = ((int) (Math.random()
				 * (double) (class549.soundMinDelay[i]
					     - class549.soundMaxDelay[i]))
			  + class549.soundMaxDelay[i]);
	    int i_160_ = (class549.anIntArray7085 == null ? 255
			  : class549.anIntArray7085[i]);
	    if (i_157_ == 0) {
		if (Class21.myPlayer == class475_sub1)
		    method1162(Class112.aClass112_1519, i_155_, i_156_, i_160_,
			       Class130.aClass130_1598.method3067(-960497231),
			       Class127.aClass127_1587, 0.0F, 0.0F, null,
			       class475_sub1.nodePlane, i_159_, 0, 2107500012);
	    } else {
		if (class475_sub1
		    == Class21.myPlayer) {
		    if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8872.method14143(1969283087)
			== 0)
			return;
		} else if (Class241_Sub5_Sub9.aClass241_Sub9_11043
			       .aClass445_Sub6_8888.method14143(2047299345)
			   == 0)
		    return;
		if (-1 != 527630809 * class549.anInt7086) {
		    int i_161_ = 0;
		    if (class475_sub1 instanceof Entity)
			i_161_ = ((Entity) class475_sub1)
				     .method17832(658378045);
		    else if (class475_sub1 instanceof Class475_Sub1_Sub1_Sub5)
			i_161_ = ((Class475_Sub1_Sub1_Sub5) class475_sub1)
				     .method17934((byte) 56);
		    else if (class475_sub1 instanceof Projectile)
			i_161_ = ((Projectile) class475_sub1)
				     .method17886(163169637);
		    if (0 != i_161_
			&& i_161_ != Class21
					 .myPlayer
					 .method17832(1474327143)
			&& 1145412023 * client.anInt8316 != i_161_) {
			i_160_ = 527630809 * class549.anInt7086 * i_160_ / 100;
			if (i_160_ < 0)
			    i_160_ = 0;
			else if (i_160_ > 255)
			    i_160_ = 255;
		    }
		}
		Class287 class287 = class475_sub1.method10874().aClass287_4386;
		int i_162_ = (int) class287.aFloat4477 - 256 >> 9;
		int i_163_ = (int) class287.aFloat4479 - 256 >> 9;
		Class287 class287_164_
		    = new Class287((float) (i_162_ << 9), 0.0F,
				   (float) (i_163_ << 9));
		int i_165_ = class475_sub1.nodePlane << 24;
		method1162(Class112.aClass112_1520, i_155_, i_156_, i_160_,
			   Class130.aClass130_1605.method3067(-960497231),
			   ((Class21.myPlayer
			     != class475_sub1)
			    ? Class127.aClass127_1584
			    : Class127.aClass127_1587),
			   0.0F, (float) (i_157_ << 9), class287_164_, i_165_,
			   i_159_, 0, -772244153);
	    }
	}
    }
    
    public void method1238(AnimationDefinition class549, int i) {
	if (class549 != null && class549.handledSounds != null
	    && i < class549.handledSounds.length
	    && class549.handledSounds[i] != null) {
	    int i_166_ = class549.handledSounds[i][0];
	    int i_167_ = i_166_ >> 8;
	    int i_168_ = i_166_ >> 5 & 0x7;
	    if (class549.handledSounds[i].length > 1) {
		int i_169_ = (int) (Math.random()
				    * (double) (class549.handledSounds
						[i]).length);
		if (i_169_ > 0)
		    i_167_ = class549.handledSounds[i][i_169_];
	    }
	    int i_170_ = 256;
	    if (null != class549.soundMaxDelay
		&& null != class549.soundMinDelay)
		i_170_ = (int) ((double) class549.soundMaxDelay[i]
				+ (Math.random()
				   * (double) (class549.soundMinDelay[i]
					       - class549.soundMaxDelay[i])));
	    int i_171_ = (null == class549.anIntArray7085 ? 255
			  : class549.anIntArray7085[i]);
	    method1162(Class112.aClass112_1523, i_167_, i_168_, i_171_,
		       Class130.aClass130_1605.method3067(-960497231),
		       Class127.aClass127_1587, 0.0F, 0.0F, null, 0, i_170_, 0,
		       1804220757);
	}
    }
    
    void method1239(int[] is) {
	if (initialised && null != is) {
	    int[] is_172_ = is;
	    for (int i = 0; i < is_172_.length; i++) {
		int i_173_ = is_172_[i];
		method1155(i_173_, (byte) 8);
	    }
	}
    }
    
    public void method1240(AnimationDefinition class549, int i) {
	if (class549 != null && class549.handledSounds != null
	    && i < class549.handledSounds.length
	    && class549.handledSounds[i] != null) {
	    int i_174_ = class549.handledSounds[i][0];
	    int i_175_ = i_174_ >> 8;
	    int i_176_ = i_174_ >> 5 & 0x7;
	    if (class549.handledSounds[i].length > 1) {
		int i_177_ = (int) (Math.random()
				    * (double) (class549.handledSounds
						[i]).length);
		if (i_177_ > 0)
		    i_175_ = class549.handledSounds[i][i_177_];
	    }
	    int i_178_ = 256;
	    if (null != class549.soundMaxDelay
		&& null != class549.soundMinDelay)
		i_178_ = (int) ((double) class549.soundMaxDelay[i]
				+ (Math.random()
				   * (double) (class549.soundMinDelay[i]
					       - class549.soundMaxDelay[i])));
	    int i_179_ = (null == class549.anIntArray7085 ? 255
			  : class549.anIntArray7085[i]);
	    method1162(Class112.aClass112_1523, i_175_, i_176_, i_179_,
		       Class130.aClass130_1605.method3067(-960497231),
		       Class127.aClass127_1587, 0.0F, 0.0F, null, 0, i_178_, 0,
		       836629838);
	}
    }
    
    public static final void method1241(int i) {
	Class124.aClass593_1580.method12928((byte) 1);
	for (int i_180_ = 0; i_180_ < 32; i_180_++)
	    GameShell3.aLongArray7637[i_180_] = 0L;
	for (int i_181_ = 0; i_181_ < 32; i_181_++)
	    GameShell3.aLongArray7667[i_181_] = 0L;
	GameShell3.anInt7649 = 0;
    }
    
    static final void method1242(ClientScriptData class454, int i) {
	int i_182_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_182_, (byte) -29);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_182_ >> 16];
	Class595.method13078(class58, class35, class454, 949366554);
    }
    
    static final void method1243(ClientScriptData class454, int i) {
	int i_183_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_184_ = client.aClass220Array8426[i_183_].method4383((byte) 0);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0 == i_184_ ? 1 : 0;
    }
    
    static final void method1244(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = ((Class445_Sub16.aClass351_Sub1_8660.method6356(-1591317356)
		== null)
	       ? -1
	       : (Class445_Sub16.aClass351_Sub1_8660.method6356(-1180827054)
		  .anInt1026) * 107084319);
    }
    
    static final void method1245(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	ServerConnection class190 = ClanChannelDelta.method6943(-1291168313);
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4078,
					 class190.packetCipher, 16711935);
	class241_sub27.data.writeByte(0, -52347155);
	int i_185_
	    = class241_sub27.data.pointer * 421967667;
	class241_sub27.data.writeString(string,
							    -927942232);
	class241_sub27.data.writeShort
	    (((ClientScriptData) class454).aClass333_6242.anInt5058 * -1422545021,
	     -484048531);
	((ClientScriptData) class454).aClass333_6242.aClass241_Sub39_Sub9_5059
	    .method17176
	    (class241_sub27.data,
	     ((ClientScriptData) class454).aClass333_6242.anIntArray5060, 56142522);
	class241_sub27.data.endPacketVarByte
	    ((class241_sub27.data.pointer * 421967667
	      - i_185_),
	     1209805977);
	class190.sendPacket(class241_sub27, -1835286856);
    }
    
    public static int method1246(int i, int i_186_, boolean bool, int i_187_) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -1640455222);
	if (null == class241_sub34)
	    return -1;
	if (i_186_ < 0 || i_186_ >= (((Class241_Sub34) class241_sub34)
				     .anIntArray10085).length)
	    return -1;
	return ((Class241_Sub34) class241_sub34).anIntArray10085[i_186_];
    }
    
    static boolean method1247(int i) {
	if (client.aByteArray8273 != null)
	    return Class483.method11047(-1765135148);
	if (Class13.anInt81 * 1391949991 != -1)
	    return Class459.method10604(-2134521118);
	return Class326.method6006(Class13.aString112, Class13.aString113,
				   -1111230476);
    }
}
