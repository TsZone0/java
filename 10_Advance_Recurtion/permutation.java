public class permutation {
    public static void runpermutaion(String str, String permutaion){
        if(str.length()==0){
            System.out.println(permutaion);
            return;
        }
        for(int i=0 ; i<str.length();i++){
        char currChar = str.charAt(i);
        String newpermutaion = str.substring(0, i)+ str.substring(i+1);
        runpermutaion(newpermutaion, permutaion+currChar);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        runpermutaion(str, "");
    }
    
}





// permutaion is the combination off the elements like "abc"
// posible combinations
// abc/acb/bac/bca/cab/cba