public enum Direction {
    LEF(-1, 0),
    DOWN(0, -1),
    RIGHT(1, 0),
    UP(0, 1);

    public int dr;
    public int dc;


    private Direction(int dr, int dc) {
        this.dr = dr;
        this.dc = dc;
    }
}