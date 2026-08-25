 public class main{
    public static void main(String[]args){

int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
int target = 9;
int sum =0;

int left = 0;
int right = 0;

while (left < right){
    sum = arr[left]+arr[right];
    if (sum== target){
        left++;
        right--;

    }else if(sum<target){

    }else{
        right --;
    }System.out.println(sum);

    }
}

 }
