class Color {

    static boolean isGreenLight = false;
}

public class Statistic {

    static int speedPlOut(int[] speedOfPlayers) {


        int speedPlOut = 0;
        if (Color.isGreenLight) {
            for (int e : speedOfPlayers) {
                if (e > 0) speedPlOut++;
            }

        }
        return speedPlOut;
    }

    
    
    static int[] massOutPlayersLose(int[] speedOfPlayers) {
        int[] cnt = 0;
        for (int speed : speedOfPlayers) {
            if (!isGreenLight && speed > 0){
                cnt++;
            }
        }
        int[] arr = new int[cnt];
        int i = 0;
        for (int speed : speedOfPlayers) {
            if (!isGreenLight && speed > 0){
                i++;
            }
        }
        return arr;
        
        
    static int[] massOutPlayersWin(int[] speedOfPlayers) {
        int[] cnt = 0;
        for (int speed : speedOfPlayers) {
            if (!isGreenLight && speed = 0){
                cnt++;
            }
        }
        int[] arr = new int[cnt];
        int i = 0;
        for (int speed : speedOfPlayers) {
            if (!isGreenLight && speed = 0){
                i++;
            }
        }
        return arr;

}
