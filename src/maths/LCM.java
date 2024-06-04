package maths;

public class LCM {

    private static int getLCMNaive(int a,int b){
        int res = Math.max(a,b);
        while (true){
            if(res %a == 0 && res %b==0) {
                break;
            }

            res++;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(getLCMNaive(4,6));

    }
}
