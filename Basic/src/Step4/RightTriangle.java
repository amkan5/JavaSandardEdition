package Step4;

public class RightTriangle {

	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k=0,j=0;
		for (int i=0;i<5;i++) {
			for (j=4-i;j<5;j++) {
				k++;
				mtx[i][j] = k;
			}
		}
		for (int i=0;i<5;i++) {
			for (j=0;j<5;j++) {
				System.out.print(mtx[i][j] + " " );
			}
			System.out.println("");
		}

	}

}
