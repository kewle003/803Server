/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collection;
import java.util.Iterator;

public class NodeCollection implements Iterable, Collection
{
    Node aClass241_6092;
    public Node aClass241_6093 = new Node();
    
    void method7616(NodeCollection class429_0_, Node class241) {
		Node class241_1_ = aClass241_6093.nextNode;
		aClass241_6093.nextNode = class241.nextNode;
		class241.nextNode.previousNode = aClass241_6093;
		if (class241 != aClass241_6093) {
		    class241.nextNode
			= class429_0_.aClass241_6093.nextNode;
		    class241.nextNode.previousNode = class241;
		    class241_1_.previousNode = class429_0_.aClass241_6093;
		    class429_0_.aClass241_6093.nextNode = class241_1_;
		}
    }
    
    public Object[] toArray() {
	return method7628((byte) 100);
    }
    
    public void addNode/*method7617*/(Node node, short i) {
		if (node.nextNode != null) {
			node.remove((byte) 36);
		}
		node.nextNode = aClass241_6093.nextNode;
		node.previousNode = aClass241_6093;
		node.nextNode.previousNode = node;
		node.previousNode.nextNode = node;
    }
    
    public Node getNext/*method7618*/(int i) {
		Node class241 = aClass241_6093.previousNode;
		if (aClass241_6093 == class241) {
		    return null;
		}
		class241.remove((byte) 36);
		return class241;
    }
    
    public Node method7619(byte i) {
	return method7624(null, (short) -5903);
    }
    
    void method7620(NodeCollection class429_2_, Node class241, int i) {
	Node class241_3_ = aClass241_6093.nextNode;
	aClass241_6093.nextNode = class241.nextNode;
	class241.nextNode.previousNode = aClass241_6093;
	if (class241 != aClass241_6093) {
	    class241.nextNode
		= class429_2_.aClass241_6093.nextNode;
	    class241.nextNode.previousNode = class241;
	    class241_3_.previousNode = class429_2_.aClass241_6093;
	    class429_2_.aClass241_6093.nextNode = class241_3_;
	}
    }
    
    Node method7621(Node class241) {
	Node class241_4_;
	if (null == class241)
	    class241_4_ = aClass241_6093.nextNode;
	else
	    class241_4_ = class241;
	if (aClass241_6093 == class241_4_) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241_4_.nextNode;
	return class241_4_;
    }
    
    Node method7622/*method7622*/(Node class241, byte i) {
		Node node;
		if (class241 == null) {
			node = aClass241_6093.previousNode;
		} else {
			node = class241;
		}
		if (node == aClass241_6093) {
		    aClass241_6092 = null;
		    return null;
		}
		aClass241_6092 = node.previousNode;
		return node;
    }
    
    Node method7623(Node class241) {
	Node class241_6_;
	if (class241 == null)
	    class241_6_ = aClass241_6093.previousNode;
	else
	    class241_6_ = class241;
	if (class241_6_ == aClass241_6093) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241_6_.previousNode;
	return class241_6_;
    }
    
    Node method7624(Node class241, short i) {
	Node class241_7_;
	if (null == class241)
	    class241_7_ = aClass241_6093.nextNode;
	else
	    class241_7_ = class241;
	if (aClass241_6093 == class241_7_) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241_7_.nextNode;
	return class241_7_;
    }
    
    public NodeCollection() {
		aClass241_6093.previousNode = aClass241_6093;
		aClass241_6093.nextNode = aClass241_6093;
    }
    
    public Node method7625(byte i) {
	Node class241 = aClass241_6092;
	if (class241 == aClass241_6093) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241.nextNode;
	return class241;
    }
    
    public int method7626(int i) {
	int i_8_ = 0;
	for (Node class241 = aClass241_6093.previousNode;
	     class241 != aClass241_6093; class241 = class241.previousNode)
	    i_8_++;
	return i_8_;
    }
    
    public boolean isEmpty/*method7627*/(int i) {
    	return aClass241_6093.previousNode == aClass241_6093;
    }
    
    Node[] method7628(byte i) {
	Node[] class241s = new Node[method7626(-2115947176)];
	int i_9_ = 0;
	for (Node class241 = aClass241_6093.previousNode;
	     class241 != aClass241_6093; class241 = class241.previousNode)
	    class241s[i_9_++] = class241;
	return class241s;
    }
    
    public Iterator iterator() {
	return new Class443(this);
    }
    
    public int size() {
	return method7626(-1624512708);
    }
    
    Node method7629(Node class241) {
	Node class241_10_;
	if (class241 == null)
	    class241_10_ = aClass241_6093.previousNode;
	else
	    class241_10_ = class241;
	if (class241_10_ == aClass241_6093) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241_10_.previousNode;
	return class241_10_;
    }
    
