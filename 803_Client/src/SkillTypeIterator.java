/* Class492 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class SkillTypeIterator implements Iterator<Skill>
{
    Skill[] skills;//aClass511Array6515
    int pointer;//anInt6516
    
    public Object method11248() {
    	return (skills[((pointer += -1447900033) * -1882131585 - 1)]);
    }
    
    public void method11249() {
    	throw new UnsupportedOperationException();
    }
    
    public boolean method11250() {
    	return (-1882131585 * pointer < skills.length);
    }
    
    public void remove() {
    	throw new UnsupportedOperationException();
    }
    
    public boolean method11251() {
	return (-1882131585 * pointer
		< skills.length);
    }
    
    public boolean method11252() {
	return (-1882131585 * pointer
		< skills.length);
    }
    
    public boolean hasNext() {
    	return (-1882131585 * pointer < skills.length);
    }
    
    public boolean method11253() {
    	return (-1882131585 * pointer < skills.length);
    }
    
    public Skill next() {
    	return (skills[((pointer += -1447900033) * -1882131585 - 1)]);
    }
    
    SkillTypeIterator(Skill[] skills) {
    	this.skills = skills;
    }
    
    public void method11254() {
    	throw new UnsupportedOperationException();
    }
    
    public void method11255() {
    	throw new UnsupportedOperationException();
    }
    
    public Object method11256() {
    	return (skills[((pointer += -1447900033) * -1882131585 - 1)]);
    }
    
    static String method11257(Class241_Sub39_Sub11 class241_sub39_sub11,
			      byte i) {
	if (null == ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
	    || ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
		   .length() == 0) {
	    if ((null
		 != ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869)
		&& ((Class241_Sub39_Sub11) class241_sub39_sub11)
		       .aString10869.length() > 0)
		return new StringBuilder().append
			   (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aString10871)
			   .append
			   (ClientMessage.MINISEPERATOR.getLocalisedMessage
			    (VarPlayerDomain.currentLocale, (short) 20349))
			   .append
			   (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aString10869)
			   .toString();
	    return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10871;
	}
	if (null != ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869
	    && ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869
		   .length() > 0)
	    return new StringBuilder().append
		       (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aString10871)
		       .append
		       (ClientMessage.MINISEPERATOR.getLocalisedMessage((VarPlayerDomain
							     .currentLocale),
							    (short) 24344))
		       .append
		       (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aString10869)
		       .append
		       (ClientMessage.MINISEPERATOR.getLocalisedMessage((VarPlayerDomain
							     .currentLocale),
							    (short) 28088))
		       .append
		       (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aString10880)
		       .toString();
	return new StringBuilder().append
		   (((Class241_Sub39_Sub11) class241_sub39_sub11).aString10871)
		   .append
		   (ClientMessage.MINISEPERATOR
			.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 27934))
		   .append
		   (((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880)
		   .toString();
    }
    
    static final void method11258(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (-1 == i_0_) {
	    int i_1_ = i_0_ >> 14 & 0x3fff;
	    int i_2_ = i_0_ & 0x3fff;
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    i_1_ -= class522.baseX * 127679513;
	    if (i_1_ < 0)
		i_1_ = 0;
	    else if (i_1_ >= client.aClass238_8477.method4744(-1490294740))
		i_1_ = client.aClass238_8477.method4744(-1705746057);
	    i_2_ -= 468558693 * class522.baseY;
	    if (i_2_ < 0)
		i_2_ = 0;
	    else if (i_2_ >= client.aClass238_8477.method4745(-426814134))
		i_2_ = client.aClass238_8477.method4745(-33201399);
	    Class245.anInt3961 = ((i_1_ << 9) + 256) * 1540801703;
	    Class254.anInt4134 = 162819257 * (256 + (i_2_ << 9));
	} else {
	    Class245.anInt3961 = -1540801703;
	    Class254.anInt4134 = -162819257;
	}
    }
    
    static final void method11259(ClientScriptData class454, byte i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class287 class287
	    = Class287.method5561((float) i_3_, (float) i_3_, (float) i_3_);
	Class445_Sub16.aClass351_Sub1_8660.method6268(class287, (byte) 72);
	class287.method5564();
    }
    
    static final void method11260(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub6_8889,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	Class167.method3600((short) 12773);
	client.aBool8297 = false;
    }
    
    static final void method11261(ClientScriptData class454, int i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub21_8853
		  .method7880(i_4_, 996762312);
    }
}
