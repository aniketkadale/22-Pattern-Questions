// Que Link -> https://practice.geeksforgeeks.org/problems/triangle-number-1661489840/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_6

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/reverse-number-triangle_6581889?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 
	1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
*/

import java.util.*;
public class Pattern6 {
	public static void main(String[] args) {
		System.out.print("Enter n - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            
            System.out.println();
        }  
	}
}