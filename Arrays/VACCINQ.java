package Arrays;
import java.util.Scanner;

/**
 * @author indranil.roy Question link https://www.codechef.com/submit/VACCINQ
 */
public class VACCINQ {

	public static void main(String[] args) {
		int t, n, p, x, y;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- > 0) {
			int minutes = 0;
			n = sc.nextInt();
			p = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			for (int j = 0; j < arr.length; j++) {
				if (j == p) {
					break;
				}
				if (arr[j] == 0) {
					minutes += x;
				} else if (arr[j] == 1) {
					minutes += y;
				}
			}
			System.out.println(minutes);
		}

	}

}
