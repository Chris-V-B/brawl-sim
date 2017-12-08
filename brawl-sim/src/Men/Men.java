package Men;

import java.util.Comparator;

public interface Men extends Comparator<Men>{
	//TODO
	public Integer getInitiative();
	
	public Boolean isAlive();
	
	public void attack(Men men);

	public void removeHp(Integer damage);
	
	public Boolean isBad();
	
	public Integer getAc();
}
