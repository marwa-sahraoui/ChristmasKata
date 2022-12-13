package org.example;

import java.util.function.Function;

public class Christmas {
    private int high;
    private int length;
    private int[][] board;

    public Christmas(int high, int length) {
        this.high = high;
        this.length = length;
        this.board = new int[high][length];
    }

    public void doOperation(Function<Integer, Integer> function, Area area) {
        for (int i = area.getI1(); i <= area.getI2(); i++) {
            for (int j = area.getJ1(); j <= area.getJ2(); j++) {
                board[i][j] = function.apply(board[i][j]);
            }
        }
    }
    public void turnOn(Area area) {
        Function<Integer, Integer> turnOn = (oldValue) -> oldValue + 1;
        doOperation(turnOn, area);
    }

    public void turnOff(Area area) {
        Function<Integer, Integer> turnOff = (oldValue) -> oldValue - 1;
        doOperation(turnOff, area);
    }

    public void toggle(Area area) {
        Function<Integer, Integer> toggle = (oldValue) -> oldValue + 2;
        doOperation(toggle, area);
    }



    public int[][] getBoard() {
        return board;
    }

    public int nbOfLightOn() {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                count += board[i][j];
            }
        }
        return count;
    }
}
