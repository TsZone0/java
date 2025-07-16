public class string_bulder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("shivam");

        //character at index
        System.out.println(sb.charAt(3));

        // setr char at index
        sb.setCharAt(0 , 'L');
        System.out.println(sb);

        // inset char in string
        sb.insert(0,'S');
        System.out.println(sb);

        //delete char in string
        sb.delete(0,2);
        System.out.println(sb);

        //insert char using append
        sb.append('a');
        System.out.println(sb);
    }
}
