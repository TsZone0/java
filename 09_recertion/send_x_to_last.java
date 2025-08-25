public class send_x_to_last {
    public static void Sendstring(String str, int index, int count, String newString) {
        if(index==str.length()){

            for(int  i =0; i<count; i++){
                newString += 'x';
                
            }
            System.out.println(newString);
            return;

        }

        char currentChar = str.charAt(index);
        if(currentChar=='x'){
            count++;
            
            Sendstring(str, index+1, count, newString);
        }
        else{
            newString +=currentChar;
            Sendstring(str, index+1, count, newString);
        }
        
    }
    public static void main(String[] args) {
        String str = "hdfsxsxtrx";
        Sendstring(str, 0, 0, "");
    }
}
