import my.favorite.code.Utils;

class Color {

    public static boolean speedOfPlayer;
    static boolean isReedLight = false;

    public static int speedsOfPlayers(int speedOfPlayer) {
        speedOfPlayer = 5;


        if (isReedLight) {
            if (speedOfPlayer > 0) {
                speedOfPlayer = 1;
                Utils.printDelim1("Статус игрока");
            } else {
                Utils.printDelim2("Статус игрока");
            }
        }
        return speedOfPlayer;
    }

}

public class Main {
    public static void main(String[] args) {
        if (Color.isReedLight) {
            System.out.println("Выбыло: " + Color.speedsOfPlayers(1) );
        } else {
            System.out.println("Зеленый свет! Передвигайся и оставайся в игре! ");
        }
    }
}







