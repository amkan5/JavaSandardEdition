package Step4;

public class Diagonal {
	public static void main(String[] args) {
	int[][] mtx = new int[6][6];
	int k= 0,r=0,c=2;
	for (int i=1;i<10;i++) {
		if(i<=5) {
		r=0;
		for (int j=1;j<=i;j++) {
			k++;
			mtx[r+j][c-j] = k;
		}
		c++;
		}
		else {
			for (int j=1;j<=10-i;j++) {
			 k++;
			 mtx[r+j+1][c-j-1] = k;	
			}
			r++;
		}
	}
		
	for (int i=1;i<=5;i++) {
		for (int j=1;j<=5;j++) {
		System.out.print(mtx[i][j] + "\t");	
		}
		System.out.println();
	}
	System.out.println((int)(Math.random()*45));
	}
}
