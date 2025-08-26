public class tower_of_hanoi {
    public static void towerofhanoi(int n, String src, String helper, String Des ) {
    if (n ==1){
        System.out.println("Transfred " + n + "disk " + src + "to " + Des );
        return;
    }
        towerofhanoi(n-1, src, Des, helper);
        System.out.println("Transfred " + n + "disk " + src + "to " + Des );
        towerofhanoi(n-1, helper, src, Des);

        
    }

    public static void main(String[] args) {
        int n = 5;
        towerofhanoi(n, "S", "H", "D");

    }
}
