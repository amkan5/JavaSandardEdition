package step3;
/*import java.util.Scanner;*/
import javax.swing.JOptionPane;
public class Starbuks {
	public static int getPrice(int count,String menu) {
		int[] price = {3000,3500,4000};
		int result =count*price[Integer.parseInt(menu)-1];
		return result;
	}
	public static int getTotal() {
		int result =0;

		return result;
	}
	public static void main(String[] args) {
		/*JOptionPane sc = new JOptionPane();*/
		int total = 0,  count=0;
		String result="";
		while(true) {
			String menu = JOptionPane.showInputDialog("무엇으로드릴까요?\n0.종료\n1.아메리카노3000\n" 
					+ "2.라떼 3500\n" 
					+  "3.카푸치노4000\n");
			switch(Integer.parseInt(menu)) {
			case 0: JOptionPane.showMessageDialog(null, "결제금액이 총 " + total + "원입니다\n");
			return;			
			case 1: case 2: case 3: 
				int[] price = {3000,3500,4000};
				total += Integer.valueOf(JOptionPane.showInputDialog("몇잔 드릴까요?"))*price[Integer.valueOf(menu)-1];
				break;	
			default : return;
			}	
		}
	}
}
