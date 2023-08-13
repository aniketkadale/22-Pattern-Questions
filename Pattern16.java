// GFG Link -> https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285334/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_16

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/alpha-ramp_6581888?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 
    A
    B B
    C C C
    D D D D
    E E E E E
*/

import java.util.*;

public class Pattern16 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int row = 0; row < n; row++) {
            char ch = (char)('A' + row);
            for(int col = 0; col <= row; col++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    
    }
}
