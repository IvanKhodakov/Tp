package tp02;

public class Student {
	private final int id;
	private String firstName;
	private String lastName;
	
	public Student(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final int getId() {
		return id;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " +"(" +id+ ")";
		
	}
	
	public  int compareTo(Student student)
	{
		int comp = this.lastName.compareTo(student.getFirstName());
		if (comp != 0)
			return comp;
		comp = this.firstName.compareTo(student.getLastName());
		if (comp!=0)
			return comp;
		if (this.id>student.getId()) {
			return 1;}
		else if (this.id<student.getId()) {
			return -1; }
		else {
			return 0;}
		}
			
			
		

					
			
	}
	
	
	
	


