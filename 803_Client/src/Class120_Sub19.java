/* Class120_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub19 extends Class120
{
    int anInt10611;
    int anInt10612;
    int anInt10613;
    int anInt10614;
    int anInt10615;
    int anInt10616;
    
    public void method2961() {
	Class104.aClass123Array1475
	    [1380890555 * ((Class120_Sub19) this).anInt10614]
	    .method2987(0, -1730190293);
	Class104.aClass123Array1475
	    [739160117 * ((Class120_Sub19) this).anInt10611]
	    .method2987(1, -1730190293);
	client.anInt8418 = 0;
	client.anInt8399 = -84240625 * ((Class120_Sub19) this).anInt10613;
	client.anInt8401 = 0;
	client.anInt8402 = 1121446867 * ((Class120_Sub19) this).anInt10615;
	client.anInt8579 = ((Class120_Sub19) this).anInt10616 * 19528849;
	client.anInt8480 = 759340061;
	client.anInt8400 = ((Class120_Sub19) this).anInt10612 * -88437495;
	Class296.anInt4513 = -94060778;
	Class515.method11603(1578858823);
	client.aBool8354 = true;
    }
    
    public void method2958(int i) {
	Class104.aClass123Array1475
	    [1380890555 * ((Class120_Sub19) this).anInt10614]
	    .method2987(0, -1730190293);
	Class104.aClass123Array1475
	    [739160117 * ((Class120_Sub19) this).anInt10611]
	    .method2987(1, -1730190293);
	client.anInt8418 = 0;
	client.anInt8399 = -84240625 * ((Class120_Sub19) this).anInt10613;
	client.anInt8401 = 0;
	client.anInt8402 = 1121446867 * ((Class120_Sub19) this).anInt10615;
	client.anInt8579 = ((Class120_Sub19) this).anInt10616 * 19528849;
	client.anInt8480 = 759340061;
	client.anInt8400 = ((Class120_Sub19) this).anInt10612 * -88437495;
	Class296.anInt4513 = -94060778;
	Class515.method11603(2066996963);
	client.aBool8354 = true;
    }
    
    Class120_Sub19(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub19) this).anInt10614
	    = class241_sub3.readUnsignedShort(1162222719) * -674138765;
	((Class120_Sub19) this).anInt10611
	    = class241_sub3.readUnsignedShort(1162222719) * 1863524893;
	((Class120_Sub19) this).anInt10613
	    = class241_sub3.readUnsignedShort(1162222719) * -1796203445;
	((Class120_Sub19) this).anInt10612
	    = class241_sub3.readUnsignedShort(1162222719) * 227675833;
	((Class120_Sub19) this).anInt10615
	    = class241_sub3.readUnsignedShort(1162222719) * 1097975173;
	((Class120_Sub19) this).anInt10616
	    = class241_sub3.readUnsignedShort(1162222719) * -817357343;
    }
    
    static final void method16843(int i) {
		for (int key = Class1.aClass19_11.varPlayerDomain.method11640(true, (byte) 0);
				key != -1;
				key = Class1.aClass19_11.varPlayerDomain.method11640(false, (byte) 0)) {
		    Class218_Sub3.method16575(key, (byte) 112);
		    client.recentVarpChanged[(client.varpChangePointer += -1426863921) * -1297859025 - 1 & 0x1f] = key;
		}
		for (Class241_Sub39_Sub13 class241_sub39_sub13 = Exception_Sub5.method16955(-1903714065);
				null != class241_sub39_sub13;
				class241_sub39_sub13 = Exception_Sub5.method16955(-2020429195)) {
		    int opcode = class241_sub39_sub13.method17280((byte) 8);
		    long hash = class241_sub39_sub13.method17291(1162729834);
		    if (opcode == 1) {//VarClient
				VarType class179 = Class463.VAR_CLIENT_LIST.list((int) hash, -1784984067);
				Class473.varClientDomain.setVarValueInt(class179,
								      (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 * 2092628653),
								      -812172954);
				client.recentVarcChanged[(client.varcChangedPointer += -92334061) * 1352692251 - 1 & 0x1f] = (int) hash;
		    } else if (2 == opcode) {//VarClient string
				VarType class179 = Class463.VAR_CLIENT_LIST.list((int) hash, -1977256920);
				Class473.varClientDomain.setVarValue(class179,
						((Class241_Sub39_Sub13) class241_sub39_sub13).aString10956, (byte) 109);
				client.recentVarcstrChanged[(client.varcstrChangedPointer += -581404301) * 1195725755 - 1 & 0x1f] = (int) hash;
		    } else if (3 == opcode) {//Component text
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -71);
				if (!((Class241_Sub39_Sub13) class241_sub39_sub13).aString10956.equals(component.text)) {
					component.text = ((Class241_Sub39_Sub13) class241_sub39_sub13).aString10956;
				    WorldType.refreshComponent(component, 915709576);
				}
		    } else if (opcode == 23) {
				InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -53);
				if (((((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 * 2092628653) == 1)
						!= class58.aBool854) {
				    class58.aBool854 = 2092628653 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 == 1;
				    WorldType.refreshComponent(class58, -539291084);
				}
		    } else if (4 == opcode) {//Set model
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -46);
				int type = ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 * 2092628653;
				int index = -1980051825 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951;
				int i_4_ = (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10935 * 415764489);
				if (type != component.modelType * -982148763
						|| index != 1965460551 * component.anInt879
						|| 408732473 * component.anInt880 != i_4_) {
					component.modelType = type * -969674643;
					component.anInt879 = index * 2003393911;
					component.anInt880 = -424199415 * i_4_;
					component.aClass404_1014 = null;
				    WorldType.refreshComponent(component, -898198338);
				}
		    } else if (opcode == 5) {//Set animation
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -18);
				if (-812116149 * component.anInt818 != ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 * 2092628653) {
				    if (-1 != (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941) * 2092628653) {
						if (component.aClass409_998 == null) {
							component.aClass409_998 = new Class409_Sub2();
						}
						component.aClass409_998.method7347(
								((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 * 2092628653,
								-1850982892);
				    } else {
				    	component.aClass409_998 = null;
				    }
				    component.anInt818 = -932044057 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941;
				    WorldType.refreshComponent(component, 1433939252);
				}
		    } else if (6 == opcode) {//Set colour
				int i_5_ = (2092628653 * (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941));
				int i_6_ = i_5_ >> 10 & 0x1f;
				int i_7_ = i_5_ >> 5 & 0x1f;
				int i_8_ = i_5_ & 0x1f;
				int newColour = (i_6_ << 19) + (i_7_ << 11) + (i_8_ << 3);
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -106);
				if (component.colour * -1687836431 != newColour) {
					component.colour = 1652312081 * newColour;
				    WorldType.refreshComponent(component, 1075369572);
				}
		    } else if (7 == opcode) {//Component hidden
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -29);
				boolean bool = 1 == 2092628653 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941;
				if (bool != component.hidden) {
					component.hidden = bool;
				    WorldType.refreshComponent(component, 1094215123);
				}
		    } else if (opcode == 8) {//Set object
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -77);
				if ((component.anInt853 * -1307505439 != 2092628653 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941)
						|| (component.anInt885 * 645192277 
								!= (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951) * -1980051825)
						|| (-765284509 * component.anInt890
								!= (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10935) * 415764489)) {
					component.anInt853 = (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941) * 262830925;
					component.anInt885 = -665390765 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951;
					component.anInt890 = 1223380131 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10935;
				    if (877329925 * component.slot2 != -1) {
						if (component.anInt891 * -1690898139 > 0) {
							component.anInt890
								= -1219737013 * (1280699488 * component.anInt890 / (component.anInt891 * -1690898139));
						} else if (-393932859 * component.fixedWidth > 0) {
							component.anInt890
								= -1219737013 * (1280699488 * component.anInt890 / (component.fixedWidth * -393932859));
						}
				    }
				    WorldType.refreshComponent(component, 815748628);
				}
		    } else if (opcode == 9) {
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -82);
				if (2092628653 * (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941) 
							!= 877329925 * component.slot2
						|| (component.anInt975 * 1809275135
								!= (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951) * -1980051825)) {
					component.slot2 = (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941) * 1169752713;
					component.anInt975 = 628980337 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951;
				    WorldType.refreshComponent(component, 1905419191);
				}
		    } else if (opcode == 10) {
				InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -30);
				if ((class58.anInt809 * -448902767
				     != 2092628653 * ((Class241_Sub39_Sub13)
						      class241_sub39_sub13).anInt10941)
				    || (-1980051825 * ((Class241_Sub39_Sub13)
						       class241_sub39_sub13).anInt10951
					!= class58.anInt882 * -516485199)
				    || (-383857477 * class58.anInt886
					!= 415764489 * ((Class241_Sub39_Sub13)
							class241_sub39_sub13).anInt10935)) {
				    class58.anInt809
					= (((Class241_Sub39_Sub13) class241_sub39_sub13)
					   .anInt10941) * -101863075;
				    class58.anInt882
					= -1338817 * ((Class241_Sub39_Sub13)
						      class241_sub39_sub13).anInt10951;
				    class58.anInt886
					= (((Class241_Sub39_Sub13) class241_sub39_sub13)
					   .anInt10935) * -1794274293;
				    WorldType.refreshComponent(class58, 1638879473);
				}
		    } else if (opcode == 11) {//Set position
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -87);
				component.locationXMode = (byte) 0;
				component.anInt928 = ((component.drawOffsetX = 1088078225 * ((Class241_Sub39_Sub13)
							class241_sub39_sub13).anInt10941) * -1943704289);
				component.locationYMode = (byte) 0;
				component.anInt894 = ((component.drawOffsetY = -1896134899 * ((Class241_Sub39_Sub13)
							 class241_sub39_sub13).anInt10951) * 1694697129);
				WorldType.refreshComponent(component, 2026737939);
		    } else if (12 == opcode) {//Set scroll
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -86);
				int scroll = (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 * 2092628653);
				if (component != null && component.componentType * -1579470857 == 0) {
				    if (scroll > (component.scrollMaxY * 1204737107 - component.scrollMinY * 1463495207)) {
				    	scroll = (1204737107 * component.scrollMaxY - component.scrollMinY * 1463495207);
				    }
				    if (scroll < 0) {
				    	scroll = 0;
				    }
				    if (scroll != -1669999329 * component.scrollCurrentY) {
				    	component.scrollCurrentY = scroll * 1718576863;
				    	WorldType.refreshComponent(component, 705122804);
				    }
				}
		    } else if (opcode == 13) {//Set sprite
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -47);
				component.spriteID = (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 * -43426881);
		    } else if (opcode == 14) {//Minimap flag
				Class194.aBool2302 = true;
				Class194.minimapFlagX = (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 * -809383339);
				Class194.minimapFlagY = 1428212607 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951;
		    } else if (15 == opcode) {//Set font
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -36);
				component.fontID = (((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 * 655861329);
		    } else if (opcode == 21) {
				InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -5);
				class58.aBool1007 = 2092628653 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 == 1;
		    } else if (22 == opcode) {
				InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -108);
				class58.aBool877 = 2092628653 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 == 1;
		    } else if (16 == opcode) {
				InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -104);
				class58.anInt995 = -1834094155 * ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941;
		    } else if (opcode == 17) {
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -19);
				int i_11_ = (int) (hash >> 32);
				component.method1577(i_11_,
						   (short) (2092628653
							    * (((Class241_Sub39_Sub13)
								class241_sub39_sub13)
							       .anInt10941)),
						   (short) (-1980051825
							    * (((Class241_Sub39_Sub13)
								class241_sub39_sub13)
							       .anInt10951)),
						   1002586265);
		    } else if (opcode == 20) {
				InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent((int) hash, (byte) -18);
				int i_12_ = (int) (hash >> 32);
				component.method1574(i_12_,
						   (short) (2092628653
							    * (((Class241_Sub39_Sub13)
								class241_sub39_sub13)
							       .anInt10941)),
						   (short) (((Class241_Sub39_Sub13)
							     class241_sub39_sub13).anInt10951
							    * -1980051825),
						   -244441393);
		    }
		}
    }
    
    static final void method16844(int i, int i_13_, int i_14_, int i_15_,
				  int i_16_, int i_17_, int i_18_, int i_19_) {
	int i_20_ = i_18_ - 334;
	if (i_20_ < 0)
	    i_20_ = 0;
	else if (i_20_ > 100)
	    i_20_ = 100;
	int i_21_ = (client.aShort8341
		     + i_20_ * (client.aShort8569 - client.aShort8341) / 100);
	i_17_ = i_17_ * i_21_ >> 8;
	int i_22_ = 16384 - i_15_ & 0x3fff;
	int i_23_ = 16384 - i_16_ & 0x3fff;
	int i_24_ = 0;
	int i_25_ = 0;
	int i_26_ = i_17_;
	if (i_22_ != 0) {
	    i_25_ = Class282.anIntArray4430[i_22_] * -i_26_ >> 14;
	    i_26_ = Class282.anIntArray4441[i_22_] * i_26_ >> 14;
	}
	if (0 != i_23_) {
	    i_24_ = i_26_ * Class282.anIntArray4430[i_23_] >> 14;
	    i_26_ = i_26_ * Class282.anIntArray4441[i_23_] >> 14;
	}
	Class462.anInt6284 = (i - i_24_) * 1680747237;
	Class175.anInt2123 = -1365297795 * (i_13_ - i_25_);
	Class636.anInt8248 = -1181860511 * (i_14_ - i_26_);
	Class496.anInt6527 = 709117373 * i_15_;
	Class322.anInt4909 = i_16_ * 2118136689;
	Class120_Sub18.anInt10605 = 0;
    }
    
    public static int method16845(int i, int i_27_, boolean bool,
				  boolean bool_28_, int i_29_) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool_28_, -184870682);
	if (null == class241_sub34)
	    return 0;
	int i_30_ = 0;
	for (int i_31_ = 0;
	     i_31_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length;
	     i_31_++) {
	    if (((Class241_Sub34) class241_sub34).anIntArray10085[i_31_] >= 0
		&& (((Class241_Sub34) class241_sub34).anIntArray10085[i_31_]
		    < -345685855 * JS5.itemDefLoader.num)) {
		ItemDefinition class623
		    = JS5.itemDefLoader.list((((Class241_Sub34)
							    class241_sub34)
							   .anIntArray10085
							   [i_31_]),
							  (short) -25948);
		int i_32_ = class623.getParam(i_27_,
					   (Class621.paramTypeList.list
					    (i_27_, 1890452363)
					    .defaultint) * 2015998927,
					   1728762812);
		if (bool)
		    i_30_ += (((Class241_Sub34) class241_sub34).anIntArray10086
			      [i_31_]) * i_32_;
		else
		    i_30_ += i_32_;
	    }
	}
	return i_30_;
    }
    
    public static Class168 method16846(Class103 class103, int i, int i_33_) {
	Class241_Sub10 class241_sub10
	    = (Class241_Sub10) Class447.aClass407_6181.get((long) i);
	if (null != class241_sub10) {
	    Class241_Sub40_Sub2 class241_sub40_sub2
		= ((Class241_Sub10) class241_sub10).aClass583_Sub1_8896
		      .method12786(1898322843);
	    ((Class241_Sub10) class241_sub10).aBool8901 = true;
	    if (null != class241_sub40_sub2) {
		((Class436) Class447.aClass436_6183).aClass103_6129 = class103;
		return ((Class168)
			class241_sub40_sub2
			    .method17215(Class447.aClass436_6183, 512689626));
	    }
	}
	return null;
    }
}
