package org.virtue.common;

/**
 * Created by Mark on 11/27/2014.
 */
public interface RSThrowable {

    public String getMsgKey();
    public void setMsgKey(String key);

    public Object[] getValues();
    public void setValues(Object[] values);

    public int getCode();
    public void setCode(int val);

    public String getErrorIndex();
    public void setErrorIndex(String index);
}
