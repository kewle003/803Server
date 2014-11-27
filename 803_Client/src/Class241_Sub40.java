/* Class241_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public abstract class Class241_Sub40 extends Node
{
    OggStreamState anOggStreamState10150;
    int anInt10151;
    
    abstract void method16442(OggPacket oggpacket);
    
    void method16443(OggPacket oggpacket, int i) {
	method16447(oggpacket, -900424181);
	((Class241_Sub40) this).anInt10151 += -692053323;
    }
    
    abstract void method16444();
    
    abstract void method16445(int i);
    
    abstract void method16446(OggPacket oggpacket);
    
    Class241_Sub40(OggStreamState oggstreamstate) {
	((Class241_Sub40) this).anOggStreamState10150 = oggstreamstate;
    }
    
    abstract void method16447(OggPacket oggpacket, int i);
    
    static final void method16448(ClientScriptData class454, byte i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = Class72.aClass625_1100.list(i_0_, -419464900)
		  .method17178((byte) 7);
    }
}
