
public class Point {

	protected double x, y;
	
	public Point()
	{
		x=y=0;
	}
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double meFrom(Point p)
	{
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	
	public static double dist(Point p1, Point p2)
	{
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
	
	public void printData()
	{
		System.out.print(x+ ", " + y);
	}
}
