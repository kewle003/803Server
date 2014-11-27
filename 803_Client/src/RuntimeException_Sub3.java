/* RuntimeException_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class RuntimeException_Sub3 extends RuntimeException
{
    static long aLong11292;
    public static String myPlayerDisplayName;//aString11293
    public static int anInt11294;
    public static int anInt11295;
    String aString11296;
    Throwable aThrowable11297;
    
    static final void method17681(String string) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class434_Sub3_Sub2.method17023(string, "%0a",
							       "\n",
							       -1704703124))
			       .toString());
    }
    
    public static void method17682(String string, Throwable throwable) {
	try {
	    String string_0_ = "";
	    if (null != throwable)
		string_0_ = ServerConnection.method3912(throwable, -1279977702);
	    if (null != string) {
		if (null != throwable)
		    string_0_ = new StringBuilder().append(string_0_).append
				    (" | ").toString();
		string_0_ = new StringBuilder().append(string_0_).append
				(string).toString();
	    }
	    CsDelta_SetName.method17448(string_0_, -1934749592);
	    string_0_ = Class582.method12774(string_0_, -2079181559);
	    if (Class421.anApplet6042 != null) {
		String string_1_ = "Unknown";
		String string_2_ = "1.1";
		try {
		    string_1_ = System.getProperty("java.vendor");
		    string_2_ = System.getProperty("java.version");
		} catch (Exception exception) {
		    /* empty */
		}
		URL url
		    = new URL(Class421.anApplet6042.getCodeBase(),
			      new StringBuilder().append
				  ("clienterror.ws?c=").append
				  (-644092443 * anInt11294).append
				  ("&cs=").append
				  (364911843 * anInt11295).append
				  ("&u=").append
				  (null != myPlayerDisplayName
				   ? Class582.method12774(myPlayerDisplayName,
							  -2036931169)
				   : new StringBuilder().append("").append
					 (aLong11292 * -3684180253031378575L)
					 .toString())
				  .append
				  ("&v1=").append
				  (Class582.method12774(string_1_,
							-2079020833))
				  .append
				  ("&v2=").append
				  (Class582.method12774(string_2_,
							-2100607302))
				  .append
				  ("&e=").append
				  (string_0_).toString());
		DataInputStream datainputstream
		    = new DataInputStream(url.openStream());
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }
    
    public static RuntimeException_Sub3 method17683(Throwable throwable,
						    String string) {
	RuntimeException_Sub3 runtimeexception_sub3;
	if (throwable instanceof RuntimeException_Sub3) {
	    runtimeexception_sub3 = (RuntimeException_Sub3) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub3 runtimeexception_sub3_3_
		= runtimeexception_sub3;
	    ((RuntimeException_Sub3) runtimeexception_sub3_3_).aString11296
		= stringbuilder.append
		      (((RuntimeException_Sub3) runtimeexception_sub3_3_)
		       .aString11296)
		      .append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub3
		= new RuntimeException_Sub3(throwable, string);
	return runtimeexception_sub3;
    }
    
    public static RuntimeException_Sub3 method17684(Throwable throwable,
						    String string) {
	RuntimeException_Sub3 runtimeexception_sub3;
	if (throwable instanceof RuntimeException_Sub3) {
	    runtimeexception_sub3 = (RuntimeException_Sub3) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub3 runtimeexception_sub3_4_
		= runtimeexception_sub3;
	    ((RuntimeException_Sub3) runtimeexception_sub3_4_).aString11296
		= stringbuilder.append
		      (((RuntimeException_Sub3) runtimeexception_sub3_4_)
		       .aString11296)
		      .append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub3
		= new RuntimeException_Sub3(throwable, string);
	return runtimeexception_sub3;
    }
    
    static String method17685(Throwable throwable) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub3) {
	    RuntimeException_Sub3 runtimeexception_sub3
		= (RuntimeException_Sub3) throwable;
	    string = new StringBuilder().append
			 (((RuntimeException_Sub3) runtimeexception_sub3)
			  .aString11296)
			 .append
			 (" | ").toString();
	    throwable = (((RuntimeException_Sub3) runtimeexception_sub3)
			 .aThrowable11297);
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_5_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_5_));
	String string_6_ = bufferedreader.readLine();
	for (;;) {
	    String string_7_ = bufferedreader.readLine();
	    if (null == string_7_)
		break;
	    int i = string_7_.indexOf('(');
	    int i_8_ = string_7_.indexOf(')', i + 1);
	    String string_9_;
	    if (i != -1)
		string_9_ = string_7_.substring(0, i);
	    else
		string_9_ = string_7_;
	    string_9_ = string_9_.trim();
	    string_9_ = string_9_.substring(string_9_.lastIndexOf(' ') + 1);
	    string_9_ = string_9_.substring(string_9_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_9_)
			 .toString();
	    if (-1 != i && -1 != i_8_) {
		int i_10_ = string_7_.indexOf(".java:", i);
		if (i_10_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_7_.substring(5 + i_10_, i_8_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_6_).toString();
	return string;
    }
    
    static String method17686(Throwable throwable) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub3) {
	    RuntimeException_Sub3 runtimeexception_sub3
		= (RuntimeException_Sub3) throwable;
	    string = new StringBuilder().append
			 (((RuntimeException_Sub3) runtimeexception_sub3)
			  .aString11296)
			 .append
			 (" | ").toString();
	    throwable = (((RuntimeException_Sub3) runtimeexception_sub3)
			 .aThrowable11297);
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_11_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_11_));
	String string_12_ = bufferedreader.readLine();
	for (;;) {
	    String string_13_ = bufferedreader.readLine();
	    if (null == string_13_)
		break;
	    int i = string_13_.indexOf('(');
	    int i_14_ = string_13_.indexOf(')', i + 1);
	    String string_15_;
	    if (i != -1)
		string_15_ = string_13_.substring(0, i);
	    else
		string_15_ = string_13_;
	    string_15_ = string_15_.trim();
	    string_15_ = string_15_.substring(string_15_.lastIndexOf(' ') + 1);
	    string_15_
		= string_15_.substring(string_15_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_15_)
			 .toString();
	    if (-1 != i && -1 != i_14_) {
		int i_16_ = string_13_.indexOf(".java:", i);
		if (i_16_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_13_.substring(5 + i_16_, i_14_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_12_).toString();
	return string;
    }
    
    static String method17687(Throwable throwable) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub3) {
	    RuntimeException_Sub3 runtimeexception_sub3
		= (RuntimeException_Sub3) throwable;
	    string = new StringBuilder().append
			 (((RuntimeException_Sub3) runtimeexception_sub3)
			  .aString11296)
			 .append
			 (" | ").toString();
	    throwable = (((RuntimeException_Sub3) runtimeexception_sub3)
			 .aThrowable11297);
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_17_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_17_));
	String string_18_ = bufferedreader.readLine();
	for (;;) {
	    String string_19_ = bufferedreader.readLine();
	    if (null == string_19_)
		break;
	    int i = string_19_.indexOf('(');
	    int i_20_ = string_19_.indexOf(')', i + 1);
	    String string_21_;
	    if (i != -1)
		string_21_ = string_19_.substring(0, i);
	    else
		string_21_ = string_19_;
	    string_21_ = string_21_.trim();
	    string_21_ = string_21_.substring(string_21_.lastIndexOf(' ') + 1);
	    string_21_
		= string_21_.substring(string_21_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_21_)
			 .toString();
	    if (-1 != i && -1 != i_20_) {
		int i_22_ = string_19_.indexOf(".java:", i);
		if (i_22_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_19_.substring(5 + i_22_, i_20_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_18_).toString();
	return string;
    }
    
    static String method17688(Throwable throwable) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub3) {
	    RuntimeException_Sub3 runtimeexception_sub3
		= (RuntimeException_Sub3) throwable;
	    string = new StringBuilder().append
			 (((RuntimeException_Sub3) runtimeexception_sub3)
			  .aString11296)
			 .append
			 (" | ").toString();
	    throwable = (((RuntimeException_Sub3) runtimeexception_sub3)
			 .aThrowable11297);
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_23_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_23_));
	String string_24_ = bufferedreader.readLine();
	for (;;) {
	    String string_25_ = bufferedreader.readLine();
	    if (null == string_25_)
		break;
	    int i = string_25_.indexOf('(');
	    int i_26_ = string_25_.indexOf(')', i + 1);
	    String string_27_;
	    if (i != -1)
		string_27_ = string_25_.substring(0, i);
	    else
		string_27_ = string_25_;
	    string_27_ = string_27_.trim();
	    string_27_ = string_27_.substring(string_27_.lastIndexOf(' ') + 1);
	    string_27_
		= string_27_.substring(string_27_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_27_)
			 .toString();
	    if (-1 != i && -1 != i_26_) {
		int i_28_ = string_25_.indexOf(".java:", i);
		if (i_28_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_25_.substring(5 + i_28_, i_26_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_24_).toString();
	return string;
    }
    
    RuntimeException_Sub3(Throwable throwable, String string) {
	((RuntimeException_Sub3) this).aString11296 = string;
	((RuntimeException_Sub3) this).aThrowable11297 = throwable;
	initCause(throwable);
    }
    
    public static RuntimeException_Sub3 method17689(Throwable throwable,
						    String string) {
	RuntimeException_Sub3 runtimeexception_sub3;
	if (throwable instanceof RuntimeException_Sub3) {
	    runtimeexception_sub3 = (RuntimeException_Sub3) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub3 runtimeexception_sub3_29_
		= runtimeexception_sub3;
	    ((RuntimeException_Sub3) runtimeexception_sub3_29_).aString11296
		= stringbuilder.append
		      (((RuntimeException_Sub3) runtimeexception_sub3_29_)
		       .aString11296)
		      .append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub3
		= new RuntimeException_Sub3(throwable, string);
	return runtimeexception_sub3;
    }
    
    static String method17690(Throwable throwable) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub3) {
	    RuntimeException_Sub3 runtimeexception_sub3
		= (RuntimeException_Sub3) throwable;
	    string = new StringBuilder().append
			 (((RuntimeException_Sub3) runtimeexception_sub3)
			  .aString11296)
			 .append
			 (" | ").toString();
	    throwable = (((RuntimeException_Sub3) runtimeexception_sub3)
			 .aThrowable11297);
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_30_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_30_));
	String string_31_ = bufferedreader.readLine();
	for (;;) {
	    String string_32_ = bufferedreader.readLine();
	    if (null == string_32_)
		break;
	    int i = string_32_.indexOf('(');
	    int i_33_ = string_32_.indexOf(')', i + 1);
	    String string_34_;
	    if (i != -1)
		string_34_ = string_32_.substring(0, i);
	    else
		string_34_ = string_32_;
	    string_34_ = string_34_.trim();
	    string_34_ = string_34_.substring(string_34_.lastIndexOf(' ') + 1);
	    string_34_
		= string_34_.substring(string_34_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_34_)
			 .toString();
	    if (-1 != i && -1 != i_33_) {
		int i_35_ = string_32_.indexOf(".java:", i);
		if (i_35_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_32_.substring(5 + i_35_, i_33_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_31_).toString();
	return string;
    }
    
    static final void method17691(String string) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class434_Sub3_Sub2.method17023(string, "%0a",
							       "\n",
							       -1912479486))
			       .toString());
    }
    
    static final String method17692(String string, String string_36_,
				    String string_37_) {
	for (int i = string.indexOf(string_36_); -1 != i;
	     i = string.indexOf(string_36_, i + string_37_.length()))
	    string
		= new StringBuilder().append(string.substring(0, i)).append
		      (string_37_).append
		      (string.substring(i + string_36_.length())).toString();
	return string;
    }
    
    static String method17693(Throwable throwable) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub3) {
	    RuntimeException_Sub3 runtimeexception_sub3
		= (RuntimeException_Sub3) throwable;
	    string = new StringBuilder().append
			 (((RuntimeException_Sub3) runtimeexception_sub3)
			  .aString11296)
			 .append
			 (" | ").toString();
	    throwable = (((RuntimeException_Sub3) runtimeexception_sub3)
			 .aThrowable11297);
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_38_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_38_));
	String string_39_ = bufferedreader.readLine();
	for (;;) {
	    String string_40_ = bufferedreader.readLine();
	    if (null == string_40_)
		break;
	    int i = string_40_.indexOf('(');
	    int i_41_ = string_40_.indexOf(')', i + 1);
	    String string_42_;
	    if (i != -1)
		string_42_ = string_40_.substring(0, i);
	    else
		string_42_ = string_40_;
	    string_42_ = string_42_.trim();
	    string_42_ = string_42_.substring(string_42_.lastIndexOf(' ') + 1);
	    string_42_
		= string_42_.substring(string_42_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_42_)
			 .toString();
	    if (-1 != i && -1 != i_41_) {
		int i_43_ = string_40_.indexOf(".java:", i);
		if (i_43_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_40_.substring(5 + i_43_, i_41_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_39_).toString();
	return string;
    }
    
    static final String method17694(String string, String string_44_,
				    String string_45_) {
	for (int i = string.indexOf(string_44_); -1 != i;
	     i = string.indexOf(string_44_, i + string_45_.length()))
	    string
		= new StringBuilder().append(string.substring(0, i)).append
		      (string_45_).append
		      (string.substring(i + string_44_.length())).toString();
	return string;
    }
    
    static final String method17695(String string, String string_46_,
				    String string_47_) {
	for (int i = string.indexOf(string_46_); -1 != i;
	     i = string.indexOf(string_46_, i + string_47_.length()))
	    string
		= new StringBuilder().append(string.substring(0, i)).append
		      (string_47_).append
		      (string.substring(i + string_46_.length())).toString();
	return string;
    }
    
    static final String method17696(String string, String string_48_,
				    String string_49_) {
	for (int i = string.indexOf(string_48_); -1 != i;
	     i = string.indexOf(string_48_, i + string_49_.length()))
	    string
		= new StringBuilder().append(string.substring(0, i)).append
		      (string_49_).append
		      (string.substring(i + string_48_.length())).toString();
	return string;
    }
    
    static final String method17697(String string, String string_50_,
				    String string_51_) {
	for (int i = string.indexOf(string_50_); -1 != i;
	     i = string.indexOf(string_50_, i + string_51_.length()))
	    string
		= new StringBuilder().append(string.substring(0, i)).append
		      (string_51_).append
		      (string.substring(i + string_50_.length())).toString();
	return string;
    }
    
    static final void method17698(String string) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class434_Sub3_Sub2.method17023(string, "%0a",
							       "\n",
							       -2099377668))
			       .toString());
    }
}
