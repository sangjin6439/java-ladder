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

        points = createLine(personCount);

    }


    private List<Direction> createLine(int personCount) {
        List<Direction> points = new ArrayList<>();
        Direction previusDirection = getpreviusDirection();
        points.add(previusDirection);

        for (int i = 1; i < personCount - 1; i++) {
            Direction previousDirection = points.get(i - 1);
            Direction newDirection = getNextDirection(previousDirection);
            points.add(newDirection);
        }

        points.add(Direction.NEUTRAL);  // 마지막 방향은 항상 중립으로 설정
        return points;
    }

    // 초기 방향을 결정하는 메서드
    private Direction getpreviusDirection() {
        if (random.nextBoolean()) {
            return Direction.RIGHT;
        }
        return Direction.NEUTRAL;
    }

    // 다음 방향을 결정하는 메서드
    private Direction getNextDirection(Direction previousDirection) {
        if (previousDirection == Direction.RIGHT) {
            return Direction.NEUTRAL;
        }
        if (random.nextBoolean()) {
            return Direction.RIGHT;
        }
        return Direction.NEUTRAL;
    }

    public List<Direction> getPoints() {
        return this.points;
    }
}