// GFG Link ->https://practice.geeksforgeeks.org/problems/double-triangle-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_19

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/symmetric-void_6581919?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


/* 
    **********
    ****  ****
    ***    ***
    **      **
    *        *
    *        *
    **      **
    ***    ***
    ****  ****
    **********
*/

import java.util.*;

public class Pattern19 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int spaces = 0;
        for (int row = 0; row < n; row++) {
            // stars
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }

            // spaces;
            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }

            spaces += 2;
            System.out.println();
        }

        spaces = 2 * n - 1;

        for (int row = 1; row <= n; row++) {
            // stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // spaces
            for (int col = 1; col < spaces; col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            spaces -= 2;
            System.out.println();
        }
    }
}
