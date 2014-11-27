/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class443 implements Iterator<Object>
{
    Node aClass241_6161 = null;
    Node aClass241_6162;
    NodeCollection aClass429_6163;
    public static VarBasicTypeListClient VAR_CLAN_LIST;//aClass199_Sub2_Sub2_6164
    static Class168 aClass168_6165;
    
    public boolean method7851() {
	return (((Class443) this).aClass429_6163.aClass241_6093
		!= ((Class443) this).aClass241_6162);
    }
    
    public Class443(NodeCollection class429) {
	((Class443) this).aClass429_6163 = class429;
	((Class443) this).aClass241_6162
	    = ((Class443) this).aClass429_6163.aClass241_6093.previousNode;
	((Class443) this).aClass241_6161 = null;
    }
    
    public boolean method7852() {
	return (((Class443) this).aClass429_6163.aClass241_6093
		!= ((Class443) this).aClass241_6162);
    }
    
    public void method7853(NodeCollection class429) {
	((Class443) this).aClass429_6163 = class429;
	((Class443) this).aClass241_6162
	    = ((Class443) this).aClass429_6163.aClass241_6093.previousNode;
	((Class443) this).aClass241_6161 = null;
    }
    
    public Object next() {
	Node class241 = ((Class443) this).aClass241_6162;
	if (class241 == ((Class443) this).aClass429_6163.aClass241_6093) {
	    class241 = null;
	    ((Class443) this).aClass241_6162 = null;
	} else
	    ((Class443) this).aClass241_6162 = class241.previousNode;
	((Class443) this).aClass241_6161 = class241;
	return class241;
    }
    
    public boolean hasNext() {
	return (((Class443) this).aClass429_6163.aClass241_6093
		!= ((Class443) this).aClass241_6162);
    }
    
    public void remove() {
	if (((Class443) this).aClass241_6161 == null)
	    throw new IllegalStateException();
	((Class443) this).aClass241_6161.remove((byte) 36);
	((Class443) this).aClass241_6161 = null;
    }
    
    public boolean method7854() {
	return (((Class443) this).aClass429_6163.aClass241_6093
		!= ((Class443) this).aClass241_6162);
    }
    
    void method7855() {
	((Class443) this).aClass241_6162
	    = ((Class443) this).aClass429_6163.aClass241_6093.previousNode;
	((Class443) this).aClass241_6161 = null;
    }
    
    public boolean method7856() {
	return (((Class443) this).aClass429_6163.aClass241_6093
		!= ((Class443) this).aClass241_6162);
    }
    
    public Object method7857() {
	Node class241 = ((Class443) this).aClass241_6162;
	if (class241 == ((Class443) this).aClass429_6163.aClass241_6093) {
	    class241 = null;
	    ((Class443) this).aClass241_6162 = null;
	} else
	    ((Class443) this).aClass241_6162 = class241.previousNode;
	((Class443) this).aClass241_6161 = class241;
	return class241;
    }
    
    public Object method7858() {
	Node class241 = ((Class443) this).aClass241_6162;
	if (class241 == ((Class443) this).aClass429_6163.aClass241_6093) {
	    class241 = null;
	    ((Class443) this).aClass241_6162 = null;
	} else
	    ((Class443) this).aClass241_6162 = class241.previousNode;
	((Class443) this).aClass241_6161 = class241;
	return class241;
    }
    
    void method7859(byte i) {
	((Class443) this).aClass241_6162
	    = ((Class443) this).aClass429_6163.aClass241_6093.previousNode;
	((Class443) this).aClass241_6161 = null;
    }
    
    public void method7860() {
	if (((Class443) this).aClass241_6161 == null)
	    throw new IllegalStateException();
	((Class443) this).aClass241_6161.remove((byte) 36);
	((Class443) this).aClass241_6161 = null;
    }
    
    public void method7861() {
	if (((Class443) this).aClass241_6161 == null)
	    throw new IllegalStateException();
	((Class443) this).aClass241_6161.remove((byte) 36);
	((Class443) this).aClass241_6161 = null;
    }
    
    public void method7862() {
	if (((Class443) this).aClass241_6161 == null)
	    throw new IllegalStateException();
	((Class443) this).aClass241_6161.remove((byte) 36);
	((Class443) this).aClass241_6161 = null;
    }
    
    public void method7863(NodeCollection class429, byte i) {
	((Class443) this).aClass429_6163 = class429;
	((Class443) this).aClass241_6162
	    = ((Class443) this).aClass429_6163.aClass241_6093.previousNode;
	((Class443) this).aClass241_6161 = null;
    }
    
    void method7864() {
	((Class443) this).aClass241_6162
	    = ((Class443) this).aClass429_6163.aClass241_6093.previousNode;
	((Class443) this).aClass241_6161 = null;
    }
    
    public Node method7865(int i) {
	method7859((byte) -1);
	return (Node) next();
    }
    
    public Node method7866() {
	method7859((byte) -82);
	return (Node) next();
    }
    
    public Node method7867() {
	method7859((byte) -57);
	return (Node) next();
    }
    
    public Node method7868() {
	method7859((byte) -55);
	return (Node) next();
    }
    
    public static final int method7869(String string, int i) {
	if (null == string)
	    return -1;
	for (int i_0_ = 0; i_0_ < client.friendListSize * 1557840217; i_0_++) {
	    if (string.equalsIgnoreCase(client.friendList[i_0_]
					.currentName))
		return i_0_;
	}
	return -1;
    }
    
    public static boolean isFriend/*method7870*/(String string, byte i) {
	if (string == null) {
	    return false;
        }
	for (int index = 0; index < client.friendListSize * 1557840217; index++) {
	    if (string.equalsIgnoreCase(client.friendList[index].currentName)) {
		return true;
            }
	}
	if (string.equalsIgnoreCase(Class21.myPlayer.nameUnfiltered)) {
	    return true;
        }
	return false;
    }
    
    public static void method7871(int i) {
	Class120_Sub8.method16777((byte) -49);
    }
}
