/**
 * 
 */
package OOPs;

/**
 * @author elsys
 *
 */
public class EmployeeSetData 

{

	int empid;
	String empname;
	int salary;
	int deptoid;
	
	/*EmployeeSetData(int id, String name, int sal, int dip) // Constructor deve ter o mesmo nome da classe
	
	{
		empid = id;
		empname = name;
		salary = sal;
		deptoid = dip;
		
	}*/
	
	
	void SetData(int id, String name, int sal, int dip)
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

	EmployeeSetData emplo1 = new EmployeeSetData();
	emplo1.SetData(101, "Vinicius Pinho", 20000, 25);
	emplo1.display();
	
	System.out.println("==================================");
	
	EmployeeSetData emplo2 = new EmployeeSetData();
	emplo2.SetData(102, "Cibelle Souza", 30000, 35);
	emplo2.display();
	
	
	
	}
}