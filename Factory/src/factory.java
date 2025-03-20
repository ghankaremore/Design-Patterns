public class factory {
    public static employee getemployee(String developer){
        if(developer.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();

        }else if(developer.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        }
        return null;



    }
}
