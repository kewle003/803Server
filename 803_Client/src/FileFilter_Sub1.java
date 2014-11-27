/* FileFilter_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileFilter_Sub1 extends FileFilter
{
    Class14 aClass14_8601;
    Class14 this$0;
    
    FileFilter_Sub1(Class14 class14, Class14 class14_0_) {
	((FileFilter_Sub1) this).this$0 = class14;
	((FileFilter_Sub1) this).aClass14_8601 = class14_0_;
    }
    
    public boolean method14048(File file) {
	if (((FileFilter_Sub1) this).aClass14_8601.method677((short) 27009)
	    && file.isDirectory())
	    return true;
	if (!((FileFilter_Sub1) this).aClass14_8601.method677((short) 29069))
	    return true;
	return false;
    }
    
    public String getDescription() {
	return null;
    }
    
    public boolean method14049(File file) {
	if (((FileFilter_Sub1) this).aClass14_8601.method677((short) 28333)
	    && file.isDirectory())
	    return true;
	if (!((FileFilter_Sub1) this).aClass14_8601.method677((short) 4202))
	    return true;
	return false;
    }
    
    public boolean method14050(File file) {
	if (((FileFilter_Sub1) this).aClass14_8601.method677((short) 20079)
	    && file.isDirectory())
	    return true;
	if (!((FileFilter_Sub1) this).aClass14_8601.method677((short) 32313))
	    return true;
	return false;
    }
    
    public String method14051() {
	return null;
    }
    
    public String method14052() {
	return null;
    }
    
    public boolean accept(File file) {
	if (((FileFilter_Sub1) this).aClass14_8601.method677((short) 15508)
	    && file.isDirectory())
	    return true;
	if (!((FileFilter_Sub1) this).aClass14_8601.method677((short) 586))
	    return true;
	return false;
    }
}
