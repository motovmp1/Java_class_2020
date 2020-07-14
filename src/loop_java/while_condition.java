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
		
		i = 5;
		do
		{
			System.out.println(i);
			i++;
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
		}while(i<=10);
		
		
	}

}
