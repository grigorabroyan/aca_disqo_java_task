package task_1;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 2);
        System.out.println(point);
        System.out.println("distance of that point from x and y = 0 coordinate - " + point.distance());
        System.out.println("distance between second point - " + point.distance(new Point(7, 3)));
    }
}
