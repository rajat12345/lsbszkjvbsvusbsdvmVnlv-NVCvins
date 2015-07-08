import java.util.TimerTask;

/**
 * Created by rajat mittal on 7/8/2015.
 */
public class BallMover extends TimerTask {

    private Animation ball;
    private int direction=1;

    public BallMover(Animation ball){
        this.ball=ball;
    }


    @Override
    public void run() {

        if(ball.ballX==20){
            direction=1;
        }
        else if(ball.ballY==300){
            direction=-1;

        }
       this.ball.ballX +=5*direction;
        this.ball.ballY +=5*direction;
        this.ball.repaint();


    }
}
