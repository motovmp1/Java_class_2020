/**
 * 
 */
package loop_java;

/**
 * @author elsys
 *
 */
public class While_loop_1_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		i = 2; 
		while(i<=10) {
			System.out.println("The number now increment:" + i); // 1 in begin
			i+=2;
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		}

	}

}
