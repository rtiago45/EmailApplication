package entities;

import java.util.Scanner;

public class Email {

	public static Scanner in = new Scanner(System.in);

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;

	// Constructor with first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		System.out.println("DEPARMENT CODE: \n1 For sales \n2 For Development \n3 For Accounting \n0 For Leave");
		String choice = in.nextLine();
		// Call the department method
		switch (choice) {
		case "1":
			System.out.println("Department choose was: Sales");
			break;
		case "2":
			System.out.println("Department choose was: DEV");
			break;
		case "3":
			System.out.println("Department choose was: Counting");
			break;
		default:
			System.out.println("Type a valid department");
			break;
		}

		// Call the random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println();
		System.out.println("Your password is: " + this.password);
		System.out.println();
	}

	
	// generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#%&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setEmail(String email) {
		this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + "aeycompany.com";
	}
	
	public String getEmail() {
		return email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public String toString() {
		return "Your full name is: " + getFirstName() + " " + getLastName() + String.format("\nCompany email: ", getEmail()) + 
				String.format("\n", "Mail Box Capacity: ") + getMailBoxCapacity();
	}

}
