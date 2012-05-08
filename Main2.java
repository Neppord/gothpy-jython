public class Main2{
    public static void main(String[] argv){
        fetch_users();
        if(login(argv[0], argv[1])){
            System.out.println("Login Succseeded!");
        } else {
            System.out.println("Login Faild!");
        }
    }

    private static String username;
    private static String password;

    private static void fetch_users(){
        username = "PemminsAura";
        password = "IamSuperman";
    }
    
    private static boolean login(String inUsername, String inPassword){
        return username.equals(inUsername) && password.equals(inPassword);
    }

    
}
