public class recurtion_power {
    public static int power(int x,int n) {
        if(n==0){
            return 1;
        }
        if (x==1) {
            return 0;
        }
        int power1 = power(x, n-1);
        int power2 = x * power1;
        return power2;
        
        
    }
    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        int ans = power(x, n);
        System.out.println(ans);
    }
}
