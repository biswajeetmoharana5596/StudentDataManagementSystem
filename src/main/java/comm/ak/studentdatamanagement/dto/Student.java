package comm.ak.studentdatamanagement.dto;

public class Student {
	private int Id;
	private String Name;
	private String Email;
	private String Std;
	private String Sec;
	private String OverAllPercentage;
	private String Gender;
	private String ParentContact;
	private String Remarks;
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
	public String getStd() {
		return Std;
	}
	public void setStd(String std) {
		Std = std;
	}
	public String getSec() {
		return Sec;
	}
	public void setSec(String sec) {
		Sec = sec;
	}
	public String getOverAllPercentage() {
		return OverAllPercentage;
	}
	public void setOverAllPercentage(String overAllPercentage) {
		OverAllPercentage = overAllPercentage;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getParentContact() {
		return ParentContact;
	}
	public void setParentContact(String parentContact) {
		ParentContact = parentContact;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
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
		return "Student [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Std=" + Std + ", Sec=" + Sec
				+ ", OverAllPercentage=" + OverAllPercentage + ", Gender=" + Gender + ", ParentContact=" + ParentContact
				+ ", Remarks=" + Remarks + ", Address=" + Address + ", Password=" + Password + "]";
	}
	
}
