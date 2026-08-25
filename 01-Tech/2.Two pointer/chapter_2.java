public class chapter_2{

    public static void main (String[] args ){

        // int[] arr = {1, 2, 4, 7, 9, 11};
    //     int target = 13;

    //    int left = 0;
    //    int right = arr.length-1;

    //    while (left < right){
    //     int sum = arr[left]+arr[right];

    //      if (sum == target){

    //         System.out.println(arr[left]+ " " +  arr[right]);

    //         break;

    //      } else if(sum < target){
    //         left ++;


    //      } else {
    //         right --;
    //      }
    //    }
//   Question 2 — Pair With Difference

     int [] arr = {1, 3, 5, 8, 12, 15};
      int target = 7;

      int left = 0;
      int right = 1;

      while(left < arr.length){
       int  differnce = arr[right] - arr[left];
       
       if (differnce==target){
        System.out.println(arr[left] + " " + arr[right]);

        left ++;

        right ++;

    }
      else if(differnce < target){
         right++;

      } else{
        left ++;

      }if (left == right){

     right++;
      }

    }

}
}
