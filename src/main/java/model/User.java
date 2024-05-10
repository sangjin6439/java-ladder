package model;

public class User {
    private static final int MAX_NAME_LENGTH = 5;
    private static final String BLANK = " ";

    private final String userName;

    public User(String userName) {
        validateUserName(userName);
        this.userName = userName;
    }

    private void validateUserName(String name) {
        validateNameLength(name);
        validateBlankInName(name);
    }

    private void validateNameLength(String name){
        if(name.isEmpty() || name.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException("유저 이름은 1~5자리 글자여야 합니다.");
        }
    }

    private void validateBlankInName(String name){
        if(name.contains(BLANK)){
            throw new IllegalArgumentException("유저 이름은 빈칸이 들어갈 수 없습니다.");
        }
    }

    public String getUserName(){
        return this.userName;
    }
}