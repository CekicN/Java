import kolekcije.*;

public class Glavna {
public static void main(String[] args) {
	Magacin m = new Magacin(10);
	System.out.println("Jel prazan?" + m.prazanje());
	
	for (int i = 0; i < 10; i++) {
		m.push((int)(10*Math.random()+ 1));
	}
	
	for (int i = 0; i < 10; i++) {
		System.out.println(m.pop());
	}
}
}
