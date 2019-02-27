import org.junit.Test;

import static org.junit.Assert.*;

public class TestIslandBFS {

    @Test
    public void testIslandDFS () {

        IslandBFS islandBFS = new IslandBFS(multi);
        assertEquals(1, islandBFS.scanMap() );

    }

    int [][] multi = new int[][]{
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
    };
}
