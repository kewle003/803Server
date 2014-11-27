package org.virtue.utility;

/**
 * Created by Mark on 11/25/2014.
 */
public class ServerUtils {

    public static final String OS = System.getProperty("os.name");
    public static final String SERVER_MODULE_NAME = "VirtuePK_803";
    public static final String CLIENT_MODULE_NAME = "803_Client";

    public static String getProjectLocation() {
        return System.getProperty("user.dir");
    }

    public static String getServerLocation() {
        if (isWindows()) {
            return  getProjectLocation() + "\\" + SERVER_MODULE_NAME;
        }

        return getProjectLocation() + "/" + SERVER_MODULE_NAME;
    }

    public static String getClientLocation() {
        if (isWindows()) {
            return getProjectLocation() + "\\" + CLIENT_MODULE_NAME;
        }

        return getProjectLocation() + "/" + CLIENT_MODULE_NAME;
    }

    public static String getUsersHome() {
        return System.getProperty("user.home");
    }

    public static boolean isWindows() {
        return (OS.contains(OsTypes.WINDOWS.getLowerCaseName()) || OS.contains(OsTypes.WINDOWS.getName()));
    }

    public static  boolean isLinux() {
        return (OS.contains(OsTypes.LINUX.getLowerCaseName()) || OS.contains(OsTypes.LINUX.getName()));
    }

    public static boolean isUnix() {
        return (OS.contains(OsTypes.UNIX.getLowerCaseName()) || OS.contains(OsTypes.UNIX.getName()));
    }

    private enum OsTypes {
        WINDOWS("Windows", "windows"),
        LINUX("Linux", "linux"),
        UNIX("Unix", "unix");

        private String name;
        private String lowerCaseName;

        OsTypes(String name, String lowerCaseName) {
            this.name = name;
            this.lowerCaseName = lowerCaseName;
        }

        public String getName() {
            return name;
        }

        public String getLowerCaseName() {
            return lowerCaseName;
        }
    }
}
