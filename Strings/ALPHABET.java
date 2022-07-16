package Strings;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author indranil.roy https://www.codechef.com/submit/ALPHABET
 */
public class ALPHABET {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int n;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		n = sc.nextInt();
		char[] knownChar = s.toCharArray();

		while (n-- > 0) {
			String w = sc.next();
			boolean found = false;
			for (int j = 0; j < w.length(); j++) {
				for (char i : knownChar) {
					if (w.charAt(j) == i) {
						found = true;
						break;
					}
				}
				if (found == true) {
					break;
				}

			}
			if(found==false){
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
			
		}

	}

}
