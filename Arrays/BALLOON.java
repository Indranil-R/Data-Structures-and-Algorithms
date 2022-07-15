package Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author indranil.roy https://www.codechef.com/problems-old/BALLOON
 */
public class BALLOON {

	public static void main(String[] args) {

		int t, n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		while (t-- > 0) {

			n = sc.nextInt();
			int[] arr = new int[n];
			int minimumProblems = 0;

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			while (n-- > 0) {
				minimumProblems = n + 1;
				if (arr[n] == 1 || arr[n] == 2 || arr[n] == 3 || arr[n] == 4
						|| arr[n] == 5 || arr[n] == 6 || arr[n] == 7) {
					break;
				}

			}
			System.out.println(minimumProblems);
		}

	}

}
