import java.awt.*;

public class Player{
    private Head head;
    private Body body;


    public Player(){
        head = new Head(Definitions.HEAD_X ,Definitions.HEAD_Y,Definitions.HEAD_SIZE,Definitions.HEAD_SIZE);
        body = new Body(Definitions.HEAD_X,(Definitions.HEAD_Y+Definitions.HEAD_SIZE),20,30);
    }//constarctor

    public void jumpUp(){
        head.jumpUp();
        body.jumpUp();
    }//jumpup

    public void jumpDown(){
        head.jumpDown();
        body.jumpUpDown();
    }//jumpdown

    public void paint(Graphics graphics){
        body.paint(graphics);
        head.paint(graphics);
    }//paint body and head

    public void rollingDown(){
        head.down();
        body.down();
    }

    public int getHeadx(){
        return head.getX();
    }

    public int getBodyx(){
       return body.getX();
    }

    public int getHeady(){
        return head.getY();
    }

    public int getBodyy(){
        return body.getY();
    }
}
