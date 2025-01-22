package personnages;

public class Gaulois extends Personnage{
	
	public Gaulois(String name, int force) {
		super(name, force);
		
	}
	
	@Override
	public String donnerAuteur() {
		return "Gaulois";
	}
	
}
