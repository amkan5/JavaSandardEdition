package serviceInput;
import java.lang.reflect.Member;
import repository.*;
import repositoryImpl.*;
import java.util.*;

import controller.MemberController;
import domain.*;
import service.*;
/*
 * 맵쓰기**/

public  class MemberServiceImpl implements MemberService{
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {
		return instance;
	}
	MemberDAO dao;
	private MemberServiceImpl() {
	}
	
	Map <String,MemberBean> map;
	List<MemberBean> list;
	
	@Override
	public void createUser(UserBean member) {
	member.setCreditRating("7");
	System.out.println("==========멤버 서비스===========");
	System.out.println("컨트럴로에서 넘어온 객체는" + member);
	MemberDAOImpl.getInstance().insertMember(member);
	}

	/*@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		map.put(staff.getUid(), staff);
	}*/

/*	@Override
	public Map <String,MemberBean> map() {
		return map;
	}*/
/*
	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> temp = new ArrayList<>();
		Set<MemberBean> set= new HashSet<>();
		for(Map.Entry<String, MemberBean> e :map.entrySet()) { 
			//entry는 키를 없애고 value들만 넣은거 
			if(name.equals(e.getValue().getName())) {
				set.add(e.getValue());
			}
		}
		Iterator<MemberBean> it = set.iterator(); //순환하라고... 
		while(it.hasNext()) {
				temp.add(it.next());
		}
		System.out.println("찾는 아이디에 해당하는 이름 : ");
		return temp;
	}*/

	@Override
	public MemberBean findById(MemberBean member) {
		System.out.println("찾는 아이디에 해당하는 이름: "+map.get(member.getUid()));
		return map.get(member.getUid());
	}
	@Override
	public void updatePassword(MemberBean member) {
		String id = member.getUid();
		String oldPass = member.getPass().split("/")[0];
		String newPass = member.getPass().split("/")[1];
		findById(member).setPass(member.getPass());
		MemberBean mem = map.get(member.getUid());
		if(mem==null) {
			System.out.println("수정하려는 ID가 없음");
		}else if(oldPass.equals(mem.getPass())) {
			mem.setPass(newPass);
			map.put(id, mem);
		}
		
	}

	@Override
	public void deleteMember(MemberBean member) {
		map.remove(findById(member));
	}

	@Override
	public String login(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
}
