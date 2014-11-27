/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class356 implements Interface37
{
    List aList5453 = new ArrayList();
    boolean aBool5454;
    AffineTransform anAffineTransform5455 = new AffineTransform();
    boolean aBool5456;
    String aString5457;
    boolean aBool5458;
    String aString5459;
    boolean aBool5460;
    
    public void method208(boolean bool) {
	if (!((Class356) this).aBool5460 && !((Class356) this).aBool5454) {
	    ((Class356) this).aBool5454 = true;
	    try {
		String[] strings
		    = Class225.method4625(client.aString8516, '|', 2143317426);
		if (strings.length < 3)
		    ((Class356) this).aBool5460 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class344.canvas);
		    int i = 0;
		    for (int i_0_ = 0; i_0_ < strings.length; i_0_++) {
			String[] strings_1_
			    = Class225.method4625(strings[i_0_].trim(), '=',
						  356293517);
			if (strings_1_[0].equals("halign"))
			    ((Class356) this).aBool5456
				= Boolean.parseBoolean(strings_1_[1]);
			else if (strings_1_[0].equals("valign"))
			    ((Class356) this).aBool5458
				= Boolean.parseBoolean(strings_1_[1]);
			else if (strings_1_[0].equals("image")) {
			    String[] strings_2_
				= Class225.method4625(strings_1_[1], ',',
						      926053529);
			    Image image;
			    try {
				image = method6441(strings_2_[0], 980001011);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				((Class356) this).aList5453.add
				    (new Class354_Sub1
				     (this, image,
				      Class324.method5975(strings_2_[1],
							  -952789660),
				      Class324.method5975(strings_2_[2],
							  -952789660)));
			    }
			} else if (strings_1_[0].equals("rotatingimage")) {
			    String[] strings_3_
				= Class225.method4625(strings_1_[1], ',',
						      779140982);
			    Image image;
			    try {
				image = method6441(strings_3_[0], -175668312);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				((Class356) this).aList5453.add
				    (new Class354_Sub1_Sub1
				     (this, image,
				      Class324.method5975(strings_3_[1],
							  -952789660),
				      Class324.method5975(strings_3_[2],
							  -952789660),
				      Float.parseFloat(strings_3_[3])));
			    }
			} else if (strings_1_[0].equals("progress")) {
			    String[] strings_4_
				= Class225.method4625(strings_1_[1], ',',
						      2021455796);
			    ((Class356) this).aList5453.add
				(new Class354_Sub2
				 (this, Boolean.parseBoolean(strings_4_[0]),
				  strings_4_[1],
				  Class324.method5975(strings_4_[2],
						      -952789660),
				  Integer.decode(strings_4_[3]).intValue(),
				  Class324.method5975(strings_4_[4],
						      -952789660),
				  Class324.method5975(strings_4_[5],
						      -952789660)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		((Class356) this).aBool5460 = true;
	    }
	}
	if (((Class356) this).aBool5460)
	    method6442((byte) -38);
	else {
	    Graphics graphics = Class344.canvas.getGraphics();
	    if (null != graphics) {
		try {
		    ((Class356) this).aString5457
			= new StringBuilder().append("").append
			      (CcDeltaNode.aClass70_9022
				   .method1716(-1230015284))
			      .append
			      ("%").toString();
		    ((Class356) this).aString5459
			= CcDeltaNode.aClass70_9022
			      .method1693((short) -19596);
		    if (Class357.anImage5467 == null)
			Class357.anImage5467
			    = (Class344.canvas.createImage
			       (-1080559003 * Class494.canvasWid,
				963058943 * Class67.canvasHei));
		    Graphics graphics_5_ = Class357.anImage5467.getGraphics();
		    graphics_5_.setColor(Color.BLACK);
		    graphics_5_.fillRect(0, 0,
					 -1080559003 * Class494.canvasWid,
					 963058943 * Class67.canvasHei);
		    Iterator iterator = ((Class356) this).aList5453.iterator();
		    while (iterator.hasNext()) {
			Class354 class354 = (Class354) iterator.next();
			class354.method6433(graphics_5_, (byte) -1);
		    }
		    graphics.drawImage(Class357.anImage5467, 0, 0, null);
		} catch (Exception exception) {
		    ((Class356) this).aBool5460 = true;
		}
	    } else
		Class344.canvas.repaint();
	}
    }
    
    final int method6440(int i, byte i_6_) {
	if (((Class356) this).aBool5456)
	    return (-1080559003 * Class494.canvasWid - i) / 2;
	return 0;
    }
    
    public void method39() {
	/* empty */
    }
    
    public int method211() {
	return 0;
    }
    
    Image method6441(String string, int i) throws IOException {
	Image image;
	try {
	    InputStream inputstream
		= Class421.gameApplet.getClass().getClassLoader()
		      .getResourceAsStream(string);
	    byte[] is = new byte[12000];
	    int i_7_ = 0;
	    int i_8_;
	    while ((i_8_ = inputstream.read()) != -1)
		is[i_7_++] = (byte) i_8_;
	    Image image_9_ = Toolkit.getDefaultToolkit().createImage(is);
	    image = image_9_;
	} catch (Exception exception) {
	    throw new IOException();
	}
	return image;
    }
    
    void method6442(byte i) {
	ClanSettings.method6716
	    (CcDeltaNode.aClass70_9022.method1716(-1230015284),
	     CcDeltaNode.aClass70_9022.method1693((short) -12581),
	     client.aColorArray8319[1238854867 * client.anInt8414],
	     client.aColorArray8320[1238854867 * client.anInt8414],
	     client.aColorArray8321[client.anInt8414 * 1238854867],
	     -1117118683);
    }
    
    public void method207(int i) {
	Class208.method4137(878752054);
    }
    
    public void method195(int i) {
	/* empty */
    }
    
    public int method209() {
	return 0;
    }
    
    public boolean method206(long l) {
	return true;
    }
    
    final int method6443(int i, byte i_10_) {
	if (((Class356) this).aBool5458)
	    return (963058943 * Class67.canvasHei - i) / 2;
	return 0;
    }
    
    final int method6444(int i) {
	if (((Class356) this).aBool5458)
	    return (963058943 * Class67.canvasHei - i) / 2;
	return 0;
    }
    
    final int method6445(int i) {
	if (((Class356) this).aBool5458)
	    return (963058943 * Class67.canvasHei - i) / 2;
	return 0;
    }
    
    public boolean method198(long l) {
	return true;
    }
    
    public void method201(boolean bool) {
	if (!((Class356) this).aBool5460 && !((Class356) this).aBool5454) {
	    ((Class356) this).aBool5454 = true;
	    try {
		String[] strings
		    = Class225.method4625(client.aString8516, '|', 430327478);
		if (strings.length < 3)
		    ((Class356) this).aBool5460 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class344.canvas);
		    int i = 0;
		    for (int i_11_ = 0; i_11_ < strings.length; i_11_++) {
			String[] strings_12_
			    = Class225.method4625(strings[i_11_].trim(), '=',
						  1408608963);
			if (strings_12_[0].equals("halign"))
			    ((Class356) this).aBool5456
				= Boolean.parseBoolean(strings_12_[1]);
			else if (strings_12_[0].equals("valign"))
			    ((Class356) this).aBool5458
				= Boolean.parseBoolean(strings_12_[1]);
			else if (strings_12_[0].equals("image")) {
			    String[] strings_13_
				= Class225.method4625(strings_12_[1], ',',
						      1608769190);
			    Image image;
			    try {
				image
				    = method6441(strings_13_[0], -2001860947);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				((Class356) this).aList5453.add
				    (new Class354_Sub1
				     (this, image,
				      Class324.method5975(strings_13_[1],
							  -952789660),
				      Class324.method5975(strings_13_[2],
							  -952789660)));
			    }
			} else if (strings_12_[0].equals("rotatingimage")) {
			    String[] strings_14_
				= Class225.method4625(strings_12_[1], ',',
						      694489059);
			    Image image;
			    try {
				image
				    = method6441(strings_14_[0], -1211335843);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				((Class356) this).aList5453.add
				    (new Class354_Sub1_Sub1
				     (this, image,
				      Class324.method5975(strings_14_[1],
							  -952789660),
				      Class324.method5975(strings_14_[2],
							  -952789660),
				      Float.parseFloat(strings_14_[3])));
			    }
			} else if (strings_12_[0].equals("progress")) {
			    String[] strings_15_
				= Class225.method4625(strings_12_[1], ',',
						      1730922060);
			    ((Class356) this).aList5453.add
				(new Class354_Sub2
				 (this, Boolean.parseBoolean(strings_15_[0]),
				  strings_15_[1],
				  Class324.method5975(strings_15_[2],
						      -952789660),
				  Integer.decode(strings_15_[3]).intValue(),
				  Class324.method5975(strings_15_[4],
						      -952789660),
				  Class324.method5975(strings_15_[5],
						      -952789660)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		((Class356) this).aBool5460 = true;
	    }
	}
	if (((Class356) this).aBool5460)
	    method6442((byte) -125);
	else {
	    Graphics graphics = Class344.canvas.getGraphics();
	    if (null != graphics) {
		try {
		    ((Class356) this).aString5457
			= new StringBuilder().append("").append
			      (CcDeltaNode.aClass70_9022
				   .method1716(-1230015284))
			      .append
			      ("%").toString();
		    ((Class356) this).aString5459
			= CcDeltaNode.aClass70_9022
			      .method1693((short) 17706);
		    if (Class357.anImage5467 == null)
			Class357.anImage5467
			    = (Class344.canvas.createImage
			       (-1080559003 * Class494.canvasWid,
				963058943 * Class67.canvasHei));
		    Graphics graphics_16_ = Class357.anImage5467.getGraphics();
		    graphics_16_.setColor(Color.BLACK);
		    graphics_16_.fillRect(0, 0,
					  -1080559003 * Class494.canvasWid,
					  963058943 * Class67.canvasHei);
		    Iterator iterator = ((Class356) this).aList5453.iterator();
		    while (iterator.hasNext()) {
			Class354 class354 = (Class354) iterator.next();
			class354.method6433(graphics_16_, (byte) 11);
		    }
		    graphics.drawImage(Class357.anImage5467, 0, 0, null);
		} catch (Exception exception) {
		    ((Class356) this).aBool5460 = true;
		}
	    } else
		Class344.canvas.repaint();
	}
    }
    
    Image method6446(String string) throws IOException {
	Image image;
	try {
	    InputStream inputstream
		= Class421.gameApplet.getClass().getClassLoader()
		      .getResourceAsStream(string);
	    byte[] is = new byte[12000];
	    int i = 0;
	    int i_17_;
	    while ((i_17_ = inputstream.read()) != -1)
		is[i++] = (byte) i_17_;
	    Image image_18_ = Toolkit.getDefaultToolkit().createImage(is);
	    image = image_18_;
	} catch (Exception exception) {
	    throw new IOException();
	}
	return image;
    }
    
    Image method6447(String string) throws IOException {
	Image image;
	try {
	    InputStream inputstream
		= Class421.gameApplet.getClass().getClassLoader()
		      .getResourceAsStream(string);
	    byte[] is = new byte[12000];
	    int i = 0;
	    int i_19_;
	    while ((i_19_ = inputstream.read()) != -1)
		is[i++] = (byte) i_19_;
	    Image image_20_ = Toolkit.getDefaultToolkit().createImage(is);
	    image = image_20_;
	} catch (Exception exception) {
	    throw new IOException();
	}
	return image;
    }
    
    public int method210() {
	return 0;
    }
    
    void method6448() {
	ClanSettings.method6716
	    (CcDeltaNode.aClass70_9022.method1716(-1230015284),
	     CcDeltaNode.aClass70_9022.method1693((short) 21897),
	     client.aColorArray8319[1238854867 * client.anInt8414],
	     client.aColorArray8320[1238854867 * client.anInt8414],
	     client.aColorArray8321[client.anInt8414 * 1238854867],
	     -1485642174);
    }
    
    public void method194() {
	Class208.method4137(-408224396);
    }
    
    public void method196(boolean bool, byte i) {
	if (!((Class356) this).aBool5460 && !((Class356) this).aBool5454) {
	    ((Class356) this).aBool5454 = true;
	    try {
		String[] strings
		    = Class225.method4625(client.aString8516, '|', 1954253821);
		if (strings.length < 3)
		    ((Class356) this).aBool5460 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class344.canvas);
		    int i_21_ = 0;
		    for (int i_22_ = 0; i_22_ < strings.length; i_22_++) {
			String[] strings_23_
			    = Class225.method4625(strings[i_22_].trim(), '=',
						  1004074814);
			if (strings_23_[0].equals("halign"))
			    ((Class356) this).aBool5456
				= Boolean.parseBoolean(strings_23_[1]);
			else if (strings_23_[0].equals("valign"))
			    ((Class356) this).aBool5458
				= Boolean.parseBoolean(strings_23_[1]);
			else if (strings_23_[0].equals("image")) {
			    String[] strings_24_
				= Class225.method4625(strings_23_[1], ',',
						      1277235298);
			    Image image;
			    try {
				image
				    = method6441(strings_24_[0], -1739354040);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i_21_++);
				((Class356) this).aList5453.add
				    (new Class354_Sub1
				     (this, image,
				      Class324.method5975(strings_24_[1],
							  -952789660),
				      Class324.method5975(strings_24_[2],
							  -952789660)));
			    }
			} else if (strings_23_[0].equals("rotatingimage")) {
			    String[] strings_25_
				= Class225.method4625(strings_23_[1], ',',
						      1483893458);
			    Image image;
			    try {
				image = method6441(strings_25_[0], -169254510);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i_21_++);
				((Class356) this).aList5453.add
				    (new Class354_Sub1_Sub1
				     (this, image,
				      Class324.method5975(strings_25_[1],
							  -952789660),
				      Class324.method5975(strings_25_[2],
							  -952789660),
				      Float.parseFloat(strings_25_[3])));
			    }
			} else if (strings_23_[0].equals("progress")) {
			    String[] strings_26_
				= Class225.method4625(strings_23_[1], ',',
						      728356041);
			    ((Class356) this).aList5453.add
				(new Class354_Sub2
				 (this, Boolean.parseBoolean(strings_26_[0]),
				  strings_26_[1],
				  Class324.method5975(strings_26_[2],
						      -952789660),
				  Integer.decode(strings_26_[3]).intValue(),
				  Class324.method5975(strings_26_[4],
						      -952789660),
				  Class324.method5975(strings_26_[5],
						      -952789660)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		((Class356) this).aBool5460 = true;
	    }
	}
	if (((Class356) this).aBool5460)
	    method6442((byte) -122);
	else {
	    Graphics graphics = Class344.canvas.getGraphics();
	    if (null != graphics) {
		try {
		    ((Class356) this).aString5457
			= new StringBuilder().append("").append
			      (CcDeltaNode.aClass70_9022
				   .method1716(-1230015284))
			      .append
			      ("%").toString();
		    ((Class356) this).aString5459
			= CcDeltaNode.aClass70_9022
			      .method1693((short) -18647);
		    if (Class357.anImage5467 == null)
			Class357.anImage5467
			    = (Class344.canvas.createImage
			       (-1080559003 * Class494.canvasWid,
				963058943 * Class67.canvasHei));
		    Graphics graphics_27_ = Class357.anImage5467.getGraphics();
		    graphics_27_.setColor(Color.BLACK);
		    graphics_27_.fillRect(0, 0,
					  -1080559003 * Class494.canvasWid,
					  963058943 * Class67.canvasHei);
		    Iterator iterator = ((Class356) this).aList5453.iterator();
		    while (iterator.hasNext()) {
			Class354 class354 = (Class354) iterator.next();
			class354.method6433(graphics_27_, (byte) 1);
		    }
		    graphics.drawImage(Class357.anImage5467, 0, 0, null);
		} catch (Exception exception) {
		    ((Class356) this).aBool5460 = true;
		}
	    } else
		Class344.canvas.repaint();
	}
    }
    
    public int method203() {
	return 100;
    }
    
    Class356() {
	/* empty */
    }
    
    public int method205() {
	return 100;
    }
    
    public boolean method202(long l) {
	return true;
    }
    
    void method6449() {
	ClanSettings.method6716
	    (CcDeltaNode.aClass70_9022.method1716(-1230015284),
	     CcDeltaNode.aClass70_9022.method1693((short) -22235),
	     client.aColorArray8319[1238854867 * client.anInt8414],
	     client.aColorArray8320[1238854867 * client.anInt8414],
	     client.aColorArray8321[client.anInt8414 * 1238854867],
	     -1367568748);
    }
    
    public int method197() {
	return 0;
    }
    
    public int method204() {
	return 100;
    }
    
    public int method199(int i) {
	return 100;
    }
    
    public int method200(int i) {
	return 0;
    }
    
    static final void method6450(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1;
    }
    
    static final void method6451(ClientScriptData class454, short i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 100 == Class573_Sub1.anInt8787 * -16261253 ? 1 : 0;
    }
    
    static final void method6452(ClientScriptData class454, int i) {
	float f = Class282.method5490(((ClientScriptData) class454).integerStack
				      [(((ClientScriptData) class454).intStackPointer
					-= 1736754263) * 1482319719]);
	Class241_Sub39_Sub6_Sub2 class241_sub39_sub6_sub2
	    = new Class241_Sub39_Sub6_Sub2(Class445_Sub16
					       .aClass351_Sub1_8660
					       .method16835(-1437092602),
					   f);
	Class445_Sub16.aClass351_Sub1_8660.method6276(class241_sub39_sub6_sub2,
						      1410058619);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 2083383801 * class241_sub39_sub6_sub2.anInt10841;
    }
}
