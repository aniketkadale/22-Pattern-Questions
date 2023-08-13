// CodeStudio Link -> https://www.codingninjas.com/studio/problems/symmetric-void_6581919?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


/* n = 3
    * * * * *  *
    * *     *  *
    *          *
    *          *
    * *     *  *
    * * * * *  *
*/

import java.util.*;

public class Pattern23 {
    public static void main(String[] args) {
        System.out.print("Enter n - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int row = 0; row < 2 * n; row++) {
            for (int col = 0; col < 2 * n; col++) {
                if (row == 0 || col == 0 || row == 2 * n - 1 || col == 2 * n - 1 || row == 1 && col == 1 || row == 1 && col == 2 * n - 2 || row == 2 * n - 2 && col == 1 || row == 2 * n - 2 && col == 2 * n - 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
