// Member.java
package gym.Model;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "Member")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private long memberId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
//	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private String gender;
//	@Column(name = "date_of_birth")
//	private Date dateOfBirth;
	@Column(name = "contact_number")
	private String contactNumber;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;
	@Column(name = "registration_date")
	private Date registrationDate;
	
	// Generate Constructor using Fields
	
	/**
	 * @param memberId
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param contactNumber
	 * @param email
	 * @param address
	 * @param registrationDate
	 */
	public Member(long memberId, String firstName, String lastName, String gender, String contactNumber, String email,
			String address, Date registrationDate) {
		super();
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.registrationDate = registrationDate;
	}
	
	// Generate Constructors from Superclass
	
	/**
	 * 
	 */
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// Getters and setters
	
	/**
	 * @return the memberId
	 */
	public long getMemberId() {
		return memberId;
	}
	
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the registrationDate
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	// Generate toString()
	
	@Override
	public String toString() {
		return "Member [" + 
				"memberId=" + memberId +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", gender='" + gender + '\'' +
				", contactNumber='" + contactNumber + '\'' +
				", email='" + email	+ '\'' +
				", address='" + address + '\'' +
				", registrationDate=" + registrationDate +
				']';
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
}

	/*// Generate Constructor using Fields

	*//**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param dateOfBirth
	 * @param contactNumber
	 * @param email
	 * @param address
	 * @param registrationDate
	 * @param memberId
	 *//*
	public Member(int id, String firstName, String lastName, Gender gender, Date dateOfBirth, String contactNumber,
			String email, String address, Date registrationDate, int memberId) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.registrationDate = registrationDate;
		this.memberId = memberId;
	}

	// Generate Constructors from Superclass

	*//**
	 * 
	 *//*
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
	*//**
	 * @return the id
	 *//*
	public int getId() {
		return Id;
	}

	*//**
	 * @param id the id to set
	 *//*
	public void setId(int id) {
		Id = id;
	}

	*//**
	 * @return the firstName
	 *//*
	public String getFirstName() {
		return firstName;
	}

	*//**
	 * @param firstName the firstName to set
	 *//*
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	*//**
	 * @return the lastName
	 *//*
	public String getLastName() {
		return lastName;
	}

	*//**
	 * @param lastName the lastName to set
	 *//*
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	*//**
	 * @return the gender
	 *//*
	public Gender getGender() {
		return gender;
	}

	*//**
	 * @param gender the gender to set
	 *//*
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	*//**
	 * @return the dateOfBirth
	 *//*
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	*//**
	 * @param dateOfBirth the dateOfBirth to set
	 *//*
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	*//**
	 * @return the contactNumber
	 *//*
	public String getContactNumber() {
		return contactNumber;
	}

	*//**
	 * @param contactNumber the contactNumber to set
	 *//*
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	*//**
	 * @return the email
	 *//*
	public String getEmail() {
		return email;
	}

	*//**
	 * @param email the email to set
	 *//*
	public void setEmail(String email) {
		this.email = email;
	}

	*//**
	 * @return the address
	 *//*
	public String getAddress() {
		return address;
	}

	*//**
	 * @param address the address to set
	 *//*
	public void setAddress(String address) {
		this.address = address;
	}

	*//**
	 * @return the registrationDate
	 *//*
	public Date getRegistrationDate() {
		return registrationDate;
	}

	*//**
	 * @param registrationDate the registrationDate to set
	 *//*
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	*//**
	 * @return the memberId
	 *//*
	public int getMemberId() {
		return memberId;
	}

	*//**
	 * @param memberId the memberId to set
	 *//*
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
}

 * public static void main(String[] args) { Member member = new Member();
 * member.setId(1); member.setFirstName("Shubham");
 * member.setLastName("Saurabh"); member.setGender(Gender.MALE);
 * member.setDateOfBirth(new Date()); member.setContactNumber("1234567890");
 * member.setEmail("john.doe@gmail.com");
 * member.setAddress("123 Main St, City"); member.setRegistrationDate(new
 * Date()); member.setMemberId(1001);
 * 
 * // Displaying member details System.out.println("Member ID: " +
 * member.getId()); System.out.println("First Name: " + member.getFirstName());
 * System.out.println("Last Name: " + member.getLastName());
 * System.out.println("Gender: " + member.getGender());
 * System.out.println("Date of Birth: " + member.getDateOfBirth());
 * System.out.println("Contact Number: " + member.getContactNumber());
 * System.out.println("Email: " + member.getEmail());
 * System.out.println("Address: " + member.getAddress());
 * System.out.println("Registration Date: " + member.getRegistrationDate());
 * System.out.println("Member ID: " + member.getMemberId()); } }
 */