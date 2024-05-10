package model;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private static final int MIN_LADDER_HEIGHT = 2;
    private final List<Line> lines;

    public Ladder(int userCount, int height) {
        validateHeight(height);

        this.lines = new ArrayList<>();

        for (int i = 0; i < height; i++) {
            lines.add(new Line(userCount));
        }
    }

    private void validateHeight(int height) {
        if (height < MIN_LADDER_HEIGHT) {
            throw new IllegalArgumentException("사다리 높이는 최소 2이상이어야 합니다.");
        }
    }

    public List<Line> getLines(){
        return this.lines;
    }
}
