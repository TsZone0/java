public class bubble_shorting {

    public static void printarr(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={2,4,7,9,32,65};
        
        //bubble short
        for(int i=0; i<arr.length-1; i++){
            for(int j =0; j<arr.length -i -1; j++){
                
                if (arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            
            }
        }

        printarr(arr);
    }
    
}