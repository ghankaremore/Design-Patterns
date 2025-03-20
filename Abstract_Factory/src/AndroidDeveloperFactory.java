public class AndroidDeveloperFactory extends AbstractEmployeeFactory{

    @Override
    public Employee getEmployee() {
        return new AndroidDeveloper();
    }
}
