/**
 * 
 */
package loop_java;

/**
 * @author elsys
 *
 */
public class while_condition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		// o programa nao checa a condicao ele pula dentro da condicoes depois testa..usar 5 e 20;
		// increment and decrement - start some value and then change to became true.
		
		i = 1;
		do
		{
			System.out.println("The number now increment: " + i);
			i++;
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
		}while(i<=10);
		
		
	}

}
