package Brawl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import Fight.Fight;
import Fight.FightSettings;
import Men.Men;
import Men.RegularMan;

public class Brawl {

	public static void main(String[] args) {

		System.out.println("Hello world");
		System.out.println("Test");

		List<Long> menAlive = new ArrayList<>();
		IntStream.range(0, 99).forEach(ignore -> {
			List<Men> goodmen = createMen(5, false);
			
			Fight fight1 = new Fight(createSettings(1));
			Fight fight2 = new Fight(createSettings(2));
			Fight fight3 = new Fight(createSettings(3));
			List<Men> menPostFight = fight3.fight(fight2.fight(fight1.fight(goodmen)));
			Long count = menPostFight.stream()
				.filter(Men::isAlive)
				.count();
			menAlive.add(count);
		});
		Long totalFightsMenAlive = menAlive.stream()
			.filter(count -> count > 0)
			.count();
		
		System.out.println("Brawl results: "+totalFightsMenAlive+"/100");
	}
	
	private static FightSettings createSettings(Integer nr) {
		FightSettings settings = new FightSettings();
		createMen(nr, true).forEach(men -> settings.addBadMan(men));
		return settings;
	}

	private static List<Men> createMen(Integer nr, Boolean bad) {
		List<Men> men = new ArrayList<>();
		IntStream.range(0, nr).forEach(ignore -> men.add(new RegularMan(bad)));
		return men;
	}

}
