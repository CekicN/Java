
public class NasaKlasa implements Comparable<NasaKlasa>{

	int b;
public NasaKlasa(int b) {
this.b = b;
	
}
void set(int b)
{
	this.b = b;
}
int get()
{
	return b;
}
@Override
public int compareTo(NasaKlasa o) {
	if (this.b < o.b) {
		return -1;
	}
	else if(b > o.b)return 1;
	else return 0;

}
}
