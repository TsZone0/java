public class selection_short {
    public static void printarr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,45,44,67,54,545,56,58,34};

        for(int i =0; i<arr.length-1; i++){
            int smallest = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }

                // time complexity is O(n^2)
            }
            int temp = arr[smallest];
             arr[smallest] = arr[i];
             arr[i] = temp;

        }
        printarr(arr);
    }
}
