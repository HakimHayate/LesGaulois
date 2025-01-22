package personnages;

public abstract class Personnage {
	private String name;
	private int force;
	
	Personnage(String name, int force) {
		this.name = name;
		this.force = force;
	}

	public String getName() {
		return name;
	}
	public int getForce() {
		return this.force;
	}
	
	protected abstract String donnerAuteur();
	
	
	public void parler(String text) {
		System.out.println("Le "+ donnerAuteur() +" "+ this.name +" : \""+text+"\"");;
	}
	
	
	public void recevoirCoup(int coup) {
		force -= coup;
		if (force > 0) {
			parler("Aie!");
		}
		else {
			parler("J’abandonne…");
		}
	}
	
	public void frapper(Personnage adversaire) {
		System.out.println(name + " envoie un grand coup dans la mâchoire de " + adversaire.getName());
		adversaire.recevoirCoup(this.force/3);
	}
	
}
