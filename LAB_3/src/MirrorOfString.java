/*Name:likitha Pechetti
 * Description:To find the mirror image of the string
 *Date:18/03/2021
 */
import java.util.Scanner;

public class MirrorOfString {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(getImage(str));
	    
	}
    private static String getImage(String pStr)
    {
    	//String reverseStr="";
    	//for(int i=pStr.length()-1;i>=0;i--)
    		//reverseStr+=pStr.charAt(i);
    	StringBuffer reverseStr=new  StringBuffer(pStr);
    	reverseStr.reverse();
    	return pStr+"|"+reverseStr;

	}

}
