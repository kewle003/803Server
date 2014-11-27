/* Class580_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class580_Sub1 extends Class580
    implements MouseListener, MouseMotionListener, MouseWheelListener
{
    NodeCollection aClass429_8751;
    static final int anInt8752 = 2;
    int lastMouseButton;//anInt8753
    int anInt8754;
    int anInt8755;
    boolean aBool8756;
    NodeCollection aClass429_8757 = new NodeCollection();
    int anInt8758;
    int anInt8759;
    int mouseButtonPressed;//anInt8760
    static final int anInt8761 = 4;
    Component aComponent8762;
    static final int anInt8763 = 1;
    
    public synchronized void method12726() {
	anInt8754
	    = anInt8758 * 204774539;
	anInt8755
	    = 1872648989 * anInt8759;
	lastMouseButton
	    = mouseButtonPressed * -1308768047;
	NodeCollection class429 = aClass429_8757;
	aClass429_8757
	    = aClass429_8751;
	aClass429_8751 = class429;
	aClass429_8751.method7652((byte) 2);
    }
    
    void method14504(Component component, int i) {
		method14505(1113759087);
		aComponent8762 = component;
		aComponent8762.addMouseListener(this);
		aComponent8762.addMouseMotionListener(this);
		aComponent8762.addMouseWheelListener(this);
    }
    
    void method14505(int i) {
	if (null != aComponent8762) {
	    aComponent8762.removeMouseWheelListener(this);
	    aComponent8762.removeMouseMotionListener(this);
	    aComponent8762.removeMouseListener(this);
	    aComponent8762 = null;
	    lastMouseButton = 0;
	    anInt8755 = 0;
	    anInt8754 = 0;
	    mouseButtonPressed = 0;
	    anInt8759 = 0;
	    anInt8758 = 0;
	    aClass429_8757 = null;
	    aClass429_8751 = null;
	}
    }
    
    public boolean method12715(int i) {
	return 0 != (627094527 * lastMouseButton & 0x2);
    }
    
    void method14506(int i, int i_0_, int i_1_) {
	anInt8758 = i * 1286380799;
	anInt8759 = -1801116507 * i_0_;
	if (aBool8756)
	    method14507(-1, i, i_0_, 0, -548199511);
    }
    
    public Class241_Sub24 method12720(byte i) {
	return ((Class241_Sub24)
		aClass429_8757.getNext(-1274537175));
    }
    
    public synchronized void method12732(int i) {
	anInt8754
	    = anInt8758 * 204774539;
	anInt8755
	    = 1872648989 * anInt8759;
	lastMouseButton
	    = mouseButtonPressed * -1308768047;
	NodeCollection class429 = aClass429_8757;
	aClass429_8757
	    = aClass429_8751;
	aClass429_8751 = class429;
	aClass429_8751.method7652((byte) 105);
    }
    
    public boolean isMouseButtonPressed(byte i) {
    	return (lastMouseButton * 627094527 & 0x1) != 0;
    }
    
    public void method12721(int i) {
	method14505(-2005958236);
    }
    
    public boolean method12713(byte i) {
	return 0 != (lastMouseButton * 627094527 & 0x4);
    }
    
    public int method12718(int i) {
	return anInt8754 * 2006621661;
    }
    
    public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		int i = mousewheelevent.getX();
		int i_2_ = mousewheelevent.getY();
		int i_3_ = mousewheelevent.getWheelRotation();
		method14507(6, i, i_2_, i_3_, -890513920);
		mousewheelevent.consume();
    }
    
    void method14507(int i, int x, int y, int rotation, int i_7_) {
		Class241_Sub24_Sub2 class241_sub24_sub2 
			= Class24.method933(i, x, y, Class50.method1249((byte) 1), rotation, (byte) 111);
		aClass429_8751.addNode(class241_sub24_sub2, (short) -29866);
    }
    
    public synchronized void mouseClicked(MouseEvent mouseevent) {
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public boolean method12728() {
	return 0 != (627094527 * lastMouseButton & 0x2);
    }
    
    public synchronized void mouseExited(MouseEvent mouseevent) {
	method14506(mouseevent.getX(), mouseevent.getY(), 255370717);
    }
    
    int method14508(MouseEvent mouseevent, int i) {
		if (mouseevent.getButton() == 1) {
		    if (mouseevent.isMetaDown())
			return 4;
		    return 1;
		}
		if (mouseevent.getButton() == 2)
		    return 2;
		if (mouseevent.getButton() == 3)
		    return 4;
		return 0;
    }
    
    public synchronized void mousePressed(MouseEvent mouseevent) {
		int i = method14508(mouseevent, 1125073448);
		if (1 == i)
		    method14507(0, mouseevent.getX(), mouseevent.getY(),
				mouseevent.getClickCount(), -539057080);
		else if (i == 4)
		    method14507(2, mouseevent.getX(), mouseevent.getY(),
				mouseevent.getClickCount(), -909947024);
		else if (2 == i)
		    method14507(1, mouseevent.getX(), mouseevent.getY(),
				mouseevent.getClickCount(), -1428515391);
		mouseButtonPressed = (1117072175 * mouseButtonPressed | i) * 1776679887;
		if (mouseevent.isPopupTrigger())
		    mouseevent.consume();
    }
    
    public synchronized void mouseReleased(MouseEvent mouseevent) {
	int i = method14508(mouseevent, 994344237);
	if (0 == (1117072175 * mouseButtonPressed & i))
	    i = 1117072175 * mouseButtonPressed;
	if ((i & 0x1) != 0)
	    method14507(3, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), -1428524819);
	if (0 != (i & 0x4))
	    method14507(5, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), -2010187703);
	if ((i & 0x2) != 0)
	    method14507(4, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), -1579911372);
	mouseButtonPressed
	    = (mouseButtonPressed * 1117072175
	       & (i ^ 0xffffffff)) * 1776679887;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public synchronized void mouseDragged(MouseEvent mouseevent) {
	method14506(mouseevent.getX(), mouseevent.getY(), -1962638574);
    }
    
    public synchronized void mouseMoved(MouseEvent mouseevent) {
	method14506(mouseevent.getX(), mouseevent.getY(), 901291792);
    }
    
    public int method12737() {
	return anInt8754 * 2006621661;
    }
    
    public int method12741() {
	return -155165871 * anInt8755;
    }
    
    public boolean method12729() {
	return (lastMouseButton * 627094527 & 0x1) != 0;
    }
    
    public boolean method12742() {
	return 0 != (627094527 * lastMouseButton & 0x2);
    }
    
    void method14509(int i, int i_8_) {
	anInt8758 = i * 1286380799;
	anInt8759 = -1801116507 * i_8_;
	if (aBool8756)
	    method14507(-1, i, i_8_, 0, -611905059);
    }
    
    public boolean method12730() {
	return 0 != (lastMouseButton * 627094527 & 0x4);
    }
    
    public int method12736() {
	return anInt8754 * 2006621661;
    }
    
    public Class241_Sub24 method12716() {
	return ((Class241_Sub24)
		aClass429_8757.getNext(-1419246251));
    }
    
    public int method12738() {
	return anInt8754 * 2006621661;
    }
    
    public int method12739() {
	return -155165871 * anInt8755;
    }
    
    public int method12719() {
	return -155165871 * anInt8755;
    }
    
    public synchronized void mouseEntered(MouseEvent mouseevent) {
	method14506(mouseevent.getX(), mouseevent.getY(), 1930368240);
    }
    
    int method14510(MouseEvent mouseevent) {
	if (mouseevent.getButton() == 1) {
	    if (mouseevent.isMetaDown())
		return 4;
	    return 1;
	}
	if (mouseevent.getButton() == 2)
	    return 2;
	if (mouseevent.getButton() == 3)
	    return 4;
	return 0;
    }
    
    public Class241_Sub24 method12743() {
	return ((Class241_Sub24)
		aClass429_8757.getNext(-1130283235));
    }
    
    public int method12740(byte i) {
	return -155165871 * anInt8755;
    }
    
    void method14511(Component component) {
	method14505(-2064723425);
	aComponent8762 = component;
	aComponent8762.addMouseListener(this);
	aComponent8762.addMouseMotionListener(this);
	aComponent8762.addMouseWheelListener(this);
    }
    
    void method14512() {
	if (null != aComponent8762) {
	    aComponent8762
		.removeMouseWheelListener(this);
	    aComponent8762
		.removeMouseMotionListener(this);
	    aComponent8762.removeMouseListener(this);
	    aComponent8762 = null;
	    lastMouseButton = 0;
	    anInt8755 = 0;
	    anInt8754 = 0;
	    mouseButtonPressed = 0;
	    anInt8759 = 0;
	    anInt8758 = 0;
	    aClass429_8757 = null;
	    aClass429_8751 = null;
	}
    }
    
    void method14513() {
	if (null != aComponent8762) {
	    aComponent8762
		.removeMouseWheelListener(this);
	    aComponent8762
		.removeMouseMotionListener(this);
	    aComponent8762.removeMouseListener(this);
	    aComponent8762 = null;
	    lastMouseButton = 0;
	    anInt8755 = 0;
	    anInt8754 = 0;
	    mouseButtonPressed = 0;
	    anInt8759 = 0;
	    anInt8758 = 0;
	    aClass429_8757 = null;
	    aClass429_8751 = null;
	}
    }
    
    void method14514(int i, int i_9_, int i_10_, int i_11_) {
	Class241_Sub24_Sub2 class241_sub24_sub2
	    = Class24.method933(i, i_9_, i_10_, Class50.method1249((byte) 1),
				i_11_, (byte) 23);
	aClass429_8751.addNode(class241_sub24_sub2,
							 (short) -5384);
    }
    
    int method14515(MouseEvent mouseevent) {
	if (mouseevent.getButton() == 1) {
	    if (mouseevent.isMetaDown())
		return 4;
	    return 1;
	}
	if (mouseevent.getButton() == 2)
	    return 2;
	if (mouseevent.getButton() == 3)
	    return 4;
	return 0;
    }
    
    void method14516(int i, int i_12_) {
	anInt8758 = i * 1286380799;
	anInt8759 = -1801116507 * i_12_;
	if (aBool8756)
	    method14507(-1, i, i_12_, 0, -1800850453);
    }
    
    void method14517(int i, int i_13_) {
	anInt8758 = i * 1286380799;
	anInt8759 = -1801116507 * i_13_;
	if (aBool8756)
	    method14507(-1, i, i_13_, 0, -2077348952);
    }
    
    public void method12744() {
	method14505(-113408538);
    }
    
    Class580_Sub1(Component component, boolean bool) {
	aClass429_8751 = new NodeCollection();
	method14504(component, -1261497391);
	aBool8756 = bool;
    }
    
    int method14518(MouseEvent mouseevent) {
	if (mouseevent.getButton() == 1) {
	    if (mouseevent.isMetaDown())
		return 4;
	    return 1;
	}
	if (mouseevent.getButton() == 2)
	    return 2;
	if (mouseevent.getButton() == 3)
	    return 4;
	return 0;
    }
    
    int method14519(MouseEvent mouseevent) {
	if (mouseevent.getButton() == 1) {
	    if (mouseevent.isMetaDown())
		return 4;
	    return 1;
	}
	if (mouseevent.getButton() == 2)
	    return 2;
	if (mouseevent.getButton() == 3)
	    return 4;
	return 0;
    }
    
    public static Class61 method14520(int i, int i_14_) {
	if (i == 107084319 * Class61.aClass61_1021.anInt1026)
	    return Class61.aClass61_1021;
	if (107084319 * Class61.aClass61_1020.anInt1026 == i)
	    return Class61.aClass61_1020;
	if (i == Class61.aClass61_1023.anInt1026 * 107084319)
	    return Class61.aClass61_1023;
	if (Class61.aClass61_1022.anInt1026 * 107084319 == i)
	    return Class61.aClass61_1022;
	if (i == Class61.aClass61_1027.anInt1026 * 107084319)
	    return Class61.aClass61_1027;
	if (107084319 * Class61.aClass61_1024.anInt1026 == i)
	    return Class61.aClass61_1024;
	if (i == Class61.aClass61_1025.anInt1026 * 107084319)
	    return Class61.aClass61_1025;
	return null;
    }
    
    static final void method14521(ClientScriptData class454, byte i) {
	GameScene class522 = new GameScene();
	class522.method11712(((Class241_Sub16)
			      (((ClientScriptData) class454).objectStack
			       [(((ClientScriptData) class454).objectStackPointer
				 -= -1650705371) * -290357331])),
			     (byte) 80);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class522.method11702((byte) 84);
    }
    
    public static int method14522(int i) {
	Class628_Sub1 class628_sub1 = Class44.method1104(-995793113);
	Class584.method12831(class628_sub1, 148918413);
	return class628_sub1.method13472((byte) 116);
    }
    
    public static int[] method14523(int i, int i_15_, int i_16_, int i_17_,
				    int i_18_, float f, boolean bool,
				    byte i_19_) {
	int[] is = new int[i];
	Class241_Sub2_Sub1 class241_sub2_sub1 = new Class241_Sub2_Sub1();
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10796
	    = i_15_ * -510674085;
	((Class241_Sub2_Sub1) class241_sub2_sub1).aBool10803 = bool;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10799
	    = -1127959001 * i_16_;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10800
	    = i_17_ * -2006378971;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10801
	    = i_18_ * -1880909763;
	((Class241_Sub2_Sub1) class241_sub2_sub1).anInt10802
	    = -1481008203 * (int) (f * 4096.0F);
	class241_sub2_sub1.method17037(-1675665158);
	Class620.method13332(i, 1, -1338357369);
	class241_sub2_sub1.method17032(0, is, (byte) 0);
	return is;
    }
}
