/**
 * 
 */
package Strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * @author indranil.roy https://www.codechef.com/submit-old/LAPIN
 */
public class LAPIN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();

			int m = 0, n = s.length() - 1;

			HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
			HashMap<Character, Integer> m2 = new HashMap<Character, Integer>();

			while (m < n) {

				if (m1.containsKey(s.charAt(m))) {
					m1.put(s.charAt(m), m1.get(s.charAt(m)) + 1);
				} else {
					m1.put(s.charAt(m), 1);
				}

				if (m2.containsKey(s.charAt(n))) {
					m2.put(s.charAt(n), m2.get(s.charAt(n)) + 1);
				} else {

					m2.put(s.charAt(n), 1);
				}

				m++;
				n--;
			}

			if (m1.equals(m2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			sc.close();
		}
	}
}
