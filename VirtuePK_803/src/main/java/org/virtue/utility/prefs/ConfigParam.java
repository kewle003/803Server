package org.virtue.utility.prefs;

import org.dom4j.Element;
import org.virtue.constants.ParameterDataTypeEnum;
import org.virtue.constants.ParameterSecurityLevelEnum;

import java.util.Collection;

/**
 * Created by Mark on 11/29/2014.
 */
public class ConfigParam extends XMLElement implements Comparable, ConfigFileConstants, EditableProperty {
    protected ConfigParam(Element elem) {
        super(elem);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public EditableGroup getEditableGroup() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getMod() {
        return null;
    }

    @Override
    public String getRange() {
        return null;
    }

    @Override
    public String getExpression() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public String getDisplayDescription() {
        return null;
    }

    @Override
    public String getDefaultValue() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String[] getValues() {
        return new String[0];
    }

    @Override
    public String[] getLabels() {
        return new String[0];
    }

    @Override
    public ParameterDataTypeEnum getDataType() {
        return null;
    }

    @Override
    public ParameterDataTypeEnum getDisplayType() {
        return null;
    }

    @Override
    public int getDisplaySize() {
        return 0;
    }

    @Override
    public int getSequence() {
        return 0;
    }

    @Override
    public boolean getIsRequired() {
        return false;
    }

    @Override
    public String getOrderBy() {
        return null;
    }

    @Override
    public boolean getSharedRow() {
        return false;
    }

    @Override
    public void setShareRow(boolean val) {

    }

    @Override
    public boolean getShareParam() {
        return false;
    }

    @Override
    public void setShareParam(boolean val) {

    }

    @Override
    public boolean getSaveEncrypted() {
        return false;
    }

    @Override
    public void setSaveEncrypted(boolean val) {

    }

    @Override
    public ParameterSecurityLevelEnum getSecurityLevel() {
        return null;
    }

    @Override
    public void setSecurityLevel(ParameterSecurityLevelEnum val) {

    }

    @Override
    public Collection getOptions() {
        return null;
    }
}
