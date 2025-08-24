public class reverse_string {
    public static void Stringreverce(String str, int index) {
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        Stringreverce(str, index-1);
        
    }
    public static void main(String[] args) {
        String str = "ABCD";
        Stringreverce(str, str.length()-1);
    }
}



