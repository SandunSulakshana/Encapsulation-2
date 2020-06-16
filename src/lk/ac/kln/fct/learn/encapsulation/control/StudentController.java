package lk.ac.kln.fct.learn.encapsulation.control;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import lk.ac.kln.fct.learn.encapsulation.core.Student;

public class StudentController implements Cloneable, Serializable {
	//Don't change the final deceleration of the HashMap
	public final HashMap<String, Student> students = new HashMap<>();
	
	public void addNewStudent(Student s) {
		students.put(s.getId(), s);
	}

	@Override
	public StudentController clone() {
		try {
			ObjectOutputStream oos = null;
			ObjectInputStream ois = null;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject((StudentController) super.clone());
			oos.flush();
			
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ois = new ObjectInputStream(bais);
			oos.close();
			ois.close();
			
			return (StudentController) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
