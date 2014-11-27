/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class121 implements Interface29
{
    SoundManager this$0;
    
    public float method173() {
	return ((float) Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8868.method14143(1970192021)
		/ 255.0F);
    }
    
    public float method174(int i) {
	return ((float) Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8868.method14143(1937959520)
		/ 255.0F);
    }
    
    Class121(SoundManager class49) {
	((Class121) this).this$0 = class49;
    }
    
    static final void method2973(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	Class287 class287
	    = Class287.method5561((float) i_0_, (float) i_1_, (float) i_2_);
	Class445_Sub16.aClass351_Sub1_8660.method6268(class287, (byte) 87);
	class287.method5564();
    }
    
    static final void method2974
	(Entity class475_sub1_sub1_sub3, byte i) {
	Class409_Sub1 class409_sub1
	    = class475_sub1_sub1_sub3.aClass409_Sub1_11405;
	if (class409_sub1.method7364(2002137465)
	    && class409_sub1.method7411(1, (byte) 1)
	    && class409_sub1.method7419((byte) 58)) {
	    if (class409_sub1.aBool8600) {
		class409_sub1.method7344(class475_sub1_sub1_sub3.method17787
					     (2090977411)
					     .method12256(847630822),
					 false, true, -1492506501);
		class409_sub1.aBool8600 = class409_sub1.method7364(1691447);
	    }
	    class409_sub1.method7379(736693346);
	}
	for (int i_3_ = 0;
	     i_3_ < class475_sub1_sub1_sub3.aClass244Array11404.length;
	     i_3_++) {
	    if ((class475_sub1_sub1_sub3.aClass244Array11404[i_3_].graphicsID
		 * 1967872619)
		!= -1) {
		Class409 class409
		    = (class475_sub1_sub1_sub3.aClass244Array11404[i_3_]
		       .aClass409_3935);
		if (class409.method7349(-517859480)) {
		    GraphicsDefinition class460
			= (Class240.graphicsDefLoader.getGraphicsDefinition
			   ((class475_sub1_sub1_sub3.aClass244Array11404[i_3_]
			     .graphicsID) * 1967872619,
			    1232200923));
		    AnimationDefinition class549 = class409.method7345((byte) -86);
		    if (class460.aBool6277) {
			if (3 == 2119332939 * class549.anInt7088) {
			    if ((class475_sub1_sub1_sub3.anInt11430
				 * -928701413) > 0
				&& ((1663546767
				     * class475_sub1_sub1_sub3.anInt11386)
				    <= client.anInt8296)
				&& (class475_sub1_sub1_sub3.anInt11422
				    * -1825056437) < client.anInt8296) {
				class409.method7347(-1, -1502666586);
				class475_sub1_sub1_sub3.aClass244Array11404
				    [i_3_].graphicsID
				    = 1386773949;
				continue;
			    }
			} else if (1 == class549.anInt7088 * 2119332939
				   && -928701413 * (class475_sub1_sub1_sub3
						    .anInt11430) > 0
				   && (class475_sub1_sub1_sub3.anInt11386
				       * 1663546767) <= client.anInt8296
				   && ((-1825056437
					* class475_sub1_sub1_sub3.anInt11422)
				       < client.anInt8296))
			    continue;
		    }
		}
		if (class409.method7411(1, (byte) 1)
		    && class409.method7419((byte) 22)) {
		    class409.method7347(-1, 484606429);
		    class475_sub1_sub1_sub3.aClass244Array11404[i_3_].graphicsID
			= 1386773949;
		}
	    }
	}
	Class409 class409 = class475_sub1_sub1_sub3.aClass409_11375;
	do {
	    if (class409.method7364(-1798935554)) {
		AnimationDefinition class549 = class409.method7345((byte) 38);
		if (2119332939 * class549.anInt7088 == 3) {
		    if (-928701413 * class475_sub1_sub1_sub3.anInt11430 > 0
			&& (class475_sub1_sub1_sub3.anInt11386 * 1663546767
			    <= client.anInt8296)
			&& (class475_sub1_sub1_sub3.anInt11422 * -1825056437
			    < client.anInt8296)) {
			class475_sub1_sub1_sub3.anIntArray11397 = null;
			class409.method7347(-1, 1461033109);
			break;
		    }
		} else if (2119332939 * class549.anInt7088 == 1) {
		    if (-928701413 * class475_sub1_sub1_sub3.anInt11430 > 0
			&& (1663546767 * class475_sub1_sub1_sub3.anInt11386
			    <= client.anInt8296)
			&& (-1825056437 * class475_sub1_sub1_sub3.anInt11422
			    < client.anInt8296)) {
			class409.method7355(1, 478343361);
			break;
		    }
		    class409.method7355(0, 298041402);
		}
		if (class409.method7411(1, (byte) 1)
		    && class409.method7419((byte) 77)) {
		    class475_sub1_sub1_sub3.anIntArray11397 = null;
		    class409.method7347(-1, 12403930);
		}
	    }
	} while (false);
	for (int i_4_ = 0;
	     (i_4_
	      < class475_sub1_sub1_sub3.aClass409_Sub3_Sub1Array11417.length);
	     i_4_++) {
	    Class409_Sub3_Sub1 class409_sub3_sub1
		= class475_sub1_sub1_sub3.aClass409_Sub3_Sub1Array11417[i_4_];
	    if (class409_sub3_sub1 != null) {
		if (class409_sub3_sub1.anInt10737 * -1543422803 > 0)
		    class409_sub3_sub1.anInt10737 -= 394233637;
		else if (class409_sub3_sub1.method7411(1, (byte) 1)
			 && class409_sub3_sub1.method7419((byte) 35))
		    class475_sub1_sub1_sub3.aClass409_Sub3_Sub1Array11417[i_4_]
			= null;
	    }
	}
    }
    
    static void method2975(int i, int i_5_, int i_6_, int i_7_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(9, (long) i);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 = -1741260507 * i_5_;
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951 = i_6_ * 1861259375;
    }
    
    static final void method2976(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1669999329 * class58.scrollCurrentY;
    }
    
    static final void method2977(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	int i_8_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (i_8_ == -1)
	    throw new RuntimeException("");
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = new StringBuilder().append(string).append((char) i_8_)
		  .toString();
    }
}
