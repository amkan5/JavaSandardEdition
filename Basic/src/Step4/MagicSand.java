package Step4;

public class MagicSand {

	public static void main(String[] args) {
		int[][] mtx = new int[6][6];
		int k=0;
		for(int i=1;i<6;i++){
			if(i<4) {
			for (int j=i;j<=6-i;j++) {
				k++;
				mtx[i][j] = k;
			}
			} else {
				for(int j=6-i;j<=i;j++) {
					k++;
					mtx[i][j] =k;
				}
			}
		}
		for (int i=1;i<6;i++) {
			for (int j=1;j<6;j++) {
				System.out.print(mtx[i][j] + " " );
			}
			System.out.println("");
		}
	}

}
