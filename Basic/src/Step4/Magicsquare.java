package Step4;

public class Magicsquare {
	public static void main(String[] args) {
	 int[][] mtx = new int[6][6];
	 int k=1,r=1,c=3;
	 	for (int i=1;i<6;i++){
	 		for(int j=1;j<6;j++) {
	 				System.out.println("mtx["+r+"]["+c+"] "+k);
	 				mtx[r][c] = k;
	 				r = (r<=1)? 5:r-1;
		 			c = (c>4)? 1:c+1;
		 			k++; 
	 			/*mtx[(r-j+5)%5][(c+j)%5] = ++k;*/
	 		}
	 		r = (r==5)? 2 : r+2;
	 		c = (c==1)? 5: c-1;
	 		System.out.println(i+"횟수");
	 	}
	 	
		for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
			System.out.print(mtx[i][j] + "\t");
		}
			System.out.println();
		}
	}
	}
