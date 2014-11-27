/* Class358_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class358_Sub2 extends Class358
{
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10387;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10388;
    Class268 aClass268_10389 = new Class268();
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10390;
    Class116 aClass116_10391;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10392;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10393;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10394;
    Class55 aClass55_10395;
    Class55 aClass55_10396;
    Class55 aClass55_10397;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10398;
    
    boolean method16682() throws Exception_Sub7 {
	((Class358_Sub2) this).aClass116_10391
	    = aClass103_Sub3_5469.method15784("Particle");
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10387
	    = ((Class358_Sub2) this).aClass116_10391.method2815("WVPMatrix",
								(byte) -63);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10388
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DiffuseSampler", (byte) -106);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10398
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("TexCoordMatrix", (byte) -72);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10390
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DistanceFogPlane", (byte) -89);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10393
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DistanceFogColour", (byte) -30);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10394
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DistanceFogAmount", (byte) -53);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10392
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DiffuseColour", (byte) -37);
	((Class358_Sub2) this).aClass55_10396
	    = ((Class358_Sub2) this).aClass116_10391.method2810("NoFog",
								(byte) 1);
	((Class358_Sub2) this).aClass55_10397
	    = ((Class358_Sub2) this).aClass116_10391.method2810("ParticleFog",
								(byte) 1);
	((Class358_Sub2) this).aClass55_10395
	    = ((Class358_Sub2) this).aClass116_10391.method2810("BillboardFog",
								(byte) 1);
	if (!((Class358_Sub2) this).aClass55_10396.method1311())
	    return false;
	if (!((Class358_Sub2) this).aClass55_10397.method1311())
	    return false;
	if (!((Class358_Sub2) this).aClass55_10395.method1311())
	    return false;
	return true;
    }
    
    public Class358_Sub2(Class103_Sub3 class103_sub3) throws Exception_Sub7 {
	super(class103_sub3);
	method16683(-53752934);
    }
    
    public void method6476(Class268 class268) {
	((Class358_Sub2) this).aClass268_10389.method5199(class268);
	((Class358_Sub2) this).aClass268_10389
	    .method5202(aClass103_Sub3_5469.aClass268_9526);
    }
    
    public void method6475(int i, boolean bool) {
	((Class358_Sub2) this).aClass116_10391.method2895
	    (bool ? ((Class358_Sub2) this).aClass55_10397
	     : ((Class358_Sub2) this).aClass55_10396);
	((Class358_Sub2) this).aClass116_10391.method2805();
	method16684(bool, true, (byte) 9);
	aClass103_Sub3_5469.method15726(Class310.aClass310_4822, 0, 4 * i, 0,
					i * 2);
    }
    
    public void method6469(boolean bool) {
	((Class358_Sub2) this).aClass116_10391.method2895
	    (bool ? ((Class358_Sub2) this).aClass55_10395
	     : ((Class358_Sub2) this).aClass55_10396);
	((Class358_Sub2) this).aClass116_10391.method2805();
	method16684(bool, false, (byte) 44);
	aClass103_Sub3_5469.method15723();
    }
    
    public void method6468(int i, boolean bool) {
	((Class358_Sub2) this).aClass116_10391.method2895
	    (bool ? ((Class358_Sub2) this).aClass55_10397
	     : ((Class358_Sub2) this).aClass55_10396);
	((Class358_Sub2) this).aClass116_10391.method2805();
	method16684(bool, true, (byte) 7);
	aClass103_Sub3_5469.method15726(Class310.aClass310_4822, 0, 4 * i, 0,
					i * 2);
    }
    
    public void method6467(Class268 class268) {
	((Class358_Sub2) this).aClass268_10389.method5199(class268);
	((Class358_Sub2) this).aClass268_10389
	    .method5202(aClass103_Sub3_5469.aClass268_9526);
    }
    
    boolean method16683(int i) throws Exception_Sub7 {
	((Class358_Sub2) this).aClass116_10391
	    = aClass103_Sub3_5469.method15784("Particle");
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10387
	    = ((Class358_Sub2) this).aClass116_10391.method2815("WVPMatrix",
								(byte) -72);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10388
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DiffuseSampler", (byte) -5);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10398
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("TexCoordMatrix", (byte) -87);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10390
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DistanceFogPlane", (byte) -124);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10393
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DistanceFogColour", (byte) -5);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10394
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DistanceFogAmount", (byte) -86);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10392
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DiffuseColour", (byte) -25);
	((Class358_Sub2) this).aClass55_10396
	    = ((Class358_Sub2) this).aClass116_10391.method2810("NoFog",
								(byte) 1);
	((Class358_Sub2) this).aClass55_10397
	    = ((Class358_Sub2) this).aClass116_10391.method2810("ParticleFog",
								(byte) 1);
	((Class358_Sub2) this).aClass55_10395
	    = ((Class358_Sub2) this).aClass116_10391.method2810("BillboardFog",
								(byte) 1);
	if (!((Class358_Sub2) this).aClass55_10396.method1311())
	    return false;
	if (!((Class358_Sub2) this).aClass55_10397.method1311())
	    return false;
	if (!((Class358_Sub2) this).aClass55_10395.method1311())
	    return false;
	return true;
    }
    
    public void method6472(Class268 class268) {
	((Class358_Sub2) this).aClass268_10389.method5199(class268);
	((Class358_Sub2) this).aClass268_10389
	    .method5202(aClass103_Sub3_5469.aClass268_9526);
    }
    
    public void method6473(Class268 class268) {
	((Class358_Sub2) this).aClass268_10389.method5199(class268);
	((Class358_Sub2) this).aClass268_10389
	    .method5202(aClass103_Sub3_5469.aClass268_9526);
    }
    
    public void method6474(int i, boolean bool) {
	((Class358_Sub2) this).aClass116_10391.method2895
	    (bool ? ((Class358_Sub2) this).aClass55_10397
	     : ((Class358_Sub2) this).aClass55_10396);
	((Class358_Sub2) this).aClass116_10391.method2805();
	method16684(bool, true, (byte) 17);
	aClass103_Sub3_5469.method15726(Class310.aClass310_4822, 0, 4 * i, 0,
					i * 2);
    }
    
    public void method6471(Class268 class268) {
	((Class358_Sub2) this).aClass268_10389.method5199(class268);
	((Class358_Sub2) this).aClass268_10389
	    .method5202(aClass103_Sub3_5469.aClass268_9526);
    }
    
    public void method6470(boolean bool) {
	((Class358_Sub2) this).aClass116_10391.method2895
	    (bool ? ((Class358_Sub2) this).aClass55_10395
	     : ((Class358_Sub2) this).aClass55_10396);
	((Class358_Sub2) this).aClass116_10391.method2805();
	method16684(bool, false, (byte) 57);
	aClass103_Sub3_5469.method15723();
    }
    
    public void method6477(boolean bool) {
	((Class358_Sub2) this).aClass116_10391.method2895
	    (bool ? ((Class358_Sub2) this).aClass55_10395
	     : ((Class358_Sub2) this).aClass55_10396);
	((Class358_Sub2) this).aClass116_10391.method2805();
	method16684(bool, false, (byte) 91);
	aClass103_Sub3_5469.method15723();
    }
    
    public void method6478(boolean bool) {
	((Class358_Sub2) this).aClass116_10391.method2895
	    (bool ? ((Class358_Sub2) this).aClass55_10395
	     : ((Class358_Sub2) this).aClass55_10396);
	((Class358_Sub2) this).aClass116_10391.method2805();
	method16684(bool, false, (byte) 85);
	aClass103_Sub3_5469.method15723();
    }
    
    void method16684(boolean bool, boolean bool_0_, byte i) {
	((Class358_Sub2) this).aClass116_10391.method2828
	    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10388, 0,
	     anInterface41_5470, -638108376);
	((Class358_Sub2) this).aClass116_10391.method2837
	    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10387,
	     ((Class358_Sub2) this).aClass268_10389, (byte) -62);
	((Class358_Sub2) this).aClass116_10391.method2826
	    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10398, aClass268_5474,
	     65280);
	((Class358_Sub2) this).aClass116_10391.method2825
	    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10392, anInt5471,
	     -1130086268);
	if (bool) {
	    if (bool_0_)
		((Class358_Sub2) this).aClass116_10391.method2821
		    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10390,
		     aClass285_5472.aFloat4454, aClass285_5472.aFloat4452,
		     aClass285_5472.aFloat4453, aClass285_5472.aFloat4451,
		     (short) -29408);
	    else
		((Class358_Sub2) this).aClass116_10391.method2818
		    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10394,
		     Math.min(Math.max(aFloat5468, 0.0F), 1.0F), (byte) -25);
	    ((Class358_Sub2) this).aClass116_10391.method2820
		(((Class358_Sub2) this).aClass241_Sub23_Sub1_10393,
		 aClass287_5473.aFloat4477, aClass287_5473.aFloat4474,
		 aClass287_5473.aFloat4479, -1633425488);
	}
    }
    
    boolean method16685() throws Exception_Sub7 {
	((Class358_Sub2) this).aClass116_10391
	    = aClass103_Sub3_5469.method15784("Particle");
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10387
	    = ((Class358_Sub2) this).aClass116_10391.method2815("WVPMatrix",
								(byte) 0);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10388
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DiffuseSampler", (byte) -90);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10398
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("TexCoordMatrix", (byte) -77);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10390
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DistanceFogPlane", (byte) -40);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10393
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DistanceFogColour", (byte) -54);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10394
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DistanceFogAmount", (byte) -126);
	((Class358_Sub2) this).aClass241_Sub23_Sub1_10392
	    = ((Class358_Sub2) this).aClass116_10391
		  .method2815("DiffuseColour", (byte) -54);
	((Class358_Sub2) this).aClass55_10396
	    = ((Class358_Sub2) this).aClass116_10391.method2810("NoFog",
								(byte) 1);
	((Class358_Sub2) this).aClass55_10397
	    = ((Class358_Sub2) this).aClass116_10391.method2810("ParticleFog",
								(byte) 1);
	((Class358_Sub2) this).aClass55_10395
	    = ((Class358_Sub2) this).aClass116_10391.method2810("BillboardFog",
								(byte) 1);
	if (!((Class358_Sub2) this).aClass55_10396.method1311())
	    return false;
	if (!((Class358_Sub2) this).aClass55_10397.method1311())
	    return false;
	if (!((Class358_Sub2) this).aClass55_10395.method1311())
	    return false;
	return true;
    }
    
    void method16686(boolean bool, boolean bool_1_) {
	((Class358_Sub2) this).aClass116_10391.method2828
	    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10388, 0,
	     anInterface41_5470, 946151228);
	((Class358_Sub2) this).aClass116_10391.method2837
	    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10387,
	     ((Class358_Sub2) this).aClass268_10389, (byte) -46);
	((Class358_Sub2) this).aClass116_10391.method2826
	    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10398, aClass268_5474,
	     65280);
	((Class358_Sub2) this).aClass116_10391.method2825
	    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10392, anInt5471,
	     -407700569);
	if (bool) {
	    if (bool_1_)
		((Class358_Sub2) this).aClass116_10391.method2821
		    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10390,
		     aClass285_5472.aFloat4454, aClass285_5472.aFloat4452,
		     aClass285_5472.aFloat4453, aClass285_5472.aFloat4451,
		     (short) -28340);
	    else
		((Class358_Sub2) this).aClass116_10391.method2818
		    (((Class358_Sub2) this).aClass241_Sub23_Sub1_10394,
		     Math.min(Math.max(aFloat5468, 0.0F), 1.0F), (byte) -21);
	    ((Class358_Sub2) this).aClass116_10391.method2820
		(((Class358_Sub2) this).aClass241_Sub23_Sub1_10393,
		 aClass287_5473.aFloat4477, aClass287_5473.aFloat4474,
		 aClass287_5473.aFloat4479, -1633425488);
	}
    }
    
    static final void method16687(ClientScriptData class454, int i) {
	if ((Class445_Sub16.aClass351_Sub1_8660.method6332((short) -25560)
	     != Class39.aClass39_586)
	    || (Class445_Sub16.aClass351_Sub1_8660.method6356(-1308070598)
		!= Class61.aClass61_1020))
	    throw new RuntimeException();
	Class287 class287
	    = ((Class380_Sub2)
	       Class445_Sub16.aClass351_Sub1_8660.method6283(1948147574))
		  .method16691(1482319719);
	Class287 class287_2_
	    = ((Class434_Sub5)
	       Class445_Sub16.aClass351_Sub1_8660.method6284((byte) 1))
		  .method14128((byte) 91);
	Class287 class287_3_ = Class287.method5562(class287);
	class287_3_.method5577(class287_2_);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) class287_3_.method5559();
    }
    
    static final void method16688(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	Class287 class287
	    = Class287.method5561((float) i_4_, (float) i_4_, (float) i_4_);
	Class445_Sub16.aClass351_Sub1_8660.method6379(class287, (byte) 83);
	class287.method5564();
    }
    
    static final void method16689(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	Class109.method2766(((Class455) class455).aClass58_6248, i_5_, i_6_,
			    16711935);
    }
    
    public static void method16690(int i, int i_7_) {
	if (8 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4089,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeByte(i,
								-1273699486);
	    client.aClass190_8339.sendPacket(class241_sub27, -1706655817);
	}
    }
}
