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
		Phone phone = null; //다형성
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
				phone = new CellPhone();
				phone.setName(JOptionPane.showInputDialog("이름은?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				phone.setCall(JOptionPane.showInputDialog("전화내용은?"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case IPHONE :  
				phone = new IPhone();
				phone.setName(JOptionPane.showInputDialog("이름은?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				((IPhone) phone).setData(JOptionPane.showInputDialog("문자내용은?"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case GALAXYPHONE : 
				phone = new GalaxyPhone();
				phone.setName(JOptionPane.showInputDialog("이름은?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호는?"));
				((IPhone) phone).setData(JOptionPane.showInputDialog("카톡내용은?"));
				((GalaxyPhone) phone).setSize();
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			default: break;
			}
		}
	}
	

}
