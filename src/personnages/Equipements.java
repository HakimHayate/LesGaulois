package personnages;

public enum Equipements {
	CASQUE("casque", 2), BOUCLIER("bouclier", 3), PLASTRON("plastron", 3);
	private String chaine;
	private int defense;
	private Equipements(String chaine, int defense) {
		this.chaine = chaine;
		this.defense = defense;
	}
	@Override
	public String toString() {
		return chaine;
	}
	
	public int getDefense() {
		return defense;
	}
}
