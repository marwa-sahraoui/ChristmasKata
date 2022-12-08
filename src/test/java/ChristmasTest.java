import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ChristmasTest {

    @Test
    void should_turn_on_all_light() {
        //Arrange
        int i1 = 0;
        int j1 = 0;
        int i2 = 9;
        int j2 = 9;
        Christmas christmas = new Christmas();
        //Act
        christmas.turnOn(i1, j1, i2, j2);
        boolean[][] actualBoard = christmas.getBoard();
        //Assert
        boolean[][] expectedBoard = {{true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true}};
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }

    @Test
    void should_turn_on_the_middle_of_bord() {
        //Arrange
        int i1 = 4;
        int j1 = 4;
        int i2 = 5;
        int j2 = 5;
        Christmas christmas = new Christmas();
        //Act
        christmas.turnOn(i1, j1, i2, j2);
        boolean[][] actualBoard = christmas.getBoard();
        //Assert
        boolean[][] expectedBoard = {{false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, true, true, false, false, false, false},
                {false, false, false, false, true, true, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}};
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }

    @Test
    void should_turn_off_the_middle_of_bord() {
        //Arrange
        Christmas christmas = new Christmas();
        //Act
        christmas.turnOn(0,0,9,9);
        christmas.turnOff(4, 4, 5, 5);
        boolean[][] actualBoard = christmas.getBoard();
        //Assert
        boolean[][] expectedBoard = {{true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, false, false, true, true, true, true},
                {true, true, true, true, false, false, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true}};
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }
    @Test
    void should_toggle_all_the_board() {
        //Arrange
        Christmas christmas = new Christmas();

        //Act
       christmas.toggle(0,0,9,9);
        boolean[][] actualBoard = christmas.getBoard();
        //Assert
        boolean[][] expectedBoard = {{true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true},
                {true, true, true, true, true, true, true, true, true, true}};
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }
    @Test
    void should_toggle_first_line_of_the_board() {
        //Arrange
        Christmas christmas = new Christmas();

        //Act
        christmas.turnOn(1,0,9,9);
        christmas.toggle(0,0,9,9);

        boolean[][] actualBoard = christmas.getBoard();
        //Assert
        boolean[][] expectedBoard = {{true, true, true, true, true, true, true, true, true, true},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}};
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }
}

