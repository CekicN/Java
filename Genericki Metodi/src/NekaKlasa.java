
public class NekaKlasa {
	public static <T> void metod(T p)
	{
		T pod = p;
		System.out.println(pod.getClass().getName());
	}
}
