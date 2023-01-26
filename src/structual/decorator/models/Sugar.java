package structual.decorator.models;

public class Sugar implements Coffee{
    @Override
    public void make() {
        System.out.println("Sugar Coffee");
    }
}
