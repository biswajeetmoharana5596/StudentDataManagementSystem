package comm.ak.studentdatamanagement.service;

import comm.ak.studentdatamanagement.dto.Student;

public class TestSaveStudent {
	public static void main (String[] args ) { 
		StudentService service  = new StudentServiceImp();
		
		Student student = new Student();
		student.setName("Karma");
		student.setEmail("kar@gmail.com");
		student.setGender("Female");
		student.setOverAllPercentage("99.99");
		student.setParentContact("0987654321");
		student.setSec("A");
		student.setStd("X");
		student.setRemarks("Expert at Logical");
		student.setAddress("India");
		student.setPassword("1122");
	}
}
