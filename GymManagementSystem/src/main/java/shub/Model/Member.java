// Member.java
package shub.Model;

import java.time.LocalDate;

import shub.Enum.Gender;

public class Member {
    private int memberId;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private String contactNumber;
    private String email;
    private String address;
    private LocalDate registrationDate;

    // Generate Constructor using Fields

    /**
     * @param memberId
     * @param firstName
     * @param lastName
     * @param gender
     * @param dateOfBirth
     * @param contactNumber
     * @param email
     * @param address
     * @param registrationDate
     */
    public Member(int memberId, String firstName, String lastName, Gender gender, LocalDate dateOfBirth,
            String contactNumber, String email, String address, LocalDate registrationDate) {
        super();
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
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

    public Member(String string, String string2, int i, String string3, String string4, String string5) {
        // TODO Auto-generated constructor stub
    }

    // Getter methods
    public int getMemberId() {
        return memberId;
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

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    // Setter methods
    public void setMemberId(int memberId) {
        this.memberId = memberId;
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

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
