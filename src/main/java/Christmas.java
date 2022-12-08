public class Christmas {

    private boolean[][] board = new boolean[10][10];

    public void turnOn(int i1, int j1, int i2, int j2) {
        for (int i = i1; i <= i2; i++) {
            for (int j = j1; j <= j2; j++) {
                board[i][j] = true;
            }
        }
    }

    public void turnOff(int i1, int j1, int i2, int j2) {
        for (int i = i1; i <= i2; i++) {
            for (int j = j1; j <= j2; j++) {
                board[i][j] = false;
            }
        }
    }

    public void toggle(int i1, int j1, int i2, int j2) {
        for (int i = i1; i <= i2; i++) {
            for (int j = j1; j <= j2; j++) {
                board[i][j] = !board[i][j];
            }
        }
    }

    public boolean[][] getBoard() {
        return board;
    }
}
