

class Member{
	// Data members
	String name;
	int age;
	int phonenumber;
	String Address;
    double salary;
	
	void printSalary() {
		System.out.println(salary);
	}
}
 class Employee extends Member{
			String specialization;
		}
	class Manager extends Member{
		String department;
}
public class Q2 {
public static void main(String[] args) {
	Employee e = new Employee();
	e.name = "Samuel Arhin";
	e.age = 34;
	e.phonenumber = 233453253;
	e.Address = "34/m Takoradi";
	e.salary = 3000.58;
	
	Manager m = new Manager();
	m.name = "Francis Kofie";
	m.age = 55;
	m.phonenumber = 63568636;
	m.Address = "To/875, Sekondi";
	m.salary = 10000.25;
	System.out.println("The Salary of the Employee is" + " "+e.salary);
	System.out.println("The Salary of the Manager is" + " "+m.salary);	
	}

}
