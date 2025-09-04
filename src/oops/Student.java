package oops;

public class Student {
	
	//instant datamembers
	
	
	String name; 
	int age; 
	Long mobile; 
	Long uid; 
	String courseName; 
	
	//Instance methods
	
	void showDetails()
	{
		System.out.println(name); // instance data members can directly access by instance methods
		System.out.println(age);
		System.out.println(mobile);
		System.out.println(uid);
		System.out.println(courseName);
	}
	
	void  study()
	{
		System.out.println(name + " is Studying");
		System.out.println(name + " is also making notes");
		System.out.println(name + " is revising");
	}

	void play()
	{
		System.out.println(name + " is Playing");
	}
	
	void eat()
	{
		System.out.println(name + " is Eating");
		
	}
	
	void sleep()
	{
		System.out.println(name + " is Sleeping");
	}
	
	void reset()
	{
		name = null; 
		age = 0; 
		
		
		
	}
	
	
}

