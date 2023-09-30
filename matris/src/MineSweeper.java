import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int row;
    private int col;
    private int[][] board;
    private boolean[][] revealed;
    private int numMines;
    private boolean gameOver;

    // Diğer kodlar burada

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int row = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int col = scanner.nextInt();
        int numMines = (row * col) / 4;

        MineSweeper game = new MineSweeper(row, col, numMines);
        game.printBoard();
        game.play();
        scanner.close();
    }
}
