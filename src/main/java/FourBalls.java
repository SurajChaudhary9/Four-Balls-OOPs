import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

class Ball {
    public static final int diameter = 10;
    private int XCoordinate;
    private final int YCoordinate;
    private final int speed;

    public Ball(int XCoordinate, int YCoordinate, int speed) {
        this.XCoordinate = XCoordinate;
        this.YCoordinate = YCoordinate;
        this.speed = speed;
    }

    public void IncrementSpeedOfBall() {
        XCoordinate += speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(XCoordinate,YCoordinate, diameter,diameter);
    }
}


public class FourBalls extends PApplet {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int speed1 = 1;
    public static final int speed2 = 2;
    public static final int speed3 = 3;
    public static final int speed4 = 4;
    private List<Ball> balls;
    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;


    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(0,HEIGHT * 1 / 5, speed1);
        ball2 = new Ball(0,HEIGHT * 2 / 5, speed2);
        ball3 = new Ball(0,HEIGHT * 3 / 5, speed3);
        ball4 = new Ball(0,HEIGHT * 4 / 5, speed4);
        balls = Arrays.asList(ball1,ball2,ball3,ball4);
    }

    @Override
    public void draw() {
        for (Ball obj: balls) {
            obj.draw(this);
            obj.IncrementSpeedOfBall();
        }
    }
}
