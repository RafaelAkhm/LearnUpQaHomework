import my.favorite.code.Utils;

public class Main {
    public static boolean isReedLight = false;

    public static void main(String[] args){


        int speedOfPlayer1 = 1;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;
        int outPlayers = 0;


        if(isReedLight == false)

        {
            if (speedOfPlayer1 >= 1) {
                outPlayers = outPlayers + 1;
                Utils.printDelim1("Статус игрока");
            }
            if (speedOfPlayer2 >= 1) {
                outPlayers = outPlayers + 1;
                Utils.printDelim2("Статус игрока");
            }
            if (speedOfPlayer3 >= 1) {
                outPlayers = outPlayers + 1;
                Utils.printDelim3("Статус игрока");
            }

            System.out.println("Выбыло: " + outPlayers);

        } else

        {
            System.out.println("Все в Игре! ");
        }

    }


}






