
public class ColoredRec extends Rectangle{
	String color;
	
	public ColoredRec(){
		length = width = area = 0;
		color = "White";
	}
	
	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}
}
