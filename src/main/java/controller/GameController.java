package controller;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;
import java.util.List;
import model.Ladder;
import model.User;
import model.Users;
import view.InputView;
import view.OutPutView;

public class GameController {

    private final InputView inputView;
    private final OutPutView outPutView;

    public GameController(InputView inputView, OutPutView outPutView) {
        this.inputView = inputView;
        this.outPutView = outPutView;
    }

    public void playGame() {
        Users users = createUsers();
        int ladderHeight = inputView.createLadderHeight();
        Ladder ladder = new Ladder(users.getUserCount(), ladderHeight);
        outPutView.gameResult(users, ladder);

    }

    private Users createUsers() {
        List<String> userNames = inputView.createUser();

        return userNames.stream()
                .map(i -> new User(i))
                .collect(collectingAndThen(toList(), i -> new Users(i)));
    }
}
