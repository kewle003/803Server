/* Class241_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub32 extends Node
{
    public int anInt10057;
    public int anInt10058;
    public int anInt10059;
    public int anInt10060;
    public int anInt10061;
    public int anInt10062;
    public int anInt10063;
    public int anInt10064;
    public int anInt10065;
    
    Class241_Sub32(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readInt((byte) 10);
	anInt10060 = -223557975 * (i >>> 28);
	anInt10057 = -1245524833 * (i >>> 14 & 0x3fff);
	anInt10059 = -202770299 * (i & 0x3fff);
	anInt10063 = class241_sub3.readUnsignedByte((byte) -11) * 731350337;
	anInt10064 = class241_sub3.readUnsignedByte((byte) -3) * -64185577;
	anInt10062 = class241_sub3.readUnsignedByte((byte) -31) * -2096975325;
	anInt10061 = class241_sub3.readUnsignedByte((byte) 10) * 210123017;
	anInt10058 = class241_sub3.readUnsignedByte((byte) 30) * -858933247;
	anInt10065 = class241_sub3.readUnsignedByte((byte) -21) * 1590796521;
    }
}
