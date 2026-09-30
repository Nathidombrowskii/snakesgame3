import java.awt. *;
import java.until.LinkedList;

public class Snake {

    public enum Direction { UP, DOWN, LEfT, RIGHT }

    private final LinkedList<Point> body = new LinkedList<>();
    private Direction direction = Direction.RIGHT;

    public void reset(int startX, int startY) {
        body.clear();

        body.add(new Point(startX, startY)); //Cabeça
        body.add(new Point(startX - 1, startY)); //Corpo
        body.add(new Point(startX - 2, startY)); //Cauda
        direction = Direction.RIGHT;
    }

    public LinkedList<Point> getBody() {
        return body;
    }

    public Direction getDirection() {
        return direction;
    }
  
}
