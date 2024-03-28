// Trainer.java
package gym.Model;

import java.util.Date;

import javax.persistence.*;

//import gym.Enum.Gender;

@Entity
@Table(name = "Trainer")
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainer_id")
	private long trainerId;
	@Column(name = "first_name")
    private String firstName;
	@Column(name = "last_name")
    private String lastName;
//	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private String gender;
//    private Gender gender;
//	@Column(name = "date_of_birth")
//    private Date dateOfBirth;
	@Column(name = "contact_number")
    private String contactNumber;
	@Column(name = "email")
    private String email;
	@Column(name = "address")
    private String address;
	@Column(name = "hire_date")
    private Date hireDate;
	
	// Getters and setters

	/**
	 * @return the trainerId
	 */
	public long getTrainerId() {
		return trainerId;
	}
	/**
	 * @param trainerId the trainerId to set
	 */
	public void setTrainerId(long trainerId) {
		this.trainerId = trainerId;
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
	 * @return the hireDate
	 */
	public Date getHireDate() {
		return hireDate;
	}
	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	// Generate Constructor using Fields
	
	/**
	 * @param trainerId
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param dateOfBirth
	 * @param contactNumber
	 * @param email
	 * @param address
	 * @param hireDate
	 */
	public Trainer(long trainerId, String firstName, String lastName, String gender,
			String contactNumber, String email, String address, Date hireDate) {
		super();
		this.trainerId = trainerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.hireDate = hireDate;
	}
	
	// Generate Constructors from Superclass
	
	/**
	 * 
	 */
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Generate toString()
	
	@Override
	public String toString() {
		return "Trainer [" + 
				"trainerId=" + trainerId +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", gender='" + gender + '\'' +
				", contactNumber='" + contactNumber + '\'' +
				", email='" + email	+ '\'' +
				", address='" + address + '\'' +
				", hireDate=" + hireDate +
				']';
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}	
}
	