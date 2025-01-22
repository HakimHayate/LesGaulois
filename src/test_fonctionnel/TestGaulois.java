package test_fonctionnel;
import personnages.*;
public class TestGaulois {
	// main A
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.parler("Bonjour");
		
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU.....");
		
		minus.addEquipement(Equipements.BOUCLIER);
		minus.addEquipement(Equipements.CASQUE);
		minus.addEquipement(Equipements.PLASTRON);
		
		Druide druide = new Druide("Healer", 5);
		druide.fabriquerPotion();
		druide.giveBoost(asterix);
		asterix.addEquipement(Equipements.BOUCLIER);
		
		while (true) {
			asterix.frapper(minus);
			if (minus.isDown()) {
				break;
			}
			minus.frapper(asterix);
			if (asterix.isDown()) {
				break;
			}
			System.out.println();
		}
	}
}
