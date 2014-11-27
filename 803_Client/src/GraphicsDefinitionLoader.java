/* Class457 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GraphicsDefinitionLoader
{
    Class129 gfxDefCache = new Class129(64);//aClass129_6251
    JS5 graphicsDefContainer;//aClass210_6252
    int anInt6253;
    JS5 modelDefContainer;//aClass210_6254
    Class129 aClass129_6255 = new Class129(60);
    public static ClanSettings mainClanSettings;//aClass374_6256
    
    public void method10579() {
		synchronized (gfxDefCache) {
		    gfxDefCache.removeSoftReferences((byte) 75);
		}
		synchronized (aClass129_6255) {
		    aClass129_6255.removeSoftReferences((byte) -8);
		}
    }
    
    public void method10580(int i) {
		anInt6253 = i * -818392053;
		synchronized (aClass129_6255) {
		    aClass129_6255.reset(-490963612);
		}
    }
    
    public void method10581(int i, int i_0_) {
		anInt6253 = i * -818392053;
		synchronized (aClass129_6255) {
		    aClass129_6255.reset(-1181690657);
		}
    }
    
    public void method10582(int i) {
	synchronized (gfxDefCache) {
	    gfxDefCache.reset(-756515179);
	}
	synchronized (aClass129_6255) {
	    aClass129_6255.reset(-137222990);
	}
    }
    
    public void method10583(int i, int i_1_) {
	synchronized (gfxDefCache) {
	    gfxDefCache.clean(i, -2023023882);
	}
	synchronized (aClass129_6255) {
	    aClass129_6255.clean(i, -2124742711);
	}
    }
    
    public GraphicsDefinition method10584(int i) {
		GraphicsDefinition class460;
		synchronized (gfxDefCache) {
		    class460 = ((GraphicsDefinition)
				gfxDefCache.get((long) i));
		}
		if (class460 != null)
		    return class460;
		byte[] is;
		synchronized (modelDefContainer) {
		    is = (modelDefContainer.getfile
			  (Js5ConfigGroup.GRAPHICS_DEFINITIONS.getClientGroupId(i, (byte) -53),
			   Js5ConfigGroup.GRAPHICS_DEFINITIONS.getClientFileId(i, -549617844),
			   1131728801));
		}
		class460 = new GraphicsDefinition();
		((GraphicsDefinition) class460).loader = this;
		((GraphicsDefinition) class460).graphicsID = 190231187 * i;
		if (null != is)
		    class460.read(new RSByteBuffer(is), -1384749080);
		synchronized (gfxDefCache) {
		    gfxDefCache.put(class460, (long) i);
		}
		return class460;
    }
    
    public GraphicsDefinitionLoader(GameDefinition game, Language locale, JS5 graphics,
		    JS5 models) {
		modelDefContainer = graphics;
		graphicsDefContainer = models;
		int i = modelDefContainer.getFileCount((byte) 62) - 1;
		Js5ConfigGroup.GRAPHICS_DEFINITIONS.getGroupSize(-379458484);
		modelDefContainer.getContainerCount(i, (byte) -86);
    }
    
    public GraphicsDefinition method10585(int i) {
	GraphicsDefinition class460;
	synchronized (gfxDefCache) {
	    class460 = ((GraphicsDefinition)
			gfxDefCache.get((long) i));
	}
	if (class460 != null)
	    return class460;
	byte[] is;
	synchronized (modelDefContainer) {
	    is = (modelDefContainer.getfile
		  (Js5ConfigGroup.GRAPHICS_DEFINITIONS.getClientGroupId(i, (byte) -115),
		   Js5ConfigGroup.GRAPHICS_DEFINITIONS.getClientFileId(i, 1336656443),
		   -939951857));
	}
	class460 = new GraphicsDefinition();
	((GraphicsDefinition) class460).loader = this;
	((GraphicsDefinition) class460).graphicsID = 190231187 * i;
	if (null != is)
	    class460.read(new RSByteBuffer(is), -1054435918);
	synchronized (gfxDefCache) {
	    gfxDefCache.put(class460, (long) i);
	}
	return class460;
    }
    
    public GraphicsDefinition method10586(int i) {
	GraphicsDefinition class460;
	synchronized (gfxDefCache) {
	    class460 = ((GraphicsDefinition)
			gfxDefCache.get((long) i));
	}
	if (class460 != null)
	    return class460;
	byte[] is;
	synchronized (modelDefContainer) {
	    is = (modelDefContainer.getfile
		  (Js5ConfigGroup.GRAPHICS_DEFINITIONS.getClientGroupId(i, (byte) -65),
		   Js5ConfigGroup.GRAPHICS_DEFINITIONS.getClientFileId(i, 897438716), 1368700803));
	}
	class460 = new GraphicsDefinition();
	((GraphicsDefinition) class460).loader = this;
	((GraphicsDefinition) class460).graphicsID = 190231187 * i;
	if (null != is)
	    class460.read(new RSByteBuffer(is), -570724993);
	synchronized (gfxDefCache) {
	    gfxDefCache.put(class460, (long) i);
	}
	return class460;
    }
    
    public GraphicsDefinition getGraphicsDefinition/*method10587*/(int gfxID, int i_3_) {
		GraphicsDefinition graphics;
		synchronized (gfxDefCache) {
			graphics = ((GraphicsDefinition) gfxDefCache.get((long) gfxID));
		}
		if (graphics != null) {
		    return graphics;
		}
		byte[] data;
		synchronized (modelDefContainer) {
			data = modelDefContainer.getfile(
		    		Js5ConfigGroup.GRAPHICS_DEFINITIONS.getClientGroupId(gfxID, (byte) -106),
		    		Js5ConfigGroup.GRAPHICS_DEFINITIONS.getClientFileId(gfxID, 272135748), 1199356802);
		}
		graphics = new GraphicsDefinition();
		graphics.loader = this;
		graphics.graphicsID = 190231187 * gfxID;
		if (null != data) {
			graphics.read(new RSByteBuffer(data), 1431179254);
		}
		synchronized (gfxDefCache) {
		    gfxDefCache.put(graphics, (long) gfxID);
		}
		return graphics;
    }
    
    public void method10588() {
	synchronized (gfxDefCache) {
	    gfxDefCache.reset(-869337767);
	}
	synchronized (aClass129_6255) {
	    aClass129_6255.reset(-99102041);
	}
    }
    
    public void method10589(int i) {
	synchronized (gfxDefCache) {
	    gfxDefCache.clean(i, -2102365787);
	}
	synchronized (aClass129_6255) {
	    aClass129_6255.clean(i, -2021195390);
	}
    }
    
    public void method10590(int i) {
	synchronized (gfxDefCache) {
	    gfxDefCache.clean(i, -2014805703);
	}
	synchronized (aClass129_6255) {
	    aClass129_6255.clean(i, -1991960016);
	}
    }
    
    public void method10591(int i) {
	synchronized (gfxDefCache) {
	    gfxDefCache.removeSoftReferences((byte) 76);
	}
	synchronized (aClass129_6255) {
	    aClass129_6255.removeSoftReferences((byte) 14);
	}
    }
    
    public void method10592() {
	synchronized (gfxDefCache) {
	    gfxDefCache.removeSoftReferences((byte) 29);
	}
	synchronized (aClass129_6255) {
	    aClass129_6255.removeSoftReferences((byte) 56);
	}
    }
    
    public static boolean method10593(char c, int i) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if ('\0' != c) {
	    char[] cs = Class462.shiftCharacters;
	    for (int i_4_ = 0; i_4_ < cs.length; i_4_++) {
		char c_5_ = cs[i_4_];
		if (c == c_5_)
		    return true;
	    }
	}
	return false;
    }
    
    static void method10594(int i) {
	Class9.aClass22_51 = Class22.aClass22_204;
	Class9.aClass433_49 = Class433.aClass433_6113;
	Class9.aClass423_53 = Class423.aClass423_6052;
	Class455.aClass432_6247 = Class432.aClass432_6101;
	Class327.aClass411_5019 = Class411.aClass411_5940;
	GameShell3$FrameParameters.aClass425_4007 = Class425.aClass425_6071;
	OutputStream_Sub1.aString8604 = null;
    }
    
    public static void method10595(int i, boolean bool, int i_6_,
				   boolean bool_7_, int i_8_) {
	Class13.method672(0, Class395.aClass507_Sub1Array5780.length - 1, i,
			  bool, i_6_, bool_7_, -2010989067);
	Class395.anInt5781 = 0;
	Class395.aClass468_5782 = null;
    }
}
