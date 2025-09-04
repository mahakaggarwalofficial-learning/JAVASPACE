package oops;

public class TestStudent {

	public static void main(String[] args) {

		System.out.println("Start of main program");
				
			
		Student s1 = new Student();
		
		s1.name = "Mahak"; 
		s1.age = 16;
		s1.courseName = "PCM";
		s1.mobile = 88268263863l;
		s1.uid = 8386262728l; 
		
		s1.showDetails();
		
		s1.study();
		s1.eat();
		s1.sleep();
		
		System.out.println();
		
		
		
	}

}
