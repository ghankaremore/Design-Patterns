public class User{
private String userId;
private String username;
private String password;

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString(){
        return username + " : " + password;
    }

    public User(UserBuilder userBuilder){
        this.userId = userBuilder.userId;
        this.password = userBuilder.password;
        this.username = userBuilder.username;



}




private User(){

}
static class UserBuilder{
        private String userId;
        private String username;
        private String password;



    public static UserBuilder builder(){
         return new UserBuilder();
    }


    public UserBuilder setUserId(String userId) {

        this.userId = userId;
        return this;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public User build(){
        return new User(this);

    }
}



}
