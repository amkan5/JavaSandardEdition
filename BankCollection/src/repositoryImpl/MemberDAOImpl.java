package repositoryImpl;
import java.lang.reflect.Member;
import java.util.List;

import domain.MemberBean;
import repository.MemberDAO;
public class MemberDAOImpl implements MemberDAO{
	private static MemberDAO instance = new MemberDAOImpl();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	public MemberDAOImpl() {
	}
	@Override
	public void insertMember(MemberBean member) {
		System.out.println(member);
		
	}

	@Override
	public List<MemberBean> selectMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> selectMemberyByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member login(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMembers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

}
