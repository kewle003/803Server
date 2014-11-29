package org.virtue.common;

import java.io.Serializable;

/**
 * Created by Mark on 11/27/2014.
 */
public class RSException extends Exception implements Serializable, RSThrowable {

    /**
     * This is a magic value because I don't want the dependency on the struts library.
     * Real value is: ActionMessages.GLOBAL_MESSAGE
     */
    public static final String DEFAULT_ERROR_INDEX = "org.apache.struts.action.GLOBAL_MESSAGE";
    public static final String DEFAULT_ERROR_MESSAGE_KEY = "exception.rs";

    protected int _code;
    protected String _msgKey;
    protected String _titleKey;
    protected Object[] _values;

    protected String _errorIndex;

    public RSException() {
        this((Throwable) null);
    }

    public RSException(Throwable cause) {
        super(cause);

        _code = 0;
        _msgKey = DEFAULT_ERROR_MESSAGE_KEY;
        _values = new Object[]{""};
        _errorIndex = DEFAULT_ERROR_INDEX;
    }
    @Override
    public String getMsgKey() {
        return null;
    }

    @Override
    public void setMsgKey(String key) {

    }

    @Override
    public Object[] getValues() {
        return new Object[0];
    }

    @Override
    public void setValues(Object[] values) {

    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public void setCode(int val) {

    }

    @Override
    public String getErrorIndex() {
        return null;
    }

    @Override
    public void setErrorIndex(String index) {

    }
}
