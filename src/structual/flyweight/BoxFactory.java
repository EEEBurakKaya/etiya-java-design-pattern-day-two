package structual.flyweight;

import java.util.HashMap;

public class BoxFactory {
     private static HashMap squares = new HashMap();
     public static Square getSquare (String color){
         Square square = (Square) squares.get(color);

         if(square == null){
             System.out.println("Newleme işlemi gerçekleştiriliyor.");
             square = new Square(color);
             squares.put(color,square);
         }
         return square;
     }
}
