public class chapter_1{
    public static void main (String[]args){
        // int [] arr = {10, 20, 30, 40, 50, 60, 70};
        // int target = 60;
        // int left = 0;
        // int right = arr.length-1;

        // while(left<=right){
        //     int mid = left + (right-left)/2;

        //     if(arr[mid]==target){
        //         System.out.println("Element is Found "+mid+"there");

        //         return;
        //     }else if(mid<target){
        //        left = mid +1;
        //     }else{
        //         right = mid -1;
        //     }
        // }
        // System.out.println("element nott found");



        // int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        //  int target = 80;

        //   int left = 0;
        //   int right = arr.length-1;

        //   while (left <right){
        //     int mid = left + (right-left)/2;
        //     if(arr[mid]==target){
        //         System.out.println("Element is found "+mid);
        //         return;
        //     }else if(mid<=target){ // mistake 
        //         left = mid+1;
        //     }else{
        //         right = mid -1;

        //     }
        //   }
        //   System.out.println("Element not found");


        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 25;

        int left = 0 ;
        int right = arr.length-1;

        while (left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                System.out.println("Element is found on index : = ["+mid+"]");
                return;
            }else if (arr[mid]<target){
                left = mid+1;

            }else{
                right = mid -1;
            }
        }
        System.out.println("Element is not found");
    }
}
