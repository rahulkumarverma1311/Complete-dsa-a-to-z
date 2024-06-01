package maths;

public class DigitsInFactorial {

    private static int getFact(int n ){
        int res=1;
        for(int i=2;i<=n;i++){
            res = res * i;
        }
        return res;
    }
    private static int digitsInFactorial(int N){
        // code here
        int res= 0;
        int fact = getFact(N);
        while(fact != 0){
            fact = fact /10;
            res++;

        }
        return res;
    }



    public static void main(String[] args) {

        System.out.println(digitsInFactorial(5));

    }
}
