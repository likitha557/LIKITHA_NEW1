/*Name:likitha Pechetti
 * Description:Traffic light
 *Date:14/03/2021
 */
import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select any one number :");
		System.out.println("1.green"+"\n"+"2.yellow"+"\n"+"3.red");
		int num = sc.nextInt();
		if(num==1){
		System.out.println("go");
		}	
		else if(num==2){
		System.out.println("ready");
		}
		else if(num==3){
		System.out.println("stop");
		}

	}

}
