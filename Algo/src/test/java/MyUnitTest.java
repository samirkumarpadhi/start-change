import com.go.array.ArrayClassification;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MyUnitTest {
    @Autowired
    ArrayClassification arrayClassification;

    @Test
    public void testArray() {
        int array[] = { 8,3,9,4,98,77,101 };

        assertThat(arrayClassification.evenOdd(array)).isEqualTo("[8, 98, 4, 9, 77, 101, 3]");
    }
}
