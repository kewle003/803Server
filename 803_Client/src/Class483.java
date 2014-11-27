/* Class483 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Class483
{
    static Class393 aClass393_6461 = null;
    public static int anInt6462;
    
    public static void method11027(Class493 class493) {
	if (Class388.aClass388_5718 == ((Class493) class493).aClass388_6517)
	    aClass393_6461 = new Class393_Sub2(class493);
	else if (Class388.aClass388_5717
		 == ((Class493) class493).aClass388_6517)
	    aClass393_6461 = new Class393_Sub1(class493);
	else
	    throw new RuntimeException();
    }
    
    public static void method11028(Class493 class493) {
	if (Class388.aClass388_5718 == ((Class493) class493).aClass388_6517)
	    aClass393_6461 = new Class393_Sub2(class493);
	else if (Class388.aClass388_5717
		 == ((Class493) class493).aClass388_6517)
	    aClass393_6461 = new Class393_Sub1(class493);
	else
	    throw new RuntimeException();
    }
    
    Class483() throws Throwable {
	throw new Error();
    }
    
    public static Interface52 method11029(JS5 class210, int i,
					  Interface53 interface53,
					  boolean bool, Class129 class129) {
	if (null != aClass393_6461) {
	    if (bool)
		return new Class506(class210, i, aClass393_6461, interface53);
	    return new Class520(class210, i, aClass393_6461, interface53,
				class129);
	}
	return null;
    }
    
    public static void method11030() {
	if (null != aClass393_6461)
	    aClass393_6461.method7045(-1979274512);
    }
    
    public static void method11031() {
	if (null != aClass393_6461)
	    aClass393_6461.method7045(-409865953);
    }
    
    public static void method11032(Class493 class493) {
	if (Class388.aClass388_5718 == ((Class493) class493).aClass388_6517)
	    aClass393_6461 = new Class393_Sub2(class493);
	else if (Class388.aClass388_5717
		 == ((Class493) class493).aClass388_6517)
	    aClass393_6461 = new Class393_Sub1(class493);
	else
	    throw new RuntimeException();
    }
    
    public static Interface52 method11033(JS5 class210, int i,
					  Interface53 interface53,
					  boolean bool, Class129 class129) {
	if (null != aClass393_6461) {
	    if (bool)
		return new Class506(class210, i, aClass393_6461, interface53);
	    return new Class520(class210, i, aClass393_6461, interface53,
				class129);
	}
	return null;
    }
    
    public static Interface52 method11034(JS5 class210, int i,
					  Interface53 interface53,
					  boolean bool, Class129 class129) {
	if (null != aClass393_6461) {
	    if (bool)
		return new Class506(class210, i, aClass393_6461, interface53);
	    return new Class520(class210, i, aClass393_6461, interface53,
				class129);
	}
	return null;
    }
    
    public static Interface52 method11035(JS5 class210, int i,
					  Interface53 interface53,
					  boolean bool, Class129 class129) {
	if (null != aClass393_6461) {
	    if (bool)
		return new Class506(class210, i, aClass393_6461, interface53);
	    return new Class520(class210, i, aClass393_6461, interface53,
				class129);
	}
	return null;
    }
    
    public static void method11036(int i, int i_0_, float f,
				   Interface29 interface29) {
	if (aClass393_6461 != null)
	    aClass393_6461.method7032(1679891843)
		.method5857(i, i_0_, f, interface29, -1922389630);
    }
    
    public static void method11037(int i, int i_1_, float f,
				   Interface29 interface29) {
	if (aClass393_6461 != null)
	    aClass393_6461.method7032(-302329854)
		.method5857(i, i_1_, f, interface29, -1916902947);
    }
    
    public static void method11038(int i, int i_2_, float f,
				   Interface29 interface29) {
	if (aClass393_6461 != null)
	    aClass393_6461.method7032(1374085765)
		.method5857(i, i_2_, f, interface29, -1526262073);
    }
    
    public static Class322 method11039(int i) {
	if (null != aClass393_6461)
	    return aClass393_6461.method7032(87584043).method5858(i, (byte) 0);
	return null;
    }
    
    public static Class322 method11040(int i) {
	if (null != aClass393_6461)
	    return aClass393_6461.method7032(2001008499).method5858(i,
								    (byte) 0);
	return null;
    }
    
    public static Class322 method11041(int i) {
	if (null != aClass393_6461)
	    return aClass393_6461.method7032(-232174248).method5858(i,
								    (byte) 0);
	return null;
    }
    
    public static boolean method11042(int i, int i_3_) {
	if (null == aClass393_6461
	    || aClass393_6461.method7032(2007037809) == null)
	    return false;
	if (i == i_3_)
	    return true;
	Class322 class322
	    = aClass393_6461.method7032(-618544680).method5858(i, (byte) 0);
	Class322 class322_4_
	    = aClass393_6461.method7032(-530626335).method5858(i_3_, (byte) 0);
	Class322 class322_5_ = class322;
    while_73_:
	do {
	    do {
		if (null == class322_5_)
		    break while_73_;
		class322_5_ = class322_5_.method5939(740581295);
		if (class322_4_ == class322_5_)
		    return true;
	    } while (class322 != class322_5_);
	    return false;
	} while (false);
	class322_5_ = class322_4_;
    while_74_:
	do {
	    do {
		if (null == class322_5_)
		    break while_74_;
		class322_5_ = class322_5_.method5939(-320612671);
		if (class322 == class322_5_)
		    return true;
	    } while (class322_5_ != class322_4_);
	    return false;
	} while (false);
	return false;
    }
    
    static final void method11043(ClientScriptData class454, int i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_6_, (byte) -86);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_6_ >> 16];
	Class519.method11671(class58, class35, class454, (byte) -124);
    }
    
    static final void method11044(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class109.method2767(string, 1 == i_7_, -1991714150);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 678860917 * Class120_Sub16.anInt10563;
    }
    
    static void readFile/*method11045*/(File file, byte[] output, int length, int i_8_) throws IOException {
		DataInputStream datainputstream
		    = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		try {
		    datainputstream.readFully(output, 0, length);
		} catch (EOFException eofexception) {
		    /* empty */
		}
		datainputstream.close();
    }
    
    static final void method11046(int i) {
	for (Class241_Sub39_Sub16 class241_sub39_sub16
		 = ((Class241_Sub39_Sub16)
		    client.aClass429_8478.method7694(16711935));
	     null != class241_sub39_sub16;
	     class241_sub39_sub16
		 = ((Class241_Sub39_Sub16)
		    client.aClass429_8478.method7692(302550099))) {
	    Projectile class475_sub1_sub1_sub4
		= (((Class241_Sub39_Sub16) class241_sub39_sub16)
		   .aClass475_Sub1_Sub1_Sub4_10971);
	    if (client.anInt8296
		> class475_sub1_sub1_sub4.anInt11454 * 170167489) {
		class241_sub39_sub16.remove((byte) 36);
		class475_sub1_sub1_sub4.method17892(903312852);
	    } else if (client.anInt8296
		       >= class475_sub1_sub1_sub4.anInt11457 * -288317437) {
		class475_sub1_sub1_sub4.method17888(-369655920);
		if (-213929309 * class475_sub1_sub1_sub4.anInt11473 > 0) {
		    if (client.anInt8266 * -831877317 == 4) {
			Entity class475_sub1_sub1_sub3
			    = Class25.aClass93Array213
				  [(class475_sub1_sub1_sub4.anInt11473
				    * -213929309) - 1]
				  .method2083(-1332275351);
			if (null != class475_sub1_sub1_sub3) {
			    Class287 class287
				= (class475_sub1_sub1_sub3.method10874()
				   .aClass287_4386);
			    if ((int) class287.aFloat4477 >= 0
				&& ((int) class287.aFloat4477
				    < client.aClass238_8477
					  .method4744(-1641720927) * 512)
				&& (int) class287.aFloat4479 >= 0
				&& ((int) class287.aFloat4479
				    < client.aClass238_8477
					  .method4745(-292877617) * 512))
				class475_sub1_sub1_sub4.method17887
				    ((int) class287.aFloat4477,
				     (int) class287.aFloat4479,
				     ((Class96_Sub5.method16046
				       ((int) class287.aFloat4477,
					(int) class287.aFloat4479,
					class475_sub1_sub1_sub3.nodePlane,
					1429066711))
				      - (class475_sub1_sub1_sub4.anInt11456
					 * -1518003433)),
				     client.anInt8296, -1294098703);
			}
		    } else {
			ObjectNode class241_sub26
			    = ((ObjectNode)
			       (client.aClass407_8457.get
				((long) ((-213929309
					  * class475_sub1_sub1_sub4.anInt11473)
					 - 1))));
			if (null != class241_sub26) {
			    NPC class475_sub1_sub1_sub3_sub2
				= ((NPC)
				   class241_sub26.objectValue);
			    Class287 class287
				= (class475_sub1_sub1_sub3_sub2.method10874()
				   .aClass287_4386);
			    if ((int) class287.aFloat4477 >= 0
				&& ((int) class287.aFloat4477
				    < client.aClass238_8477
					  .method4744(-1662066974) * 512)
				&& (int) class287.aFloat4479 >= 0
				&& ((int) class287.aFloat4479
				    < client.aClass238_8477
					  .method4745(-617322169) * 512))
				class475_sub1_sub1_sub4.method17887
				    ((int) class287.aFloat4477,
				     (int) class287.aFloat4479,
				     ((Class96_Sub5.method16046
				       ((int) class287.aFloat4477,
					(int) class287.aFloat4479,
					class475_sub1_sub1_sub4.nodePlane,
					1183556512))
				      - -1518003433 * (class475_sub1_sub1_sub4
						       .anInt11456)),
				     client.anInt8296, 1663394502);
			}
		    }
		}
		if (-213929309 * class475_sub1_sub1_sub4.anInt11473 < 0) {
		    int i_9_
			= (-(class475_sub1_sub1_sub4.anInt11473 * -213929309)
			   - 1);
		    Player class475_sub1_sub1_sub3_sub1;
		    if (i_9_ == 1124115145 * client.myPlayerIndex)
			class475_sub1_sub1_sub3_sub1
			    = Class21.myPlayer;
		    else
			class475_sub1_sub1_sub3_sub1
			    = (client.localPlayers
			       [i_9_]);
		    if (null != class475_sub1_sub1_sub3_sub1) {
			Class287 class287
			    = (class475_sub1_sub1_sub3_sub1.method10874()
			       .aClass287_4386);
			if ((int) class287.aFloat4477 >= 0
			    && ((int) class287.aFloat4477
				< client.aClass238_8477
				      .method4744(-1852583489) * 512)
			    && (int) class287.aFloat4479 >= 0
			    && ((int) class287.aFloat4479
				< client.aClass238_8477
				      .method4745(-1387808766) * 512))
			    class475_sub1_sub1_sub4.method17887
				((int) class287.aFloat4477,
				 (int) class287.aFloat4479,
				 ((Class96_Sub5.method16046
				   ((int) class287.aFloat4477,
				    (int) class287.aFloat4479,
				    class475_sub1_sub1_sub4.nodePlane,
				    1523044318))
				  - (class475_sub1_sub1_sub4.anInt11456
				     * -1518003433)),
				 client.anInt8296, -1757252413);
		    }
		}
		class475_sub1_sub1_sub4
		    .method17889(client.anInt8515 * -2083513279, -952719052);
		client.aClass238_8477.method4751(-995714392)
		    .method12225(class475_sub1_sub1_sub4, true, -495802808);
	    }
	}
    }
    
    static boolean method11047(int i) {
	Class13.anInt77 = 78183201;
	Exception_Sub5.aClass190_10704 = client.aClass190_8340;
	if (client.aByteArray8273 != null) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(client.aByteArray8273);
	    Class13.aLong82 = (class241_sub3.readLong((short) 25139)
			       * -7226492194362182485L);
	    Class13.aLong111 = (class241_sub3.readLong((short) 10128)
				* 4049046998799193519L);
	}
	if (Class13.aLong82 * -3469600135743429117L < 0L) {
	    Class175.setLoginResponse(35, -1454382476);
	    return false;
	}
	return CcDeltaNode.method15095(false, true, "", "",
					  (-3469600135743429117L
					   * Class13.aLong82));
    }
    
    static final void setVarcompClanSettingsUpdateEvent/*method11048*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class20.setClanSettingsUpdateEvent(component, iFace, scriptData, 1961313467);
    }
}
