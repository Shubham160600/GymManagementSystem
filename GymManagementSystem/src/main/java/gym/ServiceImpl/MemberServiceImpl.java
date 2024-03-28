package gym.ServiceImpl;

import java.util.List;
import gym.DAOImpl.MemberDaoImpl;
import gym.Model.Member;
import gym.Service.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberDaoImpl mdao = new MemberDaoImpl();

	// @Override
	public void createMember(Member member) {
		mdao.createMember(member);

	}

	// @Override
	public void updateMember(Member member) {
		mdao.updateMember(member);
	}

	// @Override
	public void deleteMember(Member member) {
		mdao.deleteMember(member);
	}

	// @Override
	public List<Member> getAllMembers() {
		return mdao.getAllMembers();
	}

	// @Override
	public Member getMemberById(long memberId) {
		return mdao.getMemberById(memberId);
	}

	public void displayAllMember() {
		// TODO Auto-generated method stub

	}
}