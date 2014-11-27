/* Class563_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

//package com.jagex.game.runetek6.comms.statestream.packetchannel;
public class Class563_Sub1 extends Class563 {
    Class571 aClass571_8955;
    Socket aSocket8956;
    Class567 aClass567_8957;
    
    public boolean method12390(int i) throws IOException {
	return aClass571_8955.method12527(i, 838568710);
    }
    
    public boolean isAvailable(int i, int i_0_) throws IOException {
    	return aClass571_8955.method12527(i, 636353856);
    }
    
    public int read(byte[] is, int i, int i_1_, int i_2_) throws IOException {
    	return aClass571_8955.method12522(is, i, i_1_, 2045541067);
    }
    
    public void method12398() {
	aClass571_8955.method12520(-791886851);
	aClass567_8957.method12448((byte) 3);
    }
    
    public void write(byte[] is, int i, int i_3_, int i_4_) throws IOException {
    	aClass567_8957.method12447(is, i, i_3_, (byte) 13);
    }
    
    public int method12394(byte[] is, int i, int i_5_) throws IOException {
	return aClass571_8955.method12522(is, i, i_5_,
								 -998370215);
    }
    
    public void resetByteCounts(int i) {
		aClass571_8955.method12520(-791886851);
		aClass567_8957.method12448((byte) 3);
    }
    
    public void finalize() {
    	close(2022198206);
    }
    
    public void close/*method12388*/(int i) {
		aClass567_8957.method12445((byte) 97);
		try {
		    aSocket8956.close();
		} catch (IOException ioexception) {
		    /* empty */
		}
		aClass571_8955.method12523(-2067823583);
    }
    
    void method14963() {
	close(1916786638);
    }
    
    void method14964() {
	close(1803430582);
    }
    
    void method14965() {
	close(1644761127);
    }
    
    void method14966() {
	close(2049665932);
    }
    
    public int method12391() throws IOException {
	return aClass571_8955.method12540((byte) -16);
    }
    
    public int method12392() throws IOException {
	return aClass571_8955.method12540((byte) -83);
    }
    
    Class563_Sub1(Socket socket, int i) throws IOException {
	aSocket8956 = socket;
	aSocket8956.setSoTimeout(30000);
	aSocket8956.setTcpNoDelay(true);
	aClass571_8955
	    = new Class571(aSocket8956.getInputStream(),
			   i);
	aClass567_8957
	    = new Class567(aSocket8956
			       .getOutputStream(),
			   i);
    }
    
    public int method12389(int i) throws IOException {
    	return aClass571_8955.method12540((byte) 24);
    }
    
    public int method12402(byte[] is, int i, int i_6_) throws IOException {
	return aClass571_8955.method12522(is, i, i_6_,
								 -488010140);
    }
    
    public int method12396(byte[] is, int i, int i_7_) throws IOException {
	return aClass571_8955.method12522(is, i, i_7_,
								 -144133508);
    }
    
    public void method12397() {
	aClass567_8957.method12445((byte) 38);
	try {
	    aSocket8956.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	aClass571_8955.method12523(-1720231909);
    }
    
    public int method12393(byte[] is, int i, int i_8_) throws IOException {
	return aClass571_8955.method12522(is, i, i_8_,
								 -9591452);
    }
    
    public void method12399() {
	aClass571_8955.method12520(-791886851);
	aClass567_8957.method12448((byte) 3);
    }
}
