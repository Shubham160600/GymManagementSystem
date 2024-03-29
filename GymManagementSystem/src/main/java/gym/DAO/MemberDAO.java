package gym.DAO;

import java.util.List;

import gym.Model.Member;

public interface MemberDAO {

    // Create a new member
	public void createMember(Member member);

    // Update an existing member
	public void updateMember(Member member);

    // Delete a member
	public void deleteMember(Member member);

    // Retrieve all members
    List<Member> displayAllMembers();

    // Retrieve a member by their ID
    Member getMemberById(long memberId);
    
    List<Member> getAllMembers();

}