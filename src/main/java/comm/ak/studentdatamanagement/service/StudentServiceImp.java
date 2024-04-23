package comm.ak.studentdatamanagement.service;

import java.util.List;

import comm.ak.studentdatamanagement.dto.Student;
import comm.ak.studentdatamanagement.repository.StudentRepository;
import comm.ak.studentdatamanagement.repository.StudentRepositoryImp;
import comm.ak.studentdatamanagement.util.AES;
import comm.ak.studentdatamanagement.util.AppConstants;

public class StudentServiceImp implements StudentService {
	StudentRepository repository;
	{
		repository = new StudentRepositoryImp();
	}
	@Override
	public Student studentLogin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		String encEmail = AES.encrypt(student.getEmail(), AppConstants.SECRETKEY);
		String encAddress = AES.encrypt(student.getAddress(), AppConstants.SECRETKEY);
		String encParentContact = AES.encrypt(student.getParentContact(), AppConstants.SECRETKEY);
		String encPassword = AES.encrypt(student.getPassword(), AppConstants.SECRETKEY);
		
		student.setEmail(encEmail);
		student.setAddress(encAddress);
		student.setParentContact(encParentContact);
		student.setPassword(encPassword);
		
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = repository.getStudentById(id);
		
		String decEmail = AES.encrypt(student.getEmail(), AppConstants.SECRETKEY);
		String decAddress = AES.encrypt(student.getAddress(), AppConstants.SECRETKEY);
		String decParentContact = AES.encrypt(student.getParentContact(), AppConstants.SECRETKEY);
		String decPassword = AES.encrypt(student.getPassword(), AppConstants.SECRETKEY);
		
		student.setEmail(decEmail);
		student.setAddress(decAddress);
		student.setParentContact(decParentContact);
		student.setPassword(decPassword);
		
		return student;
	}

	@Override
	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentByStd(String std) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentByStdAndSec(String std, String sec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentBetweenPercentage(String lower, String higher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
