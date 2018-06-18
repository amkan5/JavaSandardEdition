package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceInput.*;
/*계좌계설이랑 리스트 뽑기 
 * input:name, id, password
 * -AccNo 랜덤으로 발생
 * -createDate
 * -리스트 배열에 넣기.
 * output: accountType, Name, AccNo, createDate */
enum AButt{
	EXIT,
	ACCOUNT,
	MINUS_ACCOUNT,
	LIST,
	DEPOSIT,
	WITHDRAW,
	FIND_BY_ID,
	FIND_BY_NAME,
	MINUS_LIST
}
public class AccountController {
	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		AccountBean ac = null;
		MinusAccountBean mac = null;
		while(true) {
			AButt[] butt = {
				AButt.EXIT,
				AButt.ACCOUNT,
				AButt.MINUS_ACCOUNT,
				AButt.LIST,
				AButt.FIND_BY_ID,
				AButt.FIND_BY_NAME,
				AButt.MINUS_LIST
			};
		AButt menu = (AButt)JOptionPane.showInputDialog(
		           null, //frame
		           "ACCOUNT PAGE", //frame title
		           "SELECT MENU", //order
		           JOptionPane.QUESTION_MESSAGE, //type
		           null, // icon
		           butt, //Array of choices
		           butt[1] //default
		            );
		switch(menu) {
		case EXIT : return;
		case ACCOUNT : 
			ac = new AccountBean();
					ac.setName(JOptionPane.showInputDialog("Name"));
					ac.setUid(JOptionPane.showInputDialog("ID"));
					ac.setPass(JOptionPane.showInputDialog("Pass"));
			service.createAccount(ac);
			JOptionPane.showMessageDialog(null,ac.toString());
			break;
		case MINUS_ACCOUNT : 
			mac = new MinusAccountBean();
			mac.setName(JOptionPane.showInputDialog("Name"));
			mac.setUid(JOptionPane.showInputDialog("ID"));
			mac.setPass(JOptionPane.showInputDialog("Pass"));
			mac.setLimit(Integer.parseInt(JOptionPane.showInputDialog("Limit?")));
			service.createAccount(mac);
			JOptionPane.showMessageDialog(null,mac.toString());
			break;
		case LIST : 
			JOptionPane.showMessageDialog(null, service.showResult());
			break;
		case MINUS_LIST : 
			JOptionPane.showMessageDialog(null, service.showMinusResult());
			//마이너스만 나오게                                                                           
			break;
		case FIND_BY_ID:
			/* id와 pass 받아서 일치하면
			 * 계좌내역을 받아줘. 단, 혹시 모르니까 비번은 *** 처리해                                 
			 * **/
			ac = new AccountBean();
			ac.setUid(JOptionPane.showInputDialog("ID"));
			ac.setPass(JOptionPane.showInputDialog("Pass"));
			AccountBean a = service.findByID(ac);
			JOptionPane.showMessageDialog(null, service.findByID(ac)/*a.toString()*/);
			//list필드에 있어서 볼수가있음?
			break;
		case FIND_BY_NAME: 
			AccountBean[] arr = service.findByName(JOptionPane.showInputDialog("name"));
			JOptionPane.showMessageDialog(null, service.showNameResult(arr));
			break;
		default : break;
		}			
		}
	}
}
