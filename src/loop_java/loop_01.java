/**
 * 
 */
package loop_java;

/**
 * @author elsys
 *
 */
public class loop_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		while(i<=10) {
			System.out.println(i); // 1 in begin
			i++;
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
			
			
		}
		
		

	}

}
