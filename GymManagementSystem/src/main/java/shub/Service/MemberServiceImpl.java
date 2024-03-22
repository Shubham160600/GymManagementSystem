package shub.Service;

import shub.DAO.MemberDAO;
import shub.Model.Member;
import java.util.List;

public class MemberServiceImpl implements MemberService {
    private MemberDAO memberDAO;

    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public void addMember(Member member) {
        memberDAO.addMember(member);
    }

    @Override
    public void updateMember(Member member) {
        memberDAO.updateMember(member);
    }

    @Override
    public void deleteMember(int memberId) {
        memberDAO.deleteMember(memberId);
    }

    @Override
    public void exitMember(int memberId) {
        memberDAO.exitMember(memberId);
    }

    @Override
    public Member getMemberById(int memberId) {
        return memberDAO.getMemberById(memberId);
    }

    @Override
    public List<Member> getAllMembers() {
        return memberDAO.getAllMembers();
    }
}
