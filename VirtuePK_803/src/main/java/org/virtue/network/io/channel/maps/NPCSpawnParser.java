package org.virtue.network.io.channel.maps;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.virtue.game.logic.node.entity.npc.NPC;
import org.virtue.game.logic.region.Tile;
import org.virtue.network.io.IOParser;
import org.virtue.utility.ServerUtils;

/**
 * @author Taylor
 * @version 1.0
 */
public class NPCSpawnParser implements IOParser<List<NPC>> {

	private final File SAVE_PATH;

	{
		if (ServerUtils.isWindows()) {
			SAVE_PATH = new File(ServerUtils.getServerLocation() + "\\data\\landscape\\NPCSpawns.txt");
		} else {
			SAVE_PATH = new File(ServerUtils.getServerLocation() + "/data/landscape/NPCSpawns.txt");
		}
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.virtue.network.io.IOParser#load(java.lang.Object)
	 */
	@Override
	public List<NPC> load(Object... params) {
		final List<NPC> npc_spawns = new ArrayList<>();
		BufferedReader buffer = (BufferedReader) params[0];
		try {
			String line;
			while ((line = buffer.readLine()) != null) {
				if (line.startsWith("//"))
					continue;
				String[] split = line.split(" - ");
				int npcId = Integer.valueOf(split[0]);
				String[] location = split[1].split(" ");
				npc_spawns.add(NPC.create(npcId, new Tile(Integer.valueOf(location[0]), Integer.valueOf(location[1]), Integer.valueOf(location[2]))));
			}
			buffer.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			return npc_spawns;
	}

	/**
	 * (non-Javadoc)
	 * @see org.virtue.network.io.IOParser#save(java.lang.Object[])
	 */
	@Override
	public boolean save(Object... params) {
		return false;
	}

	/**
	 * (non-Javadoc)
	 * @see org.virtue.network.io.IOParser#getPath()
	 */
	@Override
	public File getPath() {
		return SAVE_PATH;
	}

}
