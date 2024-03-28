package gym.Service;

import java.util.List;

import gym.Model.Member;

public interface MemberService {

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
}