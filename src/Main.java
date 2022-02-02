class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;
        int outPlayers = 0;

        if (isGreenLight = true) {
            if (speedOfPlayer1 >= 1) {
                outPlayers = outPlayers + 1;
            }
            if (speedOfPlayer2 >= 1) {
                outPlayers = outPlayers + 1;
            }
            if (speedOfPlayer3 >= 1) {
                outPlayers = outPlayers + 1;
            }


        }
        System.out.println("Выбыло: " + outPlayers);

    }


}


// Допишите здесь логику так, что будет подсчитано и выведено
// количество игроков, которые выбывают.
// Если свет зелёный, то проходят все игроки (0 выбывают).
// Если свет красный, то выбывает каждый, чья скорость не 0.


