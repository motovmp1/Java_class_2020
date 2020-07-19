/**
 * 
 */
package MethodOverload;

/**
 * @author elsys
 *
 */
public class MethodOverloading1 {
	
	int a;
	int b;
	
	// no parameters  
	void sum() // first call
	{
		a = 10;
		b = 20;
		System.out.println("I am inside the first");
		System.out.println(a+b);
		
	}
	
	// take parameters
	void sum(int x, int y)
	{
		int a = x;
		int b = y;
		System.out.println("I am inside the second");
		System.out.println(a+b);
		
	}
	
	//take 3 parameters
	void sum(int x, int y, int z)
	{
		System.out.println("I am inside the Third");
		System.out.println(x+y+z);

	}
	
	// this is take different data type
	void sum(int x, double y)
	{
		System.out.println("I am inside the fourth");
		System.out.println(x+y);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading1 mo1 = new MethodOverloading1();
		mo1.sum(); // this is first method
		mo1.sum(20, 20); // this is second
		mo1.sum(10, 20, 30); // this is the third
		mo1.sum(10, 20.5); // this is the fourth
		
	}

}
