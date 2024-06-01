package maths;

public class FactorialNumber {

    private static int getFactorial(int n){
        int res = 1;
        for(int i=2;i<=n;i++){
            res = res * i;
        }
        return res;
    }

    private static int recursiveFactorialNumber(int n){
        if(n==0)
            return 1;
        return n * recursiveFactorialNumber(n -1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of a number:-"+ getFactorial(5));
        System.out.println("Factorial number of a number using Recursive Approach:-"+ recursiveFactorialNumber(5));

    }
}
