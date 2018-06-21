package controller;

import java.util.List;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceInput.*;
enum AButt{
	EXIT,
	ACCOUNT,
	MINUS_ACCOUNT,
	LIST,
	DEPOSIT,
	WITHDRAW,
	FIND_BY_ID,
	FIND_BY_NAME,
	MINUS_LIST,
	CHANGE_PASS,
	DELETE_ACCOUNT
}

public class AccountController {
	public void account() {
		AccountService service = new AccountServiceImpl();
		AccountBean ac = new AccountBean();
		ac.setName(JOptionPane.showInputDialog("Name"));
		ac.setUid(JOptionPane.showInputDialog("ID"));
		ac.setPass(JOptionPane.showInputDialog("Pass"));
		service.createAccount(ac);
		JOptionPane.showMessageDialog(null,ac.toString());
	}
	public void minusAccount() {
		AccountService service = new AccountServiceImpl();
		MinusAccountBean mac = new MinusAccountBean();
		mac.setName(JOptionPane.showInputDialog("Name"));
		mac.setUid(JOptionPane.showInputDialog("ID"));
		mac.setPass(JOptionPane.showInputDialog("Pass"));
		mac.setLimit(Integer.parseInt(JOptionPane.showInputDialog("Limit?")));
		service.createAccount(mac);
		JOptionPane.showMessageDialog(null,mac.toString());
	}
	public void list() {
		AccountService service = new AccountServiceImpl();
		JOptionPane.showMessageDialog(null, service.map());
	}
	public void findById() {
		AccountService service = new AccountServiceImpl();
		AccountBean ac = new AccountBean();
		ac.setUid(JOptionPane.showInputDialog("ID"));
		ac.setPass(JOptionPane.showInputDialog("Pass"));
		AccountBean a = service.findById(ac);
		JOptionPane.showMessageDialog(null, service.findById(ac));
	}
	public void findByName() {
		AccountService service = new AccountServiceImpl();
		List<AccountBean> arr = service.findByName(JOptionPane.showInputDialog("name"));
		JOptionPane.showMessageDialog(null, arr);
	}
	public void updatePassword() {
		AccountService service = new AccountServiceImpl();
		AccountBean ac = new AccountBean();
		ac.setUid(JOptionPane.showInputDialog("ID"));
		ac.setPass(JOptionPane.showInputDialog("Pass")
				+"/"+
				JOptionPane.showInputDialog("New Pass") 
				);
	service.updatePassword(ac);
	}
	public void deleteAccount() {
		AccountService service = new AccountServiceImpl();
		AccountBean ac = new AccountBean();
		ac.setUid(JOptionPane.showInputDialog("ID"));
		ac.setPass(JOptionPane.showInputDialog("Pass")
				+"/"+
				JOptionPane.showInputDialog("Confirm Pass") 
				);
		service.deleteAccount(ac);
	}
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
				AButt.MINUS_LIST,
				AButt.CHANGE_PASS,
				AButt.DELETE_ACCOUNT
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
			break;
		case MINUS_ACCOUNT : 
			break;
		case LIST : 
			break;
		case MINUS_LIST : 
		                                                                  
			break;
		case FIND_BY_ID:
			break;
		case FIND_BY_NAME: 
			break;
	case CHANGE_PASS:	
			break;
		case DELETE_ACCOUNT :                                                                                                                                                  
			break;
		default : break;
		}			
		}
	}
}
