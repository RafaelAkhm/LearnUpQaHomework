import my.favorite.code.Utils;

class Color {

    public static boolean isGreenLight = true;

    public static boolean isLose(int speedOfPlayer) {
       
        if (isGreenLight) {
            return false;
        if (speed > 0) {
        return true;
        } else {
            return false;
    }
}

public class Main {
   public static void main(String[] args) {
        Color.isGreenLight = true;
        boolean f = Color.isLose();
        if (f==true) 
            System.out.println("Игрок выбыл");
        else
            System.out.println("Игрок проходит");
       Color.isGreenLight = true;
       System.out.println(Color.isLose());
    
    }
}







