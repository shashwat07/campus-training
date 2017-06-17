public class LoginFactory{
    public SocialMedia useSocialMedia(String option){
        SocialMedia media = null;
        if(option.equals("gmail")){
            media = new Gmail();
        }
        else if(option.equals("fb")){
            media = new Facebook();
        }
        else if(option.equals("yahoo")){
            media = new Yahoo();
        }
        else{
            System.out.println("Invalid input, please try again!");
        }
        return media;
    }
}