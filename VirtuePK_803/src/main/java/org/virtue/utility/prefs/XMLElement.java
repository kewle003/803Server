package org.virtue.utility.prefs;

import org.dom4j.Element;

import java.io.Serializable;

/**
 * Created by Mark on 11/29/2014.
 */
public abstract class XMLElement implements Serializable {

    protected Element _elem;

    protected XMLElement(Element elem) {
        this._elem = elem;
    }

    public Element getElement() {
        return _elem;
    }
}
