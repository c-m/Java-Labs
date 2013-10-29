package Singleton;

public class Singleton {
	
	private Singleton(){}
	
	private static final Singleton s = new Singleton();
	
	public static Singleton get(){
		return s;
	}
	
	@Override
	public String toString() {
		return "Singleton";
	}

}
