package org.easeyourlease.login;

public class LoginRequestDTO {
	
	String userID;
	String passcode;

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

}
