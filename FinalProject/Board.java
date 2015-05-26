import java.util.Scanner;
public class Board extends Window
{
    private char[][] board;
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Board board = new Board(6, 7);
    }

    public Board(int rows, int columns)
    {
        this.board = new char[rows][columns];
    }
    
    public Board addDisk(int column, int player)
    {
        
        return this;
    }
    
    private void printBoard()
    {
    }
}
