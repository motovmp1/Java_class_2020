/**
 * 
 */
package Arrays_java;

/**
 * @author elsys
 *
 */
public class inhence_foorLopp_2darray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][] = new int [3][2];
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		
		System.out.println(a.length); // number of rows
		System.out.println(a[0].length); // number of columns
		System.out.println(a.length);
		for(int r[]:a) // outer loop
		{
			for(int i: r) // inner loop
			{
				System.out.println(i);
				try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
			}
			
			
		}
		
		
		}
		
	}
