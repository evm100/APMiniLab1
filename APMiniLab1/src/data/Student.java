package data;

/*
 * Animal class
 */
public class Student extends Generics {	
	/* fields
	 * 
	 */
	public static final String type = "Student";
	public enum KeyType {name, age, grade, combo};
	public static KeyType key = KeyType.combo;
	private String name; 
	private int age; 
	private int grade;
	
	/* constructor
	 * 
	 */
	public Student(String name, int age, int grade)
	{
		this.setType(type);
		this.name = name; 
		this.age = age; 
		this.grade = grade; 
	}
	
	/* 
	 * toString provides output based off of this.key setting
	 */
	@Override
	public String toString()
	{
		String output="";
		switch(key) {
		case name:
			output += this.name;
			break;
		case age:
			output += "000" + this.age;
			output = output.substring(output.length()-3);
			break;
		case grade:
			output += "000" + this.grade;
			output = output.substring(output.length()-3);
			break;
		case combo:
		default:
			output += type + ": " + this.name  + ", " + this.grade + ", " + this.age; 
		}
		return output;
		
	}
	
	/* Initialize Animal data
	 * 
	 */
	public static Generics[] studentData() {
		Generics[] ad = { 
				new Student("Ethan", 8, 12),
				new Student("Edgar", 17, 11),
				new Student("Andrei", 7, 10),
				new Student("Jared", 10, 9),
				new Student("Mortensen", 1, 11),
				new Student("Eagan", 14, 10)
		};
		return ad;
	}
	
	/* main to test Student class
	 * 
	 */
	public static void main(String[] args)
	{
		Generics[] ad = studentData();
		for(Generics a : ad)
			System.out.println(a);
	}

}
