
public class Alat {
	public static <K,V> boolean istiSu(Par<K,V> p1, Par<K,V> p2)
	{
		return (p1.getKljuc().equals(p2.getKljuc()) && p1.getVrednost().equals(p2.getVrednost()));
	}
}
