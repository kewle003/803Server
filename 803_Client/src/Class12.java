/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

final class Class12 implements Interface26
{
    static String osNameRaw;//aString73
    public static Clipboard aClipboard74;
    
    public Object method165(byte[] is, Class639 class639, boolean bool) {
	return Class236.aClass103_2713
		   .method2296(class639, Class160.method3443(is), bool);
    }
    
    public Object method168(byte[] is, Class639 class639, boolean bool,
			    int i) {
	return Class236.aClass103_2713
		   .method2296(class639, Class160.method3443(is), bool);
    }
    
    public Object method167(byte[] is, Class639 class639, boolean bool) {
	return Class236.aClass103_2713
		   .method2296(class639, Class160.method3443(is), bool);
    }
    
    public Object method166(byte[] is, Class639 class639, boolean bool) {
	return Class236.aClass103_2713
		   .method2296(class639, Class160.method3443(is), bool);
    }
    
    static void method601(int i, int i_0_, InterfaceComponent class58, Class135 class135,
			  int i_1_, int i_2_, int i_3_) {
	int i_4_ = GPI.viewportPlayerCount * 794073197;
	int[] is = GPI.viewportPlayerIndicies;
	for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[is[i_5_]];
	    if (class475_sub1_sub1_sub3_sub1 != null
		&& class475_sub1_sub1_sub3_sub1.method17963(-16190942)
		&& !class475_sub1_sub1_sub3_sub1.hidden
		&& (class475_sub1_sub1_sub3_sub1
		    != Class21.myPlayer)
		&& (class475_sub1_sub1_sub3_sub1.nodePlane
		    == Class21.myPlayer.nodePlane)) {
		Class287 class287 = (class475_sub1_sub1_sub3_sub1.method10874()
				     .aClass287_4386);
		int i_6_ = (int) class287.aFloat4477 / 128 - i / 128;
		int i_7_ = (int) class287.aFloat4479 / 128 - i_0_ / 128;
		boolean bool = false;
		for (int i_8_ = 0; i_8_ < 1557840217 * client.friendListSize;
		     i_8_++) {
		    Friend class18 = client.friendList[i_8_];
		    if (class475_sub1_sub1_sub3_sub1.nameUnfiltered
			    .equals(class18.currentName)
			&& 1337402161 * class18.serverNodeID != 0) {
			bool = true;
			break;
		    }
		}
		boolean bool_9_ = false;
		for (int i_10_ = 0;
		     i_10_ < -612332369 * Class357_Sub1.currentFcSize; i_10_++) {
		    if (class475_sub1_sub1_sub3_sub1.nameUnfiltered.equals
			(Class350.currentFcUsers[i_10_].replyToName)) {
			bool_9_ = true;
			break;
		    }
		}
		boolean bool_11_ = false;
		if (-786517937 * (Class21.myPlayer
				  .anInt11495) != 0
		    && 0 != (class475_sub1_sub1_sub3_sub1.anInt11495
			     * -786517937)
		    && (class475_sub1_sub1_sub3_sub1.anInt11495 * -786517937
			== (Class21.myPlayer
			    .anInt11495) * -786517937))
		    bool_11_ = true;
		if ((class475_sub1_sub1_sub3_sub1.aClass490_11499.anInt6508
		     * -614581637) != -1
		    && (MasterIndex.npcDefLoader.getNpcDefinition
			((class475_sub1_sub1_sub3_sub1.aClass490_11499
			  .anInt6508) * -614581637,
			 -1454708763)
			.aBool5871))
		    Class1.method452(class58, class135, i_1_, i_2_, i_6_, i_7_,
				     HitMarkTypeList.aClass168Array7251[1],
				     -250043724);
		else if (class475_sub1_sub1_sub3_sub1.aBool11496)
		    Class1.method452(class58, class135, i_1_, i_2_, i_6_, i_7_,
				     HitMarkTypeList.aClass168Array7251[6],
				     1253542097);
		else if (bool_11_)
		    Class1.method452(class58, class135, i_1_, i_2_, i_6_, i_7_,
				     HitMarkTypeList.aClass168Array7251[4],
				     441101270);
		else if (class475_sub1_sub1_sub3_sub1.aBool11494)
		    Class1.method452(class58, class135, i_1_, i_2_, i_6_, i_7_,
				     HitMarkTypeList.aClass168Array7251[7],
				     1593919593);
		else if (bool)
		    Class1.method452(class58, class135, i_1_, i_2_, i_6_, i_7_,
				     HitMarkTypeList.aClass168Array7251[3],
				     652053113);
		else if (bool_9_)
		    Class1.method452(class58, class135, i_1_, i_2_, i_6_, i_7_,
				     HitMarkTypeList.aClass168Array7251[5],
				     976317224);
		else
		    Class1.method452(class58, class135, i_1_, i_2_, i_6_, i_7_,
				     HitMarkTypeList.aClass168Array7251[2],
				     431172569);
	    }
	}
    }
    
    static void method602(int i) {
	if (Class185.anInt2176 * -1737125585 < 102)
	    Class185.anInt2176 += 457179866;
	if (1493885091 * Class185.anInt2186 != -1
	    && (5557026218420413729L * AnimationConfig.aLong7015
		< Class50.method1249((byte) 1))) {
	    for (int i_12_ = 1493885091 * Class185.anInt2186;
		 i_12_ < Class105_Sub1_Sub3.aStringArray11135.length;
		 i_12_++) {
		if (Class105_Sub1_Sub3.aStringArray11135[i_12_]
			.startsWith("pause")) {
		    int i_13_ = 5;
		    try {
			i_13_ = Integer.parseInt(Class105_Sub1_Sub3
						     .aStringArray11135[i_12_]
						     .substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class21.addline(new StringBuilder().append
					  ("Pausing for ").append
					  (i_13_).append
					  (" seconds...").toString(),
				      (byte) 85);
		    Class185.anInt2186 = 288805643 * (i_12_ + 1);
		    AnimationConfig.aLong7015
			= (Class50.method1249((byte) 1)
			   + (long) (i_13_ * 1000)) * -8901969350305866015L;
		    return;
		}
		Class185.aString2181
		    = Class105_Sub1_Sub3.aStringArray11135[i_12_];
		Class120_Sub16.method16797(false, (byte) 76);
	    }
	    Class185.anInt2186 = -288805643;
	}
	if (0 != 395781823 * client.anInt8312) {
	    Class185.anInt2184 -= 2075264933 * client.anInt8312;
	    if (-1770035745 * Class185.anInt2184
		>= Class185.anInt2179 * 310017649)
		Class185.anInt2184
		    = -412514897 * Class185.anInt2179 - 1734252063;
	    if (-1770035745 * Class185.anInt2184 < 0)
		Class185.anInt2184 = 0;
	    client.anInt8312 = 0;
	}
	for (int i_14_ = 0; i_14_ < client.anInt8314 * 705771489; i_14_++) {
	    Interface58 interface58 = client.anInterface58Array8315[i_14_];
	    int i_15_ = interface58.getKeyCode(-883962889);
	    char c = interface58.getKeyChar((short) 1085);
	    int i_16_ = interface58.method433(2042773557);
	    if (i_15_ == 84)
		Class120_Sub16.method16797(false, (byte) 38);
	    if (i_15_ == 80)
		Class120_Sub16.method16797(true, (byte) 4);
	    else if (i_15_ == 66 && 0 != (i_16_ & 0x4)) {
		if (null != aClipboard74) {
		    String string = "";
		    for (int i_17_
			     = Exception_Sub3.aStringArray10694.length - 1;
			 i_17_ >= 0; i_17_--) {
			if (Exception_Sub3.aStringArray10694[i_17_] != null
			    && Exception_Sub3.aStringArray10694[i_17_]
				   .length() > 0)
			    string
				= new StringBuilder().append(string).append
				      (Exception_Sub3.aStringArray10694[i_17_])
				      .append
				      ('\n').toString();
		    }
		    aClipboard74.setContents(new StringSelection(string),
					     null);
		}
	    } else if (67 == i_15_ && 0 != (i_16_ & 0x4)) {
		if (null != aClipboard74) {
		    try {
			Transferable transferable
			    = aClipboard74.getContents(null);
			if (transferable != null) {
			    String string
				= (String) (transferable.getTransferData
					    (DataFlavor.stringFlavor));
			    if (null != string) {
				String[] strings
				    = Class225.method4625(string, '\n',
							  679966813);
				Class436.method7797(strings, (short) -7319);
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
	    } else if (i_15_ == 85 && Class185.anInt2182 * 586767557 > 0) {
		Class185.aString2181
		    = new StringBuilder().append
			  (Class185.aString2181.substring(0, ((586767557
							       * (Class185
								  .anInt2182))
							      - 1)))
			  .append
			  (Class185.aString2181
			       .substring(586767557 * Class185.anInt2182))
			  .toString();
		Class185.anInt2182 -= 527811085;
	    } else if (i_15_ == 101 && (Class185.anInt2182 * 586767557
					< Class185.aString2181.length()))
		Class185.aString2181
		    = new StringBuilder().append
			  (Class185.aString2181
			       .substring(0, 586767557 * Class185.anInt2182))
			  .append
			  (Class185.aString2181
			       .substring(Class185.anInt2182 * 586767557 + 1))
			  .toString();
	    else if (i_15_ == 96 && 586767557 * Class185.anInt2182 > 0)
		Class185.anInt2182 -= 527811085;
	    else if (i_15_ == 97 && (586767557 * Class185.anInt2182
				     < Class185.aString2181.length()))
		Class185.anInt2182 += 527811085;
	    else if (i_15_ == 102)
		Class185.anInt2182 = 0;
	    else if (i_15_ == 103)
		Class185.anInt2182 = Class185.aString2181.length() * 527811085;
	    else if (104 == i_15_
		     && (-736653731 * Class185.anInt2190
			 < Exception_Sub3.aStringArray10694.length)) {
		Class185.anInt2190 += -1238256139;
		Class78.method1780(-66586407);
		Class185.anInt2182 = Class185.aString2181.length() * 527811085;
	    } else if (i_15_ == 105 && -736653731 * Class185.anInt2190 > 0) {
		Class185.anInt2190 -= -1238256139;
		Class78.method1780(-1547297201);
		Class185.anInt2182 = Class185.aString2181.length() * 527811085;
	    } else if (Class241_Sub46.method16585(c, -1676105695)
		       || "\\/.:, _-+[]~@".indexOf(c) != -1) {
		Class185.aString2181
		    = new StringBuilder().append
			  (Class185.aString2181
			       .substring(0, 586767557 * Class185.anInt2182))
			  .append
			  (client.anInterface58Array8315[i_14_]
			       .getKeyChar((short) 1085))
			  .append
			  (Class185.aString2181
			       .substring(Class185.anInt2182 * 586767557))
			  .toString();
		Class185.anInt2182 += 527811085;
	    }
	}
	client.anInt8314 = 0;
	client.anInt8317 = 0;
	Class69.method1683((byte) 14);
    }
    
    static void method603(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [1482319719 * ((ClientScriptData) class454).intStackPointer - 2]
	    = (Class326_Sub3.aClass482_10288.method11010
		   ((((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 - 2]),
		    (short) 6361)
		   .method10971
	       (Class1.aClass19_11,
		(((ClientScriptData) class454).integerStack
		 [((ClientScriptData) class454).intStackPointer * 1482319719 - 1]),
		2013076045)) ? 1 : 0;
	((ClientScriptData) class454).intStackPointer -= 1736754263;
    }
    
    static final void method604(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1257300791 * class58.scrollMaxX;
    }
}
