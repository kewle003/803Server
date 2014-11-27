/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.MalformedURLException;
import java.net.URL;

public class Class64
{
    public int anInt1033;
    public int anInt1034 = 820793816;
    public int anInt1035;
    public int anInt1036;
    public int anInt1037;
    public boolean aBool1038;
    public int anInt1039;
    public int anInt1040;
    public int anInt1041;
    public int anInt1042 = -1608217285;
    public int anInt1043;
    
    void method1623(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt1034 = class241_sub3.readUnsignedShort(1162222719) * -434271685;
	else if (2 == i)
	    aBool1038 = true;
	else if (3 == i) {
	    anInt1033 = class241_sub3.readShort((byte) 76) * 1971257517;
	    anInt1036 = class241_sub3.readShort((byte) 93) * 1136711275;
	    anInt1039 = class241_sub3.readShort((byte) 121) * -642165507;
	} else if (i == 4)
	    anInt1041 = class241_sub3.readUnsignedByte((byte) 16) * 1280826967;
	else if (i == 5)
	    anInt1040 = class241_sub3.readBigSmart((byte) -37) * 1195574275;
	else if (6 == i)
	    anInt1042 = class241_sub3.readTriByte(1771646547) * 618361541;
	else if (7 == i) {
	    anInt1037 = class241_sub3.readShort((byte) 56) * 148571129;
	    anInt1035 = class241_sub3.readShort((byte) 109) * -1584853601;
	    anInt1043 = class241_sub3.readShort((byte) 88) * 1639230839;
	}
    }
    
    void method1624(RSByteBuffer class241_sub3, byte i) {
	for (;;) {
	    int i_0_ = class241_sub3.readUnsignedByte((byte) -5);
	    if (0 == i_0_)
		break;
	    method1625(class241_sub3, i_0_, (byte) 0);
	}
    }
    
    void method1625(RSByteBuffer class241_sub3, int i, byte i_1_) {
	if (i == 1)
	    anInt1034 = class241_sub3.readUnsignedShort(1162222719) * -434271685;
	else if (2 == i)
	    aBool1038 = true;
	else if (3 == i) {
	    anInt1033 = class241_sub3.readShort((byte) 53) * 1971257517;
	    anInt1036 = class241_sub3.readShort((byte) 111) * 1136711275;
	    anInt1039 = class241_sub3.readShort((byte) 96) * -642165507;
	} else if (i == 4)
	    anInt1041 = class241_sub3.readUnsignedByte((byte) 47) * 1280826967;
	else if (i == 5)
	    anInt1040 = class241_sub3.readBigSmart((byte) -7) * 1195574275;
	else if (6 == i)
	    anInt1042 = class241_sub3.readTriByte(1771646547) * 618361541;
	else if (7 == i) {
	    anInt1037 = class241_sub3.readShort((byte) 56) * 148571129;
	    anInt1035 = class241_sub3.readShort((byte) 111) * -1584853601;
	    anInt1043 = class241_sub3.readShort((byte) 95) * 1639230839;
	}
    }
    
    Class64() {
	/* empty */
    }
    
    public static void method1626(InterfaceComponent[] class58s, int i) {
		for (int i_2_ = 0; i_2_ < class58s.length; i_2_++) {
		    InterfaceComponent class58 = class58s[i_2_];
		    if (class58.onLoadScript != null) {
				ClientScriptCaller class241_sub14 = new ClientScriptCaller();
				class241_sub14.component = class58;
				class241_sub14.paramaters = class58.onLoadScript;
				Class371.method6625(class241_sub14, 2000000, 1547169456);
		    }
		}
    }
    
