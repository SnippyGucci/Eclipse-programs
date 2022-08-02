package inheritance;

public class CollegeStudent extends Student implements Comparable , Employable {
	private String major;
	private String year;
	private int projectedYearOfGraduation;
	
	
	public CollegeStudent (String n, int a, char gender, String ID, double gpa, String maj, String y, int pYoG) {
		super (n, a, gender, ID, gpa); //use parent class’s constructor
		major = maj;
		year = y;
		projectedYearOfGraduation = pYoG;
		
	}
	
	public String getMajor() { 
		return major;
	}
	
	public String getYear() { 
		return year;		
	}
	
	public int getProjectedYearOfGraduation() { 
		return projectedYearOfGraduation;		
	}
	
	public void setIDNum(String maj) {
		major = maj;
	}
	
	public void setGPA(String y) { 
		year = y;
	}
	
	public void setProjectedYearOfGraduation(int pYoG) { 
		projectedYearOfGraduation = pYoG;
	}
	
	public String toString() {
		return super.toString() + ", Major: " + major + ", Year: " + year + ", Project Year of Graduation: " + projectedYearOfGraduation; 
	}

	public void getInfo () {
		System.out.println("Name: " + super.getName() + ", Age: " + super.getAge() + ", Gender: " + super.getGender() + ", ID: " + super.getIDNum() + ", GPA: " + super.getGPA() + ", Major: " + getMajor() + ", Year: " + getYear() + ", Projected Year of Graduation: " + getProjectedYearOfGraduation());

	}

	@Override
	public int compareTo(Object o) {
        CollegeStudent csComparer = (CollegeStudent) o;
        
		String csName1 = this.getName();
		String csName2 = csComparer.getName();
        
		if (csName1.toLowerCase().charAt(0) > csName2.toLowerCase().charAt(0)) 
			return 1;
		else if (csName1.toLowerCase().charAt(0) < csName2.toLowerCase().charAt(0))
			return -1;
		
		return 0;
	}

	@Override
	public boolean isEmployable() {
		int csAge = this.getAge();
		double csGPA = this.getGPA();
		
		if (csAge >= 18 && csAge <= 22) {
			if (csGPA >= 2.5)
				return true;
		} 
		
		return false;
			
	}
}
