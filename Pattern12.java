// GFG Link -> https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662664259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_12

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/number-crown_6581894?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 

    1                 1
    1 2             2 1
    1 2 3         3 2 1
    1 2 3 4     4 3 2 1
    1 2 3 4 5 5 4 3 2 1

*/

import java.util.*;

public class Pattern12 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // numbers, spaces, numbers

        int spaces = 2 * (n - 1);
        for (int row = 1; row <= n; row++) {
            // numbers
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            // spaces
            for(int space = 1; space <= spaces; space++) {
                System.out.print("  ");
            }

            // numbers
            for(int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            spaces -= 2;
            System.out.println();
        }

    }
}