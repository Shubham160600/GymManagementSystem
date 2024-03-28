package gym.ServiceImpl;

import java.util.List;
import gym.DAOImpl.MemberDaoImpl;
import gym.Model.Member;
import gym.Service.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberDaoImpl mdao = new MemberDaoImpl();
	
//	@Override
	public void createMember(Member member) {
		mdao.createMember(member);
			
	}

//	@Override
	public void updateMember(Member member) {
		mdao.updateMember(member);
	}

//	@Override
	public void deleteMember(Member member) {
		mdao.deleteMember(member);
	}

//	@Override
	public List<Member> getAllMembers() {
		return mdao.getAllMembers();
	}

//	@Override
	public Member getMemberById(long memberId) {
        return mdao.getMemberById(memberId);
	}

	public void displayAllMember() {
		// TODO Auto-generated method stub
		
	}
}
//
//	@Override
//	public void createMember(Member member) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateMember(Member member) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteMember(Member member) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void addTrainer(Trainer trainer) {
//		// TODO Auto-generated method stub
//		
//	}
	






//import gym.DAOImpl.MemberDao;
//import gym.Model.Member;
//import gym.ServiceImpl.MemberService;
//import java.util.List;
//
//public class MemberService {
//
//    private MemberDao memberDAO;
//
//    public MemberService() {
//        this.memberDAO = new MemberDao();
//    }
//
//    // Method to save a new member
//    public void saveMember(Member member) {
//        memberDAO.createMember(member);
//    }
//
//    // Method to update a member
//    public void updateMember(Member member) {
//        memberDAO.updateMember(member);
//    }
//
//    // Method to display all members
//    public List<Member> getAllMembers() {
//        return memberDAO.getAllMembers();
//    }
//
//    // Method to delete a member
//    public void deleteMember(int memberId) {
//        memberDAO.deleteMember(memberId);
//    }
//}
