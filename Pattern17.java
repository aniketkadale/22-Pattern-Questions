// GFG Link -> https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285911/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_17

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/alpha-hill_6581921?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 
       A
     A B A
   A B C B A
A B C D C B A
*/

import java.util.*;

public class Pattern17 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // spaces, chars, spaces
        for(int row = 0; row < n; row++) {
            // spaces
            for(int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            // chars
            char ch = 'A';
            int breakpoint = (2 * row + 1) / 2; 
            for(int col = 1; col <= 2 * row + 1; col++) {
                System.out.print(ch);
                if(col <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            // spaces
            for(int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    
    }
}
