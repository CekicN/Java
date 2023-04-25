
public class CityPoint extends Point {
 
	private String name;
	private int pop;
	
	public CityPoint()
	{
		super();
		pop = 0;
	}
	public CityPoint(double x, double y, String name , int pop)
	{
		super(x,y);
		this.name = name;
		this.pop = pop;
	}
	
	public void printData()
	{
		super.printData();
		System.out.println(" " + name + ", " + pop);
	}
}
