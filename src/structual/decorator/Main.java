package structual.decorator;

import structual.decorator.decorators.CoffeeCreamDecorator;
import structual.decorator.decorators.CoffeeDecorator;
import structual.decorator.models.Coffee;
import structual.decorator.models.Milk;
import structual.decorator.models.Sugar;

public class Main {
    public static void main(String[] args) {

        Milk milk=new Milk();
        milk.make();

        Sugar sugar=new Sugar();
        sugar.make();

        System.out.println("******");

        Coffee decorateCoffee = new CoffeeCreamDecorator(new Sugar());
        decorateCoffee.make();

    }
}
