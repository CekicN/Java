
public class Main {

	public static void main(String[] args) {
		PointCity cp1, cp2;
		
		cp1 = new PointCity(2.3,1.1, "Prokuplje", 30000);
		cp2 = new PointCity(5.4,2.1, "Nis", 70000);
	
		cp1.PrintData();
		cp2.PrintData();
		System.out.println(cp1.meFrom(cp2));
	}

}
