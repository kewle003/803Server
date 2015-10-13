package org.virtue.utility.log;

import org.apache.log4j.*;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/**
 * Created by Mark on 10/12/2015.
 */
public class RSLoggerFactory implements LoggerFactory {
    @Override
    public Logger makeNewLoggerInstance(String name) {
        return new RSLogger(name);
    }
}
