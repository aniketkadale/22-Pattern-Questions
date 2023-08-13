// GFG Link -> https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718455/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_11

// CodeStudio Link -> https://www.codingninjas.com/studio/problems/binary-number-triangle_6581890?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

/* 

    1 
    0 1 
    1 0 1
    0 1 0 1 
    1 0 1 0 1

*/

import java.util.*;
public class Pattern11 {
	public static void main(String[] args) {
		System.out.print("Enter n - ");
		Scanner sc = new Scanner(System.in);                                    
		int n = sc.nextInt();  
      
        int start = 1;
        for(int row = 0; row < n; row++) {
            if(row % 2 == 0 ) {
                start = 1;
            } else {
                start = 0;
            }

            for(int col = 0; col <= row; col++) {
                System.out.print(start + " ");
                start = 1 - start;
            }

            System.out.println();
        }
	}
}