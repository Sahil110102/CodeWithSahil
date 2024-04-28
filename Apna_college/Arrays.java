package Apna_college;
/**
 * Arrays
 */
public class Arrays {


    public static boolean func(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=n; j++){
                if(arr[j]<arr[i])
                return false;
                
            }
        }

        return true;
        

    }
    public static void main(String[] args) {
        int [] arr = {25, 5, 2, 63, 45};
        int n = arr.length;
        
        System.out.println(func(arr, n));



        
    }
}
