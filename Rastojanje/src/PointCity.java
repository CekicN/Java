
public class PointCity extends Point {
	
	private String name;
	private int pop;
	
	public PointCity()
	{
		super();
		pop = 0;
	}
	public PointCity(double x, double y, String name, int pop)
	{
		super(x,y);
		this.name = name;
		this.pop = pop;
	}
	
	public void PrintData()
	{
		super.PrintData();
		System.out.println(", "+ name+", "+pop);
	}
}
