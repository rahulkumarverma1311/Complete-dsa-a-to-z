package maths;

public class PalindromeNumber {
    private static boolean isPalindrome(int n){

        if(n ==0 && (n < 10))
            return true;

        int test = n;
        int res = 0;
        while (n !=0){
            int lastDigit = n % 10;
            res = (res * 10) + lastDigit;
            n = n/10;
        }
        if(res == test)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(3));
    }
}
