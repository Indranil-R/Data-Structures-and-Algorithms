/**
 * 
 */
package Strings;

import java.util.Scanner;

/**
 * @author indranil.roy
 *	https://www.codechef.com/submit/ERROR
 */
public class ERROR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			String s = sc.next();
			boolean contains = s.contains("010") || s.contains("101");
			if(contains){
				System.out.println("Good ");
			}else{
				System.out.println("Bad");
			}
		}
	}

}
