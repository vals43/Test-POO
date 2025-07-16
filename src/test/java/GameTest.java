import com.monorganisation.monprojet.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Game game;

    @BeforeEach
    void setup() {
        game = new Game(5, 5);
    }

    @Test
    void testInput() {
        String simulatedInput = "R\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        String input = game.getUserInput();

        System.setIn(originalIn);

        assertEquals("R", input);
    }
}
