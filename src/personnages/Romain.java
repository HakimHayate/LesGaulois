package personnages;

public class Romain extends Personnage{
	public Romain(String name, int force) {
		super(name, force);
	}
	@Override
	public String donnerAuteur() {
		return "Romain";
	}
}
