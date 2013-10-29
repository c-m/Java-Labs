
public class Rectangle {

	protected int length, width, area;
	
	public Rectangle(){
		length = width = area = 0;
	}
	
	public void setRectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	
	public int getArea(){
		return area;
	}
	
	public void setArea(int area){
		this.area = area;
	}
	
	public void CalcArea(){
		this.area = this.length * this.width;
	}
	
}