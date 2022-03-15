import my.favorite.code.Utils;

class Color {

    static boolean isReedLight = true;
    public static int speedsOfPlayers(int outPlayers) {

        int speedOfPlayer1 = 1;
        int speedOfPlayer2 = 5;
        int speedOfPlayer3 = 2;
        outPlayers = 0;

        if (isReedLight) {
            if (speedOfPlayer1 > 0) {
                outPlayers = outPlayers + 1;
                Utils.printDelim1("Статус игрока");
            }
            if (speedOfPlayer2 > 0) {
                outPlayers = outPlayers + 1;
                Utils.printDelim2("Статус игрока");
            }
            if (speedOfPlayer3 > 0) {
                outPlayers = outPlayers + 1;
                Utils.printDelim3("Статус игрока");
            }
        }
        return outPlayers;
    }
}

public class Main {
    public static void main(String[] args) {

        if (Color.isReedLight) {
            System.out.println("Выбыло: " + Color.speedsOfPlayers(1) );
        } else {
            System.out.println("Все в Игре! ");
        }

    }
}








