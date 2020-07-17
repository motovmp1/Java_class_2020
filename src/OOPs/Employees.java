/**
 * 
 */
package OOPs;

/**
 * @author elsys
 *
 */
public class Employees {

	/**
	 * @param args
	 */
	int empid;
	String empname;
	int salary;
	int depto;
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(depto);
	}
	
	public static void main(String args[])
	{
		Employees emp1 = new Employees(); // First employee
		emp1.empid = 001;
		emp1.empname = "Vinicius Miranda de Pinho";
		emp1.salary = 10000;
		emp1.depto = 10;
		emp1.display();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	
		Employees emp2 = new Employees(); // second employee
		emp2.empid = 002;
		emp2.empname = "Cibelle santos";
		emp2.salary = 20000;
		emp2.depto = 12;
		emp2.display();
		
		
		
	}
}
