/* Class407 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public final class HashTable implements Iterable<Object> {
    Node aClass241_5906;
    Node[] aClass241Array5907;
    long aLong5908;
    Node aClass241_5909;
    int anInt5910;
    int anInt5911 = 0;
    public static byte[][] aByteArrayArray5912;
    static int anInt5913;
    
    public Node method7287() {
	if (-1295719697 * anInt5911 > 0
	    && (aClass241_5906
		!= (aClass241Array5907
		    [anInt5911 * -1295719697 - 1]))) {
	    Node class241 = aClass241_5906;
	    aClass241_5906 = class241.previousNode;
	    return class241;
	}
	while (-1295719697 * anInt5911
	       < 130185305 * anInt5910) {
	    Node class241
		= (aClass241Array5907
		   [((anInt5911 += 459574287) * -1295719697
		     - 1)]
		   .previousNode);
	    if ((aClass241Array5907
		 [-1295719697 * anInt5911 - 1])
		!= class241) {
		aClass241_5906 = class241.previousNode;
		return class241;
	    }
	}
	return null;
    }
    
    public Node get/*method7288*/(long hash) {
		aLong5908 = -1351226491625197621L * hash;
		Node class241 = (aClass241Array5907[(int) (hash & (long) (130185305 * anInt5910 - 1))]);
		for (aClass241_5909 = class241.previousNode;
				class241 != aClass241_5909;
				aClass241_5909 = aClass241_5909.previousNode) {
			if (hash == (aClass241_5909.hashCode * 4356572401218184725L)) {
				Node class241_0_ = aClass241_5909;
				aClass241_5909 = aClass241_5909.previousNode;
				return class241_0_;
			}
		}
		aClass241_5909 = null;
		return null;
    }
    
    public Node method7289(byte i) {
	if (aClass241_5909 == null)
	    return null;
	for (Node class241
		 = (aClass241Array5907
		    [(int) (-3012791216299180573L * aLong5908
			    & (long) (130185305 * anInt5910
				      - 1))]);
	     aClass241_5909 != class241;
	     aClass241_5909
		 = aClass241_5909.previousNode) {
	    if (aLong5908 * -3012791216299180573L
		== (4356572401218184725L
		    * aClass241_5909.hashCode)) {
		Node class241_1_ = aClass241_5909;
		aClass241_5909
		    = aClass241_5909.previousNode;
		return class241_1_;
	    }
	}
	aClass241_5909 = null;
	return null;
    }
    
    public Node method7290() {
	if (-1295719697 * anInt5911 > 0
	    && (aClass241_5906
		!= (aClass241Array5907
		    [anInt5911 * -1295719697 - 1]))) {
	    Node class241 = aClass241_5906;
	    aClass241_5906 = class241.previousNode;
	    return class241;
	}
	while (-1295719697 * anInt5911
	       < 130185305 * anInt5910) {
	    Node class241
		= (aClass241Array5907
		   [((anInt5911 += 459574287) * -1295719697
		     - 1)]
		   .previousNode);
	    if ((aClass241Array5907
		 [-1295719697 * anInt5911 - 1])
		!= class241) {
		aClass241_5906 = class241.previousNode;
		return class241;
	    }
	}
	return null;
    }
    
    public void method7291() {
	for (int i = 0; i < anInt5910 * 130185305; i++) {
	    Node class241 = aClass241Array5907[i];
	    for (;;) {
		Node class241_2_ = class241.previousNode;
		if (class241_2_ == class241)
		    break;
		class241_2_.remove((byte) 36);
	    }
	}
	aClass241_5909 = null;
	aClass241_5906 = null;
    }
    
    public void put/*method7292*/(Node node, long hash) {
		if (node.nextNode != null) {
			node.remove((byte) 36);
		}
		Node class241_3_
		    = aClass241Array5907[(int) (hash & (long) (130185305 * anInt5910 - 1))];
		node.nextNode = class241_3_.nextNode;
		node.previousNode = class241_3_;
		node.nextNode.previousNode = node;
		node.previousNode.nextNode = node;
		node.hashCode = hash * -84545867636262595L;
    }
    
    public void method7293(int i) {
	for (int i_4_ = 0; i_4_ < anInt5910 * 130185305;
	     i_4_++) {
	    Node class241 = aClass241Array5907[i_4_];
	    for (;;) {
		Node class241_5_ = class241.previousNode;
		if (class241_5_ == class241)
		    break;
		class241_5_.remove((byte) 36);
	    }
	}
	aClass241_5909 = null;
	aClass241_5906 = null;
    }
    
    public Node method7294(int i) {
	anInt5911 = 0;
	return method7295(1660633494);
    }
    
    public Node method7295(int i) {
	if (-1295719697 * anInt5911 > 0
	    && (aClass241_5906
		!= (aClass241Array5907
		    [anInt5911 * -1295719697 - 1]))) {
	    Node class241 = aClass241_5906;
	    aClass241_5906 = class241.previousNode;
	    return class241;
	}
	while (-1295719697 * anInt5911
	       < 130185305 * anInt5910) {
	    Node class241
		= (aClass241Array5907
		   [((anInt5911 += 459574287) * -1295719697
		     - 1)]
		   .previousNode);
	    if ((aClass241Array5907
		 [-1295719697 * anInt5911 - 1])
		!= class241) {
		aClass241_5906 = class241.previousNode;
		return class241;
	    }
	}
	return null;
    }
    
    public Node method7296() {
	if (-1295719697 * anInt5911 > 0
	    && (aClass241_5906
		!= (aClass241Array5907
		    [anInt5911 * -1295719697 - 1]))) {
	    Node class241 = aClass241_5906;
	    aClass241_5906 = class241.previousNode;
	    return class241;
	}
	while (-1295719697 * anInt5911
	       < 130185305 * anInt5910) {
	    Node class241
		= (aClass241Array5907
		   [((anInt5911 += 459574287) * -1295719697
		     - 1)]
		   .previousNode);
	    if ((aClass241Array5907
		 [-1295719697 * anInt5911 - 1])
		!= class241) {
		aClass241_5906 = class241.previousNode;
		return class241;
	    }
	}
	return null;
    }
    
    public Node method7297(long l) {
	aLong5908 = -1351226491625197621L * l;
	Node class241
	    = (aClass241Array5907
	       [(int) (l & (long) (130185305 * anInt5910
				   - 1))]);
	for (aClass241_5909 = class241.previousNode;
	     class241 != aClass241_5909;
	     aClass241_5909
		 = aClass241_5909.previousNode) {
	    if (l == (aClass241_5909.hashCode
		      * 4356572401218184725L)) {
		Node class241_6_ = aClass241_5909;
		aClass241_5909
		    = aClass241_5909.previousNode;
		return class241_6_;
	    }
	}
	aClass241_5909 = null;
	return null;
    }
    
    public void method7298() {
	for (int i = 0; i < anInt5910 * 130185305; i++) {
	    Node class241 = aClass241Array5907[i];
	    for (;;) {
		Node class241_7_ = class241.previousNode;
		if (class241_7_ == class241)
		    break;
		class241_7_.remove((byte) 36);
	    }
	}
	aClass241_5909 = null;
	aClass241_5906 = null;
    }
    
    public HashTable(int i) {
		anInt5910 = i * -937078807;
		aClass241Array5907 = new Node[i];
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
		    Node class241 = aClass241Array5907[i_8_] = new Node();
		    class241.previousNode = class241;
		    class241.nextNode = class241;
		}
    }
    
    public Node method7299(long l) {
	aLong5908 = -1351226491625197621L * l;
	Node class241
	    = (aClass241Array5907
	       [(int) (l & (long) (130185305 * anInt5910
				   - 1))]);
	for (aClass241_5909 = class241.previousNode;
	     class241 != aClass241_5909;
	     aClass241_5909
		 = aClass241_5909.previousNode) {
	    if (l == (aClass241_5909.hashCode
		      * 4356572401218184725L)) {
		Node class241_9_ = aClass241_5909;
		aClass241_5909
		    = aClass241_5909.previousNode;
		return class241_9_;
	    }
	}
	aClass241_5909 = null;
	return null;
    }
    
    public int method7300(Node[] class241s) {
	int i = 0;
	for (int i_10_ = 0; i_10_ < anInt5910 * 130185305;
	     i_10_++) {
	    Node class241 = aClass241Array5907[i_10_];
	    for (Node class241_11_ = class241.previousNode;
		 class241_11_ != class241;
		 class241_11_ = class241_11_.previousNode)
		class241s[i++] = class241_11_;
	}
	return i;
    }
    
    public int method7301(Node[] class241s) {
	int i = 0;
	for (int i_12_ = 0; i_12_ < anInt5910 * 130185305;
	     i_12_++) {
	    Node class241 = aClass241Array5907[i_12_];
	    for (Node class241_13_ = class241.previousNode;
		 class241_13_ != class241;
		 class241_13_ = class241_13_.previousNode)
		class241s[i++] = class241_13_;
	}
	return i;
    }
    
    public int method7302(Node[] class241s) {
	int i = 0;
	for (int i_14_ = 0; i_14_ < anInt5910 * 130185305;
	     i_14_++) {
	    Node class241 = aClass241Array5907[i_14_];
	    for (Node class241_15_ = class241.previousNode;
		 class241_15_ != class241;
		 class241_15_ = class241_15_.previousNode)
		class241s[i++] = class241_15_;
	}
	return i;
    }
    
    public Iterator<Object> method7303() {
    	return new Class403(this);
    }
    
    public Iterator<Object> iterator() {
    	return new Class403(this);
    }
    
    public void method7304() {
	for (int i = 0; i < anInt5910 * 130185305; i++) {
	    Node class241 = aClass241Array5907[i];
	    for (;;) {
		Node class241_16_ = class241.previousNode;
		if (class241_16_ == class241)
		    break;
		class241_16_.remove((byte) 36);
	    }
	}
	aClass241_5909 = null;
	aClass241_5906 = null;
    }
    
    public int method7305(Node[] class241s, int i) {
		int i_17_ = 0;
		for (int index = 0; index < anInt5910 * 130185305; index++) {
		    Node class241 = aClass241Array5907[index];
		    for (Node class241_19_ = class241.previousNode; 
		    		class241_19_ != class241;
		    		class241_19_ = class241_19_.previousNode) {
		    	class241s[i_17_++] = class241_19_;
		    }
		}
		return i_17_;
    }
    
    public int method7306(int i) {
	int i_20_ = 0;
	for (int i_21_ = 0; i_21_ < anInt5910 * 130185305;
	     i_21_++) {
	    Node class241 = aClass241Array5907[i_21_];
	    for (Node class241_22_ = class241.previousNode;
		 class241_22_ != class241;
		 class241_22_ = class241_22_.previousNode)
		i_20_++;
	}
	return i_20_;
    }
    
    public Node method7307() {
	anInt5911 = 0;
	return method7295(1164475456);
    }
    
    public Node method7308() {
	anInt5911 = 0;
	return method7295(106079445);
    }
    
    public Node method7309() {
	anInt5911 = 0;
	return method7295(252483244);
    }
    
    public Node method7310() {
	anInt5911 = 0;
	return method7295(-207462451);
    }
    
    public Node method7311() {
	if (-1295719697 * anInt5911 > 0
	    && (aClass241_5906
		!= (aClass241Array5907
		    [anInt5911 * -1295719697 - 1]))) {
	    Node class241 = aClass241_5906;
	    aClass241_5906 = class241.previousNode;
	    return class241;
	}
	while (-1295719697 * anInt5911
	       < 130185305 * anInt5910) {
	    Node class241
		= (aClass241Array5907
		   [((anInt5911 += 459574287) * -1295719697
		     - 1)]
		   .previousNode);
	    if ((aClass241Array5907
		 [-1295719697 * anInt5911 - 1])
		!= class241) {
		aClass241_5906 = class241.previousNode;
		return class241;
	    }
	}
	return null;
    }
    
    public Node method7312() {
	if (-1295719697 * anInt5911 > 0
	    && (aClass241_5906
		!= (aClass241Array5907
		    [anInt5911 * -1295719697 - 1]))) {
	    Node class241 = aClass241_5906;
	    aClass241_5906 = class241.previousNode;
	    return class241;
	}
	while (-1295719697 * anInt5911
	       < 130185305 * anInt5910) {
	    Node class241
		= (aClass241Array5907
		   [((anInt5911 += 459574287) * -1295719697
		     - 1)]
		   .previousNode);
	    if ((aClass241Array5907
		 [-1295719697 * anInt5911 - 1])
		!= class241) {
		aClass241_5906 = class241.previousNode;
		return class241;
	    }
	}
	return null;
    }
    
    public void method7313(Node class241, long l) {
	if (class241.nextNode != null)
	    class241.remove((byte) 36);
	Node class241_23_
	    = (aClass241Array5907
	       [(int) (l & (long) (130185305 * anInt5910
				   - 1))]);
	class241.nextNode = class241_23_.nextNode;
	class241.previousNode = class241_23_;
	class241.nextNode.previousNode = class241;
	class241.previousNode.nextNode = class241;
	class241.hashCode = l * -84545867636262595L;
    }
    
    public Iterator<?> method7314() {
	return new Class403(this);
    }
    
    public Node method7315() {
	if (-1295719697 * anInt5911 > 0
	    && (aClass241_5906
		!= (aClass241Array5907
		    [anInt5911 * -1295719697 - 1]))) {
	    Node class241 = aClass241_5906;
	    aClass241_5906 = class241.previousNode;
	    return class241;
	}
	while (-1295719697 * anInt5911
	       < 130185305 * anInt5910) {
	    Node class241
		= (aClass241Array5907
		   [((anInt5911 += 459574287) * -1295719697
		     - 1)]
		   .previousNode);
	    if ((aClass241Array5907
		 [-1295719697 * anInt5911 - 1])
		!= class241) {
		aClass241_5906 = class241.previousNode;
		return class241;
	    }
	}
	return null;
    }
    
    public void method7316(Node class241, long l) {
	if (class241.nextNode != null)
	    class241.remove((byte) 36);
	Node class241_24_
	    = (aClass241Array5907
	       [(int) (l & (long) (130185305 * anInt5910
				   - 1))]);
	class241.nextNode = class241_24_.nextNode;
	class241.previousNode = class241_24_;
	class241.nextNode.previousNode = class241;
	class241.previousNode.nextNode = class241;
	class241.hashCode = l * -84545867636262595L;
    }
    
    static final int method7317(Entity entity, byte i) {
		if (0 == entity.anInt11400 * -683062517) {
		    return 0;
		}
		if (-1 != entity.facingEntity * -36064791) {
		    Entity facingEntity = null;
		    if (entity.facingEntity * -36064791 < 32768) {
				ObjectNode class241_sub26 = ((ObjectNode)
				       (client.aClass407_8457.get((long) (-36064791 * entity.facingEntity))));
				if (null != class241_sub26) {
					facingEntity = ((Entity) class241_sub26.objectValue);
				}
		    } else if (-36064791 * entity.facingEntity >= 32768) {
		    	facingEntity = client.localPlayers[(-36064791 * entity.facingEntity - 32768)];
		    }
		    if (facingEntity != null) {
				Class287 class287 = Class287.method5578((entity.method10874().aClass287_4386),
						facingEntity.method10874().aClass287_4386);
				int i_26_ = (int) class287.aFloat4477;
				int i_27_ = (int) class287.aFloat4479;
				if (i_26_ != 0 || i_27_ != 0)
					entity.method17804((int) (Math.atan2((double) i_26_, (double) i_27_) * 2607.5945876176133) & 0x3fff,
							1466620401);
		    }
		}
		if (entity instanceof Player) {
		    Player player = (Player) entity;
		    if (-1 != player.facingDirection * -989200205 
		    		&& (-316498507 * player.queuedStepCount == 0 || (-1986268577 * player.anInt11429 > 0))) {
		    	player.method17804(-989200205 * player.facingDirection, 2059808757);
		    	player.facingDirection = -1164488315;
		    }
		} else if (entity instanceof NPC) {
		    NPC npc = (NPC) entity;
		    if (-1 != npc.anInt11521 * -1331399511 && (0 == -316498507 * npc.queuedStepCount
		    		|| (npc.anInt11429 * -1986268577 > 0))) {
				Class287 class287 = (npc.method10874().aClass287_4386);
				GameScene tile = client.aClass238_8477.method4806((byte) 1);
				int i_28_ = ((int) class287.aFloat4477
				       - (npc.anInt11521 * -1535858432
					  - tile.baseX * -1673783040
					  - tile.baseX * -1673783040));
				int i_29_ = ((int) class287.aFloat4479
				       - (npc.anInt11522 * -1670009600
					  - -308058880 * tile.baseY
					  - -308058880 * tile.baseY));
				if (i_28_ != 0 || i_29_ != 0)
					npc.method17804
					((int) (Math.atan2((double) i_28_, (double) i_29_)
						* 2607.5945876176133) & 0x3fff,
					 1706648032);
				npc.anInt11521 = 373723239;
		    }
		}
		return entity.method17772(-1041430751);
    }
    
    static final void method7318(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class21.myPlayer.aClass8_11406
		  .method514((byte) 56);
    }
    
    public static void method7319(int i, byte i_30_) {
	if (i < 1)
	    Class573_Sub1.anInt8783 = Class573_Sub1.anInt8770 * -1978949439;
	else
	    Class573_Sub1.anInt8783 = i * -381438161;
    }
    
    static final void method7320(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863
		  .method14211(870359461);
    }
    
    static final void method7321(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.anInt882 * -516485199;
    }
    
    public static String method7322(int i, boolean bool, int i_31_) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class590.method12909(i, 10, bool, 1213011492);
    }
}
