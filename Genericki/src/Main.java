
public class Main {
	public static void main(String[] args) {
		Par<Integer, String> p1 = new Par<>(10, "da");
		Par<Integer, String> p2 = new Par<>(10, "da");
		
		System.out.println(Alat.istiSu(p1, p2));
	}
}
