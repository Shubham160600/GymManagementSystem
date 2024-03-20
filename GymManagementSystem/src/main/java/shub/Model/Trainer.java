// Trainer.java
package shub.Model;

import java.time.LocalDate;

import shub.Enum.Gender;

public class Trainer {
	private int trainerId;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private String contactNumber;
    private String email;
    private String address;
    private LocalDate hireDate;
	
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
	
	public Trainer(int trainerId, String firstName, String lastName, Gender gender, LocalDate dateOfBirth,
			String contactNumber, String email, String address, LocalDate hireDate) {
		super();
		this.trainerId = trainerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
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
	
    public Trainer(String string, String string2, int i, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}

	// Getter methods
    public int getTrainerId() {
        return trainerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // Setter methods
    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
