package personnages;

public class TestPersonnages { 
	// main B
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU… UN GAUGAU…");
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
	}
}
