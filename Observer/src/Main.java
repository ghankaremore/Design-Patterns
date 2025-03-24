import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Youtubechannel yb = new Youtubechannel();


//        Subscriber subscriber = new Subscriber("Ghanshyam");
//        yb.subscribe(subscriber);
//        yb.videoupload("New course on python");

        System.out.println("Enter 1 if you want to create new Subscriber and subscribe");
        System.out.println("Enter 2 if you want to upload video");
        System.out.println("Enter 3 if you want to unsubsribe");
        System.out.println("Enter 4 if you want to exit");
        Scanner sc = new Scanner(System.in);

        while(true) {
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("Provide the name of the Subscriber");
                String name = sc.next();
                Subscriber sb = new Subscriber(name);
                yb.subscribe(sb);

            } else if (input == 2) {
                System.out.println("Provide the name of the video you want to upload");
                String name = sc.next();
                yb.videoupload(name);
            }  else if (input == 3) {
                System.out.println("Thank you for using this app");
                break;

            } else {
                System.out.println("Wrong input");
                break;
            }
        }


    }
}