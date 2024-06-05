package maths;

public class PrimeFactors {

    private static boolean isPrimeOptimal(int n){
        if(n==1)
            return false;
        if(n==2 || n==3)
            return true;
        if(n % 2==0 || n %3==0)
            return false;
        for(int i=5;i *i <=n ; i++){
            if( n % i ==0 || n % (i +2)==0)
                return false;
        }
        return true;
    }

    private static void getPrimeFactor(int n){

        for(int i=2;i<n;i++){
            if(isPrimeOptimal(i)){
                int check = i;
                while (n % check == 0){
                    System.out.print(i+" ");
                    check = check * i;
                }
            }
        }
    }


    private static void getPrimeFactorEfficient(int n){

        if(n<=1)
            return ;
        for(int i=2;i * i <=n;i++){
            while (n % i == 0){
                System.out.print(i+" ");
                n = n /i;
            }
        }
        if(n>1){
            System.out.print(n);
        }
    }

    public static void main(String[] args) {


        getPrimeFactor(12);
        System.out.println();

        getPrimeFactorEfficient(12);

    }
}
