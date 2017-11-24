package Fight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Men.Men;

public class Fight {

	private FightSettings settings;
	
	public Fight(FightSettings settings) {
		this.settings = settings;
	}
	
	public List<Men> fight(List<Men> goodMen) {
		List<Men> orderList = new ArrayList<>();
		orderList.addAll(goodMen);
		List<Men> badMen = settings.getBadMen();
		orderList.addAll(badMen);
		Collections.sort(orderList,
				(Men men1, Men men2) -> men1.getInitiative()-men2.getInitiative());
		while(!allDead(goodMen) && !allDead(badMen)) {
			orderList.stream()
				.filter(man -> !man.isAlive())
				.forEach(man -> combat(man, badMen, goodMen));
		}
		return goodMen;
	}

	private void combat(Men man, List<Men> badMen, List<Men> goodMen) {
		// TODO Auto-generated method stub
	}

	private boolean allDead(List<Men> men) {
		return men.stream().allMatch(man -> !man.isAlive());
	}
}
