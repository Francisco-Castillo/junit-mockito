
import com.fcastillo.junit.App;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author fcastillo
 */
public class AppTest {

    App app = new App();

    @Test
    public void testSumar() {
        assertEquals(4, app.sumar(1, 3));
    }

}
