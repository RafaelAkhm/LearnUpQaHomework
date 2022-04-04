import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaticTest {

    @Test

    public void NumbersOutPlayers() {
        int[] speedOfPlayer = {0, 3, 2 };
        int expected = 3;
        int actual = Statistic.numberOfDropouts(speedOfPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MassOutPlayer() {
        int[] speedOfPlayer = {0, 3, 2 };
        int[] expected = {3, 2};
        int[] actual = Statistic.speedsOfDropped(speedOfPlayers);}
    @Test

    public void MassStayPlayer() {
        int[] speedOfPlayers = {0, 3, 2 };
        int[] expected = {0};
        int[] actual = Statistic.speedsOfNotDropped(speedOfPlayers);}

    @Test

    public void MAX_SPEED() {
        int[] speedOfPlayers = {3, 0, 0, 4, 1};
        int[] expected = {4};
        int[] actual = Statistic.MAX_SPEED(speedOfPlayers);}
    }
