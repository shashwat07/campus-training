import java.util.Scanner;  

public class Login{

     public static void main(String []args){
        System.out.println("Welcome to XYZ site!");
        System.out.println("Choose the login method:");
        System.out.println("Enter gmail to login via Gmail");
        System.out.println("Enter fb to login via Facebook");
        System.out.println("Enter yahoo to login via Yahoo");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        LoginFactory login = new LoginFactory();
        SocialMedia currentMedia = null;
        if(option!=null){
            currentMedia = login.useSocialMedia(option);
        }
        System.out.println("Enter Username");
        String user = sc.next();
        System.out.println("Enter Password");
        String pass = sc.next();
        
        if(currentMedia!=null){
            matchCredentials(currentMedia,user,pass);
        }
     }
     
     public static void matchCredentials(SocialMedia currentMedia, String user, String pass){
         String userName = currentMedia.getUsername();
         String passWord = currentMedia.getPassword();
         if(userName.equals(user)){
             if(passWord.equals(pass)){
                 System.out.println("Successfully Logged In!");
             }
             else{
                 System.out.println("Incorrect Password");
             }
         }
         else{
             System.out.println("Incorrect Username!");
         }
     }
}
