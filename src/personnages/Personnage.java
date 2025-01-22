package personnages;

public abstract class Personnage {
	private String name;
	private int force;
	private Equipements[] equipements = new Equipements[3];
	private int nb_equipements = 0;
	
	Personnage(String name, int force) {
		this.name = name;
		this.force = force;
	}
	
	public void addEquipement(Equipements item) {
		for (int i=0; i<nb_equipements; i++) {
			if (item == equipements[i]) {
				System.out.println(getName()+" possède l'équipement");
				return;
			}
		}
		equipements[nb_equipements] = item;
		nb_equipements++;
		System.out.println("Le "+donnerAuteur()+" "+getName()+" s'équipe avec un "+item);
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
		for (int i=0; i<nb_equipements;i++) {
			coup -= equipements[i].getDefense();
			System.out.println("Le "+equipements[i]+ " absorbe "+equipements[i].getDefense()+" du coup");
		}
		
		force -= coup;
		if (force > 0) {
			parler("Aie!");
		}
		else {
			parler("J’abandonne…");
		}
	}
	
	public boolean isDown() {
		return this.force<=0;
	}
	public void frapper(Personnage adversaire) {
		System.out.println(name + " envoie un grand coup dans la mâchoire de " + adversaire.getName());
		adversaire.recevoirCoup(this.force);
	}
	
}
