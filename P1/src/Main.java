
public class Main {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.setRectangle(4, 5);
		rec1.CalcArea();
		System.out.println("Area of rec1 = " + rec1.getArea());
		Rectangle rec2 = new Rectangle();
		rec2.setRectangle(3, 7);
		rec2.CalcArea();
		//rec2.setArea(50);
		System.out.println("Total Area(rec1+rec2) = " + (rec1.getArea()+rec2.getArea()));
		
		ColoredRec rec3 = new ColoredRec();
		System.out.println("The default  color of rec3 is: " + rec3.getColor());
		rec3.setColor("BLUE");
		rec3.setRectangle(5, 6);
		rec3.CalcArea();
		System.out.println("The color of rec3 is: " + rec3.getColor());
		System.out.println("Area of rec3 = " + rec3.getArea());
	}

}
