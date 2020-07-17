/**
 * 
 */
package OOPs;

/**
 * @author elsys
 *
 */
public class class_construction {

	/**
	 * @param args
	 */
	int empid;
	String empname;
	int salary;
	int deptoid;
	
	class_construction(int id, String name, int sal, int dip) // Constructor 
	{
		empid = id;
		empname = name;
		salary = sal;
		deptoid = dip;
		
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptoid);
		
	}
	
	public static void main(String args[])
	{
		class_construction emp1 = new class_construction(101, "Vinicius Pinho", 20000, 10);
		emp1.display();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		class_construction emp2 = new class_construction(102, "Cibelle santos", 30000, 20);
		emp2.display();
		
	}
	
}
