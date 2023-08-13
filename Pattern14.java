// GFG Link -> // https://practice.geeksforgeeks.org/problems/triangle-pattern-1662284916/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_14

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/increasing-letter-triangle_6581897?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


/* 

    A
    A B
    A B C
    A B C D
    A B C D E

*/

import java.util.*;

public class Pattern14 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 0; row < n; row++) {
            for(char ch = 'A'; ch <= 'A' + row; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    
    }
}
