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
		
		i = 10; 
		while(i>=0) {
			System.out.println("The number now increment:" + i); // 2, 4, 6, 8, 10; basta mudar primeiro numero
			i-=1;
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		}

	}

}
