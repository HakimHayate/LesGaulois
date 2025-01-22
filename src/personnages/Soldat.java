package personnages;

public class Soldat extends Romain {
	Grades grade;
	
	public Soldat(String name, int force, Grades grade) {
		super(name, force);
		this.grade = grade;
	}
	public Grades getGrade() {
		return this.grade;
	}
}
