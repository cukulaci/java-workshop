package javaCampSecondLesson;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(
				1,
				"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)",
				"ENGÝN DEMÝROÐ",
				0,
				"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.");
		
		Course course2 = new Course(
				2,
				"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)",
				"ENGÝN DEMÝROÐ",
				0,
				"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.");
				
		Course course3 = new Course(
				3,
				"Programlamaya Giriþ Ýçin Temel Kurs",
				"ENGÝN DEMÝROÐ",
				0,
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.");
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			
			if(course.unitPrice == 0) {
				System.out.println("ID: " + course.id);
				System.out.println("NAME: " + course.name);
				System.out.println("MENTOR: " + course.mentor);
				System.out.println("PRICE: " + "ÜCRETSÝZ");
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
		category1.name = "Tümü";
				
		Categories category2 = new Categories();
		category2.id = 2;
		category2.name = "Programlama";
		
		//////// Mentors
		
		Mentors mentor1 = new Mentors();
		mentor1.id = 1;
		mentor1.name = "Tümü";
				
		Mentors mentor2 = new Mentors();
		mentor2.id = 2;
		mentor2.name = "Engin DEMÝROÐ";
		
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
