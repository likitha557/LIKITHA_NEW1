/*Name:likitha Pechetti
 * Description:changing Array list to Array
 *Date:19/03/2021
 */
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(6);
		list.add(3);

		Integer [] arr =new Integer[list.size()];
		list.toArray(arr);
		System.out.println("Array: ");
		{
			
		for(int i=0;i<=arr.length;i++) {
			if(i==arr.length-1)
				System.out.print(i+"  ");
			else
				
			    System.out.print(arr[i]+" ,");}
		}
		
	}
}
