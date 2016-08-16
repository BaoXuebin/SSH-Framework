package ssh.action;

import ssh.entity.Student;
import ssh.service.StudentService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport implements ModelDriven<Student> {

	private static final long serialVersionUID = 1L;
	
	Student student = new Student();

	@Override
	public Student getModel() {
		return student;
	}
	
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@Override
	public String execute() throws Exception {
		studentService.save(student);
		return SUCCESS;
	}

}
