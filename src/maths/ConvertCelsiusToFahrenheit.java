package maths;

public class ConvertCelsiusToFahrenheit {

    /**
     * Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.
     *
     * Example 1:
     *
     * Input:
     * C = 32
     * Output: 89.6
     * Explanation: Using the conversion
     * formula of celsius to farhenheit , it
     * can be calculated that, for 32 degree
     * C, the temperature in Fahrenheit = 89.6
     * Example 2:
     *
     * Input:
     * 50
     * Output: 122
     * Explanation: Using the conversion
     * formulaof celsius to farhenheit, it
     * can be calculated that, for 50 degree
     * C, the temperature in Fahrenheit = 122.
     * Your Task:
     * You don't need to read input or print anything. Your task is to complete the function CtoF() that takes C as parameter and returns temperature in fahrenheit( in double). The flooring and printing is automatically done by the driver code.
     *
     * Expected Time Complexity: O(1)
     * Expected Auxiliary Space : O(1)
     *
     * Constraints:
     * 1 <= C <= 104
     *
     */

    private static double getConvertCelsiusToFahrenheit(int n){
        float f = 9/5f;

        return (n * f) + 32;
    }

    public static void main(String[] args) {
        float f = 9/5f;
        System.out.println(getConvertCelsiusToFahrenheit(32));
    }
}
