package org.virtue.utility.log;

/**
 * Created by Mark on 11/27/2014.
 */
public class SimpleLogger extends Logger {
    public static enum Level {
        TRACE,
        DEBUG,
        INFO,
        WARN,
        ERROR,
        FATAL;

        public static Level forName(String name) {
            for (Level value : values()) {
                if(value.name().equals(name)) {
                    return value;
                }
            }
            return null;
        }
    }

    private static Level __defaultLevel = Level.INFO;

    public static void setDefaultLevel(Level value) {
        if (value == null) {
            __defaultLevel = Level.INFO;
        } else {
            __defaultLevel = value;
        }
    }

    private Class _clazz;
    private Level _level;

    public SimpleLogger(Class clazz) {
        this._clazz = clazz;
        this._level = null;
    }

    public Level getLevel() {
        return (_level == null) ? __defaultLevel : _level;
    }

    public void setLevel(Level level) {
        this._level = level;
    }

    public void log(Object o, Throwable throwable, Level level) {
        if (level.ordinal() < getLevel().ordinal()) {
            return;
        }

        System.out.println(_clazz.getSimpleName() + " [" + level + "]: " + String.valueOf(o));
        if (throwable != null) {
            throwable.printStackTrace(System.out);
        }
    }

    @Override
    void init() {

    }

    @Override
    public boolean isDebugEnabled() {
        return getLevel().ordinal() <= Level.DEBUG.ordinal();
    }

    @Override
    public boolean isInfoEnabled() {
        return getLevel().ordinal() <= Level.INFO.ordinal();
    }

    @Override
    public boolean isTraceEnabled() {
        return getLevel().ordinal() <= Level.TRACE.ordinal();
    }

    @Override
    public void trace(Object o) {
        trace(o, null);
    }

    @Override
    public void trace(Object o, Throwable throwable) {
        log(o, throwable, Level.TRACE);
    }

    @Override
    public void tracef(String str, Object... args) {
        if (isTraceEnabled()) {
            trace(String.format(str, args));
        }
    }

    @Override
    public void debug(Object o) {
        debug(o, null);
    }

    @Override
    public void debug(Object o, Throwable throwable) {
        log(o, throwable, Level.DEBUG);
    }

    @Override
    public void debugf(String str, Object... args) {
        if (isDebugEnabled()) {
            debug(String.format(str, args));
        }
    }

    @Override
    public void error(Object o) {
        error(o, null);
    }

    @Override
    public void error(Object o, Throwable throwable) {
        log(o, throwable, Level.ERROR);
    }

    @Override
    public void fatal(Object o) {
        fatal(o, null);
    }

    @Override
    public void fatal(Object o, Throwable throwable) {
        log(o, throwable, Level.FATAL);
    }

    @Override
    public void info(Object o) {
        info(o, null);
    }

    @Override
    public void info(Object o, Throwable throwable) {
        log(o, throwable, Level.INFO);
    }

    @Override
    public void warn(Object o) {
        warn(o, null);
    }

    @Override
    public void warn(Object o, Throwable throwable) {
        log(o, throwable, Level.WARN);
    }
}
