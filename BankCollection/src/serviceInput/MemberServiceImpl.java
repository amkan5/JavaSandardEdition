package serviceInput;
import java.util.List;
import java.util.ArrayList;
import domain.*;
import service.*;
public  class MemberServiceImpl implements MemberService{
	List<MemberBean> list;
	
	public MemberServiceImpl() {
		list = new ArrayList<MemberBean>();
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
	public List<MemberBean> search(String param) {
		List<MemberBean> temp = new ArrayList<>();
		for (int i=0;i<list.size();i++) {
			if(param.equals(list.get(i).getName())) {
				temp.add(list.get(i));
		}
		}
		return temp;
	}

	@Override
	public MemberBean search(MemberBean member) {
		MemberBean dap = new MemberBean();
		for(int i=0;i<list.size();i++) {
			if(member.getUid().equals(list.get(i).getUid())) {
				dap = list.get(i);
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
