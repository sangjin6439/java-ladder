package ladder;

import model.Ladder;
import model.Line;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderTest {
    @DisplayName("주어진 높이에 맞게 사다리 생성")
    @Test
    void newLadderTest() {
        int userCount = 5;
        int height = 6;

        Ladder ladder = new Ladder(userCount, height);
        List<Line> lines = ladder.getLines();
        assertEquals(height, lines.size());
    }

    @DisplayName("사다리의 높이가 2개 미만일 경우 예외 발생")
    @Test
    void ValidateLadderHeightTest() {
        int userCount = 5;
        int height = 1;

        assertThatThrownBy(() -> new Ladder(userCount, height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사다리 높이는 최소 2이상이어야 합니다.");
    }
}

