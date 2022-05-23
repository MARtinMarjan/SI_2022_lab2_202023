import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SILab2Test {
    @Test
    public void test1() {
        assertEquals(SILab2.function(2),"POSITIVE");
        assertEquals(SILab2.function(-2),"NEGATIVE");
        assertEquals(SILab2.function(0),"ZERO");
    }
    @Test
    public void test2() {
        assertEquals(SILab2.function(77),"POSITIVE");
        assertEquals(SILab2.function(-22),"NEGATIVE");
        assertEquals(SILab2.function(0),"ZERO");
    }
}
