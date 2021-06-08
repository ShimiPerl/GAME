import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameMovement implements KeyListener {
    private Player player;
    private Enemy enemy;


    public GameMovement(Player player,Enemy enemy){
        this.player = player;
        this.enemy = enemy;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_UP:
                this.player.jumpUp();
                System.out.println("move UP");
                break;
            case KeyEvent.VK_DOWN:
                this.player.jumpDown();
                System.out.println("move DOWN");
                break;
            case  KeyEvent.VK_SPACE:
                this.player.jumpUp();
                System.out.println("jump with space");
        }
    }

    public void keyReleased(KeyEvent e) {

    }
}
