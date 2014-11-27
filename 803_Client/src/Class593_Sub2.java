/* Class593_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class593_Sub2 extends Class593
{
    long aLong10250 = 0L;
    long aLong10251 = 0L;
    long aLong10252 = 0L;
    int anInt10253;
    int anInt10254;
    long[] aLongArray10255 = new long[10];
    
    int method12926(long l) {
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250) {
	    ((Class593_Sub2) this).aLong10252
		+= (-6454523911676275463L * ((Class593_Sub2) this).aLong10251
		    - (1227862905663414869L
		       * ((Class593_Sub2) this).aLong10250));
	    ((Class593_Sub2) this).aLong10250
		+= (((Class593_Sub2) this).aLong10251 * -7680282206769368043L
		    - ((Class593_Sub2) this).aLong10250 * 1L);
	    ((Class593_Sub2) this).aLong10251 += l * 8845820430184374909L;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class593_Sub2) this).aLong10251 += 8845820430184374909L * l;
	} while (i < 10
		 && (646387881721308885L * ((Class593_Sub2) this).aLong10251
		     < (7139728036878653377L
			* ((Class593_Sub2) this).aLong10250)));
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    < ((Class593_Sub2) this).aLong10250 * 7139728036878653377L)
	    ((Class593_Sub2) this).aLong10251
		= ((Class593_Sub2) this).aLong10250 * 6829709807604595517L;
	return i;
    }
    
    int method12938(long l) {
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250) {
	    ((Class593_Sub2) this).aLong10252
		+= (-6454523911676275463L * ((Class593_Sub2) this).aLong10251
		    - (1227862905663414869L
		       * ((Class593_Sub2) this).aLong10250));
	    ((Class593_Sub2) this).aLong10250
		+= (((Class593_Sub2) this).aLong10251 * -7680282206769368043L
		    - ((Class593_Sub2) this).aLong10250 * 1L);
	    ((Class593_Sub2) this).aLong10251 += l * 8845820430184374909L;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class593_Sub2) this).aLong10251 += 8845820430184374909L * l;
	} while (i < 10
		 && (646387881721308885L * ((Class593_Sub2) this).aLong10251
		     < (7139728036878653377L
			* ((Class593_Sub2) this).aLong10250)));
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    < ((Class593_Sub2) this).aLong10250 * 7139728036878653377L)
	    ((Class593_Sub2) this).aLong10251
		= ((Class593_Sub2) this).aLong10250 * 6829709807604595517L;
	return i;
    }
    
    long method12929(byte i) {
	((Class593_Sub2) this).aLong10250
	    += method16571((byte) 86) * -7240670947455567807L;
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250)
	    return ((((Class593_Sub2) this).aLong10251 * 646387881721308885L
		     - (((Class593_Sub2) this).aLong10250
			* 7139728036878653377L))
		    / 1000000L);
	return 0L;
    }
    
    Class593_Sub2() {
	((Class593_Sub2) this).anInt10254 = 0;
	((Class593_Sub2) this).anInt10253 = 1057653947;
	((Class593_Sub2) this).aLong10250
	    = System.nanoTime() * -7240670947455567807L;
	((Class593_Sub2) this).aLong10251
	    = System.nanoTime() * 8845820430184374909L;
    }
    
    long method12934(int i) {
	return ((Class593_Sub2) this).aLong10250 * 7139728036878653377L;
    }
    
    long method16571(byte i) {
	long l = System.nanoTime();
	long l_0_
	    = l - ((Class593_Sub2) this).aLong10252 * -6644987626826300483L;
	((Class593_Sub2) this).aLong10252 = -7636404392930193515L * l;
	if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
	    ((Class593_Sub2) this).aLongArray10255
		[((Class593_Sub2) this).anInt10254 * -1133685781]
		= l_0_;
	    ((Class593_Sub2) this).anInt10254
		= ((1 + ((Class593_Sub2) this).anInt10254 * -1133685781) % 10
		   * -1649787709);
	    if (((Class593_Sub2) this).anInt10253 * -174251917 < 1)
		((Class593_Sub2) this).anInt10253 += 1057653947;
	}
	long l_1_ = 0L;
	for (int i_2_ = 1;
	     i_2_ <= ((Class593_Sub2) this).anInt10253 * -174251917; i_2_++)
	    l_1_ += (((Class593_Sub2) this).aLongArray10255
		     [(((Class593_Sub2) this).anInt10254 * -1133685781 - i_2_
		       + 10) % 10]);
	return l_1_ / (long) (((Class593_Sub2) this).anInt10253 * -174251917);
    }
    
    void method12932() {
	((Class593_Sub2) this).aLong10252 = 0L;
	if (646387881721308885L * ((Class593_Sub2) this).aLong10251
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250)
	    ((Class593_Sub2) this).aLong10250
		+= (((Class593_Sub2) this).aLong10251 * -7680282206769368043L
		    - ((Class593_Sub2) this).aLong10250 * 1L);
    }
    
    void method12928(byte i) {
	((Class593_Sub2) this).aLong10252 = 0L;
	if (646387881721308885L * ((Class593_Sub2) this).aLong10251
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250)
	    ((Class593_Sub2) this).aLong10250
		+= (((Class593_Sub2) this).aLong10251 * -7680282206769368043L
		    - ((Class593_Sub2) this).aLong10250 * 1L);
    }
    
    long method12933() {
	((Class593_Sub2) this).aLong10250
	    += method16571((byte) 45) * -7240670947455567807L;
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250)
	    return ((((Class593_Sub2) this).aLong10251 * 646387881721308885L
		     - (((Class593_Sub2) this).aLong10250
			* 7139728036878653377L))
		    / 1000000L);
	return 0L;
    }
    
    long method12930() {
	((Class593_Sub2) this).aLong10250
	    += method16571((byte) 44) * -7240670947455567807L;
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250)
	    return ((((Class593_Sub2) this).aLong10251 * 646387881721308885L
		     - (((Class593_Sub2) this).aLong10250
			* 7139728036878653377L))
		    / 1000000L);
	return 0L;
    }
    
    long method16572() {
	long l = System.nanoTime();
	long l_3_
	    = l - ((Class593_Sub2) this).aLong10252 * -6644987626826300483L;
	((Class593_Sub2) this).aLong10252 = -7636404392930193515L * l;
	if (l_3_ > -5000000000L && l_3_ < 5000000000L) {
	    ((Class593_Sub2) this).aLongArray10255
		[((Class593_Sub2) this).anInt10254 * -1133685781]
		= l_3_;
	    ((Class593_Sub2) this).anInt10254
		= ((1 + ((Class593_Sub2) this).anInt10254 * -1133685781) % 10
		   * -1649787709);
	    if (((Class593_Sub2) this).anInt10253 * -174251917 < 1)
		((Class593_Sub2) this).anInt10253 += 1057653947;
	}
	long l_4_ = 0L;
	for (int i = 1; i <= ((Class593_Sub2) this).anInt10253 * -174251917;
	     i++)
	    l_4_ += (((Class593_Sub2) this).aLongArray10255
		     [(((Class593_Sub2) this).anInt10254 * -1133685781 - i
		       + 10) % 10]);
	return l_4_ / (long) (((Class593_Sub2) this).anInt10253 * -174251917);
    }
    
    int method12936(long l) {
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250) {
	    ((Class593_Sub2) this).aLong10252
		+= (-6454523911676275463L * ((Class593_Sub2) this).aLong10251
		    - (1227862905663414869L
		       * ((Class593_Sub2) this).aLong10250));
	    ((Class593_Sub2) this).aLong10250
		+= (((Class593_Sub2) this).aLong10251 * -7680282206769368043L
		    - ((Class593_Sub2) this).aLong10250 * 1L);
	    ((Class593_Sub2) this).aLong10251 += l * 8845820430184374909L;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class593_Sub2) this).aLong10251 += 8845820430184374909L * l;
	} while (i < 10
		 && (646387881721308885L * ((Class593_Sub2) this).aLong10251
		     < (7139728036878653377L
			* ((Class593_Sub2) this).aLong10250)));
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    < ((Class593_Sub2) this).aLong10250 * 7139728036878653377L)
	    ((Class593_Sub2) this).aLong10251
		= ((Class593_Sub2) this).aLong10250 * 6829709807604595517L;
	return i;
    }
    
    int method12937(long l) {
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250) {
	    ((Class593_Sub2) this).aLong10252
		+= (-6454523911676275463L * ((Class593_Sub2) this).aLong10251
		    - (1227862905663414869L
		       * ((Class593_Sub2) this).aLong10250));
	    ((Class593_Sub2) this).aLong10250
		+= (((Class593_Sub2) this).aLong10251 * -7680282206769368043L
		    - ((Class593_Sub2) this).aLong10250 * 1L);
	    ((Class593_Sub2) this).aLong10251 += l * 8845820430184374909L;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class593_Sub2) this).aLong10251 += 8845820430184374909L * l;
	} while (i < 10
		 && (646387881721308885L * ((Class593_Sub2) this).aLong10251
		     < (7139728036878653377L
			* ((Class593_Sub2) this).aLong10250)));
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    < ((Class593_Sub2) this).aLong10250 * 7139728036878653377L)
	    ((Class593_Sub2) this).aLong10251
		= ((Class593_Sub2) this).aLong10250 * 6829709807604595517L;
	return i;
    }
    
    int method12935(long l) {
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250) {
	    ((Class593_Sub2) this).aLong10252
		+= (-6454523911676275463L * ((Class593_Sub2) this).aLong10251
		    - (1227862905663414869L
		       * ((Class593_Sub2) this).aLong10250));
	    ((Class593_Sub2) this).aLong10250
		+= (((Class593_Sub2) this).aLong10251 * -7680282206769368043L
		    - ((Class593_Sub2) this).aLong10250 * 1L);
	    ((Class593_Sub2) this).aLong10251 += l * 8845820430184374909L;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class593_Sub2) this).aLong10251 += 8845820430184374909L * l;
	} while (i < 10
		 && (646387881721308885L * ((Class593_Sub2) this).aLong10251
		     < (7139728036878653377L
			* ((Class593_Sub2) this).aLong10250)));
	if (((Class593_Sub2) this).aLong10251 * 646387881721308885L
	    < ((Class593_Sub2) this).aLong10250 * 7139728036878653377L)
	    ((Class593_Sub2) this).aLong10251
		= ((Class593_Sub2) this).aLong10250 * 6829709807604595517L;
	return i;
    }
    
    long method12940() {
	return ((Class593_Sub2) this).aLong10250 * 7139728036878653377L;
    }
    
    long method12939() {
	return ((Class593_Sub2) this).aLong10250 * 7139728036878653377L;
    }
    
    long method12941() {
	return ((Class593_Sub2) this).aLong10250 * 7139728036878653377L;
    }
    
    long method16573() {
	long l = System.nanoTime();
	long l_5_
	    = l - ((Class593_Sub2) this).aLong10252 * -6644987626826300483L;
	((Class593_Sub2) this).aLong10252 = -7636404392930193515L * l;
	if (l_5_ > -5000000000L && l_5_ < 5000000000L) {
	    ((Class593_Sub2) this).aLongArray10255
		[((Class593_Sub2) this).anInt10254 * -1133685781]
		= l_5_;
	    ((Class593_Sub2) this).anInt10254
		= ((1 + ((Class593_Sub2) this).anInt10254 * -1133685781) % 10
		   * -1649787709);
	    if (((Class593_Sub2) this).anInt10253 * -174251917 < 1)
		((Class593_Sub2) this).anInt10253 += 1057653947;
	}
	long l_6_ = 0L;
	for (int i = 1; i <= ((Class593_Sub2) this).anInt10253 * -174251917;
	     i++)
	    l_6_ += (((Class593_Sub2) this).aLongArray10255
		     [(((Class593_Sub2) this).anInt10254 * -1133685781 - i
		       + 10) % 10]);
	return l_6_ / (long) (((Class593_Sub2) this).anInt10253 * -174251917);
    }
    
    void method12943() {
	((Class593_Sub2) this).aLong10252 = 0L;
	if (646387881721308885L * ((Class593_Sub2) this).aLong10251
	    > 7139728036878653377L * ((Class593_Sub2) this).aLong10250)
	    ((Class593_Sub2) this).aLong10250
		+= (((Class593_Sub2) this).aLong10251 * -7680282206769368043L
		    - ((Class593_Sub2) this).aLong10250 * 1L);
    }
    
    static final void method16574(ClientScriptData class454, byte i) {
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	boolean bool = true;
	if (i_7_ < 0)
	    bool = 0 == (i_7_ + 1) % 4;
	else if (i_7_ < 1582)
	    bool = 0 == i_7_ % 4;
	else if (0 != i_7_ % 4)
	    bool = false;
	else if (0 != i_7_ % 100)
	    bool = true;
	else if (0 != i_7_ % 400)
	    bool = false;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = bool ? 1 : 0;
    }
}
