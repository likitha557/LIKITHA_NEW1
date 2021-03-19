/*Name:likitha Pechetti
 * Description:Finding the Fibonacci of a number 
 *Date:18/03/2021
 */
import java.util.*;
public class FibonacciNew {

	public static void main(String[] args) {
		int i,f0=1,f1=1,f2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value :");
		int n = sc.nextInt();
		System.out.println("fiboncci series  " +f0);
		System.out.println("fiboncci series  " +f1);
		for(i=0;i<=n;i++)
		{
			f2=f0+f1;
			f0=f1;
			f1=f2;
		System.out.println("fiboncci series : " +f2);
		}

	}

}
