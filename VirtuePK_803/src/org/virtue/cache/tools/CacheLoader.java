package org.virtue.cache.tools;

import java.io.File;
import java.io.IOException;

import org.virtue.cache.Cache;
import org.virtue.cache.FileStore;
import org.virtue.utility.ServerUtils;

/**
 * @author Virtue Development Team 2014 (c).
 * @since Apr 17, 2014
 */
public class CacheLoader {	
	private static final String pathToCacheWindows = "\\803_cache\\803";
	private static final String pathToCacheLinux = "/803_cache/803";
	private static Cache CACHE;

	public static void init() throws IOException {
		File cacheFile;
		if (ServerUtils.isWindows()) {
			cacheFile = new File(ServerUtils.getUsersHome() + pathToCacheWindows);
		} else  {
			cacheFile = new File(ServerUtils.getUsersHome() + pathToCacheLinux);
		}
		if (!new File(cacheFile, "main_file_cache.dat2").exists()) {
			cacheFile = new File("data/cache/");
		}
		CACHE = new Cache(FileStore.open(cacheFile));
	}
	
	public static Cache getCache () throws IOException {
		if (CACHE == null) {
			init();
		}
		return CACHE;
	}

}
