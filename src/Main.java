import my.favorite.code.Utils;

class Color {

    public static boolean isGreenLight = true;

    public static boolean getSpeed(int speedOfPlayer) {
        boolean speed = false;
        if (isGreenLight) {
            if (speedOfPlayer > 0) {
                return true;
            } else {
                return false;
            }
        }
        return speed;
    }
}

public class Main {
    public static void main(String[] args) {
        Color.isGreenLight = false;
        if (Color.getSpeed(7)) {
            System.out.println("Игрок проходит");
        } else {
            System.out.println("Игрок выбыл");
        }
    }
}





