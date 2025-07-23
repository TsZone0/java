public class insertion_shorting {
    public static void printarr(int arr[]) {
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,4,2,5,6};

        for(int i =1; i<arr.length; i++){
            int current = i;
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;

            }

            //placement
            arr[j+1] = current;
        }
        printarr(arr);
    }
}
