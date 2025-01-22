package sites;
import personnages.*;

public class Camp {
	private static final int MAX_SOLDATS = 3;
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[MAX_SOLDATS];
	private int nb_soldats = 0;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
	}
	
	public Soldat getCommandant() {
		return commandant;
		
	}
	
	public void ajouterSoldat(Soldat soldat) {
		if (nb_soldats < MAX_SOLDATS) {
			soldats[nb_soldats] = soldat;
			nb_soldats++;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par "+commandant.getName());
		}
		else {
			commandant.parler("Désolé "+soldat.getName()+" notre camp est complet !");
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirigé par "+commandant.getName()+" contient les soldats : ");
		for (int i=0;i<nb_soldats;i++) {
			System.out.println("- "+soldats[i].getName());
		}
	}
	public void changerCommandant(Soldat soldat) {
		if (soldat.getGrade()== Grades.CENTURION) {
			Soldat ancienCommandant = this.commandant;
			this.commandant = soldat;
			System.err.println("Le "+soldat.donnerAuteur()+ soldat.getName()+" :\" Moi "+soldat.getName()+" je prends la direction du camp romain. \"");
		}
		else {
			System.err.println("Le "+soldat.donnerAuteur()+ soldat.getName()+" :\" Je ne suis pas suffisamment gradé pour prendre la direction du camp romain. \"");
		}
	}
		
}
