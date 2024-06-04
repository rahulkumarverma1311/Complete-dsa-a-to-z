package maths;

public class TrailingZerosInFactorial {


    private static int countTrailingZerosInFactorialNaive(int n) {

        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;

        }
        int res = 0;
        while (fact % 10 == 0) {
            res++;
            fact = fact / 10;
        }
        return res;


    }


    private static int countTrailingZerosInFactorialOptimal(int n){
        int res=0;
        for(int i=5;i<=n;i= i*5){
            res = res + n / i;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println("naive approach:-"+countTrailingZerosInFactorialNaive(10));
        System.out.println("Optimal approach:-"+countTrailingZerosInFactorialOptimal(20));

    }
}
