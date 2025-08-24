public class recurtion_sum {
    public static void printsum(int i, int num, int sum) {
        if(i==num){
            sum +=i;
            System.out.println(sum);
            return;
        }
        

        sum +=i;
        printsum(i+1, num, sum);
        
        
    }

    public static void main(String[] args) {
        int num =5;
        printsum(1, num, 0);
    }
}
