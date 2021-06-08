import java.awt.*;
import java.util.Random;

public class Enemy {
    private Enemy enemy;
    private int x;
    private int y;
    private  int width;
    private  int height;

    public Enemy(int y, int width , int height,int x){
        this.enemy = enemy;
        this.y = y;
        this.width = width;
        this.height = height;
        this.x = x;
    }

    public void paint(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x,0,5,100);
    }

    public void  side(){
        this.x = x -5;
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
