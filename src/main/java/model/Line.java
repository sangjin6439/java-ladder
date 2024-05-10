package model;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Line {

    private final Random random = new Random();

    private final List<Direction> points;

    public Line(int personCount) {

        points = new ArrayList<>();
        createLine(personCount,points);
    }

    private void createLine(int personCount, List<Direction> points){
        Direction previousDirection = Direction.NEUTRAL;

        for (int i = 0; i < personCount - 1; i++) {
            Direction newDirection = createDirection(previousDirection);
            points.add(newDirection);
            previousDirection = updatePreviousDirection(previousDirection, newDirection);
        }
        // 마지막 포인트는 항상 NEUTRAL
        points.add(Direction.NEUTRAL);
    }

    private Direction createDirection(Direction previousDirection) {
        if (previousDirection == Direction.LEFT) {
            return Direction.NEUTRAL;
        }
        if (random.nextBoolean()) {
            return Direction.RIGHT;
        }
        return Direction.NEUTRAL;
    }

    private Direction updatePreviousDirection(Direction previousDirection, Direction newDirection) {
        // 오른쪽으로 가는 경우 다음 포인트는 왼쪽으로 갈 수 없습니다.
        if (newDirection == Direction.RIGHT) {
            return previousDirection = Direction.LEFT;
        }
        return previousDirection = Direction.NEUTRAL;
    }

    public List<Direction> getPoints() {
        return this.points;
    }
}