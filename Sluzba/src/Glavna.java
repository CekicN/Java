
public class Glavna {

	public static void main(String[] args) {

		//Sluzba ss= new Sluzba();
      Student s1=null;
      Student s2 = new Student();
      int[] pom = new int[Student.brIsp];
      for (int i = 0; i < Student.brIsp; i++) {
		pom[i] = (int)(Math.random() * 6+5);
      	
      }
      Student s3 = new Student(pom);
try {
	System.out.println(Sluzba.prosek(s2));
} catch (NemaOcena e) {
	System.out.println(e);
} catch (FaliStudent e) {
	System.out.println(e);
}
	}

}
