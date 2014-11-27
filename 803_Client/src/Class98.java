/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class98
{
    public Class441 aClass441_1353 = new Class441();
    public static final int anInt1354 = 8191;
    
    static final void decodeLocationUpdates/*method2173*/(RSBitBuffer buffer, int i) {
		int skip = 0;
		buffer.initBitAccess(1628510173);
		//System.out.println((Class196.localPlayerCount*794073197)+" local players.");
		for (int index = 0; index < 794073197 * GPI.viewportPlayerCount; index++) {
		    int playerIdx = GPI.viewportPlayerIndicies[index];
		    if (0 == (GPI.skippingFlags[playerIdx] & 0x1)) {
				if (skip > 0) {
					skip--;
				    GPI.skippingFlags[playerIdx] |= 0x2;
				} else {
				    int updateNeeded = buffer.readBits(1, 29111024);
				    if (0 == updateNeeded) {
				    	skip = Class459.decodeSkip(buffer, -528553990);
				    	//System.out.println("[Local1] Skiping: "+(skip+1));
						GPI.skippingFlags[playerIdx] |= 0x2;
				    } else {
				    	//System.out.println("[Local1] Decoding player at: "+playerIdx);
				    	Class284.unpackLocationUpdate(buffer, playerIdx, -1268580396);
				    }
				}
		    }
		}
		buffer.finishBitAccess((byte) 77);
		if (0 != skip) {
		    throw new RuntimeException("Invalid skip count for NSN0: " + skip);
		}
		buffer.initBitAccess(1628510173);
		for (int index = 0; index < 794073197 * GPI.viewportPlayerCount; index++) {
		    int playerIdx = GPI.viewportPlayerIndicies[index];
		    if ((GPI.skippingFlags[playerIdx] & 0x1) != 0) {
				if (skip > 0) {
					skip--;
				    GPI.skippingFlags[playerIdx] |= 0x2;
				} else {
				    int updateNeeded = buffer.readBits(1, 934910503);
				    if (updateNeeded == 0) {
				    	skip = Class459.decodeSkip(buffer, -1954728929);
				    	//System.out.println("[Local2] Skiping: "+(skip+1));
				    	GPI.skippingFlags[playerIdx] |= 0x2;
				    } else {
				    	//System.out.println("[Local2] Decoding player at: "+playerIdx);
				    	Class284.unpackLocationUpdate(buffer, playerIdx, -1389487692);
				    }
				}
		    }
		}
		buffer.finishBitAccess((byte) 83);
		if (0 != skip) {
		    throw new RuntimeException("Invalid skip count for NSN1: " + skip);
		}
		buffer.initBitAccess(1628510173);
		for (int index = 0; index < -626258669 * GPI.outsidePlayerCount; index++) {
		    int playerIdx = GPI.outsidePlayerIndicies[index];
		    if (0 != (GPI.skippingFlags[playerIdx] & 0x1)) {
				if (skip > 0) {
					skip--;
				    GPI.skippingFlags[playerIdx] |= 0x2;
				} else {
				    int updateNeeded = buffer.readBits(1, 1898032655);
				    if (0 == updateNeeded) {
				    	skip = Class459.decodeSkip(buffer, -894443398);
				    	//System.out.println("[Global1] Skiping: "+(skip+1));
				    	GPI.skippingFlags[playerIdx] |= 0x2;
				    } else if (Class343.decodeRegionHash(buffer, playerIdx, (byte) 1)) {
				    	//System.out.println("[Global1] Decoding player at: "+playerIdx);
				    	GPI.skippingFlags[playerIdx] |= 0x2;
				    }
				}
		    }
		}
		//System.out.println((-626258669 * GPI.outsidePlayerCount)+" outside players.");
		buffer.finishBitAccess((byte) -86);
		if (0 != skip) {			
		    throw new RuntimeException("Invalid skip count for NSN2: " + skip);
		}
		buffer.initBitAccess(1628510173);
		//System.out.println((Class196.outsidePlayerCount*-626258669)+" outside players.");
		for (int index = 0; index < -626258669 * GPI.outsidePlayerCount; index++) {
		    int playerIdx = GPI.outsidePlayerIndicies[index];
		    if (0 == (GPI.skippingFlags[playerIdx] & 0x1)) {
				if (skip > 0) {
					skip--;
				    GPI.skippingFlags[playerIdx] |= 0x2;
				} else {
				    int updateNeeded = buffer.readBits(1, 1090734618);
				    if (0 == updateNeeded) {
				    	skip = Class459.decodeSkip(buffer, -562508661);
				    	//System.out.println("[Global2] Skiping: "+(skip)+" from index: "+playerIdx);
				    	GPI.skippingFlags[playerIdx] |= 0x2;
				    } else if (Class343.decodeRegionHash(buffer, playerIdx, (byte) 1)) {
				    	//System.out.println("[Global2] Decoding player at: "+playerIdx);
				    	GPI.skippingFlags[playerIdx] |= 0x2;
				    }
				}
		    }
		}
		buffer.finishBitAccess((byte) -28);
		if (skip != 0) {
		    throw new RuntimeException("Invalid skip count for NSN3: " + skip);
		}
		GPI.viewportPlayerCount = 0;
		GPI.outsidePlayerCount = 0;
		for (int playerIdx = 1; playerIdx < 2048; playerIdx++) {
		    GPI.skippingFlags[playerIdx] >>= 1;
		    Player player = client.localPlayers[playerIdx];
		    if (null != player) {
		    	GPI.viewportPlayerIndicies[(GPI.viewportPlayerCount += -1705037467) * 794073197 - 1]
		    			= playerIdx;
		    } else {
		    	GPI.outsidePlayerIndicies[(GPI.outsidePlayerCount += -1083587301) * -626258669 - 1]
		    			= playerIdx;
		    }
		}
    }
    
    public static void method2174
	(Player class475_sub1_sub1_sub3_sub1, int i,
	 int i_14_, int i_15_) {
	int[] is = new int[4];
	Arrays.fill(is, 0, is.length, i);
	Class638.method13557(class475_sub1_sub1_sub3_sub1, is, i_14_, false,
			     (byte) 93);
    }
}
