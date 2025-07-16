import com.monorganisation.monprojet.SpaceShip;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private SpaceShip spaceShip;
    private final int gridSize = 6;

    @BeforeEach
    public void setUp() {
        spaceShip = new SpaceShip(); // démarre en (0, 0)
    }

    @Test
    public void testMoveRight() {
        boolean moved = spaceShip.moveX(1, gridSize);
        assertTrue(moved);
        assertEquals(1, spaceShip.getX());
    }
    @Test
    public void testMoveDown() {
        boolean moved = spaceShip.moveY(1, gridSize);
        assertTrue(moved);
        assertEquals(1, spaceShip.getY());
    }
}
