import java.awt.*;
 

public class Enemy {
    private Enemy enemy;
    private int x;
    private int yTop;
    private int y1;

    public void paint(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x,yTop,5,150);
        graphics.fillRect(x,y1,5,150);
    }

    public void  side(){
        this.x = x -5;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return yTop;
    }

    public int getyBotom() {
        return y1;
    }

    public Enemy(int x ,int y ,int y1){
        this.x = x;
        this.yTop =y;
        this.y1 =y1;
    }
}











































/*    JLabel someText = new JLabel();//creates an object that can draws some text
      *  someText.setText("This is some text");//sets the text itself
       * someText.setBounds(200,200,400,100);//sets the position on the text
       * this.add(someText);//add the text component to the window
*

 *       JButton button = new JButton();//crates an object that can draw a button
  *      button.setText("I am a button");//sets the text on th button
   *     button.setBounds(50,50,300,30);//sets the button`s position
    *    button.addActionListener((event)->{
     *       someText.setVisible(!someText.isVisible());
        });                                                 //פונקיה אנונימית ,חץ ,למדא
   *///     this.add(button);//adds the button component to the window
