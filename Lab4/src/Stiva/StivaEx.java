package Stiva;

public class StivaEx extends Array {
	
	private int size = 0;
	
	public int pop(){
		
		if(size == 0)
			return ERROR;
		
		int el = get(size-1);
		set(size-1,0);
		size--;
		return el;
	}
	
	public int push(int el){
		if(get(size) == Array.ERROR)
			return ERROR;
		else{
			set(size,el);
			size++;
		}
		return 0;
	}
	
	
	public StivaEx(){
		super();
	}
	
	public StivaEx(int n){
		super(n);
	}
	
	@Override
	public String toString(){
		String s = "[";
		if(size >= 1)
			s += get(0);
		for (int i = 1; i < size; ++i)
			s += "," + get(i);
		return s + "]";
	}
	
	public int top(){
		if(size == 0)
			return ERROR;
		return get(size-1);
	}
	
}
