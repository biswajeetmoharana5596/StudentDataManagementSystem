package comm.ak.studentdatamanagement.dto;

public class Teacher {
	private int Id;
	private String Name;
	private String Email;
	private String Contact;
	private String Subject;
	private String ClassTeacher;
	private String Sal;
	private String Address;
	private String Password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getClassTeacher() {
		return ClassTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		ClassTeacher = classTeacher;
	}
	public String getSal() {
		return Sal;
	}
	public void setSal(String sal) {
		Sal = sal;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Teacher [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Contact=" + Contact + ", Subject="
				+ Subject + ", ClassTeacher=" + ClassTeacher + ", Sal=" + Sal + ", Address=" + Address + ", Password="
				+ Password + "]";
	}
	
	
}
