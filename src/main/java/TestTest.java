import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTest {

    @Test
    public void firstTest() {
        int a = 1;
        int b = 3;
        int n = a + b;
        int result = 4;
        Assert.assertEquals(result, n, "Wrong result");
    }

    @Test
    public void secondTest() {
        String string = "Hello";
        Assert.assertEquals(string, "Hello", "Wrong word");
    }
}
