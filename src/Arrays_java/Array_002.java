/**
 * 
 */
package Arrays_java;

/**
 * @author elsys
 *
 */
public class Array_002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {100, 200, 300, 400, 500};
		// array size increment dynamic
		System.out.println(a[2]);
		System.out.println("this is a size of array: " + a.length); // size of array, check the size
		for(int i=0; i<=a.length-1; i++) // cuidado com menos 1 no final senao falha
		{
			System.out.println(a[i]);
		}
			
		
	}

}
