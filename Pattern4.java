// GFG Link -> https://practice.geeksforgeeks.org/problems/triangle-number-1661428795/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_4

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/triangle_6573690?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 
	1
    2 2 
    3 3 3 
    4 4 4 4 
    5 5 5 5 5
*/

import java.util.*;
public class Pattern4 {
	public static void main(String[] args) {
		System.out.print("Enter n - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(row + " ");
			}

			System.out.println();
		}   
	}
}