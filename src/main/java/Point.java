public class Point {

    int r;
    int c;

    public Point(int r, int c) {
        this.r = r;
        this.c = c;
    }

    public boolean equals(Object a) {
        Point point = (Point) a;
        if (((Point) a).c == this.c && ((Point) a).r == this.r)
            return true;
        else
            return false;
    }

    public void makeMove(Direction d) {
        this.r += d.dr;
        this.c += d.dc;
    }

    public int hashCode() {
        return (5001 * this.r) + this.c;
    }


}

