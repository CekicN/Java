import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Poruka p1 = new Poruka("aaa");
		Poruka p2 = new Poruka("bbb");
		Poruka p3 = new Poruka("ccc");
		
		p1.prikazi();
		p2.prikazi();
		p3.prikazi();
		
		System.out.println(p1.Broj());
	}
}
