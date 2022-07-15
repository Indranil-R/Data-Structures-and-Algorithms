/**
 * 
 */
package com.arrays;

import java.util.Scanner;

/**
 * @author	indranil.roy
 *  Question link	https://www.codechef.com/submit/IPCCERT
 */
public class IPCCERT {

	public static void main(String[] args) {
		
		int N,M,K,Q,MinutesWatched=0,EligibleParticipants = 0;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		
		for(int i=0;i<N;i++){
			for(int j=0;j<K;j++){
				MinutesWatched += sc.nextInt();
			}
			Q = sc.nextInt();
			if(MinutesWatched>=M && Q<10){
				EligibleParticipants+=1;
			}
		}
		System.out.println(EligibleParticipants);
		sc.close();
	}

}
