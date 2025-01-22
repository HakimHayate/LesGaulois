package sites;
import personnages.*;

public class Village {
	private static final int MAX_GAULOIS = 4;
	private Gaulois chef;
	private Gaulois[] gaulois = new Gaulois[MAX_GAULOIS];
	private int nb_gaulois = 0;
	
	public Village(Gaulois chef)  {
		this.chef = chef;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterGaulois(Gaulois gaulois) {
		if (nb_gaulois < MAX_GAULOIS) {
			this.gaulois[nb_gaulois] = gaulois;
			nb_gaulois++;
			chef.parler("Bienvenue "+gaulois.getName()+" !");
		}
		else {
			chef.parler("Désolé "+gaulois.getName()+ " mon village est déjà bien rempli.");
		}
	}
	
	public void afficherVillageois() {
		System.out.println("Le village de "+chef.getName()+" est habité par : ");
		for (int i=0;i<nb_gaulois;i++) {
			System.out.println("- "+gaulois[i].getName());
		}
	}
	public void changerChef(Gaulois chef, boolean ancienChefDevientVillageois, boolean ancienChefDevientSoldat, Camp camp) {
		Gaulois ancienChef = this.chef;
		this.chef = chef;
		System.err.println("Le "+ancienChef.donnerAuteur()+" "+ ancienChef.getName()+" : \" Je laisse mon grand bouclier au grand "+chef.getName()+"\"");
		System.err.println("Le "+chef.donnerAuteur()+ " "+chef.getName()+" : \"Merci ! \"");
		
		if (ancienChefDevientVillageois) {
			this.ajouterGaulois(ancienChef);
			
		}
		if (ancienChefDevientSoldat) {
			Soldat soldat = new Soldat(ancienChef.getName(), ancienChef.getForce(), Grades.SOLDAT);
			camp.ajouterSoldat(soldat);
		}
		
		
	}
}
