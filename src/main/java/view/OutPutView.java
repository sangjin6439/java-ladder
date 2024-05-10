package view;

import java.util.List;

import model.Direction;
import model.Ladder;
import model.Line;
import model.Users;

public class OutPutView {

    private static final int MAX_NAME = 5;
    private static final String BLANK = " ";
    private static final String POINT = "-----";
    private static final String LINE = "|";

    public void gameResult(Users users, Ladder ladder) {
        System.out.println("실행결과");
        printUserNames(users);
        printLadder(ladder);
    }

    private void printUserNames(Users users) {
        StringBuilder sb = new StringBuilder();
        for (String name : users.getUserName()) {
            remakeNameFormat(sb, name);
        }
        System.out.println(sb);
    }

    private void remakeNameFormat(StringBuilder sb, String name) {
        int blankNum = MAX_NAME - name.length();
        if (name.length() < MAX_NAME) {
            sb.append(BLANK.repeat(blankNum));
        }
        sb.append(name).append(BLANK);
    }

    private void printLadder(Ladder ladder) {
        List<Line> lineList = ladder.getLines();
        StringBuilder sb = new StringBuilder();
        for (Line line : lineList) {
            printLadderPoint(sb, line.getPoints());
        }
        System.out.println(sb);
    }

    private void printLadderPoint(StringBuilder sb, List<Direction> directions) {
        sb.append(BLANK.repeat(MAX_NAME));
        for (int i = 0; i < directions.size() - 1; i++) {
            sb.append(LINE)
                    .append(printDirections(directions.get(i)));
        }
        sb.append(LINE).append(System.lineSeparator());
    }

    private String printDirections(Direction direction) {
        if (direction == Direction.RIGHT) {
            return POINT;
        }
        return BLANK.repeat(MAX_NAME);
    }
}