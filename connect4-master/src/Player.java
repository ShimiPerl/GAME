import java.awt.*;

public class Player{
    private Head head;
    private Body body;


    public Player(){
        this.head = new Head(Definitions.HEAD_X ,Definitions.HEAD_Y,Definitions.HEAD_SIZE,Definitions.HEAD_SIZE);
        this.body = new Body(Definitions.HEAD_X,(Definitions.HEAD_Y+Definitions.HEAD_SIZE),20,30);
    }//constarctor

    public void jumpUp(){
        this.head.jumpUp();
        this.body.jumpUp();
    }//jumpup

    public void jumpDown(){
        this.head.jumpDown();
        this.body.jumpUpDown();
    }//jumpdown

    public void paint(Graphics graphics){
        this.body.paint(graphics);
        this.head.paint(graphics);
    }//paint body and head

    public void rollingDown(){
        this.head.down();
        this.body.down();
    }


}
