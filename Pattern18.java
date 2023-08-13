// GFG Link -> https://practice.geeksforgeeks.org/problems/triangle-pattern-1662286302/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_18

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/alpha-triangle_6581429?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 
    E
    E D
    E D C
    E D C B
    E D C B A
*/

import java.util.*;

public class Pattern18 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch = 'E';
        for(int row = 0; row < n; row++) {
            for(int col = 0; col <= row; col++) {
                System.out.print((char)(ch - col) + " ");
            }

            System.out.println();
        }
    
    }
}
