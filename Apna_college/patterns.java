package Apna_college;

// import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        //Pallindrome pattern
        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j = 1; j<=n-i; j++)
        // {
        //     System.out.print(" ");
        // }
        // //1st half 
        // for (int j=i; j>=1;j--)
        // {
        //     System.out.print(j);
        // }
        // //2nf half 
        // for (int j=2; j<=i; j++)
        // {
        //     System.out.print(j);
        // }
        // System.out.println();
        // }
        
        //Diamond Pattern 
        // int n=4;
        // for(int i=1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i;j++ ){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");         
        //     }
        //     System.out.println();
        // }
        //     //lower haf
        //     for(int i=n; i>=1; i--)
        //     {
        //         for(int j=1; j<=n-i;j++ ){
        //             System.out.print(" ");
        //         }
        //         for(int j=1; j<=2*i-1; j++){
        //             System.out.print("*");     
        //         } 
        //         System.out.println();
        //     }
      
        // int n =3;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
        //0-1 Pyramid
        // int a = 5;
        // for(int i =1; i<= a; i++){
        //         for(int j=1; j<=i; j++){
        //             int sum = i+j;
        //             if (sum%2==0){
        //                 System.out.print("1 ");
        //             }
        //             else{
        //                 System.out.print("0 ");
        //             }
        //         }
        //         System.out.println();
        //     }



        //MOCK

        //Q1-Even Number
        // for(int i=70 ; i>=25; i--){
        //     if (i%2==0) {
        //         System.out.println(i);
        //     }
        // }

        //Q2-Prime Number
        // for(int i=50; i>=1; i--){
        //     int count=0;
        //     for(int j=1; j<=i; j++){
        //         if (i%j==0){
        //             count++;
        //         }
        //     }
        //     if (count ==2) {
        //         System.out.println(i);      
        //     }  
        // }

        //Q3- Special Number
        // int n = 9;
        // int og =n;
        // int sum=0;
        // int mul=0;
        // while (n!=0) {
        //     int digit = n% 10;
        //     sum = sum + digit;
        //     mul = mul * digit;
        //     n =n/10;
        // }
        // int ans= (sum + mul);
        // if(ans==og){
        //     System.out.println("Special Number");
        // }
        // else{
        //     System.out.println("Not a special number");
        // }

        //Q4- Factorial of odd num from 1 to 10
        // for(int i=1; i<=10 ;i++){
        //     int fact = 1;
        //     if (i%2==1) {
        //         for(int j=1; j<=i; j++){
        //             fact = fact * j;
        //         }
        //         System.out.println("Factorial of"+i+ "!=" + fact );        
        //     }  
        // }

        //Q5- half inverted pyramid
        // int n =5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(i<=j){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Q6- K Pattern 
        // int n = 5;
        // for(int i =1; i<=n; i++){
        //     for(int j=1 ; j<=n; j++){
        //         if (i+j<=n+1 || i==j ) {
        //             System.out.print("*");   
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
       
        //Q7- hollow abcd
        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         if(i==1)
        //         {
        //             System.out.print("a ");
        //         }
        //         else if(i==5)
        //         {
        //             System.out.print("d ");
        //         }
        //         else if(j==1)
        //         {
        //             System.out.print("b "); 
        //         }
        //         else if(j==5)
        //         {
        //             System.out.print("c ");
        //         }
        //         else if(i==j)
        //         {
        //             System.out.print("e ");
        //         }
        //         else
        //         {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }    
    
        // Q8- Print consonent from c to v
        // char ch = 'c';
        // for(ch ='c'; ch<='v'; ch++){
        //     if(!(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')){
        //         System.out.println(ch);
        //     }

        // }

        // double a, b, c;
        // a = 3.0/0;
        // b = 0/4.0;
        // c = 0/0.0;

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
    
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number");
        // int n = sc.nextInt();

        int [] array1 = {1, 2, 3};
        int [] array2 = {5, 7, 2};
        int [] sumArray = new int [array1.length];

        for(int i = 0; i < array1.length; i++){
            sumArray[i] = array1[i] + array2[i];
        }

        System.out.println("Sum of Array");
        for (int num : sumArray){
            System.out.print(num + " ");
        }


    




    }
}
        

  