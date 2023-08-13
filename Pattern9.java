// GFGG Link -> https://practice.geeksforgeeks.org/problems/pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_9

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 
    	  *
        * * *  
      * * * * *
    * * * * * * *
    * * * * * * *
      * * * * *
        * * *  
	      *

*/

import java.util.*;

public class Pattern9 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            // spaces
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            // This is optional. spaces
            // for(int col = 0; col < n - row - 1; col++) {
            // System.out.print(" ");
            // }

            System.out.println();
        }

        for (int row = 0; row < n; row++) {
            // spaces
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            // stars
            for (int col = 0; col < 2 * n - (2 * row + 1); col++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}