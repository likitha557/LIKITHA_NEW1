/*Name:likitha Pechetti
 * Description:To find the Second Smallest Number
 *Date:16/03/2021
 */
import java.util.Scanner;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		final int NUM_ITEMS=sc.nextInt();
		int [] items=new int[NUM_ITEMS];
		
		System.out.println("Enter the elements of an array");
		for(int i=0;i<items.length;i++)
			items[i]=sc.nextInt();
		System.out.println("Second smallest number in an array: "+getSecondSmallest(items));
		
		
	}
	public static int getSecondSmallest(int arr[])
	{
		int secondSmallest=arr[0],firstSmallest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<firstSmallest)
			{
				secondSmallest=firstSmallest;
				firstSmallest=arr[i];
			}
		}
		return secondSmallest;
	}



	}
