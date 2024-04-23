package comm.ak.studentdatamanagement.dto;

public class Admin {
	private int Id;
	private String AdminName;
	private String Password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Admin [Id=" + Id + ", AdminName=" + AdminName + ", Password=" + Password + "]";
	}
}
