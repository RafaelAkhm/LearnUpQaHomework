class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 17;
        int speedOfPlayer3 = 2;
        int outPlayers = 0;

        if (isGreenLight == true) {
            if (speedOfPlayer1 > 0) {
                outPlayers = outPlayers + 1;
            }
            if (speedOfPlayer2 > 0) {
                outPlayers = outPlayers + 1;
            }
            if (speedOfPlayer3 > 0) {
                outPlayers = outPlayers + 1;
            }


        }
        System.out.println("Выбыло: " + outPlayers);

    }


}





