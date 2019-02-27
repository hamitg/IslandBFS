import java.util.*;

public class IslandBFS {

    int[][] multi;
    Queue<Point> queue = new LinkedList<Point>();
    Set<Point> lands = new HashSet<>();
    int numOfIslands = 0;


    public IslandBFS(int[][] multi) {
        this.multi = multi;
    }

    public int scanMap() {
        Point point = new Point(0, 0);
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[0].length; j++) {
                point.r = i;
                point.c = j;
                if (multi[i][j] == 1 && !lands.contains(point)) {
                    lands.add(point);
                    queue.add(point);
                    while (true) {
                        int r = queue.peek().r;
                        int c = queue.peek().c;
                        addAdjacentLands(r, c, queue, lands);
                        queue.remove();
                        if (queue.isEmpty()) {
                            numOfIslands += 1;
                            break;
                        }
                    }
                }
            }
        }
        return numOfIslands;
    }

    boolean isInBounds(Point point, int[][] multi) {
        if (point.r >= 0 && point.c >= 0 && point.r < multi.length && point.c < multi[0].length)
            return true;
        else return false;
    }

    public void addAdjacentLands(int r, int c, Queue<Point> queue, Set<Point> lands) {
        for (Direction direction : Direction.values()) {
            Point newPoint = new Point(r, c);
            newPoint.makeMove(direction);
            if (isInBounds(newPoint, multi) && multi[newPoint.r][newPoint.c] == 1 && !lands.contains(newPoint)
            ) {
                queue.add(newPoint);
                lands.add(newPoint);
            } else continue;
        }
    }
}
