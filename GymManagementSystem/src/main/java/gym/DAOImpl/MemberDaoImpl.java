package gym.DAOImpl;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import gym.DAO.MemberDAO;
import gym.Model.Member;
import gym.Utility.HibernateUtil;

public class MemberDaoImpl implements MemberDAO {
    Scanner scanner = new Scanner(System.in);
    private SessionFactory sessionFactory;
    private MemberDaoImpl mdao;

    public MemberDaoImpl() {
        this.sessionFactory = HibernateUtil.getSessionFactory();

    }

    @Override
    public void createMember(Member member) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            // Creating a new customer instance
            Member newMember = new Member();
            long mid = 1;
            // Getting input from user for member details
            System.out.println("Enter First Name: ");
            String fName = scanner.nextLine();
            System.out.println("Enter Last Name: ");
            String lName = scanner.nextLine();
            System.out.println("Enter Gender: ");
            String gender = scanner.nextLine();
            System.out.println("Enter Contact Number: ");
            String cNumber = scanner.nextLine();
            System.out.println("Enter Email: ");
            String email = scanner.nextLine();
            System.out.println("Enter Address: ");
            String address = scanner.nextLine();

            newMember.setFirstName(fName);
            newMember.setLastName(lName);
            newMember.setGender(gender);
            newMember.setContactNumber(cNumber);
            newMember.setEmail(email);
            newMember.setAddress(address);
            newMember.setRegistrationDate(new Date());

            // Saving trainer object in the database
            session.save(newMember);
            transaction.commit();

            System.out.println("Member created successfully");

            session.close();

        } catch (Exception e) {
            System.out.println("Failed to create member!");
            e.printStackTrace();

        }
    }

    @Override
    public void updateMember(Member member) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            System.out.println("Enter Member ID to update: ");
            long mId = scanner.nextLong();
            scanner.nextLine(); // consume the newline character
            Member memberToUpdate = session.get(Member.class, mId);

            if (memberToUpdate != null) {
                System.out.println("Enter updated First Name: ");
                String fName = scanner.nextLine();
                System.out.println("Enter updated Last Name: ");
                String lName = scanner.nextLine();
                System.out.println("Enter updated Gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter updated Contact Number: ");
                String cNumber = scanner.nextLine();
                System.out.println("Enter updated Email: ");
                String email = scanner.nextLine();
                System.out.println("Enter updated Address: ");
                String address = scanner.nextLine();

                memberToUpdate.setFirstName(fName);
                memberToUpdate.setLastName(lName);
                memberToUpdate.setGender(gender);
                memberToUpdate.setContactNumber(cNumber);
                memberToUpdate.setEmail(email);
                memberToUpdate.setAddress(address);
                memberToUpdate.setRegistrationDate(new Date());

                session.save(memberToUpdate);
                transaction.commit();

                System.out.println("Member updated successfully");
            } else {
                System.out.println("Member ID" + mId + "not found");
            }

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deleteMember(Member member) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            System.out.println("Enter member Id to delete: ");
            long mid = scanner.nextLong();
            Member memberToDelete = session.get(Member.class, mid);

            if (memberToDelete != null) {
                session.delete(memberToDelete);
                transaction.commit();
                System.out.println("Member deleted successfully.");
            } else {
                System.out.println("Member ID " + mid + " not found.");
            }
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public List<Member> getAllMembers() {
        try (Session session = sessionFactory.openSession()) {
            String hql = "from Member";
            Query<Member> q = session.createQuery(hql, Member.class);
            return q.getResultList();
        } catch (Exception e) {
            System.out.println("Failed to retrieve members!");
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Member getMemberById(long memberId) {
        // return mdao.getMemberById(memberId);
        try (Session session = sessionFactory.openSession()) {
            return session.get(Member.class, memberId);
        } catch (Exception e) {
            System.out.println("Failed to retrieve member by ID!");
            e.printStackTrace();
            return null;
        }
    }

    // @Override
    public List<Member> displayAllMembers() {
        try (Session session = sessionFactory.openSession()) {
            String hql = "from Member";
            Query<Member> q = session.createQuery(hql, Member.class);
            List<Member> members = q.getResultList();
            for (Member member : members) {
                System.out.println("ID: " + member.getId() +
                        ", First Name: " + member.getFirstName() +
                        ", Last Name: " + member.getLastName() +
                        ", Gender: " + member.getGender() +
                        ", Contact Number: " + member.getContactNumber() +
                        ", Email: " + member.getEmail() +
                        ", Address: " + member.getAddress() +
                        ", Registration Date: " + member.getRegistrationDate());
            }
            return members;

        } catch (Exception e) {
            System.out.println("Failed to retrieve members!");
            e.printStackTrace();
            return null;
        }
    }
}