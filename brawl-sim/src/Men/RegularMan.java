package Men;

import Dice.Dice;

/**
 * 
 * TODO split this into different sorts of men
 *
 */
public class RegularMan implements Men {
	
	private Integer hp;
	private Integer initiative;
	private Boolean isBad;
	
	public RegularMan(Boolean isBad) {
		hp = Dice.d20();
		initiative = Dice.d20();
		this.isBad = isBad;
	} 
	

	@Override
	public Integer getInitiative() {
		return initiative;
	}

	@Override
	public Boolean isAlive() {
		return hp >= 0;
	}

	@Override
	public int compare(Men men1, Men men2) {
		return men1.getInitiative().compareTo(men2.getInitiative());
	}

	@Override
	public void attack(Men men) {
		men.removeHp(rollDamage());
	}

	private Integer rollDamage() {
		return Dice.d8();
	}


	@Override
	public void removeHp(Integer damage) {
		this.hp = hp - damage;
	}


	@Override
	public Boolean isBad() {
		return isBad;
	}
}
