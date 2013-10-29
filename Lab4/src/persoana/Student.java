package persoana;

public class Student extends Persoana {
	
	int nota;
	
	public Student(){}
	
	public Student(int nota, String nume){
		super(nume);
		this.nota = nota;
	}
	/*
	public String toString(){
		String str = "Student: ";
		str += super.nume;
		str += ", ";
		str += this.nota;
		return str;
	}
	*/
	public String toString(){
		return super.toString();
	}
	
	public boolean equals(Student stud){
		if((this.nota != stud.nota) || (super.nume != stud.toString()))
			return false;
		return true;
	}
	
	public void invata(){
		System.out.println(super.nume + " invata");
	}
}
