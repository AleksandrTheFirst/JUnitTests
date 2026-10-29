import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTests {

    @Test
    void testConcat_validArgument_success() {
        String first = "first";
        String second = "second";

        App app = new App();
        String result = app.concatStrings(first, second);

        Assertions.assertEquals("first second", result);
        Assertions.assertNotEquals("firstsecond", result);
        Assertions.assertNotNull(result);
        Assertions.assertTrue("first second".contains(result));
        Assertions.assertFalse(!"first second".contains(result));
    }
}
