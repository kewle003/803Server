/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class74 {
	JS5 aClass210_1106;
	Class129 aClass129_1107 = new Class129(16);
	static int baseTileY;//anInt1108

	public Class74(GameDefinition class471, Language class437,
			JS5 class210) {
		((Class74) this).aClass210_1106 = class210;
		((Class74) this).aClass210_1106.getContainerCount(
				(Js5ConfigGroup.aClass37_413.id) * -1379677837, (byte) -37);
	}

	public Class64 method1750(int i, int i_0_) {
		Class64 class64;
		synchronized (((Class74) this).aClass129_1107) {
			class64 = ((Class64) ((Class74) this).aClass129_1107.get((long) i));
		}
		if (class64 != null)
			return class64;
		byte[] is;
		synchronized (((Class74) this).aClass210_1106) {
			is = ((Class74) this).aClass210_1106.getfile(
					((Js5ConfigGroup.aClass37_413.id) * -1379677837), i,
					494156238);
		}
		class64 = new Class64();
		if (is != null)
			class64.method1624(new RSByteBuffer(is), (byte) 10);
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.put(class64, (long) i);
		}
		return class64;
	}

	public void method1751(int i) {
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.reset(-1304663401);
		}
	}

	public void method1752() {
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.reset(-2083459246);
		}
	}

	public void method1753(byte i) {
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.removeSoftReferences((byte) 38);
		}
	}

	public Class64 method1754(int i) {
		Class64 class64;
		synchronized (((Class74) this).aClass129_1107) {
			class64 = ((Class64) ((Class74) this).aClass129_1107.get((long) i));
		}
		if (class64 != null)
			return class64;
		byte[] is;
		synchronized (((Class74) this).aClass210_1106) {
			is = ((Class74) this).aClass210_1106.getfile(
					((Js5ConfigGroup.aClass37_413.id) * -1379677837), i,
					-745782941);
		}
		class64 = new Class64();
		if (is != null)
			class64.method1624(new RSByteBuffer(is), (byte) -31);
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.put(class64, (long) i);
		}
		return class64;
	}

	public Class64 method1755(int i) {
		Class64 class64;
		synchronized (((Class74) this).aClass129_1107) {
			class64 = ((Class64) ((Class74) this).aClass129_1107.get((long) i));
		}
		if (class64 != null)
			return class64;
		byte[] is;
		synchronized (((Class74) this).aClass210_1106) {
			is = ((Class74) this).aClass210_1106.getfile(
					((Js5ConfigGroup.aClass37_413.id) * -1379677837), i,
					1805425986);
		}
		class64 = new Class64();
		if (is != null)
			class64.method1624(new RSByteBuffer(is), (byte) 47);
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.put(class64, (long) i);
		}
		return class64;
	}

	public void method1756() {
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.removeSoftReferences((byte) 33);
		}
	}

	public void method1757() {
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.reset(-1743655376);
		}
	}

	public void method1758(int i, byte i_1_) {
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.clean(i, -2086935161);
		}
	}

	public void method1759() {
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.removeSoftReferences((byte) 46);
		}
	}

	public void method1760() {
		synchronized (((Class74) this).aClass129_1107) {
			((Class74) this).aClass129_1107.reset(-2022287253);
		}
	}

	static void method1761(Entity entity, int i) {
		if (entity instanceof NPC) {
			NPC class475_sub1_sub1_sub3_sub2 = (NPC) entity;
			if (null != class475_sub1_sub1_sub3_sub2.definition)
				Class465.method10716(
						class475_sub1_sub1_sub3_sub2,
						(class475_sub1_sub1_sub3_sub2.nodePlane != (Class21.myPlayer.nodePlane)),
						(byte) -43);
		} else if (entity instanceof Player) {
			Player class475_sub1_sub1_sub3_sub1 = (Player) entity;
			Class42.method1066(
					class475_sub1_sub1_sub3_sub1,
					(class475_sub1_sub1_sub3_sub1.nodePlane != (Class21.myPlayer.nodePlane)),
					184291902);
		}
	}

	static final void method1762(ClientScriptData class454, byte i) {
		Class351_Sub1.method16841((byte) 24);
	}
}
