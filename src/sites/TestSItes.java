package sites;
import personnages.*;

public class TestSItes {
	public static void main(String[] args) {
		Gaulois chef = new Gaulois("Vercingétorix", 5);
		Village village = new Village(chef);
		
		chef.parler("Je suis un grand guerrier et je vais créer mon village");
		
		Soldat minus = new Soldat("Minus", 2, Grades.CENTURION);
		Camp camp = new Camp(minus);
		
		minus.parler("Je suis en charge de créer un nouveau camp romain.");
		
		Gaulois gaulois1 = new Gaulois("Agecanonix", 1);
		Gaulois gaulois2 = new Gaulois("Assurancetourix", 2);
		Gaulois gaulois3 = new Gaulois("Astérix", 5);
		Gaulois gaulois4 = new Gaulois("AObelix", 15);
		Gaulois gaulois5 = new Gaulois("Prolix", 2);
		Gaulois gaulois6 = new Gaulois("Abraracourcix", 5);
		
		Soldat soldat1 = new Soldat("Brutus", 5, Grades.CENTURION);
		Soldat soldat2 = new Soldat("Milexcus", 2, Grades.SOLDAT);
		Soldat soldat3 = new Soldat("Tullius Octopus", 2, Grades.TESSERARIUS);
		Soldat soldat4 = new Soldat("Ballondebaudrus", 3, Grades.OPTIO);
		Soldat soldat5 = new Soldat("Briseradius", 4, Grades.SOLDAT); 
		Soldat soldat6 = new Soldat("Chorus", 4, Grades.CENTURION); 
		
		village.ajouterGaulois(gaulois1);
		village.ajouterGaulois(gaulois2);
		village.ajouterGaulois(gaulois3);
		village.ajouterGaulois(gaulois4);
		village.ajouterGaulois(gaulois5);
		
		camp.ajouterSoldat(soldat1);
		camp.ajouterSoldat(soldat2);
		camp.ajouterSoldat(soldat3);
		camp.ajouterSoldat(soldat4);
		
		camp.afficherCamp();
		village.afficherVillageois();
		
		village.changerChef(gaulois6, false, false, camp);
		camp.changerCommandant(soldat6);
		camp.changerCommandant(soldat5);
		
	}
}
