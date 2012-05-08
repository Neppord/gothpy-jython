public class Main{
    public static void main(String[] argv){
        if(login(argv[0], argv[1])){
            System.out.println("Login Succseeded!");
        } else {
            System.out.println("Login Faild!");
        }
    }
    
    private static String username = "stark";
    private static String password = "IamIronMan";

    private static boolean login(String username, String password){
        return username.equals(Main.username) && password.equals(Main.password);
    }

    
}
