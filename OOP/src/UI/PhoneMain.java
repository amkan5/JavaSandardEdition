package UI;

import javax.swing.JOptionPane;
import domain.Phone;
import domain.CellPhone;
import domain.IPhone;
import domain.GalaxyPhone;
//이름,전화번호,브랜드,제품종류,통화내역
//0.통화죵료 1.
enum Butt2{
	EXIT,
	TELEPHONE,
	CELLPHONE,
	IPHONE,
	GALAXYPHONE
}
public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = null;
		CellPhone cp = null;
		IPhone ip = null;
		GalaxyPhone gp = null;
		Butt2[] buttons = {
				Butt2.EXIT,
				Butt2.TELEPHONE,
				Butt2.CELLPHONE,
				Butt2.IPHONE,
				Butt2.GALAXYPHONE};
		while(true) {
			Butt2 menu = (Butt2)JOptionPane.showInputDialog(
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
			case TELEPHONE : 
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름은?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				phone.setCall(JOptionPane.showInputDialog("전화내용은?"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case CELLPHONE : 
				cp = new CellPhone();
				cp.setName(JOptionPane.showInputDialog("이름은?"));
				cp.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				cp.setCall(JOptionPane.showInputDialog("전화내용은?"));
				JOptionPane.showMessageDialog(null, cp.toString());
				break;
			case IPHONE : 
				ip = new IPhone();
				ip.setName(JOptionPane.showInputDialog("이름은?"));
				ip.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				ip.setData(JOptionPane.showInputDialog("문자내용은?"));
				JOptionPane.showMessageDialog(null, ip.toString());
				break;
			case GALAXYPHONE : 
				gp = new GalaxyPhone();
				gp.setName(JOptionPane.showInputDialog("이름은?"));
				gp.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				gp.setData(JOptionPane.showInputDialog("카톡내용은?"));
				gp.setSize();
				JOptionPane.showMessageDialog(null, gp.toString());
				break;
			default: break;
			}
		}
	}
	

}
