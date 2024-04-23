package comm.ak.studentdatamanagement.repository;

import java.sql.Connection;
import java.util.List;

import comm.ak.studentdatamanagement.dto.Teacher;

public class TeacherRepositoryImp implements TeacherRepository {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher TeacherLogin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher getTeacherById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher deleteTeacher(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher updateTeacher(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherBySubject(String subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherByStdAndSec(String std) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeacherBySal(int sal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return null;
	}

}
