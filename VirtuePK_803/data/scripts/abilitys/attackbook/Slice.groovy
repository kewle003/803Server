package scripts.ability.attackbook;

import org.virtue.game.logic.content.combat.Ability.AbilityType;

class Slice implements Ability {
	def sc = new AbilityShortcut(17)

	AbilityType type() {
		AbilityType.BASIC
	}
	
	int interval() {
		3
	}
	
	Shortcut shortcut() {
		sc
	}
	
	void activate(Player player) {
	}
}