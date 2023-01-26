package structual.decorator.decorators;

import structual.decorator.models.Coffee;

public class CoffeeCreamDecorator extends CoffeeDecorator{

    public CoffeeCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void make() {
        chocolate();
        coffee.make();
    }

    private void chocolate(){
        System.out.println("Çikolatalı krema eklendi.");
    }
}
