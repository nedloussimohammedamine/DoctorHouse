package models;

public class Doctor {
     int id;
     String name;
     String mail;
     String speciality;
     String username;
     String password;
	public Doctor(int id, String name, String mail, String speciality, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.speciality = speciality;
		this.username = username;
		this.password = password;
	}
	public Doctor() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
