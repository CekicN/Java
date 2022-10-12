import java.io.*;
public class Put {
	private Auto[] kolona;
	private int broj;
	public Put(String fajl)
	{
		FileReader f;
		try {
			f = new FileReader(fajl);
			BufferedReader b = new BufferedReader(f);
			broj = Integer.parseInt(b.readLine());
			kolona = new Auto[broj];
			for (int i = 0; i < broj; i++) {
				kolona[i] = new Auto(b);
			}
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void stampaj()
	{
		for (int i = 0; i < kolona.length; i++) {
			kolona[i].stampaj();
		}
	}
}
