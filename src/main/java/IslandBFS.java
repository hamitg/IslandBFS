import java.util.*;

public class IslandBFS {

    int[][] grid;
    Set<Point> visitedLands = new HashSet<>();
    int rowSize;
    int colSize;


    public IslandBFS(int[][] grid) {
        this.grid = grid;
        this.rowSize = grid.length;
        this.colSize = grid[0].length;
    }

    public int scanMap() {
        int numOfIslands = 0;
        Point currentPoint = new Point(0, 0);
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                currentPoint.r = i;
                currentPoint.c = j;
                if (grid[i][j] == 1 && !visitedLands.contains(currentPoint)) {
                    numOfIslands += 1;
                    doBfs(currentPoint, visitedLands);
                }
            }
        }
        return numOfIslands;
    }

    boolean isInBounds(Point point) {
        return point.r >= 0 && point.c >= 0 && point.r < rowSize && point.c < colSize;
    }

    public void addAdjacentLands(int r, int c, Queue<Point> queue, Set<Point> visitedLands) {
        for (Direction direction : Direction.values()) {
            Point newPoint = new Point(r, c);
            newPoint.makeMove(direction);
            if (canMove(grid, newPoint)) {
                queue.add(newPoint);
                visitedLands.add(newPoint);
            }
        }
    }

    boolean canMove(int[][] grid, Point newPoint) {
        return isInBounds(newPoint) && grid[newPoint.r][newPoint.c] == 1 && !visitedLands.contains(newPoint);
    }

    public void doBfs(Point currentPoint, Set<Point> visitedLands) {
        Queue<Point> queue = new LinkedList<Point>();
        visitedLands.add(currentPoint);
        queue.add(currentPoint);
        while (!queue.isEmpty()) {
            int r = queue.peek().r;
            int c = queue.peek().c;
            addAdjacentLands(r, c, queue, visitedLands);
            queue.remove();
        }
    }
}
