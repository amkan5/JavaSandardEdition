package serviceInput;
import domain.MemberBean;
import domain.StaffBean;
import domain.UserBean;
import service.*;
public  class MemberServiceImpl implements MemberService{
	private MemberBean[] list;
	int count;
	public MemberServiceImpl() {
		list= new MemberBean[10];
		count = 0;
	}
	@Override
	public void createJoin(MemberBean mem) {
		((UserBean) mem).setCreditRating("7");
		addList(mem); 
	}

	@Override
	public void createAdd(MemberBean mem) {
		((StaffBean) mem).setAccessNum("1234");
		addList(mem);
	}
	
	@Override
	public void addList(MemberBean mem) {
		list[count++]  = mem;
	}
	
	@Override
	public MemberBean[] list() {
		return list;
	}
	@Override
	public String showResult() {
		String result = "";
		for(int i=0;i<count;i++) {
			result += list()[i].toString();
		}
		return result;
	}
	@Override
	public MemberBean readId(MemberBean mem) {
		for(int i=0;i<count;i++) {
			if((mem.getUid().equals(list[i].getUid()))&&
				(mem.getPass().equals(list[i].getPass()))	
					) {
				mem=list[i];
				break;
			}
		}
		return mem;
	}
	@Override
	public MemberBean[] readName(String name) {
		int cnt = 0,memcnt=0;
		for(int i=0;i<count;i++) {
			if(name.equals(list[i].getName())) {
				cnt++;
			}
		}
		MemberBean[] member = new MemberBean[cnt];
		for(int i=0;i<count;i++) {
			if(name.equals(list[i].getName())) {
				member[memcnt++] = list[i];
			}
		}
		return member;
	}
	@Override
	public String updatePass(MemberBean mem) {
		String msg = "";
		String pass = mem.getPass().split("/")[0];
		String newpass = mem.getPass().split("/")[1];
		mem.setPass(pass);
		mem = readId(mem);
		if(mem.getUid()==null) {
			msg = "ID 또는 비번 없음";
		} else if(!pass.equals(newpass)) {
			mem.setPass(newpass);
			msg = "변경완료";
		} else {
			msg = "변경실패";
		}
		return msg;
	}
	@Override
	public String deleteMember(MemberBean mem) {
		String msg = "";
		String pass = mem.getPass().split("/")[0];
		String newpass = mem.getPass().split("/")[1];
		mem.setPass(pass);
		for(int i=0;i<count;i++) {
			if((mem.getUid().equals(list[i].getUid()))&&
				(mem.getPass().equals(list[i].getPass()))&&
				(pass.equals(newpass))) {
				list[i]=list[--count];
				list[count]=null;
				msg = "성공";
				break;
			}else { 
				msg = "실패";
			}
		}
		return msg;
	}
}
