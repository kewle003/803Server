package org.virtue.utility.log;

import java.lang.reflect.Constructor;

/**
 * Created by Mark on 11/27/2014.
 *
 * Can be used in place of a Log4J logger to allow a class to be included
 * in an applet without an external dependency.
 */
public abstract class Logger {

    /**
     * The class of the logger implementation that will be instantiated when a logger is required
     */
    private static Class<? extends Logger> loggerClass = getLoggerClass();

    private static Class<? extends Logger> getLoggerClass() {
        try {
            return (Class<? extends Logger>) Class.forName("org.virtue.utility.log.Log4jLogger");
        } catch (Exception e) {
            // fall back to SimpleLogger if there is a gailure
            return SimpleLogger.class;
        }
    }

    public static void setLoggerClass(Class<? extends Logger> clazz) {
        Logger.loggerClass = clazz;
    }

    public static Logger getLogger() {
        Class clazz;

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        try {
            // it looks like the 0th element is java.lang.Thread, the 1st element is com.attask.util.log.Logger,
            // and the 2nd element is the calling class we wish for
            clazz = Class.forName(stackTraceElements[2].getClassName());
        } catch (Exception e) {
            Logger logger = getLogger(Logger.class);
            logger.debug("Could not find class for the second stack trace element =( ");
            clazz = Logger.class;
        }

        return getLogger(clazz);
    }

    public static Logger getLogger(Class clazz) {
        try {
            // Get the constructor that takes a class as a parameter
            Constructor<? extends Logger> constructor = loggerClass.getConstructor(Class.class);

            // Use the constructor to create a new instance
            Logger logger = constructor.newInstance(clazz);
            logger.init();
            return logger;
        } catch (Exception e) {
            System.err.println("Loading log4j: " + e.getMessage());
            // this class needs to print out it's stack trace as logging is not completely initialized yet
            e.printStackTrace(System.err);
            return new SimpleLogger(clazz);
        }
    }

    abstract void init();

    public abstract boolean isDebugEnabled();

    public abstract boolean isInfoEnabled();

    public abstract boolean isTraceEnabled();

    public abstract void trace(Object o);

    public abstract void trace(Object o, Throwable throwable);

    public abstract void tracef(String str, Object... args);

    public abstract void debug(Object o);

    public abstract void debug(Object o, Throwable throwable);

    public abstract void debugf(String str, Object... args);

    public abstract void error(Object o);

    public abstract void error(Object o, Throwable throwable);

    public abstract void fatal(Object o);

    public abstract void fatal(Object o, Throwable throwable);

    public abstract void info(Object o);

    public abstract void info(Object o, Throwable throwable);

    public abstract void warn(Object o);

    public abstract void warn(Object o, Throwable throwable);
}
