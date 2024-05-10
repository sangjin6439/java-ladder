package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String separation = ",";

    private Scanner sc = new Scanner(System.in);

    public List<String> createUser(){
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String name = sc.nextLine();
        validateCreateUser(name);

        return Arrays.stream(name.split(separation)).toList();
    }

    public int createLadderHeight(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int ladderHeight = sc.nextInt();
        validateCreateHeight(ladderHeight);

        return ladderHeight;
    }

    private void validateCreateUser(String name){
        if(name.isEmpty()||name.endsWith(separation)){
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    private void validateCreateHeight(int ladderHeight){
        if(ladderHeight<2){
            throw new IllegalArgumentException("2이상의 숫자만 입력하세요");
        }
    }
}