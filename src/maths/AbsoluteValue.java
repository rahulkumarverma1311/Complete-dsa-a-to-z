package maths;

public class AbsoluteValue {
    /**
     * You are given an interger I, find the absolute value of the interger I.
     *
     *
     *
     * Example 1:
     *
     * Input:
     * I = -32
     * Output: 32
     * Explanation:
     * The absolute value of -32 is 32.
     *
     *
     * Example 2:
     *
     * Input:
     * I = 45
     * Output: 45
     * Explanation:
     * The absolute value of 45 is 45 itself.
     *
     *
     * Your Task:
     * You don't need to read input or print anything. Your task is to complete the function absolute() which takes an integer I as input parameter and return the absolute value of I.
     *
     *
     *
     * Expected Time Complexity: O(1)
     * Expected Auxiliary Space : O(1)
     *
     *
     *
     * Constraints:
     * -106 <= I <= 106
     */

    private static int getAbsoluteValue(int i){
        if(i>=0)
            return i;
        return i - (2 * i);
    }
    public static void main(String[] args) {
        int i= -1311;
        System.out.println(getAbsoluteValue(i));
    }
}
