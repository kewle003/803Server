/* Class583 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

public abstract class Class583
{
    OggSyncState anOggSyncState7566;
    static final int anInt7567 = 10;
    byte[] aByteArray7568;
    boolean aBool7569;
    boolean aBool7570;
    static final int anInt7571 = 50;
    HashTable aClass407_7572;
    boolean aBool7573;
    boolean aBool7574;
    OggPage anOggPage7575;
    OggPacket anOggPacket7576;
    Class241_Sub40_Sub1 aClass241_Sub40_Sub1_7577;
    Class241_Sub40_Sub3 aClass241_Sub40_Sub3_7578;
    String aString7579;
    Class241_Sub40_Sub2 aClass241_Sub40_Sub2_7580;
    static Socket js5Connection;//aSocket7581
    static Class468 aClass468_7582;
    public static int anInt7583;
    
    public boolean method12777() {
	if (!((Class583) this).aBool7574 && !((Class583) this).aBool7569)
	    return false;
	if (null != ((Class583) this).aClass241_Sub40_Sub1_7577
	    && ((Class583) this).aClass241_Sub40_Sub1_7577
		   .method17156((byte) -14) > 0)
	    return false;
	return true;
    }
    
    boolean method12778(byte i) {
	if (((Class583) this).aClass241_Sub40_Sub1_7577 != null)
	    return (!((Class583) this).aClass241_Sub40_Sub2_7580
			 .method17217(1807845621)
		    || method12789(16711935) > ((Class583) this)
						   .aClass241_Sub40_Sub2_7580
						   .method17218(1861103097));
	double d = (double) ((Class583) this).aClass241_Sub40_Sub2_7580
				.method17226(-715999492);
	return (0.0 == d
		|| ((double) Class50.method1249((byte) 1)
		    >= (double) ((Class583) this).aClass241_Sub40_Sub2_7580
				    .method17219((byte) 2) + 1000.0 / d));
    }
    
    Class241_Sub40 method12779(int i) throws IOException {
	if (((Class583) this).aBool7574)
	    throw new IllegalStateException();
	if (((Class583) this).aBool7569)
	    return null;
	while (((Class583) this).anOggSyncState7566
		   .pageOut(((Class583) this).anOggPage7575)
	       <= 0) {
	    int i_0_
		= method12808(((Class583) this).aByteArray7568, (byte) -127);
	    if (i_0_ == -1) {
		((Class583) this).aBool7569 = true;
		return null;
	    }
	    if (0 == i_0_)
		return null;
	    if (!((Class583) this).anOggSyncState7566
		     .write(((Class583) this).aByteArray7568, i_0_))
		throw new RuntimeException("");
	}
	int i_1_ = ((Class583) this).anOggPage7575.getSerialNumber();
	if (((Class583) this).anOggPage7575.isBOS()) {
	    OggStreamState oggstreamstate = new OggStreamState(i_1_);
	    if (!oggstreamstate.pageIn(((Class583) this).anOggPage7575))
		throw new IllegalStateException();
	    if (oggstreamstate.packetPeek(((Class583) this).anOggPacket7576)
		!= 1)
		throw new IllegalStateException();
	    Class241_Sub40 class241_sub40;
	    if (null == ((Class583) this).aClass241_Sub40_Sub2_7580
		&& ((Class583) this).anOggPacket7576.isTheora()) {
		((Class583) this).aClass241_Sub40_Sub2_7580
		    = new Class241_Sub40_Sub2(oggstreamstate);
		class241_sub40 = ((Class583) this).aClass241_Sub40_Sub2_7580;
	    } else if (((Class583) this).aClass241_Sub40_Sub1_7577 == null
		       && ((Class583) this).anOggPacket7576.isVorbis()) {
		((Class583) this).aClass241_Sub40_Sub1_7577
		    = new Class241_Sub40_Sub1(oggstreamstate);
		class241_sub40 = ((Class583) this).aClass241_Sub40_Sub1_7577;
	    } else {
		byte[] is = ((Class583) this).anOggPacket7576.getData();
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_2_ = 1;
		     (i_2_ < is.length
		      && Character.isLetterOrDigit((char) is[i_2_]));
		     i_2_++)
		    stringbuilder.append((char) is[i_2_]);
		String string = stringbuilder.toString();
		if (string.equals("kate"))
		    class241_sub40 = new Class241_Sub40_Sub3(oggstreamstate);
		else
		    class241_sub40 = new Class241_Sub40_Sub4(oggstreamstate);
	    }
	    ((Class583) this).aClass407_7572.put(class241_sub40,
							(long) i_1_);
	    return class241_sub40;
	}
	Class241_Sub40 class241_sub40
	    = ((Class241_Sub40)
	       ((Class583) this).aClass407_7572.get((long) i_1_));
	if (!((Class241_Sub40) class241_sub40).anOggStreamState10150
		 .pageIn(((Class583) this).anOggPage7575))
	    throw new IllegalStateException();
	return class241_sub40;
    }
    
    void method12780() {
	for (Class241_Sub40 class241_sub40
		 = ((Class241_Sub40)
		    ((Class583) this).aClass407_7572.method7294(2090894173));
	     class241_sub40 != null;
	     class241_sub40 = (Class241_Sub40) ((Class583) this)
						   .aClass407_7572
						   .method7295(-195061250)) {
	    if (class241_sub40 instanceof Class241_Sub40_Sub3) {
		Class241_Sub40_Sub3 class241_sub40_sub3
		    = (Class241_Sub40_Sub3) class241_sub40;
		while (((((Class241_Sub40_Sub3) class241_sub40_sub3).anInt10151
			 * 647070621) <= 8
			|| (method12789(16711935)
			    > (double) class241_sub40_sub3
					   .method17241(-284517551)))
		       && (((Class241_Sub40_Sub3) class241_sub40_sub3)
			       .anOggStreamState10150
			       .packetOut(((Class583) this).anOggPacket7576)
			   == 1))
		    class241_sub40_sub3.method16443((((Class583) this)
						     .anOggPacket7576),
						    421967667);
	    }
	}
	method12820(((Class583) this).aString7579, 1655136529);
    }
    
    void method12781(int i) throws IOException {
	while (((Class241_Sub40_Sub2)
		((Class583) this).aClass241_Sub40_Sub2_7580)
		   .anOggStreamState10150
		   .packetOut(((Class583) this).anOggPacket7576)
	       != 1) {
	    Class241_Sub40 class241_sub40 = method12779(619256416);
	    if (null == class241_sub40) {
		if (((Class583) this).aBool7569)
		    method12784((byte) 0);
		return;
	    }
	    if (class241_sub40 == ((Class583) this).aClass241_Sub40_Sub3_7578)
		method12782(1092537867);
	}
	((Class583) this).aClass241_Sub40_Sub2_7580
	    .method16443(((Class583) this).anOggPacket7576, 421967667);
    }
    
    void method12782(int i) {
	for (Class241_Sub40 class241_sub40
		 = ((Class241_Sub40)
		    ((Class583) this).aClass407_7572.method7294(2090894173));
	     class241_sub40 != null;
	     class241_sub40 = (Class241_Sub40) ((Class583) this)
						   .aClass407_7572
						   .method7295(-377614575)) {
	    if (class241_sub40 instanceof Class241_Sub40_Sub3) {
		Class241_Sub40_Sub3 class241_sub40_sub3
		    = (Class241_Sub40_Sub3) class241_sub40;
		while (((((Class241_Sub40_Sub3) class241_sub40_sub3).anInt10151
			 * 647070621) <= 8
			|| (method12789(16711935)
			    > (double) class241_sub40_sub3
					   .method17241(83818248)))
		       && (((Class241_Sub40_Sub3) class241_sub40_sub3)
			       .anOggStreamState10150
			       .packetOut(((Class583) this).anOggPacket7576)
			   == 1))
		    class241_sub40_sub3.method16443((((Class583) this)
						     .anOggPacket7576),
						    421967667);
	    }
	}
	method12820(((Class583) this).aString7579, 1715995355);
    }
    
    public boolean method12783() {
	if (!((Class583) this).aBool7574 && !((Class583) this).aBool7569)
	    return false;
	if (null != ((Class583) this).aClass241_Sub40_Sub1_7577
	    && ((Class583) this).aClass241_Sub40_Sub1_7577
		   .method17156((byte) 15) > 0)
	    return false;
	return true;
    }
    
    void method12784(byte i) {
	for (Class241_Sub40 class241_sub40
		 = ((Class241_Sub40)
		    ((Class583) this).aClass407_7572.method7294(2090894173));
	     null != class241_sub40;
	     class241_sub40 = (Class241_Sub40) ((Class583) this)
						   .aClass407_7572
						   .method7295(1221514464)) {
	    if (class241_sub40
		!= ((Class583) this).aClass241_Sub40_Sub2_7580) {
		while (((Class241_Sub40) class241_sub40)
			   .anOggStreamState10150.packetOut()
		       == 1)
		    class241_sub40.method16443((((Class583) this)
						.anOggPacket7576),
					       421967667);
	    }
	}
	if (null != ((Class583) this).aClass241_Sub40_Sub2_7580) {
	    for (int i_3_ = 0; i_3_ < 10 && method12778((byte) 87); i_3_++) {
		if (((Class241_Sub40_Sub2)
		     ((Class583) this).aClass241_Sub40_Sub2_7580)
			.anOggStreamState10150.packetOut()
		    != 1) {
		    method12785(-1509093556);
		    break;
		}
		((Class583) this).aClass241_Sub40_Sub2_7580
		    .method16443(((Class583) this).anOggPacket7576, 421967667);
	    }
	}
    }
    
    public void method12785(int i) {
	if (!((Class583) this).aBool7574) {
	    for (Class241_Sub40 class241_sub40
		     = (Class241_Sub40) ((Class583) this).aClass407_7572
					    .method7294(2090894173);
		 class241_sub40 != null;
		 class241_sub40
		     = (Class241_Sub40) ((Class583) this).aClass407_7572
					    .method7295(1145283256)) {
		class241_sub40.method16445(305624853);
		((Class241_Sub40) class241_sub40).anOggStreamState10150
		    .method7216();
	    }
	    ((Class583) this).anOggPacket7576.method7216();
	    ((Class583) this).anOggPage7575.method7216();
	    ((Class583) this).anOggSyncState7566.method7216();
	    ((Class583) this).aBool7574 = true;
	}
    }
    
    public Class241_Sub40_Sub2 method12786(int i) {
	return ((Class583) this).aClass241_Sub40_Sub2_7580;
    }
    
    public boolean method12787() {
	if (!((Class583) this).aBool7574 && !((Class583) this).aBool7569)
	    return false;
	if (null != ((Class583) this).aClass241_Sub40_Sub1_7577
	    && ((Class583) this).aClass241_Sub40_Sub1_7577
		   .method17156((byte) -2) > 0)
	    return false;
	return true;
    }
    
    public boolean method12788(int i) {
	if (!((Class583) this).aBool7574 && !((Class583) this).aBool7569)
	    return false;
	if (null != ((Class583) this).aClass241_Sub40_Sub1_7577
	    && ((Class583) this).aClass241_Sub40_Sub1_7577
		   .method17156((byte) -123) > 0)
	    return false;
	return true;
    }
    
    public double method12789(int i) {
	if (((Class583) this).aClass241_Sub40_Sub1_7577 != null)
	    return ((Class583) this).aClass241_Sub40_Sub1_7577
		       .method17155((short) -294);
	if (((Class583) this).aClass241_Sub40_Sub2_7580 != null)
	    return ((Class583) this).aClass241_Sub40_Sub2_7580
		       .method17218(1772729369);
	return 0.0;
    }
    
    public Class241_Sub40_Sub3 method12790(int i) {
	return ((Class583) this).aClass241_Sub40_Sub3_7578;
    }
    
    public Class241_Sub40_Sub1 method12791() {
	return ((Class583) this).aClass241_Sub40_Sub1_7577;
    }
    
    public void method12792(boolean bool, int i) {
	if (null != ((Class583) this).aClass241_Sub40_Sub1_7577) {
	    Class241_Sub18_Sub1 class241_sub18_sub1
		= ((Class583) this).aClass241_Sub40_Sub1_7577
		      .method17153((byte) -2);
	    if (null != class241_sub18_sub1)
		class241_sub18_sub1.method17134(bool, (byte) 126);
	}
	((Class583) this).aBool7570 = !((Class583) this).aBool7570;
    }
    
    abstract int method12793(byte[] is) throws IOException;
    
    abstract int method12794(byte[] is) throws IOException;
    
    abstract int method12795(byte[] is) throws IOException;
    
    Class241_Sub40 method12796() throws IOException {
	if (((Class583) this).aBool7574)
	    throw new IllegalStateException();
	if (((Class583) this).aBool7569)
	    return null;
	while (((Class583) this).anOggSyncState7566
		   .pageOut(((Class583) this).anOggPage7575)
	       <= 0) {
	    int i = method12808(((Class583) this).aByteArray7568, (byte) -33);
	    if (i == -1) {
		((Class583) this).aBool7569 = true;
		return null;
	    }
	    if (0 == i)
		return null;
	    if (!((Class583) this).anOggSyncState7566
		     .write(((Class583) this).aByteArray7568, i))
		throw new RuntimeException("");
	}
	int i = ((Class583) this).anOggPage7575.getSerialNumber();
	if (((Class583) this).anOggPage7575.isBOS()) {
	    OggStreamState oggstreamstate = new OggStreamState(i);
	    if (!oggstreamstate.pageIn(((Class583) this).anOggPage7575))
		throw new IllegalStateException();
	    if (oggstreamstate.packetPeek(((Class583) this).anOggPacket7576)
		!= 1)
		throw new IllegalStateException();
	    Class241_Sub40 class241_sub40;
	    if (null == ((Class583) this).aClass241_Sub40_Sub2_7580
		&& ((Class583) this).anOggPacket7576.isTheora()) {
		((Class583) this).aClass241_Sub40_Sub2_7580
		    = new Class241_Sub40_Sub2(oggstreamstate);
		class241_sub40 = ((Class583) this).aClass241_Sub40_Sub2_7580;
	    } else if (((Class583) this).aClass241_Sub40_Sub1_7577 == null
		       && ((Class583) this).anOggPacket7576.isVorbis()) {
		((Class583) this).aClass241_Sub40_Sub1_7577
		    = new Class241_Sub40_Sub1(oggstreamstate);
		class241_sub40 = ((Class583) this).aClass241_Sub40_Sub1_7577;
	    } else {
		byte[] is = ((Class583) this).anOggPacket7576.getData();
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_4_ = 1;
		     (i_4_ < is.length
		      && Character.isLetterOrDigit((char) is[i_4_]));
		     i_4_++)
		    stringbuilder.append((char) is[i_4_]);
		String string = stringbuilder.toString();
		if (string.equals("kate"))
		    class241_sub40 = new Class241_Sub40_Sub3(oggstreamstate);
		else
		    class241_sub40 = new Class241_Sub40_Sub4(oggstreamstate);
	    }
	    ((Class583) this).aClass407_7572.put(class241_sub40,
							(long) i);
	    return class241_sub40;
	}
	Class241_Sub40 class241_sub40
	    = ((Class241_Sub40)
	       ((Class583) this).aClass407_7572.get((long) i));
	if (!((Class241_Sub40) class241_sub40).anOggStreamState10150
		 .pageIn(((Class583) this).anOggPage7575))
	    throw new IllegalStateException();
	return class241_sub40;
    }
    
    public void method12797(boolean bool) {
	if (null != ((Class583) this).aClass241_Sub40_Sub1_7577) {
	    Class241_Sub18_Sub1 class241_sub18_sub1
		= ((Class583) this).aClass241_Sub40_Sub1_7577
		      .method17153((byte) -78);
	    if (null != class241_sub18_sub1)
		class241_sub18_sub1.method17134(bool, (byte) 126);
	}
	((Class583) this).aBool7570 = !((Class583) this).aBool7570;
    }
    
    Class241_Sub40 method12798() throws IOException {
	if (((Class583) this).aBool7574)
	    throw new IllegalStateException();
	if (((Class583) this).aBool7569)
	    return null;
	while (((Class583) this).anOggSyncState7566
		   .pageOut(((Class583) this).anOggPage7575)
	       <= 0) {
	    int i = method12808(((Class583) this).aByteArray7568, (byte) -58);
	    if (i == -1) {
		((Class583) this).aBool7569 = true;
		return null;
	    }
	    if (0 == i)
		return null;
	    if (!((Class583) this).anOggSyncState7566
		     .write(((Class583) this).aByteArray7568, i))
		throw new RuntimeException("");
	}
	int i = ((Class583) this).anOggPage7575.getSerialNumber();
	if (((Class583) this).anOggPage7575.isBOS()) {
	    OggStreamState oggstreamstate = new OggStreamState(i);
	    if (!oggstreamstate.pageIn(((Class583) this).anOggPage7575))
		throw new IllegalStateException();
	    if (oggstreamstate.packetPeek(((Class583) this).anOggPacket7576)
		!= 1)
		throw new IllegalStateException();
	    Class241_Sub40 class241_sub40;
	    if (null == ((Class583) this).aClass241_Sub40_Sub2_7580
		&& ((Class583) this).anOggPacket7576.isTheora()) {
		((Class583) this).aClass241_Sub40_Sub2_7580
		    = new Class241_Sub40_Sub2(oggstreamstate);
		class241_sub40 = ((Class583) this).aClass241_Sub40_Sub2_7580;
	    } else if (((Class583) this).aClass241_Sub40_Sub1_7577 == null
		       && ((Class583) this).anOggPacket7576.isVorbis()) {
		((Class583) this).aClass241_Sub40_Sub1_7577
		    = new Class241_Sub40_Sub1(oggstreamstate);
		class241_sub40 = ((Class583) this).aClass241_Sub40_Sub1_7577;
	    } else {
		byte[] is = ((Class583) this).anOggPacket7576.getData();
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_5_ = 1;
		     (i_5_ < is.length
		      && Character.isLetterOrDigit((char) is[i_5_]));
		     i_5_++)
		    stringbuilder.append((char) is[i_5_]);
		String string = stringbuilder.toString();
		if (string.equals("kate"))
		    class241_sub40 = new Class241_Sub40_Sub3(oggstreamstate);
		else
		    class241_sub40 = new Class241_Sub40_Sub4(oggstreamstate);
	    }
	    ((Class583) this).aClass407_7572.put(class241_sub40,
							(long) i);
	    return class241_sub40;
	}
	Class241_Sub40 class241_sub40
	    = ((Class241_Sub40)
	       ((Class583) this).aClass407_7572.get((long) i));
	if (!((Class241_Sub40) class241_sub40).anOggStreamState10150
		 .pageIn(((Class583) this).anOggPage7575))
	    throw new IllegalStateException();
	return class241_sub40;
    }
    
    public void method12799() throws IOException {
	if (!((Class583) this).aBool7570) {
	while_132_:
	    for (/**/; !((Class583) this).aBool7574;
		 ((Class583) this).aBool7573 = false) {
		Class241_Sub40 class241_sub40;
		if (!((Class583) this).aBool7573) {
		    class241_sub40 = method12779(619256416);
		    if (class241_sub40 == null) {
			if (((Class583) this).aBool7569)
			    method12784((byte) 0);
			break;
		    }
		    if (null == class241_sub40)
			throw new IllegalStateException();
		    ((Class583) this).aBool7573 = true;
		} else
		    class241_sub40
			= ((Class241_Sub40)
			   (((Class583) this).aClass407_7572.get
			    ((long) ((Class583) this).anOggPage7575
					.getSerialNumber())));
		if (((Class583) this).aClass241_Sub40_Sub1_7577
		    == class241_sub40) {
		    if (((Class583) this).aClass241_Sub40_Sub1_7577
			    .method17156((byte) -94)
			< 50) {
			do {
			    if ((((Class241_Sub40_Sub1)
				  ((Class583) this).aClass241_Sub40_Sub1_7577)
				     .anOggStreamState10150.packetOut
				 (((Class583) this).anOggPacket7576))
				!= 1)
				continue while_132_;
			    ((Class583) this).aClass241_Sub40_Sub1_7577
				.method16443
				(((Class583) this).anOggPacket7576, 421967667);
			    method12782(755330944);
			    if (((Class583) this).aClass241_Sub40_Sub2_7580
				!= null) {
				double d = ((Class583) this)
					       .aClass241_Sub40_Sub2_7580
					       .method17218(1816201513);
				for (int i = 0;
				     i < 10 && method12778((byte) -34); i++) {
				    method12781(1775115186);
				    if (((Class583) this).aBool7574)
					return;
				}
				if (d < ((Class583) this)
					    .aClass241_Sub40_Sub2_7580
					    .method17218(1950479016))
				    break;
			    }
			} while (((Class583) this)
				     .aClass241_Sub40_Sub1_7577
				     .method17156((byte) -122)
				 < 50);
			break;
		    }
		    break;
		}
		if (class241_sub40 instanceof Class241_Sub40_Sub3)
		    method12782(1077173999);
		else if (class241_sub40
			 != ((Class583) this).aClass241_Sub40_Sub2_7580) {
		    while (((Class241_Sub40) class241_sub40)
			       .anOggStreamState10150
			       .packetOut(((Class583) this).anOggPacket7576)
			   == 1) {
			if (1 == 647070621 * (((Class241_Sub40) class241_sub40)
					      .anInt10151)
			    && class241_sub40 instanceof Class241_Sub40_Sub3)
			    method12820(((Class583) this).aString7579,
					2059690796);
			class241_sub40.method16443((((Class583) this)
						    .anOggPacket7576),
						   421967667);
		    }
		} else if (null == ((Class583) this).aClass241_Sub40_Sub1_7577
			   && !((Class583) this).aBool7570) {
		    for (int i = 0; i < 10 && method12778((byte) -62); i++) {
			method12781(1775115186);
			if (((Class583) this).aBool7574)
			    break;
		    }
		    break;
		}
	    }
	}
    }
    
    Class583(int i) {
	try {
	    Class256.method5053((byte) 5).method109("jagtheora", 900741998);
	} catch (Exception_Sub4 exception_sub4) {
	    throw new RuntimeException("", exception_sub4);
	}
	((Class583) this).aByteArray7568 = new byte[i];
	((Class583) this).anOggSyncState7566 = new OggSyncState();
	((Class583) this).anOggPage7575 = new OggPage();
	((Class583) this).anOggPacket7576 = new OggPacket();
	((Class583) this).aClass407_7572 = new HashTable(8);
    }
    
    public void method12800(String string) {
	((Class583) this).aString7579 = string;
	if (((Class583) this).aString7579 == null)
	    ((Class583) this).aClass241_Sub40_Sub3_7578 = null;
	else {
	    if (((Class583) this).aClass241_Sub40_Sub3_7578 != null
		&& !(((Class583) this).aString7579.equals
		     (((Class583) this).aClass241_Sub40_Sub3_7578
			  .method17240(1963708526))))
		((Class583) this).aClass241_Sub40_Sub3_7578 = null;
	    if (null == ((Class583) this).aClass241_Sub40_Sub3_7578) {
		for (Class241_Sub40 class241_sub40
			 = (Class241_Sub40) ((Class583) this)
						.aClass407_7572
						.method7294(2090894173);
		     class241_sub40 != null;
		     class241_sub40
			 = (Class241_Sub40) ((Class583) this)
						.aClass407_7572
						.method7295(1148083645)) {
		    if (class241_sub40 instanceof Class241_Sub40_Sub3) {
			Class241_Sub40_Sub3 class241_sub40_sub3
			    = (Class241_Sub40_Sub3) class241_sub40;
			if (((Class583) this).aString7579.equals
			    (class241_sub40_sub3.method17240(1963708526))) {
			    ((Class583) this).aClass241_Sub40_Sub3_7578
				= class241_sub40_sub3;
			    break;
			}
		    }
		}
	    }
	}
    }
    
    void method12801() {
	for (Class241_Sub40 class241_sub40
		 = ((Class241_Sub40)
		    ((Class583) this).aClass407_7572.method7294(2090894173));
	     class241_sub40 != null;
	     class241_sub40 = (Class241_Sub40) ((Class583) this)
						   .aClass407_7572
						   .method7295(729847540)) {
	    if (class241_sub40 instanceof Class241_Sub40_Sub3) {
		Class241_Sub40_Sub3 class241_sub40_sub3
		    = (Class241_Sub40_Sub3) class241_sub40;
		while (((((Class241_Sub40_Sub3) class241_sub40_sub3).anInt10151
			 * 647070621) <= 8
			|| (method12789(16711935)
			    > (double) class241_sub40_sub3
					   .method17241(180420284)))
		       && (((Class241_Sub40_Sub3) class241_sub40_sub3)
			       .anOggStreamState10150
			       .packetOut(((Class583) this).anOggPacket7576)
			   == 1))
		    class241_sub40_sub3.method16443((((Class583) this)
						     .anOggPacket7576),
						    421967667);
	    }
	}
	method12820(((Class583) this).aString7579, 1692255310);
    }
    
    void method12802() throws IOException {
	while (((Class241_Sub40_Sub2)
		((Class583) this).aClass241_Sub40_Sub2_7580)
		   .anOggStreamState10150
		   .packetOut(((Class583) this).anOggPacket7576)
	       != 1) {
	    Class241_Sub40 class241_sub40 = method12779(619256416);
	    if (null == class241_sub40) {
		if (((Class583) this).aBool7569)
		    method12784((byte) 0);
		return;
	    }
	    if (class241_sub40 == ((Class583) this).aClass241_Sub40_Sub3_7578)
		method12782(1779861814);
	}
	((Class583) this).aClass241_Sub40_Sub2_7580
	    .method16443(((Class583) this).anOggPacket7576, 421967667);
    }
    
    boolean method12803() {
	if (((Class583) this).aClass241_Sub40_Sub1_7577 != null)
	    return (!((Class583) this).aClass241_Sub40_Sub2_7580
			 .method17217(724211329)
		    || method12789(16711935) > ((Class583) this)
						   .aClass241_Sub40_Sub2_7580
						   .method17218(1658516749));
	double d = (double) ((Class583) this).aClass241_Sub40_Sub2_7580
				.method17226(1292989463);
	return (0.0 == d
		|| ((double) Class50.method1249((byte) 1)
		    >= (double) ((Class583) this).aClass241_Sub40_Sub2_7580
				    .method17219((byte) 2) + 1000.0 / d));
    }
    
    void method12804() {
	for (Class241_Sub40 class241_sub40
		 = ((Class241_Sub40)
		    ((Class583) this).aClass407_7572.method7294(2090894173));
	     null != class241_sub40;
	     class241_sub40 = (Class241_Sub40) ((Class583) this)
						   .aClass407_7572
						   .method7295(1508964536)) {
	    if (class241_sub40
		!= ((Class583) this).aClass241_Sub40_Sub2_7580) {
		while (((Class241_Sub40) class241_sub40)
			   .anOggStreamState10150.packetOut()
		       == 1)
		    class241_sub40.method16443((((Class583) this)
						.anOggPacket7576),
					       421967667);
	    }
	}
	if (null != ((Class583) this).aClass241_Sub40_Sub2_7580) {
	    for (int i = 0; i < 10 && method12778((byte) 94); i++) {
		if (((Class241_Sub40_Sub2)
		     ((Class583) this).aClass241_Sub40_Sub2_7580)
			.anOggStreamState10150.packetOut()
		    != 1) {
		    method12785(-1809478217);
		    break;
		}
		((Class583) this).aClass241_Sub40_Sub2_7580
		    .method16443(((Class583) this).anOggPacket7576, 421967667);
	    }
	}
    }
    
    void method12805() {
	for (Class241_Sub40 class241_sub40
		 = ((Class241_Sub40)
		    ((Class583) this).aClass407_7572.method7294(2090894173));
	     null != class241_sub40;
	     class241_sub40 = (Class241_Sub40) ((Class583) this)
						   .aClass407_7572
						   .method7295(1162992700)) {
	    if (class241_sub40
		!= ((Class583) this).aClass241_Sub40_Sub2_7580) {
		while (((Class241_Sub40) class241_sub40)
			   .anOggStreamState10150.packetOut()
		       == 1)
		    class241_sub40.method16443((((Class583) this)
						.anOggPacket7576),
					       421967667);
	    }
	}
	if (null != ((Class583) this).aClass241_Sub40_Sub2_7580) {
	    for (int i = 0; i < 10 && method12778((byte) -20); i++) {
		if (((Class241_Sub40_Sub2)
		     ((Class583) this).aClass241_Sub40_Sub2_7580)
			.anOggStreamState10150.packetOut()
		    != 1) {
		    method12785(-1680097904);
		    break;
		}
		((Class583) this).aClass241_Sub40_Sub2_7580
		    .method16443(((Class583) this).anOggPacket7576, 421967667);
	    }
	}
    }
    
    void method12806() {
	for (Class241_Sub40 class241_sub40
		 = ((Class241_Sub40)
		    ((Class583) this).aClass407_7572.method7294(2090894173));
	     null != class241_sub40;
	     class241_sub40 = (Class241_Sub40) ((Class583) this)
						   .aClass407_7572
						   .method7295(216615421)) {
	    if (class241_sub40
		!= ((Class583) this).aClass241_Sub40_Sub2_7580) {
		while (((Class241_Sub40) class241_sub40)
			   .anOggStreamState10150.packetOut()
		       == 1)
		    class241_sub40.method16443((((Class583) this)
						.anOggPacket7576),
					       421967667);
	    }
	}
	if (null != ((Class583) this).aClass241_Sub40_Sub2_7580) {
	    for (int i = 0; i < 10 && method12778((byte) 11); i++) {
		if (((Class241_Sub40_Sub2)
		     ((Class583) this).aClass241_Sub40_Sub2_7580)
			.anOggStreamState10150.packetOut()
		    != 1) {
		    method12785(-2072730264);
		    break;
		}
		((Class583) this).aClass241_Sub40_Sub2_7580
		    .method16443(((Class583) this).anOggPacket7576, 421967667);
	    }
	}
    }
    
    public void method12807() {
	if (!((Class583) this).aBool7574) {
	    for (Class241_Sub40 class241_sub40
		     = (Class241_Sub40) ((Class583) this).aClass407_7572
					    .method7294(2090894173);
		 class241_sub40 != null;
		 class241_sub40
		     = (Class241_Sub40) ((Class583) this).aClass407_7572
					    .method7295(-40960673)) {
		class241_sub40.method16445(305624853);
		((Class241_Sub40) class241_sub40).anOggStreamState10150
		    .method7216();
	    }
	    ((Class583) this).anOggPacket7576.method7216();
	    ((Class583) this).anOggPage7575.method7216();
	    ((Class583) this).anOggSyncState7566.method7216();
	    ((Class583) this).aBool7574 = true;
	}
    }
    
    abstract int method12808(byte[] is, byte i) throws IOException;
    
    void method12809() throws IOException {
	while (((Class241_Sub40_Sub2)
		((Class583) this).aClass241_Sub40_Sub2_7580)
		   .anOggStreamState10150
		   .packetOut(((Class583) this).anOggPacket7576)
	       != 1) {
	    Class241_Sub40 class241_sub40 = method12779(619256416);
	    if (null == class241_sub40) {
		if (((Class583) this).aBool7569)
		    method12784((byte) 0);
		return;
	    }
	    if (class241_sub40 == ((Class583) this).aClass241_Sub40_Sub3_7578)
		method12782(-582976446);
	}
	((Class583) this).aClass241_Sub40_Sub2_7580
	    .method16443(((Class583) this).anOggPacket7576, 421967667);
    }
    
    public Class241_Sub40_Sub1 method12810() {
	return ((Class583) this).aClass241_Sub40_Sub1_7577;
    }
    
    public Class241_Sub40_Sub1 method12811() {
	return ((Class583) this).aClass241_Sub40_Sub1_7577;
    }
    
    public Class241_Sub40_Sub3 method12812() {
	return ((Class583) this).aClass241_Sub40_Sub3_7578;
    }
    
    public Class241_Sub40_Sub3 method12813() {
	return ((Class583) this).aClass241_Sub40_Sub3_7578;
    }
    
    public boolean method12814() {
	if (!((Class583) this).aBool7574 && !((Class583) this).aBool7569)
	    return false;
	if (null != ((Class583) this).aClass241_Sub40_Sub1_7577
	    && ((Class583) this).aClass241_Sub40_Sub1_7577
		   .method17156((byte) -103) > 0)
	    return false;
	return true;
    }
    
    public Class241_Sub40_Sub2 method12815() {
	return ((Class583) this).aClass241_Sub40_Sub2_7580;
    }
    
    public void method12816(String string) {
	((Class583) this).aString7579 = string;
	if (((Class583) this).aString7579 == null)
	    ((Class583) this).aClass241_Sub40_Sub3_7578 = null;
	else {
	    if (((Class583) this).aClass241_Sub40_Sub3_7578 != null
		&& !(((Class583) this).aString7579.equals
		     (((Class583) this).aClass241_Sub40_Sub3_7578
			  .method17240(1963708526))))
		((Class583) this).aClass241_Sub40_Sub3_7578 = null;
	    if (null == ((Class583) this).aClass241_Sub40_Sub3_7578) {
		for (Class241_Sub40 class241_sub40
			 = (Class241_Sub40) ((Class583) this)
						.aClass407_7572
						.method7294(2090894173);
		     class241_sub40 != null;
		     class241_sub40
			 = (Class241_Sub40) ((Class583) this)
						.aClass407_7572
						.method7295(1093693946)) {
		    if (class241_sub40 instanceof Class241_Sub40_Sub3) {
			Class241_Sub40_Sub3 class241_sub40_sub3
			    = (Class241_Sub40_Sub3) class241_sub40;
			if (((Class583) this).aString7579.equals
			    (class241_sub40_sub3.method17240(1963708526))) {
			    ((Class583) this).aClass241_Sub40_Sub3_7578
				= class241_sub40_sub3;
			    break;
			}
		    }
		}
	    }
	}
    }
    
    public Class241_Sub40_Sub1 method12817(int i) {
	return ((Class583) this).aClass241_Sub40_Sub1_7577;
    }
    
    Class241_Sub40 method12818() throws IOException {
	if (((Class583) this).aBool7574)
	    throw new IllegalStateException();
	if (((Class583) this).aBool7569)
	    return null;
	while (((Class583) this).anOggSyncState7566
		   .pageOut(((Class583) this).anOggPage7575)
	       <= 0) {
	    int i = method12808(((Class583) this).aByteArray7568, (byte) -128);
	    if (i == -1) {
		((Class583) this).aBool7569 = true;
		return null;
	    }
	    if (0 == i)
		return null;
	    if (!((Class583) this).anOggSyncState7566
		     .write(((Class583) this).aByteArray7568, i))
		throw new RuntimeException("");
	}
	int i = ((Class583) this).anOggPage7575.getSerialNumber();
	if (((Class583) this).anOggPage7575.isBOS()) {
	    OggStreamState oggstreamstate = new OggStreamState(i);
	    if (!oggstreamstate.pageIn(((Class583) this).anOggPage7575))
		throw new IllegalStateException();
	    if (oggstreamstate.packetPeek(((Class583) this).anOggPacket7576)
		!= 1)
		throw new IllegalStateException();
	    Class241_Sub40 class241_sub40;
	    if (null == ((Class583) this).aClass241_Sub40_Sub2_7580
		&& ((Class583) this).anOggPacket7576.isTheora()) {
		((Class583) this).aClass241_Sub40_Sub2_7580
		    = new Class241_Sub40_Sub2(oggstreamstate);
		class241_sub40 = ((Class583) this).aClass241_Sub40_Sub2_7580;
	    } else if (((Class583) this).aClass241_Sub40_Sub1_7577 == null
		       && ((Class583) this).anOggPacket7576.isVorbis()) {
		((Class583) this).aClass241_Sub40_Sub1_7577
		    = new Class241_Sub40_Sub1(oggstreamstate);
		class241_sub40 = ((Class583) this).aClass241_Sub40_Sub1_7577;
	    } else {
		byte[] is = ((Class583) this).anOggPacket7576.getData();
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_6_ = 1;
		     (i_6_ < is.length
		      && Character.isLetterOrDigit((char) is[i_6_]));
		     i_6_++)
		    stringbuilder.append((char) is[i_6_]);
		String string = stringbuilder.toString();
		if (string.equals("kate"))
		    class241_sub40 = new Class241_Sub40_Sub3(oggstreamstate);
		else
		    class241_sub40 = new Class241_Sub40_Sub4(oggstreamstate);
	    }
	    ((Class583) this).aClass407_7572.put(class241_sub40,
							(long) i);
	    return class241_sub40;
	}
	Class241_Sub40 class241_sub40
	    = ((Class241_Sub40)
	       ((Class583) this).aClass407_7572.get((long) i));
	if (!((Class241_Sub40) class241_sub40).anOggStreamState10150
		 .pageIn(((Class583) this).anOggPage7575))
	    throw new IllegalStateException();
	return class241_sub40;
    }
    
    public void method12819(byte i) throws IOException {
	if (!((Class583) this).aBool7570) {
	while_134_:
	    for (/**/; !((Class583) this).aBool7574;
		 ((Class583) this).aBool7573 = false) {
		Class241_Sub40 class241_sub40;
		if (!((Class583) this).aBool7573) {
		    class241_sub40 = method12779(619256416);
		    if (class241_sub40 == null) {
			if (((Class583) this).aBool7569)
			    method12784((byte) 0);
			break;
		    }
		    if (null == class241_sub40)
			throw new IllegalStateException();
		    ((Class583) this).aBool7573 = true;
		} else
		    class241_sub40
			= ((Class241_Sub40)
			   (((Class583) this).aClass407_7572.get
			    ((long) ((Class583) this).anOggPage7575
					.getSerialNumber())));
		if (((Class583) this).aClass241_Sub40_Sub1_7577
		    == class241_sub40) {
		    if (((Class583) this).aClass241_Sub40_Sub1_7577
			    .method17156((byte) -32)
			< 50) {
			do {
			    if ((((Class241_Sub40_Sub1)
				  ((Class583) this).aClass241_Sub40_Sub1_7577)
				     .anOggStreamState10150.packetOut
				 (((Class583) this).anOggPacket7576))
				!= 1)
				continue while_134_;
			    ((Class583) this).aClass241_Sub40_Sub1_7577
				.method16443
				(((Class583) this).anOggPacket7576, 421967667);
			    method12782(-1782946942);
			    if (((Class583) this).aClass241_Sub40_Sub2_7580
				!= null) {
				double d = ((Class583) this)
					       .aClass241_Sub40_Sub2_7580
					       .method17218(1812400992);
				for (int i_7_ = 0;
				     i_7_ < 10 && method12778((byte) 74);
				     i_7_++) {
				    method12781(1775115186);
				    if (((Class583) this).aBool7574)
					return;
				}
				if (d < ((Class583) this)
					    .aClass241_Sub40_Sub2_7580
					    .method17218(1589005213))
				    break;
			    }
			} while (((Class583) this)
				     .aClass241_Sub40_Sub1_7577
				     .method17156((byte) -105)
				 < 50);
			break;
		    }
		    break;
		}
		if (class241_sub40 instanceof Class241_Sub40_Sub3)
		    method12782(1180525316);
		else if (class241_sub40
			 != ((Class583) this).aClass241_Sub40_Sub2_7580) {
		    while (((Class241_Sub40) class241_sub40)
			       .anOggStreamState10150
			       .packetOut(((Class583) this).anOggPacket7576)
			   == 1) {
			if (1 == 647070621 * (((Class241_Sub40) class241_sub40)
					      .anInt10151)
			    && class241_sub40 instanceof Class241_Sub40_Sub3)
			    method12820(((Class583) this).aString7579,
					1873347382);
			class241_sub40.method16443((((Class583) this)
						    .anOggPacket7576),
						   421967667);
		    }
		} else if (null == ((Class583) this).aClass241_Sub40_Sub1_7577
			   && !((Class583) this).aBool7570) {
		    for (int i_8_ = 0; i_8_ < 10 && method12778((byte) -109);
			 i_8_++) {
			method12781(1775115186);
			if (((Class583) this).aBool7574)
			    break;
		    }
		    break;
		}
	    }
	}
    }
    
    public void method12820(String string, int i) {
	((Class583) this).aString7579 = string;
	if (((Class583) this).aString7579 == null)
	    ((Class583) this).aClass241_Sub40_Sub3_7578 = null;
	else {
	    if (((Class583) this).aClass241_Sub40_Sub3_7578 != null
		&& !(((Class583) this).aString7579.equals
		     (((Class583) this).aClass241_Sub40_Sub3_7578
			  .method17240(1963708526))))
		((Class583) this).aClass241_Sub40_Sub3_7578 = null;
	    if (null == ((Class583) this).aClass241_Sub40_Sub3_7578) {
		for (Class241_Sub40 class241_sub40
			 = (Class241_Sub40) ((Class583) this)
						.aClass407_7572
						.method7294(2090894173);
		     class241_sub40 != null;
		     class241_sub40
			 = (Class241_Sub40) ((Class583) this)
						.aClass407_7572
						.method7295(729813078)) {
		    if (class241_sub40 instanceof Class241_Sub40_Sub3) {
			Class241_Sub40_Sub3 class241_sub40_sub3
			    = (Class241_Sub40_Sub3) class241_sub40;
			if (((Class583) this).aString7579.equals
			    (class241_sub40_sub3.method17240(1963708526))) {
			    ((Class583) this).aClass241_Sub40_Sub3_7578
				= class241_sub40_sub3;
			    break;
			}
		    }
		}
	    }
	}
    }
    
    public double method12821() {
	if (((Class583) this).aClass241_Sub40_Sub1_7577 != null)
	    return ((Class583) this).aClass241_Sub40_Sub1_7577
		       .method17155((short) -21811);
	if (((Class583) this).aClass241_Sub40_Sub2_7580 != null)
	    return ((Class583) this).aClass241_Sub40_Sub2_7580
		       .method17218(1576887700);
	return 0.0;
    }
    
    public double method12822() {
	if (((Class583) this).aClass241_Sub40_Sub1_7577 != null)
	    return ((Class583) this).aClass241_Sub40_Sub1_7577
		       .method17155((short) 14836);
	if (((Class583) this).aClass241_Sub40_Sub2_7580 != null)
	    return ((Class583) this).aClass241_Sub40_Sub2_7580
		       .method17218(1563697835);
	return 0.0;
    }
    
    public void method12823(boolean bool) {
	if (null != ((Class583) this).aClass241_Sub40_Sub1_7577) {
	    Class241_Sub18_Sub1 class241_sub18_sub1
		= ((Class583) this).aClass241_Sub40_Sub1_7577
		      .method17153((byte) -55);
	    if (null != class241_sub18_sub1)
		class241_sub18_sub1.method17134(bool, (byte) 126);
	}
	((Class583) this).aBool7570 = !((Class583) this).aBool7570;
    }
    
    public void method12824(String string) {
	((Class583) this).aString7579 = string;
	if (((Class583) this).aString7579 == null)
	    ((Class583) this).aClass241_Sub40_Sub3_7578 = null;
	else {
	    if (((Class583) this).aClass241_Sub40_Sub3_7578 != null
		&& !(((Class583) this).aString7579.equals
		     (((Class583) this).aClass241_Sub40_Sub3_7578
			  .method17240(1963708526))))
		((Class583) this).aClass241_Sub40_Sub3_7578 = null;
	    if (null == ((Class583) this).aClass241_Sub40_Sub3_7578) {
		for (Class241_Sub40 class241_sub40
			 = (Class241_Sub40) ((Class583) this)
						.aClass407_7572
						.method7294(2090894173);
		     class241_sub40 != null;
		     class241_sub40
			 = (Class241_Sub40) ((Class583) this)
						.aClass407_7572
						.method7295(696253048)) {
		    if (class241_sub40 instanceof Class241_Sub40_Sub3) {
			Class241_Sub40_Sub3 class241_sub40_sub3
			    = (Class241_Sub40_Sub3) class241_sub40;
			if (((Class583) this).aString7579.equals
			    (class241_sub40_sub3.method17240(1963708526))) {
			    ((Class583) this).aClass241_Sub40_Sub3_7578
				= class241_sub40_sub3;
			    break;
			}
		    }
		}
	    }
	}
    }
    
    static void method12825(Class103 class103, int i, int i_9_, int i_10_,
			    int i_11_, int i_12_, int i_13_, int i_14_,
			    int i_15_) {
	Class552 class552 = client.aClass238_8477.method4751(-1120381357);
	Interface24 interface24
	    = (Interface24) class552.method12132(i, i_9_, i_10_, (byte) 7);
	if (null != interface24) {
	    ObjectDefinition class526
		= client.aClass238_8477.getObjectLoader(-2060635628)
		      .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	    int i_16_ = interface24.method140(1631902010) & 0x3;
	    int i_17_ = interface24.method139(591463713);
	    if (-1 != class526.anInt6864 * -1848119147)
		Exception_Sub4.method16945(class103, class526, i_16_, i_11_,
					   i_12_, (byte) 26);
	    else {
		int i_18_ = i_13_;
		if (-1389471035 * class526.anInt6848 > 0)
		    i_18_ = i_14_;
		if (-2030829961 * Class527.aClass527_6932.anInt6931 == i_17_
		    || (i_17_
			== -2030829961 * Class527.aClass527_6910.anInt6931)) {
		    if (i_16_ == 0)
			class103.method2241(i_11_, i_12_, 4, i_18_,
					    -517857856);
		    else if (1 == i_16_)
			class103.method2265(i_11_, i_12_, 4, i_18_,
					    -1435956668);
		    else if (2 == i_16_)
			class103.method2241(3 + i_11_, i_12_, 4, i_18_,
					    -517857856);
		    else if (3 == i_16_)
			class103.method2265(i_11_, 3 + i_12_, 4, i_18_,
					    206199824);
		}
		if (i_17_ == -2030829961 * Class527.aClass527_6916.anInt6931) {
		    if (i_16_ == 0)
			class103.method2263(i_11_, i_12_, 1, 1, i_18_,
					    (byte) -58);
		    else if (1 == i_16_)
			class103.method2263(i_11_ + 3, i_12_, 1, 1, i_18_,
					    (byte) 2);
		    else if (2 == i_16_)
			class103.method2263(i_11_ + 3, i_12_ + 3, 1, 1, i_18_,
					    (byte) -128);
		    else if (3 == i_16_)
			class103.method2263(i_11_, i_12_ + 3, 1, 1, i_18_,
					    (byte) -51);
		}
		if (Class527.aClass527_6910.anInt6931 * -2030829961 == i_17_) {
		    if (0 == i_16_)
			class103.method2265(i_11_, i_12_, 4, i_18_, 122127670);
		    else if (1 == i_16_)
			class103.method2241(3 + i_11_, i_12_, 4, i_18_,
					    -517857856);
		    else if (i_16_ == 2)
			class103.method2265(i_11_, 3 + i_12_, 4, i_18_,
					    -1299179868);
		    else if (3 == i_16_)
			class103.method2241(i_11_, i_12_, 4, i_18_,
					    -517857856);
		}
	    }
	}
	interface24
	    = (Interface24) class552.method12136(i, i_9_, i_10_,
						 client.anInterface57_8577,
						 -193597600);
	if (interface24 != null) {
	    ObjectDefinition class526
		= client.aClass238_8477.getObjectLoader(-1844665919)
		      .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	    int i_19_ = interface24.method140(-1415099498) & 0x3;
	    int i_20_ = interface24.method139(591463713);
	    if (-1 != -1848119147 * class526.anInt6864)
		Exception_Sub4.method16945(class103, class526, i_19_, i_11_,
					   i_12_, (byte) -82);
	    else if (i_20_
		     == Class527.aClass527_6912.anInt6931 * -2030829961) {
		int i_21_ = -1118482;
		if (-1389471035 * class526.anInt6848 > 0)
		    i_21_ = -1179648;
		if (i_19_ == 0 || i_19_ == 2)
		    class103.method2517(i_11_, 3 + i_12_, i_11_ + 3, i_12_,
					i_21_, 223909001);
		else
		    class103.method2517(i_11_, i_12_, 3 + i_11_, i_12_ + 3,
					i_21_, 223909001);
	    }
	}
	interface24
	    = (Interface24) class552.method12100(i, i_9_, i_10_, 1707647986);
	if (null != interface24) {
	    ObjectDefinition class526
		= client.aClass238_8477.getObjectLoader(-1919120161)
		      .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	    int i_22_ = interface24.method140(-1377734598) & 0x3;
	    if (-1 != -1848119147 * class526.anInt6864)
		Exception_Sub4.method16945(class103, class526, i_22_, i_11_,
					   i_12_, (byte) 57);
	}
    }
    
    static final void setComponentAlpha/*method12826*/(InterfaceComponent component, InterfaceDefinition iFace,
				  ClientScriptData scriptData, byte i) {
    	component.colourAlpha = (scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719] * -11516667);
		WorldType.refreshComponent(component, 1827078711);
    }
    
    static final void method12827(ClientScriptData class454, int i) {
	int i_23_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (null == Class187.aClass35Array2203[i_23_])
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class187.aClass35Array2203[i_23_].components.length;
    }
    
    static final void method12828(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		if (-389932081 * ((Class455) class455).aClass58_6248.slot1 == -1) {
		    if (scriptData.aBool6246) {
		    	throw new RuntimeException("");
		    }
		    throw new RuntimeException("");
		}
		InterfaceComponent class58 = class455.method10562(-1917191155);
		class58.aClass58Array836[(((Class455) class455).aClass58_6248.slot1 * -389932081)]
		    = null;
		WorldType.refreshComponent(class58, 1681236668);
    }
    
    static void method12829(Class548[][][] class548s, byte i) {
	for (int i_24_ = 0; i_24_ < class548s.length; i_24_++) {
	    Class548[][] class548s_25_ = class548s[i_24_];
	    for (int i_26_ = 0; i_26_ < class548s_25_.length; i_26_++) {
		for (int i_27_ = 0; i_27_ < class548s_25_[i_26_].length;
		     i_27_++) {
		    Class548 class548 = class548s_25_[i_26_][i_27_];
		    if (class548 != null) {
			if (class548.aClass475_Sub1_Sub4_7058
			    instanceof Interface24)
			    ((Interface24) class548.aClass475_Sub1_Sub4_7058)
				.method143(-1182983581);
			if (class548.aClass475_Sub1_Sub5_7061
			    instanceof Interface24)
			    ((Interface24) class548.aClass475_Sub1_Sub5_7061)
				.method143(1471067482);
			if (class548.aClass475_Sub1_Sub5_7059
			    instanceof Interface24)
			    ((Interface24) class548.aClass475_Sub1_Sub5_7059)
				.method143(-1222117314);
			if (class548.aClass475_Sub1_Sub3_7055
			    instanceof Interface24)
			    ((Interface24) class548.aClass475_Sub1_Sub3_7055)
				.method143(-672630380);
			if (class548.aClass475_Sub1_Sub3_7056
			    instanceof Interface24)
			    ((Interface24) class548.aClass475_Sub1_Sub3_7056)
				.method143(-792730017);
			for (Class541 class541 = class548.aClass541_7053;
			     null != class541;
			     class541 = class541.aClass541_7005) {
			    Class475_Sub1_Sub1 class475_sub1_sub1
				= class541.aClass475_Sub1_Sub1_7004;
			    if (class475_sub1_sub1 instanceof Interface24)
				((Interface24) class475_sub1_sub1)
				    .method143(950927957);
			}
		    }
		}
	    }
	}
    }
    
    static final void method12830(WorldObject class241_sub30, int i) {
	Class552 class552 = client.aClass238_8477.method4751(-2088650121);
	if (class552 != null) {
	    Interface24 interface24 = null;
	    if (0 == ((WorldObject) class241_sub30).anInt10040 * -759362859)
		interface24
		    = ((Interface24)
		       (class552.method12132
			((-603972145
			  * ((WorldObject) class241_sub30).plane),
			 1204421839 * class241_sub30.posX,
			 class241_sub30.posY * -320018831, (byte) 7)));
	    if (1 == ((WorldObject) class241_sub30).anInt10040 * -759362859)
		interface24
		    = ((Interface24)
		       class552.method12162((((WorldObject) class241_sub30)
					     .plane) * -603972145,
					    (class241_sub30.posX
					     * 1204421839),
					    (class241_sub30.posY
					     * -320018831),
					    -954927617));
	    if (((WorldObject) class241_sub30).anInt10040 * -759362859 == 2)
		interface24
		    = (Interface24) (class552.method12136
				     (-603972145 * ((WorldObject)
						    class241_sub30).plane,
				      1204421839 * class241_sub30.posX,
				      class241_sub30.posY * -320018831,
				      client.anInterface57_8577, -1932057319));
	    if (((WorldObject) class241_sub30).anInt10040 * -759362859 == 3)
		interface24
		    = ((Interface24)
		       class552.method12100((((WorldObject) class241_sub30)
					     .plane) * -603972145,
					    (class241_sub30.posX
					     * 1204421839),
					    (class241_sub30.posY
					     * -320018831),
					    1939095320));
	    if (interface24 != null) {
		((WorldObject) class241_sub30).anInt10043
		    = interface24.method146((byte) 0) * 995991365;
		((WorldObject) class241_sub30).anInt10050
		    = interface24.method139(591463713) * 1860167345;
		((WorldObject) class241_sub30).anInt10052
		    = interface24.method140(1865792080) * 606228197;
	    } else {
		((WorldObject) class241_sub30).anInt10043 = -995991365;
		((WorldObject) class241_sub30).anInt10050 = 0;
		((WorldObject) class241_sub30).anInt10052 = 0;
	    }
	}
    }
}
