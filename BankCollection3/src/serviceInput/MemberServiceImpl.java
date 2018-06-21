package serviceInput;
import java.util.*;
import domain.*;
import service.*;
/*
 * 맵쓰기**/

public  class MemberServiceImpl implements MemberService{
	Map <String,MemberBean> map;
	
	public MemberServiceImpl() {
		map = new HashMap<>();
	}
	
	@Override
	public void createUser(UserBean user) {
	user.setCreditRating("7");
	map.put(user.getUid(),user);
	}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		map.put(staff.getUid(), staff);
	}

	@Override
	public Map <String,MemberBean> map() {
		return map;
	}

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
	}

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
}
