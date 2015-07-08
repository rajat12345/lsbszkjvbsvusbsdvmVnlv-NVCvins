import java.awt.*;
/**
 * Created by rajat mittal on 7/8/2015.
 */
public class Animation extends Canvas {

public int ballX=0;
    public int ballY =0;
    public Animation(){
        super();
        this.setSize(400, 400);
    }
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(20,20,300,300);
        g.setColor(Color.red);
        g.fillOval(ballX,ballY,20,20);
    }
}
