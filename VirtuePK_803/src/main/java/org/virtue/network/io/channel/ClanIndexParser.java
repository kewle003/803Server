package org.virtue.network.io.channel;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.virtue.network.io.IOParser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.virtue.utility.ServerUtils;

public class ClanIndexParser implements IOParser<Map<String, Long>> {

	private final File SAVE_PATH;

	{
		if (ServerUtils.isWindows()) {
			SAVE_PATH = new File(ServerUtils.getServerLocation() + "\\data\\clans\\0000_index.json");
		} else {
			SAVE_PATH = new File(ServerUtils.getServerLocation() + "/data/clans/0000_index.json");
		}
	}
	
	@Override
	public Map<String, Long> load(Object... params) throws FileNotFoundException {
		JsonParser parser = new JsonParser();
		JsonElement parsed = parser.parse(new FileReader(getPath()));
		Map<String, Long> index = new HashMap<String, Long>();
		if (parsed.isJsonArray()) {
			JsonArray data = parsed.getAsJsonArray();
			for (JsonElement element : data) {
				JsonObject keyValuePair = element.getAsJsonObject();
				String name = keyValuePair.get("name").getAsString();
				long hash = keyValuePair.get("hash").getAsLong();
				index.put(name, hash);
			}
		}
		return index;
	}

	@Override
	public boolean save(Object... params) {
		Map<?, ?> index = (Map<?, ?>) params[0];
		JsonArray data = new JsonArray();
		for (Entry<?, ?> value : index.entrySet()) {
			JsonObject obj = new JsonObject();
			obj.addProperty("name", (String) value.getKey());
			obj.addProperty("hash", (Long) value.getValue());
			data.add(obj);
		}
		try (FileWriter writer = new FileWriter(getPath())) {
			writer.write(data.toString());
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public File getPath() {
		return SAVE_PATH;
	}

}
