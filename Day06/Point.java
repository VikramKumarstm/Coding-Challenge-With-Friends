package Day06;

public class Point {
    Integer x, y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public static void main(String[] args) {
        Point p = new Point(8, 2);
        Point p1 = new Point(2.4, 8.9);

        System.out.println("x :"+ p.x + ", y :"+ p.y);
        System.out.println("x :"+ p1.x + ", y :"+ p1.y);
    }
}
