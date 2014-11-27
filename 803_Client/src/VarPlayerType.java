/* Class179_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarPlayerType extends VarType
{
    public int clientCode;//anInt10003
    
    VarPlayerType(VarDomainType class218, int i) {
    	super(class218, i);
    }
    
    void decode(RSByteBuffer buffer, int i, int i_0_) {
		Class621 class621 = (Class621) Class531.method11848(Class92.method2076(-1864051103),
						      i, 399823728);
		if (class621 == Class621.aClass621_7869) {
		    clientCode = buffer.readUnsignedShort(1162222719) * -644109393;
		}
    }
    
    void method3768(RSByteBuffer class241_sub3, int i) {
	Class621 class621
	    = (Class621) Class531.method11848(Class92.method2076(-36944744), i,
					      1377164990);
	if (class621 == Class621.aClass621_7869)
	    clientCode = class241_sub3.readUnsignedShort(1162222719) * -644109393;
    }
}
