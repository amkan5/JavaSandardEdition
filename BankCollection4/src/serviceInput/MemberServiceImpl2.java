package serviceInput;
import java.util.List;
import java.util.ArrayList;
import domain.*;
import service.*;
public  class MemberServiceImpl2 implements MemberService2{
	List<MemberBean> list;
	
	public MemberServiceImpl2() {
		list = new ArrayList<>();
	}
	
	@Override
	public void createUser(UserBean user) {
	user.setCreditRating("7");
		System.out.println("실행결과" + ((list.add(user))?"등록성공":"등록실패")); //add는 리턴이 불린. boolean은 결과값으로 못받음. 
	}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		list.add(staff);
	}

	@Override
	public List<MemberBean> list() {
		return list;
	}

	@Override
	public List<MemberBean> search(String param) { //네임찾기고
		List<MemberBean> temp = new ArrayList<>();
		for (MemberBean e : list) {
			if(param.equals(e.getName())) {
				temp.add(e);
		}
		}
		return temp;
	}

	@Override
	public MemberBean search(MemberBean member) { //아이디 찾기
		MemberBean dap = new MemberBean();
		for(MemberBean e : list) {
			if(member.getUid().equals(e.getUid())) {
				dap = e;
				break;
			}
		}
		return dap;
	}

	@Override
	public void update(MemberBean member) {
	search(member).setPass(member.getPass());
	}

	@Override
	public void delete(MemberBean member) {
		list.remove(list.indexOf(search(member)));
		// list.remove(search(member));
	
	}
}
