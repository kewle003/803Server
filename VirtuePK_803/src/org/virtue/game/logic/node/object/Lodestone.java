package org.virtue.game.logic.node.object;

import org.virtue.game.logic.region.Tile;

public class Lodestone extends RS3Object {
	
	public enum Definition {
		LUNAR(-1, null, -1),
		AL_KHARID(-1, null, -1),
		ARDOUGNE(69830, new Tile(2634, 3349, 0), 29),
		BURTHORPE(69831, new Tile(2899, 3545, 0), 30),
		CATHERBY(69832, new Tile(2831, 3452, 0), 31),
		DRAYNOR_VILLAGE(-1, null, -1),
		EDGEVILLE(69834, new Tile(3067, 3506, 0), 33),
		FALADOR(69835, new Tile(2967, 3404, 0), 34),
		LUMBRIDGE(69836, new Tile(3233, 3222, 0), 35),//x=2056, y=6205, z=0 x=2529, y=6422, z=0
		PORT_SARIM(69837, new Tile(3011, 3216, 0), 36),
		SEERS_VILLAGE(69838, new Tile(2689, 3483, 0), 37),
		TAVERLY(69839, new Tile(2878, 3443, 0), 38),
		VARROCK(69840, new Tile(3214, 3377, 0), 39),
		YANILLE(69841, new Tile(2529, 3095, 0), 40),
		BANDIT_CAMP(-1, null, -1),
		EAGLES_PEAK(-1, null, -1),
		TIRANNWN(-1, null, -1),
		OOGLOG(-1, null, -1),
		KARAMJA(-1, null, -1),
		CANAFIS(-1, null, -1),
		WILDERNESS(-1, null, -1),
		FREMENNIK(-1, null, -1),
		ASHDALE(-1, null, -1);
		
		Definition(int baseID, Tile location, int varBitID) {
			
		}
	}

	protected Lodestone(int id, int rotation, int type, Tile tile) {
		super(id, rotation, type, tile);
	}

}
