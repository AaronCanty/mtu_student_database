package ie.mtu.cs.oop.ass1.model;

import java.io.Serializable;
import java.util.Collections;

/* Aaron Canty
 * R00206055
 * 
 */

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	private String studentName;
	private String studentID;
	private String studentDOB;


	public Student(String studentName, String studentID, String studentDOB) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.studentDOB = studentDOB;
	}


	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}

}
