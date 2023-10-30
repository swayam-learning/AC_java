package AC_Java_Basics;
class Account{
    public String name;
    protected String email;
    private String password; //can be accessed only within this class
    // to access private class we use getters and setters
    public String getPassword(){
//        setPassword(randompassword);
        return this.password;
    }
    public void setPassword(String pass){
//        if i make this private then in the main class no one can change the setPassword
        this.password=pass;

    }
}
public class acess_modifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name ="Swayam's account";
        a1.email = "swayam@gmail.com";// this can be accessed only by sub-classes of different package and in current package anyone can access it
        //a1.password = "abcd" this is not possible
        a1.setPassword("abcd");//if the public of setPassword is changed to private then this would be meaningless.
        System.out.println(a1.getPassword());
    }
}
