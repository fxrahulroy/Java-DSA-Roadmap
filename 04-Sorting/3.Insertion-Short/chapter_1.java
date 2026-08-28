public class chapter_1 {

    public static void main(String[] args) {
        int [] arr = {7,2,9,1,5};
        for(int i = 1; i<arr.length; i++){
            int key = arr[i]; //  revision in line 6 to 12
           int  j = i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
           
        } 
        for(int i = 0 ; i<arr.length; i++){
        System.out.println(arr[i]);
        }
    }
}
