package Apna_college;

public class functions {

    public static void SumOfOdd(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if (i%2 !=0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return;

    }
    public static void main(String[] args) {
        int n = 5;

        SumOfOdd(n);
        

    }
}
