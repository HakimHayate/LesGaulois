package personnages;

public class Gaulois extends Personnage{
	private int boost;
	public Gaulois(String name, int force) {
		super(name, force);
		
	}
	public void setBoost(int boost) {
		this.boost = boost;
	}
	public int getBoost() {
		return boost;
	}
	@Override
	public String donnerAuteur() {
		return "Gaulois";
	}
	@Override
	public void frapper(Personnage adversaire) {
		if (boost<= 0) {
			System.out.println(this.getName() + " envoie un grand coup de force "+this.getForce()+" à " + adversaire.getName());
			adversaire.recevoirCoup(this.getForce()/3);
		}
		else {
			System.out.println(this.getName() + " envoie un grand coup de force "+this.getForce()*boost+" à " + adversaire.getName());
			adversaire.recevoirCoup((this.getForce()*boost)/3);
			if (boost >1) {
				boost -= 0.5;
			}
		}
	}
	
}
