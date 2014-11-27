package org.virtue;

import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.virtue.cache.Cache;
import org.virtue.cache.ChecksumTable;
import org.virtue.cache.Container;
import org.virtue.cache.def.CacheIndex;
import org.virtue.cache.def.ItemDefinitionLoader;
import org.virtue.cache.def.NPCDefinitionLoader;
import org.virtue.cache.def.ObjectDefinitionLoader;
import org.virtue.cache.tools.CacheLoader;
import org.virtue.game.GameEngine;
import org.virtue.game.core.threads.MainThreadFactory;
import org.virtue.game.logic.Lobby;
import org.virtue.game.logic.node.object.RS3Object;
import org.virtue.game.logic.social.clans.ClanSettingsAPI;
import org.virtue.game.logic.social.clans.internal.ClanSettingsManager;
import org.virtue.network.RS2Network;
import org.virtue.network.io.IOHub;
import org.virtue.network.loginserver.DataServer;
import org.virtue.utility.ConsoleLogger;
import org.virtue.utility.Huffman;
import org.virtue.utility.TimeUtil;

/**
 * @author Taylor Moon
 * @since Jan 22, 2014
 */
public class Launcher {

	public static final String OS = System.getProperty("os.name");
	
	/**
	 * Represents the secure random.
	 */
	private static final Random RANDOM = new SecureRandom();
	
	/**
	 * Represents the main executor that executes the game engine.
	 */
	private static final ExecutorService ENGINE_LOADER = Executors.newCachedThreadPool(new MainThreadFactory());
	
	/**
	 * Represents the network foundation of the server.
	 */
	private static final RS2Network NETWORK = new RS2Network();
	
	/**
	 * Represents the game engine.
	 */
	private static final GameEngine ENGINE = new GameEngine();
	
	/**
	 * Represents the game {@link Cache}.
	 */
	private static Cache CACHE;
	
	/**
	 * Represents the {@link Huffman} encryption library
	 */
	private static Huffman HUFFMAN;
	
	/**
	 * Represents the clan management system
	 */
	private static ClanSettingsManager CLANS;
	
	/**
	 * Represents the main method.
	 * @param args The arguments casted on runtime.
	 */
	public static void main(String[] args) {
		try {
			System.setOut(new ConsoleLogger(System.out));
			System.setErr(new ConsoleLogger(System.err));
			long currentTime = TimeUtil.currentTimeMillis();
			System.out.println("Welcome to " + Constants.NAME + ".");
			loadEngine();
			loadCache();
			if (Constants.LOGIN_SERVER) {
				DataServer.load();
			}
			Lobby.load();
			IOHub.load();
			NETWORK.load();
			CLANS = new ClanSettingsManager();
			System.out.println("VirtuePK took " + (TimeUtil.currentTimeMillis() - currentTime) + " milli seconds to launch.");
		} catch (Exception e) {
			ENGINE.handleException(e);
		}
	}
	
	/**
	 * Loads the Virtue game engine.
	 */
	private static void loadEngine() {
		ENGINE_LOADER.execute(ENGINE);
		ENGINE.getTickManager().register(ENGINE.getLogicProcessor());
	}

	/**
	 * Loads the Xerxes cache.
	 * @throws Exception If an exception occurs.
	 */
	private static void loadCache() throws Exception {
		CACHE = CacheLoader.getCache();
		Container container = new Container(Container.COMPRESSION_NONE, CACHE.createChecksumTable().encode(true, ChecksumTable.ON_DEMAND_MODULUS, ChecksumTable.ON_DEMAND_EXPONENT));
		CACHE.setChecksumtable(container.encode());
		
		ItemDefinitionLoader.load(CACHE);//Loads the item definitions
		
		NPCDefinitionLoader.load(CACHE);//Loads the NPC definitions
		
		ObjectDefinitionLoader.load(CACHE);//Loads the object definitions
		
		RS3Object.initTransforms();//Initialises the object transforms
		
		//Initialies the huffman codec
		ByteBuffer huffmanData = Launcher.getCache().read(CacheIndex.HUFFMAN_ENCODING, CACHE.getFileId(CacheIndex.HUFFMAN_ENCODING, "huffman")).getData();
		byte[] data = new byte[huffmanData.remaining()];
		huffmanData.get(data);
		HUFFMAN = new Huffman(data);
        
	}

	/**
	 * @return the engine
	 */
	public static GameEngine getEngine() {
		return ENGINE;
	}

	/**
	 * @return the network
	 */
	public static RS2Network getNetwork() {
		return NETWORK;
	}

	/**
	 * @return the random
	 */
	public static Random getRandom() {
		return RANDOM;
	}

	/**
	 * @return the cACHE
	 */
	public static Cache getCache() {
		return CACHE;
	}
	
	/**
	 * @return The huffman encoding library
	 */
	public static Huffman getHuffman () {
		return HUFFMAN;
	}
	
	/**
	 * @return The clan management system
	 */
	public static ClanSettingsAPI getClanManager () {
		return CLANS;
	}
	
	public static int getDay () {
		return (int) Math.abs((System.currentTimeMillis() - Constants.RUNE_DAY_0) / Constants.MS_PER_DAY);
	}
}
