public class chapter_1{

public static void main(String[] args) {

    // Bubble Sort : by brout force
    int[] arr = {7, 2, 9, 1, 5};
for(int i = 0 ; i<arr.length-1; i++){

    for (int j = 0 ; j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
            int temp = arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
    // System.out.println(arr[j]);
        }
    }
}

for(int i = 0 ; i<arr.length;i++){
    System.out.println(arr[i]);
}


    
}
}
