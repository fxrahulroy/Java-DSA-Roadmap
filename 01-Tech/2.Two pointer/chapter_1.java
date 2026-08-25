public class chapter_1{
    public static  void main (String[]args){

        // Reverse Array

    //    int [] arr = {1, 2, 3, 4, 5};

    //    int left = 0 ;
    //    int right = arr.length-1;

    //    while (left<right) {

    //     int temp = arr[left];
    //    arr[left] = arr[right];
    //    arr[right] = temp;

    //     left ++;
    //     right --;

        
    //    }

    //    for(int i = 0 ; i < arr.length ; i++){

    //      System.out.println(arr[i] + " ");
    //    }




        // Pair Sum

     int [] arr = {1, 2, 3, 4, 6};

       int  target = 6;

        int left = 0 ;
        int right = arr.length - 1;

        while(left < right ){
            int sum = arr[left] + arr[right];

            if(sum == target){
                System.out.println(arr[left]+ " "+ arr[right]);
                break;
            } 
            else if (sum < target){
                left++;
               
            } else{
                    right--;
                }

        }

    }
}
