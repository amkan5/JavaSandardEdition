package Step4;

import javax.swing.JOptionPane;
enum Butt {
	EXIT,
	LEFT_TRIANGLE,
	RIGHT_TRIANGLE,
	ZIGZAG,
	DIAMOND,
	SAMND_GLASS,
	TRIANGLE,
	DIAGONAL,
	MATRIX_CONVERSION,
	SNAIL,
	MAGIC_SQUARE;
}
public class Matrix {
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.LEFT_TRIANGLE,
				Butt.RIGHT_TRIANGLE,
				Butt.ZIGZAG,
				Butt.DIAMOND,
				Butt.SAMND_GLASS,
				Butt.TRIANGLE,
				Butt.DIAGONAL,
				Butt.MATRIX_CONVERSION,
				Butt.SNAIL,
				Butt.MAGIC_SQUARE
		};
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null, //frame
					"MATRIX PAGE", //frame title
					"SELECT MATRIX MENU", //order
					JOptionPane.QUESTION_MESSAGE, //type
					null, //icon
					buttons, //Array of choices
					buttons[1] //default
					);
			switch (select) {
			case EXIT : return;
			case LEFT_TRIANGLE:break;
			case RIGHT_TRIANGLE: break;
			case ZIGZAG:
				JOptionPane.showMessageDialog(null, zigzag());
				break;
			case DIAMOND : break;
			default: break;
			}
		}
	
	}
	public static String output() {
		return "";
	}
	public static String zigzag() {
		int[][] mtx = new int[5][5];
		int k=0;
		String result ="";
		for (int i=0;i<5;i++) {
			if(i%2==0) {
			for (int j=0;j<5;j++) {
				k++;
				mtx[i][j] = k;
			}
			}else{
			for (int j=4;j>=0;j--) {
				k++;
				mtx[i][j] =k;
			}
			}
		}
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				result += mtx[i][j] + "  ";
			}
			result += "\n";
		}
		return result;
	}
	
	public static String leftTriangle(){
		String result = "";
		
	return result;
	}
	
	public static String rightTriangle(){
		String result = "";
		
	return result;
		}
	public static String diamond(){
		String result = "";
		
	return result;
		}
	public static String sandglass(){
		String result = "";
		
	return result;
		}
	public static String triangle(){
		String result = "";
		
	return result;
		}
	public static String diagonal(){
		String result = "";
		
	return result;
		}
	public static String matrixConversion(){
		String result = "";
		
	return result;
		}
	public static String snail(){
		String result = "";
		
	return result;
		}
	public static String magicSquare(){
		String result = "";
		
	return result;
		}
}