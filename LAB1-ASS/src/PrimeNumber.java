/*Name:likitha Pechetti
 * Description:Prime numbers  
 *Date:14/03/2021
 */
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value :");
		int n = sc.nextInt();
		int i=0;
		int j=0;
		String primeNumbers="";
		for(i=1;i<=n;i++)
		{
		int counter=0;
		for(j=i;j>=1;j--)
		{
		if(i%j==0){
		counter =counter+1;
		}
		}
		if(counter==2){
		primeNumbers=primeNumbers + i + "";
		}
		}
		System.out.println("the primeNumbers : " +primeNumbers);

	}

}
