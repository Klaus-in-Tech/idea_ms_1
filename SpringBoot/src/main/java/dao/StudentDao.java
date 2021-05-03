package dao;

import java.util.HashMap;
import java.util.Map;

import entity.Student;

public class StudentDao {
	
	private static Map <Integer, Student> students;
	
	static {
		
		students = new HashMap<Integer, Student>(){
			{
				put(1, new Student(1,"Klaus","Computer Science"));
				put(1, new Student(2,"Tina","Computer Enginerring"));
				put(1, new Student(3,"Klaus","Computer Autos"));
				
			}
			
		};
	}
	
	public Collection<Student> getAllStudens(){
		
	}
	
}


