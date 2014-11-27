/* Class241_Sub40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

public class Class241_Sub40_Sub1 extends Class241_Sub40
{
    Class591 aClass591_10847;
    VorbisComment aVorbisComment10848;
    DSPState aDSPState10849;
    VorbisBlock aVorbisBlock10850;
    int anInt10851;
    Class241_Sub18_Sub1 aClass241_Sub18_Sub1_10852;
    VorbisInfo aVorbisInfo10853 = new VorbisInfo();
    double aDouble10854;
    public static Frame frame;//aFrame10855
    
    public Class241_Sub18_Sub1 method17153(byte i) {
	return ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852;
    }
    
    void method16447(OggPacket oggpacket, int i) {
	if (((Class241_Sub40_Sub1) this).anInt10151 * 647070621 < 3) {
	    int i_0_ = (((Class241_Sub40_Sub1) this).aVorbisInfo10853.headerIn
			(((Class241_Sub40_Sub1) this).aVorbisComment10848,
			 oggpacket));
	    if (i_0_ < 0)
		throw new IllegalStateException(new StringBuilder().append
						    ("").append
						    (i_0_).toString());
	    if (((Class241_Sub40_Sub1) this).anInt10151 * 647070621 == 2) {
		if (((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels > 2
		    || (((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels
			< 1))
		    throw new RuntimeException(new StringBuilder().append
						   ("").append
						   (((Class241_Sub40_Sub1)
						     this)
						    .aVorbisInfo10853.channels)
						   .toString());
		((Class241_Sub40_Sub1) this).aDSPState10849
		    = new DSPState(((Class241_Sub40_Sub1) this)
				   .aVorbisInfo10853);
		((Class241_Sub40_Sub1) this).aVorbisBlock10850
		    = new VorbisBlock(((Class241_Sub40_Sub1) this)
				      .aDSPState10849);
		((Class241_Sub40_Sub1) this).aClass591_10847
		    = new Class591((((Class241_Sub40_Sub1) this)
				    .aVorbisInfo10853.rate),
				   Class251.anInt4000);
		((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		    = new Class241_Sub18_Sub1(((Class241_Sub40_Sub1) this)
					      .aVorbisInfo10853.channels);
	    }
	} else {
	    if (((Class241_Sub40_Sub1) this).aVorbisBlock10850
		    .synthesis(oggpacket)
		== 0)
		((Class241_Sub40_Sub1) this).aDSPState10849
		    .blockIn(((Class241_Sub40_Sub1) this).aVorbisBlock10850);
	    float[][] fs
		= (((Class241_Sub40_Sub1) this).aDSPState10849.pcmOut
		   (((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels));
	    ((Class241_Sub40_Sub1) this).aDouble10854
		= ((Class241_Sub40_Sub1) this).aDSPState10849.granuleTime();
	    if (((Class241_Sub40_Sub1) this).aDouble10854 == -1.0)
		((Class241_Sub40_Sub1) this).aDouble10854
		    = (double) ((float) ((((Class241_Sub40_Sub1) this)
					  .anInt10851)
					 * 709749523)
				/ (float) (((Class241_Sub40_Sub1) this)
					   .aVorbisInfo10853.rate));
	    ((Class241_Sub40_Sub1) this).aDSPState10849.read(fs[0].length);
	    ((Class241_Sub40_Sub1) this).anInt10851
		+= fs[0].length * 2137036571;
	    Class241_Sub21 class241_sub21
		= (((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		       .method17135
		   (fs[0].length, ((Class241_Sub40_Sub1) this).aDouble10854));
	    Class120_Sub21.method16851(fs, (((Class241_Sub21) class241_sub21)
					    .aShortArrayArray9010), (byte) 45);
	    for (int i_1_ = 0;
		 i_1_ < ((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels;
		 i_1_++)
		((Class241_Sub21) class241_sub21).aShortArrayArray9010[i_1_]
		    = (((Class241_Sub40_Sub1) this).aClass591_10847.method12912
		       ((((Class241_Sub21) class241_sub21).aShortArrayArray9010
			 [i_1_]),
			(short) -782));
	    ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		.method17131(class241_sub21, 420913362);
	}
    }
    
    Class241_Sub40_Sub1(OggStreamState oggstreamstate) {
	super(oggstreamstate);
	((Class241_Sub40_Sub1) this).aVorbisComment10848 = new VorbisComment();
    }
    
    int method17154() {
	return (((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852 == null
		? 0
		: ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		      .method17129((byte) -22));
    }
    
    double method17155(short i) {
	double d = ((Class241_Sub40_Sub1) this).aDouble10854;
	if (((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852 != null) {
	    d = ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		    .method17132(-1881478834);
	    if (d < 0.0)
		d = ((Class241_Sub40_Sub1) this).aDouble10854;
	}
	return d - (double) (256.0F / (float) Class251.anInt4000);
    }
    
    void method16445(int i) {
	if (null != ((Class241_Sub40_Sub1) this).aVorbisBlock10850)
	    ((Class241_Sub40_Sub1) this).aVorbisBlock10850.method7216();
	if (null != ((Class241_Sub40_Sub1) this).aDSPState10849)
	    ((Class241_Sub40_Sub1) this).aDSPState10849.method7216();
	((Class241_Sub40_Sub1) this).aVorbisComment10848.method7216();
	((Class241_Sub40_Sub1) this).aVorbisInfo10853.method7216();
	if (null != ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852)
	    ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		.method17133(354038263);
    }
    
    void method16446(OggPacket oggpacket) {
	if (((Class241_Sub40_Sub1) this).anInt10151 * 647070621 < 3) {
	    int i = (((Class241_Sub40_Sub1) this).aVorbisInfo10853.headerIn
		     (((Class241_Sub40_Sub1) this).aVorbisComment10848,
		      oggpacket));
	    if (i < 0)
		throw new IllegalStateException(new StringBuilder().append
						    ("").append
						    (i).toString());
	    if (((Class241_Sub40_Sub1) this).anInt10151 * 647070621 == 2) {
		if (((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels > 2
		    || (((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels
			< 1))
		    throw new RuntimeException(new StringBuilder().append
						   ("").append
						   (((Class241_Sub40_Sub1)
						     this)
						    .aVorbisInfo10853.channels)
						   .toString());
		((Class241_Sub40_Sub1) this).aDSPState10849
		    = new DSPState(((Class241_Sub40_Sub1) this)
				   .aVorbisInfo10853);
		((Class241_Sub40_Sub1) this).aVorbisBlock10850
		    = new VorbisBlock(((Class241_Sub40_Sub1) this)
				      .aDSPState10849);
		((Class241_Sub40_Sub1) this).aClass591_10847
		    = new Class591((((Class241_Sub40_Sub1) this)
				    .aVorbisInfo10853.rate),
				   Class251.anInt4000);
		((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		    = new Class241_Sub18_Sub1(((Class241_Sub40_Sub1) this)
					      .aVorbisInfo10853.channels);
	    }
	} else {
	    if (((Class241_Sub40_Sub1) this).aVorbisBlock10850
		    .synthesis(oggpacket)
		== 0)
		((Class241_Sub40_Sub1) this).aDSPState10849
		    .blockIn(((Class241_Sub40_Sub1) this).aVorbisBlock10850);
	    float[][] fs
		= (((Class241_Sub40_Sub1) this).aDSPState10849.pcmOut
		   (((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels));
	    ((Class241_Sub40_Sub1) this).aDouble10854
		= ((Class241_Sub40_Sub1) this).aDSPState10849.granuleTime();
	    if (((Class241_Sub40_Sub1) this).aDouble10854 == -1.0)
		((Class241_Sub40_Sub1) this).aDouble10854
		    = (double) ((float) ((((Class241_Sub40_Sub1) this)
					  .anInt10851)
					 * 709749523)
				/ (float) (((Class241_Sub40_Sub1) this)
					   .aVorbisInfo10853.rate));
	    ((Class241_Sub40_Sub1) this).aDSPState10849.read(fs[0].length);
	    ((Class241_Sub40_Sub1) this).anInt10851
		+= fs[0].length * 2137036571;
	    Class241_Sub21 class241_sub21
		= (((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		       .method17135
		   (fs[0].length, ((Class241_Sub40_Sub1) this).aDouble10854));
	    Class120_Sub21.method16851(fs, (((Class241_Sub21) class241_sub21)
					    .aShortArrayArray9010), (byte) 85);
	    for (int i = 0;
		 i < ((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels;
		 i++)
		((Class241_Sub21) class241_sub21).aShortArrayArray9010[i]
		    = (((Class241_Sub40_Sub1) this).aClass591_10847.method12912
		       ((((Class241_Sub21) class241_sub21).aShortArrayArray9010
			 [i]),
			(short) 4003));
	    ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		.method17131(class241_sub21, 420913362);
	}
    }
    
    void method16442(OggPacket oggpacket) {
	if (((Class241_Sub40_Sub1) this).anInt10151 * 647070621 < 3) {
	    int i = (((Class241_Sub40_Sub1) this).aVorbisInfo10853.headerIn
		     (((Class241_Sub40_Sub1) this).aVorbisComment10848,
		      oggpacket));
	    if (i < 0)
		throw new IllegalStateException(new StringBuilder().append
						    ("").append
						    (i).toString());
	    if (((Class241_Sub40_Sub1) this).anInt10151 * 647070621 == 2) {
		if (((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels > 2
		    || (((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels
			< 1))
		    throw new RuntimeException(new StringBuilder().append
						   ("").append
						   (((Class241_Sub40_Sub1)
						     this)
						    .aVorbisInfo10853.channels)
						   .toString());
		((Class241_Sub40_Sub1) this).aDSPState10849
		    = new DSPState(((Class241_Sub40_Sub1) this)
				   .aVorbisInfo10853);
		((Class241_Sub40_Sub1) this).aVorbisBlock10850
		    = new VorbisBlock(((Class241_Sub40_Sub1) this)
				      .aDSPState10849);
		((Class241_Sub40_Sub1) this).aClass591_10847
		    = new Class591((((Class241_Sub40_Sub1) this)
				    .aVorbisInfo10853.rate),
				   Class251.anInt4000);
		((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		    = new Class241_Sub18_Sub1(((Class241_Sub40_Sub1) this)
					      .aVorbisInfo10853.channels);
	    }
	} else {
	    if (((Class241_Sub40_Sub1) this).aVorbisBlock10850
		    .synthesis(oggpacket)
		== 0)
		((Class241_Sub40_Sub1) this).aDSPState10849
		    .blockIn(((Class241_Sub40_Sub1) this).aVorbisBlock10850);
	    float[][] fs
		= (((Class241_Sub40_Sub1) this).aDSPState10849.pcmOut
		   (((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels));
	    ((Class241_Sub40_Sub1) this).aDouble10854
		= ((Class241_Sub40_Sub1) this).aDSPState10849.granuleTime();
	    if (((Class241_Sub40_Sub1) this).aDouble10854 == -1.0)
		((Class241_Sub40_Sub1) this).aDouble10854
		    = (double) ((float) ((((Class241_Sub40_Sub1) this)
					  .anInt10851)
					 * 709749523)
				/ (float) (((Class241_Sub40_Sub1) this)
					   .aVorbisInfo10853.rate));
	    ((Class241_Sub40_Sub1) this).aDSPState10849.read(fs[0].length);
	    ((Class241_Sub40_Sub1) this).anInt10851
		+= fs[0].length * 2137036571;
	    Class241_Sub21 class241_sub21
		= (((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		       .method17135
		   (fs[0].length, ((Class241_Sub40_Sub1) this).aDouble10854));
	    Class120_Sub21.method16851(fs, (((Class241_Sub21) class241_sub21)
					    .aShortArrayArray9010), (byte) 44);
	    for (int i = 0;
		 i < ((Class241_Sub40_Sub1) this).aVorbisInfo10853.channels;
		 i++)
		((Class241_Sub21) class241_sub21).aShortArrayArray9010[i]
		    = (((Class241_Sub40_Sub1) this).aClass591_10847.method12912
		       ((((Class241_Sub21) class241_sub21).aShortArrayArray9010
			 [i]),
			(short) -13138));
	    ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		.method17131(class241_sub21, 420913362);
	}
    }
    
    int method17156(byte i) {
	return (((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852 == null
		? 0
		: ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		      .method17129((byte) 73));
    }
    
    static short[][] method17157(float[][] fs, short[][] is) {
	for (int i = 0; i < fs.length; i++) {
	    for (int i_2_ = 0; i_2_ < is[i].length; i_2_++)
		is[i][i_2_] = (short) (int) (16383.0F * fs[i][i_2_]);
	}
	return is;
    }
    
    static short[][] method17158(float[][] fs, short[][] is) {
	for (int i = 0; i < fs.length; i++) {
	    for (int i_3_ = 0; i_3_ < is[i].length; i_3_++)
		is[i][i_3_] = (short) (int) (16383.0F * fs[i][i_3_]);
	}
	return is;
    }
    
    static short[][] method17159(float[][] fs, short[][] is) {
	for (int i = 0; i < fs.length; i++) {
	    for (int i_4_ = 0; i_4_ < is[i].length; i_4_++)
		is[i][i_4_] = (short) (int) (16383.0F * fs[i][i_4_]);
	}
	return is;
    }
    
    static short[][] method17160(float[][] fs, short[][] is) {
	for (int i = 0; i < fs.length; i++) {
	    for (int i_5_ = 0; i_5_ < is[i].length; i_5_++)
		is[i][i_5_] = (short) (int) (16383.0F * fs[i][i_5_]);
	}
	return is;
    }
    
    public Class241_Sub18_Sub1 method17161() {
	return ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852;
    }
    
    void method16444() {
	if (null != ((Class241_Sub40_Sub1) this).aVorbisBlock10850)
	    ((Class241_Sub40_Sub1) this).aVorbisBlock10850.method7216();
	if (null != ((Class241_Sub40_Sub1) this).aDSPState10849)
	    ((Class241_Sub40_Sub1) this).aDSPState10849.method7216();
	((Class241_Sub40_Sub1) this).aVorbisComment10848.method7216();
	((Class241_Sub40_Sub1) this).aVorbisInfo10853.method7216();
	if (null != ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852)
	    ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		.method17133(-249954305);
    }
    
    static short[][] method17162(float[][] fs, short[][] is) {
	for (int i = 0; i < fs.length; i++) {
	    for (int i_6_ = 0; i_6_ < is[i].length; i_6_++)
		is[i][i_6_] = (short) (int) (16383.0F * fs[i][i_6_]);
	}
	return is;
    }
    
    double method17163() {
	double d = ((Class241_Sub40_Sub1) this).aDouble10854;
	if (((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852 != null) {
	    d = ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		    .method17132(210840721);
	    if (d < 0.0)
		d = ((Class241_Sub40_Sub1) this).aDouble10854;
	}
	return d - (double) (256.0F / (float) Class251.anInt4000);
    }
    
    int method17164() {
	return (((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852 == null
		? 0
		: ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		      .method17129((byte) 5));
    }
    
    double method17165() {
	double d = ((Class241_Sub40_Sub1) this).aDouble10854;
	if (((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852 != null) {
	    d = ((Class241_Sub40_Sub1) this).aClass241_Sub18_Sub1_10852
		    .method17132(1651154905);
	    if (d < 0.0)
		d = ((Class241_Sub40_Sub1) this).aDouble10854;
	}
	return d - (double) (256.0F / (float) Class251.anInt4000);
    }
}
