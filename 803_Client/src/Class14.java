/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Frame;
import java.io.File;

import javax.swing.JFileChooser;

public class Class14 implements Runnable
{
    File aFile128 = null;
    boolean aBool129;
    boolean aBool130 = false;
    String aString131;
    
    boolean method674() {
	return ((Class14) this).aBool129;
    }
    
    public boolean method675(int i) {
	return ((Class14) this).aBool130;
    }
    
    public File method676(int i) {
	return ((Class14) this).aFile128;
    }
    
    public Class14(String string, boolean bool) {
	((Class14) this).aString131 = string;
	((Class14) this).aBool129 = bool;
	new Thread(this).start();
    }
    
    boolean method677(short i) {
	return ((Class14) this).aBool129;
    }
    
    public void method678() {
	Container container = Class109.getTopContainer((byte) -54);
	Frame frame = null;
	if (null != Class241_Sub40_Sub1.frame)
	    frame = Class241_Sub40_Sub1.frame;
	else {
	    for (/**/; null != container; container = container.getParent()) {
		if (container instanceof Frame) {
		    frame = (Frame) container;
		    break;
		}
	    }
	}
	if (frame == null)
	    throw new RuntimeException("");
	JFileChooser jfilechooser = new JFileChooser("");
	jfilechooser.setDialogTitle(((Class14) this).aString131);
	jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
	jfilechooser.setFileSelectionMode(1);
	jfilechooser.setAcceptAllFileFilterUsed(false);
	int i = jfilechooser.showOpenDialog(frame);
	if (0 == i)
	    ((Class14) this).aFile128 = jfilechooser.getSelectedFile();
	((Class14) this).aBool130 = true;
    }
    
    public void method679() {
	Container container = Class109.getTopContainer((byte) -18);
	Frame frame = null;
	if (null != Class241_Sub40_Sub1.frame)
	    frame = Class241_Sub40_Sub1.frame;
	else {
	    for (/**/; null != container; container = container.getParent()) {
		if (container instanceof Frame) {
		    frame = (Frame) container;
		    break;
		}
	    }
	}
	if (frame == null)
	    throw new RuntimeException("");
	JFileChooser jfilechooser = new JFileChooser("");
	jfilechooser.setDialogTitle(((Class14) this).aString131);
	jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
	jfilechooser.setFileSelectionMode(1);
	jfilechooser.setAcceptAllFileFilterUsed(false);
	int i = jfilechooser.showOpenDialog(frame);
	if (0 == i)
	    ((Class14) this).aFile128 = jfilechooser.getSelectedFile();
	((Class14) this).aBool130 = true;
    }
    
    public boolean method680() {
	return ((Class14) this).aBool130;
    }
    
    public File method681() {
	return ((Class14) this).aFile128;
    }
    
    public void run() {
	Container container = Class109.getTopContainer((byte) -27);
	Frame frame = null;
	if (null != Class241_Sub40_Sub1.frame)
	    frame = Class241_Sub40_Sub1.frame;
	else {
	    for (/**/; null != container; container = container.getParent()) {
		if (container instanceof Frame) {
		    frame = (Frame) container;
		    break;
		}
	    }
	}
	if (frame == null)
	    throw new RuntimeException("");
	JFileChooser jfilechooser = new JFileChooser("");
	jfilechooser.setDialogTitle(((Class14) this).aString131);
	jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
	jfilechooser.setFileSelectionMode(1);
	jfilechooser.setAcceptAllFileFilterUsed(false);
	int i = jfilechooser.showOpenDialog(frame);
	if (0 == i)
	    ((Class14) this).aFile128 = jfilechooser.getSelectedFile();
	((Class14) this).aBool130 = true;
    }
    
    public void method682() {
	Container container = Class109.getTopContainer((byte) -96);
	Frame frame = null;
	if (null != Class241_Sub40_Sub1.frame)
	    frame = Class241_Sub40_Sub1.frame;
	else {
	    for (/**/; null != container; container = container.getParent()) {
		if (container instanceof Frame) {
		    frame = (Frame) container;
		    break;
		}
	    }
	}
	if (frame == null)
	    throw new RuntimeException("");
	JFileChooser jfilechooser = new JFileChooser("");
	jfilechooser.setDialogTitle(((Class14) this).aString131);
	jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
	jfilechooser.setFileSelectionMode(1);
	jfilechooser.setAcceptAllFileFilterUsed(false);
	int i = jfilechooser.showOpenDialog(frame);
	if (0 == i)
	    ((Class14) this).aFile128 = jfilechooser.getSelectedFile();
	((Class14) this).aBool130 = true;
    }
    
    public File method683() {
	return ((Class14) this).aFile128;
    }
    
    public File method684() {
	return ((Class14) this).aFile128;
    }
    
    public boolean method685() {
	return ((Class14) this).aBool130;
    }
    
    public boolean method686() {
	return ((Class14) this).aBool130;
    }
    
    public void method687() {
	Container container = Class109.getTopContainer((byte) 81);
	Frame frame = null;
	if (null != Class241_Sub40_Sub1.frame)
	    frame = Class241_Sub40_Sub1.frame;
	else {
	    for (/**/; null != container; container = container.getParent()) {
		if (container instanceof Frame) {
		    frame = (Frame) container;
		    break;
		}
	    }
	}
	if (frame == null)
	    throw new RuntimeException("");
	JFileChooser jfilechooser = new JFileChooser("");
	jfilechooser.setDialogTitle(((Class14) this).aString131);
	jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
	jfilechooser.setFileSelectionMode(1);
	jfilechooser.setAcceptAllFileFilterUsed(false);
	int i = jfilechooser.showOpenDialog(frame);
	if (0 == i)
	    ((Class14) this).aFile128 = jfilechooser.getSelectedFile();
	((Class14) this).aBool130 = true;
    }
    
    public File method688() {
	return ((Class14) this).aFile128;
    }
    
    static final void setVarcompHidden/*method689*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class219.setComponentHidden(component, iFace, scriptData, (byte) 107);
    }
    
    static final void setVarcompSprite/*method690*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class317.setComponentSprite(component, iFace, scriptData, (byte) -95);
    }
    
    static final void method691(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class558.method12322(class58, class35, class454, 494903032);
    }
    
    static final void method692(ClientScriptData class454, short i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class414.method7481(string, 64214837);
    }
    
    static final void method693(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871
		  .method14337(-637049219) ? 1 : 0;
    }
    
    static void method694(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(10, (long) i);
	class241_sub39_sub13.method17279((byte) 0);
	((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941
	    = i_0_ * -1741260507;
	((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10951
	    = 1861259375 * i_1_;
	((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10935
	    = -1424982471 * i_2_;
    }
    
    public static boolean method695(int i) {
	return Class237.anInterface18_2714 != null;
    }
}
