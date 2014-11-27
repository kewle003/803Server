/* Class413_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class413_Sub1 extends Class413 implements Interface56
{
    public void method28() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4117,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data
	    .writeIntV1(1829596357 * anInt5980, (byte) 0);
	class241_sub27.data
	    .writeByteA(725975309 * anInt5983, 1967898920);
	int i = (aBool5981 ? 2 : 0) | (aBool5986 ? 1 : 0);
	class241_sub27.data.writeByteC(i, 868520951);
	class241_sub27.data
	    .writeByteA(-1711650129 * anInt5984, 2128586551);
	class241_sub27.data
	    .writeLEShortA(1934616611 * anInt5982, (byte) -74);
	class241_sub27.data
	    .writeByteA(anInt5985 * -622276471, 2128535881);
	class241_sub27.data
	    .writeIntV2(anInt5987 * -1458171785, -879977779);
	class241_sub27.data
	    .writeByteC(-220263227 * anInt5988, 868520951);
	client.aClass190_8340.sendPacket(class241_sub27, -1839238906);
    }
    
    public void method191(int i) {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4117,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data
	    .writeIntV1(1829596357 * anInt5980, (byte) 0);
	class241_sub27.data
	    .writeByteA(725975309 * anInt5983, 2078509791);
	int i_0_ = (aBool5981 ? 2 : 0) | (aBool5986 ? 1 : 0);
	class241_sub27.data.writeByteC(i_0_, 868520951);
	class241_sub27.data
	    .writeByteA(-1711650129 * anInt5984, 2035987038);
	class241_sub27.data
	    .writeLEShortA(1934616611 * anInt5982, (byte) -2);
	class241_sub27.data
	    .writeByteA(anInt5985 * -622276471, 1950345256);
	class241_sub27.data
	    .writeIntV2(anInt5987 * -1458171785, -837064272);
	class241_sub27.data
	    .writeByteC(-220263227 * anInt5988, 868520951);
	client.aClass190_8340.sendPacket(class241_sub27, -1626922693);
    }
    
    public void method190() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4117,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data
	    .writeIntV1(1829596357 * anInt5980, (byte) 0);
	class241_sub27.data
	    .writeByteA(725975309 * anInt5983, 1977890435);
	int i = (aBool5981 ? 2 : 0) | (aBool5986 ? 1 : 0);
	class241_sub27.data.writeByteC(i, 868520951);
	class241_sub27.data
	    .writeByteA(-1711650129 * anInt5984, 2143018354);
	class241_sub27.data
	    .writeLEShortA(1934616611 * anInt5982, (byte) -104);
	class241_sub27.data
	    .writeByteA(anInt5985 * -622276471, 2120214944);
	class241_sub27.data
	    .writeIntV2(anInt5987 * -1458171785, 108247788);
	class241_sub27.data
	    .writeByteC(-220263227 * anInt5988, 868520951);
	client.aClass190_8340.sendPacket(class241_sub27, -2021666047);
    }
    
    Class413_Sub1(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
		  boolean bool, boolean bool_6_, int i_7_) {
	super(i, i_1_, i_2_ > 65535 ? 65535 : i_2_, i_3_,
	      i_4_ > 255 ? 255 : i_4_, i_5_, bool, bool_6_,
	      i_7_ > 255 ? 255 : i_7_);
    }
    
    public void method429() {
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4117,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data
	    .writeIntV1(1829596357 * anInt5980, (byte) 0);
	class241_sub27.data
	    .writeByteA(725975309 * anInt5983, 1970496994);
	int i = (aBool5981 ? 2 : 0) | (aBool5986 ? 1 : 0);
	class241_sub27.data.writeByteC(i, 868520951);
	class241_sub27.data
	    .writeByteA(-1711650129 * anInt5984, 1969792039);
	class241_sub27.data
	    .writeLEShortA(1934616611 * anInt5982, (byte) -40);
	class241_sub27.data
	    .writeByteA(anInt5985 * -622276471, 2053462818);
	class241_sub27.data
	    .writeIntV2(anInt5987 * -1458171785, -1484626571);
	class241_sub27.data
	    .writeByteC(-220263227 * anInt5988, 868520951);
	client.aClass190_8340.sendPacket(class241_sub27, -1960387879);
    }
}
