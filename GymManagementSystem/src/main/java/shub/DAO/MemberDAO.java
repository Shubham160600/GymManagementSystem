// MemberDAO.java
package shub.DAO;

import java.util.List;
import shub.Model.Member;

public interface MemberDAO {
    void addMember(Member member);

    void updateMember(Member member);

    void deleteMember(int memberId);

    void exitMember(int memberId);

    Member getMemberById(int memberId);

    List<Member> getAllMembers();
}