package maths;

import java.util.ArrayList;

public class QuadraticEquationRoots {
    /**
     * Given a quadratic equation in the form ax2 + bx + c. Find its roots.
     *
     * Note: Return the maximum root followed by the minimum root.
     *
     * Example 1:
     *
     * Input:
     * a = 1
     * b = -2
     * c = 1
     * Output: 1 1
     * Explanation:
     * Roots of equation x2-2x+1 are 1 and 1.
     *
     * Example 2:
     *
     * Input:
     * a = 1
     * b = -7
     * c = 12
     * Output: 4 3
     * Explanation: Roots of equation
     * x2 - 7x + 12 are 4 and 3.
     *
     *
     * Your Task:
     * You don't need to read input or print anything. Your task is to complete the function quadraticRoots() which takes a, b, c as input parameters and returns a list of two integers containing the floor value of its roots in decreasing order. If roots are imaginary, the returning list should contain only 1 integer ie -1. Always return the greatest integer smaller than or equal to the result.
     * Note: If roots are imaginary, the generated output will display "Imaginary".
     *
     *
     *
     * Expected Time Complexity: O(1)
     * Expected Auxiliary Space : O(1)
     *
     *
     *
     * Constraints:
     * -103 <= a,b,c <= 103
     */
    private static ArrayList<Integer> quadraticRoots(int a, int b, int c){
        ArrayList<Integer>res = new ArrayList<>();
        double d = (Math.pow(b,2)) - (4 * a * c);
        if(d <0){
            res.add(-1);
            return res;
        }

        d = Math.sqrt(d);
        double x1 = (-b +  d)/(2 *a);
        double x2 = (-b -  d)/(2 *a);
        x1 = Math.floor(x1);
        x2 = Math.floor(x2);
        res.add((int) Math.min(x1,x2));
        res.add((int) Math.max(x1,x2));

        return res;
    }

    public static void main(String[] args) {

        System.out.println(quadraticRoots(1,-2,1));

    }
}

