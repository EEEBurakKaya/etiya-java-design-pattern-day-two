package structual.decorator.decorators;

import structual.decorator.models.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    public Coffee coffee;

    public CoffeeDecorator (Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void make() {
        coffee.make();
    }
}
