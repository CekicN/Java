
public class Buffer {
	private int[] bafer;
	private int kap;
	
	public Buffer(int n)
	{
		kap = n;
		bafer = new int[kap];
	}
	
	public synchronized void add(int e)
	{
		try {
			this.wait();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
