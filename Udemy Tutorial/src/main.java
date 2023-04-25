import java.util.Scanner;
class Person
{
	String name;
	int age;
	Scanner input = new Scanner(System.in);
	public void Unesi()
	{
		name = input.nextLine();
		age = input.nextInt();
	}
	public void Ispisi()
	{
		System.out.println("Ime:" + name + ", Godine: " + age);
	}
}
public class main {

	public static void main(String[] args) {
        Person p1 = new Person();
		p1.Unesi();
	    p1.Ispisi();
	}

}
