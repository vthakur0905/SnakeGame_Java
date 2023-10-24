import javax.swing.*;

public class App {

    public static void main(String[] args) {

        int boardWidth = 600;
        int borardHeight = boardWidth;



        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth,borardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        SnakeGame snakeGame = new SnakeGame(boardWidth,borardHeight);
        frame.add(snakeGame);
        frame.pack(); // for the whitw bar so that equal dimentions h and wsnak
        snakeGame.requestFocus();
    }
}