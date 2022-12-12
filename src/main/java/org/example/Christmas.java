package org.example;

public class Christmas {
    private int high;
    private int length;
    private int[][] board;

    public Christmas(int high, int length) {
        this.high = high;
        this.length = length;
        this.board = new int[high][length];
    }


    public void turnOn(Area area) {
        for (int i = area.getI1(); i <= area.getI2(); i++) {
            for (int j = area.getJ1(); j <= area.getJ2(); j++) {
                board[i][j] += 1;
            }
        }
    }

    public void turnOff(Area area) {
        for (int i = area.getI1(); i <= area.getI2(); i++) {
            for (int j = area.getJ1(); j <= area.getJ2(); j++) {
                board[i][j] -= 1;
            }
        }
    }

    public void toggle(Area area) {
        for (int i = area.getI1(); i <= area.getI2(); i++) {
            for (int j = area.getJ1(); j <= area.getJ2(); j++) {
                board[i][j] += 2;
            }
        }
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
