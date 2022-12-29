package tp02;

import java.io.PrintStream;
import java.util.ArrayList;

public class Promotion {
	private ArrayList<Student> studentList;
	public Promotion()
	{
		studentList = new ArrayList<Student>();
		
	}
	public int newId()
	{
		int studentCount = studentList.size();
		if (studentCount == 0)
			return 0;
		int grosId = studentList.get(0).getId();
		for (int i =1; i< studentCount;i++) {
			int id = studentList.get(i).getId();
			if (id>grosId) {
				grosId = id;}
		}
		return grosId + 1;
			
		}
		
				
	
	
	public void add(String firstName, String lastName) {
		int id = newId();
		studentList.add(new Student(id,firstName,lastName));

	}
	public void printToConsole()
	{
		PrintStream out = System.out;
		for(Student student : studentList) {
			out.println(student);
		}

			
	}
	

}
