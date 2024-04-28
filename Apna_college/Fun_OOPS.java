package Apna_college;

public class Fun_OOPS {


    public Fun_OOPS(){
        
        System.out.println("I am a no arg constructor " );
    }
    public Fun_OOPS(int a){
        this();
        System.out.println("Iam a no 1 constructor " );
    }
    public Fun_OOPS(int a, int b){
        this(a);
        System.out.println("Iam a no 2 constructor " );
    }
   

    public static void main(String[] args) {
        System.out.println("Main Start");
        
        System.out.println("Main End ");

    }
}