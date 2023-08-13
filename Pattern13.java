// GFG Link -> // https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718712/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_13

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/increasing-number-triangle_6581893?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 

    1 
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15

*/

import java.util.*;

public class Pattern13 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = 1;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num = num + 1;
            }

            System.out.println();
        }

    }
}
