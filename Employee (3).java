public class Employee{
	String name = "Gaurav";
	String ID = "12";
	int salary = 10000;

	public void bonus(){
		int bonus = salary * 20/100;
		
		System.out.println("Employee " + name + " with " + ID + " of " +  salary + " and bonus of " + bonus);
		}
} 