package controller;

import java.util.List;
import domain.*;
import service.*;
import serviceInput.*;

public class AccountController {
	private static AccountController instance = new AccountController();
	public static AccountController getInstance() {
		return instance;
	}
	private AccountController() {
	}
	public void account(AccountBean acc) {
	System.out.println("==========어카운트 컨트롤러===========");
	System.err.println("화면에서 넘어온 객체는" + acc);
	AccountServiceImpl.getInstance().createAccount(acc);
	}
	public void minusAccount() {
		
		MinusAccountBean mac = new MinusAccountBean();
/*		mac.setName(JOptionPane.showInputDialog("Name"));
		mac.setUid(JOptionPane.showInputDialog("ID"));
		mac.setPass(JOptionPane.showInputDialog("Pass"));
		mac.setLimit(Integer.parseInt(JOptionPane.showInputDialog("Limit?")));*/
		/*service.createAccount(mac);*/
		/*JOptionPane.showMessageDialog(null,mac.toString());*/
	}
	public void list() {
		/*AccountService service = new AccountServiceImpl();*/
		/*JOptionPane.showMessageDialog(null, service.map());*/
	}
	public void findById() {
		
		AccountBean ac = new AccountBean();
		/*ac.setUid(JOptionPane.showInputDialog("ID"));
		ac.setPass(JOptionPane.showInputDialog("Pass"));*/
		/*AccountBean a = service.findById(ac);
		JOptionPane.showMessageDialog(null, service.findById(ac));*/
	}
	public void findByName() {
		
	/*	List<AccountBean> arr = service.findByName(JOptionPane.showInputDialog("name"));
		JOptionPane.showMessageDialog(null, arr);*/
	}
	public void updatePassword() {
		
		/*AccountBean ac = new AccountBean();*/
		/*ac.setUid(JOptionPane.showInputDialog("ID"));
		ac.setPass(JOptionPane.showInputDialog("Pass")
				+"/"+
				JOptionPane.showInputDialog("New Pass") 
				);
	service.updatePassword(ac);*/
	}
	public void deleteAccount() {
		/*AccountService service = new AccountServiceImpl();*/
		AccountBean ac = new AccountBean();
	/*	ac.setUid(JOptionPane.showInputDialog("ID"));
		ac.setPass(JOptionPane.showInputDialog("Pass")
				+"/"+
				JOptionPane.showInputDialog("Confirm Pass") 
				);*/
	/*	service.deleteAccount(ac);*/
	}
	
}
