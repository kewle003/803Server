/* Class475_Sub1_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475_Sub1_Sub1_Sub5 extends Class475_Sub1_Sub1
{
    int anInt11483;
    int anInt11484 = 0;
    int anInt11485;
    Class489 aClass489_11486;
    boolean aBool11487;
    Class409 aClass409_11488;
    int anInt11489;
    
    public final boolean method17929() {
	return (null != ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		&& !((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
			.method7349(-707575521));
    }
    
    void method17930(Class103 class103, Class89 class89, Class266 class266,
		     int i) {
	class89.method1915(class266);
	Class106[] class106s = class89.method2051();
	Class167[] class167s = class89.method1917();
	if ((((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 == null
	     || ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.aBool6487)
	    && (null != class106s || null != class167s))
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486
		= Class489.method11182(client.anInt8296, true);
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null) {
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.method11158
		(class103, (long) client.anInt8296, class106s, class167s,
		 false);
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.method11162
		(nodePlane, aShort10717, aShort10716, aShort10718,
		 aShort10719);
	}
    }
    
    boolean method14452(byte i) {
	return ((Class475_Sub1_Sub1_Sub5) this).aBool11487;
    }
    
    final boolean method14450(int i) {
	return false;
    }
    
    public Class475_Sub1_Sub1_Sub5
	(Class552 class552, int i, int i_0_, int i_1_, int i_2_, int i_3_,
	 int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_,
	 boolean bool, int i_11_) {
	super(class552, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_,
	      false, (byte) 0);
	((Class475_Sub1_Sub1_Sub5) this).anInt11483 = 0;
	((Class475_Sub1_Sub1_Sub5) this).aBool11487 = true;
	((Class475_Sub1_Sub1_Sub5) this).anInt11485 = 0;
	((Class475_Sub1_Sub1_Sub5) this).anInt11489 = i * 1280386463;
	((Class475_Sub1_Sub1_Sub5) this).anInt11484 = i_10_ * 1182484743;
	((Class475_Sub1_Sub1_Sub5) this).anInt11485 = i_11_ * -1997757437;
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition((((Class475_Sub1_Sub1_Sub5)
						    this).anInt11489
						   * -2007189921),
						  1232200923);
	int i_12_ = class460.anInt6267 * 850723107;
	if (i_12_ != -1) {
	    ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		= new Class409_Sub3(this, false);
	    int i_13_ = class460.aBool6277 ? 0 : 2;
	    if (bool)
		i_13_ = 1;
	    ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		.method7351(i_12_, i_0_, i_13_, false, -1302211377);
	}
	method14465(1, 1644408039);
    }
    
    public Class535 method14457(Class103 class103, int i) {
	return null;
    }
    
    public final void method17931(int i, byte i_14_) {
	if (((Class475_Sub1_Sub1_Sub5) this).aClass409_11488 != null
	    && !((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		    .method7419((byte) 97))
	    ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		.method7411(i, (byte) 1);
    }
    
    public final boolean method17932(int i) {
	return (null != ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		&& !((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
			.method7349(-2033809713));
    }
    
    final boolean method14479() {
	return false;
    }
    
    Class89 method17933(Class103 class103, int i, int i_15_, byte i_16_) {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition(i_15_, 1232200923);
	Class166 class166 = aClass552_8744.aClass166Array7179[nodePlane];
	Class166 class166_17_
	    = (aByte8745 < 3 ? aClass552_8744.aClass166Array7179[aByte8745 + 1]
	       : null);
	Class287 class287 = method10874().aClass287_4386;
	return ((null != ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		 && !((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
			 .method7419((byte) 110))
		? (class460.method10619
		   (class103, i,
		    -1633306624 * ((Class475_Sub1_Sub1_Sub5) this).anInt11484,
		    class166, class166_17_, (int) class287.aFloat4477,
		    (int) class287.aFloat4474, (int) class287.aFloat4479,
		    ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488, (byte) 2,
		    (byte) 65))
		: class460.method10619(class103, i,
				       (((Class475_Sub1_Sub1_Sub5) this)
					.anInt11484) * -1633306624,
				       class166, class166_17_,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4474,
				       (int) class287.aFloat4479, null,
				       (byte) 2, (byte) -14));
    }
    
    public int method14468(byte i) {
	return ((Class475_Sub1_Sub1_Sub5) this).anInt11483 * 115767793;
    }
    
    void method14493(Class103 class103, byte i) {
	Class89 class89
	    = method17933(class103, 0,
			  (-2007189921
			   * ((Class475_Sub1_Sub1_Sub5) this).anInt11489),
			  (byte) -49);
	if (null != class89)
	    method17930(class103, class89, method10893(), 1482319719);
    }
    
    public int method17934(byte i) {
	return ((Class475_Sub1_Sub1_Sub5) this).anInt11485 * -885905749;
    }
    
    final void method14483() {
	throw new IllegalStateException();
    }
    
    boolean method14448(Class103 class103, int i, int i_18_, int i_19_) {
	return false;
    }
    
    boolean method14467() {
	return ((Class475_Sub1_Sub1_Sub5) this).aBool11487;
    }
    
    final void method14453(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_20_, int i_21_, boolean bool,
			   int i_22_) {
	throw new IllegalStateException();
    }
    
    public int method14492() {
	return ((Class475_Sub1_Sub1_Sub5) this).anInt11483 * 115767793;
    }
    
    boolean method14466() {
	return false;
    }
    
    Class542 method14455(Class103 class103, int i) {
	Class89 class89
	    = method17933(class103,
			  0x800 | (-13380425 * ((Class475_Sub1_Sub1_Sub5)
						this).anInt11484 != 0
				   ? 5 : 0),
			  (-2007189921
			   * ((Class475_Sub1_Sub1_Sub5) this).anInt11489),
			  (byte) -76);
	if (null == class89)
	    return null;
	Class266 class266 = method10893();
	method17930(class103, class89, class266, 1482319719);
	Class542 class542 = Class128.method3016(false, -2143014517);
	class89.method1890(class266, aClass97Array8748[0], 0);
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null) {
	    Class98 class98 = ((Class475_Sub1_Sub1_Sub5) this)
				  .aClass489_11486.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub1_Sub5) this).aBool11487 = class89.method2052();
	((Class475_Sub1_Sub1_Sub5) this).anInt11483
	    = class89.method1902() * -1034856687;
	class89.method1894();
	return class542;
    }
    
    boolean method14451() {
	return ((Class475_Sub1_Sub1_Sub5) this).aBool11487;
    }
    
    public void method17935(byte i) {
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null)
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.method11154();
    }
    
    public Class535 method14470(Class103 class103) {
	return null;
    }
    
    Class542 method14472(Class103 class103) {
	Class89 class89
	    = method17933(class103,
			  0x800 | (-13380425 * ((Class475_Sub1_Sub1_Sub5)
						this).anInt11484 != 0
				   ? 5 : 0),
			  (-2007189921
			   * ((Class475_Sub1_Sub1_Sub5) this).anInt11489),
			  (byte) -13);
	if (null == class89)
	    return null;
	Class266 class266 = method10893();
	method17930(class103, class89, class266, 1482319719);
	Class542 class542 = Class128.method3016(false, -2119545190);
	class89.method1890(class266, aClass97Array8748[0], 0);
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null) {
	    Class98 class98 = ((Class475_Sub1_Sub1_Sub5) this)
				  .aClass489_11486.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub1_Sub5) this).aBool11487 = class89.method2052();
	((Class475_Sub1_Sub1_Sub5) this).anInt11483
	    = class89.method1902() * -1034856687;
	class89.method1894();
	return class542;
    }
    
    Class542 method14473(Class103 class103) {
	Class89 class89
	    = method17933(class103,
			  0x800 | (-13380425 * ((Class475_Sub1_Sub1_Sub5)
						this).anInt11484 != 0
				   ? 5 : 0),
			  (-2007189921
			   * ((Class475_Sub1_Sub1_Sub5) this).anInt11489),
			  (byte) -5);
	if (null == class89)
	    return null;
	Class266 class266 = method10893();
	method17930(class103, class89, class266, 1482319719);
	Class542 class542 = Class128.method3016(false, -2087681226);
	class89.method1890(class266, aClass97Array8748[0], 0);
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null) {
	    Class98 class98 = ((Class475_Sub1_Sub1_Sub5) this)
				  .aClass489_11486.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub1_Sub5) this).aBool11487 = class89.method2052();
	((Class475_Sub1_Sub1_Sub5) this).anInt11483
	    = class89.method1902() * -1034856687;
	class89.method1894();
	return class542;
    }
    
    Class542 method14474(Class103 class103) {
	Class89 class89
	    = method17933(class103,
			  0x800 | (-13380425 * ((Class475_Sub1_Sub1_Sub5)
						this).anInt11484 != 0
				   ? 5 : 0),
			  (-2007189921
			   * ((Class475_Sub1_Sub1_Sub5) this).anInt11489),
			  (byte) -94);
	if (null == class89)
	    return null;
	Class266 class266 = method10893();
	method17930(class103, class89, class266, 1482319719);
	Class542 class542 = Class128.method3016(false, -2118779701);
	class89.method1890(class266, aClass97Array8748[0], 0);
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null) {
	    Class98 class98 = ((Class475_Sub1_Sub1_Sub5) this)
				  .aClass489_11486.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub1_Sub5) this).aBool11487 = class89.method2052();
	((Class475_Sub1_Sub1_Sub5) this).anInt11483
	    = class89.method1902() * -1034856687;
	class89.method1894();
	return class542;
    }
    
    Class542 method14475(Class103 class103) {
	Class89 class89
	    = method17933(class103,
			  0x800 | (-13380425 * ((Class475_Sub1_Sub1_Sub5)
						this).anInt11484 != 0
				   ? 5 : 0),
			  (-2007189921
			   * ((Class475_Sub1_Sub1_Sub5) this).anInt11489),
			  (byte) -22);
	if (null == class89)
	    return null;
	Class266 class266 = method10893();
	method17930(class103, class89, class266, 1482319719);
	Class542 class542 = Class128.method3016(false, -2125416139);
	class89.method1890(class266, aClass97Array8748[0], 0);
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null) {
	    Class98 class98 = ((Class475_Sub1_Sub1_Sub5) this)
				  .aClass489_11486.method11164();
	    class103.method2305(class98);
	}
	((Class475_Sub1_Sub1_Sub5) this).aBool11487 = class89.method2052();
	((Class475_Sub1_Sub1_Sub5) this).anInt11483
	    = class89.method1902() * -1034856687;
	class89.method1894();
	return class542;
    }
    
    void method14476(Class103 class103) {
	Class89 class89
	    = method17933(class103, 0,
			  (-2007189921
			   * ((Class475_Sub1_Sub1_Sub5) this).anInt11489),
			  (byte) -122);
	if (null != class89)
	    method17930(class103, class89, method10893(), 1482319719);
    }
    
    final boolean method14477() {
	return false;
    }
    
    final boolean method14456() {
	return false;
    }
    
    public void method17936() {
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null)
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.method11154();
    }
    
    final void method14480(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_23_, int i_24_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method14481(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_25_, int i_26_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method14482(Class103 class103, Class475_Sub1 class475_sub1,
			   int i, int i_27_, int i_28_, boolean bool) {
	throw new IllegalStateException();
    }
    
    public final boolean method17937() {
	return (((Class475_Sub1_Sub1_Sub5) this).aClass409_11488 == null
		|| ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		       .method7419((byte) 41));
    }
    
    final void method14478() {
	throw new IllegalStateException();
    }
    
    boolean method14488(Class103 class103, int i, int i_29_) {
	return false;
    }
    
    public final boolean method17938() {
	return (((Class475_Sub1_Sub1_Sub5) this).aClass409_11488 == null
		|| ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		       .method7419((byte) 122));
    }
    
    public final void method17939(int i) {
	if (((Class475_Sub1_Sub1_Sub5) this).aClass409_11488 != null
	    && !((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		    .method7419((byte) 51))
	    ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		.method7411(i, (byte) 1);
    }
    
    Class89 method17940(Class103 class103, int i, int i_30_) {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition(i_30_, 1232200923);
	Class166 class166 = aClass552_8744.aClass166Array7179[nodePlane];
	Class166 class166_31_
	    = (aByte8745 < 3 ? aClass552_8744.aClass166Array7179[aByte8745 + 1]
	       : null);
	Class287 class287 = method10874().aClass287_4386;
	return ((null != ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		 && !((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
			 .method7419((byte) 87))
		? (class460.method10619
		   (class103, i,
		    -1633306624 * ((Class475_Sub1_Sub1_Sub5) this).anInt11484,
		    class166, class166_31_, (int) class287.aFloat4477,
		    (int) class287.aFloat4474, (int) class287.aFloat4479,
		    ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488, (byte) 2,
		    (byte) 33))
		: class460.method10619(class103, i,
				       (((Class475_Sub1_Sub1_Sub5) this)
					.anInt11484) * -1633306624,
				       class166, class166_31_,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4474,
				       (int) class287.aFloat4479, null,
				       (byte) 2, (byte) 5));
    }
    
    public void method17941() {
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null)
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.method11154();
    }
    
    public final boolean method17942() {
	return (((Class475_Sub1_Sub1_Sub5) this).aClass409_11488 == null
		|| ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		       .method7419((byte) 2));
    }
    
    final void method14454(byte i) {
	throw new IllegalStateException();
    }
    
    Class89 method17943(Class103 class103, int i, int i_32_) {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition(i_32_, 1232200923);
	Class166 class166 = aClass552_8744.aClass166Array7179[nodePlane];
	Class166 class166_33_
	    = (aByte8745 < 3 ? aClass552_8744.aClass166Array7179[aByte8745 + 1]
	       : null);
	Class287 class287 = method10874().aClass287_4386;
	return ((null != ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		 && !((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
			 .method7419((byte) 82))
		? (class460.method10619
		   (class103, i,
		    -1633306624 * ((Class475_Sub1_Sub1_Sub5) this).anInt11484,
		    class166, class166_33_, (int) class287.aFloat4477,
		    (int) class287.aFloat4474, (int) class287.aFloat4479,
		    ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488, (byte) 2,
		    (byte) 52))
		: class460.method10619(class103, i,
				       (((Class475_Sub1_Sub1_Sub5) this)
					.anInt11484) * -1633306624,
				       class166, class166_33_,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4474,
				       (int) class287.aFloat4479, null,
				       (byte) 2, (byte) 21));
    }
    
    public void method17944() {
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null)
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.method11154();
    }
    
    Class89 method17945(Class103 class103, int i, int i_34_) {
	GraphicsDefinition class460
	    = Class240.graphicsDefLoader.getGraphicsDefinition(i_34_, 1232200923);
	Class166 class166 = aClass552_8744.aClass166Array7179[nodePlane];
	Class166 class166_35_
	    = (aByte8745 < 3 ? aClass552_8744.aClass166Array7179[aByte8745 + 1]
	       : null);
	Class287 class287 = method10874().aClass287_4386;
	return ((null != ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		 && !((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
			 .method7419((byte) 118))
		? (class460.method10619
		   (class103, i,
		    -1633306624 * ((Class475_Sub1_Sub1_Sub5) this).anInt11484,
		    class166, class166_35_, (int) class287.aFloat4477,
		    (int) class287.aFloat4474, (int) class287.aFloat4479,
		    ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488, (byte) 2,
		    (byte) -11))
		: class460.method10619(class103, i,
				       (((Class475_Sub1_Sub1_Sub5) this)
					.anInt11484) * -1633306624,
				       class166, class166_35_,
				       (int) class287.aFloat4477,
				       (int) class287.aFloat4474,
				       (int) class287.aFloat4479, null,
				       (byte) 2, (byte) 44));
    }
    
    void method17946(Class103 class103, Class89 class89, Class266 class266) {
	class89.method1915(class266);
	Class106[] class106s = class89.method2051();
	Class167[] class167s = class89.method1917();
	if ((((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 == null
	     || ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.aBool6487)
	    && (null != class106s || null != class167s))
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486
		= Class489.method11182(client.anInt8296, true);
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null) {
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.method11158
		(class103, (long) client.anInt8296, class106s, class167s,
		 false);
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.method11162
		(nodePlane, aShort10717, aShort10716, aShort10718,
		 aShort10719);
	}
    }
    
    void method17947(Class103 class103, Class89 class89, Class266 class266) {
	class89.method1915(class266);
	Class106[] class106s = class89.method2051();
	Class167[] class167s = class89.method1917();
	if ((((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 == null
	     || ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.aBool6487)
	    && (null != class106s || null != class167s))
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486
		= Class489.method11182(client.anInt8296, true);
	if (((Class475_Sub1_Sub1_Sub5) this).aClass489_11486 != null) {
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.method11158
		(class103, (long) client.anInt8296, class106s, class167s,
		 false);
	    ((Class475_Sub1_Sub1_Sub5) this).aClass489_11486.method11162
		(nodePlane, aShort10717, aShort10716, aShort10718,
		 aShort10719);
	}
    }
    
    public int method17948() {
	return ((Class475_Sub1_Sub1_Sub5) this).anInt11485 * -885905749;
    }
    
    public final boolean method17949(byte i) {
	return (((Class475_Sub1_Sub1_Sub5) this).aClass409_11488 == null
		|| ((Class475_Sub1_Sub1_Sub5) this).aClass409_11488
		       .method7419((byte) 50));
    }
    
    boolean method14469(byte i) {
	return false;
    }
}
