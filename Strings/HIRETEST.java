/**
 * 
 */
package Strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author indranil.roy https://www.codechef.com/submit/HIRETEST
 */
public class HIRETEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n, m, x, y;
			n = sc.nextInt();
			m = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			while (n-- > 0) {
				HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
				String s = sc.next();
				int i = s.length();
				while (i-- > 0) {
					if (hashmap.containsKey(s.charAt(i))) {
						hashmap.put(s.charAt(i), hashmap.get(s.charAt(i)) + 1);
					} else {
						hashmap.put(s.charAt(i), 1);
					}
				}			
				if (hashmap.get('F') != null && hashmap.get('P') != null) {
					if (hashmap.get('F') >= x || hashmap.get('P') >= y
							&& hashmap.get('F') >= x - 1) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}
				} else if (hashmap.get('F') != null) {
					if (hashmap.get('F') >= x) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}
				}else if(hashmap.get('F')==null && hashmap.get('P')!=null){
					if(x==1){
						if(hashmap.get('P') >= y){
							System.out.print("1");
						}else{
							System.out.print("0");
						}
					}else{
						System.out.print("0");
					}
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
