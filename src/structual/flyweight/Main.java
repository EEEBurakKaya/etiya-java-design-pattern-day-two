package structual.flyweight;

public class Main {
    private static final String colors[] = { "Kırmızı" , "Siyah" , "Beyaz", "Mavi" };

    public static void main(String[] args) {
        for(int i=0; i<200; i++){
            Square square = BoxFactory.getSquare(getRandomColor());
            square.setX(getRandomCoordinate());
            square.setY(getRandomCoordinate());
            square.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random() * colors.length)];
    }
    private static int getRandomCoordinate(){
        return (int)(Math.random() * 1000);
    }
    }
