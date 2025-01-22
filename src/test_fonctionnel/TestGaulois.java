package test_fonctionnel;
import personnages.*;
public class TestGaulois {
	// main A
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.parler("Bonjour");
		
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU.....");
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
	}
}
