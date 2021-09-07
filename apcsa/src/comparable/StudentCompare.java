package comparable;

public class StudentCompare {

	public static void main(String[] args) {
		Student s1 = new Student ("Joe", 15);
		Student s2 = new Student ("Jan", 16);
		Student s3 = new Student ("Joe", 17);
		
		
		if (s1.compareTo(s2) < 0 && s1.compareTo(s3) < 0) {
			System.out.println(s1);
			if (s2.compareTo(s3) < 0) {
				System.out.println(s2);
				System.out.println(s3);
			} else {
				System.out.println(s3);
				System.out.println(s2);
			}
		} 
		
		if (s2.compareTo(s3) < 0 && s2.compareTo(s1) < 0) {
			System.out.println(s2);
			if (s1.compareTo(s3) < 0) {
				System.out.println(s1);
				System.out.println(s3);
			} else {
				System.out.println(s3);
				System.out.println(s1);
			}
		}
		
		if (s3.compareTo(s1) < 0 && s3.compareTo(s2) < 0) {
			System.out.println(s3);
			if (s1.compareTo(s2) < 0) {
				System.out.println(s1);
				System.out.println(s2);
			} else {
				System.out.println(s2);
				System.out.println(s1);
			}
		}

	}

}
