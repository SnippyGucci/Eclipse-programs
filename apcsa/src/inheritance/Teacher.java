package inheritance;

public class Teacher extends Person implements Employable {
	private String subject;
	private int yearsExperience;
	
	public Teacher (String n, int a, char gender, String sub, int yExp) {
		super (n, a, gender); //use parent class’s constructor
		subject = sub;
		yearsExperience = yExp;
	}
	
	public String getSubject () { 
		return subject;
	}
	
	public double getYearsExperience () { 
		return yearsExperience;		
	}
	
	public void setSubject (String sub) {
		subject = sub;
	}
	
	public void setYearsExperience (int yExp) { 
		yearsExperience = yExp;
	}
	
	public String toString() {
		return super.toString() + ", Subject: " + subject + ", Years of Experience: " + yearsExperience; 
	}

	@Override
	public boolean isEmployable() {
		int t1Age = this.getAge();
		double t1YE = this.getYearsExperience();
		
		if (t1Age > 22) {
			if (t1YE >= 5)
				return true;
		} 
		
		return false;
	}
}
