import java.awt.*;


public class Body {
    protected int x;
    private int y;
    private  int width;
    private  int height;

    public Body(int x, int y, int width , int height){
        this.x =x;
        this.y = y;
        this.width = width;
        this.height = height;
    }//constactor

    public void paint(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.fillRect(this.x,this.y,this.width,this.height);
    }//paint body

    public void jumpUp(){
        this.y = y -20;
    }//jump up dicrees y

    public void jumpUpDown() {
        this.y++;
    }//jump down increes y

    public void  down(){
        this.y = y + 2;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
