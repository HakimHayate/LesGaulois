package personnages;

public class Gaulois {
	private String name;
	private int force;
	
	public Gaulois(String name, int force) {
		this.name = name;
		this.force = force;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void parler(String text) {
		System.out.println("Le gaulois " + this.name +" : \""+text+"\"");;
	}
}
