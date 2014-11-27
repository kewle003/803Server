/* Class103_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import sun.misc.Unsafe;

@SuppressWarnings("restriction")
public abstract class Class103_Sub3 extends Class103
{
    int anInt9477;
    Class599 aClass599_9478 = new Class599();
    Class366 aClass366_9479;
    static Object anObject9480 = new Object();
    static final int anInt9481 = 2;
    protected int anInt9482;
    static final int anInt9483 = 8;
    static final int anInt9484 = 55;
    Class366 aClass366_9485;
    protected static final int anInt9486 = 100663296;
    JS5 aClass210_9487;
    protected boolean aBool9488;
    int anInt9489;
    public ByteBuffer aByteBuffer9490;
    public long aLong9491;
    protected boolean aBool9492;
    public Unsafe anUnsafe9493;
    Class375 aClass375_9494;
    NativeHeap aNativeHeap9495;
    NodeCollection aClass429_9496;
    boolean aBool9497;
    int anInt9498;
    Class89_Sub1[] aClass89_Sub1Array9499;
    Class266 aClass266_9500;
    Class268 aClass268_9501;
    int anInt9502;
    Class266 aClass266_9503;
    public Class268 aClass268_9504;
    Class268 aClass268_9505;
    public int anInt9506;
    Class266 aClass266_9507;
    Class268 aClass268_9508;
    static Class268 aClass268_9509 = new Class268();
    int[] anIntArray9510;
    protected Class268 aClass268_9511;
    protected int anInt9512;
    Class287 aClass287_9513;
    float[] aFloatArray9514;
    boolean aBool9515;
    Class385 aClass385_9516;
    boolean aBool9517;
    Class379 aClass379_9518;
    Class369[] aClass369Array9519;
    int anInt9520;
    Class268 aClass268_9521;
    Class268 aClass268_9522;
    Class268 aClass268_9523;
    protected int anInt9524;
    Class268 aClass268_9525;
    public Class268 aClass268_9526;
    float[][] aFloatArrayArray9527;
    float aFloat9528;
    float aFloat9529;
    float aFloat9530;
    float aFloat9531;
    protected float aFloat9532;
    protected float aFloat9533;
    float aFloat9534;
    float aFloat9535;
    int anInt9536 = 4194304;
    protected float aFloat9537;
    protected int anInt9538;
    public int anInt9539;
    Class361 aClass361_9540;
    protected Class305[] aClass305Array9541;
    int anInt9542;
    int anInt9543;
    int anInt9544;
    protected int anInt9545;
    protected int anInt9546;
    Class390 aClass390_9547;
    boolean aBool9548;
    public boolean aBool9549;
    protected int anInt9550;
    protected int anInt9551;
    protected boolean aBool9552;
    protected boolean aBool9553;
    Class369_Sub1_Sub2 aClass369_Sub1_Sub2_9554;
    public Class268 aClass268_9555;
    public float aFloat9556;
    protected boolean aBool9557;
    public float[] aFloatArray9558;
    protected float[] aFloatArray9559;
    float[] aFloatArray9560;
    float[] aFloatArray9561;
    protected boolean aBool9562;
    public float aFloat9563;
    public float aFloat9564;
    boolean aBool9565;
    protected float aFloat9566;
    protected int anInt9567;
    protected float aFloat9568;
    protected Class241_Sub43[] aClass241_Sub43Array9569;
    protected int anInt9570;
    Class168_Sub1 aClass168_Sub1_9571;
    int anInt9572;
    protected Class305[] aClass305Array9573;
    protected int anInt9574;
    Class86 aClass86_9575;
    protected boolean aBool9576;
    protected byte aByte9577;
    protected Class268[] aClass268Array9578;
    protected Class387[] aClass387Array9579;
    protected int anInt9580;
    protected int anInt9581;
    protected int anInt9582;
    Interface40 anInterface40_9583;
    public Interface41 anInterface41_9584;
    Interface41 anInterface41_9585;
    Class168_Sub1 aClass168_Sub1_9586;
    static final int anInt9587 = 4;
    Class266 aClass266_9588;
    protected int anInt9589;
    Class369 aClass369_9590;
    static final int anInt9591 = 7;
    static final int anInt9592 = 2;
    Class352 aClass352_9593;
    Class66 aClass66_9594;
    Class358 aClass358_9595;
    protected float aFloat9596;
    Class369_Sub1_Sub2 aClass369_Sub1_Sub2_9597;
    Class391 aClass391_9598;
    Class382 aClass382_9599;
    protected boolean aBool9600;
    public int anInt9601;
    Class366 aClass366_9602;
    static final int anInt9603 = 4;
    Class368[] aClass368Array9604;
    Class369_Sub1_Sub1 aClass369_Sub1_Sub1_9605;
    Interface31[] anInterface31Array9606;
    Class268 aClass268_9607;
    int anInt9608;
    public float aFloat9609;
    Class268 aClass268_9610;
    protected boolean aBool9611;
    Interface33 anInterface33_9612;
    protected int anInt9613;
    protected int anInt9614;
    protected float aFloat9615;
    protected float aFloat9616;
    protected int anInt9617;
    protected int anInt9618;
    protected Class304 aClass304_9619;
    protected boolean aBool9620;
    protected boolean aBool9621;
    protected boolean aBool9622;
    public int anInt9623;
    static final int anInt9624 = 1;
    int anInt9625;
    boolean aBool9626;
    int anInt9627;
    Class88_Sub1 aClass88_Sub1_9628;
    static final int anInt9629 = 1;
    protected int anInt9630;
    static final int anInt9631 = 128;
    protected boolean aBool9632;
    int anInt9633;
    protected boolean aBool9634;
    protected boolean aBool9635;
    public boolean aBool9636;
    protected boolean aBool9637;
    protected boolean aBool9638;
    protected boolean aBool9639;
    Interface40 anInterface40_9640;
    Class366 aClass366_9641;
    Interface40 anInterface40_9642;
    Class366 aClass366_9643;
    boolean aBool9644;
    Class268 aClass268_9645;
    Class268 aClass268_9646;
    public int anInt9647;
    Class366 aClass366_9648;
    static final int anInt9649 = 3;
    Class89_Sub1[] aClass89_Sub1Array9650;
    Class266 aClass266_9651;
    Class268 aClass268_9652;
    Class266 aClass266_9653;
    protected boolean aBool9654;
    
    public final void method2479(int i, float f, float f_0_, float f_1_,
				 float f_2_, float f_3_) {
	boolean bool = ((Class103_Sub3) this).anInt9477 != i;
	f *= 0.5F;
	f_0_ *= 0.5F;
	if (bool || aFloat9609 != f || aFloat9568 != f_0_) {
	    ((Class103_Sub3) this).anInt9477 = i;
	    aFloat9609 = f;
	    aFloat9568 = f_0_;
	    if (bool) {
		aFloat9563 = (float) (((Class103_Sub3) this).anInt9477
				      & 0xff0000) / 1.671168E7F;
		aFloat9564 = (float) (((Class103_Sub3) this).anInt9477
				      & 0xff00) / 65280.0F;
		aFloat9556 = ((float) (((Class103_Sub3) this).anInt9477 & 0xff)
			      / 255.0F);
		method15669();
	    }
	    method15670();
	}
	if (((Class103_Sub3) this).aFloatArray9560[0] != f_1_
	    || ((Class103_Sub3) this).aFloatArray9560[1] != f_2_
	    || ((Class103_Sub3) this).aFloatArray9560[2] != f_3_) {
	    ((Class103_Sub3) this).aFloatArray9560[0] = f_1_;
	    ((Class103_Sub3) this).aFloatArray9560[1] = f_2_;
	    ((Class103_Sub3) this).aFloatArray9560[2] = f_3_;
	    ((Class103_Sub3) this).aFloatArray9561[0] = -f_1_;
	    ((Class103_Sub3) this).aFloatArray9561[1] = -f_2_;
	    ((Class103_Sub3) this).aFloatArray9561[2] = -f_3_;
	    float f_4_
		= (float) (1.0 / Math.sqrt((double) (f_1_ * f_1_ + f_2_ * f_2_
						     + f_3_ * f_3_)));
	    aFloatArray9558[0] = f_1_ * f_4_;
	    aFloatArray9558[1] = f_2_ * f_4_;
	    aFloatArray9558[2] = f_3_ * f_4_;
	    aFloatArray9559[0] = -aFloatArray9558[0];
	    aFloatArray9559[1] = -aFloatArray9558[1];
	    aFloatArray9559[2] = -aFloatArray9558[2];
	    method15671();
	    ((Class103_Sub3) this).anInt9520 = (int) (f_1_ * 256.0F / f_2_);
	    ((Class103_Sub3) this).anInt9627 = (int) (f_3_ * 256.0F / f_2_);
	}
	method15672();
    }
    
    public final void method2482(int i) {
	((Class103_Sub3) this).anInt9489 = 0;
	for (/**/; i > 1; i >>= 1)
	    ((Class103_Sub3) this).anInt9489++;
	((Class103_Sub3) this).anInt9572
	    = 1 << ((Class103_Sub3) this).anInt9489;
    }
    
    boolean method2546(int i, int i_5_, int i_6_, int i_7_, Class266 class266,
		       Class272 class272) {
	Class268 class268 = aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3) this).aClass268_9525);
	return class272.method5317(i, i_5_, i_6_, i_7_, class268,
				   ((Class103_Sub3) this).aFloat9528,
				   ((Class103_Sub3) this).aFloat9530,
				   ((Class103_Sub3) this).aFloat9529,
				   ((Class103_Sub3) this).aFloat9531);
    }
    
    public abstract boolean method15605();
    
    public abstract boolean method15606();
    
    final boolean method15607() {
	return aBool9488;
    }
    
    public final void method2403(int[] is) {
	is[0] = anInt9512;
	is[1] = anInt9538;
	is[2] = anInt9574;
	is[3] = anInt9581;
    }
    
    byte[] method15608(String string, String string_8_) {
	return ((Class103_Sub3) this).aClass210_9487
		   .readContainerByIndentifiers(string, string_8_, -239486511);
    }
    
    final void method15609() {
	((Class103_Sub3) this).aClass268_9525.method5199(aClass268_9504);
	((Class103_Sub3) this).aClass268_9525
	    .method5202(((Class103_Sub3) this).aClass268_9521);
	((Class103_Sub3) this).aClass268_9525
	    .method5257(((Class103_Sub3) this).aFloatArrayArray9527[0]);
	((Class103_Sub3) this).aClass268_9525
	    .method5226(((Class103_Sub3) this).aFloatArrayArray9527[1]);
	((Class103_Sub3) this).aClass268_9525
	    .method5219(((Class103_Sub3) this).aFloatArrayArray9527[2]);
	((Class103_Sub3) this).aClass268_9525
	    .method5271(((Class103_Sub3) this).aFloatArrayArray9527[3]);
	((Class103_Sub3) this).aClass268_9525
	    .method5238(((Class103_Sub3) this).aFloatArrayArray9527[4]);
	((Class103_Sub3) this).aClass268_9525
	    .method5222(((Class103_Sub3) this).aFloatArrayArray9527[5]);
	aClass268_9526.method5199(((Class103_Sub3) this).aClass268_9525);
	method15652(aClass268_9526);
    }
    
    public abstract void method15610(Class268 class268, Class268 class268_9_,
				     Class268 class268_10_);
    
    Class268 method15611() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515)
		method15648();
	    return ((Class103_Sub3) this).aClass268_9508;
	}
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    public void method2617() {
	if (((Class103_Sub3) this).aClass390_9547 != null)
	    ((Class103_Sub3) this).aClass390_9547.method6967();
    }
    
    final Interface41 method15612(int i, int i_11_, boolean bool, int[] is) {
	return method15682(i, i_11_, bool, is, 0, 0);
    }
    
    final void method15613() {
	((Class103_Sub3) this).aClass375_9494 = new Class375(this);
	aBool9488 = false;
	try {
	    ((Class103_Sub3) this).aClass361_9540 = new Class361_Sub1(this);
	    ((Class103_Sub3) this).aClass352_9593 = new Class352_Sub1(this);
	    ((Class103_Sub3) this).aClass66_9594 = new Class66_Sub2(this);
	    ((Class103_Sub3) this).aClass358_9595 = new Class358_Sub2(this);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9554
		= new Class369_Sub1_Sub2(this,
					 ((Class103_Sub3) this).aClass375_9494,
					 false);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9597
		= new Class369_Sub1_Sub2(this,
					 ((Class103_Sub3) this).aClass375_9494,
					 true);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub1_9605
		= new Class369_Sub1_Sub1(this, (((Class103_Sub3) this)
						.aClass375_9494));
	} catch (Exception exception) {
	    exception.printStackTrace();
	    ((Class103_Sub3) this).aClass361_9540 = new Class361_Sub2(this);
	    ((Class103_Sub3) this).aClass352_9593 = new Class352_Sub2(this);
	    ((Class103_Sub3) this).aClass66_9594 = new Class66_Sub1(this);
	    ((Class103_Sub3) this).aClass358_9595 = new Class358_Sub1(this);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9554 = null;
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9597 = null;
	    ((Class103_Sub3) this).aClass369_Sub1_Sub1_9605 = null;
	    aBool9488 = true;
	}
	if (!aBool9488 && !aBool9639) {
	    int i;
	    int i_12_;
	    if (aClass105_1470 != null) {
		i_12_ = aClass105_1470.method2655();
		i = aClass105_1470.method2654();
	    } else {
		i = 0;
		i_12_ = 0;
	    }
	    ((Class103_Sub3) this).aClass382_9599
		= new Class382(this, i_12_, i);
	    ((Class103_Sub3) this).aClass368Array9604[3]
		= new Class368_Sub3(this);
	    ((Class103_Sub3) this).aClass368Array9604[1]
		= new Class368_Sub1(this);
	    ((Class103_Sub3) this).aClass368Array9604[2]
		= new Class368_Sub2(this);
	    ((Class103_Sub3) this).aClass382_9599
		.method6895(((Class103_Sub3) this).aClass368Array9604[3]);
	    ((Class103_Sub3) this).aClass382_9599
		.method6895(((Class103_Sub3) this).aClass368Array9604[1]);
	    ((Class103_Sub3) this).aClass382_9599
		.method6895(((Class103_Sub3) this).aClass368Array9604[2]);
	    method15627();
	    method15628();
	}
	if (((Class103_Sub3) this).aClass369_9590 != null) {
	    ((Class103_Sub3) this).aClass369_9590.method6594();
	    ((Class103_Sub3) this).aClass369_9590 = null;
	}
	method15616();
    }
    
    final void method2543(int i, int i_13_, int i_14_, int i_15_, int i_16_) {
	/* empty */
    }
    
    final void method15614() {
	method15669();
	method15670();
	method15668();
	method15710();
	method15671();
	method15672();
	method15673();
	method15662();
	method15663();
	method15750();
	method15711();
	method15715();
	method15801();
	method15864();
	for (int i = anInt9647 - 1; i >= 0; i--) {
	    method15686(i);
	    method15702();
	    method15703();
	    method15699();
	}
	method16015();
	method15629();
    }
    
    abstract void method15615();
    
    void method15616() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6927();
	if (((Class103_Sub3) this).aClass368Array9604 != null) {
	    for (int i = 0;
		 i < ((Class103_Sub3) this).aClass368Array9604.length; i++) {
		if (((Class103_Sub3) this).aClass368Array9604[i] != null
		    && ((Class103_Sub3) this).aClass368Array9604[i]
			   .method6582())
		    ((Class103_Sub3) this).aClass368Array9604[i].method6563();
	    }
	}
	((Class103_Sub3) this).aClass391_9598 = new Class391(this);
	method15965();
	method15618();
	method15619();
	((Class103_Sub3) this).aClass391_9598.method7013(this);
	if (aBool9549)
	    ((Class103_Sub3) this).aClass390_9547 = new Class390(this, 1024);
    }
    
    public void method15617(Interface45 interface45) {
	((Class103_Sub3) this).aClass599_9478.method13137(interface45,
							  -551354991);
    }
    
    final void method15618() {
	((Class103_Sub3) this).anInterface40_9640 = method15752(true);
	((Class103_Sub3) this).anInterface40_9640.method221(24, 12);
	((Class103_Sub3) this).aClass366_9643
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545) });
    }
    
    final void method15619() {
	((Class103_Sub3) this).anInterface40_9642 = method15752(false);
	((Class103_Sub3) this).anInterface40_9642.method221(3096, 12);
	aByteBuffer9490.clear();
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	for (int i = 0; i <= 256; i++) {
	    double d = (double) (i * 2) * 3.141592653589793 / 256.0;
	    float f = (float) Math.cos(d);
	    float f_17_ = (float) Math.sin(d);
	    aByteBuffer9490.putFloat(f_17_);
	    aByteBuffer9490.putFloat(f);
	    aByteBuffer9490.putFloat(0.0F);
	}
	((Class103_Sub3) this).anInterface40_9642
	    .method268(0, aByteBuffer9490.position(), aLong9491);
    }
    
    boolean method15620(float f, float f_18_, float f_19_, float f_20_,
			float f_21_, float f_22_) {
	aByteBuffer9490.clear();
	aByteBuffer9490.putFloat(f);
	aByteBuffer9490.putFloat(f_18_);
	aByteBuffer9490.putFloat(f_19_);
	aByteBuffer9490.putFloat(f_20_);
	aByteBuffer9490.putFloat(f_21_);
	aByteBuffer9490.putFloat(f_22_);
	return ((Class103_Sub3) this).anInterface40_9640
		   .method268(0, aByteBuffer9490.position(), aLong9491);
    }
    
    void method2221() {
	if (!((Class103_Sub3) this).aBool9626) {
	    method15844();
	    ((Class103_Sub3) this).aClass379_9518.method6848();
	    for (Node class241 = ((Class103_Sub3) this).aClass429_9496
					 .method7694(16711935);
		 class241 != null;
		 class241 = ((Class103_Sub3) this).aClass429_9496
				.method7692(-346996973))
		((Class241_Sub47_Sub1) class241).method17400();
	    Class238.method4876(false, true, -1064386699);
	    for (int i = 0;
		 i < ((Class103_Sub3) this).aClass369Array9519.length; i++) {
		if (((Class103_Sub3) this).aClass369Array9519[i] != null) {
		    ((Class103_Sub3) this).aClass369Array9519[i].method6602();
		    ((Class103_Sub3) this).aClass369Array9519[i] = null;
		}
	    }
	    for (int i = 0;
		 i < ((Class103_Sub3) this).aClass368Array9604.length; i++) {
		if (((Class103_Sub3) this).aClass368Array9604[i] != null) {
		    ((Class103_Sub3) this).aClass368Array9604[i].method6572();
		    ((Class103_Sub3) this).aClass368Array9604[i] = null;
		}
	    }
	    method15774();
	    method2222(0);
	    ((Class103_Sub3) this).aBool9626 = true;
	}
    }
    
    public void method2390() {
	((Class103_Sub3) this).anInt9542 = 0;
	((Class103_Sub3) this).anInt9543 = 0;
	((Class103_Sub3) this).anInt9544 = aClass105_1470.method2655();
	((Class103_Sub3) this).anInt9502 = aClass105_1470.method2654();
	method15799();
    }
    
    public final boolean method2502() {
	return true;
    }
    
    public final boolean method2330() {
	return true;
    }
    
    public final boolean method2361() {
	return ((Class103_Sub3) this).aClass368Array9604[3] != null;
    }
    
    public final boolean method2286() {
	return true;
    }
    
    public final boolean method2382() {
	return true;
    }
    
    public final boolean method2232() {
	return true;
    }
    
    public final boolean method2573() {
	return true;
    }
    
    public final boolean method2234() {
	return false;
    }
    
    void method15621() {
	ArrayList arraylist
	    = ((Class103_Sub3) this).aClass599_9478.method13135((short) 25281);
	Iterator iterator = arraylist.iterator();
	while (iterator.hasNext()) {
	    Interface45 interface45 = (Interface45) iterator.next();
	    interface45.method28();
	}
    }
    
    public abstract float method15622();
    
    public Class180 method2327(int[] is) {
	return new Class180_Sub1(this, is);
    }
    
    public abstract void method15623(Class310 class310, int i, int i_23_);
    
    Class376 method15624() {
	if (((Class103_Sub3) this).aClass390_9547 == null)
	    return Class376.aClass376_5635;
	return ((Class103_Sub3) this).aClass390_9547.method6974();
    }
    
    public void method2291() {
	if (((Class103_Sub3) this).aClass390_9547 != null)
	    ((Class103_Sub3) this).aClass390_9547.method6967();
    }
    
    public void method2292() {
	if (((Class103_Sub3) this).aClass390_9547 != null)
	    ((Class103_Sub3) this).aClass390_9547.method6982();
    }
    
    public void method2293() {
	if (((Class103_Sub3) this).aClass390_9547 != null)
	    ((Class103_Sub3) this).aClass390_9547.method6973();
    }
    
    void method15625() {
	method15626();
    }
    
    void method15626() {
	method15995();
	method15918();
	method15653();
	method2295();
	method2572();
    }
    
    public final void method2321(int i, int i_24_, int i_25_, int i_26_) {
	if (((Class103_Sub3) this).aClass382_9599 != null) {
	    for (int i_27_ = 0;
		 i_27_ < ((Class103_Sub3) this).aClass368Array9604.length;
		 i_27_++) {
		if (((Class103_Sub3) this).aClass368Array9604[i_27_] != null
		    && ((Class103_Sub3) this).aClass368Array9604[i_27_]
			   .method6582()
		    && !((Class103_Sub3) this).aClass368Array9604[i_27_]
			    .method6573()) {
		    ((Class103_Sub3) this).aClass382_9599
			.method6925(i, i_24_, i_25_, i_26_);
		    break;
		}
	    }
	}
    }
    
    public final void method2322() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6900();
    }
    
    public final boolean method2323() {
	return (((Class103_Sub3) this).aClass382_9599 != null
		&& (((Class382) ((Class103_Sub3) this).aClass382_9599)
		    .aBool5682));
    }
    
    boolean method15627() {
	if (((Class103_Sub3) this).aClass368Array9604[1] != null
	    && !((Class103_Sub3) this).aClass368Array9604[1].method6582()) {
	    boolean bool = (((Class103_Sub3) this).aClass382_9599.method6895
			    (((Class103_Sub3) this).aClass368Array9604[1]));
	    if (bool)
		((Class103_Sub3) this).aClass379_9518.method6848();
	    return bool;
	}
	return false;
    }
    
    public boolean method2224() {
	return (((Class103_Sub3) this).aClass368Array9604[1] != null
		&& ((Class103_Sub3) this).aClass368Array9604[1].method6582());
    }
    
    public void method2325(float f, float f_28_, float f_29_, float f_30_,
			   float f_31_) {
	Class368_Sub1.aFloat10350 = f;
	Class368_Sub1.aFloat10345 = f_28_;
	Class368_Sub1.aFloat10352 = f_29_;
	Class368_Sub1.aFloat10344 = f_30_;
	Class368_Sub1.aFloat10354 = f_31_;
    }
    
    public Class180 method2326(int[] is) {
	return new Class180_Sub1(this, is);
    }
    
    boolean method15628() {
	if (((Class103_Sub3) this).aClass368Array9604[2] != null
	    && !((Class103_Sub3) this).aClass368Array9604[2].method6582()) {
	    boolean bool = (((Class103_Sub3) this).aClass382_9599.method6895
			    (((Class103_Sub3) this).aClass368Array9604[2]));
	    if (bool)
		((Class103_Sub3) this).aClass379_9518.method6848();
	    return bool;
	}
	return false;
    }
    
    public boolean method2584() {
	return (((Class103_Sub3) this).aClass368Array9604[2] != null
		&& ((Class103_Sub3) this).aClass368Array9604[2].method6582());
    }
    
    public void method2328(Class180 class180, float f, Class180 class180_32_,
			   float f_33_, Class180 class180_34_, float f_35_) {
	int i = 0;
	if (class180_34_ == null && f_35_ > 0.0F)
	    f_35_ = 0.0F;
	if (class180_32_ == null && f_33_ > 0.0F) {
	    class180_32_ = class180_34_;
	    class180_34_ = null;
	    f_33_ = f_35_;
	    f_35_ = 0.0F;
	}
	if (class180 == null && f > 0.0F) {
	    class180 = class180_32_;
	    class180_32_ = class180_34_;
	    class180_34_ = null;
	    f = f_33_;
	    f_33_ = f_35_;
	    f_35_ = 0.0F;
	}
	Class368_Sub2.aClass180_Sub1Array10371[0] = (Class180_Sub1) class180;
	Class368_Sub2.aFloatArray10365[0] = f;
	if (f > 0.0F)
	    i++;
	Class368_Sub2.aClass180_Sub1Array10371[1]
	    = (Class180_Sub1) class180_32_;
	Class368_Sub2.aFloatArray10365[1] = f_33_;
	if (f_33_ > 0.0F)
	    i++;
	Class368_Sub2.aClass180_Sub1Array10371[2]
	    = (Class180_Sub1) class180_34_;
	Class368_Sub2.aFloatArray10365[2] = f_35_;
	if (f_35_ > 0.0F)
	    i++;
	Class368_Sub2.anInt10364 = i;
	Class368_Sub2.aFloat10363 = 1.0F - (f + f_33_ + f_35_);
    }
    
    public final boolean method2329() {
	if (((Class103_Sub3) this).aClass368Array9604[3] != null
	    && !((Class103_Sub3) this).aClass368Array9604[3].method6582()) {
	    boolean bool = (((Class103_Sub3) this).aClass382_9599.method6895
			    (((Class103_Sub3) this).aClass368Array9604[3]));
	    if (bool)
		((Class103_Sub3) this).aClass379_9518.method6848();
	    return bool;
	}
	return false;
    }
    
    public final Class168 method2435(int i, int i_36_, boolean bool,
				     boolean bool_37_) {
	return new Class168_Sub1(this, i, i_36_, bool, bool_37_);
    }
    
    final void method2333(float f, float f_38_, float f_39_, float f_40_,
			  float f_41_, float f_42_) {
	Class368_Sub3.aFloat10455 = f;
	Class368_Sub3.aFloat10452 = f_38_;
	Class368_Sub3.aFloat10453 = f_39_;
	Class368_Sub3.aFloat10458 = f_42_;
    }
    
    public final Class241_Sub47 method2283(int i) {
	Class241_Sub47_Sub1 class241_sub47_sub1 = new Class241_Sub47_Sub1(i);
	((Class103_Sub3) this).aClass429_9496.addNode(class241_sub47_sub1,
							 (short) -31215);
	return class241_sub47_sub1;
    }
    
    public final void method2228(Class241_Sub47 class241_sub47) {
	((Class103_Sub3) this).aNativeHeap9495
	    = (((Class241_Sub47_Sub1) (Class241_Sub47_Sub1) class241_sub47)
	       .aNativeHeap10975);
    }
    
    abstract void method15629();
    
    final Interface33 method15630(int i) {
	if (((Class103_Sub3) this).anInterface33_9612.method53() < i * 2)
	    ((Class103_Sub3) this).anInterface33_9612.method185(i);
	return ((Class103_Sub3) this).anInterface33_9612;
    }
    
    public final int method2342() {
	return anInt9506 + anInt9539 + anInt9567;
    }
    
    public final Class168 method2590(int i, int i_43_, boolean bool,
				     boolean bool_44_) {
	return new Class168_Sub1(this, i, i_43_, bool, bool_44_);
    }
    
    public final Class168 method2289(Class108 class108, boolean bool) {
	Class168 class168;
	if (class108.method2698() != 0 && class108.method2694() != 0) {
	    int[] is = class108.method2707(false);
	    class168 = method2259(is, 0, class108.method2698(),
				  class108.method2698(), class108.method2694(),
				  (byte) -62);
	} else
	    class168 = method2259(new int[] { 0 }, 0, 1, 1, 1, (byte) -4);
	class168.method3602(class108.method2695(), class108.method2697(),
			    class108.method2696(), class108.method2742());
	return class168;
    }
    
    public final Class168 method2287(int[] is, int i, int i_45_, int i_46_,
				     int i_47_, boolean bool) {
	return new Class168_Sub1(this, i_46_, i_47_, is, i, i_45_);
    }
    
    public final Class168 method2290(int i, int i_48_, int i_49_, int i_50_,
				     boolean bool) {
	Class168_Sub1 class168_sub1
	    = new Class168_Sub1(this, i_49_, i_50_, bool, false);
	class168_sub1.method3675(0, 0, i_49_, i_50_, i, i_48_);
	return class168_sub1;
    }
    
    Class47 method15631(byte[] is) {
	if (is == null)
	    return null;
	Class47 class47;
	try {
	    class47 = new Class47(is);
	} catch (Exception exception) {
	    return null;
	}
	return class47;
    }
    
    public final Class135 method2467(int i, int i_51_, int[] is,
				     int[] is_52_) {
	return Class135_Sub2.method16275(this, i, i_51_, is, is_52_);
    }
    
    public abstract void method15632();
    
    public final Class89 method2356(Class161 class161, int i, int i_53_,
				    int i_54_, int i_55_) {
	return new Class89_Sub1(this, class161, i, i_54_, i_55_, i_53_);
    }
    
    public final int method2301(int i, int i_56_) {
	return i & i_56_ ^ i_56_;
    }
    
    public final int method2302(int i, int i_57_) {
	return i | i_57_;
    }
    
    public final Class166 method2303(int i, int i_58_, int[][] is,
				     int[][] is_59_, int i_60_, int i_61_,
				     int i_62_) {
	return new Class166_Sub1(this, i_61_, i_62_, i, i_58_, is, is_59_,
				 i_60_);
    }
    
    public final boolean method2271() {
	if (((Class103_Sub3) this).aClass368Array9604[3] != null
	    && !((Class103_Sub3) this).aClass368Array9604[3].method6582()) {
	    boolean bool = (((Class103_Sub3) this).aClass382_9599.method6895
			    (((Class103_Sub3) this).aClass368Array9604[3]));
	    if (bool)
		((Class103_Sub3) this).aClass379_9518.method6848();
	    return bool;
	}
	return false;
    }
    
    Class86 method15633() {
	return ((Class103_Sub3) this).aClass86_9575;
    }
    
    public final NativeHeapBuffer method15634(int i, boolean bool) {
	return ((Class103_Sub3) this).aNativeHeap9495.method963(i, bool);
    }
    
    public final void method2456(Class88 class88) {
	((Class103_Sub3) this).aClass88_Sub1_9628 = (Class88_Sub1) class88;
    }
    
    final Interface41 method15635(Class175 class175, int i, int i_63_,
				  boolean bool, byte[] is) {
	return method15680(class175, i, i_63_, bool, is, 0, 0);
    }
    
    public final Interface30 method15636() {
	return (((Class103_Sub3) this).aClass88_Sub1_9628 != null
		? ((Class103_Sub3) this).aClass88_Sub1_9628.method15111()
		: null);
    }
    
    public final void method2506(Class98 class98) {
	((Class103_Sub3) this).aClass391_9598.method6998(this, class98);
    }
    
    final void method15637() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    anInt9546 = ((Class103_Sub3) this).anInt9542;
	    anInt9545 = ((Class103_Sub3) this).anInt9543;
	    anInt9482 = ((Class103_Sub3) this).anInt9544;
	    anInt9617 = ((Class103_Sub3) this).anInt9502;
	    aFloat9532 = ((Class103_Sub3) this).aFloat9534;
	    aFloat9533 = ((Class103_Sub3) this).aFloat9535;
	} else {
	    anInt9546 = 0;
	    anInt9545 = 0;
	    anInt9482 = aClass105_1470.method2655();
	    anInt9617 = aClass105_1470.method2654();
	    aFloat9532 = 0.0F;
	    aFloat9533 = 1.0F;
	}
	method15629();
	((Class103_Sub3) this).aFloat9529
	    = (float) ((Class103_Sub3) this).anInt9544 / 2.0F;
	((Class103_Sub3) this).aFloat9531
	    = (float) ((Class103_Sub3) this).anInt9502 / 2.0F;
	((Class103_Sub3) this).aFloat9528
	    = ((float) ((Class103_Sub3) this).anInt9542
	       + ((Class103_Sub3) this).aFloat9529);
	((Class103_Sub3) this).aFloat9530
	    = ((float) ((Class103_Sub3) this).anInt9543
	       + ((Class103_Sub3) this).aFloat9531);
    }
    
    public void method2255(float f, float f_64_) {
	((Class103_Sub3) this).aFloat9534 = f;
	((Class103_Sub3) this).aFloat9535 = f_64_;
	method15799();
    }
    
    public final void method2260(int[] is) {
	is[0] = anInt9512;
	is[1] = anInt9538;
	is[2] = anInt9574;
	is[3] = anInt9581;
    }
    
    final void method15638() {
	if (((Class103_Sub3) this).aClass385_9516 != Class385.aClass385_5703) {
	    ((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5703;
	    method15646();
	    method15658();
	    ((Class103_Sub3) this).aClass268_9523
		= ((Class103_Sub3) this).aClass268_9521;
	    method15659();
	    method15799();
	    ((Class103_Sub3) this).anInt9625 &= ~0x7;
	}
    }
    
    public final void method2445(int i, int i_65_, int i_66_, int i_67_) {
	int i_68_;
	int i_69_;
	if (aClass105_1470 != null) {
	    i_69_ = aClass105_1470.method2655();
	    i_68_ = aClass105_1470.method2654();
	} else {
	    i_68_ = 0;
	    i_69_ = 0;
	}
	if (i <= 0 && i_66_ >= i_69_ - 1 && i_65_ <= 0 && i_67_ >= i_68_ - 1)
	    method2572();
	else {
	    anInt9512 = i >= 0 ? i : 0;
	    anInt9574 = i_66_ <= i_69_ ? i_66_ : i_69_;
	    anInt9538 = i_65_ >= 0 ? i_65_ : 0;
	    anInt9581 = i_67_ <= i_68_ ? i_67_ : i_68_;
	    if (!aBool9654 && (((Class103_Sub3) this).aBool9497
			       || method15624() == Class376.aClass376_5635)) {
		aBool9654 = true;
		method15641();
	    }
	    if (aBool9654)
		method15742();
	}
    }
    
    public final void method2473(int i) {
	((Class103_Sub3) this).anInt9489 = 0;
	for (/**/; i > 1; i >>= 1)
	    ((Class103_Sub3) this).anInt9489++;
	((Class103_Sub3) this).anInt9572
	    = 1 << ((Class103_Sub3) this).anInt9489;
    }
    
    final void method15639(int i, int i_70_) {
	anInt9550 = i;
	anInt9551 = i_70_;
	method15629();
	if (!aBool9654 && (((Class103_Sub3) this).aBool9497
			   || method15624() == Class376.aClass376_5635)) {
	    aBool9654 = true;
	    method15641();
	}
	if (aBool9654)
	    method15742();
    }
    
    public void method2279(boolean bool) {
	((Class103_Sub3) this).aBool9497 = bool;
    }
    
    final void method2273(int i, int i_71_, int i_72_, int i_73_, int i_74_) {
	method2274(i, i_71_, i, i_71_ + i_72_, i_73_, i_74_);
    }
    
    final void method15640(int i) {
	if (((Class103_Sub3) this).anInt9498 != i) {
	    Class304 class304;
	    boolean bool;
	    boolean bool_75_;
	    if (i == 1) {
		class304 = Class304.aClass304_4798;
		bool = true;
		bool_75_ = true;
	    } else if (i == 2) {
		class304 = Class304.aClass304_4796;
		bool = false;
		bool_75_ = true;
	    } else if (i == 128) {
		class304 = Class304.aClass304_4797;
		bool = true;
		bool_75_ = true;
	    } else if (i == 3) {
		class304 = Class304.aClass304_4795;
		bool = true;
		bool_75_ = false;
	    } else {
		class304 = Class304.aClass304_4795;
		bool = false;
		bool_75_ = false;
	    }
	    if (bool != aBool9621) {
		aBool9621 = bool;
		method15864();
	    }
	    if (bool_75_ != aBool9620) {
		aBool9620 = bool_75_;
		method15715();
	    }
	    if (class304 != aClass304_9619) {
		aClass304_9619 = class304;
		method15801();
	    }
	    ((Class103_Sub3) this).anInt9498 = i;
	    ((Class103_Sub3) this).anInt9625 &= ~0xc;
	}
    }
    
    abstract void method15641();
    
    final Class268 method15642() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703)
	    return aClass268_9504;
	return aClass268_9509;
    }
    
    final Class268 method15643() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703)
	    return ((Class103_Sub3) this).aClass268_9505;
	return aClass268_9509;
    }
    
    public final Class266 method2318() {
	return ((Class103_Sub3) this).aClass266_9653;
    }
    
    final void method15644() {
	if (((Class103_Sub3) this).aClass385_9516 != Class385.aClass385_5705) {
	    Class385 class385 = ((Class103_Sub3) this).aClass385_9516;
	    ((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5705;
	    if (class385 == Class385.aClass385_5703)
		method15646();
	    ((Class103_Sub3) this).aClass268_9523
		= ((Class103_Sub3) this).aClass268_9522;
	    method15659();
	    method15799();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    public final void method2309(Class268 class268) {
	((Class103_Sub3) this).aClass268_9521.method5199(class268);
	method15609();
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703)
	    method15659();
    }
    
    final Class268 method15645() {
	return aClass268_9555;
    }
    
    public final Class268 method2310() {
	return ((Class103_Sub3) this).aClass268_9521;
    }
    
    final void method15646() {
	((Class103_Sub3) this).aBool9515 = false;
    }
    
    Class268 method15647() {
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    Class266 method15648() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515) {
		((Class103_Sub3) this).aClass266_9507
		    .method5175(((Class103_Sub3) this).aClass266_9500);
		((Class103_Sub3) this).aClass266_9507
		    .method5134(((Class103_Sub3) this).aClass266_9651);
		((Class103_Sub3) this).aClass268_9508
		    .method5203(((Class103_Sub3) this).aClass266_9507);
		((Class103_Sub3) this).aBool9515 = true;
	    }
	    return ((Class103_Sub3) this).aClass266_9507;
	}
	return ((Class103_Sub3) this).aClass266_9500;
    }
    
    Class268 method15649() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515)
		method15648();
	    return ((Class103_Sub3) this).aClass268_9508;
	}
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    final Class268 method15650() {
	return aClass268_9526;
    }
    
    final Class268 method15651() {
	return aClass268_9555;
    }
    
    public abstract void method15652(Class268 class268);
    
    final void method15653() {
	if (((Class103_Sub3) this).aClass385_9516 != Class385.aClass385_5705) {
	    Class385 class385 = ((Class103_Sub3) this).aClass385_9516;
	    ((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5705;
	    if (class385 == Class385.aClass385_5703)
		method15646();
	    ((Class103_Sub3) this).aClass268_9523
		= ((Class103_Sub3) this).aClass268_9522;
	    method15659();
	    method15799();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    final void method15654() {
	if (((Class103_Sub3) this).aClass385_9516 != Class385.aClass385_5704) {
	    Class385 class385 = ((Class103_Sub3) this).aClass385_9516;
	    ((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5704;
	    if (class385 == Class385.aClass385_5703)
		method15646();
	    method15755();
	    ((Class103_Sub3) this).aClass268_9523
		= ((Class103_Sub3) this).aClass268_9607;
	    method15659();
	    method15799();
	    ((Class103_Sub3) this).anInt9625 &= ~0x8;
	}
    }
    
    public final void method15655(int i) {
	switch (i) {
	case 4:
	    method15661(Class305.aClass305_4803, Class305.aClass305_4803);
	    break;
	case 2:
	    method15661(Class305.aClass305_4804, Class305.aClass305_4802);
	    break;
	case 3:
	    method15661(Class305.aClass305_4800, Class305.aClass305_4801);
	    break;
	case 0:
	    method15661(Class305.aClass305_4801, Class305.aClass305_4801);
	    break;
	case 1:
	    method15661(Class305.aClass305_4802, Class305.aClass305_4802);
	    break;
	}
    }
    
    abstract Class366 method15656(Class314[] class314s);
    
    void method15657() {
	method15626();
    }
    
    public final void method2429(int i, Class86 class86) {
	if (!((Class103_Sub3) this).aBool9565)
	    throw new RuntimeException("");
	((Class103_Sub3) this).anInt9608 = i;
	((Class103_Sub3) this).aClass86_9575 = class86;
	if (((Class103_Sub3) this).aBool9644) {
	    ((Class103_Sub3) this).aClass369Array9519[3].method6596();
	    ((Class103_Sub3) this).aClass369Array9519[3].method6597();
	}
    }
    
    final void method15658() {
	if (!((Class103_Sub3) this).aBool9548)
	    ((Class103_Sub3) this).aBool9548 = true;
    }
    
    final void method15659() {
	aClass268_9555.method5199(((Class103_Sub3) this).aClass268_9523);
	method15652(aClass268_9555);
	aFloat9537 = ((aClass268_9555.aFloatArray4353[14]
		       - aClass268_9555.aFloatArray4353[15])
		      / (aClass268_9555.aFloatArray4353[11]
			 - aClass268_9555.aFloatArray4353[10]));
	aFloat9596 = (-aClass268_9555.aFloatArray4353[14]
		      / aClass268_9555.aFloatArray4353[10]);
	method15842();
    }
    
    public final void method2308(boolean bool) {
	aBool9552 = bool;
	method15663();
    }
    
    final void method15660(boolean bool) {
	if (bool != aBool9562) {
	    aBool9562 = bool;
	    method15662();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    public final void method15661(Class305 class305, Class305 class305_76_) {
	boolean bool = false;
	if (aClass305Array9541[anInt9580] != class305) {
	    aClass305Array9541[anInt9580] = class305;
	    method15702();
	    bool = true;
	}
	if (aClass305Array9573[anInt9580] != class305_76_) {
	    aClass305Array9573[anInt9580] = class305_76_;
	    method15703();
	    bool = true;
	}
	if (bool)
	    ((Class103_Sub3) this).anInt9625 &= ~0xd;
    }
    
    abstract void method15662();
    
    abstract void method15663();
    
    public void method2338(float f, float f_77_, float f_78_, float[] fs) {
	float f_79_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * f_77_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * f_78_));
	float f_80_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * f_77_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * f_78_));
	float f_81_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * f_77_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * f_78_));
	float f_82_ = (aClass268_9504.aFloatArray4353[14]
		       + aClass268_9504.aFloatArray4353[2] * f
		       + aClass268_9504.aFloatArray4353[6] * f_77_
		       + aClass268_9504.aFloatArray4353[10] * f_78_);
	fs[0] = (((Class103_Sub3) this).aFloat9528
		 + ((Class103_Sub3) this).aFloat9529 * f_80_ / f_79_);
	fs[1] = (((Class103_Sub3) this).aFloat9530
		 + ((Class103_Sub3) this).aFloat9531 * f_81_ / f_79_);
	fs[2] = f_82_;
    }
    
    public void method2337(float f, float f_83_, float f_84_, float[] fs) {
	float f_85_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		  * f_83_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		  * f_84_));
	float f_86_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * f_83_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * f_84_));
	if (f_85_ < -f_86_ || f_85_ > f_86_) {
	    float[] fs_87_ = fs;
	    float[] fs_88_ = fs;
	    fs[2] = Float.NaN;
	    fs_88_[1] = Float.NaN;
	    fs_87_[0] = Float.NaN;
	} else {
	    float f_89_
		= (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		      * f)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		      * f_83_)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		      * f_84_));
	    if (f_89_ < -f_86_ || f_89_ > f_86_) {
		float[] fs_90_ = fs;
		float[] fs_91_ = fs;
		fs[2] = Float.NaN;
		fs_91_[1] = Float.NaN;
		fs_90_[0] = Float.NaN;
	    } else {
		float f_92_ = ((((Class103_Sub3) this).aClass268_9525
				.aFloatArray4353[13])
			       + (((Class103_Sub3) this).aClass268_9525
				  .aFloatArray4353[1]) * f
			       + (((Class103_Sub3) this).aClass268_9525
				  .aFloatArray4353[5]) * f_83_
			       + (((Class103_Sub3) this).aClass268_9525
				  .aFloatArray4353[9]) * f_84_);
		if (f_92_ < -f_86_ || f_92_ > f_86_) {
		    float[] fs_93_ = fs;
		    float[] fs_94_ = fs;
		    fs[2] = Float.NaN;
		    fs_94_[1] = Float.NaN;
		    fs_93_[0] = Float.NaN;
		} else {
		    float f_95_
			= (aClass268_9504.aFloatArray4353[14]
			   + aClass268_9504.aFloatArray4353[2] * f
			   + aClass268_9504.aFloatArray4353[6] * f_83_
			   + aClass268_9504.aFloatArray4353[10] * f_84_);
		    fs[0] = (((Class103_Sub3) this).aFloat9528
			     + (((Class103_Sub3) this).aFloat9529 * f_89_
				/ f_86_));
		    fs[1] = (((Class103_Sub3) this).aFloat9530
			     + (((Class103_Sub3) this).aFloat9531 * f_92_
				/ f_86_));
		    fs[2] = f_95_;
		}
	    }
	}
    }
    
    public int method2412(int i, int i_96_, int i_97_, int i_98_, int i_99_,
			  int i_100_) {
	int i_101_ = 0;
	float f = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		      * (float) i)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		      * (float) i_96_)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		      * (float) i_97_));
	float f_102_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		  * (float) i_98_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		  * (float) i_99_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		  * (float) i_100_));
	float f_103_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_96_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_97_));
	float f_104_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i_98_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_99_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_100_));
	if (f < -f_103_ && f_102_ < -f_104_)
	    i_101_ |= 0x10;
	else if (f > f_103_ && f_102_ > f_104_)
	    i_101_ |= 0x20;
	float f_105_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_96_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_97_));
	float f_106_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i_98_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_99_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_100_));
	if (f_105_ < -f_103_ && f_106_ < -f_104_)
	    i_101_ |= 0x1;
	if (f_105_ > f_103_ && f_106_ > f_104_)
	    i_101_ |= 0x2;
	float f_107_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_96_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_97_));
	float f_108_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i_98_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_99_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_100_));
	if (f_107_ < -f_103_ && f_108_ < -f_104_)
	    i_101_ |= 0x4;
	if (f_107_ > f_103_ && f_108_ > f_104_)
	    i_101_ |= 0x8;
	return i_101_;
    }
    
    final void method15664() {
	if (((Class103_Sub3) this).aClass385_9516 != Class385.aClass385_5703) {
	    ((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5703;
	    method15646();
	    method15658();
	    ((Class103_Sub3) this).aClass268_9523
		= ((Class103_Sub3) this).aClass268_9521;
	    method15659();
	    method15799();
	    ((Class103_Sub3) this).anInt9625 &= ~0x7;
	}
    }
    
    public void method2282(Class266 class266, Class97 class97,
			   Class272 class272) {
	Class268 class268 = aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3) this).aClass268_9525);
	class97.method2172(class272, ((Class103_Sub3) this).aClass268_9521,
			   class268, ((Class103_Sub3) this).aFloat9528,
			   ((Class103_Sub3) this).aFloat9530,
			   ((Class103_Sub3) this).aFloat9529,
			   ((Class103_Sub3) this).aFloat9531);
    }
    
    abstract Interface41 method15665(Class175 class175, int i, int i_109_,
				     boolean bool, float[] fs, int i_110_,
				     int i_111_);
    
    final Interface33 method15666(int i) {
	if (((Class103_Sub3) this).anInterface33_9612.method53() < i * 2)
	    ((Class103_Sub3) this).anInterface33_9612.method185(i);
	return ((Class103_Sub3) this).anInterface33_9612;
    }
    
    final void method15667(boolean bool) {
	if (bool != aBool9562) {
	    aBool9562 = bool;
	    method15662();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    public final void method2311(float f) {
	if (aFloat9566 != f) {
	    aFloat9566 = f;
	    method15669();
	    method15672();
	}
    }
    
    public final void method2227(int i, float f, float f_112_, float f_113_,
				 float f_114_, float f_115_) {
	boolean bool = ((Class103_Sub3) this).anInt9477 != i;
	f *= 0.5F;
	f_112_ *= 0.5F;
	if (bool || aFloat9609 != f || aFloat9568 != f_112_) {
	    ((Class103_Sub3) this).anInt9477 = i;
	    aFloat9609 = f;
	    aFloat9568 = f_112_;
	    if (bool) {
		aFloat9563 = (float) (((Class103_Sub3) this).anInt9477
				      & 0xff0000) / 1.671168E7F;
		aFloat9564 = (float) (((Class103_Sub3) this).anInt9477
				      & 0xff00) / 65280.0F;
		aFloat9556 = ((float) (((Class103_Sub3) this).anInt9477 & 0xff)
			      / 255.0F);
		method15669();
	    }
	    method15670();
	}
	if (((Class103_Sub3) this).aFloatArray9560[0] != f_113_
	    || ((Class103_Sub3) this).aFloatArray9560[1] != f_114_
	    || ((Class103_Sub3) this).aFloatArray9560[2] != f_115_) {
	    ((Class103_Sub3) this).aFloatArray9560[0] = f_113_;
	    ((Class103_Sub3) this).aFloatArray9560[1] = f_114_;
	    ((Class103_Sub3) this).aFloatArray9560[2] = f_115_;
	    ((Class103_Sub3) this).aFloatArray9561[0] = -f_113_;
	    ((Class103_Sub3) this).aFloatArray9561[1] = -f_114_;
	    ((Class103_Sub3) this).aFloatArray9561[2] = -f_115_;
	    float f_116_
		= (float) (1.0 / Math.sqrt((double) (f_113_ * f_113_
						     + f_114_ * f_114_
						     + f_115_ * f_115_)));
	    aFloatArray9558[0] = f_113_ * f_116_;
	    aFloatArray9558[1] = f_114_ * f_116_;
	    aFloatArray9558[2] = f_115_ * f_116_;
	    aFloatArray9559[0] = -aFloatArray9558[0];
	    aFloatArray9559[1] = -aFloatArray9558[1];
	    aFloatArray9559[2] = -aFloatArray9558[2];
	    method15671();
	    ((Class103_Sub3) this).anInt9520
		= (int) (f_113_ * 256.0F / f_114_);
	    ((Class103_Sub3) this).anInt9627
		= (int) (f_115_ * 256.0F / f_114_);
	}
	method15672();
    }
    
    public final void method2313(int i) {
	((Class103_Sub3) this).anInt9489 = 0;
	for (/**/; i > 1; i >>= 1)
	    ((Class103_Sub3) this).anInt9489++;
	((Class103_Sub3) this).anInt9572
	    = 1 << ((Class103_Sub3) this).anInt9489;
    }
    
    abstract void method15668();
    
    abstract void method15669();
    
    abstract void method15670();
    
    abstract void method15671();
    
    abstract void method15672();
    
    abstract void method15673();
    
    public int method2350(int i, int i_117_, int i_118_, int i_119_,
			  int i_120_, int i_121_) {
	int i_122_ = 0;
	float f = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		      * (float) i)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		      * (float) i_117_)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		      * (float) i_118_));
	float f_123_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		  * (float) i_119_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		  * (float) i_120_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		  * (float) i_121_));
	float f_124_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_117_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_118_));
	float f_125_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i_119_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_120_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_121_));
	if (f < -f_124_ && f_123_ < -f_125_)
	    i_122_ |= 0x10;
	else if (f > f_124_ && f_123_ > f_125_)
	    i_122_ |= 0x20;
	float f_126_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_117_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_118_));
	float f_127_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i_119_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_120_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_121_));
	if (f_126_ < -f_124_ && f_127_ < -f_125_)
	    i_122_ |= 0x1;
	if (f_126_ > f_124_ && f_127_ > f_125_)
	    i_122_ |= 0x2;
	float f_128_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_117_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_118_));
	float f_129_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i_119_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_120_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_121_));
	if (f_128_ < -f_124_ && f_129_ < -f_125_)
	    i_122_ |= 0x4;
	if (f_128_ > f_124_ && f_129_ > f_125_)
	    i_122_ |= 0x8;
	return i_122_;
    }
    
    abstract void method15674();
    
    abstract boolean method15675(Class175 class175, Class102 class102);
    
    public void method2628(boolean bool) {
	((Class103_Sub3) this).aBool9497 = bool;
    }
    
    abstract void method15676();
    
    final void method15677() {
	((Class103_Sub3) this).aBool9517 = false;
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5704) {
	    method15755();
	    method15659();
	}
    }
    
    final Interface41 method15678(Class175 class175, int i, int i_130_,
				  boolean bool, float[] fs) {
	return method15681(class175, i, i_130_, bool, fs, 0, 0);
    }
    
    abstract Interface41 method15679(Class175 class175, Class102 class102,
				     int i, int i_131_);
    
    abstract Interface41 method15680(Class175 class175, int i, int i_132_,
				     boolean bool, byte[] is, int i_133_,
				     int i_134_);
    
    abstract Interface41 method15681(Class175 class175, int i, int i_135_,
				     boolean bool, float[] fs, int i_136_,
				     int i_137_);
    
    abstract Interface41 method15682(int i, int i_138_, boolean bool, int[] is,
				     int i_139_, int i_140_);
    
    abstract Interface30 method15683(int i, boolean bool, int[][] is);
    
    public final void method2231(int i, int i_141_, int i_142_, int i_143_,
				 int i_144_, int i_145_, Class135 class135,
				 int i_146_, int i_147_) {
	/* empty */
    }
    
    abstract Interface43 method15684(Class175 class175, Class102 class102,
				     int i, int i_148_);
    
    public final int method15685() {
	return anInt9580;
    }
    
    public final void method15686(int i) {
	if (anInt9580 != i) {
	    anInt9580 = i;
	    method16014();
	}
    }
    
    final void method15687(boolean bool) {
	if (bool != aBool9553) {
	    aBool9553 = bool;
	    method15663();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    public void method2544(int i, int i_149_, int i_150_, int i_151_,
			   int i_152_, int i_153_, Class135 class135,
			   int i_154_, int i_155_, int i_156_, int i_157_,
			   int i_158_) {
	/* empty */
    }
    
    final void method15688() {
	method15955(0, ((Class103_Sub3) this).anInterface40_9640);
	method15716(((Class103_Sub3) this).aClass366_9643);
	method15623(Class310.aClass310_4821, 0, 1);
    }
    
    void method15689() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6927();
	if (((Class103_Sub3) this).aClass368Array9604 != null) {
	    for (int i = 0;
		 i < ((Class103_Sub3) this).aClass368Array9604.length; i++) {
		if (((Class103_Sub3) this).aClass368Array9604[i] != null
		    && ((Class103_Sub3) this).aClass368Array9604[i]
			   .method6582())
		    ((Class103_Sub3) this).aClass368Array9604[i].method6563();
	    }
	}
	((Class103_Sub3) this).aClass391_9598 = new Class391(this);
	method15965();
	method15618();
	method15619();
	((Class103_Sub3) this).aClass391_9598.method7013(this);
	if (aBool9549)
	    ((Class103_Sub3) this).aClass390_9547 = new Class390(this, 1024);
    }
    
    abstract Interface41 method15690(Class175 class175, int i, int i_159_,
				     boolean bool, float[] fs, int i_160_,
				     int i_161_);
    
    final Class268 method15691() {
	return aClass268Array9578[anInt9580];
    }
    
    public final void method15692(int i, Class306 class306) {
	method15693(i, class306, false);
    }
    
    abstract void method15693(int i, Class306 class306, boolean bool);
    
    public final boolean method2363() {
	return aBool9634;
    }
    
    final Class268 method15694() {
	return aClass268Array9578[anInt9580];
    }
    
    final Class268 method15695() {
	return aClass268_9526;
    }
    
    public final void method15696(Class387 class387) {
	aClass387Array9579[anInt9580] = class387;
	method15698();
    }
    
    abstract Class366 method15697(Class314[] class314s);
    
    final void method15698() {
	method15700();
    }
    
    final void method15699() {
	if (aClass387Array9579[anInt9580] != Class387.aClass387_5710) {
	    aClass387Array9579[anInt9580] = Class387.aClass387_5710;
	    aClass268Array9578[anInt9580].method5198();
	    method15698();
	}
    }
    
    abstract void method15700();
    
    final void method15701(boolean bool) {
	if (bool != aBool9553) {
	    aBool9553 = bool;
	    method15663();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    abstract void method15702();
    
    abstract void method15703();
    
    final void method15704() {
	((Class103_Sub3) this).aClass375_9494 = new Class375(this);
	aBool9488 = false;
	try {
	    ((Class103_Sub3) this).aClass361_9540 = new Class361_Sub1(this);
	    ((Class103_Sub3) this).aClass352_9593 = new Class352_Sub1(this);
	    ((Class103_Sub3) this).aClass66_9594 = new Class66_Sub2(this);
	    ((Class103_Sub3) this).aClass358_9595 = new Class358_Sub2(this);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9554
		= new Class369_Sub1_Sub2(this,
					 ((Class103_Sub3) this).aClass375_9494,
					 false);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9597
		= new Class369_Sub1_Sub2(this,
					 ((Class103_Sub3) this).aClass375_9494,
					 true);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub1_9605
		= new Class369_Sub1_Sub1(this, (((Class103_Sub3) this)
						.aClass375_9494));
	} catch (Exception exception) {
	    exception.printStackTrace();
	    ((Class103_Sub3) this).aClass361_9540 = new Class361_Sub2(this);
	    ((Class103_Sub3) this).aClass352_9593 = new Class352_Sub2(this);
	    ((Class103_Sub3) this).aClass66_9594 = new Class66_Sub1(this);
	    ((Class103_Sub3) this).aClass358_9595 = new Class358_Sub1(this);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9554 = null;
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9597 = null;
	    ((Class103_Sub3) this).aClass369_Sub1_Sub1_9605 = null;
	    aBool9488 = true;
	}
	if (!aBool9488 && !aBool9639) {
	    int i;
	    int i_162_;
	    if (aClass105_1470 != null) {
		i_162_ = aClass105_1470.method2655();
		i = aClass105_1470.method2654();
	    } else {
		i = 0;
		i_162_ = 0;
	    }
	    ((Class103_Sub3) this).aClass382_9599
		= new Class382(this, i_162_, i);
	    ((Class103_Sub3) this).aClass368Array9604[3]
		= new Class368_Sub3(this);
	    ((Class103_Sub3) this).aClass368Array9604[1]
		= new Class368_Sub1(this);
	    ((Class103_Sub3) this).aClass368Array9604[2]
		= new Class368_Sub2(this);
	    ((Class103_Sub3) this).aClass382_9599
		.method6895(((Class103_Sub3) this).aClass368Array9604[3]);
	    ((Class103_Sub3) this).aClass382_9599
		.method6895(((Class103_Sub3) this).aClass368Array9604[1]);
	    ((Class103_Sub3) this).aClass382_9599
		.method6895(((Class103_Sub3) this).aClass368Array9604[2]);
	    method15627();
	    method15628();
	}
	if (((Class103_Sub3) this).aClass369_9590 != null) {
	    ((Class103_Sub3) this).aClass369_9590.method6594();
	    ((Class103_Sub3) this).aClass369_9590 = null;
	}
	method15616();
    }
    
    public final void method2334(int i, Class86 class86) {
	((Class103_Sub3) this).anInt9608 = i;
	((Class103_Sub3) this).aClass86_9575 = class86;
	((Class103_Sub3) this).aBool9565 = true;
    }
    
    public final void method2335(int i, Class86 class86) {
	if (!((Class103_Sub3) this).aBool9565)
	    throw new RuntimeException("");
	((Class103_Sub3) this).anInt9608 = i;
	((Class103_Sub3) this).aClass86_9575 = class86;
	if (((Class103_Sub3) this).aBool9644) {
	    ((Class103_Sub3) this).aClass369Array9519[3].method6596();
	    ((Class103_Sub3) this).aClass369Array9519[3].method6597();
	}
    }
    
    public static void method15705() throws Exception_Sub4 {
	Class256.method5053((byte) 15).method109("jaclib", -1091148901);
    }
    
    public final Class96 method2296(Class639 class639, Class108[] class108s,
				    boolean bool) {
	return new Class96_Sub4(this, class639, class108s, bool);
    }
    
    final void method15706(int i) {
	if (anInt9618 != i) {
	    anInt9618 = i;
	    method15801();
	}
    }
    
    final void method15707(byte i) {
	if (aByte9577 != i) {
	    aByte9577 = i;
	    if (i == 0) {
		method15706(0);
		method15640(1);
	    } else {
		method15706(3);
		method15640(3);
	    }
	    method15864();
	}
    }
    
    public final void method2492(int i, int i_163_, int i_164_, int i_165_) {
	if (((Class103_Sub3) this).aClass382_9599 != null) {
	    for (int i_166_ = 0;
		 i_166_ < ((Class103_Sub3) this).aClass368Array9604.length;
		 i_166_++) {
		if (((Class103_Sub3) this).aClass368Array9604[i_166_] != null
		    && ((Class103_Sub3) this).aClass368Array9604[i_166_]
			   .method6582()
		    && !((Class103_Sub3) this).aClass368Array9604[i_166_]
			    .method6573()) {
		    ((Class103_Sub3) this).aClass382_9599
			.method6925(i, i_163_, i_164_, i_165_);
		    break;
		}
	    }
	}
    }
    
    abstract boolean method15708(Class175 class175, Class102 class102);
    
    public final boolean method2352() {
	return true;
    }
    
    final boolean method15709() {
	return aBool9488;
    }
    
    final void method15710() {
	if (method15607())
	    method15674();
	anInt9570 = anInt9524;
    }
    
    public final void method2314(int i, int i_167_, int i_168_) {
	if (anInt9589 != i || anInt9613 != i_167_ || anInt9614 != i_168_) {
	    anInt9589 = i;
	    anInt9613 = i_167_;
	    anInt9614 = i_168_;
	    method15842();
	    method15750();
	}
    }
    
    public final void method2235() {
	if (((Class103_Sub3) this).aClass368Array9604[3] != null
	    && ((Class103_Sub3) this).aClass368Array9604[3].method6582()) {
	    ((Class103_Sub3) this).aClass382_9599
		.method6897(((Class103_Sub3) this).aClass368Array9604[3]);
	    ((Class103_Sub3) this).aClass379_9518.method6848();
	}
    }
    
    abstract void method15711();
    
    public final void method15712() {
	((Class103_Sub3) this).anInterface31Array9606
	    = new Interface31[anInt9647];
	aClass268Array9578 = new Class268[anInt9647];
	aClass387Array9579 = new Class387[anInt9647];
	aClass305Array9541 = new Class305[anInt9647];
	aClass305Array9573 = new Class305[anInt9647];
	for (int i = 0; i < anInt9647; i++) {
	    aClass305Array9573[i] = Class305.aClass305_4801;
	    aClass305Array9541[i] = Class305.aClass305_4801;
	    aClass387Array9579[i] = Class387.aClass387_5710;
	    aClass268Array9578[i] = new Class268();
	}
	aClass241_Sub43Array9569 = new Class241_Sub43[anInt9630 - 2];
	int[] is = { -1 };
	anInterface41_9584 = method15682(1, 1, false, is, 0, 0);
	is[0] = -16777216;
	((Class103_Sub3) this).anInterface41_9585
	    = method15682(1, 1, false, is, 0, 0);
	method2228(new Class241_Sub47_Sub1(262144));
	((Class103_Sub3) this).aClass366_9485
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5549 }) });
	((Class103_Sub3) this).aClass366_9648
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5547 }) });
	((Class103_Sub3) this).aClass366_9602
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545),
			    new Class314(Class367.aClass367_5547),
			    new Class314(Class367.aClass367_5549),
			    new Class314(Class367.aClass367_5548) });
	((Class103_Sub3) this).aClass366_9641
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545),
			    new Class314(Class367.aClass367_5547),
			    new Class314(Class367.aClass367_5549) });
	for (int i = 0; i < 8; i++) {
	    ((Class103_Sub3) this).aClass89_Sub1Array9650[i]
		= new Class89_Sub1(this, 0, 0, false, false);
	    ((Class103_Sub3) this).aClass89_Sub1Array9499[i]
		= new Class89_Sub1(this, 0, 0, true, true);
	}
	method15613();
	((Class103_Sub3) this).anInterface33_9612 = method15714(true);
	method15885();
	method2572();
	method2252();
	((Class103_Sub3) this).aClass168_Sub1_9586
	    = new Class168_Sub1(this, anInterface41_9584);
	((Class103_Sub3) this).aClass168_Sub1_9571
	    = new Class168_Sub1(this,
				((Class103_Sub3) this).anInterface41_9585);
	method2450(3, 0);
    }
    
    abstract void method15713(boolean bool);
    
    abstract Interface33 method15714(boolean bool);
    
    public final Class266 method2595() {
	return ((Class103_Sub3) this).aClass266_9653;
    }
    
    abstract void method15715();
    
    public abstract void method15716(Class366 class366);
    
    public void method15717(int i) {
	if (i != anInt9582) {
	    anInt9582 = i;
	    method16015();
	}
    }
    
    abstract void method15718(Interface33 interface33);
    
    public final void method2495(int i, Class135 class135, int i_169_,
				 int i_170_) {
	method2308(false);
	((Class103_Sub3) this).aClass168_Sub1_9571.method3647
	    (0.0F, 0.0F, (float) method2237((byte) 4).method2655(), 0.0F, 0.0F,
	     (float) method2237((byte) 4).method2654(), 0, class135, i_169_,
	     i_170_);
	method2308(true);
    }
    
    public final void method2396(int i, int i_171_, int i_172_, int i_173_,
				 int i_174_, int i_175_) {
	if (aBool9634 && anInt9623 != 0)
	    method15713(false);
	if (aBool9552) {
	    method2308(false);
	    ((Class103_Sub3) this).aClass168_Sub1_9586
		.method3615(i, i_171_, i_172_, i_173_, 0, i_174_, i_175_);
	    method2308(true);
	} else
	    ((Class103_Sub3) this).aClass168_Sub1_9586
		.method3615(i, i_171_, i_172_, i_173_, 0, i_174_, i_175_);
	if (aBool9634 && anInt9623 != 0)
	    method15713(true);
    }
    
    public final void method2268(int i, int i_176_, int i_177_, int i_178_,
				 int i_179_, int i_180_) {
	i_177_--;
	i_178_--;
	int i_181_ = 0;
	if (this instanceof Class103_Sub3_Sub2)
	    i_181_ = -1;
	if (aBool9634 && anInt9623 != 0)
	    method15713(false);
	method2274(i, i_176_ + i_181_, i + i_177_, i_176_ + i_181_, i_179_,
		   i_180_);
	method2274(i, i_176_ + i_178_ + i_181_, i + i_177_,
		   i_176_ + i_178_ + i_181_, i_179_, i_180_);
	method2274(i, i_176_, i, i_176_ + i_178_, i_179_, i_180_);
	method2274(i + i_177_, i_176_, i + i_177_, i_176_ + i_178_, i_179_,
		   i_180_);
	if (aBool9634 && anInt9623 != 0)
	    method15713(true);
    }
    
    public final void method2270(int i, int i_182_, float f, int i_183_,
				 int i_184_, float f_185_, int i_186_,
				 int i_187_, float f_188_, int i_189_,
				 int i_190_, int i_191_, int i_192_) {
	/* empty */
    }
    
    final void method15719(boolean bool) {
	if (bool != aBool9600) {
	    aBool9600 = bool;
	    method15668();
	    ((Class103_Sub3) this).anInt9625 &= ~0x7;
	}
    }
    
    final Interface33 method15720(int i) {
	if (((Class103_Sub3) this).anInterface33_9612.method53() < i * 2)
	    ((Class103_Sub3) this).anInterface33_9612.method185(i);
	return ((Class103_Sub3) this).anInterface33_9612;
    }
    
    Class103_Sub3(Class107 class107, Interface6 interface6, JS5 class210,
		  int i, int i_193_) {
	super(class107, interface6);
	((Class103_Sub3) this).aClass429_9496 = new NodeCollection();
	((Class103_Sub3) this).aClass266_9500 = new Class266();
	((Class103_Sub3) this).aClass268_9501 = new Class268();
	((Class103_Sub3) this).aClass266_9651 = new Class266();
	((Class103_Sub3) this).aClass266_9503 = new Class266();
	aClass268_9504 = new Class268();
	((Class103_Sub3) this).aClass268_9505 = new Class268();
	((Class103_Sub3) this).aClass268_9645 = new Class268();
	((Class103_Sub3) this).aClass266_9507 = new Class266();
	((Class103_Sub3) this).aClass268_9508 = new Class268();
	((Class103_Sub3) this).aClass266_9588 = new Class266();
	aClass268_9511 = new Class268();
	((Class103_Sub3) this).aClass268_9646 = new Class268();
	((Class103_Sub3) this).aClass287_9513 = new Class287();
	((Class103_Sub3) this).aFloatArray9514 = new float[4];
	((Class103_Sub3) this).aBool9515 = false;
	((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5705;
	((Class103_Sub3) this).aBool9517 = false;
	((Class103_Sub3) this).aClass268_9607 = new Class268();
	((Class103_Sub3) this).aClass268_9610 = new Class268();
	((Class103_Sub3) this).aBool9548 = false;
	((Class103_Sub3) this).aClass268_9521 = new Class268();
	((Class103_Sub3) this).aClass268_9522 = new Class268();
	((Class103_Sub3) this).aClass268_9523
	    = ((Class103_Sub3) this).aClass268_9522;
	aClass268_9555 = new Class268();
	((Class103_Sub3) this).aClass268_9525 = new Class268();
	aClass268_9526 = new Class268();
	((Class103_Sub3) this).aFloatArrayArray9527 = new float[6][4];
	aFloat9532 = 0.0F;
	aFloat9533 = 1.0F;
	((Class103_Sub3) this).aFloat9534 = 0.0F;
	((Class103_Sub3) this).aFloat9535 = 1.0F;
	aFloat9596 = 50.0F;
	aFloat9537 = 3584.0F;
	anInt9538 = 0;
	anInt9581 = 0;
	anInt9512 = 0;
	anInt9574 = 0;
	((Class103_Sub3) this).anInt9542 = 0;
	((Class103_Sub3) this).anInt9543 = 0;
	((Class103_Sub3) this).anInt9544 = 0;
	((Class103_Sub3) this).anInt9502 = 0;
	anInt9546 = 0;
	anInt9545 = 0;
	anInt9482 = 0;
	anInt9617 = 0;
	anInt9550 = 0;
	anInt9551 = 0;
	aBool9552 = true;
	aBool9553 = false;
	aBool9562 = false;
	aBool9600 = false;
	aBool9492 = true;
	aBool9557 = false;
	aFloatArray9558 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	aFloatArray9559 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
	((Class103_Sub3) this).aFloatArray9560
	    = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	((Class103_Sub3) this).aFloatArray9561
	    = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	((Class103_Sub3) this).anInt9477 = 16777215;
	aFloat9563 = 1.0F;
	aFloat9564 = 1.0F;
	aFloat9556 = 1.0F;
	aFloat9566 = 1.0F;
	aFloat9609 = -1.0F;
	aFloat9568 = -1.0F;
	((Class103_Sub3) this).anInt9572 = 8;
	((Class103_Sub3) this).anInt9489 = 3;
	anInt9580 = 0;
	((Class103_Sub3) this).aBool9497 = false;
	((Class103_Sub3) this).aClass369Array9519 = new Class369[16];
	((Class103_Sub3) this).aClass368Array9604 = new Class368[4];
	((Class103_Sub3) this).aBool9644 = false;
	aBool9611 = true;
	anInt9589 = -1;
	anInt9613 = -1;
	anInt9614 = 0;
	((Class103_Sub3) this).anInt9498 = 1;
	anInt9618 = -1;
	aClass304_9619 = Class304.aClass304_4798;
	aBool9620 = true;
	aBool9621 = true;
	aByte9577 = (byte) 0;
	((Class103_Sub3) this).aBool9626 = false;
	new Stream();
	((Class103_Sub3) this).aClass89_Sub1Array9650 = new Class89_Sub1[8];
	((Class103_Sub3) this).aClass89_Sub1Array9499 = new Class89_Sub1[8];
	((Class103_Sub3) this).aClass268_9652 = new Class268();
	((Class103_Sub3) this).aClass266_9653 = new Class266();
	try {
	    ((Class103_Sub3) this).aClass210_9487 = class210;
	    anInt9623 = i;
	    ((Class103_Sub3) this).anInt9633 = i_193_;
	    Class81.method1812(false, true, 953486904);
	    if (anInterface6_1457 != null)
		((Class103_Sub3) this).aClass379_9518
		    = new Class379(this, anInterface6_1457);
	    else
		((Class103_Sub3) this).aClass379_9518 = null;
	    if (((Class103_Sub3) this).anInt9633 == 0)
		((Class103_Sub3) this).anIntArray9510
		    = Class474.anIntArray6383;
	    else
		((Class103_Sub3) this).anIntArray9510
		    = Class474.anIntArray6380;
	    try {
		Field field
		    = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
		field.setAccessible(true);
		anUnsafe9493 = (Unsafe) field.get(null);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aByteBuffer9490 = ByteBuffer.allocateDirect(4194304);
	    aByteBuffer9490.order(ByteOrder.nativeOrder());
	    aLong9491
		= DirectBufferHelper.getDirectBufferAddress(aByteBuffer9490);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method2220((byte) 0);
	    if (throwable instanceof OutOfMemoryError)
		throw (OutOfMemoryError) throwable;
	    throw new RuntimeException("");
	}
	method2228(method2283(131072));
    }
    
    public final void method2274(int i, int i_194_, int i_195_, int i_196_,
				 int i_197_, int i_198_) {
	method2278(i, i_194_, i_195_, i_196_, i_197_, 1, i_198_);
    }
    
    public void method2276(int i, int i_199_, int i_200_, int i_201_,
			   int i_202_, int i_203_, int i_204_, int i_205_,
			   int i_206_) {
	float f = (float) i_200_ - (float) i;
	float f_207_ = (float) i_201_ - (float) i_199_;
	if (f == 0.0F && f_207_ == 0.0F)
	    f = 1.0F;
	else {
	    float f_208_
		= (float) (1.0
			   / Math.sqrt((double) (f * f + f_207_ * f_207_)));
	    f *= f_208_;
	    f_207_ *= f_208_;
	}
	method15654();
	Class369 class369 = ((Class103_Sub3) this).aClass369Array9519[13];
	class369.method6601();
	class369.method6595(i_202_);
	method15640(i_203_);
	class369.method6598();
	method15713(false);
	i_206_ %= i_205_ + i_204_;
	float f_209_ = f * (float) i_204_;
	float f_210_ = f_207_ * (float) i_204_;
	float f_211_ = 0.0F;
	float f_212_ = 0.0F;
	float f_213_ = f_209_;
	float f_214_ = f_210_;
	if (i_206_ > i_204_) {
	    f_211_ = f * (float) (i_204_ + i_205_ - i_206_);
	    f_212_ = f_207_ * (float) (i_204_ + i_205_ - i_206_);
	} else {
	    f_213_ = f * (float) (i_204_ - i_206_);
	    f_214_ = f_207_ * (float) (i_204_ - i_206_);
	}
	float f_215_ = (float) i + f_211_;
	float f_216_ = (float) i_199_ + f_212_;
	float f_217_ = f * (float) i_205_;
	float f_218_ = f_207_ * (float) i_205_;
	for (;;) {
	    if (i_200_ > i) {
		if (f_215_ > (float) i_200_)
		    break;
		if (f_215_ + f_213_ > (float) i_200_)
		    f_213_ = (float) i_200_ - f_215_;
	    } else {
		if (f_215_ < (float) i_200_)
		    break;
		if (f_215_ + f_213_ < (float) i_200_)
		    f_213_ = (float) i_200_ - f_215_;
	    }
	    if (i_201_ > i_199_) {
		if (f_216_ > (float) i_201_)
		    break;
		if (f_216_ + f_214_ > (float) i_201_)
		    f_214_ = (float) i_201_ - f_216_;
	    } else {
		if (f_216_ < (float) i_201_)
		    break;
		if (f_216_ + f_214_ < (float) i_201_)
		    f_214_ = (float) i_201_ - f_216_;
	    }
	    if (!method15620(f_215_, f_216_, 0.0F, f_215_ + f_213_,
			     f_216_ + f_214_, 0.0F))
		return;
	    method15763();
	    f_215_ += f_217_ + f_213_;
	    f_216_ += f_218_ + f_214_;
	    f_213_ = f_209_;
	    f_214_ = f_210_;
	}
	method15713(true);
	class369.method6594();
    }
    
    public final Interface30 method15721() {
	return (((Class103_Sub3) this).aClass88_Sub1_9628 != null
		? ((Class103_Sub3) this).aClass88_Sub1_9628.method15111()
		: null);
    }
    
    public final void method2380(int i, int i_219_, int i_220_, int i_221_,
				 int i_222_, int i_223_, Class135 class135,
				 int i_224_, int i_225_) {
	/* empty */
    }
    
    public final void method2278(int i, int i_226_, int i_227_, int i_228_,
				 int i_229_, int i_230_, int i_231_) {
	i += 1.0F;
	i_226_ += 1.0F;
	i_227_ += 1.0F;
	i_228_ += 1.0F;
	float f = (float) (i_227_ - i);
	float f_232_ = (float) (i_228_ - i_226_);
	float f_233_
	    = 1.0F / (float) Math.sqrt((double) (f * f + f_232_ * f_232_));
	f *= f_233_;
	f_232_ *= f_233_;
	i -= f;
	i_226_ -= f_232_;
	float f_234_ = -f_232_;
	float f_235_ = f;
	f_234_ *= 0.5F * (float) i_230_;
	f_235_ *= 0.5F * (float) i_230_;
	((Class103_Sub3) this).aClass168_Sub1_9586.method3626
	    ((float) i - f_234_, (float) i_226_ - f_235_,
	     (float) i_227_ - f_234_, (float) i_228_ - f_235_,
	     (float) i + f_234_, (float) i_226_ + f_235_, 0, i_229_, i_231_);
    }
    
    public final void method2305(Class98 class98) {
	((Class103_Sub3) this).aClass391_9598.method6998(this, class98);
    }
    
    public final void method15722(Class387 class387) {
	aClass387Array9579[anInt9580] = class387;
	method15698();
    }
    
    public final void method15723() {
	method15724(Class310.aClass310_4823, 2);
    }
    
    public void method2269() {
	if (((Class103_Sub3) this).aClass390_9547 != null)
	    ((Class103_Sub3) this).aClass390_9547.method6973();
    }
    
    final void method15724(Class310 class310, int i) {
	method15955(0, ((Class103_Sub3) this).anInterface40_9583);
	method15716(((Class103_Sub3) this).aClass366_9479);
	method15623(class310, 0, i);
    }
    
    Class376 method15725() {
	if (((Class103_Sub3) this).aClass390_9547 == null)
	    return Class376.aClass376_5635;
	return ((Class103_Sub3) this).aClass390_9547.method6974();
    }
    
    public abstract void method15726(Class310 class310, int i, int i_236_,
				     int i_237_, int i_238_);
    
    public final void method15727() {
	if (((Class103_Sub3) this).anInt9625 != 2) {
	    method15654();
	    method15852(false);
	    method15889(false);
	    method15660(false);
	    method15701(false);
	    method15640(1);
	    method15707((byte) 0);
	    ((Class103_Sub3) this).anInt9625 = 2;
	}
    }
    
    final void method15728() {
	if (((Class103_Sub3) this).anInt9625 != 8) {
	    method15813();
	    method15852(true);
	    method15660(true);
	    method15701(true);
	    method15640(1);
	    method15707((byte) 0);
	    ((Class103_Sub3) this).anInt9625 = 8;
	}
    }
    
    abstract void method15729();
    
    static int method15730(char c, char c_239_, char c_240_, char c_241_) {
	return ((c & 0xff) << 0 | (c_239_ & 0xff) << 8 | (c_240_ & 0xff) << 16
		| (c_241_ & 0xff) << 24);
    }
    
    public final void method15731(Class387 class387) {
	aClass387Array9579[anInt9580] = class387;
	method15698();
    }
    
    void method2346() {
	if (!((Class103_Sub3) this).aBool9626) {
	    method15844();
	    ((Class103_Sub3) this).aClass379_9518.method6848();
	    for (Node class241 = ((Class103_Sub3) this).aClass429_9496
					 .method7694(16711935);
		 class241 != null;
		 class241 = ((Class103_Sub3) this).aClass429_9496
				.method7692(1561834910))
		((Class241_Sub47_Sub1) class241).method17400();
	    Class238.method4876(false, true, -1555655721);
	    for (int i = 0;
		 i < ((Class103_Sub3) this).aClass369Array9519.length; i++) {
		if (((Class103_Sub3) this).aClass369Array9519[i] != null) {
		    ((Class103_Sub3) this).aClass369Array9519[i].method6602();
		    ((Class103_Sub3) this).aClass369Array9519[i] = null;
		}
	    }
	    for (int i = 0;
		 i < ((Class103_Sub3) this).aClass368Array9604.length; i++) {
		if (((Class103_Sub3) this).aClass368Array9604[i] != null) {
		    ((Class103_Sub3) this).aClass368Array9604[i].method6572();
		    ((Class103_Sub3) this).aClass368Array9604[i] = null;
		}
	    }
	    method15774();
	    method2222(0);
	    ((Class103_Sub3) this).aBool9626 = true;
	}
    }
    
    abstract void method15732();
    
    public final int method2408() {
	return anInt9506 + anInt9539 + anInt9567;
    }
    
    public final int method2440() {
	return anInt9506 + anInt9539 + anInt9567;
    }
    
    public final int method2306() {
	return anInt9506 + anInt9539 + anInt9567;
    }
    
    public final boolean method2351() {
	return true;
    }
    
    public final void method15733() {
	((Class103_Sub3) this).anInterface31Array9606
	    = new Interface31[anInt9647];
	aClass268Array9578 = new Class268[anInt9647];
	aClass387Array9579 = new Class387[anInt9647];
	aClass305Array9541 = new Class305[anInt9647];
	aClass305Array9573 = new Class305[anInt9647];
	for (int i = 0; i < anInt9647; i++) {
	    aClass305Array9573[i] = Class305.aClass305_4801;
	    aClass305Array9541[i] = Class305.aClass305_4801;
	    aClass387Array9579[i] = Class387.aClass387_5710;
	    aClass268Array9578[i] = new Class268();
	}
	aClass241_Sub43Array9569 = new Class241_Sub43[anInt9630 - 2];
	int[] is = { -1 };
	anInterface41_9584 = method15682(1, 1, false, is, 0, 0);
	is[0] = -16777216;
	((Class103_Sub3) this).anInterface41_9585
	    = method15682(1, 1, false, is, 0, 0);
	method2228(new Class241_Sub47_Sub1(262144));
	((Class103_Sub3) this).aClass366_9485
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5549 }) });
	((Class103_Sub3) this).aClass366_9648
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5547 }) });
	((Class103_Sub3) this).aClass366_9602
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545),
			    new Class314(Class367.aClass367_5547),
			    new Class314(Class367.aClass367_5549),
			    new Class314(Class367.aClass367_5548) });
	((Class103_Sub3) this).aClass366_9641
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545),
			    new Class314(Class367.aClass367_5547),
			    new Class314(Class367.aClass367_5549) });
	for (int i = 0; i < 8; i++) {
	    ((Class103_Sub3) this).aClass89_Sub1Array9650[i]
		= new Class89_Sub1(this, 0, 0, false, false);
	    ((Class103_Sub3) this).aClass89_Sub1Array9499[i]
		= new Class89_Sub1(this, 0, 0, true, true);
	}
	method15613();
	((Class103_Sub3) this).anInterface33_9612 = method15714(true);
	method15885();
	method2572();
	method2252();
	((Class103_Sub3) this).aClass168_Sub1_9586
	    = new Class168_Sub1(this, anInterface41_9584);
	((Class103_Sub3) this).aClass168_Sub1_9571
	    = new Class168_Sub1(this,
				((Class103_Sub3) this).anInterface41_9585);
	method2450(3, 0);
    }
    
    abstract void method15734();
    
    public final boolean method2527() {
	return true;
    }
    
    public final int method2347() {
	return anInt9506 + anInt9539 + anInt9567;
    }
    
    public final boolean method2481() {
	return true;
    }
    
    abstract void method15735();
    
    public final boolean method2358() {
	return true;
    }
    
    public final boolean method2606() {
	return aBool9634;
    }
    
    public final boolean method2360() {
	return aBool9634;
    }
    
    public final boolean method2256() {
	return aBool9634;
    }
    
    public final boolean method2362() {
	return aBool9634;
    }
    
    public final void method2336() {
	((Class103_Sub3) this).aBool9565 = false;
    }
    
    public final boolean method2364() {
	return true;
    }
    
    Class268 method15736() {
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    abstract void method15737();
    
    public final boolean method2498() {
	return true;
    }
    
    public final boolean method2368() {
	return false;
    }
    
    public final boolean method2288() {
	return false;
    }
    
    abstract void method15738();
    
    public abstract String method2562();
    
    public final void method2535(boolean bool) {
	aBool9552 = bool;
	method15663();
    }
    
    public final void method2375(boolean bool) {
	aBool9552 = bool;
	method15663();
    }
    
    public final void method2387(boolean bool) {
	aBool9552 = bool;
	method15663();
    }
    
    public final void method2388(boolean bool) {
	aBool9552 = bool;
	method15663();
    }
    
    public void method2389() {
	((Class103_Sub3) this).anInt9542 = 0;
	((Class103_Sub3) this).anInt9543 = 0;
	((Class103_Sub3) this).anInt9544 = aClass105_1470.method2655();
	((Class103_Sub3) this).anInt9502 = aClass105_1470.method2654();
	method15799();
    }
    
    public final Class135 method2521(int i, int i_242_, int[] is,
				     int[] is_243_) {
	return Class135_Sub2.method16275(this, i, i_242_, is, is_243_);
    }
    
    public void method2397(float f, float f_244_) {
	((Class103_Sub3) this).aFloat9534 = f;
	((Class103_Sub3) this).aFloat9535 = f_244_;
	method15799();
    }
    
    public void method2392() {
	((Class103_Sub3) this).anInt9542 = 0;
	((Class103_Sub3) this).anInt9543 = 0;
	((Class103_Sub3) this).anInt9544 = aClass105_1470.method2655();
	((Class103_Sub3) this).anInt9502 = aClass105_1470.method2654();
	method15799();
    }
    
    abstract void method15739();
    
    Class268 method15740() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515)
		method15648();
	    return ((Class103_Sub3) this).aClass268_9508;
	}
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    public void method2324(int i, int i_245_, int i_246_, int i_247_) {
	((Class103_Sub3) this).anInt9542 = i;
	((Class103_Sub3) this).anInt9543 = i_245_;
	((Class103_Sub3) this).anInt9544 = i_246_;
	((Class103_Sub3) this).anInt9502 = i_247_;
	method15799();
    }
    
    public final Class96 method2552(Class639 class639, Class108[] class108s,
				    boolean bool) {
	return new Class96_Sub4(this, class639, class108s, bool);
    }
    
    public boolean method2441() {
	return (((Class103_Sub3) this).aClass368Array9604[2] != null
		&& ((Class103_Sub3) this).aClass368Array9604[2].method6582());
    }
    
    public final void method2398() {
	if (aClass105_1470 != null) {
	    anInt9538 = 0;
	    anInt9512 = 0;
	    anInt9574 = aClass105_1470.method2655();
	    anInt9581 = aClass105_1470.method2654();
	} else {
	    anInt9581 = 0;
	    anInt9574 = 0;
	    anInt9538 = 0;
	    anInt9512 = 0;
	}
	if (aBool9654) {
	    aBool9654 = false;
	    method15641();
	}
    }
    
    void method15741() {
	method15761(7);
	method15614();
    }
    
    public final void method2400(int i, int i_248_, int i_249_, int i_250_) {
	int i_251_;
	int i_252_;
	if (aClass105_1470 != null) {
	    i_252_ = aClass105_1470.method2655();
	    i_251_ = aClass105_1470.method2654();
	} else {
	    i_251_ = 0;
	    i_252_ = 0;
	}
	if (i <= 0 && i_249_ >= i_252_ - 1 && i_248_ <= 0
	    && i_250_ >= i_251_ - 1)
	    method2572();
	else {
	    anInt9512 = i >= 0 ? i : 0;
	    anInt9574 = i_249_ <= i_252_ ? i_249_ : i_252_;
	    anInt9538 = i_248_ >= 0 ? i_248_ : 0;
	    anInt9581 = i_250_ <= i_251_ ? i_250_ : i_251_;
	    if (!aBool9654 && (((Class103_Sub3) this).aBool9497
			       || method15624() == Class376.aClass376_5635)) {
		aBool9654 = true;
		method15641();
	    }
	    if (aBool9654)
		method15742();
	}
    }
    
    public final void method2401(int i, int i_253_, int i_254_, int i_255_) {
	int i_256_;
	int i_257_;
	if (aClass105_1470 != null) {
	    i_257_ = aClass105_1470.method2655();
	    i_256_ = aClass105_1470.method2654();
	} else {
	    i_256_ = 0;
	    i_257_ = 0;
	}
	i = i >= 0 ? i : 0;
	i_254_ = i_254_ <= i_257_ ? i_254_ : i_257_;
	i_253_ = i_253_ >= 0 ? i_253_ : 0;
	i_255_ = i_255_ <= i_256_ ? i_255_ : i_256_;
	boolean bool = false;
	if (anInt9512 < i) {
	    anInt9512 = i;
	    bool = true;
	}
	if (anInt9574 > i_254_) {
	    anInt9574 = i_254_;
	    bool = true;
	}
	if (anInt9538 < i_253_) {
	    anInt9538 = i_253_;
	    bool = true;
	}
	if (anInt9581 > i_255_) {
	    anInt9581 = i_255_;
	    bool = true;
	}
	if (bool) {
	    if (!aBool9654 && (((Class103_Sub3) this).aBool9497
			       || method15624() == Class376.aClass376_5635)) {
		aBool9654 = true;
		method15641();
	    }
	    if (aBool9654)
		method15742();
	}
    }
    
    public final void method2402(int i, int i_258_, int i_259_, int i_260_) {
	int i_261_;
	int i_262_;
	if (aClass105_1470 != null) {
	    i_262_ = aClass105_1470.method2655();
	    i_261_ = aClass105_1470.method2654();
	} else {
	    i_261_ = 0;
	    i_262_ = 0;
	}
	i = i >= 0 ? i : 0;
	i_259_ = i_259_ <= i_262_ ? i_259_ : i_262_;
	i_258_ = i_258_ >= 0 ? i_258_ : 0;
	i_260_ = i_260_ <= i_261_ ? i_260_ : i_261_;
	boolean bool = false;
	if (anInt9512 < i) {
	    anInt9512 = i;
	    bool = true;
	}
	if (anInt9574 > i_259_) {
	    anInt9574 = i_259_;
	    bool = true;
	}
	if (anInt9538 < i_258_) {
	    anInt9538 = i_258_;
	    bool = true;
	}
	if (anInt9581 > i_260_) {
	    anInt9581 = i_260_;
	    bool = true;
	}
	if (bool) {
	    if (!aBool9654 && (((Class103_Sub3) this).aBool9497
			       || method15624() == Class376.aClass376_5635)) {
		aBool9654 = true;
		method15641();
	    }
	    if (aBool9654)
		method15742();
	}
    }
    
    abstract void method15742();
    
    public final void method2404(int[] is) {
	is[0] = anInt9512;
	is[1] = anInt9538;
	is[2] = anInt9574;
	is[3] = anInt9581;
    }
    
    public final void method2317(int i, Class241_Sub43[] class241_sub43s) {
	for (int i_263_ = 0; i_263_ < i; i_263_++)
	    aClass241_Sub43Array9569[i_263_] = class241_sub43s[i_263_];
	anInt9524 = i;
    }
    
    public final int method2315() {
	return anInt9630 - 2;
    }
    
    public final void method2373(int i, int i_264_, int i_265_, int i_266_,
				 int i_267_, int i_268_) {
	i_265_--;
	i_266_--;
	int i_269_ = 0;
	if (this instanceof Class103_Sub3_Sub2)
	    i_269_ = -1;
	if (aBool9634 && anInt9623 != 0)
	    method15713(false);
	method2274(i, i_264_ + i_269_, i + i_265_, i_264_ + i_269_, i_267_,
		   i_268_);
	method2274(i, i_264_ + i_266_ + i_269_, i + i_265_,
		   i_264_ + i_266_ + i_269_, i_267_, i_268_);
	method2274(i, i_264_, i, i_264_ + i_266_, i_267_, i_268_);
	method2274(i + i_265_, i_264_, i + i_265_, i_264_ + i_266_, i_267_,
		   i_268_);
	if (aBool9634 && anInt9623 != 0)
	    method15713(true);
    }
    
    public final void method2409(int i, int i_270_, int i_271_, int i_272_,
				 int i_273_, int i_274_) {
	i_271_--;
	i_272_--;
	int i_275_ = 0;
	if (this instanceof Class103_Sub3_Sub2)
	    i_275_ = -1;
	if (aBool9634 && anInt9623 != 0)
	    method15713(false);
	method2274(i, i_270_ + i_275_, i + i_271_, i_270_ + i_275_, i_273_,
		   i_274_);
	method2274(i, i_270_ + i_272_ + i_275_, i + i_271_,
		   i_270_ + i_272_ + i_275_, i_273_, i_274_);
	method2274(i, i_270_, i, i_270_ + i_272_, i_273_, i_274_);
	method2274(i + i_271_, i_270_, i + i_271_, i_270_ + i_272_, i_273_,
		   i_274_);
	if (aBool9634 && anInt9623 != 0)
	    method15713(true);
    }
    
    public void method2295() {
	((Class103_Sub3) this).anInt9542 = 0;
	((Class103_Sub3) this).anInt9543 = 0;
	((Class103_Sub3) this).anInt9544 = aClass105_1470.method2655();
	((Class103_Sub3) this).anInt9502 = aClass105_1470.method2654();
	method15799();
    }
    
    public final void method2411(int i, int i_276_, int i_277_, int i_278_,
				 int i_279_, int i_280_) {
	if (aBool9634 && anInt9623 != 0)
	    method15713(false);
	if (aBool9552) {
	    method2308(false);
	    ((Class103_Sub3) this).aClass168_Sub1_9586
		.method3615(i, i_276_, i_277_, i_278_, 0, i_279_, i_280_);
	    method2308(true);
	} else
	    ((Class103_Sub3) this).aClass168_Sub1_9586
		.method3615(i, i_276_, i_277_, i_278_, 0, i_279_, i_280_);
	if (aBool9634 && anInt9623 != 0)
	    method15713(true);
    }
    
    public final void method2462(int i, int i_281_, int i_282_, int i_283_,
				 int i_284_, int i_285_) {
	if (aBool9634 && anInt9623 != 0)
	    method15713(false);
	if (aBool9552) {
	    method2308(false);
	    ((Class103_Sub3) this).aClass168_Sub1_9586
		.method3615(i, i_281_, i_282_, i_283_, 0, i_284_, i_285_);
	    method2308(true);
	} else
	    ((Class103_Sub3) this).aClass168_Sub1_9586
		.method3615(i, i_281_, i_282_, i_283_, 0, i_284_, i_285_);
	if (aBool9634 && anInt9623 != 0)
	    method15713(true);
    }
    
    final void method2267(int i, int i_286_, int i_287_, int i_288_,
			  int i_289_) {
	/* empty */
    }
    
    final void method2559(int i, int i_290_, int i_291_, int i_292_,
			  int i_293_) {
	/* empty */
    }
    
    final void method2415(int i, int i_294_, int i_295_, int i_296_,
			  int i_297_) {
	method2274(i, i_294_, i + i_295_, i_294_, i_296_, i_297_);
    }
    
    final void method2416(int i, int i_298_, int i_299_, int i_300_,
			  int i_301_) {
	method2274(i, i_298_, i + i_299_, i_298_, i_300_, i_301_);
    }
    
    final void method2417(int i, int i_302_, int i_303_, int i_304_,
			  int i_305_) {
	method2274(i, i_302_, i, i_302_ + i_303_, i_304_, i_305_);
    }
    
    public void method2320(float f, float f_306_, float f_307_, float[] fs) {
	float f_308_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		  * f_306_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		  * f_307_));
	float f_309_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * f_306_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * f_307_));
	if (f_308_ < -f_309_ || f_308_ > f_309_) {
	    float[] fs_310_ = fs;
	    float[] fs_311_ = fs;
	    fs[2] = Float.NaN;
	    fs_311_[1] = Float.NaN;
	    fs_310_[0] = Float.NaN;
	} else {
	    float f_312_
		= (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		      * f)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		      * f_306_)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		      * f_307_));
	    if (f_312_ < -f_309_ || f_312_ > f_309_) {
		float[] fs_313_ = fs;
		float[] fs_314_ = fs;
		fs[2] = Float.NaN;
		fs_314_[1] = Float.NaN;
		fs_313_[0] = Float.NaN;
	    } else {
		float f_315_ = ((((Class103_Sub3) this).aClass268_9525
				 .aFloatArray4353[13])
				+ (((Class103_Sub3) this).aClass268_9525
				   .aFloatArray4353[1]) * f
				+ (((Class103_Sub3) this).aClass268_9525
				   .aFloatArray4353[5]) * f_306_
				+ (((Class103_Sub3) this).aClass268_9525
				   .aFloatArray4353[9]) * f_307_);
		if (f_315_ < -f_309_ || f_315_ > f_309_) {
		    float[] fs_316_ = fs;
		    float[] fs_317_ = fs;
		    fs[2] = Float.NaN;
		    fs_317_[1] = Float.NaN;
		    fs_316_[0] = Float.NaN;
		} else {
		    float f_318_
			= (aClass268_9504.aFloatArray4353[14]
			   + aClass268_9504.aFloatArray4353[2] * f
			   + aClass268_9504.aFloatArray4353[6] * f_306_
			   + aClass268_9504.aFloatArray4353[10] * f_307_);
		    fs[0] = (((Class103_Sub3) this).aFloat9528
			     + (((Class103_Sub3) this).aFloat9529 * f_312_
				/ f_309_));
		    fs[1] = (((Class103_Sub3) this).aFloat9530
			     + (((Class103_Sub3) this).aFloat9531 * f_315_
				/ f_309_));
		    fs[2] = f_318_;
		}
	    }
	}
    }
    
    public void method2419(int i, int i_319_, int i_320_, int i_321_,
			   int i_322_, int i_323_, int i_324_, int i_325_,
			   int i_326_) {
	float f = (float) i_320_ - (float) i;
	float f_327_ = (float) i_321_ - (float) i_319_;
	if (f == 0.0F && f_327_ == 0.0F)
	    f = 1.0F;
	else {
	    float f_328_
		= (float) (1.0
			   / Math.sqrt((double) (f * f + f_327_ * f_327_)));
	    f *= f_328_;
	    f_327_ *= f_328_;
	}
	method15654();
	Class369 class369 = ((Class103_Sub3) this).aClass369Array9519[13];
	class369.method6601();
	class369.method6595(i_322_);
	method15640(i_323_);
	class369.method6598();
	method15713(false);
	i_326_ %= i_325_ + i_324_;
	float f_329_ = f * (float) i_324_;
	float f_330_ = f_327_ * (float) i_324_;
	float f_331_ = 0.0F;
	float f_332_ = 0.0F;
	float f_333_ = f_329_;
	float f_334_ = f_330_;
	if (i_326_ > i_324_) {
	    f_331_ = f * (float) (i_324_ + i_325_ - i_326_);
	    f_332_ = f_327_ * (float) (i_324_ + i_325_ - i_326_);
	} else {
	    f_333_ = f * (float) (i_324_ - i_326_);
	    f_334_ = f_327_ * (float) (i_324_ - i_326_);
	}
	float f_335_ = (float) i + f_331_;
	float f_336_ = (float) i_319_ + f_332_;
	float f_337_ = f * (float) i_325_;
	float f_338_ = f_327_ * (float) i_325_;
	for (;;) {
	    if (i_320_ > i) {
		if (f_335_ > (float) i_320_)
		    break;
		if (f_335_ + f_333_ > (float) i_320_)
		    f_333_ = (float) i_320_ - f_335_;
	    } else {
		if (f_335_ < (float) i_320_)
		    break;
		if (f_335_ + f_333_ < (float) i_320_)
		    f_333_ = (float) i_320_ - f_335_;
	    }
	    if (i_321_ > i_319_) {
		if (f_336_ > (float) i_321_)
		    break;
		if (f_336_ + f_334_ > (float) i_321_)
		    f_334_ = (float) i_321_ - f_336_;
	    } else {
		if (f_336_ < (float) i_321_)
		    break;
		if (f_336_ + f_334_ < (float) i_321_)
		    f_334_ = (float) i_321_ - f_336_;
	    }
	    if (!method15620(f_335_, f_336_, 0.0F, f_335_ + f_333_,
			     f_336_ + f_334_, 0.0F))
		return;
	    method15763();
	    f_335_ += f_337_ + f_333_;
	    f_336_ += f_338_ + f_334_;
	    f_333_ = f_329_;
	    f_334_ = f_330_;
	}
	method15713(true);
	class369.method6594();
    }
    
    public final void method2420(int i, int i_339_, int i_340_, int i_341_,
				 int i_342_, int i_343_, Class135 class135,
				 int i_344_, int i_345_) {
	/* empty */
    }
    
    public final void method2229(int i, int i_346_, int i_347_, int i_348_,
				 int i_349_, int i_350_, Class135 class135,
				 int i_351_, int i_352_) {
	/* empty */
    }
    
    public final Class268 method15743() {
	return aClass268Array9578[anInt9580];
    }
    
    public final void method2423(int i, int i_353_, int i_354_, int i_355_,
				 int i_356_, int i_357_, int i_358_) {
	i += 1.0F;
	i_353_ += 1.0F;
	i_354_ += 1.0F;
	i_355_ += 1.0F;
	float f = (float) (i_354_ - i);
	float f_359_ = (float) (i_355_ - i_353_);
	float f_360_
	    = 1.0F / (float) Math.sqrt((double) (f * f + f_359_ * f_359_));
	f *= f_360_;
	f_359_ *= f_360_;
	i -= f;
	i_353_ -= f_359_;
	float f_361_ = -f_359_;
	float f_362_ = f;
	f_361_ *= 0.5F * (float) i_357_;
	f_362_ *= 0.5F * (float) i_357_;
	((Class103_Sub3) this).aClass168_Sub1_9586.method3626
	    ((float) i - f_361_, (float) i_353_ - f_362_,
	     (float) i_354_ - f_361_, (float) i_355_ - f_362_,
	     (float) i + f_361_, (float) i_353_ + f_362_, 0, i_356_, i_358_);
    }
    
    public final void method2344(int i, int i_363_, int i_364_, int i_365_,
				 int i_366_, int i_367_, int i_368_) {
	i += 1.0F;
	i_363_ += 1.0F;
	i_364_ += 1.0F;
	i_365_ += 1.0F;
	float f = (float) (i_364_ - i);
	float f_369_ = (float) (i_365_ - i_363_);
	float f_370_
	    = 1.0F / (float) Math.sqrt((double) (f * f + f_369_ * f_369_));
	f *= f_370_;
	f_369_ *= f_370_;
	i -= f;
	i_363_ -= f_369_;
	float f_371_ = -f_369_;
	float f_372_ = f;
	f_371_ *= 0.5F * (float) i_367_;
	f_372_ *= 0.5F * (float) i_367_;
	((Class103_Sub3) this).aClass168_Sub1_9586.method3626
	    ((float) i - f_371_, (float) i_363_ - f_372_,
	     (float) i_364_ - f_371_, (float) i_365_ - f_372_,
	     (float) i + f_371_, (float) i_363_ + f_372_, 0, i_366_, i_368_);
    }
    
    public final void method2425(int i, int i_373_, int i_374_, int i_375_,
				 int i_376_, int i_377_, int i_378_) {
	i += 1.0F;
	i_373_ += 1.0F;
	i_374_ += 1.0F;
	i_375_ += 1.0F;
	float f = (float) (i_374_ - i);
	float f_379_ = (float) (i_375_ - i_373_);
	float f_380_
	    = 1.0F / (float) Math.sqrt((double) (f * f + f_379_ * f_379_));
	f *= f_380_;
	f_379_ *= f_380_;
	i -= f;
	i_373_ -= f_379_;
	float f_381_ = -f_379_;
	float f_382_ = f;
	f_381_ *= 0.5F * (float) i_377_;
	f_382_ *= 0.5F * (float) i_377_;
	((Class103_Sub3) this).aClass168_Sub1_9586.method3626
	    ((float) i - f_381_, (float) i_373_ - f_382_,
	     (float) i_374_ - f_381_, (float) i_375_ - f_382_,
	     (float) i + f_381_, (float) i_373_ + f_382_, 0, i_376_, i_378_);
    }
    
    final void method15744() {
	((Class103_Sub3) this).aClass268_9525.method5199(aClass268_9504);
	((Class103_Sub3) this).aClass268_9525
	    .method5202(((Class103_Sub3) this).aClass268_9521);
	((Class103_Sub3) this).aClass268_9525
	    .method5257(((Class103_Sub3) this).aFloatArrayArray9527[0]);
	((Class103_Sub3) this).aClass268_9525
	    .method5226(((Class103_Sub3) this).aFloatArrayArray9527[1]);
	((Class103_Sub3) this).aClass268_9525
	    .method5219(((Class103_Sub3) this).aFloatArrayArray9527[2]);
	((Class103_Sub3) this).aClass268_9525
	    .method5271(((Class103_Sub3) this).aFloatArrayArray9527[3]);
	((Class103_Sub3) this).aClass268_9525
	    .method5238(((Class103_Sub3) this).aFloatArrayArray9527[4]);
	((Class103_Sub3) this).aClass268_9525
	    .method5222(((Class103_Sub3) this).aFloatArrayArray9527[5]);
	aClass268_9526.method5199(((Class103_Sub3) this).aClass268_9525);
	method15652(aClass268_9526);
    }
    
    public int method2427(int i, int i_383_, int i_384_, int i_385_,
			  int i_386_, int i_387_) {
	int i_388_ = 0;
	float f = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		      * (float) i)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		      * (float) i_383_)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		      * (float) i_384_));
	float f_389_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		  * (float) i_385_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		  * (float) i_386_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		  * (float) i_387_));
	float f_390_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_383_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_384_));
	float f_391_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i_385_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_386_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_387_));
	if (f < -f_390_ && f_389_ < -f_391_)
	    i_388_ |= 0x10;
	else if (f > f_390_ && f_389_ > f_391_)
	    i_388_ |= 0x20;
	float f_392_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_383_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_384_));
	float f_393_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i_385_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_386_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_387_));
	if (f_392_ < -f_390_ && f_393_ < -f_391_)
	    i_388_ |= 0x1;
	if (f_392_ > f_390_ && f_393_ > f_391_)
	    i_388_ |= 0x2;
	float f_394_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_383_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_384_));
	float f_395_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i_385_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_386_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_387_));
	if (f_394_ < -f_390_ && f_395_ < -f_391_)
	    i_388_ |= 0x4;
	if (f_394_ > f_390_ && f_395_ > f_391_)
	    i_388_ |= 0x8;
	return i_388_;
    }
    
    public int method2370(int i, int i_396_, int i_397_, int i_398_,
			  int i_399_, int i_400_) {
	int i_401_ = 0;
	float f = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		      * (float) i)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		      * (float) i_396_)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		      * (float) i_397_));
	float f_402_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		  * (float) i_398_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		  * (float) i_399_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		  * (float) i_400_));
	float f_403_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_396_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_397_));
	float f_404_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i_398_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_399_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_400_));
	if (f < -f_403_ && f_402_ < -f_404_)
	    i_401_ |= 0x10;
	else if (f > f_403_ && f_402_ > f_404_)
	    i_401_ |= 0x20;
	float f_405_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_396_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_397_));
	float f_406_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i_398_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_399_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_400_));
	if (f_405_ < -f_403_ && f_406_ < -f_404_)
	    i_401_ |= 0x1;
	if (f_405_ > f_403_ && f_406_ > f_404_)
	    i_401_ |= 0x2;
	float f_407_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_396_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_397_));
	float f_408_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i_398_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_399_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_400_));
	if (f_407_ < -f_403_ && f_408_ < -f_404_)
	    i_401_ |= 0x4;
	if (f_407_ > f_403_ && f_408_ > f_404_)
	    i_401_ |= 0x8;
	return i_401_;
    }
    
    abstract Interface38 method15745(Class175 class175, int i, int i_409_,
				     int i_410_, boolean bool, byte[] is);
    
    public int method2430(int i, int i_411_, int i_412_, int i_413_,
			  int i_414_, int i_415_) {
	int i_416_ = 0;
	float f = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		      * (float) i)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		      * (float) i_411_)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		      * (float) i_412_));
	float f_417_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		  * (float) i_413_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		  * (float) i_414_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		  * (float) i_415_));
	float f_418_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_411_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_412_));
	float f_419_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i_413_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_414_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_415_));
	if (f < -f_418_ && f_417_ < -f_419_)
	    i_416_ |= 0x10;
	else if (f > f_418_ && f_417_ > f_419_)
	    i_416_ |= 0x20;
	float f_420_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_411_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_412_));
	float f_421_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i_413_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_414_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_415_));
	if (f_420_ < -f_418_ && f_421_ < -f_419_)
	    i_416_ |= 0x1;
	if (f_420_ > f_418_ && f_421_ > f_419_)
	    i_416_ |= 0x2;
	float f_422_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_411_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_412_));
	float f_423_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i_413_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_414_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_415_));
	if (f_422_ < -f_418_ && f_423_ < -f_419_)
	    i_416_ |= 0x4;
	if (f_422_ > f_418_ && f_423_ > f_419_)
	    i_416_ |= 0x8;
	return i_416_;
    }
    
    public void method2618(Class266 class266, Class97 class97,
			   Class272 class272) {
	Class268 class268 = aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3) this).aClass268_9525);
	class97.method2172(class272, ((Class103_Sub3) this).aClass268_9521,
			   class268, ((Class103_Sub3) this).aFloat9528,
			   ((Class103_Sub3) this).aFloat9530,
			   ((Class103_Sub3) this).aFloat9529,
			   ((Class103_Sub3) this).aFloat9531);
    }
    
    public void method2432(Class266 class266, Class97 class97,
			   Class272 class272) {
	Class268 class268 = aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3) this).aClass268_9525);
	class97.method2172(class272, ((Class103_Sub3) this).aClass268_9521,
			   class268, ((Class103_Sub3) this).aFloat9528,
			   ((Class103_Sub3) this).aFloat9530,
			   ((Class103_Sub3) this).aFloat9529,
			   ((Class103_Sub3) this).aFloat9531);
    }
    
    public void method2433(Class266 class266, Class97 class97,
			   Class272 class272) {
	Class268 class268 = aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3) this).aClass268_9525);
	class97.method2172(class272, ((Class103_Sub3) this).aClass268_9521,
			   class268, ((Class103_Sub3) this).aFloat9528,
			   ((Class103_Sub3) this).aFloat9530,
			   ((Class103_Sub3) this).aFloat9529,
			   ((Class103_Sub3) this).aFloat9531);
    }
    
    public final Class241_Sub47 method2391(int i) {
	Class241_Sub47_Sub1 class241_sub47_sub1 = new Class241_Sub47_Sub1(i);
	((Class103_Sub3) this).aClass429_9496.addNode(class241_sub47_sub1,
							 (short) -9615);
	return class241_sub47_sub1;
    }
    
    public final void method15746() {
	if (((Class103_Sub3) this).anInt9625 != 2) {
	    method15654();
	    method15852(false);
	    method15889(false);
	    method15660(false);
	    method15701(false);
	    method15640(1);
	    method15707((byte) 0);
	    ((Class103_Sub3) this).anInt9625 = 2;
	}
    }
    
    public void method2297(int i, int i_424_, int i_425_, int i_426_,
			   int i_427_, int i_428_, Class135 class135,
			   int i_429_, int i_430_, int i_431_, int i_432_,
			   int i_433_) {
	/* empty */
    }
    
    public final Class168 method2437(int i, int i_434_, boolean bool,
				     boolean bool_435_) {
	return new Class168_Sub1(this, i, i_434_, bool, bool_435_);
    }
    
    public final Class168 method2438(int i, int i_436_, boolean bool,
				     boolean bool_437_) {
	return new Class168_Sub1(this, i, i_436_, bool, bool_437_);
    }
    
    public final Class168 method2439(int[] is, int i, int i_438_, int i_439_,
				     int i_440_, boolean bool) {
	return new Class168_Sub1(this, i_439_, i_440_, is, i, i_438_);
    }
    
    public final Class168 method2540(int[] is, int i, int i_441_, int i_442_,
				     int i_443_, boolean bool) {
	return new Class168_Sub1(this, i_442_, i_443_, is, i, i_441_);
    }
    
    public void method2620() {
	if (((Class103_Sub3) this).aClass390_9547 != null)
	    ((Class103_Sub3) this).aClass390_9547.method6982();
    }
    
    public final Class168 method2294(int i, int i_444_, int i_445_, int i_446_,
				     boolean bool) {
	Class168_Sub1 class168_sub1
	    = new Class168_Sub1(this, i_445_, i_446_, bool, false);
	class168_sub1.method3675(0, 0, i_445_, i_446_, i, i_444_);
	return class168_sub1;
    }
    
    abstract Interface38 method15747(Class175 class175, int i, int i_447_,
				     int i_448_, boolean bool, byte[] is);
    
    public final Class135 method2444(int i, int i_449_, int[] is,
				     int[] is_450_) {
	return Class135_Sub2.method16275(this, i, i_449_, is, is_450_);
    }
    
    public final Class135 method2250(int i, int i_451_, int[] is,
				     int[] is_452_) {
	return Class135_Sub2.method16275(this, i, i_451_, is, is_452_);
    }
    
    public final Class135 method2446(int i, int i_453_, int[] is,
				     int[] is_454_) {
	return Class135_Sub2.method16275(this, i, i_453_, is, is_454_);
    }
    
    public final void method15748(Class305 class305, Class305 class305_455_) {
	boolean bool = false;
	if (aClass305Array9541[anInt9580] != class305) {
	    aClass305Array9541[anInt9580] = class305;
	    method15702();
	    bool = true;
	}
	if (aClass305Array9573[anInt9580] != class305_455_) {
	    aClass305Array9573[anInt9580] = class305_455_;
	    method15703();
	    bool = true;
	}
	if (bool)
	    ((Class103_Sub3) this).anInt9625 &= ~0xd;
    }
    
    public final void method2448(int i, Class135 class135, int i_456_,
				 int i_457_) {
	method2308(false);
	((Class103_Sub3) this).aClass168_Sub1_9571.method3647
	    (0.0F, 0.0F, (float) method2237((byte) 4).method2655(), 0.0F, 0.0F,
	     (float) method2237((byte) 4).method2654(), 0, class135, i_456_,
	     i_457_);
	method2308(true);
    }
    
    public final void method2449(int i, Class135 class135, int i_458_,
				 int i_459_) {
	method2308(false);
	((Class103_Sub3) this).aClass168_Sub1_9571.method3647
	    (0.0F, 0.0F, (float) method2237((byte) 4).method2655(), 0.0F, 0.0F,
	     (float) method2237((byte) 4).method2654(), 0, class135, i_458_,
	     i_459_);
	method2308(true);
    }
    
    final void method15749() {
	method15669();
	method15670();
	method15668();
	method15710();
	method15671();
	method15672();
	method15673();
	method15662();
	method15663();
	method15750();
	method15711();
	method15715();
	method15801();
	method15864();
	for (int i = anInt9647 - 1; i >= 0; i--) {
	    method15686(i);
	    method15702();
	    method15703();
	    method15699();
	}
	method16015();
	method15629();
    }
    
    abstract void method15750();
    
    public final Class89 method2452(Class161 class161, int i, int i_460_,
				    int i_461_, int i_462_) {
	return new Class89_Sub1(this, class161, i, i_461_, i_462_, i_460_);
    }
    
    public final Class89 method2503(Class161 class161, int i, int i_463_,
				    int i_464_, int i_465_) {
	return new Class89_Sub1(this, class161, i, i_464_, i_465_, i_463_);
    }
    
    public final Class89 method2454(Class161 class161, int i, int i_466_,
				    int i_467_, int i_468_) {
	return new Class89_Sub1(this, class161, i, i_467_, i_468_, i_466_);
    }
    
    public final int method2379(int i, int i_469_) {
	return i | i_469_;
    }
    
    public final Class166 method2257(int i, int i_470_, int[][] is,
				     int[][] is_471_, int i_472_, int i_473_,
				     int i_474_) {
	return new Class166_Sub1(this, i_473_, i_474_, i, i_470_, is, is_471_,
				 i_472_);
    }
    
    public abstract void method15751(int i, Interface40 interface40);
    
    public final Class266 method2458() {
	return ((Class103_Sub3) this).aClass266_9653;
    }
    
    public final Class266 method2233() {
	return ((Class103_Sub3) this).aClass266_9653;
    }
    
    abstract Interface40 method15752(boolean bool);
    
    public final void method2451(int i) {
	/* empty */
    }
    
    abstract void method15753();
    
    public final int method2463() {
	return anInt9630 - 2;
    }
    
    public final int method2464() {
	return anInt9630 - 2;
    }
    
    public final void method2469(int i, Class241_Sub43[] class241_sub43s) {
	for (int i_475_ = 0; i_475_ < i; i_475_++)
	    aClass241_Sub43Array9569[i_475_] = class241_sub43s[i_475_];
	anInt9524 = i;
    }
    
    public final void method2532(int i, Class241_Sub43[] class241_sub43s) {
	for (int i_476_ = 0; i_476_ < i; i_476_++)
	    aClass241_Sub43Array9569[i_476_] = class241_sub43s[i_476_];
	anInt9524 = i;
    }
    
    public final void method2582(int i, int i_477_, int i_478_, int i_479_,
				 int i_480_, int i_481_) {
	method2278(i, i_477_, i_478_, i_479_, i_480_, 1, i_481_);
    }
    
    public final void method2472(Class98 class98) {
	((Class103_Sub3) this).aClass391_9598.method6998(this, class98);
    }
    
    final Class268 method15754() {
	return aClass268_9555;
    }
    
    final void method15755() {
	if (!((Class103_Sub3) this).aBool9517) {
	    int i;
	    int i_482_;
	    if (aClass105_1470 != null) {
		i_482_ = aClass105_1470.method2655();
		i = aClass105_1470.method2654();
	    } else {
		i = 0;
		i_482_ = 0;
	    }
	    Class268 class268 = ((Class103_Sub3) this).aClass268_9607;
	    if (i_482_ != 0 && i != 0)
		class268.method5211(0.0F, (float) i_482_, 0.0F, (float) i,
				    -1.0F, 1.0F);
	    else
		class268.method5198();
	    ((Class103_Sub3) this).aClass268_9610.method5199(class268);
	    method15652(((Class103_Sub3) this).aClass268_9610);
	    ((Class103_Sub3) this).aBool9517 = true;
	}
    }
    
    abstract void method15756();
    
    public final void method2476(float f) {
	if (aFloat9566 != f) {
	    aFloat9566 = f;
	    method15669();
	    method15672();
	}
    }
    
    public final void method2386(float f) {
	if (aFloat9566 != f) {
	    aFloat9566 = f;
	    method15669();
	    method15672();
	}
    }
    
    public final void method2478(int i, float f, float f_483_, float f_484_,
				 float f_485_, float f_486_) {
	boolean bool = ((Class103_Sub3) this).anInt9477 != i;
	f *= 0.5F;
	f_483_ *= 0.5F;
	if (bool || aFloat9609 != f || aFloat9568 != f_483_) {
	    ((Class103_Sub3) this).anInt9477 = i;
	    aFloat9609 = f;
	    aFloat9568 = f_483_;
	    if (bool) {
		aFloat9563 = (float) (((Class103_Sub3) this).anInt9477
				      & 0xff0000) / 1.671168E7F;
		aFloat9564 = (float) (((Class103_Sub3) this).anInt9477
				      & 0xff00) / 65280.0F;
		aFloat9556 = ((float) (((Class103_Sub3) this).anInt9477 & 0xff)
			      / 255.0F);
		method15669();
	    }
	    method15670();
	}
	if (((Class103_Sub3) this).aFloatArray9560[0] != f_484_
	    || ((Class103_Sub3) this).aFloatArray9560[1] != f_485_
	    || ((Class103_Sub3) this).aFloatArray9560[2] != f_486_) {
	    ((Class103_Sub3) this).aFloatArray9560[0] = f_484_;
	    ((Class103_Sub3) this).aFloatArray9560[1] = f_485_;
	    ((Class103_Sub3) this).aFloatArray9560[2] = f_486_;
	    ((Class103_Sub3) this).aFloatArray9561[0] = -f_484_;
	    ((Class103_Sub3) this).aFloatArray9561[1] = -f_485_;
	    ((Class103_Sub3) this).aFloatArray9561[2] = -f_486_;
	    float f_487_
		= (float) (1.0 / Math.sqrt((double) (f_484_ * f_484_
						     + f_485_ * f_485_
						     + f_486_ * f_486_)));
	    aFloatArray9558[0] = f_484_ * f_487_;
	    aFloatArray9558[1] = f_485_ * f_487_;
	    aFloatArray9558[2] = f_486_ * f_487_;
	    aFloatArray9559[0] = -aFloatArray9558[0];
	    aFloatArray9559[1] = -aFloatArray9558[1];
	    aFloatArray9559[2] = -aFloatArray9558[2];
	    method15671();
	    ((Class103_Sub3) this).anInt9520
		= (int) (f_484_ * 256.0F / f_485_);
	    ((Class103_Sub3) this).anInt9627
		= (int) (f_486_ * 256.0F / f_485_);
	}
	method15672();
    }
    
    public final void method2593(Class88 class88) {
	((Class103_Sub3) this).aClass88_Sub1_9628 = (Class88_Sub1) class88;
    }
    
    abstract void method15757(Interface33 interface33, Class310 class310,
			      int i, int i_488_, int i_489_, int i_490_);
    
    public final void method2298(int i, int i_491_, float f, int i_492_,
				 int i_493_, float f_494_, int i_495_,
				 int i_496_, float f_497_, int i_498_,
				 int i_499_, int i_500_, int i_501_) {
	/* empty */
    }
    
    public final void method2223(int i, int i_502_, int i_503_) {
	if (anInt9589 != i || anInt9613 != i_502_ || anInt9614 != i_503_) {
	    anInt9589 = i;
	    anInt9613 = i_502_;
	    anInt9614 = i_503_;
	    method15842();
	    method15750();
	}
    }
    
    public final void method2483(int i, int i_504_, int i_505_) {
	if (anInt9589 != i || anInt9613 != i_504_ || anInt9614 != i_505_) {
	    anInt9589 = i;
	    anInt9613 = i_504_;
	    anInt9614 = i_505_;
	    method15842();
	    method15750();
	}
    }
    
    public final void method2477(int i, int i_506_, int i_507_) {
	if (anInt9589 != i || anInt9613 != i_506_ || anInt9614 != i_507_) {
	    anInt9589 = i;
	    anInt9613 = i_506_;
	    anInt9614 = i_507_;
	    method15842();
	    method15750();
	}
    }
    
    public final Class88 method2485(int i) {
	return new Class88_Sub1_Sub1(this, i);
    }
    
    public final Class88 method2566(int i) {
	return new Class88_Sub1_Sub1(this, i);
    }
    
    public final void method2490(Class88 class88) {
	((Class103_Sub3) this).aClass88_Sub1_9628 = (Class88_Sub1) class88;
    }
    
    abstract void method15758();
    
    Class86 method15759() {
	return ((Class103_Sub3) this).aClass86_9575;
    }
    
    public final void method2493(int i, int i_508_, int i_509_, int i_510_) {
	if (((Class103_Sub3) this).aClass382_9599 != null) {
	    for (int i_511_ = 0;
		 i_511_ < ((Class103_Sub3) this).aClass368Array9604.length;
		 i_511_++) {
		if (((Class103_Sub3) this).aClass368Array9604[i_511_] != null
		    && ((Class103_Sub3) this).aClass368Array9604[i_511_]
			   .method6582()
		    && !((Class103_Sub3) this).aClass368Array9604[i_511_]
			    .method6573()) {
		    ((Class103_Sub3) this).aClass382_9599
			.method6925(i, i_508_, i_509_, i_510_);
		    break;
		}
	    }
	}
    }
    
    public final void method2530() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6900();
    }
    
    public final boolean method2253() {
	return (((Class103_Sub3) this).aClass382_9599 != null
		&& (((Class382) ((Class103_Sub3) this).aClass382_9599)
		    .aBool5682));
    }
    
    public final boolean method2524() {
	return (((Class103_Sub3) this).aClass382_9599 != null
		&& (((Class382) ((Class103_Sub3) this).aClass382_9599)
		    .aBool5682));
    }
    
    public boolean method2497() {
	return (((Class103_Sub3) this).aClass368Array9604[1] != null
		&& ((Class103_Sub3) this).aClass368Array9604[1].method6582());
    }
    
    public final void method15760(int i) {
	switch (i) {
	case 4:
	    method15661(Class305.aClass305_4803, Class305.aClass305_4803);
	    break;
	case 2:
	    method15661(Class305.aClass305_4804, Class305.aClass305_4802);
	    break;
	case 3:
	    method15661(Class305.aClass305_4800, Class305.aClass305_4801);
	    break;
	case 0:
	    method15661(Class305.aClass305_4801, Class305.aClass305_4801);
	    break;
	case 1:
	    method15661(Class305.aClass305_4802, Class305.aClass305_4802);
	    break;
	}
    }
    
    abstract void method15761(int i);
    
    public void method2500(Class180 class180, float f, Class180 class180_512_,
			   float f_513_, Class180 class180_514_,
			   float f_515_) {
	int i = 0;
	if (class180_514_ == null && f_515_ > 0.0F)
	    f_515_ = 0.0F;
	if (class180_512_ == null && f_513_ > 0.0F) {
	    class180_512_ = class180_514_;
	    class180_514_ = null;
	    f_513_ = f_515_;
	    f_515_ = 0.0F;
	}
	if (class180 == null && f > 0.0F) {
	    class180 = class180_512_;
	    class180_512_ = class180_514_;
	    class180_514_ = null;
	    f = f_513_;
	    f_513_ = f_515_;
	    f_515_ = 0.0F;
	}
	Class368_Sub2.aClass180_Sub1Array10371[0] = (Class180_Sub1) class180;
	Class368_Sub2.aFloatArray10365[0] = f;
	if (f > 0.0F)
	    i++;
	Class368_Sub2.aClass180_Sub1Array10371[1]
	    = (Class180_Sub1) class180_512_;
	Class368_Sub2.aFloatArray10365[1] = f_513_;
	if (f_513_ > 0.0F)
	    i++;
	Class368_Sub2.aClass180_Sub1Array10371[2]
	    = (Class180_Sub1) class180_514_;
	Class368_Sub2.aFloatArray10365[2] = f_515_;
	if (f_515_ > 0.0F)
	    i++;
	Class368_Sub2.anInt10364 = i;
	Class368_Sub2.aFloat10363 = 1.0F - (f + f_513_ + f_515_);
    }
    
    public final void method15762(int i, Class306 class306) {
	method15926(i, class306, false, false);
    }
    
    public void method2413(Class180 class180, float f, Class180 class180_516_,
			   float f_517_, Class180 class180_518_,
			   float f_519_) {
	int i = 0;
	if (class180_518_ == null && f_519_ > 0.0F)
	    f_519_ = 0.0F;
	if (class180_516_ == null && f_517_ > 0.0F) {
	    class180_516_ = class180_518_;
	    class180_518_ = null;
	    f_517_ = f_519_;
	    f_519_ = 0.0F;
	}
	if (class180 == null && f > 0.0F) {
	    class180 = class180_516_;
	    class180_516_ = class180_518_;
	    class180_518_ = null;
	    f = f_517_;
	    f_517_ = f_519_;
	    f_519_ = 0.0F;
	}
	Class368_Sub2.aClass180_Sub1Array10371[0] = (Class180_Sub1) class180;
	Class368_Sub2.aFloatArray10365[0] = f;
	if (f > 0.0F)
	    i++;
	Class368_Sub2.aClass180_Sub1Array10371[1]
	    = (Class180_Sub1) class180_516_;
	Class368_Sub2.aFloatArray10365[1] = f_517_;
	if (f_517_ > 0.0F)
	    i++;
	Class368_Sub2.aClass180_Sub1Array10371[2]
	    = (Class180_Sub1) class180_518_;
	Class368_Sub2.aFloatArray10365[2] = f_519_;
	if (f_519_ > 0.0F)
	    i++;
	Class368_Sub2.anInt10364 = i;
	Class368_Sub2.aFloat10363 = 1.0F - (f + f_517_ + f_519_);
    }
    
    final void method15763() {
	method15955(0, ((Class103_Sub3) this).anInterface40_9640);
	method15716(((Class103_Sub3) this).aClass366_9643);
	method15623(Class310.aClass310_4821, 0, 1);
    }
    
    public final boolean method2504() {
	if (((Class103_Sub3) this).aClass368Array9604[3] != null
	    && !((Class103_Sub3) this).aClass368Array9604[3].method6582()) {
	    boolean bool = (((Class103_Sub3) this).aClass382_9599.method6895
			    (((Class103_Sub3) this).aClass368Array9604[3]));
	    if (bool)
		((Class103_Sub3) this).aClass379_9518.method6848();
	    return bool;
	}
	return false;
    }
    
    public final void method2505() {
	if (((Class103_Sub3) this).aClass368Array9604[3] != null
	    && ((Class103_Sub3) this).aClass368Array9604[3].method6582()) {
	    ((Class103_Sub3) this).aClass382_9599
		.method6897(((Class103_Sub3) this).aClass368Array9604[3]);
	    ((Class103_Sub3) this).aClass379_9518.method6848();
	}
    }
    
    public final boolean method2549() {
	return (((Class103_Sub3) this).aClass368Array9604[3] != null
		&& ((Class103_Sub3) this).aClass368Array9604[3].method6582());
    }
    
    final void method2507(float f, float f_520_, float f_521_, float f_522_,
			  float f_523_, float f_524_) {
	Class368_Sub3.aFloat10455 = f;
	Class368_Sub3.aFloat10452 = f_520_;
	Class368_Sub3.aFloat10453 = f_521_;
	Class368_Sub3.aFloat10458 = f_524_;
    }
    
    final void method2508(float f, float f_525_, float f_526_, float f_527_,
			  float f_528_, float f_529_) {
	Class368_Sub3.aFloat10455 = f;
	Class368_Sub3.aFloat10452 = f_525_;
	Class368_Sub3.aFloat10453 = f_526_;
	Class368_Sub3.aFloat10458 = f_529_;
    }
    
    final void method2509(float f, float f_530_, float f_531_, float f_532_,
			  float f_533_, float f_534_) {
	Class368_Sub3.aFloat10455 = f;
	Class368_Sub3.aFloat10452 = f_530_;
	Class368_Sub3.aFloat10453 = f_531_;
	Class368_Sub3.aFloat10458 = f_534_;
    }
    
    final void method2510(float f, float f_535_, float f_536_, float f_537_,
			  float f_538_, float f_539_) {
	Class368_Sub3.aFloat10455 = f;
	Class368_Sub3.aFloat10452 = f_535_;
	Class368_Sub3.aFloat10453 = f_536_;
	Class368_Sub3.aFloat10458 = f_539_;
    }
    
    final void method2312(float f, float f_540_, float f_541_, float f_542_,
			  float f_543_, float f_544_) {
	Class368_Sub3.aFloat10455 = f;
	Class368_Sub3.aFloat10452 = f_540_;
	Class368_Sub3.aFloat10453 = f_541_;
	Class368_Sub3.aFloat10458 = f_544_;
    }
    
    public final void method2426(int i, Class86 class86) {
	((Class103_Sub3) this).anInt9608 = i;
	((Class103_Sub3) this).aClass86_9575 = class86;
	((Class103_Sub3) this).aBool9565 = true;
    }
    
    public final void method2513(int i, Class86 class86) {
	((Class103_Sub3) this).anInt9608 = i;
	((Class103_Sub3) this).aClass86_9575 = class86;
	((Class103_Sub3) this).aBool9565 = true;
    }
    
    public final void method2514(int i, Class86 class86) {
	((Class103_Sub3) this).anInt9608 = i;
	((Class103_Sub3) this).aClass86_9575 = class86;
	((Class103_Sub3) this).aBool9565 = true;
    }
    
    public void method2222(int i) {
	if (((Class103_Sub3) this).aClass379_9518 != null)
	    ((Class103_Sub3) this).aClass379_9518.method6847();
	anInt9601 = i & 0x7fffffff;
    }
    
    final void method15764() {
	if (((Class103_Sub3) this).aClass385_9516 != Class385.aClass385_5704) {
	    Class385 class385 = ((Class103_Sub3) this).aClass385_9516;
	    ((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5704;
	    if (class385 == Class385.aClass385_5703)
		method15646();
	    method15755();
	    ((Class103_Sub3) this).aClass268_9523
		= ((Class103_Sub3) this).aClass268_9607;
	    method15659();
	    method15799();
	    ((Class103_Sub3) this).anInt9625 &= ~0x8;
	}
    }
    
    public final void method2480() {
	((Class103_Sub3) this).aBool9565 = false;
    }
    
    public void method2394(int i, int i_545_, int i_546_, int i_547_) {
	((Class103_Sub3) this).anInt9542 = i;
	((Class103_Sub3) this).anInt9543 = i_545_;
	((Class103_Sub3) this).anInt9544 = i_546_;
	((Class103_Sub3) this).anInt9502 = i_547_;
	method15799();
    }
    
    public final void method2519() {
	((Class103_Sub3) this).aBool9565 = false;
    }
    
    public final void method2466() {
	((Class103_Sub3) this).aBool9565 = false;
    }
    
    public final void method2520(int i, int i_548_, float f, int i_549_,
				 int i_550_, float f_551_, int i_552_,
				 int i_553_, float f_554_, int i_555_,
				 int i_556_, int i_557_, int i_558_) {
	/* empty */
    }
    
    abstract boolean method15765(Class175 class175, Class102 class102);
    
    public final Class88 method2611(int i) {
	return new Class88_Sub1_Sub1(this, i);
    }
    
    final void method15766(int i, int i_559_) {
	anInt9550 = i;
	anInt9551 = i_559_;
	method15629();
	if (!aBool9654 && (((Class103_Sub3) this).aBool9497
			   || method15624() == Class376.aClass376_5635)) {
	    aBool9654 = true;
	    method15641();
	}
	if (aBool9654)
	    method15742();
    }
    
    public final void method2525(int i, int i_560_, float f, int i_561_,
				 int i_562_, float f_563_, int i_564_,
				 int i_565_, float f_566_, int i_567_,
				 int i_568_, int i_569_, int i_570_) {
	/* empty */
    }
    
    public abstract void method15767(Class366 class366);
    
    public abstract void method15768(Class268 class268);
    
    public void method2528(float f, float f_571_, float f_572_, float[] fs) {
	float f_573_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		  * f_571_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		  * f_572_));
	float f_574_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * f_571_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * f_572_));
	if (f_573_ < -f_574_ || f_573_ > f_574_) {
	    float[] fs_575_ = fs;
	    float[] fs_576_ = fs;
	    fs[2] = Float.NaN;
	    fs_576_[1] = Float.NaN;
	    fs_575_[0] = Float.NaN;
	} else {
	    float f_577_
		= (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		      * f)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		      * f_571_)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		      * f_572_));
	    if (f_577_ < -f_574_ || f_577_ > f_574_) {
		float[] fs_578_ = fs;
		float[] fs_579_ = fs;
		fs[2] = Float.NaN;
		fs_579_[1] = Float.NaN;
		fs_578_[0] = Float.NaN;
	    } else {
		float f_580_ = ((((Class103_Sub3) this).aClass268_9525
				 .aFloatArray4353[13])
				+ (((Class103_Sub3) this).aClass268_9525
				   .aFloatArray4353[1]) * f
				+ (((Class103_Sub3) this).aClass268_9525
				   .aFloatArray4353[5]) * f_571_
				+ (((Class103_Sub3) this).aClass268_9525
				   .aFloatArray4353[9]) * f_572_);
		if (f_580_ < -f_574_ || f_580_ > f_574_) {
		    float[] fs_581_ = fs;
		    float[] fs_582_ = fs;
		    fs[2] = Float.NaN;
		    fs_582_[1] = Float.NaN;
		    fs_581_[0] = Float.NaN;
		} else {
		    float f_583_
			= (aClass268_9504.aFloatArray4353[14]
			   + aClass268_9504.aFloatArray4353[2] * f
			   + aClass268_9504.aFloatArray4353[6] * f_571_
			   + aClass268_9504.aFloatArray4353[10] * f_572_);
		    fs[0] = (((Class103_Sub3) this).aFloat9528
			     + (((Class103_Sub3) this).aFloat9529 * f_577_
				/ f_574_));
		    fs[1] = (((Class103_Sub3) this).aFloat9530
			     + (((Class103_Sub3) this).aFloat9531 * f_580_
				/ f_574_));
		    fs[2] = f_583_;
		}
	    }
	}
    }
    
    public final boolean method2598() {
	return true;
    }
    
    Class268 method15769() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515)
		method15648();
	    return ((Class103_Sub3) this).aClass268_9508;
	}
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    public void method2545(int i, int i_584_, int i_585_, int i_586_,
			   int i_587_, int i_588_, Class135 class135,
			   int i_589_, int i_590_, int i_591_, int i_592_,
			   int i_593_) {
	/* empty */
    }
    
    public final Class266 method2230() {
	return ((Class103_Sub3) this).aClass266_9653;
    }
    
    boolean method2547(int i, int i_594_, int i_595_, int i_596_,
		       Class266 class266, Class272 class272) {
	Class268 class268 = aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3) this).aClass268_9525);
	return class272.method5317(i, i_594_, i_595_, i_596_, class268,
				   ((Class103_Sub3) this).aFloat9528,
				   ((Class103_Sub3) this).aFloat9530,
				   ((Class103_Sub3) this).aFloat9529,
				   ((Class103_Sub3) this).aFloat9531);
    }
    
    public final void method2548(Class241_Sub47 class241_sub47) {
	((Class103_Sub3) this).aNativeHeap9495
	    = (((Class241_Sub47_Sub1) (Class241_Sub47_Sub1) class241_sub47)
	       .aNativeHeap10975);
    }
    
    public final void method2631(Class241_Sub47 class241_sub47) {
	((Class103_Sub3) this).aNativeHeap9495
	    = (((Class241_Sub47_Sub1) (Class241_Sub47_Sub1) class241_sub47)
	       .aNativeHeap10975);
    }
    
    public final Class96 method2414(Class639 class639, Class108[] class108s,
				    boolean bool) {
	return new Class96_Sub4(this, class639, class108s, bool);
    }
    
    public final Class96 method2551(Class639 class639, Class108[] class108s,
				    boolean bool) {
	return new Class96_Sub4(this, class639, class108s, bool);
    }
    
    final void method15770(Class310 class310, int i) {
	method15955(0, ((Class103_Sub3) this).anInterface40_9583);
	method15716(((Class103_Sub3) this).aClass366_9479);
	method15623(class310, 0, i);
    }
    
    public final Class96 method2553(Class639 class639, Class108[] class108s,
				    boolean bool) {
	return new Class96_Sub4(this, class639, class108s, bool);
    }
    
    public final int method2554(int i, int i_597_) {
	return i & i_597_ ^ i_597_;
    }
    
    public Class266 method2555() {
	return ((Class103_Sub3) this).aClass266_9651;
    }
    
    public Class266 method2556() {
	return ((Class103_Sub3) this).aClass266_9651;
    }
    
    public final Class268 method2557() {
	return ((Class103_Sub3) this).aClass268_9521;
    }
    
    public void method2558(float f, float f_598_, float f_599_, float f_600_,
			   float f_601_) {
	Class368_Sub1.aFloat10350 = f;
	Class368_Sub1.aFloat10345 = f_598_;
	Class368_Sub1.aFloat10352 = f_599_;
	Class368_Sub1.aFloat10344 = f_600_;
	Class368_Sub1.aFloat10354 = f_601_;
    }
    
    public void method2359(float f, float f_602_, float f_603_, float f_604_,
			   float f_605_) {
	Class368_Sub1.aFloat10350 = f;
	Class368_Sub1.aFloat10345 = f_602_;
	Class368_Sub1.aFloat10352 = f_603_;
	Class368_Sub1.aFloat10344 = f_604_;
	Class368_Sub1.aFloat10354 = f_605_;
    }
    
    public void method2367(float f, float f_606_, float f_607_, float f_608_,
			   float f_609_) {
	Class368_Sub1.aFloat10350 = f;
	Class368_Sub1.aFloat10345 = f_606_;
	Class368_Sub1.aFloat10352 = f_607_;
	Class368_Sub1.aFloat10344 = f_608_;
	Class368_Sub1.aFloat10354 = f_609_;
    }
    
    public void method2561(int i) {
	if (((Class103_Sub3) this).aClass379_9518 != null)
	    ((Class103_Sub3) this).aClass379_9518.method6847();
	anInt9601 = i & 0x7fffffff;
    }
    
    public final boolean method2215() {
	return aBool9634;
    }
    
    public void method2594(boolean bool) {
	((Class103_Sub3) this).aBool9497 = bool;
    }
    
    abstract Interface41 method15771(int i, int i_610_, boolean bool, int[] is,
				     int i_611_, int i_612_);
    
    public void method2216() {
	if (((Class103_Sub3) this).aClass390_9547 != null)
	    ((Class103_Sub3) this).aClass390_9547.method6982();
    }
    
    public void method2619() {
	if (((Class103_Sub3) this).aClass390_9547 != null)
	    ((Class103_Sub3) this).aClass390_9547.method6982();
    }
    
    abstract void method15772(int i, Class306 class306, boolean bool);
    
    public void method2376() {
	if (((Class103_Sub3) this).aClass390_9547 != null)
	    ((Class103_Sub3) this).aClass390_9547.method6973();
    }
    
    public final void method15773(Class387 class387) {
	aClass387Array9579[anInt9580] = class387;
	method15698();
    }
    
    void method15774() {
	ArrayList arraylist
	    = ((Class103_Sub3) this).aClass599_9478.method13135((short) 8331);
	Iterator iterator = arraylist.iterator();
	while (iterator.hasNext()) {
	    Interface45 interface45 = (Interface45) iterator.next();
	    interface45.method28();
	}
    }
    
    public void method15775(Interface45 interface45) {
	((Class103_Sub3) this).aClass599_9478
	    .method13136(interface45, anObject9480, (byte) 0);
    }
    
    public void method15776(Interface45 interface45) {
	((Class103_Sub3) this).aClass599_9478
	    .method13136(interface45, anObject9480, (byte) 0);
    }
    
    public void method15777(Interface45 interface45) {
	((Class103_Sub3) this).aClass599_9478
	    .method13136(interface45, anObject9480, (byte) 0);
    }
    
    Class47 method15778(byte[] is) {
	if (is == null)
	    return null;
	Class47 class47;
	try {
	    class47 = new Class47(is);
	} catch (Exception exception) {
	    return null;
	}
	return class47;
    }
    
    public void method15779(Interface45 interface45) {
	((Class103_Sub3) this).aClass599_9478.method13137(interface45,
							  -551354991);
    }
    
    public void method15780(Interface45 interface45) {
	((Class103_Sub3) this).aClass599_9478.method13137(interface45,
							  -551354991);
    }
    
    public void method15781(Interface45 interface45) {
	((Class103_Sub3) this).aClass599_9478.method13137(interface45,
							  -551354991);
    }
    
    void method15782() {
	ArrayList arraylist
	    = ((Class103_Sub3) this).aClass599_9478.method13135((short) -4423);
	Iterator iterator = arraylist.iterator();
	while (iterator.hasNext()) {
	    Interface45 interface45 = (Interface45) iterator.next();
	    interface45.method28();
	}
    }
    
    void method15783() {
	ArrayList arraylist = ((Class103_Sub3) this).aClass599_9478
				  .method13135((short) -32702);
	Iterator iterator = arraylist.iterator();
	while (iterator.hasNext()) {
	    Interface45 interface45 = (Interface45) iterator.next();
	    interface45.method28();
	}
    }
    
    public abstract Class116 method15784(String string);
    
    abstract Interface33 method15785(boolean bool);
    
    public abstract boolean method15786();
    
    public abstract boolean method15787();
    
    public final Class268 method2457() {
	return ((Class103_Sub3) this).aClass268_9652;
    }
    
    public abstract Class116 method15788(String string);
    
    byte[] method15789(String string, String string_613_) {
	return ((Class103_Sub3) this).aClass210_9487
		   .readContainerByIndentifiers(string, string_613_, 1031962244);
    }
    
    Class47 method15790(byte[] is) {
	if (is == null)
	    return null;
	Class47 class47;
	try {
	    class47 = new Class47(is);
	} catch (Exception exception) {
	    return null;
	}
	return class47;
    }
    
    abstract void method15791();
    
    public abstract void method15792(Class268 class268, Class268 class268_614_,
				     Class268 class268_615_);
    
    public abstract void method15793(Class268 class268, Class268 class268_616_,
				     Class268 class268_617_);
    
    public abstract void method15794(Class268 class268, Class268 class268_618_,
				     Class268 class268_619_);
    
    public abstract void method15795();
    
    public final void method15796() {
	((Class103_Sub3) this).anInterface31Array9606
	    = new Interface31[anInt9647];
	aClass268Array9578 = new Class268[anInt9647];
	aClass387Array9579 = new Class387[anInt9647];
	aClass305Array9541 = new Class305[anInt9647];
	aClass305Array9573 = new Class305[anInt9647];
	for (int i = 0; i < anInt9647; i++) {
	    aClass305Array9573[i] = Class305.aClass305_4801;
	    aClass305Array9541[i] = Class305.aClass305_4801;
	    aClass387Array9579[i] = Class387.aClass387_5710;
	    aClass268Array9578[i] = new Class268();
	}
	aClass241_Sub43Array9569 = new Class241_Sub43[anInt9630 - 2];
	int[] is = { -1 };
	anInterface41_9584 = method15682(1, 1, false, is, 0, 0);
	is[0] = -16777216;
	((Class103_Sub3) this).anInterface41_9585
	    = method15682(1, 1, false, is, 0, 0);
	method2228(new Class241_Sub47_Sub1(262144));
	((Class103_Sub3) this).aClass366_9485
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5549 }) });
	((Class103_Sub3) this).aClass366_9648
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5547 }) });
	((Class103_Sub3) this).aClass366_9602
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545),
			    new Class314(Class367.aClass367_5547),
			    new Class314(Class367.aClass367_5549),
			    new Class314(Class367.aClass367_5548) });
	((Class103_Sub3) this).aClass366_9641
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545),
			    new Class314(Class367.aClass367_5547),
			    new Class314(Class367.aClass367_5549) });
	for (int i = 0; i < 8; i++) {
	    ((Class103_Sub3) this).aClass89_Sub1Array9650[i]
		= new Class89_Sub1(this, 0, 0, false, false);
	    ((Class103_Sub3) this).aClass89_Sub1Array9499[i]
		= new Class89_Sub1(this, 0, 0, true, true);
	}
	method15613();
	((Class103_Sub3) this).anInterface33_9612 = method15714(true);
	method15885();
	method2572();
	method2252();
	((Class103_Sub3) this).aClass168_Sub1_9586
	    = new Class168_Sub1(this, anInterface41_9584);
	((Class103_Sub3) this).aClass168_Sub1_9571
	    = new Class168_Sub1(this,
				((Class103_Sub3) this).anInterface41_9585);
	method2450(3, 0);
    }
    
    public final void method15797() {
	((Class103_Sub3) this).anInterface31Array9606
	    = new Interface31[anInt9647];
	aClass268Array9578 = new Class268[anInt9647];
	aClass387Array9579 = new Class387[anInt9647];
	aClass305Array9541 = new Class305[anInt9647];
	aClass305Array9573 = new Class305[anInt9647];
	for (int i = 0; i < anInt9647; i++) {
	    aClass305Array9573[i] = Class305.aClass305_4801;
	    aClass305Array9541[i] = Class305.aClass305_4801;
	    aClass387Array9579[i] = Class387.aClass387_5710;
	    aClass268Array9578[i] = new Class268();
	}
	aClass241_Sub43Array9569 = new Class241_Sub43[anInt9630 - 2];
	int[] is = { -1 };
	anInterface41_9584 = method15682(1, 1, false, is, 0, 0);
	is[0] = -16777216;
	((Class103_Sub3) this).anInterface41_9585
	    = method15682(1, 1, false, is, 0, 0);
	method2228(new Class241_Sub47_Sub1(262144));
	((Class103_Sub3) this).aClass366_9485
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5549 }) });
	((Class103_Sub3) this).aClass366_9648
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5547 }) });
	((Class103_Sub3) this).aClass366_9602
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545),
			    new Class314(Class367.aClass367_5547),
			    new Class314(Class367.aClass367_5549),
			    new Class314(Class367.aClass367_5548) });
	((Class103_Sub3) this).aClass366_9641
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545),
			    new Class314(Class367.aClass367_5547),
			    new Class314(Class367.aClass367_5549) });
	for (int i = 0; i < 8; i++) {
	    ((Class103_Sub3) this).aClass89_Sub1Array9650[i]
		= new Class89_Sub1(this, 0, 0, false, false);
	    ((Class103_Sub3) this).aClass89_Sub1Array9499[i]
		= new Class89_Sub1(this, 0, 0, true, true);
	}
	method15613();
	((Class103_Sub3) this).anInterface33_9612 = method15714(true);
	method15885();
	method2572();
	method2252();
	((Class103_Sub3) this).aClass168_Sub1_9586
	    = new Class168_Sub1(this, anInterface41_9584);
	((Class103_Sub3) this).aClass168_Sub1_9571
	    = new Class168_Sub1(this,
				((Class103_Sub3) this).anInterface41_9585);
	method2450(3, 0);
    }
    
    public final void method15798() {
	((Class103_Sub3) this).anInterface31Array9606
	    = new Interface31[anInt9647];
	aClass268Array9578 = new Class268[anInt9647];
	aClass387Array9579 = new Class387[anInt9647];
	aClass305Array9541 = new Class305[anInt9647];
	aClass305Array9573 = new Class305[anInt9647];
	for (int i = 0; i < anInt9647; i++) {
	    aClass305Array9573[i] = Class305.aClass305_4801;
	    aClass305Array9541[i] = Class305.aClass305_4801;
	    aClass387Array9579[i] = Class387.aClass387_5710;
	    aClass268Array9578[i] = new Class268();
	}
	aClass241_Sub43Array9569 = new Class241_Sub43[anInt9630 - 2];
	int[] is = { -1 };
	anInterface41_9584 = method15682(1, 1, false, is, 0, 0);
	is[0] = -16777216;
	((Class103_Sub3) this).anInterface41_9585
	    = method15682(1, 1, false, is, 0, 0);
	method2228(new Class241_Sub47_Sub1(262144));
	((Class103_Sub3) this).aClass366_9485
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5549 }) });
	((Class103_Sub3) this).aClass366_9648
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5547 }) });
	((Class103_Sub3) this).aClass366_9602
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545),
			    new Class314(Class367.aClass367_5547),
			    new Class314(Class367.aClass367_5549),
			    new Class314(Class367.aClass367_5548) });
	((Class103_Sub3) this).aClass366_9641
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545),
			    new Class314(Class367.aClass367_5547),
			    new Class314(Class367.aClass367_5549) });
	for (int i = 0; i < 8; i++) {
	    ((Class103_Sub3) this).aClass89_Sub1Array9650[i]
		= new Class89_Sub1(this, 0, 0, false, false);
	    ((Class103_Sub3) this).aClass89_Sub1Array9499[i]
		= new Class89_Sub1(this, 0, 0, true, true);
	}
	method15613();
	((Class103_Sub3) this).anInterface33_9612 = method15714(true);
	method15885();
	method2572();
	method2252();
	((Class103_Sub3) this).aClass168_Sub1_9586
	    = new Class168_Sub1(this, anInterface41_9584);
	((Class103_Sub3) this).aClass168_Sub1_9571
	    = new Class168_Sub1(this,
				((Class103_Sub3) this).anInterface41_9585);
	method2450(3, 0);
    }
    
    final void method15799() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    anInt9546 = ((Class103_Sub3) this).anInt9542;
	    anInt9545 = ((Class103_Sub3) this).anInt9543;
	    anInt9482 = ((Class103_Sub3) this).anInt9544;
	    anInt9617 = ((Class103_Sub3) this).anInt9502;
	    aFloat9532 = ((Class103_Sub3) this).aFloat9534;
	    aFloat9533 = ((Class103_Sub3) this).aFloat9535;
	} else {
	    anInt9546 = 0;
	    anInt9545 = 0;
	    anInt9482 = aClass105_1470.method2655();
	    anInt9617 = aClass105_1470.method2654();
	    aFloat9532 = 0.0F;
	    aFloat9533 = 1.0F;
	}
	method15629();
	((Class103_Sub3) this).aFloat9529
	    = (float) ((Class103_Sub3) this).anInt9544 / 2.0F;
	((Class103_Sub3) this).aFloat9531
	    = (float) ((Class103_Sub3) this).anInt9502 / 2.0F;
	((Class103_Sub3) this).aFloat9528
	    = ((float) ((Class103_Sub3) this).anInt9542
	       + ((Class103_Sub3) this).aFloat9529);
	((Class103_Sub3) this).aFloat9530
	    = ((float) ((Class103_Sub3) this).anInt9543
	       + ((Class103_Sub3) this).aFloat9531);
    }
    
    final void method15800() {
	((Class103_Sub3) this).aClass375_9494 = new Class375(this);
	aBool9488 = false;
	try {
	    ((Class103_Sub3) this).aClass361_9540 = new Class361_Sub1(this);
	    ((Class103_Sub3) this).aClass352_9593 = new Class352_Sub1(this);
	    ((Class103_Sub3) this).aClass66_9594 = new Class66_Sub2(this);
	    ((Class103_Sub3) this).aClass358_9595 = new Class358_Sub2(this);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9554
		= new Class369_Sub1_Sub2(this,
					 ((Class103_Sub3) this).aClass375_9494,
					 false);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9597
		= new Class369_Sub1_Sub2(this,
					 ((Class103_Sub3) this).aClass375_9494,
					 true);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub1_9605
		= new Class369_Sub1_Sub1(this, (((Class103_Sub3) this)
						.aClass375_9494));
	} catch (Exception exception) {
	    exception.printStackTrace();
	    ((Class103_Sub3) this).aClass361_9540 = new Class361_Sub2(this);
	    ((Class103_Sub3) this).aClass352_9593 = new Class352_Sub2(this);
	    ((Class103_Sub3) this).aClass66_9594 = new Class66_Sub1(this);
	    ((Class103_Sub3) this).aClass358_9595 = new Class358_Sub1(this);
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9554 = null;
	    ((Class103_Sub3) this).aClass369_Sub1_Sub2_9597 = null;
	    ((Class103_Sub3) this).aClass369_Sub1_Sub1_9605 = null;
	    aBool9488 = true;
	}
	if (!aBool9488 && !aBool9639) {
	    int i;
	    int i_620_;
	    if (aClass105_1470 != null) {
		i_620_ = aClass105_1470.method2655();
		i = aClass105_1470.method2654();
	    } else {
		i = 0;
		i_620_ = 0;
	    }
	    ((Class103_Sub3) this).aClass382_9599
		= new Class382(this, i_620_, i);
	    ((Class103_Sub3) this).aClass368Array9604[3]
		= new Class368_Sub3(this);
	    ((Class103_Sub3) this).aClass368Array9604[1]
		= new Class368_Sub1(this);
	    ((Class103_Sub3) this).aClass368Array9604[2]
		= new Class368_Sub2(this);
	    ((Class103_Sub3) this).aClass382_9599
		.method6895(((Class103_Sub3) this).aClass368Array9604[3]);
	    ((Class103_Sub3) this).aClass382_9599
		.method6895(((Class103_Sub3) this).aClass368Array9604[1]);
	    ((Class103_Sub3) this).aClass382_9599
		.method6895(((Class103_Sub3) this).aClass368Array9604[2]);
	    method15627();
	    method15628();
	}
	if (((Class103_Sub3) this).aClass369_9590 != null) {
	    ((Class103_Sub3) this).aClass369_9590.method6594();
	    ((Class103_Sub3) this).aClass369_9590 = null;
	}
	method15616();
    }
    
    abstract void method15801();
    
    final void method15802() {
	method15669();
	method15670();
	method15668();
	method15710();
	method15671();
	method15672();
	method15673();
	method15662();
	method15663();
	method15750();
	method15711();
	method15715();
	method15801();
	method15864();
	for (int i = anInt9647 - 1; i >= 0; i--) {
	    method15686(i);
	    method15702();
	    method15703();
	    method15699();
	}
	method16015();
	method15629();
    }
    
    final void method15803() {
	method15669();
	method15670();
	method15668();
	method15710();
	method15671();
	method15672();
	method15673();
	method15662();
	method15663();
	method15750();
	method15711();
	method15715();
	method15801();
	method15864();
	for (int i = anInt9647 - 1; i >= 0; i--) {
	    method15686(i);
	    method15702();
	    method15703();
	    method15699();
	}
	method16015();
	method15629();
    }
    
    abstract boolean method15804(Class175 class175, Class102 class102);
    
    abstract void method15805();
    
    void method15806() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6902();
	if (((Class103_Sub3) this).anInterface40_9583 != null)
	    ((Class103_Sub3) this).anInterface40_9583.method28();
	if (((Class103_Sub3) this).anInterface40_9640 != null)
	    ((Class103_Sub3) this).anInterface40_9640.method28();
	if (((Class103_Sub3) this).anInterface40_9642 != null)
	    ((Class103_Sub3) this).anInterface40_9642.method28();
	for (int i = 0; i < 8; i++) {
	    if (((Class103_Sub3) this).aClass89_Sub1Array9499[i] != null)
		((Class103_Sub3) this).aClass89_Sub1Array9499[i].method15525();
	}
	if (((Class103_Sub3) this).aClass391_9598 != null)
	    ((Class103_Sub3) this).aClass391_9598.method6997();
	if (((Class103_Sub3) this).anInterface33_9612 != null)
	    ((Class103_Sub3) this).anInterface33_9612.method28();
	if (((Class103_Sub3) this).aClass390_9547 != null) {
	    ((Class103_Sub3) this).aClass390_9547.method6966();
	    ((Class103_Sub3) this).aClass390_9547 = null;
	}
    }
    
    void method15807() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6902();
	if (((Class103_Sub3) this).anInterface40_9583 != null)
	    ((Class103_Sub3) this).anInterface40_9583.method28();
	if (((Class103_Sub3) this).anInterface40_9640 != null)
	    ((Class103_Sub3) this).anInterface40_9640.method28();
	if (((Class103_Sub3) this).anInterface40_9642 != null)
	    ((Class103_Sub3) this).anInterface40_9642.method28();
	for (int i = 0; i < 8; i++) {
	    if (((Class103_Sub3) this).aClass89_Sub1Array9499[i] != null)
		((Class103_Sub3) this).aClass89_Sub1Array9499[i].method15525();
	}
	if (((Class103_Sub3) this).aClass391_9598 != null)
	    ((Class103_Sub3) this).aClass391_9598.method6997();
	if (((Class103_Sub3) this).anInterface33_9612 != null)
	    ((Class103_Sub3) this).anInterface33_9612.method28();
	if (((Class103_Sub3) this).aClass390_9547 != null) {
	    ((Class103_Sub3) this).aClass390_9547.method6966();
	    ((Class103_Sub3) this).aClass390_9547 = null;
	}
    }
    
    void method15808() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6902();
	if (((Class103_Sub3) this).anInterface40_9583 != null)
	    ((Class103_Sub3) this).anInterface40_9583.method28();
	if (((Class103_Sub3) this).anInterface40_9640 != null)
	    ((Class103_Sub3) this).anInterface40_9640.method28();
	if (((Class103_Sub3) this).anInterface40_9642 != null)
	    ((Class103_Sub3) this).anInterface40_9642.method28();
	for (int i = 0; i < 8; i++) {
	    if (((Class103_Sub3) this).aClass89_Sub1Array9499[i] != null)
		((Class103_Sub3) this).aClass89_Sub1Array9499[i].method15525();
	}
	if (((Class103_Sub3) this).aClass391_9598 != null)
	    ((Class103_Sub3) this).aClass391_9598.method6997();
	if (((Class103_Sub3) this).anInterface33_9612 != null)
	    ((Class103_Sub3) this).anInterface33_9612.method28();
	if (((Class103_Sub3) this).aClass390_9547 != null) {
	    ((Class103_Sub3) this).aClass390_9547.method6966();
	    ((Class103_Sub3) this).aClass390_9547 = null;
	}
    }
    
    void method15809() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6902();
	if (((Class103_Sub3) this).anInterface40_9583 != null)
	    ((Class103_Sub3) this).anInterface40_9583.method28();
	if (((Class103_Sub3) this).anInterface40_9640 != null)
	    ((Class103_Sub3) this).anInterface40_9640.method28();
	if (((Class103_Sub3) this).anInterface40_9642 != null)
	    ((Class103_Sub3) this).anInterface40_9642.method28();
	for (int i = 0; i < 8; i++) {
	    if (((Class103_Sub3) this).aClass89_Sub1Array9499[i] != null)
		((Class103_Sub3) this).aClass89_Sub1Array9499[i].method15525();
	}
	if (((Class103_Sub3) this).aClass391_9598 != null)
	    ((Class103_Sub3) this).aClass391_9598.method6997();
	if (((Class103_Sub3) this).anInterface33_9612 != null)
	    ((Class103_Sub3) this).anInterface33_9612.method28();
	if (((Class103_Sub3) this).aClass390_9547 != null) {
	    ((Class103_Sub3) this).aClass390_9547.method6966();
	    ((Class103_Sub3) this).aClass390_9547 = null;
	}
    }
    
    void method15810() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6927();
	if (((Class103_Sub3) this).aClass368Array9604 != null) {
	    for (int i = 0;
		 i < ((Class103_Sub3) this).aClass368Array9604.length; i++) {
		if (((Class103_Sub3) this).aClass368Array9604[i] != null
		    && ((Class103_Sub3) this).aClass368Array9604[i]
			   .method6582())
		    ((Class103_Sub3) this).aClass368Array9604[i].method6563();
	    }
	}
	((Class103_Sub3) this).aClass391_9598 = new Class391(this);
	method15965();
	method15618();
	method15619();
	((Class103_Sub3) this).aClass391_9598.method7013(this);
	if (aBool9549)
	    ((Class103_Sub3) this).aClass390_9547 = new Class390(this, 1024);
    }
    
    abstract Interface41 method15811(Class175 class175, int i, int i_621_,
				     boolean bool, byte[] is, int i_622_,
				     int i_623_);
    
    void method15812() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6927();
	if (((Class103_Sub3) this).aClass368Array9604 != null) {
	    for (int i = 0;
		 i < ((Class103_Sub3) this).aClass368Array9604.length; i++) {
		if (((Class103_Sub3) this).aClass368Array9604[i] != null
		    && ((Class103_Sub3) this).aClass368Array9604[i]
			   .method6582())
		    ((Class103_Sub3) this).aClass368Array9604[i].method6563();
	    }
	}
	((Class103_Sub3) this).aClass391_9598 = new Class391(this);
	method15965();
	method15618();
	method15619();
	((Class103_Sub3) this).aClass391_9598.method7013(this);
	if (aBool9549)
	    ((Class103_Sub3) this).aClass390_9547 = new Class390(this, 1024);
    }
    
    final void method15813() {
	if (((Class103_Sub3) this).aClass385_9516 != Class385.aClass385_5703) {
	    ((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5703;
	    method15646();
	    method15658();
	    ((Class103_Sub3) this).aClass268_9523
		= ((Class103_Sub3) this).aClass268_9521;
	    method15659();
	    method15799();
	    ((Class103_Sub3) this).anInt9625 &= ~0x7;
	}
    }
    
    final void method15814() {
	((Class103_Sub3) this).anInterface40_9583 = method15752(false);
	int i = 160;
	((Class103_Sub3) this).anInterface40_9583.method221(i, 32);
	aByteBuffer9490.clear();
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putInt(-1);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putInt(-1);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putInt(-1);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putInt(-1);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putInt(-1);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	((Class103_Sub3) this).anInterface40_9583
	    .method268(0, aByteBuffer9490.position(), aLong9491);
	((Class103_Sub3) this).aClass366_9479
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5547,
					   Class367.aClass367_5549,
					   Class367.aClass367_5549 }) });
    }
    
    abstract void method15815(int i);
    
    final void method15816() {
	((Class103_Sub3) this).anInterface40_9642 = method15752(false);
	((Class103_Sub3) this).anInterface40_9642.method221(3096, 12);
	aByteBuffer9490.clear();
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	for (int i = 0; i <= 256; i++) {
	    double d = (double) (i * 2) * 3.141592653589793 / 256.0;
	    float f = (float) Math.cos(d);
	    float f_624_ = (float) Math.sin(d);
	    aByteBuffer9490.putFloat(f_624_);
	    aByteBuffer9490.putFloat(f);
	    aByteBuffer9490.putFloat(0.0F);
	}
	((Class103_Sub3) this).anInterface40_9642
	    .method268(0, aByteBuffer9490.position(), aLong9491);
    }
    
    abstract void method15817();
    
    final void method15818() {
	method15669();
	method15670();
	method15668();
	method15710();
	method15671();
	method15672();
	method15673();
	method15662();
	method15663();
	method15750();
	method15711();
	method15715();
	method15801();
	method15864();
	for (int i = anInt9647 - 1; i >= 0; i--) {
	    method15686(i);
	    method15702();
	    method15703();
	    method15699();
	}
	method16015();
	method15629();
    }
    
    boolean method15819(float f, float f_625_, float f_626_, float f_627_,
			float f_628_, float f_629_) {
	aByteBuffer9490.clear();
	aByteBuffer9490.putFloat(f);
	aByteBuffer9490.putFloat(f_625_);
	aByteBuffer9490.putFloat(f_626_);
	aByteBuffer9490.putFloat(f_627_);
	aByteBuffer9490.putFloat(f_628_);
	aByteBuffer9490.putFloat(f_629_);
	return ((Class103_Sub3) this).anInterface40_9640
		   .method268(0, aByteBuffer9490.position(), aLong9491);
    }
    
    public final void method2405(int[] is) {
	is[0] = anInt9512;
	is[1] = anInt9538;
	is[2] = anInt9574;
	is[3] = anInt9581;
    }
    
    public final Class168 method2496(Class108 class108, boolean bool) {
	Class168 class168;
	if (class108.method2698() != 0 && class108.method2694() != 0) {
	    int[] is = class108.method2707(false);
	    class168 = method2259(is, 0, class108.method2698(),
				  class108.method2698(), class108.method2694(),
				  (byte) -60);
	} else
	    class168 = method2259(new int[] { 0 }, 0, 1, 1, 1, (byte) -109);
	class168.method3602(class108.method2695(), class108.method2697(),
			    class108.method2696(), class108.method2742());
	return class168;
    }
    
    Class376 method15820() {
	if (((Class103_Sub3) this).aClass390_9547 == null)
	    return Class376.aClass376_5635;
	return ((Class103_Sub3) this).aClass390_9547.method6974();
    }
    
    void method15821() {
	method15626();
    }
    
    public final void method2399(int i, int i_630_, int i_631_, int i_632_) {
	int i_633_;
	int i_634_;
	if (aClass105_1470 != null) {
	    i_634_ = aClass105_1470.method2655();
	    i_633_ = aClass105_1470.method2654();
	} else {
	    i_633_ = 0;
	    i_634_ = 0;
	}
	if (i <= 0 && i_631_ >= i_634_ - 1 && i_630_ <= 0
	    && i_632_ >= i_633_ - 1)
	    method2572();
	else {
	    anInt9512 = i >= 0 ? i : 0;
	    anInt9574 = i_631_ <= i_634_ ? i_631_ : i_634_;
	    anInt9538 = i_630_ >= 0 ? i_630_ : 0;
	    anInt9581 = i_632_ <= i_633_ ? i_632_ : i_633_;
	    if (!aBool9654 && (((Class103_Sub3) this).aBool9497
			       || method15624() == Class376.aClass376_5635)) {
		aBool9654 = true;
		method15641();
	    }
	    if (aBool9654)
		method15742();
	}
    }
    
    void method15822() {
	method15626();
    }
    
    void method15823() {
	method15995();
	method15918();
	method15653();
	method2295();
	method2572();
    }
    
    abstract void method15824();
    
    boolean method15825() {
	if (((Class103_Sub3) this).aClass368Array9604[2] != null
	    && !((Class103_Sub3) this).aClass368Array9604[2].method6582()) {
	    boolean bool = (((Class103_Sub3) this).aClass382_9599.method6895
			    (((Class103_Sub3) this).aClass368Array9604[2]));
	    if (bool)
		((Class103_Sub3) this).aClass379_9518.method6848();
	    return bool;
	}
	return false;
    }
    
    public final Class168 method2275(int i, int i_635_, boolean bool,
				     boolean bool_636_) {
	return new Class168_Sub1(this, i, i_635_, bool, bool_636_);
    }
    
    public abstract void method15826(Class310 class310, int i, int i_637_,
				     int i_638_, int i_639_);
    
    final Interface33 method15827(int i) {
	if (((Class103_Sub3) this).anInterface33_9612.method53() < i * 2)
	    ((Class103_Sub3) this).anInterface33_9612.method185(i);
	return ((Class103_Sub3) this).anInterface33_9612;
    }
    
    final Interface41 method15828(int i, int i_640_, boolean bool, int[] is) {
	return method15682(i, i_640_, bool, is, 0, 0);
    }
    
    final Interface33 method15829(int i) {
	if (((Class103_Sub3) this).anInterface33_9612.method53() < i * 2)
	    ((Class103_Sub3) this).anInterface33_9612.method185(i);
	return ((Class103_Sub3) this).anInterface33_9612;
    }
    
    public final Interface30 method15830() {
	return (((Class103_Sub3) this).aClass88_Sub1_9628 != null
		? ((Class103_Sub3) this).aClass88_Sub1_9628.method15111()
		: null);
    }
    
    final void method15831() {
	method15700();
    }
    
    abstract void method15832(int i);
    
    public abstract void method15833(Class268 class268, Class268 class268_641_,
				     Class268 class268_642_);
    
    final void method15834() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    anInt9546 = ((Class103_Sub3) this).anInt9542;
	    anInt9545 = ((Class103_Sub3) this).anInt9543;
	    anInt9482 = ((Class103_Sub3) this).anInt9544;
	    anInt9617 = ((Class103_Sub3) this).anInt9502;
	    aFloat9532 = ((Class103_Sub3) this).aFloat9534;
	    aFloat9533 = ((Class103_Sub3) this).aFloat9535;
	} else {
	    anInt9546 = 0;
	    anInt9545 = 0;
	    anInt9482 = aClass105_1470.method2655();
	    anInt9617 = aClass105_1470.method2654();
	    aFloat9532 = 0.0F;
	    aFloat9533 = 1.0F;
	}
	method15629();
	((Class103_Sub3) this).aFloat9529
	    = (float) ((Class103_Sub3) this).anInt9544 / 2.0F;
	((Class103_Sub3) this).aFloat9531
	    = (float) ((Class103_Sub3) this).anInt9502 / 2.0F;
	((Class103_Sub3) this).aFloat9528
	    = ((float) ((Class103_Sub3) this).anInt9542
	       + ((Class103_Sub3) this).aFloat9529);
	((Class103_Sub3) this).aFloat9530
	    = ((float) ((Class103_Sub3) this).anInt9543
	       + ((Class103_Sub3) this).aFloat9531);
    }
    
    final void method15835(int i, int i_643_) {
	anInt9550 = i;
	anInt9551 = i_643_;
	method15629();
	if (!aBool9654 && (((Class103_Sub3) this).aBool9497
			   || method15624() == Class376.aClass376_5635)) {
	    aBool9654 = true;
	    method15641();
	}
	if (aBool9654)
	    method15742();
    }
    
    public Class266 method2307() {
	return ((Class103_Sub3) this).aClass266_9651;
    }
    
    abstract void method15836(int i, Class306 class306, boolean bool);
    
    abstract void method15837();
    
    abstract boolean method15838(Class175 class175, Class102 class102);
    
    public final void method2474(Class268 class268) {
	((Class103_Sub3) this).aClass268_9521.method5199(class268);
	method15609();
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703)
	    method15659();
    }
    
    abstract void method15839();
    
    public final void method2299(int i) {
	/* empty */
    }
    
    abstract void method15840();
    
    final Class268 method15841() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703)
	    return aClass268_9504;
	return aClass268_9509;
    }
    
    public void method2526() {
	((Class103_Sub3) this).anInt9542 = 0;
	((Class103_Sub3) this).anInt9543 = 0;
	((Class103_Sub3) this).anInt9544 = aClass105_1470.method2655();
	((Class103_Sub3) this).anInt9502 = aClass105_1470.method2654();
	method15799();
    }
    
    final void method15842() {
	if (((Class103_Sub3) this).aClass369_9590 != null)
	    ((Class103_Sub3) this).aClass369_9590.method6597();
	method15711();
    }
    
    abstract void method15843();
    
    void method15844() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6902();
	if (((Class103_Sub3) this).anInterface40_9583 != null)
	    ((Class103_Sub3) this).anInterface40_9583.method28();
	if (((Class103_Sub3) this).anInterface40_9640 != null)
	    ((Class103_Sub3) this).anInterface40_9640.method28();
	if (((Class103_Sub3) this).anInterface40_9642 != null)
	    ((Class103_Sub3) this).anInterface40_9642.method28();
	for (int i = 0; i < 8; i++) {
	    if (((Class103_Sub3) this).aClass89_Sub1Array9499[i] != null)
		((Class103_Sub3) this).aClass89_Sub1Array9499[i].method15525();
	}
	if (((Class103_Sub3) this).aClass391_9598 != null)
	    ((Class103_Sub3) this).aClass391_9598.method6997();
	if (((Class103_Sub3) this).anInterface33_9612 != null)
	    ((Class103_Sub3) this).anInterface33_9612.method28();
	if (((Class103_Sub3) this).aClass390_9547 != null) {
	    ((Class103_Sub3) this).aClass390_9547.method6966();
	    ((Class103_Sub3) this).aClass390_9547 = null;
	}
    }
    
    final void method15845() {
	((Class103_Sub3) this).aBool9515 = false;
    }
    
    public final void method2407(int i, int i_644_, int i_645_, int i_646_,
				 int i_647_, int i_648_) {
	i_645_--;
	i_646_--;
	int i_649_ = 0;
	if (this instanceof Class103_Sub3_Sub2)
	    i_649_ = -1;
	if (aBool9634 && anInt9623 != 0)
	    method15713(false);
	method2274(i, i_644_ + i_649_, i + i_645_, i_644_ + i_649_, i_647_,
		   i_648_);
	method2274(i, i_644_ + i_646_ + i_649_, i + i_645_,
		   i_644_ + i_646_ + i_649_, i_647_, i_648_);
	method2274(i, i_644_, i, i_644_ + i_646_, i_647_, i_648_);
	method2274(i + i_645_, i_644_, i + i_645_, i_644_ + i_646_, i_647_,
		   i_648_);
	if (aBool9634 && anInt9623 != 0)
	    method15713(true);
    }
    
    public final void method2522(int i, int i_650_, float f, int i_651_,
				 int i_652_, float f_653_, int i_654_,
				 int i_655_, float f_656_, int i_657_,
				 int i_658_, int i_659_, int i_660_) {
	/* empty */
    }
    
    Class266 method15846() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515) {
		((Class103_Sub3) this).aClass266_9507
		    .method5175(((Class103_Sub3) this).aClass266_9500);
		((Class103_Sub3) this).aClass266_9507
		    .method5134(((Class103_Sub3) this).aClass266_9651);
		((Class103_Sub3) this).aClass268_9508
		    .method5203(((Class103_Sub3) this).aClass266_9507);
		((Class103_Sub3) this).aBool9515 = true;
	    }
	    return ((Class103_Sub3) this).aClass266_9507;
	}
	return ((Class103_Sub3) this).aClass266_9500;
    }
    
    Class268 method15847() {
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    boolean method15848(float f, float f_661_, float f_662_, float f_663_,
			float f_664_, float f_665_) {
	aByteBuffer9490.clear();
	aByteBuffer9490.putFloat(f);
	aByteBuffer9490.putFloat(f_661_);
	aByteBuffer9490.putFloat(f_662_);
	aByteBuffer9490.putFloat(f_663_);
	aByteBuffer9490.putFloat(f_664_);
	aByteBuffer9490.putFloat(f_665_);
	return ((Class103_Sub3) this).anInterface40_9640
		   .method268(0, aByteBuffer9490.position(), aLong9491);
    }
    
    public final boolean method2331() {
	return (((Class103_Sub3) this).aClass368Array9604[3] != null
		&& ((Class103_Sub3) this).aClass368Array9604[3].method6582());
    }
    
    final Interface41 method15849(Class175 class175, int i, int i_666_,
				  boolean bool, byte[] is) {
	return method15680(class175, i, i_666_, bool, is, 0, 0);
    }
    
    Class268 method15850() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515)
		method15648();
	    return ((Class103_Sub3) this).aClass268_9508;
	}
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    Class268 method15851() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515)
		method15648();
	    return ((Class103_Sub3) this).aClass268_9508;
	}
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    public final Class168 method2443(int i, int i_667_, int i_668_, int i_669_,
				     boolean bool) {
	Class168_Sub1 class168_sub1
	    = new Class168_Sub1(this, i_668_, i_669_, bool, false);
	class168_sub1.method3675(0, 0, i_668_, i_669_, i, i_667_);
	return class168_sub1;
    }
    
    final void method15852(boolean bool) {
	if (bool != aBool9576) {
	    aBool9576 = bool;
	    method15750();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    Class268 method15853() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515)
		method15648();
	    return ((Class103_Sub3) this).aClass268_9508;
	}
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    public final void method15854() {
	method15724(Class310.aClass310_4823, 2);
    }
    
    public final void method2560() {
	((Class103_Sub3) this).aBool9565 = false;
    }
    
    final Class268 method15855() {
	return aClass268_9526;
    }
    
    public final void method15856(Interface31 interface31) {
	if (((Class103_Sub3) this).anInterface31Array9606[anInt9580]
	    != interface31) {
	    ((Class103_Sub3) this).anInterface31Array9606[anInt9580]
		= interface31;
	    if (interface31 != null)
		interface31.method178();
	    else
		anInterface41_9584.method178();
	    ((Class103_Sub3) this).anInt9625 &= ~0x1;
	}
    }
    
    abstract void method15857(int i);
    
    final void method15858(int i, int i_670_) {
	anInt9550 = i;
	anInt9551 = i_670_;
	method15629();
	if (!aBool9654 && (((Class103_Sub3) this).aBool9497
			   || method15624() == Class376.aClass376_5635)) {
	    aBool9654 = true;
	    method15641();
	}
	if (aBool9654)
	    method15742();
    }
    
    public void method2501(Class180 class180, float f, Class180 class180_671_,
			   float f_672_, Class180 class180_673_,
			   float f_674_) {
	int i = 0;
	if (class180_673_ == null && f_674_ > 0.0F)
	    f_674_ = 0.0F;
	if (class180_671_ == null && f_672_ > 0.0F) {
	    class180_671_ = class180_673_;
	    class180_673_ = null;
	    f_672_ = f_674_;
	    f_674_ = 0.0F;
	}
	if (class180 == null && f > 0.0F) {
	    class180 = class180_671_;
	    class180_671_ = class180_673_;
	    class180_673_ = null;
	    f = f_672_;
	    f_672_ = f_674_;
	    f_674_ = 0.0F;
	}
	Class368_Sub2.aClass180_Sub1Array10371[0] = (Class180_Sub1) class180;
	Class368_Sub2.aFloatArray10365[0] = f;
	if (f > 0.0F)
	    i++;
	Class368_Sub2.aClass180_Sub1Array10371[1]
	    = (Class180_Sub1) class180_671_;
	Class368_Sub2.aFloatArray10365[1] = f_672_;
	if (f_672_ > 0.0F)
	    i++;
	Class368_Sub2.aClass180_Sub1Array10371[2]
	    = (Class180_Sub1) class180_673_;
	Class368_Sub2.aFloatArray10365[2] = f_674_;
	if (f_674_ > 0.0F)
	    i++;
	Class368_Sub2.anInt10364 = i;
	Class368_Sub2.aFloat10363 = 1.0F - (f + f_672_ + f_674_);
    }
    
    public void method2622() {
	if (((Class103_Sub3) this).aClass390_9547 != null)
	    ((Class103_Sub3) this).aClass390_9547.method6973();
    }
    
    public abstract void method15859(Class268 class268);
    
    public abstract void method15860(Class366 class366);
    
    abstract void method15861(boolean bool);
    
    final void method15862() {
	if (((Class103_Sub3) this).aClass385_9516 != Class385.aClass385_5704) {
	    Class385 class385 = ((Class103_Sub3) this).aClass385_9516;
	    ((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5704;
	    if (class385 == Class385.aClass385_5703)
		method15646();
	    method15755();
	    ((Class103_Sub3) this).aClass268_9523
		= ((Class103_Sub3) this).aClass268_9607;
	    method15659();
	    method15799();
	    ((Class103_Sub3) this).anInt9625 &= ~0x8;
	}
    }
    
    final void method15863() {
	if (((Class103_Sub3) this).aClass385_9516 != Class385.aClass385_5704) {
	    Class385 class385 = ((Class103_Sub3) this).aClass385_9516;
	    ((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5704;
	    if (class385 == Class385.aClass385_5703)
		method15646();
	    method15755();
	    ((Class103_Sub3) this).aClass268_9523
		= ((Class103_Sub3) this).aClass268_9607;
	    method15659();
	    method15799();
	    ((Class103_Sub3) this).anInt9625 &= ~0x8;
	}
    }
    
    abstract void method15864();
    
    public final boolean method2355() {
	return ((Class103_Sub3) this).aClass368Array9604[3] != null;
    }
    
    public final int method2470() {
	return anInt9630 - 2;
    }
    
    final void method15865() {
	if (((Class103_Sub3) this).aClass385_9516 != Class385.aClass385_5703) {
	    ((Class103_Sub3) this).aClass385_9516 = Class385.aClass385_5703;
	    method15646();
	    method15658();
	    ((Class103_Sub3) this).aClass268_9523
		= ((Class103_Sub3) this).aClass268_9521;
	    method15659();
	    method15799();
	    ((Class103_Sub3) this).anInt9625 &= ~0x7;
	}
    }
    
    public final void method2518(Class266 class266) {
	((Class103_Sub3) this).aClass266_9651 = class266;
	aClass268_9504.method5203(((Class103_Sub3) this).aClass266_9651);
	((Class103_Sub3) this).aClass268_9645.method5199(aClass268_9504);
	((Class103_Sub3) this).aClass268_9645.method5223();
	((Class103_Sub3) this).aClass266_9503.method5175(class266);
	((Class103_Sub3) this).aClass266_9503.method5124();
	((Class103_Sub3) this).aClass268_9505
	    .method5203(((Class103_Sub3) this).aClass266_9503);
	method15609();
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703)
	    method15646();
    }
    
    final void method15866() {
	if (!((Class103_Sub3) this).aBool9517) {
	    int i;
	    int i_675_;
	    if (aClass105_1470 != null) {
		i_675_ = aClass105_1470.method2655();
		i = aClass105_1470.method2654();
	    } else {
		i = 0;
		i_675_ = 0;
	    }
	    Class268 class268 = ((Class103_Sub3) this).aClass268_9607;
	    if (i_675_ != 0 && i != 0)
		class268.method5211(0.0F, (float) i_675_, 0.0F, (float) i,
				    -1.0F, 1.0F);
	    else
		class268.method5198();
	    ((Class103_Sub3) this).aClass268_9610.method5199(class268);
	    method15652(((Class103_Sub3) this).aClass268_9610);
	    ((Class103_Sub3) this).aBool9517 = true;
	}
    }
    
    final void method15867() {
	if (!((Class103_Sub3) this).aBool9517) {
	    int i;
	    int i_676_;
	    if (aClass105_1470 != null) {
		i_676_ = aClass105_1470.method2655();
		i = aClass105_1470.method2654();
	    } else {
		i = 0;
		i_676_ = 0;
	    }
	    Class268 class268 = ((Class103_Sub3) this).aClass268_9607;
	    if (i_676_ != 0 && i != 0)
		class268.method5211(0.0F, (float) i_676_, 0.0F, (float) i,
				    -1.0F, 1.0F);
	    else
		class268.method5198();
	    ((Class103_Sub3) this).aClass268_9610.method5199(class268);
	    method15652(((Class103_Sub3) this).aClass268_9610);
	    ((Class103_Sub3) this).aBool9517 = true;
	}
    }
    
    final void method15868() {
	if (!((Class103_Sub3) this).aBool9517) {
	    int i;
	    int i_677_;
	    if (aClass105_1470 != null) {
		i_677_ = aClass105_1470.method2655();
		i = aClass105_1470.method2654();
	    } else {
		i = 0;
		i_677_ = 0;
	    }
	    Class268 class268 = ((Class103_Sub3) this).aClass268_9607;
	    if (i_677_ != 0 && i != 0)
		class268.method5211(0.0F, (float) i_677_, 0.0F, (float) i,
				    -1.0F, 1.0F);
	    else
		class268.method5198();
	    ((Class103_Sub3) this).aClass268_9610.method5199(class268);
	    method15652(((Class103_Sub3) this).aClass268_9610);
	    ((Class103_Sub3) this).aBool9517 = true;
	}
    }
    
    final void method15869() {
	if (!((Class103_Sub3) this).aBool9548)
	    ((Class103_Sub3) this).aBool9548 = true;
    }
    
    final void method15870() {
	((Class103_Sub3) this).anInterface40_9640 = method15752(true);
	((Class103_Sub3) this).anInterface40_9640.method221(24, 12);
	((Class103_Sub3) this).aClass366_9643
	    = method15697(new Class314[]
			  { new Class314(Class367.aClass367_5545) });
    }
    
    final void method15871(boolean bool) {
	if (bool != aBool9562) {
	    aBool9562 = bool;
	    method15662();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    final Class268 method15872() {
	return aClass268Array9578[anInt9580];
    }
    
    final void method15873(boolean bool) {
	if (bool != aBool9553) {
	    aBool9553 = bool;
	    method15663();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    public final void method2410(int i, int i_678_, int i_679_, int i_680_,
				 int i_681_, int i_682_) {
	i_679_--;
	i_680_--;
	int i_683_ = 0;
	if (this instanceof Class103_Sub3_Sub2)
	    i_683_ = -1;
	if (aBool9634 && anInt9623 != 0)
	    method15713(false);
	method2274(i, i_678_ + i_683_, i + i_679_, i_678_ + i_683_, i_681_,
		   i_682_);
	method2274(i, i_678_ + i_680_ + i_683_, i + i_679_,
		   i_678_ + i_680_ + i_683_, i_681_, i_682_);
	method2274(i, i_678_, i, i_678_ + i_680_, i_681_, i_682_);
	method2274(i + i_679_, i_678_, i + i_679_, i_678_ + i_680_, i_681_,
		   i_682_);
	if (aBool9634 && anInt9623 != 0)
	    method15713(true);
    }
    
    final void method15874(boolean bool) {
	if (bool != aBool9553) {
	    aBool9553 = bool;
	    method15663();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    abstract void method15875();
    
    abstract void method15876();
    
    final void method15877(boolean bool) {
	if (bool != aBool9553) {
	    aBool9553 = bool;
	    method15663();
	    ((Class103_Sub3) this).anInt9625 &= ~0xf;
	}
    }
    
    public final void method2258(int i, int i_684_, int i_685_, int i_686_) {
	int i_687_;
	int i_688_;
	if (aClass105_1470 != null) {
	    i_688_ = aClass105_1470.method2655();
	    i_687_ = aClass105_1470.method2654();
	} else {
	    i_687_ = 0;
	    i_688_ = 0;
	}
	i = i >= 0 ? i : 0;
	i_685_ = i_685_ <= i_688_ ? i_685_ : i_688_;
	i_684_ = i_684_ >= 0 ? i_684_ : 0;
	i_686_ = i_686_ <= i_687_ ? i_686_ : i_687_;
	boolean bool = false;
	if (anInt9512 < i) {
	    anInt9512 = i;
	    bool = true;
	}
	if (anInt9574 > i_685_) {
	    anInt9574 = i_685_;
	    bool = true;
	}
	if (anInt9538 < i_684_) {
	    anInt9538 = i_684_;
	    bool = true;
	}
	if (anInt9581 > i_686_) {
	    anInt9581 = i_686_;
	    bool = true;
	}
	if (bool) {
	    if (!aBool9654 && (((Class103_Sub3) this).aBool9497
			       || method15624() == Class376.aClass376_5635)) {
		aBool9654 = true;
		method15641();
	    }
	    if (aBool9654)
		method15742();
	}
    }
    
    public void method2254(int i, int i_689_, int i_690_, int i_691_) {
	((Class103_Sub3) this).anInt9542 = i;
	((Class103_Sub3) this).anInt9543 = i_689_;
	((Class103_Sub3) this).anInt9544 = i_690_;
	((Class103_Sub3) this).anInt9502 = i_691_;
	method15799();
    }
    
    public abstract float method15878();
    
    abstract void method15879();
    
    final void method15880() {
	((Class103_Sub3) this).aClass268_9525.method5199(aClass268_9504);
	((Class103_Sub3) this).aClass268_9525
	    .method5202(((Class103_Sub3) this).aClass268_9521);
	((Class103_Sub3) this).aClass268_9525
	    .method5257(((Class103_Sub3) this).aFloatArrayArray9527[0]);
	((Class103_Sub3) this).aClass268_9525
	    .method5226(((Class103_Sub3) this).aFloatArrayArray9527[1]);
	((Class103_Sub3) this).aClass268_9525
	    .method5219(((Class103_Sub3) this).aFloatArrayArray9527[2]);
	((Class103_Sub3) this).aClass268_9525
	    .method5271(((Class103_Sub3) this).aFloatArrayArray9527[3]);
	((Class103_Sub3) this).aClass268_9525
	    .method5238(((Class103_Sub3) this).aFloatArrayArray9527[4]);
	((Class103_Sub3) this).aClass268_9525
	    .method5222(((Class103_Sub3) this).aFloatArrayArray9527[5]);
	aClass268_9526.method5199(((Class103_Sub3) this).aClass268_9525);
	method15652(aClass268_9526);
    }
    
    abstract boolean method15881(Class175 class175, Class102 class102);
    
    final void method15882() {
	((Class103_Sub3) this).aClass268_9525.method5199(aClass268_9504);
	((Class103_Sub3) this).aClass268_9525
	    .method5202(((Class103_Sub3) this).aClass268_9521);
	((Class103_Sub3) this).aClass268_9525
	    .method5257(((Class103_Sub3) this).aFloatArrayArray9527[0]);
	((Class103_Sub3) this).aClass268_9525
	    .method5226(((Class103_Sub3) this).aFloatArrayArray9527[1]);
	((Class103_Sub3) this).aClass268_9525
	    .method5219(((Class103_Sub3) this).aFloatArrayArray9527[2]);
	((Class103_Sub3) this).aClass268_9525
	    .method5271(((Class103_Sub3) this).aFloatArrayArray9527[3]);
	((Class103_Sub3) this).aClass268_9525
	    .method5238(((Class103_Sub3) this).aFloatArrayArray9527[4]);
	((Class103_Sub3) this).aClass268_9525
	    .method5222(((Class103_Sub3) this).aFloatArrayArray9527[5]);
	aClass268_9526.method5199(((Class103_Sub3) this).aClass268_9525);
	method15652(aClass268_9526);
    }
    
    final void method15883(Class310 class310, int i) {
	method15955(0, ((Class103_Sub3) this).anInterface40_9583);
	method15716(((Class103_Sub3) this).aClass366_9479);
	method15623(class310, 0, i);
    }
    
    abstract void method15884();
    
    void method15885() {
	method15761(7);
	method15614();
    }
    
    public final void method15886() {
	method15724(Class310.aClass310_4823, 2);
    }
    
    abstract void method15887();
    
    abstract void method15888();
    
    final void method15889(boolean bool) {
	if (bool != aBool9600) {
	    aBool9600 = bool;
	    method15668();
	    ((Class103_Sub3) this).anInt9625 &= ~0x7;
	}
    }
    
    abstract void method15890();
    
    final void method15891() {
	if (method15607())
	    method15674();
	anInt9570 = anInt9524;
    }
    
    final void method15892() {
	if (method15607())
	    method15674();
	anInt9570 = anInt9524;
    }
    
    final void method15893() {
	if (method15607())
	    method15674();
	anInt9570 = anInt9524;
    }
    
    final void method15894(boolean bool) {
	if (bool != aBool9600) {
	    aBool9600 = bool;
	    method15668();
	    ((Class103_Sub3) this).anInt9625 &= ~0x7;
	}
    }
    
    final void method15895(byte i) {
	if (aByte9577 != i) {
	    aByte9577 = i;
	    if (i == 0) {
		method15706(0);
		method15640(1);
	    } else {
		method15706(3);
		method15640(3);
	    }
	    method15864();
	}
    }
    
    abstract void method15896();
    
    Class266 method15897() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515) {
		((Class103_Sub3) this).aClass266_9507
		    .method5175(((Class103_Sub3) this).aClass266_9500);
		((Class103_Sub3) this).aClass266_9507
		    .method5134(((Class103_Sub3) this).aClass266_9651);
		((Class103_Sub3) this).aClass268_9508
		    .method5203(((Class103_Sub3) this).aClass266_9507);
		((Class103_Sub3) this).aBool9515 = true;
	    }
	    return ((Class103_Sub3) this).aClass266_9507;
	}
	return ((Class103_Sub3) this).aClass266_9500;
    }
    
    public abstract void method15898(int i, Interface40 interface40);
    
    public final Class268 method2226() {
	return ((Class103_Sub3) this).aClass268_9652;
    }
    
    final void method15899() {
	((Class103_Sub3) this).anInterface40_9642 = method15752(false);
	((Class103_Sub3) this).anInterface40_9642.method221(3096, 12);
	aByteBuffer9490.clear();
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	for (int i = 0; i <= 256; i++) {
	    double d = (double) (i * 2) * 3.141592653589793 / 256.0;
	    float f = (float) Math.cos(d);
	    float f_692_ = (float) Math.sin(d);
	    aByteBuffer9490.putFloat(f_692_);
	    aByteBuffer9490.putFloat(f);
	    aByteBuffer9490.putFloat(0.0F);
	}
	((Class103_Sub3) this).anInterface40_9642
	    .method268(0, aByteBuffer9490.position(), aLong9491);
    }
    
    abstract Interface33 method15900(boolean bool);
    
    final Interface41 method15901(int i, int i_693_, boolean bool, int[] is) {
	return method15682(i, i_693_, bool, is, 0, 0);
    }
    
    public final void method2475(Class268 class268) {
	((Class103_Sub3) this).aClass268_9521.method5199(class268);
	method15609();
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703)
	    method15659();
    }
    
    final Interface41 method15902(Class175 class175, int i, int i_694_,
				  boolean bool, float[] fs) {
	return method15681(class175, i, i_694_, bool, fs, 0, 0);
    }
    
    final Interface41 method15903(Class175 class175, int i, int i_695_,
				  boolean bool, float[] fs) {
	return method15681(class175, i, i_695_, bool, fs, 0, 0);
    }
    
    final Interface41 method15904(Class175 class175, int i, int i_696_,
				  boolean bool, float[] fs) {
	return method15681(class175, i, i_696_, bool, fs, 0, 0);
    }
    
    abstract Interface41 method15905(Class175 class175, Class102 class102,
				     int i, int i_697_);
    
    abstract Interface41 method15906(Class175 class175, Class102 class102,
				     int i, int i_698_);
    
    abstract void method15907();
    
    abstract Interface41 method15908(Class175 class175, Class102 class102,
				     int i, int i_699_);
    
    public final boolean method2453() {
	return true;
    }
    
    final void method2272(int i, int i_700_, int i_701_, int i_702_,
			  int i_703_) {
	method2274(i, i_700_, i + i_701_, i_700_, i_702_, i_703_);
    }
    
    abstract Interface41 method15909(Class175 class175, int i, int i_704_,
				     boolean bool, float[] fs, int i_705_,
				     int i_706_);
    
    public final void method2512(Class266 class266) {
	((Class103_Sub3) this).aClass266_9651 = class266;
	aClass268_9504.method5203(((Class103_Sub3) this).aClass266_9651);
	((Class103_Sub3) this).aClass268_9645.method5199(aClass268_9504);
	((Class103_Sub3) this).aClass268_9645.method5223();
	((Class103_Sub3) this).aClass266_9503.method5175(class266);
	((Class103_Sub3) this).aClass266_9503.method5124();
	((Class103_Sub3) this).aClass268_9505
	    .method5203(((Class103_Sub3) this).aClass266_9503);
	method15609();
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703)
	    method15646();
    }
    
    abstract Interface41 method15910(int i, int i_707_, boolean bool, int[] is,
				     int i_708_, int i_709_);
    
    abstract Interface41 method15911(int i, int i_710_, boolean bool, int[] is,
				     int i_711_, int i_712_);
    
    abstract Interface30 method15912(int i, boolean bool, int[][] is);
    
    abstract Interface30 method15913(int i, boolean bool, int[][] is);
    
    abstract Interface30 method15914(int i, boolean bool, int[][] is);
    
    abstract Interface30 method15915(int i, boolean bool, int[][] is);
    
    abstract void method15916();
    
    final void method15917() {
	((Class103_Sub3) this).aBool9515 = false;
    }
    
    final void method15918() {
	((Class103_Sub3) this).aBool9548 = false;
	method15658();
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703)
	    method15659();
    }
    
    abstract Interface43 method15919(Class175 class175, Class102 class102,
				     int i, int i_713_);
    
    abstract Interface43 method15920(Class175 class175, Class102 class102,
				     int i, int i_714_);
    
    abstract Interface43 method15921(Class175 class175, Class102 class102,
				     int i, int i_715_);
    
    abstract Interface43 method15922(Class175 class175, Class102 class102,
				     int i, int i_716_);
    
    public final int method15923() {
	return anInt9580;
    }
    
    public final int method15924() {
	return anInt9580;
    }
    
    public final void method15925(int i) {
	if (anInt9580 != i) {
	    anInt9580 = i;
	    method16014();
	}
    }
    
    abstract void method15926(int i, Class306 class306, boolean bool,
			      boolean bool_717_);
    
    abstract void method15927(int i);
    
    public final void method15928(Interface31 interface31) {
	if (((Class103_Sub3) this).anInterface31Array9606[anInt9580]
	    != interface31) {
	    ((Class103_Sub3) this).anInterface31Array9606[anInt9580]
		= interface31;
	    if (interface31 != null)
		interface31.method178();
	    else
		anInterface41_9584.method178();
	    ((Class103_Sub3) this).anInt9625 &= ~0x1;
	}
    }
    
    public final void method15929(Interface31 interface31) {
	if (((Class103_Sub3) this).anInterface31Array9606[anInt9580]
	    != interface31) {
	    ((Class103_Sub3) this).anInterface31Array9606[anInt9580]
		= interface31;
	    if (interface31 != null)
		interface31.method178();
	    else
		anInterface41_9584.method178();
	    ((Class103_Sub3) this).anInt9625 &= ~0x1;
	}
    }
    
    final void method15930() {
	method15700();
    }
    
    abstract void method15931();
    
    public abstract void method15932();
    
    public final boolean method2225() {
	return true;
    }
    
    public final void method15933(int i) {
	switch (i) {
	case 4:
	    method15661(Class305.aClass305_4803, Class305.aClass305_4803);
	    break;
	case 2:
	    method15661(Class305.aClass305_4804, Class305.aClass305_4802);
	    break;
	case 3:
	    method15661(Class305.aClass305_4800, Class305.aClass305_4801);
	    break;
	case 0:
	    method15661(Class305.aClass305_4801, Class305.aClass305_4801);
	    break;
	case 1:
	    method15661(Class305.aClass305_4802, Class305.aClass305_4802);
	    break;
	}
    }
    
    public void method2491(float f, float f_718_, float f_719_, float[] fs) {
	float f_720_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * f_718_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * f_719_));
	float f_721_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * f_718_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * f_719_));
	float f_722_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + ((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1] * f
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * f_718_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * f_719_));
	float f_723_ = (aClass268_9504.aFloatArray4353[14]
			+ aClass268_9504.aFloatArray4353[2] * f
			+ aClass268_9504.aFloatArray4353[6] * f_718_
			+ aClass268_9504.aFloatArray4353[10] * f_719_);
	fs[0] = (((Class103_Sub3) this).aFloat9528
		 + ((Class103_Sub3) this).aFloat9529 * f_721_ / f_720_);
	fs[1] = (((Class103_Sub3) this).aFloat9530
		 + ((Class103_Sub3) this).aFloat9531 * f_722_ / f_720_);
	fs[2] = f_723_;
    }
    
    public final void method15934(int i) {
	switch (i) {
	case 4:
	    method15661(Class305.aClass305_4803, Class305.aClass305_4803);
	    break;
	case 2:
	    method15661(Class305.aClass305_4804, Class305.aClass305_4802);
	    break;
	case 3:
	    method15661(Class305.aClass305_4800, Class305.aClass305_4801);
	    break;
	case 0:
	    method15661(Class305.aClass305_4801, Class305.aClass305_4801);
	    break;
	case 1:
	    method15661(Class305.aClass305_4802, Class305.aClass305_4802);
	    break;
	}
    }
    
    final void method15935() {
	if (((Class103_Sub3) this).aClass369_9590 != null)
	    ((Class103_Sub3) this).aClass369_9590.method6597();
	method15711();
    }
    
    public final void method15936(int i, Class306 class306) {
	method15926(i, class306, false, false);
    }
    
    abstract void method15937(int i, Class306 class306, boolean bool,
			      boolean bool_724_);
    
    public final void method15938(int i, Class306 class306) {
	method15693(i, class306, false);
    }
    
    public final void method15939(int i, Class306 class306) {
	method15693(i, class306, false);
    }
    
    abstract void method15940(int i, Class306 class306, boolean bool);
    
    abstract Interface38 method15941(Class175 class175, int i, int i_725_,
				     int i_726_, boolean bool, byte[] is);
    
    abstract void method15942(int i, Class306 class306, boolean bool);
    
    Class266 method15943() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515) {
		((Class103_Sub3) this).aClass266_9507
		    .method5175(((Class103_Sub3) this).aClass266_9500);
		((Class103_Sub3) this).aClass266_9507
		    .method5134(((Class103_Sub3) this).aClass266_9651);
		((Class103_Sub3) this).aClass268_9508
		    .method5203(((Class103_Sub3) this).aClass266_9507);
		((Class103_Sub3) this).aBool9515 = true;
	    }
	    return ((Class103_Sub3) this).aClass266_9507;
	}
	return ((Class103_Sub3) this).aClass266_9500;
    }
    
    abstract void method15944(int i, Class306 class306, boolean bool);
    
    abstract void method15945(int i, Class306 class306, boolean bool);
    
    public final NativeHeapBuffer method15946(int i, boolean bool) {
	return ((Class103_Sub3) this).aNativeHeap9495.method963(i, bool);
    }
    
    public final void method15947(int i) {
	if (anInt9580 != i) {
	    anInt9580 = i;
	    method16014();
	}
    }
    
    final Class268 method15948() {
	return aClass268Array9578[anInt9580];
    }
    
    final Class268 method15949() {
	return aClass268Array9578[anInt9580];
    }
    
    public final Class268 method15950() {
	return aClass268Array9578[anInt9580];
    }
    
    public final Class268 method15951() {
	return aClass268Array9578[anInt9580];
    }
    
    public final Class268 method15952() {
	return aClass268Array9578[anInt9580];
    }
    
    public final Class268 method15953() {
	return aClass268Array9578[anInt9580];
    }
    
    public final void method15954(Interface31 interface31) {
	if (((Class103_Sub3) this).anInterface31Array9606[anInt9580]
	    != interface31) {
	    ((Class103_Sub3) this).anInterface31Array9606[anInt9580]
		= interface31;
	    if (interface31 != null)
		interface31.method178();
	    else
		anInterface41_9584.method178();
	    ((Class103_Sub3) this).anInt9625 &= ~0x1;
	}
    }
    
    public abstract void method15955(int i, Interface40 interface40);
    
    public void method15956(Interface45 interface45) {
	((Class103_Sub3) this).aClass599_9478
	    .method13136(interface45, anObject9480, (byte) 0);
    }
    
    final void method15957() {
	if (aClass387Array9579[anInt9580] != Class387.aClass387_5710) {
	    aClass387Array9579[anInt9580] = Class387.aClass387_5710;
	    aClass268Array9578[anInt9580].method5198();
	    method15698();
	}
    }
    
    final void method15958() {
	method15700();
    }
    
    public final void method2499(int i) {
	/* empty */
    }
    
    final void method15959() {
	method15700();
    }
    
    final Class268 method15960() {
	return aClass268_9526;
    }
    
    abstract void method15961();
    
    abstract void method15962();
    
    abstract void method15963();
    
    abstract void method15964();
    
    final void method15965() {
	((Class103_Sub3) this).anInterface40_9583 = method15752(false);
	int i = 160;
	((Class103_Sub3) this).anInterface40_9583.method221(i, 32);
	aByteBuffer9490.clear();
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putInt(-1);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putInt(-1);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putInt(-1);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putInt(-1);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(1.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putInt(-1);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	aByteBuffer9490.putFloat(0.0F);
	((Class103_Sub3) this).anInterface40_9583
	    .method268(0, aByteBuffer9490.position(), aLong9491);
	((Class103_Sub3) this).aClass366_9479
	    = method15697(new Class314[]
			  { new Class314(new Class367[]
					 { Class367.aClass367_5545,
					   Class367.aClass367_5547,
					   Class367.aClass367_5549,
					   Class367.aClass367_5549 }) });
    }
    
    abstract void method15966();
    
    public abstract void method15967();
    
    abstract void method15968();
    
    abstract void method15969();
    
    abstract void method15970();
    
    public final void method2523(int i, int i_727_, float f, int i_728_,
				 int i_729_, float f_730_, int i_731_,
				 int i_732_, float f_733_, int i_734_,
				 int i_735_, int i_736_, int i_737_) {
	/* empty */
    }
    
    abstract void method15971();
    
    abstract void method15972();
    
    public void method2393(int i, int i_738_, int i_739_, int i_740_) {
	((Class103_Sub3) this).anInt9542 = i;
	((Class103_Sub3) this).anInt9543 = i_738_;
	((Class103_Sub3) this).anInt9544 = i_739_;
	((Class103_Sub3) this).anInt9502 = i_740_;
	method15799();
    }
    
    Class86 method15973() {
	return ((Class103_Sub3) this).aClass86_9575;
    }
    
    final void method15974(int i) {
	if (((Class103_Sub3) this).anInt9498 != i) {
	    Class304 class304;
	    boolean bool;
	    boolean bool_741_;
	    if (i == 1) {
		class304 = Class304.aClass304_4798;
		bool = true;
		bool_741_ = true;
	    } else if (i == 2) {
		class304 = Class304.aClass304_4796;
		bool = false;
		bool_741_ = true;
	    } else if (i == 128) {
		class304 = Class304.aClass304_4797;
		bool = true;
		bool_741_ = true;
	    } else if (i == 3) {
		class304 = Class304.aClass304_4795;
		bool = true;
		bool_741_ = false;
	    } else {
		class304 = Class304.aClass304_4795;
		bool = false;
		bool_741_ = false;
	    }
	    if (bool != aBool9621) {
		aBool9621 = bool;
		method15864();
	    }
	    if (bool_741_ != aBool9620) {
		aBool9620 = bool_741_;
		method15715();
	    }
	    if (class304 != aClass304_9619) {
		aClass304_9619 = class304;
		method15801();
	    }
	    ((Class103_Sub3) this).anInt9498 = i;
	    ((Class103_Sub3) this).anInt9625 &= ~0xc;
	}
    }
    
    final void method15975(int i) {
	if (((Class103_Sub3) this).anInt9498 != i) {
	    Class304 class304;
	    boolean bool;
	    boolean bool_742_;
	    if (i == 1) {
		class304 = Class304.aClass304_4798;
		bool = true;
		bool_742_ = true;
	    } else if (i == 2) {
		class304 = Class304.aClass304_4796;
		bool = false;
		bool_742_ = true;
	    } else if (i == 128) {
		class304 = Class304.aClass304_4797;
		bool = true;
		bool_742_ = true;
	    } else if (i == 3) {
		class304 = Class304.aClass304_4795;
		bool = true;
		bool_742_ = false;
	    } else {
		class304 = Class304.aClass304_4795;
		bool = false;
		bool_742_ = false;
	    }
	    if (bool != aBool9621) {
		aBool9621 = bool;
		method15864();
	    }
	    if (bool_742_ != aBool9620) {
		aBool9620 = bool_742_;
		method15715();
	    }
	    if (class304 != aClass304_9619) {
		aClass304_9619 = class304;
		method15801();
	    }
	    ((Class103_Sub3) this).anInt9498 = i;
	    ((Class103_Sub3) this).anInt9625 &= ~0xc;
	}
    }
    
    final void method15976(int i) {
	if (((Class103_Sub3) this).anInt9498 != i) {
	    Class304 class304;
	    boolean bool;
	    boolean bool_743_;
	    if (i == 1) {
		class304 = Class304.aClass304_4798;
		bool = true;
		bool_743_ = true;
	    } else if (i == 2) {
		class304 = Class304.aClass304_4796;
		bool = false;
		bool_743_ = true;
	    } else if (i == 128) {
		class304 = Class304.aClass304_4797;
		bool = true;
		bool_743_ = true;
	    } else if (i == 3) {
		class304 = Class304.aClass304_4795;
		bool = true;
		bool_743_ = false;
	    } else {
		class304 = Class304.aClass304_4795;
		bool = false;
		bool_743_ = false;
	    }
	    if (bool != aBool9621) {
		aBool9621 = bool;
		method15864();
	    }
	    if (bool_743_ != aBool9620) {
		aBool9620 = bool_743_;
		method15715();
	    }
	    if (class304 != aClass304_9619) {
		aClass304_9619 = class304;
		method15801();
	    }
	    ((Class103_Sub3) this).anInt9498 = i;
	    ((Class103_Sub3) this).anInt9625 &= ~0xc;
	}
    }
    
    final void method15977(byte i) {
	if (aByte9577 != i) {
	    aByte9577 = i;
	    if (i == 0) {
		method15706(0);
		method15640(1);
	    } else {
		method15706(3);
		method15640(3);
	    }
	    method15864();
	}
    }
    
    public abstract String method2284();
    
    final Class268 method15978() {
	return aClass268_9526;
    }
    
    public abstract String method2369();
    
    abstract void method15979(int i);
    
    abstract void method15980();
    
    abstract void method15981();
    
    abstract void method15982();
    
    abstract void method15983();
    
    abstract void method15984();
    
    public int method2536(int i, int i_744_, int i_745_, int i_746_,
			  int i_747_, int i_748_) {
	int i_749_ = 0;
	float f = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		      * (float) i)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		      * (float) i_744_)
		   + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		      * (float) i_745_));
	float f_750_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[14]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[2]
		  * (float) i_746_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[6]
		  * (float) i_747_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[10]
		  * (float) i_748_));
	float f_751_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_744_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_745_));
	float f_752_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[15]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[3]
		  * (float) i_746_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[7]
		  * (float) i_747_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[11]
		  * (float) i_748_));
	if (f < -f_751_ && f_750_ < -f_752_)
	    i_749_ |= 0x10;
	else if (f > f_751_ && f_750_ > f_752_)
	    i_749_ |= 0x20;
	float f_753_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_744_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_745_));
	float f_754_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[12]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[0]
		  * (float) i_746_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[4]
		  * (float) i_747_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[8]
		  * (float) i_748_));
	if (f_753_ < -f_751_ && f_754_ < -f_752_)
	    i_749_ |= 0x1;
	if (f_753_ > f_751_ && f_754_ > f_752_)
	    i_749_ |= 0x2;
	float f_755_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_744_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_745_));
	float f_756_
	    = (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[13]
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[1]
		  * (float) i_746_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[5]
		  * (float) i_747_)
	       + (((Class103_Sub3) this).aClass268_9525.aFloatArray4353[9]
		  * (float) i_748_));
	if (f_755_ < -f_751_ && f_756_ < -f_752_)
	    i_749_ |= 0x4;
	if (f_755_ > f_751_ && f_756_ > f_752_)
	    i_749_ |= 0x8;
	return i_749_;
    }
    
    abstract void method15985();
    
    boolean method15986() {
	if (((Class103_Sub3) this).aClass368Array9604[1] != null
	    && !((Class103_Sub3) this).aClass368Array9604[1].method6582()) {
	    boolean bool = (((Class103_Sub3) this).aClass382_9599.method6895
			    (((Class103_Sub3) this).aClass368Array9604[1]));
	    if (bool)
		((Class103_Sub3) this).aClass379_9518.method6848();
	    return bool;
	}
	return false;
    }
    
    public abstract boolean method15987();
    
    abstract void method15988();
    
    final void method15989() {
	if (((Class103_Sub3) this).aClass369_9590 != null)
	    ((Class103_Sub3) this).aClass369_9590.method6597();
	method15711();
    }
    
    abstract Interface38 method15990(Class175 class175, int i, int i_757_,
				     int i_758_, boolean bool, byte[] is);
    
    final void method15991() {
	if (((Class103_Sub3) this).aClass369_9590 != null)
	    ((Class103_Sub3) this).aClass369_9590.method6597();
	method15711();
    }
    
    abstract void method15992();
    
    abstract Interface41 method15993(Class175 class175, int i, int i_759_,
				     boolean bool, byte[] is, int i_760_,
				     int i_761_);
    
    abstract void method15994();
    
    final void method15995() {
	((Class103_Sub3) this).aBool9517 = false;
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5704) {
	    method15755();
	    method15659();
	}
    }
    
    final void method15996() {
	if (!((Class103_Sub3) this).aBool9517) {
	    int i;
	    int i_762_;
	    if (aClass105_1470 != null) {
		i_762_ = aClass105_1470.method2655();
		i = aClass105_1470.method2654();
	    } else {
		i = 0;
		i_762_ = 0;
	    }
	    Class268 class268 = ((Class103_Sub3) this).aClass268_9607;
	    if (i_762_ != 0 && i != 0)
		class268.method5211(0.0F, (float) i_762_, 0.0F, (float) i,
				    -1.0F, 1.0F);
	    else
		class268.method5198();
	    ((Class103_Sub3) this).aClass268_9610.method5199(class268);
	    method15652(((Class103_Sub3) this).aClass268_9610);
	    ((Class103_Sub3) this).aBool9517 = true;
	}
    }
    
    public final void method15997(int i) {
	switch (i) {
	case 4:
	    method15661(Class305.aClass305_4803, Class305.aClass305_4803);
	    break;
	case 2:
	    method15661(Class305.aClass305_4804, Class305.aClass305_4802);
	    break;
	case 3:
	    method15661(Class305.aClass305_4800, Class305.aClass305_4801);
	    break;
	case 0:
	    method15661(Class305.aClass305_4801, Class305.aClass305_4801);
	    break;
	case 1:
	    method15661(Class305.aClass305_4802, Class305.aClass305_4802);
	    break;
	}
    }
    
    public final void method2515(int i, Class86 class86) {
	((Class103_Sub3) this).anInt9608 = i;
	((Class103_Sub3) this).aClass86_9575 = class86;
	((Class103_Sub3) this).aBool9565 = true;
    }
    
    abstract Interface33 method15998(boolean bool);
    
    public final void method15999() {
	method15724(Class310.aClass310_4823, 2);
    }
    
    abstract Class366 method16000(Class314[] class314s);
    
    abstract Interface41 method16001(Class175 class175, Class102 class102,
				     int i, int i_763_);
    
    public final void method2572() {
	if (aClass105_1470 != null) {
	    anInt9538 = 0;
	    anInt9512 = 0;
	    anInt9574 = aClass105_1470.method2655();
	    anInt9581 = aClass105_1470.method2654();
	} else {
	    anInt9581 = 0;
	    anInt9574 = 0;
	    anInt9538 = 0;
	    anInt9512 = 0;
	}
	if (aBool9654) {
	    aBool9654 = false;
	    method15641();
	}
    }
    
    public final boolean method2366() {
	return true;
    }
    
    final void method16002() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    anInt9546 = ((Class103_Sub3) this).anInt9542;
	    anInt9545 = ((Class103_Sub3) this).anInt9543;
	    anInt9482 = ((Class103_Sub3) this).anInt9544;
	    anInt9617 = ((Class103_Sub3) this).anInt9502;
	    aFloat9532 = ((Class103_Sub3) this).aFloat9534;
	    aFloat9533 = ((Class103_Sub3) this).aFloat9535;
	} else {
	    anInt9546 = 0;
	    anInt9545 = 0;
	    anInt9482 = aClass105_1470.method2655();
	    anInt9617 = aClass105_1470.method2654();
	    aFloat9532 = 0.0F;
	    aFloat9533 = 1.0F;
	}
	method15629();
	((Class103_Sub3) this).aFloat9529
	    = (float) ((Class103_Sub3) this).anInt9544 / 2.0F;
	((Class103_Sub3) this).aFloat9531
	    = (float) ((Class103_Sub3) this).anInt9502 / 2.0F;
	((Class103_Sub3) this).aFloat9528
	    = ((float) ((Class103_Sub3) this).anInt9542
	       + ((Class103_Sub3) this).aFloat9529);
	((Class103_Sub3) this).aFloat9530
	    = ((float) ((Class103_Sub3) this).anInt9543
	       + ((Class103_Sub3) this).aFloat9531);
    }
    
    abstract void method16003(Interface33 interface33);
    
    Class268 method16004() {
	if (((Class103_Sub3) this).aClass385_9516 == Class385.aClass385_5703) {
	    if (!((Class103_Sub3) this).aBool9515)
		method15648();
	    return ((Class103_Sub3) this).aClass268_9508;
	}
	return ((Class103_Sub3) this).aClass268_9501;
    }
    
    public void method16005(Interface45 interface45) {
	((Class103_Sub3) this).aClass599_9478
	    .method13136(interface45, anObject9480, (byte) 0);
    }
    
    final void method16006() {
	method15955(0, ((Class103_Sub3) this).anInterface40_9640);
	method15716(((Class103_Sub3) this).aClass366_9643);
	method15623(Class310.aClass310_4821, 0, 1);
    }
    
    final void method16007(boolean bool) {
	if (bool != aBool9600) {
	    aBool9600 = bool;
	    method15668();
	    ((Class103_Sub3) this).anInt9625 &= ~0x7;
	}
    }
    
    public final boolean method2353() {
	return true;
    }
    
    public void method2471(int i, int i_764_, int i_765_, int i_766_) {
	((Class103_Sub3) this).anInt9542 = i;
	((Class103_Sub3) this).anInt9543 = i_764_;
	((Class103_Sub3) this).anInt9544 = i_765_;
	((Class103_Sub3) this).anInt9502 = i_766_;
	method15799();
    }
    
    final void method16008(Class310 class310, int i) {
	method15955(0, ((Class103_Sub3) this).anInterface40_9583);
	method15716(((Class103_Sub3) this).aClass366_9479);
	method15623(class310, 0, i);
    }
    
    abstract void method16009(Interface33 interface33);
    
    final Class268 method16010() {
	return aClass268_9555;
    }
    
    public abstract void method16011(Class310 class310, int i, int i_767_);
    
    public abstract void method16012(Class310 class310, int i, int i_768_);
    
    abstract void method16013(Interface33 interface33, Class310 class310,
			      int i, int i_769_, int i_770_, int i_771_);
    
    boolean method2434(int i, int i_772_, int i_773_, int i_774_,
		       Class266 class266, Class272 class272) {
	Class268 class268 = aClass268_9511;
	class268.method5203(class266);
	class268.method5202(((Class103_Sub3) this).aClass268_9525);
	return class272.method5317(i, i_772_, i_773_, i_774_, class268,
				   ((Class103_Sub3) this).aFloat9528,
				   ((Class103_Sub3) this).aFloat9530,
				   ((Class103_Sub3) this).aFloat9529,
				   ((Class103_Sub3) this).aFloat9531);
    }
    
    abstract void method16014();
    
    abstract void method16015();
    
    abstract void method16016(int i);
    
    static int method16017(char c, char c_775_, char c_776_, char c_777_) {
	return ((c & 0xff) << 0 | (c_775_ & 0xff) << 8 | (c_776_ & 0xff) << 16
		| (c_777_ & 0xff) << 24);
    }
    
    static int method16018(char c, char c_778_, char c_779_, char c_780_) {
	return ((c & 0xff) << 0 | (c_778_ & 0xff) << 8 | (c_779_ & 0xff) << 16
		| (c_780_ & 0xff) << 24);
    }
    
    abstract void method16019();
    
    abstract void method16020();
    
    abstract void method16021();
    
    abstract void method16022();
    
    void method16023() {
	if (((Class103_Sub3) this).aClass382_9599 != null)
	    ((Class103_Sub3) this).aClass382_9599.method6927();
	if (((Class103_Sub3) this).aClass368Array9604 != null) {
	    for (int i = 0;
		 i < ((Class103_Sub3) this).aClass368Array9604.length; i++) {
		if (((Class103_Sub3) this).aClass368Array9604[i] != null
		    && ((Class103_Sub3) this).aClass368Array9604[i]
			   .method6582())
		    ((Class103_Sub3) this).aClass368Array9604[i].method6563();
	    }
	}
	((Class103_Sub3) this).aClass391_9598 = new Class391(this);
	method15965();
	method15618();
	method15619();
	((Class103_Sub3) this).aClass391_9598.method7013(this);
	if (aBool9549)
	    ((Class103_Sub3) this).aClass390_9547 = new Class390(this, 1024);
    }
    
    abstract void method16024();
    
    abstract Interface40 method16025(boolean bool);
    
    void method16026() {
	method15761(7);
	method15614();
    }
    
    public final boolean method2365() {
	return true;
    }
    
    void method16027() {
	method15761(7);
	method15614();
    }
}
