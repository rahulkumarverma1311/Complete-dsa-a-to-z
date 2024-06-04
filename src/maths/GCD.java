package maths;

public class GCD {

    private static int getGCDNaive(int a,int b){
        int res = Math.max(a,b);
        while (res >0){
            if(a % res == 0 && b % res == 0)
                    break;;
            res--;
        }
        return res;
    }

    private static int getGDCEuclideanApproach(int a,int b){
        while ( a !=b){
            if(a>b){
                a = a-b;
            } else{
                b= b -a;
            }
        }
        return a;
    }
    private static int getGDCEuclideanApproachOptimal(int a,int b){

        if(b==0)
            return a;
        return getGDCEuclideanApproachOptimal(b,a%b);
    }

    public static void main(String[] args) {

        System.out.println("GCD naive solution:- "+ getGCDNaive(6,4));
        System.out.println("GDC using Euclidean Approach:- "+getGDCEuclideanApproach(4,6));
        System.out.println("GDC using Euclidean Approach optimal:- "+getGDCEuclideanApproachOptimal(4,6));

    }
}
