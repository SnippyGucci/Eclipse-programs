package comparable;

public class Student implements Comparable <Student> {

	private String name;
	private int age;
	public Student (String s, int a) {
			name = s;
			age = a;
			
	}
	public String toString() {
		return name + ", " + age;
		
	}
	
	@Override
	public int compareTo(Student person) {
		if (this.name.compareTo(person.name) < 0)
			return -2;
		if (this.name.compareTo(person.name) > 0)
			return 2;
		else 
            return (int)(this.age-person.age);
			
	}
	

}
