package maths;

public class CheckPrime {

    private static boolean isPrimeNaive(int n){
        if(n==1)
            return false;
        for(int i=2;i<n;i++){
            if(n % i ==0)
                return false;
        }
        return true;
    }

    private static boolean isPrimeEfficient(int n){
        if(n==1)
            return false;
        for(int i=2;i * i <n ; i++){
            if(n % i ==0)
                return false;
        }
        return true;
    }
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

    public static void main(String[] args) {


        System.out.println("simple naive approach:-"+ isPrimeNaive(7));
        System.out.println("efficient then the naive approach:-"+ isPrimeEfficient(7));
        System.out.println("optimal solution:-"+ isPrimeOptimal(7));

    }
}
