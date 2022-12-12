import org.example.Area;
import org.example.Christmas;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ChristmasTest {

    @Test
    void should_turn_on_all_light() {
        //Arrange
        Area area = new Area(0,0,9,9);

        Christmas christmas = new Christmas(10, 10);
        //Act
        christmas.turnOn(area);
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
        Area area = new Area(4,4,5,5);
        Christmas christmas = new Christmas(10, 10);
        //Act
        christmas.turnOn(area);
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
        Area area = new Area(0, 0, 9, 9);
        //Act
        christmas.turnOn(area);
        Area area1 = new Area(4, 4, 5, 5);
        christmas.turnOff(area1);
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
        Area area = new Area(0, 0, 9, 9);
        //Act
        christmas.toggle(area);
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
        Area area = new Area(0, 0, 9, 9);
        //Act
        christmas.toggle(area);

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
        Area area = new Area(0, 0, 9, 9);
        //Act
        christmas.turnOn(area);
        christmas.toggle(area);

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
        Area area = new Area(0, 0, 0, 9);
        //Act
        christmas.turnOn(area);
        Area area1 = new Area(0, 0, 9, 9);
        christmas.toggle(area1);

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

        christmas.turnOn( new Area(887, 9, 959, 629));
        christmas.turnOn(new Area(454, 398, 844, 448));
        christmas.turnOff(new Area(539, 243, 559, 965));
        christmas.turnOff(new Area(370, 819, 676, 868));
        christmas.turnOff(new Area(145, 40, 370, 997));
        christmas.turnOff(new Area(301, 3, 808, 453));
        christmas.turnOn(new Area(351, 678, 951, 908));
        christmas.toggle(new Area(720, 196, 897, 994));
        christmas.toggle(new Area(831, 394, 904, 860));

        int nbOfLightOn = christmas.nbOfLightOn();

        System.out.println(nbOfLightOn);
    }
}

