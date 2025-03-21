// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setUserId("123").setPassword("Ghanesh@123").setUsername("Ghanesh").build();
        User user1 =  User.UserBuilder.builder().setUserId("124").setPassword("Shraddha@123").setUsername("Shraddha").build();
        System.out.println(user);
        System.out.println(user1);
        }

}