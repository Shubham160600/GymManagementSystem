package shub.Service;

import java.util.List;

import shub.Model.Member;

public interface MemberService {
    void addMember(Member member);

    void updateMember(Member member);

    void deleteMember(int memberId);

    void exitMember(int memberId);

    Member getMemberById(int memberId);

    List<Member> getAllMembers();
}
