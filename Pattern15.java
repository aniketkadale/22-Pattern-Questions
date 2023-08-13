// GFG Link -> // https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285196/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_15

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/reverse-letter-triangle_6581906?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


/* 

A B C D E
A B C D
A B C 
A B
A

*/

import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 0; row < n; row++) {
            for(char ch = 'A'; ch <= 'A' + (n - row - 1); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    
    }
}
