import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TotalTest {
    Total total;

    @BeforeEach
    public void init(){
        total = new Total();
    }

    @Test
    public void TestTotal(){
        RuntimeException expected = new RuntimeException("TOO BIG");
        RuntimeException actual = assertThrows(RuntimeException.class,()->
                total.sum(101, 2));
        assertEquals(expected.getMessage(), actual.getMessage());
    }
}
