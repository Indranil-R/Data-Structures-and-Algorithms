package Arrays;
import java.util.Scanner;

/**
 * @author indranil.roy Question link https://www.codechef.com/submit/IPCCERT
 */
public class IPCCERT {

	public static void main(String[] args) {

		int N, M, K, Q, EligibleParticipants = 0;

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		int[] T = new int[K];

		for (int i = 0; i < N; i++) {
			int MinutesWatched = 0;
			for (int j = 0; j < K; j++) {
				T[j] = sc.nextInt();
				MinutesWatched += T[j];
			}
			Q = sc.nextInt();
			if (MinutesWatched >= M && Q <= 10) {
				EligibleParticipants++;
			}
		}
		System.out.println(EligibleParticipants);
		sc.close();
	}

}
