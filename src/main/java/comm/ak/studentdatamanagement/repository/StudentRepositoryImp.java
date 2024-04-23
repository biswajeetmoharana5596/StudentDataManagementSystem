package comm.ak.studentdatamanagement.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import comm.ak.studentdatamanagement.dto.Student;
import comm.ak.studentdatamanagement.util.AppConstants;
import comm.ak.studentdatamanagement.util.ConnectionUtil;

public class StudentRepositoryImp implements StudentRepository {

	Student student;
	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		
		try {
			Class.forName(AppConstants.DRIVERNAME);
			
			String url = AppConstants.DB_URL;
			String user = AppConstants.DB_USERNAME;
			String pass = AppConstants.DB_PASSWORD;
			
			return DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student studentLogin(String email, String password) {
		// TODO Auto-generated method stub
		
		Connection connection = ConnectionUtil.getConnection();
		
		Student student = null;
		
		String query = "SELECT * FROM student WHERE email=? AND password=?";
		
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString (1,email);
			ps.setString (2,password);
			
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()) {
				student=new Student();
				student.setId(resultSet.getInt(1));
				student.setName(resultSet.getString(2));
				student.setEmail(resultSet.getString(3));
				student.setStd(resultSet.getString(4));
				student.setSec(resultSet.getString(5));
				student.setOverAllPercentage(resultSet.getString(6));
				student.setGender(resultSet.getString(7));
				student.setParentContact(resultSet.getString(8));
				student.setRemarks(resultSet.getString(9));
				student.setAddress(resultSet.getString(10));
				student.setPassword(resultSet.getString(11));
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		Connection connection = getConnection();
		
		String query = "INSERT INTO student(name,email,std,sec,over_all_percentage,gender"
				+ "parent_contact,remarks,address,password) VALUES(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getStd());
			ps.setString(4, student.getSec());
			ps.setString(5, student.getOverAllPercentage());
			ps.setString(6, student.getGender());
			ps.setString(7, student.getParentContact());
			ps.setString(8, student.getRemarks());
			ps.setString(9, student.getAddress());
			ps.setString(10, student.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		
		String query = "SELECT * FROM student WHERE id=?";
		Student student = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet resultset = ps.executeQuery();
			if(resultset.next()) {
				student=new Student();
				student.setId(resultset.getInt(1));
				student.setName(resultset.getString(2));
				student.setEmail(resultset.getString(3));
				student.setStd(resultset.getString(4));
				student.setSec(resultset.getString(5));
				student.setOverAllPercentage(resultset.getString(6));
				student.setGender(resultset.getString(7));
				student.setParentContact(resultset.getString(8));
				student.setRemarks(resultset.getString(9));
				student.setAddress(resultset.getString(10));
				student.setPassword(resultset.getString(11));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
