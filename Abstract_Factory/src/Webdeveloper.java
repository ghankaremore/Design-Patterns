public class Webdeveloper implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("I am web developer");
        return "Web Developer";
    }
}
