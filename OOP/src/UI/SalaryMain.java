

/* 김길동,100 -> 김인턴 100만원 지급 (성만 발취)
 * 김길동,100 -> 김직원 110만원 지급 +10만원?
 * 김길동,100 -> 김이사 1100만원 지급 
 * Salary s = new Salary(
 * 이름, 기본급)
 * jopt.smd(null,new Salary,이름,기본급, toString);
 * **/


package UI;
import domain.*;
import javax.swing.JOptionPane;
enum SalaryButt{
	EXIT,
	INTERNSHIP,
	STAFF,
	OWNER
}
public class SalaryMain {
	public static void main(String[] args) {
		SalaryButt[] buttons = {
				SalaryButt.EXIT,
				SalaryButt.INTERNSHIP,
				SalaryButt.STAFF,
				SalaryButt.OWNER
		}; 
		Payment pay = null;
	while(true) {
		SalaryButt menu = (SalaryButt)JOptionPane.showInputDialog(
				null, //frame
				"Salary PAGE", //frame title
				"SELECT MENU", //order
				JOptionPane.QUESTION_MESSAGE, //type
				null, //icon
				buttons, //Array of choices
				buttons[1] //default
				);
		switch(menu){
			case EXIT : return;
			case INTERNSHIP : 
				JOptionPane.showMessageDialog(null, new Payment(
						JOptionPane.showInputDialog("이름은?"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급은?"))
						).toString());
				break;
			case STAFF : 
				JOptionPane.showMessageDialog(null, new StaffSalary(
						JOptionPane.showInputDialog("이름은?"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급은?"))
						).toString());
				break;
			case OWNER : 
				JOptionPane.showMessageDialog(null, new OwnerSalary(
						JOptionPane.showInputDialog("이름은?"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급은?"))
						).toString());
				break;
		}
	}
	}

}
