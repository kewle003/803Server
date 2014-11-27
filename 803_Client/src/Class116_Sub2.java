/* Class116_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class116_Sub2 extends Class116
{
    boolean aBool10607;
    Class55_Sub1 aClass55_Sub1_10608;
    Class103_Sub3_Sub1 aClass103_Sub3_Sub1_10609;
    
    public void method2844() {
	if (((Class116_Sub2) this).aClass55_Sub1_10608 == null)
	    throw new RuntimeException_Sub5();
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17461
	    (((Class55_Sub1) ((Class116_Sub2) this).aClass55_Sub1_10608)
	     .aLong9848);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17462
	    (((Class55_Sub1) ((Class116_Sub2) this).aClass55_Sub1_10608)
	     .aLong9842);
	((Class103_Sub3_Sub1) ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609)
	    .aClass55_Sub1_11096
	    = ((Class116_Sub2) this).aClass55_Sub1_10608;
	((Class116_Sub2) this).aBool10607 = true;
    }
    
    Class55 method2812(Class103_Sub3 class103_sub3, Class117 class117) {
	return new Class55_Sub1((Class103_Sub3_Sub1) class103_sub3, this,
				class117);
    }
    
    public boolean method2895(Class55 class55) {
	if (((Class116_Sub2) this).aClass55_Sub1_10608 == class55)
	    return true;
	if (!class55.method1311())
	    return false;
	((Class116_Sub2) this).aClass55_Sub1_10608 = (Class55_Sub1) class55;
	anInt1543 = method2813(class55, (byte) -103) * 1106389913;
	if (anInt1543 * -1423050583 == -1)
	    throw new IllegalArgumentException();
	if (((Class116_Sub2) this).aBool10607) {
	    ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17461
		(((Class55_Sub1) ((Class116_Sub2) this).aClass55_Sub1_10608)
		 .aLong9848);
	    ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17462
		(((Class55_Sub1) ((Class116_Sub2) this).aClass55_Sub1_10608)
		 .aLong9842);
	    ((Class103_Sub3_Sub1)
	     ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609)
		.aClass55_Sub1_11096
		= ((Class116_Sub2) this).aClass55_Sub1_10608;
	}
	return true;
    }
    
    Class241_Sub23_Sub1 method2896(Class115 class115) {
	return new Class241_Sub23_Sub1_Sub1(this, class115);
    }
    
    public void method2805() {
	if (((Class116_Sub2) this).aClass55_Sub1_10608 == null)
	    throw new RuntimeException_Sub5();
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17461
	    (((Class55_Sub1) ((Class116_Sub2) this).aClass55_Sub1_10608)
	     .aLong9848);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17462
	    (((Class55_Sub1) ((Class116_Sub2) this).aClass55_Sub1_10608)
	     .aLong9842);
	((Class103_Sub3_Sub1) ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609)
	    .aClass55_Sub1_11096
	    = ((Class116_Sub2) this).aClass55_Sub1_10608;
	((Class116_Sub2) this).aBool10607 = true;
    }
    
    public void method2911() {
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17461(0L);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17462(0L);
	((Class116_Sub2) this).aBool10607 = false;
	((Class103_Sub3_Sub1) ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609)
	    .aClass55_Sub1_11096
	    = null;
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method15686(1);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method15856(null);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method15686(0);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method15856(null);
    }
    
    public boolean method2874() {
	return ((((Class103_Sub3_Sub1)
		  ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609)
		 .aClass55_Sub1_11096)
		== ((Class116_Sub2) this).aClass55_Sub1_10608);
    }
    
    Class116_Sub2(Class103_Sub3_Sub1 class103_sub3_sub1, Class47 class47) {
	super((Class103_Sub3) class103_sub3_sub1, class47);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609 = class103_sub3_sub1;
	((Class116_Sub2) this).aBool10607 = false;
    }
    
    public void method2845() {
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17461(0L);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17462(0L);
	((Class116_Sub2) this).aBool10607 = false;
	((Class103_Sub3_Sub1) ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609)
	    .aClass55_Sub1_11096
	    = null;
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method15686(1);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method15856(null);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method15686(0);
	((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method15856(null);
    }
    
    public boolean method2846() {
	return ((((Class103_Sub3_Sub1)
		  ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609)
		 .aClass55_Sub1_11096)
		== ((Class116_Sub2) this).aClass55_Sub1_10608);
    }
    
    Class55 method2836(Class103_Sub3 class103_sub3, Class117 class117) {
	return new Class55_Sub1((Class103_Sub3_Sub1) class103_sub3, this,
				class117);
    }
    
    public boolean method2860(Class55 class55) {
	if (((Class116_Sub2) this).aClass55_Sub1_10608 == class55)
	    return true;
	if (!class55.method1311())
	    return false;
	((Class116_Sub2) this).aClass55_Sub1_10608 = (Class55_Sub1) class55;
	anInt1543 = method2813(class55, (byte) -106) * 1106389913;
	if (anInt1543 * -1423050583 == -1)
	    throw new IllegalArgumentException();
	if (((Class116_Sub2) this).aBool10607) {
	    ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17461
		(((Class55_Sub1) ((Class116_Sub2) this).aClass55_Sub1_10608)
		 .aLong9848);
	    ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17462
		(((Class55_Sub1) ((Class116_Sub2) this).aClass55_Sub1_10608)
		 .aLong9842);
	    ((Class103_Sub3_Sub1)
	     ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609)
		.aClass55_Sub1_11096
		= ((Class116_Sub2) this).aClass55_Sub1_10608;
	}
	return true;
    }
    
    public boolean method2855(Class55 class55) {
	if (((Class116_Sub2) this).aClass55_Sub1_10608 == class55)
	    return true;
	if (!class55.method1311())
	    return false;
	((Class116_Sub2) this).aClass55_Sub1_10608 = (Class55_Sub1) class55;
	anInt1543 = method2813(class55, (byte) -54) * 1106389913;
	if (anInt1543 * -1423050583 == -1)
	    throw new IllegalArgumentException();
	if (((Class116_Sub2) this).aBool10607) {
	    ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17461
		(((Class55_Sub1) ((Class116_Sub2) this).aClass55_Sub1_10608)
		 .aLong9848);
	    ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609.method17462
		(((Class55_Sub1) ((Class116_Sub2) this).aClass55_Sub1_10608)
		 .aLong9842);
	    ((Class103_Sub3_Sub1)
	     ((Class116_Sub2) this).aClass103_Sub3_Sub1_10609)
		.aClass55_Sub1_11096
		= ((Class116_Sub2) this).aClass55_Sub1_10608;
	}
	return true;
    }
    
    Class241_Sub23_Sub1 method2863(Class115 class115) {
	return new Class241_Sub23_Sub1_Sub1(this, class115);
    }
}
