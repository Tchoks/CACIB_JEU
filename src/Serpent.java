import java.util.LinkedList;

/**
 * @author martin
 * @created on 17/05/2021 at 18:31
 * @project PACKAGE_NAME
 * @email (martin.aurele12 @ gmail.com)
 */

public class Serpent {


    private LinkedList<Point> points = new LinkedList<>();
    private Point head;


    Serpent(Point start) {
        head = start;
        points.add(head);
    }

    void move(Point next) {
        final Point last = points.removeLast();
        head = next;
        points.addFirst(head);

    }

    public boolean over(Point next) {
        for (Point point : points) {
            if (point == next)
                return true;
        }
        return false;
    }

    public Point getHead() {
        return head;
    }

    public Point getTail() {
        return points.getLast();
    }



/*
    int size = 5;

    Point[] positions;

    Serpent() {
        positions = new Point[size];
    }

    void move(Point point) {
        for (int i = 5 ; i >= 1; i--) {
            positions[i] = positions[i -1];
        }
        positions[0] = point;
    }

    Point direction(char direction, Point head) {
        Point point;
        if (direction == 'D') {
            point = new Point(, );
        }
    }*/

}
