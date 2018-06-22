package controller;

import domain.*;
import service.*;
import serviceInput.*;

public class AdminController {
	private static AdminController instance = new AdminController();
	public static AdminController getInstance() {
		return instance;
	}
	private AdminController() {
	}
	public void add() {
		/*MemberService service = new MemberServiceImpl();*/
		MemberBean mem = new StaffBean();
		/*mem.setName(JOptionPane.showInputDialog("Name"));
		mem.setUid(JOptionPane.showInputDialog("ID"));
		mem.setPass(JOptionPane.showInputDialog("PASS"));
		mem.setSsn(JOptionPane.showInputDialog("주민번호"));
		mem.setAddr(JOptionPane.showInputDialog("주소"));
		mem.setPhone(JOptionPane.showInputDialog("전화번호"));*/
		/*service.createStaff((StaffBean) mem);*/
	}
	public void memberList() {
		
	}
	public void findMemberyByName() {
		
	}
	public void findMemberById() {
		
	}
	public void findAccountById() {
		
	}
	public void accountList() {
		
	}

}
