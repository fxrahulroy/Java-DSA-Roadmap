// without using function  : Liner Search Question 
public class chapter_1{
    public static void main(String[]args){
        // int [] arr = {12, 45, 7, 23, 89, 34, 56};

        // int target = 23;  // ye hamara target hai 

        // for(int i = 0 ; i<arr.length ; i++){  // ye loop chle ga 

        //     if (arr[i]==target){
        //         System.out.println("Element is found  : ["+i + "]index ");
        //         return;
        //     }else{
        //         // System.out.println("Element is not found ");
                
        //     }

        // }

          int [] arr =  {5, 12, 8, 12, 20, 12, 7};
        int   target = 12;
        int count = 0;

        for (int i = 0 ; i<arr.length ; i++){
            if(arr[i]==target){
                // count = target;
                 count++;

              System.out.println("12 found at index: "+i);
            }
           
        }
        System.out.println("Total occurrences: " +count);
    }
}
