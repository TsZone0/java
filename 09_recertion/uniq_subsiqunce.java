import java.util.HashSet;
public class uniq_subsiqunce {
    public static void subsiqunces(String str, int idx, String newString , HashSet set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
            System.out.println(newString);
            set.add(newString);
            return;
            }

        }

        char currChar = str.charAt(idx);

    //for yes
        subsiqunces(str, idx+1, newString+currChar, set);
    //for no
        subsiqunces(str, idx+1, newString, set);

    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsiqunces(str, 0, "",set);
    }
}
