package org.virtue.utility.log;

import org.apache.log4j.*;

/**
 * Created by Mark on 11/27/2014.
 */
public class RSLogger extends org.apache.log4j.Logger {
   private static RSLoggerFactory factory = new RSLoggerFactory();

    protected RSLogger(String name) {
        super(name);
    }

    public static org.apache.log4j.Logger getLogger(Class clazz) {
        return org.apache.log4j.Logger.getLogger(clazz.getName(), factory);
    }
}
