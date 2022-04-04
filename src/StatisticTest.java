import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaticTest {

    @Test

    public void NumbersOutPlayers() {
        int[] speedOfPlayers = {0, 3, 2 };

        int expected = 3;
        int actual = Statistic.numberOfDropouts(speedOfPlayers);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MassOutPlayers() {
        int[] speedOfPlayers = {0, 3, 2 };

        int[] expected = {3, 2};
        int[] actual = Statistic.speedsOfDropped(speedOfPlayers);}
    @Test

    public void MassStayPlayers() {
        int[] speedOfPlayers = {0, 3, 2 };

        int[] expected = {0};
        int[] actual = Statistic.speedsOfNotDropped(speedOfPlayers);}

    }
