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
        Christmas christmas = new Christmas(10, 10);
        //Act
        christmas.turnOn(i1, j1, i2, j2);
        int[][] actualBoard = christmas.getBoard();
        //Assert
        int[][] expectedBoard = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }

    @Test
    void should_turn_on_the_middle_of_bord() {
        //Arrange
        int i1 = 4;
        int j1 = 4;
        int i2 = 5;
        int j2 = 5;
        Christmas christmas = new Christmas(10, 10);
        //Act
        christmas.turnOn(i1, j1, i2, j2);
        int[][] actualBoard = christmas.getBoard();
        //Assert
        int[][] expectedBoard = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }

    @Test
    void should_turn_off_the_middle_of_bord() {
        //Arrange
        Christmas christmas = new Christmas(10, 10);
        //Act
        christmas.turnOn(0, 0, 9, 9);
        christmas.turnOff(4, 4, 5, 5);
        int[][] actualBoard = christmas.getBoard();
        //Assert
        int[][] expectedBoard = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }

    @Test
    void should_toggle_all_the_board() {
        //Arrange
        Christmas christmas = new Christmas(10, 10);

        //Act
        christmas.toggle(0, 0, 9, 9);
        int[][] actualBoard = christmas.getBoard();

        //Assert
        int[][] expectedBoard = {{2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}};
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }

    @Test
    void should_toggle_first_line_of_the_board() {
        //Arrange
        Christmas christmas = new Christmas(10, 10);

        //Act
        christmas.toggle(0, 0, 9, 9);

        int[][] actualBoard = christmas.getBoard();
        //Assert
        int[][] expectedBoard = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
        };
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }
    @Test
    void should_toggle_first_line_of_ffffe_board() {
        //Arrange
        Christmas christmas = new Christmas(10, 10);

        //Act
        christmas.turnOn(0, 0, 9, 9);
        christmas.toggle(0, 0, 9, 9);

        int[][] actualBoard = christmas.getBoard();
        //Assert
        int[][] expectedBoard = {
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}
        };
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }
    @Test
    void should_toggle_first_line_of_rrrr_board() {
        //Arrange
        Christmas christmas = new Christmas(10, 10);

        //Act
        christmas.turnOn(0, 0, 0, 9);
        christmas.toggle(0, 0, 9, 9);

        int[][] actualBoard = christmas.getBoard();
        //Assert
        int[][] expectedBoard = {
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
        };
        assertThat(actualBoard).isDeepEqualTo(expectedBoard);
    }

    @Test
    void todotodo() {
        Christmas christmas = new Christmas(1000, 1000);

        christmas.turnOn(887, 9, 959, 629);
        christmas.turnOn(454, 398, 844, 448);
        christmas.turnOff(539, 243, 559, 965);
        christmas.turnOff(370, 819, 676, 868);
        christmas.turnOff(145, 40, 370, 997);
        christmas.turnOff(301, 3, 808, 453);
        christmas.turnOn(351, 678, 951, 908);
        christmas.toggle(720, 196, 897, 994);
        christmas.toggle(831, 394, 904, 860);

        int nbOfLightOn = christmas.nbOfLightOn();

        System.out.println(nbOfLightOn);
    }
}

