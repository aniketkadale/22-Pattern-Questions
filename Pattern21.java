// GFG Link -> https://practice.geeksforgeeks.org/problems/square-pattern-1662287714/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_21

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/ninja-and-the-star-pattern-i_6581920?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


/* 
    ****
    *  *
    *  *
    ****
*/

import java.util.*;

public class Pattern21 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                if(row == 0 || col == 0 || row == n - 1 || col == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
