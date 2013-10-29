package Test;

import persoana.*;
import Stiva.*;

public class Test {

	public static void main(String[] args) {
		
		//Ex.1,2	
		System.out.println("Ex.1,2: ");
		Profesor prof = new Profesor("Fizica","Mihai");
		Student stud = new Student(10,"Vlad");
		Student stud2 = new Student(9,"Matei");
		
		System.out.println(prof.toString());
		System.out.println(stud.toString());
		
		//Ex.3
		System.out.println("Ex.3: " + stud.equals(stud2));
		
		//Ex.4
		System.out.println("Ex.4: ");
		Persoana[] v = new Persoana[3];
		v[0] = new Student(10,"Radu");
		v[1] = new Profesor("POO","Mihai Dascalu");
		v[2] = new Student(9,"Mircea");
		
		for(int i = 0; i < 3; ++i){
			System.out.println(v[i].toString());
		}
		
		//Ex.5
		System.out.println("Ex.5: ");
		for(int i = 0; i < 3; ++i){
			if(v[i] instanceof Profesor)
				((Profesor)v[i]).preda();
			if(v[i] instanceof Student)
				((Student)v[i]).invata();
		}
		
		//Ex.6a,b
		//StivaEx pt a si StivaAg pt b
		System.out.println("Ex.6: ");
		StivaEx stiva = new StivaEx(10);
		System.out.println(stiva);
		int rez = stiva.push(1);
		if(rez != Array.ERROR){
			System.out.println("Pushed value: " + stiva.top());
			System.out.println(stiva);
		}
		else
			System.out.println("Error pushing value");
		rez = stiva.push(3);
		if(rez != Array.ERROR){
			System.out.println("Pushed value: " + stiva.top());
			System.out.println(stiva);
		}
		else
			System.out.println("Error pushing value");
		rez = stiva.push(5);
		if(rez != Array.ERROR){
			System.out.println("Pushed value: " + stiva.top());
			System.out.println(stiva);
		}
		else
			System.out.println("Error pushing value");
		rez = stiva.pop();
		if(rez != Array.ERROR){
			System.out.println("Popped value: " + rez);
			System.out.println(stiva);
		}
		else
			System.out.println("Error popping value");
		rez = stiva.pop();
		if(rez != Array.ERROR){
			System.out.println("Popped value: " + rez);
			System.out.println(stiva);
		}
		else
			System.out.println("Error popping value");
		rez = stiva.push(8);
		if(rez != Array.ERROR){
			System.out.println("Pushed value: " + stiva.top());
			System.out.println(stiva);
		}
		else
			System.out.println("Error pushing value");
		for(int i = 0; i < 9; ++i){
			rez = stiva.push(i*2 - 1);
			if(rez == Array.ERROR)
				System.out.println("Error pushing value " + (i*2-1));
		}
		System.out.println(stiva);
		
	}
}