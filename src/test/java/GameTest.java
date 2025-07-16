import com.monorganisation.monprojet.Game;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    void testInput() {
        System.setIn(new ByteArrayInputStream("R\n".getBytes()));
        Game game = new Game(5, 5);
        assertEquals("R", game.getUserInput());
    }
}
