package Step4;

public class triangle {
	public static void main(String[] args) {
	 int[][] mtx = new int[9][5];
	 int k=0;
	 for(int j=1;j<=4;j++) {
		 for (int i=5-j;i<=j+3;i++) {
			 k++;
			 mtx[i][j] = k;
		 }
	 }
	 for (int i=1;i<8;i++) {
			for (int j=1;j<=4;j++) {
				System.out.print(mtx[i][j] + " " );
			}
			System.out.println("");
		}
	}
}
