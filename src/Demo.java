import javax.swing.*;
import java.util.Timer;

/**
 * Created by rajat mittal on 7/8/2015.
 */
public class Demo {
    public static void main(String[] args) {
        new Demo();

    }
    public Demo(){
        JFrame window =new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        JPanel mainPanel = new JPanel();
        window.setContentPane(mainPanel);

        Animation a = new Animation();
        mainPanel.add(a);

        window.setVisible(true);
        java.util.Timer timer;
        timer = new Timer();
        timer.scheduleAtFixedRate(new BallMover(a),10,10);
        for(int i=0;i<25;i++)
        {
            a.ballX+=10;
            a.ballY+=10;
            a.repaint();

        }

    }
}
