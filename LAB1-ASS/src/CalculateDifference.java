/*Name:likitha Pechetti
 * Description: Calculating difference between sum of squares of n natural numbers and square of sum of n natural numbers
 *Date:17/03/2021
 */
import java.util.Scanner;
import java.lang.Math;

public class CalculateDifference {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int range=sc.nextInt();
        System.out.println("The difference is:"+calculateDifference(range));
	}
    private static int calculateDifference(int n)
    {
    	int sum=0;
    	int sumOfN=0,sumOfSquares=0;
    	sumOfN=(n*(n+1)/2);
    	sumOfSquares=((n*(n+1)*(2*n+1))/6);
    	sum=(sumOfN*sumOfN)-sumOfSquares;
    	return sum;

	}

}
