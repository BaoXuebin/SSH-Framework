package ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ssh.entity.Student;

public class StudentDao extends HibernateDaoSupport {
	
	public void save(Student student) {
		this.getHibernateTemplate().save(student);
	}
}
