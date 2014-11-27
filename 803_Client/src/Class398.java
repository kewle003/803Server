/* Class398 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public abstract class Class398
{
    static JS5 aClass210_5791;
    String aString5792;
    int anInt5793;
    
    public abstract Socket method7120() throws IOException;
    
    Class398() {
	/* empty */
    }
    
    Socket method7121() throws IOException {
	return new Socket(((Class398) this).aString5792,
			  ((Class398) this).anInt5793 * -1626481923);
    }
    
    Socket method7122(int i) throws IOException {
	return new Socket(((Class398) this).aString5792,
			  ((Class398) this).anInt5793 * -1626481923);
    }
    
    public abstract Socket method7123() throws IOException;
    
    public abstract Socket method7124() throws IOException;
    
    public abstract Socket method7125() throws IOException;
    
    public static Class398 method7126(String string, int i) {
	Class398_Sub1 class398_sub1 = new Class398_Sub1();
	((Class398) class398_sub1).aString5792 = string;
	((Class398) class398_sub1).anInt5793 = i * -1943367083;
	return class398_sub1;
    }
    
    public abstract Socket method7127(int i) throws IOException;
    
    static final void method7128(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	client.anInt8383
	    = -68005775 * (((ClientScriptData) class454).integerStack
			   [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	client.anInt8387
	    = (((ClientScriptData) class454).integerStack
	       [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]) * 749685293;
    }
    
    static final void storeClanMemberVarBit/*method7129*/(ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= 915295493;
		int memberIndex = scriptData.integerStack[scriptData.intStackPointer * 1482319719];
		int start = scriptData.integerStack[1482319719 * scriptData.intStackPointer + 1];
		int end = scriptData.integerStack[1482319719 * scriptData.intStackPointer + 2];
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = scriptData.clanSettings.getVarMemberBit(memberIndex, start, end, 1363837567);
    }
}
