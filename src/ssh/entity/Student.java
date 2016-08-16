package ssh.entity;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int sno;
	
	private String sname;
	
	private String password;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sno, String sname, String password) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.password = password;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", password="
				+ password + "]";
	}
	
}
