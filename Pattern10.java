// GFG Link -> https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718013/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_10

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/rotated-triangle_6573688?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 

    * 
    * * 
    * * * 
    * * * * 
    * * * * *
    * * * *
    * * *
    * *
    *

*/

import java.util.*;
public class Pattern10 {
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

        for(int row = 1; row < n; row++) {
            for(int col = 0 ; col < n - row; col++) {
                System.out.print("* ");
            }    

            System.out.println();
        }
	}
}