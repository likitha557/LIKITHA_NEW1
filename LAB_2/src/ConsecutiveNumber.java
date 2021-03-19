/*Name:likitha Pechetti
 * Description:finding the length of large consecutive array
 *Date:16/03/2021
 */
import java.util.Arrays;

public class ConsecutiveNumber {
	public static void main(String[] args) {
	
		int arr[]= {49,1,3,200,2,4,70,5};
		Arrays.sort(arr);
		String str ="";
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
		if(arr[i]+1==arr[i+1])
		{
		count++;
		}
		else
		{
		if(count>0)
		{
		str+=Integer.toString(count+1);
		count=0;
		}
		count=0;
		}
		}
		if(count>0)
		str+=Integer.toString(count+1);
		char max=str.charAt(0);
		for(int i=1;i<str.length();i++)
		{
		if(str.charAt(i)>max)
		max=str.charAt(i);
		}
		System.out.println(max- '0');
		}

}
