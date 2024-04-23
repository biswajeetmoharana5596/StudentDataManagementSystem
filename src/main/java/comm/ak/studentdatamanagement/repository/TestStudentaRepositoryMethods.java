package comm.ak.studentdatamanagement.repository;

import java.util.Optional;

import comm.ak.studentdatamanagement.dto.Student;

public class TestStudentaRepositoryMethods {
	public static void main(String [] args) {
	/*	Student student = new Student();
		
		student.setName("Legain");
		student.setEmail("lee@gmail.com");
		student.setAddress("Burtuk");
		student.setGender("male");
		student.setOverAllPercentage("99.99");
		student.setParentContact("7848898522");
		student.setStd("9");
		student.setSec("A");
		student.setRemarks("Exceptionally good");
		student.setPassword("1122");              */
		
		StudentRepository repository = new StudentRepositoryImp();
		
		Student student = repository.studentLogin("lee@gmail.com", "1122");
		
		if(student != null) {
			System.out.println(student.getName());
		}else {
			System.out.println("invalid user or password");
		}
		
		//System.out.println(repository.saveStudent(student));
	}
}
