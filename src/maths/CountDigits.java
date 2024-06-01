package maths;

public class CountDigits {

    private static int getDigitsInNumber(int n){
        int res = 0;
        while (n > 0){
            n = n/10;
            res++;

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getDigitsInNumber(1311));

    }
}
