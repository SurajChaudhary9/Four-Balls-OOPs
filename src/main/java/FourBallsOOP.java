import processing.core.PApplet;


class FourBalls {
    public static final int DIAMETER_OF_CIRCLE = 15;
    float left,top;
    int speed_of_ball;

    public FourBalls(float start_from_left,float start_from_top,int speed) {
        this.left = start_from_left;
        this.top = start_from_top;
        this.speed_of_ball = speed;
    }
}
public class FourBallsOOP extends PApplet {

    public static final int WIDTH = 750;
    public static final int HEIGHT = 500;
    FourBalls ball1, ball2, ball3, ball4;
    public static void main(String args[])
    {
        PApplet.main("FourBallsOOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new FourBalls(0,HEIGHT / 5,1);
        ball2 = new FourBalls(0,HEIGHT * 2 / 5,2);
        ball3 = new FourBalls(0,HEIGHT * 3 / 5,3);
        ball4 = new FourBalls(0,HEIGHT * 4 / 5,4);
    }

    @Override
    public void draw() {
        drawCircle1(ball1);
        drawCircle1(ball2);
        drawCircle1(ball3);
        drawCircle1(ball4);
    }

    private void drawCircle1(FourBalls obj) {
        ellipse(obj.left, obj.top, FourBalls.DIAMETER_OF_CIRCLE, FourBalls.DIAMETER_OF_CIRCLE);
        obj.left += obj.speed_of_ball;
    }

}