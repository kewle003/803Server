/* Class103_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;

public class Class103_Sub3_Sub1 extends Class103_Sub3
{
    Class268 aClass268_11079;
    int anInt11080;
    long aLong11081 = 0L;
    int anInt11082;
    D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11083;
    boolean aBool11084;
    boolean aBool11085;
    long aLong11086;
    long aLong11087;
    long aLong11088;
    boolean aBool11089;
    boolean[] aBoolArray11090;
    boolean[] aBoolArray11091;
    boolean[] aBoolArray11092;
    boolean[] aBoolArray11093;
    Class312[] aClass312Array11094;
    int[] anIntArray11095;
    Class55_Sub1 aClass55_Sub1_11096;
    long aLong11097 = 0L;
    boolean aBool11098;
    D3DCAPS aD3DCAPS11099;
    boolean aBool11100;
    boolean aBool11101;
    boolean aBool11102;
    int anInt11103;
    boolean aBool11104;
    float[] aFloatArray11105;
    boolean aBool11106;
    long aLong11107;
    static int[] anIntArray11108 = { 77, 80 };
    int anInt11109;
    boolean aBool11110;
    long[] aLongArray11111;
    NodeCollection aClass429_11112 = new NodeCollection();
    static int[] anIntArray11113 = { 22, 23 };
    
    void method15737() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 7,
				    aBool9562);
    }
    
    public boolean method15606() {
	return ((((Class103_Sub3_Sub1) this).aD3DCAPS11099.PixelShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    static Class103 method17456(Canvas canvas, Class107 class107,
				Interface6 interface6, JS5 class210,
				Integer integer) {
	Class103_Sub3_Sub1 class103_sub3_sub1 = null;
	Class103_Sub3_Sub1 class103_sub3_sub1_0_;
	try {
	    int i = 0;
	    int i_1_ = 1;
	    long l = IDirect3D.Direct3DCreate();
	    D3DCAPS d3dcaps = new D3DCAPS();
	    IDirect3D.GetDeviceCaps(l, i, i_1_, d3dcaps);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x8) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x40) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
	    d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
	    d3dpresent_parameters.BackBufferCount = 1;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    if (!method17474(i, i_1_, l, integer.intValue(),
			     d3dpresent_parameters))
		throw new RuntimeException("");
	    int i_2_ = 0;
	    if ((d3dcaps.DevCaps & 0x100000) != 0)
		i_2_ |= 0x10;
	    long l_3_ = 0L;
	    try {
		l_3_ = IDirect3D.CreateDeviceContext(l, i, i_1_, canvas,
						     i_2_ | 0x40,
						     d3dpresent_parameters);
	    } catch (RuntimeException_Sub1 runtimeexception_sub1) {
		l_3_ = IDirect3D.CreateDeviceContext(l, i, i_1_, canvas,
						     i_2_ & ~0x100000 | 0x20,
						     d3dpresent_parameters);
	    }
	    class103_sub3_sub1
		= new Class103_Sub3_Sub1(i, i_1_, l, l_3_,
					 d3dpresent_parameters, d3dcaps,
					 class107, interface6, class210,
					 integer.intValue());
	    if (!class103_sub3_sub1.aHashtable1472.containsKey(canvas)) {
		Class540.method11932(canvas, -1944253770);
		class103_sub3_sub1.method2240
		    (canvas,
		     new Class105_Sub1_Sub1_Sub2(class103_sub3_sub1, canvas,
						 canvas.getWidth(),
						 canvas.getHeight(), true),
		     1455428848);
	    }
	    class103_sub3_sub1.method2242(canvas, 1269259148);
	    class103_sub3_sub1.method15712();
	    class103_sub3_sub1_0_ = class103_sub3_sub1;
	} catch (RuntimeException runtimeexception) {
	    if (class103_sub3_sub1 != null)
		class103_sub3_sub1.method2221();
	    throw runtimeexception;
	}
	return class103_sub3_sub1_0_;
    }
    
    void method15718(Interface33 interface33) {
	IDirect3DDevice.SetIndices(((Class103_Sub3_Sub1) this).aLong11097,
				   (((Class255) (Class255) interface33)
				    .aLong4140));
    }
    
    void method15616() {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(973025738)) {
	    Interface25 interface25
		= (Interface25) class241_sub26.objectValue;
	    interface25.method163();
	    if (interface25 == aClass105_1470)
		interface25.method162();
	}
	super.method15616();
    }
    
    void method15844() {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(49558958)) {
	    Interface25 interface25
		= (Interface25) class241_sub26.objectValue;
	    interface25.method28();
	}
	super.method15844();
    }
    
    boolean method17457(int i, int i_4_) {
	int i_5_
	    = IDirect3DDevice.TestCooperativeLevel(((Class103_Sub3_Sub1) this)
						   .aLong11097);
	if (i_5_ == 0 || i_5_ == -2005530519) {
	    IDirect3DDevice.SetDepthStencilSurface((((Class103_Sub3_Sub1) this)
						    .aLong11097),
						   0L);
	    for (int i_6_ = 1; i_6_ < 4; i_6_++)
		IDirect3DDevice.SetRenderTarget((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						i_6_, 0L);
	    for (int i_7_ = 0; i_7_ < 4; i_7_++)
		IDirect3DDevice.SetStreamSource((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						i_7_, 0L, 0, 0);
	    for (int i_8_ = 0; i_8_ < 4; i_8_++)
		IDirect3DDevice.SetTexture((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   i_8_, 0L);
	    IDirect3DDevice.SetIndices(((Class103_Sub3_Sub1) this).aLong11097,
				       0L);
	    method15844();
	    ((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
		.BackBufferWidth
		= i;
	    ((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
		.BackBufferHeight
		= i_4_;
	    ((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
		.BackBufferCount
		= 1;
	    if (method17474(((Class103_Sub3_Sub1) this).anInt11082,
			    ((Class103_Sub3_Sub1) this).anInt11080,
			    ((Class103_Sub3_Sub1) this).aLong11081, anInt9623,
			    (((Class103_Sub3_Sub1) this)
			     .aD3DPRESENT_PARAMETERS11083))) {
		int i_9_
		    = IDirect3DDevice.Reset((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    (((Class103_Sub3_Sub1) this)
					     .aD3DPRESENT_PARAMETERS11083));
		if (Class28.method958(i_9_)) {
		    ((Class103_Sub3_Sub1) this).aBool11085 = false;
		    method15616();
		    method15885();
		    return true;
		}
	    }
	}
	return false;
    }
    
    final void method15693(int i, Class306 class306, boolean bool) {
	if (aBool9488) {
	    int i_10_ = 0;
	    int i_11_;
	    switch (i) {
	    case 2:
		i_11_ = 27;
		break;
	    case 1:
		i_11_ = 6;
		break;
	    default:
		i_11_ = 5;
	    }
	    if (bool)
		i_10_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, i_11_,
						 (method17489(class306)
						  | i_10_));
	}
    }
    
    public Class174 method2623() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(((Class103_Sub3_Sub1) this).aLong11081,
				       ((Class103_Sub3_Sub1) this).anInt11082,
				       0, d3dadapter_identifier);
	return new Class174(d3dadapter_identifier.VendorID,
			    method15607() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion,
			    method15607());
    }
    
    public void method2406(int i, int i_12_) {
	IDirect3DDevice.Clear(((Class103_Sub3_Sub1) this).aLong11097, i, i_12_,
			      1.0F, 0);
    }
    
    public void method2436() {
	long l = IDirect3DDevice
		     .CreateEventQuery(((Class103_Sub3_Sub1) this).aLong11097);
	if (Class28.method958(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    void method2221() {
	super.method2221();
	if (((Class103_Sub3_Sub1) this).aLong11086 != 0L) {
	    D3DLIGHT.Destroy(((Class103_Sub3_Sub1) this).aLong11086);
	    ((Class103_Sub3_Sub1) this).aLong11086 = 0L;
	}
	if (((Class103_Sub3_Sub1) this).aLong11087 != 0L) {
	    D3DLIGHT.Destroy(((Class103_Sub3_Sub1) this).aLong11087);
	    ((Class103_Sub3_Sub1) this).aLong11087 = 0L;
	}
	if (((Class103_Sub3_Sub1) this).aLong11088 != 0L) {
	    D3DLIGHT.Destroy(((Class103_Sub3_Sub1) this).aLong11088);
	    ((Class103_Sub3_Sub1) this).aLong11088 = 0L;
	}
	if (((Class103_Sub3_Sub1) this).aLong11097 != 0L) {
	    IDirect3DDevice.Destroy(((Class103_Sub3_Sub1) this).aLong11097);
	    ((Class103_Sub3_Sub1) this).aLong11097 = 0L;
	}
	if (((Class103_Sub3_Sub1) this).aLong11081 != 0L) {
	    IUnknown.Release(((Class103_Sub3_Sub1) this).aLong11081);
	    ((Class103_Sub3_Sub1) this).aLong11081 = 0L;
	}
    }
    
    final void method15757(Interface33 interface33, Class310 class310, int i,
			   int i_13_, int i_14_, int i_15_) {
	if (((Class103_Sub3_Sub1) this).aClass55_Sub1_11096 != null)
	    ((Class103_Sub3_Sub1) this).aClass55_Sub1_11096.method16171();
	IDirect3DDevice.DrawIndexedPrimitiveIB((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       ((Class255) (Class255)
						interface33).aLong4140,
					       4, 0, i, i_13_, i_14_, i_15_);
    }
    
    public float method15622() {
	return -0.5F;
    }
    
    public Class105_Sub2 method2248() {
	return new Class105_Sub2_Sub3_Sub1(this);
    }
    
    Class105_Sub1 method2246(Canvas canvas, int i, int i_16_) {
	return new Class105_Sub1_Sub1_Sub2(this, canvas, i, i_16_, false);
    }
    
    public Interface4 method2461(int i, int i_17_, Class175 class175,
				 Class102 class102, int i_18_) {
	return new Class264(this, class175, class102, i, i_17_, i_18_);
    }
    
    public Interface5 method2249(int i, int i_19_) {
	return new Class265(this, Class102.aClass102_1437, i, i_19_, 0);
    }
    
    final void method17458(Class263 class263) {
	IDirect3DDevice.SetTexture(((Class103_Sub3_Sub1) this).aLong11097,
				   anInt9580, class263.method5103());
	if (aBool9488
	    && !((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]) {
	    ((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580] = true;
	    method15703();
	    method15702();
	}
    }
    
    ObjectNode method17459(Interface25 interface25) {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(1049647106)) {
	    if (class241_sub26.objectValue == interface25)
		return class241_sub26;
	}
	return null;
    }
    
    Interface41 method15905(Class175 class175, Class102 class102, int i,
			    int i_20_) {
	return new Class263_Sub3(this, class175, class102, i, i_20_);
    }
    
    void method15840() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
				    174, aBool9654);
    }
    
    public int[] method2251(int i, int i_21_, int i_22_, int i_23_) {
	method2291();
	int[] is = null;
	long l
	    = IDirect3DDevice
		  .GetRenderTarget(((Class103_Sub3_Sub1) this).aLong11097, 0);
	long l_24_
	    = IDirect3DDevice.CreateRenderTarget((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 i_22_, i_23_, 21, 0, 0, true);
	int i_25_ = IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						l, i, i_21_, i_22_, i_23_,
						l_24_, 0, 0, i_22_, i_23_, 1);
	if (Class28.method958(i_25_)) {
	    is = new int[i_22_ * i_23_];
	    IDirect3DSurface.Download(l_24_, 0, 0, i_22_, i_23_, i_22_ * 4, 16,
				      aLong9491);
	    aByteBuffer9490.clear();
	    aByteBuffer9490.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_24_);
	return is;
    }
    
    public void method2252() {
	/* empty */
    }
    
    public Class88 method2319(Class88 class88, Class88 class88_26_, float f,
			      Class88 class88_27_) {
	return f < 0.5F ? class88 : class88_26_;
    }
    
    public void method2450(int i, int i_28_) {
	IDirect3DDevice.Clear(((Class103_Sub3_Sub1) this).aLong11097, i, i_28_,
			      1.0F, 0);
    }
    
    Interface41 method15690(Class175 class175, int i, int i_29_, boolean bool,
			    float[] fs, int i_30_, int i_31_) {
	return new Class263_Sub3(this, class175, i, i_29_, bool, fs, i_30_,
				 i_31_);
    }
    
    void method15742() {
	IDirect3DDevice.SetScissorRect(((Class103_Sub3_Sub1) this).aLong11097,
				       anInt9550 + anInt9512,
				       anInt9551 + anInt9538, anInt9574,
				       anInt9581);
    }
    
    static final int method17460(Class310 class310) {
	switch (class310.anInt4825) {
	case 2:
	    return 4;
	case 4:
	    return 2;
	case 3:
	    return 5;
	case 0:
	    return 1;
	case 1:
	    return 6;
	case 5:
	    return 3;
	default:
	    throw new IllegalArgumentException("");
	}
    }
    
    final void method17461(long l) {
	((Class103_Sub3_Sub1) this).aLong11107 = l;
	IDirect3DDevice.SetVertexShader(((Class103_Sub3_Sub1) this).aLong11097,
					l);
    }
    
    final void method17462(long l) {
	IDirect3DDevice.SetPixelShader(((Class103_Sub3_Sub1) this).aLong11097,
				       l);
    }
    
    public void method15610(Class268 class268, Class268 class268_32_,
			    Class268 class268_33_) {
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097,
				     256, class268.aFloatArray4353);
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097, 2,
				     class268_32_.aFloatArray4353);
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097, 3,
				     class268_33_.aFloatArray4353);
    }
    
    synchronized void method17463(long l) {
	if (((Class103_Sub3_Sub1) this).anInt11103
	    == ((Class103_Sub3_Sub1) this).anInt11109) {
	    ((Class103_Sub3_Sub1) this).anInt11109 *= 2;
	    long[] ls = new long[((Class103_Sub3_Sub1) this).anInt11109];
	    System.arraycopy(((Class103_Sub3_Sub1) this).aLongArray11111, 0,
			     ls, 0, ((Class103_Sub3_Sub1) this).anInt11103);
	    ((Class103_Sub3_Sub1) this).aLongArray11111 = ls;
	}
	((Class103_Sub3_Sub1) this).aLongArray11111
	    [((Class103_Sub3_Sub1) this).anInt11103]
	    = l;
	((Class103_Sub3_Sub1) this).anInt11103++;
    }
    
    void method15662() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 7,
				    aBool9562);
    }
    
    void method15663() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 14,
				    aBool9552 && aBool9553);
    }
    
    Interface41 method15908(Class175 class175, Class102 class102, int i,
			    int i_34_) {
	return new Class263_Sub3(this, class175, class102, i, i_34_);
    }
    
    void method15988() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 27,
				    aBool9620);
    }
    
    void method15670() {
	if (aBool9488) {
	    float f = aBool9492 ? aFloat9609 : 0.0F;
	    float f_35_ = aBool9492 ? -aFloat9568 : 0.0F;
	    D3DLIGHT.SetDiffuse(((Class103_Sub3_Sub1) this).aLong11086,
				f * aFloat9563, f * aFloat9564, f * aFloat9556,
				0.0F);
	    D3DLIGHT.SetDiffuse(((Class103_Sub3_Sub1) this).aLong11087,
				f_35_ * aFloat9563, f_35_ * aFloat9564,
				f_35_ * aFloat9556, 0.0F);
	    ((Class103_Sub3_Sub1) this).aBool11089 = false;
	}
    }
    
    static final int method17464(Class310 class310) {
	switch (class310.anInt4825) {
	case 2:
	    return 4;
	case 4:
	    return 2;
	case 3:
	    return 5;
	case 0:
	    return 1;
	case 1:
	    return 6;
	case 5:
	    return 3;
	default:
	    throw new IllegalArgumentException("");
	}
    }
    
    void method15673() {
	method15670();
	method15672();
    }
    
    void method15672() {
	if (aBool9488 && !((Class103_Sub3_Sub1) this).aBool11089) {
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					0, false);
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					1, false);
	    IDirect3DDevice.SetLight(((Class103_Sub3_Sub1) this).aLong11097, 0,
				     ((Class103_Sub3_Sub1) this).aLong11086);
	    IDirect3DDevice.SetLight(((Class103_Sub3_Sub1) this).aLong11097, 1,
				     ((Class103_Sub3_Sub1) this).aLong11087);
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					0, true);
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					1, true);
	    ((Class103_Sub3_Sub1) this).aBool11089 = true;
	}
    }
    
    void method15674() {
	int i;
	for (i = 0; i < anInt9524; i++) {
	    Class241_Sub43 class241_sub43 = aClass241_Sub43Array9569[i];
	    int i_36_ = i + 2;
	    int i_37_ = class241_sub43.method16461(-631264236);
	    float f = class241_sub43.method16458(518618490) / 255.0F;
	    D3DLIGHT.SetPosition
		(((Class103_Sub3_Sub1) this).aLong11088,
		 (float) class241_sub43.method16453((byte) -126),
		 (float) class241_sub43.method16454(-1874096036),
		 (float) class241_sub43.method16455(626523592));
	    D3DLIGHT.SetDiffuse(((Class103_Sub3_Sub1) this).aLong11088,
				(float) (i_37_ >> 16 & 0xff) * f,
				(float) (i_37_ >> 8 & 0xff) * f,
				(float) (i_37_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(((Class103_Sub3_Sub1) this).aLong11088, 0.0F, 0.0F,
		 1.0F / (float) (class241_sub43.method16468(1143403757)
				 * class241_sub43.method16468(1143403757)));
	    D3DLIGHT.SetRange(((Class103_Sub3_Sub1) this).aLong11088,
			      (float) class241_sub43.method16468(1143403757));
	    IDirect3DDevice.SetLight(((Class103_Sub3_Sub1) this).aLong11097,
				     i_36_,
				     ((Class103_Sub3_Sub1) this).aLong11088);
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					i_36_, true);
	}
	for (/**/; i < anInt9570; i++)
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					i + 2, false);
    }
    
    boolean method15675(Class175 class175, Class102 class102) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class28.method958(IDirect3D.GetAdapterDisplayMode
				  (((Class103_Sub3_Sub1) this).aLong11081,
				   ((Class103_Sub3_Sub1) this).anInt11082,
				   d3ddisplaymode))
		&& Class28.method958(IDirect3D.CheckDeviceFormat
				     (((Class103_Sub3_Sub1) this).aLong11081,
				      ((Class103_Sub3_Sub1) this).anInt11082,
				      ((Class103_Sub3_Sub1) this).anInt11080,
				      d3ddisplaymode.Format, 0, 3,
				      method17486(class175, class102))));
    }
    
    void method2421(int i, int i_38_) throws Exception_Sub2 {
	if (((Class103_Sub3_Sub1) this).aBool11085) {
	    if (!method17457(aClass105_Sub1_1452.method2655(),
			     aClass105_Sub1_1452.method2654()))
		return;
	    ((Class105_Sub1_Sub1_Sub2) aClass105_Sub1_1452).method163();
	} else
	    IDirect3DDevice.EndScene(((Class103_Sub3_Sub1) this).aLong11097);
	int i_39_ = aClass105_Sub1_1452.method15434();
	if (Class28.method957(i_39_)) {
	    ((Class103_Sub3_Sub1) this).aBool11085 = true;
	    aClass105_Sub1_1452.method28();
	} else {
	    IDirect3DDevice.BeginScene(((Class103_Sub3_Sub1) this).aLong11097);
	    if (anInterface6_1457 != null)
		anInterface6_1457.method34(-602503007);
	}
    }
    
    void method15875() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 7,
				    aBool9562);
    }
    
    Interface41 method15682(int i, int i_40_, boolean bool, int[] is,
			    int i_41_, int i_42_) {
	return new Class263_Sub3(this, i, i_40_, bool, is, i_41_, i_42_);
    }
    
    Interface41 method15680(Class175 class175, int i, int i_43_, boolean bool,
			    byte[] is, int i_44_, int i_45_) {
	return new Class263_Sub3(this, class175, i, i_43_, bool, is, i_44_,
				 i_45_);
    }
    
    Interface43 method15921(Class175 class175, Class102 class102, int i,
			    int i_46_) {
	return new Class263_Sub3_Sub1(this, class175, class102, i, i_46_);
    }
    
    Interface43 method15684(Class175 class175, Class102 class102, int i,
			    int i_47_) {
	return new Class263_Sub3_Sub1(this, class175, class102, i, i_47_);
    }
    
    ObjectNode method17465(Interface25 interface25) {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(1831298175)) {
	    if (class241_sub26.objectValue == interface25)
		return class241_sub26;
	}
	return null;
    }
    
    Interface38 method15990(Class175 class175, int i, int i_48_, int i_49_,
			    boolean bool, byte[] is) {
	return new Class263_Sub2(this, class175, i, i_48_, i_49_, bool, is);
    }
    
    void method16021() {
	if (aBool9488) {
	    D3DLIGHT.SetDirection(((Class103_Sub3_Sub1) this).aLong11086,
				  -aFloatArray9558[0], -aFloatArray9558[1],
				  -aFloatArray9558[2]);
	    D3DLIGHT.SetDirection(((Class103_Sub3_Sub1) this).aLong11087,
				  -aFloatArray9559[0], -aFloatArray9559[1],
				  -aFloatArray9559[2]);
	    ((Class103_Sub3_Sub1) this).aBool11089 = false;
	}
    }
    
    final void method17466(Class263_Sub3 class263_sub3) {
	method17458(class263_sub3);
	if (((Class103_Sub3_Sub1) this).aBoolArray11090[anInt9580]
	    != ((Class263_Sub3) class263_sub3).aBool10474) {
	    IDirect3DDevice.SetSamplerState
		(((Class103_Sub3_Sub1) this).aLong11097, anInt9580, 1,
		 ((Class263_Sub3) class263_sub3).aBool10474 ? 1 : 3);
	    ((Class103_Sub3_Sub1) this).aBoolArray11090[anInt9580]
		= ((Class263_Sub3) class263_sub3).aBool10474;
	}
	if (((Class103_Sub3_Sub1) this).aBoolArray11091[anInt9580]
	    != ((Class263_Sub3) class263_sub3).aBool10473) {
	    IDirect3DDevice.SetSamplerState
		(((Class103_Sub3_Sub1) this).aLong11097, anInt9580, 2,
		 ((Class263_Sub3) class263_sub3).aBool10473 ? 1 : 3);
	    ((Class103_Sub3_Sub1) this).aBoolArray11091[anInt9580]
		= ((Class263_Sub3) class263_sub3).aBool10473;
	}
    }
    
    synchronized void method17467(long l) {
	if (((Class103_Sub3_Sub1) this).anInt11103
	    == ((Class103_Sub3_Sub1) this).anInt11109) {
	    ((Class103_Sub3_Sub1) this).anInt11109 *= 2;
	    long[] ls = new long[((Class103_Sub3_Sub1) this).anInt11109];
	    System.arraycopy(((Class103_Sub3_Sub1) this).aLongArray11111, 0,
			     ls, 0, ((Class103_Sub3_Sub1) this).anInt11103);
	    ((Class103_Sub3_Sub1) this).aLongArray11111 = ls;
	}
	((Class103_Sub3_Sub1) this).aLongArray11111
	    [((Class103_Sub3_Sub1) this).anInt11103]
	    = l;
	((Class103_Sub3_Sub1) this).anInt11103++;
    }
    
    public void method15632() {
	if (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]) {
	    ((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580] = false;
	    IDirect3DDevice.SetTexture(((Class103_Sub3_Sub1) this).aLong11097,
				       anInt9580, 0L);
	    method15703();
	    method15702();
	}
    }
    
    void method15700() {
	if (((Class103_Sub3_Sub1) this).aLong11107 == 0L
	    && aClass387Array9579[anInt9580] != Class387.aClass387_5710) {
	    if (aClass387Array9579[anInt9580] == Class387.aClass387_5712)
		IDirect3DDevice.SetTransform
		    (((Class103_Sub3_Sub1) this).aLong11097, 16 + anInt9580,
		     (aClass268Array9578[anInt9580].method5231
		      (((Class103_Sub3_Sub1) this).aFloatArray11105)));
	    else
		IDirect3DDevice.SetTransform
		    (((Class103_Sub3_Sub1) this).aLong11097, 16 + anInt9580,
		     (aClass268Array9578[anInt9580].method5233
		      (((Class103_Sub3_Sub1) this).aFloatArray11105)));
	    int i = method17515(aClass387Array9579[anInt9580]);
	    if (i != ((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580]) {
		IDirect3DDevice.SetTextureStageState(((Class103_Sub3_Sub1)
						      this).aLong11097,
						     anInt9580, 24, i);
		((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 24, 0);
	    ((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580] = 0;
	}
    }
    
    public void method2345() {
	long l = IDirect3DDevice
		     .CreateEventQuery(((Class103_Sub3_Sub1) this).aLong11097);
	if (Class28.method958(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    void method15741() {
	for (int i = 0; i < anInt9647; i++) {
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 7, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 6, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 5, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 1, 1);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 2, 1);
	    ((Class103_Sub3_Sub1) this).aClass312Array11094[i]
		= Class312.aClass312_4830;
	    boolean[] bools = ((Class103_Sub3_Sub1) this).aBoolArray11090;
	    int i_50_ = i;
	    ((Class103_Sub3_Sub1) this).aBoolArray11091[i] = true;
	    bools[i_50_] = true;
	    ((Class103_Sub3_Sub1) this).aBoolArray11093[i] = false;
	    ((Class103_Sub3_Sub1) this).anIntArray11095[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
					      .aLong11097),
					     0, 6, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       9, 2);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       23, 4);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       25, 5);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       24, 0);
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
				    206, true);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       181, 0);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       22, 2);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       147, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       145, 1);
	IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097, 38,
				    0.95F);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       35, 3);
	IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097,
				    154, 1.0F);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11086, 3);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11087, 3);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11088, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       206, 1);
	((Class103_Sub3_Sub1) this).aBool11089 = false;
	super.method15885();
    }
    
    void method15703() {
	if (aBool9488) {
	    int i = (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]
		     ? method17469(aClass305Array9573[anInt9580]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 4, i);
	}
    }
    
    final void method15926(int i, Class306 class306, boolean bool,
			   boolean bool_51_) {
	if (aBool9488) {
	    int i_52_ = 0;
	    int i_53_;
	    switch (i) {
	    default:
		i_53_ = 2;
		break;
	    case 1:
		i_53_ = 3;
		break;
	    case 2:
		i_53_ = 26;
	    }
	    if (bool)
		i_52_ |= 0x20;
	    if (bool_51_)
		i_52_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, i_53_,
						 (method17489(class306)
						  | i_52_));
	}
    }
    
    static final int method17468(Class305 class305) {
	switch (class305.anInt4805) {
	case 4:
	    return 26;
	case 2:
	    return 10;
	case 0:
	    return 4;
	case 1:
	    return 2;
	case 3:
	    return 7;
	default:
	    throw new IllegalArgumentException();
	}
    }
    
    final void method16015() {
	if (aBool9488)
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   60, anInt9582);
    }
    
    static final int method17469(Class305 class305) {
	switch (class305.anInt4805) {
	case 4:
	    return 26;
	case 2:
	    return 10;
	case 0:
	    return 4;
	case 1:
	    return 2;
	case 3:
	    return 7;
	default:
	    throw new IllegalArgumentException();
	}
    }
    
    boolean method15708(Class175 class175, Class102 class102) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class28.method958(IDirect3D.GetAdapterDisplayMode
				  (((Class103_Sub3_Sub1) this).aLong11081,
				   ((Class103_Sub3_Sub1) this).anInt11082,
				   d3ddisplaymode))
		&& Class28.method958(IDirect3D.CheckDeviceFormat
				     (((Class103_Sub3_Sub1) this).aLong11081,
				      ((Class103_Sub3_Sub1) this).anInt11082,
				      ((Class103_Sub3_Sub1) this).anInt11080,
				      d3ddisplaymode.Format, 0, 4,
				      method17486(class175, class102))));
    }
    
    public Interface4 method2486(int i, int i_54_, Class175 class175,
				 Class102 class102, int i_55_) {
	return new Class264(this, class175, class102, i, i_54_, i_55_);
    }
    
    public void method15767(Class366 class366) {
	Class366_Sub2 class366_sub2 = (Class366_Sub2) class366;
	IDirect3DDevice.SetVertexDeclaration((((Class103_Sub3_Sub1) this)
					      .aLong11097),
					     (((Class366_Sub2) class366_sub2)
					      .aLong10374));
    }
    
    void method15864() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 15,
				    aBool9621);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       24, aByte9577 & 0xff);
	if ((((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9621 || aByte9577 == 0) {
		if (((Class103_Sub3_Sub1) this).aBool11106
		    || ((Class103_Sub3_Sub1) this).aBool11098)
		    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						    .aLong11097),
						   181, 0);
		else if (((Class103_Sub3_Sub1) this).aBool11084)
		    IDirect3DDevice.method16856((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						154, 1.0F);
	    } else if (((Class103_Sub3_Sub1) this).aBool11106)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('S', 'S', 'A',
							   'A'));
	    else if (((Class103_Sub3_Sub1) this).aBool11098)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('A', 'T', 'O',
							   'C'));
	    else if (((Class103_Sub3_Sub1) this).aBool11084)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       154,
					       method15730('A', '2', 'M',
							   '1'));
	}
    }
    
    void method15801() {
	switch (aClass304_9619.anInt4799) {
	case 3:
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 19, 2);
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 20, 2);
	    break;
	case 1:
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 19, 9);
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 20, 2);
	    break;
	case 0:
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 19, 5);
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 20, 6);
	    break;
	case 2:
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 19, 2);
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 20, 1);
	    break;
	}
	switch (anInt9618) {
	case 2:
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   207, 2);
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   208, 2);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   207, 1);
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   208, 2);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   207, 1);
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   208, 1);
	    break;
	case 1:
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   207, 2);
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   208, 1);
	    break;
	}
    }
    
    void method15715() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 27,
				    aBool9620);
    }
    
    void method15750() {
	if (aBool9488)
	    IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
					28,
					(aBool9611 && aBool9576
					 && anInt9613 >= 0));
    }
    
    public float method15878() {
	return -0.5F;
    }
    
    void method15713(boolean bool) {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
				    161, bool);
    }
    
    void method15734() {
	if (aBool9488) {
	    int i = (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]
		     ? method17469(aClass305Array9573[anInt9580]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 4, i);
	}
    }
    
    final Interface40 method15752(boolean bool) {
	return new Class259(this, bool);
    }
    
    Class366 method15697(Class314[] class314s) {
	return new Class366_Sub2(this, class314s);
    }
    
    public void method15716(Class366 class366) {
	Class366_Sub2 class366_sub2 = (Class366_Sub2) class366;
	IDirect3DDevice.SetVertexDeclaration((((Class103_Sub3_Sub1) this)
					      .aLong11097),
					     (((Class366_Sub2) class366_sub2)
					      .aLong10374));
    }
    
    void method16003(Interface33 interface33) {
	IDirect3DDevice.SetIndices(((Class103_Sub3_Sub1) this).aLong11097,
				   (((Class255) (Class255) interface33)
				    .aLong4140));
    }
    
    public void finalize() {
	super.finalize();
    }
    
    void method15885() {
	for (int i = 0; i < anInt9647; i++) {
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 7, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 6, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 5, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 1, 1);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 2, 1);
	    ((Class103_Sub3_Sub1) this).aClass312Array11094[i]
		= Class312.aClass312_4830;
	    boolean[] bools = ((Class103_Sub3_Sub1) this).aBoolArray11090;
	    int i_56_ = i;
	    ((Class103_Sub3_Sub1) this).aBoolArray11091[i] = true;
	    bools[i_56_] = true;
	    ((Class103_Sub3_Sub1) this).aBoolArray11093[i] = false;
	    ((Class103_Sub3_Sub1) this).anIntArray11095[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
					      .aLong11097),
					     0, 6, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       9, 2);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       23, 4);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       25, 5);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       24, 0);
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
				    206, true);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       181, 0);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       22, 2);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       147, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       145, 1);
	IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097, 38,
				    0.95F);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       35, 3);
	IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097,
				    154, 1.0F);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11086, 3);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11087, 3);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11088, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       206, 1);
	((Class103_Sub3_Sub1) this).aBool11089 = false;
	super.method15885();
    }
    
    public boolean method15605() {
	return ((((Class103_Sub3_Sub1) this).aD3DCAPS11099.VertexShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    public final void method15726(Class310 class310, int i, int i_57_,
				  int i_58_, int i_59_) {
	if (((Class103_Sub3_Sub1) this).aClass55_Sub1_11096 != null)
	    ((Class103_Sub3_Sub1) this).aClass55_Sub1_11096.method16171();
	IDirect3DDevice.DrawIndexedPrimitive((((Class103_Sub3_Sub1) this)
					      .aLong11097),
					     method17473(class310), 0, i,
					     i_57_, i_58_, i_59_);
    }
    
    byte[] method17470(String string) {
	return method15608("dx", string);
    }
    
    public Class116 method15784(String string) {
	byte[] is = method17470(string);
	if (is == null)
	    return null;
	Class47 class47 = method15631(is);
	return new Class116_Sub2(this, class47);
    }
    
    void method17471(Interface25 interface25) {
	ObjectNode class241_sub26 = method17459(interface25);
	if (class241_sub26 != null)
	    class241_sub26.remove((byte) 36);
    }
    
    Interface30 method15683(int i, boolean bool, int[][] is) {
	return new Class263_Sub1(this, i, bool, is);
    }
    
    static final int method17472(Class102 class102) {
	if (class102 == Class102.aClass102_1441)
	    return 80;
	if (class102 == Class102.aClass102_1437)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    static final int method17473(Class310 class310) {
	switch (class310.anInt4825) {
	case 2:
	    return 4;
	case 4:
	    return 2;
	case 3:
	    return 5;
	case 0:
	    return 1;
	case 1:
	    return 6;
	case 5:
	    return 3;
	default:
	    throw new IllegalArgumentException("");
	}
    }
    
    void method15896() {
	int i;
	for (i = 0; i < anInt9524; i++) {
	    Class241_Sub43 class241_sub43 = aClass241_Sub43Array9569[i];
	    int i_60_ = i + 2;
	    int i_61_ = class241_sub43.method16461(1106427527);
	    float f = class241_sub43.method16458(333954151) / 255.0F;
	    D3DLIGHT.SetPosition
		(((Class103_Sub3_Sub1) this).aLong11088,
		 (float) class241_sub43.method16453((byte) -72),
		 (float) class241_sub43.method16454(-1874096036),
		 (float) class241_sub43.method16455(626523592));
	    D3DLIGHT.SetDiffuse(((Class103_Sub3_Sub1) this).aLong11088,
				(float) (i_61_ >> 16 & 0xff) * f,
				(float) (i_61_ >> 8 & 0xff) * f,
				(float) (i_61_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(((Class103_Sub3_Sub1) this).aLong11088, 0.0F, 0.0F,
		 1.0F / (float) (class241_sub43.method16468(1143403757)
				 * class241_sub43.method16468(1143403757)));
	    D3DLIGHT.SetRange(((Class103_Sub3_Sub1) this).aLong11088,
			      (float) class241_sub43.method16468(1143403757));
	    IDirect3DDevice.SetLight(((Class103_Sub3_Sub1) this).aLong11097,
				     i_60_,
				     ((Class103_Sub3_Sub1) this).aLong11088);
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					i_60_, true);
	}
	for (/**/; i < anInt9570; i++)
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					i + 2, false);
    }
    
    static boolean method17474(int i, int i_62_, long l, int i_63_,
			       D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	int i_64_ = 0;
	int i_65_ = 0;
	int i_66_ = 0;
	boolean bool;
	try {
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (Class28.method957
		(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
		return false;
	while_80_:
	    for (/**/; i_63_ >= 0; i_63_--) {
		if (i_63_ != 1) {
		    i_66_ = 0 + i_63_;
		    for (int i_67_ = 0; i_67_ < anIntArray11113.length;
			 i_67_++) {
			if (IDirect3D.CheckDeviceType(l, i, i_62_,
						      d3ddisplaymode.Format,
						      anIntArray11113[i_67_],
						      true) == 0
			    && IDirect3D.CheckDeviceFormat(l, i, i_62_,
							   (d3ddisplaymode
							    .Format),
							   1, 1,
							   (anIntArray11113
							    [i_67_])) == 0
			    && (i_63_ == 0
				|| (IDirect3D.CheckDeviceMultiSampleType
				    (l, i, i_62_, anIntArray11113[i_67_], true,
				     i_66_)) == 0)) {
			    for (int i_68_ = 0; i_68_ < anIntArray11108.length;
				 i_68_++) {
				if ((IDirect3D.CheckDeviceFormat
				     (l, i, i_62_, d3ddisplaymode.Format, 2, 1,
				      anIntArray11108[i_68_])) == 0
				    && (IDirect3D.CheckDepthStencilMatch
					(l, i, i_62_, d3ddisplaymode.Format,
					 anIntArray11113[i_67_],
					 anIntArray11108[i_68_])) == 0
				    && (i_63_ == 0
					|| (IDirect3D
						.CheckDeviceMultiSampleType
					    (l, i, i_62_,
					     anIntArray11108[i_67_], true,
					     i_66_)) == 0)) {
				    i_65_ = anIntArray11113[i_67_];
				    i_64_ = anIntArray11108[i_68_];
				    break while_80_;
				}
			    }
			}
		    }
		}
	    }
	    if (i_63_ < 0 || i_65_ == 0 || i_64_ == 0)
		return false;
	    d3dpresent_parameters.BackBufferFormat = i_65_;
	    d3dpresent_parameters.AutoDepthStencilFormat = i_64_;
	    d3dpresent_parameters.MultiSampleType = i_66_;
	    d3dpresent_parameters.MultiSampleQuality = 0;
	    bool = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return bool;
    }
    
    Interface43 method15919(Class175 class175, Class102 class102, int i,
			    int i_69_) {
	return new Class263_Sub3_Sub1(this, class175, class102, i, i_69_);
    }
    
    void method15815(int i) {
	if (!((Class103_Sub3_Sub1) this).aBool11110) {
	    int i_70_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   8, i_70_);
	}
    }
    
    void method15972() {
	if (aBool9488) {
	    int i = (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]
		     ? method17469(aClass305Array9573[anInt9580]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 4, i);
	}
    }
    
    final Interface33 method15714(boolean bool) {
	return new Class255(this, Class102.aClass102_1441, bool);
    }
    
    public void method2608() {
	long l = IDirect3DDevice
		     .CreateEventQuery(((Class103_Sub3_Sub1) this).aLong11097);
	if (Class28.method958(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    Class105_Sub1 method2277(Canvas canvas, int i, int i_71_) {
	return new Class105_Sub1_Sub1_Sub2(this, canvas, i, i_71_, false);
    }
    
    void method15968() {
	if (aBool9488) {
	    int i = (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]
		     ? method17469(aClass305Array9541[anInt9580]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 1, i);
	}
    }
    
    public String method2369() {
	String string = "Caps: 3:";
	String string_72_ = ":";
	string = new StringBuilder().append(string).append(anInt9623).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append(anInt9647).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append(anInt9630).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9634 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (method15605() ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (method15606() ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9636 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9635 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11100 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11104 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11102 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11101 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9549 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9632 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9622 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11098 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11084 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11106 ? 1 : 0).append
		     (string_72_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9638 ? 1 : 0).toString();
	return string;
    }
    
    public String method2562() {
	String string = "Caps: 3:";
	String string_73_ = ":";
	string = new StringBuilder().append(string).append(anInt9623).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append(anInt9647).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append(anInt9630).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9634 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (method15605() ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (method15606() ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9636 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9635 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11100 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11104 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11102 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11101 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9549 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9632 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9622 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11098 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11084 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11106 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9638 ? 1 : 0).toString();
	return string;
    }
    
    public void method2371(boolean bool) {
	/* empty */
    }
    
    Class105_Sub1 method2372(Canvas canvas, int i, int i_74_) {
	return new Class105_Sub1_Sub1_Sub2(this, canvas, i, i_74_, false);
    }
    
    public Class105_Sub2 method2529() {
	return new Class105_Sub2_Sub3_Sub1(this);
    }
    
    void method15981() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 15,
				    aBool9621);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       24, aByte9577 & 0xff);
	if ((((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9621 || aByte9577 == 0) {
		if (((Class103_Sub3_Sub1) this).aBool11106
		    || ((Class103_Sub3_Sub1) this).aBool11098)
		    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						    .aLong11097),
						   181, 0);
		else if (((Class103_Sub3_Sub1) this).aBool11084)
		    IDirect3DDevice.method16856((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						154, 1.0F);
	    } else if (((Class103_Sub3_Sub1) this).aBool11106)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('S', 'S', 'A',
							   'A'));
	    else if (((Class103_Sub3_Sub1) this).aBool11098)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('A', 'T', 'O',
							   'C'));
	    else if (((Class103_Sub3_Sub1) this).aBool11084)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       154,
					       method15730('A', '2', 'M',
							   '1'));
	}
    }
    
    Class105_Sub1 method2511(Canvas canvas, int i, int i_75_) {
	return new Class105_Sub1_Sub1_Sub2(this, canvas, i, i_75_, false);
    }
    
    public int[] method2418(int i, int i_76_, int i_77_, int i_78_) {
	method2291();
	int[] is = null;
	long l
	    = IDirect3DDevice
		  .GetRenderTarget(((Class103_Sub3_Sub1) this).aLong11097, 0);
	long l_79_
	    = IDirect3DDevice.CreateRenderTarget((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 i_77_, i_78_, 21, 0, 0, true);
	int i_80_ = IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						l, i, i_76_, i_77_, i_78_,
						l_79_, 0, 0, i_77_, i_78_, 1);
	if (Class28.method958(i_80_)) {
	    is = new int[i_77_ * i_78_];
	    IDirect3DSurface.Download(l_79_, 0, 0, i_77_, i_78_, i_77_ * 4, 16,
				      aLong9491);
	    aByteBuffer9490.clear();
	    aByteBuffer9490.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_79_);
	return is;
    }
    
    public int[] method2377(int i, int i_81_, int i_82_, int i_83_) {
	method2291();
	int[] is = null;
	long l
	    = IDirect3DDevice
		  .GetRenderTarget(((Class103_Sub3_Sub1) this).aLong11097, 0);
	long l_84_
	    = IDirect3DDevice.CreateRenderTarget((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 i_82_, i_83_, 21, 0, 0, true);
	int i_85_ = IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						l, i, i_81_, i_82_, i_83_,
						l_84_, 0, 0, i_82_, i_83_, 1);
	if (Class28.method958(i_85_)) {
	    is = new int[i_82_ * i_83_];
	    IDirect3DSurface.Download(l_84_, 0, 0, i_82_, i_83_, i_82_ * 4, 16,
				      aLong9491);
	    aByteBuffer9490.clear();
	    aByteBuffer9490.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_84_);
	return is;
    }
    
    public int[] method2378(int i, int i_86_, int i_87_, int i_88_) {
	method2291();
	int[] is = null;
	long l
	    = IDirect3DDevice
		  .GetRenderTarget(((Class103_Sub3_Sub1) this).aLong11097, 0);
	long l_89_
	    = IDirect3DDevice.CreateRenderTarget((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 i_87_, i_88_, 21, 0, 0, true);
	int i_90_ = IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						l, i, i_86_, i_87_, i_88_,
						l_89_, 0, 0, i_87_, i_88_, 1);
	if (Class28.method958(i_90_)) {
	    is = new int[i_87_ * i_88_];
	    IDirect3DSurface.Download(l_89_, 0, 0, i_87_, i_88_, i_87_ * 4, 16,
				      aLong9491);
	    aByteBuffer9490.clear();
	    aByteBuffer9490.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_89_);
	return is;
    }
    
    public int[] method2565(int i, int i_91_, int i_92_, int i_93_) {
	method2291();
	int[] is = null;
	long l
	    = IDirect3DDevice
		  .GetRenderTarget(((Class103_Sub3_Sub1) this).aLong11097, 0);
	long l_94_
	    = IDirect3DDevice.CreateRenderTarget((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 i_92_, i_93_, 21, 0, 0, true);
	int i_95_ = IDirect3DDevice.StretchRect((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						l, i, i_91_, i_92_, i_93_,
						l_94_, 0, 0, i_92_, i_93_, 1);
	if (Class28.method958(i_95_)) {
	    is = new int[i_92_ * i_93_];
	    IDirect3DSurface.Download(l_94_, 0, 0, i_92_, i_93_, i_92_ * 4, 16,
				      aLong9491);
	    aByteBuffer9490.clear();
	    aByteBuffer9490.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_94_);
	return is;
    }
    
    public void method2261() {
	/* empty */
    }
    
    public void method2381() {
	/* empty */
    }
    
    public void method2607() {
	/* empty */
    }
    
    void method16016(int i) {
	if (!((Class103_Sub3_Sub1) this).aBool11110) {
	    int i_96_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   8, i_96_);
	}
    }
    
    public Class88 method2487(Class88 class88, Class88 class88_97_, float f,
			      Class88 class88_98_) {
	return f < 0.5F ? class88 : class88_97_;
    }
    
    public void method15967() {
	if (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]) {
	    ((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580] = false;
	    IDirect3DDevice.SetTexture(((Class103_Sub3_Sub1) this).aLong11097,
				       anInt9580, 0L);
	    method15703();
	    method15702();
	}
    }
    
    public Class88 method2489(Class88 class88, Class88 class88_99_, float f,
			      Class88 class88_100_) {
	return f < 0.5F ? class88 : class88_99_;
    }
    
    Interface41 method15665(Class175 class175, int i, int i_101_, boolean bool,
			    float[] fs, int i_102_, int i_103_) {
	return new Class263_Sub3(this, class175, i, i_101_, bool, fs, i_102_,
				 i_103_);
    }
    
    void method15994() {
	if (aBool9488)
	    IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
					28,
					(aBool9611 && aBool9576
					 && anInt9613 >= 0));
    }
    
    public Interface4 method2531(int i, int i_104_, Class175 class175,
				 Class102 class102, int i_105_) {
	return new Class264(this, class175, class102, i, i_104_, i_105_);
    }
    
    void method15669() {
	if (aBool9488) {
	    D3DLIGHT.SetAmbient(((Class103_Sub3_Sub1) this).aLong11086,
				aFloat9563 * aFloat9566,
				aFloat9564 * aFloat9566,
				aFloat9556 * aFloat9566, 0.0F);
	    ((Class103_Sub3_Sub1) this).aBool11089 = false;
	}
    }
    
    synchronized void method17475(long l) {
	if (((Class103_Sub3_Sub1) this).anInt11103
	    == ((Class103_Sub3_Sub1) this).anInt11109) {
	    ((Class103_Sub3_Sub1) this).anInt11109 *= 2;
	    long[] ls = new long[((Class103_Sub3_Sub1) this).anInt11109];
	    System.arraycopy(((Class103_Sub3_Sub1) this).aLongArray11111, 0,
			     ls, 0, ((Class103_Sub3_Sub1) this).anInt11103);
	    ((Class103_Sub3_Sub1) this).aLongArray11111 = ls;
	}
	((Class103_Sub3_Sub1) this).aLongArray11111
	    [((Class103_Sub3_Sub1) this).anInt11103]
	    = l;
	((Class103_Sub3_Sub1) this).anInt11103++;
    }
    
    public Interface5 method2534(int i, int i_106_) {
	return new Class265(this, Class102.aClass102_1437, i, i_106_, 0);
    }
    
    public Interface5 method2621(int i, int i_107_) {
	return new Class265(this, Class102.aClass102_1437, i, i_107_, 0);
    }
    
    final void method17476(Class263 class263) {
	IDirect3DDevice.SetTexture(((Class103_Sub3_Sub1) this).aLong11097,
				   anInt9580, class263.method5103());
	if (aBool9488
	    && !((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]) {
	    ((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580] = true;
	    method15703();
	    method15702();
	}
    }
    
    static final int method17477(Class387 class387) {
	switch (class387.anInt5716) {
	case 5:
	    return 3;
	case 0:
	    return 4;
	case 2:
	    return 1;
	case 1:
	    return 2;
	default:
	    return 0;
	case 3:
	    return 256;
	}
    }
    
    public Interface5 method2538(int i, int i_108_, int i_109_) {
	return new Class265(this, Class102.aClass102_1437, i, i_108_, i_109_);
    }
    
    void method2539() {
	super.finalize();
    }
    
    public final synchronized void method2222(int i) {
	for (int i_110_ = 0; i_110_ < ((Class103_Sub3_Sub1) this).anInt11103;
	     i_110_++)
	    IUnknown
		.Release(((Class103_Sub3_Sub1) this).aLongArray11111[i_110_]);
	((Class103_Sub3_Sub1) this).anInt11103 = 0;
	super.method2222(i);
    }
    
    void method2541() {
	super.finalize();
    }
    
    void method2542() {
	super.finalize();
    }
    
    public final synchronized void method2561(int i) {
	for (int i_111_ = 0; i_111_ < ((Class103_Sub3_Sub1) this).anInt11103;
	     i_111_++)
	    IUnknown
		.Release(((Class103_Sub3_Sub1) this).aLongArray11111[i_111_]);
	((Class103_Sub3_Sub1) this).anInt11103 = 0;
	super.method2222(i);
    }
    
    void method15732() {
	if (aBool9488) {
	    float f = aBool9492 ? aFloat9609 : 0.0F;
	    float f_112_ = aBool9492 ? -aFloat9568 : 0.0F;
	    D3DLIGHT.SetDiffuse(((Class103_Sub3_Sub1) this).aLong11086,
				f * aFloat9563, f * aFloat9564, f * aFloat9556,
				0.0F);
	    D3DLIGHT.SetDiffuse(((Class103_Sub3_Sub1) this).aLong11087,
				f_112_ * aFloat9563, f_112_ * aFloat9564,
				f_112_ * aFloat9556, 0.0F);
	    ((Class103_Sub3_Sub1) this).aBool11089 = false;
	}
    }
    
    void method15962() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
				    174, aBool9654);
    }
    
    Class103_Sub3_Sub1(int i, int i_113_, long l, long l_114_,
		       D3DPRESENT_PARAMETERS d3dpresent_parameters,
		       D3DCAPS d3dcaps, Class107 class107,
		       Interface6 interface6, JS5 class210, int i_115_) {
	super(class107, interface6, class210, i_115_, 0);
	((Class103_Sub3_Sub1) this).aBool11085 = false;
	((Class103_Sub3_Sub1) this).aLong11086 = 0L;
	((Class103_Sub3_Sub1) this).aLong11087 = 0L;
	((Class103_Sub3_Sub1) this).aLong11088 = 0L;
	((Class103_Sub3_Sub1) this).aBool11089 = false;
	((Class103_Sub3_Sub1) this).aFloatArray11105 = new float[16];
	((Class103_Sub3_Sub1) this).anInt11109 = 128;
	((Class103_Sub3_Sub1) this).anInt11103 = 0;
	((Class103_Sub3_Sub1) this).aLongArray11111
	    = new long[((Class103_Sub3_Sub1) this).anInt11109];
	try {
	    ((Class103_Sub3_Sub1) this).anInt11082 = i;
	    ((Class103_Sub3_Sub1) this).anInt11080 = i_113_;
	    ((Class103_Sub3_Sub1) this).aLong11081 = l;
	    ((Class103_Sub3_Sub1) this).aLong11097 = l_114_;
	    ((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
		= d3dpresent_parameters;
	    ((Class103_Sub3_Sub1) this).aD3DCAPS11099 = d3dcaps;
	    ((Class103_Sub3_Sub1) this).aLong11086 = D3DLIGHT.Create();
	    ((Class103_Sub3_Sub1) this).aLong11087 = D3DLIGHT.Create();
	    ((Class103_Sub3_Sub1) this).aLong11088 = D3DLIGHT.Create();
	    anInt9647 = (((Class103_Sub3_Sub1) this).aD3DCAPS11099
			 .MaxSimultaneousTextures);
	    anInt9630
		= ((((Class103_Sub3_Sub1) this).aD3DCAPS11099.MaxActiveLights
		    > 0)
		   ? ((Class103_Sub3_Sub1) this).aD3DCAPS11099.MaxActiveLights
		   : 8);
	    ((Class103_Sub3_Sub1) this).aBool11100
		= (((Class103_Sub3_Sub1) this).aD3DCAPS11099.TextureCaps
		   & 0x2) == 0;
	    aBool9635 = (((Class103_Sub3_Sub1) this).aD3DCAPS11099.TextureCaps
			 & 0x800) != 0;
	    aBool9636 = (((Class103_Sub3_Sub1) this).aD3DCAPS11099.TextureCaps
			 & 0x2000) != 0;
	    ((Class103_Sub3_Sub1) this).aBool11104
		= (((Class103_Sub3_Sub1) this).aD3DCAPS11099.TextureCaps
		   & 0x8000) != 0;
	    ((Class103_Sub3_Sub1) this).aBool11102
		= (((Class103_Sub3_Sub1) this).aD3DCAPS11099.TextureCaps
		   & 0x10000) != 0;
	    ((Class103_Sub3_Sub1) this).aBool11101
		= (((Class103_Sub3_Sub1) this).aD3DCAPS11099.TextureCaps
		   & 0x4000) != 0;
	    aBool9549
		= (((Class103_Sub3_Sub1) this).aD3DCAPS11099.NumSimultaneousRTs
		   > 0);
	    aBool9637 = aBool9549;
	    aBool9632
		= (((Class103_Sub3_Sub1) this).aD3DCAPS11099.NumSimultaneousRTs
		   > 0);
	    aBool9634
		= anInt9623 > 0 || (IDirect3D.CheckDeviceMultiSampleType
				    (((Class103_Sub3_Sub1) this).aLong11081,
				     ((Class103_Sub3_Sub1) this).anInt11082,
				     ((Class103_Sub3_Sub1) this).anInt11080,
				     (((Class103_Sub3_Sub1) this)
				      .aD3DPRESENT_PARAMETERS11083
				      .BackBufferFormat),
				     true, 2)) == 0;
	    aBool9622 = ((((Class103_Sub3_Sub1) this).aD3DCAPS11099
			  .NumSimultaneousRTs) > 0 && anInt9623 > 0
			 || (IDirect3D.CheckDeviceMultiSampleType
			     (((Class103_Sub3_Sub1) this).aLong11081,
			      ((Class103_Sub3_Sub1) this).anInt11082,
			      ((Class103_Sub3_Sub1) this).anInt11080, 113,
			      true, 2)) == 0);
	    ((Class103_Sub3_Sub1) this).aBool11098
		= (IDirect3D.CheckDeviceFormat
		   (((Class103_Sub3_Sub1) this).aLong11081,
		    ((Class103_Sub3_Sub1) this).anInt11082,
		    ((Class103_Sub3_Sub1) this).anInt11080,
		    (((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
		     .BackBufferFormat),
		    0, 1, method15730('A', 'T', 'O', 'C'))) == 0;
	    ((Class103_Sub3_Sub1) this).aBool11084
		= (IDirect3D.CheckDeviceFormat
		   (((Class103_Sub3_Sub1) this).aLong11081,
		    ((Class103_Sub3_Sub1) this).anInt11082,
		    ((Class103_Sub3_Sub1) this).anInt11080,
		    (((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
		     .BackBufferFormat),
		    0, 1, method15730('A', '2', 'M', '1'))) == 0;
	    ((Class103_Sub3_Sub1) this).aBool11106
		= (IDirect3D.CheckDeviceFormat
		   (((Class103_Sub3_Sub1) this).aLong11081,
		    ((Class103_Sub3_Sub1) this).anInt11082,
		    ((Class103_Sub3_Sub1) this).anInt11080,
		    (((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
		     .BackBufferFormat),
		    0, 1, method15730('S', 'S', 'A', 'A'))) == 0;
	    aBool9638
		= (((Class103_Sub3_Sub1) this).aD3DCAPS11099.PrimitiveMiscCaps
		   & 0x20000) != 0;
	    ((Class103_Sub3_Sub1) this).aBoolArray11090
		= new boolean[anInt9647];
	    ((Class103_Sub3_Sub1) this).aBoolArray11091
		= new boolean[anInt9647];
	    ((Class103_Sub3_Sub1) this).aBoolArray11092
		= new boolean[anInt9647];
	    ((Class103_Sub3_Sub1) this).aClass312Array11094
		= new Class312[anInt9647];
	    ((Class103_Sub3_Sub1) this).aBoolArray11093
		= new boolean[anInt9647];
	    ((Class103_Sub3_Sub1) this).anIntArray11095 = new int[anInt9647];
	    aBool9639 = false;
	    Class266 class266 = new Class266();
	    class266.method5120(1.0F, -1.0F, 0.5F);
	    class266.method5133(0.0F, 0.0F, 0.5F);
	    ((Class103_Sub3_Sub1) this).aClass268_11079 = new Class268();
	    ((Class103_Sub3_Sub1) this).aClass268_11079.method5203(class266);
	    IDirect3DDevice.BeginScene(((Class103_Sub3_Sub1) this).aLong11097);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method2220((byte) 0);
	    throw new RuntimeException("");
	}
    }
    
    void method15985() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 27,
				    aBool9620);
    }
    
    public void method15792(Class268 class268, Class268 class268_116_,
			    Class268 class268_117_) {
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097,
				     256, class268.aFloatArray4353);
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097, 2,
				     class268_116_.aFloatArray4353);
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097, 3,
				     class268_117_.aFloatArray4353);
    }
    
    public void method15793(Class268 class268, Class268 class268_118_,
			    Class268 class268_119_) {
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097,
				     256, class268.aFloatArray4353);
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097, 2,
				     class268_118_.aFloatArray4353);
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097, 3,
				     class268_119_.aFloatArray4353);
    }
    
    public void method15794(Class268 class268, Class268 class268_120_,
			    Class268 class268_121_) {
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097,
				     256, class268.aFloatArray4353);
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097, 2,
				     class268_120_.aFloatArray4353);
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097, 3,
				     class268_121_.aFloatArray4353);
    }
    
    void method15641() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
				    174, aBool9654);
    }
    
    void method15806() {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(940503873)) {
	    Interface25 interface25
		= (Interface25) class241_sub26.objectValue;
	    interface25.method28();
	}
	super.method15844();
    }
    
    void method15807() {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(-262007575)) {
	    Interface25 interface25
		= (Interface25) class241_sub26.objectValue;
	    interface25.method28();
	}
	super.method15844();
    }
    
    void method15758() {
	if (aBool9488)
	    IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
					137, aBool9600 && !aBool9557);
    }
    
    void method15809() {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(1427225321)) {
	    Interface25 interface25
		= (Interface25) class241_sub26.objectValue;
	    interface25.method28();
	}
	super.method15844();
    }
    
    void method15810() {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(-318242881)) {
	    Interface25 interface25
		= (Interface25) class241_sub26.objectValue;
	    interface25.method163();
	    if (interface25 == aClass105_1470)
		interface25.method162();
	}
	super.method15616();
    }
    
    void method15888() {
	method15670();
	method15672();
    }
    
    void method15812() {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(1152770816)) {
	    Interface25 interface25
		= (Interface25) class241_sub26.objectValue;
	    interface25.method163();
	    if (interface25 == aClass105_1470)
		interface25.method162();
	}
	super.method15616();
    }
    
    void method16023() {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(-488053650)) {
	    Interface25 interface25
		= (Interface25) class241_sub26.objectValue;
	    interface25.method163();
	    if (interface25 == aClass105_1470)
		interface25.method162();
	}
	super.method15616();
    }
    
    void method15879() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 14,
				    aBool9552 && aBool9553);
    }
    
    void method15837() {
	if (aClass105_1470 != null)
	    IDirect3DDevice.SetViewport(((Class103_Sub3_Sub1) this).aLong11097,
					anInt9550 + anInt9546,
					anInt9551 + anInt9545, anInt9482,
					anInt9617, aFloat9532, aFloat9533);
    }
    
    void method15753() {
	IDirect3DDevice.SetScissorRect(((Class103_Sub3_Sub1) this).aLong11097,
				       anInt9550 + anInt9512,
				       anInt9551 + anInt9538, anInt9574,
				       anInt9581);
    }
    
    void method15756() {
	IDirect3DDevice.SetScissorRect(((Class103_Sub3_Sub1) this).aLong11097,
				       anInt9550 + anInt9512,
				       anInt9551 + anInt9538, anInt9574,
				       anInt9581);
    }
    
    void method15839() {
	IDirect3DDevice.SetScissorRect(((Class103_Sub3_Sub1) this).aLong11097,
				       anInt9550 + anInt9512,
				       anInt9551 + anInt9538, anInt9574,
				       anInt9581);
    }
    
    final Interface33 method15785(boolean bool) {
	return new Class255(this, Class102.aClass102_1441, bool);
    }
    
    static final int method17478(Class306 class306) {
	switch (class306.anInt4810) {
	case 3:
	    return 3;
	case 1:
	    return 0;
	case 2:
	    return 1;
	default:
	    throw new IllegalArgumentException();
	case 0:
	    return 2;
	}
    }
    
    public void method15768(Class268 class268) {
	class268.method5202(((Class103_Sub3_Sub1) this).aClass268_11079);
    }
    
    public boolean method15787() {
	return ((((Class103_Sub3_Sub1) this).aD3DCAPS11099.PixelShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    void method2348() {
	super.finalize();
    }
    
    Interface41 method15993(Class175 class175, int i, int i_122_, boolean bool,
			    byte[] is, int i_123_, int i_124_) {
	return new Class263_Sub3(this, class175, i, i_122_, bool, is, i_123_,
				 i_124_);
    }
    
    void method15739() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 7,
				    aBool9562);
    }
    
    void method2346() {
	super.method2221();
	if (((Class103_Sub3_Sub1) this).aLong11086 != 0L) {
	    D3DLIGHT.Destroy(((Class103_Sub3_Sub1) this).aLong11086);
	    ((Class103_Sub3_Sub1) this).aLong11086 = 0L;
	}
	if (((Class103_Sub3_Sub1) this).aLong11087 != 0L) {
	    D3DLIGHT.Destroy(((Class103_Sub3_Sub1) this).aLong11087);
	    ((Class103_Sub3_Sub1) this).aLong11087 = 0L;
	}
	if (((Class103_Sub3_Sub1) this).aLong11088 != 0L) {
	    D3DLIGHT.Destroy(((Class103_Sub3_Sub1) this).aLong11088);
	    ((Class103_Sub3_Sub1) this).aLong11088 = 0L;
	}
	if (((Class103_Sub3_Sub1) this).aLong11097 != 0L) {
	    IDirect3DDevice.Destroy(((Class103_Sub3_Sub1) this).aLong11097);
	    ((Class103_Sub3_Sub1) this).aLong11097 = 0L;
	}
	if (((Class103_Sub3_Sub1) this).aLong11081 != 0L) {
	    IUnknown.Release(((Class103_Sub3_Sub1) this).aLong11081);
	    ((Class103_Sub3_Sub1) this).aLong11081 = 0L;
	}
    }
    
    void method15676() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 14,
				    aBool9552 && aBool9553);
    }
    
    final void method17479(long l) {
	IDirect3DDevice.SetPixelShader(((Class103_Sub3_Sub1) this).aLong11097,
				       l);
    }
    
    final void method15772(int i, Class306 class306, boolean bool) {
	if (aBool9488) {
	    int i_125_ = 0;
	    int i_126_;
	    switch (i) {
	    case 2:
		i_126_ = 27;
		break;
	    case 1:
		i_126_ = 6;
		break;
	    default:
		i_126_ = 5;
	    }
	    if (bool)
		i_125_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, i_126_,
						 (method17489(class306)
						  | i_125_));
	}
    }
    
    void method15629() {
	if (aClass105_1470 != null)
	    IDirect3DDevice.SetViewport(((Class103_Sub3_Sub1) this).aLong11097,
					anInt9550 + anInt9546,
					anInt9551 + anInt9545, anInt9482,
					anInt9617, aFloat9532, aFloat9533);
    }
    
    void method15884() {
	if (aBool9488)
	    IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
					137, aBool9600 && !aBool9557);
    }
    
    void method15808() {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(-243057441)) {
	    Interface25 interface25
		= (Interface25) class241_sub26.objectValue;
	    interface25.method28();
	}
	super.method15844();
    }
    
    void method15735() {
	if (aBool9488) {
	    float f = aBool9492 ? aFloat9609 : 0.0F;
	    float f_127_ = aBool9492 ? -aFloat9568 : 0.0F;
	    D3DLIGHT.SetDiffuse(((Class103_Sub3_Sub1) this).aLong11086,
				f * aFloat9563, f * aFloat9564, f * aFloat9556,
				0.0F);
	    D3DLIGHT.SetDiffuse(((Class103_Sub3_Sub1) this).aLong11087,
				f_127_ * aFloat9563, f_127_ * aFloat9564,
				f_127_ * aFloat9556, 0.0F);
	    ((Class103_Sub3_Sub1) this).aBool11089 = false;
	}
    }
    
    void method15887() {
	if (aBool9488 && !((Class103_Sub3_Sub1) this).aBool11089) {
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					0, false);
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					1, false);
	    IDirect3DDevice.SetLight(((Class103_Sub3_Sub1) this).aLong11097, 0,
				     ((Class103_Sub3_Sub1) this).aLong11086);
	    IDirect3DDevice.SetLight(((Class103_Sub3_Sub1) this).aLong11097, 1,
				     ((Class103_Sub3_Sub1) this).aLong11087);
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					0, true);
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					1, true);
	    ((Class103_Sub3_Sub1) this).aBool11089 = true;
	}
    }
    
    Interface41 method15681(Class175 class175, int i, int i_128_, boolean bool,
			    float[] fs, int i_129_, int i_130_) {
	return new Class263_Sub3(this, class175, i, i_128_, bool, fs, i_129_,
				 i_130_);
    }
    
    void method15805() {
	method15670();
	method15672();
    }
    
    void method15890() {
	method15670();
	method15672();
    }
    
    void method15791() {
	int i;
	for (i = 0; i < anInt9524; i++) {
	    Class241_Sub43 class241_sub43 = aClass241_Sub43Array9569[i];
	    int i_131_ = i + 2;
	    int i_132_ = class241_sub43.method16461(-228040657);
	    float f = class241_sub43.method16458(1017255680) / 255.0F;
	    D3DLIGHT.SetPosition
		(((Class103_Sub3_Sub1) this).aLong11088,
		 (float) class241_sub43.method16453((byte) -118),
		 (float) class241_sub43.method16454(-1874096036),
		 (float) class241_sub43.method16455(626523592));
	    D3DLIGHT.SetDiffuse(((Class103_Sub3_Sub1) this).aLong11088,
				(float) (i_132_ >> 16 & 0xff) * f,
				(float) (i_132_ >> 8 & 0xff) * f,
				(float) (i_132_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(((Class103_Sub3_Sub1) this).aLong11088, 0.0F, 0.0F,
		 1.0F / (float) (class241_sub43.method16468(1143403757)
				 * class241_sub43.method16468(1143403757)));
	    D3DLIGHT.SetRange(((Class103_Sub3_Sub1) this).aLong11088,
			      (float) class241_sub43.method16468(1143403757));
	    IDirect3DDevice.SetLight(((Class103_Sub3_Sub1) this).aLong11097,
				     i_131_,
				     ((Class103_Sub3_Sub1) this).aLong11088);
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					i_131_, true);
	}
	for (/**/; i < anInt9570; i++)
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					i + 2, false);
    }
    
    void method15931() {
	int i;
	for (i = 0; i < anInt9524; i++) {
	    Class241_Sub43 class241_sub43 = aClass241_Sub43Array9569[i];
	    int i_133_ = i + 2;
	    int i_134_ = class241_sub43.method16461(1257186057);
	    float f = class241_sub43.method16458(1919189406) / 255.0F;
	    D3DLIGHT.SetPosition
		(((Class103_Sub3_Sub1) this).aLong11088,
		 (float) class241_sub43.method16453((byte) -73),
		 (float) class241_sub43.method16454(-1874096036),
		 (float) class241_sub43.method16455(626523592));
	    D3DLIGHT.SetDiffuse(((Class103_Sub3_Sub1) this).aLong11088,
				(float) (i_134_ >> 16 & 0xff) * f,
				(float) (i_134_ >> 8 & 0xff) * f,
				(float) (i_134_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(((Class103_Sub3_Sub1) this).aLong11088, 0.0F, 0.0F,
		 1.0F / (float) (class241_sub43.method16468(1143403757)
				 * class241_sub43.method16468(1143403757)));
	    D3DLIGHT.SetRange(((Class103_Sub3_Sub1) this).aLong11088,
			      (float) class241_sub43.method16468(1143403757));
	    IDirect3DDevice.SetLight(((Class103_Sub3_Sub1) this).aLong11097,
				     i_133_,
				     ((Class103_Sub3_Sub1) this).aLong11088);
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					i_133_, true);
	}
	for (/**/; i < anInt9570; i++)
	    IDirect3DDevice.LightEnable(((Class103_Sub3_Sub1) this).aLong11097,
					i + 2, false);
    }
    
    Class105_Sub1 method2374(Canvas canvas, int i, int i_135_) {
	return new Class105_Sub1_Sub1_Sub2(this, canvas, i, i_135_, false);
    }
    
    public final void method15623(Class310 class310, int i, int i_136_) {
	if (((Class103_Sub3_Sub1) this).aClass55_Sub1_11096 != null)
	    ((Class103_Sub3_Sub1) this).aClass55_Sub1_11096.method16171();
	IDirect3DDevice.DrawPrimitive(((Class103_Sub3_Sub1) this).aLong11097,
				      method17473(class310), i, i_136_);
    }
    
    boolean method15765(Class175 class175, Class102 class102) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class28.method958(IDirect3D.GetAdapterDisplayMode
				  (((Class103_Sub3_Sub1) this).aLong11081,
				   ((Class103_Sub3_Sub1) this).anInt11082,
				   d3ddisplaymode))
		&& Class28.method958(IDirect3D.CheckDeviceFormat
				     (((Class103_Sub3_Sub1) this).aLong11081,
				      ((Class103_Sub3_Sub1) this).anInt11082,
				      ((Class103_Sub3_Sub1) this).anInt11080,
				      d3ddisplaymode.Format, 0, 3,
				      method17486(class175, class102))));
    }
    
    boolean method15804(Class175 class175, Class102 class102) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class28.method958(IDirect3D.GetAdapterDisplayMode
				  (((Class103_Sub3_Sub1) this).aLong11081,
				   ((Class103_Sub3_Sub1) this).anInt11082,
				   d3ddisplaymode))
		&& Class28.method958(IDirect3D.CheckDeviceFormat
				     (((Class103_Sub3_Sub1) this).aLong11081,
				      ((Class103_Sub3_Sub1) this).anInt11082,
				      ((Class103_Sub3_Sub1) this).anInt11080,
				      d3ddisplaymode.Format, 0, 4,
				      method17486(class175, class102))));
    }
    
    boolean method15838(Class175 class175, Class102 class102) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class28.method958(IDirect3D.GetAdapterDisplayMode
				  (((Class103_Sub3_Sub1) this).aLong11081,
				   ((Class103_Sub3_Sub1) this).anInt11082,
				   d3ddisplaymode))
		&& Class28.method958(IDirect3D.CheckDeviceFormat
				     (((Class103_Sub3_Sub1) this).aLong11081,
				      ((Class103_Sub3_Sub1) this).anInt11082,
				      ((Class103_Sub3_Sub1) this).anInt11080,
				      d3ddisplaymode.Format, 0, 4,
				      method17486(class175, class102))));
    }
    
    public void method15652(Class268 class268) {
	class268.method5202(((Class103_Sub3_Sub1) this).aClass268_11079);
    }
    
    Interface41 method15906(Class175 class175, Class102 class102, int i,
			    int i_137_) {
	return new Class263_Sub3(this, class175, class102, i, i_137_);
    }
    
    Interface41 method16001(Class175 class175, Class102 class102, int i,
			    int i_138_) {
	return new Class263_Sub3(this, class175, class102, i, i_138_);
    }
    
    public Interface5 method2447(int i, int i_139_) {
	return new Class265(this, Class102.aClass102_1437, i, i_139_, 0);
    }
    
    static Class103 method17480(Canvas canvas, Class107 class107,
				Interface6 interface6, JS5 class210,
				Integer integer) {
	Class103_Sub3_Sub1 class103_sub3_sub1 = null;
	Class103_Sub3_Sub1 class103_sub3_sub1_140_;
	try {
	    int i = 0;
	    int i_141_ = 1;
	    long l = IDirect3D.Direct3DCreate();
	    D3DCAPS d3dcaps = new D3DCAPS();
	    IDirect3D.GetDeviceCaps(l, i, i_141_, d3dcaps);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x8) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x40) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
	    d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
	    d3dpresent_parameters.BackBufferCount = 1;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    if (!method17474(i, i_141_, l, integer.intValue(),
			     d3dpresent_parameters))
		throw new RuntimeException("");
	    int i_142_ = 0;
	    if ((d3dcaps.DevCaps & 0x100000) != 0)
		i_142_ |= 0x10;
	    long l_143_ = 0L;
	    try {
		l_143_ = IDirect3D.CreateDeviceContext(l, i, i_141_, canvas,
						       i_142_ | 0x40,
						       d3dpresent_parameters);
	    } catch (RuntimeException_Sub1 runtimeexception_sub1) {
		l_143_
		    = IDirect3D.CreateDeviceContext(l, i, i_141_, canvas,
						    i_142_ & ~0x100000 | 0x20,
						    d3dpresent_parameters);
	    }
	    class103_sub3_sub1
		= new Class103_Sub3_Sub1(i, i_141_, l, l_143_,
					 d3dpresent_parameters, d3dcaps,
					 class107, interface6, class210,
					 integer.intValue());
	    if (!class103_sub3_sub1.aHashtable1472.containsKey(canvas)) {
		Class540.method11932(canvas, -1944253770);
		class103_sub3_sub1.method2240
		    (canvas,
		     new Class105_Sub1_Sub1_Sub2(class103_sub3_sub1, canvas,
						 canvas.getWidth(),
						 canvas.getHeight(), true),
		     1455428848);
	    }
	    class103_sub3_sub1.method2242(canvas, 1892768205);
	    class103_sub3_sub1.method15712();
	    class103_sub3_sub1_140_ = class103_sub3_sub1;
	} catch (RuntimeException runtimeexception) {
	    if (class103_sub3_sub1 != null)
		class103_sub3_sub1.method2221();
	    throw runtimeexception;
	}
	return class103_sub3_sub1_140_;
    }
    
    static final int method17481(Class175 class175, Class102 class102) {
	switch (class102.anInt1446 * 1467922455) {
	case 5:
	    switch (class175.anInt2120 * 493238459) {
	    case 2:
		return 21;
	    case 9:
		return 22;
	    case 1:
		return Class30.anInt352 * 1758364971;
	    case 0:
		return Class30.anInt351 * 131979913;
	    default:
		break;
	    case 5:
		return 77;
	    case 3:
		return 28;
	    case 6:
		return 50;
	    case 7:
		return 51;
	    }
	    break;
	default:
	    break;
	case 0:
	    if (class175 == Class175.aClass175_2110)
		return 116;
	    break;
	case 1:
	    if (class175 == Class175.aClass175_2110)
		return 113;
	}
	throw new IllegalArgumentException("");
    }
    
    Interface41 method15909(Class175 class175, int i, int i_144_, boolean bool,
			    float[] fs, int i_145_, int i_146_) {
	return new Class263_Sub3(this, class175, i, i_144_, bool, fs, i_145_,
				 i_146_);
    }
    
    Interface41 method15771(int i, int i_147_, boolean bool, int[] is,
			    int i_148_, int i_149_) {
	return new Class263_Sub3(this, i, i_147_, bool, is, i_148_, i_149_);
    }
    
    public Interface5 method2354(int i, int i_150_) {
	return new Class265(this, Class102.aClass102_1437, i, i_150_, 0);
    }
    
    Interface41 method15911(int i, int i_151_, boolean bool, int[] is,
			    int i_152_, int i_153_) {
	return new Class263_Sub3(this, i, i_151_, bool, is, i_152_, i_153_);
    }
    
    Interface30 method15912(int i, boolean bool, int[][] is) {
	return new Class263_Sub1(this, i, bool, is);
    }
    
    Interface30 method15913(int i, boolean bool, int[][] is) {
	return new Class263_Sub1(this, i, bool, is);
    }
    
    Interface30 method15914(int i, boolean bool, int[][] is) {
	return new Class263_Sub1(this, i, bool, is);
    }
    
    Interface30 method15915(int i, boolean bool, int[][] is) {
	return new Class263_Sub1(this, i, bool, is);
    }
    
    public void method15751(int i, Interface40 interface40) {
	Class259 class259 = (Class259) interface40;
	IDirect3DDevice.SetStreamSource(((Class103_Sub3_Sub1) this).aLong11097,
					i, ((Class259) class259).aLong4215, 0,
					class259.method5070());
    }
    
    public String method2284() {
	String string = "Caps: 3:";
	String string_154_ = ":";
	string = new StringBuilder().append(string).append(anInt9623).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append(anInt9647).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append(anInt9630).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9634 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (method15605() ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (method15606() ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9636 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9635 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11100 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11104 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11102 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11101 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9549 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9632 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9622 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11098 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11084 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (((Class103_Sub3_Sub1) this).aBool11106 ? 1 : 0).append
		     (string_154_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9638 ? 1 : 0).toString();
	return string;
    }
    
    Interface38 method15745(Class175 class175, int i, int i_155_, int i_156_,
			    boolean bool, byte[] is) {
	return new Class263_Sub2(this, class175, i, i_155_, i_156_, bool, is);
    }
    
    static final int method17482(Class102 class102) {
	if (class102 == Class102.aClass102_1441)
	    return 80;
	if (class102 == Class102.aClass102_1437)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    void method15761(int i) {
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       168, i);
    }
    
    void method2218(int i, int i_157_) throws Exception_Sub2 {
	if (((Class103_Sub3_Sub1) this).aBool11085) {
	    if (!method17457(aClass105_Sub1_1452.method2655(),
			     aClass105_Sub1_1452.method2654()))
		return;
	    ((Class105_Sub1_Sub1_Sub2) aClass105_Sub1_1452).method163();
	} else
	    IDirect3DDevice.EndScene(((Class103_Sub3_Sub1) this).aLong11097);
	int i_158_ = aClass105_Sub1_1452.method15434();
	if (Class28.method957(i_158_)) {
	    ((Class103_Sub3_Sub1) this).aBool11085 = true;
	    aClass105_Sub1_1452.method28();
	} else {
	    IDirect3DDevice.BeginScene(((Class103_Sub3_Sub1) this).aLong11097);
	    if (anInterface6_1457 != null)
		anInterface6_1457.method34(-602503007);
	}
    }
    
    Interface43 method15922(Class175 class175, Class102 class102, int i,
			    int i_159_) {
	return new Class263_Sub3_Sub1(this, class175, class102, i, i_159_);
    }
    
    static boolean method17483(int i, int i_160_, long l, int i_161_,
			       D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	int i_162_ = 0;
	int i_163_ = 0;
	int i_164_ = 0;
	boolean bool;
	try {
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (Class28.method957
		(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
		return false;
	while_81_:
	    for (/**/; i_161_ >= 0; i_161_--) {
		if (i_161_ != 1) {
		    i_164_ = 0 + i_161_;
		    for (int i_165_ = 0; i_165_ < anIntArray11113.length;
			 i_165_++) {
			if (IDirect3D.CheckDeviceType(l, i, i_160_,
						      d3ddisplaymode.Format,
						      anIntArray11113[i_165_],
						      true) == 0
			    && IDirect3D.CheckDeviceFormat(l, i, i_160_,
							   (d3ddisplaymode
							    .Format),
							   1, 1,
							   (anIntArray11113
							    [i_165_])) == 0
			    && (i_161_ == 0
				|| (IDirect3D.CheckDeviceMultiSampleType
				    (l, i, i_160_, anIntArray11113[i_165_],
				     true, i_164_)) == 0)) {
			    for (int i_166_ = 0;
				 i_166_ < anIntArray11108.length; i_166_++) {
				if ((IDirect3D.CheckDeviceFormat
				     (l, i, i_160_, d3ddisplaymode.Format, 2,
				      1, anIntArray11108[i_166_])) == 0
				    && (IDirect3D.CheckDepthStencilMatch
					(l, i, i_160_, d3ddisplaymode.Format,
					 anIntArray11113[i_165_],
					 anIntArray11108[i_166_])) == 0
				    && (i_161_ == 0
					|| (IDirect3D
						.CheckDeviceMultiSampleType
					    (l, i, i_160_,
					     anIntArray11108[i_165_], true,
					     i_164_)) == 0)) {
				    i_163_ = anIntArray11113[i_165_];
				    i_162_ = anIntArray11108[i_166_];
				    break while_81_;
				}
			    }
			}
		    }
		}
	    }
	    if (i_161_ < 0 || i_163_ == 0 || i_162_ == 0)
		return false;
	    d3dpresent_parameters.BackBufferFormat = i_163_;
	    d3dpresent_parameters.AutoDepthStencilFormat = i_162_;
	    d3dpresent_parameters.MultiSampleType = i_164_;
	    d3dpresent_parameters.MultiSampleQuality = 0;
	    bool = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return bool;
    }
    
    public void method15795() {
	if (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]) {
	    ((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580] = false;
	    IDirect3DDevice.SetTexture(((Class103_Sub3_Sub1) this).aLong11097,
				       anInt9580, 0L);
	    method15703();
	    method15702();
	}
    }
    
    public void method15932() {
	if (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]) {
	    ((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580] = false;
	    IDirect3DDevice.SetTexture(((Class103_Sub3_Sub1) this).aLong11097,
				       anInt9580, 0L);
	    method15703();
	    method15702();
	}
    }
    
    void method15964() {
	if (((Class103_Sub3_Sub1) this).aLong11107 == 0L
	    && aClass387Array9579[anInt9580] != Class387.aClass387_5710) {
	    if (aClass387Array9579[anInt9580] == Class387.aClass387_5712)
		IDirect3DDevice.SetTransform
		    (((Class103_Sub3_Sub1) this).aLong11097, 16 + anInt9580,
		     (aClass268Array9578[anInt9580].method5231
		      (((Class103_Sub3_Sub1) this).aFloatArray11105)));
	    else
		IDirect3DDevice.SetTransform
		    (((Class103_Sub3_Sub1) this).aLong11097, 16 + anInt9580,
		     (aClass268Array9578[anInt9580].method5233
		      (((Class103_Sub3_Sub1) this).aFloatArray11105)));
	    int i = method17515(aClass387Array9579[anInt9580]);
	    if (i != ((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580]) {
		IDirect3DDevice.SetTextureStageState(((Class103_Sub3_Sub1)
						      this).aLong11097,
						     anInt9580, 24, i);
		((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 24, 0);
	    ((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580] = 0;
	}
    }
    
    final void method15940(int i, Class306 class306, boolean bool) {
	if (aBool9488) {
	    int i_167_ = 0;
	    int i_168_;
	    switch (i) {
	    case 2:
		i_168_ = 27;
		break;
	    case 1:
		i_168_ = 6;
		break;
	    default:
		i_168_ = 5;
	    }
	    if (bool)
		i_167_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, i_168_,
						 (method17489(class306)
						  | i_167_));
	}
    }
    
    final void method15836(int i, Class306 class306, boolean bool) {
	if (aBool9488) {
	    int i_169_ = 0;
	    int i_170_;
	    switch (i) {
	    case 2:
		i_170_ = 27;
		break;
	    case 1:
		i_170_ = 6;
		break;
	    default:
		i_170_ = 5;
	    }
	    if (bool)
		i_169_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, i_170_,
						 (method17489(class306)
						  | i_169_));
	}
    }
    
    final void method15942(int i, Class306 class306, boolean bool) {
	if (aBool9488) {
	    int i_171_ = 0;
	    int i_172_;
	    switch (i) {
	    case 2:
		i_172_ = 27;
		break;
	    case 1:
		i_172_ = 6;
		break;
	    default:
		i_172_ = 5;
	    }
	    if (bool)
		i_171_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, i_172_,
						 (method17489(class306)
						  | i_171_));
	}
    }
    
    Class366 method15656(Class314[] class314s) {
	return new Class366_Sub2(this, class314s);
    }
    
    static Class103 method17484(Canvas canvas, Class107 class107,
				Interface6 interface6, JS5 class210,
				Integer integer) {
	Class103_Sub3_Sub1 class103_sub3_sub1 = null;
	Class103_Sub3_Sub1 class103_sub3_sub1_173_;
	try {
	    int i = 0;
	    int i_174_ = 1;
	    long l = IDirect3D.Direct3DCreate();
	    D3DCAPS d3dcaps = new D3DCAPS();
	    IDirect3D.GetDeviceCaps(l, i, i_174_, d3dcaps);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x8) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x40) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
	    d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
	    d3dpresent_parameters.BackBufferCount = 1;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    if (!method17474(i, i_174_, l, integer.intValue(),
			     d3dpresent_parameters))
		throw new RuntimeException("");
	    int i_175_ = 0;
	    if ((d3dcaps.DevCaps & 0x100000) != 0)
		i_175_ |= 0x10;
	    long l_176_ = 0L;
	    try {
		l_176_ = IDirect3D.CreateDeviceContext(l, i, i_174_, canvas,
						       i_175_ | 0x40,
						       d3dpresent_parameters);
	    } catch (RuntimeException_Sub1 runtimeexception_sub1) {
		l_176_
		    = IDirect3D.CreateDeviceContext(l, i, i_174_, canvas,
						    i_175_ & ~0x100000 | 0x20,
						    d3dpresent_parameters);
	    }
	    class103_sub3_sub1
		= new Class103_Sub3_Sub1(i, i_174_, l, l_176_,
					 d3dpresent_parameters, d3dcaps,
					 class107, interface6, class210,
					 integer.intValue());
	    if (!class103_sub3_sub1.aHashtable1472.containsKey(canvas)) {
		Class540.method11932(canvas, -1944253770);
		class103_sub3_sub1.method2240
		    (canvas,
		     new Class105_Sub1_Sub1_Sub2(class103_sub3_sub1, canvas,
						 canvas.getWidth(),
						 canvas.getHeight(), true),
		     1455428848);
	    }
	    class103_sub3_sub1.method2242(canvas, 1870580852);
	    class103_sub3_sub1.method15712();
	    class103_sub3_sub1_173_ = class103_sub3_sub1;
	} catch (RuntimeException runtimeexception) {
	    if (class103_sub3_sub1 != null)
		class103_sub3_sub1.method2221();
	    throw runtimeexception;
	}
	return class103_sub3_sub1_173_;
    }
    
    final void method15945(int i, Class306 class306, boolean bool) {
	if (aBool9488) {
	    int i_177_ = 0;
	    int i_178_;
	    switch (i) {
	    case 2:
		i_178_ = 27;
		break;
	    case 1:
		i_178_ = 6;
		break;
	    default:
		i_178_ = 5;
	    }
	    if (bool)
		i_177_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, i_178_,
						 (method17489(class306)
						  | i_177_));
	}
    }
    
    final void method15961() {
	if (aBool9488)
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   60, anInt9582);
    }
    
    void method15916() {
	if (((Class103_Sub3_Sub1) this).aLong11107 == 0L
	    && aClass387Array9579[anInt9580] != Class387.aClass387_5710) {
	    if (aClass387Array9579[anInt9580] == Class387.aClass387_5712)
		IDirect3DDevice.SetTransform
		    (((Class103_Sub3_Sub1) this).aLong11097, 16 + anInt9580,
		     (aClass268Array9578[anInt9580].method5231
		      (((Class103_Sub3_Sub1) this).aFloatArray11105)));
	    else
		IDirect3DDevice.SetTransform
		    (((Class103_Sub3_Sub1) this).aLong11097, 16 + anInt9580,
		     (aClass268Array9578[anInt9580].method5233
		      (((Class103_Sub3_Sub1) this).aFloatArray11105)));
	    int i = method17515(aClass387Array9579[anInt9580]);
	    if (i != ((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580]) {
		IDirect3DDevice.SetTextureStageState(((Class103_Sub3_Sub1)
						      this).aLong11097,
						     anInt9580, 24, i);
		((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 24, 0);
	    ((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580] = 0;
	}
    }
    
    void method15963() {
	if (((Class103_Sub3_Sub1) this).aLong11107 == 0L
	    && aClass387Array9579[anInt9580] != Class387.aClass387_5710) {
	    if (aClass387Array9579[anInt9580] == Class387.aClass387_5712)
		IDirect3DDevice.SetTransform
		    (((Class103_Sub3_Sub1) this).aLong11097, 16 + anInt9580,
		     (aClass268Array9578[anInt9580].method5231
		      (((Class103_Sub3_Sub1) this).aFloatArray11105)));
	    else
		IDirect3DDevice.SetTransform
		    (((Class103_Sub3_Sub1) this).aLong11097, 16 + anInt9580,
		     (aClass268Array9578[anInt9580].method5233
		      (((Class103_Sub3_Sub1) this).aFloatArray11105)));
	    int i = method17515(aClass387Array9579[anInt9580]);
	    if (i != ((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580]) {
		IDirect3DDevice.SetTextureStageState(((Class103_Sub3_Sub1)
						      this).aLong11097,
						     anInt9580, 24, i);
		((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 24, 0);
	    ((Class103_Sub3_Sub1) this).anIntArray11095[anInt9580] = 0;
	}
    }
    
    static final int method17485(Class310 class310) {
	switch (class310.anInt4825) {
	case 2:
	    return 4;
	case 4:
	    return 2;
	case 3:
	    return 5;
	case 0:
	    return 1;
	case 1:
	    return 6;
	case 5:
	    return 3;
	default:
	    throw new IllegalArgumentException("");
	}
    }
    
    void method15738() {
	/* empty */
    }
    
    Interface38 method15747(Class175 class175, int i, int i_179_, int i_180_,
			    boolean bool, byte[] is) {
	return new Class263_Sub2(this, class175, i, i_179_, i_180_, bool, is);
    }
    
    void method15668() {
	if (aBool9488)
	    IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
					137, aBool9600 && !aBool9557);
    }
    
    public Interface4 method2533(int i, int i_181_, Class175 class175,
				 Class102 class102, int i_182_) {
	return new Class264(this, class175, class102, i, i_181_, i_182_);
    }
    
    void method15969() {
	if (aBool9488) {
	    int i = (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]
		     ? method17469(aClass305Array9541[anInt9580]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 1, i);
	}
    }
    
    void method15970() {
	if (aBool9488) {
	    int i = (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]
		     ? method17469(aClass305Array9573[anInt9580]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 4, i);
	}
    }
    
    public Class116 method15788(String string) {
	byte[] is = method17470(string);
	if (is == null)
	    return null;
	Class47 class47 = method15631(is);
	return new Class116_Sub2(this, class47);
    }
    
    void method15971() {
	if (aBool9488) {
	    int i = (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]
		     ? method17469(aClass305Array9573[anInt9580]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 4, i);
	}
    }
    
    static final int method17486(Class175 class175, Class102 class102) {
	switch (class102.anInt1446 * 1467922455) {
	case 5:
	    switch (class175.anInt2120 * 493238459) {
	    case 2:
		return 21;
	    case 9:
		return 22;
	    case 1:
		return Class30.anInt352 * 1758364971;
	    case 0:
		return Class30.anInt351 * 131979913;
	    default:
		break;
	    case 5:
		return 77;
	    case 3:
		return 28;
	    case 6:
		return 50;
	    case 7:
		return 51;
	    }
	    break;
	default:
	    break;
	case 0:
	    if (class175 == Class175.aClass175_2110)
		return 116;
	    break;
	case 1:
	    if (class175 == Class175.aClass175_2110)
		return 113;
	}
	throw new IllegalArgumentException("");
    }
    
    void method15857(int i) {
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       168, i);
    }
    
    void method15927(int i) {
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       168, i);
    }
    
    void method15979(int i) {
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       168, i);
    }
    
    void method15980() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 15,
				    aBool9621);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       24, aByte9577 & 0xff);
	if ((((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9621 || aByte9577 == 0) {
		if (((Class103_Sub3_Sub1) this).aBool11106
		    || ((Class103_Sub3_Sub1) this).aBool11098)
		    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						    .aLong11097),
						   181, 0);
		else if (((Class103_Sub3_Sub1) this).aBool11084)
		    IDirect3DDevice.method16856((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						154, 1.0F);
	    } else if (((Class103_Sub3_Sub1) this).aBool11106)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('S', 'S', 'A',
							   'A'));
	    else if (((Class103_Sub3_Sub1) this).aBool11098)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('A', 'T', 'O',
							   'C'));
	    else if (((Class103_Sub3_Sub1) this).aBool11084)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       154,
					       method15730('A', '2', 'M',
							   '1'));
	}
    }
    
    static final int method17487(Class310 class310) {
	switch (class310.anInt4825) {
	case 2:
	    return 4;
	case 4:
	    return 2;
	case 3:
	    return 5;
	case 0:
	    return 1;
	case 1:
	    return 6;
	case 5:
	    return 3;
	default:
	    throw new IllegalArgumentException("");
	}
    }
    
    void method15982() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 15,
				    aBool9621);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       24, aByte9577 & 0xff);
	if ((((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9621 || aByte9577 == 0) {
		if (((Class103_Sub3_Sub1) this).aBool11106
		    || ((Class103_Sub3_Sub1) this).aBool11098)
		    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						    .aLong11097),
						   181, 0);
		else if (((Class103_Sub3_Sub1) this).aBool11084)
		    IDirect3DDevice.method16856((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						154, 1.0F);
	    } else if (((Class103_Sub3_Sub1) this).aBool11106)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('S', 'S', 'A',
							   'A'));
	    else if (((Class103_Sub3_Sub1) this).aBool11098)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('A', 'T', 'O',
							   'C'));
	    else if (((Class103_Sub3_Sub1) this).aBool11084)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       154,
					       method15730('A', '2', 'M',
							   '1'));
	}
    }
    
    void method15983() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 15,
				    aBool9621);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       24, aByte9577 & 0xff);
	if ((((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9621 || aByte9577 == 0) {
		if (((Class103_Sub3_Sub1) this).aBool11106
		    || ((Class103_Sub3_Sub1) this).aBool11098)
		    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						    .aLong11097),
						   181, 0);
		else if (((Class103_Sub3_Sub1) this).aBool11084)
		    IDirect3DDevice.method16856((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						154, 1.0F);
	    } else if (((Class103_Sub3_Sub1) this).aBool11106)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('S', 'S', 'A',
							   'A'));
	    else if (((Class103_Sub3_Sub1) this).aBool11098)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('A', 'T', 'O',
							   'C'));
	    else if (((Class103_Sub3_Sub1) this).aBool11084)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       154,
					       method15730('A', '2', 'M',
							   '1'));
	}
    }
    
    void method15984() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 15,
				    aBool9621);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       24, aByte9577 & 0xff);
	if ((((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9621 || aByte9577 == 0) {
		if (((Class103_Sub3_Sub1) this).aBool11106
		    || ((Class103_Sub3_Sub1) this).aBool11098)
		    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						    .aLong11097),
						   181, 0);
		else if (((Class103_Sub3_Sub1) this).aBool11084)
		    IDirect3DDevice.method16856((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						154, 1.0F);
	    } else if (((Class103_Sub3_Sub1) this).aBool11106)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('S', 'S', 'A',
							   'A'));
	    else if (((Class103_Sub3_Sub1) this).aBool11098)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       181,
					       method15730('A', 'T', 'O',
							   'C'));
	    else if (((Class103_Sub3_Sub1) this).aBool11084)
		IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
						.aLong11097),
					       154,
					       method15730('A', '2', 'M',
							   '1'));
	}
    }
    
    void method15907() {
	switch (aClass304_9619.anInt4799) {
	case 3:
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 19, 2);
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 20, 2);
	    break;
	case 1:
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 19, 9);
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 20, 2);
	    break;
	case 0:
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 19, 5);
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 20, 6);
	    break;
	case 2:
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 19, 2);
	    IDirect3DDevice
		.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097, 20, 1);
	    break;
	}
	switch (anInt9618) {
	case 2:
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   207, 2);
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   208, 2);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   207, 1);
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   208, 2);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   207, 1);
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   208, 1);
	    break;
	case 1:
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   207, 2);
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   208, 1);
	    break;
	}
    }
    
    Interface41 method15910(int i, int i_183_, boolean bool, int[] is,
			    int i_184_, int i_185_) {
	return new Class263_Sub3(this, i, i_183_, bool, is, i_184_, i_185_);
    }
    
    Interface43 method15920(Class175 class175, Class102 class102, int i,
			    int i_186_) {
	return new Class263_Sub3_Sub1(this, class175, class102, i, i_186_);
    }
    
    void method15824() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 27,
				    aBool9620);
    }
    
    public void method15859(Class268 class268) {
	class268.method5202(((Class103_Sub3_Sub1) this).aClass268_11079);
    }
    
    void method15992() {
	aFloat9616 = aFloat9537 - (float) anInt9614;
	aFloat9615 = aFloat9616 - (float) anInt9613;
	if (aFloat9615 < aFloat9596)
	    aFloat9615 = aFloat9596;
	if (aBool9488) {
	    IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097,
					36, aFloat9615);
	    IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097,
					37, aFloat9616);
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   34, anInt9589);
	}
    }
    
    public Interface4 method2568(int i, int i_187_, Class175 class175,
				 Class102 class102, int i_188_) {
	return new Class264(this, class175, class102, i, i_187_, i_188_);
    }
    
    final void method17488(Class263_Sub3 class263_sub3) {
	method17458(class263_sub3);
	if (((Class103_Sub3_Sub1) this).aBoolArray11090[anInt9580]
	    != ((Class263_Sub3) class263_sub3).aBool10474) {
	    IDirect3DDevice.SetSamplerState
		(((Class103_Sub3_Sub1) this).aLong11097, anInt9580, 1,
		 ((Class263_Sub3) class263_sub3).aBool10474 ? 1 : 3);
	    ((Class103_Sub3_Sub1) this).aBoolArray11090[anInt9580]
		= ((Class263_Sub3) class263_sub3).aBool10474;
	}
	if (((Class103_Sub3_Sub1) this).aBoolArray11091[anInt9580]
	    != ((Class263_Sub3) class263_sub3).aBool10473) {
	    IDirect3DDevice.SetSamplerState
		(((Class103_Sub3_Sub1) this).aLong11097, anInt9580, 2,
		 ((Class263_Sub3) class263_sub3).aBool10473 ? 1 : 3);
	    ((Class103_Sub3_Sub1) this).aBoolArray11091[anInt9580]
		= ((Class263_Sub3) class263_sub3).aBool10473;
	}
    }
    
    void method15729() {
	if (aBool9488)
	    IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
					28,
					(aBool9611 && aBool9576
					 && anInt9613 >= 0));
    }
    
    void method15861(boolean bool) {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
				    161, bool);
    }
    
    public void method15955(int i, Interface40 interface40) {
	Class259 class259 = (Class259) interface40;
	IDirect3DDevice.SetStreamSource(((Class103_Sub3_Sub1) this).aLong11097,
					i, ((Class259) class259).aLong4215, 0,
					class259.method5070());
    }
    
    static final int method17489(Class306 class306) {
	switch (class306.anInt4810) {
	case 3:
	    return 3;
	case 1:
	    return 0;
	case 2:
	    return 1;
	default:
	    throw new IllegalArgumentException();
	case 0:
	    return 2;
	}
    }
    
    final Interface33 method15998(boolean bool) {
	return new Class255(this, Class102.aClass102_1441, bool);
    }
    
    public Class88 method2610(Class88 class88, Class88 class88_189_, float f,
			      Class88 class88_190_) {
	return f < 0.5F ? class88 : class88_189_;
    }
    
    Class366 method16000(Class314[] class314s) {
	return new Class366_Sub2(this, class314s);
    }
    
    public void method15860(Class366 class366) {
	Class366_Sub2 class366_sub2 = (Class366_Sub2) class366;
	IDirect3DDevice.SetVertexDeclaration((((Class103_Sub3_Sub1) this)
					      .aLong11097),
					     (((Class366_Sub2) class366_sub2)
					      .aLong10374));
    }
    
    final void method17490(Class263_Sub2 class263_sub2) {
	method17458(class263_sub2);
	if (!((Class103_Sub3_Sub1) this).aBoolArray11090[anInt9580]) {
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    anInt9580, 1, 1);
	    ((Class103_Sub3_Sub1) this).aBoolArray11090[anInt9580] = true;
	}
	if (!((Class103_Sub3_Sub1) this).aBoolArray11091[anInt9580]) {
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    anInt9580, 2, 1);
	    ((Class103_Sub3_Sub1) this).aBoolArray11091[anInt9580] = true;
	}
    }
    
    public Interface5 method2550(int i, int i_191_, int i_192_) {
	return new Class265(this, Class102.aClass102_1437, i, i_191_, i_192_);
    }
    
    public void method15898(int i, Interface40 interface40) {
	Class259 class259 = (Class259) interface40;
	IDirect3DDevice.SetStreamSource(((Class103_Sub3_Sub1) this).aLong11097,
					i, ((Class259) class259).aLong4215, 0,
					class259.method5070());
    }
    
    public boolean method15987() {
	return ((((Class103_Sub3_Sub1) this).aD3DCAPS11099.VertexShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    void method16009(Interface33 interface33) {
	IDirect3DDevice.SetIndices(((Class103_Sub3_Sub1) this).aLong11097,
				   (((Class255) (Class255) interface33)
				    .aLong4140));
    }
    
    public final void method16011(Class310 class310, int i, int i_193_) {
	if (((Class103_Sub3_Sub1) this).aClass55_Sub1_11096 != null)
	    ((Class103_Sub3_Sub1) this).aClass55_Sub1_11096.method16171();
	IDirect3DDevice.DrawPrimitive(((Class103_Sub3_Sub1) this).aLong11097,
				      method17473(class310), i, i_193_);
    }
    
    public final void method16012(Class310 class310, int i, int i_194_) {
	if (((Class103_Sub3_Sub1) this).aClass55_Sub1_11096 != null)
	    ((Class103_Sub3_Sub1) this).aClass55_Sub1_11096.method16171();
	IDirect3DDevice.DrawPrimitive(((Class103_Sub3_Sub1) this).aLong11097,
				      method17473(class310), i, i_194_);
    }
    
    final void method16013(Interface33 interface33, Class310 class310, int i,
			   int i_195_, int i_196_, int i_197_) {
	if (((Class103_Sub3_Sub1) this).aClass55_Sub1_11096 != null)
	    ((Class103_Sub3_Sub1) this).aClass55_Sub1_11096.method16171();
	IDirect3DDevice.DrawIndexedPrimitiveIB
	    (((Class103_Sub3_Sub1) this).aLong11097,
	     ((Class255) (Class255) interface33).aLong4140, 4, 0, i, i_195_,
	     i_196_, i_197_);
    }
    
    public final void method15826(Class310 class310, int i, int i_198_,
				  int i_199_, int i_200_) {
	if (((Class103_Sub3_Sub1) this).aClass55_Sub1_11096 != null)
	    ((Class103_Sub3_Sub1) this).aClass55_Sub1_11096.method16171();
	IDirect3DDevice.DrawIndexedPrimitive((((Class103_Sub3_Sub1) this)
					      .aLong11097),
					     method17473(class310), 0, i,
					     i_198_, i_199_, i_200_);
    }
    
    void method15832(int i) {
	if (!((Class103_Sub3_Sub1) this).aBool11110) {
	    int i_201_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   8, i_201_);
	}
    }
    
    final void method15937(int i, Class306 class306, boolean bool,
			   boolean bool_202_) {
	if (aBool9488) {
	    int i_203_ = 0;
	    int i_204_;
	    switch (i) {
	    default:
		i_204_ = 2;
		break;
	    case 1:
		i_204_ = 3;
		break;
	    case 2:
		i_204_ = 26;
	    }
	    if (bool)
		i_203_ |= 0x20;
	    if (bool_202_)
		i_203_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, i_204_,
						 (method17489(class306)
						  | i_203_));
	}
    }
    
    public void method15833(Class268 class268, Class268 class268_205_,
			    Class268 class268_206_) {
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097,
				     256, class268.aFloatArray4353);
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097, 2,
				     class268_205_.aFloatArray4353);
	IDirect3DDevice.SetTransform(((Class103_Sub3_Sub1) this).aLong11097, 3,
				     class268_206_.aFloatArray4353);
    }
    
    byte[] method17491(String string) {
	return method15608("dx", string);
    }
    
    static Class103 method17492(Canvas canvas, Class107 class107,
				Interface6 interface6, JS5 class210,
				Integer integer) {
	Class103_Sub3_Sub1 class103_sub3_sub1 = null;
	Class103_Sub3_Sub1 class103_sub3_sub1_207_;
	try {
	    int i = 0;
	    int i_208_ = 1;
	    long l = IDirect3D.Direct3DCreate();
	    D3DCAPS d3dcaps = new D3DCAPS();
	    IDirect3D.GetDeviceCaps(l, i, i_208_, d3dcaps);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x8) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x40) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
	    d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
	    d3dpresent_parameters.BackBufferCount = 1;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    if (!method17474(i, i_208_, l, integer.intValue(),
			     d3dpresent_parameters))
		throw new RuntimeException("");
	    int i_209_ = 0;
	    if ((d3dcaps.DevCaps & 0x100000) != 0)
		i_209_ |= 0x10;
	    long l_210_ = 0L;
	    try {
		l_210_ = IDirect3D.CreateDeviceContext(l, i, i_208_, canvas,
						       i_209_ | 0x40,
						       d3dpresent_parameters);
	    } catch (RuntimeException_Sub1 runtimeexception_sub1) {
		l_210_
		    = IDirect3D.CreateDeviceContext(l, i, i_208_, canvas,
						    i_209_ & ~0x100000 | 0x20,
						    d3dpresent_parameters);
	    }
	    class103_sub3_sub1
		= new Class103_Sub3_Sub1(i, i_208_, l, l_210_,
					 d3dpresent_parameters, d3dcaps,
					 class107, interface6, class210,
					 integer.intValue());
	    if (!class103_sub3_sub1.aHashtable1472.containsKey(canvas)) {
		Class540.method11932(canvas, -1944253770);
		class103_sub3_sub1.method2240
		    (canvas,
		     new Class105_Sub1_Sub1_Sub2(class103_sub3_sub1, canvas,
						 canvas.getWidth(),
						 canvas.getHeight(), true),
		     1455428848);
	    }
	    class103_sub3_sub1.method2242(canvas, 2055951993);
	    class103_sub3_sub1.method15712();
	    class103_sub3_sub1_207_ = class103_sub3_sub1;
	} catch (RuntimeException runtimeexception) {
	    if (class103_sub3_sub1 != null)
		class103_sub3_sub1.method2221();
	    throw runtimeexception;
	}
	return class103_sub3_sub1_207_;
    }
    
    boolean method17493(int i, int i_211_) {
	int i_212_
	    = IDirect3DDevice.TestCooperativeLevel(((Class103_Sub3_Sub1) this)
						   .aLong11097);
	if (i_212_ == 0 || i_212_ == -2005530519) {
	    IDirect3DDevice.SetDepthStencilSurface((((Class103_Sub3_Sub1) this)
						    .aLong11097),
						   0L);
	    for (int i_213_ = 1; i_213_ < 4; i_213_++)
		IDirect3DDevice.SetRenderTarget((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						i_213_, 0L);
	    for (int i_214_ = 0; i_214_ < 4; i_214_++)
		IDirect3DDevice.SetStreamSource((((Class103_Sub3_Sub1) this)
						 .aLong11097),
						i_214_, 0L, 0, 0);
	    for (int i_215_ = 0; i_215_ < 4; i_215_++)
		IDirect3DDevice.SetTexture((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   i_215_, 0L);
	    IDirect3DDevice.SetIndices(((Class103_Sub3_Sub1) this).aLong11097,
				       0L);
	    method15844();
	    ((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
		.BackBufferWidth
		= i;
	    ((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
		.BackBufferHeight
		= i_211_;
	    ((Class103_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11083
		.BackBufferCount
		= 1;
	    if (method17474(((Class103_Sub3_Sub1) this).anInt11082,
			    ((Class103_Sub3_Sub1) this).anInt11080,
			    ((Class103_Sub3_Sub1) this).aLong11081, anInt9623,
			    (((Class103_Sub3_Sub1) this)
			     .aD3DPRESENT_PARAMETERS11083))) {
		int i_216_
		    = IDirect3DDevice.Reset((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    (((Class103_Sub3_Sub1) this)
					     .aD3DPRESENT_PARAMETERS11083));
		if (Class28.method958(i_216_)) {
		    ((Class103_Sub3_Sub1) this).aBool11085 = false;
		    method15616();
		    method15885();
		    return true;
		}
	    }
	}
	return false;
    }
    
    void method2630(int i, int i_217_) throws Exception_Sub2 {
	if (((Class103_Sub3_Sub1) this).aBool11085) {
	    if (!method17457(aClass105_Sub1_1452.method2655(),
			     aClass105_Sub1_1452.method2654()))
		return;
	    ((Class105_Sub1_Sub1_Sub2) aClass105_Sub1_1452).method163();
	} else
	    IDirect3DDevice.EndScene(((Class103_Sub3_Sub1) this).aLong11097);
	int i_218_ = aClass105_Sub1_1452.method15434();
	if (Class28.method957(i_218_)) {
	    ((Class103_Sub3_Sub1) this).aBool11085 = true;
	    aClass105_Sub1_1452.method28();
	} else {
	    IDirect3DDevice.BeginScene(((Class103_Sub3_Sub1) this).aLong11097);
	    if (anInterface6_1457 != null)
		anInterface6_1457.method34(-602503007);
	}
    }
    
    void method15711() {
	aFloat9616 = aFloat9537 - (float) anInt9614;
	aFloat9615 = aFloat9616 - (float) anInt9613;
	if (aFloat9615 < aFloat9596)
	    aFloat9615 = aFloat9596;
	if (aBool9488) {
	    IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097,
					36, aFloat9615);
	    IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097,
					37, aFloat9616);
	    IDirect3DDevice.SetRenderState((((Class103_Sub3_Sub1) this)
					    .aLong11097),
					   34, anInt9589);
	}
    }
    
    ObjectNode method17494(Interface25 interface25) {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(861701677)) {
	    if (class241_sub26.objectValue == interface25)
		return class241_sub26;
	}
	return null;
    }
    
    ObjectNode method17495(Interface25 interface25) {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(1564774273)) {
	    if (class241_sub26.objectValue == interface25)
		return class241_sub26;
	}
	return null;
    }
    
    ObjectNode method17496(Interface25 interface25) {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(1848753496)) {
	    if (class241_sub26.objectValue == interface25)
		return class241_sub26;
	}
	return null;
    }
    
    ObjectNode method17497(Interface25 interface25) {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(1432787182)) {
	    if (class241_sub26.objectValue == interface25)
		return class241_sub26;
	}
	return null;
    }
    
    ObjectNode method17498(Interface25 interface25) {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(633635398)) {
	    if (class241_sub26.objectValue == interface25)
		return class241_sub26;
	}
	return null;
    }
    
    public boolean method15786() {
	return ((((Class103_Sub3_Sub1) this).aD3DCAPS11099.PixelShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    void method17499(Interface25 interface25) {
	if (method17459(interface25) == null)
	    ((Class103_Sub3_Sub1) this).aClass429_11112
		.addNode(new ObjectNode(interface25), (short) -12240);
    }
    
    void method17500(Interface25 interface25) {
	if (method17459(interface25) == null)
	    ((Class103_Sub3_Sub1) this).aClass429_11112
		.addNode(new ObjectNode(interface25), (short) -27959);
    }
    
    void method17501(Interface25 interface25) {
	ObjectNode class241_sub26 = method17459(interface25);
	if (class241_sub26 != null)
	    class241_sub26.remove((byte) 36);
    }
    
    void method17502(Interface25 interface25) {
	ObjectNode class241_sub26 = method17459(interface25);
	if (class241_sub26 != null)
	    class241_sub26.remove((byte) 36);
    }
    
    final void method17503(long l) {
	IDirect3DDevice.SetPixelShader(((Class103_Sub3_Sub1) this).aLong11097,
				       l);
    }
    
    void method15843() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 27,
				    aBool9620);
    }
    
    final void method17504(long l) {
	IDirect3DDevice.SetPixelShader(((Class103_Sub3_Sub1) this).aLong11097,
				       l);
    }
    
    void method16019() {
	if (aBool9488) {
	    D3DLIGHT.SetAmbient(((Class103_Sub3_Sub1) this).aLong11086,
				aFloat9563 * aFloat9566,
				aFloat9564 * aFloat9566,
				aFloat9556 * aFloat9566, 0.0F);
	    ((Class103_Sub3_Sub1) this).aBool11089 = false;
	}
    }
    
    void method16020() {
	if (aBool9488) {
	    D3DLIGHT.SetAmbient(((Class103_Sub3_Sub1) this).aLong11086,
				aFloat9563 * aFloat9566,
				aFloat9564 * aFloat9566,
				aFloat9556 * aFloat9566, 0.0F);
	    ((Class103_Sub3_Sub1) this).aBool11089 = false;
	}
    }
    
    Interface41 method15679(Class175 class175, Class102 class102, int i,
			    int i_219_) {
	return new Class263_Sub3(this, class175, class102, i, i_219_);
    }
    
    void method16022() {
	if (aBool9488) {
	    D3DLIGHT.SetDirection(((Class103_Sub3_Sub1) this).aLong11086,
				  -aFloatArray9558[0], -aFloatArray9558[1],
				  -aFloatArray9558[2]);
	    D3DLIGHT.SetDirection(((Class103_Sub3_Sub1) this).aLong11087,
				  -aFloatArray9559[0], -aFloatArray9559[1],
				  -aFloatArray9559[2]);
	    ((Class103_Sub3_Sub1) this).aBool11089 = false;
	}
    }
    
    static final int method17505(Class310 class310) {
	switch (class310.anInt4825) {
	case 2:
	    return 4;
	case 4:
	    return 2;
	case 3:
	    return 5;
	case 0:
	    return 1;
	case 1:
	    return 6;
	case 5:
	    return 3;
	default:
	    throw new IllegalArgumentException("");
	}
    }
    
    Interface41 method15811(Class175 class175, int i, int i_220_, boolean bool,
			    byte[] is, int i_221_, int i_222_) {
	return new Class263_Sub3(this, class175, i, i_220_, bool, is, i_221_,
				 i_222_);
    }
    
    void method16014() {
	/* empty */
    }
    
    final void method17506(Class263 class263) {
	IDirect3DDevice.SetTexture(((Class103_Sub3_Sub1) this).aLong11097,
				   anInt9580, class263.method5103());
	if (aBool9488
	    && !((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]) {
	    ((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580] = true;
	    method15703();
	    method15702();
	}
    }
    
    final void method17507(Class263 class263) {
	IDirect3DDevice.SetTexture(((Class103_Sub3_Sub1) this).aLong11097,
				   anInt9580, class263.method5103());
	if (aBool9488
	    && !((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]) {
	    ((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580] = true;
	    method15703();
	    method15702();
	}
    }
    
    final void method17508(Class263 class263) {
	IDirect3DDevice.SetTexture(((Class103_Sub3_Sub1) this).aLong11097,
				   anInt9580, class263.method5103());
	if (aBool9488
	    && !((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]) {
	    ((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580] = true;
	    method15703();
	    method15702();
	}
    }
    
    void method17509(Interface25 interface25) {
	if (method17459(interface25) == null)
	    ((Class103_Sub3_Sub1) this).aClass429_11112
		.addNode(new ObjectNode(interface25), (short) -7231);
    }
    
    final void method17510(Class263_Sub2 class263_sub2) {
	method17458(class263_sub2);
	if (!((Class103_Sub3_Sub1) this).aBoolArray11090[anInt9580]) {
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    anInt9580, 1, 1);
	    ((Class103_Sub3_Sub1) this).aBoolArray11090[anInt9580] = true;
	}
	if (!((Class103_Sub3_Sub1) this).aBoolArray11091[anInt9580]) {
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    anInt9580, 2, 1);
	    ((Class103_Sub3_Sub1) this).aBoolArray11091[anInt9580] = true;
	}
    }
    
    final void method17511(Class263_Sub2 class263_sub2) {
	method17458(class263_sub2);
	if (!((Class103_Sub3_Sub1) this).aBoolArray11090[anInt9580]) {
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    anInt9580, 1, 1);
	    ((Class103_Sub3_Sub1) this).aBoolArray11090[anInt9580] = true;
	}
	if (!((Class103_Sub3_Sub1) this).aBoolArray11091[anInt9580]) {
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    anInt9580, 2, 1);
	    ((Class103_Sub3_Sub1) this).aBoolArray11091[anInt9580] = true;
	}
    }
    
    static final int method17512(Class305 class305) {
	switch (class305.anInt4805) {
	case 4:
	    return 26;
	case 2:
	    return 10;
	case 0:
	    return 4;
	case 1:
	    return 2;
	case 3:
	    return 7;
	default:
	    throw new IllegalArgumentException();
	}
    }
    
    static final int method17513(Class305 class305) {
	switch (class305.anInt4805) {
	case 4:
	    return 26;
	case 2:
	    return 10;
	case 0:
	    return 4;
	case 1:
	    return 2;
	case 3:
	    return 7;
	default:
	    throw new IllegalArgumentException();
	}
    }
    
    static final int method17514(Class305 class305) {
	switch (class305.anInt4805) {
	case 4:
	    return 26;
	case 2:
	    return 10;
	case 0:
	    return 4;
	case 1:
	    return 2;
	case 3:
	    return 7;
	default:
	    throw new IllegalArgumentException();
	}
    }
    
    static final int method17515(Class387 class387) {
	switch (class387.anInt5716) {
	case 5:
	    return 3;
	case 0:
	    return 4;
	case 2:
	    return 1;
	case 1:
	    return 2;
	default:
	    return 0;
	case 3:
	    return 256;
	}
    }
    
    void method15615() {
	/* empty */
    }
    
    static final int method17516(Class306 class306) {
	switch (class306.anInt4810) {
	case 3:
	    return 3;
	case 1:
	    return 0;
	case 2:
	    return 1;
	default:
	    throw new IllegalArgumentException();
	case 0:
	    return 2;
	}
    }
    
    void method16024() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 14,
				    aBool9552 && aBool9553);
    }
    
    static final int method17517(Class306 class306) {
	switch (class306.anInt4810) {
	case 3:
	    return 3;
	case 1:
	    return 0;
	case 2:
	    return 1;
	default:
	    throw new IllegalArgumentException();
	case 0:
	    return 2;
	}
    }
    
    final void method15944(int i, Class306 class306, boolean bool) {
	if (aBool9488) {
	    int i_223_ = 0;
	    int i_224_;
	    switch (i) {
	    case 2:
		i_224_ = 27;
		break;
	    case 1:
		i_224_ = 6;
		break;
	    default:
		i_224_ = 5;
	    }
	    if (bool)
		i_223_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, i_224_,
						 (method17489(class306)
						  | i_223_));
	}
    }
    
    static final int method17518(Class387 class387) {
	switch (class387.anInt5716) {
	case 5:
	    return 3;
	case 0:
	    return 4;
	case 2:
	    return 1;
	case 1:
	    return 2;
	default:
	    return 0;
	case 3:
	    return 256;
	}
    }
    
    static final int method17519(Class387 class387) {
	switch (class387.anInt5716) {
	case 5:
	    return 3;
	case 0:
	    return 4;
	case 2:
	    return 1;
	case 1:
	    return 2;
	default:
	    return 0;
	case 3:
	    return 256;
	}
    }
    
    final Interface40 method16025(boolean bool) {
	return new Class259(this, bool);
    }
    
    boolean method15881(Class175 class175, Class102 class102) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class28.method958(IDirect3D.GetAdapterDisplayMode
				  (((Class103_Sub3_Sub1) this).aLong11081,
				   ((Class103_Sub3_Sub1) this).anInt11082,
				   d3ddisplaymode))
		&& Class28.method958(IDirect3D.CheckDeviceFormat
				     (((Class103_Sub3_Sub1) this).aLong11081,
				      ((Class103_Sub3_Sub1) this).anInt11082,
				      ((Class103_Sub3_Sub1) this).anInt11080,
				      d3ddisplaymode.Format, 0, 3,
				      method17486(class175, class102))));
    }
    
    byte[] method17520(String string) {
	return method15608("dx", string);
    }
    
    public void method2442(boolean bool) {
	/* empty */
    }
    
    static final int method17521(Class175 class175, Class102 class102) {
	switch (class102.anInt1446 * 1467922455) {
	case 5:
	    switch (class175.anInt2120 * 493238459) {
	    case 2:
		return 21;
	    case 9:
		return 22;
	    case 1:
		return Class30.anInt352 * 1758364971;
	    case 0:
		return Class30.anInt351 * 131979913;
	    default:
		break;
	    case 5:
		return 77;
	    case 3:
		return 28;
	    case 6:
		return 50;
	    case 7:
		return 51;
	    }
	    break;
	default:
	    break;
	case 0:
	    if (class175 == Class175.aClass175_2110)
		return 116;
	    break;
	case 1:
	    if (class175 == Class175.aClass175_2110)
		return 113;
	}
	throw new IllegalArgumentException("");
    }
    
    static final int method17522(Class175 class175, Class102 class102) {
	switch (class102.anInt1446 * 1467922455) {
	case 5:
	    switch (class175.anInt2120 * 493238459) {
	    case 2:
		return 21;
	    case 9:
		return 22;
	    case 1:
		return Class30.anInt352 * 1758364971;
	    case 0:
		return Class30.anInt351 * 131979913;
	    default:
		break;
	    case 5:
		return 77;
	    case 3:
		return 28;
	    case 6:
		return 50;
	    case 7:
		return 51;
	    }
	    break;
	default:
	    break;
	case 0:
	    if (class175 == Class175.aClass175_2110)
		return 116;
	    break;
	case 1:
	    if (class175 == Class175.aClass175_2110)
		return 113;
	}
	throw new IllegalArgumentException("");
    }
    
    static final int method17523(Class102 class102) {
	if (class102 == Class102.aClass102_1441)
	    return 80;
	if (class102 == Class102.aClass102_1437)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    void method15671() {
	if (aBool9488) {
	    D3DLIGHT.SetDirection(((Class103_Sub3_Sub1) this).aLong11086,
				  -aFloatArray9558[0], -aFloatArray9558[1],
				  -aFloatArray9558[2]);
	    D3DLIGHT.SetDirection(((Class103_Sub3_Sub1) this).aLong11087,
				  -aFloatArray9559[0], -aFloatArray9559[1],
				  -aFloatArray9559[2]);
	    ((Class103_Sub3_Sub1) this).aBool11089 = false;
	}
    }
    
    void method15966() {
	/* empty */
    }
    
    static final int method17524(Class306 class306) {
	switch (class306.anInt4810) {
	case 3:
	    return 3;
	case 1:
	    return 0;
	case 2:
	    return 1;
	default:
	    throw new IllegalArgumentException();
	case 0:
	    return 2;
	}
    }
    
    void method15876() {
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097, 7,
				    aBool9562);
    }
    
    void method15702() {
	if (aBool9488) {
	    int i = (((Class103_Sub3_Sub1) this).aBoolArray11092[anInt9580]
		     ? method17469(aClass305Array9541[anInt9580]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
						  .aLong11097),
						 anInt9580, 1, i);
	}
    }
    
    void method15817() {
	if (aBool9488)
	    IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
					28,
					(aBool9611 && aBool9576
					 && anInt9613 >= 0));
    }
    
    static boolean method17525(int i, int i_225_, long l, int i_226_,
			       D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	int i_227_ = 0;
	int i_228_ = 0;
	int i_229_ = 0;
	boolean bool;
	try {
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (Class28.method957
		(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
		return false;
	while_82_:
	    for (/**/; i_226_ >= 0; i_226_--) {
		if (i_226_ != 1) {
		    i_229_ = 0 + i_226_;
		    for (int i_230_ = 0; i_230_ < anIntArray11113.length;
			 i_230_++) {
			if (IDirect3D.CheckDeviceType(l, i, i_225_,
						      d3ddisplaymode.Format,
						      anIntArray11113[i_230_],
						      true) == 0
			    && IDirect3D.CheckDeviceFormat(l, i, i_225_,
							   (d3ddisplaymode
							    .Format),
							   1, 1,
							   (anIntArray11113
							    [i_230_])) == 0
			    && (i_226_ == 0
				|| (IDirect3D.CheckDeviceMultiSampleType
				    (l, i, i_225_, anIntArray11113[i_230_],
				     true, i_229_)) == 0)) {
			    for (int i_231_ = 0;
				 i_231_ < anIntArray11108.length; i_231_++) {
				if ((IDirect3D.CheckDeviceFormat
				     (l, i, i_225_, d3ddisplaymode.Format, 2,
				      1, anIntArray11108[i_231_])) == 0
				    && (IDirect3D.CheckDepthStencilMatch
					(l, i, i_225_, d3ddisplaymode.Format,
					 anIntArray11113[i_230_],
					 anIntArray11108[i_231_])) == 0
				    && (i_226_ == 0
					|| (IDirect3D
						.CheckDeviceMultiSampleType
					    (l, i, i_225_,
					     anIntArray11108[i_230_], true,
					     i_229_)) == 0)) {
				    i_228_ = anIntArray11113[i_230_];
				    i_227_ = anIntArray11108[i_231_];
				    break while_82_;
				}
			    }
			}
		    }
		}
	    }
	    if (i_226_ < 0 || i_228_ == 0 || i_227_ == 0)
		return false;
	    d3dpresent_parameters.BackBufferFormat = i_228_;
	    d3dpresent_parameters.AutoDepthStencilFormat = i_227_;
	    d3dpresent_parameters.MultiSampleType = i_229_;
	    d3dpresent_parameters.MultiSampleQuality = 0;
	    bool = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return bool;
    }
    
    static boolean method17526(int i, int i_232_, long l, int i_233_,
			       D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	int i_234_ = 0;
	int i_235_ = 0;
	int i_236_ = 0;
	boolean bool;
	try {
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (Class28.method957
		(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
		return false;
	while_83_:
	    for (/**/; i_233_ >= 0; i_233_--) {
		if (i_233_ != 1) {
		    i_236_ = 0 + i_233_;
		    for (int i_237_ = 0; i_237_ < anIntArray11113.length;
			 i_237_++) {
			if (IDirect3D.CheckDeviceType(l, i, i_232_,
						      d3ddisplaymode.Format,
						      anIntArray11113[i_237_],
						      true) == 0
			    && IDirect3D.CheckDeviceFormat(l, i, i_232_,
							   (d3ddisplaymode
							    .Format),
							   1, 1,
							   (anIntArray11113
							    [i_237_])) == 0
			    && (i_233_ == 0
				|| (IDirect3D.CheckDeviceMultiSampleType
				    (l, i, i_232_, anIntArray11113[i_237_],
				     true, i_236_)) == 0)) {
			    for (int i_238_ = 0;
				 i_238_ < anIntArray11108.length; i_238_++) {
				if ((IDirect3D.CheckDeviceFormat
				     (l, i, i_232_, d3ddisplaymode.Format, 2,
				      1, anIntArray11108[i_238_])) == 0
				    && (IDirect3D.CheckDepthStencilMatch
					(l, i, i_232_, d3ddisplaymode.Format,
					 anIntArray11113[i_237_],
					 anIntArray11108[i_238_])) == 0
				    && (i_233_ == 0
					|| (IDirect3D
						.CheckDeviceMultiSampleType
					    (l, i, i_232_,
					     anIntArray11108[i_237_], true,
					     i_236_)) == 0)) {
				    i_235_ = anIntArray11113[i_237_];
				    i_234_ = anIntArray11108[i_238_];
				    break while_83_;
				}
			    }
			}
		    }
		}
	    }
	    if (i_233_ < 0 || i_235_ == 0 || i_234_ == 0)
		return false;
	    d3dpresent_parameters.BackBufferFormat = i_235_;
	    d3dpresent_parameters.AutoDepthStencilFormat = i_234_;
	    d3dpresent_parameters.MultiSampleType = i_236_;
	    d3dpresent_parameters.MultiSampleQuality = 0;
	    bool = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return bool;
    }
    
    static boolean method17527(int i, int i_239_, long l, int i_240_,
			       D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	int i_241_ = 0;
	int i_242_ = 0;
	int i_243_ = 0;
	boolean bool;
	try {
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (Class28.method957
		(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
		return false;
	while_84_:
	    for (/**/; i_240_ >= 0; i_240_--) {
		if (i_240_ != 1) {
		    i_243_ = 0 + i_240_;
		    for (int i_244_ = 0; i_244_ < anIntArray11113.length;
			 i_244_++) {
			if (IDirect3D.CheckDeviceType(l, i, i_239_,
						      d3ddisplaymode.Format,
						      anIntArray11113[i_244_],
						      true) == 0
			    && IDirect3D.CheckDeviceFormat(l, i, i_239_,
							   (d3ddisplaymode
							    .Format),
							   1, 1,
							   (anIntArray11113
							    [i_244_])) == 0
			    && (i_240_ == 0
				|| (IDirect3D.CheckDeviceMultiSampleType
				    (l, i, i_239_, anIntArray11113[i_244_],
				     true, i_243_)) == 0)) {
			    for (int i_245_ = 0;
				 i_245_ < anIntArray11108.length; i_245_++) {
				if ((IDirect3D.CheckDeviceFormat
				     (l, i, i_239_, d3ddisplaymode.Format, 2,
				      1, anIntArray11108[i_245_])) == 0
				    && (IDirect3D.CheckDepthStencilMatch
					(l, i, i_239_, d3ddisplaymode.Format,
					 anIntArray11113[i_244_],
					 anIntArray11108[i_245_])) == 0
				    && (i_240_ == 0
					|| (IDirect3D
						.CheckDeviceMultiSampleType
					    (l, i, i_239_,
					     anIntArray11108[i_244_], true,
					     i_243_)) == 0)) {
				    i_242_ = anIntArray11113[i_244_];
				    i_241_ = anIntArray11108[i_245_];
				    break while_84_;
				}
			    }
			}
		    }
		}
	    }
	    if (i_240_ < 0 || i_242_ == 0 || i_241_ == 0)
		return false;
	    d3dpresent_parameters.BackBufferFormat = i_242_;
	    d3dpresent_parameters.AutoDepthStencilFormat = i_241_;
	    d3dpresent_parameters.MultiSampleType = i_243_;
	    d3dpresent_parameters.MultiSampleQuality = 0;
	    bool = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return bool;
    }
    
    Interface38 method15941(Class175 class175, int i, int i_246_, int i_247_,
			    boolean bool, byte[] is) {
	return new Class263_Sub2(this, class175, i, i_246_, i_247_, bool, is);
    }
    
    static boolean method17528(int i, int i_248_, long l, int i_249_,
			       D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	int i_250_ = 0;
	int i_251_ = 0;
	int i_252_ = 0;
	boolean bool;
	try {
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (Class28.method957
		(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
		return false;
	while_85_:
	    for (/**/; i_249_ >= 0; i_249_--) {
		if (i_249_ != 1) {
		    i_252_ = 0 + i_249_;
		    for (int i_253_ = 0; i_253_ < anIntArray11113.length;
			 i_253_++) {
			if (IDirect3D.CheckDeviceType(l, i, i_248_,
						      d3ddisplaymode.Format,
						      anIntArray11113[i_253_],
						      true) == 0
			    && IDirect3D.CheckDeviceFormat(l, i, i_248_,
							   (d3ddisplaymode
							    .Format),
							   1, 1,
							   (anIntArray11113
							    [i_253_])) == 0
			    && (i_249_ == 0
				|| (IDirect3D.CheckDeviceMultiSampleType
				    (l, i, i_248_, anIntArray11113[i_253_],
				     true, i_252_)) == 0)) {
			    for (int i_254_ = 0;
				 i_254_ < anIntArray11108.length; i_254_++) {
				if ((IDirect3D.CheckDeviceFormat
				     (l, i, i_248_, d3ddisplaymode.Format, 2,
				      1, anIntArray11108[i_254_])) == 0
				    && (IDirect3D.CheckDepthStencilMatch
					(l, i, i_248_, d3ddisplaymode.Format,
					 anIntArray11113[i_253_],
					 anIntArray11108[i_254_])) == 0
				    && (i_249_ == 0
					|| (IDirect3D
						.CheckDeviceMultiSampleType
					    (l, i, i_248_,
					     anIntArray11108[i_253_], true,
					     i_252_)) == 0)) {
				    i_251_ = anIntArray11113[i_253_];
				    i_250_ = anIntArray11108[i_254_];
				    break while_85_;
				}
			    }
			}
		    }
		}
	    }
	    if (i_249_ < 0 || i_251_ == 0 || i_250_ == 0)
		return false;
	    d3dpresent_parameters.BackBufferFormat = i_251_;
	    d3dpresent_parameters.AutoDepthStencilFormat = i_250_;
	    d3dpresent_parameters.MultiSampleType = i_252_;
	    d3dpresent_parameters.MultiSampleQuality = 0;
	    bool = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return bool;
    }
    
    final Interface33 method15900(boolean bool) {
	return new Class255(this, Class102.aClass102_1441, bool);
    }
    
    synchronized void method17529(long l) {
	if (((Class103_Sub3_Sub1) this).anInt11103
	    == ((Class103_Sub3_Sub1) this).anInt11109) {
	    ((Class103_Sub3_Sub1) this).anInt11109 *= 2;
	    long[] ls = new long[((Class103_Sub3_Sub1) this).anInt11109];
	    System.arraycopy(((Class103_Sub3_Sub1) this).aLongArray11111, 0,
			     ls, 0, ((Class103_Sub3_Sub1) this).anInt11103);
	    ((Class103_Sub3_Sub1) this).aLongArray11111 = ls;
	}
	((Class103_Sub3_Sub1) this).aLongArray11111
	    [((Class103_Sub3_Sub1) this).anInt11103]
	    = l;
	((Class103_Sub3_Sub1) this).anInt11103++;
    }
    
    public Class174 method2343() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(((Class103_Sub3_Sub1) this).aLong11081,
				       ((Class103_Sub3_Sub1) this).anInt11082,
				       0, d3dadapter_identifier);
	return new Class174(d3dadapter_identifier.VendorID,
			    method15607() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion,
			    method15607());
    }
    
    void method16026() {
	for (int i = 0; i < anInt9647; i++) {
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 7, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 6, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 5, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 1, 1);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 2, 1);
	    ((Class103_Sub3_Sub1) this).aClass312Array11094[i]
		= Class312.aClass312_4830;
	    boolean[] bools = ((Class103_Sub3_Sub1) this).aBoolArray11090;
	    int i_255_ = i;
	    ((Class103_Sub3_Sub1) this).aBoolArray11091[i] = true;
	    bools[i_255_] = true;
	    ((Class103_Sub3_Sub1) this).aBoolArray11093[i] = false;
	    ((Class103_Sub3_Sub1) this).anIntArray11095[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
					      .aLong11097),
					     0, 6, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       9, 2);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       23, 4);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       25, 5);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       24, 0);
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
				    206, true);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       181, 0);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       22, 2);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       147, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       145, 1);
	IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097, 38,
				    0.95F);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       35, 3);
	IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097,
				    154, 1.0F);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11086, 3);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11087, 3);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11088, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       206, 1);
	((Class103_Sub3_Sub1) this).aBool11089 = false;
	super.method15885();
    }
    
    void method15689() {
	for (ObjectNode class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112.method7694(16711935);
	     class241_sub26 != null;
	     class241_sub26
		 = (ObjectNode) ((Class103_Sub3_Sub1) this)
					.aClass429_11112
					.method7692(28630425)) {
	    Interface25 interface25
		= (Interface25) class241_sub26.objectValue;
	    interface25.method163();
	    if (interface25 == aClass105_1470)
		interface25.method162();
	}
	super.method15616();
    }
    
    void method16027() {
	for (int i = 0; i < anInt9647; i++) {
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 7, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 6, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 5, 2);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 1, 1);
	    IDirect3DDevice.SetSamplerState((((Class103_Sub3_Sub1) this)
					     .aLong11097),
					    i, 2, 1);
	    ((Class103_Sub3_Sub1) this).aClass312Array11094[i]
		= Class312.aClass312_4830;
	    boolean[] bools = ((Class103_Sub3_Sub1) this).aBoolArray11090;
	    int i_256_ = i;
	    ((Class103_Sub3_Sub1) this).aBoolArray11091[i] = true;
	    bools[i_256_] = true;
	    ((Class103_Sub3_Sub1) this).aBoolArray11093[i] = false;
	    ((Class103_Sub3_Sub1) this).anIntArray11095[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState((((Class103_Sub3_Sub1) this)
					      .aLong11097),
					     0, 6, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       9, 2);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       23, 4);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       25, 5);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       24, 0);
	IDirect3DDevice.method16857(((Class103_Sub3_Sub1) this).aLong11097,
				    206, true);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       181, 0);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       22, 2);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       147, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       145, 1);
	IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097, 38,
				    0.95F);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       35, 3);
	IDirect3DDevice.method16856(((Class103_Sub3_Sub1) this).aLong11097,
				    154, 1.0F);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11086, 3);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11087, 3);
	D3DLIGHT.SetType(((Class103_Sub3_Sub1) this).aLong11088, 1);
	IDirect3DDevice.SetRenderState(((Class103_Sub3_Sub1) this).aLong11097,
				       206, 1);
	((Class103_Sub3_Sub1) this).aBool11089 = false;
	super.method15885();
    }
}
