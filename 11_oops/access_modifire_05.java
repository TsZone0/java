//public = pure class me koi bhi access kar skata hai
//default = access modifire isko access kar sakta hai ye default me set hota hai
//protected = isko duskre access modifire me sirf subclass hi access kar skate hai aur current me koi bhi
//private = isko sirf usi ke class me access kiya ja sakta hai



class Account{
    public String name;   //public
    int age;    // default
    protected String email; // protected
    private String password; // private


    //getters & setters
    public String getpassword(){
        return this.password;
    }

    public void setpassword(String pass){
        this.password = pass;

    }
}

public class access_modifire_05 {
    public static void main(String[] args) {
        Account account1= new Account();
        account1.name = "Shivam";
        account1.setpassword("abcd"); 
        System.out.println(account1.getpassword());
    }
    
}
