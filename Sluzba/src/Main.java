
public class Main {
	public static void main(String[] args) {
		Student s1 = null;
		Student s2 = new Student();
		
		int[] pom = new int[Student.brIsp];
		for (int i = 0; i < pom.length; i++) {
			pom[i] = (int)(Math.random()*6 + 5);
		}
		Student s3 = new Student(pom);
		
		try {
			System.out.println(Sluzba.prosek(s1));
		} catch (NemaOcena e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NemaStudenta e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
