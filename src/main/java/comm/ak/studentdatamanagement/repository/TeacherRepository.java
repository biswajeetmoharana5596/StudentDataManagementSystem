package comm.ak.studentdatamanagement.repository;

import java.sql.Connection;
import java.util.List;

import comm.ak.studentdatamanagement.dto.Teacher;

public interface TeacherRepository {
	Connection getConnection();
	
	Teacher TeacherLogin(String email,String password);
	
	String saveTeacher (Teacher teacher);
	
	Teacher getTeacherById(int id);
	
	Teacher deleteTeacher(int id);
	
	Teacher updateTeacher(int id);
	
	List<Teacher> getTeacherBySubject(String subject);
	
	List<Teacher> getTeacherByStdAndSec(String std);
	
	List<Teacher> getTeacherBySal(int sal);
	
	List<Teacher> getAllTeacher();
}
