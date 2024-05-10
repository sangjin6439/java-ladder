package model;

import java.util.List;

public class Users {
    private static final int MIN_USERS = 2;

    private final List<User> users;

    public Users(final List<User> users) {
        validateUsersSizeValidate(users);
        this.users = users;
    }

    private void validateUsersSizeValidate(List<User> users) {
        validateUsers(users);
    }

    private void validateUsers(List<User> users) {
        if (users.size() < MIN_USERS) {
            throw new IllegalArgumentException("유저는 2명 이상이어야 합니다.");
        }
    }

    public int getUserCount() {
        return users.size();
    }

    public List<String> getUserName() {
        return users.stream().map(i -> i.getUserName()).toList();
    }
}