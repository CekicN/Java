
public class Glavna {

	public static void main(String[] args) {
		
		CityPoint cp1, cp2;
		
		cp1 = new CityPoint(1.1, 2.2, "Nis", 300000);
		cp2 = new CityPoint(1.1, 2.2, "Beograd", 230000);
	
	    cp1.printData();
	    cp2.printData();
	    
	    System.out.print(cp1.meFrom(cp2));
	}

}
