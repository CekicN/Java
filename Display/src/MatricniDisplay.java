import java.util.Iterator;

public class MatricniDisplay extends Display{

	private char mat[][][];
	
	public MatricniDisplay()
	{
		super();
		mat = new char [3][5][2];
		mat[0][0][0] = '*'; mat[1][0][0] = '*'; mat[2][0][0] = '*';
		mat[0][1][0] = '*'; mat[1][1][0] = ' '; mat[2][1][0] = '*';
		mat[0][2][0] = '*'; mat[1][2][0] = ' '; mat[2][2][0] = '*';
		mat[0][3][0] = '*'; mat[1][3][0] = ' '; mat[2][3][0] = '*';
		mat[0][4][0] = '*'; mat[1][4][0] = '*'; mat[2][4][0] = '*';
		
		mat[0][0][1] = ' '; mat[1][0][1] = '*'; mat[2][0][1] = '*';
		mat[0][1][1] = '*'; mat[1][1][1] = ' '; mat[2][1][1] = '*';
		mat[0][2][1] = ' '; mat[1][2][1] = ' '; mat[2][2][1] = '*';
		mat[0][3][1] = ' '; mat[1][3][1] = ' '; mat[2][3][1] = '*';
		mat[0][4][1] = ' '; mat[1][4][1] = ' '; mat[2][4][1] = '*';
	}
	public MatricniDisplay(int c)
	{
		super(c);
		mat = new char [3][5][2];
		mat[0][0][0] = '*'; mat[1][0][0] = '*'; mat[2][0][0] = '*';
		mat[0][1][0] = '*'; mat[1][1][0] = ' '; mat[2][1][0] = '*';
		mat[0][2][0] = '*'; mat[1][2][0] = ' '; mat[2][2][0] = '*';
		mat[0][3][0] = '*'; mat[1][3][0] = ' '; mat[2][3][0] = '*';
		mat[0][4][0] = '*'; mat[1][4][0] = '*'; mat[2][4][0] = '*';
		
		mat[0][0][1] = ' '; mat[1][0][1] = '*'; mat[2][0][1] = '*';
		mat[0][1][1] = '*'; mat[1][1][1] = ' '; mat[2][1][1] = '*';
		mat[0][2][1] = ' '; mat[1][2][1] = ' '; mat[2][2][1] = '*';
		mat[0][3][1] = ' '; mat[1][3][1] = ' '; mat[2][3][1] = '*';
		mat[0][4][1] = ' '; mat[1][4][1] = ' '; mat[2][4][1] = '*';
	}
	@Override
	public void stampaj() {
		for(int i=0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[j][i][cifra]);
			}
			System.out.println();
		}
		
	}

}
