/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas
{
    Component aComponent10808;
    
    public final void update(Graphics graphics) {
	((Canvas_Sub1) this).aComponent10808.update(graphics);
    }
    
    public final void paint(Graphics graphics) {
	((Canvas_Sub1) this).aComponent10808.paint(graphics);
    }
    
    Canvas_Sub1(Component component) {
	((Canvas_Sub1) this).aComponent10808 = component;
    }
    
    public final void method17067(Graphics graphics) {
	((Canvas_Sub1) this).aComponent10808.paint(graphics);
    }
}
