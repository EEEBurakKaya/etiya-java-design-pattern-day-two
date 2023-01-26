package structual.decorator.models;

public class Milk implements Coffee{
    @Override
    public void make() {
        System.out.println("Milk Coffee");
    }
}
