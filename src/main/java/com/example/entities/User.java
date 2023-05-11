package com.example.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

	@NotBlank(message = "User name can not be null !!")
	@Size(min = 5, max = 10, message = "User name must be between 5 to 10 character.")
	private String userName;
	@Email(regexp = "/^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$/", message = "Invalid Email")
	private String email;
	@AssertTrue(message="must agreed terms and conditions !! ")
	private boolean checkMark;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + "]";
	}
 
	
	public User(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isCheckMark() {
		return checkMark;
	}

	public void setCheckMark(boolean checkMark) {
		this.checkMark = checkMark;
	}

	

}
