package ssh.service;

import org.springframework.transaction.annotation.Transactional;

import ssh.dao.StudentDao;
import ssh.entity.Student;

@Transactional
public class StudentService {
	
	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void save(Student student) {
		studentDao.save(student);
	}
}
