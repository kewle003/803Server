package org.virtue.utility.log;

import org.apache.log4j.Level;

/**
 * Created by Mark on 11/27/2014.
 */
public class Log4jLogger extends Logger {

    // The log4j logger to delegate to.
    private org.apache.log4j.Logger delegate;

    public Log4jLogger(Class clazz) {
        delegate = RSLogger.getLogger(clazz);
    }

    @Override
    void init() {
        delegate.setLevel(Level.INFO);
    }

    @Override
    public boolean isDebugEnabled() {
        return delegate.isDebugEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
        return delegate.isInfoEnabled();
    }

    @Override
    public boolean isTraceEnabled() {
        return delegate.isTraceEnabled();
    }

    @Override
    public void trace(Object o) {
        delegate.trace(o);
    }

    @Override
    public void trace(Object o, Throwable throwable) {
        delegate.trace(o, throwable);
    }

    @Override
    public void tracef(String str, Object... args) {
        if (delegate.isTraceEnabled()) {
            delegate.trace(String.format(str, args));
        }
    }

    @Override
    public void debug(Object o) {
        delegate.debug(o);
    }

    @Override
    public void debug(Object o, Throwable throwable) {
        delegate.debug(o, throwable);
    }

    @Override
    public void debugf(String str, Object... args) {
        if (delegate.isDebugEnabled()) {
            delegate.debug(String.format(str, args));
        }
    }

    @Override
    public void error(Object o) {
        delegate.error(o);
    }

    @Override
    public void error(Object o, Throwable throwable) {
        delegate.error(o, throwable);
    }

    @Override
    public void fatal(Object o) {
        delegate.fatal(o);
    }

    @Override
    public void fatal(Object o, Throwable throwable) {
        delegate.fatal(o, throwable);
    }

    @Override
    public void info(Object o) {
        delegate.info(o);
    }

    @Override
    public void info(Object o, Throwable throwable) {
        delegate.info(o, throwable);
    }

    @Override
    public void warn(Object o) {
        delegate.warn(o);
    }

    @Override
    public void warn(Object o, Throwable throwable) {
        delegate.warn(o, throwable);
    }
}
