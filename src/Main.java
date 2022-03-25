import my.favorite.code.Utils;

class Color {

    public static boolean isGreenLight = true;

    public static boolean isLose(int speedOfPlayer) {
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
                Color.isGreenLight = true;
                boolean f = Color.isLose(0);
                if (f==true)
                    System.out.println("Игрок выбыл");
                else
                    System.out.println("Игрок проходит");
                Color.isGreenLight = true;
                System.out.println(Color.isLose(5));


            }
        }






