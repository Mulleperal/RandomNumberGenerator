import at.meller.RandomController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomControllerTest {
    @Test
    public void test_generator_Below100(){
        // Arrange
        RandomController rng = new RandomController();
        // Act
        int tmp = rng.generator();
        // Assert
        Assertions.assertEquals(true,tmp <= 100);
    }

    @Test
    public void test_generator_Above0(){
        // Arrange
        RandomController rng = new RandomController();
        // Act
        int tmp = rng.generator();
        // Assert
        Assertions.assertEquals(true,tmp >= 0);
    }
}
