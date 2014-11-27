/* Class241_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub21 extends Node
{
    double aDouble9009;
    short[][] aShortArrayArray9010;
    
    Class241_Sub21(short[][] is, double d) {
	((Class241_Sub21) this).aShortArrayArray9010 = is;
	((Class241_Sub21) this).aDouble9009 = d;
    }
    
    static char method15058(char c, byte i) {
	if (c == '\u00c6')
	    return 'E';
	if (c == '\u00e6')
	    return 'e';
	if ('\u00df' == c)
	    return 's';
	if ('\u0152' == c)
	    return 'E';
	if (c == '\u0153')
	    return 'e';
	return '\0';
    }
}
