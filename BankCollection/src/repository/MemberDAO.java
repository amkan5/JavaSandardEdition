package repository;
import java.lang.reflect.Member;
import java.util.List;
import domain.*;
public interface MemberDAO {
	public void insertMember(MemberBean member);
	public List<MemberBean> selectMember();
	public List<MemberBean> selectMemberyByName(String name);
	public MemberBean selectMemberById(String id);
	public Member login(MemberBean member);
	public int countMembers();
	public void updateMember(MemberBean member);
	public void deleteMember(MemberBean member);
}
