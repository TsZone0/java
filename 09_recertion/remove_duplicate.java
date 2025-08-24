public class remove_duplicate {
    public static boolean[] map = new boolean[26];

    public static void removeduplicate(String str, int idx , String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            removeduplicate(str, idx+1, newString);
        }
        else{
            newString = newString+currChar;
            map[currChar-'a'] = true;
            removeduplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "aahkahvhhahka";
        removeduplicate(str, 0, "");
    }
}
