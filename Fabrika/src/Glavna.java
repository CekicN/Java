
public class Glavna {

	public static void main(String[] args) {

		Fabrika fab = new Fabrika(3);
		TrakaLizalica p = new TrakaLizalica(0, 1, 10, "Nikola");
		TrakaCokoladica p1 = new TrakaCokoladica(1, 2, 4, "Colja");
		TrakaSmokija p2 = new TrakaSmokija(2, 3, 5, "Milo");

		fab.dodaj(p);
		fab.dodaj(p1);
		fab.dodaj(p2);
		
		System.out.println(p.start(5));
		System.out.println(p1.start(4));
		System.out.println(p2.start(7.5));
		fab.upis("file.txt");
	}

}
