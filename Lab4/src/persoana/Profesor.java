package persoana;

public class Profesor extends Persoana {
	
	String materie;
	
	public Profesor(){}
	
	public Profesor(String materie,String nume){
		super(nume);
		this.materie = materie;
	}
	
	public String toString(){
		String str = "Profesor: ";
		str += super.nume;
		str += ", ";
		str += this.materie;
		return str;
	}
	
	public void preda(){
		System.out.println(super.nume + " preda");
	}
}
