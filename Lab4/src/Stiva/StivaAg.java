package Stiva;

public class StivaAg {

	private Array stack;
	private int size = 0;
	
	public StivaAg(){
		this.stack = new Array();
	}
	
	public StivaAg(int n){
		this.stack = new Array(n);
	}
	
	public int pop(){
		if(size == 0)
			return Array.ERROR;
		int el = stack.get(size-1);
		stack.set(size-1, 0);
		size--;
		return el;
	}
	
	public int push(int el){
		if(stack.get(size) == Array.ERROR)
			return Array.ERROR;
		else
			stack.set(size++, el);
		return 0;
	}
	
	public int top(){
		if(size == 0)
			return Array.ERROR;
		return stack.get(size-1);
	}
	
	public String toString(){
		String s = "[";
		if(size >= 1)
			s += stack.get(0);
		for (int i = 1; i < size; ++i)
			s += "," + stack.get(i);
		return s + "]";
	}
	/*
	public String toString(){
	 	  String s = stack.toString();
	 	  return s;
	}*/
	
}
