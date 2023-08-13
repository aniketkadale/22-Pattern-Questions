// GFG Link -> https://practice.geeksforgeeks.org/problems/triangle-number/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_3

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/n-triangles_6573689?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


/* 
	1 
	1 2 
	1 2 3  
	1 2 3 4
*/

import java.util.*;
public class Pattern3 {
	public static void main(String[] args) {
		System.out.print("Enter n - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		
		for(int row = 0; row < n; row++) {
			for(int col = 0; col <= row; col++) {
				System.out.print(col + 1 + " ");
			}

			System.out.println();
		}
	}
}