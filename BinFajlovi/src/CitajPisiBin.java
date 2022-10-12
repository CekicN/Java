import java.io.*;
public class CitajPisiBin {
	
	public void upis()
	{
		try {
			FileOutputStream fo = new FileOutputStream("fajl.bin");
			BufferedOutputStream bf = new BufferedOutputStream(fo);
			DataOutputStream ds = new DataOutputStream(bf);
			
			ds.writeInt(10);
			ds.writeFloat(1.1f);
			ds.writeBoolean(false);
			ds.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void citanje()
	{
		try {
			FileInputStream fi = new FileInputStream("fajl.bin");
			BufferedInputStream bf = new BufferedInputStream(fi);
			DataInputStream d = new DataInputStream(bf);
			
			int celi = d.readInt();
			float realni  = d.readFloat();
			boolean logicki = d.readBoolean();
			d.close();
			System.out.println(celi +" "+realni+" "+ logicki);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}