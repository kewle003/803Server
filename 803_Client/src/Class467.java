/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class467
{
    public int anInt6318;
    int anInt6319;
    public int anInt6320 = 0;
    public int anInt6321 = 1971489409;
    public int anInt6322;
    public int anInt6323;
    static final int anInt6324 = 1190717;
    public int anInt6325;
    public int anInt6326;
    public boolean aBool6327;
    public int anInt6328;
    public int anInt6329;
    public int anInt6330;
    public boolean aBool6331;
    public int anInt6332;
    public boolean aBool6333 = true;
    
    void method10725() {
	anInt6326 = (anInt6326 * -510171953 << 8
		     | 1856541379 * ((Class467) this).anInt6319) * 526328367;
    }
    
    void method10726(byte i) {
	anInt6326 = (anInt6326 * -510171953 << 8
		     | 1856541379 * ((Class467) this).anInt6319) * 526328367;
    }
    
    void method10727(RSByteBuffer class241_sub3, int i, byte i_0_) {
	if (1 == i)
	    anInt6320
		= Class103.method2632(class241_sub3.readTriByte(1771646547),
				      105883085) * -71702845;
	else if (i == 2)
	    anInt6321 = class241_sub3.readUnsignedByte((byte) -24) * -1971489409;
	else if (3 == i) {
	    anInt6321 = class241_sub3.readUnsignedShort(1162222719) * -1971489409;
	    if (65535 == -701216129 * anInt6321)
		anInt6321 = 1971489409;
	} else if (i == 5)
	    aBool6333 = false;
	else if (i == 7)
	    anInt6323
		= Class103.method2632(class241_sub3.readTriByte(1771646547),
				      -398738558) * -431816323;
	else if (8 != i) {
	    if (i == 9)
		anInt6322 = ((class241_sub3.readUnsignedShort(1162222719) << 2)
			     * -2133144185);
	    else if (i == 10)
		aBool6331 = false;
	    else if (i == 11)
		anInt6326 = class241_sub3.readUnsignedByte((byte) -1) * 526328367;
	    else if (i == 12)
		aBool6327 = true;
	    else if (i == 13)
		anInt6328 = class241_sub3.readTriByte(1771646547) * 2039603815;
	    else if (14 == i)
		anInt6329
		    = (class241_sub3.readUnsignedByte((byte) 37) << 2) * -47677759;
	    else if (16 == i)
		anInt6330 = class241_sub3.readUnsignedByte((byte) -12) * -252750329;
	    else if (i == 20)
		anInt6318 = class241_sub3.readUnsignedShort(1162222719) * 1139676675;
	    else if (i == 21)
		anInt6332 = class241_sub3.readUnsignedByte((byte) 33) * 475491765;
	    else if (i == 22)
		anInt6325
		    = class241_sub3.readUnsignedShort(1162222719) * -1167398339;
	}
    }
    
    void method10728(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -8);
	    if (i == 0)
		break;
	    method10727(class241_sub3, i, (byte) -93);
	}
    }
    
    void method10729(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 100);
	    if (i == 0)
		break;
	    method10727(class241_sub3, i, (byte) 0);
	}
    }
    
    Class467() {
	anInt6323 = 431816323;
	anInt6322 = -1248129536;
	aBool6331 = true;
	anInt6326 = -84340360;
	aBool6327 = false;
	anInt6328 = 1678262155;
	anInt6329 = 1243590720;
	anInt6330 = -26824455;
	anInt6318 = -1214813507;
	anInt6332 = 0;
	anInt6325 = -1699049664;
    }
    
    void method10730(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 15);
	    if (i == 0)
		break;
	    method10727(class241_sub3, i, (byte) -36);
	}
    }
    
    void method10731(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -6);
	    if (i == 0)
		break;
	    method10727(class241_sub3, i, (byte) -128);
	}
    }
    
    void method10732(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 4);
	    if (i == 0)
		break;
	    method10727(class241_sub3, i, (byte) -114);
	}
    }
    
    void method10733(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_1_ = class241_sub3.readUnsignedByte((byte) 26);
	    if (i_1_ == 0)
		break;
	    method10727(class241_sub3, i_1_, (byte) -84);
	}
    }
    
    void method10734() {
	anInt6326 = (anInt6326 * -510171953 << 8
		     | 1856541379 * ((Class467) this).anInt6319) * 526328367;
    }
    
    static int method10735(int i) {
	if (i == 16711935)
	    return -1;
	return VarPlayerDomain.method11651(i, (byte) -78);
    }
    
    static int method10736(int i) {
	if (i == 16711935)
	    return -1;
	return VarPlayerDomain.method11651(i, (byte) -54);
    }
    
    static int method10737(int i) {
	if (i == 16711935)
	    return -1;
	return VarPlayerDomain.method11651(i, (byte) -5);
    }
    
    static final void setKeyTypedEvent/*method10738*/(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
		String string = (String) (((ClientScriptData) class454).objectStack
					  [(((ClientScriptData) class454).objectStackPointer
					    -= -1650705371) * -290357331]);
		if (Class8.extractVarWatchKeys(string, class454, (byte) -114) != null)
		    string = string.substring(0, string.length() - 1);
		class58.onKeyTypedScript
		    = Class299.extractCs2Params(string, class454, -330168774);
		class58.hasClientScript = true;
    }
    
    static final void method10739(ClientScriptData class454, byte i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_2_, (byte) -42);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_2_ >> 16];
	Class482.method11020(class58, class35, class454, (byte) -109);
    }
    
    public static int method10740(String string, int i) {
	return string.length() + 2;
    }
    
    static final void method10741(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869
		  .method14352((byte) -22) == 2 ? 1 : 0;
    }
}
