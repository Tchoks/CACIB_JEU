
/**
 * @author martin
 * @created on 17/05/2021 at 18:18
 * @project PACKAGE_NAME
 * @email (martin.aurele12 @ gmail.com)
 */

public class Test {

    public static void main(String[] args) {
        System.out.println("CACIB Test");


        Point init = new Point(0,0 );
        final Serpent serpent = new Serpent(init);
        final Tableau tableau = new Tableau(5);
        final Game game = new Game(serpent, tableau);
        // Enter direction
        char direction = 'D';
        game.enterDirection(direction);

        final Point tail = game.getSerpent().getTail();

        System.out.println("Snake is at : " + tail);
    }
}
