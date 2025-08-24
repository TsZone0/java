public class recurtion1_5 {
    public static void printn(int n) {
        if(n==6){
            return;
        }
        System.out.println(n);
        printn(n+1);
    }

    public static void main(String[] args) {
        int n = 1;
        printn(n);

    }
}