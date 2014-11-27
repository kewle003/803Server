/* Class602 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class602
{
    static char[] aCharArray7732;
    static final int anInt7733 = 12;
    static char[] aCharArray7734
	= { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4',
	    '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3',
	    '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9',
	    '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd',
	    '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6',
	    '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5',
	    '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da',
	    '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178',
	    '\u00f1', '\u00d1', '\u00df' };
    static final int anInt7735 = 1;
    
    static final boolean method13170(char c) {
	return c == '\u00a0' || ' ' == c || c == '_' || c == '-';
    }
    
    static char method13171(char c) {
	switch (c) {
	case '\u00c8':
	case '\u00c9':
	case '\u00ca':
	case '\u00cb':
	case '\u00e8':
	case '\u00e9':
	case '\u00ea':
	case '\u00eb':
	    return 'e';
	case '#':
	case '[':
	case ']':
	    return c;
	case '\u00df':
	    return 'b';
	default:
	    return Character.toLowerCase(c);
	case '\u00ff':
	case '\u0178':
	    return 'y';
	case '\u00c7':
	case '\u00e7':
	    return 'c';
	case '\u00c0':
	case '\u00c1':
	case '\u00c2':
	case '\u00c3':
	case '\u00c4':
	case '\u00e0':
	case '\u00e1':
	case '\u00e2':
	case '\u00e3':
	case '\u00e4':
	    return 'a';
	case '\u00d2':
	case '\u00d3':
	case '\u00d4':
	case '\u00d5':
	case '\u00d6':
	case '\u00f2':
	case '\u00f3':
	case '\u00f4':
	case '\u00f5':
	case '\u00f6':
	    return 'o';
	case '\u00cd':
	case '\u00ce':
	case '\u00cf':
	case '\u00ed':
	case '\u00ee':
	case '\u00ef':
	    return 'i';
	case '\u00d1':
	case '\u00f1':
	    return 'n';
	case '\u00d9':
	case '\u00da':
	case '\u00db':
	case '\u00dc':
	case '\u00f9':
	case '\u00fa':
	case '\u00fb':
	case '\u00fc':
	    return 'u';
	case ' ':
	case '-':
	case '_':
	case '\u00a0':
	    return '_';
	}
    }
    
    static final int method13172(Class600 class600) {
	if (null == class600)
	    return 12;
	switch (952633145 * ((Class600) class600).anInt7716) {
	default:
	    return 12;
	case 2:
	    return 20;
	}
    }
    
    static {
	aCharArray7732 = new char[] { '[', ']', '#' };
    }
    
    static final boolean method13173(char c) {
	if (Character.isISOControl(c))
	    return false;
	if (Class241_Sub46.method16585(c, -350730633))
	    return true;
	char[] cs = aCharArray7734;
	for (int i = 0; i < cs.length; i++) {
	    char c_0_ = cs[i];
	    if (c_0_ == c)
		return true;
	}
	cs = aCharArray7732;
	for (int i = 0; i < cs.length; i++) {
	    char c_1_ = cs[i];
	    if (c_1_ == c)
		return true;
	}
	return false;
    }
    
    static final boolean method13174(char c) {
	if (Character.isISOControl(c))
	    return false;
	if (Class241_Sub46.method16585(c, -533438845))
	    return true;
	char[] cs = aCharArray7734;
	for (int i = 0; i < cs.length; i++) {
	    char c_2_ = cs[i];
	    if (c_2_ == c)
		return true;
	}
	cs = aCharArray7732;
	for (int i = 0; i < cs.length; i++) {
	    char c_3_ = cs[i];
	    if (c_3_ == c)
		return true;
	}
	return false;
    }
    
    static final boolean method13175(char c) {
	return c == '\u00a0' || ' ' == c || c == '_' || c == '-';
    }
    
    Class602() throws Throwable {
	throw new Error();
    }
    
    static char method13176(char c) {
	switch (c) {
	case '\u00c8':
	case '\u00c9':
	case '\u00ca':
	case '\u00cb':
	case '\u00e8':
	case '\u00e9':
	case '\u00ea':
	case '\u00eb':
	    return 'e';
	case '#':
	case '[':
	case ']':
	    return c;
	case '\u00df':
	    return 'b';
	default:
	    return Character.toLowerCase(c);
	case '\u00ff':
	case '\u0178':
	    return 'y';
	case '\u00c7':
	case '\u00e7':
	    return 'c';
	case '\u00c0':
	case '\u00c1':
	case '\u00c2':
	case '\u00c3':
	case '\u00c4':
	case '\u00e0':
	case '\u00e1':
	case '\u00e2':
	case '\u00e3':
	case '\u00e4':
	    return 'a';
	case '\u00d2':
	case '\u00d3':
	case '\u00d4':
	case '\u00d5':
	case '\u00d6':
	case '\u00f2':
	case '\u00f3':
	case '\u00f4':
	case '\u00f5':
	case '\u00f6':
	    return 'o';
	case '\u00cd':
	case '\u00ce':
	case '\u00cf':
	case '\u00ed':
	case '\u00ee':
	case '\u00ef':
	    return 'i';
	case '\u00d1':
	case '\u00f1':
	    return 'n';
	case '\u00d9':
	case '\u00da':
	case '\u00db':
	case '\u00dc':
	case '\u00f9':
	case '\u00fa':
	case '\u00fb':
	case '\u00fc':
	    return 'u';
	case ' ':
	case '-':
	case '_':
	case '\u00a0':
	    return '_';
	}
    }
    
    static final int method13177(Class600 class600) {
	if (null == class600)
	    return 12;
	switch (952633145 * ((Class600) class600).anInt7716) {
	default:
	    return 12;
	case 2:
	    return 20;
	}
    }
    
    static char method13178(char c) {
	switch (c) {
	case '\u00c8':
	case '\u00c9':
	case '\u00ca':
	case '\u00cb':
	case '\u00e8':
	case '\u00e9':
	case '\u00ea':
	case '\u00eb':
	    return 'e';
	case '#':
	case '[':
	case ']':
	    return c;
	case '\u00df':
	    return 'b';
	default:
	    return Character.toLowerCase(c);
	case '\u00ff':
	case '\u0178':
	    return 'y';
	case '\u00c7':
	case '\u00e7':
	    return 'c';
	case '\u00c0':
	case '\u00c1':
	case '\u00c2':
	case '\u00c3':
	case '\u00c4':
	case '\u00e0':
	case '\u00e1':
	case '\u00e2':
	case '\u00e3':
	case '\u00e4':
	    return 'a';
	case '\u00d2':
	case '\u00d3':
	case '\u00d4':
	case '\u00d5':
	case '\u00d6':
	case '\u00f2':
	case '\u00f3':
	case '\u00f4':
	case '\u00f5':
	case '\u00f6':
	    return 'o';
	case '\u00cd':
	case '\u00ce':
	case '\u00cf':
	case '\u00ed':
	case '\u00ee':
	case '\u00ef':
	    return 'i';
	case '\u00d1':
	case '\u00f1':
	    return 'n';
	case '\u00d9':
	case '\u00da':
	case '\u00db':
	case '\u00dc':
	case '\u00f9':
	case '\u00fa':
	case '\u00fb':
	case '\u00fc':
	    return 'u';
	case ' ':
	case '-':
	case '_':
	case '\u00a0':
	    return '_';
	}
    }
    
    static char method13179(char c) {
	switch (c) {
	case '\u00c8':
	case '\u00c9':
	case '\u00ca':
	case '\u00cb':
	case '\u00e8':
	case '\u00e9':
	case '\u00ea':
	case '\u00eb':
	    return 'e';
	case '#':
	case '[':
	case ']':
	    return c;
	case '\u00df':
	    return 'b';
	default:
	    return Character.toLowerCase(c);
	case '\u00ff':
	case '\u0178':
	    return 'y';
	case '\u00c7':
	case '\u00e7':
	    return 'c';
	case '\u00c0':
	case '\u00c1':
	case '\u00c2':
	case '\u00c3':
	case '\u00c4':
	case '\u00e0':
	case '\u00e1':
	case '\u00e2':
	case '\u00e3':
	case '\u00e4':
	    return 'a';
	case '\u00d2':
	case '\u00d3':
	case '\u00d4':
	case '\u00d5':
	case '\u00d6':
	case '\u00f2':
	case '\u00f3':
	case '\u00f4':
	case '\u00f5':
	case '\u00f6':
	    return 'o';
	case '\u00cd':
	case '\u00ce':
	case '\u00cf':
	case '\u00ed':
	case '\u00ee':
	case '\u00ef':
	    return 'i';
	case '\u00d1':
	case '\u00f1':
	    return 'n';
	case '\u00d9':
	case '\u00da':
	case '\u00db':
	case '\u00dc':
	case '\u00f9':
	case '\u00fa':
	case '\u00fb':
	case '\u00fc':
	    return 'u';
	case ' ':
	case '-':
	case '_':
	case '\u00a0':
	    return '_';
	}
    }
    
    static final void method13180(int i) {
	Iterator iterator = client.aClass407_8454.iterator();
	while (iterator.hasNext()) {
	    Class241_Sub39_Sub7 class241_sub39_sub7
		= (Class241_Sub39_Sub7) iterator.next();
	    Class475_Sub1_Sub1_Sub5 class475_sub1_sub1_sub5
		= (((Class241_Sub39_Sub7) class241_sub39_sub7)
		   .aClass475_Sub1_Sub1_Sub5_10856);
	    if (client.aClass238_8477.method4751(-1009241810) != null
		&& class475_sub1_sub1_sub5.method17932(-2095843441))
		client.aClass238_8477.method4751(-1162888316)
		    .method12225(class475_sub1_sub1_sub5, true, -1891385245);
	}
    }
}
