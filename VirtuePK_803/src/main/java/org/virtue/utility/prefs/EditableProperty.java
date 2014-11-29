package org.virtue.utility.prefs;

import org.virtue.constants.ParameterDataTypeEnum;
import org.virtue.constants.ParameterSecurityLevelEnum;

import java.util.Collection;

/**
 * Created by Mark on 11/29/2014.
 */
public interface EditableProperty {

    public EditableGroup getEditableGroup();

    public String getName();
    public String getMod();
    public String getRange();
    public String getExpression();

    public String getDisplayName();
    public String getDisplayDescription();
    public String getDefaultValue();
    public String getDescription();

    public String[] getValues();
    public String[] getLabels();

    public ParameterDataTypeEnum getDataType();
    public ParameterDataTypeEnum getDisplayType();
    public int getDisplaySize();

    public int getSequence();
    public boolean getIsRequired();
    public String getOrderBy();

    public boolean getSharedRow();
    public void setShareRow(boolean val);

    public boolean getShareParam();
    public void setShareParam(boolean val);

    public boolean getSaveEncrypted();
    public void setSaveEncrypted(boolean val);

    public ParameterSecurityLevelEnum getSecurityLevel();
    public void setSecurityLevel(ParameterSecurityLevelEnum val);

    public Collection getOptions();
}
