import at.meller.RandomController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomControllerTest {
    @Test
    public void test_generator_Below100(){
        RandomController rng = new RandomController();
        int tmp = rng.generator();
        Assertions.assertEquals(true,tmp <= 100);
    }

    @Test
    public void test_generator_Above0(){
        RandomController rng = new RandomController();
        int tmp = rng.generator();
        Assertions.assertEquals(true,tmp >= 0);
    }
}
