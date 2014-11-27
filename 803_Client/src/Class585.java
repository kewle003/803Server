/* Class585 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class585 implements Interface18
{
    String js5path;//aString7590
    Hashtable<String, Class<?>> aHashtable7591;
    Hashtable<String, File> libraryCache = new Hashtable<String, File>();//aHashtable7592
    JS5 aClass210_7593;
    
    void dummyMethod12836(String string, Class<?> var_class) throws Exception_Sub4 {
	Class<?> var_class_0_
	    = (Class<?>) aHashtable7591.get(string);
	if (null != var_class_0_
	    && var_class_0_.getClassLoader() != var_class.getClassLoader())
	    throw new Exception_Sub4(1, string);
	File file = null;
	if (null == file)
	    file = (File) libraryCache.get(string);
	if (null != file) {
	    try {
			file = new File(file.getCanonicalPath());
			Class<?> var_class_1_ = Class.forName("java.lang.Runtime");
			Class<?> var_class_2_ = Class.forName("java.lang.reflect.AccessibleObject");
			Method method = var_class_2_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
			Method method_3_
			    = (var_class_1_.getDeclaredMethod
			       ("load0",
				new Class[] { Class.forName("java.lang.Class"),
					      Class.forName("java.lang.String") }));
			method.invoke(method_3_, new Object[] { Boolean.TRUE });
			method_3_.invoke(Runtime.getRuntime(),
					 new Object[] { var_class, file.getPath() });
			method.invoke(method_3_, new Object[] { Boolean.FALSE });
			aHashtable7591.put(string, var_class);
	    } catch (NoSuchMethodException nosuchmethodexception) {
			System.load(file.getPath());
			aHashtable7591.put(string, Class574.class);
	    } catch (Throwable throwable) {
	    	throw new Exception_Sub4(3, string, throwable);
	    }
	} else
	    throw new Exception_Sub4(4, string);
    }
    
    public int load/*method12837*/(String libraryName, int i) throws Exception_Sub3 {//Used
		if (libraryCache.containsKey(libraryName)) {
		    return 100;
		}
		String string_4_ = Class292.method5688(libraryName, -887812880);
		if (string_4_ == null) {
		    throw new Exception_Sub3(1, libraryName);
		}
		String string_5_ = null;
		if (null == string_5_) {
		    string_5_ = new StringBuilder().append
				    (js5path).append
				    (string_4_).toString();
		    if (!aClass210_7593.method4205(string_5_, "",
								     (byte) 34))
			throw new Exception_Sub3(2, libraryName);
		}
		if (!aClass210_7593.containerIdentifierExists(string_5_, -1626287654)) {
		    return aClass210_7593.method4210(string_5_, -1376729938);
		}
		byte[] data = aClass210_7593.readContainerByIndentifiers(string_5_, "", -311482433);
		if (null == data) {
		    throw new Exception_Sub3(3, libraryName);
		}
		//Object object = null;
		File file;
		try {
		    file = Class434_Sub3_Sub3.method17068(string_4_, -81975792);
		} catch (RuntimeException runtimeexception) {
		    throw new Exception_Sub3(4, libraryName, runtimeexception);
		}
		if (null == file) {
		    throw new Exception_Sub3(5, libraryName);
		}
		boolean bool = true;
		byte[] is_6_ = Class225.method4626(file, -1124012062);
		if (is_6_ != null && is_6_.length == data.length) {
		    for (int i_7_ = 0; i_7_ < is_6_.length; i_7_++) {
				if (is_6_[i_7_] != data[i_7_]) {
				    bool = false;
				    break;
				}
		    }
		} else {
		    bool = false;
		}
		if (!bool) {
		    try {
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				fileoutputstream.write(data, 0, data.length);
				fileoutputstream.close();
		    } catch (IOException throwable) {
		    	throw new Exception_Sub3(6, libraryName, throwable);
		    }
		}
		register(libraryName, file, (short) -71);
		return 100;
    }
    
    void register/*method12838*/(String string, File file, short i) {
    	libraryCache.put(string, file);
    }
    
    void dummyMethod12839(String string, File file) {
    	libraryCache.put(string, file);
    }
    
    public boolean method12840(String string, byte i) {//Used
    	return aHashtable7591.containsKey(string);
    }
    
    public void method109(String string, int i) throws Exception_Sub4 {
	method12841(string, Class574.class, (byte) 0);
    }
    
    void method12841(String string, Class<?> var_class, byte i) throws Exception_Sub4 {//Used
	Class<?> var_class_8_
	    = (Class<?>) aHashtable7591.get(string);
	if (null != var_class_8_
	    && var_class_8_.getClassLoader() != var_class.getClassLoader())
	    throw new Exception_Sub4(1, string);
	File file = null;
	if (null == file)
	    file = (File) libraryCache.get(string);
	if (null != file) {
	    try {
		file = new File(file.getCanonicalPath());
		Class<?> var_class_9_ = Class.forName("java.lang.Runtime");
		Class<?> var_class_10_
		    = Class.forName("java.lang.reflect.AccessibleObject");
		Method method
		    = var_class_10_.getDeclaredMethod("setAccessible",
						      (new Class[]
						       { Boolean.TYPE }));
		Method method_11_
		    = (var_class_9_.getDeclaredMethod
		       ("load0",
			new Class[] { Class.forName("java.lang.Class"),
				      Class.forName("java.lang.String") }));
		method.invoke(method_11_, new Object[] { Boolean.TRUE });
		method_11_.invoke(Runtime.getRuntime(),
				  new Object[] { var_class, file.getPath() });
		method.invoke(method_11_, new Object[] { Boolean.FALSE });
		aHashtable7591.put(string, var_class);
	    } catch (NoSuchMethodException nosuchmethodexception) {
		System.load(file.getPath());
		aHashtable7591.put(string, Class574.class);
	    } catch (Throwable throwable) {
		throw new Exception_Sub4(3, string, throwable);
	    }
	} else
	    throw new Exception_Sub4(4, string);
    }
    
    void dummyMethod12842(String string, File file) {
    	libraryCache.put(string, file);
    }
    
    public boolean method107(int i) {//Used
	Hashtable<String, Class<?>> hashtable = new Hashtable<String, Class<?>>();
	Enumeration<String> enumeration = aHashtable7591.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string,
			  aHashtable7591.get(string));
	}
	try {
	    Class<?> var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class<?> var_class_12_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_12_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7591.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file
			    = ((File)
			       libraryCache.get(string));
			Class<?> var_class_13_
			    = ((Class<?>)
			       aHashtable7591.get(string));
			Vector<?> vector
			    = ((Vector<?>)
			       field.get(var_class_13_.getClassLoader()));
			for (int i_14_ = 0; i_14_ < vector.size(); i_14_++) {
			    try {
				Object object = vector.elementAt(i_14_);
				Field field_15_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_15_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_16_
					= (String) field_15_.get(object);
				    if (string_16_ != null
					&& (string_16_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_17_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_18_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_17_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_18_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_18_.invoke(object,
							      new Object[0]);
					    field_17_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_18_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_17_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_15_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7591 = hashtable;
	return aHashtable7591.isEmpty();
    }
    
    public boolean method108(String string, byte i) {
	return libraryCache.containsKey(string);
    }
    
    public boolean dummyMethod112(String string) {
    	return libraryCache.containsKey(string);
    }
    
    public boolean dummyMethod116() {
	Hashtable<String, Class<?>> hashtable = new Hashtable<String, Class<?>>();
	Enumeration<String> enumeration = aHashtable7591.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string,
			  aHashtable7591.get(string));
	}
	try {
	    Class<?> var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class<?> var_class_19_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_19_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7591.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file
			    = ((File)
			       libraryCache.get(string));
			Class<?> var_class_20_
			    = ((Class<?>)
			       aHashtable7591.get(string));
			Vector<?> vector
			    = ((Vector<?>)
			       field.get(var_class_20_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_21_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_21_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_22_
					= (String) field_21_.get(object);
				    if (string_22_ != null
					&& (string_22_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_23_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_24_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_23_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_24_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_24_.invoke(object,
							      new Object[0]);
					    field_23_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_24_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_23_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_21_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7591 = hashtable;
	return aHashtable7591.isEmpty();
    }
    
    public boolean dummyMethod113() {
	Hashtable<String, Class<?>> hashtable = new Hashtable<String, Class<?>>();
	Enumeration<String> enumeration = aHashtable7591.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string,
			  aHashtable7591.get(string));
	}
	try {
	    Class<?> var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class<?> var_class_25_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_25_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7591.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file
			    = ((File)
			       libraryCache.get(string));
			Class<?> var_class_26_
			    = ((Class<?>)
			       aHashtable7591.get(string));
			Vector<?> vector
			    = ((Vector<?>)
			       field.get(var_class_26_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_27_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_27_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_28_
					= (String) field_27_.get(object);
				    if (string_28_ != null
					&& (string_28_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_29_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_30_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_29_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_30_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_30_.invoke(object,
							      new Object[0]);
					    field_29_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_30_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_29_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_27_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7591 = hashtable;
	return aHashtable7591.isEmpty();
    }
    
    public void dummyMethod111(String string) throws Exception_Sub4 {
	method12841(string, Class574.class, (byte) 0);
    }
    
    public boolean dummyMethod114() {
	Hashtable<String, Class<?>> hashtable = new Hashtable<String, Class<?>>();
	Enumeration<String> enumeration = aHashtable7591.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string,
			  aHashtable7591.get(string));
	}
	try {
	    Class<?> var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class<?> var_class_31_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_31_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7591.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file
			    = ((File)
			       libraryCache.get(string));
			Class<?> var_class_32_
			    = ((Class<?>)
			       aHashtable7591.get(string));
			Vector<?> vector
			    = ((Vector<?>)
			       field.get(var_class_32_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_33_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_33_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_34_
					= (String) field_33_.get(object);
				    if (string_34_ != null
					&& (string_34_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_35_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_36_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_35_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_36_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_36_.invoke(object,
							      new Object[0]);
					    field_35_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_36_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_35_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_33_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7591 = hashtable;
	return aHashtable7591.isEmpty();
    }
    
    public boolean dummyMethod117() {
	Hashtable<String, Class<?>> hashtable = new Hashtable<String, Class<?>>();
	Enumeration<String> enumeration = aHashtable7591.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string,
			  aHashtable7591.get(string));
	}
	try {
	    Class<?> var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class<?> var_class_37_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_37_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7591.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file
			    = ((File)
			       libraryCache.get(string));
			Class<?> var_class_38_
			    = ((Class<?>)
			       aHashtable7591.get(string));
			Vector<?> vector
			    = ((Vector<?>)
			       field.get(var_class_38_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_39_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_39_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_40_
					= (String) field_39_.get(object);
				    if (string_40_ != null
					&& (string_40_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_41_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_42_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_41_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_42_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_42_.invoke(object,
							      new Object[0]);
					    field_41_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_42_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_41_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_39_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7591 = hashtable;
	return aHashtable7591.isEmpty();
    }
    
    public Class585(JS5 class210) {
    	this.aHashtable7591 = new Hashtable<String, Class<?>>();
    	this.aClass210_7593 = class210;
		String js5path = "";
		if (Class240.aString2771.startsWith("win")
				|| Class240.aString2771.startsWith("windows 7")) {
			js5path = new StringBuilder().append(js5path).append("windows/").toString();
		} else if (Class240.aString2771.startsWith("linux")) {
			js5path = new StringBuilder().append(js5path).append("linux/").toString();
		} else if (Class240.aString2771.startsWith("mac")) {
			js5path = new StringBuilder().append(js5path).append("macos/").toString();
		} 
		if (Class240.aString2769.startsWith("amd64") 
				|| Class240.aString2769.startsWith("x86_64")) {
			js5path = new StringBuilder().append(js5path).append("x86_64/").toString();
		} else if (Class240.aString2769.startsWith("i386")
				|| Class240.aString2769.startsWith("i486")
				|| Class240.aString2769.startsWith("i586")
				|| Class240.aString2769.startsWith("x86")) {
			js5path = new StringBuilder().append(js5path).append("x86/").toString();
		} else if (Class240.aString2769.startsWith("ppc")) {
			js5path = new StringBuilder().append(js5path).append("ppc/").toString();
		} else {
			js5path = new StringBuilder().append(js5path).append("universal/").toString();
		}
		this.js5path = js5path;
    }
    
    static String method12843(String string) {
	if (Class240.aString2771.startsWith("win"))
	    return new StringBuilder().append(string).append(".dll")
		       .toString();
	if (Class240.aString2771.startsWith("linux"))
	    return new StringBuilder().append("lib").append(string).append
		       (".so").toString();
	if (Class240.aString2771.startsWith("mac"))
	    return new StringBuilder().append("lib").append(string).append
		       (".dylib").toString();
	return null;
    }
    
    public void dummyMethod110(String string) throws Exception_Sub4 {
	method12841(string, Class574.class, (byte) 0);
    }
    
    void method12844(String string, Class<?> var_class) throws Exception_Sub4 {
	Class<?> var_class_43_
	    = (Class<?>) aHashtable7591.get(string);
	if (null != var_class_43_
	    && var_class_43_.getClassLoader() != var_class.getClassLoader())
	    throw new Exception_Sub4(1, string);
	File file = null;
	if (null == file)
	    file = (File) libraryCache.get(string);
	if (null != file) {
	    try {
		file = new File(file.getCanonicalPath());
		Class<?> var_class_44_ = Class.forName("java.lang.Runtime");
		Class<?> var_class_45_
		    = Class.forName("java.lang.reflect.AccessibleObject");
		Method method
		    = var_class_45_.getDeclaredMethod("setAccessible",
						      (new Class[]
						       { Boolean.TYPE }));
		Method method_46_
		    = (var_class_44_.getDeclaredMethod
		       ("load0",
			new Class[] { Class.forName("java.lang.Class"),
				      Class.forName("java.lang.String") }));
		method.invoke(method_46_, new Object[] { Boolean.TRUE });
		method_46_.invoke(Runtime.getRuntime(),
				  new Object[] { var_class, file.getPath() });
		method.invoke(method_46_, new Object[] { Boolean.FALSE });
		aHashtable7591.put(string, var_class);
	    } catch (NoSuchMethodException nosuchmethodexception) {
		System.load(file.getPath());
		aHashtable7591.put(string, Class574.class);
	    } catch (Throwable throwable) {
		throw new Exception_Sub4(3, string, throwable);
	    }
	} else
	    throw new Exception_Sub4(4, string);
    }
    
    public boolean dummyMethod115() {
	Hashtable<String, Class<?>> hashtable = new Hashtable<String, Class<?>>();
	Enumeration<String> enumeration = aHashtable7591.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string,
			  aHashtable7591.get(string));
	}
	try {
	    Class<?> var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class<?> var_class_47_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_47_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7591.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file
			    = ((File)
			       libraryCache.get(string));
			Class<?> var_class_48_
			    = ((Class<?>)
			       aHashtable7591.get(string));
			Vector<?> vector
			    = ((Vector<?>)
			       field.get(var_class_48_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_49_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_49_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_50_
					= (String) field_49_.get(object);
				    if (string_50_ != null
					&& (string_50_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_51_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_52_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_51_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_52_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_52_.invoke(object,
							      new Object[0]);
					    field_51_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_52_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_51_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_49_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7591 = hashtable;
	return aHashtable7591.isEmpty();
    }
    
    void method12845(String string, Class<?> var_class) throws Exception_Sub4 {
	Class<?> var_class_53_
	    = (Class<?>) aHashtable7591.get(string);
	if (null != var_class_53_
	    && var_class_53_.getClassLoader() != var_class.getClassLoader())
	    throw new Exception_Sub4(1, string);
	File file = null;
	if (null == file)
	    file = (File) libraryCache.get(string);
	if (null != file) {
	    try {
		file = new File(file.getCanonicalPath());
		Class<?> var_class_54_ = Class.forName("java.lang.Runtime");
		Class<?> var_class_55_
		    = Class.forName("java.lang.reflect.AccessibleObject");
		Method method
		    = var_class_55_.getDeclaredMethod("setAccessible",
						      (new Class[]
						       { Boolean.TYPE }));
		Method method_56_
		    = (var_class_54_.getDeclaredMethod
		       ("load0",
			new Class[] { Class.forName("java.lang.Class"),
				      Class.forName("java.lang.String") }));
		method.invoke(method_56_, new Object[] { Boolean.TRUE });
		method_56_.invoke(Runtime.getRuntime(),
				  new Object[] { var_class, file.getPath() });
		method.invoke(method_56_, new Object[] { Boolean.FALSE });
		aHashtable7591.put(string, var_class);
	    } catch (NoSuchMethodException nosuchmethodexception) {
		System.load(file.getPath());
		aHashtable7591.put(string, Class574.class);
	    } catch (Throwable throwable) {
		throw new Exception_Sub4(3, string, throwable);
	    }
	} else
	    throw new Exception_Sub4(4, string);
    }
    
    void method12846(String string, Class<?> var_class) throws Exception_Sub4 {
	Class<?> var_class_57_
	    = (Class<?>) aHashtable7591.get(string);
	if (null != var_class_57_
	    && var_class_57_.getClassLoader() != var_class.getClassLoader())
	    throw new Exception_Sub4(1, string);
	File file = null;
	if (null == file)
	    file = (File) libraryCache.get(string);
	if (null != file) {
	    try {
		file = new File(file.getCanonicalPath());
		Class<?> var_class_58_ = Class.forName("java.lang.Runtime");
		Class<?> var_class_59_
		    = Class.forName("java.lang.reflect.AccessibleObject");
		Method method
		    = var_class_59_.getDeclaredMethod("setAccessible",
						      (new Class[]
						       { Boolean.TYPE }));
		Method method_60_
		    = (var_class_58_.getDeclaredMethod
		       ("load0",
			new Class[] { Class.forName("java.lang.Class"),
				      Class.forName("java.lang.String") }));
		method.invoke(method_60_, new Object[] { Boolean.TRUE });
		method_60_.invoke(Runtime.getRuntime(),
				  new Object[] { var_class, file.getPath() });
		method.invoke(method_60_, new Object[] { Boolean.FALSE });
		aHashtable7591.put(string, var_class);
	    } catch (NoSuchMethodException nosuchmethodexception) {
		System.load(file.getPath());
		aHashtable7591.put(string, Class574.class);
	    } catch (Throwable throwable) {
		throw new Exception_Sub4(3, string, throwable);
	    }
	} else
	    throw new Exception_Sub4(4, string);
    }
    
    static final void method12847(ClientScriptData class454, byte i) {
	int i_61_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (2 == -2020075851 * client.friendListStage
	    && i_61_ < client.friendListSize * 1557840217)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= client.friendList[i_61_].serverName;
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
    }
    
    static final void method12848(ClientScriptData class454, byte i) {
	int i_62_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (i_62_ == -1)
	    throw new RuntimeException();
	ClientScriptMap class406
	    = Class105_Sub1.cs2MapsList.list(i_62_, (byte) -127);
	if ('s' != class406.aChar5898)
	    throw new RuntimeException();
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class406.method7254(string, -1952831675) ? 1 : 0;
    }
    
    public static Class241_Sub39_Sub11 method12849(int i) {
	return Class125.aClass241_Sub39_Sub11_1582;
    }
    
    static final void storeClanMemberIndex/*method12850*/(ClientScriptData scriptData, byte i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= scriptData.clanSettings.getClanMemberIndex(
    					(String) scriptData.objectStack[((scriptData.objectStackPointer -= -1650705371) * -290357331)],
    					2071398901);
    }
    
    static final void method12851(ClientScriptData class454, byte i) {
	int i_63_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (i_63_ >= 1 && i_63_ <= 2)
	    Class537.method11899(i_63_, -1, -1, false, 1482319719);
    }
}