    static final void method1627(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	class58.anInt860
	    = -1662126457 * (((ClientScriptData) class454).integerStack
			     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (class58.anInt860 * -1735856329
	    > class58.scrollMaxX * 1257300791 - 439139681 * class58.anInt850)
	    class58.anInt860
		= class58.scrollMaxX * -582374399 - 979375143 * class58.anInt850;
	if (class58.anInt860 * -1735856329 < 0)
	    class58.anInt860 = 0;
	class58.scrollCurrentY
	    = (1718576863
	       * (((ClientScriptData) class454).integerStack
		  [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]));
	if (-1669999329 * class58.scrollCurrentY
	    > class58.scrollMaxY * 1204737107 - 1463495207 * class58.scrollMinY)
	    class58.scrollCurrentY
		= class58.scrollMaxY * 398526029 - class58.scrollMinY * 1614692857;
	if (-1669999329 * class58.scrollCurrentY < 0)
	    class58.scrollCurrentY = 0;
	WorldType.refreshComponent(class58, -705796025);
	if (-1 == -389932081 * class58.slot1 && !class35.aBool374)
	    Class445_Sub6.method14145(class58.componentHash * 445907013, 669702881);
    }
    
    static final void method1628(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = new StringBuilder().append(string).append(i_3_).toString();
    }
    
    static final void method1629(ClientScriptData class454, int i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub39_Sub14 class241_sub39_sub14
	    = Class123.aClass292_1579.method5686(i_4_, (byte) 33);
	if (null == class241_sub39_sub14.anIntArray10967)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub39_sub14.anIntArray10967.length;
    }
    
    static final void method1630(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = ((Class445_Sub16.aClass351_Sub1_8660.method6332((short) -7708)
		== null)
	       ? -1
	       : (Class445_Sub16.aClass351_Sub1_8660.method6332((short) -22512)
		  .anInt590) * -1952920369);
    }
    
    static final void setVarcompVarpChangeEvent/*method1631*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
		InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
		Class70.setVarpChangeEvent(class58, class35, scriptData, 1221081552);
    }
    
    public static final void method1632//Used
	(InterfaceComponent[] class58s, int i, int i_5_, int i_6_, int i_7_, int i_8_,
	 int i_9_, int i_10_, int i_11_, boolean bool, int i_12_) {
	Class236.aClass103_2713.method2445(i_5_, i_6_, i_7_, i_8_);
	for (int i_13_ = 0; i_13_ < class58s.length; i_13_++) {
	    InterfaceComponent component = class58s[i_13_];
	    if (null != component
		&& (component.parentNode * -152977625 == i
		    || -1412584499 == i && client.aClass58_8365 == component)) {
		int i_14_;
		if (-1 == i_11_) {
		    client.aRectangleArray8525
			[client.anInt8396 * -787147009].setBounds
			(i_9_ + -361730557 * component.anInt928,
			 -145726829 * component.anInt894 + i_10_,
			 component.anInt850 * 439139681,
			 1463495207 * component.scrollMinY);
		    i_14_ = (client.anInt8396 += -539367169) * -787147009 - 1;
		} else
		    i_14_ = i_11_;
		component.anInt1010 = -1060363883 * i_14_;
		component.anInt1011 = -321047773 * client.anInt8296;
		if (!client.method13803(component)) {
		    if (1551710807 * component.anInt1002 != 0)
			Class481.method11007(component, 742032617);
		    int i_15_ = i_9_ + component.anInt928 * -361730557;
		    int i_16_ = i_10_ + component.anInt894 * -145726829;
		    int i_17_ = component.colourAlpha * -915226675;
		    if (client.aBool8403
			&& ((client.method13624(component).anInt9007 * -438085493
			     != 0)
			    || -1579470857 * component.componentType == 0)
			&& i_17_ > 127)
			i_17_ = 127;
		    if (client.aClass58_8365 == component) {
			if (-1412584499 != i
			    && ((InterfaceComponent.anInt967 * 1063093221
				 == -1721854809 * component.anInt941)
				|| (1104105953 * InterfaceComponent.anInt819
				    == -1721854809 * component.anInt941)
				|| (client.method13624(component)
					.method15038(1313813946)
				    && (InterfaceComponent.anInt812 * -116029789
					!= component.anInt941 * -1721854809)))) {
			    Class639.aClass58Array8261 = class58s;
			    Class424.anInt6069 = 757832861 * i_9_;
			    Class463.anInt6289 = -553336835 * i_10_;
			    continue;
			}
			if (client.aBool8490 && client.aBool8505) {
			    int i_18_ = Class106.aClass580_1503
					    .method12718(1562887352);
			    int i_19_ = Class106.aClass580_1503
					    .method12740((byte) -85);
			    i_18_ -= 355524037 * client.anInt8479;
			    i_19_ -= 1393910517 * client.anInt8484;
			    if (i_18_ < -1979323687 * client.anInt8483)
				i_18_ = client.anInt8483 * -1979323687;
			    if (439139681 * component.anInt850 + i_18_
				> (-1979323687 * client.anInt8483
				   + 1726283367 * client.anInt8485))
				i_18_ = (client.anInt8483 * -1979323687
					 + client.anInt8485 * 1726283367
					 - 439139681 * component.anInt850);
			    if (i_19_ < client.anInt8547 * -1896782001)
				i_19_ = -1896782001 * client.anInt8547;
			    if (1463495207 * component.scrollMinY + i_19_
				> (client.anInt8547 * -1896782001
				   + -1178156477 * client.anInt8486))
				i_19_ = (-1178156477 * client.anInt8486
					 + client.anInt8547 * -1896782001
					 - component.scrollMinY * 1463495207);
			    if (client.method13624(component)
				    .method15038(1472259830))
				Class579.method12709(i_18_, i_19_,
						     (component.anInt850
						      * 439139681),
						     (component.scrollMinY
						      * 1463495207),
						     (byte) -18);
			    if (-116029789 * InterfaceComponent.anInt812
				!= component.anInt941 * -1721854809) {
				i_15_ = i_18_;
				i_16_ = i_19_;
			    }
			}
			if (-1721854809 * component.anInt941
			    == 1104105953 * InterfaceComponent.anInt819)
			    i_17_ = 128;
		    }
		    int i_20_;
		    int i_21_;
		    int i_22_;
		    int i_23_;
		    if (component.componentType * -1579470857 == 2) {
			i_20_ = i_5_;
			i_21_ = i_6_;
			i_22_ = i_7_;
			i_23_ = i_8_;
		    } else {
			int i_24_ = 439139681 * component.anInt850 + i_15_;
			int i_25_ = 1463495207 * component.scrollMinY + i_16_;
			if (9 == component.componentType * -1579470857) {
			    i_24_++;
			    i_25_++;
			}
			i_20_ = i_15_ > i_5_ ? i_15_ : i_5_;
			i_21_ = i_16_ > i_6_ ? i_16_ : i_6_;
			i_22_ = i_24_ < i_7_ ? i_24_ : i_7_;
			i_23_ = i_25_ < i_8_ ? i_25_ : i_8_;
		    }
		    if (i_20_ < i_22_ && i_21_ < i_23_) {
			if (0 != 1551710807 * component.anInt1002) {
			    if ((component.anInt1002 * 1551710807
				 == InterfaceComponent.anInt814 * -736017553)
				|| (InterfaceComponent.anInt815 * -957366051
				    == component.anInt1002 * 1551710807)) {
				if (client.aBool8448) {
				    Class236.aClass103_2713.method2291();
				    SkillDefaults.method11458
					(i_15_, i_16_,
					 439139681 * component.anInt850,
					 1463495207 * component.scrollMinY,
					 (InterfaceComponent.anInt815 * -957366051
					  == 1551710807 * component.anInt1002),
					 -398474819);
				    LoadingScreenDef.method6488(i_14_, i_20_, i_21_,
							i_22_, i_23_, i_15_,
							i_16_, (byte) 62);
				    Class236.aClass103_2713.method2295();
				    Class236.aClass103_2713
					.method2445(i_5_, i_6_, i_7_, i_8_);
				    client.aBoolArray8523[i_14_] = true;
				}
				continue;
			    }
			    if ((component.anInt1002 * 1551710807
				 == InterfaceComponent.anInt816 * -737177669)
				&& client.anInt8266 * -831877317 == 3) {
				if (component.componentType * -1579470857 != 5
				    || component.method1518((Class236
							   .aClass103_2713),
							  768185481) != null) {
				    Class417.method7494((Class236
							 .aClass103_2713),
							component, i_15_, i_16_,
							70718918);
				    Class236.aClass103_2713
					.method2445(i_5_, i_6_, i_7_, i_8_);
				}
				continue;
			    }
			    if (1551710807 * component.anInt1002
				== InterfaceComponent.anInt823 * 1532229585) {
				Class206.method4091(Class236.aClass103_2713,
						    i_15_, i_16_, component,
						    -1796021341);
				continue;
			    }
			    if (component.anInt1002 * 1551710807
				== InterfaceComponent.anInt962 * 1169249299) {
				Class93.method2092(Class236.aClass103_2713,
						   i_15_, i_16_, component,
						   (-1687836431
						    * component.colour % 64),
						   2000370846);
				continue;
			    }
			    if (1637570435 * InterfaceComponent.anInt943
				== component.anInt1002 * 1551710807) {
				if (component.method1518(Class236.aClass103_2713,
						       960509657)
				    != null) {
				    Class236.aClass103_2713.method2291();
				    Class320.method5928(component, i_15_, i_16_,
							(short) 11255);
				    Class236.aClass103_2713
					.method2445(i_5_, i_6_, i_7_, i_8_);
				}
				continue;
			    }
			    if (InterfaceComponent.anInt839 * 1450113367
				== component.anInt1002 * 1551710807) {
				JSFunction.method6231(Class236.aClass103_2713,
						    i_15_, i_16_,
						    (component.anInt850
						     * 439139681),
						    (1463495207
						     * component.scrollMinY),
						    2041127003);
				client.aBoolArray8523[i_14_] = true;
				Class236.aClass103_2713.method2445(i_5_, i_6_,
								   i_7_, i_8_);
				continue;
			    }
			    if (InterfaceComponent.anInt911 * -837709587
				== component.anInt1002 * 1551710807) {
				Class409.method7427
				    (Class236.aClass103_2713, i_15_, i_16_,
				     component.anInt850 * 439139681,
				     1463495207 * component.scrollMinY, -85276449);
				client.aBoolArray8523[i_14_] = true;
				Class236.aClass103_2713.method2445(i_5_, i_6_,
								   i_7_, i_8_);
				continue;
			    }
			    if (component.anInt1002 * 1551710807
				== InterfaceComponent.anInt817 * 658193325) {
				if (client.aBool8449 || client.aBool8299) {
				    Class572.method12552(i_15_, i_16_, component,
							 -86506649);
				    client.aBoolArray8523[i_14_] = true;
				}
				continue;
			    }
			}
			if (0 == component.componentType * -1579470857) {
			    if (InterfaceComponent.anInt822 * 802860145
				== component.anInt1002 * 1551710807) {
				client.aClass238_8477.method4833
				    (1684875952).method11378
				    (client.aClass238_8477, 1115460517);
				Class236.aClass103_2713.method2321
				    (0, 0, Class494.canvasWid * -1080559003,
				     963058943 * Class67.canvasHei);
			    }
			    method1632(class58s, component.componentHash * 445907013,
				       i_20_, i_21_, i_22_, i_23_,
				       i_15_ - -1735856329 * component.anInt860,
				       i_16_ - component.scrollCurrentY * -1669999329,
				       i_14_, bool, -2024866326);
			    if (null != component.aClass58Array1000)
				method1632(component.aClass58Array1000,
					   component.componentHash * 445907013, i_20_,
					   i_21_, i_22_, i_23_,
					   (i_15_
					    - -1735856329 * component.anInt860),
					   (i_16_
					    - component.scrollCurrentY * -1669999329),
					   i_14_, bool, -1636177534);
			    Class241_Sub11 class241_sub11
				= ((Class241_Sub11)
				   (client.aClass407_8467.get
				    ((long) (component.componentHash * 445907013))));
			    if (null != class241_sub11)
				Class67.method1647
				    (-443552671 * class241_sub11.interfaceID,
				     i_20_, i_21_, i_22_, i_23_,
				     i_15_ - -1735856329 * component.anInt860,
				     i_16_ - -1669999329 * component.scrollCurrentY,
				     i_14_, (byte) 58);
			    if (InterfaceComponent.anInt822 * 802860145
				== component.anInt1002 * 1551710807) {
				if (Class236.aClass103_2713.method2323()) {
				    Class236.aClass103_2713.method2322();
				    if (19 == client.anInt8288 * 1766317249)
					Class580.method12745
					    (i_15_, i_16_,
					     439139681 * component.anInt850,
					     component.scrollMinY * 1463495207,
					     2076969693);
				}
				if (-831877317 * client.anInt8266 == 4) {
				    int i_26_ = client.anInt8360 * -2050289687;
				    int i_27_ = 1905757559 * client.anInt8573;
				    int i_28_ = -817278697 * client.anInt8563;
				    int i_29_ = -1723872329 * client.anInt8363;
				    if (client.anInt8296
					< client.anInt8359 * 1817146579) {
					float f
					    = (1.0F
					       * (float) (client.anInt8296
							  - (client.anInt8358
							     * 1567354803))
					       / (float) ((client.anInt8359
							   * 1817146579)
							  - (1567354803
							     * (client
								.anInt8358))));
					i_26_
					    = (int) (f * (float) (-2050289687
								  * (client
								     .anInt8360))
						     + ((float) ((Class10
								  .anInt67)
								 * -245923255)
							* (1.0F - f)));
					i_27_
					    = (int) (((float) ((Class394
								.anInt5771)
							       * -1446058963)
						      * (1.0F - f))
						     + f * (float) (1905757559
								    * (client
								       .anInt8573)));
					i_28_
					    = (int) (((1.0F - f)
						      * (float) (-906475181
								 * (Class241_Sub9
								    .anInt8894)))
						     + ((float) (-817278697
								 * (client
								    .anInt8563))
							* f));
					i_29_
					    = (int) (f * (float) (-1723872329
								  * (client
								     .anInt8363))
						     + ((1.0F - f)
							* (float) ((Class496
								    .anInt6526)
								   * 1271373681)));
				    }
				    if (i_26_ > 0)
					Class236.aClass103_2713.method2263
					    (i_20_, i_21_, i_22_ - i_20_,
					     i_23_ - i_21_,
					     (i_26_ << 24 | i_27_ << 16
					      | i_28_ << 8 | i_29_),
					     (byte) -57);
				}
			    }
			    Class236.aClass103_2713.method2445(i_5_, i_6_,
							       i_7_, i_8_);
			}
			if (client.aBoolArray8572[i_14_]
			    || -1506773685 * client.anInt8526 > 1) {
			    if (component.componentType * -1579470857 == 3) {
				if (0 == i_17_) {
				    if (component.filledBox)
					Class236.aClass103_2713.method2396
					    (i_15_, i_16_,
					     component.anInt850 * 439139681,
					     component.scrollMinY * 1463495207,
					     ~0xffffff | (component.colour
							  * -1687836431),
					     0);
				    else
					Class236.aClass103_2713.method2268
					    (i_15_, i_16_,
					     component.anInt850 * 439139681,
					     component.scrollMinY * 1463495207,
					     ~0xffffff | (-1687836431
							  * component.colour),
					     0);
				} else if (component.filledBox)
				    Class236.aClass103_2713.method2396
					(i_15_, i_16_,
					 component.anInt850 * 439139681,
					 1463495207 * component.scrollMinY,
					 (255 - (i_17_ & 0xff) << 24
					  | (component.colour * -1687836431
					     & 0xffffff)),
					 1);
				else
				    Class236.aClass103_2713.method2268
					(i_15_, i_16_,
					 439139681 * component.anInt850,
					 1463495207 * component.scrollMinY,
					 (255 - (i_17_ & 0xff) << 24
					  | (-1687836431 * component.colour
					     & 0xffffff)),
					 1);
			    } else if (-1579470857 * component.componentType == 4) {
				int i_30_ = 255 - (i_17_ & 0xff);
				if (0 != i_30_) {
				    Class96 class96
					= (component.method1589
					   (Class425.aClass344_6080,
					    client.anInterface26_8552,
					    -1187911652));
				    if (class96 == null) {
					if (InterfaceComponent.aBool833)
					    WorldType.refreshComponent(component,
								 1696942223);
				    } else {
					int i_31_
					    = component.colour * -1687836431;
					String string = component.text;
					if (-1
					    != component.slot2 * 877329925) {
					    ItemDefinition class623
						= (JS5.itemDefLoader
						       .list
						   ((877329925
						     * component.slot2),
						    (short) 8963));
					    string = class623.name;
					    if (string == null)
						string = "null";
					    if ((1 == (-942978965
						       * class623.stackable)
						 || (component.anInt975
						     * 1809275135) != 1)
						&& (1809275135
						    * component.anInt975) != -1)
						string
						    = new StringBuilder()
							  .append
							  (Class338.method6112
							   (16748608,
							    1309449392))
							  .append
							  (string).append
							  (Class6.aString34)
							  .append
							  (" x").append
							  (Class357_Sub1
							       .method16665
							   ((component.anInt975
							     * 1809275135),
							    -159311673))
							  .toString();
					}
					if (component.anInt995 * 88137753
					    != -1) {
					    string = (Class362.method6519
						      ((88137753
							* component.anInt995),
						       (byte) -59));
					    if (string == null)
						string = "";
					}
					if (component == client.aClass58_8384) {
					    string = (ClientMessage
							  .PLEASEWAIT
							  .getLocalisedMessage
						      (VarPlayerDomain.currentLocale,
						       (short) 29485));
					    i_31_ = (component.colour
						     * -1687836431);
					}
					if (client.aBool8295)
					    Class236.aClass103_2713.method2258
						(i_15_, i_16_,
						 i_15_ + (439139681
							  * component.anInt850),
						 i_16_ + (component.scrollMinY
							  * 1463495207));
					i_30_ <<= 24;
					if (component.aBool854)
					    class96.method2120
						(string, i_15_, i_16_,
						 439139681 * component.anInt850,
						 1463495207 * component.scrollMinY,
						 i_30_ | i_31_,
						 component.textHasShadow ? i_30_ : -1,
						 1543601685 * component.horizontalTextAlign,
						 component.verticalTextAlign * 1285591903,
						 client.aRandom8380,
						 Class5.anInt28,
						 client.anIntArray8527,
						 (Class445_Sub9
						  .aClass168Array8642),
						 null, (byte) -2);
					else
					    class96.method2115
						(string, i_15_, i_16_,
						 component.anInt850 * 439139681,
						 component.scrollMinY * 1463495207,
						 i_30_ | i_31_,
						 component.textHasShadow ? i_30_ : -1,
						 1543601685 * component.horizontalTextAlign,
						 component.verticalTextAlign * 1285591903,
						 component.textLineHeight * 960697577,
						 component.anInt920 * -450673253,
						 (Class445_Sub9
						  .aClass168Array8642),
						 null, null, 0, 0, (byte) 1);
					if (client.aBool8295)
					    Class236.aClass103_2713.method2445
						(i_5_, i_6_, i_7_, i_8_);
				    }
				}
			    } else if (5 == -1579470857 * component.componentType) {
				if (-1649284687 * component.anInt989 >= 0)
				    component.method1514
					(Class380.aClass577_5657,
					 Class326.aClass74_5015, (byte) 9)
					.method12875
					(Class236.aClass103_2713, 0, i_15_,
					 i_16_, component.anInt850 * 439139681,
					 component.scrollMinY * 1463495207,
					 component.anInt990 * -1901574711 << 3,
					 612567735 * component.anInt947 << 3, 0,
					 0, 1767858113);
				else {
				    Class168 class168;
				    if (877329925 * component.slot2 != -1) {
					Class490 class490
					    = (component.aBool988
					       ? (Class21
						  .myPlayer
						  .aClass490_11499)
					       : null);
					class168
					    = (JS5.itemDefLoader
						   .method13296
					       (Class236.aClass103_2713,
						877329925 * component.slot2,
						component.anInt975 * 1809275135,
						-980602175 * component.anInt872,
						~0xffffff | (component.anInt881
							     * 1143403757),
						-1412069699 * component.anInt895,
						class490, (byte) 0));
				    } else if (component.anInt995 * 88137753
					       != -1)
					class168
					    = (Class120_Sub19.method16846
					       (Class236.aClass103_2713,
						88137753 * component.anInt995,
						-259965911));
				    else if (-1 != (component.anInt852
						    * -171873793)) {
					class168
					    = ((Class168)
					       (client.aClass129_8580
						    .get
						((long) (-171873793
							 * (component
							    .anInt852)))));
					if (class168 == null
					    && !(client.aMap8461.containsKey
						 (Integer.valueOf
						  (-171873793
						   * component.anInt852)))) {
					    try {
						client.aMap8461.put
						    ((Integer.valueOf
						      (-171873793
						       * component.anInt852)),
						     (Class241_Sub47
							  .aClass21_10276
							  .method887
						      ((new URL
							(new StringBuilder
							     ().append
							     (client
							      .aString8593)
							     .append
							     ("/img/image_")
							     .append
							     (-171873793
							      * (component
								 .anInt852))
							     .append
							     (".png?a=").append
							     (Class50
								  .method1249
							      ((byte) 1))
							     .toString())),
						       -137179735)));
					    } catch (MalformedURLException malformedurlexception) {
						VarType.method3770
						    (null,
						     malformedurlexception,
						     -1914382736);
					    }
					}
				    } else
					class168 = (component.method1509
						    (Class236.aClass103_2713,
						     (byte) -22));
				    if (class168 != null) {
					int i_32_ = class168.method64();
					int i_33_ = class168.method3616();
					int i_34_ = 255 - (i_17_ & 0xff);
					if (i_34_ != 0) {
					    int i_35_;
					    if (-1687836431 * component.colour
						== -1)
						i_35_ = 16777215;
					    else {
						i_35_ = ((-1687836431
							  * component.colour)
							 & 0xffffff);
						if (i_35_ == 0)
						    i_35_ = 16777215;
					    }
					    i_35_ |= i_34_ << 24;
					    boolean bool_36_ = -1 != i_35_;
					    if (component.aBool871) {
							Class236.aClass103_2713
							    .method2258
							    (i_15_, i_16_,
							     i_15_ + (component.anInt850
								      * 439139681),
							     (component.scrollMinY
							      * 1463495207) + i_16_);
							if (component.anInt870 * 89728509
							    != 0) {
							    int i_37_
								= (((component.anInt850
								     * 439139681)
								    + (i_32_ - 1))
								   / i_32_);
							    int i_38_
								= (((component.scrollMinY
								     * 1463495207)
								    + (i_33_ - 1))
								   / i_33_);
							    for (int i_39_ = 0;
								 i_39_ < i_37_;
								 i_39_++) {
								for (int i_40_ = 0;
								     i_40_ < i_38_;
								     i_40_++) {
								    if (bool_36_)
									class168
									    .method3621
									    (((float) (i_15_
										       + i_39_ * i_32_)
									      + ((float) i_32_
										 / 2.0F)),
									     (((float) i_33_
									       / 2.0F)
									      + (float) (i_40_ * i_33_ + i_16_)),
									     4096,
									     ((component
									       .anInt870)
									      * 89728509),
									     0, i_35_,
									     1);
								    else
									class168
									    .method3620
									    (((float) (i_15_
										       + i_39_ * i_32_)
									      + ((float) i_32_
										 / 2.0F)),
									     (((float) i_33_
									       / 2.0F)
									      + (float) (i_16_ + i_33_ * i_40_)),
									     4096,
									     ((component
									       .anInt870)
									      * 89728509));
								}
							    }
							} else if (bool_36_)
							    class168.method3618
								(i_15_, i_16_,
								 (439139681
								  * component.anInt850),
								 (component.scrollMinY
								  * 1463495207),
								 0, i_35_, 1);
							else
							    class168.method3603
								(i_15_, i_16_,
								 (component.anInt850
								  * 439139681),
								 (component.scrollMinY
								  * 1463495207));
							Class236.aClass103_2713
							    .method2445
							    (i_5_, i_6_, i_7_, i_8_);
					    } else if (bool_36_) {
						if (89728509 * component.anInt870
						    != 0)
						    class168.method3621
							((((float) ((component
								     .anInt850)
								    * 439139681)
							   / 2.0F)
							  + (float) i_15_),
							 (((float) ((component
								     .scrollMinY)
								    * 1463495207)
							   / 2.0F)
							  + (float) i_16_),
							 (-875163648
							  * component.anInt850
							  / i_32_),
							 (component.anInt870
							  * 89728509),
							 0, i_35_, 1);
						else if (((439139681
							   * component.anInt850)
							  != i_32_)
							 || ((1463495207
							      * (component
								 .scrollMinY))
							     != i_33_))
						    class168.method3615
							(i_15_, i_16_,
							 (439139681
							  * component.anInt850),
							 (component.scrollMinY
							  * 1463495207),
							 0, i_35_, 1);
						else
						    class168.method3666(i_15_,
									i_16_,
									0,
									i_35_,
									1);
					    } else if (0
						       != (89728509
							   * component.anInt870))
						class168.method3622
						    (((float) i_15_
						      + ((float) ((component
								   .anInt850)
								  * 439139681)
							 / 2.0F)),
						     ((float) i_16_
						      + ((float) ((component
								   .scrollMinY)
								  * 1463495207)
							 / 2.0F)),
						     (float) i_32_ / 2.0F,
						     (float) i_33_ / 2.0F,
						     (-875163648
						      * component.anInt850
						      / i_32_),
						     (-1297977344
						      * component.scrollMinY
						      / i_33_),
						     (component.anInt870
						      * 89728509),
						     1, -1, 1);
					    else if ((i_32_
						      != (439139681
							  * component.anInt850))
						     || (i_33_
							 != (1463495207
							     * (component
								.scrollMinY))))
						class168.method3614
						    (i_15_, i_16_,
						     (439139681
						      * component.anInt850),
						     (component.scrollMinY
						      * 1463495207));
					    else
						class168.method3646(i_15_,
								    i_16_);
					}
				    } else if (InterfaceComponent.aBool833)
					WorldType.refreshComponent(component,
							     -803108880);
				}
			    } else if (-1579470857 * component.componentType == 6) {
					Class236.aClass103_2713.method2291();
					Class89 class89 = null;
					int i_41_ = 2048;
					if (0 != component.anInt827 * 374933763) {
					    i_41_ |= 0x80000;
					}
					int i_42_ = 0;
					if (877329925 * component.slot2 != -1) {
					    ItemDefinition class623
						= (JS5.itemDefLoader.list
						   (component.slot2 * 877329925,
						    (short) 11006));
					    if (class623 != null) {
						class623
						    = (class623.method13370
						       (1809275135 * component.anInt975,
							(byte) -50));
						class89
						    = (class623.method13369
						       (Class236.aClass103_2713, i_41_,
							1,
							(component.aBool988
							 ? (Class21
							    .myPlayer
							    .aClass490_11499)
							 : null),
							component.aClass409_998, 0, 0, 0,
							0, (byte) 1));
						if (class89 != null)
						    i_42_ = -class89.method1902() >> 1;
						else
						    WorldType.refreshComponent(component, -474992540);
					    }
					} else if (3 == -982148763 * component.modelType) {//Entity full
					    int i_43_ = 1965460551 * component.anInt879;
					    if (i_43_ >= 0 && i_43_ < 2048) {
							Player player = client.localPlayers[i_43_];
							if (null != player && (i_43_ == (client.myPlayerIndex * 1124115145)
									|| ((Class475_Sub1_Sub3_Sub1.method17705(player.nameUnfiltered, -1449322060))
											== (408732473 * (component.anInt880))))) {
							    class89 = component.method1552(
							    		Class236.aClass103_2713, i_41_,
							    		Class79.aClass539_1138, CS2MapList.aClass350_6031,
							    		MasterIndex.npcDefLoader, JS5.itemDefLoader,
							    		Class394.animationDefLoader, Class1.aClass19_11,
							    		Class1.aClass19_11, component.aClass409_998,
							    		player.aClass490_11499, (byte) 32);
							    if (null == class89 && InterfaceComponent.aBool833) {
							    	WorldType.refreshComponent(component, -1060051003);
							    }
							}
					    }
					} else if (5 == -982148763 * component.modelType) {//Entity head
					    int i_44_ = 1965460551 * component.anInt879;
					    Player player = null;
					    if (i_44_ >= 0 && i_44_ < 2048) {
					    	player = client.localPlayers[i_44_];
					    } else if (i_44_ == -1) {
					    	player = Class21.myPlayer;
					    }
					    if (null != player && (null != player.aClass490_11499)
					    		&& (-1 == i_44_ || (1124115145 * client.myPlayerIndex == i_44_)
					    		|| ((Class475_Sub1_Sub3_Sub1.method17705(player.nameUnfiltered, 1284273575)) 
					    				== (408732473 * component.anInt880)))) {
						class89 = player.aClass490_11499.method11221(
								Class236.aClass103_2713, i_41_,
								Class79.aClass539_1138,
								CS2MapList.aClass350_6031,
								MasterIndex.npcDefLoader,
								JS5.itemDefLoader,
								Class1.aClass19_11,
								Class1.aClass19_11,
								component.aClass409_998, null,
								null, null, 0, true,
								Class506.aClass504_6662,
								-755688000);
					    }
					} else if (-982148763 * component.modelType == 8
						   || (component.modelType * -982148763 == 9)) {
					    Class241_Sub34 class241_sub34 = Class584.method12835(
					    		(1965460551 * component.anInt879), false, -1485834270);
					    if (class241_sub34 != null) {
					    	class89 = class241_sub34.method16346(
					    			Class236.aClass103_2713, i_41_,
					    			component.aClass409_998,
					    			component.anInt880 * 408732473,
					    			(component.modelType * -982148763 == 9),
					    			(component.aBool988 ? Class21.myPlayer.aClass490_11499 : null),
					    			-304839168);
					    }
					} else if (null == component.aClass409_998
						   || !component.aClass409_998.method7364(372700264)) {
					    class89
						= (component.method1552
						   (Class236.aClass103_2713, i_41_,
						    Class79.aClass539_1138,
						    CS2MapList.aClass350_6031,
						    MasterIndex.npcDefLoader,
						    JS5.itemDefLoader,
						    Class394.animationDefLoader,
						    Class1.aClass19_11,
						    Class1.aClass19_11, null,
						    (Class21
						     .myPlayer
						     .aClass490_11499),
						    (byte) 32));
					    if (class89 == null && InterfaceComponent.aBool833)
						WorldType.refreshComponent(component,
								     -2043677027);
					} else {
					    class89
						= (component.method1552
						   (Class236.aClass103_2713, i_41_,
						    Class79.aClass539_1138,
						    CS2MapList.aClass350_6031,
						    MasterIndex.npcDefLoader,
						    JS5.itemDefLoader,
						    Class394.animationDefLoader,
						    Class1.aClass19_11,
						    Class1.aClass19_11,
						    component.aClass409_998,
						    (Class21
						     .myPlayer
						     .aClass490_11499),
						    (byte) 32));
					    if (null == class89 && InterfaceComponent.aBool833)
						WorldType.refreshComponent(component,
								     -882815662);
					}
					if (null != class89) {
					    if (component.anInt827 * 374933763 != 0)
						class89.method1911
						    (component.anInt840 * 435007529,
						     component.anInt901 * -300442383,
						     2122845335 * component.anInt968,
						     component.anInt827 * 374933763);
					    int i_45_;
					    if (component.anInt891 * -1690898139 > 0)
						i_45_ = ((component.anInt850 * 439139681
							  << 9)
							 / (component.anInt891
							    * -1690898139));
					    else
						i_45_ = 512;
					    int i_46_;
					    if (component.anInt892 * -620976499 > 0)
						i_46_ = ((1463495207 * component.scrollMinY
							  << 9)
							 / (component.anInt892
							    * -620976499));
					    else
						i_46_ = 512;
					    int i_47_
						= (component.anInt850 * 439139681 / 2
						   + i_15_);
					    int i_48_ = i_16_ + (component.scrollMinY
								 * 1463495207 / 2);
					    if (!component.aBool950) {
						i_47_ += (587544365 * component.anInt887
							  * i_45_) >> 9;
						i_48_ += i_46_ * (component.anInt888
								  * -1572086015) >> 9;
					    }
					    client.aClass266_8290.method5165();
					    Class236.aClass103_2713
						.method2512(client.aClass266_8290);
					    Class268 class268
						= Class236.aClass103_2713.method2226();
					    int i_49_ = client.aClass238_8477
							    .method4749((byte) 125);
					    int i_50_ = client.aClass238_8477
							    .method4750(-2001398481);
					    i_50_ += -765284509 * component.anInt890;
					    if (component.aBool893) {
						if (4 == (115241065
							  * Class296.anInt4513)) {
						    if (component.aBool950)
							class268.method5216
							    ((float) i_47_,
							     (float) i_48_,
							     (float) i_45_,
							     (float) i_46_,
							     (Class445_Sub16
								  .aClass351_Sub1_8660
								  .method6300
							      (1598109528)),
							     (Class445_Sub16
								  .aClass351_Sub1_8660
								  .method6301
							      ((byte) 64)),
							     (float) (-1080559003
								      * (Class494
									 .canvasWid)),
							     (float) (Class67.canvasHei
								      * 963058943),
							     (float) (component.anInt890
								      * -765284509));
						    else
							class268.method5216
							    ((float) i_47_,
							     (float) i_48_,
							     (float) i_45_,
							     (float) i_46_,
							     (Class445_Sub16
								  .aClass351_Sub1_8660
								  .method6300
							      (1598109528)),
							     (Class445_Sub16
								  .aClass351_Sub1_8660
								  .method6301
							      ((byte) 94)),
							     (float) (-1080559003
								      * (Class494
									 .canvasWid)),
							     (float) (Class67.canvasHei
								      * 963058943),
							     (float) ((component.anInt890
								       * -765284509)
								      << 2));
						} else if (component.aBool950)
						    class268.method5216
							((float) i_47_, (float) i_48_,
							 (float) i_45_, (float) i_46_,
							 (float) i_49_, (float) i_50_,
							 (float) (-1080559003
								  * (Class494
								     .canvasWid)),
							 (float) (963058943
								  * Class67.canvasHei),
							 (float) (-765284509
								  * component.anInt890));
						else
						    class268.method5216
							((float) i_47_, (float) i_48_,
							 (float) i_45_, (float) i_46_,
							 (float) i_49_, (float) i_50_,
							 (float) (Class494.canvasWid
								  * -1080559003),
							 (float) (963058943
								  * Class67.canvasHei),
							 (float) ((component.anInt890
								   * -765284509)
								  << 2));
					    } else if (115241065 * Class296.anInt4513
						       == 4)
						class268.method5268
						    ((float) i_47_, (float) i_48_,
						     (float) i_45_, (float) i_46_,
						     Class445_Sub16
							 .aClass351_Sub1_8660
							 .method6300(1598109528),
						     Class445_Sub16
							 .aClass351_Sub1_8660
							 .method6301((byte) 100),
						     (float) (Class494.canvasWid
							      * -1080559003),
						     (float) (Class67.canvasHei
							      * 963058943));
					    else
						class268.method5268
						    ((float) i_47_, (float) i_48_,
						     (float) i_45_, (float) i_46_,
						     (float) i_49_, (float) i_50_,
						     (float) (-1080559003
							      * Class494.canvasWid),
						     (float) (Class67.canvasHei
							      * 963058943));
					    Class236.aClass103_2713
						.method2309(class268);
					    Class236.aClass103_2713.method2450(2, 0);
					    if (component.aBool826)
						Class236.aClass103_2713
						    .method2308(false);
					    if (component.aBool950) {
						client.aClass266_8291.method5125
						    (1.0F, 0.0F, 0.0F,
						     (Class282.method5490
						      (-1307505439
						       * component.anInt853)));
						client.aClass266_8291.method5128
						    (0.0F, 1.0F, 0.0F,
						     Class282.method5490((component
									  .anInt885)
									 * 645192277));
						client.aClass266_8291.method5128
						    (0.0F, 0.0F, 1.0F,
						     (Class282.method5490
						      (-383857477
						       * component.anInt886)));
						client.aClass266_8291.method5133
						    ((float) (587544365
							      * component.anInt887),
						     (float) (component.anInt888
							      * -1572086015),
						     (float) (component.anInt889
							      * -396846945));
					    } else {
						int i_51_
						    = ((Class282.anIntArray4430
							[(-1307505439
							  * component.anInt853) << 3])
						       * (component.anInt890 * -765284509
							  << 2)) >> 14;
						int i_52_
						    = (((component.anInt890 * -765284509
							 << 2)
							* (Class282.anIntArray4441
							   [(component.anInt853
							     * -1307505439) << 3]))
						       >> 14);
						client.aClass266_8291.method5125
						    (0.0F, 0.0F, 1.0F,
						     (Class282.method5490
						      (-(component.anInt886 * -383857477)
						       << 3)));
						client.aClass266_8291.method5128
						    (0.0F, 1.0F, 0.0F,
						     Class282.method5490(((component
									   .anInt885)
									  * 645192277)
									 << 3));
						client.aClass266_8291.method5133
						    ((float) ((-448902767
							       * component.anInt809)
							      << 2),
						     (float) (i_42_
							      + (i_51_
								 + ((-516485199
								     * (component
									.anInt882))
								    << 2))),
						     (float) (i_52_
							      + ((component.anInt882
								  * -516485199)
								 << 2)));
						client.aClass266_8291.method5128
						    (1.0F, 0.0F, 0.0F,
						     (Class282.method5490
						      (component.anInt853 * -1307505439
						       << 3)));
					    }
					    component.method1582(Class236.aClass103_2713,
							       class89,
							       client.aClass266_8291,
							       client.anInt8296,
							       (byte) -75);
					    Class236.aClass103_2713.method2295();
					    Class236.aClass103_2713.method2279(true);
					    Class236.aClass103_2713
						.method2445(i_5_, i_6_, i_7_, i_8_);
					    if (client.aBool8295)
						Class236.aClass103_2713.method2258
						    (i_15_, i_16_,
						     (i_15_
						      + component.anInt850 * 439139681),
						     i_16_ + (1463495207
							      * component.scrollMinY));
					    if (component.aBool904)
						client.aClass238_8477.method4833
						    (497010397).method11394
						    ((float) (component.anInt910
							      * -224201651) / 256.0F,
						     ((float) (504829155
							       * component.anInt942)
						      / 256.0F),
						     (float) (component.anInt896
							      * 67925249) / 256.0F,
						     -1328902389 * component.anInt867,
						     66551801 * component.anInt905,
						     component.anInt1006 * -1673293409,
						     -1590660397 * component.anInt907,
						     -2025444893 * component.anInt954,
						     (byte) -40);
					    else
						client.aClass238_8477.method4833
						    (-967585906)
						    .method11401(-882335026);
					    class89.method1890(client.aClass266_8291,
							       null, 1);
					    if (!component.aBool893
						&& null != component.aClass489_955)
						Class236.aClass103_2713.method2305
						    (component.aClass489_955
							 .method11171());
					    if (client.aBool8295)
						Class236.aClass103_2713.method2445
						    (i_5_, i_6_, i_7_, i_8_);
					    Class236.aClass103_2713.method2279(false);
					    Class236.aClass103_2713.method2572();
					    Class236.aClass103_2713
						.method2445(i_5_, i_6_, i_7_, i_8_);
					    if (component.aBool904)
						client.aClass238_8477.method4833
						    (1830034754)
						    .method11401(-1137109503);
					    if (component.aBool826)
						Class236.aClass103_2713
						    .method2308(true);
					}
			    } else if (component.componentType * -1579470857 == 9) {
				int i_53_;
				int i_54_;
				int i_55_;
				int i_56_;
				if (component.aBool868) {
				    i_53_ = i_15_;
				    i_54_ = (i_16_
					     + 1463495207 * component.scrollMinY);
				    i_55_
					= i_15_ + 439139681 * component.anInt850;
				    i_56_ = i_16_;
				} else {
				    i_53_ = i_15_;
				    i_54_ = i_16_;
				    i_55_
					= i_15_ + component.anInt850 * 439139681;
				    i_56_ = (1463495207 * component.scrollMinY
					     + i_16_);
				}
				if (1 == component.anInt985 * 1684381)
				    Class236.aClass103_2713.method2274
					(i_53_, i_54_, i_55_, i_56_,
					 (~0xffffff
					  | component.colour * -1687836431),
					 0);
				else
				    Class236.aClass103_2713.method2278
					(i_53_, i_54_, i_55_, i_56_,
					 (~0xffffff
					  | component.colour * -1687836431),
					 component.anInt985 * 1684381, 0);
			    }
			}
		    }
		}
	    }
	}
    }
}
