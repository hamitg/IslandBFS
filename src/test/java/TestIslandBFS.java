import org.junit.Test;

import static org.junit.Assert.*;

public class TestIslandBFS {

    @Test
    public void testIslandDFSAllLand () {
        IslandBFS islandBFS = new IslandBFS(grid1);
        assertEquals(3, islandBFS.scanMap() );

    }

    @Test
     public void testIslandBFSAllWater () {
        IslandBFS islandBFS = new IslandBFS(grid2);
        assertEquals(0, islandBFS.scanMap() );
    }

    @Test
    public void testIslandBFSMergedIslands () {
        IslandBFS islandBFS = new IslandBFS(grid3);
        assertEquals(2, islandBFS.scanMap() );

    }

    @Test
    public void testIslandBFSOneLandIslands () {
        IslandBFS islandBFS = new IslandBFS(grid4);
        assertEquals(9, islandBFS.scanMap() );

    }

    int [][] grid1 = new int[][]{
            { 1, 0, 1, 0, 1, 1, 0, 1, 1, 1 },
            { 1, 0, 1, 0, 0, 1, 0, 1, 1, 1 },
            { 1, 0, 1, 0, 0, 1, 0, 1, 1, 1 },
            { 1, 1, 1, 0, 0, 1, 0, 1, 1, 1 },
            { 1, 0, 1, 0, 0, 1, 0, 1, 1, 1 }
    };

    int [][] grid2 = new int[][]{
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };

    int [][] grid3 = new int[][]{
            { 1, 0, 1, 0, 1, 0, 0, 0, 0, 0 },
            { 1, 0, 1, 0, 1, 1, 1, 1, 0, 0 },
            { 1, 0, 1, 0, 1, 0, 0, 1, 0, 0 },
            { 1, 1, 1, 0, 1, 0, 0, 1, 1, 0 },
            { 1, 0, 1, 0, 1, 0, 0, 0, 1, 1 }
    };

    int [][] grid4 = new int[][]{
            { 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
            { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 1, 0, 0, 1 }
    };
}
