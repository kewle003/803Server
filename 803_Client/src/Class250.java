/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class250
{
    Robot aRobot3999;
    
    public void setcustomcursor(Component component, int[] cursorData, int height, int width, Point point) {
		if (null != cursorData) {
		    BufferedImage bufferedimage = new BufferedImage(height, width, 2);
		    bufferedimage.setRGB(0, 0, height, width, cursorData, 0, height);
		    component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
		} else {
		    component.setCursor(null);
		}
    }
    
    public void movemouse(int x, int y) {
    	aRobot3999.mouseMove(x, y);
    }
    
    public Class250() throws Exception {
    	aRobot3999 = new Robot();
    }
}
