package personnages;
import outils.*;
public class Druide extends Gaulois{
	private Potion[] potions = new Potion[100]; 
	private int nb_potions = -1;
	
	public Druide(String name, int force) {
		super(name, force);
	}
	
	public void fabriquerPotion() {
		nb_potions +=1;
		potions[nb_potions] = new Potion();
		System.out.println("Le "+this.donnerAuteur()+" "+this.getName()+" : \" J'ai concocté "+potions[nb_potions].getDoses()+" doses de potion magique. Elle a une force de "+potions[nb_potions].getForce()+".\"");
	}
	public void giveBoost(Gaulois gaulois) {
		if (gaulois.getName().equals("Obélix")) {
			System.out.println("Le "+this.donnerAuteur()+" "+this.getName()+" : \" Obélix n'a pas le droite de boire de potion");
			return;
		}
		Potion potion;
		for (int i =0; i<=nb_potions; i++) {
			potion = this.potions[i];
			if (potion != null && potion.getDoses()>0) {
				System.out.println("Le "+this.donnerAuteur()+" "+this.getName()+" : \" Tiens "+gaulois.getName()+" un peu de potion magique. \"");
				
				potion.decreaseDoses();
				gaulois.setBoost(potion.getForce());
				return;
			}
			
		}
		System.out.println("Le "+this.donnerAuteur()+" "+this.getName()+" : \"Désolé "+gaulois.getName()+" il n'y a plus une seule goutte de potion.\"");
		
		
	}
}
