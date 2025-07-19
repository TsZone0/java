public class set_bit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;

        int setBit = 1<<n;

        int newnum = setBit | n;
        System.out.println(newnum);
    }
}
