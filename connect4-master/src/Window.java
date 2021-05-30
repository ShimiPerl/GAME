//1.swing (and we have java fx but is`t to easy) זה ממשק גרפי
//JFrame - window
//JLabel - text
//JButton - button
// extends ==ירושה//
//2. java fx
//scraping == חציבת מידע מאתרים

//keyboard control
//painting
//icons
//recaptcha v3
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private Player player;
    private Enemy enemy;

    public static void main(String[] args) {
        Window p1 = new Window();
    }

    public Window() {
        this.init();
    }

    private void init() {
        this.setVisible(true);//shows he windows
        this.setSize(Definitions.WINDOW_WIDTH, Definitions.WINDOW_HEIGHT);//determines the size of the window
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//closes the sll the program if the x button
        this.setLocationRelativeTo(null);//  places the window in the center of the screen
        this.setLayout(null);//allows the programmer to determine the position of each component
        this.setResizable(false);//you can`ot change the window
        this.setTitle("Game");
        this.player = new Player();
        this.mainWindowLoop();
        GameMovement movment = new GameMovement(player);//create a object of game movement
        this.addKeyListener(movment);//add the object to the keys control
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.player.paint(graphics);
    }//paint player


    private void mainWindowLoop() {
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(50);
                    repaint();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}


