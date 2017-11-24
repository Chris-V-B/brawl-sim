package Fight;

import java.util.ArrayList;
import java.util.List;

import Men.Men;

public class FightSettings {
	
	List<Men> badmen = new ArrayList<>();
	
	public FightSettings() {
		
	}
	
	public void addBadMan(Men badman) {
		badmen.add(badman);
	}
	
	public List<Men> getBadMen() {
		return badmen;
	}

}
