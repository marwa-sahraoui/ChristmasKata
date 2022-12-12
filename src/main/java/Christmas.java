public class Christmas {
    private int high;
    private int length;
    private int[][] board;

    public Christmas(int high, int length) {
        this.high = high;
        this.length = length;
        this.board = new int[high][length];
    }


    public void turnOn(int i1, int j1, int i2, int j2) {
        for (int i = i1; i <= i2; i++) {
            for (int j = j1; j <= j2; j++) {
                board[i][j] += 1;
            }
        }
    }

    public void turnOff(int i1, int j1, int i2, int j2) {
        for (int i = i1; i <= i2; i++) {
            for (int j = j1; j <= j2; j++) {
                board[i][j] -= 1;
            }
        }
    }

    public void toggle(int i1, int j1, int i2, int j2) {
        for (int i = i1; i <= i2; i++) {
            for (int j = j1; j <= j2; j++) {
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
