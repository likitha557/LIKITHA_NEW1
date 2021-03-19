/*Name:likitha Pechetti
 * Description:To find the Duplicate value in an array
 *Date:19/03/2021
 */
public class DuplicateList {

	public static void main(String[] args) {
		int[] array= {1,3,3,5,6};
		System.out.println("The duplicate values : ");	
		for (int i = 0; i < array.length; i++) {
		     for (int j = i + 1 ; j < array.length; j++) {
		          if ((array[i]==array[j]) && (i!=j)) {
		        	  System.out.println(array[j]);
		                 
		          }
		     }
		 }


		
	}

}
