/* Class444 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class444
{
    boolean aBool6166 = false;
    int anInt6167;
    int anInt6168;
    int anInt6169;
    Class241_Sub39_Sub2 aClass241_Sub39_Sub2_6170;
    Class241_Sub39_Sub2 aClass241_Sub39_Sub2_6171;
    
    final void method7872() {
	((Class444) this).aBool6166 = false;
	((Class444) this).anInt6169 = 0;
	((Class444) this).aClass241_Sub39_Sub2_6170 = null;
	((Class444) this).aClass241_Sub39_Sub2_6171 = null;
    }
    
    final boolean method7873(AnimationDefinitionLoader class556, AnimationDefinition class549, int i,
			     int i_0_, int[] is, int i_1_) {
	if (!((Class444) this).aBool6166) {
	    if (i >= is.length)
		return false;
	    ((Class444) this).anInt6167 = is[i] * -929923025;
	    ((Class444) this).aClass241_Sub39_Sub2_6171
		= class556.method12297((1417332431
					* ((Class444) this).anInt6167) >> 16,
				       -1595562254);
	    ((Class444) this).anInt6167
		= -929923025 * (((Class444) this).anInt6167 * 1417332431
				& 0xffff);
	    if (null != ((Class444) this).aClass241_Sub39_Sub2_6171) {
		if (class549.aBool7066 && i_0_ != -1 && i_0_ < is.length) {
		    ((Class444) this).anInt6168 = is[i_0_] * 99606593;
		    ((Class444) this).aClass241_Sub39_Sub2_6170
			= class556.method12297((((Class444) this).anInt6168
						* -1124323391) >> 16,
					       -1766509969);
		    ((Class444) this).anInt6168
			= 99606593 * (((Class444) this).anInt6168 * -1124323391
				      & 0xffff);
		}
		if (class549.aBool7083)
		    ((Class444) this).anInt6169
			= ((((Class444) this).anInt6169 * 258215707 | 0x200)
			   * 406434579);
		if (((Class444) this).aClass241_Sub39_Sub2_6171.method17083
		    (1417332431 * ((Class444) this).anInt6167, (byte) 18))
		    ((Class444) this).anInt6169
			= 406434579 * (((Class444) this).anInt6169 * 258215707
				       | 0x80);
		if (((Class444) this).aClass241_Sub39_Sub2_6171.method17085
		    (((Class444) this).anInt6167 * 1417332431, 38749486))
		    ((Class444) this).anInt6169
			= 406434579 * (((Class444) this).anInt6169 * 258215707
				       | 0x100);
		if (((Class444) this).aClass241_Sub39_Sub2_6171.method17090
		    (((Class444) this).anInt6167 * 1417332431, (byte) -93))
		    ((Class444) this).anInt6169
			= ((258215707 * ((Class444) this).anInt6169 | 0x400)
			   * 406434579);
		if (null != ((Class444) this).aClass241_Sub39_Sub2_6170) {
		    if (((Class444) this).aClass241_Sub39_Sub2_6170.method17083
			(((Class444) this).anInt6168 * -1124323391, (byte) 18))
			((Class444) this).anInt6169
			    = ((258215707 * ((Class444) this).anInt6169 | 0x80)
			       * 406434579);
		    if (((Class444) this).aClass241_Sub39_Sub2_6170.method17085
			(((Class444) this).anInt6168 * -1124323391,
			 -1320269023))
			((Class444) this).anInt6169
			    = (258215707 * ((Class444) this).anInt6169
			       | 0x100) * 406434579;
		    if (((Class444) this).aClass241_Sub39_Sub2_6170.method17090
			(-1124323391 * ((Class444) this).anInt6168,
			 (byte) -117))
			((Class444) this).anInt6169
			    = (((Class444) this).anInt6169 * 258215707
			       | 0x400) * 406434579;
		}
		((Class444) this).anInt6169
		    = ((258215707 * ((Class444) this).anInt6169 | 0x20)
		       * 406434579);
		((Class444) this).aBool6166 = true;
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    Class444() {
	/* empty */
    }
    
    final boolean method7874(AnimationDefinitionLoader class556, AnimationDefinition class549, int i,
			     int i_2_, int[] is) {
	if (!((Class444) this).aBool6166) {
	    if (i >= is.length)
		return false;
	    ((Class444) this).anInt6167 = is[i] * -929923025;
	    ((Class444) this).aClass241_Sub39_Sub2_6171
		= class556.method12297((1417332431
					* ((Class444) this).anInt6167) >> 16,
				       -1939481838);
	    ((Class444) this).anInt6167
		= -929923025 * (((Class444) this).anInt6167 * 1417332431
				& 0xffff);
	    if (null != ((Class444) this).aClass241_Sub39_Sub2_6171) {
		if (class549.aBool7066 && i_2_ != -1 && i_2_ < is.length) {
		    ((Class444) this).anInt6168 = is[i_2_] * 99606593;
		    ((Class444) this).aClass241_Sub39_Sub2_6170
			= class556.method12297((((Class444) this).anInt6168
						* -1124323391) >> 16,
					       -1380649140);
		    ((Class444) this).anInt6168
			= 99606593 * (((Class444) this).anInt6168 * -1124323391
				      & 0xffff);
		}
		if (class549.aBool7083)
		    ((Class444) this).anInt6169
			= ((((Class444) this).anInt6169 * 258215707 | 0x200)
			   * 406434579);
		if (((Class444) this).aClass241_Sub39_Sub2_6171.method17083
		    (1417332431 * ((Class444) this).anInt6167, (byte) 18))
		    ((Class444) this).anInt6169
			= 406434579 * (((Class444) this).anInt6169 * 258215707
				       | 0x80);
		if (((Class444) this).aClass241_Sub39_Sub2_6171.method17085
		    (((Class444) this).anInt6167 * 1417332431, 309230247))
		    ((Class444) this).anInt6169
			= 406434579 * (((Class444) this).anInt6169 * 258215707
				       | 0x100);
		if (((Class444) this).aClass241_Sub39_Sub2_6171.method17090
		    (((Class444) this).anInt6167 * 1417332431, (byte) -90))
		    ((Class444) this).anInt6169
			= ((258215707 * ((Class444) this).anInt6169 | 0x400)
			   * 406434579);
		if (null != ((Class444) this).aClass241_Sub39_Sub2_6170) {
		    if (((Class444) this).aClass241_Sub39_Sub2_6170.method17083
			(((Class444) this).anInt6168 * -1124323391, (byte) 18))
			((Class444) this).anInt6169
			    = ((258215707 * ((Class444) this).anInt6169 | 0x80)
			       * 406434579);
		    if (((Class444) this).aClass241_Sub39_Sub2_6170.method17085
			(((Class444) this).anInt6168 * -1124323391, 500174495))
			((Class444) this).anInt6169
			    = (258215707 * ((Class444) this).anInt6169
			       | 0x100) * 406434579;
		    if (((Class444) this).aClass241_Sub39_Sub2_6170.method17090
			(-1124323391 * ((Class444) this).anInt6168,
			 (byte) -44))
			((Class444) this).anInt6169
			    = (((Class444) this).anInt6169 * 258215707
			       | 0x400) * 406434579;
		}
		((Class444) this).anInt6169
		    = ((258215707 * ((Class444) this).anInt6169 | 0x20)
		       * 406434579);
		((Class444) this).aBool6166 = true;
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    final void method7875() {
	((Class444) this).aBool6166 = false;
	((Class444) this).anInt6169 = 0;
	((Class444) this).aClass241_Sub39_Sub2_6170 = null;
	((Class444) this).aClass241_Sub39_Sub2_6171 = null;
    }
    
    final void method7876() {
	((Class444) this).aBool6166 = false;
	((Class444) this).anInt6169 = 0;
	((Class444) this).aClass241_Sub39_Sub2_6170 = null;
	((Class444) this).aClass241_Sub39_Sub2_6171 = null;
    }
    
    final void method7877(byte i) {
	((Class444) this).aBool6166 = false;
	((Class444) this).anInt6169 = 0;
	((Class444) this).aClass241_Sub39_Sub2_6170 = null;
	((Class444) this).aClass241_Sub39_Sub2_6171 = null;
    }
}
