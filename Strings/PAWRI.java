/**
 * 
 */
package Strings;

import java.util.Scanner;

/**
 * @author indranil.roy https://www.codechef.com/submit/PAWRI
 */
public class PAWRI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			String s = sc.next();
			String replacedString = s.replace("party", "pawri");
			System.out.println(replacedString);
		}
	}

}
