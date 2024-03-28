package gym.DAO;

import java.util.List;

import gym.Model.Member;

public interface MemberDAO {

    // Create a new member
    void createMember(Member member);

    // Update an existing member
    void updateMember(Member member);

    // Delete a member
    void deleteMember(Member member);

    // Retrieve all members
    List<Member> getAllMembers();

    // Retrieve a member by their ID
    Member getMemberById(long memberId);

    // Display all members (you might not need this method if it duplicates getAllMembers())
    List<Member> displayAllMembers();

    // Display all members (alternative method name)
	List<Member> displayAllMember();
}
