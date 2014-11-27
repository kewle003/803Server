/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService
{
    List aList8805 = new ArrayList();
    static volatile IcmpService_Sub1 anIcmpService_Sub1_8806;
    
    protected void notify(int i) {
	Iterator iterator = ((IcmpService_Sub1) this).aList8805.iterator();
	while (iterator.hasNext()) {
	    Interface49 interface49 = (Interface49) iterator.next();
	    interface49.method361(i == 0, 1432834785);
	}
    }
    
    protected void method13110(int i) {
	Iterator iterator = ((IcmpService_Sub1) this).aList8805.iterator();
	while (iterator.hasNext()) {
	    Interface49 interface49 = (Interface49) iterator.next();
	    interface49.method361(i == 0, 163749431);
	}
    }
    
    protected void notify(int i, int i_0_, int i_1_) {
	Iterator iterator = ((IcmpService_Sub1) this).aList8805.iterator();
	while (iterator.hasNext()) {
	    Interface49 interface49 = (Interface49) iterator.next();
	    interface49.method360(i, i_0_, i_1_, 1636984095);
	}
    }
    
    public static void method14847(Interface49 interface49) {
	if (null == anIcmpService_Sub1_8806)
	    throw new IllegalStateException("");
	((IcmpService_Sub1) anIcmpService_Sub1_8806).aList8805
	    .add(interface49);
    }
    
    public static void method14848(Interface49 interface49) {
	if (null == anIcmpService_Sub1_8806)
	    throw new IllegalStateException("");
	((IcmpService_Sub1) anIcmpService_Sub1_8806).aList8805
	    .add(interface49);
    }
    
    public static boolean method14849() {
	do {
	    boolean bool;
	    try {
		if (available())
		    break;
		bool = false;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	} while (false);
	if (anIcmpService_Sub1_8806 != null)
	    throw new IllegalStateException("");
	anIcmpService_Sub1_8806 = new IcmpService_Sub1();
	Thread thread = new Thread(new Class496());
	thread.setDaemon(true);
	thread.start();
	return true;
    }
    
    public static boolean method14850() {
	do {
	    boolean bool;
	    try {
		if (available())
		    break;
		bool = false;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	} while (false);
	if (anIcmpService_Sub1_8806 != null)
	    throw new IllegalStateException("");
	anIcmpService_Sub1_8806 = new IcmpService_Sub1();
	Thread thread = new Thread(new Class496());
	thread.setDaemon(true);
	thread.start();
	return true;
    }
    
    IcmpService_Sub1() {
	/* empty */
    }
    
    protected void method13111(int i, int i_2_, int i_3_) {
	Iterator iterator = ((IcmpService_Sub1) this).aList8805.iterator();
	while (iterator.hasNext()) {
	    Interface49 interface49 = (Interface49) iterator.next();
	    interface49.method360(i, i_2_, i_3_, 1980525598);
	}
    }
    
    protected void method13112(int i, int i_4_, int i_5_) {
	Iterator iterator = ((IcmpService_Sub1) this).aList8805.iterator();
	while (iterator.hasNext()) {
	    Interface49 interface49 = (Interface49) iterator.next();
	    interface49.method360(i, i_4_, i_5_, 1895480487);
	}
    }
    
    //rs2.client.loading.Load
    public static JS5 createArchive/*method14851*/(Js5Archive indexDef, boolean bool, int i,
				       boolean bool_6_, boolean bool_7_, int i_8_) {
		if (null == Class579.cacheFiles) {
		    Class579.cacheFiles = new Class279_Sub1[Js5Archive.getRequiredArrayLength((byte) -125)];
		}
		Class568 file = null;
		int indexID = indexDef.getArchiveId((byte) -103);
		if (client.cacheDat != null && !Class214.aBool2513) {
			file = new Class568(indexID, client.cacheDat, Class565.cacheIndex[indexID], 2000000);
		}
		Class579.cacheFiles[indexID] = Class281.aClass280_4428.method5471(
				indexID, file, Class404.aClass568_5886, indexDef.isStreamed(1482319719), (byte) 56);
		if (bool_7_) {
		    Class579.cacheFiles[indexID].method16607(-1289580413);
		}
		return new JS5(Class579.cacheFiles[indexID], bool, i);
    }
}
