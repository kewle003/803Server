/* Class241_Sub23_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class241_Sub23_Sub1_Sub2 extends Class241_Sub23_Sub1
{
    int[] anIntArray11490 = null;
    Class116_Sub1 aClass116_Sub1_11491;
    
    final int method17950() {
	return (((Class241_Sub23_Sub1_Sub2) this).anIntArray11490
		[((Class241_Sub23_Sub1_Sub2) this).aClass116_Sub1_11491
		     .method2816(-1460490023)]);
    }
    
    public boolean method17403(int i) {
	if (((Class241_Sub23_Sub1_Sub2) this).anIntArray11490 == null)
	    ((Class241_Sub23_Sub1_Sub2) this).anIntArray11490
		= new int[((Class241_Sub23_Sub1_Sub2) this)
			      .aClass116_Sub1_11491.method2806(1819869598)];
	Class55_Sub2 class55_sub2
	    = ((Class55_Sub2)
	       ((Class241_Sub23_Sub1_Sub2) this).aClass116_Sub1_11491
		   .method2898(i, 956802464));
	((Class241_Sub23_Sub1_Sub2) this).anIntArray11490[i]
	    = OpenGL.glGetUniformLocation((((Class55_Sub2) class55_sub2)
					   .anInt10548),
					  method17402(-1024548672));
	return ((Class241_Sub23_Sub1_Sub2) this).anIntArray11490[i] != -1;
    }
    
    public final int method17404(int i) {
	return ((Class241_Sub23_Sub1_Sub2) this).anIntArray11490[i];
    }
    
    public final int method17408(int i) {
	return ((Class241_Sub23_Sub1_Sub2) this).anIntArray11490[i];
    }
    
    public boolean method17409(int i) {
	if (((Class241_Sub23_Sub1_Sub2) this).anIntArray11490 == null)
	    ((Class241_Sub23_Sub1_Sub2) this).anIntArray11490
		= new int[((Class241_Sub23_Sub1_Sub2) this)
			      .aClass116_Sub1_11491.method2806(-1453602423)];
	Class55_Sub2 class55_sub2
	    = ((Class55_Sub2)
	       ((Class241_Sub23_Sub1_Sub2) this).aClass116_Sub1_11491
		   .method2898(i, 1167852275));
	((Class241_Sub23_Sub1_Sub2) this).anIntArray11490[i]
	    = OpenGL.glGetUniformLocation((((Class55_Sub2) class55_sub2)
					   .anInt10548),
					  method17402(-1024548672));
	return ((Class241_Sub23_Sub1_Sub2) this).anIntArray11490[i] != -1;
    }
    
    public final int method17420(int i) {
	return ((Class241_Sub23_Sub1_Sub2) this).anIntArray11490[i];
    }
    
    final int method17951() {
	return (((Class241_Sub23_Sub1_Sub2) this).anIntArray11490
		[((Class241_Sub23_Sub1_Sub2) this).aClass116_Sub1_11491
		     .method2816(2006258750)]);
    }
    
    Class241_Sub23_Sub1_Sub2(Class116_Sub1 class116_sub1, Class115 class115) {
	super(class115);
	((Class241_Sub23_Sub1_Sub2) this).aClass116_Sub1_11491 = class116_sub1;
    }
    
    final int method17952() {
	return (((Class241_Sub23_Sub1_Sub2) this).anIntArray11490
		[((Class241_Sub23_Sub1_Sub2) this).aClass116_Sub1_11491
		     .method2816(1578744340)]);
    }
}
