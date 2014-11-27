/* Class241_Sub40_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class Class241_Sub40_Sub2 extends Class241_Sub40
{
    boolean aBool10881;
    DecoderContext aDecoderContext10882;
    SetupInfo aSetupInfo10883 = new SetupInfo();
    TheoraInfo aTheoraInfo10884 = new TheoraInfo();
    TheoraComment aTheoraComment10885 = new TheoraComment();
    static final int anInt10886 = 2048;
    GranulePos aGranulePos10887;
    Frame aFrame10888;
    double aDouble10889;
    long aLong10890;
    boolean aBool10891;
    boolean aBool10892;
    Object anObject10893;
    int anInt10894;
    boolean aBool10895;
    static final int anInt10896 = 1024;
    int anInt10897;
    
    void method16444() {
	if (null != ((Class241_Sub40_Sub2) this).aFrame10888)
	    ((Class241_Sub40_Sub2) this).aFrame10888.method7216();
	if (null != ((Class241_Sub40_Sub2) this).aDecoderContext10882) {
	    ((Class241_Sub40_Sub2) this).aDecoderContext10882.method7216();
	    ((Class241_Sub40_Sub2) this).aDecoderContext10882 = null;
	}
	if (null != ((Class241_Sub40_Sub2) this).aGranulePos10887) {
	    ((Class241_Sub40_Sub2) this).aGranulePos10887.method7216();
	    ((Class241_Sub40_Sub2) this).aGranulePos10887 = null;
	}
	((Class241_Sub40_Sub2) this).aTheoraInfo10884.method7216();
	((Class241_Sub40_Sub2) this).aTheoraComment10885.method7216();
	((Class241_Sub40_Sub2) this).aSetupInfo10883.method7216();
    }
    
    public Object method17215(Interface23 interface23, int i) {
	if (null == ((Class241_Sub40_Sub2) this).aFrame10888)
	    return null;
	if (!((Class241_Sub40_Sub2) this).aBool10881
	    && ((Class241_Sub40_Sub2) this).anObject10893 != null)
	    return ((Class241_Sub40_Sub2) this).anObject10893;
	((Class241_Sub40_Sub2) this).anObject10893
	    = interface23.method136((((Class241_Sub40_Sub2) this).aFrame10888
				     .pixels),
				    0,
				    -2139589589 * (((Class241_Sub40_Sub2) this)
						   .aFrame10888.anInt10632),
				    -2139589589 * (((Class241_Sub40_Sub2) this)
						   .aFrame10888.anInt10632),
				    (((Class241_Sub40_Sub2) this).aFrame10888
				     .anInt10633) * -201002823,
				    false, -1646347616);
	((Class241_Sub40_Sub2) this).aBool10881 = false;
	return ((Class241_Sub40_Sub2) this).anObject10893;
    }
    
    double method17216() {
	return ((Class241_Sub40_Sub2) this).aDouble10889;
    }
    
    boolean method17217(int i) {
	return ((Class241_Sub40_Sub2) this).aBool10891;
    }
    
    double method17218(int i) {
	return ((Class241_Sub40_Sub2) this).aDouble10889;
    }
    
    long method17219(byte i) {
	return -4037113471239536901L * ((Class241_Sub40_Sub2) this).aLong10890;
    }
    
    void method17220(int i) {
	((Class241_Sub40_Sub2) this).anInt10894 = -1105697027 * i;
	if (((Class241_Sub40_Sub2) this).aBool10891) {
	    if (-1621006763 * ((Class241_Sub40_Sub2) this).anInt10894
		> ((Class241_Sub40_Sub2) this).anInt10897 * 1022849793)
		((Class241_Sub40_Sub2) this).anInt10894
		    = ((Class241_Sub40_Sub2) this).anInt10897 * 1584860669;
	    if (-1621006763 * ((Class241_Sub40_Sub2) this).anInt10894 < 0)
		((Class241_Sub40_Sub2) this).anInt10894 = 0;
	    ((Class241_Sub40_Sub2) this).aDecoderContext10882
		.setPostProcessingLevel
		(-1621006763 * ((Class241_Sub40_Sub2) this).anInt10894);
	}
    }
    
    void method16445(int i) {
	if (null != ((Class241_Sub40_Sub2) this).aFrame10888)
	    ((Class241_Sub40_Sub2) this).aFrame10888.method7216();
	if (null != ((Class241_Sub40_Sub2) this).aDecoderContext10882) {
	    ((Class241_Sub40_Sub2) this).aDecoderContext10882.method7216();
	    ((Class241_Sub40_Sub2) this).aDecoderContext10882 = null;
	}
	if (null != ((Class241_Sub40_Sub2) this).aGranulePos10887) {
	    ((Class241_Sub40_Sub2) this).aGranulePos10887.method7216();
	    ((Class241_Sub40_Sub2) this).aGranulePos10887 = null;
	}
	((Class241_Sub40_Sub2) this).aTheoraInfo10884.method7216();
	((Class241_Sub40_Sub2) this).aTheoraComment10885.method7216();
	((Class241_Sub40_Sub2) this).aSetupInfo10883.method7216();
    }
    
    float method17221() {
	if (!((Class241_Sub40_Sub2) this).aBool10891
	    || ((Class241_Sub40_Sub2) this).aTheoraInfo10884.method7215())
	    return 0.0F;
	return ((float) (((Class241_Sub40_Sub2) this).aTheoraInfo10884
			 .fpsNumerator)
		/ (float) (((Class241_Sub40_Sub2) this).aTheoraInfo10884
			   .fpsDenominator));
    }
    
    double method17222() {
	return ((Class241_Sub40_Sub2) this).aDouble10889;
    }
    
    long method17223() {
	return -4037113471239536901L * ((Class241_Sub40_Sub2) this).aLong10890;
    }
    
    void method17224(int i, int i_0_) {
	((Class241_Sub40_Sub2) this).anInt10894 = -1105697027 * i;
	if (((Class241_Sub40_Sub2) this).aBool10891) {
	    if (-1621006763 * ((Class241_Sub40_Sub2) this).anInt10894
		> ((Class241_Sub40_Sub2) this).anInt10897 * 1022849793)
		((Class241_Sub40_Sub2) this).anInt10894
		    = ((Class241_Sub40_Sub2) this).anInt10897 * 1584860669;
	    if (-1621006763 * ((Class241_Sub40_Sub2) this).anInt10894 < 0)
		((Class241_Sub40_Sub2) this).anInt10894 = 0;
	    ((Class241_Sub40_Sub2) this).aDecoderContext10882
		.setPostProcessingLevel
		(-1621006763 * ((Class241_Sub40_Sub2) this).anInt10894);
	}
    }
    
    void method16442(OggPacket oggpacket) {
	if (!((Class241_Sub40_Sub2) this).aBool10891) {
	    int i = (((Class241_Sub40_Sub2) this).aSetupInfo10883.decodeHeader
		     (((Class241_Sub40_Sub2) this).aTheoraInfo10884,
		      ((Class241_Sub40_Sub2) this).aTheoraComment10885,
		      oggpacket));
	    if (i == 0) {
		((Class241_Sub40_Sub2) this).aBool10891 = true;
		if ((((Class241_Sub40_Sub2) this).aTheoraInfo10884.frameWidth
		     > 2048)
		    || (((Class241_Sub40_Sub2) this).aTheoraInfo10884
			.frameHeight) > 1024)
		    throw new IllegalStateException();
		((Class241_Sub40_Sub2) this).aDecoderContext10882
		    = new DecoderContext((((Class241_Sub40_Sub2) this)
					  .aTheoraInfo10884),
					 (((Class241_Sub40_Sub2) this)
					  .aSetupInfo10883));
		((Class241_Sub40_Sub2) this).aGranulePos10887
		    = new GranulePos();
		((Class241_Sub40_Sub2) this).aFrame10888
		    = new Frame((((Class241_Sub40_Sub2) this).aTheoraInfo10884
				 .frameWidth),
				(((Class241_Sub40_Sub2) this).aTheoraInfo10884
				 .frameHeight));
		((Class241_Sub40_Sub2) this).anInt10897
		    = ((Class241_Sub40_Sub2) this).aDecoderContext10882
			  .getMaxPostProcessingLevel() * -172913407;
		method17224((-1621006763
			     * ((Class241_Sub40_Sub2) this).anInt10894),
			    355599501);
	    } else if (i < 0)
		throw new IllegalStateException(new StringBuilder().append
						    ("").append
						    (i).toString());
	} else {
	    ((Class241_Sub40_Sub2) this).aLong10890
		= Class50.method1249((byte) 1) * 6626114899665329203L;
	    int i
		= (((Class241_Sub40_Sub2) this).aDecoderContext10882
		       .decodePacketIn
		   (oggpacket, ((Class241_Sub40_Sub2) this).aGranulePos10887));
	    if (i < 0)
		throw new IllegalStateException(new StringBuilder().append
						    ("").append
						    (i).toString());
	    ((Class241_Sub40_Sub2) this).aDecoderContext10882
		.granuleFrame(((Class241_Sub40_Sub2) this).aGranulePos10887);
	    ((Class241_Sub40_Sub2) this).aDouble10889
		= (((Class241_Sub40_Sub2) this).aDecoderContext10882
		       .granuleTime
		   (((Class241_Sub40_Sub2) this).aGranulePos10887));
	    if (((Class241_Sub40_Sub2) this).aBool10895) {
		boolean bool = oggpacket.isKeyFrame() == 1;
		if (bool)
		    ((Class241_Sub40_Sub2) this).aBool10895 = false;
		else
		    return;
	    }
	    if (!((Class241_Sub40_Sub2) this).aBool10892
		|| oggpacket.isKeyFrame() == 1) {
		if (((Class241_Sub40_Sub2) this).aDecoderContext10882
			.decodeFrame(((Class241_Sub40_Sub2) this).aFrame10888)
		    != 0)
		    throw new IllegalStateException(new StringBuilder().append
							("").append
							(i).toString());
		((Class241_Sub40_Sub2) this).aBool10881 = true;
	    }
	}
    }
    
    void method17225(int i) {
	((Class241_Sub40_Sub2) this).anInt10894 = -1105697027 * i;
	if (((Class241_Sub40_Sub2) this).aBool10891) {
	    if (-1621006763 * ((Class241_Sub40_Sub2) this).anInt10894
		> ((Class241_Sub40_Sub2) this).anInt10897 * 1022849793)
		((Class241_Sub40_Sub2) this).anInt10894
		    = ((Class241_Sub40_Sub2) this).anInt10897 * 1584860669;
	    if (-1621006763 * ((Class241_Sub40_Sub2) this).anInt10894 < 0)
		((Class241_Sub40_Sub2) this).anInt10894 = 0;
	    ((Class241_Sub40_Sub2) this).aDecoderContext10882
		.setPostProcessingLevel
		(-1621006763 * ((Class241_Sub40_Sub2) this).anInt10894);
	}
    }
    
    Class241_Sub40_Sub2(OggStreamState oggstreamstate) {
	super(oggstreamstate);
    }
    
    float method17226(int i) {
	if (!((Class241_Sub40_Sub2) this).aBool10891
	    || ((Class241_Sub40_Sub2) this).aTheoraInfo10884.method7215())
	    return 0.0F;
	return ((float) (((Class241_Sub40_Sub2) this).aTheoraInfo10884
			 .fpsNumerator)
		/ (float) (((Class241_Sub40_Sub2) this).aTheoraInfo10884
			   .fpsDenominator));
    }
    
    double method17227() {
	return ((Class241_Sub40_Sub2) this).aDouble10889;
    }
    
    double method17228() {
	return ((Class241_Sub40_Sub2) this).aDouble10889;
    }
    
    boolean method17229() {
	return ((Class241_Sub40_Sub2) this).aBool10891;
    }
    
    double method17230() {
	return ((Class241_Sub40_Sub2) this).aDouble10889;
    }
    
    void method16446(OggPacket oggpacket) {
	if (!((Class241_Sub40_Sub2) this).aBool10891) {
	    int i = (((Class241_Sub40_Sub2) this).aSetupInfo10883.decodeHeader
		     (((Class241_Sub40_Sub2) this).aTheoraInfo10884,
		      ((Class241_Sub40_Sub2) this).aTheoraComment10885,
		      oggpacket));
	    if (i == 0) {
		((Class241_Sub40_Sub2) this).aBool10891 = true;
		if ((((Class241_Sub40_Sub2) this).aTheoraInfo10884.frameWidth
		     > 2048)
		    || (((Class241_Sub40_Sub2) this).aTheoraInfo10884
			.frameHeight) > 1024)
		    throw new IllegalStateException();
		((Class241_Sub40_Sub2) this).aDecoderContext10882
		    = new DecoderContext((((Class241_Sub40_Sub2) this)
					  .aTheoraInfo10884),
					 (((Class241_Sub40_Sub2) this)
					  .aSetupInfo10883));
		((Class241_Sub40_Sub2) this).aGranulePos10887
		    = new GranulePos();
		((Class241_Sub40_Sub2) this).aFrame10888
		    = new Frame((((Class241_Sub40_Sub2) this).aTheoraInfo10884
				 .frameWidth),
				(((Class241_Sub40_Sub2) this).aTheoraInfo10884
				 .frameHeight));
		((Class241_Sub40_Sub2) this).anInt10897
		    = ((Class241_Sub40_Sub2) this).aDecoderContext10882
			  .getMaxPostProcessingLevel() * -172913407;
		method17224((-1621006763
			     * ((Class241_Sub40_Sub2) this).anInt10894),
			    1625963256);
	    } else if (i < 0)
		throw new IllegalStateException(new StringBuilder().append
						    ("").append
						    (i).toString());
	} else {
	    ((Class241_Sub40_Sub2) this).aLong10890
		= Class50.method1249((byte) 1) * 6626114899665329203L;
	    int i
		= (((Class241_Sub40_Sub2) this).aDecoderContext10882
		       .decodePacketIn
		   (oggpacket, ((Class241_Sub40_Sub2) this).aGranulePos10887));
	    if (i < 0)
		throw new IllegalStateException(new StringBuilder().append
						    ("").append
						    (i).toString());
	    ((Class241_Sub40_Sub2) this).aDecoderContext10882
		.granuleFrame(((Class241_Sub40_Sub2) this).aGranulePos10887);
	    ((Class241_Sub40_Sub2) this).aDouble10889
		= (((Class241_Sub40_Sub2) this).aDecoderContext10882
		       .granuleTime
		   (((Class241_Sub40_Sub2) this).aGranulePos10887));
	    if (((Class241_Sub40_Sub2) this).aBool10895) {
		boolean bool = oggpacket.isKeyFrame() == 1;
		if (bool)
		    ((Class241_Sub40_Sub2) this).aBool10895 = false;
		else
		    return;
	    }
	    if (!((Class241_Sub40_Sub2) this).aBool10892
		|| oggpacket.isKeyFrame() == 1) {
		if (((Class241_Sub40_Sub2) this).aDecoderContext10882
			.decodeFrame(((Class241_Sub40_Sub2) this).aFrame10888)
		    != 0)
		    throw new IllegalStateException(new StringBuilder().append
							("").append
							(i).toString());
		((Class241_Sub40_Sub2) this).aBool10881 = true;
	    }
	}
    }
    
    long method17231() {
	return -4037113471239536901L * ((Class241_Sub40_Sub2) this).aLong10890;
    }
    
    boolean method17232() {
	return ((Class241_Sub40_Sub2) this).aBool10891;
    }
    
    boolean method17233() {
	return ((Class241_Sub40_Sub2) this).aBool10891;
    }
    
    void method16447(OggPacket oggpacket, int i) {
	if (!((Class241_Sub40_Sub2) this).aBool10891) {
	    int i_1_
		= (((Class241_Sub40_Sub2) this).aSetupInfo10883.decodeHeader
		   (((Class241_Sub40_Sub2) this).aTheoraInfo10884,
		    ((Class241_Sub40_Sub2) this).aTheoraComment10885,
		    oggpacket));
	    if (i_1_ == 0) {
		((Class241_Sub40_Sub2) this).aBool10891 = true;
		if ((((Class241_Sub40_Sub2) this).aTheoraInfo10884.frameWidth
		     > 2048)
		    || (((Class241_Sub40_Sub2) this).aTheoraInfo10884
			.frameHeight) > 1024)
		    throw new IllegalStateException();
		((Class241_Sub40_Sub2) this).aDecoderContext10882
		    = new DecoderContext((((Class241_Sub40_Sub2) this)
					  .aTheoraInfo10884),
					 (((Class241_Sub40_Sub2) this)
					  .aSetupInfo10883));
		((Class241_Sub40_Sub2) this).aGranulePos10887
		    = new GranulePos();
		((Class241_Sub40_Sub2) this).aFrame10888
		    = new Frame((((Class241_Sub40_Sub2) this).aTheoraInfo10884
				 .frameWidth),
				(((Class241_Sub40_Sub2) this).aTheoraInfo10884
				 .frameHeight));
		((Class241_Sub40_Sub2) this).anInt10897
		    = ((Class241_Sub40_Sub2) this).aDecoderContext10882
			  .getMaxPostProcessingLevel() * -172913407;
		method17224((-1621006763
			     * ((Class241_Sub40_Sub2) this).anInt10894),
			    2103337373);
	    } else if (i_1_ < 0)
		throw new IllegalStateException(new StringBuilder().append
						    ("").append
						    (i_1_).toString());
	} else {
	    ((Class241_Sub40_Sub2) this).aLong10890
		= Class50.method1249((byte) 1) * 6626114899665329203L;
	    int i_2_
		= (((Class241_Sub40_Sub2) this).aDecoderContext10882
		       .decodePacketIn
		   (oggpacket, ((Class241_Sub40_Sub2) this).aGranulePos10887));
	    if (i_2_ < 0)
		throw new IllegalStateException(new StringBuilder().append
						    ("").append
						    (i_2_).toString());
	    ((Class241_Sub40_Sub2) this).aDecoderContext10882
		.granuleFrame(((Class241_Sub40_Sub2) this).aGranulePos10887);
	    ((Class241_Sub40_Sub2) this).aDouble10889
		= (((Class241_Sub40_Sub2) this).aDecoderContext10882
		       .granuleTime
		   (((Class241_Sub40_Sub2) this).aGranulePos10887));
	    if (((Class241_Sub40_Sub2) this).aBool10895) {
		boolean bool = oggpacket.isKeyFrame() == 1;
		if (bool)
		    ((Class241_Sub40_Sub2) this).aBool10895 = false;
		else
		    return;
	    }
	    if (!((Class241_Sub40_Sub2) this).aBool10892
		|| oggpacket.isKeyFrame() == 1) {
		if (((Class241_Sub40_Sub2) this).aDecoderContext10882
			.decodeFrame(((Class241_Sub40_Sub2) this).aFrame10888)
		    != 0)
		    throw new IllegalStateException(new StringBuilder().append
							("").append
							(i_2_).toString());
		((Class241_Sub40_Sub2) this).aBool10881 = true;
	    }
	}
    }
    
    public Object method17234(Interface23 interface23) {
	if (null == ((Class241_Sub40_Sub2) this).aFrame10888)
	    return null;
	if (!((Class241_Sub40_Sub2) this).aBool10881
	    && ((Class241_Sub40_Sub2) this).anObject10893 != null)
	    return ((Class241_Sub40_Sub2) this).anObject10893;
	((Class241_Sub40_Sub2) this).anObject10893
	    = interface23.method136((((Class241_Sub40_Sub2) this).aFrame10888
				     .pixels),
				    0,
				    -2139589589 * (((Class241_Sub40_Sub2) this)
						   .aFrame10888.anInt10632),
				    -2139589589 * (((Class241_Sub40_Sub2) this)
						   .aFrame10888.anInt10632),
				    (((Class241_Sub40_Sub2) this).aFrame10888
				     .anInt10633) * -201002823,
				    false, -389590226);
	((Class241_Sub40_Sub2) this).aBool10881 = false;
	return ((Class241_Sub40_Sub2) this).anObject10893;
    }
    
    public Object method17235(Interface23 interface23) {
	if (null == ((Class241_Sub40_Sub2) this).aFrame10888)
	    return null;
	if (!((Class241_Sub40_Sub2) this).aBool10881
	    && ((Class241_Sub40_Sub2) this).anObject10893 != null)
	    return ((Class241_Sub40_Sub2) this).anObject10893;
	((Class241_Sub40_Sub2) this).anObject10893
	    = interface23.method136((((Class241_Sub40_Sub2) this).aFrame10888
				     .pixels),
				    0,
				    -2139589589 * (((Class241_Sub40_Sub2) this)
						   .aFrame10888.anInt10632),
				    -2139589589 * (((Class241_Sub40_Sub2) this)
						   .aFrame10888.anInt10632),
				    (((Class241_Sub40_Sub2) this).aFrame10888
				     .anInt10633) * -201002823,
				    false, -1155807762);
	((Class241_Sub40_Sub2) this).aBool10881 = false;
	return ((Class241_Sub40_Sub2) this).anObject10893;
    }
    
    public Object method17236(Interface23 interface23) {
	if (null == ((Class241_Sub40_Sub2) this).aFrame10888)
	    return null;
	if (!((Class241_Sub40_Sub2) this).aBool10881
	    && ((Class241_Sub40_Sub2) this).anObject10893 != null)
	    return ((Class241_Sub40_Sub2) this).anObject10893;
	((Class241_Sub40_Sub2) this).anObject10893
	    = interface23.method136((((Class241_Sub40_Sub2) this).aFrame10888
				     .pixels),
				    0,
				    -2139589589 * (((Class241_Sub40_Sub2) this)
						   .aFrame10888.anInt10632),
				    -2139589589 * (((Class241_Sub40_Sub2) this)
						   .aFrame10888.anInt10632),
				    (((Class241_Sub40_Sub2) this).aFrame10888
				     .anInt10633) * -201002823,
				    false, 1459558029);
	((Class241_Sub40_Sub2) this).aBool10881 = false;
	return ((Class241_Sub40_Sub2) this).anObject10893;
    }
    
    public Object method17237(Interface23 interface23) {
	if (null == ((Class241_Sub40_Sub2) this).aFrame10888)
	    return null;
	if (!((Class241_Sub40_Sub2) this).aBool10881
	    && ((Class241_Sub40_Sub2) this).anObject10893 != null)
	    return ((Class241_Sub40_Sub2) this).anObject10893;
	((Class241_Sub40_Sub2) this).anObject10893
	    = interface23.method136((((Class241_Sub40_Sub2) this).aFrame10888
				     .pixels),
				    0,
				    -2139589589 * (((Class241_Sub40_Sub2) this)
						   .aFrame10888.anInt10632),
				    -2139589589 * (((Class241_Sub40_Sub2) this)
						   .aFrame10888.anInt10632),
				    (((Class241_Sub40_Sub2) this).aFrame10888
				     .anInt10633) * -201002823,
				    false, 1655920152);
	((Class241_Sub40_Sub2) this).aBool10881 = false;
	return ((Class241_Sub40_Sub2) this).anObject10893;
    }
}
