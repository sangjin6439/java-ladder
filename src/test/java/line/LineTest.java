package line;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import model.Direction;
import model.Line;

public class LineTest {

    @DisplayName("사람 수에 맞게 리스트 사이즈 생성 확인")
    @Test
    void pointsListSizeTest() {
        // given
        int personCount = 5;
        Line line = new Line(personCount);

        // when & then
        assertThat(line.getPoints().size()).isEqualTo(personCount);
    }

    @DisplayName("마지막 라인 Neutral 확인")
    @Test
    void lastLineDirectionTest() {
        // given
        int personCount = 5;
        Line line = new Line(personCount);

        // when & then
        assertThat(line.getPoints().get(personCount - 1)).isEqualTo(Direction.NEUTRAL);
    }

    @DisplayName("연속된 방향이 있는지 확인")
    @Test
    void checkContinueDirections() {
        // given
        Line line = new Line(5);
        List<Direction> directions = line.getPoints();

        // when & then
        for(int i =0; i<directions.size()-1; i++){
            assertThat(directions.get(i)==directions.get(i+1)).isNotEqualTo(Direction.RIGHT);
        }
    }
}
