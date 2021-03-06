package Step5;

import javax.swing.JOptionPane;
enum Butt{
	EXIT,
	INPUT,
	LIST
}
public class Salary {
	public static void main(String[] args) {
		int cnt = 0;
		String[][] mtx = new String[5][5];
		while(true) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.INPUT,
				Butt.LIST
		};
		Butt menu = (Butt)JOptionPane.showInputDialog(
				null, //frame
				"Salary PAGE", //frame title
				"SELECT Salary MENU", //order
				JOptionPane.QUESTION_MESSAGE, //type
				null, //icon
				buttons, //Array of choices
				buttons[1] //default
				);
		switch(menu) {
		case EXIT : return;
		case INPUT : 
			String[] ind = {"부서","성명","본봉","수당"};
			for (int i=0;i<4;i++) {
				mtx[cnt][i] = JOptionPane.showInputDialog(ind[i]);
			}
			mtx[cnt][4] = String.valueOf(Integer.parseInt(mtx[cnt][2])+Integer.parseInt(mtx[cnt][3]));
			cnt++;
			break;
		case LIST : 
			String result = "부서  성명  본봉  수당  합계\n"; 
			for(int i=0;i<cnt;i++) {
				for (int j=0;j<5;j++) {
					result += mtx[i][j] + "  \t";
				}
				result += "\n";
			}
			JOptionPane.showMessageDialog(null, result);
			break;
		default : return;
		}
		
		}
	}

}
