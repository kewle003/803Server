/* Class103_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

public final class Class103_Sub3_Sub2 extends Class103_Sub3
{
    Class55_Sub2 aClass55_Sub2_11136;
    NodeCollection aClass429_11137 = new NodeCollection();
    OpenGL anOpenGL11138;
    boolean aBool11139;
    NodeCollection aClass429_11140;
    boolean aBool11141;
    NodeCollection aClass429_11142;
    boolean aBool11143;
    long aLong11144;
    int[] anIntArray11145;
    Class232_Sub2[] aClass232_Sub2Array11146;
    boolean aBool11147;
    boolean aBool11148;
    int anInt11149;
    NodeCollection aClass429_11150;
    Class232_Sub1 aClass232_Sub1_11151;
    int[] anIntArray11152;
    boolean aBool11153;
    boolean aBool11154;
    String aString11155;
    String aString11156;
    int anInt11157;
    NodeCollection aClass429_11158 = new NodeCollection();
    NodeCollection aClass429_11159;
    boolean aBool11160;
    boolean aBool11161;
    boolean aBool11162;
    boolean aBool11163;
    boolean aBool11164;
    int anInt11165;
    NodeCollection aClass429_11166 = new NodeCollection();
    float[] aFloatArray11167;
    float[] aFloatArray11168;
    
    void method15840() {
	if (aBool9654)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    public Class116 method15784(String string) {
	byte[] is = method17555(string);
	if (is == null)
	    return null;
	Class47 class47 = method15631(is);
	return new Class116_Sub1(this, class47);
    }
    
    public Class116 method15788(String string) {
	byte[] is = method17555(string);
	if (is == null)
	    return null;
	Class47 class47 = method15631(is);
	return new Class116_Sub1(this, class47);
    }
    
    public boolean method15606() {
	return ((Class103_Sub3_Sub2) this).aBool11163;
    }
    
    Class103_Sub3_Sub2(OpenGL opengl, Canvas canvas, long l, Class107 class107,
		       Interface6 interface6, JS5 class210, int i) {
	super(class107, interface6, class210, i, 1);
	((Class103_Sub3_Sub2) this).aClass429_11140 = new NodeCollection();
	((Class103_Sub3_Sub2) this).aClass429_11150 = new NodeCollection();
	((Class103_Sub3_Sub2) this).aClass429_11142 = new NodeCollection();
	((Class103_Sub3_Sub2) this).aClass429_11159 = new NodeCollection();
	((Class103_Sub3_Sub2) this).anIntArray11145 = new int[1000];
	((Class103_Sub3_Sub2) this).aClass232_Sub2Array11146
	    = new Class232_Sub2[16];
	new MapBuffer();
	new MapBuffer();
	((Class103_Sub3_Sub2) this).aFloatArray11167 = new float[4];
	((Class103_Sub3_Sub2) this).aFloatArray11168 = new float[16];
	int[] is = new int[1];
	try {
	    ((Class103_Sub3_Sub2) this).anOpenGL11138 = opengl;
	    ((Class103_Sub3_Sub2) this).anOpenGL11138.method3497();
	    ((Class103_Sub3_Sub2) this).aString11155
		= OpenGL.glGetString(7936).toLowerCase();
	    ((Class103_Sub3_Sub2) this).aString11156
		= OpenGL.glGetString(7937).toLowerCase();
	    if ((((Class103_Sub3_Sub2) this).aString11155.indexOf("microsoft")
		 != -1)
		|| ((Class103_Sub3_Sub2) this).aString11155
		       .indexOf("brian paul") != -1
		|| (((Class103_Sub3_Sub2) this).aString11155.indexOf("mesa")
		    != -1))
		throw new RuntimeException("");
	    String string = OpenGL.glGetString(7938);
	    String[] strings = Class225.method4625(string.replace('.', ' '),
						   ' ', 527367811);
	    if (strings.length >= 2) {
		try {
		    int i_0_ = Class324.method5975(strings[0], -952789660);
		    int i_1_ = Class324.method5975(strings[1], -952789660);
		    ((Class103_Sub3_Sub2) this).anInt11157 = i_0_ * 10 + i_1_;
		} catch (NumberFormatException numberformatexception) {
		    throw new RuntimeException("");
		}
	    } else
		throw new RuntimeException("");
	    if (((Class103_Sub3_Sub2) this).anInt11157 < 12)
		throw new RuntimeException("");
	    OpenGL.glGetIntegerv(34018, is, 0);
	    anInt9647 = is[0];
	    if (anInt9647 < 2)
		throw new RuntimeException("");
	    anInt9630 = 8;
	    ((Class103_Sub3_Sub2) this).aBool11161
		= ((Class103_Sub3_Sub2) this).anOpenGL11138
		      .method3496("GL_ARB_vertex_buffer_object");
	    aBool9634 = ((Class103_Sub3_Sub2) this).anOpenGL11138
			    .method3496("GL_ARB_multisample");
	    aBool9638 = ((Class103_Sub3_Sub2) this).anOpenGL11138
			    .method3496("GL_EXT_blend_func_separate");
	    ((Class103_Sub3_Sub2) this).aBool11139
		= ((Class103_Sub3_Sub2) this).anOpenGL11138
		      .method3496("GL_ARB_texture_rectangle");
	    aBool9635 = ((Class103_Sub3_Sub2) this).anOpenGL11138
			    .method3496("GL_ARB_texture_cube_map");
	    ((Class103_Sub3_Sub2) this).aBool11160
		= ((Class103_Sub3_Sub2) this).anOpenGL11138
		      .method3496("GL_ARB_texture_non_power_of_two");
	    aBool9636 = true;
	    ((Class103_Sub3_Sub2) this).aBool11143
		= ((Class103_Sub3_Sub2) this).anOpenGL11138
		      .method3496("GL_ARB_vertex_shader");
	    ((Class103_Sub3_Sub2) this).aBool11162
		= ((Class103_Sub3_Sub2) this).anOpenGL11138
		      .method3496("GL_ARB_vertex_program");
	    ((Class103_Sub3_Sub2) this).aBool11163
		= ((Class103_Sub3_Sub2) this).anOpenGL11138
		      .method3496("GL_ARB_fragment_shader");
	    ((Class103_Sub3_Sub2) this).aBool11164
		= ((Class103_Sub3_Sub2) this).anOpenGL11138
		      .method3496("GL_ARB_fragment_program");
	    aBool9549 = ((Class103_Sub3_Sub2) this).anOpenGL11138
			    .method3496("GL_EXT_framebuffer_object");
	    aBool9637 = aBool9549;
	    aBool9632 = ((Class103_Sub3_Sub2) this).anOpenGL11138
			    .method3496("GL_EXT_framebuffer_blit");
	    aBool9622 = ((Class103_Sub3_Sub2) this).anOpenGL11138
			    .method3496("GL_EXT_framebuffer_multisample");
	    ((Class103_Sub3_Sub2) this).anIntArray11152 = new int[anInt9647];
	    if (!method15605() || !method15606()) {
		if (!((Class103_Sub3_Sub2) this).anOpenGL11138
			 .method3496("GL_ARB_multitexture"))
		    throw new RuntimeException("");
		if (!((Class103_Sub3_Sub2) this).anOpenGL11138
			 .method3496("GL_ARB_texture_env_combine"))
		    throw new RuntimeException("");
	    }
	    aBool9639 = Class240.aString2771.startsWith("mac");
	    ((Class103_Sub3_Sub2) this).anInt11165
		= Stream.method3788() ? 33639 : 5121;
	    if ((((Class103_Sub3_Sub2) this).aString11156.indexOf("radeon")
		 != -1)
		|| (((Class103_Sub3_Sub2) this).aString11155.indexOf("intel")
		    != -1)) {
		int i_2_ = 0;
		boolean bool = (((Class103_Sub3_Sub2) this).aString11155
				    .indexOf("intel")
				!= -1);
		boolean bool_3_ = false;
		boolean bool_4_ = false;
		String[] strings_5_
		    = Class225.method4625(((Class103_Sub3_Sub2) this)
					      .aString11156.replace('/', ' '),
					  ' ', 662116651);
		for (int i_6_ = 0; i_6_ < strings_5_.length; i_6_++) {
		    String string_7_ = strings_5_[i_6_];
		    try {
			if (string_7_.length() <= 0)
			    continue;
			if (string_7_.charAt(0) == 'x'
			    && string_7_.length() >= 3
			    && Class551.method12096(string_7_.substring(1, 3),
						    -798137576)) {
			    string_7_ = string_7_.substring(1);
			    bool_4_ = true;
			}
			if (string_7_.equals("hd")) {
			    bool_3_ = true;
			    continue;
			}
			if (string_7_.startsWith("hd")) {
			    string_7_ = string_7_.substring(2);
			    bool_3_ = true;
			}
			if (string_7_.length() < 4
			    || !Class551.method12096(string_7_.substring(0, 4),
						     541368634))
			    continue;
			i_2_ = Class324.method5975(string_7_.substring(0, 4),
						   -952789660);
		    } catch (Exception exception) {
			continue;
		    }
		    break;
		}
		if (bool) {
		    if (!bool_3_)
			aBool9549 = false;
		} else {
		    if (!bool_4_ && !bool_3_) {
			if (i_2_ >= 7000 && i_2_ <= 7999)
			    ((Class103_Sub3_Sub2) this).aBool11161 = false;
			if (i_2_ >= 7000 && i_2_ <= 9250)
			    aBool9636 = false;
		    }
		    ((Class103_Sub3_Sub2) this).aBool11139
			&= ((Class103_Sub3_Sub2) this).anOpenGL11138
			       .method3496("GL_ARB_half_float_pixel");
		    ((Class103_Sub3_Sub2) this).aBool11154 = true;
		}
	    }
	    if (((Class103_Sub3_Sub2) this).aBool11161) {
		try {
		    int[] is_8_ = new int[1];
		    OpenGL.glGenBuffersARB(1, is_8_, 0);
		} catch (Throwable throwable) {
		    throw new RuntimeException("");
		}
	    } else
		throw new RuntimeException("");
	    method2240(canvas, new Class105_Sub1_Sub1_Sub1(this, canvas, l),
		       1455428848);
	    method2242(canvas, 1248995983);
	    method15946(32768, false);
	    method15946(32768, false);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method2220((byte) 0);
	    if (throwable instanceof OutOfMemoryError)
		throw (OutOfMemoryError) throwable;
	    throw new RuntimeException("");
	}
    }
    
    boolean method15675(Class175 class175, Class102 class102) {
	return true;
    }
    
    public Class174 method2623() {
	int i = -1;
	if (((Class103_Sub3_Sub2) this).aString11155.indexOf("nvidia") != -1)
	    i = 4318;
	else if (((Class103_Sub3_Sub2) this).aString11155.indexOf("intel")
		 != -1)
	    i = 32902;
	else if (((Class103_Sub3_Sub2) this).aString11155.indexOf("ati") != -1)
	    i = 4098;
	return new Class174(i, method15607() ? "OpenGL FF" : "OpenGL",
			    ((Class103_Sub3_Sub2) this).anInt11157,
			    ((Class103_Sub3_Sub2) this).aString11156, 0L,
			    method15607());
    }
    
    void method2218(int i, int i_9_) throws Exception_Sub2 {
	aClass105_Sub1_1452.method15434();
	if (anInterface6_1457 != null)
	    anInterface6_1457.method34(-602503007);
    }
    
    public void method2436() {
	OpenGL.glFinish();
    }
    
    void method15875() {
	if (aBool9562)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    public float method15622() {
	return 0.0F;
    }
    
    final void method15693(int i, Class306 class306, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method17548(class306));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    public Class105_Sub2 method2248() {
	return new Class105_Sub2_Sub3_Sub2(this);
    }
    
    public Interface4 method2461(int i, int i_10_, Class175 class175,
				 Class102 class102, int i_11_) {
	return new Class229(this, class175, class102, i, i_10_, i_11_);
    }
    
    public Interface5 method2249(int i, int i_12_) {
	return new Class229(this, Class175.aClass175_2115,
			    Class102.aClass102_1437, i, i_12_);
    }
    
    public Class88 method2319(Class88 class88, Class88 class88_13_, float f,
			      Class88 class88_14_) {
	return f < 0.5F ? class88 : class88_13_;
    }
    
    Interface38 method15745(Class175 class175, int i, int i_15_, int i_16_,
			    boolean bool, byte[] is) {
	return new Class226_Sub2(this, class175, i, i_15_, i_16_, bool, is);
    }
    
    public void method2252() {
	if (aClass105_1470 != null) {
	    int i = aClass105_1470.method2655();
	    int i_17_ = aClass105_1470.method2654();
	    if (i > 0 || i_17_ > 0) {
		int i_18_ = anInt9546;
		int i_19_ = anInt9545;
		int i_20_ = anInt9482;
		int i_21_ = anInt9617;
		method2295();
		int i_22_ = anInt9512;
		int i_23_ = anInt9574;
		int i_24_ = anInt9538;
		int i_25_ = anInt9581;
		method2572();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method15653();
		method15852(false);
		method15889(false);
		method15660(false);
		method15701(false);
		method15856(null);
		method15655(1);
		method15640(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_17_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method2445(i_22_, i_24_, i_23_, i_25_);
		method2254(i_18_, i_19_, i_20_, i_21_);
	    }
	}
    }
    
    final synchronized void method17544(int i, int i_26_) {
	IntegerNode class241_sub22 = new IntegerNode(i_26_);
	class241_sub22.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11158.addNode(class241_sub22,
							       (short) -7884);
    }
    
    Interface43 method15684(Class175 class175, Class102 class102, int i,
			    int i_27_) {
	return new Class226_Sub3(this, class175, class102, i, i_27_);
    }
    
    void method15629() {
	if (aClass105_1470 != null)
	    OpenGL.glViewport(anInt9550 + anInt9546,
			      (anInt9551 + aClass105_1470.method2654()
			       - anInt9545 - anInt9617),
			      anInt9482, anInt9617);
	OpenGL.glDepthRange(aFloat9532, aFloat9533);
    }
    
    void method15742() {
	if (aClass105_1470 != null) {
	    int i = anInt9550 + anInt9512;
	    int i_28_ = anInt9551 + aClass105_1470.method2654() - anInt9581;
	    int i_29_ = anInt9574 - anInt9512;
	    int i_30_ = anInt9581 - anInt9538;
	    if (i_29_ < 0)
		i_29_ = 0;
	    if (i_30_ < 0)
		i_30_ = 0;
	    OpenGL.glScissor(i, i_28_, i_29_, i_30_);
	}
    }
    
    static final int method17545(Class305 class305) {
	if (class305 == Class305.aClass305_4802)
	    return 7681;
	if (class305 == Class305.aClass305_4801)
	    return 8448;
	if (class305 == Class305.aClass305_4804)
	    return 34165;
	if (class305 == Class305.aClass305_4800)
	    return 260;
	if (class305 == Class305.aClass305_4803)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    public void method15610(Class268 class268, Class268 class268_31_,
			    Class268 class268_32_) {
	OpenGL.glMatrixMode(5888);
	aClass268_9511.method5201(class268, class268_31_);
	OpenGL.glLoadMatrixf(aClass268_9511.aFloatArray4353, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class268_32_.aFloatArray4353, 0);
    }
    
    void method15890() {
	if (aBool9492) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    void method15662() {
	if (aBool9562)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    final Interface33 method15714(boolean bool) {
	return new Class232_Sub1(this, Class102.aClass102_1441, bool);
    }
    
    void method15668() {
	if (aBool9600 && !aBool9557)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    public void method15898(int i, Interface40 interface40) {
	((Class103_Sub3_Sub2) this).aClass232_Sub2Array11146[i]
	    = (Class232_Sub2) interface40;
    }
    
    void method15670() {
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = aFloat9609 * aFloat9563;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = aFloat9609 * aFloat9564;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = aFloat9609 * aFloat9556;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609,
			 ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = -aFloat9568 * aFloat9563;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = -aFloat9568 * aFloat9564;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = -aFloat9568 * aFloat9556;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609,
			 ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
    }
    
    Interface43 method15920(Class175 class175, Class102 class102, int i,
			    int i_33_) {
	return new Class226_Sub3(this, class175, class102, i, i_33_);
    }
    
    void method15673() {
	if (aBool9492) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    void method15672() {
	/* empty */
    }
    
    public void method15955(int i, Interface40 interface40) {
	((Class103_Sub3_Sub2) this).aClass232_Sub2Array11146[i]
	    = (Class232_Sub2) interface40;
    }
    
    final synchronized void method17546(long l) {
	Node class241 = new Node();
	class241.hashCode = l * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11159.addNode(class241,
							       (short) -9724);
    }
    
    void method15931() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass268_9504.aFloatArray4353, 0);
	int i;
	for (i = 0; i < anInt9524; i++) {
	    Class241_Sub43 class241_sub43 = aClass241_Sub43Array9569[i];
	    int i_34_ = class241_sub43.method16461(316485307);
	    int i_35_ = 16386 + i;
	    float f = class241_sub43.method16458(1372650180) / 255.0F;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[0]
		= (float) class241_sub43.method16453((byte) -6);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[1]
		= (float) class241_sub43.method16454(-1874096036);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[2]
		= (float) class241_sub43.method16455(626523592);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	    OpenGL.glLightfv(i_35_, 4611,
			     ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[0]
		= (float) (i_34_ >> 16 & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[1]
		= (float) (i_34_ >> 8 & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[2]
		= (float) (i_34_ & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	    OpenGL.glLightfv(i_35_, 4609,
			     ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	    OpenGL.glLightf(i_35_, 4617,
			    (1.0F
			     / (float) (class241_sub43.method16468(1143403757)
					* class241_sub43
					      .method16468(1143403757))));
	    OpenGL.glEnable(i_35_);
	}
	for (/**/; i < anInt9570; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    Interface41 method15679(Class175 class175, Class102 class102, int i,
			    int i_36_) {
	return method15684(class175, class102, i, i_36_);
    }
    
    Interface38 method15941(Class175 class175, int i, int i_37_, int i_38_,
			    boolean bool, byte[] is) {
	return new Class226_Sub2(this, class175, i, i_37_, i_38_, bool, is);
    }
    
    void method15988() {
	if (aBool9620)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    final synchronized void method17547(int i, int i_39_) {
	IntegerNode class241_sub22 = new IntegerNode(i_39_);
	class241_sub22.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11166.addNode(class241_sub22,
							       (short) -28888);
    }
    
    final Interface33 method15998(boolean bool) {
	return new Class232_Sub1(this, Class102.aClass102_1441, bool);
    }
    
    Interface30 method15683(int i, boolean bool, int[][] is) {
	return new Class226_Sub1(this, i, bool, is);
    }
    
    public final synchronized void method2222(int i) {
	try {
	    method17554();
	} catch (Exception exception) {
	    return;
	}
	int i_40_ = 0;
	i &= 0x7fffffff;
	while (!((Class103_Sub3_Sub2) this).aClass429_11158
		    .isEmpty(-642573438)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11158
				       .getNext(-2140682611);
	    ((Class103_Sub3_Sub2) this).anIntArray11145[i_40_++]
		= (int) (class241_sub22.hashCode * 4356572401218184725L);
	    anInt9506 -= class241_sub22.intValue * -1859754807;
	    if (i_40_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_40_, (((Class103_Sub3_Sub2) this)
						  .anIntArray11145), 0);
		i_40_ = 0;
	    }
	}
	if (i_40_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_40_, (((Class103_Sub3_Sub2) this)
					      .anIntArray11145), 0);
	    i_40_ = 0;
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11166
		    .isEmpty(-1754882697)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11166
				       .getNext(-1866118743);
	    ((Class103_Sub3_Sub2) this).anIntArray11145[i_40_++]
		= (int) (class241_sub22.hashCode * 4356572401218184725L);
	    anInt9539 -= class241_sub22.intValue * -1859754807;
	    if (i_40_ == 1000) {
		OpenGL.glDeleteTextures(i_40_, (((Class103_Sub3_Sub2) this)
						.anIntArray11145), 0);
		i_40_ = 0;
	    }
	}
	if (i_40_ > 0) {
	    OpenGL.glDeleteTextures(i_40_, (((Class103_Sub3_Sub2) this)
					    .anIntArray11145), 0);
	    i_40_ = 0;
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11140
		    .isEmpty(317632888)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11140
				       .getNext(-1330318706);
	    ((Class103_Sub3_Sub2) this).anIntArray11145[i_40_++]
		= class241_sub22.intValue * -1859754807;
	    if (i_40_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_40_,
					       (((Class103_Sub3_Sub2) this)
						.anIntArray11145),
					       0);
		i_40_ = 0;
	    }
	}
	if (i_40_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_40_, (((Class103_Sub3_Sub2) this)
						   .anIntArray11145), 0);
	    i_40_ = 0;
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11150
		    .isEmpty(-1598587154)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11150
				       .getNext(-1847241918);
	    ((Class103_Sub3_Sub2) this).anIntArray11145[i_40_++]
		= (int) (class241_sub22.hashCode * 4356572401218184725L);
	    anInt9567 -= class241_sub22.intValue * -1859754807;
	    if (i_40_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_40_,
						(((Class103_Sub3_Sub2) this)
						 .anIntArray11145),
						0);
		i_40_ = 0;
	    }
	}
	if (i_40_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_40_, (((Class103_Sub3_Sub2) this)
						    .anIntArray11145), 0);
	    boolean bool = false;
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11137
		    .isEmpty(463142221)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11137
				       .getNext(-1963280863);
	    OpenGL.glDeleteLists((int) (class241_sub22.hashCode
					* 4356572401218184725L),
				 class241_sub22.intValue * -1859754807);
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11142
		    .isEmpty(-1272707473)) {
	    Node class241 = ((Class103_Sub3_Sub2) this).aClass429_11142
				    .getNext(-1564094710);
	    OpenGL.glDeleteProgram((int) (class241.hashCode
					  * 4356572401218184725L));
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11159
		    .isEmpty(1144536337)) {
	    Node class241 = ((Class103_Sub3_Sub2) this).aClass429_11159
				    .getNext(-1853064435);
	    OpenGL.glDeleteShader((int) (class241.hashCode
					 * 4356572401218184725L));
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11137
		    .isEmpty(-759669242)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11137
				       .getNext(-1610272650);
	    OpenGL.glDeleteLists((int) (class241_sub22.hashCode
					* 4356572401218184725L),
				 class241_sub22.intValue * -1859754807);
	}
	if (method2342() > 100663296
	    && (Class50.method1249((byte) 1)
		> ((Class103_Sub3_Sub2) this).aLong11144 + 60000L)) {
	    System.gc();
	    ((Class103_Sub3_Sub2) this).aLong11144
		= Class50.method1249((byte) 1);
	}
	super.method2222(i);
    }
    
    public void method15632() {
	int i = ((Class103_Sub3_Sub2) this).anIntArray11152[anInt9580];
	if (i != 0) {
	    ((Class103_Sub3_Sub2) this).anIntArray11152[anInt9580] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    void method15700() {
	OpenGL.glMatrixMode(5890);
	if (aClass387Array9579[anInt9580] != Class387.aClass387_5710)
	    OpenGL.glLoadMatrixf
		(aClass268Array9578[anInt9580]
		     .method5233(((Class103_Sub3_Sub2) this).aFloatArray11168),
		 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method16014() {
	OpenGL.glActiveTexture(33984 + anInt9580);
    }
    
    void method15702() {
	OpenGL.glTexEnvi(8960, 34161,
			 method17564(aClass305Array9541[anInt9580]));
    }
    
    void method15703() {
	OpenGL.glTexEnvi(8960, 34162,
			 method17564(aClass305Array9573[anInt9580]));
    }
    
    final void method15926(int i, Class306 class306, boolean bool,
			   boolean bool_41_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method17548(class306));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_41_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_41_ ? 769 : 768);
    }
    
    final void method15945(int i, Class306 class306, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method17548(class306));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    final void method16015() {
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = (float) (anInt9582 & 0xff0000) / 1.671168E7F;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = (float) (anInt9582 & 0xff00) / 65280.0F;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = (float) (anInt9582 & 0xff) / 255.0F;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3]
	    = (float) (anInt9582 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705,
			  ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
    }
    
    final void method15940(int i, Class306 class306, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method17548(class306));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    static final int method17548(Class306 class306) {
	if (class306 == Class306.aClass306_4806)
	    return 5890;
	if (class306 == Class306.aClass306_4808)
	    return 34167;
	if (class306 == Class306.aClass306_4809)
	    return 34168;
	if (class306 == Class306.aClass306_4807)
	    return 34166;
	throw new IllegalArgumentException();
    }
    
    void method15761(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    final synchronized void method17549(long l) {
	Node class241 = new Node();
	class241.hashCode = l * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11159.addNode(class241,
							       (short) -16749);
    }
    
    void method15801() {
	if (aBool9638) {
	    int i = 0;
	    int i_42_ = 0;
	    if (anInt9618 == 0) {
		i = 0;
		i_42_ = 0;
	    } else if (anInt9618 == 1) {
		i = 1;
		i_42_ = 0;
	    } else if (anInt9618 == 2) {
		i = 1;
		i_42_ = 1;
	    } else if (anInt9618 == 3) {
		i = 0;
		i_42_ = 1;
	    }
	    if (aClass304_9619 == Class304.aClass304_4798)
		OpenGL.glBlendFuncSeparate(770, 771, i, i_42_);
	    else if (aClass304_9619 == Class304.aClass304_4796)
		OpenGL.glBlendFuncSeparate(1, 1, i, i_42_);
	    else if (aClass304_9619 == Class304.aClass304_4797)
		OpenGL.glBlendFuncSeparate(774, 1, i, i_42_);
	    else if (aClass304_9619 == Class304.aClass304_4795)
		OpenGL.glBlendFuncSeparate(1, 0, i, i_42_);
	} else if (aClass304_9619 == Class304.aClass304_4798) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(770, 771);
	} else if (aClass304_9619 == Class304.aClass304_4796) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(1, 1);
	} else if (aClass304_9619 == Class304.aClass304_4797) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(774, 1);
	} else
	    OpenGL.glDisable(3042);
    }
    
    void method15715() {
	if (aBool9620)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method15750() {
	if (aBool9611 && aBool9576 && anInt9613 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    void method15962() {
	if (aBool9654)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    void method15713(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    final Interface40 method15752(boolean bool) {
	return new Class232_Sub2(this, bool);
    }
    
    public Class105_Sub2 method2529() {
	return new Class105_Sub2_Sub3_Sub2(this);
    }
    
    Class366 method15697(Class314[] class314s) {
	return new Class366_Sub1(class314s);
    }
    
    final void method15772(int i, Class306 class306, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method17548(class306));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    void method15615() {
	OpenGL.glActiveTexture(33984 + anInt9580);
    }
    
    public void method15716(Class366 class366) {
	Class314[] class314s = class366.aClass314Array5544;
	int i = 0;
	boolean bool = false;
	boolean bool_43_ = false;
	boolean bool_44_ = false;
	for (int i_45_ = 0; i_45_ < class314s.length; i_45_++) {
	    Class314 class314 = class314s[i_45_];
	    Class232_Sub2 class232_sub2
		= ((Class103_Sub3_Sub2) this).aClass232_Sub2Array11146[i_45_];
	    int i_46_ = 0;
	    int i_47_ = class232_sub2.method16830();
	    long l = class232_sub2.method4674();
	    class232_sub2.method4679();
	    for (int i_48_ = 0; i_48_ < class314.method5888(); i_48_++) {
		Class367 class367 = class314.method5890(i_48_);
		switch (class367.anInt5557) {
		case 6:
		    OpenGL.glVertexPointer(3, 5126, i_47_, l + (long) i_46_);
		    bool_44_ = true;
		    break;
		case 1:
		    OpenGL.glNormalPointer(5126, i_47_, l + (long) i_46_);
		    bool_43_ = true;
		    break;
		case 7:
		    OpenGL.glColorPointer(4, 5121, i_47_, l + (long) i_46_);
		    bool = true;
		    break;
		default:
		    break;
		case 11:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_47_, l + (long) i_46_);
		    break;
		case 9:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_47_, l + (long) i_46_);
		    break;
		case 5:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_47_, l + (long) i_46_);
		    break;
		case 8:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_47_, l + (long) i_46_);
		}
		i_46_ += class367.anInt5561;
	    }
	}
	if (((Class103_Sub3_Sub2) this).aBool11148 != bool_44_) {
	    if (bool_44_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    ((Class103_Sub3_Sub2) this).aBool11148 = bool_44_;
	}
	if (((Class103_Sub3_Sub2) this).aBool11153 != bool_43_) {
	    if (bool_43_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    ((Class103_Sub3_Sub2) this).aBool11153 = bool_43_;
	}
	if (((Class103_Sub3_Sub2) this).aBool11147 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    ((Class103_Sub3_Sub2) this).aBool11147 = bool;
	}
	if (((Class103_Sub3_Sub2) this).anInt11149 < i) {
	    for (int i_49_ = ((Class103_Sub3_Sub2) this).anInt11149; i_49_ < i;
		 i_49_++) {
		OpenGL.glClientActiveTexture(33984 + i_49_);
		OpenGL.glEnableClientState(32888);
	    }
	    ((Class103_Sub3_Sub2) this).anInt11149 = i;
	} else if (((Class103_Sub3_Sub2) this).anInt11149 > i) {
	    for (int i_50_ = i; i_50_ < ((Class103_Sub3_Sub2) this).anInt11149;
		 i_50_++) {
		OpenGL.glClientActiveTexture(33984 + i_50_);
		OpenGL.glDisableClientState(32888);
	    }
	    ((Class103_Sub3_Sub2) this).anInt11149 = i;
	}
    }
    
    void method15711() {
	aFloat9616 = aFloat9537 - (float) anInt9614;
	aFloat9615 = aFloat9616 - (float) anInt9613;
	if (aFloat9615 < aFloat9596)
	    aFloat9615 = aFloat9596;
	if (aBool9488) {
	    OpenGL.glFogf(2915, aFloat9615);
	    OpenGL.glFogf(2916, aFloat9616);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[0]
		= (float) (anInt9589 & 0xff0000) / 1.671168E7F;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[1]
		= (float) (anInt9589 & 0xff00) / 65280.0F;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[2]
		= (float) (anInt9589 & 0xff) / 255.0F;
	    OpenGL.glFogfv(2918, ((Class103_Sub3_Sub2) this).aFloatArray11167,
			   0);
	}
    }
    
    Interface41 method15681(Class175 class175, int i, int i_51_, boolean bool,
			    float[] fs, int i_52_, int i_53_) {
	return new Class226_Sub3(this, class175, i, i_51_, bool, fs, i_52_,
				 i_53_);
    }
    
    public final void method15726(Class310 class310, int i, int i_54_,
				  int i_55_, int i_56_) {
	int i_57_;
	int i_58_;
	if (class310 == Class310.aClass310_4821) {
	    i_57_ = 1;
	    i_58_ = i_56_ * 2;
	} else if (class310 == Class310.aClass310_4819) {
	    i_57_ = 3;
	    i_58_ = i_56_ + 1;
	} else if (class310 == Class310.aClass310_4822) {
	    i_57_ = 4;
	    i_58_ = i_56_ * 3;
	} else if (class310 == Class310.aClass310_4823) {
	    i_57_ = 6;
	    i_58_ = i_56_ + 2;
	} else if (class310 == Class310.aClass310_4824) {
	    i_57_ = 5;
	    i_58_ = i_56_ + 2;
	} else {
	    i_57_ = 0;
	    i_58_ = i_56_;
	}
	Class102 class102
	    = ((Class103_Sub3_Sub2) this).aClass232_Sub1_11151.method186();
	OpenGL.glDrawElements(i_57_, i_58_, method17553(class102),
			      (((Class103_Sub3_Sub2) this)
				   .aClass232_Sub1_11151.method4674()
			       + (long) (i_55_ * (class102.anInt1447
						  * -387243519))));
    }
    
    void method16020() {
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = aFloat9566 * aFloat9563;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = aFloat9566 * aFloat9564;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = aFloat9566 * aFloat9556;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	OpenGL.glLightModelfv(2899,
			      ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
    }
    
    Interface43 method15921(Class175 class175, Class102 class102, int i,
			    int i_59_) {
	return new Class226_Sub3(this, class175, class102, i, i_59_);
    }
    
    public Interface5 method2550(int i, int i_60_, int i_61_) {
	return new Class229(this, Class175.aClass175_2115,
			    Class102.aClass102_1437, i, i_60_, i_61_);
    }
    
    final synchronized void method17550(int i) {
	IntegerNode class241_sub22 = new IntegerNode(i);
	((Class103_Sub3_Sub2) this).aClass429_11140.addNode(class241_sub22,
							       (short) -11681);
    }
    
    final synchronized void method17551(int i, int i_62_) {
	IntegerNode class241_sub22 = new IntegerNode(i_62_);
	class241_sub22.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11150.addNode(class241_sub22,
							       (short) -16614);
    }
    
    void method15864() {
	if (aBool9621)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9577 & 0xff) / 255.0F);
	if (anInt9623 > 1) {
	    if (aByte9577 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    final synchronized void method17552(int i) {
	Node class241 = new Node();
	class241.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11142.addNode(class241,
							       (short) -4522);
    }
    
    static final int method17553(Class102 class102) {
	switch (class102.anInt1446 * 1467922455) {
	case 6:
	    return 5123;
	case 1:
	    return 5131;
	case 2:
	    return 5120;
	case 3:
	    return 5124;
	case 4:
	    return 5122;
	case 0:
	    return 5126;
	case 5:
	    return 5121;
	case 7:
	    return 5125;
	default:
	    return 5121;
	}
    }
    
    Interface41 method15680(Class175 class175, int i, int i_63_, boolean bool,
			    byte[] is, int i_64_, int i_65_) {
	return new Class226_Sub3(this, class175, i, i_63_, bool, is, i_64_,
				 i_65_);
    }
    
    public Interface5 method2354(int i, int i_66_) {
	return new Class229(this, Class175.aClass175_2115,
			    Class102.aClass102_1437, i, i_66_);
    }
    
    public void method2442(boolean bool) {
	/* empty */
    }
    
    void method17554() {
	int i = 0;
	while (!((Class103_Sub3_Sub2) this).anOpenGL11138.method3497()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class380_Sub2.method16722(1000L);
	}
    }
    
    void method15980() {
	if (aBool9621)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9577 & 0xff) / 255.0F);
	if (anInt9623 > 1) {
	    if (aByte9577 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    public void method15767(Class366 class366) {
	Class314[] class314s = class366.aClass314Array5544;
	int i = 0;
	boolean bool = false;
	boolean bool_67_ = false;
	boolean bool_68_ = false;
	for (int i_69_ = 0; i_69_ < class314s.length; i_69_++) {
	    Class314 class314 = class314s[i_69_];
	    Class232_Sub2 class232_sub2
		= ((Class103_Sub3_Sub2) this).aClass232_Sub2Array11146[i_69_];
	    int i_70_ = 0;
	    int i_71_ = class232_sub2.method16830();
	    long l = class232_sub2.method4674();
	    class232_sub2.method4679();
	    for (int i_72_ = 0; i_72_ < class314.method5888(); i_72_++) {
		Class367 class367 = class314.method5890(i_72_);
		switch (class367.anInt5557) {
		case 6:
		    OpenGL.glVertexPointer(3, 5126, i_71_, l + (long) i_70_);
		    bool_68_ = true;
		    break;
		case 1:
		    OpenGL.glNormalPointer(5126, i_71_, l + (long) i_70_);
		    bool_67_ = true;
		    break;
		case 7:
		    OpenGL.glColorPointer(4, 5121, i_71_, l + (long) i_70_);
		    bool = true;
		    break;
		default:
		    break;
		case 11:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_71_, l + (long) i_70_);
		    break;
		case 9:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_71_, l + (long) i_70_);
		    break;
		case 5:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_71_, l + (long) i_70_);
		    break;
		case 8:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_71_, l + (long) i_70_);
		}
		i_70_ += class367.anInt5561;
	    }
	}
	if (((Class103_Sub3_Sub2) this).aBool11148 != bool_68_) {
	    if (bool_68_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    ((Class103_Sub3_Sub2) this).aBool11148 = bool_68_;
	}
	if (((Class103_Sub3_Sub2) this).aBool11153 != bool_67_) {
	    if (bool_67_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    ((Class103_Sub3_Sub2) this).aBool11153 = bool_67_;
	}
	if (((Class103_Sub3_Sub2) this).aBool11147 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    ((Class103_Sub3_Sub2) this).aBool11147 = bool;
	}
	if (((Class103_Sub3_Sub2) this).anInt11149 < i) {
	    for (int i_73_ = ((Class103_Sub3_Sub2) this).anInt11149; i_73_ < i;
		 i_73_++) {
		OpenGL.glClientActiveTexture(33984 + i_73_);
		OpenGL.glEnableClientState(32888);
	    }
	    ((Class103_Sub3_Sub2) this).anInt11149 = i;
	} else if (((Class103_Sub3_Sub2) this).anInt11149 > i) {
	    for (int i_74_ = i; i_74_ < ((Class103_Sub3_Sub2) this).anInt11149;
		 i_74_++) {
		OpenGL.glClientActiveTexture(33984 + i_74_);
		OpenGL.glDisableClientState(32888);
	    }
	    ((Class103_Sub3_Sub2) this).anInt11149 = i;
	}
    }
    
    public Class174 method2343() {
	int i = -1;
	if (((Class103_Sub3_Sub2) this).aString11155.indexOf("nvidia") != -1)
	    i = 4318;
	else if (((Class103_Sub3_Sub2) this).aString11155.indexOf("intel")
		 != -1)
	    i = 32902;
	else if (((Class103_Sub3_Sub2) this).aString11155.indexOf("ati") != -1)
	    i = 4098;
	return new Class174(i, method15607() ? "OpenGL FF" : "OpenGL",
			    ((Class103_Sub3_Sub2) this).anInt11157,
			    ((Class103_Sub3_Sub2) this).aString11156, 0L,
			    method15607());
    }
    
    public void method2608() {
	OpenGL.glFinish();
    }
    
    public void method2345() {
	OpenGL.glFinish();
    }
    
    void method2346() {
	super.method2221();
	if (((Class103_Sub3_Sub2) this).anOpenGL11138 != null) {
	    ((Class103_Sub3_Sub2) this).anOpenGL11138.method3498();
	    ((Class103_Sub3_Sub2) this).anOpenGL11138.release();
	    ((Class103_Sub3_Sub2) this).anOpenGL11138 = null;
	}
    }
    
    public String method2369() {
	String string = "Caps: 4:";
	String string_75_ = ":";
	string = new StringBuilder().append(string).append(anInt9623).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).anInt11165).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append(anInt9647).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append(anInt9630).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11161 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9634 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11162 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11164 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11143 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11163 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9636 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11139 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9635 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11160 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9549 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9632 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9622 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9638 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    public final synchronized void method2561(int i) {
	try {
	    method17554();
	} catch (Exception exception) {
	    return;
	}
	int i_76_ = 0;
	i &= 0x7fffffff;
	while (!((Class103_Sub3_Sub2) this).aClass429_11158
		    .isEmpty(1021182952)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11158
				       .getNext(-1432366556);
	    ((Class103_Sub3_Sub2) this).anIntArray11145[i_76_++]
		= (int) (class241_sub22.hashCode * 4356572401218184725L);
	    anInt9506 -= class241_sub22.intValue * -1859754807;
	    if (i_76_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_76_, (((Class103_Sub3_Sub2) this)
						  .anIntArray11145), 0);
		i_76_ = 0;
	    }
	}
	if (i_76_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_76_, (((Class103_Sub3_Sub2) this)
					      .anIntArray11145), 0);
	    i_76_ = 0;
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11166
		    .isEmpty(-163234381)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11166
				       .getNext(-1730673162);
	    ((Class103_Sub3_Sub2) this).anIntArray11145[i_76_++]
		= (int) (class241_sub22.hashCode * 4356572401218184725L);
	    anInt9539 -= class241_sub22.intValue * -1859754807;
	    if (i_76_ == 1000) {
		OpenGL.glDeleteTextures(i_76_, (((Class103_Sub3_Sub2) this)
						.anIntArray11145), 0);
		i_76_ = 0;
	    }
	}
	if (i_76_ > 0) {
	    OpenGL.glDeleteTextures(i_76_, (((Class103_Sub3_Sub2) this)
					    .anIntArray11145), 0);
	    i_76_ = 0;
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11140
		    .isEmpty(-1121068521)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11140
				       .getNext(-1701652314);
	    ((Class103_Sub3_Sub2) this).anIntArray11145[i_76_++]
		= class241_sub22.intValue * -1859754807;
	    if (i_76_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_76_,
					       (((Class103_Sub3_Sub2) this)
						.anIntArray11145),
					       0);
		i_76_ = 0;
	    }
	}
	if (i_76_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_76_, (((Class103_Sub3_Sub2) this)
						   .anIntArray11145), 0);
	    i_76_ = 0;
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11150
		    .isEmpty(-1272696319)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11150
				       .getNext(-1224483772);
	    ((Class103_Sub3_Sub2) this).anIntArray11145[i_76_++]
		= (int) (class241_sub22.hashCode * 4356572401218184725L);
	    anInt9567 -= class241_sub22.intValue * -1859754807;
	    if (i_76_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_76_,
						(((Class103_Sub3_Sub2) this)
						 .anIntArray11145),
						0);
		i_76_ = 0;
	    }
	}
	if (i_76_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_76_, (((Class103_Sub3_Sub2) this)
						    .anIntArray11145), 0);
	    boolean bool = false;
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11137
		    .isEmpty(-1483354606)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11137
				       .getNext(-1834898579);
	    OpenGL.glDeleteLists((int) (class241_sub22.hashCode
					* 4356572401218184725L),
				 class241_sub22.intValue * -1859754807);
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11142
		    .isEmpty(-214975597)) {
	    Node class241 = ((Class103_Sub3_Sub2) this).aClass429_11142
				    .getNext(-1610866148);
	    OpenGL.glDeleteProgram((int) (class241.hashCode
					  * 4356572401218184725L));
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11159
		    .isEmpty(1934689936)) {
	    Node class241 = ((Class103_Sub3_Sub2) this).aClass429_11159
				    .getNext(-1548675066);
	    OpenGL.glDeleteShader((int) (class241.hashCode
					 * 4356572401218184725L));
	}
	while (!((Class103_Sub3_Sub2) this).aClass429_11137
		    .isEmpty(1907611574)) {
	    IntegerNode class241_sub22
		= (IntegerNode) ((Class103_Sub3_Sub2) this)
				       .aClass429_11137
				       .getNext(-1922805917);
	    OpenGL.glDeleteLists((int) (class241_sub22.hashCode
					* 4356572401218184725L),
				 class241_sub22.intValue * -1859754807);
	}
	if (method2342() > 100663296
	    && (Class50.method1249((byte) 1)
		> ((Class103_Sub3_Sub2) this).aLong11144 + 60000L)) {
	    System.gc();
	    ((Class103_Sub3_Sub2) this).aLong11144
		= Class50.method1249((byte) 1);
	}
	super.method2222(i);
    }
    
    public void method2371(boolean bool) {
	/* empty */
    }
    
    Class105_Sub1 method2372(Canvas canvas, int i, int i_77_) {
	return new Class105_Sub1_Sub1_Sub1(this, canvas);
    }
    
    Class105_Sub1 method2277(Canvas canvas, int i, int i_78_) {
	return new Class105_Sub1_Sub1_Sub1(this, canvas);
    }
    
    byte[] method17555(String string) {
	return method15608("gl", string);
    }
    
    Class105_Sub1 method2511(Canvas canvas, int i, int i_79_) {
	return new Class105_Sub1_Sub1_Sub1(this, canvas);
    }
    
    void method15884() {
	if (aBool9600 && !aBool9557)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    public int[] method2377(int i, int i_80_, int i_81_, int i_82_) {
	int[] is = new int[i_81_ * i_82_];
	int i_83_ = aClass105_1470.method2654();
	for (int i_84_ = 0; i_84_ < i_82_; i_84_++)
	    OpenGL.glReadPixelsi(i, i_83_ - i_80_ - i_84_ - 1, i_81_, 1, 32993,
				 ((Class103_Sub3_Sub2) this).anInt11165, is,
				 i_84_ * i_81_);
	return is;
    }
    
    void method15857(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    public int[] method2565(int i, int i_85_, int i_86_, int i_87_) {
	int[] is = new int[i_86_ * i_87_];
	int i_88_ = aClass105_1470.method2654();
	for (int i_89_ = 0; i_89_ < i_87_; i_89_++)
	    OpenGL.glReadPixelsi(i, i_88_ - i_85_ - i_89_ - 1, i_86_, 1, 32993,
				 ((Class103_Sub3_Sub2) this).anInt11165, is,
				 i_89_ * i_86_);
	return is;
    }
    
    public void method2261() {
	if (aClass105_1470 != null) {
	    int i = aClass105_1470.method2655();
	    int i_90_ = aClass105_1470.method2654();
	    if (i > 0 || i_90_ > 0) {
		int i_91_ = anInt9546;
		int i_92_ = anInt9545;
		int i_93_ = anInt9482;
		int i_94_ = anInt9617;
		method2295();
		int i_95_ = anInt9512;
		int i_96_ = anInt9574;
		int i_97_ = anInt9538;
		int i_98_ = anInt9581;
		method2572();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method15653();
		method15852(false);
		method15889(false);
		method15660(false);
		method15701(false);
		method15856(null);
		method15655(1);
		method15640(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_90_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method2445(i_95_, i_97_, i_96_, i_98_);
		method2254(i_91_, i_92_, i_93_, i_94_);
	    }
	}
    }
    
    public void method2381() {
	if (aClass105_1470 != null) {
	    int i = aClass105_1470.method2655();
	    int i_99_ = aClass105_1470.method2654();
	    if (i > 0 || i_99_ > 0) {
		int i_100_ = anInt9546;
		int i_101_ = anInt9545;
		int i_102_ = anInt9482;
		int i_103_ = anInt9617;
		method2295();
		int i_104_ = anInt9512;
		int i_105_ = anInt9574;
		int i_106_ = anInt9538;
		int i_107_ = anInt9581;
		method2572();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method15653();
		method15852(false);
		method15889(false);
		method15660(false);
		method15701(false);
		method15856(null);
		method15655(1);
		method15640(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_99_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method2445(i_104_, i_106_, i_105_, i_107_);
		method2254(i_100_, i_101_, i_102_, i_103_);
	    }
	}
    }
    
    public void method2607() {
	if (aClass105_1470 != null) {
	    int i = aClass105_1470.method2655();
	    int i_108_ = aClass105_1470.method2654();
	    if (i > 0 || i_108_ > 0) {
		int i_109_ = anInt9546;
		int i_110_ = anInt9545;
		int i_111_ = anInt9482;
		int i_112_ = anInt9617;
		method2295();
		int i_113_ = anInt9512;
		int i_114_ = anInt9574;
		int i_115_ = anInt9538;
		int i_116_ = anInt9581;
		method2572();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method15653();
		method15852(false);
		method15889(false);
		method15660(false);
		method15701(false);
		method15856(null);
		method15655(1);
		method15640(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_108_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method2445(i_113_, i_115_, i_114_, i_116_);
		method2254(i_109_, i_110_, i_111_, i_112_);
	    }
	}
    }
    
    public void method2406(int i, int i_117_) {
	int i_118_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_117_ & 0xff0000) / 1.671168E7F,
				(float) (i_117_ & 0xff00) / 65280.0F,
				(float) (i_117_ & 0xff) / 255.0F,
				(float) (i_117_ >>> 24) / 255.0F);
	    i_118_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method15701(true);
	    i_118_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_118_ |= 0x400;
	OpenGL.glClear(i_118_);
    }
    
    public Class88 method2487(Class88 class88, Class88 class88_119_, float f,
			      Class88 class88_120_) {
	return f < 0.5F ? class88 : class88_119_;
    }
    
    public Class88 method2610(Class88 class88, Class88 class88_121_, float f,
			      Class88 class88_122_) {
	return f < 0.5F ? class88 : class88_121_;
    }
    
    public boolean method15787() {
	return ((Class103_Sub3_Sub2) this).aBool11163;
    }
    
    void method15758() {
	if (aBool9600 && !aBool9557)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    void method15729() {
	if (aBool9611 && aBool9576 && anInt9613 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    public Interface4 method2531(int i, int i_123_, Class175 class175,
				 Class102 class102, int i_124_) {
	return new Class229(this, class175, class102, i, i_123_, i_124_);
    }
    
    void method15907() {
	if (aBool9638) {
	    int i = 0;
	    int i_125_ = 0;
	    if (anInt9618 == 0) {
		i = 0;
		i_125_ = 0;
	    } else if (anInt9618 == 1) {
		i = 1;
		i_125_ = 0;
	    } else if (anInt9618 == 2) {
		i = 1;
		i_125_ = 1;
	    } else if (anInt9618 == 3) {
		i = 0;
		i_125_ = 1;
	    }
	    if (aClass304_9619 == Class304.aClass304_4798)
		OpenGL.glBlendFuncSeparate(770, 771, i, i_125_);
	    else if (aClass304_9619 == Class304.aClass304_4796)
		OpenGL.glBlendFuncSeparate(1, 1, i, i_125_);
	    else if (aClass304_9619 == Class304.aClass304_4797)
		OpenGL.glBlendFuncSeparate(774, 1, i, i_125_);
	    else if (aClass304_9619 == Class304.aClass304_4795)
		OpenGL.glBlendFuncSeparate(1, 0, i, i_125_);
	} else if (aClass304_9619 == Class304.aClass304_4798) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(770, 771);
	} else if (aClass304_9619 == Class304.aClass304_4796) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(1, 1);
	} else if (aClass304_9619 == Class304.aClass304_4797) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(774, 1);
	} else
	    OpenGL.glDisable(3042);
    }
    
    public Interface4 method2533(int i, int i_126_, Class175 class175,
				 Class102 class102, int i_127_) {
	return new Class229(this, class175, class102, i, i_126_, i_127_);
    }
    
    public Interface5 method2534(int i, int i_128_) {
	return new Class229(this, Class175.aClass175_2115,
			    Class102.aClass102_1437, i, i_128_);
    }
    
    Interface41 method16001(Class175 class175, Class102 class102, int i,
			    int i_129_) {
	return method15684(class175, class102, i, i_129_);
    }
    
    Interface38 method15990(Class175 class175, int i, int i_130_, int i_131_,
			    boolean bool, byte[] is) {
	return new Class226_Sub2(this, class175, i, i_130_, i_131_, bool, is);
    }
    
    static final int method17556(Class102 class102) {
	switch (class102.anInt1446 * 1467922455) {
	case 6:
	    return 5123;
	case 1:
	    return 5131;
	case 2:
	    return 5120;
	case 3:
	    return 5124;
	case 4:
	    return 5122;
	case 0:
	    return 5126;
	case 5:
	    return 5121;
	case 7:
	    return 5125;
	default:
	    return 5121;
	}
    }
    
    public Interface5 method2538(int i, int i_132_, int i_133_) {
	return new Class229(this, Class175.aClass175_2115,
			    Class102.aClass102_1437, i, i_132_, i_133_);
    }
    
    void method15641() {
	if (aBool9654)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    public boolean method15987() {
	return ((Class103_Sub3_Sub2) this).aBool11143;
    }
    
    public boolean method15786() {
	return ((Class103_Sub3_Sub2) this).aBool11163;
    }
    
    public Interface4 method2486(int i, int i_134_, Class175 class175,
				 Class102 class102, int i_135_) {
	return new Class229(this, class175, class102, i, i_134_, i_135_);
    }
    
    public int[] method2418(int i, int i_136_, int i_137_, int i_138_) {
	int[] is = new int[i_137_ * i_138_];
	int i_139_ = aClass105_1470.method2654();
	for (int i_140_ = 0; i_140_ < i_138_; i_140_++)
	    OpenGL.glReadPixelsi(i, i_139_ - i_136_ - i_140_ - 1, i_137_, 1,
				 32993, ((Class103_Sub3_Sub2) this).anInt11165,
				 is, i_140_ * i_137_);
	return is;
    }
    
    public void method15792(Class268 class268, Class268 class268_141_,
			    Class268 class268_142_) {
	OpenGL.glMatrixMode(5888);
	aClass268_9511.method5201(class268, class268_141_);
	OpenGL.glLoadMatrixf(aClass268_9511.aFloatArray4353, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class268_142_.aFloatArray4353, 0);
    }
    
    public void method15793(Class268 class268, Class268 class268_143_,
			    Class268 class268_144_) {
	OpenGL.glMatrixMode(5888);
	aClass268_9511.method5201(class268, class268_143_);
	OpenGL.glLoadMatrixf(aClass268_9511.aFloatArray4353, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class268_144_.aFloatArray4353, 0);
    }
    
    public void method15794(Class268 class268, Class268 class268_145_,
			    Class268 class268_146_) {
	OpenGL.glMatrixMode(5888);
	aClass268_9511.method5201(class268, class268_145_);
	OpenGL.glLoadMatrixf(aClass268_9511.aFloatArray4353, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class268_146_.aFloatArray4353, 0);
    }
    
    void method15674() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass268_9504.aFloatArray4353, 0);
	int i;
	for (i = 0; i < anInt9524; i++) {
	    Class241_Sub43 class241_sub43 = aClass241_Sub43Array9569[i];
	    int i_147_ = class241_sub43.method16461(-1275938509);
	    int i_148_ = 16386 + i;
	    float f = class241_sub43.method16458(2071969905) / 255.0F;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[0]
		= (float) class241_sub43.method16453((byte) -57);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[1]
		= (float) class241_sub43.method16454(-1874096036);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[2]
		= (float) class241_sub43.method16455(626523592);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	    OpenGL.glLightfv(i_148_, 4611,
			     ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[0]
		= (float) (i_147_ >> 16 & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[1]
		= (float) (i_147_ >> 8 & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[2]
		= (float) (i_147_ & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	    OpenGL.glLightfv(i_148_, 4609,
			     ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	    OpenGL.glLightf(i_148_, 4617,
			    (1.0F
			     / (float) (class241_sub43.method16468(1143403757)
					* class241_sub43
					      .method16468(1143403757))));
	    OpenGL.glEnable(i_148_);
	}
	for (/**/; i < anInt9570; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    public float method15878() {
	return 0.0F;
    }
    
    void method15837() {
	if (aClass105_1470 != null)
	    OpenGL.glViewport(anInt9550 + anInt9546,
			      (anInt9551 + aClass105_1470.method2654()
			       - anInt9545 - anInt9617),
			      anInt9482, anInt9617);
	OpenGL.glDepthRange(aFloat9532, aFloat9533);
    }
    
    void method15753() {
	if (aClass105_1470 != null) {
	    int i = anInt9550 + anInt9512;
	    int i_149_ = anInt9551 + aClass105_1470.method2654() - anInt9581;
	    int i_150_ = anInt9574 - anInt9512;
	    int i_151_ = anInt9581 - anInt9538;
	    if (i_150_ < 0)
		i_150_ = 0;
	    if (i_151_ < 0)
		i_151_ = 0;
	    OpenGL.glScissor(i, i_149_, i_150_, i_151_);
	}
    }
    
    void method15756() {
	if (aClass105_1470 != null) {
	    int i = anInt9550 + anInt9512;
	    int i_152_ = anInt9551 + aClass105_1470.method2654() - anInt9581;
	    int i_153_ = anInt9574 - anInt9512;
	    int i_154_ = anInt9581 - anInt9538;
	    if (i_153_ < 0)
		i_153_ = 0;
	    if (i_154_ < 0)
		i_154_ = 0;
	    OpenGL.glScissor(i, i_152_, i_153_, i_154_);
	}
    }
    
    void method15839() {
	if (aClass105_1470 != null) {
	    int i = anInt9550 + anInt9512;
	    int i_155_ = anInt9551 + aClass105_1470.method2654() - anInt9581;
	    int i_156_ = anInt9574 - anInt9512;
	    int i_157_ = anInt9581 - anInt9538;
	    if (i_156_ < 0)
		i_156_ = 0;
	    if (i_157_ < 0)
		i_157_ = 0;
	    OpenGL.glScissor(i, i_155_, i_156_, i_157_);
	}
    }
    
    Interface30 method15915(int i, boolean bool, int[][] is) {
	return new Class226_Sub1(this, i, bool, is);
    }
    
    void method16024() {
	OpenGL.glDepthMask(aBool9552 && aBool9553);
    }
    
    public void method15768(Class268 class268) {
	float[] fs = class268.aFloatArray4353;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    public final void method15623(Class310 class310, int i, int i_158_) {
	int i_159_;
	int i_160_;
	if (class310 == Class310.aClass310_4821) {
	    i_159_ = 1;
	    i_160_ = i_158_ * 2;
	} else if (class310 == Class310.aClass310_4819) {
	    i_159_ = 3;
	    i_160_ = i_158_ + 1;
	} else if (class310 == Class310.aClass310_4822) {
	    i_159_ = 4;
	    i_160_ = i_158_ * 3;
	} else if (class310 == Class310.aClass310_4823) {
	    i_159_ = 6;
	    i_160_ = i_158_ + 2;
	} else if (class310 == Class310.aClass310_4824) {
	    i_159_ = 5;
	    i_160_ = i_158_ + 2;
	} else {
	    i_159_ = 0;
	    i_160_ = i_158_;
	}
	OpenGL.glDrawArrays(i_159_, i, i_160_);
    }
    
    final synchronized void method17557(long l) {
	Node class241 = new Node();
	class241.hashCode = l * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11159.addNode(class241,
							       (short) -23394);
    }
    
    void method15876() {
	if (aBool9562)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    void method15739() {
	if (aBool9562)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    void method15737() {
	if (aBool9562)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    void method15676() {
	OpenGL.glDepthMask(aBool9552 && aBool9553);
    }
    
    void method15718(Interface33 interface33) {
	((Class103_Sub3_Sub2) this).aClass232_Sub1_11151
	    = (Class232_Sub1) interface33;
	((Class103_Sub3_Sub2) this).aClass232_Sub1_11151.method4679();
    }
    
    void method15879() {
	OpenGL.glDepthMask(aBool9552 && aBool9553);
    }
    
    public void method15859(Class268 class268) {
	float[] fs = class268.aFloatArray4353;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    void method15663() {
	OpenGL.glDepthMask(aBool9552 && aBool9553);
    }
    
    void method15732() {
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = aFloat9609 * aFloat9563;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = aFloat9609 * aFloat9564;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = aFloat9609 * aFloat9556;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609,
			 ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = -aFloat9568 * aFloat9563;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = -aFloat9568 * aFloat9564;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = -aFloat9568 * aFloat9556;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609,
			 ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
    }
    
    void method15735() {
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = aFloat9609 * aFloat9563;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = aFloat9609 * aFloat9564;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = aFloat9609 * aFloat9556;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609,
			 ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = -aFloat9568 * aFloat9563;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = -aFloat9568 * aFloat9564;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = -aFloat9568 * aFloat9556;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609,
			 ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
    }
    
    void method15887() {
	/* empty */
    }
    
    final synchronized void method17558(int i) {
	Node class241 = new Node();
	class241.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11142.addNode(class241,
							       (short) -9392);
    }
    
    void method15805() {
	if (aBool9492) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    static int method17559(Class175 class175, Class102 class102) {
	if (class102 == Class102.aClass102_1440) {
	    switch (class175.anInt2120 * 493238459) {
	    default:
		throw new IllegalArgumentException();
	    case 7:
		return 6410;
	    case 0:
		return 33777;
	    case 6:
		return 6409;
	    case 9:
		return 6407;
	    case 3:
		return 6406;
	    case 2:
		return 6408;
	    case 1:
		return 33779;
	    }
	}
	if (class102 == Class102.aClass102_1441) {
	    switch (class175.anInt2120 * 493238459) {
	    case 6:
		return 32834;
	    case 7:
		return 36219;
	    default:
		throw new IllegalArgumentException();
	    case 5:
		return 33189;
	    case 2:
		return 32859;
	    case 3:
		return 32830;
	    case 9:
		return 32852;
	    }
	}
	if (class102 == Class102.aClass102_1437) {
	    switch (class175.anInt2120 * 493238459) {
	    default:
		throw new IllegalArgumentException();
	    case 5:
		return 33190;
	    }
	}
	if (class102 == Class102.aClass102_1444) {
	    switch (class175.anInt2120 * 493238459) {
	    case 9:
		return 34843;
	    case 6:
		return 34846;
	    case 2:
		return 34842;
	    default:
		throw new IllegalArgumentException();
	    case 7:
		return 34847;
	    case 3:
		return 34844;
	    }
	}
	if (class102 == Class102.aClass102_1443) {
	    switch (class175.anInt2120 * 493238459) {
	    case 9:
		return 34837;
	    default:
		throw new IllegalArgumentException();
	    case 3:
		return 34838;
	    case 7:
		return 34841;
	    case 6:
		return 34840;
	    case 2:
		return 34836;
	    }
	}
	throw new IllegalArgumentException();
    }
    
    void method15791() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass268_9504.aFloatArray4353, 0);
	int i;
	for (i = 0; i < anInt9524; i++) {
	    Class241_Sub43 class241_sub43 = aClass241_Sub43Array9569[i];
	    int i_161_ = class241_sub43.method16461(-2141167231);
	    int i_162_ = 16386 + i;
	    float f = class241_sub43.method16458(919356355) / 255.0F;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[0]
		= (float) class241_sub43.method16453((byte) -46);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[1]
		= (float) class241_sub43.method16454(-1874096036);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[2]
		= (float) class241_sub43.method16455(626523592);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	    OpenGL.glLightfv(i_162_, 4611,
			     ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[0]
		= (float) (i_161_ >> 16 & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[1]
		= (float) (i_161_ >> 8 & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[2]
		= (float) (i_161_ & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	    OpenGL.glLightfv(i_162_, 4609,
			     ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	    OpenGL.glLightf(i_162_, 4617,
			    (1.0F
			     / (float) (class241_sub43.method16468(1143403757)
					* class241_sub43
					      .method16468(1143403757))));
	    OpenGL.glEnable(i_162_);
	}
	for (/**/; i < anInt9570; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    byte[] method17560(String string) {
	return method15608("gl", string);
    }
    
    void method15896() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass268_9504.aFloatArray4353, 0);
	int i;
	for (i = 0; i < anInt9524; i++) {
	    Class241_Sub43 class241_sub43 = aClass241_Sub43Array9569[i];
	    int i_163_ = class241_sub43.method16461(1468639788);
	    int i_164_ = 16386 + i;
	    float f = class241_sub43.method16458(145957083) / 255.0F;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[0]
		= (float) class241_sub43.method16453((byte) -76);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[1]
		= (float) class241_sub43.method16454(-1874096036);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[2]
		= (float) class241_sub43.method16455(626523592);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	    OpenGL.glLightfv(i_164_, 4611,
			     ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[0]
		= (float) (i_163_ >> 16 & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[1]
		= (float) (i_163_ >> 8 & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[2]
		= (float) (i_163_ & 0xff) * f;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	    OpenGL.glLightfv(i_164_, 4609,
			     ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
	    OpenGL.glLightf(i_164_, 4617,
			    (1.0F
			     / (float) (class241_sub43.method16468(1143403757)
					* class241_sub43
					      .method16468(1143403757))));
	    OpenGL.glEnable(i_164_);
	}
	for (/**/; i < anInt9570; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    boolean method15881(Class175 class175, Class102 class102) {
	return true;
    }
    
    boolean method15765(Class175 class175, Class102 class102) {
	return true;
    }
    
    boolean method15804(Class175 class175, Class102 class102) {
	return aBool9636;
    }
    
    boolean method15838(Class175 class175, Class102 class102) {
	return aBool9636;
    }
    
    Interface41 method15905(Class175 class175, Class102 class102, int i,
			    int i_165_) {
	return method15684(class175, class102, i, i_165_);
    }
    
    Interface41 method15906(Class175 class175, Class102 class102, int i,
			    int i_166_) {
	return method15684(class175, class102, i, i_166_);
    }
    
    Class105_Sub1 method2374(Canvas canvas, int i, int i_167_) {
	return new Class105_Sub1_Sub1_Sub1(this, canvas);
    }
    
    void method15964() {
	OpenGL.glMatrixMode(5890);
	if (aClass387Array9579[anInt9580] != Class387.aClass387_5710)
	    OpenGL.glLoadMatrixf
		(aClass268Array9578[anInt9580]
		     .method5233(((Class103_Sub3_Sub2) this).aFloatArray11168),
		 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    Interface41 method15690(Class175 class175, int i, int i_168_, boolean bool,
			    float[] fs, int i_169_, int i_170_) {
	return new Class226_Sub3(this, class175, i, i_168_, bool, fs, i_169_,
				 i_170_);
    }
    
    Interface41 method15665(Class175 class175, int i, int i_171_, boolean bool,
			    float[] fs, int i_172_, int i_173_) {
	return new Class226_Sub3(this, class175, i, i_171_, bool, fs, i_172_,
				 i_173_);
    }
    
    Interface41 method15909(Class175 class175, int i, int i_174_, boolean bool,
			    float[] fs, int i_175_, int i_176_) {
	return new Class226_Sub3(this, class175, i, i_174_, bool, fs, i_175_,
				 i_176_);
    }
    
    Interface41 method15771(int i, int i_177_, boolean bool, int[] is,
			    int i_178_, int i_179_) {
	return new Class226_Sub3(this, i, i_177_, bool, is, i_178_, i_179_);
    }
    
    void method15885() {
	OpenGL.glDepthFunc(515);
	OpenGL.glEnable(2884);
	OpenGL.glCullFace(1029);
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9634) {
	    method15713(anInt9623 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9647 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_180_ = 16384 + i;
	    OpenGL.glLightfv(i_180_, 4608, fs, 0);
	    OpenGL.glLightf(i_180_, 4615, 0.0F);
	    OpenGL.glLightf(i_180_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	((Class103_Sub3_Sub2) this).anOpenGL11138.setSwapInterval(0);
	super.method15885();
    }
    
    Interface41 method15911(int i, int i_181_, boolean bool, int[] is,
			    int i_182_, int i_183_) {
	return new Class226_Sub3(this, i, i_181_, bool, is, i_182_, i_183_);
    }
    
    Interface30 method15912(int i, boolean bool, int[][] is) {
	return new Class226_Sub1(this, i, bool, is);
    }
    
    Interface30 method15913(int i, boolean bool, int[][] is) {
	return new Class226_Sub1(this, i, bool, is);
    }
    
    Interface30 method15914(int i, boolean bool, int[][] is) {
	return new Class226_Sub1(this, i, bool, is);
    }
    
    void method15963() {
	OpenGL.glMatrixMode(5890);
	if (aClass387Array9579[anInt9580] != Class387.aClass387_5710)
	    OpenGL.glLoadMatrixf
		(aClass268Array9578[anInt9580]
		     .method5233(((Class103_Sub3_Sub2) this).aFloatArray11168),
		 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    Interface38 method15747(Class175 class175, int i, int i_184_, int i_185_,
			    boolean bool, byte[] is) {
	return new Class226_Sub2(this, class175, i, i_184_, i_185_, bool, is);
    }
    
    void method15972() {
	OpenGL.glTexEnvi(8960, 34162,
			 method17564(aClass305Array9573[anInt9580]));
    }
    
    public void method15833(Class268 class268, Class268 class268_186_,
			    Class268 class268_187_) {
	OpenGL.glMatrixMode(5888);
	aClass268_9511.method5201(class268, class268_186_);
	OpenGL.glLoadMatrixf(aClass268_9511.aFloatArray4353, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class268_187_.aFloatArray4353, 0);
    }
    
    void method15815(int i) {
	if (!((Class103_Sub3_Sub2) this).aBool11141)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    void method15738() {
	OpenGL.glActiveTexture(33984 + anInt9580);
    }
    
    void method15968() {
	OpenGL.glTexEnvi(8960, 34161,
			 method17564(aClass305Array9541[anInt9580]));
    }
    
    Interface43 method15922(Class175 class175, Class102 class102, int i,
			    int i_188_) {
	return new Class226_Sub3(this, class175, class102, i, i_188_);
    }
    
    public void method15967() {
	int i = ((Class103_Sub3_Sub2) this).anIntArray11152[anInt9580];
	if (i != 0) {
	    ((Class103_Sub3_Sub2) this).anIntArray11152[anInt9580] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    public void method15795() {
	int i = ((Class103_Sub3_Sub2) this).anIntArray11152[anInt9580];
	if (i != 0) {
	    ((Class103_Sub3_Sub2) this).anIntArray11152[anInt9580] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    public void method15932() {
	int i = ((Class103_Sub3_Sub2) this).anIntArray11152[anInt9580];
	if (i != 0) {
	    ((Class103_Sub3_Sub2) this).anIntArray11152[anInt9580] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    final void method15937(int i, Class306 class306, boolean bool,
			   boolean bool_189_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method17548(class306));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_189_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_189_ ? 769 : 768);
    }
    
    public Interface5 method2621(int i, int i_190_) {
	return new Class229(this, Class175.aClass175_2115,
			    Class102.aClass102_1437, i, i_190_);
    }
    
    final void method15836(int i, Class306 class306, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method17548(class306));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    final void method15942(int i, Class306 class306, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method17548(class306));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    public void method15652(Class268 class268) {
	float[] fs = class268.aFloatArray4353;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    final void method15944(int i, Class306 class306, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method17548(class306));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    public Class88 method2489(Class88 class88, Class88 class88_191_, float f,
			      Class88 class88_192_) {
	return f < 0.5F ? class88 : class88_191_;
    }
    
    final void method15961() {
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = (float) (anInt9582 & 0xff0000) / 1.671168E7F;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = (float) (anInt9582 & 0xff00) / 65280.0F;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = (float) (anInt9582 & 0xff) / 255.0F;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3]
	    = (float) (anInt9582 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705,
			  ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
    }
    
    void method15916() {
	OpenGL.glMatrixMode(5890);
	if (aClass387Array9579[anInt9580] != Class387.aClass387_5710)
	    OpenGL.glLoadMatrixf
		(aClass268Array9578[anInt9580]
		     .method5233(((Class103_Sub3_Sub2) this).aFloatArray11168),
		 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    final synchronized void method17561(int i, int i_193_) {
	IntegerNode class241_sub22 = new IntegerNode(i_193_);
	class241_sub22.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11158.addNode(class241_sub22,
							       (short) -18657);
    }
    
    void method2221() {
	super.method2221();
	if (((Class103_Sub3_Sub2) this).anOpenGL11138 != null) {
	    ((Class103_Sub3_Sub2) this).anOpenGL11138.method3498();
	    ((Class103_Sub3_Sub2) this).anOpenGL11138.release();
	    ((Class103_Sub3_Sub2) this).anOpenGL11138 = null;
	}
    }
    
    final void method15757(Interface33 interface33, Class310 class310, int i,
			   int i_194_, int i_195_, int i_196_) {
	int i_197_;
	int i_198_;
	if (class310 == Class310.aClass310_4821) {
	    i_197_ = 1;
	    i_198_ = i_196_ * 2;
	} else if (class310 == Class310.aClass310_4819) {
	    i_197_ = 3;
	    i_198_ = i_196_ + 1;
	} else if (class310 == Class310.aClass310_4822) {
	    i_197_ = 4;
	    i_198_ = i_196_ * 3;
	} else if (class310 == Class310.aClass310_4823) {
	    i_197_ = 6;
	    i_198_ = i_196_ + 2;
	} else if (class310 == Class310.aClass310_4824) {
	    i_197_ = 5;
	    i_198_ = i_196_ + 2;
	} else {
	    i_197_ = 0;
	    i_198_ = i_196_;
	}
	Class102 class102 = interface33.method186();
	Class232_Sub1 class232_sub1 = (Class232_Sub1) interface33;
	class232_sub1.method4679();
	OpenGL.glDrawElements(i_197_, i_198_, method17553(class102),
			      (class232_sub1.method4674()
			       + (long) (i_195_ * (class102.anInt1447
						   * -387243519))));
    }
    
    void method15966() {
	OpenGL.glActiveTexture(33984 + anInt9580);
    }
    
    void method15671() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass268_9504.aFloatArray4353, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9558, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9559, 0);
    }
    
    Interface43 method15919(Class175 class175, Class102 class102, int i,
			    int i_199_) {
	return new Class226_Sub3(this, class175, class102, i, i_199_);
    }
    
    public int[] method2378(int i, int i_200_, int i_201_, int i_202_) {
	int[] is = new int[i_201_ * i_202_];
	int i_203_ = aClass105_1470.method2654();
	for (int i_204_ = 0; i_204_ < i_202_; i_204_++)
	    OpenGL.glReadPixelsi(i, i_203_ - i_200_ - i_204_ - 1, i_201_, 1,
				 32993, ((Class103_Sub3_Sub2) this).anInt11165,
				 is, i_204_ * i_201_);
	return is;
    }
    
    void method15970() {
	OpenGL.glTexEnvi(8960, 34162,
			 method17564(aClass305Array9573[anInt9580]));
    }
    
    void method15669() {
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = aFloat9566 * aFloat9563;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = aFloat9566 * aFloat9564;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = aFloat9566 * aFloat9556;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	OpenGL.glLightModelfv(2899,
			      ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
    }
    
    void method15971() {
	OpenGL.glTexEnvi(8960, 34162,
			 method17564(aClass305Array9573[anInt9580]));
    }
    
    void method15734() {
	OpenGL.glTexEnvi(8960, 34162,
			 method17564(aClass305Array9573[anInt9580]));
    }
    
    Interface41 method15908(Class175 class175, Class102 class102, int i,
			    int i_205_) {
	return method15684(class175, class102, i, i_205_);
    }
    
    void method15927(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    void method15979(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    public String method2284() {
	String string = "Caps: 4:";
	String string_206_ = ":";
	string = new StringBuilder().append(string).append(anInt9623).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).anInt11165).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append(anInt9647).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append(anInt9630).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11161 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9634 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11162 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11164 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11143 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11163 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9636 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11139 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9635 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11160 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9549 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9632 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9622 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9638 ? 1 : 0).append
		     (string_206_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    void method15981() {
	if (aBool9621)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9577 & 0xff) / 255.0F);
	if (anInt9623 > 1) {
	    if (aByte9577 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    void method15982() {
	if (aBool9621)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9577 & 0xff) / 255.0F);
	if (anInt9623 > 1) {
	    if (aByte9577 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    void method15983() {
	if (aBool9621)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9577 & 0xff) / 255.0F);
	if (anInt9623 > 1) {
	    if (aByte9577 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    void method15984() {
	if (aBool9621)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9577 & 0xff) / 255.0F);
	if (anInt9623 > 1) {
	    if (aByte9577 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    void method15888() {
	if (aBool9492) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    void method15985() {
	if (aBool9620)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method16009(Interface33 interface33) {
	((Class103_Sub3_Sub2) this).aClass232_Sub1_11151
	    = (Class232_Sub1) interface33;
	((Class103_Sub3_Sub2) this).aClass232_Sub1_11151.method4679();
    }
    
    void method15824() {
	if (aBool9620)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method15843() {
	if (aBool9620)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method15992() {
	aFloat9616 = aFloat9537 - (float) anInt9614;
	aFloat9615 = aFloat9616 - (float) anInt9613;
	if (aFloat9615 < aFloat9596)
	    aFloat9615 = aFloat9596;
	if (aBool9488) {
	    OpenGL.glFogf(2915, aFloat9615);
	    OpenGL.glFogf(2916, aFloat9616);
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[0]
		= (float) (anInt9589 & 0xff0000) / 1.671168E7F;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[1]
		= (float) (anInt9589 & 0xff00) / 65280.0F;
	    ((Class103_Sub3_Sub2) this).aFloatArray11167[2]
		= (float) (anInt9589 & 0xff) / 255.0F;
	    OpenGL.glFogfv(2918, ((Class103_Sub3_Sub2) this).aFloatArray11167,
			   0);
	}
    }
    
    void method15817() {
	if (aBool9611 && aBool9576 && anInt9613 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    void method15994() {
	if (aBool9611 && aBool9576 && anInt9613 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    public int[] method2251(int i, int i_207_, int i_208_, int i_209_) {
	int[] is = new int[i_208_ * i_209_];
	int i_210_ = aClass105_1470.method2654();
	for (int i_211_ = 0; i_211_ < i_209_; i_211_++)
	    OpenGL.glReadPixelsi(i, i_210_ - i_207_ - i_211_ - 1, i_208_, 1,
				 32993, ((Class103_Sub3_Sub2) this).anInt11165,
				 is, i_211_ * i_208_);
	return is;
    }
    
    void method15861(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    final Interface33 method15900(boolean bool) {
	return new Class232_Sub1(this, Class102.aClass102_1441, bool);
    }
    
    public String method2562() {
	String string = "Caps: 4:";
	String string_212_ = ":";
	string = new StringBuilder().append(string).append(anInt9623).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).anInt11165).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append(anInt9647).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append(anInt9630).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11161 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9634 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11162 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11164 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11143 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11163 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9636 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11139 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9635 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub2) this).aBool11160 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9549 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9632 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9622 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9638 ? 1 : 0).append
		     (string_212_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    Interface41 method15910(int i, int i_213_, boolean bool, int[] is,
			    int i_214_, int i_215_) {
	return new Class226_Sub3(this, i, i_213_, bool, is, i_214_, i_215_);
    }
    
    Class366 method15656(Class314[] class314s) {
	return new Class366_Sub1(class314s);
    }
    
    Class366 method16000(Class314[] class314s) {
	return new Class366_Sub1(class314s);
    }
    
    public void method15860(Class366 class366) {
	Class314[] class314s = class366.aClass314Array5544;
	int i = 0;
	boolean bool = false;
	boolean bool_216_ = false;
	boolean bool_217_ = false;
	for (int i_218_ = 0; i_218_ < class314s.length; i_218_++) {
	    Class314 class314 = class314s[i_218_];
	    Class232_Sub2 class232_sub2
		= ((Class103_Sub3_Sub2) this).aClass232_Sub2Array11146[i_218_];
	    int i_219_ = 0;
	    int i_220_ = class232_sub2.method16830();
	    long l = class232_sub2.method4674();
	    class232_sub2.method4679();
	    for (int i_221_ = 0; i_221_ < class314.method5888(); i_221_++) {
		Class367 class367 = class314.method5890(i_221_);
		switch (class367.anInt5557) {
		case 6:
		    OpenGL.glVertexPointer(3, 5126, i_220_, l + (long) i_219_);
		    bool_217_ = true;
		    break;
		case 1:
		    OpenGL.glNormalPointer(5126, i_220_, l + (long) i_219_);
		    bool_216_ = true;
		    break;
		case 7:
		    OpenGL.glColorPointer(4, 5121, i_220_, l + (long) i_219_);
		    bool = true;
		    break;
		default:
		    break;
		case 11:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_220_,
					     l + (long) i_219_);
		    break;
		case 9:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_220_,
					     l + (long) i_219_);
		    break;
		case 5:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_220_,
					     l + (long) i_219_);
		    break;
		case 8:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_220_,
					     l + (long) i_219_);
		}
		i_219_ += class367.anInt5561;
	    }
	}
	if (((Class103_Sub3_Sub2) this).aBool11148 != bool_217_) {
	    if (bool_217_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    ((Class103_Sub3_Sub2) this).aBool11148 = bool_217_;
	}
	if (((Class103_Sub3_Sub2) this).aBool11153 != bool_216_) {
	    if (bool_216_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    ((Class103_Sub3_Sub2) this).aBool11153 = bool_216_;
	}
	if (((Class103_Sub3_Sub2) this).aBool11147 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    ((Class103_Sub3_Sub2) this).aBool11147 = bool;
	}
	if (((Class103_Sub3_Sub2) this).anInt11149 < i) {
	    for (int i_222_ = ((Class103_Sub3_Sub2) this).anInt11149;
		 i_222_ < i; i_222_++) {
		OpenGL.glClientActiveTexture(33984 + i_222_);
		OpenGL.glEnableClientState(32888);
	    }
	    ((Class103_Sub3_Sub2) this).anInt11149 = i;
	} else if (((Class103_Sub3_Sub2) this).anInt11149 > i) {
	    for (int i_223_ = i;
		 i_223_ < ((Class103_Sub3_Sub2) this).anInt11149; i_223_++) {
		OpenGL.glClientActiveTexture(33984 + i_223_);
		OpenGL.glDisableClientState(32888);
	    }
	    ((Class103_Sub3_Sub2) this).anInt11149 = i;
	}
    }
    
    final Interface33 method15785(boolean bool) {
	return new Class232_Sub1(this, Class102.aClass102_1441, bool);
    }
    
    public void method15751(int i, Interface40 interface40) {
	((Class103_Sub3_Sub2) this).aClass232_Sub2Array11146[i]
	    = (Class232_Sub2) interface40;
    }
    
    void method15969() {
	OpenGL.glTexEnvi(8960, 34161,
			 method17564(aClass305Array9541[anInt9580]));
    }
    
    void method16003(Interface33 interface33) {
	((Class103_Sub3_Sub2) this).aClass232_Sub1_11151
	    = (Class232_Sub1) interface33;
	((Class103_Sub3_Sub2) this).aClass232_Sub1_11151.method4679();
    }
    
    static int method17562(Class175 class175) {
	switch (class175.anInt2120 * 493238459) {
	case 3:
	    return 6406;
	case 5:
	    return 6402;
	default:
	    throw new IllegalStateException();
	case 2:
	    return 6408;
	case 6:
	    return 6409;
	case 9:
	    return 6407;
	case 7:
	    return 6410;
	}
    }
    
    public final void method16011(Class310 class310, int i, int i_224_) {
	int i_225_;
	int i_226_;
	if (class310 == Class310.aClass310_4821) {
	    i_225_ = 1;
	    i_226_ = i_224_ * 2;
	} else if (class310 == Class310.aClass310_4819) {
	    i_225_ = 3;
	    i_226_ = i_224_ + 1;
	} else if (class310 == Class310.aClass310_4822) {
	    i_225_ = 4;
	    i_226_ = i_224_ * 3;
	} else if (class310 == Class310.aClass310_4823) {
	    i_225_ = 6;
	    i_226_ = i_224_ + 2;
	} else if (class310 == Class310.aClass310_4824) {
	    i_225_ = 5;
	    i_226_ = i_224_ + 2;
	} else {
	    i_225_ = 0;
	    i_226_ = i_224_;
	}
	OpenGL.glDrawArrays(i_225_, i, i_226_);
    }
    
    public final void method16012(Class310 class310, int i, int i_227_) {
	int i_228_;
	int i_229_;
	if (class310 == Class310.aClass310_4821) {
	    i_228_ = 1;
	    i_229_ = i_227_ * 2;
	} else if (class310 == Class310.aClass310_4819) {
	    i_228_ = 3;
	    i_229_ = i_227_ + 1;
	} else if (class310 == Class310.aClass310_4822) {
	    i_228_ = 4;
	    i_229_ = i_227_ * 3;
	} else if (class310 == Class310.aClass310_4823) {
	    i_228_ = 6;
	    i_229_ = i_227_ + 2;
	} else if (class310 == Class310.aClass310_4824) {
	    i_228_ = 5;
	    i_229_ = i_227_ + 2;
	} else {
	    i_228_ = 0;
	    i_229_ = i_227_;
	}
	OpenGL.glDrawArrays(i_228_, i, i_229_);
    }
    
    final void method16013(Interface33 interface33, Class310 class310, int i,
			   int i_230_, int i_231_, int i_232_) {
	int i_233_;
	int i_234_;
	if (class310 == Class310.aClass310_4821) {
	    i_233_ = 1;
	    i_234_ = i_232_ * 2;
	} else if (class310 == Class310.aClass310_4819) {
	    i_233_ = 3;
	    i_234_ = i_232_ + 1;
	} else if (class310 == Class310.aClass310_4822) {
	    i_233_ = 4;
	    i_234_ = i_232_ * 3;
	} else if (class310 == Class310.aClass310_4823) {
	    i_233_ = 6;
	    i_234_ = i_232_ + 2;
	} else if (class310 == Class310.aClass310_4824) {
	    i_233_ = 5;
	    i_234_ = i_232_ + 2;
	} else {
	    i_233_ = 0;
	    i_234_ = i_232_;
	}
	Class102 class102 = interface33.method186();
	Class232_Sub1 class232_sub1 = (Class232_Sub1) interface33;
	class232_sub1.method4679();
	OpenGL.glDrawElements(i_233_, i_234_, method17553(class102),
			      (class232_sub1.method4674()
			       + (long) (i_231_ * (class102.anInt1447
						   * -387243519))));
    }
    
    public final void method15826(Class310 class310, int i, int i_235_,
				  int i_236_, int i_237_) {
	int i_238_;
	int i_239_;
	if (class310 == Class310.aClass310_4821) {
	    i_238_ = 1;
	    i_239_ = i_237_ * 2;
	} else if (class310 == Class310.aClass310_4819) {
	    i_238_ = 3;
	    i_239_ = i_237_ + 1;
	} else if (class310 == Class310.aClass310_4822) {
	    i_238_ = 4;
	    i_239_ = i_237_ * 3;
	} else if (class310 == Class310.aClass310_4823) {
	    i_238_ = 6;
	    i_239_ = i_237_ + 2;
	} else if (class310 == Class310.aClass310_4824) {
	    i_238_ = 5;
	    i_239_ = i_237_ + 2;
	} else {
	    i_238_ = 0;
	    i_239_ = i_237_;
	}
	Class102 class102
	    = ((Class103_Sub3_Sub2) this).aClass232_Sub1_11151.method186();
	OpenGL.glDrawElements(i_238_, i_239_, method17553(class102),
			      (((Class103_Sub3_Sub2) this)
				   .aClass232_Sub1_11151.method4674()
			       + (long) (i_236_ * (class102.anInt1447
						   * -387243519))));
    }
    
    void method15832(int i) {
	if (!((Class103_Sub3_Sub2) this).aBool11141)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    void method16016(int i) {
	if (!((Class103_Sub3_Sub2) this).aBool11141)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    void method2630(int i, int i_240_) throws Exception_Sub2 {
	aClass105_Sub1_1452.method15434();
	if (anInterface6_1457 != null)
	    anInterface6_1457.method34(-602503007);
    }
    
    void method2421(int i, int i_241_) throws Exception_Sub2 {
	aClass105_Sub1_1452.method15434();
	if (anInterface6_1457 != null)
	    anInterface6_1457.method34(-602503007);
    }
    
    void method16019() {
	((Class103_Sub3_Sub2) this).aFloatArray11167[0]
	    = aFloat9566 * aFloat9563;
	((Class103_Sub3_Sub2) this).aFloatArray11167[1]
	    = aFloat9566 * aFloat9564;
	((Class103_Sub3_Sub2) this).aFloatArray11167[2]
	    = aFloat9566 * aFloat9556;
	((Class103_Sub3_Sub2) this).aFloatArray11167[3] = 1.0F;
	OpenGL.glLightModelfv(2899,
			      ((Class103_Sub3_Sub2) this).aFloatArray11167, 0);
    }
    
    void method17563() {
	int i = 0;
	while (!((Class103_Sub3_Sub2) this).anOpenGL11138.method3497()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class380_Sub2.method16722(1000L);
	}
    }
    
    void method16021() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass268_9504.aFloatArray4353, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9558, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9559, 0);
    }
    
    void method16022() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass268_9504.aFloatArray4353, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9558, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9559, 0);
    }
    
    Class105_Sub1 method2246(Canvas canvas, int i, int i_242_) {
	return new Class105_Sub1_Sub1_Sub1(this, canvas);
    }
    
    Interface41 method15811(Class175 class175, int i, int i_243_, boolean bool,
			    byte[] is, int i_244_, int i_245_) {
	return new Class226_Sub3(this, class175, i, i_243_, bool, is, i_244_,
				 i_245_);
    }
    
    final Interface40 method16025(boolean bool) {
	return new Class232_Sub2(this, bool);
    }
    
    static final int method17564(Class305 class305) {
	if (class305 == Class305.aClass305_4802)
	    return 7681;
	if (class305 == Class305.aClass305_4801)
	    return 8448;
	if (class305 == Class305.aClass305_4804)
	    return 34165;
	if (class305 == Class305.aClass305_4800)
	    return 260;
	if (class305 == Class305.aClass305_4803)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    byte[] method17565(String string) {
	return method15608("gl", string);
    }
    
    void method16026() {
	OpenGL.glDepthFunc(515);
	OpenGL.glEnable(2884);
	OpenGL.glCullFace(1029);
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9634) {
	    method15713(anInt9623 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9647 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_246_ = 16384 + i;
	    OpenGL.glLightfv(i_246_, 4608, fs, 0);
	    OpenGL.glLightf(i_246_, 4615, 0.0F);
	    OpenGL.glLightf(i_246_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	((Class103_Sub3_Sub2) this).anOpenGL11138.setSwapInterval(0);
	super.method15885();
    }
    
    void method15741() {
	OpenGL.glDepthFunc(515);
	OpenGL.glEnable(2884);
	OpenGL.glCullFace(1029);
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9634) {
	    method15713(anInt9623 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9647 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_247_ = 16384 + i;
	    OpenGL.glLightfv(i_247_, 4608, fs, 0);
	    OpenGL.glLightf(i_247_, 4615, 0.0F);
	    OpenGL.glLightf(i_247_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	((Class103_Sub3_Sub2) this).anOpenGL11138.setSwapInterval(0);
	super.method15885();
    }
    
    void method16027() {
	OpenGL.glDepthFunc(515);
	OpenGL.glEnable(2884);
	OpenGL.glCullFace(1029);
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9634) {
	    method15713(anInt9623 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9647 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_248_ = 16384 + i;
	    OpenGL.glLightfv(i_248_, 4608, fs, 0);
	    OpenGL.glLightf(i_248_, 4615, 0.0F);
	    OpenGL.glLightf(i_248_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	((Class103_Sub3_Sub2) this).anOpenGL11138.setSwapInterval(0);
	super.method15885();
    }
    
    static final int method17566(Class305 class305) {
	if (class305 == Class305.aClass305_4802)
	    return 7681;
	if (class305 == Class305.aClass305_4801)
	    return 8448;
	if (class305 == Class305.aClass305_4804)
	    return 34165;
	if (class305 == Class305.aClass305_4800)
	    return 260;
	if (class305 == Class305.aClass305_4803)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    public boolean method15605() {
	return ((Class103_Sub3_Sub2) this).aBool11143;
    }
    
    static final int method17567(Class305 class305) {
	if (class305 == Class305.aClass305_4802)
	    return 7681;
	if (class305 == Class305.aClass305_4801)
	    return 8448;
	if (class305 == Class305.aClass305_4804)
	    return 34165;
	if (class305 == Class305.aClass305_4800)
	    return 260;
	if (class305 == Class305.aClass305_4803)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    static final int method17568(Class306 class306) {
	if (class306 == Class306.aClass306_4806)
	    return 5890;
	if (class306 == Class306.aClass306_4808)
	    return 34167;
	if (class306 == Class306.aClass306_4809)
	    return 34168;
	if (class306 == Class306.aClass306_4807)
	    return 34166;
	throw new IllegalArgumentException();
    }
    
    static final int method17569(Class306 class306) {
	if (class306 == Class306.aClass306_4806)
	    return 5890;
	if (class306 == Class306.aClass306_4808)
	    return 34167;
	if (class306 == Class306.aClass306_4809)
	    return 34168;
	if (class306 == Class306.aClass306_4807)
	    return 34166;
	throw new IllegalArgumentException();
    }
    
    static final int method17570(Class306 class306) {
	if (class306 == Class306.aClass306_4806)
	    return 5890;
	if (class306 == Class306.aClass306_4808)
	    return 34167;
	if (class306 == Class306.aClass306_4809)
	    return 34168;
	if (class306 == Class306.aClass306_4807)
	    return 34166;
	throw new IllegalArgumentException();
    }
    
    static int method17571(Class175 class175) {
	switch (class175.anInt2120 * 493238459) {
	case 3:
	    return 6406;
	case 5:
	    return 6402;
	default:
	    throw new IllegalStateException();
	case 2:
	    return 6408;
	case 6:
	    return 6409;
	case 9:
	    return 6407;
	case 7:
	    return 6410;
	}
    }
    
    final synchronized void method17572(int i, int i_249_) {
	IntegerNode class241_sub22 = new IntegerNode(i_249_);
	class241_sub22.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11158.addNode(class241_sub22,
							       (short) -24259);
    }
    
    final synchronized void method17573(int i) {
	IntegerNode class241_sub22 = new IntegerNode(i);
	((Class103_Sub3_Sub2) this).aClass429_11140.addNode(class241_sub22,
							       (short) -19183);
    }
    
    final synchronized void method17574(int i) {
	IntegerNode class241_sub22 = new IntegerNode(i);
	((Class103_Sub3_Sub2) this).aClass429_11140.addNode(class241_sub22,
							       (short) -19187);
    }
    
    final synchronized void method17575(int i) {
	IntegerNode class241_sub22 = new IntegerNode(i);
	((Class103_Sub3_Sub2) this).aClass429_11140.addNode(class241_sub22,
							       (short) -17185);
    }
    
    final synchronized void method17576(int i) {
	IntegerNode class241_sub22 = new IntegerNode(i);
	((Class103_Sub3_Sub2) this).aClass429_11140.addNode(class241_sub22,
							       (short) -6038);
    }
    
    final synchronized void method17577(int i, int i_250_) {
	IntegerNode class241_sub22 = new IntegerNode(i_250_);
	class241_sub22.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11150.addNode(class241_sub22,
							       (short) -4111);
    }
    
    final synchronized void method17578(int i, int i_251_) {
	IntegerNode class241_sub22 = new IntegerNode(i_251_);
	class241_sub22.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11150.addNode(class241_sub22,
							       (short) -10606);
    }
    
    final synchronized void method17579(int i, int i_252_) {
	IntegerNode class241_sub22 = new IntegerNode(i_252_);
	class241_sub22.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11150.addNode(class241_sub22,
							       (short) -9745);
    }
    
    Interface41 method15993(Class175 class175, int i, int i_253_, boolean bool,
			    byte[] is, int i_254_, int i_255_) {
	return new Class226_Sub3(this, class175, i, i_253_, bool, is, i_254_,
				 i_255_);
    }
    
    public Interface5 method2447(int i, int i_256_) {
	return new Class229(this, Class175.aClass175_2115,
			    Class102.aClass102_1437, i, i_256_);
    }
    
    final synchronized void method17580(long l) {
	Node class241 = new Node();
	class241.hashCode = l * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11159.addNode(class241,
							       (short) -4344);
    }
    
    boolean method15708(Class175 class175, Class102 class102) {
	return aBool9636;
    }
    
    final synchronized void method17581(int i) {
	Node class241 = new Node();
	class241.hashCode = (long) i * -84545867636262595L;
	((Class103_Sub3_Sub2) this).aClass429_11142.addNode(class241,
							       (short) -28047);
    }
    
    Interface41 method15682(int i, int i_257_, boolean bool, int[] is,
			    int i_258_, int i_259_) {
	return new Class226_Sub3(this, i, i_257_, bool, is, i_258_, i_259_);
    }
    
    public Interface4 method2568(int i, int i_260_, Class175 class175,
				 Class102 class102, int i_261_) {
	return new Class229(this, class175, class102, i, i_260_, i_261_);
    }
    
    static int method17582(Class175 class175) {
	switch (class175.anInt2120 * 493238459) {
	case 3:
	    return 6406;
	case 5:
	    return 6402;
	default:
	    throw new IllegalStateException();
	case 2:
	    return 6408;
	case 6:
	    return 6409;
	case 9:
	    return 6407;
	case 7:
	    return 6410;
	}
    }
    
    static int method17583(Class175 class175, Class102 class102) {
	if (class102 == Class102.aClass102_1440) {
	    switch (class175.anInt2120 * 493238459) {
	    default:
		throw new IllegalArgumentException();
	    case 7:
		return 6410;
	    case 0:
		return 33777;
	    case 6:
		return 6409;
	    case 9:
		return 6407;
	    case 3:
		return 6406;
	    case 2:
		return 6408;
	    case 1:
		return 33779;
	    }
	}
	if (class102 == Class102.aClass102_1441) {
	    switch (class175.anInt2120 * 493238459) {
	    case 6:
		return 32834;
	    case 7:
		return 36219;
	    default:
		throw new IllegalArgumentException();
	    case 5:
		return 33189;
	    case 2:
		return 32859;
	    case 3:
		return 32830;
	    case 9:
		return 32852;
	    }
	}
	if (class102 == Class102.aClass102_1437) {
	    switch (class175.anInt2120 * 493238459) {
	    default:
		throw new IllegalArgumentException();
	    case 5:
		return 33190;
	    }
	}
	if (class102 == Class102.aClass102_1444) {
	    switch (class175.anInt2120 * 493238459) {
	    case 9:
		return 34843;
	    case 6:
		return 34846;
	    case 2:
		return 34842;
	    default:
		throw new IllegalArgumentException();
	    case 7:
		return 34847;
	    case 3:
		return 34844;
	    }
	}
	if (class102 == Class102.aClass102_1443) {
	    switch (class175.anInt2120 * 493238459) {
	    case 9:
		return 34837;
	    default:
		throw new IllegalArgumentException();
	    case 3:
		return 34838;
	    case 7:
		return 34841;
	    case 6:
		return 34840;
	    case 2:
		return 34836;
	    }
	}
	throw new IllegalArgumentException();
    }
    
    void method17584() {
	int i = 0;
	while (!((Class103_Sub3_Sub2) this).anOpenGL11138.method3497()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class380_Sub2.method16722(1000L);
	}
    }
    
    public void method2450(int i, int i_262_) {
	int i_263_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_262_ & 0xff0000) / 1.671168E7F,
				(float) (i_262_ & 0xff00) / 65280.0F,
				(float) (i_262_ & 0xff) / 255.0F,
				(float) (i_262_ >>> 24) / 255.0F);
	    i_263_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method15701(true);
	    i_263_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_263_ |= 0x400;
	OpenGL.glClear(i_263_);
    }
}
