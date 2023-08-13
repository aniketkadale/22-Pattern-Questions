// Que Link -> https://practice.geeksforgeeks.org/problems/square-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_1

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/n-forest_6570177?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 
	* * * *
	* * * *
	* * * * 
	* * * *
*/

import java.util.*;
public class Pattern1 {
	public static void main(String[] args) {
		System.out.print("Enter n - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		for(int row = 0; row < n; row++) {
			for(int col = 0; col < n; col++) {
				System.out.print("* ");
			}

			System.out.println();
		}   
	}
}