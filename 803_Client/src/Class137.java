/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class137
{
    int anInt1620;
    
    void method3111(char c) {
	OpenGL.glCallList(((Class137) this).anInt1620 + c);
    }
    
    void method3112(int i) {
	OpenGL.glNewList(((Class137) this).anInt1620 + i, 4864);
    }
    
    void method3113(char c) {
	OpenGL.glCallList(((Class137) this).anInt1620 + c);
    }
    
    void method3114() {
	OpenGL.glEndList();
    }
    
    void method3115(int i) {
	OpenGL.glNewList(((Class137) this).anInt1620 + i, 4864);
    }
    
    void method3116(int i) {
	OpenGL.glNewList(((Class137) this).anInt1620 + i, 4864);
    }
    
    void method3117() {
	OpenGL.glEndList();
    }
    
    Class137(Class103_Sub1 class103_sub1, int i) {
	((Class137) this).anInt1620 = OpenGL.glGenLists(i);
    }
}
