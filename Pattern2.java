// GFG Link -> https://practice.geeksforgeeks.org/problems/right-triangle/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_2

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/n-2-forest_6570178?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


/* 
	* 
	* * 
	* * *  
	* * * *
*/


import java.util.*;
public class Pattern2 {
	public static void main(String[] args) {
		System.out.print("Enter n - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		
		for(int row = 0; row < n; row++) {
			for(int col = 0; col <= row; col++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}