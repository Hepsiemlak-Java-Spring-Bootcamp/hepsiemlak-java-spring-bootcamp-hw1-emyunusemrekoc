package model;

import java.util.List;
import java.util.Set;

public class User {

	private String email;
	private String password;
	private String photo;
	private String biography;
	private String phoneNumber;
	private List<Message> messageBox;

	public User() {
	}


	public User(String email, String password, String photo, String biography, String phoneNumber, List<Message> messageBox) {
		this.email = email;
		this.password = password;
		this.photo = photo;
		this.biography = biography;
		this.phoneNumber = phoneNumber;
		this.messageBox = messageBox;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Message> getMessageBox() {
		return messageBox;
	}

	public void setMessageBox(List<Message> messageBox) {
		this.messageBox = messageBox;
	}
}
