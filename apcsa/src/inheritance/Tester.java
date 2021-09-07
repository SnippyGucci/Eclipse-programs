package inheritance;

public class Tester {		
	
	public static void main (String[] args) {
		//1a
		Person p = new Person ("John", 21, 'M');	
		Teacher t1 = new Teacher ("Pam", 36, 'F', "Math", 14);
		Student stu = new Student ("Carl", 16, 'M', "KoolKid1234", 3.1415);
		CollegeStudent cs = new CollegeStudent ("Amy", 20, 'F', "SmartKid9876", 3.5012, "Art", "Junior", 2022);

		System.out.println(p.toString() + "\n" + t1.toString() + "\n" + stu.toString() + "\n" + cs.toString() + "\n");
		
		//1b
		Person t2 = new Teacher ("Jamie", 45, 'M', "English", 23);
		Person stu2 = new Student ("Arnold", 14, 'M', "FunnyChild43634", 2.6698);
		Person cs2 = new CollegeStudent ("Xavier", 19, 'M', "NormalKid9876", 3.3000, "Business", "Sophomore", 2023);
		
		
		System.out.println(printInfo(t2) + "\n" + printInfo(stu2) + "\n" + printInfo(cs2));
		
		((CollegeStudent) cs2).getInfo();
		
		//part 2
		System.out.println();
		CollegeStudent p2c1 = new CollegeStudent ("Claire", 20, 'F', "AthleticKid91503", 3.69823, "Art", "Sophomore", 2023); 	
		CollegeStudent p2c2 = new CollegeStudent ("Justin", 23, 'M', "Senioritis1298", 3.04576, "Computer Science", "Senior", 2021); 
		CollegeStudent p2c3 = new CollegeStudent ("Mark", 18, 'M', "SlackerOffer463476", 2.46352, "English", "Freshman", 2024); 
		System.out.println(p2c1.toString() + "\n" + p2c2.toString() + "\n" + p2c3.toString());
		
		if (p2c1.compareTo(p2c2) < 0)   // c1 is alphabetically before c2
			System.out.println(p2c1.getName() + " is alphabetically before " + p2c2.getName());
		if (p2c1.compareTo(p2c2) > 0)   // c1 is alphabetically after c2
			System.out.println(p2c1.getName() + " is alphabetically after " + p2c2.getName());
		if (p2c1.compareTo(p2c2) == 0)   // c1 is the same as c2
			System.out.println(p2c1.getName() + " is alphabetically at " + p2c2.getName());
		
		//part 3
		System.out.println();
		CollegeStudent p3c1 = new CollegeStudent ("Bobison", 21, 'M', "Bobby!91503", 3.58464, "Math", "Junior", 2022); 	
		Teacher p3t1 = new Teacher ("Patrick", 28, 'M', "History", 4);
		
		if (p3c1.isEmployable() == true)
			System.out.println(p3c1.getName() + " is employable");
		else 
			System.out.println(p3c1.getName() + " is not employable");
		
		if (p3t1.isEmployable() == true)
			System.out.println(p3t1.getName() + " is employable");
		else
			System.out.println(p3t1.getName() + " is not employable");
			
		//part 4
		System.out.println();
		Employable c = new CollegeStudent ("Elon", 19, 'M', "VerySmart57774", 4.27583, "Physics", "Freshman", 2024); 
		Employable t = new Teacher ("Marty", 31, 'F', "English", 7);				
		System.out.println(((CollegeStudent) c).getName() + ", Birth year: " + getBirthYear(c, 2021)); 
		System.out.println(((Teacher) t).getName() + ", Birth year: " + getBirthYear(t, 2021));

	}
	
	public static String printInfo (Person type) {
		return "Name: " + type.getName() + ", Age: " + type.getAge() + ", Gender: " + type.getGender();
		
	}
	
	public static int getBirthYear (Employable e, int currYr) {
		int birthYr = currYr - ((Person) e).getAge();
		
		return birthYr;
		
	}

}
