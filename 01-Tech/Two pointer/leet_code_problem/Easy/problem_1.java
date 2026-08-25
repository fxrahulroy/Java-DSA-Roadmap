public class problem_1{
public static void main(String[] args) {

   int[] arr = {2, 7, 11, 15};
    int  target = 14;


    int left = 0;
    int right = arr.length-1;

    while(left<right){
        int sum = arr[left] + arr[right];
        if(sum  == target){
            System.out.println(arr[left] + " " + arr[right]);

            break;
        } else if(sum<target){
            left ++;
        }else{
            right--;
        }
    }
}
}
