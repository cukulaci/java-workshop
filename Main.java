package javaCampSecondLesson;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(
				1,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)",
				"ENG�N DEM�RO�",
				0,
				"2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n� buradan yapaca��z.");
		
		Course course2 = new Course(
				2,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)",
				"ENG�N DEM�RO�",
				0,
				"2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n� buradan yapaca��z.");
				
		Course course3 = new Course(
				3,
				"Programlamaya Giri� ��in Temel Kurs",
				"ENG�N DEM�RO�",
				0,
				"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.");
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			
			if(course.unitPrice == 0) {
				System.out.println("ID: " + course.id);
				System.out.println("NAME: " + course.name);
				System.out.println("MENTOR: " + course.mentor);
				System.out.println("PRICE: " + "�CRETS�Z");
				System.out.println("DETAILS: " + course.detail);
				
			}
			
			else {
				System.out.println("ID: " + course.id);
				System.out.println("NAME: " + course.name);
				System.out.println("MENTOR: " + course.mentor);
				System.out.println("PRICE: " + course.unitPrice);
				System.out.println("DETAILS: " + course.detail);
			}
			
		}
		
		//////// Categories
		
		Categories category1 = new Categories();
		category1.id = 1;
		category1.name = "T�m�";
				
		Categories category2 = new Categories();
		category2.id = 2;
		category2.name = "Programlama";
		
		//////// Mentors
		
		Mentors mentor1 = new Mentors();
		mentor1.id = 1;
		mentor1.name = "T�m�";
				
		Mentors mentor2 = new Mentors();
		mentor2.id = 2;
		mentor2.name = "Engin DEM�RO�";
		
		//////// Services
		
		CourseManager joincourseManager = new CourseManager();
		joincourseManager.joinCourse(course1);
		joincourseManager.joinCourse(course2);
		joincourseManager.joinCourse(course3);
		
		CourseManager leavecourseManager = new CourseManager();
		leavecourseManager.leaveCourse(course1);
		leavecourseManager.leaveCourse(course2);
		leavecourseManager.leaveCourse(course3);
		
		Users user1 = new Users(1, "Emre", "cukulaci07@gmail.com");
		
		UserManager userManager = new UserManager();
		userManager.registerSite(user1);
		
		
		
		
	}

}
