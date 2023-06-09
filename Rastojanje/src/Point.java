
public class Point {
	protected double x, y;
	
	public Point()
	{
		x = y = 0;
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
	public static double dist(Point x, Point y)
	{
		return Math.sqrt(Math.pow(x.x - y.x, 2) + Math.pow(x.y - y.y, 2));
	}
	
	public void PrintData()
	{
		System.out.print(x+", " + y);
	}
}
