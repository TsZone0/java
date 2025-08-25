public class subsiqunces {
    public static void subsiqunces(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

    //for yes
        subsiqunces(str, idx+1, newString+currChar);
    //for no
        subsiqunces(str, idx+1, newString);

    }

    public static void main(String[] args) {
        String str = "abc";
        subsiqunces(str, 0, "");
    }
}
