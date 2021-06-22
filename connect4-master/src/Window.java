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
        this.enemy = new Enemy(600,0,300);
        GameMovement movement = new GameMovement(player,enemy);//create a object of game movement
        this.mainWindowLoop();
        this.addKeyListener(movement);//add the object to the keys control

    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.player.paint(graphics);
        this.enemy.paint(graphics);
    }//paint player


    private void mainWindowLoop() {
        new Thread(() -> {
            while (true) {
                try {
                    this.player.rollingDown();
                    this.enemy.side();
                    if (this.enemy.getX() == 0){
                        this.enemy = new Enemy(600,0,300);
                        this.enemy.side();
                    }
                    int yplayer = this.player.getHeady();
                    int yenemy = this.enemy.getY();
                    int xplater =this.player.getHeadx();
                    int xenemy =   this.enemy.getX();
                    if (xplater == xenemy){
                        if (yenemy == yplayer){
                        System.out.println("game over");
                        this.setVisible(false);
                    }}
                    Thread.sleep(50);
                    repaint();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }).start();
    }
}


