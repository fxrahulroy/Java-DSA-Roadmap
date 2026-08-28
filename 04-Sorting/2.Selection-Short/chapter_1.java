public class chapter_1 {

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 5};

        // for(int i = 0 ; i<arr.length; i++){
        //     int minvalue = i; // Mistake 2 — minvalue me index store kar rahe ho

        //     for(int j = i+1; j<arr.length-1-i; j++){ // Mistake 1 — Inner loop ki condition

        //         if(arr[j]<minvalue){  // Mistake 3 — Comparison  {if(arr[j] < arr[minIndex])}
        //             int temp = arr[j];
        //             arr[j]=minvalue;
        //             minvalue=temp;

        //             // break;
        //         }
        //     }
           
        //  System.out.println(arr[i]);
        // }
// ea: Unsorted part se minimum find → current position par place.
// i → jis position ko fix karna hai.
// j → minimum search karta hai.
// minIndex → minimum element ka index store karta hai.
// Minimum milne par sirf end me ek swap.
// Time: Best = Average = Worst = O(n²)
// Space: O(1)
// In-place: ✅
// Stable: ❌ (standard implementation)
// Adaptive: ❌
        // on more time 

        for(int i = 0; i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex =j;
                   

                }

                
            }

             int temp = arr[i];
                    arr[i]=arr[minIndex];
                    arr[minIndex]=temp;

            
        }
        for(int i = 0; i<arr.length;i++){
         System.out.println(arr[i]);
        }
    }
}
