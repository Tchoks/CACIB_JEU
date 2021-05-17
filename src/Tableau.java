/**
 * @author martin
 * @created on 17/05/2021 at 19:08
 * @project PACKAGE_NAME
 * @email (martin.aurele12 @ gmail.com)
 */

public class Tableau {

    int size;
    private Point[][] points;


    Tableau(int size) {
        points = new Point[size][size];
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                points[row][column] = new Point(row, column);
            }
        }
    }
}
