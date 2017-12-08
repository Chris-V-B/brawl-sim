package Dice;

import java.util.Random;

public class Dice {
	
	private static Random rand = new Random();
	
	public static int d20() {
		return rand.nextInt(20) + 1;
	}
	
	public static int d12() {
		return rand.nextInt(12) + 1;
	}
	
	public static int d10() {
		return rand.nextInt(10) + 1;
	}
	
	public static int d8() {
		return rand.nextInt(8) + 1;
	}
	
	public static int d6() {
		return rand.nextInt(6) + 1;
	}
	
	public static int d4() {
		return rand.nextInt(4) + 1;
	}

}
