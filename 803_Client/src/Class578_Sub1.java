/* Class578_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class578_Sub1 extends Class578
    implements KeyListener, FocusListener
{
    NodeCollection aClass429_8712 = new NodeCollection();
    static final int anInt8713 = 128;
    static int[] anIntArray8714
	= { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0,
	    0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96,
	    98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22,
	    23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39,
	    54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64,
	    0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0,
	    88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101,
	    128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140,
	    141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0,
	    0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    NodeCollection aClass429_8715 = new NodeCollection();
    boolean[] pressedKeys = new boolean[112];//aBoolArray8716
    Component aComponent8717;
    static final int anInt8718 = 112;
    
    public void method12688() {
	method14414(1482319719);
    }
    
    void method14389(Component component, int i) {
		method14414(1482319719);
		aComponent8717 = component;
		aComponent8717.addKeyListener(this);
		aComponent8717.addFocusListener(this);
    }
    
    public boolean isKeyPressed/*method12696*/(int keyCode, int i_0_) {
		if (keyCode < 0 || keyCode >= 112)
		    return false;
		return pressedKeys[keyCode];
    }
    
    void method14390(int mode, char c, int keyCode, int i_2_) {//Used
		Class241_Sub37 class241_sub37 = new Class241_Sub37();
		((Class241_Sub37) class241_sub37).anInt10110 = 1830162061 * mode;
		((Class241_Sub37) class241_sub37).keyChar = c;
		((Class241_Sub37) class241_sub37).keyCode = keyCode * -174751057;
		((Class241_Sub37) class241_sub37).aLong10109
		    = Class50.method1249((byte) 1) * 7698867943450443219L;
		aClass429_8715.addNode(class241_sub37,
								 (short) -5409);
    }
    
    public void dummyMethod14391(FocusEvent focusevent) {
	/* empty */
    }
    
    public Interface58 method12690(short i) {
    	return ((Interface58) aClass429_8712.getNext(-1258077258));
    }
    
    public synchronized void processKeys(int i) {//Used
		aClass429_8712.method7652((byte) 30);
		for (Class241_Sub37 key = (Class241_Sub37) aClass429_8715.getNext(-1399701330);
				null != key;
				key = (Class241_Sub37) aClass429_8715.getNext(-1943534580)) {
			key.anInt10114 = method14392(132326091) * -1289154057;
		    if (key.anInt10110 * -593796027 == Interface58.MODE_PRESSED) {//0
				if (!pressedKeys[(key.keyCode * 931730511)]) {
				    Class241_Sub37 class241_sub37_3_ = new Class241_Sub37();
				    ((Class241_Sub37) class241_sub37_3_).anInt10110 = 0;
				    ((Class241_Sub37) class241_sub37_3_).keyChar = '\uffff';
				    ((Class241_Sub37) class241_sub37_3_).keyCode = 1 * key.keyCode;
				    ((Class241_Sub37) class241_sub37_3_).aLong10109 = 1L * key.aLong10109;
				    ((Class241_Sub37) class241_sub37_3_).anInt10114 = key.anInt10114 * 1;
				    aClass429_8712.addNode(class241_sub37_3_, (short) -9648);
				    pressedKeys[(931730511 * key.keyCode)] = true;
				}
				key.anInt10110 = -634643174;
				aClass429_8712.addNode(key, (short) -4271);
		    } else if ((-593796027 * key.anInt10110) == Interface58.MODE_RELEASED) {//1
				if (pressedKeys[(key.keyCode * 931730511)]) {
				    aClass429_8712.addNode(key, (short) -31614);
				    pressedKeys[(key.keyCode * 931730511)] = false;
				}
		    } else if (-1 == (key.anInt10110 * -593796027)) {
				for (int i_4_ = 0; i_4_ < 112; i_4_++) {
				    if (pressedKeys[i_4_]) {
					Class241_Sub37 class241_sub37_5_
					    = new Class241_Sub37();
					((Class241_Sub37) class241_sub37_5_).anInt10110
					    = 1830162061;
					((Class241_Sub37) class241_sub37_5_).keyChar
					    = '\uffff';
					((Class241_Sub37) class241_sub37_5_).keyCode
					    = -174751057 * i_4_;
					((Class241_Sub37) class241_sub37_5_).aLong10109
					    = (key.aLong10109
					       * 1L);
					((Class241_Sub37) class241_sub37_5_).anInt10114
					    = 1 * key.anInt10114;
					aClass429_8712
					    .addNode(class241_sub37_5_, (short) -12654);
					pressedKeys[i_4_] = false;
				    }
				}
		    } else if ((-593796027 * key.anInt10110) == Interface58.MODE_TYPED) {//3
		    	aClass429_8712.addNode(key, (short) -4526);
		    }
		}
    }
    
    int method14392(int i) {//Used
		int i_6_ = 0;
		if (pressedKeys[81])
		    i_6_ |= 0x1;
		if (pressedKeys[82])
		    i_6_ |= 0x4;
		if (pressedKeys[86])
		    i_6_ |= 0x2;
		return i_6_;
    }
    
    public void method12691(byte i) {//Used
    	method14414(1482319719);
    }
    
    void method14393(KeyEvent keyevent, int mode, byte i_7_) {//Used
		int i_8_ = keyevent.getKeyCode();
		if (0 != i_8_) {
		    if (i_8_ >= 0 && i_8_ < anIntArray8714.length) {
			i_8_ = anIntArray8714[i_8_];
			if (mode == 0 && 0 != (i_8_ & 0x80))
			    i_8_ = 0;
			else
			    i_8_ &= ~0x80;
		    } else
			i_8_ = 0;
		} else
		    i_8_ = 0;
		if (0 != i_8_) {
		    method14390(mode, '\uffff', i_8_, -493480274);
		    keyevent.consume();
		}
    }
    
    public synchronized void keyPressed(KeyEvent keyevent) {
    	method14393(keyevent, Interface58.MODE_PRESSED, (byte) 10);//0
    }
    
    public synchronized void keyReleased(KeyEvent keyevent) {
    	method14393(keyevent, Interface58.MODE_RELEASED, (byte) 10);//1
    }
    
    public synchronized void keyTyped(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && GraphicsDefinitionLoader.method10593(c, 2064237472)) {
		    method14390(Interface58.MODE_TYPED, c, -1, -1359852054);//3
		    keyevent.consume();
		}
    }
    
    Class578_Sub1(Component component) {
		Class261.method5093((byte) 64);
		method14389(component, 1726543812);
    }
    
    public synchronized void focusLost(FocusEvent focusevent) {
    	method14390(-1, '\0', 0, -1802748566);
    }
    
    public void dummyMethod14394(FocusEvent focusevent) {
	/* empty */
    }
    
    public void dummyMethod14395(FocusEvent focusevent) {
	/* empty */
    }
    
    public void method12697() {
	method14414(1482319719);
    }
    
    public void dummyMethod14396(FocusEvent focusevent) {
	/* empty */
    }
    
    int dummyMethod14397() {
	int i = 0;
	if (pressedKeys[81])
	    i |= 0x1;
	if (pressedKeys[82])
	    i |= 0x4;
	if (pressedKeys[86])
	    i |= 0x2;
	return i;
    }
    
    public synchronized void dummyMethod14398(FocusEvent focusevent) {
	method14390(-1, '\0', 0, -71687328);
    }
    
    static void method14399() {
	anIntArray8714[44] = 71;
	anIntArray8714[45] = 26;
	anIntArray8714[46] = 72;
	anIntArray8714[47] = 73;
	anIntArray8714[59] = 57;
	anIntArray8714[61] = 27;
	anIntArray8714[91] = 42;
	anIntArray8714[92] = 74;
	anIntArray8714[93] = 43;
	anIntArray8714[192] = 28;
	anIntArray8714[222] = 58;
	anIntArray8714[520] = 59;
    }
    
    static void method14400() {
	anIntArray8714[44] = 71;
	anIntArray8714[45] = 26;
	anIntArray8714[46] = 72;
	anIntArray8714[47] = 73;
	anIntArray8714[59] = 57;
	anIntArray8714[61] = 27;
	anIntArray8714[91] = 42;
	anIntArray8714[92] = 74;
	anIntArray8714[93] = 43;
	anIntArray8714[192] = 28;
	anIntArray8714[222] = 58;
	anIntArray8714[520] = 59;
    }
    
    void method14401(Component component) {
	method14414(1482319719);
	aComponent8717 = component;
	aComponent8717.addKeyListener(this);
	aComponent8717.addFocusListener(this);
    }
    
    void method14402(Component component) {
	method14414(1482319719);
	aComponent8717 = component;
	aComponent8717.addKeyListener(this);
	aComponent8717.addFocusListener(this);
    }
    
    public Interface58 method12692() {
	return ((Interface58)
		aClass429_8712.getNext(-1261200357));
    }
    
    void method14403() {
	if (null != aComponent8717) {
	    aComponent8717.removeKeyListener(this);
	    aComponent8717.removeFocusListener(this);
	    aComponent8717 = null;
	    for (int i = 0; i < 112; i++)
		pressedKeys[i] = false;
	    aClass429_8712.method7652((byte) 58);
	    aClass429_8715.method7652((byte) 102);
	}
    }
    
    void method14404(Component component) {
	method14414(1482319719);
	aComponent8717 = component;
	aComponent8717.addKeyListener(this);
	aComponent8717.addFocusListener(this);
    }
    
    void method14405(KeyEvent keyevent, int i) {
		int keyCode = keyevent.getKeyCode();
		if (keyCode != KeyEvent.VK_UNDEFINED) {
		    if (keyCode >= 0 && keyCode < anIntArray8714.length) {
		    	keyCode = anIntArray8714[keyCode];
				if (i == 0 && 0 != (keyCode & 0x80)) {
					keyCode = 0;
				} else {
					keyCode &= ~0x80;
				}
		    } else {
		    	keyCode = 0;
		    }
		} else {
			keyCode = 0;
		}
		if (0 != keyCode) {
		    method14390(i, '\uffff', keyCode, -331073449);
		    keyevent.consume();
		}
    }
    
    void method14406() {
	if (null != aComponent8717) {
	    aComponent8717.removeKeyListener(this);
	    aComponent8717.removeFocusListener(this);
	    aComponent8717 = null;
	    for (int i = 0; i < 112; i++)
		pressedKeys[i] = false;
	    aClass429_8712.method7652((byte) 107);
	    aClass429_8715.method7652((byte) 105);
	}
    }
    
    public synchronized void method12695() {
	aClass429_8712.method7652((byte) 24);
	for (Class241_Sub37 class241_sub37
		 = (Class241_Sub37) aClass429_8715
					.getNext(-2010770462);
	     null != class241_sub37;
	     class241_sub37
		 = (Class241_Sub37) aClass429_8715
					.getNext(-1729550104)) {
	    ((Class241_Sub37) class241_sub37).anInt10114
		= method14392(1966615736) * -1289154057;
	    if (((Class241_Sub37) class241_sub37).anInt10110 * -593796027
		== 0) {
		if (!pressedKeys
		     [(((Class241_Sub37) class241_sub37).keyCode
		       * 931730511)]) {
		    Class241_Sub37 class241_sub37_10_ = new Class241_Sub37();
		    ((Class241_Sub37) class241_sub37_10_).anInt10110 = 0;
		    ((Class241_Sub37) class241_sub37_10_).keyChar
			= '\uffff';
		    ((Class241_Sub37) class241_sub37_10_).keyCode
			= 1 * ((Class241_Sub37) class241_sub37).keyCode;
		    ((Class241_Sub37) class241_sub37_10_).aLong10109
			= 1L * ((Class241_Sub37) class241_sub37).aLong10109;
		    ((Class241_Sub37) class241_sub37_10_).anInt10114
			= ((Class241_Sub37) class241_sub37).anInt10114 * 1;
		    aClass429_8712
			.addNode(class241_sub37_10_, (short) -11523);
		    pressedKeys
			[(931730511
			  * ((Class241_Sub37) class241_sub37).keyCode)]
			= true;
		}
		((Class241_Sub37) class241_sub37).anInt10110 = -634643174;
		aClass429_8712
		    .addNode(class241_sub37, (short) -4179);
	    } else if ((-593796027
			* ((Class241_Sub37) class241_sub37).anInt10110)
		       == 1) {
		if (pressedKeys
		    [(((Class241_Sub37) class241_sub37).keyCode
		      * 931730511)]) {
		    aClass429_8712
			.addNode(class241_sub37, (short) -2057);
		    pressedKeys
			[(((Class241_Sub37) class241_sub37).keyCode
			  * 931730511)]
			= false;
		}
	    } else if (-1 == (((Class241_Sub37) class241_sub37).anInt10110
			      * -593796027)) {
		for (int i = 0; i < 112; i++) {
		    if (pressedKeys[i]) {
			Class241_Sub37 class241_sub37_11_
			    = new Class241_Sub37();
			((Class241_Sub37) class241_sub37_11_).anInt10110
			    = 1830162061;
			((Class241_Sub37) class241_sub37_11_).keyChar
			    = '\uffff';
			((Class241_Sub37) class241_sub37_11_).keyCode
			    = -174751057 * i;
			((Class241_Sub37) class241_sub37_11_).aLong10109
			    = (((Class241_Sub37) class241_sub37).aLong10109
			       * 1L);
			((Class241_Sub37) class241_sub37_11_).anInt10114
			    = 1 * ((Class241_Sub37) class241_sub37).anInt10114;
			aClass429_8712
			    .addNode(class241_sub37_11_, (short) -27181);
			pressedKeys[i] = false;
		    }
		}
	    } else if ((-593796027
			* ((Class241_Sub37) class241_sub37).anInt10110)
		       == 3)
		aClass429_8712
		    .addNode(class241_sub37, (short) -13116);
	}
    }
    
    public boolean method12693(int i) {
	if (i < 0 || i >= 112)
	    return false;
	return pressedKeys[i];
    }
    
    int method14407() {
	int i = 0;
	if (pressedKeys[81])
	    i |= 0x1;
	if (pressedKeys[82])
	    i |= 0x4;
	if (pressedKeys[86])
	    i |= 0x2;
	return i;
    }
    
    public boolean method12694(int i) {
	if (i < 0 || i >= 112)
	    return false;
	return pressedKeys[i];
    }
    
    void method14408(KeyEvent keyevent, int i) {
	int i_12_ = keyevent.getKeyCode();
	if (0 != i_12_) {
	    if (i_12_ >= 0 && i_12_ < anIntArray8714.length) {
		i_12_ = anIntArray8714[i_12_];
		if (i == 0 && 0 != (i_12_ & 0x80))
		    i_12_ = 0;
		else
		    i_12_ &= ~0x80;
	    } else
		i_12_ = 0;
	} else
	    i_12_ = 0;
	if (0 != i_12_) {
	    method14390(i, '\uffff', i_12_, 1087886899);
	    keyevent.consume();
	}
    }
    
    public synchronized void method14409(KeyEvent keyevent) {
    	method14393(keyevent, 0, (byte) 10);
    }
    
    public synchronized void method14410(KeyEvent keyevent) {
    	method14393(keyevent, 0, (byte) 10);
    }
    
    public synchronized void method14411(KeyEvent keyevent) {
    	method14393(keyevent, 0, (byte) 10);
    }
    
    public synchronized void method14412(KeyEvent keyevent) {
    	method14393(keyevent, 1, (byte) 10);
    }
    
    public void focusGained(FocusEvent focusevent) {
	/* empty */
    }
    
    public synchronized void dummyMethod14413(KeyEvent keyevent) {
	method14393(keyevent, 1, (byte) 10);
    }
    
    void method14414(int i) {//Used
		if (null != aComponent8717) {
		    aComponent8717.removeKeyListener(this);
		    aComponent8717.removeFocusListener(this);
		    aComponent8717 = null;
		    for (int i_13_ = 0; i_13_ < 112; i_13_++) {
		    	pressedKeys[i_13_] = false;
		    }
		    aClass429_8712.method7652((byte) 66);
		    aClass429_8715.method7652((byte) 123);
		}
    }
}
