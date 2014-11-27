/* Class594 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

import jaclib.nanotime.QueryPerformanceCounter;

//package com.jagex.game.runetek6.client;
public abstract class GameShell3
    implements Interface22, Runnable, FocusListener, WindowListener {
	
	public static class Environment {//Originally Class595
		static Environment APPLET_WITH_EXTERNAL_FRAME;//aClass595_7670
		public static Environment APPLICATION = new Environment();//aClass595_7671
		static Environment APPLET = new Environment();//aClass595_7672
    
		static {
			APPLET_WITH_EXTERNAL_FRAME = new Environment();
		}
    
		Environment() {
			/* empty */
		}
	}
	
    protected static boolean aBool7632;
    static long aLong7633 = 8635927166674524928L;
    public static int currentFpsRate = 0;//anInt7634
    public static int anInt7635 = 0;
    static final int anInt7636 = 1;
    static long[] aLongArray7637 = new long[32];
    static int anInt7638;
    static Environment environment;//aClass595_7639
    public static int leftMargin;//anInt7640
    static final int anInt7641 = 32;
    protected static String aString7642;
    boolean aBool7643;
    static final int anInt7644 = 0;
    protected static volatile boolean canvasReplaceRecommended;//aBool7645
    static volatile long lastCanvasReplace;//aLong7646
    public boolean aBool7647;
    static volatile boolean focus_in;//aBool7648
    static int anInt7649;
    static final int anInt7650 = 1048576;
    static final String FILE_ACCESS_PERMISSIONS = "rw";//aString7651
    static final String cacheDatFilename = "main_file_cache.dat2";//aString7652
    static final String cacheIndexFilename = "main_file_cache.idx";//aString7653
    static final String cacheMasterIndexFilename = "main_file_cache.idx255";//aString7654
    static final String UIDFileName = "random.dat";//aString7655
    static Class414 uidDat;//aClass414_7656
    static int anInt7657;
    protected static Class414 masterIndex;//aClass414_7658
    static final long aLong7659 = 3221225472L;
    protected static Class414 cacheDat;//aClass414_7660
    protected static volatile boolean fullredraw;//aBool7661
    static long killtime;//aLong7662
    static boolean shutdown;//aBool7663
    boolean alreadyerrored = false;//aBool7664
    public static int maxmemory;//anInt7665
    public static int cpucount;//anInt7666
    static long[] aLongArray7667 = new long[32];
    public static int topMargin;//anInt7668
    public static CursorTypeList cursorTypeList;//aClass605_7669
    
    static long method12948() {
		return Class124.aClass593_1580.method12934(-1745278610);
    }
    
	@Override
    public void supplyApplet(Applet applet) {
		Class421.gameApplet = applet;
    }
    
    final void startApplet/*method12949*/(GameShell3$FrameParameters class252, String string, String string_0_,
			   int i, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_) {
		try {
			setEnvironment(Environment.APPLET, bool, (byte) -4);
		    Class294.frameWid 
		    	= (Class494.canvasWid = class252.getWidth(1011525627) * 331425645) * 222347151;
		    Class43.frameHei
				= ((Class67.canvasHei = class252.getHeight(-1409928488) * 676324095) * -958932171);
		    leftMargin = 0;
		    topMargin = 0;
		    if (Class262.getEnvironment(602259182) == Environment.APPLET_WITH_EXTERNAL_FRAME) {
				Class294.frameWid += 320778694 * class252.getXMargin(1286744872);
				Class43.frameHei += 465979286 * class252.getYMargin(1726225607);
				createAndShowFrame(class252.getTitle(1246653497), (byte) 107);
		    }
		    Class421.anApplet6042 = Class421.gameApplet;
		    startCommon(string, string_0_, i, i_1_, i_2_, i_3_, 1815958437);
		} catch (Throwable throwable) {
		    VarType.method3770(null, throwable, -820217853);
		    error("crash", -727569674);
		}
    }
    
    final void startCommon/*method12950*/(String string, String string_5_, int i, int i_6_,
			   int i_7_, int i_8_, int i_9_) throws Exception {
		Class344.archiveCount = i_6_ * -179487811;
		Class360.historicCacheId = -1640295119 * i;
		RuntimeException_Sub3.anInt11294 = 341673965 * i_7_;
		RuntimeException_Sub3.anInt11295 = 517343435 * i_8_;
		Class222.javaVendor = "Unknown";
		InterfaceDefinition.javaVersion = "1.1";
		try {
			Class222.javaVendor = System.getProperty("java.vendor");
			InterfaceDefinition.javaVersion = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			Class12.osNameRaw = System.getProperty("os.name");
		} catch (Exception exception) {
			Class12.osNameRaw = "Unknown";
		}
		Class83.osName = Class12.osNameRaw.toLowerCase();
		try {
			Class320.osArchRaw = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class320.osArchRaw = "";
		}
		try {
			Class241_Sub39_Sub2.osVersionRaw = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class241_Sub39_Sub2.osVersionRaw = "";
		}
		try {
			Class6.homeDir = System.getProperty("user.home");
			if (Class6.homeDir != null) {
				Class6.homeDir = new StringBuilder().append(Class6.homeDir).append("/").toString();
			}
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class83.osName.startsWith("win")) {
				if (null == Class6.homeDir) {
					Class6.homeDir = System.getenv("USERPROFILE");
				}
			} else if (Class6.homeDir == null)
			Class6.homeDir = System.getenv("HOME");
			if (null != Class6.homeDir)
			Class6.homeDir = new StringBuilder().append(Class6.homeDir).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == Class6.homeDir) {
			Class6.homeDir = "~/";
		}
		try {
			Class105.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class636.historicCacheLocations = new String[] { "c:/rscache/", "/rscache/", "c:/windows/",
					 "c:/winnt/", "c:/", Class6.homeDir, "/tmp/", "" };
		JSFunction.historicCacheDirectories = new String[] { new StringBuilder().append(".jagex_cache_").append
					 (1547576273 * Class360.historicCacheId).toString(),
					 new StringBuilder().append(".file_store_").append
					 (1547576273 * Class360.historicCacheId)
					 .toString() };
		while_136_: 
		for (int i_10_ = 0; i_10_ < 4; i_10_++) {
			Class116.cacheDirectory = getCacheDirectory(string, string_5_, i_10_, 1718294613);
			if (!Class116.cacheDirectory.exists()) {
				Class116.cacheDirectory.mkdirs();
			}
			File[] files = Class116.cacheDirectory.listFiles();
			if (files != null) {
				File[] files_11_ = files;
				for (int i_12_ = 0; i_12_ < files_11_.length; i_12_++) {
					File file = files_11_[i_12_];
					if (!checkWritable(file, false, 1717337461)) {
						continue while_136_;
					}
				}
			}
			break;
		}
		Class78.method1781(Class116.cacheDirectory, 2048075021);
		Class26.openUID(-399379648);
		cacheDat = new Class414(new RS3File((Class434_Sub3_Sub3.method17068
						 ("main_file_cache.dat2", -265525554)), "rw", 3221225472L), 5200, 0);
		masterIndex = new Class414(new RS3File((Class434_Sub3_Sub3.method17068
						 ("main_file_cache.idx255", 1165956985)), "rw", 1048576L), 6000, 0);
		Class565.cacheIndex = new Class414[Class344.archiveCount * -634693739];
		for (int i_13_ = 0; i_13_ < -634693739 * Class344.archiveCount; i_13_++) {
			Class565.cacheIndex[i_13_] = new Class414(new RS3File((Class434_Sub3_Sub3.method17068
							 (new StringBuilder().append
							  ("main_file_cache.idx")
							  .append
							  (i_13_).toString(),
							  384207971)),
							"rw", 1048576L),
					   6000, 0);
		}
		try {
			Class288.fsimp14 = new Class426();
		} catch (Exception exception) {
			Class442.aBool6160 = false;
		}
		Class256.mouseImp = new Class250();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_14_ = threadgroup.getParent();
			 null != threadgroup_14_;
			 threadgroup_14_ = threadgroup.getParent()) {
			threadgroup = threadgroup_14_;
		}
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_15_ = 0; i_15_ < threads.length; i_15_++) {
			if (null != threads[i_15_]
			&& threads[i_15_].getName().startsWith("AWT"))
			threads[i_15_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	abstract void method12951();

	final void shutdown/*method12952*/(boolean bool, byte i) {
		synchronized (this) {
			if (shutdown) {
				return;
			}
			shutdown = true;
		}
		try {
			mainquit(1083838206);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			cacheDat.method7461(-710836310);
			for (int i_16_ = 0; i_16_ < Class344.archiveCount * -634693739; i_16_++) {
				Class565.cacheIndex[i_16_].method7461(1860479070);
			}
			masterIndex.method7461(-1904064417);
			uidDat.method7461(-1464990036);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool7643) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
			/* empty */
			}
		}
		if (Class14.method695(-1442713402)) {
			Class256.method5053((byte) -37).method107(-16777216);
		}
		if (Class344.canvas != null) {
			try {
				Class344.canvas.removeFocusListener(this);
				Class344.canvas.getParent().remove(Class344.canvas);
			} catch (Exception exception) {
			/* empty */
			}
		}
		if (Class241_Sub40_Sub1.frame != null) {
			Class241_Sub40_Sub1.frame.setVisible(false);
			Class241_Sub40_Sub1.frame.dispose();
			Class241_Sub40_Sub1.frame = null;
		}
    }
    
    void writeCacheLocator/*method12953*/(File file, File file_17_, int i) {
		try {
			RS3File class408 = new RS3File(Class505.cacheLocator, "rw", 10000L);
			RSByteBuffer buffer = new RSByteBuffer(500);
			buffer.writeByte(3, 74766963);
			buffer.writeByte(null != file_17_ ? 1 : 0, -1759198768);
			buffer.method14631(file.getPath(), 265751044);
			if (file_17_ != null) {
				buffer.method14631(file_17_.getPath(), 265751044);
			}
			class408.write(buffer.payload, 0,
					buffer.pointer * 421967667,
					(byte) 12);
			class408.close((byte) 110);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
    }
    
    boolean checkWritable/*method12954*/(File file, boolean bool, int i) {
		boolean bool_18_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i_19_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_19_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool) {
				file.delete();
			}
			bool_18_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_18_;
    }
    
    synchronized void createAndShowFrame/*method12955*/(String string, byte i) {
		Class241_Sub40_Sub1.frame = new Frame();
		Class241_Sub40_Sub1.frame.setTitle(string);
		Class241_Sub40_Sub1.frame.setResizable(true);
		Class241_Sub40_Sub1.frame.addWindowListener(this);
		Class241_Sub40_Sub1.frame.setBackground(Color.black);
		Class241_Sub40_Sub1.frame.setVisible(true);
		Class241_Sub40_Sub1.frame.toFront();
		Insets insets = Class241_Sub40_Sub1.frame.getInsets();
		Class241_Sub40_Sub1.frame.setSize(
				insets.right + (884255947 * Class294.frameWid + insets.left),
				insets.bottom + (insets.top + -828675613 * Class43.frameHei));
    }
    
    boolean method12956(File file, boolean bool) {
	boolean bool_20_;
	try {
	    RandomAccessFile randomaccessfile
		= new RandomAccessFile(file, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    if (bool)
		file.delete();
	    bool_20_ = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool_20_;
    }
    
    void addCanvas/*method12957*/(Container container, int i) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class344.canvas);
		Class344.canvas.setSize(-1080559003 * Class494.canvasWid,
						 963058943 * Class67.canvasHei);
		Class344.canvas.setVisible(true);
		if (container == Class241_Sub40_Sub1.frame) {
			Insets insets = Class241_Sub40_Sub1.frame.getInsets();
			Class344.canvas.setLocation((insets.left + leftMargin * -2063759389),
							 (insets.top + 303720107 * topMargin));
		} else {
			Class344.canvas.setLocation(leftMargin * -2063759389, 303720107 * topMargin);
		}
		Class344.canvas.addFocusListener(this);
		Class344.canvas.requestFocus();
		Class47.isWindowFocused = true;
		focus_in = true;
		Class344.canvas.setFocusTraversalKeysEnabled(false);
		fullredraw = true;
		canvasReplaceRecommended = false;
		lastCanvasReplace = Class50.method1249((byte) 1) * 7388777628882923173L;
    }
    
    void removeCanvas/*method12958*/(int i) {
		if (Class344.canvas != null) {
			Class344.canvas.removeFocusListener(this);
			Class344.canvas.getParent().setBackground(Color.black);
			Class344.canvas.getParent().remove(Class344.canvas);
		}
    }
    
    final boolean checkhost/*method12959*/(int i) {
		String string = Class421.gameApplet.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
		    return true;
		if (string.equals("runescape.com")
		    || string.endsWith(".runescape.com"))
		    return true;
		if (string.equals("stellardawn.com")
		    || string.endsWith(".stellardawn.com"))
		    return true;
		if (string.endsWith("127.0.0.1"))
		    return true;
		for (/**/;
		     (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
		      && string.charAt(string.length() - 1) <= '9');
		     string = string.substring(0, string.length() - 1)) {
		    /* empty */
		}
		if (string.endsWith("192.168.1.")) {
		    return true;
		}
		if (string.endsWith("91.121.246.177")) {
			return true;
		}
		error("invalidhost", -302119359);
		return false;
    }
    
    public void run() {
		do {
		    try {
				try {
				    run_inner(1675083025);
				} catch (ThreadDeath threaddeath) {
					threaddeath.printStackTrace();
				    throw threaddeath;
				} catch (Throwable throwable) {
					throwable.printStackTrace();
				    VarType.method3770(method12985((byte) 101), throwable,
							-587765470);
				    error("crash", -975408521);
				    shutdown(true, (byte) 29);
				    break;
				}
				shutdown(true, (byte) 51);
		    } catch (Throwable object) {
				shutdown(true, (byte) 16);
				throw object;
		    }
		} while (false);
    }
    
    public void method12960() {
	do {
	    try {
		try {
		    run_inner(65984613);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    VarType.method3770(method12985((byte) 14), throwable,
					-645073643);
		    error("crash", -430982607);
		    shutdown(true, (byte) 34);
		    break;
		}
		shutdown(true, (byte) -3);
	    } catch (Throwable object) {
		shutdown(true, (byte) 44);
		throw object;
	    }
	} while (false);
    }
    
    public static final void method12961() {
	Class124.aClass593_1580.method12928((byte) 1);
	for (int i = 0; i < 32; i++)
	    aLongArray7637[i] = 0L;
	for (int i = 0; i < 32; i++)
	    aLongArray7667[i] = 0L;
	anInt7649 = 0;
    }
    
    void method12962(short i) {
		long l = Class50.method1249((byte) 1);
		long l_21_ = aLongArray7637[Class534.anInt6968 * -445111789 - 1 & 0x1f];
		long l_22_ = aLongArray7637[Class534.anInt6968 * -445111789];
		aLongArray7637[-445111789 * Class534.anInt6968] = l;
		Class534.anInt6968 = -1046022117 * (1 + -445111789 * Class534.anInt6968 & 0x1f);
		if (l_22_ != 0L && l > l_22_) {
			int i_23_ = (int) (l - l_22_);
			anInt7635 = (int) (l - l_21_) * -1510181699;
			currentFpsRate = (32000 + (i_23_ >> 1)) / i_23_ * -734611609;
		}
		if ((anInt7657 += -1832064483) * 449521717 - 1 > 50) {
			anInt7657 -= -1408910934;
			fullredraw = true;
			Class344.canvas.setSize(Class494.canvasWid * -1080559003,
						 963058943 * Class67.canvasHei);
			Class344.canvas.setVisible(true);
			if (Class241_Sub40_Sub1.frame != null
					&& Class228.aFrame2674 == null) {
				Insets insets = Class241_Sub40_Sub1.frame.getInsets();
				Class344.canvas.setLocation((leftMargin * -2063759389
							  + insets.left),
							 (topMargin * 303720107
							  + insets.top));
			} else {
				Class344.canvas.setLocation(leftMargin * -2063759389,
							 303720107 * topMargin);
			}
		}
		method12963((byte) -55);
    }
    
    abstract void method12963(byte i);
    
    abstract void method12964();
    
	@Override
    public void start() {
	if (!shutdown)
	    killtime = 0L;
    }
    
	@Override
    public void stop() {
	if (!shutdown)
	    killtime = ((Class50.method1249((byte) 1) + 4000L)
			 * 7081869956920028431L);
    }
    
	@Override
    public void destroy() {
	if (!shutdown) {
	    killtime = Class50.method1249((byte) 1) * 7081869956920028431L;
	    Class380_Sub2.method16722(5000L);
	    shutdown(false, (byte) -67);
	}
    }
    
    void method12965() {
	long l = Class50.method1249((byte) 1);
	long l_24_ = aLongArray7667[-973561871 * anInt7638];
	aLongArray7667[anInt7638 * -973561871] = l;
	anInt7638 = (anInt7638 * -973561871 + 1 & 0x1f) * 2116317457;
	if (l_24_ != 0L && l <= l_24_) {
	    /* empty */
	}
	synchronized (this) {
	    Class47.isWindowFocused = focus_in;
	}
	method12971(21597930);
    }
    
    public final synchronized void paint(Graphics graphics) {
		if (!shutdown) {
		    fullredraw = true;
		    if (Class50.method1249((byte) 1) - lastCanvasReplace * 7529516469221509421L > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle
				    || (rectangle.width >= Class294.frameWid * 884255947
					&& rectangle.height >= Class43.frameHei * -828675613)) {
				    canvasReplaceRecommended = true;
				}
		    }
		}
    }
    
    void method12966(String string, String string_25_, int i) {
	if (!alreadyerrored) {
	    alreadyerrored = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class396.callNoParamater(Class421.gameApplet, "loggedout",
				    (byte) -85);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class421.gameApplet.getAppletContext().showDocument
		    (new URL(Class421.gameApplet.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws?").append
				 (string_25_).toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public final void focusLost(FocusEvent focusevent) {
	focus_in = false;
    }
    
    synchronized void method12967(String string) {
	Class241_Sub40_Sub1.frame = new Frame();
	Class241_Sub40_Sub1.frame.setTitle(string);
	Class241_Sub40_Sub1.frame.setResizable(true);
	Class241_Sub40_Sub1.frame.addWindowListener(this);
	Class241_Sub40_Sub1.frame.setBackground(Color.black);
	Class241_Sub40_Sub1.frame.setVisible(true);
	Class241_Sub40_Sub1.frame.toFront();
	Insets insets = Class241_Sub40_Sub1.frame.getInsets();
	Class241_Sub40_Sub1.frame.setSize
	    (insets.right + (884255947 * Class294.frameWid + insets.left),
	     insets.bottom + (insets.top + -828675613 * Class43.frameHei));
    }
    
    public final void windowClosed(WindowEvent windowevent) {
	/* empty */
    }
    
    static void method12968(RSByteBuffer class241_sub3, int i) {
	if (null != uidDat) {
	    try {
		uidDat.method7463(0L);
		uidDat.method7467(class241_sub3.payload, i, 24,
					  (short) 27349);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public final void windowDeactivated(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void windowDeiconified(WindowEvent windowevent) {
	/* empty */
    }
    
    void method12969(String string) {
	if (!alreadyerrored) {
	    alreadyerrored = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class396.callNoParamater(Class421.gameApplet, "loggedout",
				    (byte) -113);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class421.gameApplet.getAppletContext().showDocument
		    (new URL(Class421.gameApplet.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws").toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public final void windowOpened(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void windowIconified(WindowEvent windowevent) {
	/* empty */
    }
    
    abstract void maininit/*method12970*/(int i);
    
    abstract void method12971(int i);
    
    void method12972(File file, File file_26_) {
	try {
	    RS3File class408 = new RS3File(Class505.cacheLocator, "rw", 10000L);
	    RSByteBuffer class241_sub3 = new RSByteBuffer(500);
	    class241_sub3.writeByte(3, 947595318);
	    class241_sub3.writeByte(null != file_26_ ? 1 : 0, -1113177703);
	    class241_sub3.method14631(file.getPath(), 265751044);
	    if (file_26_ != null)
		class241_sub3.method14631(file_26_.getPath(), 265751044);
	    class408.write(class241_sub3.payload, 0,
				class241_sub3.pointer * 421967667, (byte) 5);
	    class408.close((byte) 27);
	} catch (IOException ioexception) {
	    ioexception.printStackTrace();
	}
    }
    
    abstract void method12973();
    
    void error/*method12974*/(String string, int i) {
		if (!alreadyerrored) {
		    alreadyerrored = true;
		    System.out.println(new StringBuilder().append("error_game_").append(string).toString());
		    try {
		    	Class396.callNoParamater(Class421.gameApplet, "loggedout", (byte) -34);
		    } catch (Throwable throwable) {
		    	/* empty */
		    }
		    try {
				Class421.gameApplet.getAppletContext().showDocument
				    (new URL(Class421.gameApplet.getCodeBase(),
					     new StringBuilder().append("error_game_").append
						 (string).append
						 (".ws").toString()), "_top");
		    } catch (Exception exception) {
		    	/* empty */
		    }
		}
    }
    
    public final void method12975(WindowEvent windowevent) {
	/* empty */
    }
    
    void method12976() {
	long l = Class50.method1249((byte) 1);
	long l_27_
	    = aLongArray7637[Class534.anInt6968 * -445111789 - 1 & 0x1f];
	long l_28_ = aLongArray7637[Class534.anInt6968 * -445111789];
	aLongArray7637[-445111789 * Class534.anInt6968] = l;
	Class534.anInt6968
	    = -1046022117 * (1 + -445111789 * Class534.anInt6968 & 0x1f);
	if (l_28_ != 0L && l > l_28_) {
	    int i = (int) (l - l_28_);
	    anInt7635 = (int) (l - l_27_) * -1510181699;
	    currentFpsRate = (32000 + (i >> 1)) / i * -734611609;
	}
	if ((anInt7657 += -1832064483) * 449521717 - 1 > 50) {
	    anInt7657 -= -1408910934;
	    fullredraw = true;
	    Class344.canvas.setSize(Class494.canvasWid * -1080559003,
					 963058943 * Class67.canvasHei);
	    Class344.canvas.setVisible(true);
	    if (Class241_Sub40_Sub1.frame != null
		&& Class228.aFrame2674 == null) {
		Insets insets = Class241_Sub40_Sub1.frame.getInsets();
		Class344.canvas.setLocation((leftMargin * -2063759389
						  + insets.left),
						 (topMargin * 303720107
						  + insets.top));
	    } else
		Class344.canvas.setLocation(leftMargin * -2063759389,
						 303720107 * topMargin);
	}
	method12963((byte) 23);
    }
    
    public void method12977(int i) throws Exception_Sub4 {
		if (!aBool7647) {
		    Class256.method5053((byte) -19).method109("jagtheora", 778804677);
		    aBool7647 = true;
		}
    }
    
    void setEnvironment/*method12978*/(Environment class595, boolean bool, byte i) {
		if (null == class595) {
		    throw new NullPointerException();
		}
		if (Environment.APPLET != class595 && class595 != Environment.APPLICATION) {
		    throw new IllegalStateException();
		}
		environment = class595;
		if (Environment.APPLICATION != environment) {
		    if (bool) {
		    	environment = Environment.APPLET_WITH_EXTERNAL_FRAME;
		    }
		}
    }
    
    static {
		leftMargin = 0;
		topMargin = 0;
		aString7642 = null;
		fullredraw = true;
		anInt7657 = -1204207452;
		canvasReplaceRecommended = false;
		lastCanvasReplace = 0L;
		aBool7632 = false;
		focus_in = true;
		uidDat = null;
		cacheDat = null;
		masterIndex = null;
		environment = null;
		killtime = 0L;
		shutdown = false;
		maxmemory = 1442608195;
		cpucount = -960557393;
    }
    
    abstract void method12979();
    
    abstract void method12980();
    
    public void method12981() {
	do {
	    try {
		try {
		    run_inner(895246498);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    VarType.method3770(method12985((byte) -5), throwable,
					-1521273932);
		    error("crash", -955960793);
		    shutdown(true, (byte) -59);
		    break;
		}
		shutdown(true, (byte) -71);
	    } catch (Throwable object) {
		shutdown(true, (byte) 43);
		throw object;
	    }
	} while (false);
    }
    
    public void method12982() {
	do {
	    try {
		try {
		    run_inner(1369697067);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    VarType.method3770(method12985((byte) 47), throwable,
					-1250299733);
		    error("crash", -284185866);
		    shutdown(true, (byte) 28);
		    break;
		}
		shutdown(true, (byte) -1);
	    } catch (Throwable object) {
		shutdown(true, (byte) 12);
		throw object;
	    }
	} while (false);
    }
    
    final void method12983(String string, String string_29_, int i, int i_30_,
			   int i_31_, int i_32_) throws Exception {
	Class344.archiveCount = i_30_ * -179487811;
	Class360.historicCacheId = -1640295119 * i;
	RuntimeException_Sub3.anInt11294 = 341673965 * i_31_;
	RuntimeException_Sub3.anInt11295 = 517343435 * i_32_;
	Class222.javaVendor = "Unknown";
	InterfaceDefinition.javaVersion = "1.1";
	try {
	    Class222.javaVendor = System.getProperty("java.vendor");
	    InterfaceDefinition.javaVersion = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    Class12.osNameRaw = System.getProperty("os.name");
	} catch (Exception exception) {
	    Class12.osNameRaw = "Unknown";
	}
	Class83.osName = Class12.osNameRaw.toLowerCase();
	try {
	    Class320.osArchRaw = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    Class320.osArchRaw = "";
	}
	try {
	    Class241_Sub39_Sub2.osVersionRaw
		= System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    Class241_Sub39_Sub2.osVersionRaw = "";
	}
	try {
	    Class6.homeDir = System.getProperty("user.home");
	    if (Class6.homeDir != null)
		Class6.homeDir
		    = new StringBuilder().append(Class6.homeDir).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (Class83.osName.startsWith("win")) {
		if (null == Class6.homeDir)
		    Class6.homeDir = System.getenv("USERPROFILE");
	    } else if (Class6.homeDir == null)
		Class6.homeDir = System.getenv("HOME");
	    if (null != Class6.homeDir)
		Class6.homeDir
		    = new StringBuilder().append(Class6.homeDir).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	if (null == Class6.homeDir)
	    Class6.homeDir = "~/";
	try {
	    Class105.eventQueue
		= Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	Class636.historicCacheLocations
	    = new String[] { "c:/rscache/", "/rscache/", "c:/windows/",
			     "c:/winnt/", "c:/", Class6.homeDir, "/tmp/",
			     "" };
	JSFunction.historicCacheDirectories
	    = new String[] { new StringBuilder().append(".jagex_cache_").append
				 (1547576273 * Class360.historicCacheId).toString(),
			     new StringBuilder().append(".file_store_").append
				 (1547576273 * Class360.historicCacheId)
				 .toString() };
    while_138_:
	for (int i_33_ = 0; i_33_ < 4; i_33_++) {
	    Class116.cacheDirectory
		= getCacheDirectory(string, string_29_, i_33_, 1718294613);
	    if (!Class116.cacheDirectory.exists())
		Class116.cacheDirectory.mkdirs();
	    File[] files = Class116.cacheDirectory.listFiles();
	    if (files != null) {
		File[] files_34_ = files;
		for (int i_35_ = 0; i_35_ < files_34_.length; i_35_++) {
		    File file = files_34_[i_35_];
		    if (!checkWritable(file, false, 2094371372))
			continue while_138_;
		}
	    }
	    break;
	}
	Class78.method1781(Class116.cacheDirectory, 2048075021);
	Class26.openUID(-1183343810);
	cacheDat
	    = new Class414(new RS3File((Class434_Sub3_Sub3.method17068
					 ("main_file_cache.dat2", 553314617)),
					"rw", 3221225472L),
			   5200, 0);
	masterIndex
	    = new Class414(new RS3File((Class434_Sub3_Sub3.method17068
					 ("main_file_cache.idx255",
					  1208970159)),
					"rw", 1048576L),
			   6000, 0);
	Class565.cacheIndex
	    = new Class414[Class344.archiveCount * -634693739];
	for (int i_36_ = 0; i_36_ < -634693739 * Class344.archiveCount; i_36_++)
	    Class565.cacheIndex[i_36_]
		= new Class414(new RS3File((Class434_Sub3_Sub3.method17068
					     (new StringBuilder().append
						  ("main_file_cache.idx")
						  .append
						  (i_36_).toString(),
					      720177799)),
					    "rw", 1048576L),
			       6000, 0);
	try {
	    Class288.fsimp14 = new Class426();
	} catch (Exception exception) {
	    Class442.aBool6160 = false;
	}
	Class256.mouseImp = new Class250();
	ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
	for (ThreadGroup threadgroup_37_ = threadgroup.getParent();
	     null != threadgroup_37_;
	     threadgroup_37_ = threadgroup.getParent())
	    threadgroup = threadgroup_37_;
	Thread[] threads = new Thread[1000];
	threadgroup.enumerate(threads);
	for (int i_38_ = 0; i_38_ < threads.length; i_38_++) {
	    if (null != threads[i_38_]
		&& threads[i_38_].getName().startsWith("AWT"))
		threads[i_38_].setPriority(1);
	}
	Thread thread = new Thread(this);
	thread.setDaemon(true);
	thread.start();
	thread.setPriority(1);
    }
    
    abstract void method12984();
    
    String method12985(byte i) {
	return null;
    }
    
    abstract void method12986();
    
    String method12987() {
	return null;
    }
    
    final void method12988(GameShell3$FrameParameters class252, String string, String string_39_,
			   int i, int i_40_, int i_41_, int i_42_,
			   boolean bool) {
	try {
		setEnvironment(Environment.APPLET, bool, (byte) -39);
	    Class294.frameWid
		= (Class494.canvasWid
		   = class252.getWidth(-1358993204) * 331425645) * 222347151;
	    Class43.frameHei
		= ((Class67.canvasHei
		    = class252.getHeight(-1930926432) * 676324095)
		   * -958932171);
	    leftMargin = 0;
	    topMargin = 0;
	    if (Class262.getEnvironment(-771324962) == Environment.APPLET_WITH_EXTERNAL_FRAME) {
			Class294.frameWid
			    += 320778694 * class252.getXMargin(1286744872);
			Class43.frameHei += 465979286 * class252.getYMargin(781780780);
			createAndShowFrame(class252.getTitle(-890997407), (byte) 126);
	    }
	    Class421.anApplet6042 = Class421.gameApplet;
	    startCommon(string, string_39_, i, i_40_, i_41_, i_42_,
			1815958437);
	} catch (Throwable throwable) {
	    VarType.method3770(null, throwable, -798147798);
	    error("crash", -55477549);
	}
    }
    
    public final void windowActivated(WindowEvent windowevent) {
	/* empty */
    }
    
    abstract void method12989();
    
    public final synchronized void method133(Graphics graphics) {
	if (!shutdown) {
	    fullredraw = true;
	    if (Class50.method1249((byte) 1) - lastCanvasReplace * 7529516469221509421L
		> 1000L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (null == rectangle
		    || (rectangle.width >= Class294.frameWid * 884255947
			&& rectangle.height >= Class43.frameHei * -828675613))
		    canvasReplaceRecommended = true;
	    }
	}
    }
    
    abstract void method12990();
    
    abstract void method12991();
    
    public void method12992(int i) throws Exception_Sub4 {
	if (!aBool7643) {
	    Class256.method5053((byte) 26).method109("jaclib", 962562176);
	    try {
		QueryPerformanceCounter.init();
	    } catch (Throwable throwable) {
		if (Class83.osName.startsWith("win"))
		    throw new Exception_Sub4(128, "jaclib");
	    }
	    aBool7643 = true;
	}
    }
    
    String method12993() {
	return null;
    }
    
    public static void method12994(RSByteBuffer class241_sub3) {
	byte[] is = new byte[24];
	try {
	    uidDat.method7463(0L);
	    uidDat.method7460(is, (short) 14223);
	    int i;
	    for (i = 0; i < 24 && is[i] == 0; i++) {
		/* empty */
	    }
	    if (i >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i = 0; i < 24; i++)
		is[i] = (byte) -1;
	}
	class241_sub3.writeBytes(is, 0, 24, 752061035);
    }
    
    public void method126(Applet applet) {
	Class421.gameApplet = applet;
    }
    
    final void method12995(GameShell3$FrameParameters class252, String string, String string_43_,
			   int i, int i_44_, int i_45_, int i_46_,
			   boolean bool) {
	try {
		setEnvironment(Environment.APPLET, bool, (byte) -20);
	    Class294.frameWid
		= (Class494.canvasWid
		   = class252.getWidth(878571838) * 331425645) * 222347151;
	    Class43.frameHei
		= (Class67.canvasHei
		   = class252.getHeight(-752835745) * 676324095) * -958932171;
	    leftMargin = 0;
	    topMargin = 0;
	    if (Class262.getEnvironment(2079086809) == Environment.APPLET_WITH_EXTERNAL_FRAME) {
		Class294.frameWid
		    += 320778694 * class252.getXMargin(1286744872);
		Class43.frameHei += 465979286 * class252.getYMargin(958695749);
		createAndShowFrame(class252.getTitle(-1187102948), (byte) 122);
	    }
	    Class421.anApplet6042 = Class421.gameApplet;
	    startCommon(string, string_43_, i, i_44_, i_45_, i_46_,
			1815958437);
	} catch (Throwable throwable) {
	    VarType.method3770(null, throwable, -589898109);
	    error("crash", -1571546256);
	}
    }
    
    void method12996() {
	if (Class344.canvas != null) {
	    Class344.canvas.removeFocusListener(this);
	    Class344.canvas.getParent().setBackground(Color.black);
	    Class344.canvas.getParent().remove(Class344.canvas);
	}
    }
    
    final void method12997(GameShell3$FrameParameters class252, String string, String string_47_,
			   int i, int i_48_, int i_49_, int i_50_,
			   boolean bool) {
	try {
		setEnvironment(Environment.APPLET, bool, (byte) -26);
	    Class294.frameWid
		= (Class494.canvasWid
		   = class252.getWidth(-1808008391) * 331425645) * 222347151;
	    Class43.frameHei
		= (Class67.canvasHei
		   = class252.getHeight(-786198021) * 676324095) * -958932171;
	    leftMargin = 0;
	    topMargin = 0;
	    if (Class262.getEnvironment(-470317147) == Environment.APPLET_WITH_EXTERNAL_FRAME) {
		Class294.frameWid
		    += 320778694 * class252.getXMargin(1286744872);
		Class43.frameHei
		    += 465979286 * class252.getYMargin(1524579635);
		createAndShowFrame(class252.getTitle(-2127061484), (byte) 126);
	    }
	    Class421.anApplet6042 = Class421.gameApplet;
	    startCommon(string, string_47_, i, i_48_, i_49_, i_50_,
			1815958437);
	} catch (Throwable throwable) {
	    VarType.method3770(null, throwable, -711776050);
	    error("crash", -1186380210);
	}
    }
    
    final void method12998(GameShell3$FrameParameters class252, String string, String string_51_,
			   int i, int i_52_, int i_53_, int i_54_,
			   boolean bool) {
	try {
		setEnvironment(Environment.APPLET, bool, (byte) -94);
	    Class294.frameWid
		= (Class494.canvasWid
		   = class252.getWidth(-387824074) * 331425645) * 222347151;
	    Class43.frameHei
		= (Class67.canvasHei
		   = class252.getHeight(-989229401) * 676324095) * -958932171;
	    leftMargin = 0;
	    topMargin = 0;
	    if (Class262.getEnvironment(2084579358) == Environment.APPLET_WITH_EXTERNAL_FRAME) {
		Class294.frameWid
		    += 320778694 * class252.getXMargin(1286744872);
		Class43.frameHei
		    += 465979286 * class252.getYMargin(2113211505);
		createAndShowFrame(class252.getTitle(968894586), (byte) 122);
	    }
	    Class421.anApplet6042 = Class421.gameApplet;
	    startCommon(string, string_51_, i, i_52_, i_53_, i_54_,
			1815958437);
	} catch (Throwable throwable) {
	    VarType.method3770(null, throwable, -167061850);
	    error("crash", -1576502757);
	}
    }
    
    final void method12999(String string, String string_55_, int i, int i_56_,
			   int i_57_, int i_58_) throws Exception {
	Class344.archiveCount = i_56_ * -179487811;
	Class360.historicCacheId = -1640295119 * i;
	RuntimeException_Sub3.anInt11294 = 341673965 * i_57_;
	RuntimeException_Sub3.anInt11295 = 517343435 * i_58_;
	Class222.javaVendor = "Unknown";
	InterfaceDefinition.javaVersion = "1.1";
	try {
	    Class222.javaVendor = System.getProperty("java.vendor");
	    InterfaceDefinition.javaVersion = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    Class12.osNameRaw = System.getProperty("os.name");
	} catch (Exception exception) {
	    Class12.osNameRaw = "Unknown";
	}
	Class83.osName = Class12.osNameRaw.toLowerCase();
	try {
	    Class320.osArchRaw = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    Class320.osArchRaw = "";
	}
	try {
	    Class241_Sub39_Sub2.osVersionRaw
		= System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    Class241_Sub39_Sub2.osVersionRaw = "";
	}
	try {
	    Class6.homeDir = System.getProperty("user.home");
	    if (Class6.homeDir != null)
		Class6.homeDir
		    = new StringBuilder().append(Class6.homeDir).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (Class83.osName.startsWith("win")) {
		if (null == Class6.homeDir)
		    Class6.homeDir = System.getenv("USERPROFILE");
	    } else if (Class6.homeDir == null)
		Class6.homeDir = System.getenv("HOME");
	    if (null != Class6.homeDir)
		Class6.homeDir
		    = new StringBuilder().append(Class6.homeDir).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	if (null == Class6.homeDir)
	    Class6.homeDir = "~/";
	try {
	    Class105.eventQueue
		= Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	Class636.historicCacheLocations
	    = new String[] { "c:/rscache/", "/rscache/", "c:/windows/",
			     "c:/winnt/", "c:/", Class6.homeDir, "/tmp/",
			     "" };
	JSFunction.historicCacheDirectories
	    = new String[] { new StringBuilder().append(".jagex_cache_").append
				 (1547576273 * Class360.historicCacheId).toString(),
			     new StringBuilder().append(".file_store_").append
				 (1547576273 * Class360.historicCacheId)
				 .toString() };
    while_140_:
	for (int i_59_ = 0; i_59_ < 4; i_59_++) {
	    Class116.cacheDirectory
		= getCacheDirectory(string, string_55_, i_59_, 1718294613);
	    if (!Class116.cacheDirectory.exists())
		Class116.cacheDirectory.mkdirs();
	    File[] files = Class116.cacheDirectory.listFiles();
	    if (files != null) {
		File[] files_60_ = files;
		for (int i_61_ = 0; i_61_ < files_60_.length; i_61_++) {
		    File file = files_60_[i_61_];
		    if (!checkWritable(file, false, 1019025627))
			continue while_140_;
		}
	    }
	    break;
	}
	Class78.method1781(Class116.cacheDirectory, 2048075021);
	Class26.openUID(-569784084);
	cacheDat
	    = new Class414(new RS3File((Class434_Sub3_Sub3.method17068
					 ("main_file_cache.dat2", 172784233)),
					"rw", 3221225472L),
			   5200, 0);
	masterIndex
	    = new Class414(new RS3File((Class434_Sub3_Sub3.method17068
					 ("main_file_cache.idx255",
					  -131037824)),
					"rw", 1048576L),
			   6000, 0);
	Class565.cacheIndex
	    = new Class414[Class344.archiveCount * -634693739];
	for (int i_62_ = 0; i_62_ < -634693739 * Class344.archiveCount; i_62_++)
	    Class565.cacheIndex[i_62_]
		= new Class414(new RS3File((Class434_Sub3_Sub3.method17068
					     (new StringBuilder().append
						  ("main_file_cache.idx")
						  .append
						  (i_62_).toString(),
					      1834791042)),
					    "rw", 1048576L),
			       6000, 0);
	try {
	    Class288.fsimp14 = new Class426();
	} catch (Exception exception) {
	    Class442.aBool6160 = false;
	}
	Class256.mouseImp = new Class250();
	ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
	for (ThreadGroup threadgroup_63_ = threadgroup.getParent();
	     null != threadgroup_63_;
	     threadgroup_63_ = threadgroup.getParent())
	    threadgroup = threadgroup_63_;
	Thread[] threads = new Thread[1000];
	threadgroup.enumerate(threads);
	for (int i_64_ = 0; i_64_ < threads.length; i_64_++) {
	    if (null != threads[i_64_]
		&& threads[i_64_].getName().startsWith("AWT"))
		threads[i_64_].setPriority(1);
	}
	Thread thread = new Thread(this);
	thread.setDaemon(true);
	thread.start();
	thread.setPriority(1);
    }
    
    public boolean method13000(File file, byte i) {
	if (null == file)
	    return false;
	if (!file.exists())
	    return false;
	if (!file.isDirectory())
	    return false;
	if (file.listFiles().length != 0)
	    return false;
	if (!checkWritable(new File(file, "test.dat"), true, 1767778464))
	    return false;
	writeCacheLocator(file, Class116.cacheDirectory, -2038928286);
	return true;
    }
    
    File method13001(String string, String string_65_, int i) {
	String string_66_
	    = (i == 0 ? ""
	       : new StringBuilder().append("").append(i).toString());
	Class505.cacheLocator
	    = new File(Class6.homeDir,
		       new StringBuilder().append("jagex_cl_").append
			   (string).append
			   ("_").append
			   (string_65_).append
			   (string_66_).append
			   (".dat").toString());
	String string_67_ = null;
	String string_68_ = null;
	boolean bool = false;
	if (Class505.cacheLocator.exists()) {
	    try {
		RS3File class408
		    = new RS3File(Class505.cacheLocator, "rw", 10000L);
		int i_69_;
		RSByteBuffer class241_sub3;
		for (class241_sub3 = (new RSByteBuffer
				      ((int) class408.method7326(-542107572)));
		     (421967667 * class241_sub3.pointer
		      < class241_sub3.payload.length);
		     class241_sub3.pointer += i_69_ * -681042949) {
		    i_69_ = class408.method7327(class241_sub3.payload,
						(class241_sub3.pointer
						 * 421967667),
						((class241_sub3
						  .payload).length
						 - (class241_sub3.pointer
						    * 421967667)),
						(byte) 80);
		    if (i_69_ == -1)
			throw new IOException();
		}
		class241_sub3.pointer = 0;
		i_69_ = class241_sub3.readUnsignedByte((byte) 69);
		if (i_69_ < 1 || i_69_ > 3)
		    throw new IOException(new StringBuilder().append("").append
					      (i_69_).toString());
		int i_70_ = 0;
		if (i_69_ > 1)
		    i_70_ = class241_sub3.readUnsignedByte((byte) 72);
		if (i_69_ <= 2) {
		    string_67_ = class241_sub3.readJagString(433035886);
		    if (i_70_ == 1)
			string_68_ = class241_sub3.readJagString(-655698634);
		} else {
		    string_67_ = class241_sub3.method14654(1828044833);
		    if (1 == i_70_)
			string_68_ = class241_sub3.method14654(449181053);
		}
		class408.close((byte) 34);
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	    if (null != string_67_) {
		File file = new File(string_67_);
		if (!file.exists())
		    string_67_ = null;
	    }
	    if (string_67_ != null) {
		File file = new File(string_67_, "test.dat");
		if (!checkWritable(file, true, 1630409821))
		    string_67_ = null;
	    }
	}
	if (string_67_ == null && i == 0) {
	while_141_:
	    for (int i_71_ = 0; i_71_ < JSFunction.historicCacheDirectories.length;
		 i_71_++) {
		for (int i_72_ = 0; i_72_ < Class636.historicCacheLocations.length;
		     i_72_++) {
		    File file = new File(new StringBuilder().append
					     (Class636.historicCacheLocations[i_72_])
					     .append
					     (JSFunction.historicCacheDirectories[i_71_])
					     .append
					     (File.separatorChar).append
					     (string).append
					     (File.separatorChar).toString());
		    if (file.exists()
			&& checkWritable(new File(file, "test.dat"), true,
				       1395368716)) {
			string_67_ = file.toString();
			bool = true;
			break while_141_;
		    }
		}
	    }
	}
	if (string_67_ == null) {
	    string_67_ = new StringBuilder().append(Class6.homeDir).append
			     (File.separatorChar).append
			     ("jagexcache").append
			     (string_66_).append
			     (File.separatorChar).append
			     (string).append
			     (File.separatorChar).append
			     (string_65_).append
			     (File.separatorChar).toString();
	    bool = true;
	}
	if (string_68_ != null) {
	    File file = new File(string_68_);
	    File file_73_ = new File(string_67_);
	    try {
		File[] files = file.listFiles();
		File[] files_74_ = files;
		for (int i_75_ = 0; i_75_ < files_74_.length; i_75_++) {
		    File file_76_ = files_74_[i_75_];
		    File file_77_ = new File(file_73_, file_76_.getName());
		    boolean bool_78_ = file_76_.renameTo(file_77_);
		    if (!bool_78_)
			throw new IOException();
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
	    }
	    bool = true;
	}
	if (bool)
	    writeCacheLocator(new File(string_67_), null, -2038928286);
	return new File(string_67_);
    }
    
    File method13002(String string, String string_79_, int i) {
	String string_80_
	    = (i == 0 ? ""
	       : new StringBuilder().append("").append(i).toString());
	Class505.cacheLocator
	    = new File(Class6.homeDir,
		       new StringBuilder().append("jagex_cl_").append
			   (string).append
			   ("_").append
			   (string_79_).append
			   (string_80_).append
			   (".dat").toString());
	String string_81_ = null;
	String string_82_ = null;
	boolean bool = false;
	if (Class505.cacheLocator.exists()) {
	    try {
		RS3File class408
		    = new RS3File(Class505.cacheLocator, "rw", 10000L);
		int i_83_;
		RSByteBuffer class241_sub3;
		for (class241_sub3 = (new RSByteBuffer
				      ((int) class408.method7326(-542107572)));
		     (421967667 * class241_sub3.pointer
		      < class241_sub3.payload.length);
		     class241_sub3.pointer += i_83_ * -681042949) {
		    i_83_ = class408.method7327(class241_sub3.payload,
						(class241_sub3.pointer
						 * 421967667),
						((class241_sub3
						  .payload).length
						 - (class241_sub3.pointer
						    * 421967667)),
						(byte) 21);
		    if (i_83_ == -1)
			throw new IOException();
		}
		class241_sub3.pointer = 0;
		i_83_ = class241_sub3.readUnsignedByte((byte) -88);
		if (i_83_ < 1 || i_83_ > 3)
		    throw new IOException(new StringBuilder().append("").append
					      (i_83_).toString());
		int i_84_ = 0;
		if (i_83_ > 1)
		    i_84_ = class241_sub3.readUnsignedByte((byte) -52);
		if (i_83_ <= 2) {
		    string_81_ = class241_sub3.readJagString(1435131586);
		    if (i_84_ == 1)
			string_82_ = class241_sub3.readJagString(-1900313237);
		} else {
		    string_81_ = class241_sub3.method14654(881272690);
		    if (1 == i_84_)
			string_82_ = class241_sub3.method14654(1959143586);
		}
		class408.close((byte) 115);
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	    if (null != string_81_) {
		File file = new File(string_81_);
		if (!file.exists())
		    string_81_ = null;
	    }
	    if (string_81_ != null) {
		File file = new File(string_81_, "test.dat");
		if (!checkWritable(file, true, 1766879257))
		    string_81_ = null;
	    }
	}
	if (string_81_ == null && i == 0) {
	while_142_:
	    for (int i_85_ = 0; i_85_ < JSFunction.historicCacheDirectories.length;
		 i_85_++) {
		for (int i_86_ = 0; i_86_ < Class636.historicCacheLocations.length;
		     i_86_++) {
		    File file = new File(new StringBuilder().append
					     (Class636.historicCacheLocations[i_86_])
					     .append
					     (JSFunction.historicCacheDirectories[i_85_])
					     .append
					     (File.separatorChar).append
					     (string).append
					     (File.separatorChar).toString());
		    if (file.exists()
			&& checkWritable(new File(file, "test.dat"), true,
				       959462243)) {
			string_81_ = file.toString();
			bool = true;
			break while_142_;
		    }
		}
	    }
	}
	if (string_81_ == null) {
	    string_81_ = new StringBuilder().append(Class6.homeDir).append
			     (File.separatorChar).append
			     ("jagexcache").append
			     (string_80_).append
			     (File.separatorChar).append
			     (string).append
			     (File.separatorChar).append
			     (string_79_).append
			     (File.separatorChar).toString();
	    bool = true;
	}
	if (string_82_ != null) {
	    File file = new File(string_82_);
	    File file_87_ = new File(string_81_);
	    try {
		File[] files = file.listFiles();
		File[] files_88_ = files;
		for (int i_89_ = 0; i_89_ < files_88_.length; i_89_++) {
		    File file_90_ = files_88_[i_89_];
		    File file_91_ = new File(file_87_, file_90_.getName());
		    boolean bool_92_ = file_90_.renameTo(file_91_);
		    if (!bool_92_)
			throw new IOException();
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
	    }
	    bool = true;
	}
	if (bool)
	    writeCacheLocator(new File(string_81_), null, -2038928286);
	return new File(string_81_);
    }
    
    public boolean method13003(File file) {
	if (null == file)
	    return false;
	if (!file.exists())
	    return false;
	if (!file.isDirectory())
	    return false;
	if (file.listFiles().length != 0)
	    return false;
	if (!checkWritable(new File(file, "test.dat"), true, 1967176790))
	    return false;
	writeCacheLocator(file, Class116.cacheDirectory, -2038928286);
	return true;
    }
    
    public void method128() {
	if (!shutdown)
	    killtime = 0L;
    }
    
    public static final void method13004() {
	Class357.anImage5467 = null;
	ClanChannelDelta.aFont5696 = null;
    }
    
    boolean method13005(File file, boolean bool) {
	boolean bool_93_;
	try {
	    RandomAccessFile randomaccessfile
		= new RandomAccessFile(file, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    if (bool)
		file.delete();
	    bool_93_ = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool_93_;
    }
    
    boolean method13006(File file, boolean bool) {
	boolean bool_94_;
	try {
	    RandomAccessFile randomaccessfile
		= new RandomAccessFile(file, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    if (bool)
		file.delete();
	    bool_94_ = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool_94_;
    }
    
    public final void method13007(WindowEvent windowevent) {
	/* empty */
    }
    
    public static File method13008() {
	return Class116.cacheDirectory;
    }
    
    public static RS3File method13009(String string, String string_95_,
				       boolean bool) {
	File file = new File(Class116.cacheDirectory,
			     new StringBuilder().append("preferences").append
				 (string).append
				 (".dat").toString());
	do {
	    if (file.exists()) {
		RS3File class408;
		try {
		    RS3File class408_96_ = new RS3File(file, "rw", 10000L);
		    class408 = class408_96_;
		} catch (IOException ioexception) {
		    break;
		}
		return class408;
	    }
	} while (false);
	String string_97_ = "";
	if (Class360.historicCacheId * 1547576273 == 33)
	    string_97_ = "_rc";
	else if (34 == Class360.historicCacheId * 1547576273)
	    string_97_ = "_wip";
	File file_98_ = new File(Class6.homeDir,
				 new StringBuilder().append("jagex_").append
				     (string_95_).append
				     ("_preferences").append
				     (string).append
				     (string_97_).append
				     (".dat").toString());
	do {
	    if (!bool && file_98_.exists()) {
		RS3File class408;
		try {
		    RS3File class408_99_
			= new RS3File(file_98_, "rw", 10000L);
		    class408 = class408_99_;
		} catch (IOException ioexception) {
		    break;
		}
		return class408;
	    }
	} while (false);
	RS3File class408;
	try {
	    RS3File class408_100_ = new RS3File(file, "rw", 10000L);
	    class408 = class408_100_;
	} catch (IOException ioexception) {
	    throw new RuntimeException();
	}
	return class408;
    }
    
    static void method13010() {
	try {
	    File file = new File(Class6.homeDir, "random.dat");
	    if (file.exists())
		uidDat
		    = new Class414(new RS3File(file, "rw", 25L), 24, 0);
	    else {
	    while_143_:
		for (int i = 0; i < JSFunction.historicCacheDirectories.length; i++) {
		    for (int i_101_ = 0;
			 i_101_ < Class636.historicCacheLocations.length; i_101_++) {
			File file_102_
			    = new File(new StringBuilder().append
					   (Class636.historicCacheLocations[i_101_])
					   .append
					   (JSFunction.historicCacheDirectories[i])
					   .append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_102_.exists()) {
			    uidDat
				= new Class414(new RS3File(file_102_, "rw",
							    25L),
					       24, 0);
			    break while_143_;
			}
		    }
		}
	    }
	    if (uidDat == null) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		uidDat
		    = new Class414(new RS3File(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
    
    public static void method13011(RSByteBuffer class241_sub3) {
	byte[] is = new byte[24];
	try {
	    uidDat.method7463(0L);
	    uidDat.method7460(is, (short) 9244);
	    int i;
	    for (i = 0; i < 24 && is[i] == 0; i++) {
		/* empty */
	    }
	    if (i >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i = 0; i < 24; i++)
		is[i] = (byte) -1;
	}
	class241_sub3.writeBytes(is, 0, 24, 752061035);
    }
    
    public abstract void init();
    
    abstract void mainquit/*method13012*/(int i);
    
    static void method13013(Object object) {
	if (null != Class105.eventQueue) {
	    for (int i = 0;
		 i < 50 && Class105.eventQueue.peekEvent() != null; i++)
		Class380_Sub2.method16722(1L);
	    try {
		if (object != null)
		    Class105.eventQueue
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static void method13014(RSByteBuffer class241_sub3, int i) {
	if (null != uidDat) {
	    try {
		uidDat.method7463(0L);
		uidDat.method7467(class241_sub3.payload, i, 24,
					  (short) 5918);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    String method13015() {
	return null;
    }
    
    public static final void method13016() {
	Class124.aClass593_1580.method12928((byte) 1);
	for (int i = 0; i < 32; i++)
	    aLongArray7637[i] = 0L;
	for (int i = 0; i < 32; i++)
	    aLongArray7667[i] = 0L;
	anInt7649 = 0;
    }
    
    synchronized void method13017(String string) {
	Class241_Sub40_Sub1.frame = new Frame();
	Class241_Sub40_Sub1.frame.setTitle(string);
	Class241_Sub40_Sub1.frame.setResizable(true);
	Class241_Sub40_Sub1.frame.addWindowListener(this);
	Class241_Sub40_Sub1.frame.setBackground(Color.black);
	Class241_Sub40_Sub1.frame.setVisible(true);
	Class241_Sub40_Sub1.frame.toFront();
	Insets insets = Class241_Sub40_Sub1.frame.getInsets();
	Class241_Sub40_Sub1.frame.setSize
	    (insets.right + (884255947 * Class294.frameWid + insets.left),
	     insets.bottom + (insets.top + -828675613 * Class43.frameHei));
    }
    
    synchronized void method13018(String string) {
	Class241_Sub40_Sub1.frame = new Frame();
	Class241_Sub40_Sub1.frame.setTitle(string);
	Class241_Sub40_Sub1.frame.setResizable(true);
	Class241_Sub40_Sub1.frame.addWindowListener(this);
	Class241_Sub40_Sub1.frame.setBackground(Color.black);
	Class241_Sub40_Sub1.frame.setVisible(true);
	Class241_Sub40_Sub1.frame.toFront();
	Insets insets = Class241_Sub40_Sub1.frame.getInsets();
	Class241_Sub40_Sub1.frame.setSize
	    (insets.right + (884255947 * Class294.frameWid + insets.left),
	     insets.bottom + (insets.top + -828675613 * Class43.frameHei));
    }
    
    synchronized void method13019() {
	removeCanvas(1140973985);
	Container container = Class109.getTopContainer((byte) 79);
	Class344.canvas = new Canvas_Sub1(container);
	addCanvas(container, 1220920104);
    }
    
    synchronized void method13020() {
	removeCanvas(1823755970);
	Container container = Class109.getTopContainer((byte) -7);
	Class344.canvas = new Canvas_Sub1(container);
	addCanvas(container, -1593114769);
    }
    
    public static Container method13021() {
	if (null != Class228.aFrame2674)
	    return Class228.aFrame2674;
	if (null != Class241_Sub40_Sub1.frame)
	    return Class241_Sub40_Sub1.frame;
	return Class421.gameApplet;
    }
    
    public static Container method13022() {
	if (null != Class228.aFrame2674)
	    return Class228.aFrame2674;
	if (null != Class241_Sub40_Sub1.frame)
	    return Class241_Sub40_Sub1.frame;
	return Class421.gameApplet;
    }
    
    void method13023(Container container) {
	container.setBackground(Color.black);
	container.setLayout(null);
	container.add(Class344.canvas);
	Class344.canvas.setSize(-1080559003 * Class494.canvasWid,
				     963058943 * Class67.canvasHei);
	Class344.canvas.setVisible(true);
	if (container == Class241_Sub40_Sub1.frame) {
	    Insets insets = Class241_Sub40_Sub1.frame.getInsets();
	    Class344.canvas.setLocation((insets.left
					      + leftMargin * -2063759389),
					     (insets.top
					      + 303720107 * topMargin));
	} else
	    Class344.canvas.setLocation(leftMargin * -2063759389,
					     303720107 * topMargin);
	Class344.canvas.addFocusListener(this);
	Class344.canvas.requestFocus();
	Class47.isWindowFocused = true;
	focus_in = true;
	Class344.canvas.setFocusTraversalKeysEnabled(false);
	fullredraw = true;
	canvasReplaceRecommended = false;
	lastCanvasReplace = Class50.method1249((byte) 1) * 7388777628882923173L;
    }
    
    void method13024() {
	if (Class344.canvas != null) {
	    Class344.canvas.removeFocusListener(this);
	    Class344.canvas.getParent().setBackground(Color.black);
	    Class344.canvas.getParent().remove(Class344.canvas);
	}
    }
    
    synchronized void addcanvas/*method13025*/(byte i) {
		removeCanvas(1645689783);
		Container container = Class109.getTopContainer((byte) 19);
		Class344.canvas = new Canvas_Sub1(container);
		addCanvas(container, 1238132293);
    }
    
    final boolean method13026() {
	String string
	    = Class421.gameApplet.getDocumentBase().getHost().toLowerCase();
	if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
	    return true;
	if (string.equals("runescape.com")
	    || string.endsWith(".runescape.com"))
	    return true;
	if (string.equals("stellardawn.com")
	    || string.endsWith(".stellardawn.com"))
	    return true;
	if (string.endsWith("127.0.0.1"))
	    return true;
	for (/**/;
	     (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
	      && string.charAt(string.length() - 1) <= '9');
	     string = string.substring(0, string.length() - 1)) {
	    /* empty */
	}
	if (string.endsWith("192.168.1."))
	    return true;
	error("invalidhost", -1036427146);
	return false;
    }
    
    void run_inner/*method13027*/(int i) {
		if (null != Class222.javaVendor) {
			String string = Class222.javaVendor.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_103_ = InterfaceDefinition.javaVersion;
				if (string_103_.equals("1.1") || string_103_.startsWith("1.1.")
					|| string_103_.equals("1.2")
					|| string_103_.startsWith("1.2.")
					|| string_103_.equals("1.3")
					|| string_103_.startsWith("1.3.")
					|| string_103_.equals("1.4")
					|| string_103_.startsWith("1.4.")
					|| string_103_.equals("1.5")
					|| string_103_.startsWith("1.5.")
					|| string_103_.equals("1.6.0")) {
					error("wrongjava", -969251560);
					return;
				}
				if (string_103_.startsWith("1.6.0_")) {
					int i_104_;
					for (i_104_ = 6; (i_104_ < string_103_.length()
					  && GPI.method4019(string_103_.charAt(i_104_), (byte) -28)); i_104_++) {
						/* empty */
					}
					String string_105_ = string_103_.substring(6, i_104_);
					if (Class551.method12096(string_105_, -1506303071)
						&& Class324.method5975(string_105_, -952789660) < 10) {
						error("wrongjava", -986873092);
						return;
					}
				}
			}
		}
		Class109.getTopContainer((byte) -115).setFocusCycleRoot(true);
		maxmemory = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1442608195);
		cpucount = Runtime.getRuntime().availableProcessors() * -960557393;
		addcanvas((byte) -97);
		maininit(1809313462);
		Class124.aClass593_1580 = Class4.method472((byte) 4);
		while (0L == killtime * -6417453013694242321L
			   || (Class50.method1249((byte) 1) < -6417453013694242321L * killtime)) {
			anInt7649 = (Class124.aClass593_1580
					 .method12931(aLong7633 * 6418136547495746967L) * -326425679);
			for (int i_106_ = 0; i_106_ < anInt7649 * 2060141905; i_106_++) {
				method13045((byte) -36);
			}
			method12962((short) 21779);
			Class9.method569(Class344.canvas, -403233893);
		}
    }
    
    static void method13028(Object object) {
	if (null != Class105.eventQueue) {
	    for (int i = 0;
		 i < 50 && Class105.eventQueue.peekEvent() != null; i++)
			Class380_Sub2.method16722(1L);
	    try {
			if (object != null)
				Class105.eventQueue.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static void method13029(Object object) {
	if (null != Class105.eventQueue) {
	    for (int i = 0;
		 i < 50 && Class105.eventQueue.peekEvent() != null; i++)
		Class380_Sub2.method16722(1L);
	    try {
		if (object != null)
		    Class105.eventQueue
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public static final int method13030() {
	return (int) (1000000000L / (aLong7633 * 6418136547495746967L));
    }
    
    public final void method13031(FocusEvent focusevent) {
	focus_in = true;
	fullredraw = true;
    }
    
    void method13032() {
	long l = Class50.method1249((byte) 1);
	long l_107_ = aLongArray7667[-973561871 * anInt7638];
	aLongArray7667[anInt7638 * -973561871] = l;
	anInt7638 = (anInt7638 * -973561871 + 1 & 0x1f) * 2116317457;
	if (l_107_ != 0L && l <= l_107_) {
	    /* empty */
	}
	synchronized (this) {
	    Class47.isWindowFocused = focus_in;
	}
	method12971(-406009429);
    }
    
    void method13033() {
	long l = Class50.method1249((byte) 1);
	long l_108_
	    = aLongArray7637[Class534.anInt6968 * -445111789 - 1 & 0x1f];
	long l_109_ = aLongArray7637[Class534.anInt6968 * -445111789];
	aLongArray7637[-445111789 * Class534.anInt6968] = l;
	Class534.anInt6968
	    = -1046022117 * (1 + -445111789 * Class534.anInt6968 & 0x1f);
	if (l_109_ != 0L && l > l_109_) {
	    int i = (int) (l - l_109_);
	    anInt7635 = (int) (l - l_108_) * -1510181699;
	    currentFpsRate = (32000 + (i >> 1)) / i * -734611609;
	}
	if ((anInt7657 += -1832064483) * 449521717 - 1 > 50) {
	    anInt7657 -= -1408910934;
	    fullredraw = true;
	    Class344.canvas.setSize(Class494.canvasWid * -1080559003,
					 963058943 * Class67.canvasHei);
	    Class344.canvas.setVisible(true);
	    if (Class241_Sub40_Sub1.frame != null
		&& Class228.aFrame2674 == null) {
		Insets insets = Class241_Sub40_Sub1.frame.getInsets();
		Class344.canvas.setLocation((leftMargin * -2063759389
						  + insets.left),
						 (topMargin * 303720107
						  + insets.top));
	    } else
		Class344.canvas.setLocation(leftMargin * -2063759389,
						 303720107 * topMargin);
	}
	method12963((byte) 82);
    }
    
    public static void method13034(RSByteBuffer class241_sub3) {
	byte[] is = new byte[24];
	try {
	    uidDat.method7463(0L);
	    uidDat.method7460(is, (short) 10234);
	    int i;
	    for (i = 0; i < 24 && is[i] == 0; i++) {
		/* empty */
	    }
	    if (i >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i = 0; i < 24; i++)
		is[i] = (byte) -1;
	}
	class241_sub3.writeBytes(is, 0, 24, 752061035);
    }
    
    final void method13035(boolean bool) {
	synchronized (this) {
	    if (shutdown)
		return;
	    shutdown = true;
	}
	try {
	    mainquit(-110625001);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    cacheDat.method7461(-1821100740);
	    for (int i = 0; i < Class344.archiveCount * -634693739; i++)
		Class565.cacheIndex[i].method7461(-2077577191);
	    masterIndex.method7461(-1801192953);
	    uidDat.method7461(687084976);
	} catch (Exception exception) {
	    /* empty */
	}
	if (aBool7643) {
	    try {
		QueryPerformanceCounter.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	if (Class14.method695(-1977419039))
	    Class256.method5053((byte) -28).method107(-16777216);
	if (Class344.canvas != null) {
	    try {
		Class344.canvas.removeFocusListener(this);
		Class344.canvas.getParent().remove(Class344.canvas);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if (Class241_Sub40_Sub1.frame != null) {
	    Class241_Sub40_Sub1.frame.setVisible(false);
	    Class241_Sub40_Sub1.frame.dispose();
	    Class241_Sub40_Sub1.frame = null;
	}
    }
    
    abstract void method13036();
    
    public static final int method13037() {
	return (int) (1000000000L / (aLong7633 * 6418136547495746967L));
    }
    
    public final void method13038(WindowEvent windowevent) {
	/* empty */
    }
    
    static long method13039() {
	return Class124.aClass593_1580.method12934(-1711829398);
    }
    
    public final void method125(Graphics graphics) {
	paint(graphics);
    }
    
    static long method13040() {
	return Class124.aClass593_1580.method12934(-1818257113);
    }
    
    public static void method13041(RSByteBuffer class241_sub3) {
	byte[] is = new byte[24];
	try {
	    uidDat.method7463(0L);
	    uidDat.method7460(is, (short) 8581);
	    int i;
	    for (i = 0; i < 24 && is[i] == 0; i++) {
		/* empty */
	    }
	    if (i >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i = 0; i < 24; i++)
		is[i] = (byte) -1;
	}
	class241_sub3.writeBytes(is, 0, 24, 752061035);
    }
    
    static long method13042() {
	return Class124.aClass593_1580.method12934(-1686207546);
    }
    
    public void method130() {
	if (!shutdown)
	    killtime = 0L;
    }
    
    public final void method13043(WindowEvent windowevent) {
	aBool7632 = true;
	destroy();
    }
    
    public void method129() {
	if (!shutdown)
	    killtime = 0L;
    }
    
    public void method134() {
	if (!shutdown)
	    killtime = ((Class50.method1249((byte) 1) + 4000L)
			 * 7081869956920028431L);
    }
    
    public void method124() {
	if (!shutdown) {
	    killtime = Class50.method1249((byte) 1) * 7081869956920028431L;
	    Class380_Sub2.method16722(5000L);
	    shutdown(false, (byte) 97);
	}
    }
    
    public void method132() {
	if (!shutdown) {
	    killtime = Class50.method1249((byte) 1) * 7081869956920028431L;
	    Class380_Sub2.method16722(5000L);
	    shutdown(false, (byte) -4);
	}
    }
    
    public final void windowClosing(WindowEvent windowevent) {
	aBool7632 = true;
	destroy();
    }
    
    boolean method13044(File file, boolean bool) {
	boolean bool_110_;
	try {
	    RandomAccessFile randomaccessfile
		= new RandomAccessFile(file, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    if (bool)
		file.delete();
	    bool_110_ = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool_110_;
    }
    
    void method13045(byte i) {
		long l = Class50.method1249((byte) 1);
		long l_111_ = aLongArray7667[-973561871 * anInt7638];
		aLongArray7667[anInt7638 * -973561871] = l;
		anInt7638 = (anInt7638 * -973561871 + 1 & 0x1f) * 2116317457;
		if (l_111_ != 0L && l <= l_111_) {
			/* empty */
		}
		synchronized (this) {
			Class47.isWindowFocused = focus_in;
		}
		method12971(362561078);
    }
    
    public final void method13046(FocusEvent focusevent) {
	focus_in = true;
	fullredraw = true;
    }
    
    public final void focusGained(FocusEvent focusevent) {
		focus_in = true;
		fullredraw = true;
    }
    
    public final void method13047(FocusEvent focusevent) {
	focus_in = true;
	fullredraw = true;
    }
    
    public final void method13048(FocusEvent focusevent) {
	focus_in = true;
	fullredraw = true;
    }
    
    public final void method13049(FocusEvent focusevent) {
	focus_in = false;
    }
    
    public final void method13050(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void method13051(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void method13052(WindowEvent windowevent) {
	/* empty */
    }
    
    void method13053(String string, String string_112_) {
	if (!alreadyerrored) {
	    alreadyerrored = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class396.callNoParamater(Class421.gameApplet, "loggedout",
				    (byte) -100);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class421.gameApplet.getAppletContext().showDocument
		    (new URL(Class421.gameApplet.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws?").append
				 (string_112_).toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public void method13054() {
	do {
	    try {
		try {
		    run_inner(912764905);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    VarType.method3770(method12985((byte) -96), throwable,
					297945514);
		    error("crash", -1124748353);
		    shutdown(true, (byte) -58);
		    break;
		}
		shutdown(true, (byte) 46);
	    } catch (Throwable object) {
		shutdown(true, (byte) 12);
		throw object;
	    }
	} while (false);
    }
    
    public final void update(Graphics graphics) {
		paint(graphics);
    }
    
    public final void method13055(WindowEvent windowevent) {
		/* empty */
    }
    
    public final void method13056(WindowEvent windowevent) {
		/* empty */
    }
    
    File getCacheDirectory/*method13057*/(String string, String string_113_, int i, int i_114_) {
		String string_115_ = (i == 0 ? "" : new StringBuilder().append("").append(i).toString());
		Class505.cacheLocator = new File(Class6.homeDir,
				   new StringBuilder().append(".rsps803_cl_").append
				   (string).append
				   ("_").append(string_113_).append(string_115_).append(".dat").toString());
		String string_116_ = null;
		String string_117_ = null;
		boolean bool = false;
		if (Class505.cacheLocator.exists()) {
			try {
				RS3File class408 = new RS3File(Class505.cacheLocator, "rw", 10000L);
				int i_118_;
				RSByteBuffer buffer;
				for (buffer = (new RSByteBuffer
							  ((int) class408.method7326(-542107572)));
					 (421967667 * buffer.pointer
					  < buffer.payload.length);
					 buffer.pointer += i_118_ * -681042949) {
					i_118_ = class408.method7327(buffer.payload,
								 (buffer.pointer
								  * 421967667),
								 ((buffer
								   .payload).length
								  - (buffer.pointer
									 * 421967667)),
								 (byte) 111);
					if (i_118_ == -1)
					throw new IOException();
				}
				buffer.pointer = 0;
				i_118_ = buffer.readUnsignedByte((byte) 65);
				if (i_118_ < 1 || i_118_ > 3)
					throw new IOException(new StringBuilder().append("").append
								  (i_118_).toString());
				int i_119_ = 0;
				if (i_118_ > 1)
					i_119_ = buffer.readUnsignedByte((byte) -25);
				if (i_118_ <= 2) {
					string_116_ = buffer.readJagString(-139720444);
					if (i_119_ == 1)
					string_117_ = buffer.readJagString(-471004035);
				} else {
					string_116_ = buffer.method14654(974514119);
					if (1 == i_119_) {
						string_117_ = buffer.method14654(1260624491);
					}
				}
				class408.close((byte) 74);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (null != string_116_) {
				File file = new File(string_116_);
				if (!file.exists()) {
					string_116_ = null;
				}
			}
			if (string_116_ != null) {
				File file = new File(string_116_, "test.dat");
				if (!checkWritable(file, true, 1232670221)) {
					string_116_ = null;
				}
			}
		}
		if (string_116_ == null && i == 0) {
		while_144_:
			for (int i_120_ = 0; i_120_ < JSFunction.historicCacheDirectories.length; i_120_++) {
				for (int i_121_ = 0; i_121_ < Class636.historicCacheLocations.length; i_121_++) {
					File file = new File(new StringBuilder().append
							   (Class636.historicCacheLocations[i_121_])
							   .append
							   (JSFunction.historicCacheDirectories[i_120_])
							   .append
							   (File.separatorChar).append
							   (string).append
							   (File.separatorChar).toString());
					if (file.exists() && checkWritable(new File(file, "test.dat"), true, 1788203216)) {
						string_116_ = file.toString();
						bool = true;
						break while_144_;
					}
				}
			}
		}
		if (string_116_ == null) {
			string_116_ = new StringBuilder().append(Class6.homeDir).append
					  (File.separatorChar).append
					  (".rsps803cache").append
					  (string_115_).append
					  (File.separatorChar).append
					  (string).append
					  (File.separatorChar).append
					  (string_113_).append
					  (File.separatorChar).toString();
			bool = true;
		}
		if (string_117_ != null) {
			File file = new File(string_117_);
			File file_122_ = new File(string_116_);
			try {
				File[] files = file.listFiles();
				File[] files_123_ = files;
				for (int i_124_ = 0; i_124_ < files_123_.length; i_124_++) {
					File file_125_ = files_123_[i_124_];
					File file_126_ = new File(file_122_, file_125_.getName());
					boolean bool_127_ = file_125_.renameTo(file_126_);
					if (!bool_127_)
					throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool) {
			writeCacheLocator(new File(string_116_), null, -2038928286);
		}
		return new File(string_116_);
    }
    
    public final void method13058(WindowEvent windowevent) {
	/* empty */
    }
    
    public abstract void method131();
    
    public abstract void method135();
    
    public static final void method13059(int i, String string, Color color,
					 Color color_128_, Color color_129_) {
	try {
	    Graphics graphics = Class344.canvas.getGraphics();
	    if (ClanChannelDelta.aFont5696 == null)
		ClanChannelDelta.aFont5696 = new Font("Helvetica", 1, 13);
	    if (color == null)
		color = new Color(140, 17, 17);
	    if (null == color_128_)
		color_128_ = new Color(140, 17, 17);
	    if (null == color_129_)
		color_129_ = new Color(255, 255, 255);
	    try {
		if (Class357.anImage5467 == null)
		    Class357.anImage5467
			= Class344.canvas.createImage((-1080559003
							    * (Class494
							       .canvasWid)),
							   (Class67.canvasHei
							    * 963058943));
		Graphics graphics_130_ = Class357.anImage5467.getGraphics();
		graphics_130_.setColor(Color.black);
		graphics_130_.fillRect(0, 0, -1080559003 * Class494.canvasWid,
				       Class67.canvasHei * 963058943);
		int i_131_ = Class494.canvasWid * -1080559003 / 2 - 152;
		int i_132_ = Class67.canvasHei * 963058943 / 2 - 18;
		graphics_130_.setColor(color_128_);
		graphics_130_.drawRect(i_131_, i_132_, 303, 33);
		graphics_130_.setColor(color);
		graphics_130_.fillRect(i_131_ + 2, 2 + i_132_, 3 * i, 30);
		graphics_130_.setColor(Color.black);
		graphics_130_.drawRect(1 + i_131_, 1 + i_132_, 301, 31);
		graphics_130_.fillRect(3 * i + (i_131_ + 2), 2 + i_132_,
				       300 - 3 * i, 30);
		graphics_130_.setFont(ClanChannelDelta.aFont5696);
		graphics_130_.setColor(color_129_);
		graphics_130_.drawString(string,
					 (i_131_
					  + (304 - string.length() * 6) / 2),
					 i_132_ + 22);
		if (null != aString7642) {
		    graphics_130_.setFont(ClanChannelDelta.aFont5696);
		    graphics_130_.setColor(color_129_);
		    graphics_130_.drawString(aString7642,
					     ((Class494.canvasWid * -1080559003
					       / 2)
					      - aString7642.length() * 6 / 2),
					     (963058943 * Class67.canvasHei / 2
					      - 26));
		}
		graphics.drawImage(Class357.anImage5467, 0, 0, null);
	    } catch (Exception exception) {
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, Class494.canvasWid * -1080559003,
				  963058943 * Class67.canvasHei);
		int i_133_ = Class494.canvasWid * -1080559003 / 2 - 152;
		int i_134_ = Class67.canvasHei * 963058943 / 2 - 18;
		graphics.setColor(color_128_);
		graphics.drawRect(i_133_, i_134_, 303, 33);
		graphics.setColor(color);
		graphics.fillRect(i_133_ + 2, 2 + i_134_, i * 3, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(i_133_ + 1, 1 + i_134_, 301, 31);
		graphics.fillRect(i_133_ + 2 + i * 3, i_134_ + 2, 300 - 3 * i,
				  30);
		graphics.setFont(ClanChannelDelta.aFont5696);
		graphics.setColor(color_129_);
		if (null != aString7642) {
		    graphics.setFont(ClanChannelDelta.aFont5696);
		    graphics.setColor(color_129_);
		    graphics.drawString(aString7642,
					(-1080559003 * Class494.canvasWid / 2
					 - aString7642.length() * 6 / 2),
					(963058943 * Class67.canvasHei / 2
					 - 26));
		}
		graphics.drawString(string,
				    i_133_ + (304 - string.length() * 6) / 2,
				    i_134_ + 22);
	    }
	} catch (Exception exception) {
	    Class344.canvas.repaint();
	}
    }
    
    public static final void method13060(int i, String string, Color color,
					 Color color_135_, Color color_136_) {
	try {
	    Graphics graphics = Class344.canvas.getGraphics();
	    if (ClanChannelDelta.aFont5696 == null)
		ClanChannelDelta.aFont5696 = new Font("Helvetica", 1, 13);
	    if (color == null)
		color = new Color(140, 17, 17);
	    if (null == color_135_)
		color_135_ = new Color(140, 17, 17);
	    if (null == color_136_)
		color_136_ = new Color(255, 255, 255);
	    try {
		if (Class357.anImage5467 == null)
		    Class357.anImage5467
			= Class344.canvas.createImage((-1080559003
							    * (Class494
							       .canvasWid)),
							   (Class67.canvasHei
							    * 963058943));
		Graphics graphics_137_ = Class357.anImage5467.getGraphics();
		graphics_137_.setColor(Color.black);
		graphics_137_.fillRect(0, 0, -1080559003 * Class494.canvasWid,
				       Class67.canvasHei * 963058943);
		int i_138_ = Class494.canvasWid * -1080559003 / 2 - 152;
		int i_139_ = Class67.canvasHei * 963058943 / 2 - 18;
		graphics_137_.setColor(color_135_);
		graphics_137_.drawRect(i_138_, i_139_, 303, 33);
		graphics_137_.setColor(color);
		graphics_137_.fillRect(i_138_ + 2, 2 + i_139_, 3 * i, 30);
		graphics_137_.setColor(Color.black);
		graphics_137_.drawRect(1 + i_138_, 1 + i_139_, 301, 31);
		graphics_137_.fillRect(3 * i + (i_138_ + 2), 2 + i_139_,
				       300 - 3 * i, 30);
		graphics_137_.setFont(ClanChannelDelta.aFont5696);
		graphics_137_.setColor(color_136_);
		graphics_137_.drawString(string,
					 (i_138_
					  + (304 - string.length() * 6) / 2),
					 i_139_ + 22);
		if (null != aString7642) {
		    graphics_137_.setFont(ClanChannelDelta.aFont5696);
		    graphics_137_.setColor(color_136_);
		    graphics_137_.drawString(aString7642,
					     ((Class494.canvasWid * -1080559003
					       / 2)
					      - aString7642.length() * 6 / 2),
					     (963058943 * Class67.canvasHei / 2
					      - 26));
		}
		graphics.drawImage(Class357.anImage5467, 0, 0, null);
	    } catch (Exception exception) {
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, Class494.canvasWid * -1080559003,
				  963058943 * Class67.canvasHei);
		int i_140_ = Class494.canvasWid * -1080559003 / 2 - 152;
		int i_141_ = Class67.canvasHei * 963058943 / 2 - 18;
		graphics.setColor(color_135_);
		graphics.drawRect(i_140_, i_141_, 303, 33);
		graphics.setColor(color);
		graphics.fillRect(i_140_ + 2, 2 + i_141_, i * 3, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(i_140_ + 1, 1 + i_141_, 301, 31);
		graphics.fillRect(i_140_ + 2 + i * 3, i_141_ + 2, 300 - 3 * i,
				  30);
		graphics.setFont(ClanChannelDelta.aFont5696);
		graphics.setColor(color_136_);
		if (null != aString7642) {
		    graphics.setFont(ClanChannelDelta.aFont5696);
		    graphics.setColor(color_136_);
		    graphics.drawString(aString7642,
					(-1080559003 * Class494.canvasWid / 2
					 - aString7642.length() * 6 / 2),
					(963058943 * Class67.canvasHei / 2
					 - 26));
		}
		graphics.drawString(string,
				    i_140_ + (304 - string.length() * 6) / 2,
				    i_141_ + 22);
	    }
	} catch (Exception exception) {
	    Class344.canvas.repaint();
	}
    }
    
    public static final void method13061() {
	Class357.anImage5467 = null;
	ClanChannelDelta.aFont5696 = null;
    }
    
    public static final void method13062() {
	Class357.anImage5467 = null;
	ClanChannelDelta.aFont5696 = null;
    }
    
    public static final void method13063() {
	Class357.anImage5467 = null;
	ClanChannelDelta.aFont5696 = null;
    }
    
    void method13064() {
	if (null != Class222.javaVendor) {
	    String string = Class222.javaVendor.toLowerCase();
	    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
		String string_142_ = InterfaceDefinition.javaVersion;
		if (string_142_.equals("1.1") || string_142_.startsWith("1.1.")
		    || string_142_.equals("1.2")
		    || string_142_.startsWith("1.2.")
		    || string_142_.equals("1.3")
		    || string_142_.startsWith("1.3.")
		    || string_142_.equals("1.4")
		    || string_142_.startsWith("1.4.")
		    || string_142_.equals("1.5")
		    || string_142_.startsWith("1.5.")
		    || string_142_.equals("1.6.0")) {
		    error("wrongjava", -2013191210);
		    return;
		}
		if (string_142_.startsWith("1.6.0_")) {
		    int i;
		    for (i = 6; (i < string_142_.length()
				 && GPI.method4019(string_142_.charAt(i),
							(byte) -52)); i++) {
			/* empty */
		    }
		    String string_143_ = string_142_.substring(6, i);
		    if (Class551.method12096(string_143_, 1424962958)
			&& Class324.method5975(string_143_, -952789660) < 10) {
			error("wrongjava", -841362915);
			return;
		    }
		}
	    }
	}
	Class109.getTopContainer((byte) 53).setFocusCycleRoot(true);
	maxmemory = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1)
		     * -1442608195);
	cpucount = Runtime.getRuntime().availableProcessors() * -960557393;
	addcanvas((byte) -55);
	maininit(1633180114);
	Class124.aClass593_1580 = Class4.method472((byte) 4);
	while (0L == killtime * -6417453013694242321L
	       || (Class50.method1249((byte) 1)
		   < -6417453013694242321L * killtime)) {
	    anInt7649 = (Class124.aClass593_1580
			     .method12931(aLong7633 * 6418136547495746967L)
			 * -326425679);
	    for (int i = 0; i < anInt7649 * 2060141905; i++)
		method13045((byte) -3);
	    method12962((short) 7414);
	    Class9.method569(Class344.canvas, -403233893);
	}
    }
    
    public final synchronized void method127(Graphics graphics) {
	if (!shutdown) {
	    fullredraw = true;
	    if (Class50.method1249((byte) 1) - lastCanvasReplace * 7529516469221509421L
		> 1000L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (null == rectangle
		    || (rectangle.width >= Class294.frameWid * 884255947
			&& rectangle.height >= Class43.frameHei * -828675613))
		    canvasReplaceRecommended = true;
	    }
	}
    }
    
    void method13065(String string) {
	if (!alreadyerrored) {
	    alreadyerrored = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class396.callNoParamater(Class421.gameApplet, "loggedout",
				    (byte) -20);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class421.gameApplet.getAppletContext().showDocument
		    (new URL(Class421.gameApplet.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws").toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    void method13066(String string, String string_144_) {
	if (!alreadyerrored) {
	    alreadyerrored = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class396.callNoParamater(Class421.gameApplet, "loggedout",
				    (byte) -82);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class421.gameApplet.getAppletContext().showDocument
		    (new URL(Class421.gameApplet.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws?").append
				 (string_144_).toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    GameShell3() {
	aBool7643 = false;
	aBool7647 = false;
    }
    
    void method13067(String string, String string_145_) {
	if (!alreadyerrored) {
	    alreadyerrored = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class396.callNoParamater(Class421.gameApplet, "loggedout",
				    (byte) -37);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class421.gameApplet.getAppletContext().showDocument
		    (new URL(Class421.gameApplet.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws?").append
				 (string_145_).toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public void method13068() throws Exception_Sub4 {
	if (!aBool7643) {
	    Class256.method5053((byte) 6).method109("jaclib", -213394021);
	    try {
		QueryPerformanceCounter.init();
	    } catch (Throwable throwable) {
		if (Class83.osName.startsWith("win"))
		    throw new Exception_Sub4(128, "jaclib");
	    }
	    aBool7643 = true;
	}
    }
    
    public void method13069() throws Exception_Sub4 {
	if (!aBool7643) {
	    Class256.method5053((byte) 77).method109("jaclib", -942292500);
	    try {
		QueryPerformanceCounter.init();
	    } catch (Throwable throwable) {
		if (Class83.osName.startsWith("win"))
		    throw new Exception_Sub4(128, "jaclib");
	    }
	    aBool7643 = true;
	}
    }
    
    public void method13070() throws Exception_Sub4 {
	if (!aBool7647) {
	    Class256.method5053((byte) -92).method109("jagtheora",
						      -1087936797);
	    aBool7647 = true;
	}
    }
    
    static final void method13071(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class519.method11671(class58, class35, class454, (byte) -36);
    }
    
    static final void method13072(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (Class21.myPlayer.queuedStepCount
	       * -316498507);
    }
    
    static final void method13073(ClientScriptData class454, byte i) {
	int i_146_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	ItemDefinition class623
	    = JS5.itemDefLoader.list(i_146_, (short) 605);
	if (class623.anInt7923 * 579904981 >= 0
	    && -1060868593 * class623.anInt7904 >= 0)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class623.anInt7904 * -1060868593;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= i_146_;
    }
    
    public static final void method13074(int i) {
	if (!client.aBool8280) {
	    client.aFloat8394 += (-24.0F - client.aFloat8394) / 2.0F;
	    client.aBool8392 = true;
	    client.aBool8280 = true;
	}
    }
    
    static final void method13075(int i, int i_147_, int i_148_, int i_149_,
				  int i_150_, int i_151_, int i_152_) {
	Class192[] class192s = client.aClass192Array8301;
	for (int i_153_ = 0; i_153_ < class192s.length; i_153_++) {
	    Class192 class192 = class192s[i_153_];
	    if (null != class192 && -1685117145 * class192.anInt2288 == 2) {
		Class123.method2992((((Class192) class192).anInt2286
				     * -1053282915),
				    1718000347 * class192.anInt2289,
				    class192.anInt2290 * -1357301451, 0,
				    (((Class192) class192).anInt2291
				     * -885956766),
				    false, false, -530669467);
		if (client.aFloatArray8336[0] > -1.0F
		    && client.anInt8296 % 20 < 10) {
		    Class168 class168
			= (Class191.aClass168Array2284
			   [1521214931 * ((Class192) class192).anInt2285]);
		    int i_154_ = (int) ((float) i + client.aFloatArray8336[0]
					- 12.0F);
		    int i_155_ = (int) ((float) i_147_
					+ client.aFloatArray8336[1] - 28.0F);
		    class168.method3646(i_154_, i_155_);
		}
	    }
	}
    }
}
