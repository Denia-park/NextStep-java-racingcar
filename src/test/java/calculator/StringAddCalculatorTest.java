package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class StringAddCalculatorTest {
    @Test
    @DisplayName("splitAndSum 메서드의 입력으로 빈 문자열이 들어온 경우, 0을 반환한다")
    void splitAndSum_emptyString() {
        //given
        //when
        int result = StringAddCalculator.splitAndSum("");

        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("splitAndSum 메서드의 입력으로 null이 들어온 경우, 0을 반환한다")
    void splitAndSum_null() {
        //given
        //when
        int result = StringAddCalculator.splitAndSum(null);

        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("splitAndSum 메서드의 입력으로 숫자 두개이상이 컴마(,) 구분자로 구분되어 입력된 경우, 숫자들의 합을 반환한다")
    void splitAndSum_NumbersSeparatedByComma() {
        //given
        //when
        int result1 = StringAddCalculator.splitAndSum("1,2");
        int result2 = StringAddCalculator.splitAndSum("1,2,3");
        int result3 = StringAddCalculator.splitAndSum("1,2,3,4");

        //then
        assertThat(result1).isEqualTo(3);
        assertThat(result2).isEqualTo(6);
        assertThat(result3).isEqualTo(10);
    }
}