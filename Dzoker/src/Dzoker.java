import java.util.List;

public class Dzoker {
	public static <T>void stampaj(List<T> lista)
	{
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
