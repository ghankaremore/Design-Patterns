public class WebDeveloperFactory extends AbstractEmployeeFactory{
    @Override
    public Employee getEmployee() {
        return new Webdeveloper();
    }
}
