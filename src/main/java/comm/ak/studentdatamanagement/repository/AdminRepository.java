package comm.ak.studentdatamanagement.repository;

import java.sql.Connection;

import comm.ak.studentdatamanagement.dto.Admin;

public interface AdminRepository {
	Connection getConnection();
	
	String saveAdmin(Admin admin);
	
	Admin AdminLogin(String adminName,String password);
}
