package model;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final List<Line> lines;

    public Ladder(int userCount, int height) {
        this.lines = new ArrayList<>();

        for (int i = 0; i < height; i++) {
            lines.add(new Line(userCount));
        }
    }

    public List<Line> getLines(){
        return this.lines;
    }
}
