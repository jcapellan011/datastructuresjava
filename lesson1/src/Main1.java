
public class Main1 {

	public static void main(String[] args) {
		// Creating Objects
		Person person1 = new Person("Amy", 11); // Using the parameterized constructor
		// 'new' defined function in java
		
		Person person2 = new Person();            // Using the default constructor
				
		person2.name = "Lucy";
		person2.age = 43;
		
		
		//Print person1's name:
		System.out.println("My niece's name is " + person1.name + " and she is " + person1.age);
		
		
		//Print person2's age:
		System.out.println("My sister is " + person2.age + " years old.");
	}

}

