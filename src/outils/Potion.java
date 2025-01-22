package outils;

import java.security.SecureRandom;
import java.util.Random;

public class Potion {
	private int force;
	private int doses;
	private Random random;
	public Potion(){
		try {
			 random = SecureRandom.getInstanceStrong();
			} catch (Exception e) {
				 e.printStackTrace();
			}
		if (random != null) {
			force = random.nextInt(2, 7);	
			doses = random.nextInt(2, 7);	
		}
		
	}
	public int getForce() {
		return force;
	}
	
	public int getDoses() {
		return doses;
	}

	public void decreaseDoses() {
		doses -= 1;
	}
}
