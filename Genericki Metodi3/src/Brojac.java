import java.util.Iterator;

public class Brojac {
	public static <T extends Comparable<T>> int pobroj(T[] niz , T elem)
	{
		int b = 0;
		for (T t : niz) {
			if (t.compareTo(elem) > 0) {
				b++;
			}
		}
		return b;
	}
}
