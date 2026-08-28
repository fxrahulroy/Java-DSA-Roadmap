public class chapter_1 {

    public static void main(String[] args) {
        
// Searching ka next important concept: First Occurrence

// int[] arr = {10, 20, 20, 20, 30, 40, 50};
// int target = 20;
// int left = 0;
// int right = arr.length-1;

// while(left<=target){
//    int mid = (left+right)/2;

//     if(arr[mid]==target){
//         int ans = mid;
//         mid=target;
//         target= ans;
//         System.out.println(ans);
//     }else if(arr[mid]<target){
//         left = mid+1;

//     }else{
//         right = mid+2;

//     }

// }
//    System.out.println("elemet is not found");


int[] arr = {10, 20, 20, 20, 30, 40, 50};

int target = 20;

int left = 0;
int right = arr.length - 1;

int answer = -1;

while (left <= right) {

    int mid = left + (right - left) / 2;

    if (arr[mid] == target) {

        answer = mid;
        right = mid - 1;

    } else if (arr[mid] < target) {

        left = mid + 1;

    } else {

        right = mid - 1;
    }
}

if (answer != -1) {
    System.out.println("First occurrence: " + answer);
} else {
    System.out.println("Element not found");
}
    }
}
