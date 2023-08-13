// Que Link -> https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_7

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/star-triangle_6573671?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


/* 
	      *
        * * *  
      * * * * *
    * * * * * * *

*/

import java.util.*;
public class Pattern7 {
	public static void main(String[] args) {
		System.out.print("Enter n - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		
        for(int row = 0; row < n; row++) {
            // spaces
            for(int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            // stars
            for(int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            // This is optional. spaces
            // for(int col = 0; col < n - row - 1; col++) {
            //     System.out.print(" ");
            // }

            System.out.println();
        }
	}
}