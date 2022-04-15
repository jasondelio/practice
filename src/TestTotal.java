import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestTotal {
    Total total;

    @BeforeEach
    public void init(){
        total = new Total();
    }

    @Test
    public void Test1(){
        assertEquals(total.sum(1,2), 3);
    }

    @Test
    public void Test2(){
        TooBigException expected = assertThrows(TooBigException.class, () -> total.sum(10, 2));

        TooBigException actual = new TooBigException("The Value too big!");

        assertEquals(expected.getMessage(), actual.getMessage());
    }
}
