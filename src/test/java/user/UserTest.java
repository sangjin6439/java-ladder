package user;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import model.User;
import model.Users;

public class UserTest {

    @DisplayName("유저 이름 생성 시 빈칸 여부 확인")
    @Test
    void ValidateBlankInUserNameTest() {
        assertThatThrownBy(()->new User(" 포비"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("유저 이름은 빈칸이 들어갈 수 없습니다.");
    }

    @DisplayName("유저 이름 생성 시 글자 수가 1~5자리여야 한다")
    @Test
    void ValidateLengthInUserNameTest() {
        assertThatThrownBy(() -> new User("여섯글자이름"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("유저 이름은 1~5자리 글자여야 합니다.");
    }

    @DisplayName("유저 리스트 크기는 2이상이여야 한다")
    @Test
    void ValidateUserListSizeTest() {
        List<User> users = List.of(new User("포비"));
        assertThatThrownBy(() -> new Users(users))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("유저는 2명 이상이어야 합니다.");
    }
}
