import java.util.*;
public class recurtion_factorial {
    public static int result_r(int num) {
        if(num==1 || num==1){
            return 1;
        }
        int fac_1 = result_r(num-1);
        int final_r = num*fac_1;
        return final_r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Number : ");
        int num = sc.nextInt();
  
        int ans = result_r(num);
        System.out.println(ans);
    }
    
}