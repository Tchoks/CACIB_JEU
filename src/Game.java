

/**
 * @author martin
 * @created on 17/05/2021 at 19:00
 * @project PACKAGE_NAME
 * @email (martin.aurele12 @ gmail.com)
 */

public class Game {


    private Serpent serpent;
    private Tableau tableau;
    private char direction;
    private boolean gameOver;


    public Game(Serpent serpent, Tableau tableau)
    {
        this.serpent = serpent;
        this.tableau = tableau;
    }

    public void enterDirection(char direction) {
        final Point nextPoint = nextPoint(serpent.getHead(), direction);
        serpent.move(nextPoint);
    }



    private Point  nextPoint(Point currentPos, char direction) {
        Point point = null;
        int x = currentPos.getX();
        int y = currentPos.getY();

        if (direction == 'D') {
            point = new Point(x + 1, y);
        } else if (direction == 'G') {
            point = new Point(x - 1, y);
        } else if (direction == 'H') {
            point = new Point(x, y - 1);
        } else if (direction == 'B') {
            point = new Point(x, y + 1);
        }
        return point;

    }


    public Serpent getSerpent() {
        return serpent;
    }

    public void setSerpent(Serpent serpent) {
        this.serpent = serpent;
    }

    public Tableau getTableau() {
        return tableau;
    }

    public void setTableau(Tableau tableau) {
        this.tableau = tableau;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
