// GFG Link -> https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662287416/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_20

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/symmetry_6581914?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


/* 
    *        *
    **      **
    ***    ***
    ****  ****
    **********
    ****  ****
    ***    ***
    **      **
    *        *
*/

import java.util.*;

public class Pattern20 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int spaces = 2 * n - 2;
        for(int row = 1; row <= 2 * n - 1; row++) {
            // stars
            int stars = row;
            if(row > n) {
                stars = 2 * n - row;
            }

            for(int col = 1; col <= stars; col++) {
                System.out.print("*");
            }

            // spaces
            for(int col = 1; col <= spaces; col++) {
                System.out.print(" ");
            }

            // stars
            for(int col = 1; col <= stars; col++) {
                System.out.print("*");
            }

            if(row < n) {
                spaces -= 2;
            } else{
                spaces += 2;
            }

            System.out.println();
        }

    }
}
