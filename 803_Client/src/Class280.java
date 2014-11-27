/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class280
{
    Class241_Sub39_Sub5_Sub2 aClass241_Sub39_Sub5_Sub2_4397;
    Class207 aClass207_4398;
    Class291 aClass291_4399;
    BigInteger aBigInteger4400;
    BigInteger aBigInteger4401;
    Class241_Sub39_Sub5_Sub3 aClass241_Sub39_Sub5_Sub3_4402;
    Class209 aClass209_4403;
    MasterIndex aClass297_4404;
    MasterIndex diskMasterIndex;//aClass297_4405
    boolean aBool4406 = false;
    Class279_Sub1[] aClass279_Sub1Array4407;
    
    public void method5468() {
		diskMasterIndex = null;
		aClass241_Sub39_Sub5_Sub3_4402 = null;
		aClass241_Sub39_Sub5_Sub2_4397 = null;
		aBool4406 = false;
		if (!aClass209_4403.method4141(-125752540))
		    aClass241_Sub39_Sub5_Sub3_4402
			= aClass209_4403
			      .method4139(255, 255, (byte) 0, true, (byte) 108);
    }
    
    public Class279_Sub1 method5469(int i, Class568 class568,
				    Class568 class568_0_, boolean bool) {
	return method5472(i, class568, class568_0_, true, bool, (byte) 1);
    }
    
    public Class279_Sub1 method5470(int i, Class568 class568,
				    Class568 class568_1_, boolean bool) {
	return method5472(i, class568, class568_1_, true, bool, (byte) 1);
    }
    
    public Class279_Sub1 method5471(int i, Class568 class568, Class568 class568_2_, boolean bool,
				    byte i_3_) {
    	return method5472(i, class568, class568_2_, true, bool, (byte) 1);
    }
    
    Class279_Sub1 method5472(int archiveID, Class568 class568, Class568 class568_4_,
			     boolean bool, boolean streamed, byte i_6_) {
		if (diskMasterIndex == null) {
		    throw new RuntimeException("Not ready!");
		}
		if (archiveID < 0 || archiveID >= aClass279_Sub1Array4407.length) {
		    throw new RuntimeException("Invalid archiveid requested - archiveid:" + archiveID);
		}
		if (null != aClass279_Sub1Array4407[archiveID]) {
		    return aClass279_Sub1Array4407[archiveID];
		}
		Class274 class274 = (((MasterIndex) diskMasterIndex).aClass274Array4514[archiveID]);
		Class279_Sub1 class279_sub1
		    = new Class279_Sub1(archiveID, class568, class568_4_,
					aClass209_4403,
					(streamed ? aClass207_4398 : null),
					aClass291_4399,
					((Class274) class274).anInt4378 * 286477303,
					((Class274) class274).aByteArray4377,
					((Class274) class274).anInt4376 * 736175443,
					bool,
					((Class274) class274).anInt4375 * -1465205157);
		aClass279_Sub1Array4407[archiveID] = class279_sub1;
		if (null != aClass297_4404 && streamed) {
		    Class274 class274_7_
				= (((MasterIndex) aClass297_4404).aClass274Array4514[archiveID]);
		    aClass279_Sub1Array4407[archiveID].method16635
			((aClass279_Sub1Array4407[archiveID].method16626
			  (286477303 * ((Class274) class274_7_).anInt4378,
			   ((Class274) class274_7_).aByteArray4377,
			   ((Class274) class274_7_).anInt4376 * 736175443,
			   ((Class274) class274_7_).anInt4375 * -1465205157,
			   130888779)),
			 -1411787864);
		}
		return class279_sub1;
    }
    
    public boolean method5473(byte i) {
		if (diskMasterIndex != null)
		    return true;
		if (aClass241_Sub39_Sub5_Sub3_4402 == null) {
		    if (aClass209_4403.method4141(-418717448))
			return false;
		    aClass241_Sub39_Sub5_Sub3_4402
			= aClass209_4403
			      .method4139(255, 255, (byte) 0, true, (byte) 85);
		}
		if (((Class241_Sub39_Sub5_Sub3) aClass241_Sub39_Sub5_Sub3_4402).aBool10839) {
		    return false;
		}
		RSByteBuffer class241_sub3 = new RSByteBuffer(aClass241_Sub39_Sub5_Sub3_4402.method17108(-510488418));
		diskMasterIndex = new MasterIndex(class241_sub3, aBigInteger4400, aBigInteger4401);
		if (aClass279_Sub1Array4407 == null) {
		    aClass279_Sub1Array4407
				= new Class279_Sub1[(((MasterIndex) diskMasterIndex).aClass274Array4514).length];
		} else {
		    for (int i_8_ = 0; i_8_ < aClass279_Sub1Array4407.length; i_8_++) {
			if (aClass279_Sub1Array4407[i_8_] != null) {
			    Class274 class274
				= (((MasterIndex) diskMasterIndex)
				   .aClass274Array4514[i_8_]);
			    aClass279_Sub1Array4407[i_8_].method16630
				(286477303 * ((Class274) class274).anInt4378,
				 ((Class274) class274).aByteArray4377,
				 ((Class274) class274).anInt4376 * 736175443,
				 -1465205157 * ((Class274) class274).anInt4375,
				 (byte) 8);
			    if (aClass279_Sub1Array4407[i_8_]
				    .method16597((byte) 0))
				aClass279_Sub1Array4407[i_8_]
				    .method16635(false, -1411787864);
			}
		    }
		}
		aBool4406 = false;
		return true;
    }
    
    public boolean method5474() {
	if (diskMasterIndex != null)
	    return true;
	if (aClass241_Sub39_Sub5_Sub3_4402 == null) {
	    if (aClass209_4403.method4141(575031127))
		return false;
	    aClass241_Sub39_Sub5_Sub3_4402
		= aClass209_4403
		      .method4139(255, 255, (byte) 0, true, (byte) 104);
	}
	if (((Class241_Sub39_Sub5_Sub3)
	     aClass241_Sub39_Sub5_Sub3_4402)
	    .aBool10839)
	    return false;
	RSByteBuffer class241_sub3
	    = new RSByteBuffer(((Class280) this)
				    .aClass241_Sub39_Sub5_Sub3_4402
				    .method17108(-510488418));
	diskMasterIndex
	    = new MasterIndex(class241_sub3, aBigInteger4400,
			   aBigInteger4401);
	if (aClass279_Sub1Array4407 == null)
	    aClass279_Sub1Array4407
		= (new Class279_Sub1
		   [(((MasterIndex) diskMasterIndex)
		     .aClass274Array4514).length]);
	else {
	    for (int i = 0;
		 i < aClass279_Sub1Array4407.length; i++) {
		if (aClass279_Sub1Array4407[i] != null) {
		    Class274 class274
			= (((MasterIndex) diskMasterIndex)
			   .aClass274Array4514[i]);
		    aClass279_Sub1Array4407[i].method16630
			(286477303 * ((Class274) class274).anInt4378,
			 ((Class274) class274).aByteArray4377,
			 ((Class274) class274).anInt4376 * 736175443,
			 -1465205157 * ((Class274) class274).anInt4375,
			 (byte) 8);
		    if (aClass279_Sub1Array4407[i]
			    .method16597((byte) 0))
			aClass279_Sub1Array4407[i]
			    .method16635(false, -1411787864);
		}
	    }
	}
	aBool4406 = false;
	return true;
    }
    
    public Class280(Class209 class209, Class207 class207, Class291 class291,
		    BigInteger biginteger, BigInteger biginteger_9_) {
		aClass209_4403 = class209;
		aClass207_4398 = class207;
		aClass291_4399 = class291;
		aBigInteger4400 = biginteger;
		aBigInteger4401 = biginteger_9_;
		if (!aClass209_4403.method4141(447055984)) {
		    aClass241_Sub39_Sub5_Sub3_4402//Fetch main index
				= aClass209_4403.method4139(255, 255, (byte) 0, true, (byte) 72);
		}
		if (aClass207_4398 != null) {
		    aClass241_Sub39_Sub5_Sub2_4397
				= aClass207_4398.method4116(1482319719);
		}
    }
    
    public Class279_Sub1 method5475(int i, Class568 class568,
				    Class568 class568_10_, boolean bool) {
    	return method5472(i, class568, class568_10_, true, bool, (byte) 1);
    }
    
    public void method5476(byte i) {
	if (null != aClass279_Sub1Array4407) {
	    for (int i_11_ = 0;
		 i_11_ < aClass279_Sub1Array4407.length;
		 i_11_++) {
		if (null != aClass279_Sub1Array4407[i_11_])
		    aClass279_Sub1Array4407[i_11_]
			.method16602(-1736709914);
	    }
	    for (int i_12_ = 0;
		 i_12_ < aClass279_Sub1Array4407.length;
		 i_12_++) {
		if (aClass279_Sub1Array4407[i_12_] != null)
		    aClass279_Sub1Array4407[i_12_]
			.method16603(-1580442535);
	    }
	    if (null == diskMasterIndex)
		method5473((byte) 127);
	    else if (aClass207_4398 != null
		     && !aBool4406) {
		if (aClass241_Sub39_Sub5_Sub2_4397 == null)
		    aClass241_Sub39_Sub5_Sub2_4397
			= aClass207_4398
			      .method4116(1482319719);
		else if (!((Class241_Sub39_Sub5_Sub2)
			   aClass241_Sub39_Sub5_Sub2_4397)
			  .aBool10839) {
		    byte[] is
			= aClass241_Sub39_Sub5_Sub2_4397
			      .method17108(-510488418);
		    try {
			aClass297_4404
			    = new MasterIndex(new RSByteBuffer(is),
					   aBigInteger4400,
					   aBigInteger4401);
			for (int i_13_ = 0;
			     i_13_ < (((Class280) this)
				      .aClass279_Sub1Array4407).length;
			     i_13_++) {
			    if (null != (((Class280) this)
					 .aClass279_Sub1Array4407[i_13_])
				&& ((Class280) this)
				       .aClass279_Sub1Array4407[i_13_]
				       .method16597((byte) 0)) {
				Class274 class274
				    = (((MasterIndex)
					aClass297_4404)
				       .aClass274Array4514[i_13_]);
				aClass279_Sub1Array4407
				    [i_13_].method16635
				    ((((Class280) this)
					  .aClass279_Sub1Array4407[i_13_]
					  .method16626
				      ((((Class274) class274).anInt4378
					* 286477303),
				       ((Class274) class274).aByteArray4377,
				       (((Class274) class274).anInt4376
					* 736175443),
				       (((Class274) class274).anInt4375
					* -1465205157),
				       2018100568)),
				     -1411787864);
			    }
			}
		    } catch (Exception exception) {
			for (int i_14_ = 0;
			     i_14_ < (((Class280) this)
				      .aClass279_Sub1Array4407).length;
			     i_14_++) {
			    if ((aClass279_Sub1Array4407
				 [i_14_]) != null
				&& ((Class280) this)
				       .aClass279_Sub1Array4407[i_14_]
				       .method16597((byte) 0))
				aClass279_Sub1Array4407
				    [i_14_].method16635(false, -1411787864);
			}
		    }
		    aClass241_Sub39_Sub5_Sub2_4397 = null;
		    aBool4406 = true;
		}
	    }
	}
    }
    
    public Class279_Sub1 method5477(int i, Class568 class568,
				    Class568 class568_15_, boolean bool) {
	return method5472(i, class568, class568_15_, true, bool, (byte) 1);
    }
    
    public Class279_Sub1 method5478(int i, Class568 class568,
				    Class568 class568_16_, boolean bool) {
	return method5472(i, class568, class568_16_, true, bool, (byte) 1);
    }
    
    public void method5479(int i) {
	diskMasterIndex = null;
	aClass241_Sub39_Sub5_Sub3_4402 = null;
	aClass241_Sub39_Sub5_Sub2_4397 = null;
	aBool4406 = false;
	if (!aClass209_4403.method4141(1110533491))
	    aClass241_Sub39_Sub5_Sub3_4402
		= aClass209_4403
		      .method4139(255, 255, (byte) 0, true, (byte) 117);
    }
    
    Class279_Sub1 method5480(int i, Class568 class568, Class568 class568_17_,
			     boolean bool, boolean bool_18_) {
	if (diskMasterIndex == null)
	    throw new RuntimeException();
	if (i < 0 || i >= aClass279_Sub1Array4407.length)
	    throw new RuntimeException();
	if (null != aClass279_Sub1Array4407[i])
	    return aClass279_Sub1Array4407[i];
	Class274 class274 = (((MasterIndex) diskMasterIndex)
			     .aClass274Array4514[i]);
	Class279_Sub1 class279_sub1
	    = new Class279_Sub1(i, class568, class568_17_,
				aClass209_4403,
				(bool_18_ ? aClass207_4398
				 : null),
				aClass291_4399,
				((Class274) class274).anInt4378 * 286477303,
				((Class274) class274).aByteArray4377,
				((Class274) class274).anInt4376 * 736175443,
				bool,
				((Class274) class274).anInt4375 * -1465205157);
	aClass279_Sub1Array4407[i] = class279_sub1;
	if (null != aClass297_4404 && bool_18_) {
	    Class274 class274_19_
		= (((MasterIndex) aClass297_4404)
		   .aClass274Array4514[i]);
	    aClass279_Sub1Array4407[i].method16635
		((aClass279_Sub1Array4407[i].method16626
		  (286477303 * ((Class274) class274_19_).anInt4378,
		   ((Class274) class274_19_).aByteArray4377,
		   ((Class274) class274_19_).anInt4376 * 736175443,
		   ((Class274) class274_19_).anInt4375 * -1465205157,
		   -1994658787)),
		 -1411787864);
	}
	return class279_sub1;
    }
    
    public void method5481() {
	if (null != aClass279_Sub1Array4407) {
	    for (int i = 0;
		 i < aClass279_Sub1Array4407.length; i++) {
		if (null != aClass279_Sub1Array4407[i])
		    aClass279_Sub1Array4407[i]
			.method16602(-1736709914);
	    }
	    for (int i = 0;
		 i < aClass279_Sub1Array4407.length; i++) {
		if (aClass279_Sub1Array4407[i] != null)
		    aClass279_Sub1Array4407[i]
			.method16603(-1954885931);
	    }
	    if (null == diskMasterIndex)
		method5473((byte) 21);
	    else if (aClass207_4398 != null
		     && !aBool4406) {
		if (aClass241_Sub39_Sub5_Sub2_4397 == null)
		    aClass241_Sub39_Sub5_Sub2_4397
			= aClass207_4398
			      .method4116(1482319719);
		else if (!((Class241_Sub39_Sub5_Sub2)
			   aClass241_Sub39_Sub5_Sub2_4397)
			  .aBool10839) {
		    byte[] is
			= aClass241_Sub39_Sub5_Sub2_4397
			      .method17108(-510488418);
		    try {
			aClass297_4404
			    = new MasterIndex(new RSByteBuffer(is),
					   aBigInteger4400,
					   aBigInteger4401);
			for (int i = 0;
			     i < (((Class280) this)
				  .aClass279_Sub1Array4407).length;
			     i++) {
			    if (null != (((Class280) this)
					 .aClass279_Sub1Array4407[i])
				&& ((Class280) this)
				       .aClass279_Sub1Array4407[i]
				       .method16597((byte) 0)) {
				Class274 class274
				    = (((MasterIndex)
					aClass297_4404)
				       .aClass274Array4514[i]);
				aClass279_Sub1Array4407
				    [i].method16635
				    ((((Class280) this)
					  .aClass279_Sub1Array4407[i]
					  .method16626
				      ((((Class274) class274).anInt4378
					* 286477303),
				       ((Class274) class274).aByteArray4377,
				       (((Class274) class274).anInt4376
					* 736175443),
				       (((Class274) class274).anInt4375
					* -1465205157),
				       -59074097)),
				     -1411787864);
			    }
			}
		    } catch (Exception exception) {
			for (int i = 0;
			     i < (((Class280) this)
				  .aClass279_Sub1Array4407).length;
			     i++) {
			    if ((aClass279_Sub1Array4407[i]
				 != null)
				&& ((Class280) this)
				       .aClass279_Sub1Array4407[i]
				       .method16597((byte) 0))
				aClass279_Sub1Array4407
				    [i].method16635(false, -1411787864);
			}
		    }
		    aClass241_Sub39_Sub5_Sub2_4397 = null;
		    aBool4406 = true;
		}
	    }
	}
    }
    
    public void method5482() {
	if (null != aClass279_Sub1Array4407) {
	    for (int i = 0;
		 i < aClass279_Sub1Array4407.length; i++) {
		if (null != aClass279_Sub1Array4407[i])
		    aClass279_Sub1Array4407[i]
			.method16602(-1736709914);
	    }
	    for (int i = 0;
		 i < aClass279_Sub1Array4407.length; i++) {
		if (aClass279_Sub1Array4407[i] != null)
		    aClass279_Sub1Array4407[i]
			.method16603(-1758027033);
	    }
	    if (null == diskMasterIndex)
		method5473((byte) 40);
	    else if (aClass207_4398 != null
		     && !aBool4406) {
		if (aClass241_Sub39_Sub5_Sub2_4397 == null)
		    aClass241_Sub39_Sub5_Sub2_4397
			= aClass207_4398
			      .method4116(1482319719);
		else if (!((Class241_Sub39_Sub5_Sub2)
			   aClass241_Sub39_Sub5_Sub2_4397)
			  .aBool10839) {
		    byte[] is
			= aClass241_Sub39_Sub5_Sub2_4397
			      .method17108(-510488418);
		    try {
			aClass297_4404
			    = new MasterIndex(new RSByteBuffer(is),
					   aBigInteger4400,
					   aBigInteger4401);
			for (int i = 0;
			     i < (((Class280) this)
				  .aClass279_Sub1Array4407).length;
			     i++) {
			    if (null != (((Class280) this)
					 .aClass279_Sub1Array4407[i])
				&& ((Class280) this)
				       .aClass279_Sub1Array4407[i]
				       .method16597((byte) 0)) {
				Class274 class274
				    = (((MasterIndex)
					aClass297_4404)
				       .aClass274Array4514[i]);
				aClass279_Sub1Array4407
				    [i].method16635
				    ((((Class280) this)
					  .aClass279_Sub1Array4407[i]
					  .method16626
				      ((((Class274) class274).anInt4378
					* 286477303),
				       ((Class274) class274).aByteArray4377,
				       (((Class274) class274).anInt4376
					* 736175443),
				       (((Class274) class274).anInt4375
					* -1465205157),
				       -1339060084)),
				     -1411787864);
			    }
			}
		    } catch (Exception exception) {
			for (int i = 0;
			     i < (((Class280) this)
				  .aClass279_Sub1Array4407).length;
			     i++) {
			    if ((aClass279_Sub1Array4407[i]
				 != null)
				&& ((Class280) this)
				       .aClass279_Sub1Array4407[i]
				       .method16597((byte) 0))
				aClass279_Sub1Array4407
				    [i].method16635(false, -1411787864);
			}
		    }
		    aClass241_Sub39_Sub5_Sub2_4397 = null;
		    aBool4406 = true;
		}
	    }
	}
    }
    
    public void method5483() {
	if (null != aClass279_Sub1Array4407) {
	    for (int i = 0;
		 i < aClass279_Sub1Array4407.length; i++) {
		if (null != aClass279_Sub1Array4407[i])
		    aClass279_Sub1Array4407[i]
			.method16602(-1736709914);
	    }
	    for (int i = 0;
		 i < aClass279_Sub1Array4407.length; i++) {
		if (aClass279_Sub1Array4407[i] != null)
		    aClass279_Sub1Array4407[i]
			.method16603(-963712352);
	    }
	    if (null == diskMasterIndex)
		method5473((byte) 22);
	    else if (aClass207_4398 != null
		     && !aBool4406) {
		if (aClass241_Sub39_Sub5_Sub2_4397 == null)
		    aClass241_Sub39_Sub5_Sub2_4397
			= aClass207_4398
			      .method4116(1482319719);
		else if (!((Class241_Sub39_Sub5_Sub2)
			   aClass241_Sub39_Sub5_Sub2_4397)
			  .aBool10839) {
		    byte[] is
			= aClass241_Sub39_Sub5_Sub2_4397
			      .method17108(-510488418);
		    try {
			aClass297_4404
			    = new MasterIndex(new RSByteBuffer(is),
					   aBigInteger4400,
					   aBigInteger4401);
			for (int i = 0;
			     i < (((Class280) this)
				  .aClass279_Sub1Array4407).length;
			     i++) {
			    if (null != (((Class280) this)
					 .aClass279_Sub1Array4407[i])
				&& ((Class280) this)
				       .aClass279_Sub1Array4407[i]
				       .method16597((byte) 0)) {
				Class274 class274
				    = (((MasterIndex)
					aClass297_4404)
				       .aClass274Array4514[i]);
				aClass279_Sub1Array4407
				    [i].method16635
				    ((((Class280) this)
					  .aClass279_Sub1Array4407[i]
					  .method16626
				      ((((Class274) class274).anInt4378
					* 286477303),
				       ((Class274) class274).aByteArray4377,
				       (((Class274) class274).anInt4376
					* 736175443),
				       (((Class274) class274).anInt4375
					* -1465205157),
				       1263756409)),
				     -1411787864);
			    }
			}
		    } catch (Exception exception) {
			for (int i = 0;
			     i < (((Class280) this)
				  .aClass279_Sub1Array4407).length;
			     i++) {
			    if ((aClass279_Sub1Array4407[i]
				 != null)
				&& ((Class280) this)
				       .aClass279_Sub1Array4407[i]
				       .method16597((byte) 0))
				aClass279_Sub1Array4407
				    [i].method16635(false, -1411787864);
			}
		    }
		    aClass241_Sub39_Sub5_Sub2_4397 = null;
		    aBool4406 = true;
		}
	    }
	}
    }
    
    static final void method5484(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 877329925 * class58.slot2;
    }
    
    static final void method5485(ClientScriptData class454, int i) {
	int i_20_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (2 == -2020075851 * client.friendListStage
	    && i_20_ < 1557840217 * client.friendListSize)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= client.friendList[i_20_].aBool193 ? 1 : 0;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    static final void method5486(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -36) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray983
	    = Class299.extractCs2Params(string, class454, -519073230);
	class58.hasClientScript = true;
    }
}