    public boolean contains(Object object) {
	throw new RuntimeException();
    }
    
    public int method7630() {
	return super.hashCode();
    }
    
    public Object[] toArray(Object[] objects) {
	int i = 0;
	for (Node class241 = aClass241_6093.previousNode;
	     aClass241_6093 != class241; class241 = class241.previousNode)
	    objects[i++] = class241;
	return objects;
    }
    
    Node[] method7631() {
	Node[] class241s = new Node[method7626(-1775376279)];
	int i = 0;
	for (Node class241 = aClass241_6093.previousNode;
	     class241 != aClass241_6093; class241 = class241.previousNode)
	    class241s[i++] = class241;
	return class241s;
    }
    
    public boolean remove(Object object) {
	throw new RuntimeException();
    }
    
    public boolean containsAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean addAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean removeAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean retainAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public void clear() {
	method7652((byte) 78);
    }
    
    public boolean add(Object object) {
	return method7665((Node) object, 1893569591);
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public int hashCode() {
	return super.hashCode();
    }
    
    public void method7632() {
	method7652((byte) 92);
    }
    
    public void method7633(NodeCollection class429_11_, int i) {
	if (aClass241_6093 != aClass241_6093.previousNode)
	    method7620(class429_11_, aClass241_6093.previousNode,
		       1943750543);
    }
    
    public boolean method7634(Object object) {
	return super.equals(object);
    }
    
    public boolean method7635(Object object) {
	throw new RuntimeException();
    }
    
    public Object[] method7636() {
	return method7628((byte) 84);
    }
    
    public boolean method7637(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method7638(Object object) {
	throw new RuntimeException();
    }
    
    public void method7639() {
	while (aClass241_6093 != aClass241_6093.previousNode)
	    aClass241_6093.previousNode.remove((byte) 36);
    }
    
    public Object[] method7640() {
	return method7628((byte) 107);
    }
    
    public int method7641() {
	return super.hashCode();
    }
    
    public Node method7642() {
	Node class241 = aClass241_6093.previousNode;
	if (aClass241_6093 == class241)
	    return null;
	class241.remove((byte) 36);
	return class241;
    }
    
    public boolean isEmpty() {
	return isEmpty(1034393604);
    }
    
    public Iterator method7643() {
	return new Class443(this);
    }
    
    public boolean method7644(Collection collection) {
	throw new RuntimeException();
    }
    
    boolean method7645(Node class241) {
	addNode(class241, (short) -19953);
	return true;
    }
    
    public void method7646(Node class241) {
	if (class241.nextNode != null)
	    class241.remove((byte) 36);
	class241.nextNode = aClass241_6093.nextNode;
	class241.previousNode = aClass241_6093;
	class241.nextNode.previousNode = class241;
	class241.previousNode.nextNode = class241;
    }
    
    public static void method7647(Node class241, Node class241_12_) {
	if (null != class241.nextNode)
	    class241.remove((byte) 36);
	class241.nextNode = class241_12_.nextNode;
	class241.previousNode = class241_12_;
	class241.nextNode.previousNode = class241;
	class241.previousNode.nextNode = class241;
    }
    
    public static void method7648(Node class241, Node class241_13_) {
	if (null != class241.nextNode)
	    class241.remove((byte) 36);
	class241.nextNode = class241_13_.nextNode;
	class241.previousNode = class241_13_;
	class241.nextNode.previousNode = class241;
	class241.previousNode.nextNode = class241;
    }
    
    public static void method7649(Node class241, Node class241_14_) {
	if (null != class241.nextNode)
	    class241.remove((byte) 36);
	class241.nextNode = class241_14_.nextNode;
	class241.previousNode = class241_14_;
	class241.nextNode.previousNode = class241;
	class241.previousNode.nextNode = class241;
    }
    
    public static void method7650(Node class241, Node class241_15_) {
	if (null != class241.nextNode)
	    class241.remove((byte) 36);
	class241.nextNode = class241_15_.nextNode;
	class241.previousNode = class241_15_;
	class241.nextNode.previousNode = class241;
	class241.previousNode.nextNode = class241;
    }
    
    public Node method7651() {
	Node class241 = aClass241_6093.previousNode;
	if (aClass241_6093 == class241)
	    return null;
	class241.remove((byte) 36);
	return class241;
    }
    
    public void method7652(byte i) {
	while (aClass241_6093 != aClass241_6093.previousNode)
	    aClass241_6093.previousNode.remove((byte) 36);
    }
    
    public Node method7653() {
	Node class241 = aClass241_6093.previousNode;
	if (aClass241_6093 == class241)
	    return null;
	class241.remove((byte) 36);
	return class241;
    }
    
    public void method7654() {
	while (aClass241_6093 != aClass241_6093.previousNode)
	    aClass241_6093.previousNode.remove((byte) 36);
    }
    
    Node[] method7655() {
	Node[] class241s = new Node[method7626(-1794658666)];
	int i = 0;
	for (Node class241 = aClass241_6093.previousNode;
	     class241 != aClass241_6093; class241 = class241.previousNode)
	    class241s[i++] = class241;
	return class241s;
    }
    
    public boolean method7656(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean method7657(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean method7658(Object object) {
	return super.equals(object);
    }
    
    public Node method7659() {
	Node class241 = aClass241_6093.previousNode;
	if (aClass241_6093 == class241)
	    return null;
	class241.remove((byte) 36);
	return class241;
    }
    
    public void method7660(NodeCollection class429_16_) {
	if (aClass241_6093 != aClass241_6093.previousNode)
	    method7620(class429_16_, aClass241_6093.previousNode,
		       1943750543);
    }
    
    public void method7661() {
	method7652((byte) 126);
    }
    
    public Node method7662() {
	return method7622(null, (byte) -96);
    }
    
    public boolean method7663(Collection collection) {
	throw new RuntimeException();
    }
    
    Node method7664(Node class241) {
	Node class241_17_;
	if (class241 == null)
	    class241_17_ = aClass241_6093.previousNode;
	else
	    class241_17_ = class241;
	if (class241_17_ == aClass241_6093) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241_17_.previousNode;
	return class241_17_;
    }
    
    boolean method7665(Node class241, int i) {
	addNode(class241, (short) -1828);
	return true;
    }
    
    public Node method7666() {
	return method7624(null, (short) -7585);
    }
    
    public void method7667(NodeCollection class429_18_) {
	if (aClass241_6093 != aClass241_6093.previousNode)
	    method7620(class429_18_, aClass241_6093.previousNode,
		       1943750543);
    }
    
    Node method7668(Node class241) {
	Node class241_19_;
	if (null == class241)
	    class241_19_ = aClass241_6093.nextNode;
	else
	    class241_19_ = class241;
	if (aClass241_6093 == class241_19_) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241_19_.nextNode;
	return class241_19_;
    }
    
    Node method7669(Node class241) {
	Node class241_20_;
	if (null == class241)
	    class241_20_ = aClass241_6093.nextNode;
	else
	    class241_20_ = class241;
	if (aClass241_6093 == class241_20_) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241_20_.nextNode;
	return class241_20_;
    }
    
    public Iterator method7670() {
	return new Class443(this);
    }
    
    public Node method7671() {
	Node class241 = aClass241_6092;
	if (class241 == aClass241_6093) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241.nextNode;
	return class241;
    }
    
    public Node method7672() {
	Node class241 = aClass241_6092;
	if (class241 == aClass241_6093) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241.nextNode;
	return class241;
    }
    
    public Node method7673() {
	Node class241 = aClass241_6092;
	if (class241 == aClass241_6093) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241.nextNode;
	return class241;
    }
    
    public int method7674() {
	int i = 0;
	for (Node class241 = aClass241_6093.previousNode;
	     class241 != aClass241_6093; class241 = class241.previousNode)
	    i++;
	return i;
    }
    
    public int method7675() {
	int i = 0;
	for (Node class241 = aClass241_6093.previousNode;
	     class241 != aClass241_6093; class241 = class241.previousNode)
	    i++;
	return i;
    }
    
    public boolean method7676() {
	return aClass241_6093.previousNode == aClass241_6093;
    }
    
    public boolean method7677() {
	return aClass241_6093.previousNode == aClass241_6093;
    }
    
    public boolean method7678() {
	return aClass241_6093.previousNode == aClass241_6093;
    }
    
    Node[] method7679() {
	Node[] class241s = new Node[method7626(-1731974031)];
	int i = 0;
	for (Node class241 = aClass241_6093.previousNode;
	     class241 != aClass241_6093; class241 = class241.previousNode)
	    class241s[i++] = class241;
	return class241s;
    }
    
    Node method7680(Node class241) {
	Node class241_21_;
	if (null == class241)
	    class241_21_ = aClass241_6093.nextNode;
	else
	    class241_21_ = class241;
	if (aClass241_6093 == class241_21_) {
	    aClass241_6092 = null;
	    return null;
	}
	aClass241_6092 = class241_21_.nextNode;
	return class241_21_;
    }
    
    void method7681(NodeCollection class429_22_, Node class241) {
	Node class241_23_ = aClass241_6093.nextNode;
	aClass241_6093.nextNode = class241.nextNode;
	class241.nextNode.previousNode = aClass241_6093;
	if (class241 != aClass241_6093) {
	    class241.nextNode
		= class429_22_.aClass241_6093.nextNode;
	    class241.nextNode.previousNode = class241;
	    class241_23_.previousNode = class429_22_.aClass241_6093;
	    class429_22_.aClass241_6093.nextNode = class241_23_;
	}
    }
    
    public int method7682() {
	return method7626(-1771784245);
    }
    
    public boolean method7683(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method7684() {
	return isEmpty(380032266);
    }
    
    public boolean method7685(Object object) {
	return super.equals(object);
    }
    
    boolean method7686(Node class241) {
	addNode(class241, (short) -11174);
	return true;
    }
    
    public boolean method7687(Collection collection) {
	throw new RuntimeException();
    }
    
    void method7688(NodeCollection class429_24_, Node class241) {
	Node class241_25_ = aClass241_6093.nextNode;
	aClass241_6093.nextNode = class241.nextNode;
	class241.nextNode.previousNode = aClass241_6093;
	if (class241 != aClass241_6093) {
	    class241.nextNode
		= class429_24_.aClass241_6093.nextNode;
	    class241.nextNode.previousNode = class241;
	    class241_25_.previousNode = class429_24_.aClass241_6093;
	    class429_24_.aClass241_6093.nextNode = class241_25_;
	}
    }
    
    public void method7689(NodeCollection class429_26_) {
	if (aClass241_6093 != aClass241_6093.previousNode)
	    method7620(class429_26_, aClass241_6093.previousNode,
		       1943750543);
    }
    
    public Node method7690() {
	Node class241 = aClass241_6093.previousNode;
	if (aClass241_6093 == class241)
	    return null;
	class241.remove((byte) 36);
	return class241;
    }
    
    public boolean method7691(Collection collection) {
	throw new RuntimeException();
    }
    
    public Node method7692(int i) {
		Node class241 = aClass241_6092;
		if (class241 == aClass241_6093) {
		    aClass241_6092 = null;
		    return null;
		}
		aClass241_6092 = class241.previousNode;
		return class241;
    }
    
    public boolean method7693(Collection collection) {
	throw new RuntimeException();
    }
    
    public Node method7694(int i) {
    	return method7622(null, (byte) -26);
    }
    
    public int method7695() {
	return method7626(-1916932801);
    }
    
    public void method7696() {
	method7652((byte) 12);
    }
    
    public boolean method7697(Object object) {
	return method7665((Node) object, 1898664442);
    }
    
    static boolean method7698(int i) {
	boolean bool = true;
	if (Class452.aClass108_6211 == null) {
	    if (Class284.SPRITES_ARCHIVE
		    .method4250(-1492599329 * VarType.anInt2131, 2144184048))
		Class452.aClass108_6211
		    = Class160.method3438(Class284.SPRITES_ARCHIVE,
					  -1492599329 * VarType.anInt2131);
	    else
		bool = false;
	}
	if (Class450.aClass108_6208 == null) {
	    if (Class284.SPRITES_ARCHIVE
		    .method4250(Class214.anInt2515 * 71930255, -666375345))
		Class450.aClass108_6208
		    = Class160.method3438(Class284.SPRITES_ARCHIVE,
					  Class214.anInt2515 * 71930255);
	    else
		bool = false;
	}
	if (null == Class65.aClass108_1047) {
	    if (Class284.SPRITES_ARCHIVE
		    .method4250(1360042727 * Class47.anInt634, 1929705087))
		Class65.aClass108_1047
		    = Class160.method3438(Class284.SPRITES_ARCHIVE,
					  1360042727 * Class47.anInt634);
	    else
		bool = false;
	}
	if (null == Class191.aClass639_2283) {
	    if (Class120_Sub7.FONTS_ARCHIVE
		    .method4250(Class122.anInt1571 * 454028431, -30688176))
		Class191.aClass639_2283
		    = Class482.method11026(Class120_Sub7.FONTS_ARCHIVE,
					   Class122.anInt1571 * 454028431,
					   -457568169);
	    else
		bool = false;
	}
	if (Class563.aClass108_Sub2Array7305 == null) {
	    if (Class284.SPRITES_ARCHIVE
		    .method4250(454028431 * Class122.anInt1571, 1393089297))
		Class563.aClass108_Sub2Array7305
		    = ((Class108_Sub2[])
		       Class160.method3440(Class284.SPRITES_ARCHIVE,
					   454028431 * Class122.anInt1571));
	    else
		bool = false;
	}
	return bool;
    }
}
