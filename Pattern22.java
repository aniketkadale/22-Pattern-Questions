// GFG Link -> https://practice.geeksforgeeks.org/problems/square-pattern-1662666141/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_22

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/ninja-and-the-number-pattern-i_6581959?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


/* 
    4 4 4 4 4 4 4
    4 3 3 3 3 3 4
    4 3 2 2 2 3 4
    4 3 2 1 2 3 4
    4 3 2 2 2 3 4
    4 3 3 3 3 3 4
    4 4 4 4 4 4 4
*/

import java.util.*;

public class Pattern22 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 0; row < 2 * n - 1; row++) {
            for(int col = 0; col < 2 * n - 1; col++) {
                int top = row;
                int left = col;
                int right = (2 * n - 2) - col;
                int bottom = (2 * n - 2) - row;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }

            System.out.println();
        }
    }
}
